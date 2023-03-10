package csen1002.tests.task8;

import csen1002.main.task8.task8Lexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task8PrivateTestV3 {

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
        assertEquals("00011000010,Q3;", tokenStream("00011000010"));
    }
    @Test()
    public void testFDFA1T1() {
        assertEquals("11101000,Q3;0010,Q3;", tokenStream("111010000010"));
    }
    @Test()
    public void testFDFA1T2() {
        assertEquals("000,Q3;0011110,Q3;", tokenStream("0000011110"));
    }
    @Test()
    public void testFDFA1T3() {
        assertEquals("0011011111111101,Q4;", tokenStream("0011011111111101"));
    }
    @Test()
    public void testFDFA1T4() {
        assertEquals("000,Q3;001111,Q4;", tokenStream("000001111"));
    }
    @Test()
    public void testFDFA1T5() {
        assertEquals("0011100001110,Q3;001011,Q4;", tokenStream("0011100001110001011"));
    }
    @Test()
    public void testFDFA1T6() {
        assertEquals("0110011110,Q3;00110,Q3;", tokenStream("011001111000110"));
    }
    @Test()
    public void testFDFA1T7() {
        assertEquals("0010110,Q3;001010,Q3;", tokenStream("0010110001010"));
    }
    @Test()
    public void testFDFA1T8() {
        assertEquals("01110111010010,Q3;00,Q2;", tokenStream("0111011101001000"));
    }
    @Test()
    public void testFDFA1T9() {
        assertEquals("111110011010,Q3;0011,Q4;", tokenStream("1111100110100011"));
    }



}