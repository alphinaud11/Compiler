package csen1002.tests.task7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task7.LL1CFG;

@Timeout(5)
public class Task7TestsV1 {

    @Test
    public void testLL1CFG1Parse1() {
        LL1CFG ll1cfg1 = new LL1CFG("S,lHY,zRp;Y,xHp,zHSzSz;R,lRp,xH,yHxRz,e;H,Yy,kSySy#S,l,z;Y,x,z;R,l,x,y,e;H,xz,k#S,yz$;Y,yz$;R,pz;H,lpxz");
        assertEquals("S,zRp,zlRpp,zllRppp,zlllRpppp,zlllpppp", ll1cfg1.parse("zlllpppp"));
    }

    @Test
    public void testLL1CFG1Parse2() {
        LL1CFG ll1cfg1 = new LL1CFG("S,lHY,zRp;Y,xHp,zHSzSz;R,lRp,xH,yHxRz,e;H,Yy,kSySy#S,l,z;Y,x,z;R,l,x,y,e;H,xz,k#S,yz$;Y,yz$;R,pz;H,lpxz");
        assertEquals("S,zRp,zlRpp,zlpp", ll1cfg1.parse("zlpp"));
    }

    @Test
    public void testLL1CFG1Parse3() {
        LL1CFG ll1cfg1 = new LL1CFG("S,lHY,zRp;Y,xHp,zHSzSz;R,lRp,xH,yHxRz,e;H,Yy,kSySy#S,l,z;Y,x,z;R,l,x,y,e;H,xz,k#S,yz$;Y,yz$;R,pz;H,lpxz");
        assertEquals("S,zRp,zp", ll1cfg1.parse("zp"));
    }

    @Test
    public void testLL1CFG1Parse4() {
        LL1CFG ll1cfg1 = new LL1CFG("S,lHY,zRp;Y,xHp,zHSzSz;R,lRp,xH,yHxRz,e;H,Yy,kSySy#S,l,z;Y,x,z;R,l,x,y,e;H,xz,k#S,yz$;Y,yz$;R,pz;H,lpxz");
        assertEquals("S,lHY,lkSySyY,lkzRpySyY,lkzpySyY,lkzpyzRpyY,lkzpyzpyY,ERROR", ll1cfg1.parse("lkzpyzpylz"));
    }

    @Test
    public void testLL1CFG1Parse5() {
        LL1CFG ll1cfg1 = new LL1CFG("S,lHY,zRp;Y,xHp,zHSzSz;R,lRp,xH,yHxRz,e;H,Yy,kSySy#S,l,z;Y,x,z;R,l,x,y,e;H,xz,k#S,yz$;Y,yz$;R,pz;H,lpxz");
        assertEquals("S,lHY,lYyY,lxHpyY,lxkSySypyY,lxkzRpySypyY,lxkzpySypyY,lxkzpyzRpypyY,lxkzpyzpypyY,ERROR", ll1cfg1.parse("lxkzpyzpy"));
    }

    @Test
    public void testLL1CFG2Parse1() {
        LL1CFG ll1cfg2 = new LL1CFG("S,rC,oDPC;D,vPzP,gCwP,e;C,vPPC,SzCz,e;P,wP,zDz#S,r,o;D,v,g,e;C,v,or,e;P,w,z#S,z$;D,wz;C,wz$;P,orvwz$");
        assertEquals("S,oDPC,oPC,owPC,owzDzC,owzgCwPzC,owzgwPzC,owzgwzDzzC,owzgwzzzC,owzgwzzz", ll1cfg2.parse("owzgwzzz"));
    }

    @Test
    public void testLL1CFG2Parse2() {
        LL1CFG ll1cfg2 = new LL1CFG("S,rC,oDPC;D,vPzP,gCwP,e;C,vPPC,SzCz,e;P,wP,zDz#S,r,o;D,v,g,e;C,v,or,e;P,w,z#S,z$;D,wz;C,wz$;P,orvwz$");
        assertEquals("S,oDPC,oPC,ozDzC,ozzC,ozzSzCz,ozzrCzCz,ozzrzCz,ozzrzz", ll1cfg2.parse("ozzrzz"));
    }

    @Test
    public void testLL1CFG2Parse3() {
        LL1CFG ll1cfg2 = new LL1CFG("S,rC,oDPC;D,vPzP,gCwP,e;C,vPPC,SzCz,e;P,wP,zDz#S,r,o;D,v,g,e;C,v,or,e;P,w,z#S,z$;D,wz;C,wz$;P,orvwz$");
        assertEquals("S,oDPC,oPC,owPC,owwPC,owwwPC,owwwzDzC,owwwzzC,owwwzz", ll1cfg2.parse("owwwzz"));
    }

    @Test
    public void testLL1CFG2Parse4() {
        LL1CFG ll1cfg2 = new LL1CFG("S,rC,oDPC;D,vPzP,gCwP,e;C,vPPC,SzCz,e;P,wP,zDz#S,r,o;D,v,g,e;C,v,or,e;P,w,z#S,z$;D,wz;C,wz$;P,orvwz$");
        assertEquals("S,rC,rvPPC,rvwPPC,rvwzDzPC,rvwzzPC,rvwzzzDzC,rvwzzzzC,rvwzzzz", ll1cfg2.parse("rvwzzzz"));
    }

    @Test
    public void testLL1CFG2Parse5() {
        LL1CFG ll1cfg2 = new LL1CFG("S,rC,oDPC;D,vPzP,gCwP,e;C,vPPC,SzCz,e;P,wP,zDz#S,r,o;D,v,g,e;C,v,or,e;P,w,z#S,z$;D,wz;C,wz$;P,orvwz$");
        assertEquals("S,oDPC,oPC,owPC,ERROR", ll1cfg2.parse("owvzv"));
    }

}