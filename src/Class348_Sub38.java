/* Class348_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class Class348_Sub38 extends Node
{
    static int anInt7000;
    private float[][] aFloatArrayArray7001;
    private Interface5_Impl2 anInterface5_Impl2_7002;
    static int anInt7003;
    private Class348_Sub1 aClass348_Sub1_7004;
    private float[][] aFloatArrayArray7005;
    static int anInt7006 = 0;
    private NativeToolkit aHa_Sub3_7007;
    static int anInt7008 = 0;
    static int anInt7009;
    private int anInt7010;
    private HashTable aClass356_7011;
    static int anInt7012;
    private int anInt7013;
    private int anInt7014;
    static IncomingPacket aClass114_7015 = new IncomingPacket(33, 3);
    private float[][] aFloatArrayArray7016;
    private int anInt7017;
    private int anInt7018;
    private s_Sub3 aS_Sub3_7019;
    private Interface5_Impl1 anInterface5_Impl1_7020;
    private Stream aStream7021;
    private Stream aStream7022;
    private int anInt7023;
    
    final void method3032(int i, int i_0_, boolean[][] bools, boolean bool,
			  int i_1_) {
	anInt7012++;
	if (anInterface5_Impl2_7002 != null) {
	    if (bool != false)
		method3032(-50, -122, null, true, 25);
	    if (anInt7023 <= i_0_ + i_1_ && -i_0_ + i_1_ <= anInt7017
		&& (i - -i_0_ ^ 0xffffffff) <= (anInt7014 ^ 0xffffffff)
		&& -i_0_ + i <= anInt7010) {
		for (int i_2_ = anInt7014; anInt7010 >= i_2_; i_2_++) {
		    for (int i_3_ = anInt7023;
			 (i_3_ ^ 0xffffffff) >= (anInt7017 ^ 0xffffffff);
			 i_3_++) {
			int i_4_ = -i_1_ + i_3_;
			int i_5_ = -i + i_2_;
			if ((i_4_ ^ 0xffffffff) < (-i_0_ ^ 0xffffffff)
			    && i_4_ < i_0_ && i_5_ > -i_0_ && i_0_ > i_5_
			    && bools[i_4_ - -i_0_][i_0_ + i_5_]) {
			    aHa_Sub3_7007.method3909
				((byte) (int) (255.0F * aClass348_Sub1_7004
							    .method2721(-37)),
				 -112);
			    aHa_Sub3_7007
				.method3925(-123, anInterface5_Impl1_7020, 0);
			    aHa_Sub3_7007.method3862(0,
						     (((NativeToolkit) aHa_Sub3_7007)
						      .aClass130_8202));
			    aHa_Sub3_7007.method3938(Class247.aClass21_3181,
						     anInt7018 / 3,
						     anInterface5_Impl2_7002,
						     0, 0, anInt7013, 116);
			    return;
			}
		    }
		}
	    }
	}
    }
    
    private final void method3033(int i, int i_6_, int i_7_, int i_8_,
				  int i_9_, int i_10_, int i_11_) {
	anInt7003++;
	long l = -1L;
	int i_12_ = i_10_ + (i_6_ << ((s) aS_Sub3_7019).anInt4588);
	int i_13_ = i_8_ - -(i_9_ << ((s) aS_Sub3_7019).anInt4588);
	int i_14_ = aS_Sub3_7019.method3986(i_12_, i_13_, (byte) -127);
	if ((i_10_ & 0x7f ^ 0xffffffff) == -1
	    || (i_8_ & 0x7f ^ 0xffffffff) == -1) {
	    l = ((long) i_13_ & 0xffffL) << 926055376 | (long) i_12_ & 0xffffL;
	    Node class348 = aClass356_7011.get(l);
	    if (class348 != null) {
		method3034((((Class348_Sub29) (Class348_Sub29) class348)
			    .aShort6911),
			   (byte) 49);
		return;
	    }
	}
	short i_15_ = (short) anInt7013++;
	if ((l ^ 0xffffffffffffffffL) != 0L)
	    aClass356_7011.putNode(l,
				      new Class348_Sub29(i_15_));
	float f;
	float f_16_;
	float f_17_;
	if (i_10_ == 0 && i_8_ == 0) {
	    f_16_ = aFloatArrayArray7016[i_11_][i];
	    f_17_ = aFloatArrayArray7005[i_11_][i];
	    f = aFloatArrayArray7001[i_11_][i];
	} else if ((i_10_ ^ 0xffffffff) != (((s) aS_Sub3_7019).anInt4592
					    ^ 0xffffffff)
		   || (i_8_ ^ 0xffffffff) != -1) {
	    if (((s) aS_Sub3_7019).anInt4592 != i_10_
		|| ((((s) aS_Sub3_7019).anInt4592 ^ 0xffffffff)
		    != (i_8_ ^ 0xffffffff))) {
		if (i_10_ == 0 && i_8_ == ((s) aS_Sub3_7019).anInt4592) {
		    f = aFloatArrayArray7001[i_11_][i + 1];
		    f_16_ = aFloatArrayArray7016[i_11_][1 + i];
		    f_17_ = aFloatArrayArray7005[i_11_][i - -1];
		} else {
		    float f_18_
			= (float) i_10_ / (float) ((s) aS_Sub3_7019).anInt4592;
		    float f_19_
			= (float) i_8_ / (float) ((s) aS_Sub3_7019).anInt4592;
		    float f_20_ = aFloatArrayArray7005[i_11_][i];
		    float f_21_ = aFloatArrayArray7016[i_11_][i];
		    float f_22_ = aFloatArrayArray7001[i_11_][i];
		    float f_23_ = aFloatArrayArray7005[1 + i_11_][i];
		    float f_24_ = aFloatArrayArray7016[i_11_ - -1][i];
		    f_22_ += f_18_ * (aFloatArrayArray7001[i_11_][i - -1]
				      - f_22_);
		    f_21_ += ((aFloatArrayArray7016[i_11_][1 + i] - f_21_)
			      * f_18_);
		    f_24_
			+= f_18_ * (-f_24_
				    + aFloatArrayArray7016[i_11_ - -1][1 + i]);
		    float f_25_ = aFloatArrayArray7001[i_11_ + 1][i];
		    f_20_ += ((aFloatArrayArray7005[i_11_][1 + i] - f_20_)
			      * f_18_);
		    f_23_ += f_18_ * (aFloatArrayArray7005[i_11_ - -1][i - -1]
				      - f_23_);
		    f_17_ = f_20_ + (f_23_ - f_20_) * f_19_;
		    f_16_ = (f_24_ - f_21_) * f_19_ + f_21_;
		    f_25_ += f_18_ * (aFloatArrayArray7001[1 + i_11_][i - -1]
				      - f_25_);
		    f = f_22_ + (-f_22_ + f_25_) * f_19_;
		}
	    } else {
		f_17_ = aFloatArrayArray7005[1 + i_11_][i + 1];
		f = aFloatArrayArray7001[i_11_ - -1][1 + i];
		f_16_ = aFloatArrayArray7016[i_11_ + 1][1 + i];
	    }
	} else {
	    f_16_ = aFloatArrayArray7016[i_11_ + 1][i];
	    f = aFloatArrayArray7001[1 + i_11_][i];
	    f_17_ = aFloatArrayArray7005[i_11_ + 1][i];
	}
	float f_26_ = (float) (-i_12_ + aClass348_Sub1_7004.method2724(-1));
	float f_27_ = (float) (aClass348_Sub1_7004.method2722(126) - i_14_);
	float f_28_
	    = (float) (-i_13_ + aClass348_Sub1_7004.method2717((byte) 102));
	float f_29_
	    = (float) Math.sqrt((double) (f_28_ * f_28_
					  + (f_26_ * f_26_ + f_27_ * f_27_)));
	float f_30_ = 1.0F / f_29_;
	f_26_ *= f_30_;
	f_27_ *= f_30_;
	f_28_ *= f_30_;
	float f_31_ = f_29_ / (float) aClass348_Sub1_7004.method2723(-1);
	if (i_7_ == -29343) {
	    float f_32_ = -(f_31_ * f_31_) + 1.0F;
	    if (f_32_ < 0.0F)
		f_32_ = 0.0F;
	    float f_33_ = f_28_ * f + (f_26_ * f_17_ + f_16_ * f_27_);
	    if (f_33_ < 0.0F)
		f_33_ = 0.0F;
	    float f_34_ = f_32_ * f_33_ * 2.0F;
	    if (f_34_ > 1.0F)
		f_34_ = 1.0F;
	    int i_35_ = aClass348_Sub1_7004.method2720(-1);
	    int i_36_ = (int) (f_34_ * (float) (0xff & i_35_ >> 331175152));
	    if ((i_36_ ^ 0xffffffff) < -256)
		i_36_ = 255;
	    int i_37_
		= (int) (f_34_ * (float) ((0xff76 & i_35_) >> -1961847640));
	    if (i_37_ > 255)
		i_37_ = 255;
	    int i_38_ = (int) ((float) (i_35_ & 0xff) * f_34_);
	    if ((i_38_ ^ 0xffffffff) < -256)
		i_38_ = 255;
	    if (!Stream.c()) {
		aStream7022.b((float) i_12_);
		aStream7022.b((float) i_14_);
		aStream7022.b((float) i_13_);
	    } else {
		aStream7022.a((float) i_12_);
		aStream7022.a((float) i_14_);
		aStream7022.a((float) i_13_);
	    }
	    if (((NativeToolkit) aHa_Sub3_7007).anInt8178 != 0) {
		aStream7022.f(i_36_);
		aStream7022.f(i_37_);
		aStream7022.f(i_38_);
	    } else {
		aStream7022.f(i_38_);
		aStream7022.f(i_37_);
		aStream7022.f(i_36_);
	    }
	    aStream7022.f(255);
	    method3034(i_15_, (byte) 49);
	}
    }
    
    private final void method3034(short i, byte i_39_) {
	if (Stream.c())
	    aStream7021.d(i);
	else
	    aStream7021.a(i);
	if (i_39_ == 49)
	    anInt7000++;
    }
    
    public static void method3035(int i) {
	aClass114_7015 = null;
	if (i != 1)
	    method3035(-34);
    }
    
    Class348_Sub38(NativeToolkit var_ha_Sub3, s_Sub3 var_s_Sub3,
		   Class348_Sub1 class348_sub1, int[] is) {
	try {
	    aHa_Sub3_7007 = var_ha_Sub3;
	    aS_Sub3_7019 = var_s_Sub3;
	    aClass348_Sub1_7004 = class348_sub1;
	    int i = (aClass348_Sub1_7004.method2723(-1)
		     + -(((s) var_s_Sub3).anInt4592 >> -108667167));
	    anInt7023 = (-i + aClass348_Sub1_7004.method2724(-1)
			 >> ((s) var_s_Sub3).anInt4588);
	    anInt7017 = (aClass348_Sub1_7004.method2724(-1) + i
			 >> ((s) var_s_Sub3).anInt4588);
	    anInt7014 = (-i + aClass348_Sub1_7004.method2717((byte) 124)
			 >> ((s) var_s_Sub3).anInt4588);
	    anInt7010 = (aClass348_Sub1_7004.method2717((byte) 72) + i
			 >> ((s) var_s_Sub3).anInt4588);
	    int i_40_ = anInt7017 - anInt7023 - -1;
	    int i_41_ = 1 + -anInt7014 + anInt7010;
	    aFloatArrayArray7005 = new float[1 + i_40_][i_41_ - -1];
	    aFloatArrayArray7016 = new float[i_40_ + 1][i_41_ + 1];
	    aFloatArrayArray7001 = new float[1 + i_40_][i_41_ - -1];
	    for (int i_42_ = 0; (i_41_ ^ 0xffffffff) <= (i_42_ ^ 0xffffffff);
		 i_42_++) {
		int i_43_ = anInt7014 + i_42_;
		if (i_43_ > 0
		    && ((i_43_ ^ 0xffffffff)
			> (-1 + ((s) aS_Sub3_7019).anInt4590 ^ 0xffffffff))) {
		    for (int i_44_ = 0;
			 (i_40_ ^ 0xffffffff) <= (i_44_ ^ 0xffffffff);
			 i_44_++) {
			int i_45_ = anInt7023 + i_44_;
			if ((i_45_ ^ 0xffffffff) < -1
			    && i_45_ < ((s) aS_Sub3_7019).anInt4587 + -1) {
			    int i_46_
				= (var_s_Sub3.method3982((byte) -86, i_43_,
							 i_45_ + 1)
				   - var_s_Sub3.method3982((byte) -86, i_43_,
							   i_45_ + -1));
			    int i_47_
				= (var_s_Sub3.method3982((byte) -86, 1 + i_43_,
							 i_45_)
				   + -var_s_Sub3.method3982((byte) -86,
							    i_43_ + -1,
							    i_45_));
			    float f
				= (float) (1.0 / (Math.sqrt
						  ((double) (i_47_ * i_47_
							     + (i_46_ * i_46_
								- -65536)))));
			    aFloatArrayArray7005[i_44_][i_42_]
				= (float) i_46_ * f;
			    aFloatArrayArray7016[i_44_][i_42_] = -256.0F * f;
			    aFloatArrayArray7001[i_44_][i_42_]
				= (float) i_47_ * f;
			}
		    }
		}
	    }
	    int i_48_ = 0;
	    for (int i_49_ = anInt7014; anInt7010 >= i_49_; i_49_++) {
		if ((i_49_ ^ 0xffffffff) <= -1
		    && ((s) var_s_Sub3).anInt4590 > i_49_) {
		    for (int i_50_ = anInt7023;
			 (i_50_ ^ 0xffffffff) >= (anInt7017 ^ 0xffffffff);
			 i_50_++) {
			if ((i_50_ ^ 0xffffffff) <= -1
			    && ((s) var_s_Sub3).anInt4587 > i_50_) {
			    int i_51_ = is[i_48_];
			    int[] is_52_
				= (((s_Sub3) var_s_Sub3)
				   .anIntArrayArrayArray8296[i_50_][i_49_]);
			    if (is_52_ != null && i_51_ != 0) {
				if (i_51_ == 1) {
				    int i_53_ = 0;
				    while (is_52_.length > i_53_) {
					if ((is_52_[i_53_++] ^ 0xffffffff) != 0
					    && ((is_52_[i_53_++] ^ 0xffffffff)
						!= 0)
					    && is_52_[i_53_++] != -1)
					    anInt7018 += 3;
				    }
				} else
				    anInt7018 += 3;
			    }
			}
			i_48_++;
		    }
		} else
		    i_48_ += -anInt7023 + anInt7017;
	    }
	    if ((anInt7018 ^ 0xffffffff) < -1) {
		aClass356_7011
		    = new HashTable(Class33.method340(anInt7018, (byte) 108));
		anInterface5_Impl2_7002
		    = aHa_Sub3_7007.method3840(-28633, false);
		anInterface5_Impl2_7002.method23(15959, anInt7018);
		jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer
		    = aHa_Sub3_7007.method3869((byte) 86, false,
					       16 * anInt7018);
		aStream7022 = new Stream(nativeheapbuffer);
		for (;;) {
		    Buffer buffer
			= anInterface5_Impl2_7002.method24(true, false);
		    if (buffer != null) {
			aStream7021 = new Stream(buffer);
			i_48_ = 0;
			int i_54_ = 0;
			for (int i_55_ = anInt7014; anInt7010 >= i_55_;
			     i_55_++) {
			    if (i_55_ >= 0
				&& ((((s) var_s_Sub3).anInt4590 ^ 0xffffffff)
				    < (i_55_ ^ 0xffffffff))) {
				int i_56_ = 0;
				for (int i_57_ = anInt7023; anInt7017 >= i_57_;
				     i_57_++) {
				    if ((i_57_ ^ 0xffffffff) <= -1
					&& ((((s) var_s_Sub3).anInt4587
					     ^ 0xffffffff)
					    < (i_57_ ^ 0xffffffff))) {
					int i_58_ = is[i_48_];
					int[] is_59_
					    = (((s_Sub3) var_s_Sub3)
					       .anIntArrayArrayArray8296[i_57_]
					       [i_55_]);
					if (is_59_ != null && i_58_ != 0) {
					    if ((i_58_ ^ 0xffffffff) != -2) {
						if (i_58_ == 3) {
						    method3033(i_54_, i_57_,
							       -29343, 0,
							       i_55_, 0,
							       i_56_);
						    method3033(i_54_, i_57_,
							       -29343, 0,
							       i_55_,
							       (((s)
								 var_s_Sub3)
								.anInt4592),
							       i_56_);
						    method3033(i_54_, i_57_,
							       -29343,
							       (((s)
								 var_s_Sub3)
								.anInt4592),
							       i_55_, 0,
							       i_56_);
						} else if (i_58_ != 2) {
						    if (i_58_ == 5) {
							method3033
							    (i_54_, i_57_,
							     -29343,
							     (((s) var_s_Sub3)
							      .anInt4592),
							     i_55_,
							     (((s) var_s_Sub3)
							      .anInt4592),
							     i_56_);
							method3033
							    (i_54_, i_57_,
							     -29343,
							     (((s) var_s_Sub3)
							      .anInt4592),
							     i_55_, 0, i_56_);
							method3033
							    (i_54_, i_57_,
							     -29343, 0, i_55_,
							     (((s) var_s_Sub3)
							      .anInt4592),
							     i_56_);
						    } else if ((i_58_
								^ 0xffffffff)
							       == -5) {
							method3033
							    (i_54_, i_57_,
							     -29343,
							     (((s) var_s_Sub3)
							      .anInt4592),
							     i_55_, 0, i_56_);
							method3033(i_54_,
								   i_57_,
								   -29343, 0,
								   i_55_, 0,
								   i_56_);
							method3033
							    (i_54_, i_57_,
							     -29343,
							     (((s) var_s_Sub3)
							      .anInt4592),
							     i_55_,
							     (((s) var_s_Sub3)
							      .anInt4592),
							     i_56_);
						    }
						} else {
						    method3033(i_54_, i_57_,
							       -29343, 0,
							       i_55_,
							       (((s)
								 var_s_Sub3)
								.anInt4592),
							       i_56_);
						    method3033(i_54_, i_57_,
							       -29343,
							       (((s)
								 var_s_Sub3)
								.anInt4592),
							       i_55_,
							       (((s)
								 var_s_Sub3)
								.anInt4592),
							       i_56_);
						    method3033(i_54_, i_57_,
							       -29343, 0,
							       i_55_, 0,
							       i_56_);
						}
					    } else {
						int[] is_60_
						    = (((s_Sub3) var_s_Sub3)
						       .anIntArrayArrayArray8321
						       [i_57_][i_55_]);
						int[] is_61_
						    = (((s_Sub3) var_s_Sub3)
						       .anIntArrayArrayArray8313
						       [i_57_][i_55_]);
						int i_62_ = 0;
						while ((i_62_ ^ 0xffffffff)
						       > (is_59_.length
							  ^ 0xffffffff)) {
						    if ((is_59_[i_62_]
							 ^ 0xffffffff) == 0
							|| (is_59_[1 + i_62_]
							    ^ 0xffffffff) == 0
							|| (is_59_[i_62_ + 2]
							    ^ 0xffffffff) == 0)
							i_62_ += 3;
						    else {
							method3033(i_54_,
								   i_57_,
								   -29343,
								   (is_61_
								    [i_62_]),
								   i_55_,
								   (is_60_
								    [i_62_]),
								   i_56_);
							i_62_++;
							method3033(i_54_,
								   i_57_,
								   -29343,
								   (is_61_
								    [i_62_]),
								   i_55_,
								   (is_60_
								    [i_62_]),
								   i_56_);
							i_62_++;
							method3033(i_54_,
								   i_57_,
								   -29343,
								   (is_61_
								    [i_62_]),
								   i_55_,
								   (is_60_
								    [i_62_]),
								   i_56_);
							i_62_++;
						    }
						}
					    }
					}
				    }
				    i_48_++;
				    i_56_++;
				}
			    } else
				i_48_ += anInt7017 + -anInt7023;
			    i_54_++;
			}
			aStream7021.a();
			if (anInterface5_Impl2_7002.method22(-23))
			    break;
			aStream7022.e(0);
			aClass356_7011.removeAll(0);
		    }
		}
		aStream7022.a();
		anInterface5_Impl1_7020
		    = aHa_Sub3_7007.method3889(false, 16711680);
		anInterface5_Impl1_7020.method17(nativeheapbuffer, 16,
						 16 * anInt7013, (byte) -108);
	    } else {
		anInterface5_Impl1_7020 = null;
		anInterface5_Impl2_7002 = null;
	    }
	    aFloatArrayArray7005 = aFloatArrayArray7016
		= aFloatArrayArray7001 = null;
	    aStream7022 = null;
	    aStream7021 = null;
	    aClass356_7011 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("sea.<init>("
			+ (var_ha_Sub3 != null ? "{...}" : "null") + ','
			+ (var_s_Sub3 != null ? "{...}" : "null") + ','
			+ (class348_sub1 != null ? "{...}" : "null") + ','
			+ (is != null ? "{...}" : "null") + ')'));
	}
    }
}
