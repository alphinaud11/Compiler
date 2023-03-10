package csen1002.tests.task5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task5.CFG;

class Task5TestsV7 {

    @Test
    @Timeout(5)
    public void testReg1() {
        CFG cfg = new CFG("S,Sm,Lm,Ml;L,LSm,msl,Ls;M,mM,l");
        assertEquals("S,LmS',MlS';S',mS',e;L,mslL';L',SmL',sL',e;M,mM,l",cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg2() {
        CFG cfg = new CFG("S,PK,kj,jK;P,Pk,kj;J,PJk,kj;K,KP,p");
        assertEquals("S,PK,kj,jK;P,kjP';P',kP',e;J,kjP'Jk,kj;K,pK';K',PK',e", cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg3() {
        CFG cfg = new CFG("S,sAS,Sas;A,ADd,Dda;D,DsA,ASd,d;F,DAf,f");
        assertEquals("S,sASS';S',asS',e;A,DdaA';A',DdA',e;D,dD';D',sAD',daA'SdD',e;F,dD'Af,f", cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg4() {
        CFG cfg = new CFG("S,df,fd,Sd;D,Ds,sd,Sd;F,Fd,d");
        assertEquals("S,dfS',fdS';S',dS',e;D,sdD',dfS'dD',fdS'dD';D',sD',e;F,dF';F',dF',e",cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg5() {
        CFG cfg = new CFG("S,Sf,df,Ff;F,Fdf,dff;D,Fsd,d");
        assertEquals("S,dfS',FfS';S',fS',e;F,dffF';F',dfF',e;D,dffF'sd,d", cfg.lre());
    }

}