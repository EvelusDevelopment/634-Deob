/* Node - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Node
{
    static int anInt4285;
    static IndexLoader aClass45_4286;
    static int anInt4287;
    static int[] anIntArray4288;
    static int anInt4289;
    static int anInt4290;
    long nodeKey;
    static int anInt4292 = 0;
    static Class318_Sub1[] aClass318_Sub1Array4293;
    Node nodeParent;
    Node nodeChild;
    static int anInt4296;
    static int anInt4297;
    static int anInt4298;
    
    static final boolean method2709(int i, int i_0_, int i_1_) {
	anInt4287++;
	if (i_1_ != -1)
	    method2711(-42, 89, null, -113, true, -22, -35, 27, -109, null, 74,
		       -94, -119, null);
	if ((0x21 & i_0_ ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
    
    static final int method2710(int i, int i_2_) {
	anInt4289++;
	if ((i_2_ ^ 0xffffffff) > -97)
	    return 0;
	if (i >= -113)
	    aClass318_Sub1Array4293 = null;
	if (i_2_ < 128)
	    return 2;
	return 3;
    }
    
    static final AnimatableToolkit method2711(int i, int i_3_, AnimatableToolkit class64, int i_4_,
				    boolean bool, int i_5_, int i_6_, int i_7_,
				    int i_8_, AbstractToolkit var_ha, int i_9_, int i_10_,
				    int i_11_, AnimationDefinition class17) {
	try {
	    anInt4298++;
	    if (class64 == null)
		return null;
	    int i_12_ = 2055;
	    if (bool != false)
		return null;
	    if (class17 != null) {
		i_12_ |= class17.method263(-1, 103, i_5_, false);
		i_12_ &= ~0x200;
	    }
	    long l = (((long) i_10_ << -2085704656)
		      + (long) (i_7_ + ((i_9_ << 2071996176)
					+ (i_11_ << -799739208)))
		      - -((long) i_6_ << -84137248));
	    AnimatableToolkit class64_13_;
	    synchronized (Class342.aClass60_4254) {
		class64_13_
		    = (AnimatableToolkit) Class342.aClass60_4254.method583(l, -64);
	    }
	    if (class64_13_ == null
		|| ((var_ha.method3667(class64_13_.ua(), i_12_) ^ 0xffffffff)
		    != -1)) {
		if (class64_13_ != null)
		    i_12_ = var_ha.OR(i_12_, class64_13_.ua());
		int i_14_;
		if (i_7_ != 1) {
		    if (i_7_ == 2)
			i_14_ = 12;
		    else if (i_7_ != 3) {
			if ((i_7_ ^ 0xffffffff) == -5)
			    i_14_ = 18;
			else
			    i_14_ = 21;
		    } else
			i_14_ = 15;
		} else
		    i_14_ = 9;
		int i_15_ = 3;
		int[] is = { 64, 96, 128 };
		Model class124
		    = new Model(1 + i_14_ * i_15_,
				   2 * i_14_ * i_15_ + -i_14_, 0);
		int i_16_ = class124.method1101(0, 0, 0, -44);
		int[][] is_17_ = new int[i_15_][i_14_];
		for (int i_18_ = 0; i_18_ < i_15_; i_18_++) {
		    int i_19_ = is[i_18_];
		    int i_20_ = is[i_18_];
		    for (int i_21_ = 0;
			 (i_21_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff);
			 i_21_++) {
			int i_22_ = (i_21_ << 1406929102) / i_14_;
			int i_23_ = (Class70.sineTable[i_22_] * i_19_
				     >> 428811726);
			int i_24_ = (Class70.cosineTable[i_22_] * i_20_
				     >> 700180942);
			is_17_[i_18_][i_21_]
			    = class124.method1101(0, i_24_, i_23_, 123);
		    }
		}
		for (int i_25_ = 0;
		     (i_25_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff); i_25_++) {
		    int i_26_ = (i_25_ * 256 + 128) / i_15_;
		    int i_27_ = -i_26_ + 256;
		    byte i_28_
			= (byte) (i_26_ * i_11_ + i_9_ * i_27_ >> 267274728);
		    short i_29_
			= (short) (((0xfc0000 & ((i_10_ & 0xfc00) * i_26_
						 + i_27_ * (0xfc00 & i_6_)))
				    + (((i_10_ & 0x380) * i_26_
					+ i_27_ * (0x380 & i_6_))
				       & 0x38000)
				    + ((i_26_ * (i_10_ & 0x7f)
					+ (0x7f & i_6_) * i_27_)
				       & 0x7f00))
				   >> -874266712);
		    for (int i_30_ = 0;
			 (i_14_ ^ 0xffffffff) < (i_30_ ^ 0xffffffff);
			 i_30_++) {
			if (i_25_ == 0)
			    class124.method1102(i_16_, (byte) 1, (byte) -1,
						(short) -1, (byte) 45, i_29_,
						is_17_[0][(1 + i_30_) % i_14_],
						i_28_, is_17_[0][i_30_]);
			else {
			    class124.method1102
				(is_17_[i_25_ - 1][i_30_], (byte) 1, (byte) -1,
				 (short) -1, (byte) 48, i_29_,
				 is_17_[i_25_ + -1][(1 + i_30_) % i_14_],
				 i_28_, is_17_[i_25_][(1 + i_30_) % i_14_]);
			    class124.method1102(is_17_[-1 + i_25_][i_30_],
						(byte) 1, (byte) -1,
						(short) -1, (byte) 100, i_29_,
						(is_17_[i_25_]
						 [(1 + i_30_) % i_14_]),
						i_28_, is_17_[i_25_][i_30_]);
			}
		    }
		}
		class64_13_ = var_ha.method3625(class124, i_12_,
						Class185.anInt2482, 64, 768);
		synchronized (Class342.aClass60_4254) {
		    Class342.aClass60_4254.method582(class64_13_, l,
						     (byte) -103);
		}
	    }
	    int i_31_ = class64.V();
	    int i_32_ = class64.RA();
	    int i_33_ = class64.HA();
	    int i_34_ = class64.G();
	    Class348_Sub42_Sub17 class348_sub42_sub17 = null;
	    if (class17 != null) {
		i_5_ = ((AnimationDefinition) class17).anIntArray237[i_5_];
		class348_sub42_sub17
		    = Class10.animationLoader.method839(i_5_ >> -2049946032, 3);
		i_5_ &= 0xffff;
	    }
	    if (class348_sub42_sub17 == null) {
		class64_13_ = class64_13_.method614((byte) 3, i_12_, true);
		class64_13_.O(-i_31_ + i_32_ >> -789200671, 128,
			      -i_33_ + i_34_ >> 1953774497);
		class64_13_.H(i_32_ + i_31_ >> 1443854625, 0,
			      i_34_ + i_33_ >> 1541673761);
	    } else {
		class64_13_ = class64_13_.method614((byte) 3, i_12_, true);
		class64_13_.O(-i_31_ + i_32_ >> -418609087, 128,
			      i_34_ - i_33_ >> -542993311);
		class64_13_.H(i_32_ + i_31_ >> -29475039, 0,
			      i_34_ + i_33_ >> 1501472385);
		class64_13_.method611(i_5_, -8700, class348_sub42_sub17);
	    }
	    if (i != 0)
		class64_13_.FA(i);
	    if ((i_4_ ^ 0xffffffff) != -1)
		class64_13_.VA(i_4_);
	    if ((i_8_ ^ 0xffffffff) != -1)
		class64_13_.H(0, i_8_, 0);
	    return class64_13_;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("eh.PC(" + i + ',' + i_3_ + ','
			+ (class64 != null ? "{...}" : "null") + ',' + i_4_
			+ ',' + bool + ',' + i_5_ + ',' + i_6_ + ',' + i_7_
			+ ',' + i_8_ + ','
			+ (var_ha != null ? "{...}" : "null") + ',' + i_9_
			+ ',' + i_10_ + ',' + i_11_ + ','
			+ (class17 != null ? "{...}" : "null") + ')'));
	}
    }
    
    final boolean method2712(byte i) {
	if (i != 4)
	    return true;
	anInt4297++;
	if (((Node) this).nodeChild == null)
	    return false;
	return true;
    }
    
    public static void method2713(int i) {
	aClass45_4286 = null;
	aClass318_Sub1Array4293 = null;
	if (i != 0)
	    method2711(-47, 87, null, 85, false, -126, -116, -51, -44, null,
		       75, -69, 87, null);
	anIntArray4288 = null;
    }
    
    static final boolean method2714(int i, int i_35_) {
	if (i != 7351)
	    method2709(-15, 59, 58);
	anInt4296++;
	if ((i_35_ ^ 0xffffffff) != -2 && (i_35_ ^ 0xffffffff) != -4
	    && (i_35_ ^ 0xffffffff) != -6)
	    return false;
	return true;
    }
    
    final void removeNode() {
	anInt4285++;
	if (((Node) this).nodeChild != null) {
	    ((Node) ((Node) this).nodeChild).nodeParent = ((Node) this).nodeParent;
	    ((Node) ((Node) this).nodeParent).nodeChild = ((Node) this).nodeChild;
	    ((Node) this).nodeParent = null;
	    ((Node) this).nodeChild = null;
	}
    }
    
    public Node() {
	/* empty */
    }
    
    static {
	anIntArray4288 = new int[6];
	anInt4290 = 0;
    }
}
