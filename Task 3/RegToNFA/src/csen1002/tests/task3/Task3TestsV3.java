package csen1002.tests.task3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task3.RegToNFA;

class Task3TestsV3 {

    @Test
    @Timeout(5)
    public void testReg1() {
        RegToNFA regToNFA = new RegToNFA("00*1**|*|");
        assertEquals("18#16#17#0,1;2,3#6,7#1,17;3,2;3,5;4,2;4,5;5,13;7,6;7,9;8,6;8,9;9,8;9,11;10,8;10,11;11,13;12,4;12,10;13,12;13,15;14,12;14,15;15,17;16,0;16,14", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg2() {
        RegToNFA regToNFA = new RegToNFA("10|e|");
        assertEquals("10#8#9#2,3#0,1#1,5;3,5;4,0;4,2;5,9;6,7;7,9;8,4;8,6", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg3() {
        RegToNFA regToNFA = new RegToNFA("01.e*|");
        assertEquals("10#8#9#0,1#2,3#1,2;3,9;4,5;5,4;5,7;6,4;6,7;7,9;8,0;8,6", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg4() {
        RegToNFA regToNFA = new RegToNFA("10*0||e|");
        assertEquals("16#14#15#2,3;6,7#0,1#1,11;3,2;3,5;4,2;4,5;5,9;7,9;8,4;8,6;9,11;10,0;10,8;11,15;12,13;13,15;14,10;14,12", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg5() {
        RegToNFA regToNFA = new RegToNFA("01|1|");
        assertEquals("10#8#9#0,1#2,3;6,7#1,5;3,5;4,0;4,2;5,9;7,9;8,4;8,6", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg6() {
        RegToNFA regToNFA = new RegToNFA("e*010||.");
        assertEquals("14#2#13#4,5;8,9#6,7#0,1;1,0;1,3;2,0;2,3;3,12;5,13;7,11;9,11;10,6;10,8;11,13;12,4;12,10", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg7() {
        RegToNFA regToNFA = new RegToNFA("10|1|*");
        assertEquals("12#10#11#2,3#0,1;6,7#1,5;3,5;4,0;4,2;5,9;7,9;8,4;8,6;9,8;9,11;10,8;10,11", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg8() {
        RegToNFA regToNFA = new RegToNFA("01**|");
        assertEquals("10#8#9#0,1#2,3#1,9;3,2;3,5;4,2;4,5;5,4;5,7;6,4;6,7;7,9;8,0;8,6", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg9() {
        RegToNFA regToNFA = new RegToNFA("011|*1..");
        assertEquals("12#0#11#0,1#2,3;4,5;10,11#1,8;3,7;5,7;6,2;6,4;7,6;7,9;8,6;8,9;9,10", regToNFA.toString());
    }

    @Test
    @Timeout(5)
    public void testReg10() {
        RegToNFA regToNFA = new RegToNFA("e1*.e*.");
        assertEquals("10#0#9##2,3#0,1;1,4;3,2;3,5;4,2;4,5;5,8;6,7;7,6;7,9;8,6;8,9", regToNFA.toString());
    }

}