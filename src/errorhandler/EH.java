package errorhandler;

import ast.program.type.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class EH {

    private List<ErrorType> errors = new ArrayList<>();
    private static EH eh = null;

    public EH(){

    }

    public boolean hasErrors(){
        return errors.isEmpty()==true ? false : true;
    }

    public void showErrors(PrintStream out){
        for (ErrorType e: errors) {
            out.println(e.toString());
        }
    }

    public void addError(ErrorType error){
        errors.add(error);
    }

    public static EH getEH(){
        if(eh == null){
            eh = new EH();
        }
        return eh;
    }
}
