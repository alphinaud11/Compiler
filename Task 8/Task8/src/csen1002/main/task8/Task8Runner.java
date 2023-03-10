////Make Sure that the package is "csen1002.main.task8"
package csen1002.main.task8;
//Make sure that ANTLR is imported properly
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;

import java.util.List;
//This file is just to test your code (DON"T SUBMIT THIS FILE)
public class Task8Runner {
    /**
     * Returns a string of tokenized lexemes.
     *
     * @param input is the string to be tokenized.
     * @return string of tokens and lexemes.
     */
    public static String tokenStream(String input){
        //In case Task8Lexer is not defined correctly:
        //1- If you modified the grammar in the g4 file, regenerate the ANTLR recognizer to make sure that the latest grammar is generated
        //2- Make sure that the location and the package are configured properly
        task8Lexer lexer = new task8Lexer(CharStreams.fromString(input));
        Vocabulary vocabulary = lexer.getVocabulary();
        List<? extends Token> tokens = lexer.getAllTokens();
        StringBuilder stringBuilder = new StringBuilder();
        for (Token token:tokens) {
            stringBuilder.append(token.getText()).append(",").append(vocabulary.getSymbolicName(token.getType())).append(";");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(tokenStream("01"));
    }

}
