package csen1002.tests.task3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task3.RegToNFA;

class Task3TestsV4 {

    @Test
    @Timeout(5)
    public void testReg1() {
        RegToNFA regToNFA = new RegToNFA("0e**|1|");
        assertEquals("14#12#13#0,1#10,11#1,9;2,3;3,2;3,5;4,2;4,5;5,4;5,7;6,4;6,7;7,9;8,0;8,6;9,13;11,13;12,8;12,10", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg2() {
        RegToNFA regToNFA = new RegToNFA("1e|ee|*|");
        assertEquals("16#14#15##0,1#1,5;2,3;3,5;4,0;4,2;5,15;6,7;7,11;8,9;9,11;10,6;10,8;11,10;11,13;12,10;12,13;13,15;14,4;14,12", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg3() {
        RegToNFA regToNFA = new RegToNFA("1e1|.0.");
        assertEquals("10#0#9#8,9#0,1;4,5#1,6;2,3;3,7;5,7;6,2;6,4;7,8", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg4() {
        RegToNFA regToNFA = new RegToNFA("1*0|**");
        assertEquals("12#10#11#4,5#0,1#1,0;1,3;2,0;2,3;3,7;5,7;6,2;6,4;7,6;7,9;8,6;8,9;9,8;9,11;10,8;10,11", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg5() {
        RegToNFA regToNFA = new RegToNFA("1*e1*|.**");
        assertEquals("16#14#15##0,1;6,7#1,0;1,3;2,0;2,3;3,10;4,5;5,11;7,6;7,9;8,6;8,9;9,11;10,4;10,8;11,2;11,13;12,2;12,13;13,12;13,15;14,12;14,15", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg6() {
        RegToNFA regToNFA = new RegToNFA("ee*|1.");
        assertEquals("10#6#9##8,9#0,1;1,7;2,3;3,2;3,5;4,2;4,5;5,7;6,0;6,4;7,8", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg7() {
        RegToNFA regToNFA = new RegToNFA("01e*.*|*");
        assertEquals("14#12#13#0,1#2,3#1,11;3,6;4,5;5,4;5,7;6,4;6,7;7,2;7,9;8,2;8,9;9,11;10,0;10,8;11,10;11,13;12,10;12,13", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg8() {
        RegToNFA regToNFA = new RegToNFA("e*0*1.|");
        assertEquals("12#10#11#4,5#8,9#0,1;1,0;1,3;2,0;2,3;3,11;5,4;5,7;6,4;6,7;7,8;9,11;10,2;10,6", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg9() {
        RegToNFA regToNFA = new RegToNFA("e*0.1|");
        assertEquals("10#8#9#4,5#6,7#0,1;1,0;1,3;2,0;2,3;3,4;5,9;7,9;8,2;8,6", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg10() {
        RegToNFA regToNFA = new RegToNFA("111|0|.");
        assertEquals("12#0#11#8,9#0,1;2,3;4,5#1,10;3,7;5,7;6,2;6,4;7,11;9,11;10,6;10,8", regToNFA.toString());
    }

}