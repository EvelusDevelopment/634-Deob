/* Class286_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class286_Sub9 extends Class286
{
    static int anInt6306;
    static int anInt6307;
    private boolean aBoolean6308;
    static int anInt6309;
    private Class61 aClass61_6310;
    static int anInt6311;
    static int anInt6312;
    static int anInt6313;
    static int anInt6314;
    static int anInt6315;
    private boolean aBoolean6316 = false;
    private Class258_Sub2[] aClass258_Sub2Array6317;
    static int anInt6318;
    static int anInt6319;
    
    static final boolean method2174(byte i, int i_0_, int i_1_) {
	anInt6313++;
	int i_2_ = 52 % ((i - 68) / 41);
	return false;
    }
    
    final void method2133(int i) {
	anInt6318++;
	if (aBoolean6316) {
	    if (!aBoolean6308) {
		((Class286) this).aHa_Sub2_3684.method3738(-15039, 2);
		((Class286) this).aHa_Sub2_3684.method3771((byte) -84, null);
	    }
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
	    ((Class286) this).aHa_Sub2_3684.method3771((byte) -87, null);
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
	    aClass61_6310.method594('\001', 28666);
	    aBoolean6316 = false;
	} else
	    ((Class286) this).aHa_Sub2_3684.method3775(false, 0, 770, 5890);
	if (i < -75)
	    ((Class286) this).aHa_Sub2_3684.method3729(8448, (byte) -75, 8448);
    }
    
    static final int method2175(int i, byte i_3_, int i_4_) {
	anInt6319++;
	if (i_3_ >= -14)
	    return 64;
	if (i_4_ == 1 || i_4_ == 3)
	    return Class348_Sub20.anIntArray6830[i & 0x3];
	return Class84.anIntArray1450[0x3 & i];
    }
    
    final void method2140(Class258 class258, byte i, int i_5_) {
	if (i >= -89)
	    aClass258_Sub2Array6317 = null;
	((Class286) this).aHa_Sub2_3684.method3771((byte) -115, class258);
	anInt6312++;
	((Class286) this).aHa_Sub2_3684.method3761(0, i_5_);
    }
    
    private final void method2176(int i) {
	aClass61_6310 = new Class61(((Class286) this).aHa_Sub2_3684, 2);
	if (i >= -7)
	    method2140(null, (byte) 112, -64);
	anInt6314++;
	aClass61_6310.method595((byte) 105, 0);
	((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
	OpenGL.glTexGeni(8192, 9472, 34065);
	OpenGL.glTexGeni(8193, 9472, 34065);
	OpenGL.glTexGeni(8194, 9472, 34065);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glEnable(3170);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
	OpenGL.glMatrixMode(5888);
	if (!aBoolean6308) {
	    ((Class286) this).aHa_Sub2_3684.method3729(7681, (byte) 126, 8448);
	    ((Class286) this).aHa_Sub2_3684.method3762(34168, 768, (byte) -87,
						       0);
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 2);
	    ((Class286) this).aHa_Sub2_3684.method3729(260, (byte) 124, 7681);
	    ((Class286) this).aHa_Sub2_3684.method3762(34168, 768, (byte) -87,
						       0);
	    ((Class286) this).aHa_Sub2_3684.method3762(34168, 770, (byte) -87,
						       1);
	    ((Class286) this).aHa_Sub2_3684.method3775(false, 0, 770, 34167);
	} else {
	    ((Class286) this).aHa_Sub2_3684.method3729(260, (byte) 104, 7681);
	    ((Class286) this).aHa_Sub2_3684.method3762(5890, 770, (byte) -87,
						       0);
	    ((Class286) this).aHa_Sub2_3684.method3775(false, 0, 770, 34167);
	}
	((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
	aClass61_6310.method591(-1);
	aClass61_6310.method595((byte) 114, 1);
	((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	OpenGL.glDisable(3170);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	if (!aBoolean6308) {
	    ((Class286) this).aHa_Sub2_3684.method3729(8448, (byte) -9, 8448);
	    ((Class286) this).aHa_Sub2_3684.method3762(5890, 768, (byte) -87,
						       0);
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 2);
	    ((Class286) this).aHa_Sub2_3684.method3729(8448, (byte) 92, 8448);
	    ((Class286) this).aHa_Sub2_3684.method3762(5890, 768, (byte) -87,
						       0);
	    ((Class286) this).aHa_Sub2_3684.method3762(34168, 768, (byte) -87,
						       1);
	    ((Class286) this).aHa_Sub2_3684.method3775(false, 0, 770, 5890);
	} else {
	    ((Class286) this).aHa_Sub2_3684.method3729(8448, (byte) 115, 8448);
	    ((Class286) this).aHa_Sub2_3684.method3762(5890, 768, (byte) -87,
						       0);
	    ((Class286) this).aHa_Sub2_3684.method3775(false, 0, 770, 5890);
	}
	((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
	aClass61_6310.method591(-1);
    }
    
    final void method2136(int i, int i_6_, byte i_7_) {
	anInt6307++;
	if (aBoolean6316) {
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
	    ((Class286) this).aHa_Sub2_3684
		.method3771((byte) -91, aClass258_Sub2Array6317[i + -1]);
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
	}
	if (i_7_ > -42)
	    method2134(true, true);
    }
    
    final boolean method2137(int i) {
	anInt6315++;
	if (i > -5)
	    return false;
	return true;
    }
    
    final void method2134(boolean bool, boolean bool_8_) {
	if (bool_8_ == false) {
	    anInt6306++;
	    if (aClass61_6310 == null || !bool)
		((Class286) this).aHa_Sub2_3684.method3775(false, 0, 770,
							   34168);
	    else {
		if (!aBoolean6308) {
		    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 2);
		    ((Class286) this).aHa_Sub2_3684.method3771
			((byte) -120,
			 (((DirectxToolkit) ((Class286) this).aHa_Sub2_3684)
			  .aClass258_Sub3_7827));
		    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
		}
		aClass61_6310.method594('\0', 28666);
		aBoolean6316 = true;
	    }
	}
    }
    
    final void method2139(boolean bool, byte i) {
	((Class286) this).aHa_Sub2_3684.method3729(8448, (byte) 121, 7681);
	anInt6309++;
	int i_9_ = 96 / ((i - -60) / 38);
    }
    
    Class286_Sub9(DirectxToolkit var_ha_Sub2) {
	super(var_ha_Sub2);
	if (((DirectxToolkit) var_ha_Sub2).aBoolean7863) {
	    aBoolean6308 = ((DirectxToolkit) var_ha_Sub2).anInt7795 < 3;
	    int i = aBoolean6308 ? 48 : 127;
	    byte[][] is = new byte[6][4096];
	    byte[][] is_10_ = new byte[6][4096];
	    byte[][] is_11_ = new byte[6][4096];
	    int i_12_ = 0;
	    for (int i_13_ = 0; i_13_ < 64; i_13_++) {
		for (int i_14_ = 0; i_14_ < 64; i_14_++) {
		    float f = (float) i_13_ * 2.0F / 64.0F - 1.0F;
		    float f_15_ = -1.0F + 2.0F * (float) i_14_ / 64.0F;
		    float f_16_
			= (float) (1.0
				   / Math.sqrt((double) (f * f
							 + (1.0F
							    + (f_15_
							       * f_15_)))));
		    f_15_ *= f_16_;
		    f *= f_16_;
		    for (int i_17_ = 0; i_17_ < 6; i_17_++) {
			float f_18_;
			if (i_17_ == 0)
			    f_18_ = -f_15_;
			else if (i_17_ == 1)
			    f_18_ = f_15_;
			else if ((i_17_ ^ 0xffffffff) != -3) {
			    if (i_17_ != 3) {
				if ((i_17_ ^ 0xffffffff) != -5)
				    f_18_ = -f_16_;
				else
				    f_18_ = f_16_;
			    } else
				f_18_ = -f;
			} else
			    f_18_ = f;
			int i_19_;
			int i_20_;
			int i_21_;
			if (!(f_18_ > 0.0F))
			    i_19_ = i_20_ = i_21_ = 0;
			else {
			    i_19_ = (int) ((double) i
					   * Math.pow((double) f_18_, 96.0));
			    i_20_ = (int) ((double) i
					   * Math.pow((double) f_18_, 36.0));
			    i_21_ = (int) ((double) i
					   * Math.pow((double) f_18_, 12.0));
			}
			is_10_[i_17_][i_12_] = (byte) i_19_;
			is_11_[i_17_][i_12_] = (byte) i_20_;
			is[i_17_][i_12_] = (byte) i_21_;
		    }
		    i_12_++;
		}
	    }
	    aClass258_Sub2Array6317 = new Class258_Sub2[3];
	    aClass258_Sub2Array6317[0]
		= new Class258_Sub2(((Class286) this).aHa_Sub2_3684, 6406, 64,
				    false, is_10_, 6406);
	    aClass258_Sub2Array6317[1]
		= new Class258_Sub2(((Class286) this).aHa_Sub2_3684, 6406, 64,
				    false, is_11_, 6406);
	    aClass258_Sub2Array6317[2]
		= new Class258_Sub2(((Class286) this).aHa_Sub2_3684, 6406, 64,
				    false, is, 6406);
	    method2176(-88);
	}
    }
    
    static final void method2177(int i, int i_22_,
				 GameBuffer class348_sub49_sub2) {
	anInt6311++;
	boolean bool
	    = ((class348_sub49_sub2.method3410((byte) -24, i) ^ 0xffffffff)
	       == -2);
	if (bool)
	    Class18.anIntArray279[Class101_Sub3.anInt5768++] = i_22_;
	int i_23_ = class348_sub49_sub2.method3410((byte) -24, 2);
	Player class318_sub1_sub3_sub3_sub2
	    = ClassicLoadingScreen.players[i_22_];
	if (i_23_ == 0) {
	    if (bool)
		((Player) class318_sub1_sub3_sub3_sub2)
		    .aBoolean10539
		    = false;
	    else {
		if ((i_22_ ^ 0xffffffff)
		    == (Class348_Sub42_Sub11.localPlayerId ^ 0xffffffff))
		    throw new RuntimeException("s:lr");
		Class359 class359 = (Class348_Sub17.aClass359Array6802[i_22_]
				     = new Class359());
		((Class359) class359).anInt4420
		    = ((Class90.anInt1517 - -(((Class318_Sub1_Sub3_Sub3)
					       class318_sub1_sub3_sub3_sub2)
					      .anIntArray10317[0])
			>> 592604966)
		       + ((((Class318_Sub1_Sub3_Sub3)
			    class318_sub1_sub3_sub3_sub2).anIntArray10320[0]
			   + za_Sub2.anInt9780)
			  >> 1829075398 << -2094968434)
		       + ((((Class318_Sub1) class318_sub1_sub3_sub3_sub2)
			   .aByte6381)
			  << 471827900));
		if ((((Player)
		      class318_sub1_sub3_sub3_sub2).anInt10524
		     ^ 0xffffffff)
		    != 0)
		    ((Class359) class359).anInt4423
			= ((Player)
			   class318_sub1_sub3_sub3_sub2).anInt10524;
		else
		    ((Class359) class359).anInt4423
			= ((Class318_Sub1_Sub3_Sub3)
			   class318_sub1_sub3_sub3_sub2)
			      .aClass264_10217.method2019((byte) -91);
		((Class359) class359).aBoolean4426
		    = ((Player)
		       class318_sub1_sub3_sub3_sub2).aBoolean10554;
		((Class359) class359).anInt4425
		    = (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub2)
		       .anInt10275);
		if (((Player)
		     class318_sub1_sub3_sub3_sub2).anInt10553
		    > 0)
		    Class295.method2221(class318_sub1_sub3_sub3_sub2, -28482);
		ClassicLoadingScreen.players[i_22_] = null;
		if (class348_sub49_sub2.method3410((byte) -24, 1) != 0)
		    Class211.method1538(i_22_, (byte) 105,
					class348_sub49_sub2);
	    }
	} else if ((i_23_ ^ 0xffffffff) == -2) {
	    int i_24_ = class348_sub49_sub2.method3410((byte) -24, 3);
	    int i_25_
		= (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub2)
		   .anIntArray10320[0]);
	    int i_26_
		= (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub2)
		   .anIntArray10317[0]);
	    if ((i_24_ ^ 0xffffffff) != -1) {
		if (i_24_ != 1) {
		    if ((i_24_ ^ 0xffffffff) != -3) {
			if ((i_24_ ^ 0xffffffff) == -4)
			    i_25_--;
			else if ((i_24_ ^ 0xffffffff) != -5) {
			    if (i_24_ != 5) {
				if (i_24_ != 6) {
				    if (i_24_ == 7) {
					i_26_++;
					i_25_++;
				    }
				} else
				    i_26_++;
			    } else {
				i_26_++;
				i_25_--;
			    }
			} else
			    i_25_++;
		    } else {
			i_25_++;
			i_26_--;
		    }
		} else
		    i_26_--;
	    } else {
		i_26_--;
		i_25_--;
	    }
	    if (!bool)
		class318_sub1_sub3_sub3_sub2.method2455(i_26_, -26443,
							(IntegerVarScriptSettingLoader
							 .aByteArray3300
							 [i_22_]),
							i_25_);
	    else {
		((Player) class318_sub1_sub3_sub3_sub2)
		    .anInt10531
		    = i_26_;
		((Player) class318_sub1_sub3_sub3_sub2)
		    .aBoolean10539
		    = true;
		((Player) class318_sub1_sub3_sub3_sub2)
		    .anInt10549
		    = i_25_;
	    }
	} else if ((i_23_ ^ 0xffffffff) == -3) {
	    int i_27_ = class348_sub49_sub2.method3410((byte) -24, 4);
	    int i_28_
		= (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub2)
		   .anIntArray10320[0]);
	    int i_29_
		= (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub2)
		   .anIntArray10317[0]);
	    if (i_27_ == 0) {
		i_28_ -= 2;
		i_29_ -= 2;
	    } else if ((i_27_ ^ 0xffffffff) != -2) {
		if (i_27_ != 2) {
		    if ((i_27_ ^ 0xffffffff) != -4) {
			if (i_27_ == 4) {
			    i_28_ += 2;
			    i_29_ -= 2;
			} else if ((i_27_ ^ 0xffffffff) != -6) {
			    if (i_27_ == 6) {
				i_29_--;
				i_28_ += 2;
			    } else if ((i_27_ ^ 0xffffffff) == -8)
				i_28_ -= 2;
			    else if ((i_27_ ^ 0xffffffff) == -9)
				i_28_ += 2;
			    else if (i_27_ == 9) {
				i_29_++;
				i_28_ -= 2;
			    } else if ((i_27_ ^ 0xffffffff) != -11) {
				if (i_27_ == 11) {
				    i_29_ += 2;
				    i_28_ -= 2;
				} else if ((i_27_ ^ 0xffffffff) == -13) {
				    i_29_ += 2;
				    i_28_--;
				} else if ((i_27_ ^ 0xffffffff) != -14) {
				    if ((i_27_ ^ 0xffffffff) == -15) {
					i_29_ += 2;
					i_28_++;
				    } else if ((i_27_ ^ 0xffffffff) == -16) {
					i_28_ += 2;
					i_29_ += 2;
				    }
				} else
				    i_29_ += 2;
			    } else {
				i_29_++;
				i_28_ += 2;
			    }
			} else {
			    i_28_ -= 2;
			    i_29_--;
			}
		    } else {
			i_29_ -= 2;
			i_28_++;
		    }
		} else
		    i_29_ -= 2;
	    } else {
		i_29_ -= 2;
		i_28_--;
	    }
	    if (!bool)
		class318_sub1_sub3_sub3_sub2.method2455(i_29_, -26443,
							(IntegerVarScriptSettingLoader
							 .aByteArray3300
							 [i_22_]),
							i_28_);
	    else {
		((Player) class318_sub1_sub3_sub3_sub2)
		    .aBoolean10539
		    = true;
		((Player) class318_sub1_sub3_sub3_sub2)
		    .anInt10549
		    = i_28_;
		((Player) class318_sub1_sub3_sub3_sub2)
		    .anInt10531
		    = i_29_;
	    }
	} else {
	    int i_30_ = class348_sub49_sub2.method3410((byte) -24, 1);
	    if ((i_30_ ^ 0xffffffff) == -1) {
		int i_31_ = class348_sub49_sub2.method3410((byte) -24, 12);
		int i_32_ = i_31_ >> -1062068982;
		int i_33_ = 0x1f & i_31_ >> -1409005179;
		if (i_33_ > 15)
		    i_33_ -= 32;
		int i_34_ = 0x1f & i_31_;
		if (i_34_ > 15)
		    i_34_ -= 32;
		int i_35_ = i_33_ + (((Class318_Sub1_Sub3_Sub3)
				      class318_sub1_sub3_sub3_sub2)
				     .anIntArray10320[0]);
		int i_36_ = i_34_ + (((Class318_Sub1_Sub3_Sub3)
				      class318_sub1_sub3_sub3_sub2)
				     .anIntArray10317[0]);
		if (!bool)
		    class318_sub1_sub3_sub3_sub2.method2455(i_36_, -26443,
							    (IntegerVarScriptSettingLoader
							     .aByteArray3300
							     [i_22_]),
							    i_35_);
		else {
		    ((Player)
		     class318_sub1_sub3_sub3_sub2).anInt10531
			= i_36_;
		    ((Player)
		     class318_sub1_sub3_sub3_sub2).anInt10549
			= i_35_;
		    ((Player)
		     class318_sub1_sub3_sub3_sub2).aBoolean10539
			= true;
		}
		((Class318_Sub1) class318_sub1_sub3_sub3_sub2).aByte6381
		    = ((Class318_Sub1) class318_sub1_sub3_sub3_sub2).aByte6376
		    = (byte) (0x3
			      & (((Class318_Sub1) class318_sub1_sub3_sub3_sub2)
				 .aByte6381) + i_32_);
		if (NpcDefinition.method802(i_36_, i_35_, true))
		    ((Class318_Sub1) class318_sub1_sub3_sub3_sub2).aByte6376++;
		if (Class348_Sub42_Sub11.localPlayerId == i_22_) {
		    if ((((Class318_Sub1) class318_sub1_sub3_sub3_sub2)
			 .aByte6381)
			!= Class355.anInt4372)
			Class348_Sub16_Sub2.aBoolean8870 = true;
		    Class355.anInt4372
			= (((Class318_Sub1) class318_sub1_sub3_sub3_sub2)
			   .aByte6381);
		}
	    } else {
		int i_37_ = class348_sub49_sub2.method3410((byte) -24, 30);
		int i_38_ = i_37_ >> -1838781572;
		int i_39_ = 0x3fff & i_37_ >> -946421778;
		int i_40_ = 0x3fff & i_37_;
		int i_41_ = ((i_39_ + ((((Class318_Sub1_Sub3_Sub3)
					 class318_sub1_sub3_sub3_sub2)
					.anIntArray10320[0])
				       + za_Sub2.anInt9780)
			      & 0x3fff)
			     - za_Sub2.anInt9780);
		int i_42_ = (-Class90.anInt1517
			     + (0x3fff & (i_40_ + Class90.anInt1517
					  + (((Class318_Sub1_Sub3_Sub3)
					      class318_sub1_sub3_sub3_sub2)
					     .anIntArray10317[0]))));
		if (bool) {
		    ((Player)
		     class318_sub1_sub3_sub3_sub2).aBoolean10539
			= true;
		    ((Player)
		     class318_sub1_sub3_sub3_sub2).anInt10531
			= i_42_;
		    ((Player)
		     class318_sub1_sub3_sub3_sub2).anInt10549
			= i_41_;
		} else
		    class318_sub1_sub3_sub3_sub2.method2455(i_42_, -26443,
							    (IntegerVarScriptSettingLoader
							     .aByteArray3300
							     [i_22_]),
							    i_41_);
		((Class318_Sub1) class318_sub1_sub3_sub3_sub2).aByte6381
		    = ((Class318_Sub1) class318_sub1_sub3_sub3_sub2).aByte6376
		    = (byte) ((((Class318_Sub1) class318_sub1_sub3_sub3_sub2)
			       .aByte6381) + i_38_
			      & 0x3);
		if (NpcDefinition.method802(i_42_, i_41_, true))
		    ((Class318_Sub1) class318_sub1_sub3_sub3_sub2).aByte6376++;
		if ((i_22_ ^ 0xffffffff)
		    == (Class348_Sub42_Sub11.localPlayerId ^ 0xffffffff))
		    Class355.anInt4372
			= (((Class318_Sub1) class318_sub1_sub3_sub3_sub2)
			   .aByte6381);
	    }
	}
    }
}
