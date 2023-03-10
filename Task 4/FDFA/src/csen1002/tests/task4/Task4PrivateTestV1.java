package csen1002.tests.task4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task4.FDFA;

public class Task4PrivateTestV1 {

    ////////// 1ST FDFA///////////////
    @Test
    @Timeout(5)
    public void testFDFA1T1() {
        FDFA fdfa1 = new FDFA("0,1,4,N;1,1,2,O;2,2,3,P;3,3,4,A;4,4,5,Q;5,6,5,R;6,0,7,S;7,7,7,B#3,7");
        assertEquals(fdfa1.run("00111000"), "0011,A;1000,Q;");
    }

    @Test
    @Timeout(5)
    public void testFDFA1T2() {
        FDFA fdfa1 = new FDFA("0,1,4,N;1,1,2,O;2,2,3,P;3,3,4,A;4,4,5,Q;5,6,5,R;6,0,7,S;7,7,7,B#3,7");
        assertEquals(fdfa1.run("0111101"), "0111101,B;");
    }

    @Test
    @Timeout(5)
    public void testFDFA1T3() {
        FDFA fdfa1 = new FDFA("0,1,4,N;1,1,2,O;2,2,3,P;3,3,4,A;4,4,5,Q;5,6,5,R;6,0,7,S;7,7,7,B#3,7");
        assertEquals(fdfa1.run("011011"), "0110,A;11,R;");
    }

    @Test
    @Timeout(5)
    public void testFDFA1T4() {
        FDFA fdfa1 = new FDFA("0,1,4,N;1,1,2,O;2,2,3,P;3,3,4,A;4,4,5,Q;5,6,5,R;6,0,7,S;7,7,7,B#3,7");
        assertEquals(fdfa1.run("10001111"), "10001111,R;");
    }

    @Test
    @Timeout(5)
    public void testFDFA1T5() {
        FDFA fdfa1 = new FDFA("0,1,4,N;1,1,2,O;2,2,3,P;3,3,4,A;4,4,5,Q;5,6,5,R;6,0,7,S;7,7,7,B#3,7");
        assertEquals(fdfa1.run("0011110"), "0011,A;110,S;");

    }

    ////////// 2nd FDFA///////////////
    @Test
    @Timeout(5)
    public void testFDFA2T1() {
        FDFA fdfa2 = new FDFA("0,1,3,N;1,1,5,O;2,2,2,P;3,2,4,Q;4,4,2,A;5,5,2,B#4,5");
        assertEquals(fdfa2.run("000111"), "0001,B;11,A;");
    }

    @Test
    @Timeout(5)
    public void testFDFA2T2() {
        FDFA fdfa2 = new FDFA("0,1,3,N;1,1,5,O;2,2,2,P;3,2,4,Q;4,4,2,A;5,5,2,B#4,5");
        assertEquals(fdfa2.run("1100011"), "11000,A;11,A;");
    }

    @Test
    @Timeout(5)
    public void testFDFA2T3() {
        FDFA fdfa2 = new FDFA("0,1,3,N;1,1,5,O;2,2,2,P;3,2,4,Q;4,4,2,A;5,5,2,B#4,5");
        assertEquals(fdfa2.run("0000"), "0000,O;");
    }

    @Test
    @Timeout(5)
    public void testFDFA2T4() {
        FDFA fdfa2 = new FDFA("0,1,3,N;1,1,5,O;2,2,2,P;3,2,4,Q;4,4,2,A;5,5,2,B#4,5");
        assertEquals(fdfa2.run("001001000"), "00100,B;1000,P;");
    }

    @Test
    @Timeout(5)
    public void testFDFA2T5() {
        FDFA fdfa2 = new FDFA("0,1,3,N;1,1,5,O;2,2,2,P;3,2,4,Q;4,4,2,A;5,5,2,B#4,5");
        assertEquals(fdfa2.run("011"), "01,B;1,Q;");

    }

}