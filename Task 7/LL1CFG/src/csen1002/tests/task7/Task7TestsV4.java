package csen1002.tests.task7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task7.LL1CFG;

@Timeout(5)
public class Task7TestsV4 {
    @Test
    public void testLL1CFG1Parse1() {
        LL1CFG ll1cfg1 = new LL1CFG("S,sSdSb,tNtJ,e;N,dNSbC,bJJs;J,CSbSdC,lCtCl;C,tCtCN,NbNClN#S,s,t,e;N,d,b;J,bdt,l;C,t,bd#S,bd$;N,bdlst$;J,bdlst$;C,bdlst$");
        assertEquals("S,sSdSb,sdSb,sdsSdSbb,sdsdSbb,sdsdsSdSbbb,sdsdsdSbbb,sdsdsdbbb", ll1cfg1.parse("sdsdsdbbb"));
    }

    @Test
    public void testLL1CFG1Parse2() {
        LL1CFG ll1cfg1 = new LL1CFG("S,sSdSb,tNtJ,e;N,dNSbC,bJJs;J,CSbSdC,lCtCl;C,tCtCN,NbNClN#S,s,t,e;N,d,b;J,bdt,l;C,t,bd#S,bd$;N,bdlst$;J,bdlst$;C,bdlst$");
        assertEquals("S,sSdSb,ssSdSbdSb,ssdSbdSb,ssdbdSb,ssdbdb", ll1cfg1.parse("ssdbdb"));
    }

    @Test
    public void testLL1CFG1Parse3() {
        LL1CFG ll1cfg1 = new LL1CFG("S,sSdSb,tNtJ,e;N,dNSbC,bJJs;J,CSbSdC,lCtCl;C,tCtCN,NbNClN#S,s,t,e;N,d,b;J,bdt,l;C,t,bd#S,bd$;N,bdlst$;J,bdlst$;C,bdlst$");
        assertEquals("S,sSdSb,stNtJdSb,stbJJstJdSb,ERROR", ll1cfg1.parse("stbs"));
    }

    @Test
    public void testLL1CFG1Parse4() {
        LL1CFG ll1cfg1 = new LL1CFG("S,sSdSb,tNtJ,e;N,dNSbC,bJJs;J,CSbSdC,lCtCl;C,tCtCN,NbNClN#S,s,t,e;N,d,b;J,bdt,l;C,t,bd#S,bd$;N,bdlst$;J,bdlst$;C,bdlst$");
        assertEquals("S,tNtJ,tbJJstJ,tblCtClJstJ,ERROR", ll1cfg1.parse("tbls"));
    }

    @Test
    public void testLL1CFG1Parse5() {
        LL1CFG ll1cfg1 = new LL1CFG("S,sSdSb,tNtJ,e;N,dNSbC,bJJs;J,CSbSdC,lCtCl;C,tCtCN,NbNClN#S,s,t,e;N,d,b;J,bdt,l;C,t,bd#S,bd$;N,bdlst$;J,bdlst$;C,bdlst$");
        assertEquals("S,sSdSb,ssSdSbdSb,ssdSbdSb,ssdbdSb,ERROR", ll1cfg1.parse("ssdb"));
    }

    @Test
    public void testLL1CFG2Parse1() {
        LL1CFG ll1cfg2 = new LL1CFG("S,tSM,fMq,e;M,pSnTfJ,nSq;T,tTMJ,pT;J,nM,tT#S,t,f,e;M,p,n;T,t,p;J,n,t#S,npq$;M,fnpqt$;T,fnpqt$;J,fnpqt$");
        assertEquals("S,tSM,tM,tnSq,tnq", ll1cfg2.parse("tnq"));
    }

    @Test
    public void testLL1CFG2Parse2() {
        LL1CFG ll1cfg2 = new LL1CFG("S,tSM,fMq,e;M,pSnTfJ,nSq;T,tTMJ,pT;J,nM,tT#S,t,f,e;M,p,n;T,t,p;J,n,t#S,npq$;M,fnpqt$;T,fnpqt$;J,fnpqt$");
        assertEquals("S,fMq,fnSqq,fnqq", ll1cfg2.parse("fnqq"));
    }

    @Test
    public void testLL1CFG2Parse3() {
        LL1CFG ll1cfg2 = new LL1CFG("S,tSM,fMq,e;M,pSnTfJ,nSq;T,tTMJ,pT;J,nM,tT#S,t,f,e;M,p,n;T,t,p;J,n,t#S,npq$;M,fnpqt$;T,fnpqt$;J,fnpqt$");
        assertEquals("S,fMq,fnSqq,fntSMqq,fntMqq,fntnSqqq,fntnqqq", ll1cfg2.parse("fntnqqq"));
    }

    @Test
    public void testLL1CFG2Parse4() {
        LL1CFG ll1cfg2 = new LL1CFG("S,tSM,fMq,e;M,pSnTfJ,nSq;T,tTMJ,pT;J,nM,tT#S,t,f,e;M,p,n;T,t,p;J,n,t#S,npq$;M,fnpqt$;T,fnpqt$;J,fnpqt$");
        assertEquals("S,tSM,tM,tnSq,tnfMqq,tnfnSqqq,tnfnqqq", ll1cfg2.parse("tnfnqqq"));
    }

    @Test
    public void testLL1CFG2Parse5() {
        LL1CFG ll1cfg2 = new LL1CFG("S,tSM,fMq,e;M,pSnTfJ,nSq;T,tTMJ,pT;J,nM,tT#S,t,f,e;M,p,n;T,t,p;J,n,t#S,npq$;M,fnpqt$;T,fnpqt$;J,fnpqt$");
        assertEquals("S,fMq,fpSnTfJq,fptSMnTfJq,fptMnTfJq,ERROR", ll1cfg2.parse("fpt"));
    }

}