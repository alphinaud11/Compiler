package csen1002.tests.task8;

import csen1002.main.task8.task8Lexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task8PublicTest {

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
    public void testFDFA1T0() {assertEquals("011100,Q2;", tokenStream("011100"));}
    @Test
    public void testFDFA1T1() {
        assertEquals("10100111010,Q3;", tokenStream("10100111010"));
    }
    @Test
    public void testFDFA1T2() {assertEquals("11011001111101,Q4;", tokenStream("11011001111101"));}
    @Test
    public void testFDFA1T3() {
        assertEquals("0001001100,Q2;", tokenStream("0001001100"));
    }
    @Test
    public void testFDFA1T4() {
        assertEquals("10011,Q4;", tokenStream("10011"));
    }
    @Test
    public void testFDFA1T5() {
        assertEquals("000,Q3;00111,Q4;", tokenStream("00000111"));
    }
    @Test
    public void testFDFA1T6() {
        assertEquals("0000001,Q4;", tokenStream("0000001"));
    }
    @Test
    public void testFDFA1T7() {
        assertEquals("0111100111011101110,Q3;", tokenStream("0111100111011101110"));
    }
    @Test
    public void testFDFA1T8() {assertEquals("0011000001110,Q3;", tokenStream("0011000001110"));}
    @Test
    public void testFDFA1T9() {assertEquals("010101011000,Q3;", tokenStream("010101011000"));
    }
}
