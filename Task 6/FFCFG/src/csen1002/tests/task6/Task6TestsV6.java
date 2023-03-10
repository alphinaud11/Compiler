package csen1002.tests.task6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task6.FFCFG;

@Timeout(5)
public class Task6TestsV6 {

    @Test
    public void testCFG1First() {
        FFCFG cfg = new FFCFG("S,Z,dNtHm,RZxS;H,dZSt,mUH,nZm,dHU,e;N,RRxS,HtH;U,dRd,nRRt,e;Z,mZ,UU;R,dHHx,m,Z");
        assertEquals("S,demnx;H,demn;N,dmntx;U,den;Z,demn;R,demn", cfg.first());
    }

    @Test
    public void testCFG1Follow() {
        FFCFG cfg = new FFCFG("S,Z,dNtHm,RZxS;H,dZSt,mUH,nZm,dHU,e;N,RRxS,HtH;U,dRd,nRRt,e;Z,mZ,UU;R,dHHx,m,Z");
        assertEquals("S,t$;H,dmntx;N,t;U,dmntx$;Z,dmntx$;R,dmntx", cfg.follow());
    }

    @Test
    public void testCFG2First() {
        FFCFG cfg = new FFCFG("S,N,aN,a,pV;V,Kp,NrSr,lSr;I,SU,iI;U,KNiK,N,UiU;K,Kp,KUvSI;N,rV,NVS,e");
        assertEquals("S,aelpr;V,lr;I,aeilpr;U,eilr;K,;N,elr", cfg.first());
    }

    @Test
    public void testCFG2Follow() {
        FFCFG cfg = new FFCFG("S,N,aN,a,pV;V,Kp,NrSr,lSr;I,SU,iI;U,KNiK,N,UiU;K,Kp,KUvSI;N,rV,NVS,e");
        assertEquals("S,ailprv$;V,ailprv$;I,ilprv;U,ilprv;K,ilprv;N,ailprv$", cfg.follow());
    }

    @Test
    public void testCFG3First() {
        FFCFG cfg = new FFCFG("S,zS,KdY;K,Z,XlKKw,zYzXl,JlSlK;J,wJ,wXYt,jK,Z;Y,wS,X,z;Z,d,X,e;X,zXdS,j,e");
        assertEquals("S,djlwz;K,dejlwz;J,dejwz;Y,ejwz;Z,dejz;X,ejz", cfg.first());
    }

    @Test
    public void testCFG3Follow() {
        FFCFG cfg = new FFCFG("S,zS,KdY;K,Z,XlKKw,zYzXl,JlSlK;J,wJ,wXYt,jK,Z;Y,wS,X,z;Z,d,X,e;X,zXdS,j,e");
        assertEquals("S,djltwz$;K,djlwz;J,l;Y,djltwz$;Z,djlwz;X,djltwz$", cfg.follow());
    }

    @Test
    public void testCFG4First() {
        FFCFG cfg = new FFCFG("S,vU,m,QmUvA;U,m,c,cAB,UvU,e;I,UABvU,fBcA,cQ,U;Q,cUv,oUU,fQoUf;A,I,m;B,o,fQvBf,m");
        assertEquals("S,cfmov;U,cemv;I,cefmov;Q,cfo;A,cefmov;B,fmo", cfg.first());
    }

    @Test
    public void testCFG4Follow() {
        FFCFG cfg = new FFCFG("S,vU,m,QmUvA;U,m,c,cAB,UvU,e;I,UABvU,fBcA,cQ,U;Q,cUv,oUU,fQoUf;A,I,m;B,o,fQvBf,m");
        assertEquals("S,$;U,cfmov$;I,fmo$;Q,fmov$;A,fmo$;B,cfmov$", cfg.follow());
    }

    @Test
    public void testCFG5First() {
        FFCFG cfg = new FFCFG("S,JdS,wSoJn,oD,JJ;E,dEDn,o,bSo,bDE,e;Y,E,wDbS;D,o,oJbSd,dZn,e;J,Jd,w;Z,oY,D");
        assertEquals("S,ow;E,bdeo;Y,bdeow;D,deo;J,w;Z,deo", cfg.first());
    }

    @Test
    public void testCFG5Follow() {
        FFCFG cfg = new FFCFG("S,JdS,wSoJn,oD,JJ;E,dEDn,o,bSo,bDE,e;Y,E,wDbS;D,o,oJbSd,dZn,e;J,Jd,w;Z,oY,D");
        assertEquals("S,dno$;E,dno;Y,n;D,bdno$;J,bdnow$;Z,n", cfg.follow());
    }

}