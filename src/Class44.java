/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class44
{
    static int anInt621;
    static int anInt622;
    static int anInt623;
    static Class101 aClass101_624;
    static char[] aCharArray625
	= { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020',
	    '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0',
	    '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d',
	    '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161',
	    '\u203a', '\u0153', '\0', '\u017e', '\u0178' };
    
    static final int method384(int i, int i_0_, int i_1_) {
	anInt623++;
	int i_2_ = (Class127.method1115(i - 1, i_1_ - 1, (byte) 91)
		    - (-Class127.method1115(i - -1, i_1_ + -1, (byte) -53)
		       + -Class127.method1115(-1 + i, 1 + i_1_, (byte) -90))
		    + Class127.method1115(i - -1, i_1_ - -1, (byte) -82));
	int i_3_ = (Class127.method1115(i + -1, i_1_, (byte) -118)
		    + (Class127.method1115(i - i_0_, i_1_, (byte) 118)
		       - (-Class127.method1115(i, -1 + i_1_, (byte) 109)
			  + -Class127.method1115(i, 1 + i_1_, (byte) 89))));
	int i_4_ = Class127.method1115(i, i_1_, (byte) -59);
	return i_4_ / 4 + i_3_ / 8 + i_2_ / 16;
    }
    
    static final void method385(boolean bool, Class237_Sub1 class237_sub1,
				byte[][] is) {
	do {
	    try {
		anInt622++;
		int[] is_5_ = { -1, 0, 0, 0, 0 };
		for (int i = 0; i < ((Class237) class237_sub1).anInt3130;
		     i++) {
		    Class369_Sub1.method3570(false);
		    for (int i_6_ = 0;
			 ((i_6_ ^ 0xffffffff)
			  > (Class367_Sub4.anInt7319 >> -1410936221
			     ^ 0xffffffff));
			 i_6_++) {
			for (int i_7_ = 0;
			     i_7_ < Class348_Sub40_Sub3.anInt9109 >> 48975811;
			     i_7_++) {
			    int i_8_ = (Class62.anIntArrayArrayArray1116[i]
					[i_6_][i_7_]);
			    if ((i_8_ ^ 0xffffffff) != 0) {
				int i_9_ = i_8_ >> -1306551304 & 0x3;
				if (!((Class237) class237_sub1).aBoolean3109
				    || i_9_ == 0) {
				    int i_10_ = (i_8_ & 0x6) >> 1432689025;
				    int i_11_ = (i_8_ & 0xffd064) >> 86505390;
				    int i_12_ = i_8_ >> 1357170371 & 0x7ff;
				    int i_13_ = ((i_11_ / 8 << 649524712)
						 - -(i_12_ / 8));
				    for (int i_14_ = 0;
					 i_14_ < (Class348_Sub23_Sub3
						  .anIntArray9042).length;
					 i_14_++) {
					if ((((Class348_Sub23_Sub3
					       .anIntArray9042[i_14_])
					      ^ 0xffffffff)
					     == (i_13_ ^ 0xffffffff))
					    && is[i_14_] != null) {
					    ByteBuffer class348_sub49
						= new ByteBuffer(is
								     [i_14_]);
					    class237_sub1.method1684
						(i_6_ * 8, i, -1,
						 class348_sub49, i_12_,
						 8 * i_7_, i_11_,
						 (MouseEventNode
						  .aClass361Array7108),
						 i_10_, i_9_);
					    class237_sub1.method1696
						(class348_sub49, false, i_12_,
						 i_11_, 8 * i_6_, i, i_10_,
						 8 * i_7_,
						 Class348_Sub8.currentToolkit,
						 is_5_[0] != -1 ? null : is_5_,
						 i_9_);
					    break;
					}
				    }
				}
			    }
			}
		    }
		}
		for (int i = 0; ((Class237) class237_sub1).anInt3130 > i;
		     i++) {
		    Class369_Sub1.method3570(false);
		    for (int i_15_ = 0;
			 ((Class367_Sub4.anInt7319 >> 1013179203 ^ 0xffffffff)
			  < (i_15_ ^ 0xffffffff));
			 i_15_++) {
			for (int i_16_ = 0;
			     (i_16_
			      < Class348_Sub40_Sub3.anInt9109 >> -811826653);
			     i_16_++) {
			    int i_17_ = (Class62.anIntArrayArrayArray1116[i]
					 [i_15_][i_16_]);
			    if (i_17_ == -1)
				class237_sub1.method1678(i_15_ * 8, 8,
							 i_16_ * 8, -100, 8,
							 i);
			}
		    }
		}
		if ((is_5_[0] ^ 0xffffffff) != 0) {
		    IntegerVarScriptSettingLoader.aClass305_3304
			= Class30.aClass84_413.method823(is_5_[2], is_5_[3],
							 is_5_[1], -109,
							 (Class123
							  .aClass25_1813),
							 is_5_[0]);
		    Class185.anInt2481 = is_5_[4];
		}
		if (bool == false)
		    break;
		method387(26);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("ik.D(" + bool + ','
						 + (class237_sub1 != null
						    ? "{...}" : "null")
						 + ','
						 + (is != null ? "{...}"
						    : "null")
						 + ')'));
	    }
	    break;
	} while (false);
    }
    
    static final void method386(byte i) {
	anInt621++;
	if (i != -106)
	    method386((byte) 21);
	Class15.aClass60_225.method587(i + 9);
    }
    
    public static void method387(int i) {
	aClass101_624 = null;
	aCharArray625 = null;
	if (i < 33)
	    aCharArray625 = null;
    }
    
    static final void method388(int i, int i_18_, int i_19_,
				Class318_Sub1_Sub5 class318_sub1_sub5,
				Class318_Sub1_Sub5 class318_sub1_sub5_20_) {
	Class357 class357 = Class348_Sub46.method3321(i, i_18_, i_19_);
	if (class357 != null) {
	    ((Class357) class357).aClass318_Sub1_Sub5_4395
		= class318_sub1_sub5;
	    ((Class357) class357).aClass318_Sub1_Sub5_4407
		= class318_sub1_sub5_20_;
	    int i_21_ = aa_Sub1.aSArray5191 == Class332.aSArray4142 ? 1 : 0;
	    if (class318_sub1_sub5.method2376(-62)) {
		if (class318_sub1_sub5.method2377((byte) 122)) {
		    ((Class318_Sub1) class318_sub1_sub5).aClass318_Sub1_6379
			= Class250.aClass318_Sub1Array3226[i_21_];
		    Class250.aClass318_Sub1Array3226[i_21_]
			= class318_sub1_sub5;
		} else {
		    ((Class318_Sub1) class318_sub1_sub5).aClass318_Sub1_6379
			= Node.aClass318_Sub1Array4293[i_21_];
		    Node.aClass318_Sub1Array4293[i_21_]
			= class318_sub1_sub5;
		    Class348_Sub16_Sub2.aBoolean8870 = true;
		}
	    } else {
		((Class318_Sub1) class318_sub1_sub5).aClass318_Sub1_6379
		    = Class115.aClass318_Sub1Array1754[i_21_];
		Class115.aClass318_Sub1Array1754[i_21_] = class318_sub1_sub5;
	    }
	    if (class318_sub1_sub5_20_ != null) {
		if (class318_sub1_sub5_20_.method2376(-110)) {
		    if (class318_sub1_sub5_20_.method2377((byte) 122)) {
			((Class318_Sub1) class318_sub1_sub5_20_)
			    .aClass318_Sub1_6379
			    = Class250.aClass318_Sub1Array3226[i_21_];
			Class250.aClass318_Sub1Array3226[i_21_]
			    = class318_sub1_sub5_20_;
		    } else {
			((Class318_Sub1) class318_sub1_sub5_20_)
			    .aClass318_Sub1_6379
			    = Node.aClass318_Sub1Array4293[i_21_];
			Node.aClass318_Sub1Array4293[i_21_]
			    = class318_sub1_sub5_20_;
			Class348_Sub16_Sub2.aBoolean8870 = true;
		    }
		} else {
		    ((Class318_Sub1) class318_sub1_sub5_20_)
			.aClass318_Sub1_6379
			= Class115.aClass318_Sub1Array1754[i_21_];
		    Class115.aClass318_Sub1Array1754[i_21_]
			= class318_sub1_sub5_20_;
		}
	    }
	}
    }
}
