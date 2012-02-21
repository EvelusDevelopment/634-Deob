/* Class348_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub1_Sub2 extends Class348_Sub1
{
    static Deque aClass262_8810 = new Deque();
    static int anInt8811;
    static int anInt8812;
    static int anInt8813;
    static int anInt8814;
    static Class308 aClass308_8815 = new Class308(16);
    static byte[][] aByteArrayArray8816;
    static IncomingPacket aClass114_8817 = new IncomingPacket(83, 2);
    
    final void method2725(int i, byte i_0_, int i_1_, int i_2_) {
	((Class348_Sub1) this).anInt6553 = i_1_;
	((Class348_Sub1) this).anInt6548 = i_2_;
	anInt8812++;
	if (i_0_ == 70)
	    ((Class348_Sub1) this).anInt6562 = i;
    }
    
    static final int method2729(int i, int i_3_) {
	anInt8813++;
	if (i_3_ != 16)
	    return 23;
	return 0xff & i;
    }
    
    static final byte[] getWhirlpoolDigest(byte[] is, int off, int len) {
	anInt8811++;
	byte[] src;
	if (off > 0) {
	    src = new byte[len];
	    for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (len ^ 0xffffffff);
		 i_7_++)
		src[i_7_] = is[off + i_7_];
	} else
	    src = is;
	Whirlpool class85 = new Whirlpool();
	class85.initialize();
	class85.add((long) (len * 8), src, -69);
	byte[] is_8_ = new byte[64];
	class85.finalizeDigest(true, 0, is_8_);
	return is_8_;
    }
    
    Class348_Sub1_Sub2(int i, int i_9_, int i_10_, int i_11_, int i_12_,
		       float f) {
	super(i, i_9_, i_10_, i_11_, i_12_, f);
    }
    
    public static void method2731(byte i) {
	aByteArrayArray8816 = null;
	if (i != -23)
	    getWhirlpoolDigest(null, 86, -106);
	aClass262_8810 = null;
	aClass308_8815 = null;
	aClass114_8817 = null;
    }
    
    final void method2716(int i, float f) {
	((Class348_Sub1) this).aFloat6550 = f;
	if (i == -1)
	    anInt8814++;
    }
}
