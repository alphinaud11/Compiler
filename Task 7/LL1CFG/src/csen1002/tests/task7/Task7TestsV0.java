package csen1002.tests.task7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task7.LL1CFG;

@Timeout(5)
public class Task7TestsV0 {

    @Test
    public void testLL1CFG1Parse1() {
        LL1CFG ll1cfg1 = new LL1CFG("S,zToS,n,e;T,zTo,No;N,n,e#S,z,n,e;T,z,no;N,n,e#S,$;T,o;N,o");
        assertEquals("S,zToS,zzTooS,zzzToooS,zzzNooooS,zzznooooS,zzznoooon", ll1cfg1.parse("zzznoooon"));
    }

    @Test
    public void testLL1CFG1Parse2() {
        LL1CFG ll1cfg1 = new LL1CFG("S,zToS,n,e;T,zTo,No;N,n,e#S,z,n,e;T,z,no;N,n,e#S,$;T,o;N,o");
        assertEquals("S,zToS,zzTooS,zzNoooS,zzoooS,zzooo", ll1cfg1.parse("zzooo"));
    }

    @Test
    public void testLL1CFG1Parse3() {
        LL1CFG ll1cfg1 = new LL1CFG("S,zToS,n,e;T,zTo,No;N,n,e#S,z,n,e;T,z,no;N,n,e#S,$;T,o;N,o");
        assertEquals("S,zToS,zNooS,zooS,zoozToS,zoozzTooS,zoozzNoooS,zoozznoooS,zoozznooo", ll1cfg1.parse("zoozznooo"));
    }

    @Test
    public void testLL1CFG1Parse4() {
        LL1CFG ll1cfg1 = new LL1CFG("S,zToS,n,e;T,zTo,No;N,n,e#S,z,n,e;T,z,no;N,n,e#S,$;T,o;N,o");
        assertEquals("S,zToS,zNooS,zooS,zoozToS,zoozNooS,zooznooS,zooznoon", ll1cfg1.parse("zooznoon"));
    }

    @Test
    public void testLL1CFG1Parse5() {
        LL1CFG ll1cfg1 = new LL1CFG("S,zToS,n,e;T,zTo,No;N,n,e#S,z,n,e;T,z,no;N,n,e#S,$;T,o;N,o");
        assertEquals("S,zToS,zzTooS,zzzToooS,ERROR", ll1cfg1.parse("zzz"));
    }

    @Test
    public void testLL1CFG2Parse1() {
        LL1CFG ll1cfg2 = new LL1CFG("S,ipD,oSmDc,e;D,VmS,LxS;V,n,e;L,oSc,e#S,i,o,e;D,mn,ox;V,n,e;L,o,e#S,cm$;D,cm$;V,m;L,x");
        assertEquals("S,oSmDc,omDc,omLxSc,omoScxSc,omocxSc,omocxipDc,omocxipVmSc,omocxipmSc,omocxipmc", ll1cfg2.parse("omocxipmc"));
    }

    @Test
    public void testLL1CFG2Parse2() {
        LL1CFG ll1cfg2 = new LL1CFG("S,ipD,oSmDc,e;D,VmS,LxS;V,n,e;L,oSc,e#S,i,o,e;D,mn,ox;V,n,e;L,o,e#S,cm$;D,cm$;V,m;L,x");
        assertEquals("S,oSmDc,omDc,omLxSc,omoScxSc,omocxSc,omocxc", ll1cfg2.parse("omocxc"));
    }

    @Test
    public void testLL1CFG2Parse3() {
        LL1CFG ll1cfg2 = new LL1CFG("S,ipD,oSmDc,e;D,VmS,LxS;V,n,e;L,oSc,e#S,i,o,e;D,mn,ox;V,n,e;L,o,e#S,cm$;D,cm$;V,m;L,x");
        assertEquals("S,oSmDc,omDc,omVmSc,ommSc,ommc", ll1cfg2.parse("ommc"));
    }

    @Test
    public void testLL1CFG2Parse4() {
        LL1CFG ll1cfg2 = new LL1CFG("S,ipD,oSmDc,e;D,VmS,LxS;V,n,e;L,oSc,e#S,i,o,e;D,mn,ox;V,n,e;L,o,e#S,cm$;D,cm$;V,m;L,x");
        assertEquals("S,ipD,ipLxS,ipxS,ipxoSmDc,ipxomDc,ipxomLxSc,ipxomxSc,ipxomxc", ll1cfg2.parse("ipxomxc"));
    }

    @Test
    public void testLL1CFG2Parse5() {
        LL1CFG ll1cfg2 = new LL1CFG("S,ipD,oSmDc,e;D,VmS,LxS;V,n,e;L,oSc,e#S,i,o,e;D,mn,ox;V,n,e;L,o,e#S,cm$;D,cm$;V,m;L,x");
        assertEquals("S,oSmDc,ooSmDcmDc,oomDcmDc,ERROR", ll1cfg2.parse("oo"));
    }

}