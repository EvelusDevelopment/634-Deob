/* Class348_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub17 extends Node
{
    static boolean aBoolean6788 = false;
    static int anInt6789;
    static int anInt6790;
    static long aLong6791 = 0L;
    byte[] aByteArray6792;
    private int[] anIntArray6793;
    static int anInt6794;
    short[] aShortArray6795;
    Class23[] aClass23Array6796;
    int anInt6797;
    byte[] aByteArray6798;
    byte[] aByteArray6799;
    Class348_Sub19_Sub1[] aClass348_Sub19_Sub1Array6800;
    static int anInt6801;
    static Class359[] aClass359Array6802 = new Class359[2048];
    static int anInt6803;
    
    static final void method2928(boolean bool) {
	if (bool == true) {
	    Class258_Sub2.aClass10Array8531 = new Class10[50];
	    anInt6790++;
	    Message.anInt2021 = 0;
	}
    }
    
    static final RuntimeException_Sub1 method2929(Throwable throwable,
						  String string) {
	anInt6789++;
	RuntimeException_Sub1 runtimeexception_sub1;
	if (!(throwable instanceof RuntimeException_Sub1))
	    runtimeexception_sub1
		= new RuntimeException_Sub1(throwable, string);
	else {
	    runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
	    ((RuntimeException_Sub1) runtimeexception_sub1).aString4594
		+= ' ' + (String) string;
	}
	return runtimeexception_sub1;
    }
    
    public static void method2930(byte i) {
	aClass359Array6802 = null;
	int i_0_ = -14 / ((i - 61) / 43);
    }
    
    static final void method2931
	(int i, byte i_1_, int[] is,
	 Npc class318_sub1_sub3_sub3_sub1) {
	do {
	    try {
		anInt6801++;
		if ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub1)
		     .anIntArray10236)
		    != null) {
		    boolean bool = true;
		    for (int i_2_ = 0;
			 (((Class318_Sub1_Sub3_Sub3)
			   class318_sub1_sub3_sub3_sub1).anIntArray10236.length
			  ^ 0xffffffff) < (i_2_ ^ 0xffffffff);
			 i_2_++) {
			if ((((Class318_Sub1_Sub3_Sub3)
			      class318_sub1_sub3_sub3_sub1)
			     .anIntArray10236[i_2_])
			    != is[i_2_]) {
			    bool = false;
			    break;
			}
		    }
		    if (bool
			&& ((Class318_Sub1_Sub3_Sub3)
			    class318_sub1_sub3_sub3_sub1).anInt10286 != -1) {
			AnimationDefinition class17
			    = (Class10.animationLoader.method835
			       (((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3_sub1).anInt10286,
				7));
			int i_3_ = ((AnimationDefinition) class17).anInt248;
			if (i_3_ == 1) {
			    ((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub1).anInt10232
				= 0;
			    ((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub1).anInt10218
				= i;
			    ((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub1).anInt10294
				= 0;
			    ((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub1).anInt10267
				= 0;
			    ((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub1).anInt10244
				= 1;
			    if (!((Class318_Sub1_Sub3_Sub3)
				  class318_sub1_sub3_sub3_sub1).aBoolean10309)
				GametipDefinition.method2178
				    (class318_sub1_sub3_sub3_sub1,
				     ((Class318_Sub1_Sub3_Sub3)
				      class318_sub1_sub3_sub3_sub1).anInt10267,
				     class17, -72);
			}
			if ((i_3_ ^ 0xffffffff) == -3)
			    ((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub1).anInt10294
				= 0;
		    }
		}
		boolean bool = true;
		for (int i_4_ = 0;
		     (i_4_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_4_++) {
		    if (is[i_4_] != -1)
			bool = false;
		    if (((Class318_Sub1_Sub3_Sub3)
			 class318_sub1_sub3_sub3_sub1).anIntArray10236 == null
			|| (((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub1)
			    .anIntArray10236[i_4_]) == -1
			|| (((AnimationDefinition) Class10.animationLoader
					   .method835(is[i_4_], 7)).anInt239
			    >= ((AnimationDefinition) (Class10.animationLoader.method835
					   ((((Class318_Sub1_Sub3_Sub3)
					      class318_sub1_sub3_sub3_sub1)
					     .anIntArray10236[i_4_]),
					    7))).anInt239)) {
			((Class318_Sub1_Sub3_Sub3)
			 class318_sub1_sub3_sub3_sub1).anInt10218
			    = i;
			((Class318_Sub1_Sub3_Sub3)
			 class318_sub1_sub3_sub3_sub1).anInt10322
			    = ((Class318_Sub1_Sub3_Sub3)
			       class318_sub1_sub3_sub3_sub1).anInt10319;
			((Class318_Sub1_Sub3_Sub3)
			 class318_sub1_sub3_sub3_sub1).anIntArray10236
			    = is;
		    }
		}
		if (i_1_ <= 31)
		    method2931(-66, (byte) 125, null, null);
		if (!bool)
		    break;
		((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub1)
		    .anIntArray10236
		    = is;
		((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub1)
		    .anInt10218
		    = i;
		((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub1)
		    .anInt10322
		    = (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub1)
		       .anInt10319);
	    } catch (RuntimeException runtimeexception) {
		throw method2929(runtimeexception,
				 ("jf.E(" + i + ',' + i_1_ + ','
				  + (is != null ? "{...}" : "null") + ','
				  + (class318_sub1_sub3_sub3_sub1 != null
				     ? "{...}" : "null")
				  + ')'));
	    }
	    break;
	} while (false);
    }
    
    final boolean method2932(Class26 class26, int[] is, byte[] is_5_, int i) {
	try {
	    anInt6803++;
	    boolean bool = true;
	    int i_6_ = 0;
	    Class348_Sub19_Sub1 class348_sub19_sub1 = null;
	    for (int i_7_ = i; i_7_ < 128; i_7_++) {
		if (is_5_ == null || (is_5_[i_7_] ^ 0xffffffff) != -1) {
		    int i_8_ = anIntArray6793[i_7_];
		    if (i_8_ != 0) {
			if (i_8_ != i_6_) {
			    i_6_ = i_8_;
			    if ((--i_8_ & 0x1 ^ 0xffffffff) == -1)
				class348_sub19_sub1
				    = class26.method308(i_8_ >> 1368305538, is,
							-2);
			    else
				class348_sub19_sub1
				    = class26.method309(is, i_8_ >> 1693742050,
							-1);
			    if (class348_sub19_sub1 == null)
				bool = false;
			}
			if (class348_sub19_sub1 != null) {
			    ((Class348_Sub17) this)
				.aClass348_Sub19_Sub1Array6800[i_7_]
				= class348_sub19_sub1;
			    anIntArray6793[i_7_] = 0;
			}
		    }
		}
	    }
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw method2929(runtimeexception,
			     ("jf.B(" + (class26 != null ? "{...}" : "null")
			      + ',' + (is != null ? "{...}" : "null") + ','
			      + (is_5_ != null ? "{...}" : "null") + ',' + i
			      + ')'));
	}
    }
    
    final void method2933(byte i) {
	anInt6794++;
	if (i >= -65)
	    ((Class348_Sub17) this).aClass23Array6796 = null;
	anIntArray6793 = null;
    }
    
    public Class348_Sub17() {
	/* empty */
    }
    
    Class348_Sub17(byte[] is) {
	((Class348_Sub17) this).aShortArray6795 = new short[128];
	((Class348_Sub17) this).aByteArray6792 = new byte[128];
	((Class348_Sub17) this).aByteArray6798 = new byte[128];
	((Class348_Sub17) this).aByteArray6799 = new byte[128];
	((Class348_Sub17) this).aClass348_Sub19_Sub1Array6800
	    = new Class348_Sub19_Sub1[128];
	((Class348_Sub17) this).aClass23Array6796 = new Class23[128];
	anIntArray6793 = new int[128];
	ByteBuffer class348_sub49 = new ByteBuffer(is);
	int i;
	for (i = 0; ((((ByteBuffer) class348_sub49).payload
		      [i + ((ByteBuffer) class348_sub49).position])
		     != 0); i++) {
	    /* empty */
	}
	byte[] is_9_ = new byte[i];
	for (int i_10_ = 0; i > i_10_; i_10_++)
	    is_9_[i_10_] = class348_sub49.getByte();
	((ByteBuffer) class348_sub49).position++;
	i++;
	int i_11_ = ((ByteBuffer) class348_sub49).position;
	((ByteBuffer) class348_sub49).position += i;
	int i_12_;
	for (i_12_ = 0;
	     (((((ByteBuffer) class348_sub49).payload
		[i_12_ + ((ByteBuffer) class348_sub49).position])
	       ^ 0xffffffff)
	      != -1);
	     i_12_++) {
	    /* empty */
	}
	byte[] is_13_ = new byte[i_12_];
	for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff);
	     i_14_++)
	    is_13_[i_14_] = class348_sub49.getByte();
	i_12_++;
	((ByteBuffer) class348_sub49).position++;
	int i_15_ = ((ByteBuffer) class348_sub49).position;
	((ByteBuffer) class348_sub49).position += i_12_;
	int i_16_;
	for (i_16_ = 0;
	     ((((ByteBuffer) class348_sub49).payload
	       [((ByteBuffer) class348_sub49).position + i_16_])
	      != 0);
	     i_16_++) {
	    /* empty */
	}
	byte[] is_17_ = new byte[i_16_];
	for (int i_18_ = 0; i_16_ > i_18_; i_18_++)
	    is_17_[i_18_] = class348_sub49.getByte();
	((ByteBuffer) class348_sub49).position++;
	byte[] is_19_ = new byte[++i_16_];
	int i_20_;
	if (i_16_ > 1) {
	    is_19_[1] = (byte) 1;
	    i_20_ = 2;
	    int i_21_ = 1;
	    for (int i_22_ = 2; i_16_ > i_22_; i_22_++) {
		int i_23_ = class348_sub49.getUByte();
		if ((i_23_ ^ 0xffffffff) == -1)
		    i_21_ = i_20_++;
		else {
		    if (i_23_ <= i_21_)
			i_23_--;
		    i_21_ = i_23_;
		}
		is_19_[i_22_] = (byte) i_21_;
	    }
	} else
	    i_20_ = i_16_;
	Class23[] class23s = new Class23[i_20_];
	for (int i_24_ = 0;
	     (class23s.length ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++) {
	    Class23 class23 = class23s[i_24_] = new Class23();
	    int i_25_ = class348_sub49.getUByte();
	    if ((i_25_ ^ 0xffffffff) < -1)
		((Class23) class23).aByteArray348 = new byte[i_25_ * 2];
	    i_25_ = class348_sub49.getUByte();
	    if ((i_25_ ^ 0xffffffff) < -1) {
		((Class23) class23).aByteArray344 = new byte[i_25_ * 2 + 2];
		((Class23) class23).aByteArray344[1] = (byte) 64;
	    }
	}
	int i_26_ = class348_sub49.getUByte();
	byte[] is_27_ = i_26_ > 0 ? new byte[i_26_ * 2] : null;
	i_26_ = class348_sub49.getUByte();
	byte[] is_28_ = (i_26_ ^ 0xffffffff) < -1 ? new byte[2 * i_26_] : null;
	int i_29_;
	for (i_29_ = 0;
	     ((((ByteBuffer) class348_sub49).payload
	       [((ByteBuffer) class348_sub49).position - -i_29_])
	      != 0);
	     i_29_++) {
	    /* empty */
	}
	byte[] is_30_ = new byte[i_29_];
	for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > (i_29_ ^ 0xffffffff);
	     i_31_++)
	    is_30_[i_31_] = class348_sub49.getByte();
	((ByteBuffer) class348_sub49).position++;
	i_29_++;
	int i_32_ = 0;
	for (int i_33_ = 0; i_33_ < 128; i_33_++) {
	    i_32_ += class348_sub49.getUByte();
	    ((Class348_Sub17) this).aShortArray6795[i_33_] = (short) i_32_;
	}
	i_32_ = 0;
	for (int i_34_ = 0; (i_34_ ^ 0xffffffff) > -129; i_34_++) {
	    i_32_ += class348_sub49.getUByte();
	    ((Class348_Sub17) this).aShortArray6795[i_34_]
		+= i_32_ << -2123187320;
	}
	int i_35_ = 0;
	int i_36_ = 0;
	int i_37_ = 0;
	for (int i_38_ = 0; (i_38_ ^ 0xffffffff) > -129; i_38_++) {
	    if (i_35_ == 0) {
		if ((is_30_.length ^ 0xffffffff) < (i_36_ ^ 0xffffffff))
		    i_35_ = is_30_[i_36_++];
		else
		    i_35_ = -1;
		i_37_ = class348_sub49.method3366((byte) 124);
	    }
	    ((Class348_Sub17) this).aShortArray6795[i_38_]
		+= Class139.method1166(32768, i_37_ + -1 << -1686647154);
	    i_35_--;
	    anIntArray6793[i_38_] = i_37_;
	}
	i_36_ = 0;
	i_35_ = 0;
	int i_39_ = 0;
	for (int i_40_ = 0; i_40_ < 128; i_40_++) {
	    if ((anIntArray6793[i_40_] ^ 0xffffffff) != -1) {
		if (i_35_ == 0) {
		    i_39_ = -1 + (((ByteBuffer) class348_sub49)
				  .payload[i_11_++]);
		    if (i_36_ < is_9_.length)
			i_35_ = is_9_[i_36_++];
		    else
			i_35_ = -1;
		}
		i_35_--;
		((Class348_Sub17) this).aByteArray6798[i_40_] = (byte) i_39_;
	    }
	}
	i_36_ = 0;
	i_35_ = 0;
	int i_41_ = 0;
	for (int i_42_ = 0; (i_42_ ^ 0xffffffff) > -129; i_42_++) {
	    if ((anIntArray6793[i_42_] ^ 0xffffffff) != -1) {
		if (i_35_ == 0) {
		    if (i_36_ >= is_13_.length)
			i_35_ = -1;
		    else
			i_35_ = is_13_[i_36_++];
		    i_41_ = 16 + (((ByteBuffer) class348_sub49)
				  .payload[i_15_++]) << 920444290;
		}
		i_35_--;
		((Class348_Sub17) this).aByteArray6792[i_42_] = (byte) i_41_;
	    }
	}
	i_35_ = 0;
	i_36_ = 0;
	Class23 class23 = null;
	for (int i_43_ = 0; (i_43_ ^ 0xffffffff) > -129; i_43_++) {
	    if ((anIntArray6793[i_43_] ^ 0xffffffff) != -1) {
		if (i_35_ == 0) {
		    class23 = class23s[is_19_[i_36_]];
		    if (i_36_ < is_17_.length)
			i_35_ = is_17_[i_36_++];
		    else
			i_35_ = -1;
		}
		i_35_--;
		((Class348_Sub17) this).aClass23Array6796[i_43_] = class23;
	    }
	}
	i_35_ = 0;
	i_36_ = 0;
	int i_44_ = 0;
	for (int i_45_ = 0; (i_45_ ^ 0xffffffff) > -129; i_45_++) {
	    if ((i_35_ ^ 0xffffffff) == -1) {
		if (is_30_.length > i_36_)
		    i_35_ = is_30_[i_36_++];
		else
		    i_35_ = -1;
		if ((anIntArray6793[i_45_] ^ 0xffffffff) < -1)
		    i_44_ = class348_sub49.getUByte() + 1;
	    }
	    ((Class348_Sub17) this).aByteArray6799[i_45_] = (byte) i_44_;
	    i_35_--;
	}
	((Class348_Sub17) this).anInt6797
	    = class348_sub49.getUByte() - -1;
	for (int i_46_ = 0; i_20_ > i_46_; i_46_++) {
	    Class23 class23_47_ = class23s[i_46_];
	    if (((Class23) class23_47_).aByteArray348 != null) {
		for (int i_48_ = 1;
		     i_48_ < ((Class23) class23_47_).aByteArray348.length;
		     i_48_ += 2)
		    ((Class23) class23_47_).aByteArray348[i_48_]
			= class348_sub49.getByte();
	    }
	    if (((Class23) class23_47_).aByteArray344 != null) {
		for (int i_49_ = 3;
		     -2 + ((Class23) class23_47_).aByteArray344.length > i_49_;
		     i_49_ += 2)
		    ((Class23) class23_47_).aByteArray344[i_49_]
			= class348_sub49.getByte();
	    }
	}
	if (is_27_ != null) {
	    for (int i_50_ = 1; i_50_ < is_27_.length; i_50_ += 2)
		is_27_[i_50_] = class348_sub49.getByte();
	}
	if (is_28_ != null) {
	    for (int i_51_ = 1;
		 (i_51_ ^ 0xffffffff) > (is_28_.length ^ 0xffffffff);
		 i_51_ += 2)
		is_28_[i_51_] = class348_sub49.getByte();
	}
	for (int i_52_ = 0; i_52_ < i_20_; i_52_++) {
	    Class23 class23_53_ = class23s[i_52_];
	    if (((Class23) class23_53_).aByteArray344 != null) {
		i_32_ = 0;
		for (int i_54_ = 2;
		     i_54_ < ((Class23) class23_53_).aByteArray344.length;
		     i_54_ += 2) {
		    i_32_ = 1 + i_32_ - -class348_sub49.getUByte();
		    ((Class23) class23_53_).aByteArray344[i_54_]
			= (byte) i_32_;
		}
	    }
	}
	for (int i_55_ = 0; (i_55_ ^ 0xffffffff) > (i_20_ ^ 0xffffffff);
	     i_55_++) {
	    Class23 class23_56_ = class23s[i_55_];
	    if (((Class23) class23_56_).aByteArray348 != null) {
		i_32_ = 0;
		for (int i_57_ = 2;
		     i_57_ < ((Class23) class23_56_).aByteArray348.length;
		     i_57_ += 2) {
		    i_32_ = 1 + (i_32_ - -class348_sub49.getUByte());
		    ((Class23) class23_56_).aByteArray348[i_57_]
			= (byte) i_32_;
		}
	    }
	}
	if (is_27_ != null) {
	    i_32_ = class348_sub49.getUByte();
	    is_27_[0] = (byte) i_32_;
	    for (int i_58_ = 2; i_58_ < is_27_.length; i_58_ += 2) {
		i_32_ = 1 + (i_32_ - -class348_sub49.getUByte());
		is_27_[i_58_] = (byte) i_32_;
	    }
	    int i_59_ = is_27_[0];
	    int i_60_ = is_27_[1];
	    for (int i_61_ = 0; i_59_ > i_61_; i_61_++)
		((Class348_Sub17) this).aByteArray6799[i_61_]
		    = (byte) (32 + i_60_ * (((Class348_Sub17) this)
					    .aByteArray6799[i_61_])
			      >> -324905786);
	    int i_62_ = 2;
	    while ((i_62_ ^ 0xffffffff) > (is_27_.length ^ 0xffffffff)) {
		int i_63_ = is_27_[i_62_];
		int i_64_ = is_27_[1 + i_62_];
		int i_65_ = (-i_59_ + i_63_) / 2 + (-i_59_ + i_63_) * i_60_;
		for (int i_66_ = i_59_;
		     (i_63_ ^ 0xffffffff) < (i_66_ ^ 0xffffffff); i_66_++) {
		    int i_67_
			= Class254.method1928(-i_59_ + i_63_, -110, i_65_);
		    ((Class348_Sub17) this).aByteArray6799[i_66_]
			= (byte) (32 + (((Class348_Sub17) this).aByteArray6799
					[i_66_]) * i_67_
				  >> 1645538950);
		    i_65_ += -i_60_ + i_64_;
		}
		i_59_ = i_63_;
		i_62_ += 2;
		i_60_ = i_64_;
	    }
	    for (int i_68_ = i_59_; (i_68_ ^ 0xffffffff) > -129; i_68_++)
		((Class348_Sub17) this).aByteArray6799[i_68_]
		    = (byte) (32 + i_60_ * (((Class348_Sub17) this)
					    .aByteArray6799[i_68_])
			      >> -1598826330);
	    Object object = null;
	}
	if (is_28_ != null) {
	    i_32_ = class348_sub49.getUByte();
	    is_28_[0] = (byte) i_32_;
	    for (int i_69_ = 2; i_69_ < is_28_.length; i_69_ += 2) {
		i_32_ = class348_sub49.getUByte() + (1 + i_32_);
		is_28_[i_69_] = (byte) i_32_;
	    }
	    int i_70_ = is_28_[0];
	    int i_71_ = is_28_[1] << -1566493855;
	    for (int i_72_ = 0; (i_72_ ^ 0xffffffff) > (i_70_ ^ 0xffffffff);
		 i_72_++) {
		int i_73_
		    = ((((Class348_Sub17) this).aByteArray6792[i_72_] & 0xff)
		       + i_71_);
		if ((i_73_ ^ 0xffffffff) > -1)
		    i_73_ = 0;
		if ((i_73_ ^ 0xffffffff) < -129)
		    i_73_ = 128;
		((Class348_Sub17) this).aByteArray6792[i_72_] = (byte) i_73_;
	    }
	    for (int i_74_ = 2; is_28_.length > i_74_; i_74_ += 2) {
		int i_75_ = is_28_[i_74_];
		int i_76_ = is_28_[i_74_ - -1] << -1203943679;
		int i_77_ = (-i_70_ + i_75_) * i_71_ + (-i_70_ + i_75_) / 2;
		for (int i_78_ = i_70_;
		     (i_78_ ^ 0xffffffff) > (i_75_ ^ 0xffffffff); i_78_++) {
		    int i_79_
			= Class254.method1928(-i_70_ + i_75_, -34, i_77_);
		    int i_80_
			= ((0xff
			    & ((Class348_Sub17) this).aByteArray6792[i_78_])
			   + i_79_);
		    if ((i_80_ ^ 0xffffffff) > -1)
			i_80_ = 0;
		    if ((i_80_ ^ 0xffffffff) < -129)
			i_80_ = 128;
		    ((Class348_Sub17) this).aByteArray6792[i_78_]
			= (byte) i_80_;
		    i_77_ += -i_71_ + i_76_;
		}
		i_71_ = i_76_;
		i_70_ = i_75_;
	    }
	    Object object = null;
	    for (int i_81_ = i_70_; (i_81_ ^ 0xffffffff) > -129; i_81_++) {
		int i_82_
		    = i_71_ + (((Class348_Sub17) this).aByteArray6792[i_81_]
			       & 0xff);
		if ((i_82_ ^ 0xffffffff) > -1)
		    i_82_ = 0;
		if ((i_82_ ^ 0xffffffff) < -129)
		    i_82_ = 128;
		((Class348_Sub17) this).aByteArray6792[i_81_] = (byte) i_82_;
	    }
	}
	for (int i_83_ = 0; (i_83_ ^ 0xffffffff) > (i_20_ ^ 0xffffffff);
	     i_83_++)
	    ((Class23) class23s[i_83_]).anInt347
		= class348_sub49.getUByte();
	for (int i_84_ = 0; i_84_ < i_20_; i_84_++) {
	    Class23 class23_85_ = class23s[i_84_];
	    if (((Class23) class23_85_).aByteArray348 != null)
		((Class23) class23_85_).anInt345
		    = class348_sub49.getUByte();
	    if (((Class23) class23_85_).aByteArray344 != null)
		((Class23) class23_85_).anInt349
		    = class348_sub49.getUByte();
	    if ((((Class23) class23_85_).anInt347 ^ 0xffffffff) < -1)
		((Class23) class23_85_).anInt350
		    = class348_sub49.getUByte();
	}
	for (int i_86_ = 0; (i_86_ ^ 0xffffffff) > (i_20_ ^ 0xffffffff);
	     i_86_++)
	    ((Class23) class23s[i_86_]).anInt352
		= class348_sub49.getUByte();
	for (int i_87_ = 0; i_87_ < i_20_; i_87_++) {
	    Class23 class23_88_ = class23s[i_87_];
	    if (((Class23) class23_88_).anInt352 > 0)
		((Class23) class23_88_).anInt353
		    = class348_sub49.getUByte();
	}
	for (int i_89_ = 0; (i_89_ ^ 0xffffffff) > (i_20_ ^ 0xffffffff);
	     i_89_++) {
	    Class23 class23_90_ = class23s[i_89_];
	    if (((Class23) class23_90_).anInt353 > 0)
		((Class23) class23_90_).anInt346
		    = class348_sub49.getUByte();
	}
    }
}
