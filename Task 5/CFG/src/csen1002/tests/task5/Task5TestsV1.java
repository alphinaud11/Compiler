package csen1002.tests.task5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task5.CFG;

class Task5TestsV1 {

    @Test
    @Timeout(5)
    public void testReg1() {
        CFG cfg = new CFG("S,Am,Sa,Ma;M,AsA,a,S,Sa;A,sSaA,Mma,Ms,sm");
        assertEquals("S,AmS',MaS';S',aS',e;M,AsAM',aM',AmS'M',AmS'aM';M',aS'M',aS'aM',e;A,sSaAA',aM'maA',aM'sA',smA';A',sAM'maA',mS'M'maA',mS'aM'maA',sAM'sA',mS'M'sA',mS'aM'sA',e",cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg2() {
        CFG cfg = new CFG("S,Qr;Q,Qwr,wr,Rwq,Wrq;W,qwr,Wrq,Wqr,rqw;R,Qw,Qr,Wr,wr");
        assertEquals("S,Qr;Q,wrQ',RwqQ',WrqQ';Q',wrQ',e;W,qwrW',rqwW';W',rqW',qrW',e;R,wrQ'wR',qwrW'rqQ'wR',rqwW'rqQ'wR',wrQ'rR',qwrW'rqQ'rR',rqwW'rqQ'rR',qwrW'rR',rqwW'rR',wrR';R',wqQ'wR',wqQ'rR',e", cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg3() {
        CFG cfg = new CFG("S,TYU,u;T,Tyu,Yu,Uu,uU;Y,Yy,Tu,tu,ut;U,Tu,Yu,uTu,yuT");
        assertEquals("S,TYU,u;T,YuT',UuT',uUT';T',yuT',e;Y,UuT'uY',uUT'uY',tuY',utY';Y',yY',uT'uY',e;U,uUT'uY'uT'uU',tuY'uT'uU',utY'uT'uU',uUT'uU',uUT'uY'uU',tuY'uU',utY'uU',uTuU',yuTU';U',uT'uY'uT'uU',uT'uU',uT'uY'uU',e", cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg4() {
        CFG cfg = new CFG("S,ma,sa,Aa;M,sA,s,SM,AS,As;A,AMa,Mas,s,sA");
        assertEquals("S,ma,sa,Aa;M,sA,s,maM,saM,AaM,AS,As;A,sAasA',sasA',maMasA',saMasA',sA',sAA';A',MaA',aMasA',SasA',sasA',e",cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg5() {
        CFG cfg = new CFG("S,rwq,Qwr;Q,rwW,Wq,RwW,Qr;W,Wrq,qr,rq,Qw;R,Qw,Wq,wrq,qr");
        assertEquals("S,rwq,Qwr;Q,rwWQ',WqQ',RwWQ';Q',rQ',e;W,qrW',rqW',rwWQ'wW',RwWQ'wW';W',rqW',qQ'wW',e;R,rwWQ'wR',qrW'qQ'wR',rqW'qQ'wR',rwWQ'wW'qQ'wR',qrW'qR',rqW'qR',rwWQ'wW'qR',wrqR',qrR';R',wWQ'wW'qQ'wR',wWQ'wR',wWQ'wW'qR',e", cfg.lre());
    }

}