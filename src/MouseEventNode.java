/* MouseEventNode - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class MouseEventNode extends Node
{
    static int anInt7102 = 1400;
    static Class304 aClass304_7103 = new Class304(3);
    static int anInt7104;
    static IncomingPacket aClass114_7105 = new IncomingPacket(101, 20);
    static IncomingPacket aClass114_7106 = new IncomingPacket(36, -2);
    static RasterToolkit[] aClass105Array7107;
    static Class361[] aClass361Array7108 = new Class361[4];
    
    abstract int method3308(byte i);
    
    static final void method3309(int i) {
	Class354.anIntArrayArrayArray4356
	    = (new int[Class189.anInt2524][1 + Class318_Sub7.anInt6451]
	       [1 + Class348_Sub41.anInt7054]);
	anInt7104++;
	Class348_Sub44.anInt7101 = 0;
	Class11.anInt194 = Class270.anInt3465;
	Class318_Sub1_Sub3_Sub4.aClass338Array10330 = new Class338[2000];
	DirectxToolkit.anInt7714 = Class270.anInt3465;
	Class50_Sub1.aBoolean5226 = false;
	Message.aClass338Array2034 = new Class338[500];
	ElementLoaderNode.anInt1200 = 0;
	Class239_Sub26.anInt6115 = 0;
	ClassicLoadingScreen.aClass338Array5060 = new Class338[1000];
	if (i > -113)
	    aClass304_7103 = null;
	Class348_Sub42_Sub10.anInt9577 = 0;
	ClientScript.aClass338Array9700 = new Class338[500];
	if (Class9.aHa171 instanceof SafeToolkit)
	    Class348_Sub40_Sub23.aBoolean9307 = false;
	else
	    Class348_Sub40_Sub23.aBoolean9307 = true;
    }
    
    public MouseEventNode() {
	/* empty */
    }
    
    abstract int getType(int i);
    
    abstract int method3311(int i);
    
    abstract long method3312(byte i);
    
    static final void method3313(int i, s var_s) {
	aa_Sub1.aSArray5191[i] = var_s;
    }
    
    public static void method3314(int i) {
	aClass114_7106 = null;
	if (i != 5)
	    method3313(-103, null);
	aClass114_7105 = null;
	aClass361Array7108 = null;
	aClass105Array7107 = null;
	aClass304_7103 = null;
    }
    
    abstract int getClickCount(int i);
}
