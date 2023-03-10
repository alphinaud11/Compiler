package csen1002.tests.task4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task4.FDFA;

public class Task4PublicTest {

    //////////2nd FDFA Strings Actions///////////////
    @Test
    @Timeout(5)
    public void testFDFA1T1() {
        FDFA fdfa1 = new FDFA("0,1,0,N;1,1,2,O;2,3,1,P;3,3,4,Q;4,3,4,A#4");
        assertEquals(fdfa1.run("10111"),"10111,P;");
    }
    @Test
    @Timeout(5)
    public void testFDFA1T2() {
        FDFA fdfa1 = new FDFA("0,1,0,N;1,1,2,O;2,3,1,P;3,3,4,Q;4,3,4,A#4");
        assertEquals(fdfa1.run("101011"),"101011,A;");
    }	@Test
    @Timeout(5)
    public void testFDFA1T3() {
        FDFA fdfa1 = new FDFA("0,1,0,N;1,1,2,O;2,3,1,P;3,3,4,Q;4,3,4,A#4");
        assertEquals(fdfa1.run("01011000"),"01011,A;000,O;");
    }	@Test
    @Timeout(5)
    public void testFDFA1T4() {
        FDFA fdfa1 = new FDFA("0,1,0,N;1,1,2,O;2,3,1,P;3,3,4,Q;4,3,4,A#4");
        assertEquals(fdfa1.run("1111"),"1111,N;");
    }	@Test
    @Timeout(5)
    public void testFDFA1T5() {
        FDFA fdfa1 = new FDFA("0,1,0,N;1,1,2,O;2,3,1,P;3,3,4,Q;4,3,4,A#4");
        assertEquals(fdfa1.run("110101010"),"11010101,A;0,O;");

    }
    //////////1st FDFA Strings Actions///////////////
    @Test
    @Timeout(5)
    public void testFDFA2T1() {
        FDFA fdfa2 = new FDFA("0,0,1,N;1,2,1,A;2,3,0,B;3,3,0,O#1,2");
        assertEquals(fdfa2.run("011000"),"0110,B;00,N;");
    }
    @Test
    @Timeout(5)
    public void testFDFA2T2() {
        FDFA fdfa2 = new FDFA("0,0,1,N;1,2,1,A;2,3,0,B;3,3,0,O#1,2");
        assertEquals(fdfa2.run("0000"),"0000,N;");
    }	@Test
    @Timeout(5)
    public void testFDFA2T3() {
        FDFA fdfa2 = new FDFA("0,0,1,N;1,2,1,A;2,3,0,B;3,3,0,O#1,2");
        assertEquals(fdfa2.run("1011011"),"1011011,A;");
    }	@Test
    @Timeout(5)
    public void testFDFA2T4() {
        FDFA fdfa2 = new FDFA("0,0,1,N;1,2,1,A;2,3,0,B;3,3,0,O#1,2");
        assertEquals(fdfa2.run("0"),"0,N;");
    }	@Test
    @Timeout(5)
    public void testFDFA2T5() {
        FDFA fdfa2 = new FDFA("0,0,1,N;1,2,1,A;2,3,0,B;3,3,0,O#1,2");
        assertEquals(fdfa2.run("10110"),"10110,B;");

    }


}