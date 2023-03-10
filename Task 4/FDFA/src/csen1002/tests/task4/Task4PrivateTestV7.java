package csen1002.tests.task4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task4.FDFA;

public class Task4PrivateTestV7 {

    ////////// 1st FDFA///////////////
    @Test
    @Timeout(5)
    public void testFDFA1T1() {
        FDFA fdfa1 = new FDFA("0,1,3,N;1,6,2,P;2,7,2,P;3,4,5,Q;4,4,8,R;5,9,5,S;6,10,2,A;7,4,10,B;8,10,5,C;9,5,10,D;10,10,10,T#6,7,8,9");
        assertEquals(fdfa1.run("0001001010110"), "00,A;01001,C;010,B;110,D;");
    }

    @Test
    @Timeout(5)
    public void testFDFA1T2() {
        FDFA fdfa1 = new FDFA("0,1,3,N;1,6,2,P;2,7,2,P;3,4,5,Q;4,4,8,R;5,9,5,S;6,10,2,A;7,4,10,B;8,10,5,C;9,5,10,D;10,10,10,T#6,7,8,9");
        assertEquals(fdfa1.run("011100111"), "0111001,C;11,S;");
    }

    @Test
    @Timeout(5)
    public void testFDFA1T3() {
        FDFA fdfa1 = new FDFA("0,1,3,N;1,6,2,P;2,7,2,P;3,4,5,Q;4,4,8,R;5,9,5,S;6,10,2,A;7,4,10,B;8,10,5,C;9,5,10,D;10,10,10,T#6,7,8,9");
        assertEquals(fdfa1.run("0111000"), "01110,B;00,A;");
    }

    @Test
    @Timeout(5)
    public void testFDFA1T4() {
        FDFA fdfa1 = new FDFA("0,1,3,N;1,6,2,P;2,7,2,P;3,4,5,Q;4,4,8,R;5,9,5,S;6,10,2,A;7,4,10,B;8,10,5,C;9,5,10,D;10,10,10,T#6,7,8,9");
        assertEquals(fdfa1.run("1000000"), "1000000,R;");
    }

    @Test
    @Timeout(5)
    public void testFDFA1T5() {
        FDFA fdfa1 = new FDFA("0,1,3,N;1,6,2,P;2,7,2,P;3,4,5,Q;4,4,8,R;5,9,5,S;6,10,2,A;7,4,10,B;8,10,5,C;9,5,10,D;10,10,10,T#6,7,8,9");
        assertEquals(fdfa1.run("111100111"), "11110,D;0111,P;");

    }

    ////////// 2nd FDFA///////////////
    @Test
    @Timeout(5)
    public void testFDFA2T1() {
        FDFA fdfa2 = new FDFA("0,1,5,N;1,3,2,O;2,3,1,A;3,5,3,P;4,3,5,Q;5,5,4,B#2,5");
        assertEquals(fdfa2.run("00100010111"), "001000,B;1011,B;1,B;");
    }

    @Test
    @Timeout(5)
    public void testFDFA2T2() {
        FDFA fdfa2 = new FDFA("0,1,5,N;1,3,2,O;2,3,1,A;3,5,3,P;4,3,5,Q;5,5,4,B#2,5");
        assertEquals(fdfa2.run("0111111"), "011111,A;1,B;");
    }

    @Test
    @Timeout(5)
    public void testFDFA2T3() {
        FDFA fdfa2 = new FDFA("0,1,5,N;1,3,2,O;2,3,1,A;3,5,3,P;4,3,5,Q;5,5,4,B#2,5");
        assertEquals(fdfa2.run("001111"), "001111,P;");
    }

    @Test
    @Timeout(5)
    public void testFDFA2T4() {
        FDFA fdfa2 = new FDFA("0,1,5,N;1,3,2,O;2,3,1,A;3,5,3,P;4,3,5,Q;5,5,4,B#2,5");
        assertEquals(fdfa2.run("0111100100"), "0111100100,B;");
    }

    @Test
    @Timeout(5)
    public void testFDFA2T5() {
        FDFA fdfa2 = new FDFA("0,1,5,N;1,3,2,O;2,3,1,A;3,5,3,P;4,3,5,Q;5,5,4,B#2,5");
        assertEquals(fdfa2.run("01110"), "0111,A;0,O;");

    }

}