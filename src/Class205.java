/* Class205 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class205
{
    static int anInt2685;
    static OutgoingPacket aClass351_2686;
    static float aFloat2687 = 0.0F;
    static int anInt2688;
    static int anInt2689;
    static int anInt2690;
    static OutgoingPacket aClass351_2691;
    static Class348_Sub44 aClass348_Sub44_2692;
    static IncomingPacket aClass114_2693;
    static int[] anIntArray2694;
    
    static final void method1496(int i, int i_0_, int i_1_, int i_2_, int i_3_,
				 int i_4_, int i_5_) {
	Class117.method1070((byte) 118, i_2_);
	anInt2685++;
	int i_6_ = 0;
	int i_7_ = -i_4_ + i_2_;
	if ((i_7_ ^ 0xffffffff) > -1)
	    i_7_ = 0;
	int i_8_ = i_2_;
	int i_9_ = -i_2_;
	int i_10_ = i_7_;
	int i_11_ = -i_7_;
	int i_12_ = -1;
	if (i_0_ >= Class132.anInt1910 && i_0_ <= Class38.anInt513) {
	    int[] is = AnimationDefinition.anIntArrayArray255[i_0_];
	    int i_13_ = Whirlpool.method831(Class113.anInt1745, -i_2_ + i_5_,
					  Class369.anInt4960, -104);
	    int i_14_ = Whirlpool.method831(Class113.anInt1745, i_5_ - -i_2_,
					  Class369.anInt4960, i_3_ + -94);
	    int i_15_ = Whirlpool.method831(Class113.anInt1745, i_5_ - i_7_,
					  Class369.anInt4960, -82);
	    int i_16_ = Whirlpool.method831(Class113.anInt1745, i_5_ - -i_7_,
					  Class369.anInt4960, -96);
	    Class135_Sub2.method1156(-27, i_15_, is, i_13_, i);
	    Class135_Sub2.method1156(-27, i_16_, is, i_15_, i_1_);
	    Class135_Sub2.method1156(-27, i_14_, is, i_16_, i);
	}
	int i_17_ = -1;
	while ((i_8_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff)) {
	    i_12_ += 2;
	    i_17_ += 2;
	    i_11_ += i_17_;
	    i_9_ += i_12_;
	    if ((i_11_ ^ 0xffffffff) <= -1 && i_10_ >= 1) {
		i_10_--;
		GameBuffer.anIntArray9757[i_10_] = i_6_;
		i_11_ -= i_10_ << 1786913601;
	    }
	    i_6_++;
	    if (i_9_ >= 0) {
		i_8_--;
		i_9_ -= i_8_ << 768824161;
		int i_18_ = i_0_ - i_8_;
		int i_19_ = i_0_ + i_8_;
		if ((i_19_ ^ 0xffffffff) <= (Class132.anInt1910 ^ 0xffffffff)
		    && Class38.anInt513 >= i_18_) {
		    if ((i_7_ ^ 0xffffffff) >= (i_8_ ^ 0xffffffff)) {
			int i_20_ = Whirlpool.method831(Class113.anInt1745,
						      i_6_ + i_5_,
						      Class369.anInt4960,
						      i_3_ ^ 0x36);
			int i_21_ = Whirlpool.method831(Class113.anInt1745,
						      i_5_ - i_6_,
						      Class369.anInt4960, 112);
			if ((Class38.anInt513 ^ 0xffffffff)
			    <= (i_19_ ^ 0xffffffff))
			    Class135_Sub2.method1156(-27, i_20_,
						     (AnimationDefinition
						      .anIntArrayArray255
						      [i_19_]),
						     i_21_, i);
			if ((i_18_ ^ 0xffffffff)
			    <= (Class132.anInt1910 ^ 0xffffffff))
			    Class135_Sub2.method1156(-27, i_20_,
						     (AnimationDefinition
						      .anIntArrayArray255
						      [i_18_]),
						     i_21_, i);
		    } else {
			int i_22_ = GameBuffer.anIntArray9757[i_8_];
			int i_23_
			    = Whirlpool.method831(Class113.anInt1745,
						i_6_ + i_5_,
						Class369.anInt4960, -123);
			int i_24_ = Whirlpool.method831(Class113.anInt1745,
						      -i_6_ + i_5_,
						      Class369.anInt4960, 110);
			int i_25_ = Whirlpool.method831(Class113.anInt1745,
						      i_22_ + i_5_,
						      Class369.anInt4960, 85);
			int i_26_ = Whirlpool.method831(Class113.anInt1745,
						      i_5_ - i_22_,
						      Class369.anInt4960, 84);
			if ((i_19_ ^ 0xffffffff)
			    >= (Class38.anInt513 ^ 0xffffffff)) {
			    int[] is = AnimationDefinition.anIntArrayArray255[i_19_];
			    Class135_Sub2.method1156(-27, i_26_, is, i_24_, i);
			    Class135_Sub2.method1156(-27, i_25_, is, i_26_,
						     i_1_);
			    Class135_Sub2.method1156(-27, i_23_, is, i_25_, i);
			}
			if (Class132.anInt1910 <= i_18_) {
			    int[] is = AnimationDefinition.anIntArrayArray255[i_18_];
			    Class135_Sub2.method1156(-27, i_26_, is, i_24_, i);
			    Class135_Sub2.method1156(-27, i_25_, is, i_26_,
						     i_1_);
			    Class135_Sub2.method1156(-27, i_23_, is, i_25_, i);
			}
		    }
		}
	    }
	    int i_27_ = -i_6_ + i_0_;
	    int i_28_ = i_0_ + i_6_;
	    if ((i_28_ ^ 0xffffffff) <= (Class132.anInt1910 ^ 0xffffffff)
		&& i_27_ <= Class38.anInt513) {
		int i_29_ = i_8_ + i_5_;
		int i_30_ = i_5_ + -i_8_;
		if (Class369.anInt4960 <= i_29_
		    && i_30_ <= Class113.anInt1745) {
		    i_29_ = Whirlpool.method831(Class113.anInt1745, i_29_,
					      Class369.anInt4960, 102);
		    i_30_ = Whirlpool.method831(Class113.anInt1745, i_30_,
					      Class369.anInt4960, -100);
		    if ((i_7_ ^ 0xffffffff) >= (i_6_ ^ 0xffffffff)) {
			if ((i_28_ ^ 0xffffffff)
			    >= (Class38.anInt513 ^ 0xffffffff))
			    Class135_Sub2.method1156(-27, i_29_,
						     (AnimationDefinition
						      .anIntArrayArray255
						      [i_28_]),
						     i_30_, i);
			if ((Class132.anInt1910 ^ 0xffffffff)
			    >= (i_27_ ^ 0xffffffff))
			    Class135_Sub2.method1156(-27, i_29_,
						     (AnimationDefinition
						      .anIntArrayArray255
						      [i_27_]),
						     i_30_, i);
		    } else {
			int i_31_ = ((i_10_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff)
				     ? GameBuffer.anIntArray9757[i_6_]
				     : i_10_);
			int i_32_ = Whirlpool.method831(Class113.anInt1745,
						      i_31_ + i_5_,
						      Class369.anInt4960, 71);
			int i_33_ = Whirlpool.method831(Class113.anInt1745,
						      -i_31_ + i_5_,
						      Class369.anInt4960, 65);
			if (i_28_ <= Class38.anInt513) {
			    int[] is = AnimationDefinition.anIntArrayArray255[i_28_];
			    Class135_Sub2.method1156(-27, i_33_, is, i_30_, i);
			    Class135_Sub2.method1156(-27, i_32_, is, i_33_,
						     i_1_);
			    Class135_Sub2.method1156(-27, i_29_, is, i_32_, i);
			}
			if ((i_27_ ^ 0xffffffff)
			    <= (Class132.anInt1910 ^ 0xffffffff)) {
			    int[] is = AnimationDefinition.anIntArrayArray255[i_27_];
			    Class135_Sub2.method1156(i_3_ + -29, i_33_, is,
						     i_30_, i);
			    Class135_Sub2.method1156(-27, i_32_, is, i_33_,
						     i_1_);
			    Class135_Sub2.method1156(-27, i_29_, is, i_32_, i);
			}
		    }
		}
	    }
	}
	if (i_3_ != 2)
	    method1497(79);
    }
    
    public static void method1497(int i) {
	anIntArray2694 = null;
	aClass348_Sub44_2692 = null;
	aClass351_2691 = null;
	aClass114_2693 = null;
	if (i != 16384)
	    method1496(-23, 118, -17, -52, 33, 108, 2);
	aClass351_2686 = null;
    }
    
    static {
	aClass351_2686 = new OutgoingPacket(41, -1);
	aClass351_2691 = new OutgoingPacket(46, 2);
	aClass348_Sub44_2692 = new Class348_Sub44(0, -1);
	anIntArray2694 = new int[4096];
	aClass114_2693 = new IncomingPacket(94, -1);
    }
}
