/* Class348_Sub40_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class348_Sub40_Sub5 extends Class348_Sub40
{
    private short[] aShortArray9116 = new short[512];
    private int anInt9117;
    private int anInt9118 = 1;
    private byte[] aByteArray9119 = new byte[512];
    static int anInt9120;
    static boolean aBoolean9121 = false;
    private int anInt9122;
    static int anInt9123;
    private int anInt9124;
    private int anInt9125 = 2048;
    static int anInt9126;
    static int anInt9127;
    static int anInt9128;
    private int anInt9129;
    static OutgoingPacket aClass351_9130 = new OutgoingPacket(1, -1);
    
    public static void method3059(int i) {
	aClass351_9130 = null;
	if (i >= -111)
	    method3059(-83);
    }
    
    static final int method3060(int i, boolean bool) {
	anInt9128++;
	if (bool != true)
	    aClass351_9130 = null;
	return 0x7f & i >> -1006227701;
    }
    
    private final void method3061(boolean bool) {
	anInt9120++;
	if (bool == true) {
	    Random random = new Random((long) anInt9122);
	    aShortArray9116 = new short[512];
	    if ((anInt9125 ^ 0xffffffff) < -1) {
		for (int i = 0; (i ^ 0xffffffff) > -513; i++)
		    aShortArray9116[i]
			= (short) Model.method1097((byte) 81, anInt9125,
						      random);
	    }
	}
    }
    
    public Class348_Sub40_Sub5() {
	super(0, true);
	anInt9124 = 2;
	anInt9122 = 0;
	anInt9117 = 5;
	anInt9129 = 5;
    }
    
    final void method3044(int i) {
	if (i > 108) {
	    aByteArray9119 = AbstractToolkit.method3664(anInt9122, 124);
	    anInt9126++;
	    method3061(true);
	}
    }
    
    final int[] method3042(int i, int i_0_) {
	anInt9123++;
	int[] is = ((Class348_Sub40) this).aClass191_7032.method1433(0, i);
	if (i_0_ != 255)
	    method3044(-57);
	if (((Class191) ((Class348_Sub40) this).aClass191_7032).aBoolean2570) {
	    int i_1_ = anInt9117 * Class239_Sub18.anIntArray6035[i] + 2048;
	    int i_2_ = i_1_ >> -1096578100;
	    int i_3_ = 1 + i_2_;
	    int i_4_ = 0;
	while_140_:
	    for (/**/; (i_4_ ^ 0xffffffff) > (Class348_Sub40_Sub6.anInt9139
					      ^ 0xffffffff); i_4_++) {
		Class348_Sub42_Sub20.anInt9715 = Class215.anInt2835
		    = Message.anInt2023 = Class135_Sub1.anInt4715
		    = 2147483647;
		int i_5_
		    = 2048 - -(Class318_Sub6.anIntArray6432[i_4_] * anInt9129);
		int i_6_ = i_5_ >> -1684390228;
		int i_7_ = i_6_ + 1;
		for (int i_8_ = i_2_ + -1;
		     (i_3_ ^ 0xffffffff) <= (i_8_ ^ 0xffffffff); i_8_++) {
		    int i_9_
			= 0xff & aByteArray9119[0xff & (i_8_ >= anInt9117
							? i_8_ + -anInt9117
							: i_8_)];
		    for (int i_10_ = -1 + i_6_;
			 (i_10_ ^ 0xffffffff) >= (i_7_ ^ 0xffffffff);
			 i_10_++) {
			int i_11_
			    = 2 * (0xff
				   & aByteArray9119[((anInt9129 > i_10_ ? i_10_
						      : -anInt9129 + i_10_)
						     + i_9_) & 0xff]);
			int i_12_ = (-(i_10_ << -998561588)
				     - (aShortArray9116[i_11_++] - i_5_));
			int i_13_ = (-(i_8_ << 1000534348)
				     + (-aShortArray9116[i_11_] + i_1_));
			int i_14_ = anInt9118;
			int i_15_;
		    while_136_:
			do {
			while_135_:
			    do {
			    while_134_:
				do {
				while_133_:
				    do {
					do {
					    if ((i_14_ ^ 0xffffffff) != -2) {
						if ((i_14_ ^ 0xffffffff)
						    != -4) {
						    if (i_14_ != 4) {
							if ((i_14_
							     ^ 0xffffffff)
							    != -6) {
							    if (i_14_ == 2)
								break while_134_;
							    break while_135_;
							}
						    } else
							break;
						    break while_133_;
						}
					    } else {
						i_15_ = ((i_13_ * i_13_
							  + i_12_ * i_12_)
							 >> 1735086860);
						break while_136_;
					    }
					    i_12_ = i_12_ < 0 ? -i_12_ : i_12_;
					    i_13_ = ((i_13_ ^ 0xffffffff) > -1
						     ? -i_13_ : i_13_);
					    i_15_ = (i_12_ <= i_13_ ? i_13_
						     : i_12_);
					    break while_136_;
					} while (false);
					i_12_
					    = (int) ((Math.sqrt
						      ((double) ((float) (((i_12_
									    ^ 0xffffffff)
									   > -1)
									  ? -i_12_
									  : i_12_)
								 / 4096.0F)))
						     * 4096.0);
					i_13_
					    = (int) (4096.0
						     * (Math.sqrt
							((double) ((float) ((i_13_
									     < 0)
									    ? -i_13_
									    : i_13_)
								   / 4096.0F))));
					i_15_ = i_13_ + i_12_;
					i_15_ = i_15_ * i_15_ >> 1689737804;
					break while_136_;
				    } while (false);
				    i_13_ *= i_13_;
				    i_12_ *= i_12_;
				    i_15_
					= (int) (4096.0
						 * (Math.sqrt
						    (Math.sqrt
						     ((double) ((float) (i_12_
									 + i_13_)
								/ 1.6777216E7F)))));
				    break while_136_;
				} while (false);
				i_15_ = (((i_12_ ^ 0xffffffff) > -1 ? -i_12_
					  : i_12_)
					 - -(i_13_ >= 0 ? i_13_ : -i_13_));
				break while_136_;
			    } while (false);
			    i_15_ = (int) (4096.0
					   * (Math.sqrt
					      ((double) ((float) (i_12_ * i_12_
								  - -(i_13_
								      * i_13_))
							 / 1.6777216E7F))));
			} while (false);
			if (Class348_Sub42_Sub20.anInt9715 <= i_15_) {
			    if ((Class215.anInt2835 ^ 0xffffffff)
				>= (i_15_ ^ 0xffffffff)) {
				if ((Message.anInt2023 ^ 0xffffffff)
				    < (i_15_ ^ 0xffffffff)) {
				    Class135_Sub1.anInt4715
					= Message.anInt2023;
				    Message.anInt2023 = i_15_;
				} else if ((Class135_Sub1.anInt4715
					    ^ 0xffffffff)
					   < (i_15_ ^ 0xffffffff))
				    Class135_Sub1.anInt4715 = i_15_;
			    } else {
				Class135_Sub1.anInt4715 = Message.anInt2023;
				Message.anInt2023 = Class215.anInt2835;
				Class215.anInt2835 = i_15_;
			    }
			} else {
			    Class135_Sub1.anInt4715 = Message.anInt2023;
			    Message.anInt2023 = Class215.anInt2835;
			    Class215.anInt2835
				= Class348_Sub42_Sub20.anInt9715;
			    Class348_Sub42_Sub20.anInt9715 = i_15_;
			}
		    }
		}
		int i_16_ = anInt9124;
	    while_138_:
		do {
		while_137_:
		    do {
			do {
			    if ((i_16_ ^ 0xffffffff) != -1) {
				if (i_16_ != 1) {
				    if (i_16_ != 3) {
					if (i_16_ != 4) {
					    if (i_16_ == 2)
						break while_138_;
					    continue while_140_;
					}
				    } else
					break;
				    break while_137_;
				}
			    } else {
				is[i_4_] = Class348_Sub42_Sub20.anInt9715;
				continue while_140_;
			    }
			    is[i_4_] = Class215.anInt2835;
			    continue while_140_;
			} while (false);
			is[i_4_] = Message.anInt2023;
			continue while_140_;
		    } while (false);
		    is[i_4_] = Class135_Sub1.anInt4715;
		    continue while_140_;
		} while (false);
		is[i_4_]
		    = Class215.anInt2835 + -Class348_Sub42_Sub20.anInt9715;
	    }
	}
	return is;
    }
    
    final void method3049(ByteBuffer class348_sub49, int i, int i_17_) {
	if (i_17_ == 31015) {
	    int i_18_ = i;
	while_145_:
	    do {
	    while_144_:
		do {
		while_143_:
		    do {
		    while_142_:
			do {
			while_141_:
			    do {
				do {
				    if (i_18_ != 0) {
					if ((i_18_ ^ 0xffffffff) != -2) {
					    if (i_18_ != 2) {
						if ((i_18_ ^ 0xffffffff)
						    != -4) {
						    if (i_18_ != 4) {
							if ((i_18_
							     ^ 0xffffffff)
							    != -6) {
							    if ((i_18_
								 ^ 0xffffffff)
								== -7)
								break while_144_;
							    break while_145_;
							}
						    } else
							break while_142_;
						    break while_143_;
						}
					    } else
						break;
					    break while_141_;
					}
				    } else {
					anInt9129 = anInt9117
					    = class348_sub49
						  .getUByte();
					break while_145_;
				    }
				    anInt9122
					= class348_sub49
					      .getUByte();
				    break while_145_;
				} while (false);
				anInt9125
				    = class348_sub49.getShort();
				break while_145_;
			    } while (false);
			    anInt9124
				= class348_sub49.getUByte();
			    break while_145_;
			} while (false);
			anInt9118 = class348_sub49.getUByte();
			break while_145_;
		    } while (false);
		    anInt9129 = class348_sub49.getUByte();
		    break while_145_;
		} while (false);
		anInt9117 = class348_sub49.getUByte();
	    } while (false);
	    anInt9127++;
	}
    }
}
