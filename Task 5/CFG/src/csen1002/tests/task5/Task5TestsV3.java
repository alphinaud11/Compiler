package csen1002.tests.task5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task5.CFG;

class Task5TestsV3 {

    @Test
    @Timeout(5)
    public void testReg1() {
        CFG cfg = new CFG("S,Cb,Ab;A,Acb,BAC,CAB;B,bAC,CAB,BaC;C,CAB,Bc");
        assertEquals("S,Cb,Ab;A,BACA',CABA';A',cbA',e;B,bACB',CABB';B',aCB',e;C,bACB'cC';C',ABC',ABB'cC',e",cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg2() {
        CFG cfg = new CFG("S,Fd,Df,g;D,Fgd,Dfg,GFd;F,Dfg,gf;G,Fg,Dg,g");
        assertEquals("S,Fd,Df,g;D,FgdD',GFdD';D',fgD',e;F,GFdD'fgF',gfF';F',gdD'fgF',e;G,gfF'gG',gfF'gdD'gG',gG';G',FdD'fgF'gG',FdD'fgF'gdD'gG',FdD'gG',e", cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg3() {
        CFG cfg = new CFG("S,Qw,w;Q,Waw,Aqa,aQ;W,QwA,Awa,Wwa;A,Qw,a");
        assertEquals("S,Qw,w;Q,Waw,Aqa,aQ;W,AqawAW',aQwAW',AwaW';W',awwAW',waW',e;A,aQwAW'awwA',aQwA',aA';A',qawAW'awwA',waW'awwA',qawA',e", cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg4() {
        CFG cfg = new CFG("S,Zs,Qz,Qsz;Z,Zsq,Szq,SzZ;Q,Qs,Qzs,zs");
        assertEquals("S,Zs,Qz,Qsz;Z,QzzqZ',QszzqZ',QzzZZ',QszzZZ';Z',sqZ',szqZ',szZZ',e;Q,zsQ';Q',sQ',zsQ',e",cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg5() {
        CFG cfg = new CFG("S,Sx,Xs,s;X,Cxz,xcz,zx;C,Czx,Zx;Z,XZ,c");
        assertEquals("S,XsS',sS';S',xS',e;X,Cxz,xcz,zx;C,ZxC';C',zxC',e;Z,xczZZ',zxZZ',cZ';Z',xC'xzZZ',e", cfg.lre());
    }

}