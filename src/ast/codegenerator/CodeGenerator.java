package ast.codegenerator;

import ast.program.definition.VarDefinition;
import ast.program.type.*;

import java.io.IOException;
import java.io.PrintWriter;

public class CodeGenerator {
    private static CodeGenerator codeGenerator;
    private static PrintWriter out;

    public static CodeGenerator getInstance(String in_file, String out_file) {
        codeGenerator = new CodeGenerator(in_file, out_file);
        return codeGenerator;
    }
    public static CodeGenerator getInstance() {
        return codeGenerator;
    }

    public CodeGenerator(String inputFile, String outputFile){
        try {
            out = new PrintWriter(outputFile);
        } catch (IOException e) {
            System.err.println("No existe el fichero de salida " + outputFile);
            e.printStackTrace();
        }
        source(inputFile);
    }

    public void pushBP(){
        out.println("\tpush\tbp");
        out.flush();
    }

    public void push(char constant){
        out.println("\tpushb\t"+(int)constant);
        out.flush();
    }

    public void push(int constant){
        out.println("\tpushi\t"+constant);
        out.flush();
    }

    public void push(double constant){
        out.println("\tpushf\t"+constant);
        out.flush();
    }

    public void pusha(int offset){
        out.println("\tpusha\t"+offset);
        out.flush();
    }

    public void load(Type type){
        out.println("\tload\t"+type.suffix());
        out.flush();
    }

    public void store(Type type){
        out.println("\tstore\t"+type.suffix());
        out.flush();
    }

    public void add(Type type) {
        out.println("\tadd" + type.suffix());
        out.flush();
    }

    public void sub(Type type) {
        out.println("\tsub" + type.suffix());
        out.flush();
    }

    public void mul(Type type) {
        out.println("\tmul" + type.suffix());
        out.flush();
    }

    public void div(Type type) {
        out.println("\tdiv" + type.suffix());
        out.flush();
    }

    public void mod(Type type) {
        out.println("\tmod" + type.suffix());
        out.flush();
    }

    public void arithmetic(String operator, Type type) {
        switch (operator) {
            case "+": add(type); break;
            case "-": sub(type); break;
            case "/": div(type); break;
            case "*": mul(type); break;
            case "%": mod(type); break;
            default: throw new IllegalStateException("Operación aritmética no válida");
        }
    }

    public void out(Type type) {
        out.println("\tout" + type.suffix());
        out.flush();
    }

    public void in(Type type) {
        out.println("\tin" + type.suffix());
        out.flush();
    }

    public void gt(Type type) {
        out.println("\tgt" + type.suffix());
        out.flush();
    }
    public void lt(Type type) {
        out.println("\tlt" + type.suffix());
        out.flush();
    }
    public void ge(Type type) {
        out.println("\tge" + type.suffix());
        out.flush();
    }
    public void le(Type type) {
        out.println("\tle" + type.suffix());
        out.flush();
    }
    public void eq(Type type) {
        out.println("\teq" + type.suffix());
        out.flush();
    }
    public void ne(Type type) {
        out.println("\tne" + type.suffix());
        out.flush();
    }

    public void comparison(Type type, String operator) {
        switch (operator) {
            case "<": lt(type); break;
            case "<=>": le(type); break;
            case ">": gt(type); break;
            case ">=": ge(type); break;
            case "==": eq(type); break;
            case "!=": ne(type); break;
            default: throw new IllegalStateException("Esta comparación no es válida");
        }
    }

    public void halt() {
        out.println("halt\n");
        out.flush();
    }

    public void callFunction(String functionName) {
        out.println("call " + functionName);
        out.flush();
    }

    public void func(String functionName) {
        out.println("\n " + functionName + ":");
        out.flush();
    }

    public void enter(int size) {
        out.println("\tenter\t" + size);
        out.flush();
    }

    public void ret(FunctionType functionType, int localVariablesSize) {
        int paramsSize = 0;
        int returnSize = functionType.getReturnType().numberOfBytes();
        for (VarDefinition parameter: functionType.getParameters()) {
            paramsSize += parameter.getType().numberOfBytes();
        }
        out.println("\tret " + returnSize + ", " + localVariablesSize + ", " + paramsSize);
        out.flush();
    }

    public void jmp(int number){
        out.println("\tjmp\tlabel"+number);
        out.flush();
    }

    public void jz(int number){
        out.println("\tjz\tlabel"+number);
        out.flush();
    }

    public void jnz(int number){
        out.println("\tjnz\tlabel"+number);
        out.flush();
    }

    public void label(int number){
        out.println(" label"+number+":");
        out.flush();
    }

    public void logical(String operator) {
        switch (operator) {
            case "&&": and(); break;
            case "||": or(); break;
            case "!": not(); break;
            default: throw new IllegalStateException("Expresión lógica no válida");
        }
    }
    public void and() {
        out.println("\tand");
        out.flush();
    }
    public void or() {
        out.println("\tor");
        out.flush();
    }
    public void not() {
        out.println("\tnot");
        out.flush();
    }

    //For Debugg
    public void source(String in_file) {
        out.println("\n#source \"" + in_file + "\"\n");
        out.flush();
    }
    public void line(int lineNumber) {
        out.println("\n#line\t" + lineNumber);
        out.flush();
    }

    //Util
    public void callMain() {
        out.println();
        out.println("Invocation to main function");
        callFunction("main");
        halt();
        out.flush();
    }



    public void convert(Type from, Type to) {
        if(from != to) {
            if (from instanceof CharType && to instanceof DoubleType) {
                convert(from, IntType.getInstance());
                convert(IntType.getInstance(), to);
            } else if (from instanceof DoubleType && to instanceof CharType) {
                convert(from, IntType.getInstance());
                convert(IntType.getInstance(), to);
            } else {
                char fromSuffix = from.suffix();
                char toSuffix = to.suffix();
                out.println("\t" + fromSuffix + "2" + toSuffix);
                out.flush();
            }
        }
    }
}
