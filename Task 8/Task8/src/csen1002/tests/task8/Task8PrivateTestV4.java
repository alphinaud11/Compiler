package csen1002.tests.task8;

import csen1002.main.task8.task8Lexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task8PrivateTestV4 {

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

    @Test()
    public void testFDFA1T0() {
        assertEquals("100100111001010,Q3;", tokenStream("100100111001010"));
    }
    @Test()
    public void testFDFA1T1() {
        assertEquals("111000,Q3;001,Q4;", tokenStream("111000001"));
    }
    @Test()
    public void testFDFA1T2() {
        assertEquals("01011111110011111,Q4;", tokenStream("01011111110011111"));
    }
    @Test()
    public void testFDFA1T3() {
        assertEquals("10100000000101000,Q3;", tokenStream("10100000000101000"));
    }
    @Test()
    public void testFDFA1T4() {
        assertEquals("101111110110110011,Q4;", tokenStream("101111110110110011"));
    }
    @Test()
    public void testFDFA1T5() {
        assertEquals("10000100011011010,Q3;", tokenStream("10000100011011010"));
    }
    @Test()
    public void testFDFA1T6() {
        assertEquals("101000,Q3;00111,Q4;", tokenStream("10100000111"));
    }
    @Test()
    public void testFDFA1T7() {
        assertEquals("1100010,Q3;0010101,Q4;", tokenStream("11000100010101"));
    }
    @Test()
    public void testFDFA1T8() {
        assertEquals("00110110,Q3;00,Q2;", tokenStream("0011011000"));
    }
    @Test()
    public void testFDFA1T9() {
        assertEquals("001111101011010,Q3;001,Q4;", tokenStream("001111101011010001"));
    }


}