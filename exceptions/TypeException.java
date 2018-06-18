package exceptions;

import org.antlr.v4.runtime.ParserRuleContext;

public class TypeException extends Exception {

    public TypeException(String m, ParserRuleContext ctx) {
        super("Errore: \"" + m + "\" Errore alla linea " + ctx.start.getLine());
    }

}
