package csen1002.tests.task6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task6.FFCFG;

@Timeout(5)
public class Task6TestsV0 {

    @Test
    public void testCFG1First() {
        FFCFG cfg = new FFCFG("S,aBDh;B,cA;A,bA,e;D,EF;E,g,e;F,f,e");
        assertEquals("S,a;B,c;A,be;D,efg;E,eg;F,ef", cfg.first());
    }

    @Test
    public void testCFG1Follow() {
        FFCFG cfg = new FFCFG("S,aBDh;B,cA;A,bA,e;D,EF;E,g,e;F,f,e");
        assertEquals("S,$;B,fgh;A,fgh;D,h;E,fh;F,h", cfg.follow());
    }

    @Test
    public void testCFG2First() {
        FFCFG cfg = new FFCFG("S,yS,van;K,dSg,rw;H,uk,fHK,HwK,e;P,KPa,f");
        assertEquals("S,vy;K,dr;H,efuw;P,dfr", cfg.first());
    }

    @Test
    public void testCFG2Follow() {
        FFCFG cfg = new FFCFG("S,yS,van;K,dSg,rw;H,uk,fHK,HwK,e;P,KPa,f");
        assertEquals("S,g$;K,dfrw;H,drw;P,a", cfg.follow());
    }

    @Test
    public void testCFG3First() {
        FFCFG cfg = new FFCFG("S,hUw,SUC,go;C,SlxSa,oc;U,hn,z,nSm,e");
        assertEquals("S,gh;C,gho;U,ehnz", cfg.first());
    }

    @Test
    public void testCFG3Follow() {
        FFCFG cfg = new FFCFG("S,hUw,SUC,go;C,SlxSa,oc;U,hn,z,nSm,e");
        assertEquals("S,aghlmnoz$;C,aghlmnoz$;U,ghow", cfg.follow());
    }

    @Test
    public void testCFG4First() {
        FFCFG cfg = new FFCFG("S,DajQ,QI;D,aSf,QaS,e;Q,sS,hi,e;I,IS,IsQj,z,xy");
        assertEquals("S,ahsxz;D,aehs;Q,ehs;I,xz", cfg.first());
    }

    @Test
    public void testCFG4Follow() {
        FFCFG cfg = new FFCFG("S,DajQ,QI;D,aSf,QaS,e;Q,sS,hi,e;I,IS,IsQj,z,xy");
        assertEquals("S,afhjsxz$;D,a;Q,afhjsxz$;I,afhjsxz$", cfg.follow());
    }

    @Test
    public void testCFG5First() {
        FFCFG cfg = new FFCFG("S,Rpx,Sx;R,Ds,bs;D,H,xsH,e;H,Hp,stRR,po");
        assertEquals("S,bpsx;R,bpsx;D,epsx;H,ps", cfg.first());
    }

    @Test
    public void testCFG5Follow() {
        FFCFG cfg = new FFCFG("S,Rpx,Sx;R,Ds,bs;D,H,xsH,e;H,Hp,stRR,po");
        assertEquals("S,x$;R,bpsx;D,s;H,ps", cfg.follow());
    }

}
