/* GfxDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GfxDefinition
{
    static int anInt4486;
    boolean aBoolean4487;
    byte aByte4488 = 0;
    private int anInt4489;
    private short[] aShortArray4490;
    static int anInt4491;
    private int anInt4492;
    static int anInt4493;
    static int anInt4494;
    static int anInt4495;
    static int anInt4496;
    static int anInt4497;
    private int anInt4498 = 128;
    private short[] aShortArray4499;
    static IncomingPacket aClass114_4500 = new IncomingPacket(117, 1);
    int anInt4501;
    private short[] aShortArray4502;
    int anInt4503;
    private short[] aShortArray4504;
    static int anInt4505;
    private int anInt4506;
    private int anInt4507;
    private int anInt4508;
    static int anInt4509;
    static int anInt4510;
    static int anInt4511;
    private int anInt4512;
    GfxLoader aClass319_4513;
    
    final AnimatableToolkit method3558(int i, int i_0_, AbstractToolkit var_ha, int i_1_, int i_2_,
			     AnimationLoader class87, int i_3_) {
	try {
	    if (i_2_ != 3172)
		aShortArray4504 = null;
	    anInt4505++;
	    return method3566(var_ha, i_3_, i_1_, null, 0, class87, i,
			      (byte) 5, null, 0, false, 0, (byte) -68, i_0_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("fk.B(" + i + ',' + i_0_ + ','
					     + (var_ha != null ? "{...}"
						: "null")
					     + ',' + i_1_ + ',' + i_2_ + ','
					     + (class87 != null ? "{...}"
						: "null")
					     + ',' + i_3_ + ')'));
	}
    }
    
    final void method3559(int i, ByteBuffer class348_sub49) {
	anInt4497++;
	if (i == 28105) {
	    for (;;) {
		int i_4_ = class348_sub49.getUByte();
		if ((i_4_ ^ 0xffffffff) == -1)
		    break;
		method3564(i ^ ~0x6db5, class348_sub49, i_4_);
	    }
	}
    }
    
    public static void method3560(int i) {
	if (i != -13)
	    method3563(-34, (byte) 21, -111);
	aClass114_4500 = null;
    }
    
    static final String method3561(int i, Widget class46, boolean bool) {
	anInt4495++;
	if (bool != true)
	    method3560(68);
	if (!Main.method105(class46).method3301(i, !bool)
	    && ((Widget) class46).anObjectArray741 == null)
	    return null;
	if (((Widget) class46).aStringArray833 == null
	    || ((((Widget) class46).aStringArray833.length ^ 0xffffffff)
		>= (i ^ 0xffffffff))
	    || ((Widget) class46).aStringArray833[i] == null
	    || (((Widget) class46).aStringArray833[i].trim().length()
		^ 0xffffffff) == -1) {
	    if (Class299_Sub2.aBoolean6327)
		return "Hidden-" + i;
	    return null;
	}
	return ((Widget) class46).aStringArray833[i];
    }
    
    final AnimatableToolkit method3562(int i, AbstractToolkit var_ha, int i_5_, int i_6_, int i_7_,
			     AnimationLoader class87, byte i_8_) {
	try {
	    if (i_8_ <= 24)
		return null;
	    anInt4511++;
	    return method3566(var_ha, i, i_6_, null, 0, class87, i_5_,
			      (byte) 2, null, 0, false, 0, (byte) -68, i_7_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("fk.A(" + i + ','
					     + (var_ha != null ? "{...}"
						: "null")
					     + ',' + i_5_ + ',' + i_6_ + ','
					     + i_7_ + ','
					     + (class87 != null ? "{...}"
						: "null")
					     + ',' + i_8_ + ')'));
	}
    }
    
    static final boolean method3563(int i, byte i_9_, int i_10_) {
	anInt4493++;
	if (i_9_ != 56)
	    method3563(-107, (byte) 118, 32);
	if ((i & 0x800) == 0)
	    return false;
	return true;
    }
    
    private final void method3564(int i, ByteBuffer class348_sub49,
				  int i_11_) {
	anInt4486++;
	if (i < -119) {
	    if ((i_11_ ^ 0xffffffff) == -2)
		anInt4506 = class348_sub49.getShort();
	    else if (i_11_ != 2) {
		if (i_11_ == 4)
		    anInt4498 = class348_sub49.getShort();
		else if ((i_11_ ^ 0xffffffff) != -6) {
		    if ((i_11_ ^ 0xffffffff) != -7) {
			if ((i_11_ ^ 0xffffffff) != -8) {
			    if (i_11_ != 8) {
				if ((i_11_ ^ 0xffffffff) == -10) {
				    anInt4507 = 8224;
				    ((GfxDefinition) this).aByte4488 = (byte) 3;
				} else if (i_11_ != 10) {
				    if (i_11_ != 11) {
					if ((i_11_ ^ 0xffffffff) == -13)
					    ((GfxDefinition) this).aByte4488
						= (byte) 4;
					else if ((i_11_ ^ 0xffffffff) == -14)
					    ((GfxDefinition) this).aByte4488
						= (byte) 5;
					else if ((i_11_ ^ 0xffffffff) == -15) {
					    ((GfxDefinition) this).aByte4488
						= (byte) 2;
					    anInt4507
						= class348_sub49
						      .getUByte() * 256;
					} else if ((i_11_ ^ 0xffffffff)
						   != -16) {
					    if ((i_11_ ^ 0xffffffff) != -17) {
						if (i_11_ != 40) {
						    if ((i_11_ ^ 0xffffffff)
							== -42) {
							int i_12_
							    = (class348_sub49
								   .getUByte
							       ());
							aShortArray4504
							    = new short[i_12_];
							aShortArray4499
							    = new short[i_12_];
							for (int i_13_ = 0;
							     i_12_ > i_13_;
							     i_13_++) {
							    aShortArray4499
								[i_13_]
								= (short) (class348_sub49.getShort
									   ());
							    aShortArray4504
								[i_13_]
								= (short) (class348_sub49.getShort
									   ());
							}
						    }
						} else {
						    int i_14_
							= class348_sub49
							      .getUByte();
						    aShortArray4490
							= new short[i_14_];
						    aShortArray4502
							= new short[i_14_];
						    for (int i_15_ = 0;
							 i_14_ > i_15_;
							 i_15_++) {
							aShortArray4490[i_15_]
							    = (short) (class348_sub49
									   .getShort
								       ());
							aShortArray4502[i_15_]
							    = (short) (class348_sub49
									   .getShort
								       ());
						    }
						}
					    } else {
						((GfxDefinition) this).aByte4488
						    = (byte) 3;
						anInt4507 = (class348_sub49
								 .getDWord
							     ());
					    }
					} else {
					    ((GfxDefinition) this).aByte4488
						= (byte) 3;
					    anInt4507
						= class348_sub49
						      .getShort();
					}
				    } else
					((GfxDefinition) this).aByte4488 = (byte) 1;
				} else
				    ((GfxDefinition) this).aBoolean4487 = true;
			    } else
				anInt4512 = class348_sub49.getUByte();
			} else
			    anInt4489 = class348_sub49.getUByte();
		    } else
			anInt4508 = class348_sub49.getShort();
		} else
		    anInt4492 = class348_sub49.getShort();
	    } else
		((GfxDefinition) this).anInt4503
		    = class348_sub49.getShort();
	}
    }
    
    final AnimatableToolkit method3565(int i, int i_16_, int i_17_, int i_18_,
			     boolean bool, AbstractToolkit var_ha, int i_19_, int i_20_,
			     int i_21_, AnimationLoader class87, s var_s, int i_22_,
			     s var_s_23_) {
	try {
	    anInt4496++;
	    if (i_21_ != -129)
		method3566(null, 36, -84, null, 43, null, 2, (byte) 54, null,
			   -17, true, -42, (byte) 95, -81);
	    return method3566(var_ha, i_16_, i_18_, var_s, i_22_, class87, i,
			      (byte) 2, var_s_23_, i_17_, bool, i_20_,
			      (byte) -68, i_19_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("fk.F(" + i + ',' + i_16_ + ',' + i_17_ + ',' + i_18_
			+ ',' + bool + ','
			+ (var_ha != null ? "{...}" : "null") + ',' + i_19_
			+ ',' + i_20_ + ',' + i_21_ + ','
			+ (class87 != null ? "{...}" : "null") + ','
			+ (var_s != null ? "{...}" : "null") + ',' + i_22_
			+ ',' + (var_s_23_ != null ? "{...}" : "null") + ')'));
	}
    }
    
    public GfxDefinition() {
	((GfxDefinition) this).aBoolean4487 = false;
	anInt4508 = 0;
	((GfxDefinition) this).anInt4503 = -1;
	anInt4507 = -1;
	anInt4492 = 128;
	anInt4489 = 0;
	anInt4512 = 0;
    }
    
    private final AnimatableToolkit method3566
	(AbstractToolkit var_ha, int i, int i_24_, s var_s, int i_25_, AnimationLoader class87,
	 int i_26_, byte i_27_, s var_s_28_, int i_29_, boolean bool,
	 int i_30_, byte i_31_, int i_32_) {
	try {
	    anInt4491++;
	    int i_33_ = i_24_;
	    AnimationDefinition class17
		= (((GfxDefinition) this).anInt4503 != -1 && i != -1
		   ? class87.method835(((GfxDefinition) this).anInt4503, 7) : null);
	    bool = bool & ((GfxDefinition) this).aByte4488 != 0;
	    if (class17 != null)
		i_33_ |= class17.method263(i_32_, 110, i, false);
	    if (bool)
		i_33_
		    = i_33_ | ((((GfxDefinition) this).aByte4488 ^ 0xffffffff) != -4
			       ? 2 : 7);
	    if ((anInt4492 ^ 0xffffffff) != -129)
		i_33_ |= 0x2;
	    if ((anInt4498 ^ 0xffffffff) != -129
		|| (anInt4508 ^ 0xffffffff) != -1)
		i_33_ |= 0x5;
	    AnimatableToolkit class64;
	    synchronized (((GfxLoader) ((GfxDefinition) this).aClass319_4513)
			  .aClass60_3990) {
		class64
		    = ((AnimatableToolkit)
		       (((GfxLoader) ((GfxDefinition) this).aClass319_4513)
			    .aClass60_3990.method583
			((long) (((GfxDefinition) this).anInt4501
				 |= ((AbstractToolkit) var_ha).id << -1117748515),
			 -122)));
	    }
	    if (class64 == null || (var_ha.method3667(class64.ua(), i_33_)
				    ^ 0xffffffff) != -1) {
		if (class64 != null)
		    i_33_ = var_ha.OR(i_33_, class64.ua());
		int i_34_ = i_33_;
		if (aShortArray4490 != null)
		    i_34_ |= 0x4000;
		if (aShortArray4499 != null)
		    i_34_ |= 0x8000;
		Model class124
		    = Class300.createModel(0, (((GfxLoader) (((GfxDefinition) this)
							   .aClass319_4513))
					      .aClass45_3981), anInt4506);
		if (class124 == null)
		    return null;
		if ((((Model) class124).anInt1830 ^ 0xffffffff) > -14)
		    class124.method1092(2, 114);
		class64 = var_ha.method3625(class124, i_34_,
					    (((GfxLoader)
					      ((GfxDefinition) this).aClass319_4513)
					     .anInt3991),
					    64 + anInt4489, anInt4512 - -850);
		if (aShortArray4490 != null) {
		    for (int i_35_ = 0; ((aShortArray4490.length ^ 0xffffffff)
					 < (i_35_ ^ 0xffffffff)); i_35_++)
			class64.ia(aShortArray4490[i_35_],
				   aShortArray4502[i_35_]);
		}
		if (aShortArray4499 != null) {
		    for (int i_36_ = 0;
			 ((i_36_ ^ 0xffffffff)
			  > (aShortArray4499.length ^ 0xffffffff));
			 i_36_++)
			class64.aa(aShortArray4499[i_36_],
				   aShortArray4504[i_36_]);
		}
		class64.s(i_33_);
		synchronized (((GfxLoader) ((GfxDefinition) this).aClass319_4513)
			      .aClass60_3990) {
		    ((GfxLoader) ((GfxDefinition) this).aClass319_4513)
			.aClass60_3990.method582
			(class64,
			 (long) (((GfxDefinition) this).anInt4501
				 |= ((AbstractToolkit) var_ha).id << 941878397),
			 (byte) -113);
		}
	    }
	    if (i_31_ != -68)
		return null;
	    AnimatableToolkit class64_37_
		= (class17 != null
		   ? class17.method266(class64, 0, i_32_, i_27_, i, i_26_,
				       663780816, i_33_)
		   : class64.method614(i_27_, i_33_, true));
	    if ((anInt4498 ^ 0xffffffff) != -129 || anInt4492 != 128)
		class64_37_.O(anInt4498, anInt4492, anInt4498);
	    if (anInt4508 != 0) {
		if ((anInt4508 ^ 0xffffffff) == -91)
		    class64_37_.a(4096);
		if ((anInt4508 ^ 0xffffffff) == -181)
		    class64_37_.a(8192);
		if (anInt4508 == 270)
		    class64_37_.a(12288);
	    }
	    if (bool)
		class64_37_.p(((GfxDefinition) this).aByte4488, anInt4507,
			      var_s_28_, var_s, i_30_, i_29_, i_25_);
	    class64_37_.s(i_24_);
	    return class64_37_;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("fk.I(" + (var_ha != null ? "{...}" : "null") + ',' + i
			+ ',' + i_24_ + ','
			+ (var_s != null ? "{...}" : "null") + ',' + i_25_
			+ ',' + (class87 != null ? "{...}" : "null") + ','
			+ i_26_ + ',' + i_27_ + ','
			+ (var_s_28_ != null ? "{...}" : "null") + ',' + i_29_
			+ ',' + bool + ',' + i_30_ + ',' + i_31_ + ',' + i_32_
			+ ')'));
	}
    }
}
