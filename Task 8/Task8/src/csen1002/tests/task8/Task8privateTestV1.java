package csen1002.tests.task8;

import csen1002.main.task8.task8Lexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task8privateTestV1 {

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

    @Test
    public void testFDFA1T0() {assertEquals("001110010001011,Q4;", tokenStream("001110010001011"));}
    @Test
    public void testFDFA1T1() {
        assertEquals("001111010101110,Q3;", tokenStream("001111010101110"));
    }
    @Test
    public void testFDFA1T2() {assertEquals("1000010100011,Q4;", tokenStream("1000010100011"));}
    @Test
    public void testFDFA1T3() {
        assertEquals("101000,Q3;0011,Q4;", tokenStream("1010000011"));
    }
    @Test
    public void testFDFA1T4() {
        assertEquals("10011001000111,Q4;", tokenStream("10011001000111"));
    }
    @Test
    public void testFDFA1T5() {
        assertEquals("00011001001,Q4;", tokenStream("00011001001"));
    }
    @Test
    public void testFDFA1T6() {
        assertEquals("11011000,Q3;", tokenStream("11011000"));
    }
    @Test
    public void testFDFA1T7() {
        assertEquals("00100110010,Q3;00,Q2;", tokenStream("0010011001000"));
    }
    @Test
    public void testFDFA1T8() {assertEquals("011111100110,Q3;", tokenStream("011111100110"));
    }
    @Test
    public void testFDFA1T9() {	assertEquals("01100,Q2;", tokenStream("01100"));
    }

}