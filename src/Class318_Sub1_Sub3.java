/* Class318_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class318_Sub1_Sub3 extends Class318_Sub1
{
    static int anInt8739;
    static int anInt8740;
    boolean aBoolean8741;
    static int anInt8742;
    short aShort8743;
    static Deque aClass262_8744 = new Deque();
    byte aByte8745;
    static int anInt8746;
    short aShort8747;
    static int anInt8748;
    static int anInt8749;
    short aShort8750;
    short aShort8751;
    static int anInt8752;
    static int anInt8753;
    static int anInt8754;
    static IndexLoader widgetSpriteIndexLoader;
    static IncomingPacket aClass114_8756 = new IncomingPacket(107, 6);
    
    final boolean method2378(int i) {
	anInt8740++;
	if (i != 0)
	    ((Class318_Sub1_Sub3) this).aShort8747 = (short) -75;
	for (int i_0_ = ((Class318_Sub1_Sub3) this).aShort8743;
	     i_0_ <= ((Class318_Sub1_Sub3) this).aShort8751; i_0_++) {
	    for (int i_1_ = ((Class318_Sub1_Sub3) this).aShort8750;
		 ((((Class318_Sub1_Sub3) this).aShort8747 ^ 0xffffffff)
		  <= (i_1_ ^ 0xffffffff));
		 i_1_++) {
		int i_2_ = (-Class239_Sub25.anInt6111 + i_0_
			    + Class318_Sub1_Sub4_Sub1.anInt10084);
		if ((i_2_ ^ 0xffffffff) <= -1
		    && ((i_2_ ^ 0xffffffff)
			> (Class99.aBooleanArrayArray1572.length
			   ^ 0xffffffff))) {
		    int i_3_ = (Class318_Sub1_Sub4_Sub1.anInt10084
				+ (i_1_ - Class285_Sub2.anInt8502));
		    if (i_3_ >= 0
			&& ((i_3_ ^ 0xffffffff)
			    > (Class99.aBooleanArrayArray1572.length
			       ^ 0xffffffff))
			&& Class99.aBooleanArrayArray1572[i_2_][i_3_])
			return true;
		}
	    }
	}
	return false;
    }
    
    final boolean method2382(byte i) {
	anInt8748++;
	if (i > -51)
	    return true;
	return Class318_Sub2.method2499(((Class318_Sub1) this).aByte6376,
					((Class318_Sub1_Sub3) this).aShort8747,
					((Class318_Sub1_Sub3) this).aShort8750,
					this.method2394(true),
					((Class318_Sub1_Sub3) this).aShort8743,
					(byte) 116,
					(((Class318_Sub1_Sub3) this)
					 .aShort8751));
    }
    
    static final int method2408(byte i) {
	anInt8754++;
	int i_4_ = -71 % ((-2 - i) / 44);
	return Class348_Sub40_Sub31.anInt9411++;
    }
    
    void method2409(byte i) {
	if (i <= -109)
	    anInt8746++;
    }
    
    static final boolean method2410(byte i, int i_5_, int i_6_) {
	anInt8752++;
	if (i >= -21)
	    return true;
	if (!Class5_Sub1.aBoolean8335)
	    return false;
	int i_7_ = i_6_ >> 1784451792;
	int i_8_ = i_6_ & 0xffff;
	if (Class348_Sub40_Sub33.aClass46ArrayArray9427[i_7_] == null
	    || Class348_Sub40_Sub33.aClass46ArrayArray9427[i_7_][i_8_] == null)
	    return false;
	Widget class46
	    = Class348_Sub40_Sub33.aClass46ArrayArray9427[i_7_][i_8_];
	if (i_5_ == -1 && ((Widget) class46).type == 0) {
	    for (Class348_Sub42_Sub12 class348_sub42_sub12
		     = ((Class348_Sub42_Sub12)
			Class348_Sub40_Sub4.aClass262_9111.getFirst(4));
		 class348_sub42_sub12 != null;
		 class348_sub42_sub12
		     = (Class348_Sub42_Sub12) Class348_Sub40_Sub4
						  .aClass262_9111
						  .nextForward((byte) 56)) {
		if ((((Class348_Sub42_Sub12) class348_sub42_sub12).anInt9608
		     ^ 0xffffffff) == -7
		    || (((Class348_Sub42_Sub12) class348_sub42_sub12).anInt9608
			^ 0xffffffff) == -1012
		    || (((Class348_Sub42_Sub12) class348_sub42_sub12).anInt9608
			== 13)
		    || (((Class348_Sub42_Sub12) class348_sub42_sub12).anInt9608
			== 18)
		    || (((Class348_Sub42_Sub12) class348_sub42_sub12).anInt9608
			== 16)) {
		    for (Widget class46_9_
			     = AbstractFontRasterizer.getWidget((((Class348_Sub42_Sub12)
						     class348_sub42_sub12)
						    .anInt9607));
			 class46_9_ != null;
			 class46_9_ = Class237.method1687(class46_9_, 3)) {
			if (((Widget) class46_9_).anInt830
			    == ((Widget) class46).anInt830)
			    return true;
		    }
		}
	    }
	} else {
	    for (Class348_Sub42_Sub12 class348_sub42_sub12
		     = ((Class348_Sub42_Sub12)
			Class348_Sub40_Sub4.aClass262_9111.getFirst(4));
		 class348_sub42_sub12 != null;
		 class348_sub42_sub12
		     = (Class348_Sub42_Sub12) Class348_Sub40_Sub4
						  .aClass262_9111
						  .nextForward((byte) 93)) {
		if ((((Class348_Sub42_Sub12) class348_sub42_sub12).anInt9602
		     == i_5_)
		    && (((Class348_Sub42_Sub12) class348_sub42_sub12).anInt9607
			== ((Widget) class46).anInt830)
		    && (((((Class348_Sub42_Sub12) class348_sub42_sub12)
			  .anInt9608)
			 ^ 0xffffffff) == -7
			|| ((((Class348_Sub42_Sub12) class348_sub42_sub12)
			     .anInt9608)
			    ^ 0xffffffff) == -1012
			|| ((((Class348_Sub42_Sub12) class348_sub42_sub12)
			     .anInt9608)
			    ^ 0xffffffff) == -14
			|| ((((Class348_Sub42_Sub12) class348_sub42_sub12)
			     .anInt9608)
			    ^ 0xffffffff) == -19
			|| ((((Class348_Sub42_Sub12) class348_sub42_sub12)
			     .anInt9608)
			    ^ 0xffffffff) == -17))
		    return true;
	    }
	}
	return false;
    }
    
    Class318_Sub1_Sub3(int i, int i_10_, int i_11_, int i_12_, int i_13_,
		       int i_14_, int i_15_, int i_16_, int i_17_,
		       boolean bool, byte i_18_) {
	((Class318_Sub1) this).anInt6382 = i_12_;
	((Class318_Sub1_Sub3) this).aBoolean8741 = bool;
	((Class318_Sub1_Sub3) this).aShort8747 = (short) i_17_;
	((Class318_Sub1) this).anInt6377 = i_11_;
	((Class318_Sub1_Sub3) this).aByte8745 = i_18_;
	((Class318_Sub1_Sub3) this).aShort8751 = (short) i_15_;
	((Class318_Sub1) this).anInt6388 = i_13_;
	((Class318_Sub1) this).aByte6381 = (byte) i;
	((Class318_Sub1_Sub3) this).aShort8750 = (short) i_16_;
	((Class318_Sub1_Sub3) this).aShort8743 = (short) i_14_;
	((Class318_Sub1) this).aByte6376 = (byte) i_10_;
    }
    
    static final int method2411(Class113 class113, int i) {
	anInt8742++;
	if (class113 == za_Sub1.aClass113_9773)
	    return 9216;
	if (class113 == Class31.aClass113_430)
	    return 34065;
	if (Class261.aClass113_3314 == class113)
	    return 34066;
	if (i != 25602)
	    method2413(-121, null);
	throw new IllegalArgumentException();
    }
    
    public static void method2412(boolean bool) {
	widgetSpriteIndexLoader = null;
	aClass114_8756 = null;
	aClass262_8744 = null;
	if (bool != true)
	    method2408((byte) -121);
    }
    
    final int method2384(Class348_Sub1[] class348_sub1s, int i) {
	anInt8753++;
	int i_19_ = 0;
    while_104_:
	for (int i_20_ = ((Class318_Sub1_Sub3) this).aShort8743;
	     ((((Class318_Sub1_Sub3) this).aShort8751 ^ 0xffffffff)
	      <= (i_20_ ^ 0xffffffff));
	     i_20_++) {
	    for (int i_21_ = ((Class318_Sub1_Sub3) this).aShort8750;
		 ((Class318_Sub1_Sub3) this).aShort8747 >= i_21_; i_21_++) {
		long l = (Class348_Sub42_Sub8_Sub2.aLongArrayArrayArray10431
			  [((Class318_Sub1) this).aByte6381][i_20_][i_21_]);
		long l_22_ = 0L;
	    while_103_:
		while (l_22_ <= 48L) {
		    int i_23_ = (int) (l >>> (int) l_22_ & 0xffffL);
		    if ((i_23_ ^ 0xffffffff) >= -1)
			break;
		    Class211 class211
			= Class239_Sub14.aClass211Array5993[-1 + i_23_];
		    for (int i_24_ = 0; i_19_ > i_24_; i_24_++) {
			if (((Class211) class211).aClass348_Sub1_2745
			    == class348_sub1s[i_24_]) {
			    l_22_ += 16L;
			    continue while_103_;
			}
		    }
		    class348_sub1s[i_19_++]
			= ((Class211) class211).aClass348_Sub1_2745;
		    if ((i_19_ ^ 0xffffffff) == -5)
			break while_104_;
		    l_22_ += 16L;
		}
	    }
	}
	int i_25_ = 17 % ((i - -14) / 61);
	for (int i_26_ = i_19_; (i_26_ ^ 0xffffffff) > -5; i_26_++)
	    class348_sub1s[i_26_] = null;
	if (((Class318_Sub1_Sub3) this).aByte8745 != 0) {
	    int i_27_ = (((Class318_Sub1_Sub3) this).aShort8743
			 + -Class239_Sub25.anInt6111);
	    int i_28_ = (-Class285_Sub2.anInt8502
			 + ((Class318_Sub1_Sub3) this).aShort8750);
	    int i_29_;
	    short i_30_;
	    int i_31_;
	    short i_32_;
	    if ((((Class318_Sub1_Sub3) this).aByte8745 ^ 0xffffffff) == -2) {
		if (i_27_ >= i_28_) {
		    i_32_ = ((Class318_Sub1_Sub3) this).aShort8743;
		    i_30_ = ((Class318_Sub1_Sub3) this).aShort8750;
		    i_31_ = ((Class318_Sub1_Sub3) this).aShort8750 - -1;
		    i_29_ = ((Class318_Sub1_Sub3) this).aShort8743 - 1;
		} else {
		    i_30_ = ((Class318_Sub1_Sub3) this).aShort8750;
		    i_31_ = ((Class318_Sub1_Sub3) this).aShort8750 + -1;
		    i_32_ = ((Class318_Sub1_Sub3) this).aShort8743;
		    i_29_ = 1 + ((Class318_Sub1_Sub3) this).aShort8743;
		}
	    } else if ((i_28_ ^ 0xffffffff) < (-i_27_ ^ 0xffffffff)) {
		i_29_ = ((Class318_Sub1_Sub3) this).aShort8743 + -1;
		i_30_ = ((Class318_Sub1_Sub3) this).aShort8750;
		i_31_ = -1 + ((Class318_Sub1_Sub3) this).aShort8750;
		i_32_ = ((Class318_Sub1_Sub3) this).aShort8743;
	    } else {
		i_31_ = ((Class318_Sub1_Sub3) this).aShort8750 + 1;
		i_32_ = ((Class318_Sub1_Sub3) this).aShort8743;
		i_30_ = ((Class318_Sub1_Sub3) this).aShort8750;
		i_29_ = 1 + ((Class318_Sub1_Sub3) this).aShort8743;
	    }
	    int i_33_ = 0;
	while_106_:
	    for (/**/; (i_33_ ^ 0xffffffff) > (i_19_ ^ 0xffffffff); i_33_++) {
		long l = (Class348_Sub42_Sub8_Sub2.aLongArrayArrayArray10431
			  [((Class318_Sub1) this).aByte6381][i_32_][i_31_]);
		while (l != 0L) {
		    Class211 class211 = (Class239_Sub14.aClass211Array5993
					 [(int) (-1L + (l & 0xffffL))]);
		    l >>>= 16;
		    if (((Class211) class211).aClass348_Sub1_2745
			== class348_sub1s[i_33_])
			continue while_106_;
		}
		l = (Class348_Sub42_Sub8_Sub2.aLongArrayArrayArray10431
		     [((Class318_Sub1) this).aByte6381][i_29_][i_30_]);
		while ((l ^ 0xffffffffffffffffL) != -1L) {
		    Class211 class211 = (Class239_Sub14.aClass211Array5993
					 [(int) (-1L + (0xffffL & l))]);
		    l >>>= 16;
		    if (class348_sub1s[i_33_]
			== ((Class211) class211).aClass348_Sub1_2745)
			continue while_106_;
		}
		for (int i_34_ = i_33_; i_34_ < i_19_ - 1; i_34_++)
		    class348_sub1s[i_34_] = class348_sub1s[i_34_ - -1];
		i_19_--;
	    }
	}
	return i_19_;
    }
    
    static final int method2413(int i,
				GameBuffer class348_sub49_sub2) {
	anInt8749++;
	int i_35_ = class348_sub49_sub2.method3410((byte) -24, 2);
	if (i != 1)
	    aClass262_8744 = null;
	int i_36_;
	if (i_35_ != 0) {
	    if (i_35_ == 1)
		i_36_ = class348_sub49_sub2.method3410((byte) -24, 5);
	    else if ((i_35_ ^ 0xffffffff) != -3)
		i_36_ = class348_sub49_sub2.method3410((byte) -24, 11);
	    else
		i_36_ = class348_sub49_sub2.method3410((byte) -24, 8);
	} else
	    i_36_ = 0;
	return i_36_;
    }
}
