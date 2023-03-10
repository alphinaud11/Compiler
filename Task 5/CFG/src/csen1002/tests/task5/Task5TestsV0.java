package csen1002.tests.task5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task5.CFG;

class Task5TestsV0 {

    @Test
    @Timeout(5)
    public void testReg1() {
        CFG cfg = new CFG("S,SaT,T;T,TzG,G;G,i");
        assertEquals("S,TS';S',aTS',e;T,GT';T',zGT',e;G,i",cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg2() {
        CFG cfg = new CFG("S,ScT,Sm,T,n;T,mSn,imLn,i;L,SdL,S");
        assertEquals("S,TS',nS';S',cTS',mS',e;T,mSn,imLn,i;L,mSnS'dL,imLnS'dL,iS'dL,nS'dL,mSnS',imLnS',iS',nS'", cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg3() {
        CFG cfg = new CFG("S,SpT,Sq,T,b;T,qSb,iqKb,i;K,SdK,S");
        assertEquals("S,TS',bS';S',pTS',qS',e;T,qSb,iqKb,i;K,qSbS'dK,iqKbS'dK,iS'dK,bS'dK,qSbS',iqKbS',iS',bS'", cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg4() {
        CFG cfg = new CFG("S,LW,Wd;L,SW,LS,m;W,SL,m");
        assertEquals("S,LW,Wd;L,WdWL',mL';L',WWL',SL',e;W,mL'WLW',mW';W',dWL'WLW',dLW',e",cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg5() {
        CFG cfg = new CFG("S,ScT,Sq,T,b;T,qSb,iqHb,i;H,SdH,S");
        assertEquals("S,TS',bS';S',cTS',qS',e;T,qSb,iqHb,i;H,qSbS'dH,iqHbS'dH,iS'dH,bS'dH,qSbS',iqHbS',iS',bS'", cfg.lre());
    }

}