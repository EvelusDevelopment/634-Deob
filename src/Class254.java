/* Class254 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class254
{
    int anInt3256;
    static int anInt3257;
    String aString3258;
    private char aChar3259;
    static int anInt3260;
    boolean aBoolean3261 = true;
    static int anInt3262;
    static int anInt3263;
    static IncomingPacket aClass114_3264 = new IncomingPacket(6, 2);
    
    final void method1924(ByteBuffer class348_sub49, byte i) {
	int i_0_ = -47 % ((i - -74) / 49);
	for (;;) {
	    int i_1_ = class348_sub49.getUByte();
	    if (i_1_ == 0)
		break;
	    method1927(true, class348_sub49, i_1_);
	}
	anInt3263++;
    }
    
    final boolean method1925(boolean bool) {
	anInt3262++;
	if (bool != false)
	    return true;
	if ((aChar3259 ^ 0xffffffff) != -116)
	    return false;
	return true;
    }
    
    public static void method1926(int i) {
	if (i >= -125)
	    aClass114_3264 = null;
	aClass114_3264 = null;
    }
    
    private final void method1927(boolean bool, ByteBuffer class348_sub49,
				  int i) {
	anInt3257++;
	if ((i ^ 0xffffffff) != -2) {
	    if (i == 2)
		((Class254) this).anInt3256 = class348_sub49.getDWord();
	    else if (i == 4)
		((Class254) this).aBoolean3261 = false;
	    else if (i == 5)
		((Class254) this).aString3258
		    = class348_sub49.getJStr();
	} else
	    aChar3259 = Class50_Sub1.method462(class348_sub49.getByte(), -128);
	if (bool != true)
	    ((Class254) this).aBoolean3261 = true;
    }
    
    static final int method1928(int i, int i_2_, int i_3_) {
	anInt3260++;
	int i_4_ = i_3_ >>> 1872132287;
	if (i_2_ > 0)
	    method1928(82, -44, -111);
	return (i_3_ - -i_4_) / i + -i_4_;
    }
    
    public Class254() {
	/* empty */
    }
}
