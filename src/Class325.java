/* Class325 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class325
{
    static int anInt4066;
    static int anInt4067;
    static int anInt4068;
    int anInt4069;
    int anInt4070;
    private Class68 aClass68_4071;
    private int anInt4072;
    static Class325 aClass325_4073 = new Class325(0, 3, Class68.aClass68_1187);
    static int anInt4074;
    static Class325 aClass325_4075 = new Class325(1, 3, Class68.aClass68_1187);
    static Class325 aClass325_4076 = new Class325(2, 4, Class68.aClass68_1183);
    static Class325 aClass325_4077 = new Class325(3, 1, Class68.aClass68_1187);
    static Class325 aClass325_4078 = new Class325(4, 2, Class68.aClass68_1187);
    static Class325 aClass325_4079 = new Class325(5, 3, Class68.aClass68_1187);
    static Class325 aClass325_4080 = new Class325(6, 4, Class68.aClass68_1187);
    static int anInt4081 = Class299.method2253(16, 119);
    static Class138 aClass138_4082 = new Class138(8, 0, 4, 1);
    
    public final String toString() {
	anInt4066++;
	throw new IllegalStateException();
    }
    
    static final byte[][][] method2596(int i, int i_0_) {
	anInt4068++;
	byte[][][] is = new byte[8][4][];
	int i_1_ = i;
	int i_2_ = i;
	byte[] is_3_ = new byte[i_2_ * i_1_];
	int i_4_ = 0;
	for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff); i_5_++) {
	    for (int i_6_ = 0; (i_1_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff);
		 i_6_++) {
		if ((i_5_ ^ 0xffffffff) <= (i_6_ ^ 0xffffffff))
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[0][0] = is_3_;
	i_4_ = 0;
	is_3_ = new byte[i_1_ * i_2_];
	for (int i_7_ = -1 + i_2_; i_7_ >= 0; i_7_--) {
	    for (int i_8_ = 0; i_2_ > i_8_; i_8_++) {
		if ((i_8_ ^ 0xffffffff) >= (i_7_ ^ 0xffffffff))
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[0][1] = is_3_;
	i_4_ = 0;
	is_3_ = new byte[i_2_ * i_1_];
	for (int i_9_ = 0; i_2_ > i_9_; i_9_++) {
	    for (int i_10_ = 0; i_10_ < i_1_; i_10_++) {
		if ((i_9_ ^ 0xffffffff) >= (i_10_ ^ 0xffffffff))
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	if (i_0_ != 12871)
	    aClass325_4078 = null;
	is[0][2] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_11_ = -1 + i_2_; (i_11_ ^ 0xffffffff) <= -1; i_11_--) {
	    for (int i_12_ = 0; i_12_ < i_1_; i_12_++) {
		if (i_12_ >= i_11_)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[0][3] = is_3_;
	i_4_ = 0;
	is_3_ = new byte[i_2_ * i_1_];
	for (int i_13_ = i_2_ + -1; (i_13_ ^ 0xffffffff) <= -1; i_13_--) {
	    for (int i_14_ = 0; i_14_ < i_1_; i_14_++) {
		if ((i_13_ >> 86911201 ^ 0xffffffff) <= (i_14_ ^ 0xffffffff))
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[1][0] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_15_ = 0; i_2_ > i_15_; i_15_++) {
	    for (int i_16_ = 0; i_1_ > i_16_; i_16_++) {
		if (i_4_ < 0
		    || (i_4_ ^ 0xffffffff) <= (is_3_.length ^ 0xffffffff))
		    i_4_++;
		else {
		    if (i_16_ >= i_15_ << -1416731487)
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	}
	is[1][1] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_17_ = 0; i_17_ < i_2_; i_17_++) {
	    for (int i_18_ = -1 + i_1_; i_18_ >= 0; i_18_--) {
		if (i_18_ <= i_17_ >> -1984612351)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[1][2] = is_3_;
	i_4_ = 0;
	is_3_ = new byte[i_2_ * i_1_];
	for (int i_19_ = -1 + i_2_; (i_19_ ^ 0xffffffff) <= -1; i_19_--) {
	    for (int i_20_ = i_1_ + -1; (i_20_ ^ 0xffffffff) <= -1; i_20_--) {
		if (i_19_ << 334603585 <= i_20_)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[1][3] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_21_ = i_2_ - 1; (i_21_ ^ 0xffffffff) <= -1; i_21_--) {
	    for (int i_22_ = i_1_ - 1; i_22_ >= 0; i_22_--) {
		if (i_21_ >> -1212087263 >= i_22_)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[2][0] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_23_ = -1 + i_2_; i_23_ >= 0; i_23_--) {
	    for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff);
		 i_24_++) {
		if ((i_24_ ^ 0xffffffff) <= (i_23_ << -843548991 ^ 0xffffffff))
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[2][1] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_25_ = 0; (i_2_ ^ 0xffffffff) < (i_25_ ^ 0xffffffff);
	     i_25_++) {
	    for (int i_26_ = 0; i_1_ > i_26_; i_26_++) {
		if ((i_26_ ^ 0xffffffff) >= (i_25_ >> 1902014337 ^ 0xffffffff))
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[2][2] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_27_ = 0; i_27_ < i_2_; i_27_++) {
	    for (int i_28_ = -1 + i_1_; i_28_ >= 0; i_28_--) {
		if ((i_28_ ^ 0xffffffff) <= (i_27_ << 1004050753 ^ 0xffffffff))
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[2][3] = is_3_;
	i_4_ = 0;
	is_3_ = new byte[i_1_ * i_2_];
	for (int i_29_ = -1 + i_2_; (i_29_ ^ 0xffffffff) <= -1; i_29_--) {
	    for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff);
		 i_30_++) {
		if ((i_30_ ^ 0xffffffff)
		    <= (i_29_ >> -1754952159 ^ 0xffffffff))
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[3][0] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff);
	     i_31_++) {
	    for (int i_32_ = 0; (i_1_ ^ 0xffffffff) < (i_32_ ^ 0xffffffff);
		 i_32_++) {
		if (i_32_ <= i_31_ << -607752767)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[3][1] = is_3_;
	i_4_ = 0;
	is_3_ = new byte[i_1_ * i_2_];
	for (int i_33_ = 0; (i_33_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff);
	     i_33_++) {
	    for (int i_34_ = i_1_ + -1; i_34_ >= 0; i_34_--) {
		if (i_34_ >= i_33_ >> 1202118081)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[3][2] = is_3_;
	i_4_ = 0;
	is_3_ = new byte[i_1_ * i_2_];
	for (int i_35_ = i_2_ - 1; (i_35_ ^ 0xffffffff) <= -1; i_35_--) {
	    for (int i_36_ = i_1_ + -1; (i_36_ ^ 0xffffffff) <= -1; i_36_--) {
		if (i_36_ <= i_35_ << -93655327)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[3][3] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_37_ = -1 + i_2_; i_37_ >= 0; i_37_--) {
	    for (int i_38_ = i_1_ - 1; (i_38_ ^ 0xffffffff) <= -1; i_38_--) {
		if (i_37_ >> 809014337 <= i_38_)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[4][0] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_39_ = i_2_ + -1; i_39_ >= 0; i_39_--) {
	    for (int i_40_ = 0; (i_40_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff);
		 i_40_++) {
		if ((i_39_ << -213239967 ^ 0xffffffff) <= (i_40_ ^ 0xffffffff))
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[4][1] = is_3_;
	i_4_ = 0;
	is_3_ = new byte[i_1_ * i_2_];
	for (int i_41_ = 0; i_2_ > i_41_; i_41_++) {
	    for (int i_42_ = 0; i_42_ < i_1_; i_42_++) {
		if (i_41_ >> 1178731265 <= i_42_)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[4][2] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_43_ = 0; i_43_ < i_2_; i_43_++) {
	    for (int i_44_ = -1 + i_1_; (i_44_ ^ 0xffffffff) <= -1; i_44_--) {
		if ((i_43_ << 1423930465 ^ 0xffffffff) <= (i_44_ ^ 0xffffffff))
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[4][3] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_45_ = 0; i_2_ > i_45_; i_45_++) {
	    for (int i_46_ = 0; i_1_ > i_46_; i_46_++) {
		if (i_1_ / 2 >= i_46_)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[5][0] = is_3_;
	i_4_ = 0;
	is_3_ = new byte[i_1_ * i_2_];
	for (int i_47_ = 0; (i_47_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff);
	     i_47_++) {
	    for (int i_48_ = 0; i_1_ > i_48_; i_48_++) {
		if (i_47_ <= i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[5][1] = is_3_;
	i_4_ = 0;
	is_3_ = new byte[i_2_ * i_1_];
	for (int i_49_ = 0; i_49_ < i_2_; i_49_++) {
	    for (int i_50_ = 0; i_50_ < i_1_; i_50_++) {
		if ((i_50_ ^ 0xffffffff) <= (i_1_ / 2 ^ 0xffffffff))
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[5][2] = is_3_;
	i_4_ = 0;
	is_3_ = new byte[i_2_ * i_1_];
	for (int i_51_ = 0; i_51_ < i_2_; i_51_++) {
	    for (int i_52_ = 0; (i_52_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff);
		 i_52_++) {
		if (i_51_ >= i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[5][3] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_53_ = 0; i_53_ < i_2_; i_53_++) {
	    for (int i_54_ = 0; i_54_ < i_1_; i_54_++) {
		if ((i_53_ - i_2_ / 2 ^ 0xffffffff) <= (i_54_ ^ 0xffffffff))
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[6][0] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_55_ = -1 + i_2_; i_55_ >= 0; i_55_--) {
	    for (int i_56_ = 0; (i_56_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff);
		 i_56_++) {
		if (i_56_ <= i_55_ - i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[6][1] = is_3_;
	i_4_ = 0;
	is_3_ = new byte[i_1_ * i_2_];
	for (int i_57_ = -1 + i_2_; i_57_ >= 0; i_57_--) {
	    for (int i_58_ = i_1_ - 1; i_58_ >= 0; i_58_--) {
		if ((-(i_2_ / 2) + i_57_ ^ 0xffffffff) <= (i_58_ ^ 0xffffffff))
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[6][2] = is_3_;
	i_4_ = 0;
	is_3_ = new byte[i_2_ * i_1_];
	for (int i_59_ = 0; i_2_ > i_59_; i_59_++) {
	    for (int i_60_ = -1 + i_1_; (i_60_ ^ 0xffffffff) <= -1; i_60_--) {
		if ((-(i_2_ / 2) + i_59_ ^ 0xffffffff) <= (i_60_ ^ 0xffffffff))
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[6][3] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_61_ = 0; (i_2_ ^ 0xffffffff) < (i_61_ ^ 0xffffffff);
	     i_61_++) {
	    for (int i_62_ = 0; (i_1_ ^ 0xffffffff) < (i_62_ ^ 0xffffffff);
		 i_62_++) {
		if (i_62_ >= i_61_ + -(i_2_ / 2))
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[7][0] = is_3_;
	i_4_ = 0;
	is_3_ = new byte[i_2_ * i_1_];
	for (int i_63_ = -1 + i_2_; i_63_ >= 0; i_63_--) {
	    for (int i_64_ = 0; (i_1_ ^ 0xffffffff) < (i_64_ ^ 0xffffffff);
		 i_64_++) {
		if ((i_63_ - i_2_ / 2 ^ 0xffffffff) >= (i_64_ ^ 0xffffffff))
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[7][1] = is_3_;
	i_4_ = 0;
	is_3_ = new byte[i_2_ * i_1_];
	for (int i_65_ = i_2_ + -1; i_65_ >= 0; i_65_--) {
	    for (int i_66_ = -1 + i_1_; (i_66_ ^ 0xffffffff) <= -1; i_66_--) {
		if ((i_66_ ^ 0xffffffff) <= (-(i_2_ / 2) + i_65_ ^ 0xffffffff))
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[7][2] = is_3_;
	i_4_ = 0;
	is_3_ = new byte[i_2_ * i_1_];
	for (int i_67_ = 0; (i_2_ ^ 0xffffffff) < (i_67_ ^ 0xffffffff);
	     i_67_++) {
	    for (int i_68_ = i_1_ - 1; i_68_ >= 0; i_68_--) {
		if (i_68_ >= -(i_2_ / 2) + i_67_)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[7][3] = is_3_;
	return is;
    }
    
    public static void method2597(int i) {
	aClass325_4073 = null;
	aClass325_4080 = null;
	aClass325_4078 = null;
	aClass138_4082 = null;
	aClass325_4077 = null;
	aClass325_4079 = null;
	if (i == -27327) {
	    aClass325_4076 = null;
	    aClass325_4075 = null;
	}
    }
    
    static final Class325 method2598(int i, int i_69_) {
	anInt4074++;
	int i_70_ = -44 / ((-47 - i_69_) / 45);
	int i_71_ = i;
    while_118_:
	do {
	while_117_:
	    do {
	    while_116_:
		do {
		while_115_:
		    do {
		    while_114_:
			do {
			    do {
				if (i_71_ != 0) {
				    if (i_71_ != 1) {
					if (i_71_ != 2) {
					    if (i_71_ != 3) {
						if (i_71_ != 4) {
						    if (i_71_ != 5) {
							if ((i_71_
							     ^ 0xffffffff)
							    == -7)
							    break while_117_;
							break while_118_;
						    }
						} else
						    break while_115_;
						break while_116_;
					    }
					} else
					    break;
					break while_114_;
				    }
				} else
				    return aClass325_4073;
				return aClass325_4075;
			    } while (false);
			    return aClass325_4076;
			} while (false);
			return aClass325_4077;
		    } while (false);
		    return aClass325_4078;
		} while (false);
		return aClass325_4079;
	    } while (false);
	    return aClass325_4080;
	} while (false);
	return null;
    }
    
    static final void method2599(byte i,
				 Class348_Sub42_Sub12 class348_sub42_sub12,
				 int i_72_, int i_73_) {
	do {
	    try {
		anInt4067++;
		if (class348_sub42_sub12 != null
		    && (class348_sub42_sub12
			!= (((Deque) Class348_Sub40_Sub4.aClass262_9111)
			    .parent))) {
		    int i_74_ = (((Class348_Sub42_Sub12) class348_sub42_sub12)
				 .anInt9602);
		    int i_75_ = (((Class348_Sub42_Sub12) class348_sub42_sub12)
				 .anInt9607);
		    int i_76_ = (((Class348_Sub42_Sub12) class348_sub42_sub12)
				 .anInt9608);
		    int i_77_
			= (int) (((Class348_Sub42_Sub12) class348_sub42_sub12)
				 .aLong9605);
		    if (i_76_ >= 2000)
			i_76_ -= 2000;
		    long l = (((Class348_Sub42_Sub12) class348_sub42_sub12)
			      .aLong9605);
		    if (i_76_ == 19) {
			if (Class192.anInt2581 <= 0
			    || !Class182.keyboardListener.method2696(82, -125)
			    || !Class182.keyboardListener.method2696(81, -126)) {
			    BufferedPacket class348_sub47
				= LongNode.method2807(i_75_, i_74_,
							    (byte) -110,
							    i_77_);
			    if (i_77_ == 1) {
				((BufferedPacket) class348_sub47)
				    .buffer
				    .putByte(-1);
				((BufferedPacket) class348_sub47)
				    .buffer
				    .putByte(-1);
				((BufferedPacket) class348_sub47)
				    .buffer.putShort
				    ((int) AbtractArchiveLoader.aFloat3938);
				((BufferedPacket) class348_sub47)
				    .buffer
				    .putByte(57);
				((BufferedPacket) class348_sub47)
				    .buffer
				    .putByte(r_Sub2.anInt10483);
				((BufferedPacket) class348_sub47)
				    .buffer.putByte
				    (FloatBuffer.anInt9750);
				((BufferedPacket) class348_sub47)
				    .buffer
				    .putByte(89);
				((BufferedPacket) class348_sub47)
				    .buffer.putShort
				    ((((Class318_Sub1)
				       (Class132
					.localPlayer))
				      .anInt6377));
				((BufferedPacket) class348_sub47)
				    .buffer.putShort
				    ((((Class318_Sub1)
				       (Class132
					.localPlayer))
				      .anInt6388));
				((BufferedPacket) class348_sub47)
				    .buffer
				    .putByte(63);
			    } else {
				Class93.anInt1534 = i_72_;
				Class26.anInt385 = i_73_;
				Node.anInt4292 = 0;
				Class239_Sub20.anInt6048 = 1;
			    }
			    Class348_Sub42_Sub14.putBufferedPacket(123,
							    class348_sub47);
			    Class298.method2252(true, i_74_, i_75_,
						(byte) -120, 1, 0, 1, -4, 0);
			} else
			    Class361.method3502
				(i_75_ + Class90.anInt1517, 2,
				 (((Class318_Sub1)
				   Class132.localPlayer)
				  .aByte6381),
				 i_74_ + za_Sub2.anInt9780);
		    }
		    if ((i_76_ ^ 0xffffffff) == -5) {
			Class93.anInt1534 = i_72_;
			Class239_Sub20.anInt6048 = 2;
			Class26.anInt385 = i_73_;
			Node.anInt4292 = 0;
			Class21.anInt321++;
			BufferedPacket class348_sub47
			    = Class286_Sub3.createBufferedPacket((Class348_Sub42_Sub8
							.aClass351_9553),
						       (Class348_Sub23_Sub2
							.outgoingGameIsaac));
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3349(4325, Class90.anInt1517 + i_75_);
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3335(120, i_74_ + za_Sub2.anInt9780);
			((BufferedPacket) class348_sub47)
			    .buffer.method3370
			    ((byte) 117,
			     (!Class182.keyboardListener.method2696(82, -122) ? 0
			      : 1));
			((BufferedPacket) class348_sub47)
			    .buffer.method3349
			    (4325, 0x7fffffff & (int) (l >>> 379211744));
			Class348_Sub42_Sub14.putBufferedPacket(117, class348_sub47);
			NativeLibTracker.method2307(i_75_, l, i_74_, 51);
		    }
		    if ((i_76_ ^ 0xffffffff) == -1009) {
			Class239_Sub20.anInt6048 = 2;
			Class93.anInt1534 = i_72_;
			Class26.anInt385 = i_73_;
			Node.anInt4292 = 0;
			Class348_Sub22 class348_sub22
			    = ((Class348_Sub22)
			       Class282.aClass356_3654.get((long) i_77_));
			if (class348_sub22 != null) {
			    Npc class318_sub1_sub3_sub3_sub1
				= (((Class348_Sub22) class348_sub22)
				   .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
			    NpcDefinition class79 = (((Npc)
						class318_sub1_sub3_sub3_sub1)
					       .definition);
			    if (((NpcDefinition) class79).anIntArray1377 != null)
				class79 = (class79.method794
					   ((Class318_Sub1_Sub3_Sub3
					     .varbitHandler),
					    -1));
			    if (class79 != null) {
				Class306.anInt3874++;
				BufferedPacket class348_sub47
				    = (Class286_Sub3.createBufferedPacket
				       (Class318_Sub7.aClass351_6443,
					Class348_Sub23_Sub2.outgoingGameIsaac));
				((BufferedPacket) class348_sub47)
				    .buffer.putShort
				    (((NpcDefinition) class79).id);
				Class348_Sub42_Sub14
				    .putBufferedPacket(-99, class348_sub47);
			    }
			}
		    }
		    if ((i_76_ ^ 0xffffffff) == -49) {
			Player class318_sub1_sub3_sub3_sub2
			    = (ClassicLoadingScreen.players
			       [i_77_]);
			if (class318_sub1_sub3_sub3_sub2 != null) {
			    Node.anInt4292 = 0;
			    Class93.anInt1534 = i_72_;
			    Class26.anInt385 = i_73_;
			    Class216.anInt4979++;
			    Class239_Sub20.anInt6048 = 2;
			    BufferedPacket class348_sub47
				= (Class286_Sub3.createBufferedPacket
				   (Class348_Sub42_Sub18.aClass351_9684,
				    Class348_Sub23_Sub2.outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer
				.method3335(81, i_77_);
			    ((BufferedPacket) class348_sub47)
				.buffer.putByte
				((!Class182.keyboardListener.method2696(82, -126)
				  ? 0 : 1));
			    Class348_Sub42_Sub14.putBufferedPacket(116,
							    class348_sub47);
			    Class298.method2252(true,
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub2)
						 .anIntArray10320[0]),
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub2)
						 .anIntArray10317[0]),
						(byte) -89,
						class318_sub1_sub3_sub3_sub2
						    .method2436((byte) 106),
						0,
						class318_sub1_sub3_sub3_sub2
						    .method2436((byte) 43),
						-2, 0);
			}
		    }
		    if ((i_76_ ^ 0xffffffff) == -50) {
			Class26.anInt385 = i_73_;
			Node.anInt4292 = 0;
			Class239_Sub20.anInt6048 = 2;
			Class93.anInt1534 = i_72_;
			Class205.anInt2689++;
			BufferedPacket class348_sub47
			    = Class286_Sub3.createBufferedPacket(AbstractBuffer.aClass351_4262,
						       (Class348_Sub23_Sub2
							.outgoingGameIsaac));
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3353(i_74_ + za_Sub2.anInt9780, (byte) 3);
			((BufferedPacket) class348_sub47)
			    .buffer.method3335(-107, i_77_);
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3353(Class9.anInt169, (byte) 3);
			((BufferedPacket) class348_sub47)
			    .buffer
			    .putShort(Class90.anInt1517 + i_75_);
			((BufferedPacket) class348_sub47)
			    .buffer.putByte
			    ((!Class182.keyboardListener.method2696(82, -126) ? 0
			      : 1));
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3335(90, Class301.anInt3829);
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3336(Class149.anInt2046, (byte) 44);
			Class348_Sub42_Sub14.putBufferedPacket(120, class348_sub47);
			Class348_Sub42_Sub18.method3275(1, i_75_, i_74_);
		    }
		    if (i_76_ == 6) {
			Widget class46
			    = Class348_Sub22.getWidgetChild(i_74_,
							i_75_);
			if (class46 != null)
			    Class155.method1237((byte) 71, class46);
		    }
		    if (i_76_ == 5) {
			Node.anInt4292 = 0;
			Class15.anInt226++;
			Class26.anInt385 = i_73_;
			Class239_Sub20.anInt6048 = 2;
			Class93.anInt1534 = i_72_;
			BufferedPacket class348_sub47
			    = Class286_Sub3.createBufferedPacket(Class190.aClass351_2539,
						       (Class348_Sub23_Sub2
							.outgoingGameIsaac));
			((BufferedPacket) class348_sub47)
			    .buffer
			    .putShort(Class90.anInt1517 + i_75_);
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3335(-110, i_74_ + za_Sub2.anInt9780);
			((BufferedPacket) class348_sub47)
			    .buffer.method3374
			    ((byte) -44,
			     (!Class182.keyboardListener.method2696(82, -122) ? 0
			      : 1));
			((BufferedPacket) class348_sub47)
			    .buffer.method3335(97, i_77_);
			Class348_Sub42_Sub14.putBufferedPacket(118, class348_sub47);
			Class348_Sub42_Sub18.method3275(1, i_75_, i_74_);
		    }
		    if ((i_76_ ^ 0xffffffff) == -47) {
			Class348_Sub22 class348_sub22
			    = ((Class348_Sub22)
			       Class282.aClass356_3654.get((long) i_77_));
			if (class348_sub22 != null) {
			    Node.anInt4292 = 0;
			    Class187.anInt2499++;
			    Class26.anInt385 = i_73_;
			    Class239_Sub20.anInt6048 = 2;
			    Class93.anInt1534 = i_72_;
			    Npc class318_sub1_sub3_sub3_sub1
				= (((Class348_Sub22) class348_sub22)
				   .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
			    BufferedPacket class348_sub47
				= (Class286_Sub3.createBufferedPacket
				   (Class318_Sub1_Sub5_Sub1.aClass351_10134,
				    Class348_Sub23_Sub2.outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer
				.method3353(i_77_, (byte) 3);
			    ((BufferedPacket) class348_sub47)
				.buffer.method3395
				((byte) 124,
				 (Class182.keyboardListener.method2696(82, -121)
				  ? 1 : 0));
			    Class348_Sub42_Sub14.putBufferedPacket(117,
							    class348_sub47);
			    Class298.method2252(true,
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub1)
						 .anIntArray10320[0]),
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub1)
						 .anIntArray10317[0]),
						(byte) -100,
						class318_sub1_sub3_sub3_sub1
						    .method2436((byte) 68),
						0,
						class318_sub1_sub3_sub3_sub1
						    .method2436((byte) 106),
						-2, 0);
			}
		    }
		    if ((i_76_ ^ 0xffffffff) == -12) {
			Player class318_sub1_sub3_sub3_sub2
			    = (ClassicLoadingScreen.players
			       [i_77_]);
			if (class318_sub1_sub3_sub3_sub2 != null) {
			    Node.anInt4292 = 0;
			    Class127.anInt4657++;
			    Class93.anInt1534 = i_72_;
			    Class239_Sub20.anInt6048 = 2;
			    Class26.anInt385 = i_73_;
			    BufferedPacket class348_sub47
				= Class286_Sub3.createBufferedPacket((Class239_Sub9
							    .aClass351_5929),
							   (Class348_Sub23_Sub2
							    .outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer
				.method3349(4325, i_77_);
			    ((BufferedPacket) class348_sub47)
				.buffer.method3374
				((byte) -108,
				 (Class182.keyboardListener.method2696(82, -124)
				  ? 1 : 0));
			    Class348_Sub42_Sub14.putBufferedPacket(119,
							    class348_sub47);
			    Class298.method2252(true,
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub2)
						 .anIntArray10320[0]),
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub2)
						 .anIntArray10317[0]),
						(byte) -128,
						class318_sub1_sub3_sub3_sub2
						    .method2436((byte) 53),
						0,
						class318_sub1_sub3_sub3_sub2
						    .method2436((byte) 110),
						-2, 0);
			}
		    }
		    if (i_76_ == 59) {
			Class26.anInt385 = i_73_;
			Class93.anInt1534 = i_72_;
			Node.anInt4292 = 0;
			Class178.anInt2336++;
			Class239_Sub20.anInt6048 = 2;
			BufferedPacket class348_sub47
			    = Class286_Sub3.createBufferedPacket((Class101_Sub1
							.aClass351_5677),
						       (Class348_Sub23_Sub2
							.outgoingGameIsaac));
			((BufferedPacket) class348_sub47)
			    .buffer.method3395
			    ((byte) 86,
			     (!Class182.keyboardListener.method2696(82, -121) ? 0
			      : 1));
			((BufferedPacket) class348_sub47)
			    .buffer.method3335
			    (31, (int) (l >>> 1628456736) & 0x7fffffff);
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3335(-104, za_Sub2.anInt9780 + i_74_);
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3353(Class90.anInt1517 + i_75_, (byte) 3);
			Class348_Sub42_Sub14.putBufferedPacket(119, class348_sub47);
			NativeLibTracker.method2307(i_75_, l, i_74_, 93);
		    }
		    if ((i_76_ ^ 0xffffffff) == -31) {
			Class348_Sub22 class348_sub22
			    = ((Class348_Sub22)
			       Class282.aClass356_3654.get((long) i_77_));
			if (class348_sub22 != null) {
			    Node.anInt4292 = 0;
			    Class93.anInt1534 = i_72_;
			    Class26.anInt385 = i_73_;
			    Npc class318_sub1_sub3_sub3_sub1
				= (((Class348_Sub22) class348_sub22)
				   .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
			    Class239_Sub20.anInt6048 = 2;
			    Class348_Sub7.anInt6646++;
			    BufferedPacket class348_sub47
				= Class286_Sub3.createBufferedPacket((Class131
							    .aClass351_1904),
							   (Class348_Sub23_Sub2
							    .outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer
				.method3349(4325, Class9.anInt169);
			    ((BufferedPacket) class348_sub47)
				.buffer
				.putInt(Class149.anInt2046);
			    ((BufferedPacket) class348_sub47)
				.buffer
				.method3353(i_77_, (byte) 3);
			    ((BufferedPacket) class348_sub47)
				.buffer.method3395
				((byte) -89,
				 (!Class182.keyboardListener.method2696(82, -127)
				  ? 0 : 1));
			    ((BufferedPacket) class348_sub47)
				.buffer
				.method3335(-116, Class301.anInt3829);
			    Class348_Sub42_Sub14.putBufferedPacket(122,
							    class348_sub47);
			    Class298.method2252(true,
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub1)
						 .anIntArray10320[0]),
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub1)
						 .anIntArray10317[0]),
						(byte) -107,
						class318_sub1_sub3_sub3_sub1
						    .method2436((byte) 88),
						0,
						class318_sub1_sub3_sub3_sub1
						    .method2436((byte) 108),
						-2, 0);
			}
		    }
		    if ((i_76_ ^ 0xffffffff) == -13) {
			if ((Class192.anInt2581 ^ 0xffffffff) < -1
			    && Class182.keyboardListener.method2696(82, -127)
			    && Class182.keyboardListener.method2696(81, -126))
			    Class361.method3502
				(i_75_ + Class90.anInt1517, 2,
				 (((Class318_Sub1)
				   Class132.localPlayer)
				  .aByte6381),
				 za_Sub2.anInt9780 - -i_74_);
			else {
			    Class93.anInt1534 = i_72_;
			    Class26.anInt385 = i_73_;
			    Class55.anInt994++;
			    Node.anInt4292 = 0;
			    Class239_Sub20.anInt6048 = 1;
			    BufferedPacket class348_sub47
				= Class286_Sub3.createBufferedPacket((ModernLoadingScreen
							    .aClass351_5015),
							   (Class348_Sub23_Sub2
							    .outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer
				.method3335(101, za_Sub2.anInt9780 + i_74_);
			    ((BufferedPacket) class348_sub47)
				.buffer.putShort
				(Class90.anInt1517 - -i_75_);
			    Class348_Sub42_Sub14.putBufferedPacket(6, class348_sub47);
			}
		    }
		    if ((i_76_ ^ 0xffffffff) == -1002) {
			Class93.anInt1534 = i_72_;
			Class35.anInt484++;
			Class239_Sub20.anInt6048 = 2;
			Node.anInt4292 = 0;
			Class26.anInt385 = i_73_;
			BufferedPacket class348_sub47
			    = Class286_Sub3.createBufferedPacket(Class205.aClass351_2691,
						       (Class348_Sub23_Sub2
							.outgoingGameIsaac));
			((BufferedPacket) class348_sub47)
			    .buffer
			    .putShort(i_77_);
			Class348_Sub42_Sub14.putBufferedPacket(-60, class348_sub47);
		    }
		    if (i_76_ == 51) {
			Player class318_sub1_sub3_sub3_sub2
			    = (ClassicLoadingScreen.players
			       [i_77_]);
			if (class318_sub1_sub3_sub3_sub2 != null) {
			    Class26.anInt385 = i_73_;
			    Class239_Sub20.anInt6048 = 2;
			    Class228.anInt2975++;
			    Node.anInt4292 = 0;
			    Class93.anInt1534 = i_72_;
			    BufferedPacket class348_sub47
				= Class286_Sub3.createBufferedPacket((ColorNode
							    .aClass351_4907),
							   (Class348_Sub23_Sub2
							    .outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer
				.method3349(4325, Class9.anInt169);
			    ((BufferedPacket) class348_sub47)
				.buffer
				.method3353(i_77_, (byte) 3);
			    ((BufferedPacket) class348_sub47)
				.buffer
				.method3353(Class301.anInt3829, (byte) 3);
			    ((BufferedPacket) class348_sub47)
				.buffer
				.method3356(Class149.anInt2046, -4086);
			    ((BufferedPacket) class348_sub47)
				.buffer.method3374
				((byte) -89,
				 (Class182.keyboardListener.method2696(82, -127)
				  ? 1 : 0));
			    Class348_Sub42_Sub14.putBufferedPacket(-33,
							    class348_sub47);
			    Class298.method2252(true,
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub2)
						 .anIntArray10320[0]),
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub2)
						 .anIntArray10317[0]),
						(byte) -88,
						class318_sub1_sub3_sub3_sub2
						    .method2436((byte) 44),
						0,
						class318_sub1_sub3_sub3_sub2
						    .method2436((byte) 110),
						-2, 0);
			}
		    }
		    if ((i_76_ ^ 0xffffffff) == -46) {
			Player class318_sub1_sub3_sub3_sub2
			    = (ClassicLoadingScreen.players
			       [i_77_]);
			if (class318_sub1_sub3_sub3_sub2 != null) {
			    Node.anInt4292 = 0;
			    Class93.anInt1534 = i_72_;
			    Class101.anInt1596++;
			    Class239_Sub20.anInt6048 = 2;
			    Class26.anInt385 = i_73_;
			    BufferedPacket class348_sub47
				= Class286_Sub3.createBufferedPacket((Class299_Sub1_Sub2
							    .aClass351_8706),
							   (Class348_Sub23_Sub2
							    .outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer.method3370
				((byte) -125,
				 (Class182.keyboardListener.method2696(82, -126)
				  ? 1 : 0));
			    ((BufferedPacket) class348_sub47)
				.buffer
				.method3353(i_77_, (byte) 3);
			    Class348_Sub42_Sub14.putBufferedPacket(30,
							    class348_sub47);
			    Class298.method2252(true,
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub2)
						 .anIntArray10320[0]),
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub2)
						 .anIntArray10317[0]),
						(byte) -91,
						class318_sub1_sub3_sub3_sub2
						    .method2436((byte) 70),
						0,
						class318_sub1_sub3_sub3_sub2
						    .method2436((byte) 125),
						-2, 0);
			}
		    }
		    if ((i_76_ ^ 0xffffffff) == -1008) {
			Class239_Sub20.anInt6048 = 2;
			Class318_Sub1_Sub5_Sub2.anInt10164++;
			Class26.anInt385 = i_73_;
			Node.anInt4292 = 0;
			Class93.anInt1534 = i_72_;
			BufferedPacket class348_sub47
			    = Class286_Sub3.createBufferedPacket(Class193.aClass351_2587,
						       (Class348_Sub23_Sub2
							.outgoingGameIsaac));
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3353(Class90.anInt1517 + i_75_, (byte) 3);
			((BufferedPacket) class348_sub47)
			    .buffer.method3395
			    ((byte) -96,
			     (Class182.keyboardListener.method2696(82, -125) ? 1
			      : 0));
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3349(4325, za_Sub2.anInt9780 + i_74_);
			((BufferedPacket) class348_sub47)
			    .buffer.method3335
			    (68, 0x7fffffff & (int) (l >>> 1667663904));
			Class348_Sub42_Sub14.putBufferedPacket(-68, class348_sub47);
			NativeLibTracker.method2307(i_75_, l, i_74_, 25);
		    }
		    if ((i_76_ ^ 0xffffffff) == -24) {
			Player class318_sub1_sub3_sub3_sub2
			    = (ClassicLoadingScreen.players
			       [i_77_]);
			if (class318_sub1_sub3_sub3_sub2 != null) {
			    Class239_Sub20.anInt6048 = 2;
			    Class318_Sub1_Sub4_Sub1.anInt10073++;
			    Node.anInt4292 = 0;
			    Class26.anInt385 = i_73_;
			    Class93.anInt1534 = i_72_;
			    BufferedPacket class348_sub47
				= Class286_Sub3.createBufferedPacket((ColorNode
							    .aClass351_4905),
							   (Class348_Sub23_Sub2
							    .outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer
				.putShort(i_77_);
			    ((BufferedPacket) class348_sub47)
				.buffer.method3395
				((byte) 60,
				 (!Class182.keyboardListener.method2696(82, -121)
				  ? 0 : 1));
			    Class348_Sub42_Sub14.putBufferedPacket(118,
							    class348_sub47);
			    Class298.method2252(true,
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub2)
						 .anIntArray10320[0]),
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub2)
						 .anIntArray10317[0]),
						(byte) -106,
						class318_sub1_sub3_sub3_sub2
						    .method2436((byte) 45),
						0,
						class318_sub1_sub3_sub3_sub2
						    .method2436((byte) 63),
						-2, 0);
			}
		    }
		    if ((i_76_ ^ 0xffffffff) == -17
			&& BufferedRasterizer.aClass46_4730 == null) {
			Class348_Sub40_Sub7.method3065(i_75_, false, i_74_);
			BufferedRasterizer.aClass46_4730
			    = Class348_Sub22.getWidgetChild(i_74_,
							i_75_);
			Class251.method1916(-9343, BufferedRasterizer.aClass46_4730);
		    }
		    if ((i_76_ ^ 0xffffffff) == -9) {
			Player class318_sub1_sub3_sub3_sub2
			    = (ClassicLoadingScreen.players
			       [i_77_]);
			if (class318_sub1_sub3_sub3_sub2 != null) {
			    Class93.anInt1534 = i_72_;
			    Class26.anInt385 = i_73_;
			    Class239_Sub20.anInt6048 = 2;
			    Huffman.anInt3768++;
			    Node.anInt4292 = 0;
			    BufferedPacket class348_sub47
				= Class286_Sub3.createBufferedPacket((Class251
							    .aClass351_3232),
							   (Class348_Sub23_Sub2
							    .outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer.putByte
				((!Class182.keyboardListener.method2696(82, -128)
				  ? 0 : 1));
			    ((BufferedPacket) class348_sub47)
				.buffer
				.method3335(-99, i_77_);
			    Class348_Sub42_Sub14.putBufferedPacket(127,
							    class348_sub47);
			    Class298.method2252(true,
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub2)
						 .anIntArray10320[0]),
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub2)
						 .anIntArray10317[0]),
						(byte) -106,
						class318_sub1_sub3_sub3_sub2
						    .method2436((byte) 100),
						0,
						class318_sub1_sub3_sub3_sub2
						    .method2436((byte) 99),
						-2, 0);
			}
		    }
		    if ((i_76_ ^ 0xffffffff) == -22) {
			Class93.anInt1534 = i_72_;
			Class239_Sub8.anInt5919++;
			Node.anInt4292 = 0;
			Class239_Sub20.anInt6048 = 2;
			Class26.anInt385 = i_73_;
			BufferedPacket class348_sub47
			    = Class286_Sub3.createBufferedPacket(r_Sub1.aClass351_10477,
						       (Class348_Sub23_Sub2
							.outgoingGameIsaac));
			((BufferedPacket) class348_sub47)
			    .buffer
			    .putShort(i_77_);
			((BufferedPacket) class348_sub47)
			    .buffer
			    .putShort(za_Sub2.anInt9780 + i_74_);
			((BufferedPacket) class348_sub47)
			    .buffer
			    .putShort(i_75_ + Class90.anInt1517);
			((BufferedPacket) class348_sub47)
			    .buffer.method3370
			    ((byte) 120,
			     (!Class182.keyboardListener.method2696(82, -123) ? 0
			      : 1));
			Class348_Sub42_Sub14.putBufferedPacket(120, class348_sub47);
			Class348_Sub42_Sub18.method3275(1, i_75_, i_74_);
		    }
		    if ((i_76_ ^ 0xffffffff) == -16) {
			Class239_Sub20.anInt6048 = 1;
			Class26.anInt385 = i_73_;
			Node.anInt4292 = 0;
			Class93.anInt1534 = i_72_;
			Main.anInt5187++;
			BufferedPacket class348_sub47
			    = Class286_Sub3.createBufferedPacket(AbstractBuffer.aClass351_4264,
						       (Class348_Sub23_Sub2
							.outgoingGameIsaac));
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3353(za_Sub2.anInt9780 - -i_74_, (byte) 3);
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3335(-85, Class301.anInt3829);
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3353(Class9.anInt169, (byte) 3);
			((BufferedPacket) class348_sub47)
			    .buffer
			    .putInt(Class149.anInt2046);
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3335(-84, Class90.anInt1517 + i_75_);
			Class348_Sub42_Sub14.putBufferedPacket(-62, class348_sub47);
			Class298.method2252(true, i_74_, i_75_, (byte) -91, 1,
					    0, 1, -4, 0);
		    }
		    if ((i_76_ ^ 0xffffffff) == -61) {
			Class348_Sub22 class348_sub22
			    = ((Class348_Sub22)
			       Class282.aClass356_3654.get((long) i_77_));
			if (class348_sub22 != null) {
			    Class290.anInt3707++;
			    Node.anInt4292 = 0;
			    Class26.anInt385 = i_73_;
			    Class93.anInt1534 = i_72_;
			    Npc class318_sub1_sub3_sub3_sub1
				= (((Class348_Sub22) class348_sub22)
				   .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
			    Class239_Sub20.anInt6048 = 2;
			    BufferedPacket class348_sub47
				= (Class286_Sub3.createBufferedPacket
				   (RuntimeException_Sub1.aClass351_4601,
				    Class348_Sub23_Sub2.outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer
				.putShort(i_77_);
			    ((BufferedPacket) class348_sub47)
				.buffer.method3374
				((byte) -67,
				 (Class182.keyboardListener.method2696(82, -122)
				  ? 1 : 0));
			    Class348_Sub42_Sub14.putBufferedPacket(119,
							    class348_sub47);
			    Class298.method2252(true,
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub1)
						 .anIntArray10320[0]),
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub1)
						 .anIntArray10317[0]),
						(byte) -111,
						class318_sub1_sub3_sub3_sub1
						    .method2436((byte) 65),
						0,
						class318_sub1_sub3_sub3_sub1
						    .method2436((byte) 42),
						-2, 0);
			}
		    }
		    if (i_76_ == 2) {
			Node.anInt4292 = 0;
			Class239_Sub20.anInt6048 = 2;
			r_Sub1.anInt10476++;
			Class26.anInt385 = i_73_;
			Class93.anInt1534 = i_72_;
			BufferedPacket class348_sub47
			    = Class286_Sub3.createBufferedPacket((Class348_Sub16_Sub1
							.aClass351_8857),
						       (Class348_Sub23_Sub2
							.outgoingGameIsaac));
			((BufferedPacket) class348_sub47)
			    .buffer
			    .putShort(Class301.anInt3829);
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3349(4325, za_Sub2.anInt9780 + i_74_);
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3348(-128, Class149.anInt2046);
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3335(-82, Class90.anInt1517 + i_75_);
			((BufferedPacket) class348_sub47)
			    .buffer.method3370
			    ((byte) -74,
			     (!Class182.keyboardListener.method2696(82, -125) ? 0
			      : 1));
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3353(Class9.anInt169, (byte) 3);
			((BufferedPacket) class348_sub47)
			    .buffer.method3353
			    ((int) (l >>> -784932000) & 0x7fffffff, (byte) 3);
			Class348_Sub42_Sub14.putBufferedPacket(117, class348_sub47);
			NativeLibTracker.method2307(i_75_, l, i_74_, 4);
		    }
		    if ((i_76_ ^ 0xffffffff) == -59) {
			Player class318_sub1_sub3_sub3_sub2
			    = (ClassicLoadingScreen.players
			       [i_77_]);
			if (class318_sub1_sub3_sub3_sub2 != null) {
			    Node.anInt4292 = 0;
			    Class93.anInt1534 = i_72_;
			    Class26.anInt385 = i_73_;
			    Class239_Sub20.anInt6048 = 2;
			    Class98.anInt1570++;
			    BufferedPacket class348_sub47
				= Class286_Sub3.createBufferedPacket((Class175
							    .aClass351_2315),
							   (Class348_Sub23_Sub2
							    .outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer.putByte
				((!Class182.keyboardListener.method2696(82, -121)
				  ? 0 : 1));
			    ((BufferedPacket) class348_sub47)
				.buffer
				.method3335(52, i_77_);
			    Class348_Sub42_Sub14.putBufferedPacket(-127,
							    class348_sub47);
			    Class298.method2252(true,
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub2)
						 .anIntArray10320[0]),
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub2)
						 .anIntArray10317[0]),
						(byte) -93,
						class318_sub1_sub3_sub3_sub2
						    .method2436((byte) 119),
						0,
						class318_sub1_sub3_sub3_sub2
						    .method2436((byte) 54),
						-2, 0);
			}
		    }
		    if ((i_76_ ^ 0xffffffff) == -18) {
			Player class318_sub1_sub3_sub3_sub2
			    = (ClassicLoadingScreen.players
			       [i_77_]);
			if (class318_sub1_sub3_sub3_sub2 != null) {
			    Class239_Sub20.anInt6048 = 2;
			    Class93.anInt1534 = i_72_;
			    Class14_Sub3.anInt8625++;
			    Class26.anInt385 = i_73_;
			    Node.anInt4292 = 0;
			    BufferedPacket class348_sub47
				= Class286_Sub3.createBufferedPacket((Class25
							    .aClass351_364),
							   (Class348_Sub23_Sub2
							    .outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer.putByte
				((!Class182.keyboardListener.method2696(82, -126)
				  ? 0 : 1));
			    ((BufferedPacket) class348_sub47)
				.buffer
				.putShort(i_77_);
			    Class348_Sub42_Sub14.putBufferedPacket(121,
							    class348_sub47);
			    Class298.method2252(true,
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub2)
						 .anIntArray10320[0]),
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub2)
						 .anIntArray10317[0]),
						(byte) -123,
						class318_sub1_sub3_sub3_sub2
						    .method2436((byte) 96),
						0,
						class318_sub1_sub3_sub3_sub2
						    .method2436((byte) 97),
						-2, 0);
			}
		    }
		    if (i_76_ == 47) {
			Class26.anInt385 = i_73_;
			Class239_Sub20.anInt6048 = 2;
			Node.anInt4292 = 0;
			BitmapTable.anInt3966++;
			Class93.anInt1534 = i_72_;
			BufferedPacket class348_sub47
			    = Class286_Sub3.createBufferedPacket((FloatBuffer
							.aClass351_9749),
						       (Class348_Sub23_Sub2
							.outgoingGameIsaac));
			((BufferedPacket) class348_sub47)
			    .buffer
			    .putShort(i_77_);
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3335(106, i_74_ - -za_Sub2.anInt9780);
			((BufferedPacket) class348_sub47)
			    .buffer.putByte
			    ((!Class182.keyboardListener.method2696(82, -128) ? 0
			      : 1));
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3349(4325, i_75_ - -Class90.anInt1517);
			Class348_Sub42_Sub14.putBufferedPacket(116, class348_sub47);
			Class348_Sub42_Sub18.method3275(1, i_75_, i_74_);
		    }
		    if ((i_76_ ^ 0xffffffff) == -4) {
			Class151.anInt2065++;
			Class26.anInt385 = i_73_;
			Node.anInt4292 = 0;
			Class239_Sub20.anInt6048 = 2;
			Class93.anInt1534 = i_72_;
			BufferedPacket class348_sub47
			    = Class286_Sub3.createBufferedPacket((Class348_Sub42_Sub17
							.aClass351_9679),
						       (Class348_Sub23_Sub2
							.outgoingGameIsaac));
			((BufferedPacket) class348_sub47)
			    .buffer.method3370
			    ((byte) -83,
			     (!Class182.keyboardListener.method2696(82, -128) ? 0
			      : 1));
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3349(4325, za_Sub2.anInt9780 + i_74_);
			((BufferedPacket) class348_sub47)
			    .buffer
			    .method3353(i_75_ + Class90.anInt1517, (byte) 3);
			((BufferedPacket) class348_sub47)
			    .buffer.putShort
			    (0x7fffffff & (int) (l >>> -863296736));
			Class348_Sub42_Sub14.putBufferedPacket(127, class348_sub47);
			NativeLibTracker.method2307(i_75_, l, i_74_, 63);
		    }
		    if (i_76_ == 20) {
			Class348_Sub22 class348_sub22
			    = ((Class348_Sub22)
			       Class282.aClass356_3654.get((long) i_77_));
			if (class348_sub22 != null) {
			    Class239_Sub20.anInt6048 = 2;
			    Class26.anInt385 = i_73_;
			    Class93.anInt1534 = i_72_;
			    Npc class318_sub1_sub3_sub3_sub1
				= (((Class348_Sub22) class348_sub22)
				   .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
			    Node.anInt4292 = 0;
			    Class328_Sub2.anInt6516++;
			    BufferedPacket class348_sub47
				= Class286_Sub3.createBufferedPacket((Class339
							    .aClass351_4207),
							   (Class348_Sub23_Sub2
							    .outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer
				.method3349(4325, i_77_);
			    ((BufferedPacket) class348_sub47)
				.buffer.method3395
				((byte) -119,
				 (!Class182.keyboardListener.method2696(82, -123)
				  ? 0 : 1));
			    Class348_Sub42_Sub14.putBufferedPacket(-85,
							    class348_sub47);
			    Class298.method2252(true,
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub1)
						 .anIntArray10320[0]),
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub1)
						 .anIntArray10317[0]),
						(byte) -121,
						class318_sub1_sub3_sub3_sub1
						    .method2436((byte) 99),
						0,
						class318_sub1_sub3_sub3_sub1
						    .method2436((byte) 99),
						-2, 0);
			}
		    }
		    if (i > 97) {
			if (i_76_ == 1010) {
			    Class239_Sub20.anInt6048 = 2;
			    Class348_Sub42_Sub18.anInt9686++;
			    Class93.anInt1534 = i_72_;
			    Class26.anInt385 = i_73_;
			    Node.anInt4292 = 0;
			    BufferedPacket class348_sub47
				= Class286_Sub3.createBufferedPacket((Class65
							    .aClass351_1144),
							   (Class348_Sub23_Sub2
							    .outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer
				.putShort(i_77_);
			    Class348_Sub42_Sub14.putBufferedPacket(125,
							    class348_sub47);
			}
			if ((i_76_ ^ 0xffffffff) == -23) {
			    Class239_Sub20.anInt6048 = 2;
			    Node.anInt4292 = 0;
			    Class93.anInt1534 = i_72_;
			    Class26.anInt385 = i_73_;
			    Class348_Sub42_Sub13.anInt9620++;
			    BufferedPacket class348_sub47
				= Class286_Sub3.createBufferedPacket((SocketWorker
							    .aClass351_2661),
							   (Class348_Sub23_Sub2
							    .outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer.method3370
				((byte) -101,
				 (!Class182.keyboardListener.method2696(82, -125)
				  ? 0 : 1));
			    ((BufferedPacket) class348_sub47)
				.buffer
				.method3335(-69, za_Sub2.anInt9780 + i_74_);
			    ((BufferedPacket) class348_sub47)
				.buffer.method3353
				(Class90.anInt1517 + i_75_, (byte) 3);
			    ((BufferedPacket) class348_sub47)
				.buffer
				.putShort(i_77_);
			    Class348_Sub42_Sub14.putBufferedPacket(116,
							    class348_sub47);
			    Class348_Sub42_Sub18.method3275(1, i_75_, i_74_);
			}
			if ((i_76_ ^ 0xffffffff) == -51) {
			    Class26.anInt385 = i_73_;
			    Class239_Sub20.anInt6048 = 2;
			    Node.anInt4292 = 0;
			    Class93.anInt1534 = i_72_;
			    Class228.anInt2975++;
			    BufferedPacket class348_sub47
				= Class286_Sub3.createBufferedPacket((ColorNode
							    .aClass351_4907),
							   (Class348_Sub23_Sub2
							    .outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer
				.method3349(4325, Class9.anInt169);
			    ((BufferedPacket) class348_sub47)
				.buffer.method3353
				((((Class318_Sub1_Sub3_Sub3)
				   Class132.localPlayer)
				  .anInt10290),
				 (byte) 3);
			    ((BufferedPacket) class348_sub47)
				.buffer
				.method3353(Class301.anInt3829, (byte) 3);
			    ((BufferedPacket) class348_sub47)
				.buffer
				.method3356(Class149.anInt2046, -4086);
			    ((BufferedPacket) class348_sub47)
				.buffer.method3374
				((byte) -29,
				 (Class182.keyboardListener.method2696(82, -121)
				  ? 1 : 0));
			    Class348_Sub42_Sub14.putBufferedPacket(-40,
							    class348_sub47);
			}
			if ((i_76_ ^ 0xffffffff) == -19 || i_76_ == 1011)
			    Class348_Sub9.method2780(i_74_,
						     (((Class348_Sub42_Sub12)
						       class348_sub42_sub12)
						      .aString9601),
						     (byte) 5, i_77_, i_75_);
			if (i_76_ == 13) {
			    Widget class46
				= Class348_Sub22.getWidgetChild(i_74_,
							    i_75_);
			    if (class46 != null) {
				Class341.method2678(-2049);
				Class348_Sub44 class348_sub44
				    = Main.method105(class46);
				Class339.method2666(((Class348_Sub44)
						     class348_sub44).anInt7093,
						    class348_sub44
							.method3307(14),
						    class46, (byte) 21);
				Class28.aString5001
				    = Class239_Sub8.method1753(0, class46);
				Class28.aString5000
				    = (((Widget) class46).aString752
				       + "<col=ffffff>");
				if (Class28.aString5001 == null)
				    Class28.aString5001 = "Null";
			    }
			} else {
			    if (i_76_ == 1009 || i_76_ == 1012 || i_76_ == 1002
				|| i_76_ == 1003 || i_76_ == 1006)
				Class65.method696(i_76_, i_74_, i_77_, -1007);
			    if ((i_76_ ^ 0xffffffff) == -26) {
				Class348_Sub22 class348_sub22
				    = ((Class348_Sub22)
				       Class282.aClass356_3654
					   .get((long) i_77_));
				if (class348_sub22 != null) {
				    Class239_Sub20.anInt6048 = 2;
				    Class93.anInt1534 = i_72_;
				    Class299_Sub1_Sub2.anInt8702++;
				    Npc class318_sub1_sub3_sub3_sub1
					= (((Class348_Sub22) class348_sub22)
					   .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
				    Class26.anInt385 = i_73_;
				    Node.anInt4292 = 0;
				    BufferedPacket class348_sub47
					= (Class286_Sub3.createBufferedPacket
					   (Class348_Sub18.aClass351_6814,
					    Class348_Sub23_Sub2.outgoingGameIsaac));
				    ((BufferedPacket) class348_sub47)
					.buffer.putByte
					(!Class182.keyboardListener
					      .method2696(82, -125) ? 0 : 1);
				    ((BufferedPacket) class348_sub47)
					.buffer
					.method3353(i_77_, (byte) 3);
				    Class348_Sub42_Sub14
					.putBufferedPacket(-37, class348_sub47);
				    Class298.method2252
					(true,
					 (((Class318_Sub1_Sub3_Sub3)
					   class318_sub1_sub3_sub3_sub1)
					  .anIntArray10320[0]),
					 (((Class318_Sub1_Sub3_Sub3)
					   class318_sub1_sub3_sub3_sub1)
					  .anIntArray10317[0]),
					 (byte) -85,
					 class318_sub1_sub3_sub3_sub1
					     .method2436((byte) 124),
					 0,
					 class318_sub1_sub3_sub3_sub1
					     .method2436((byte) 84),
					 -2, 0);
				}
			    }
			    if ((i_76_ ^ 0xffffffff) == -58) {
				Player class318_sub1_sub3_sub3_sub2
				    = (ClassicLoadingScreen
				       .players
				       [i_77_]);
				if (class318_sub1_sub3_sub3_sub2 != null) {
				    Class239_Sub20.anInt6048 = 2;
				    Class93.anInt1534 = i_72_;
				    Class369_Sub2.anInt8588++;
				    Node.anInt4292 = 0;
				    Class26.anInt385 = i_73_;
				    BufferedPacket class348_sub47
					= (Class286_Sub3.createBufferedPacket
					   (Class348_Sub42_Sub5.aClass351_9533,
					    Class348_Sub23_Sub2.outgoingGameIsaac));
				    ((BufferedPacket) class348_sub47)
					.buffer
					.method3335(-88, i_77_);
				    ((BufferedPacket) class348_sub47)
					.buffer.method3395
					((byte) -111,
					 Class182.keyboardListener
					     .method2696(82, -127) ? 1 : 0);
				    Class348_Sub42_Sub14
					.putBufferedPacket(125, class348_sub47);
				    Class298.method2252
					(true,
					 (((Class318_Sub1_Sub3_Sub3)
					   class318_sub1_sub3_sub3_sub2)
					  .anIntArray10320[0]),
					 (((Class318_Sub1_Sub3_Sub3)
					   class318_sub1_sub3_sub3_sub2)
					  .anIntArray10317[0]),
					 (byte) -98,
					 class318_sub1_sub3_sub3_sub2
					     .method2436((byte) 83),
					 0,
					 class318_sub1_sub3_sub3_sub2
					     .method2436((byte) 91),
					 -2, 0);
				}
			    }
			    if ((i_76_ ^ 0xffffffff) == -10) {
				Class318_Sub1_Sub3_Sub4.anInt10364++;
				Class26.anInt385 = i_73_;
				Node.anInt4292 = 0;
				Class239_Sub20.anInt6048 = 2;
				Class93.anInt1534 = i_72_;
				BufferedPacket class348_sub47
				    = (Class286_Sub3.createBufferedPacket
				       (Class252.aClass351_3237,
					Class348_Sub23_Sub2.outgoingGameIsaac));
				((BufferedPacket) class348_sub47)
				    .buffer.method3335
				    (-96, Class90.anInt1517 + i_75_);
				((BufferedPacket) class348_sub47)
				    .buffer.method3349
				    (4325,
				     0x7fffffff & (int) (l >>> 1397559072));
				((BufferedPacket) class348_sub47)
				    .buffer.method3353
				    (i_74_ - -za_Sub2.anInt9780, (byte) 3);
				((BufferedPacket) class348_sub47)
				    .buffer.method3395
				    ((byte) -91,
				     (!Class182.keyboardListener.method2696(82,
									  -127)
				      ? 0 : 1));
				Class348_Sub42_Sub14
				    .putBufferedPacket(118, class348_sub47);
				NativeLibTracker.method2307(i_75_, l, i_74_, 24);
			    }
			    if (i_76_ == 44) {
				Class348_Sub22 class348_sub22
				    = ((Class348_Sub22)
				       Class282.aClass356_3654
					   .get((long) i_77_));
				if (class348_sub22 != null) {
				    Npc class318_sub1_sub3_sub3_sub1
					= (((Class348_Sub22) class348_sub22)
					   .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
				    Class93.anInt1534 = i_72_;
				    Node.anInt4292 = 0;
				    Class26.anInt385 = i_73_;
				    Class239_Sub20.anInt6048 = 2;
				    FileArchiveTracker.anInt4773++;
				    BufferedPacket class348_sub47
					= (Class286_Sub3.createBufferedPacket
					   (Class43.aClass351_618,
					    Class348_Sub23_Sub2.outgoingGameIsaac));
				    ((BufferedPacket) class348_sub47)
					.buffer
					.putShort(i_77_);
				    ((BufferedPacket) class348_sub47)
					.buffer.putByte
					(Class182.keyboardListener
					     .method2696(82, -124) ? 1 : 0);
				    Class348_Sub42_Sub14
					.putBufferedPacket(-25, class348_sub47);
				    Class298.method2252
					(true,
					 (((Class318_Sub1_Sub3_Sub3)
					   class318_sub1_sub3_sub3_sub1)
					  .anIntArray10320[0]),
					 (((Class318_Sub1_Sub3_Sub3)
					   class318_sub1_sub3_sub3_sub1)
					  .anIntArray10317[0]),
					 (byte) -107,
					 class318_sub1_sub3_sub3_sub1
					     .method2436((byte) 104),
					 0,
					 class318_sub1_sub3_sub3_sub1
					     .method2436((byte) 50),
					 -2, 0);
				}
			    }
			    if ((i_76_ ^ 0xffffffff) == -11) {
				Class239_Sub20.anInt6048 = 2;
				Class26.anInt385 = i_73_;
				Node.anInt4292 = 0;
				Class300.anInt3820++;
				Class93.anInt1534 = i_72_;
				BufferedPacket class348_sub47
				    = (Class286_Sub3.createBufferedPacket
				       (Class188.aClass351_2512,
					Class348_Sub23_Sub2.outgoingGameIsaac));
				((BufferedPacket) class348_sub47)
				    .buffer.method3335
				    (-108, i_75_ - -Class90.anInt1517);
				((BufferedPacket) class348_sub47)
				    .buffer
				    .method3335(-70, i_77_);
				((BufferedPacket) class348_sub47)
				    .buffer.method3353
				    (za_Sub2.anInt9780 + i_74_, (byte) 3);
				((BufferedPacket) class348_sub47)
				    .buffer.method3374
				    ((byte) -70,
				     (!Class182.keyboardListener.method2696(82,
									  -128)
				      ? 0 : 1));
				Class348_Sub42_Sub14
				    .putBufferedPacket(-22, class348_sub47);
				Class348_Sub42_Sub18.method3275(1, i_75_,
								i_74_);
			    }
			    if (r.aBoolean9722)
				Class341.method2678(-2049);
			    if (LoadingHandler.aClass46_3913 == null
				|| Class108.anInt1656 != 0)
				break;
			    Class251.method1916(-9343, LoadingHandler.aClass46_3913);
			}
		    }
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("daa.A(" + i + ','
						 + ((class348_sub42_sub12
						     != null)
						    ? "{...}" : "null")
						 + ',' + i_72_ + ',' + i_73_
						 + ')'));
	    }
	    break;
	} while (false);
    }
    
    private Class325(int i, int i_78_, Class68 class68) {
	try {
	    anInt4072 = i_78_;
	    aClass68_4071 = class68;
	    ((Class325) this).anInt4070 = i;
	    ((Class325) this).anInt4069
		= ((Class68) aClass68_4071).anInt1178 * anInt4072;
	    if (((Class325) this).anInt4070 >= 16)
		throw new RuntimeException();
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("daa.<init>(" + i + ',' + i_78_
					     + ','
					     + (class68 != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
}
