/* Class367_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class367_Sub8 extends Class367
{
    static int anInt7349;
    private float aFloat7350 = 0.0F;
    static int anInt7351;
    static int anInt7352;
    private Class269 aClass269_7353;
    static int anInt7354;
    static short aShort7355 = 1;
    static int anInt7356;
    static int anInt7357;
    static int anInt7358;
    static int anInt7359;
    static int anInt7360;
    static LocationMode aClass364_7361 = new LocationMode("WTRC", 1);
    static IndexLoader indexLoader28;
    static IncomingPacket aClass114_7363;
    static int anInt7364;
    static int anInt7365 = 0;
    
    static final String method3546(byte[] is, int i, int i_0_, int i_1_) {
	anInt7349++;
	char[] cs = new char[i_0_];
	int i_2_ = 0;
	for (int i_3_ = i; (i_0_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
	    int i_4_ = 0xff & is[i_3_ + i_1_];
	    if (i_4_ != 0) {
		if (i_4_ >= 128 && i_4_ < 160) {
		    int i_5_ = Class44.aCharArray625[i_4_ - 128];
		    if (i_5_ == 0)
			i_5_ = 63;
		    i_4_ = i_5_;
		}
		cs[i_2_++] = (char) i_4_;
	    }
	}
	return new String(cs, 0, i_2_);
    }
    
    static final int method3547(int i, int i_6_) {
	if (Class342.anIntArrayArray4253 != null)
	    return Class342.anIntArrayArray4253[i][i_6_] & 0xffffff;
	return 0;
    }
    
    static final void method3548
	(int i, Npc class318_sub1_sub3_sub3_sub1,
	 int[] is, int[] is_7_, int[] is_8_) {
	try {
	    if (i != -7387)
		method3550((byte) 10);
	    for (int i_9_ = 0; is_7_.length > i_9_; i_9_++) {
		int i_10_ = is_7_[i_9_];
		int i_11_ = is[i_9_];
		int i_12_ = is_8_[i_9_];
		for (int i_13_ = 0;
		     i_11_ != 0 && ((i_13_ ^ 0xffffffff)
				    > ((((Class318_Sub1_Sub3_Sub3)
					 class318_sub1_sub3_sub3_sub1)
					.aClass182Array10308).length
				       ^ 0xffffffff));
		     i_13_++) {
		    if ((0x1 & i_11_) != 0) {
			if ((i_10_ ^ 0xffffffff) != 0) {
			    AnimationDefinition class17
				= Class10.animationLoader.method835(i_10_,
								 i + 7394);
			    int i_14_ = ((AnimationDefinition) class17).anInt248;
			    Class182 class182 = (((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub1)
						 .aClass182Array10308[i_13_]);
			    if (class182 != null) {
				if ((((Class182) class182).anInt2454
				     ^ 0xffffffff)
				    != (i_10_ ^ 0xffffffff)) {
				    if ((((AnimationDefinition) class17).anInt239
					 ^ 0xffffffff)
					<= (((AnimationDefinition)
					     (Class10.animationLoader.method835
					      (((Class182) class182).anInt2454,
					       7))).anInt239
					    ^ 0xffffffff))
					class182
					    = ((Class318_Sub1_Sub3_Sub3)
					       class318_sub1_sub3_sub3_sub1)
						  .aClass182Array10308[i_13_]
					    = null;
				} else if (i_14_ == 0)
				    class182
					= ((Class318_Sub1_Sub3_Sub3)
					   class318_sub1_sub3_sub3_sub1)
					      .aClass182Array10308[i_13_]
					= null;
				else if ((i_14_ ^ 0xffffffff) != -2) {
				    if (i_14_ == 2)
					((Class182) class182).anInt2445 = 0;
				} else {
				    ((Class182) class182).anInt2448 = i_12_;
				    ((Class182) class182).anInt2456 = 0;
				    ((Class182) class182).anInt2455 = 1;
				    ((Class182) class182).anInt2451 = 0;
				    ((Class182) class182).anInt2445 = 0;
				    if (!((Class318_Sub1_Sub3_Sub3)
					  class318_sub1_sub3_sub3_sub1)
					 .aBoolean10309)
					GametipDefinition.method2178
					    (class318_sub1_sub3_sub3_sub1, 0,
					     class17, -75);
				}
			    }
			    if (class182 == null) {
				class182
				    = ((Class318_Sub1_Sub3_Sub3)
				       class318_sub1_sub3_sub3_sub1)
					  .aClass182Array10308[i_13_]
				    = new Class182();
				((Class182) class182).anInt2455 = 1;
				((Class182) class182).anInt2454 = i_10_;
				((Class182) class182).anInt2456 = 0;
				((Class182) class182).anInt2445 = 0;
				((Class182) class182).anInt2451 = 0;
				((Class182) class182).anInt2448 = i_12_;
				if (!((Class318_Sub1_Sub3_Sub3)
				      class318_sub1_sub3_sub3_sub1)
				     .aBoolean10309)
				    GametipDefinition.method2178
					(class318_sub1_sub3_sub3_sub1, 0,
					 class17, -19);
			    }
			} else
			    ((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub1)
				.aClass182Array10308[i_13_]
				= null;
		    }
		    i_11_ >>>= 1;
		}
	    }
	    anInt7359++;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("kl.E(" + i + ','
			+ (class318_sub1_sub3_sub3_sub1 != null ? "{...}"
			   : "null")
			+ ',' + (is != null ? "{...}" : "null") + ','
			+ (is_7_ != null ? "{...}" : "null") + ','
			+ (is_8_ != null ? "{...}" : "null") + ')'));
	}
    }
    
    final void method3520(byte i) {
	((Class367) this).aHa_Sub3_4479.method3897(1, -4382);
	if (i != 87)
	    method3549(-29, (byte) -5);
	anInt7364++;
	((Class367) this).aHa_Sub3_4479
	    .method3874(Class167.aClass229_2207, 120, Class167.aClass229_2207);
	((Class367) this).aHa_Sub3_4479.method3849((byte) 47, 0,
						   Class342.aClass70_4247);
	((Class367) this).aHa_Sub3_4479.method3885(0, true,
						   Class342.aClass70_4247);
	((Class367) this).aHa_Sub3_4479.method3910((byte) -26, 1);
	((Class367) this).aHa_Sub3_4479.method3850((byte) 86, null);
	((Class367) this).aHa_Sub3_4479.method3897(0, -4382);
	((Class367) this).aHa_Sub3_4479.method3885(0, true,
						   Class342.aClass70_4247);
    }
    
    Class367_Sub8(NativeToolkit var_ha_Sub3, Class269 class269) {
	super(var_ha_Sub3);
	try {
	    aClass269_7353 = class269;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("kl.<init>("
					     + (var_ha_Sub3 != null ? "{...}"
						: "null")
					     + ','
					     + (class269 != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    static final boolean method3549(int i, byte i_15_) {
	anInt7351++;
	int i_16_ = -72 / ((37 - i_15_) / 48);
	if (i == 25 || i == 20 || i == 44 || i == 46
	    || (i ^ 0xffffffff) == -61)
	    return true;
	if ((i ^ 0xffffffff) == -31 || i == 1008)
	    return true;
	return false;
    }
    
    final void method3526(int i, int i_17_, int i_18_) {
	((Class367) this).aHa_Sub3_4479.method3897(1, -4382);
	anInt7354++;
	if (i != 10756)
	    method3527(-26, null, 111);
	if ((0x80 & i_17_ ^ 0xffffffff) == -1) {
	    if ((0x1 & i_18_) != 1) {
		if (((Class269) aClass269_7353).aBoolean3458)
		    ((Class367) this).aHa_Sub3_4479.method3850
			((byte) 108,
			 ((Class269) aClass269_7353).anInterface18_Impl1_3452);
		else
		    ((Class367) this).aHa_Sub3_4479.method3850
			((byte) 126, (((Class269) aClass269_7353)
				      .anInterface18_Impl3Array3459[0]));
	    } else if (((Class269) aClass269_7353).aBoolean3458) {
		aFloat7350
		    = (float) ((((NativeToolkit) ((Class367) this).aHa_Sub3_4479)
				.anInt8146)
			       % 4000) / 4000.0F;
		((Class367) this).aHa_Sub3_4479.method3850
		    ((byte) -112,
		     ((Class269) aClass269_7353).anInterface18_Impl1_3452);
	    } else {
		int i_19_
		    = (16
		       * (((NativeToolkit) ((Class367) this).aHa_Sub3_4479).anInt8146
			  % 4000)
		       / 4000);
		((Class367) this).aHa_Sub3_4479.method3850
		    ((byte) -114, (((Class269) aClass269_7353)
				   .anInterface18_Impl3Array3459[i_19_]));
	    }
	} else
	    ((Class367) this).aHa_Sub3_4479.method3850((byte) 85, null);
	((Class367) this).aHa_Sub3_4479.method3897(0, -4382);
    }
    
    final boolean method3530(int i) {
	if (i > -57)
	    return false;
	anInt7360++;
	return aClass269_7353.method2039(116);
    }
    
    public static void method3550(byte i) {
	aClass114_7363 = null;
	indexLoader28 = null;
	int i_20_ = -90 % ((-54 - i) / 60);
	aClass364_7361 = null;
    }
    
    final void method3532(int i) {
	if ((((Class367) this).aHa_Sub3_4479.method3877((byte) -126)
	     ^ 0xffffffff)
	    == -1) {
	    Class101_Sub2 class101_sub2
		= ((Class367) this).aHa_Sub3_4479.method3848(5);
	    ((Class367) this).aHa_Sub3_4479.method3897(1, i ^ ~0x39a4);
	    Class101_Sub2 class101_sub2_21_
		= ((Class367) this).aHa_Sub3_4479.method3820(false);
	    class101_sub2_21_.method898(class101_sub2);
	    class101_sub2_21_.method914(0.125F, 1.0F, 0, 0.125F);
	    class101_sub2_21_.method920(0.0F, false, aFloat7350, 0.0F);
	    ((Class367) this).aHa_Sub3_4479
		.method3853(-32, Class348_Sub40_Sub38.aClass251_9477);
	    ((Class367) this).aHa_Sub3_4479.method3897(0, -4382);
	}
	anInt7352++;
	if (i != 10425)
	    method3530(16);
    }
    
    final void method3521(boolean bool, byte i) {
	if (i != -103)
	    anInt7365 = 86;
	((Class367) this).aHa_Sub3_4479.method3874((Class328_Sub3
						    .aClass229_6519),
						   i ^ ~0x17,
						   Class167.aClass229_2207);
	anInt7357++;
    }
    
    final void method3525(int i, boolean bool) {
	anInt7356++;
	((Class367) this).aHa_Sub3_4479.method3897(1, i ^ ~0x2a45);
	((Class367) this).aHa_Sub3_4479.method3874((Class328_Sub3
						    .aClass229_6519),
						   111,
						   (Class348_Sub23_Sub2
						    .aClass229_9011));
	((Class367) this).aHa_Sub3_4479
	    .method3924(true, false, 0, Class342.aClass70_4247, false);
	((Class367) this).aHa_Sub3_4479
	    .method3885(0, true, Class318_Sub1_Sub2.aClass70_8737);
	((Class367) this).aHa_Sub3_4479.method3910((byte) -26, 0);
	((Class367) this).aHa_Sub3_4479.method3897(0, -4382);
	((Class367) this).aHa_Sub3_4479.method3894(-28186, -16777216);
	((Class367) this).aHa_Sub3_4479
	    .method3885(0, true, Class348_Sub40_Sub39.aClass70_9485);
	method3532(10425);
	if (i != 15192)
	    aShort7355 = (short) 106;
    }
    
    final void method3527(int i, Interface18 interface18, int i_22_) {
	((Class367) this).aHa_Sub3_4479.method3850((byte) 103, interface18);
	anInt7358++;
	if (i_22_ != -16776)
	    method3520((byte) -127);
    }
    
    static {
	aClass114_7363 = new IncomingPacket(103, 8);
    }
}
