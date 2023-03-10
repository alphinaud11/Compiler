package csen1002.tests.task3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task3.RegToNFA;

class Task3TestsV5 {

    @Test
    @Timeout(5)
    public void testReg1() {
        RegToNFA regToNFA = new RegToNFA("110|0..");
        assertEquals("10#0#9#4,5;8,9#0,1;2,3#1,6;3,7;5,7;6,2;6,4;7,8", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg2() {
        RegToNFA regToNFA = new RegToNFA("e1*|1.");
        assertEquals("10#6#9##2,3;8,9#0,1;1,7;3,2;3,5;4,2;4,5;5,7;6,0;6,4;7,8", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg3() {
        RegToNFA regToNFA = new RegToNFA("1e*|*");
        assertEquals("10#8#9##0,1#1,7;2,3;3,2;3,5;4,2;4,5;5,7;6,0;6,4;7,6;7,9;8,6;8,9", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg4() {
        RegToNFA regToNFA = new RegToNFA("e00|.*");
        assertEquals("10#8#9#2,3;4,5##0,1;1,6;3,7;5,7;6,2;6,4;7,0;7,9;8,0;8,9", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg5() {
        RegToNFA regToNFA = new RegToNFA("1e*e*.1..");
        assertEquals("12#0#11##0,1;10,11#1,4;2,3;3,2;3,5;4,2;4,5;5,8;6,7;7,6;7,9;8,6;8,9;9,10", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg6() {
        RegToNFA regToNFA = new RegToNFA("1e|**");
        assertEquals("10#8#9##0,1#1,5;2,3;3,5;4,0;4,2;5,4;5,7;6,4;6,7;7,6;7,9;8,6;8,9", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg7() {
        RegToNFA regToNFA = new RegToNFA("e1|*10.|");
        assertEquals("14#12#13#10,11#2,3;8,9#0,1;1,5;3,5;4,0;4,2;5,4;5,7;6,4;6,7;7,13;9,10;11,13;12,6;12,8", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg8() {
        RegToNFA regToNFA = new RegToNFA("e1*|e.*e|");
        assertEquals("16#14#15##2,3#0,1;1,7;3,2;3,5;4,2;4,5;5,7;6,0;6,4;7,8;8,9;9,6;9,11;10,6;10,11;11,15;12,13;13,15;14,10;14,12", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg9() {
        RegToNFA regToNFA = new RegToNFA("e11e|.|");
        assertEquals("12#10#11##2,3;4,5#0,1;1,11;3,8;5,9;6,7;7,9;8,4;8,6;9,11;10,0;10,2", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg10() {
        RegToNFA regToNFA = new RegToNFA("1e0||");
        assertEquals("10#8#9#4,5#0,1#1,9;2,3;3,7;5,7;6,2;6,4;7,9;8,0;8,6", regToNFA.toString());
    }

}