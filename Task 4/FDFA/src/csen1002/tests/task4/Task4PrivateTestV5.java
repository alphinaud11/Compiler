package csen1002.tests.task4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task4.FDFA;

public class Task4PrivateTestV5 {

    //////////1st FDFA///////////////
    @Test
    @Timeout(5)
    public void testFDFA1T1() {
        FDFA fdfa1 = new FDFA("0,3,1,N;1,2,0,O;2,0,2,A;3,0,4,P;4,0,4,B#2,4");
        assertEquals(fdfa1.run("111011101"),"1110111,A;01,B;");
    }
    @Test
    @Timeout(5)
    public void testFDFA1T2() {
        FDFA fdfa1 = new FDFA("0,3,1,N;1,2,0,O;2,0,2,A;3,0,4,P;4,0,4,B#2,4");
        assertEquals(fdfa1.run("1111"),"1111,N;");
    }	@Test
    @Timeout(5)
    public void testFDFA1T3() {
        FDFA fdfa1 = new FDFA("0,3,1,N;1,2,0,O;2,0,2,A;3,0,4,P;4,0,4,B#2,4");
        assertEquals(fdfa1.run("1001"),"10,A;01,B;");
    }	@Test
    @Timeout(5)
    public void testFDFA1T4() {
        FDFA fdfa1 = new FDFA("0,3,1,N;1,2,0,O;2,0,2,A;3,0,4,P;4,0,4,B#2,4");
        assertEquals(fdfa1.run("1110111000"),"1110111,A;000,P;");
    }	@Test
    @Timeout(5)
    public void testFDFA1T5() {
        FDFA fdfa1 = new FDFA("0,3,1,N;1,2,0,O;2,0,2,A;3,0,4,P;4,0,4,B#2,4");
        assertEquals(fdfa1.run("011110010"),"01111001,B;0,P;");

    }
    //////////2nd FDFA///////////////
    @Test
    @Timeout(5)
    public void testFDFA2T1() {
        FDFA fdfa2 = new FDFA("0,1,2,N;1,4,3,A;2,3,5,O;3,4,1,P;4,4,4,Q;5,4,4,B#1,5");
        assertEquals(fdfa2.run("0000"),"0,A;0,A;0,A;0,A;");
    }
    @Test
    @Timeout(5)
    public void testFDFA2T2() {
        FDFA fdfa2 = new FDFA("0,1,2,N;1,4,3,A;2,3,5,O;3,4,1,P;4,4,4,Q;5,4,4,B#1,5");
        assertEquals(fdfa2.run("1100"),"11,B;0,A;0,A;");
    }	@Test
    @Timeout(5)
    public void testFDFA2T3() {
        FDFA fdfa2 = new FDFA("0,1,2,N;1,4,3,A;2,3,5,O;3,4,1,P;4,4,4,Q;5,4,4,B#1,5");
        assertEquals(fdfa2.run("1000101"),"1000101,Q;");
    }	@Test
    @Timeout(5)
    public void testFDFA2T4() {
        FDFA fdfa2 = new FDFA("0,1,2,N;1,4,3,A;2,3,5,O;3,4,1,P;4,4,4,Q;5,4,4,B#1,5");
        assertEquals(fdfa2.run("1011"),"101,A;1,O;");
    }	@Test
    @Timeout(5)
    public void testFDFA2T5() {
        FDFA fdfa2 = new FDFA("0,1,2,N;1,4,3,A;2,3,5,O;3,4,1,P;4,4,4,Q;5,4,4,B#1,5");
        assertEquals(fdfa2.run("1011110"),"10111,A;10,P;");

    }


}