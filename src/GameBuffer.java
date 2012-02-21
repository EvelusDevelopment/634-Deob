/* GameBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GameBuffer extends ByteBuffer
{
    static int anInt9752;
    static int anInt9753;
    private int anInt9754;
    static int anInt9755;
    private ISAAC encryption;
    static int[] anIntArray9757;
    static int anInt9758;
    static int anInt9759;
    static int anInt9760;
    static int anInt9761;
    static int anInt9762;
    static int anInt9763;
    static int anInt9764;
    static int anInt9765;
    static int anInt9766;
    static int anInt9767;
    static short[] aShortArray9768 = { 11, 17, 45, 23, 48, 8, 57, 58 };
    static int anInt9769;
    
    final boolean isLargePacket(int i) {
	anInt9758++;
	if (i != -1510)
	    return true;
	int i_0_ = (((((ByteBuffer) this).payload
		      [((ByteBuffer) this).position])
		     - encryption.method778((byte) 19))
		    & 0xff);
	if ((i_0_ ^ 0xffffffff) > -129)
	    return false;
	return true;
    }
    
    static final int method3405(int i, boolean bool) {
	anInt9765++;
	if (Class348_Sub1.anIntArray6547 == null)
	    return 0;
	if (!bool && Class199.aClass352Array2636 != null)
	    return Class348_Sub1.anIntArray6547.length * 2;
	int i_1_ = 0;
	if (i != 2012104999)
	    method3405(118, false);
	for (int i_2_ = 0; Class348_Sub1.anIntArray6547.length > i_2_;
	     i_2_++) {
	    int i_3_ = Class348_Sub1.anIntArray6547[i_2_];
	    if (Class39.spriteIndexLoader.getArchiveLoaded(false, i_3_))
		i_1_++;
	    if (s.fontIndexLoader.getArchiveLoaded(false, i_3_))
		i_1_++;
	}
	return i_1_;
    }
    
    final void setEncryption(int i, int[] is) {
	anInt9755++;
	encryption = new ISAAC(is);
	if (i > -41)
	    anIntArray9757 = null;
    }
    
    final int decipherPacket(int i) {
	anInt9752++;
	int i_4_ = (((((ByteBuffer) this).payload
		      [((ByteBuffer) this).position++])
		     - encryption.method781((byte) -67))
		    & 0xff);
	if (i_4_ < 128)
	    return i_4_;
	if (i != 15295)
	    anIntArray9757 = null;
	return ((((((ByteBuffer) this).payload[((ByteBuffer) this).position++]) - encryption.method781((byte) -62)) & 0xff) + (i_4_ - 128 << 8));
    }
    
    final void encipherPacket(int i, int i_5_) {
	((ByteBuffer) this).payload
	    [((ByteBuffer) this).position++]
	    = (byte) (i + encryption.method781((byte) -85));
	if (i_5_ == 18676)
	    anInt9760++;
    }
    
    final void encipherArray(byte[] dest, int off, int len) {
	    for (int i = 0; len > i ; i++)
		dest[off + i] = (byte) ((((ByteBuffer) this).payload[((ByteBuffer) this).position++]) - encryption.method781((byte) -99));
	    anInt9762++;
	
    }
    
    final int method3410(byte i, int i_9_) {
	if (i != -24)
	    return -126;
	anInt9763++;
	int i_10_ = anInt9754 >> -1710832093;
	int i_11_ = 8 + -(anInt9754 & 0x7);
	anInt9754 += i_9_;
	int i_12_ = 0;
	for (/**/; i_11_ < i_9_; i_11_ = 8) {
	    i_12_ += (((ByteBuffer) this).payload[i_10_++]
		      & Class348_Sub34.anIntArray6972[i_11_]) << i_9_ - i_11_;
	    i_9_ -= i_11_;
	}
	if (i_11_ != i_9_)
	    i_12_ += (((ByteBuffer) this).payload[i_10_]
		      >> i_11_ - i_9_) & Class348_Sub34.anIntArray6972[i_9_];
	else
	    i_12_ += (Class348_Sub34.anIntArray6972[i_11_]
		      & ((ByteBuffer) this).payload[i_10_]);
	return i_12_;
    }
    
    static final void method3411(int i, int i_13_, int i_14_) {
	anInt9761++;
	WidgetVariable class348_sub42_sub15
	    = Class318_Sub9_Sub1.method2516(i, (byte) 105, i_13_);
	class348_sub42_sub15.method3246(-25490);
	((WidgetVariable) class348_sub42_sub15).intArg = i_14_;
    }
    
    final void finalizeBitAccess(boolean bool) {
	anInt9753++;
	((ByteBuffer) this).position = (7 + anInt9754) / 8;
	if (bool != false)
	    aShortArray9768 = null;
    }
    
    static final int[][] method3413(int i, int i_15_, int i_16_, int i_17_,
				    int i_18_, boolean bool, int i_19_,
				    float f, boolean bool_20_) {
	anInt9764++;
	int[][] is = new int[i_18_][i_16_];
	Class348_Sub40_Sub8 class348_sub40_sub8 = new Class348_Sub40_Sub8();
	((Class348_Sub40_Sub8) class348_sub40_sub8).anInt9149
	    = (int) (f * 4096.0F);
	((Class348_Sub40_Sub8) class348_sub40_sub8).anInt9150 = i_15_;
	((Class348_Sub40_Sub8) class348_sub40_sub8).anInt9158 = i_17_;
	((Class348_Sub40_Sub8) class348_sub40_sub8).anInt9164 = i;
	((Class348_Sub40_Sub8) class348_sub40_sub8).aBoolean9160 = bool_20_;
	class348_sub40_sub8.method3044(109);
	NpcDefinition.method797(i_18_, i_16_, (byte) 120);
	if (bool != true)
	    anIntArray9757 = null;
	for (int i_21_ = 0; i_21_ < i_18_; i_21_++)
	    class348_sub40_sub8.method3069(i_21_, is[i_21_], (byte) 99);
	return is;
    }
    
    public static void method3414(int i) {
	aShortArray9768 = null;
	if (i == 21515)
	    anIntArray9757 = null;
    }
    
    final int method3415(int i, int i_22_) {
	if (i >= -58)
	    method3405(50, true);
	anInt9769++;
	return i_22_ * 8 - anInt9754;
    }
    
    final void setEncryption(int i, ISAAC class77) {
	encryption = class77;
	anInt9766++;
    }
    
    GameBuffer(int i) {
	super(i);
    }
    
    final void method3417(int i) {
	int i_24_ = -126 / ((-15 - i) / 49);
	anInt9767++;
	anInt9754 = 8 * ((ByteBuffer) this).position;
    }
}
