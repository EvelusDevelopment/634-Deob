/* Class239_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub17 extends Class239
{
    static Class273 aClass273_6018 = new Class273("", 14);
    static int anInt6019;
    static int anInt6020;
    static int[] anIntArray6021;
    static int anInt6022;
    static int anInt6023;
    static int anInt6024;
    static int anInt6025;
    static int anInt6026;
    static int anInt6027;
    static int anInt6028;
    
    static final String method1793(byte[] is, int i, int i_0_, int i_1_) {
	anInt6020++;
	char[] cs = new char[i_1_];
	int i_2_ = 0;
	if (i_0_ >= -82)
	    return null;
	int i_3_ = i;
	int i_4_ = i_1_ + i;
	while ((i_3_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff)) {
	    int i_5_ = 0xff & is[i_3_++];
	    int i_6_;
	    if ((i_5_ ^ 0xffffffff) > -129) {
		if (i_5_ == 0)
		    i_6_ = 65533;
		else
		    i_6_ = i_5_;
	    } else if ((i_5_ ^ 0xffffffff) <= -193) {
		if ((i_5_ ^ 0xffffffff) <= -225) {
		    if (i_5_ < 240) {
			if (i_3_ + 1 < i_4_
			    && (is[i_3_] & 0xc0 ^ 0xffffffff) == -129
			    && (0xc0 & is[1 + i_3_]) == 128) {
			    i_6_ = ((i_5_ & 0xf) << 640802508
				    | is[i_3_++] << 393745350 & 0xfc0
				    | is[i_3_++] & 0x3f);
			    if ((i_6_ ^ 0xffffffff) > -2049)
				i_6_ = 65533;
			} else
			    i_6_ = 65533;
		    } else if (i_5_ >= 248)
			i_6_ = 65533;
		    else if (i_4_ <= i_3_ - -2
			     || (0xc0 & is[i_3_] ^ 0xffffffff) != -129
			     || (0xc0 & is[1 + i_3_] ^ 0xffffffff) != -129
			     || (is[2 + i_3_] & 0xc0 ^ 0xffffffff) != -129)
			i_6_ = 65533;
		    else {
			i_6_ = (i_5_ << -564067822 & 0x1c0000
				| (is[i_3_++] & 0x3f) << 1045214124
				| 0xfc0 & is[i_3_++] << -1022009914
				| 0x3f & is[i_3_++]);
			if ((i_6_ ^ 0xffffffff) <= -65537
			    && (i_6_ ^ 0xffffffff) >= -1114112)
			    i_6_ = 65533;
			else
			    i_6_ = 65533;
		    }
		} else if (i_3_ >= i_4_
			   || (0xc0 & is[i_3_] ^ 0xffffffff) != -129)
		    i_6_ = 65533;
		else {
		    i_6_ = is[i_3_++] & 0x3f | i_5_ << 405261830 & 0x7c0;
		    if (i_6_ < 128)
			i_6_ = 65533;
		}
	    } else
		i_6_ = 65533;
	    cs[i_2_++] = (char) i_6_;
	}
	return new String(cs, 0, i_2_);
    }
    
    final int method1714(int i, int i_7_) {
	anInt6023++;
	if (i != 3)
	    return 49;
	return 1;
    }
    
    final void method1712(int i, int i_8_) {
	int i_9_ = -117 % ((82 - i) / 35);
	((Class239) this).anInt3138 = i_8_;
	anInt6025++;
    }
    
    public static void method1794(int i) {
	if (i != 63)
	    anIntArray6021 = null;
	aClass273_6018 = null;
	anIntArray6021 = null;
    }
    
    final void method1716(boolean bool) {
	if (bool != false)
	    method1793(null, 50, -30, -126);
	if (((Class239) this).anInt3138 < 0
	    && (((Class239) this).anInt3138 ^ 0xffffffff) < -5)
	    ((Class239) this).anInt3138 = method1710(20014);
	anInt6024++;
    }
    
    static final String method1795(byte[] is, boolean bool) {
	if (bool != true)
	    method1797(4, -104, null, (byte) -82);
	anInt6026++;
	return Class367_Sub8.method3546(is, 0, is.length, 0);
    }
    
    static final boolean method1796(int i, int i_10_) {
	if (i < 53)
	    return true;
	anInt6019++;
	if (i_10_ != 18 && (i_10_ ^ 0xffffffff) != -7 && i_10_ != 1011
	    && i_10_ != 13 && i_10_ != 16)
	    return false;
	return true;
    }
    
    static final void method1797(int i, int i_11_, Widget class46,
				 byte i_12_) {
	if (r.aBoolean9722) {
	    Class254 class254 = (Class246.anInt3176 != -1
				 ? Class101_Sub3.aClass326_5764
				       .method2600(Class246.anInt3176, 28364)
				 : null);
	    if (Main.method105(class46).method3303(1)
		&& (Class38.anInt500 & 0x20 ^ 0xffffffff) != -1
		&& (class254 == null
		    || (class46.method428(((Class254) class254).anInt3256,
					  Class246.anInt3176, -128)
			!= ((Class254) class254).anInt3256))) {
		Class31.anInt436++;
		Class50_Sub3.method466(false,
				       (Class28.aString5000 + " -> "
					+ ((Widget) class46).aString752),
				       ((Widget) class46).anInt830,
				       (byte) -90, false,
				       ((Widget) class46).anInt704,
				       ((Widget) class46).itemId, true, 6,
				       (long) (((Widget) class46).anInt830
					       | (((Widget) class46).anInt704
						  << -1824897120)),
				       Class28.aString5001, 0L,
				       FloatBuffer.anInt9747);
	    }
	}
	anInt6022++;
	for (int i_13_ = 9; i_13_ >= 5; i_13_--) {
	    String string = GfxDefinition.method3561(i_13_, class46, true);
	    if (string != null) {
		Class50_Sub3.method466(false, ((Widget) class46).aString752,
				       ((Widget) class46).anInt830,
				       (byte) -122, false,
				       ((Widget) class46).anInt704,
				       ((Widget) class46).itemId, true,
				       1011,
				       (long) ((((Widget) class46).anInt704
						<< 987307680)
					       | ((Widget) class46).anInt830),
				       string, (long) (1 + i_13_),
				       Class100.method888((byte) 57, i_13_,
							  class46));
		Class335.anInt4169++;
	    }
	}
	String string = Class239_Sub8.method1753(0, class46);
	if (string != null) {
	    Class50_Sub3.method466(false, ((Widget) class46).aString752,
				   ((Widget) class46).anInt830, (byte) -83,
				   false, ((Widget) class46).anInt704,
				   ((Widget) class46).itemId, true, 13,
				   (long) ((((Widget) class46).anInt704
					    << 973259008)
					   | ((Widget) class46).anInt830),
				   string, 0L, ((Widget) class46).anInt713);
	    Class178.anInt2340++;
	}
	if (i_12_ >= -55)
	    method1793(null, -19, 70, -103);
	for (int i_14_ = 4; i_14_ >= 0; i_14_--) {
	    String string_15_ = GfxDefinition.method3561(i_14_, class46, true);
	    if (string_15_ != null) {
		Class50_Sub3.method466(false, ((Widget) class46).aString752,
				       ((Widget) class46).anInt830,
				       (byte) -67, false,
				       ((Widget) class46).anInt704,
				       ((Widget) class46).itemId, true, 18,
				       (long) ((((Widget) class46).anInt704
						<< 617873312)
					       | ((Widget) class46).anInt830),
				       string_15_, (long) (1 + i_14_),
				       Class100.method888((byte) 57, i_14_,
							  class46));
		Class335.anInt4169++;
	    }
	}
	if (Main.method105(class46).method3305(0)) {
	    if (((Widget) class46).aString816 != null)
		Class50_Sub3.method466(false, "", ((Widget) class46).anInt830,
				       (byte) -118, false,
				       ((Widget) class46).anInt704,
				       ((Widget) class46).itemId, true, 16,
				       (long) ((((Widget) class46).anInt704
						<< -1427066464)
					       | ((Widget) class46).anInt830),
				       ((Widget) class46).aString816, 0L, -1);
	    else
		Class50_Sub3.method466
		    (false, "", ((Widget) class46).anInt830, (byte) -79,
		     false, ((Widget) class46).anInt704,
		     ((Widget) class46).itemId, true, 16,
		     (long) (((Widget) class46).anInt704 << -477045792
			     | ((Widget) class46).anInt830),
		     GameText.aClass274_3492
			 .getLanguageText(Class348_Sub33.gameLanguage),
		     0L, -1);
	    WidgetVariable.anInt9655++;
	}
    }
    
    Class239_Sub17(Class348_Sub51 class348_sub51) {
	super(class348_sub51);
    }
    
    Class239_Sub17(int i, Class348_Sub51 class348_sub51) {
	super(i, class348_sub51);
    }
    
    final int method1798(int i) {
	anInt6028++;
	if (i != -32350)
	    return 61;
	return ((Class239) this).anInt3138;
    }
    
    final int method1710(int i) {
	if (i != 20014)
	    aClass273_6018 = null;
	anInt6027++;
	if ((((Class239) this).aClass348_Sub51_3136.method3428((byte) -96)
		 .method1462(-113)
	     ^ 0xffffffff)
	    < -2)
	    return 4;
	return 2;
    }
}
