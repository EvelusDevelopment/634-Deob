/* Class235 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class235
{
    static int anInt3050;
    private Class318_Sub1 aClass318_Sub1_3051;
    int anInt3052;
    private int anInt3053;
    private int anInt3054;
    private int anInt3055;
    private int anInt3056;
    private AnimationDefinition aClass17_3057;
    static int anInt3058;
    private AnimatableToolkit aClass64_3059;
    private int anInt3060 = 0;
    static int anInt3061;
    static int anInt3062;
    int anInt3063;
    private boolean aBoolean3064;
    private boolean aBoolean3065;
    static int anInt3066;
    private byte aByte3067;
    static int[] anIntArray3068;
    private boolean aBoolean3069;
    static int anInt3070;
    private r aR3071;
    private boolean[] aBooleanArray3072;
    private int anInt3073;
    private int anInt3074;
    static BufferedFile tableIndexBufferedFile;
    static int anInt3076;
    static int anInt3077;
    static int anInt3078;
    int anInt3079;
    static int anInt3080;
    Class318_Sub10 aClass318_Sub10_3081;
    static int anInt3082;
    private int anInt3083;
    private int anInt3084;
    private byte aByte3085;
    static int anInt3086;
    static int anInt3087;
    
    final int method1663(int i) {
	if (i < 31)
	    return 48;
	anInt3087++;
	return anInt3060;
    }
    
    final int method1664(int i) {
	if (i > -20)
	    finalize();
	anInt3076++;
	return anInt3055;
    }
    
    final boolean method1665(int i) {
	if (i != 2)
	    anInt3056 = -73;
	anInt3070++;
	return aBoolean3065;
    }
    
    private final void method1666(byte i, int i_0_) {
	anInt3077++;
	if (i != 69)
	    aClass64_3059 = null;
	int i_1_ = i_0_;
	boolean bool = false;
	if (i_1_ == -1) {
	    ObjectDefinition class51
		= Class348_Sub40_Sub12.objectLoader
		      .getObject(i ^ 0x45, ((Class235) this).anInt3063);
	    ObjectDefinition class51_2_ = class51;
	    if (((ObjectDefinition) class51).anIntArray945 != null)
		class51 = class51.method480((Class318_Sub1_Sub3_Sub3
					     .varbitHandler),
					    (byte) 47);
	    if (class51 == null)
		return;
	    if (class51_2_ == class51)
		class51_2_ = null;
	    if (((ObjectDefinition) class51).anIntArray943 == null) {
		if (((ObjectDefinition) class51).anInt868 != -1) {
		    if ((((ObjectDefinition) class51).anInt941 ^ 0xffffffff)
			!= (anInt3053 ^ 0xffffffff)) {
			i_1_ = ((ObjectDefinition) class51).anInt868;
			bool = ((ObjectDefinition) class51).aBoolean924;
		    }
		} else if (class51_2_ != null
			   && ((ObjectDefinition) class51_2_).anIntArray943 != null) {
		    if (aClass17_3057 != null
			&& class51_2_.method481((byte) 105,
						(((AnimationDefinition) aClass17_3057)
						 .anInt269)))
			return;
		    i_1_ = class51_2_.method489(i ^ ~0x45);
		    if (anInt3053 != ((ObjectDefinition) class51_2_).anInt941)
			bool = ((ObjectDefinition) class51_2_).aBoolean924;
		} else if (class51_2_ != null
			   && ((((ObjectDefinition) class51_2_).anInt868 ^ 0xffffffff)
			       != 0)
			   && ((((ObjectDefinition) class51_2_).anInt941 ^ 0xffffffff)
			       != (anInt3053 ^ 0xffffffff))) {
		    bool = ((ObjectDefinition) class51_2_).aBoolean924;
		    i_1_ = ((ObjectDefinition) class51_2_).anInt868;
		}
	    } else {
		if (aClass17_3057 != null
		    && class51.method481((byte) 73,
					 ((AnimationDefinition) aClass17_3057).anInt269))
		    return;
		i_1_ = class51.method489(i + -70);
		if ((((ObjectDefinition) class51).anInt941 ^ 0xffffffff)
		    != (anInt3053 ^ 0xffffffff))
		    bool = ((ObjectDefinition) class51).aBoolean924;
	    }
	}
	if ((i_1_ ^ 0xffffffff) == 0)
	    aClass17_3057 = null;
	else {
	    aClass64_3059 = null;
	    if (aClass17_3057 != null
		&& i_1_ == ((AnimationDefinition) aClass17_3057).anInt269) {
		if (((AnimationDefinition) aClass17_3057).anInt248 == 0)
		    return;
	    } else
		aClass17_3057 = Class10.animationLoader.method835(i_1_, i + -62);
	    if (((AnimationDefinition) aClass17_3057).anIntArray237 == null)
		aClass17_3057 = null;
	    else {
		if (!bool) {
		    anInt3084 = 0;
		    anInt3054 = 1;
		} else {
		    anInt3084 = (int) ((double) (((AnimationDefinition) aClass17_3057)
						 .anIntArray237).length
				       * Math.random());
		    anInt3054 = 1 + (int) ((double) (((AnimationDefinition) aClass17_3057)
						     .anIntArray267[anInt3084])
					   * Math.random());
		}
		anInt3083 = anInt3084 - -1;
		if ((anInt3083 ^ 0xffffffff) > -1
		    || (((AnimationDefinition) aClass17_3057).anIntArray237.length
			^ 0xffffffff) >= (anInt3083 ^ 0xffffffff))
		    anInt3083 = -1;
		anInt3074 = -anInt3054 + Class367_Sub11.logicCycle;
	    }
	}
    }
    
    final void method1667(byte i, AbstractToolkit var_ha) {
	anInt3061++;
	method1668(true, true, i + -244, 262144, var_ha);
	if (i != 116)
	    ((Class235) this).anInt3063 = 99;
    }
    
    final AnimatableToolkit method1668(boolean bool, boolean bool_3_, int i, int i_4_,
			     AbstractToolkit var_ha) {
	anInt3082++;
	ObjectDefinition class51 = Class348_Sub40_Sub12.objectLoader
			      .getObject(0, ((Class235) this).anInt3063);
	if (((ObjectDefinition) class51).anIntArray945 != null)
	    class51
		= class51.method480(Class318_Sub1_Sub3_Sub3.varbitHandler,
				    (byte) 47);
	if (class51 == null) {
	    method1674(-1, var_ha);
	    anInt3073 = -1;
	    anInt3056 = -1;
	    anInt3053 = -1;
	    return null;
	}
	if (!aBoolean3064
	    && (anInt3053 ^ 0xffffffff) != (((ObjectDefinition) class51).anInt941
					    ^ 0xffffffff)) {
	    aClass64_3059 = null;
	    method1666((byte) 69, -1);
	}
	method1672(aClass318_Sub1_3051, true);
	if (bool_3_) {
	    bool_3_
		= bool_3_ & (aBoolean3065
			     & ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
				   .aClass239_Sub7_7238
				   .method1748(-32350) != 0);
	    bool_3_
		= (bool_3_
		   & (((ObjectDefinition) class51).anInt941 != anInt3056
		      || (aClass17_3057 != null
			  && ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
				 .aClass239_Sub7_7238.method1748(-32350) >= 2
			  && ((anInt3073 ^ 0xffffffff) != (anInt3084
							   ^ 0xffffffff)
			      || ((((AnimationDefinition) aClass17_3057).aBoolean254
				   || Class28.forcedTween)
				  && ((anInt3084 ^ 0xffffffff)
				      != (anInt3083 ^ 0xffffffff)))))));
	}
	if (bool && !bool_3_) {
	    anInt3053 = ((ObjectDefinition) class51).anInt941;
	    return null;
	}
	if (bool_3_) {
	    Class169.method1301(aR3071, aByte3067,
				(((Class318_Sub1) aClass318_Sub1_3051)
				 .anInt6377),
				(((Class318_Sub1) aClass318_Sub1_3051)
				 .anInt6388),
				aBooleanArray3072);
	    anInt3056 = -1;
	    anInt3073 = -1;
	}
	if (i > -126)
	    return null;
	s var_s = aa_Sub1.aSArray5191[aByte3067];
	s var_s_5_;
	if (!aBoolean3069)
	    var_s_5_
		= aByte3067 >= 3 ? null : aa_Sub1.aSArray5191[1 + aByte3067];
	else
	    var_s_5_ = Class348_Sub1_Sub1.aSArray8801[0];
	AnimatableToolkit class64 = null;
	if (aClass17_3057 == null) {
	    if (aClass64_3059 == null || i_4_ != (i_4_ & aClass64_3059.ua())
		|| ((((ObjectDefinition) class51).anInt941 ^ 0xffffffff)
		    != (anInt3053 ^ 0xffffffff))) {
		if (aClass64_3059 != null)
		    i_4_ |= aClass64_3059.ua();
		Class2 class2
		    = (class51.method476
		       (var_ha, var_s_5_,
			(((Class235) this).anInt3079 != 11
			 ? ((Class235) this).anInt3079 : 10),
			i_4_, ((Class318_Sub1) aClass318_Sub1_3051).anInt6377,
			bool_3_, var_s,
			var_s.method3986((((Class318_Sub1) aClass318_Sub1_3051)
					  .anInt6377),
					 (((Class318_Sub1) aClass318_Sub1_3051)
					  .anInt6388),
					 (byte) -114),
			((Class318_Sub1) aClass318_Sub1_3051).anInt6388,
			((((Class235) this).anInt3079 ^ 0xffffffff) == -12
			 ? 4 + ((Class235) this).anInt3052
			 : ((Class235) this).anInt3052),
			128));
		if (class2 != null) {
		    aClass64_3059 = class64 = ((Class2) class2).aClass64_119;
		    if (bool_3_) {
			aBooleanArray3072 = null;
			aR3071 = ((Class2) class2).aR118;
			Class130.method1130
			    (aR3071, aByte3067,
			     ((Class318_Sub1) aClass318_Sub1_3051).anInt6377,
			     ((Class318_Sub1) aClass318_Sub1_3051).anInt6388,
			     null);
			anInt3073 = -1;
			anInt3056 = ((ObjectDefinition) class51).anInt941;
		    }
		    anInt3060 = class64.fa();
		    anInt3055 = class64.ma();
		} else {
		    anInt3055 = 0;
		    aBooleanArray3072 = null;
		    aR3071 = null;
		    anInt3060 = 0;
		    aClass64_3059 = null;
		}
	    } else
		class64 = aClass64_3059;
	} else {
	    if (bool_3_)
		i_4_ |= 0x40000;
	    class64
		= (class51.method483
		   (anInt3083, anInt3054,
		    ((((Class235) this).anInt3079 ^ 0xffffffff) == -12 ? 10
		     : ((Class235) this).anInt3079),
		    var_s.method3986((((Class318_Sub1) aClass318_Sub1_3051)
				      .anInt6377),
				     (((Class318_Sub1) aClass318_Sub1_3051)
				      .anInt6388),
				     (byte) -2),
		    var_ha,
		    (((Class235) this).anInt3079 == 11
		     ? ((Class235) this).anInt3052 + 4
		     : ((Class235) this).anInt3052),
		    i_4_, (byte) 76, var_s_5_,
		    ((Class318_Sub1) aClass318_Sub1_3051).anInt6388, anInt3084,
		    ((Class318_Sub1) aClass318_Sub1_3051).anInt6377,
		    aClass17_3057, var_s));
	    if (class64 == null) {
		anInt3055 = 0;
		aBooleanArray3072 = null;
		anInt3060 = 0;
		aR3071 = null;
	    } else {
		if (bool_3_) {
		    if (aBooleanArray3072 == null)
			aBooleanArray3072 = new boolean[4];
		    aR3071 = class64.ba(aR3071);
		    Class130.method1130(aR3071, aByte3067,
					(((Class318_Sub1) aClass318_Sub1_3051)
					 .anInt6377),
					(((Class318_Sub1) aClass318_Sub1_3051)
					 .anInt6388),
					aBooleanArray3072);
		    anInt3073 = anInt3084;
		    anInt3056 = ((ObjectDefinition) class51).anInt941;
		}
		anInt3060 = class64.fa();
		anInt3055 = class64.ma();
	    }
	    aClass64_3059 = null;
	}
	anInt3053 = ((ObjectDefinition) class51).anInt941;
	return class64;
    }
    
    static final String method1669(int i, int i_6_) {
	if (i != -19918)
	    method1669(75, 33);
	anInt3066++;
	return (String.valueOf(0xff & i_6_ >> -1244403464) + "."
		+ ((i_6_ & 0xffb428) >> 2041842800) + "."
		+ (i_6_ >> 1609002984 & 0xff) + "." + (i_6_ & 0xff));
    }
    
    final void method1670(int i, Class101 class101, int i_7_, AbstractToolkit var_ha,
			  int i_8_, AnimatableToolkit class64, boolean bool, byte i_9_,
			  int i_10_) {
	do {
	    try {
		anInt3058++;
		if (i_9_ != -73)
		    ((Class235) this).anInt3052 = 62;
		Class129[] class129s = class64.method619();
		Class342[] class342s = class64.method604();
		if ((((Class235) this).aClass318_Sub10_3081 == null
		     || ((Class318_Sub10)
			 ((Class235) this).aClass318_Sub10_3081).aBoolean6470)
		    && (class129s != null || class342s != null)) {
		    ObjectDefinition class51
			= Class348_Sub40_Sub12.objectLoader
			      .getObject(0, ((Class235) this).anInt3063);
		    if (((ObjectDefinition) class51).anIntArray945 != null)
			class51 = class51.method480((Class318_Sub1_Sub3_Sub3
						     .varbitHandler),
						    (byte) 47);
		    if (class51 != null)
			((Class235) this).aClass318_Sub10_3081
			    = Class318_Sub10
				  .method2526(Class367_Sub11.logicCycle, true);
		}
		if (((Class235) this).aClass318_Sub10_3081 == null)
		    break;
		class64.method620(class101);
		if (bool)
		    ((Class235) this).aClass318_Sub10_3081.method2536
			(var_ha, (long) Class367_Sub11.logicCycle, class129s,
			 class342s, false);
		else
		    ((Class235) this).aClass318_Sub10_3081
			.method2540((long) Class367_Sub11.logicCycle);
		((Class235) this).aClass318_Sub10_3081
		    .method2533(aByte3085, i_8_, i, i_10_, i_7_);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("bv.E(" + i + ','
						 + (class101 != null ? "{...}"
						    : "null")
						 + ',' + i_7_ + ','
						 + (var_ha != null ? "{...}"
						    : "null")
						 + ',' + i_8_ + ','
						 + (class64 != null ? "{...}"
						    : "null")
						 + ',' + bool + ',' + i_9_
						 + ',' + i_10_ + ')'));
	    }
	    break;
	} while (false);
    }
    
    final void method1671(int i, int i_11_) {
	aBoolean3064 = true;
	anInt3078++;
	method1666((byte) 69, i_11_);
	if (i != 262144)
	    tableIndexBufferedFile = null;
    }
    
    protected final void finalize() {
	anInt3080++;
	if (((Class235) this).aClass318_Sub10_3081 != null)
	    ((Class235) this).aClass318_Sub10_3081.method2534();
    }
    
    private final void method1672(Class318_Sub1 class318_sub1, boolean bool) {
	if (bool != true)
	    method1674(-55, null);
	anInt3086++;
	int i;
    while_76_:
	for (;;) {
	    if (aClass17_3057 == null) {
		if (aBoolean3064)
		    return;
		method1666((byte) 69, -1);
		if (aClass17_3057 == null)
		    return;
	    }
	    i = -anInt3074 + Class367_Sub11.logicCycle;
	    if (i > 100 && ((AnimationDefinition) aClass17_3057).anInt238 > 0) {
		int i_12_;
		for (i_12_
			 = (-((AnimationDefinition) aClass17_3057).anInt238
			    + ((AnimationDefinition) aClass17_3057).anIntArray237.length);
		     (anInt3084 < i_12_
		      && ((i ^ 0xffffffff)
			  < (((AnimationDefinition) aClass17_3057).anIntArray267[anInt3084]
			     ^ 0xffffffff)));
		     anInt3084++)
		    i -= ((AnimationDefinition) aClass17_3057).anIntArray267[anInt3084];
		if ((anInt3084 ^ 0xffffffff) <= (i_12_ ^ 0xffffffff)) {
		    int i_13_ = 0;
		    for (int i_14_ = i_12_;
			 (((AnimationDefinition) aClass17_3057).anIntArray237.length
			  > i_14_);
			 i_14_++)
			i_13_
			    += ((AnimationDefinition) aClass17_3057).anIntArray267[i_14_];
		    i %= i_13_;
		}
		anInt3083 = 1 + anInt3084;
		if (anInt3083
		    >= ((AnimationDefinition) aClass17_3057).anIntArray237.length) {
		    anInt3083 -= ((AnimationDefinition) aClass17_3057).anInt238;
		    if ((anInt3083 ^ 0xffffffff) > -1
			|| (((AnimationDefinition) aClass17_3057).anIntArray237.length
			    ^ 0xffffffff) >= (anInt3083 ^ 0xffffffff))
			anInt3083 = -1;
		}
	    }
	    for (;;) {
		if ((i ^ 0xffffffff)
		    >= (((AnimationDefinition) aClass17_3057).anIntArray267[anInt3084]
			^ 0xffffffff))
		    break while_76_;
		GametipDefinition.method2178(class318_sub1, anInt3084, aClass17_3057,
				    -99);
		i -= ((AnimationDefinition) aClass17_3057).anIntArray267[anInt3084];
		anInt3084++;
		if (((AnimationDefinition) aClass17_3057).anIntArray237.length
		    <= anInt3084) {
		    anInt3084 -= ((AnimationDefinition) aClass17_3057).anInt238;
		    if ((anInt3084 ^ 0xffffffff) > -1
			|| (((AnimationDefinition) aClass17_3057).anIntArray237.length
			    ^ 0xffffffff) >= (anInt3084 ^ 0xffffffff)) {
			aClass17_3057 = null;
			break;
		    }
		}
		anInt3083 = anInt3084 + 1;
		if (((AnimationDefinition) aClass17_3057).anIntArray237.length
		    <= anInt3083) {
		    anInt3083 -= ((AnimationDefinition) aClass17_3057).anInt238;
		    if ((anInt3083 ^ 0xffffffff) > -1
			|| (anInt3083
			    >= ((AnimationDefinition) aClass17_3057).anIntArray237.length))
			anInt3083 = -1;
		}
	    }
	}
	anInt3054 = i;
	anInt3074 = -i + Class367_Sub11.logicCycle;
    }
    
    public static void method1673(int i) {
	tableIndexBufferedFile = null;
	anIntArray3068 = null;
	if (i >= -19)
	    method1669(-110, -13);
    }
    
    Class235(AbstractToolkit var_ha, ObjectDefinition class51, int i, int i_15_, int i_16_,
	     int i_17_, Class318_Sub1 class318_sub1, boolean bool, int i_18_) {
	anInt3055 = 0;
	aBoolean3064 = false;
	anInt3053 = -1;
	aBoolean3069 = false;
	anInt3056 = -1;
	anInt3073 = -1;
	try {
	    ((Class235) this).anInt3079 = i;
	    ((Class235) this).anInt3063 = ((ObjectDefinition) class51).anInt941;
	    aClass318_Sub1_3051 = class318_sub1;
	    aByte3085 = (byte) i_16_;
	    aByte3067 = (byte) i_17_;
	    aBoolean3069 = bool;
	    ((Class235) this).anInt3052 = i_15_;
	    aBoolean3065
		= (var_ha.method3682() && ((ObjectDefinition) class51).aBoolean894
		   && !aBoolean3069);
	    if ((i_18_ ^ 0xffffffff) != 0)
		aBoolean3064 = true;
	    method1666((byte) 69, i_18_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("bv.<init>(" + (var_ha != null ? "{...}" : "null")
			+ ',' + (class51 != null ? "{...}" : "null") + ',' + i
			+ ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ','
			+ (class318_sub1 != null ? "{...}" : "null") + ','
			+ bool + ',' + i_18_ + ')'));
	}
    }
    
    final void method1674(int i, AbstractToolkit var_ha) {
	if (i != -1)
	    aBoolean3064 = false;
	if (aR3071 != null) {
	    Class169.method1301(aR3071, aByte3067,
				(((Class318_Sub1) aClass318_Sub1_3051)
				 .anInt6377),
				(((Class318_Sub1) aClass318_Sub1_3051)
				 .anInt6388),
				aBooleanArray3072);
	    aR3071 = null;
	    aBooleanArray3072 = null;
	}
	anInt3050++;
    }
}
