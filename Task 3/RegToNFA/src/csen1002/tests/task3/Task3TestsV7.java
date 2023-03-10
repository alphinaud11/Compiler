package csen1002.tests.task3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task3.RegToNFA;

class Task3TestsV7 {

    @Test
    @Timeout(5)
    public void testReg1() {
        RegToNFA regToNFA = new RegToNFA("011|.1.");
        assertEquals("10#0#9#0,1#2,3;4,5;8,9#1,6;3,7;5,7;6,2;6,4;7,8", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg2() {
        RegToNFA regToNFA = new RegToNFA("0e|1.0.1|");
        assertEquals("14#12#13#0,1;8,9#6,7;10,11#1,5;2,3;3,5;4,0;4,2;5,6;7,8;9,13;11,13;12,4;12,10", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg3() {
        RegToNFA regToNFA = new RegToNFA("0**1.0|");
        assertEquals("12#10#11#0,1;8,9#6,7#1,0;1,3;2,0;2,3;3,2;3,5;4,2;4,5;5,6;7,11;9,11;10,4;10,8", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg4() {
        RegToNFA regToNFA = new RegToNFA("0e*0||");
        assertEquals("12#10#11#0,1;6,7##1,11;2,3;3,2;3,5;4,2;4,5;5,9;7,9;8,4;8,6;9,11;10,0;10,8", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg5() {
        RegToNFA regToNFA = new RegToNFA("1**1e|.");
        assertEquals("12#4#11##0,1;6,7#1,0;1,3;2,0;2,3;3,2;3,5;4,2;4,5;5,10;7,11;8,9;9,11;10,6;10,8", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg6() {
        RegToNFA regToNFA = new RegToNFA("10|00..");
        assertEquals("10#4#9#2,3;6,7;8,9#0,1#1,5;3,5;4,0;4,2;5,6;7,8", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg7() {
        RegToNFA regToNFA = new RegToNFA("e01*0*...");
        assertEquals("12#0#11#2,3;8,9#4,5#0,1;1,2;3,6;5,4;5,7;6,4;6,7;7,10;9,8;9,11;10,8;10,11", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg8() {
        RegToNFA regToNFA = new RegToNFA("110e|||");
        assertEquals("14#12#13#4,5#0,1;2,3#1,13;3,11;5,9;6,7;7,9;8,4;8,6;9,11;10,2;10,8;11,13;12,0;12,10", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg9() {
        RegToNFA regToNFA = new RegToNFA("100*.|1|");
        assertEquals("14#12#13#2,3;4,5#0,1;10,11#1,9;3,6;5,4;5,7;6,4;6,7;7,9;8,0;8,2;9,13;11,13;12,8;12,10", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg10() {
        RegToNFA regToNFA = new RegToNFA("ee1|*.");
        assertEquals("10#0#9##4,5#0,1;1,8;2,3;3,7;5,7;6,2;6,4;7,6;7,9;8,6;8,9", regToNFA.toString());
    }

}