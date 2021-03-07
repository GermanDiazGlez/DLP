package ast;

public class AbstractNodeAST implements ASTNode{
    private int line;
    private int column;

    public AbstractNodeAST(int line, int column){
        this.line = line;
        this.column = column;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }
}
