package csen1002.main.task9;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Task9Runner {

    /**
     * Parses a provided string using Task 9's grammar
     * and gets the value of the attribute "check" of the variable "s'
     *
     * @param input a string to parse
     * @return the value of the attribute "check" of the variable "s'
     */
    public static int sCheckValue(String input) {
        Task9Lexer lexer = new Task9Lexer(CharStreams.fromString(input));
        Task9Parser parser = new Task9Parser(new CommonTokenStream(lexer));
        return parser.s().check;
    }

    public static void main(String[] args) {
        // True
        System.out.println(sCheckValue("a"));
        System.out.println(sCheckValue("b"));
        System.out.println(sCheckValue("e"));
        System.out.println(sCheckValue("@"));
        System.out.println(sCheckValue("(aoe)"));
        System.out.println(sCheckValue("(eU@)"));
        System.out.println(sCheckValue("(aUb)"));
        System.out.println(sCheckValue("(((aoa)*)U((b*)o(b*)))"));
        System.out.println("Stop");
        // False
        System.out.println(sCheckValue("(aUa)"));
        System.out.println(sCheckValue("(bUb)"));
        System.out.println(sCheckValue("(aUe)"));
        System.out.println(sCheckValue("(@Ub)"));
        System.out.println(sCheckValue("(((aoe)*)U((b*)o(b*)))"));
        System.out.println(sCheckValue("(((aoa)*)U((a*)U(b*)))"));
        System.out.println(sCheckValue("(((aoa)*)U((b*)U(b*)))"));
        //System.out.println(sCheckValue("aacbb"));
    }
}
