package csen1002.tests.task3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task3.RegToNFA;

class Task3TestsV1 {

    @Test
    @Timeout(5)
    public void testReg1() {
        RegToNFA regToNFA = new RegToNFA("e0|e|");
        assertEquals("10#8#9#2,3##0,1;1,5;3,5;4,0;4,2;5,9;6,7;7,9;8,4;8,6", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg2() {
        RegToNFA regToNFA = new RegToNFA("1ee.e.|");
        assertEquals("10#8#9##0,1#1,9;2,3;3,4;4,5;5,6;6,7;7,9;8,0;8,2", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg3() {
        RegToNFA regToNFA = new RegToNFA("11|e|");
        assertEquals("10#8#9##0,1;2,3#1,5;3,5;4,0;4,2;5,9;6,7;7,9;8,4;8,6", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg4() {
        RegToNFA regToNFA = new RegToNFA("0****01.|");
        assertEquals("16#14#15#0,1;10,11#12,13#1,0;1,3;2,0;2,3;3,2;3,5;4,2;4,5;5,4;5,7;6,4;6,7;7,6;7,9;8,6;8,9;9,15;11,12;13,15;14,8;14,10", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg5() {
        RegToNFA regToNFA = new RegToNFA("ee|1*.");
        assertEquals("10#4#9##6,7#0,1;1,5;2,3;3,5;4,0;4,2;5,8;7,6;7,9;8,6;8,9", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg6() {
        RegToNFA regToNFA = new RegToNFA("10e||*");
        assertEquals("12#10#11#2,3#0,1#1,9;3,7;4,5;5,7;6,2;6,4;7,9;8,0;8,6;9,8;9,11;10,8;10,11", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg7() {
        RegToNFA regToNFA = new RegToNFA("000.0||");
        assertEquals("12#10#11#0,1;2,3;4,5;6,7##1,11;3,4;5,9;7,9;8,2;8,6;9,11;10,0;10,8", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg8() {
        RegToNFA regToNFA = new RegToNFA("0e00..|");
        assertEquals("10#8#9#0,1;4,5;6,7##1,9;2,3;3,4;5,6;7,9;8,0;8,2", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg9() {
        RegToNFA regToNFA = new RegToNFA("0e1|***.*");
        assertEquals("16#14#15#0,1#4,5#1,12;2,3;3,7;5,7;6,2;6,4;7,6;7,9;8,6;8,9;9,8;9,11;10,8;10,11;11,10;11,13;12,10;12,13;13,0;13,15;14,0;14,15", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg10() {
        RegToNFA regToNFA = new RegToNFA("e1*|*");
        assertEquals("10#8#9##2,3#0,1;1,7;3,2;3,5;4,2;4,5;5,7;6,0;6,4;7,6;7,9;8,6;8,9", regToNFA.toString());
    }

}