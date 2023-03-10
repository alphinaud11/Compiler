package csen1002.tests.task7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task7.LL1CFG;

@Timeout(5)
public class Task7TestsV5 {
    @Test
    public void testLL1CFG1Parse1() {
        LL1CFG ll1cfg1 = new LL1CFG("S,Dc,cSK;K,wKcS,cScDD,hHs;H,nKcHw,hSnSc,e;D,sSK,nKcHs#S,ns,c;K,w,c,h;H,n,h,e;D,s,n#S,chnsw$;K,chnsw$;H,sw;D,chnsw$");
        assertEquals("S,Dc,nKcHsc,nhHscHsc,nhscHsc,nhscsc", ll1cfg1.parse("nhscsc"));
    }

    @Test
    public void testLL1CFG1Parse2() {
        LL1CFG ll1cfg1 = new LL1CFG("S,Dc,cSK;K,wKcS,cScDD,hHs;H,nKcHw,hSnSc,e;D,sSK,nKcHs#S,ns,c;K,w,c,h;H,n,h,e;D,s,n#S,chnsw$;K,chnsw$;H,sw;D,chnsw$");
        assertEquals("S,cSK,cDcK,cnKcHscK,cnhHscHscK,cnhscHscK,cnhscscK,cnhscschHs,cnhscschs", ll1cfg1.parse("cnhscschs"));
    }

    @Test
    public void testLL1CFG1Parse3() {
        LL1CFG ll1cfg1 = new LL1CFG("S,Dc,cSK;K,wKcS,cScDD,hHs;H,nKcHw,hSnSc,e;D,sSK,nKcHs#S,ns,c;K,w,c,h;H,n,h,e;D,s,n#S,chnsw$;K,chnsw$;H,sw;D,chnsw$");
        assertEquals("S,Dc,sSKc,sDcKc,snKcHscKc,snhHscHscKc,snhscHscKc,snhscscKc,snhscschHsc,snhscschsc", ll1cfg1.parse("snhscschsc"));
    }

    @Test
    public void testLL1CFG1Parse4() {
        LL1CFG ll1cfg1 = new LL1CFG("S,Dc,cSK;K,wKcS,cScDD,hHs;H,nKcHw,hSnSc,e;D,sSK,nKcHs#S,ns,c;K,w,c,h;H,n,h,e;D,s,n#S,chnsw$;K,chnsw$;H,sw;D,chnsw$");
        assertEquals("S,Dc,nKcHsc,nhHscHsc,nhnKcHwscHsc,nhnhHscHwscHsc,nhnhscHwscHsc,nhnhscwscHsc,nhnhscwscsc", ll1cfg1.parse("nhnhscwscsc"));
    }

    @Test
    public void testLL1CFG1Parse5() {
        LL1CFG ll1cfg1 = new LL1CFG("S,Dc,cSK;K,wKcS,cScDD,hHs;H,nKcHw,hSnSc,e;D,sSK,nKcHs#S,ns,c;K,w,c,h;H,n,h,e;D,s,n#S,chnsw$;K,chnsw$;H,sw;D,chnsw$");
        assertEquals("S,Dc,nKcHsc,nhHscHsc,nhscHsc,ERROR", ll1cfg1.parse("nhsw"));
    }

    @Test
    public void testLL1CFG2Parse1() {
        LL1CFG ll1cfg2 = new LL1CFG("S,yKb,IK;K,aKK,zXz;I,bXoI,Yz;X,aS,bI,e;Y,aKKz,zSo#S,y,abz;K,a,z;I,b,az;X,a,b,e;Y,a,z#S,oz$;K,aboz$;I,aoz;X,oz;Y,z");
        assertEquals("S,yKb,yaKKb,yazXzKb,yazzKb,yazzzXzb,yazzzzb", ll1cfg2.parse("yazzzzb"));
    }

    @Test
    public void testLL1CFG2Parse2() {
        LL1CFG ll1cfg2 = new LL1CFG("S,yKb,IK;K,aKK,zXz;I,bXoI,Yz;X,aS,bI,e;Y,aKKz,zSo#S,y,abz;K,a,z;I,b,az;X,a,b,e;Y,a,z#S,oz$;K,aboz$;I,aoz;X,oz;Y,z");
        assertEquals("S,IK,YzK,zSozK,zyKbozK,zyzXzbozK,zyzzbozK,zyzzbozzXz,zyzzbozzz", ll1cfg2.parse("zyzzbozzz"));
    }

    @Test
    public void testLL1CFG2Parse3() {
        LL1CFG ll1cfg2 = new LL1CFG("S,yKb,IK;K,aKK,zXz;I,bXoI,Yz;X,aS,bI,e;Y,aKKz,zSo#S,y,abz;K,a,z;I,b,az;X,a,b,e;Y,a,z#S,oz$;K,aboz$;I,aoz;X,oz;Y,z");
        assertEquals("S,yKb,yzXzb,yzaSzb,yzayKbzb,yzayzXzbzb,yzayzzbzb", ll1cfg2.parse("yzayzzbzb"));
    }

    @Test
    public void testLL1CFG2Parse4() {
        LL1CFG ll1cfg2 = new LL1CFG("S,yKb,IK;K,aKK,zXz;I,bXoI,Yz;X,aS,bI,e;Y,aKKz,zSo#S,y,abz;K,a,z;I,b,az;X,a,b,e;Y,a,z#S,oz$;K,aboz$;I,aoz;X,oz;Y,z");
        assertEquals("S,IK,YzK,aKKzzK,azXzKzzK,azzKzzK,azzzXzzzK,azzzzzzK,azzzzzzzXz,azzzzzzzz", ll1cfg2.parse("azzzzzzzz"));
    }

    @Test
    public void testLL1CFG2Parse5() {
        LL1CFG ll1cfg2 = new LL1CFG("S,yKb,IK;K,aKK,zXz;I,bXoI,Yz;X,aS,bI,e;Y,aKKz,zSo#S,y,abz;K,a,z;I,b,az;X,a,b,e;Y,a,z#S,oz$;K,aboz$;I,aoz;X,oz;Y,z");
        assertEquals("S,IK,bXoIK,boIK,ERROR", ll1cfg2.parse("bo"));
    }

}