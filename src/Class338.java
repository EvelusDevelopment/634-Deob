/* Class338 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class338
{
    byte aByte4181;
    short aShort4182;
    short[] aShortArray4183;
    int[] anIntArray4184 = new int[4];
    short aShort4185;
    static int anInt4186;
    int[] anIntArray4187;
    short[] aShortArray4188;
    static int anInt4189;
    short aShort4190;
    int[] anIntArray4191 = new int[4];
    byte aByte4192;
    short aShort4193;
    short[] aShortArray4194;
    static int anInt4195;
    static int[] anIntArray4196 = new int[5];
    static Class237_Sub1 aClass237_Sub1_4197;
    
    static final Class348_Sub41 method2661(int i, int i_0_, int i_1_,
					   boolean bool, int i_2_) {
	if (i_2_ != 2)
	    method2661(31, -43, 32, true, -110);
	anInt4189++;
	Class348_Sub41 class348_sub41 = new Class348_Sub41();
	((Class348_Sub41) class348_sub41).anInt7050 = i;
	((Class348_Sub41) class348_sub41).anInt7053 = i_1_;
	Class125.aClass356_4915.putNode((long) i_0_,
					   class348_sub41);
	Class348_Sub7.method2772(i, (byte) 110);
	Widget class46 = AbstractFontRasterizer.getWidget(i_0_);
	if (class46 != null)
	    Class251.method1916(-9343, class46);
	if (BufferedRasterizer.aClass46_4730 != null) {
	    Class251.method1916(-9343, BufferedRasterizer.aClass46_4730);
	    BufferedRasterizer.aClass46_4730 = null;
	}
	Class348_Sub42_Sub17.method3270((byte) 120);
	if (class46 != null)
	    Class251.method1913(!bool, i_2_ + -104, class46);
	if (!bool)
	    ScriptExecutor.method703(i);
	if (!bool && (r.anInt9721 ^ 0xffffffff) != 0)
	    Class239_Sub12.method1775((byte) -8, r.anInt9721, 1);
	return class348_sub41;
    }
    
    public static void method2662(int i) {
	aClass237_Sub1_4197 = null;
	anIntArray4196 = null;
	if (i != 4)
	    method2663(91, -57, -85, 14, 6);
    }
    
    static final void method2663(int i, int widthOffset, int i_4_, int i_5_,
				 int i_6_) {
	anInt4195++;
	if ((ByteBuffer.anInt7207 ^ 0xffffffff) == -2) {
	    int i_7_ = widthOffset / Class58.anInt1067;
	    int i_8_ = i_4_ / Class58.anInt1067;
	    int i_9_ = i_5_ / AbstractBuffer.anInt4267;
	    int i_10_ = i_6_ / AbstractBuffer.anInt4267;
	    if (i_7_ < Class31.anInt425 && (i_8_ ^ 0xffffffff) <= -1
		&& Class250.anInt3225 > i_9_ && (i_10_ ^ 0xffffffff) <= -1
		&& i == -5590) {
		if (i_8_ >= Class31.anInt425)
		    i_8_ = -1 + Class31.anInt425;
		if (i_9_ < 0)
		    i_9_ = 0;
		if ((Class250.anInt3225 ^ 0xffffffff) >= (i_10_ ^ 0xffffffff))
		    i_10_ = Class250.anInt3225 + -1;
		if ((i_7_ ^ 0xffffffff) > -1)
		    i_7_ = 0;
		for (int i_11_ = i_9_;
		     (i_10_ ^ 0xffffffff) <= (i_11_ ^ 0xffffffff); i_11_++) {
		    int i_12_
			= (Class350.method3452(i_11_ + Class286.anInt3682,
					       (byte) -15, Class250.anInt3225)
			   * Class31.anInt425);
		    for (int i_13_ = i_7_; i_8_ >= i_13_; i_13_++) {
			int i_14_
			    = (i_12_
			       + Class350.method3452((Class239_Sub24.anInt6095
						      + i_13_),
						     (byte) -15,
						     Class31.anInt425));
			Class132.anIntArray1909[i_14_]
			    = Class318_Sub1_Sub1_Sub2.anInt9997;
		    }
		}
	    }
	}
    }
    
    Class338(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_,
	     int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_,
	     int i_26_, int i_27_) {
	((Class338) this).aByte4192 = (byte) i;
	((Class338) this).aByte4181 = (byte) i_15_;
	((Class338) this).anIntArray4187 = new int[4];
	((Class338) this).anIntArray4187[0] = i_16_;
	((Class338) this).anIntArray4187[1] = i_17_;
	((Class338) this).anIntArray4187[3] = i_19_;
	((Class338) this).anIntArray4187[2] = i_18_;
	((Class338) this).anIntArray4191[0] = i_20_;
	((Class338) this).anIntArray4191[2] = i_22_;
	((Class338) this).anIntArray4191[3] = i_23_;
	((Class338) this).anIntArray4191[1] = i_21_;
	((Class338) this).anIntArray4184[1] = i_25_;
	((Class338) this).aShort4185 = (short) (i_16_ >> Class362.anInt4459);
	((Class338) this).anIntArray4184[3] = i_27_;
	((Class338) this).anIntArray4184[0] = i_24_;
	((Class338) this).anIntArray4184[2] = i_26_;
	((Class338) this).aShort4182 = (short) (i_18_ >> Class362.anInt4459);
	((Class338) this).aShort4193 = (short) (i_24_ >> Class362.anInt4459);
	((Class338) this).aShort4190 = (short) (i_26_ >> Class362.anInt4459);
	((Class338) this).aShortArray4188 = new short[4];
	((Class338) this).aShortArray4183 = new short[4];
	((Class338) this).aShortArray4194 = new short[4];
    }
}
