/* Player - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Hashtable;

final class Player extends Class318_Sub1_Sub3_Sub3
{
    int anInt10516;
    boolean aBoolean10517 = false;
    static int anInt10518;
    int anInt10519;
    private int anInt10520;
    boolean aBoolean10521;
    int anInt10522;
    static int anInt10523;
    int anInt10524;
    static int anInt10525;
    int anInt10526;
    static int anInt10527;
    static int anInt10528;
    static int anInt10529;
    static int anInt10530;
    int anInt10531;
    static int anInt10532;
    static int anInt10533;
    static int anInt10534;
    int anInt10535;
    Class154 aClass154_10536;
    String username;
    private byte aByte10538;
    boolean aBoolean10539;
    int anInt10540;
    static int anInt10541;
    int anInt10542;
    static int anInt10543;
    String aString10544;
    static int anInt10545;
    static int anInt10546;
    static int anInt10547;
    static int anInt10548;
    int anInt10549;
    static int anInt10550;
    boolean aBoolean10551;
    private byte aByte10552;
    int anInt10553;
    boolean aBoolean10554;
    static int anInt10555;
    private byte aByte10556;
    int anInt10557;
    int anInt10558;
    static int anInt10559;
    int anInt10560;
    int anInt10561;
    static int anInt10562;
    static int anInt10563;
    int anInt10564;
    static Hashtable aHashtable10565 = new Hashtable();
    static int[] anIntArray10566;
    static int anInt10567 = -1;
    
    final void method2387(AbstractToolkit var_ha, int i) {
	anInt10533++;
	if (((Player) this).aClass154_10536 != null
	    && (((Class318_Sub1_Sub3_Sub3) this).aBoolean10318
		|| method2459(0, var_ha, -123))) {
	    Class101 class101 = var_ha.method3705();
	    if (i >= -125)
		method2457((byte) -106);
	    class101.method895(((Class318_Sub1_Sub3_Sub3) this)
				   .aClass264_10217.method2019((byte) -116));
	    class101.method891(((Class318_Sub1) this).anInt6377,
			       -5 + ((Class318_Sub1) this).anInt6382,
			       ((Class318_Sub1) this).anInt6388);
	    this.method2432(var_ha, -15074, class101,
			    ((Class318_Sub1_Sub3_Sub3) this).aBoolean10318,
			    (((Class318_Sub1_Sub3_Sub3) this)
			     .aClass64Array10323));
	    ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[0]
		= ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[1]
		= ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[2]
		= null;
	}
    }
    
    final void method2449(int i, int i_0_, byte i_1_) {
	anInt10541++;
	((Class318_Sub1_Sub3_Sub3) this).anInt10322 = 0;
	((Class318_Sub1_Sub3_Sub3) this).anIntArray10320[0] = i_0_;
	((Class318_Sub1_Sub3_Sub3) this).anInt10319 = 0;
	((Class318_Sub1_Sub3_Sub3) this).anInt10326 = 0;
	((Class318_Sub1_Sub3_Sub3) this).anIntArray10317[0] = i;
	if (i_1_ <= 55)
	    anInt10567 = -3;
	int i_2_ = method2436((byte) 103);
	((Class318_Sub1) this).anInt6388
	    = (256 * i_2_
	       + 512 * ((Class318_Sub1_Sub3_Sub3) this).anIntArray10317[0]);
	((Class318_Sub1) this).anInt6377
	    = (((Class318_Sub1_Sub3_Sub3) this).anIntArray10320[0] * 512
	       + i_2_ * 256);
	if (Class132.localPlayer == this)
	    Class76.method773(true);
	if (((Class318_Sub1_Sub3_Sub3) this).aClass318_Sub10_10327 != null)
	    ((Class318_Sub1_Sub3_Sub3) this).aClass318_Sub10_10327
		.method2529();
    }
    
    final String method2450(boolean bool, int i) {
	if (i > -67)
	    ((Player) this).aBoolean10554 = false;
	anInt10555++;
	if (bool)
	    return ((Player) this).username;
	return ((Player) this).aString10544;
    }
    
    final void method2451(byte i, int i_3_, int i_4_, int i_5_) {
	if (i_4_ != -29034)
	    ((Player) this).anInt10557 = -47;
	anInt10528++;
	if ((((Class318_Sub1_Sub3_Sub3) this).anInt10319 ^ 0xffffffff) > -10)
	    ((Class318_Sub1_Sub3_Sub3) this).anInt10319++;
	for (int i_6_ = ((Class318_Sub1_Sub3_Sub3) this).anInt10319; i_6_ > 0;
	     i_6_--) {
	    ((Class318_Sub1_Sub3_Sub3) this).anIntArray10320[i_6_]
		= ((Class318_Sub1_Sub3_Sub3) this).anIntArray10320[-1 + i_6_];
	    ((Class318_Sub1_Sub3_Sub3) this).anIntArray10317[i_6_]
		= ((Class318_Sub1_Sub3_Sub3) this).anIntArray10317[i_6_ + -1];
	    ((Class318_Sub1_Sub3_Sub3) this).aByteArray10321[i_6_]
		= ((Class318_Sub1_Sub3_Sub3) this).aByteArray10321[-1 + i_6_];
	}
	((Class318_Sub1_Sub3_Sub3) this).anIntArray10320[0] = i_3_;
	((Class318_Sub1_Sub3_Sub3) this).aByteArray10321[0] = i;
	((Class318_Sub1_Sub3_Sub3) this).anIntArray10317[0] = i_5_;
    }
    
    final boolean method2391(AbstractToolkit var_ha, int i, int i_7_, int i_8_) {
	anInt10562++;
	if (((Player) this).aClass154_10536 == null
	    || !method2459(131072, var_ha, 113))
	    return false;
	Class101 class101 = var_ha.method3705();
	int i_9_ = ((Class318_Sub1_Sub3_Sub3) this).aClass264_10217
		       .method2019((byte) -31);
	class101.method895(i_9_);
	class101.method891(((Class318_Sub1) this).anInt6377,
			   ((Class318_Sub1) this).anInt6382,
			   ((Class318_Sub1) this).anInt6388);
	boolean bool = false;
	for (int i_10_ = 0;
	     ((i_10_ ^ 0xffffffff)
	      > (((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323.length
		 ^ 0xffffffff));
	     i_10_++) {
	    if ((((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[i_10_]
		 != null)
		&& (Class305.aBoolean3870
		    ? (((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323
			   [i_10_].method623
		       (i_7_, i, class101, true, 0, Class132.anInt1906))
		    : ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323
			  [i_10_].method628(i_7_, i, class101, true, 0))) {
		bool = true;
		break;
	    }
	}
	((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[i_8_]
	    = ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[1]
	    = ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[2] = null;
	return bool;
    }
    
    final void method2452(byte i, ByteBuffer class348_sub49) {
	anInt10547++;
	((ByteBuffer) class348_sub49).position = 0;
	int i_11_ = class348_sub49.getUByte();
	aByte10538 = (byte) (i_11_ & 0x1);
	boolean bool = ((Player) this).aBoolean10517;
	((Player) this).aBoolean10517 = (0x2 & i_11_) != 0;
	boolean bool_12_ = (i_11_ & 0x4 ^ 0xffffffff) != -1;
	int i_13_ = super.method2436((byte) 68);
	this.method2434((byte) 51, 1 + ((0x3f & i_11_) >> 939208163));
	aByte10552 = (byte) (i_11_ >> 2109005158 & 0x3);
	((Class318_Sub1) this).anInt6377 += -i_13_ + method2436((byte) 47) << 1271420456;
	((Class318_Sub1) this).anInt6388 += method2436((byte) 96) + -i_13_ << 2109816392;
	aByte10556 = class348_sub49.getByte();
	((Player) this).anInt10540 = class348_sub49.getByte();
	((Player) this).anInt10522 = class348_sub49.getByte();
	((Player) this).aBoolean10551 = class348_sub49.getByte() == 1;
	if (Class8.modeWhere == Class55_Sub1.aClass364_5271 && Class192.anInt2581 >= 2)
	    ((Player) this).aBoolean10551 = false;
	((Player) this).anInt10542 = 0;
	int i_14_ = -1;
	int[] is = new int[12];
	for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -13; i_15_++) {
	    int i_16_ = class348_sub49.getUByte();
	    if ((i_16_ ^ 0xffffffff) == -1)
		is[i_15_] = 0;
	    else {
		int i_17_ = class348_sub49.getUByte();
		int i_18_ = i_17_ + (i_16_ << 1691219592);
		if (i_15_ == 0 && (i_18_ ^ 0xffffffff) == -65536) {
		    i_14_ = class348_sub49.getShort();
		    ((Player) this).anInt10542
			= class348_sub49.getUByte();
		    break;
		}
		if ((i_18_ ^ 0xffffffff) <= -32769) {
		    i_18_ = Class25.anIntArray369[-32768 + i_18_];
		    is[i_15_] = Class273.method2057(1073741824, i_18_);
		    int i_19_ = (((ItemDefinition) ToolkitException.itemLoader.getItemDefinition(-111, i_18_)).anInt2827);
		    if (i_19_ != 0)
			((Player) this).anInt10542 = i_19_;
		} else
		    is[i_15_] = Class273.method2057(-256 + i_18_, -2147483648);
	    }
	}
	int[] is_20_ = new int[5];
	for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > -6; i_21_++) {
	    int i_22_ = class348_sub49.getUByte();
	    if (Class367_Sub2.aShortArrayArrayArray7290.length < 1
		|| (i_22_ ^ 0xffffffff) > -1
		|| (Class367_Sub2.aShortArrayArrayArray7290[0][i_21_].length
		    ^ 0xffffffff) >= (i_22_ ^ 0xffffffff))
		i_22_ = 0;
	    is_20_[i_21_] = i_22_;
	}
	anInt10520 = class348_sub49.getShort();
	((Player) this).username = class348_sub49.getJStr();
	((Player) this).aString10544 = ((Player) this).username;
	if (this == Class132.localPlayer)
	    s_Sub2.aString8265 = ((Player) this).username;
	((Player) this).anInt10516 = class348_sub49.getUByte();
	if (!bool_12_) {
	    ((Player) this).anInt10564 = 0;
	    ((Player) this).anInt10557
		= class348_sub49.getUByte();
	    ((Player) this).anInt10561
		= class348_sub49.getUByte();
	    if (((Player) this).anInt10561 == 255)
		((Player) this).anInt10561 = -1;
	} else {
	    ((Player) this).anInt10564
		= class348_sub49.getShort();
	    ((Player) this).anInt10557
		= ((Player) this).anInt10516;
	    if (((Player) this).anInt10564 == 65535)
		((Player) this).anInt10564 = -1;
	    ((Player) this).anInt10561 = -1;
	}
	int i_23_ = ((Player) this).anInt10553;
	((Player) this).anInt10553
	    = class348_sub49.getUByte();
	if (((Player) this).anInt10553 == 0)
	    Class295.method2221(this, -28482);
	else {
	    int i_24_ = ((Player) this).anInt10535;
	    int i_25_ = ((Player) this).anInt10526;
	    int i_26_ = ((Player) this).anInt10560;
	    int i_27_ = ((Player) this).anInt10519;
	    int i_28_ = ((Player) this).anInt10558;
	    ((Player) this).anInt10535
		= class348_sub49.getShort();
	    ((Player) this).anInt10526
		= class348_sub49.getShort();
	    ((Player) this).anInt10560
		= class348_sub49.getShort();
	    ((Player) this).anInt10519
		= class348_sub49.getShort();
	    ((Player) this).anInt10558
		= class348_sub49.getUByte();
	    if (!((Player) this).aBoolean10517 != !bool
		|| ((Player) this).anInt10553 != i_23_
		|| (((Player) this).anInt10535
		    ^ 0xffffffff) != (i_24_ ^ 0xffffffff)
		|| i_25_ != ((Player) this).anInt10526
		|| ((i_26_ ^ 0xffffffff)
		    != (((Player) this).anInt10560
			^ 0xffffffff))
		|| ((Player) this).anInt10519 != i_27_
		|| i_28_ != ((Player) this).anInt10558)
		Class92.method858(true, this);
	}
	if (((Player) this).aClass154_10536 == null)
	    ((Player) this).aClass154_10536
		= new Class154();
	int i_29_ = (((Class154)
		      ((Player) this).aClass154_10536)
		     .anInt2093);
	int[] is_30_ = (((Class154)
			 ((Player) this).aClass154_10536)
			.anIntArray2095);
	((Player) this).aClass154_10536.method1228
	    (i_14_, 105, method2421((byte) 121), is,
	     (aByte10538 ^ 0xffffffff) == -2, is_20_);
	if (i_14_ != i_29_) {
	    ((Class318_Sub1) this).anInt6377
		= (((Class318_Sub1_Sub3_Sub3) this).anIntArray10320[0]
		   << -757818679) + (method2436((byte) 89) << -341559384);
	    ((Class318_Sub1) this).anInt6388
		= (((Class318_Sub1_Sub3_Sub3) this).anIntArray10317[0]
		   << 1810217385) + (method2436((byte) 98) << -592799704);
	}
	if (((((Class318_Sub1_Sub3_Sub3) this).anInt10290 ^ 0xffffffff)
	     == (Class348_Sub42_Sub11.localPlayerId ^ 0xffffffff))
	    && is_30_ != null) {
	    for (int i_31_ = 0; i_31_ < is_20_.length; i_31_++) {
		if (is_20_[i_31_] != is_30_[i_31_]) {
		    ToolkitException.itemLoader.method1936(72);
		    break;
		}
	    }
	}
	if (((Class318_Sub1_Sub3_Sub3) this).aClass318_Sub10_10327 != null)
	    ((Class318_Sub1_Sub3_Sub3) this).aClass318_Sub10_10327
		.method2529();
	if (((Class318_Sub1_Sub3_Sub3) this).anInt10268 != -1
	    && ((Class318_Sub1_Sub3_Sub3) this).aBoolean10213) {
	    Class225 class225 = this.method2422((byte) 72);
	    if (!class225.method1623((((Class318_Sub1_Sub3_Sub3) this)
				      .anInt10268),
				     -40)) {
		((Class318_Sub1_Sub3_Sub3) this).aBoolean10213 = false;
		((Class318_Sub1_Sub3_Sub3) this).anInt10268 = -1;
	    }
	}
    }
    
    private final void method2453(int i, AbstractToolkit var_ha, int i_32_, AnimatableToolkit class64,
				  int i_33_, int i_34_, Class101 class101,
				  int i_35_) {
	do {
	    try {
		anInt10548++;
		if (i_33_ == 0) {
		    int i_36_ = i * i + i_34_ * i_34_;
		    if ((i_36_ ^ 0xffffffff) <= -262145 && i_32_ >= i_36_) {
			int i_37_ = 0x3fff & (int) (Math.atan2((double) i,
							       (double) i_34_)
						    * 2607.5945876176133);
			AnimatableToolkit class64_38_
			    = (Canvas_Sub1.method122
			       (((Class318_Sub1_Sub3_Sub3) this).anInt10252,
				((Class318_Sub1_Sub3_Sub3) this).anInt10302,
				((Class318_Sub1_Sub3_Sub3) this).anInt10208,
				i_37_, i_35_, (byte) -35, var_ha));
			if (class64_38_ == null)
			    break;
			var_ha.C(false);
			class64_38_.method615(class101, null, 0);
			var_ha.C(true);
		    }
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("ke.OB(" + i + ','
						 + (var_ha != null ? "{...}"
						    : "null")
						 + ',' + i_32_ + ','
						 + (class64 != null ? "{...}"
						    : "null")
						 + ',' + i_33_ + ',' + i_34_
						 + ','
						 + (class101 != null ? "{...}"
						    : "null")
						 + ',' + i_35_ + ')'));
	    }
	    break;
	} while (false);
    }
    
    private final void method2454(int i, int i_39_, int i_40_, int i_41_,
				  AnimatableToolkit class64, int i_42_,
				  Class101 class101, AbstractToolkit var_ha, int i_43_) {
	do {
	    try {
		if (i != 6253)
		    ((Player) this).aString10544 = null;
		anInt10563++;
		int i_44_ = i_43_ * i_43_ + i_39_ * i_39_;
		if (i_44_ >= 262144
		    && (i_42_ ^ 0xffffffff) <= (i_44_ ^ 0xffffffff)) {
		    int i_45_
			= ((int) (2607.5945876176133
				  * Math.atan2((double) i_39_, (double) i_43_))
			   & 0x3fff);
		    AnimatableToolkit class64_46_
			= (Canvas_Sub1.method122
			   (((Class318_Sub1_Sub3_Sub3) this).anInt10252,
			    ((Class318_Sub1_Sub3_Sub3) this).anInt10302,
			    ((Class318_Sub1_Sub3_Sub3) this).anInt10208, i_45_,
			    i_41_, (byte) -35, var_ha));
		    if (class64_46_ == null)
			break;
		    var_ha.C(false);
		    class64_46_.method608(class101, null, i_40_, 0);
		    var_ha.C(true);
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("ke.V(" + i + ',' + i_39_
						 + ',' + i_40_ + ',' + i_41_
						 + ','
						 + (class64 != null ? "{...}"
						    : "null")
						 + ',' + i_42_ + ','
						 + (class101 != null ? "{...}"
						    : "null")
						 + ','
						 + (var_ha != null ? "{...}"
						    : "null")
						 + ',' + i_43_ + ')'));
	    }
	    break;
	} while (false);
    }
    
    final Class30 method2381(AbstractToolkit var_ha, int i) {
	if (i != 7)
	    ((Player) this).aString10544 = null;
	anInt10518++;
	return null;
    }
    
    final void method2392(boolean bool) {
	if (bool != true)
	    ((Player) this).aString10544 = null;
	anInt10534++;
	throw new IllegalStateException();
    }
    
    final void method2380(AbstractToolkit var_ha, int i, boolean bool,
			  Class318_Sub1 class318_sub1, int i_47_, byte i_48_,
			  int i_49_) {
	try {
	    if (i_48_ >= -106)
		anInt10520 = 116;
	    anInt10545++;
	    throw new IllegalStateException();
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ke.N("
					     + (var_ha != null ? "{...}"
						: "null")
					     + ',' + i + ',' + bool + ','
					     + (class318_sub1 != null ? "{...}"
						: "null")
					     + ',' + i_47_ + ',' + i_48_ + ','
					     + i_49_ + ')'));
	}
    }
    
    final void method2455(int i, int i_50_, byte i_51_, int i_52_) {
	anInt10529++;
	if (i_50_ != -26443)
	    method2451((byte) -35, 9, 26, 87);
	if ((((Class318_Sub1_Sub3_Sub3) this).anInt10286 ^ 0xffffffff) != 0
	    && ((AnimationDefinition)
		Class10.animationLoader.method835(((Class318_Sub1_Sub3_Sub3)
						this).anInt10286,
					       7)).anInt245 == 1) {
	    ((Class318_Sub1_Sub3_Sub3) this).anInt10286 = -1;
	    ((Class318_Sub1_Sub3_Sub3) this).anIntArray10236 = null;
	}
	if ((((Class318_Sub1_Sub3_Sub3) this).anInt10269 ^ 0xffffffff) != 0) {
	    GfxDefinition class368
		= (Class348_Sub40_Sub18.gfxLoader.loadDefinition
		   ((byte) 59, ((Class318_Sub1_Sub3_Sub3) this).anInt10269));
	    if (((GfxDefinition) class368).aBoolean4487
		&& ((GfxDefinition) class368).anInt4503 != -1
		&& (((AnimationDefinition)
		     Class10.animationLoader.method835((((GfxDefinition) class368)
						     .anInt4503),
						    i_50_ ^ ~0x674d)).anInt245
		    ^ 0xffffffff) == -2)
		((Class318_Sub1_Sub3_Sub3) this).anInt10269 = -1;
	}
	if (((Class318_Sub1_Sub3_Sub3) this).anInt10291 != -1) {
	    GfxDefinition class368
		= (Class348_Sub40_Sub18.gfxLoader.loadDefinition
		   ((byte) 124, ((Class318_Sub1_Sub3_Sub3) this).anInt10291));
	    if (((GfxDefinition) class368).aBoolean4487
		&& ((GfxDefinition) class368).anInt4503 != -1
		&& ((((AnimationDefinition)
		      Class10.animationLoader
			  .method835(((GfxDefinition) class368).anInt4503, 7))
		     .anInt245)
		    ^ 0xffffffff) == -2)
		((Class318_Sub1_Sub3_Sub3) this).anInt10291 = -1;
	}
	((Player) this).anInt10524 = -1;
	if (i_52_ >= 0
	    && (i_52_ ^ 0xffffffff) > (Class367_Sub4.anInt7319 ^ 0xffffffff)
	    && i >= 0
	    && (i ^ 0xffffffff) > (Class348_Sub40_Sub3.anInt9109
				   ^ 0xffffffff)) {
	    if ((((Class318_Sub1_Sub3_Sub3) this).anIntArray10320[0]
		 ^ 0xffffffff) <= -1
		&& ((Class367_Sub4.anInt7319 ^ 0xffffffff)
		    < (((Class318_Sub1_Sub3_Sub3) this).anIntArray10320[0]
		       ^ 0xffffffff))
		&& (((Class318_Sub1_Sub3_Sub3) this).anIntArray10317[0]
		    ^ 0xffffffff) <= -1
		&& (Class348_Sub40_Sub3.anInt9109
		    > ((Class318_Sub1_Sub3_Sub3) this).anIntArray10317[0])) {
		if (i_51_ == 2)
		    Class218.method1592((byte) 2, i, 4, i_52_, this);
		method2451(i_51_, i_52_, -29034, i);
	    } else
		method2449(i, i_52_, (byte) 111);
	} else
	    method2449(i, i_52_, (byte) 112);
    }
    
    final Class318_Sub4 method2386(int i, AbstractToolkit var_ha) {
	anInt10527++;
	if (((Player) this).aClass154_10536 == null
	    || !method2459(2048, var_ha, -95))
	    return null;
	Class101 class101 = var_ha.method3705();
	int i_53_ = ((Class318_Sub1_Sub3_Sub3) this).aClass264_10217
			.method2019((byte) -126);
	class101.method895(i_53_);
	Class357 class357
	    = (Message.aClass357ArrayArrayArray2029
	       [((Class318_Sub1) this).aByte6381]
	       [((Class318_Sub1) this).anInt6377 >> Class362.anInt4459]
	       [((Class318_Sub1) this).anInt6388 >> Class362.anInt4459]);
	if (class357 == null
	    || ((Class357) class357).aClass318_Sub1_Sub1_4402 == null)
	    ((Class318_Sub1_Sub3_Sub3) this).anInt10274
		-= (float) ((Class318_Sub1_Sub3_Sub3) this).anInt10274 / 10.0F;
	else {
	    int i_54_ = (((Class318_Sub1_Sub3_Sub3) this).anInt10274
			 + -(((Class318_Sub1_Sub1)
			      ((Class357) class357).aClass318_Sub1_Sub1_4402)
			     .aShort8727));
	    ((Class318_Sub1_Sub3_Sub3) this).anInt10274
		-= (float) i_54_ / 10.0F;
	}
	class101.method891(((Class318_Sub1) this).anInt6377,
			   (-20
			    + (((Class318_Sub1) this).anInt6382
			       - ((Class318_Sub1_Sub3_Sub3) this).anInt10274)),
			   ((Class318_Sub1) this).anInt6388);
	Class318_Sub4 class318_sub4 = null;
	((Class318_Sub1_Sub3_Sub3) this).aBoolean10324 = false;
	if ((((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		 .aClass239_Sub21_7270.method1812(-32350)
	     ^ 0xffffffff)
	    == -2) {
	    Class225 class225 = this.method2422((byte) 72);
	    if (((Class225) class225).aBoolean2913
		&& (((Class154) (((Player) this)
				 .aClass154_10536)).anInt2093 == -1
		    || ((NpcDefinition)
			(Class189.npcLoader.getNpcDefinition
			 (((Class154) (((Player) this)
				       .aClass154_10536)).anInt2093,
			  i + -2))).aBoolean1369)) {
		AnimationDefinition class17
		    = (((((Class318_Sub1_Sub3_Sub3) this).anInt10286
			 ^ 0xffffffff) != 0
			&& ((Class318_Sub1_Sub3_Sub3) this).anInt10218 == 0)
		       ? (Class10.animationLoader.method835
			  (((Class318_Sub1_Sub3_Sub3) this).anInt10286, 7))
		       : null);
		AnimationDefinition class17_55_
		    = (((((Class318_Sub1_Sub3_Sub3) this).anInt10268
			 ^ 0xffffffff) == 0
			|| ((Player) this).aBoolean10521
			|| (((Class318_Sub1_Sub3_Sub3) this).aBoolean10213
			    && class17 != null))
		       ? null
		       : (Class10.animationLoader.method835
			  (((Class318_Sub1_Sub3_Sub3) this).anInt10268, 7)));
		AnimatableToolkit class64
		    = (Node.method2711
		       (((Class318_Sub1_Sub3_Sub3) this).anInt10302, i_53_,
			((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[0],
			((Class318_Sub1_Sub3_Sub3) this).anInt10208, false,
			(class17_55_ == null
			 ? ((Class318_Sub1_Sub3_Sub3) this).anInt10267
			 : ((Class318_Sub1_Sub3_Sub3) this).anInt10245),
			0, 1, ((Class318_Sub1_Sub3_Sub3) this).anInt10252,
			var_ha, 160, 0, 240,
			class17_55_ == null ? class17 : class17_55_));
		if (class64 != null) {
		    class318_sub4 = (DummyOutputstream.method136
				     (1 + (((Class318_Sub1_Sub3_Sub3) this)
					   .aClass64Array10323).length,
				      true, false));
		    ((Class318_Sub1_Sub3_Sub3) this).aBoolean10324 = true;
		    var_ha.C(false);
		    if (Class305.aBoolean3870)
			class64.method608(class101,
					  (((Class318_Sub4) class318_sub4)
					   .aClass318_Sub3Array6414
					   [(((Class318_Sub1_Sub3_Sub3) this)
					     .aClass64Array10323).length]),
					  Class132.anInt1906, 0);
		    else
			class64.method615(class101,
					  (((Class318_Sub4) class318_sub4)
					   .aClass318_Sub3Array6414
					   [(((Class318_Sub1_Sub3_Sub3) this)
					     .aClass64Array10323).length]),
					  0);
		    var_ha.C(true);
		}
	    }
	}
	if (this == Class132.localPlayer) {
	    class101.method894(((Class318_Sub1) this).anInt6377,
			       ((Class318_Sub1) this).anInt6382,
			       ((Class318_Sub1) this).anInt6388);
	    for (int i_56_ = -1 + Class348_Sub27.aClass302Array6897.length;
		 i_56_ >= 0; i_56_--) {
		Class302 class302 = Class348_Sub27.aClass302Array6897[i_56_];
		if (class302 != null
		    && ((Class302) class302).anInt3834 != -1) {
		    if ((((Class302) class302).anInt3840 ^ 0xffffffff) == -2) {
			Class348_Sub22 class348_sub22
			    = ((Class348_Sub22)
			       (Class282.aClass356_3654.get
				((long) ((Class302) class302).anInt3833)));
			if (class348_sub22 != null) {
			    Npc class318_sub1_sub3_sub3_sub1
				= (((Class348_Sub22) class348_sub22)
				   .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
			    int i_57_
				= (-(((Class318_Sub1)
				      (Class132
				       .localPlayer))
				     .anInt6377)
				   + ((Class318_Sub1)
				      class318_sub1_sub3_sub3_sub1).anInt6377);
			    int i_58_
				= (-(((Class318_Sub1)
				      (Class132
				       .localPlayer))
				     .anInt6388)
				   + ((Class318_Sub1)
				      class318_sub1_sub3_sub3_sub1).anInt6388);
			    if (Class305.aBoolean3870)
				method2454(6253, i_57_, Class132.anInt1906,
					   ((Class302) class302).anInt3834,
					   (((Class318_Sub1_Sub3_Sub3) this)
					    .aClass64Array10323[0]),
					   92160000, class101, var_ha, i_58_);
			    else
				method2453(i_57_, var_ha, 92160000,
					   (((Class318_Sub1_Sub3_Sub3) this)
					    .aClass64Array10323[0]),
					   0, i_58_, class101,
					   ((Class302) class302).anInt3834);
			}
		    }
		    if (((Class302) class302).anInt3840 == 2) {
			int i_59_
			    = (-(((Class318_Sub1)
				  Class132.localPlayer)
				 .anInt6377)
			       + 256 + ((Class302) class302).anInt3835);
			int i_60_
			    = (-(((Class318_Sub1)
				  Class132.localPlayer)
				 .anInt6388)
			       + 256 + ((Class302) class302).anInt3832);
			int i_61_
			    = ((Class302) class302).anInt3837 << 1821623465;
			i_61_ *= i_61_;
			if (Class305.aBoolean3870)
			    method2454(6253, i_59_, Class132.anInt1906,
				       ((Class302) class302).anInt3834,
				       (((Class318_Sub1_Sub3_Sub3) this)
					.aClass64Array10323[0]),
				       i_61_, class101, var_ha, i_60_);
			else
			    method2453(i_59_, var_ha, i_61_,
				       (((Class318_Sub1_Sub3_Sub3) this)
					.aClass64Array10323[0]),
				       0, i_60_, class101,
				       ((Class302) class302).anInt3834);
		    }
		    if (((Class302) class302).anInt3840 == 10
			&& (((Class302) class302).anInt3833 ^ 0xffffffff) <= -1
			&& (((ClassicLoadingScreen
			      .players).length
			     ^ 0xffffffff)
			    < (((Class302) class302).anInt3833
			       ^ 0xffffffff))) {
			Player class318_sub1_sub3_sub3_sub2_62_
			    = (ClassicLoadingScreen.players
			       [((Class302) class302).anInt3833]);
			if (class318_sub1_sub3_sub3_sub2_62_ != null) {
			    int i_63_
				= (-(((Class318_Sub1)
				      (Class132
				       .localPlayer))
				     .anInt6377)
				   + (((Class318_Sub1)
				       class318_sub1_sub3_sub3_sub2_62_)
				      .anInt6377));
			    int i_64_
				= (-(((Class318_Sub1)
				      (Class132
				       .localPlayer))
				     .anInt6388)
				   + (((Class318_Sub1)
				       class318_sub1_sub3_sub3_sub2_62_)
				      .anInt6388));
			    if (Class305.aBoolean3870)
				method2454(6253, i_63_, Class132.anInt1906,
					   ((Class302) class302).anInt3834,
					   (((Class318_Sub1_Sub3_Sub3) this)
					    .aClass64Array10323[0]),
					   92160000, class101, var_ha, i_64_);
			    else
				method2453(i_63_, var_ha, 92160000,
					   (((Class318_Sub1_Sub3_Sub3) this)
					    .aClass64Array10323[0]),
					   i ^ 0x1, i_64_, class101,
					   ((Class302) class302).anInt3834);
			}
		    }
		}
	    }
	    class101.method895(i_53_);
	    class101.method891(((Class318_Sub1) this).anInt6377,
			       ((Class318_Sub1) this).anInt6382,
			       ((Class318_Sub1) this).anInt6388);
	}
	class101.method895(i_53_);
	class101.method891(((Class318_Sub1) this).anInt6377,
			   (((Class318_Sub1) this).anInt6382
			    + (-5 + -(((Class318_Sub1_Sub3_Sub3) this)
				      .anInt10274))),
			   ((Class318_Sub1) this).anInt6388);
	if (class318_sub4 == null)
	    class318_sub4
		= DummyOutputstream.method136((((Class318_Sub1_Sub3_Sub3) this)
					       .aClass64Array10323).length,
					      true, false);
	this.method2432(var_ha, -15074, class101, false,
			((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323);
	if (Class305.aBoolean3870) {
	    for (int i_65_ = 0;
		 i_65_ < (((Class318_Sub1_Sub3_Sub3) this)
			  .aClass64Array10323).length;
		 i_65_++) {
		if (((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[i_65_]
		    != null)
		    ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323
			[i_65_].method608
			(class101,
			 (((Class318_Sub4) class318_sub4)
			  .aClass318_Sub3Array6414[i_65_]),
			 Class132.anInt1906,
			 (this != Class132.localPlayer
			  ? 0 : 1));
	    }
	} else {
	    for (int i_66_ = 0;
		 i_66_ < (((Class318_Sub1_Sub3_Sub3) this)
			  .aClass64Array10323).length;
		 i_66_++) {
		if (((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[i_66_]
		    != null)
		    ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323
			[i_66_].method615
			(class101,
			 (((Class318_Sub4) class318_sub4)
			  .aClass318_Sub3Array6414[i_66_]),
			 (this == Class132.localPlayer
			  ? 1 : 0));
	    }
	}
	if (((Class318_Sub1_Sub3_Sub3) this).aClass318_Sub10_10327 != null) {
	    Class98 class98 = ((Class318_Sub1_Sub3_Sub3) this)
				  .aClass318_Sub10_10327.method2525();
	    if (Class305.aBoolean3870)
		var_ha.method3685(class98, Class132.anInt1906);
	    else
		var_ha.method3684(class98);
	}
	for (int i_67_ = 0;
	     (i_67_
	      < ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323.length);
	     i_67_++) {
	    if (((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[i_67_]
		!= null)
		((Class318_Sub1_Sub3_Sub3) this).aBoolean10324
		    |= ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323
			   [i_67_].F();
	}
	((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[0]
	    = ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[i]
	    = ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[2] = null;
	((Class318_Sub1_Sub3_Sub3) this).anInt10301 = Class239_Sub15.anInt6006;
	return class318_sub4;
    }
    
    final String method2456(boolean bool, int i) {
	anInt10550++;
	String string = "";
	if (Class367_Sub9.aStringArray7378 != null)
	    string += Class367_Sub9.aStringArray7378[aByte10552];
	int[] is;
	if ((aByte10538 ^ 0xffffffff) != -2
	    || Class239_Sub17.anIntArray6021 == null)
	    is = RuntimeException_Sub1.anIntArray4603;
	else
	    is = Class239_Sub17.anIntArray6021;
	if (i != 255)
	    anInt10567 = 81;
	if (is != null && (is[aByte10552] ^ 0xffffffff) != 0) {
	    Class117 class117
		= Class348_Sub7.aClass33_6653.method337(true, is[aByte10552]);
	    if ((((Class117) class117).aChar1779 ^ 0xffffffff) != -116) {
		Class156.method1242("gdn1", new Throwable(), 15004);
		is[aByte10552] = -1;
	    } else
		string += class117.method1074(0xff & aByte10556, i + -145);
	}
	if (!bool)
	    string += ((Player) this).aString10544;
	else
	    string += ((Player) this).username;
	if (Class54.aStringArray974 != null)
	    string += Class54.aStringArray974[aByte10552];
	return string;
    }
    
    final int method2425(int i) {
	anInt10532++;
	if (i != -1)
	    return 82;
	return -1;
    }
    
    final boolean method2457(byte i) {
	anInt10530++;
	int i_68_ = 86 / ((-44 - i) / 38);
	if (((Player) this).aClass154_10536 == null)
	    return false;
	return true;
    }
    
    final boolean method2388(int i) {
	anInt10523++;
	if (i >= -65)
	    method2449(-64, -39, (byte) 37);
	return false;
    }
    
    final int method2436(byte i) {
	if (i <= 39)
	    method2455(-97, -62, (byte) 0, 103);
	anInt10546++;
	if (((Player) this).aClass154_10536 != null
	    && (((Class154) (((Player) this)
			     .aClass154_10536)).anInt2093
		^ 0xffffffff) != 0)
	    return (((NpcDefinition) (Class189.npcLoader.getNpcDefinition
				(((Class154) ((Player)
					      this).aClass154_10536).anInt2093,
				 -1)))
		    .anInt1399);
	return super.method2436((byte) 72);
    }
    
    public static void method2458(boolean bool) {
	anIntArray10566 = null;
	if (bool != true)
	    method2458(false);
	aHashtable10565 = null;
    }
    
    private final boolean method2459(int i, AbstractToolkit var_ha, int i_69_) {
	anInt10525++;
	int i_70_ = i;
	Class225 class225 = this.method2422((byte) 72);
	AnimationDefinition class17
	    = ((((Class318_Sub1_Sub3_Sub3) this).anInt10286 == -1
		|| ((Class318_Sub1_Sub3_Sub3) this).anInt10218 != 0)
	       ? null
	       : Class10.animationLoader.method835(((Class318_Sub1_Sub3_Sub3)
						 this).anInt10286,
						7));
	AnimationDefinition class17_71_
	    = (((((Class318_Sub1_Sub3_Sub3) this).anInt10268 ^ 0xffffffff) != 0
		&& !((Player) this).aBoolean10521
		&& (!((Class318_Sub1_Sub3_Sub3) this).aBoolean10213
		    || class17 == null))
	       ? Class10.animationLoader
		     .method835(((Class318_Sub1_Sub3_Sub3) this).anInt10268, 7)
	       : null);
	int i_72_ = ((Class225) class225).anInt2932;
	int i_73_ = ((Class225) class225).anInt2941;
	if (i_72_ != 0 || i_73_ != 0 || ((Class225) class225).anInt2950 != 0
	    || (((Class225) class225).anInt2926 ^ 0xffffffff) != -1)
	    i |= 0x7;
	int i_74_ = ((Class318_Sub1_Sub3_Sub3) this).aClass264_10217
			.method2019((byte) -106);
	boolean bool
	    = (((Class318_Sub1_Sub3_Sub3) this).aByte10279 != 0
	       && (((Class318_Sub1_Sub3_Sub3) this).anInt10248
		   <= Class367_Sub11.logicCycle)
	       && ((((Class318_Sub1_Sub3_Sub3) this).anInt10250 ^ 0xffffffff)
		   < (Class367_Sub11.logicCycle ^ 0xffffffff)));
	if (bool)
	    i |= 0x80000;
	AnimatableToolkit class64
	    = (((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[0]
	       = (((Player) this).aClass154_10536
		      .method1226
		  (Class318_Sub1_Sub3_Sub3.varbitHandler, class17_71_,
		   ((Class318_Sub1_Sub3_Sub3) this).aClass182Array10308, true,
		   ToolkitException.itemLoader, i_74_, class17,
		   ((Class318_Sub1_Sub3_Sub3) this).anInt10244, true,
		   ((Class318_Sub1_Sub3_Sub3) this).anInt10312,
		   ((Class318_Sub1_Sub3_Sub3) this).anIntArray10296, i,
		   Class348_Sub40_Sub25.aClass150_9342,
		   ((Class318_Sub1_Sub3_Sub3) this).anInt10232, var_ha,
		   Class189.npcLoader, Class10.animationLoader,
		   ((Class318_Sub1_Sub3_Sub3) this).anInt10245,
		   ((Class318_Sub1_Sub3_Sub3) this).anInt10267,
		   ((Class318_Sub1_Sub3_Sub3) this).anInt10203,
		   Class64_Sub3.aClass261_5558)));
	int i_75_ = FileIndexTracker.method2201(2121);
	if ((Class226.anInt2964 ^ 0xffffffff) > -97
	    && (i_75_ ^ 0xffffffff) < -51)
	    Class299_Sub2_Sub1.method2271(31268);
	int i_76_ = 3 % ((63 - i_69_) / 47);
	if (Class55_Sub1.aClass364_5271 != Class8.modeWhere
	    && i_75_ < 50) {
	    int i_77_;
	    for (i_77_ = -i_75_ + 50;
		 (i_77_ ^ 0xffffffff) < (Class127_Sub1.anInt8388 ^ 0xffffffff);
		 Class127_Sub1.anInt8388++)
		Class308.aByteArrayArray3882[Class127_Sub1.anInt8388]
		    = new byte[102400];
	    while (Class127_Sub1.anInt8388 > i_77_) {
		Class127_Sub1.anInt8388--;
		Class308.aByteArrayArray3882[Class127_Sub1.anInt8388] = null;
	    }
	} else if (Class8.modeWhere != Class55_Sub1.aClass364_5271) {
	    Class127_Sub1.anInt8388 = 0;
	    Class308.aByteArrayArray3882 = new byte[50][];
	}
	if (class64 == null)
	    return false;
	((Class318_Sub1_Sub3_Sub3) this).anInt10207 = class64.fa();
	((Class318_Sub1_Sub3_Sub3) this).anInt10230 = class64.ma();
	this.method2439(-115, class64);
	if ((i_72_ ^ 0xffffffff) != -1 || (i_73_ ^ 0xffffffff) != -1) {
	    this.method2424(i_74_, i_72_, ((Class225) class225).anInt2943,
			    i_73_, (byte) 108,
			    ((Class225) class225).anInt2912);
	    if (((Class318_Sub1_Sub3_Sub3) this).anInt10302 != 0)
		class64.FA(((Class318_Sub1_Sub3_Sub3) this).anInt10302);
	    if (((Class318_Sub1_Sub3_Sub3) this).anInt10208 != 0)
		class64.VA(((Class318_Sub1_Sub3_Sub3) this).anInt10208);
	    if ((((Class318_Sub1_Sub3_Sub3) this).anInt10252 ^ 0xffffffff)
		!= -1)
		class64.H(0, ((Class318_Sub1_Sub3_Sub3) this).anInt10252, 0);
	} else
	    this.method2424(i_74_, method2436((byte) 124) << 471770697, 0,
			    method2436((byte) 58) << -790952727, (byte) 65, 0);
	if (bool)
	    class64.method624(((Class318_Sub1_Sub3_Sub3) this).aByte10255,
			      ((Class318_Sub1_Sub3_Sub3) this).aByte10206,
			      ((Class318_Sub1_Sub3_Sub3) this).aByte10270,
			      (((Class318_Sub1_Sub3_Sub3) this).aByte10279
			       & 0xff));
	if (!((Player) this).aBoolean10521
	    && ((Class318_Sub1_Sub3_Sub3) this).anInt10269 != -1
	    && ((Class318_Sub1_Sub3_Sub3) this).anInt10240 != -1) {
	    GfxDefinition class368
		= (Class348_Sub40_Sub18.gfxLoader.loadDefinition
		   ((byte) 76, ((Class318_Sub1_Sub3_Sub3) this).anInt10269));
	    boolean bool_78_ = (((GfxDefinition) class368).aByte4488 == 3
				&& ((i_72_ ^ 0xffffffff) != -1 || i_73_ != 0));
	    int i_79_ = i_70_;
	    if (!bool_78_) {
		if (((Class318_Sub1_Sub3_Sub3) this).anInt10237 != 0)
		    i_79_ |= 0x5;
		if (((Class318_Sub1_Sub3_Sub3) this).anInt10220 != 0)
		    i_79_ |= 0x2;
		if ((((Class318_Sub1_Sub3_Sub3) this).anInt10278 ^ 0xffffffff)
		    <= -1)
		    i_79_ |= 0x7;
	    } else
		i_79_ |= 0x7;
	    AnimatableToolkit class64_80_
		= (((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[1]
		   = (class368.method3562
		      (((Class318_Sub1_Sub3_Sub3) this).anInt10240, var_ha,
		       ((Class318_Sub1_Sub3_Sub3) this).anInt10243, i_79_,
		       ((Class318_Sub1_Sub3_Sub3) this).anInt10283,
		       Class10.animationLoader, (byte) 46)));
	    if (class64_80_ != null) {
		if (((Class318_Sub1_Sub3_Sub3) this).anInt10278 >= 0
		    && ((Class225) class225).anIntArrayArray2939 != null
		    && ((((Class225) class225).anIntArrayArray2939
			 [((Class318_Sub1_Sub3_Sub3) this).anInt10278])
			!= null)) {
		    int i_81_ = 0;
		    int i_82_ = 0;
		    int i_83_ = 0;
		    if (((Class225) class225).anIntArrayArray2939 != null
			&& ((((Class225) class225).anIntArrayArray2939
			     [((Class318_Sub1_Sub3_Sub3) this).anInt10278])
			    != null)) {
			i_82_ += (((Class225) class225).anIntArrayArray2939
				  [((Class318_Sub1_Sub3_Sub3) this).anInt10278]
				  [1]);
			i_83_ += (((Class225) class225).anIntArrayArray2939
				  [((Class318_Sub1_Sub3_Sub3) this).anInt10278]
				  [2]);
			i_81_ += (((Class225) class225).anIntArrayArray2939
				  [((Class318_Sub1_Sub3_Sub3) this).anInt10278]
				  [0]);
		    }
		    if (((Class225) class225).anIntArrayArray2910 != null
			&& ((((Class225) class225).anIntArrayArray2910
			     [((Class318_Sub1_Sub3_Sub3) this).anInt10278])
			    != null)) {
			i_82_ += (((Class225) class225).anIntArrayArray2910
				  [((Class318_Sub1_Sub3_Sub3) this).anInt10278]
				  [1]);
			i_83_ += (((Class225) class225).anIntArrayArray2910
				  [((Class318_Sub1_Sub3_Sub3) this).anInt10278]
				  [2]);
			i_81_ += (((Class225) class225).anIntArrayArray2910
				  [((Class318_Sub1_Sub3_Sub3) this).anInt10278]
				  [0]);
		    }
		    if (i_83_ != 0 || i_81_ != 0) {
			int i_84_ = i_74_;
			if ((((Class318_Sub1_Sub3_Sub3) this).anIntArray10296
			     != null)
			    && ((((Class318_Sub1_Sub3_Sub3) this)
				 .anIntArray10296
				 [((Class318_Sub1_Sub3_Sub3) this).anInt10278])
				!= -1))
			    i_84_ = (((Class318_Sub1_Sub3_Sub3) this)
				     .anIntArray10296
				     [(((Class318_Sub1_Sub3_Sub3) this)
				       .anInt10278)]);
			int i_85_ = (i_84_ + (((Class318_Sub1_Sub3_Sub3) this)
					      .anInt10237) * 2048 + -i_74_
				     & 0x3fff);
			if ((i_85_ ^ 0xffffffff) != -1)
			    class64_80_.a(i_85_);
			int i_86_ = Class70.sineTable[i_85_];
			int i_87_ = Class70.cosineTable[i_85_];
			int i_88_
			    = i_87_ * i_81_ + i_83_ * i_86_ >> -181246066;
			i_83_ = -(i_81_ * i_86_) + i_83_ * i_87_ >> 455229710;
			i_81_ = i_88_;
		    }
		    class64_80_.H(i_81_, i_82_, i_83_);
		} else if ((((Class318_Sub1_Sub3_Sub3) this).anInt10237
			    ^ 0xffffffff)
			   != -1)
		    class64_80_
			.a(2048 * ((Class318_Sub1_Sub3_Sub3) this).anInt10237);
		if (((Class318_Sub1_Sub3_Sub3) this).anInt10220 != 0)
		    class64_80_.H(0,
				  (-((Class318_Sub1_Sub3_Sub3) this).anInt10220
				   << -1384741150),
				  0);
		if (bool_78_) {
		    if (((Class318_Sub1_Sub3_Sub3) this).anInt10302 != 0)
			class64_80_
			    .FA(((Class318_Sub1_Sub3_Sub3) this).anInt10302);
		    if (((Class318_Sub1_Sub3_Sub3) this).anInt10208 != 0)
			class64_80_
			    .VA(((Class318_Sub1_Sub3_Sub3) this).anInt10208);
		    if (((Class318_Sub1_Sub3_Sub3) this).anInt10252 != 0)
			class64_80_.H(0, (((Class318_Sub1_Sub3_Sub3) this)
					  .anInt10252), 0);
		}
	    }
	} else
	    ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[1] = null;
	if (((Player) this).aBoolean10521
	    || ((Class318_Sub1_Sub3_Sub3) this).anInt10291 == -1
	    || ((Class318_Sub1_Sub3_Sub3) this).anInt10224 == -1)
	    ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[2] = null;
	else {
	    GfxDefinition class368
		= (Class348_Sub40_Sub18.gfxLoader.loadDefinition
		   ((byte) 76, ((Class318_Sub1_Sub3_Sub3) this).anInt10291));
	    boolean bool_89_ = (((GfxDefinition) class368).aByte4488 == 3
				&& ((i_72_ ^ 0xffffffff) != -1
				    || (i_73_ ^ 0xffffffff) != -1));
	    int i_90_ = i_70_;
	    if (bool_89_)
		i_90_ |= 0x7;
	    else {
		if ((((Class318_Sub1_Sub3_Sub3) this).anInt10202 ^ 0xffffffff)
		    != -1)
		    i_90_ |= 0x5;
		if (((Class318_Sub1_Sub3_Sub3) this).anInt10260 != 0)
		    i_90_ |= 0x2;
		if (((Class318_Sub1_Sub3_Sub3) this).anInt10289 >= 0)
		    i_90_ |= 0x7;
	    }
	    AnimatableToolkit class64_91_
		= (((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[2]
		   = (class368.method3558
		      (((Class318_Sub1_Sub3_Sub3) this).anInt10273,
		       ((Class318_Sub1_Sub3_Sub3) this).anInt10276, var_ha,
		       i_90_, 3172, Class10.animationLoader,
		       ((Class318_Sub1_Sub3_Sub3) this).anInt10224)));
	    if (class64_91_ != null) {
		if (((Class318_Sub1_Sub3_Sub3) this).anInt10289 < 0
		    || ((Class225) class225).anIntArrayArray2939 == null
		    || ((((Class225) class225).anIntArrayArray2939
			 [((Class318_Sub1_Sub3_Sub3) this).anInt10289])
			== null)) {
		    if (((Class318_Sub1_Sub3_Sub3) this).anInt10202 != 0)
			class64_91_.a(2048 * (((Class318_Sub1_Sub3_Sub3) this)
					      .anInt10202));
		} else {
		    int i_92_ = 0;
		    int i_93_ = 0;
		    int i_94_ = 0;
		    if (((Class225) class225).anIntArrayArray2939 != null
			&& ((((Class225) class225).anIntArrayArray2939
			     [((Class318_Sub1_Sub3_Sub3) this).anInt10289])
			    != null)) {
			i_92_ += (((Class225) class225).anIntArrayArray2939
				  [((Class318_Sub1_Sub3_Sub3) this).anInt10289]
				  [0]);
			i_93_ += (((Class225) class225).anIntArrayArray2939
				  [((Class318_Sub1_Sub3_Sub3) this).anInt10289]
				  [1]);
			i_94_ += (((Class225) class225).anIntArrayArray2939
				  [((Class318_Sub1_Sub3_Sub3) this).anInt10289]
				  [2]);
		    }
		    if (((Class225) class225).anIntArrayArray2910 != null
			&& ((((Class225) class225).anIntArrayArray2910
			     [((Class318_Sub1_Sub3_Sub3) this).anInt10289])
			    != null)) {
			i_92_ += (((Class225) class225).anIntArrayArray2910
				  [((Class318_Sub1_Sub3_Sub3) this).anInt10289]
				  [0]);
			i_93_ += (((Class225) class225).anIntArrayArray2910
				  [((Class318_Sub1_Sub3_Sub3) this).anInt10289]
				  [1]);
			i_94_ += (((Class225) class225).anIntArrayArray2910
				  [((Class318_Sub1_Sub3_Sub3) this).anInt10289]
				  [2]);
		    }
		    if ((i_94_ ^ 0xffffffff) != -1 || i_92_ != 0) {
			int i_95_ = i_74_;
			if ((((Class318_Sub1_Sub3_Sub3) this).anIntArray10296
			     != null)
			    && ((((Class318_Sub1_Sub3_Sub3) this)
				 .anIntArray10296
				 [((Class318_Sub1_Sub3_Sub3) this).anInt10289])
				!= -1))
			    i_95_ = (((Class318_Sub1_Sub3_Sub3) this)
				     .anIntArray10296
				     [(((Class318_Sub1_Sub3_Sub3) this)
				       .anInt10289)]);
			int i_96_
			    = (0x3fff
			       & -i_74_ + ((((Class318_Sub1_Sub3_Sub3) this)
					    .anInt10202) * 2048
					   + i_95_));
			if (i_96_ != 0)
			    class64_91_.a(i_96_);
			int i_97_ = Class70.sineTable[i_96_];
			int i_98_ = Class70.cosineTable[i_96_];
			int i_99_ = i_94_ * i_97_ + i_98_ * i_92_ >> 845034542;
			i_94_ = -(i_97_ * i_92_) + i_98_ * i_94_ >> 1085825006;
			i_92_ = i_99_;
		    }
		    class64_91_.H(i_92_, i_93_, i_94_);
		}
		if ((((Class318_Sub1_Sub3_Sub3) this).anInt10260 ^ 0xffffffff)
		    != -1)
		    class64_91_.H(0,
				  (-((Class318_Sub1_Sub3_Sub3) this).anInt10260
				   << -1898332830),
				  0);
		if (bool_89_) {
		    if (((Class318_Sub1_Sub3_Sub3) this).anInt10302 != 0)
			class64_91_
			    .FA(((Class318_Sub1_Sub3_Sub3) this).anInt10302);
		    if ((((Class318_Sub1_Sub3_Sub3) this).anInt10208
			 ^ 0xffffffff)
			!= -1)
			class64_91_
			    .VA(((Class318_Sub1_Sub3_Sub3) this).anInt10208);
		    if ((((Class318_Sub1_Sub3_Sub3) this).anInt10252
			 ^ 0xffffffff)
			!= -1)
			class64_91_.H(0, (((Class318_Sub1_Sub3_Sub3) this)
					  .anInt10252), 0);
		}
	    }
	}
	return true;
    }
    
    final int method2421(byte i) {
	if (i < 113)
	    ((Player) this).anInt10535 = 60;
	anInt10543++;
	return anInt10520;
    }
    
    static final void method2460
	(float f, int i, float f_100_, int i_101_, int i_102_, float f_103_,
	 Class186 class186, int i_104_, byte i_105_, int i_106_, float f_107_,
	 byte[] is, int i_108_, float f_109_) {
	do {
	    try {
		anInt10559++;
		int i_110_ = i_102_ * i_106_;
		float[] fs = new float[i_110_];
		for (int i_111_ = 0; i_101_ > i_111_; i_111_++) {
		    int i_112_ = i;
		    class186.method1398(i_108_, i_102_,
					f_100_ / (float) i_106_,
					f_109_ / (float) i_108_, 0, f * 127.0F,
					1, f_107_ / (float) i_102_, i_106_,
					i_104_, fs);
		    f_107_ *= 2.0F;
		    f_100_ *= 2.0F;
		    for (int i_113_ = 0; i_110_ > i_113_; i_113_++) {
			is[i_112_] += fs[i_113_];
			i_112_++;
		    }
		    f_109_ *= 2.0F;
		    f *= f_103_;
		}
		int i_114_ = i;
		for (int i_115_ = 0;
		     (i_110_ ^ 0xffffffff) < (i_115_ ^ 0xffffffff); i_115_++) {
		    is[i_114_] = (byte) (127 + is[i_114_]);
		    i_114_++;
		}
		if (i_105_ == 30)
		    break;
		aHashtable10565 = null;
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929
			  (runtimeexception,
			   ("ke.LB(" + f + ',' + i + ',' + f_100_ + ','
			    + i_101_ + ',' + i_102_ + ',' + f_103_ + ','
			    + (class186 != null ? "{...}" : "null") + ','
			    + i_104_ + ',' + i_105_ + ',' + i_106_ + ','
			    + f_107_ + ',' + (is != null ? "{...}" : "null")
			    + ',' + i_108_ + ',' + f_109_ + ')'));
	    }
	    break;
	} while (false);
    }
    
    public Player() {
	((Player) this).anInt10516 = 0;
	((Player) this).anInt10535 = -1;
	((Player) this).aBoolean10521 = false;
	((Player) this).anInt10526 = -1;
	((Player) this).aBoolean10539 = false;
	((Player) this).anInt10519 = -1;
	((Player) this).anInt10522 = -1;
	((Player) this).aBoolean10554 = false;
	((Player) this).anInt10557 = 0;
	((Player) this).anInt10524 = -1;
	((Player) this).aBoolean10551 = false;
	((Player) this).anInt10560 = -1;
	((Player) this).anInt10542 = 0;
	((Player) this).anInt10553 = 0;
	aByte10556 = (byte) 0;
	((Player) this).anInt10558 = 255;
	((Player) this).anInt10540 = -1;
	aByte10552 = (byte) 0;
	aByte10538 = (byte) 0;
	((Player) this).anInt10561 = -1;
	((Player) this).anInt10564 = 0;
    }
}
