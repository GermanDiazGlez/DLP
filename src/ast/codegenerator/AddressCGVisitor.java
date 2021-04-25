package ast.codegenerator;

import ast.codegenerator.util.AbstractCGVisitor;
import ast.expression.ArrayAccess;
import ast.expression.FieldAccess;
import ast.expression.Variable;
import ast.program.definition.VarDefinition;
import ast.program.type.IntType;
import ast.program.type.RecordField;
import ast.program.type.StructType;

import java.util.List;

public class AddressCGVisitor extends AbstractCGVisitor {
    private int GLOBAL = 0;

    private CodeGenerator codeGenerator;
    private ValueCGVisitor value;

    public AddressCGVisitor(ValueCGVisitor valueCGVisitor) {
        this.codeGenerator = CodeGenerator.getInstance();
        this.value = valueCGVisitor;
    }

    public void setValueVisitor(ValueCGVisitor value) {
        this.value = value;
    }

    @Override
    public Object visit(Variable variable, Object o) {
        /**
         address [[Variable : expression -> ID]] () =
              if (variable.definition.scope == 0)
                  <pusha> variable.definition.offset
              else
                  <push bp>
                  <push> variable.definition.offset
                  <addi>
         */
        VarDefinition definition = (VarDefinition) variable.getDefinition();
        if(definition.getScope() == GLOBAL) {
            codeGenerator.pusha(definition.getOffset());
        } else {
            codeGenerator.pushBP();
            codeGenerator.push(definition.getOffset());
            codeGenerator.add(IntType.getInstance());
        }
        return null;
    }

    @Override
    public Object visit(ArrayAccess arrayAccess, Object o) {
        /**
         address [[ArrayAccess:Expression -> expression1:Expression, expression2:Expression]]() =
              address [expression1]
              value [expression2]
              <push> ArrayAccess.type.numberOfBytes
              <mul>
              <addi>
         */
        arrayAccess.getLeftExpression().accept(this, o);
        arrayAccess.getRightExpression().accept(value, o);
        int size = arrayAccess.getType().numberOfBytes();
        codeGenerator.push(size);
        codeGenerator.mul(arrayAccess.getType());
        codeGenerator.add(arrayAccess.getType());
        return null;
    }

    @Override
    public Object visit(FieldAccess fieldAccess, Object o) {
        /**
         address [[FieldAccess:Expression -> name:String, expression:Expression]]() =
              address [expression]
              for ( RecordField rf : ((StructType) o).recordFields ) {
                  if ( rf.name == name ) {
                      <push> rf.expression.definition.offset
                  }
              }
              <addi>
         */
        fieldAccess.getExpression().accept(this, o);

        List<RecordField> recordFields = ((StructType) o).getRecordFieldList();
        for(RecordField record: recordFields) {
            if(record.getName().equals(fieldAccess.getName())) {
                codeGenerator.push(record.getOffset());
                break;
            }
        }
        codeGenerator.add(fieldAccess.getType());
        return null;
    }
}
