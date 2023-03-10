package csen1002.tests.task9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import csen1002.main.task9.Task9Lexer;
import csen1002.main.task9.Task9Parser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;

public class Task9TestsV0 {
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

    @Test
    public void testInput01() {
        assertEquals(0, sCheckValue("aaaaccccccccccccbbbb"));
    }

    @Test
    public void testInput02() {
        assertEquals(0, sCheckValue("bbbb"));
    }

    @Test
    public void testInput03() {
        assertEquals(0, sCheckValue("aaaaacccccccbbbbbbbb"));
    }

    @Test
    public void testInput04() {
        assertEquals(0, sCheckValue("aaaaaacccccccccbbbbbbbbbbb"));
    }

    @Test
    public void testInput05() {
        assertEquals(1, sCheckValue("aaaaaaacccccccbbbbbbb"));
    }

    @Test
    public void testInput06() {
        assertEquals(0, sCheckValue("aaaaaaaaaccccccbbbbbb"));
    }

    @Test
    public void testInput07() {
        assertEquals(1, sCheckValue(""));
    }

    @Test
    public void testInput08() {
        assertEquals(0, sCheckValue("aaaaaaa"));
    }

    @Test
    public void testInput09() {
        assertEquals(0, sCheckValue("aaaabbbbbbb"));
    }

    @Test
    public void testInput10() {
        assertEquals(0, sCheckValue("ccccccccccccbb"));
    }
}
