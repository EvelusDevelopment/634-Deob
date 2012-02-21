/* BitmapTable - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class BitmapTable
{
    static int anInt3958;
    static Class348_Sub51 aClass348_Sub51_3959;
    static int anInt3960;
    private int[] values;
    static int anInt3962;
    static Class348_Sub42_Sub12 aClass348_Sub42_Sub12_3963;
    static int anInt3964;
    static int anInt3965;
    static int anInt3966;
    
    static final void method2363(int i) {
	if (i <= -39) {
	    anInt3958++;
	    if (Class275.method2066((byte) 106)) {
		if (Class286_Sub1.consoleMessages == null)
		    Class14_Sub3.method249(2);
		Class168.consoleAlpha = 0;
		OutgoingPacket.consoleActive = true;
	    }
	}
    }
    
    static final void method2364(int i, int i_0_, int i_1_, int i_2_, int i_3_,
				 int i_4_, int i_5_, int i_6_, int i_7_,
				 int i_8_) {
	if (i_7_ == 3) {
	    if ((i_1_ ^ 0xffffffff) != (i_3_ ^ 0xffffffff) || i_2_ != i_6_
		|| i_5_ != i_0_
		|| (i_4_ ^ 0xffffffff) != (i_8_ ^ 0xffffffff)) {
		int i_9_ = i_1_;
		int i_10_ = i_6_;
		int i_11_ = i_1_ * 3;
		int i_12_ = 3 * i_6_;
		int i_13_ = i_3_ * 3;
		int i_14_ = 3 * i_2_;
		int i_15_ = 3 * i_0_;
		int i_16_ = i_4_ * 3;
		int i_17_ = -i_1_ + (i_13_ + i_5_) + -i_15_;
		int i_18_ = -i_6_ + (i_8_ + (-i_16_ - -i_14_));
		int i_19_ = -i_13_ + -i_13_ + (i_15_ + i_11_);
		int i_20_ = i_12_ + -i_14_ + (i_16_ - i_14_);
		int i_21_ = -i_11_ + i_13_;
		int i_22_ = -i_12_ + i_14_;
		for (int i_23_ = 128; (i_23_ ^ 0xffffffff) >= -4097;
		     i_23_ += 128) {
		    int i_24_ = i_23_ * i_23_ >> -1915365876;
		    int i_25_ = i_24_ * i_23_ >> -1959497172;
		    int i_26_ = i_17_ * i_25_;
		    int i_27_ = i_18_ * i_25_;
		    int i_28_ = i_19_ * i_24_;
		    int i_29_ = i_24_ * i_20_;
		    int i_30_ = i_23_ * i_21_;
		    int i_31_ = i_22_ * i_23_;
		    int i_32_
			= i_1_ - -(i_26_ - (-i_28_ + -i_30_) >> -1959399924);
		    int i_33_
			= i_6_ - -(i_29_ + (i_27_ - -i_31_) >> -1929822580);
		    Class339.method2665(i_9_, (byte) 109, i, i_10_, i_33_,
					i_32_);
		    i_9_ = i_32_;
		    i_10_ = i_33_;
		}
	    } else
		Class339.method2665(i_1_, (byte) 73, i, i_6_, i_8_, i_5_);
	    anInt3964++;
	}
    }
    
    BitmapTable(int[] arry) {
	int i;
	for (i = 1; arry.length + (arry.length >> 1) >= i; i <<= 1) {
	    /* empty */
	}
	values = new int[i + i];
	for (int i_34_ = 0; (i + i ^ 0xffffffff) < (i_34_ ^ 0xffffffff); i_34_++)
	    values[i_34_] = -1;
	for (int off = 0; (off ^ 0xffffffff) > (arry.length ^ 0xffffffff); off++) {
	    int i_36_;
	    for (i_36_ = arry[off] & -1 + i; values[i_36_ + i_36_ + 1] != -1;
		 i_36_ = -1 + i & 1 + i_36_) {
		/* empty */
	    }
	    values[i_36_ + i_36_] = arry[off];
	    values[i_36_ + i_36_ + 1] = off;
	}
    }
    
    final int getOffset(int value) {
	anInt3960++;
	int len = (values.length >> 1) - 1;
	int i_39_ = len & value;
	for (;;) {
	    int off = values[i_39_ + i_39_ + 1];
	    if (off == -1)
		return -1;
	    if (value == values[i_39_ + i_39_])
		return off;
	    i_39_ = len & 1 + i_39_;
	}
    }
    
    public static void method2366(boolean bool) {
	aClass348_Sub42_Sub12_3963 = null;
	aClass348_Sub51_3959 = null;
	if (bool != true)
	    method2368(46);
    }
    
    static final String method2367(byte i,
				   Class348_Sub42_Sub12 class348_sub42_sub12) {
	anInt3962++;
	int i_41_ = 9 / ((79 - i) / 46);
	if (((Class348_Sub42_Sub12) class348_sub42_sub12).aString9595 == null
	    || ((Class348_Sub42_Sub12) class348_sub42_sub12).aString9595
		   .length() == 0) {
	    if ((((Class348_Sub42_Sub12) class348_sub42_sub12).aString9601
		 == null)
		|| ((Class348_Sub42_Sub12) class348_sub42_sub12)
		       .aString9601.length() <= 0)
		return (((Class348_Sub42_Sub12) class348_sub42_sub12)
			.aString9593);
	    return (((Class348_Sub42_Sub12) class348_sub42_sub12).aString9593
		    + GameText.aClass274_3515
			  .getLanguageText(Class348_Sub33.gameLanguage)
		    + (((Class348_Sub42_Sub12) class348_sub42_sub12)
		       .aString9601));
	}
	if (((Class348_Sub42_Sub12) class348_sub42_sub12).aString9601 == null
	    || ((Class348_Sub42_Sub12) class348_sub42_sub12).aString9601
		   .length() <= 0)
	    return (((Class348_Sub42_Sub12) class348_sub42_sub12).aString9593
		    + GameText.aClass274_3515
			  .getLanguageText(Class348_Sub33.gameLanguage)
		    + (((Class348_Sub42_Sub12) class348_sub42_sub12)
		       .aString9595));
	return (((Class348_Sub42_Sub12) class348_sub42_sub12).aString9593
		+ GameText.aClass274_3515.getLanguageText(Class348_Sub33.gameLanguage)
		+ ((Class348_Sub42_Sub12) class348_sub42_sub12).aString9601
		+ GameText.aClass274_3515.getLanguageText(Class348_Sub33.gameLanguage)
		+ ((Class348_Sub42_Sub12) class348_sub42_sub12).aString9595);
    }
    
    static final void method2368(int i) {
	Class15.aClass60_225.removeAll(0);
	anInt3965++;
	if (i != -1)
	    aClass348_Sub51_3959 = null;
    }
}
