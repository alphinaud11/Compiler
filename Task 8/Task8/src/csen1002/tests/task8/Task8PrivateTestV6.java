package csen1002.tests.task8;

import csen1002.main.task8.task8Lexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task8PrivateTestV6 {

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
        assertEquals("10001111010,Q3;", tokenStream("10001111010"));
    }
    @Test()
    public void testFDFA1T1() {
        assertEquals("11101010100011,Q4;", tokenStream("11101010100011"));
    }
    @Test()
    public void testFDFA1T2() {
        assertEquals("001010110111111,Q4;", tokenStream("001010110111111"));
    }
    @Test()
    public void testFDFA1T3() {
        assertEquals("0010,Q3;0010111,Q4;", tokenStream("00100010111"));
    }
    @Test()
    public void testFDFA1T4() {
        assertEquals("11101011101000,Q3;00,Q2;", tokenStream("1110101110100000"));
    }
    @Test()
    public void testFDFA1T5() {
        assertEquals("0001101110,Q3;001,Q4;", tokenStream("0001101110001"));
    }
    @Test()
    public void testFDFA1T6() {
        assertEquals("1011011000,Q3;0010,Q3;", tokenStream("10110110000010"));
    }
    @Test()
    public void testFDFA1T7() {
        assertEquals("0010,Q3;00101,Q4;", tokenStream("001000101"));
    }
    @Test()
    public void testFDFA1T8() {
        assertEquals("000,Q3;0011110,Q3;", tokenStream("0000011110"));
    }
    @Test()
    public void testFDFA1T9() {
        assertEquals("100011,Q4;", tokenStream("100011"));
    }



}