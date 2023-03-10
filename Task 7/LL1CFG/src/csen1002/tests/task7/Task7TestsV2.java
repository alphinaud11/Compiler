package csen1002.tests.task7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task7.LL1CFG;

@Timeout(5)
public class Task7TestsV2 {
    @Test
    public void testLL1CFG1Parse1() {
        LL1CFG ll1cfg1 = new LL1CFG("S,qHHSpH,LLa;H,FpFq,bLp;L,xHaS,dH;F,dLbLxS,aSqHp,e#S,q,dx;H,adp,b;L,x,d;F,d,a,e#S,abdpqx$;H,abdpqx$;L,abdpx;F,pq");
        assertEquals("S,LLa,dHLa,dFpFqLa,dpFqLa,dpqLa,dpqdHa,dpqdFpFqa,dpqdpFqa,dpqdpqa", ll1cfg1.parse("dpqdpqa"));
    }

    @Test
    public void testLL1CFG1Parse2() {
        LL1CFG ll1cfg1 = new LL1CFG("S,qHHSpH,LLa;H,FpFq,bLp;L,xHaS,dH;F,dLbLxS,aSqHp,e#S,q,dx;H,adp,b;L,x,d;F,d,a,e#S,abdpqx$;H,abdpqx$;L,abdpx;F,pq");
        assertEquals("S,LLa,xHaSLa,xFpFqaSLa,xpFqaSLa,xpqaSLa,xpqaLLaLa,xpqadHLaLa,xpqadFpFqLaLa,xpqadpFqLaLa,xpqadpqLaLa,xpqadpqdHaLa,xpqadpqdFpFqaLa,xpqadpqdpFqaLa,xpqadpqdpqaLa,xpqadpqdpqadHa,xpqadpqdpqadFpFqa,xpqadpqdpqadpFqa,xpqadpqdpqadpqa", ll1cfg1.parse("xpqadpqdpqadpqa"));
    }

    @Test
    public void testLL1CFG1Parse3() {
        LL1CFG ll1cfg1 = new LL1CFG("S,qHHSpH,LLa;H,FpFq,bLp;L,xHaS,dH;F,dLbLxS,aSqHp,e#S,q,dx;H,adp,b;L,x,d;F,d,a,e#S,abdpqx$;H,abdpqx$;L,abdpx;F,pq");
        assertEquals("S,LLa,dHLa,dbLpLa,dbdHpLa,dbdFpFqpLa,dbdpFqpLa,dbdpqpLa,dbdpqpdHa,dbdpqpdFpFqa,dbdpqpdpFqa,dbdpqpdpqa", ll1cfg1.parse("dbdpqpdpqa"));
    }

    @Test
    public void testLL1CFG1Parse4() {
        LL1CFG ll1cfg1 = new LL1CFG("S,qHHSpH,LLa;H,FpFq,bLp;L,xHaS,dH;F,dLbLxS,aSqHp,e#S,q,dx;H,adp,b;L,x,d;F,d,a,e#S,abdpqx$;H,abdpqx$;L,abdpx;F,pq");
        assertEquals("S,qHHSpH,qFpFqHSpH,qaSqHppFqHSpH,ERROR", ll1cfg1.parse("qab"));
    }

    @Test
    public void testLL1CFG1Parse5() {
        LL1CFG ll1cfg1 = new LL1CFG("S,qHHSpH,LLa;H,FpFq,bLp;L,xHaS,dH;F,dLbLxS,aSqHp,e#S,q,dx;H,adp,b;L,x,d;F,d,a,e#S,abdpqx$;H,abdpqx$;L,abdpx;F,pq");
        assertEquals("S,LLa,xHaSLa,xbLpaSLa,ERROR", ll1cfg1.parse("xba"));
    }

    @Test
    public void testLL1CFG2Parse1() {
        LL1CFG ll1cfg2 = new LL1CFG("S,hW,jWWWhS,mKm;W,oWSoWK,hIh;K,SoIoK,sSWoS;I,mKhW,jSWjWh,e#S,h,j,m;W,o,h;K,hjm,s;I,m,j,e#S,hjmos$;W,hjmos$;K,hjmos$;I,ho");
        assertEquals("S,hW,hhIh,hhh", ll1cfg2.parse("hhh"));
    }

    @Test
    public void testLL1CFG2Parse2() {
        LL1CFG ll1cfg2 = new LL1CFG("S,hW,jWWWhS,mKm;W,oWSoWK,hIh;K,SoIoK,sSWoS;I,mKhW,jSWjWh,e#S,h,j,m;W,o,h;K,hjm,s;I,m,j,e#S,hjmos$;W,hjmos$;K,hjmos$;I,ho");
        assertEquals("S,jWWWhS,jhIhWWhS,jhhWWhS,jhhhIhWhS,jhhhhWhS,jhhhhhIhhS,jhhhhhhhS,jhhhhhhhhW,jhhhhhhhhhIh,jhhhhhhhhhh", ll1cfg2.parse("jhhhhhhhhhh"));
    }

    @Test
    public void testLL1CFG2Parse3() {
        LL1CFG ll1cfg2 = new LL1CFG("S,hW,jWWWhS,mKm;W,oWSoWK,hIh;K,SoIoK,sSWoS;I,mKhW,jSWjWh,e#S,h,j,m;W,o,h;K,hjm,s;I,m,j,e#S,hjmos$;W,hjmos$;K,hjmos$;I,ho");
        assertEquals("S,mKm,msSWoSm,mshWWoSm,mshhIhWoSm,mshhhWoSm,mshhhhIhoSm,mshhhhhoSm,mshhhhhohWm,mshhhhhohhIhm,mshhhhhohhhm", ll1cfg2.parse("mshhhhhohhhm"));
    }

    @Test
    public void testLL1CFG2Parse4() {
        LL1CFG ll1cfg2 = new LL1CFG("S,hW,jWWWhS,mKm;W,oWSoWK,hIh;K,SoIoK,sSWoS;I,mKhW,jSWjWh,e#S,h,j,m;W,o,h;K,hjm,s;I,m,j,e#S,hjmos$;W,hjmos$;K,hjmos$;I,ho");
        assertEquals("S,hW,hhIh,hhmKhWh,hhmsSWoShWh,hhmshWWoShWh,hhmshhIhWoShWh,hhmshhhWoShWh,hhmshhhhIhoShWh,hhmshhhhhoShWh,hhmshhhhhohWhWh,hhmshhhhhohhIhhWh,hhmshhhhhohhhhWh,hhmshhhhhohhhhhIhh,hhmshhhhhohhhhhhh", ll1cfg2.parse("hhmshhhhhohhhhhhh"));
    }

    @Test
    public void testLL1CFG2Parse5() {
        LL1CFG ll1cfg2 = new LL1CFG("S,hW,jWWWhS,mKm;W,oWSoWK,hIh;K,SoIoK,sSWoS;I,mKhW,jSWjWh,e#S,h,j,m;W,o,h;K,hjm,s;I,m,j,e#S,hjmos$;W,hjmos$;K,hjmos$;I,ho");
        assertEquals("S,mKm,mSoIoKm,mjWWWhSoIoKm,ERROR", ll1cfg2.parse("mj"));
    }

}