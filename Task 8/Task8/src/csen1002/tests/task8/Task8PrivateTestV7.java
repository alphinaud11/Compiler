package csen1002.tests.task8;

import csen1002.main.task8.task8Lexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task8PrivateTestV7 {

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
        assertEquals("1100010111001000,Q3;001,Q4;", tokenStream("1100010111001000001"));
    }
    @Test()
    public void testFDFA1T1() {
        assertEquals("101000,Q3;", tokenStream("101000"));
    }
    @Test()
    public void testFDFA1T2() {
        assertEquals("10111101000,Q3;001,Q4;", tokenStream("10111101000001"));
    }
    @Test()
    public void testFDFA1T3() {
        assertEquals("111000,Q3;00,Q2;", tokenStream("11100000"));
    }
    @Test()
    public void testFDFA1T4() {
        assertEquals("000,Q3;0010,Q3;", tokenStream("0000010"));
    }
    @Test()
    public void testFDFA1T5() {
        assertEquals("11001010,Q3;0011011101,Q4;", tokenStream("110010100011011101"));
    }
    @Test()
    public void testFDFA1T6() {
        assertEquals("01101001001010010,Q3;00,Q2;", tokenStream("0110100100101001000"));
    }
    @Test()
    public void testFDFA1T7() {
        assertEquals("000000101110,Q3;0010,Q3;", tokenStream("0000001011100010"));
    }
    @Test()
    public void testFDFA1T8() {
        assertEquals("11110101000,Q3;00,Q2;", tokenStream("1111010100000"));
    }
    @Test()
    public void testFDFA1T9() {
        assertEquals("11001110,Q3;001110,Q3;", tokenStream("11001110001110"));
    }



}