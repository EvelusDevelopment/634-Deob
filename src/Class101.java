/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class101
{
    static int[] anIntArray1593 = new int[1];
    static int anInt1594;
    static int anInt1595;
    static int anInt1596;
    static int anInt1597 = 0;
    static int anInt1598;
    static int anInt1599;
    
    abstract void method890(int[] is);
    
    abstract void method891(int i, int i_0_, int i_1_);
    
    public Class101() {
	/* empty */
    }
    
    abstract void method892(int i, int i_2_, int i_3_, int[] is);
    
    static final void method893(byte i) {
	Class348_Sub40_Sub22.method3111(91, ((Class348_Sub51)
					     BitmapTable.aClass348_Sub51_3959)
						.aClass239_Sub6_7226
						.method1743(-32350));
	anInt1595++;
	int i_4_ = ((Class286_Sub4.anInt6246 >> 239567308)
		    - -(za_Sub2.anInt9780 >> 515880227));
	int i_5_ = ((Class90.anInt1517 >> 591146499)
		    + (Class59_Sub2_Sub2.anInt8685 >> 1861651468));
	Class355.anInt4372
	    = ((Class318_Sub1) Class132.localPlayer)
		  .aByte6381
	    = (byte) 0;
	Class132.localPlayer.method2449(8, 8,
							       (byte) 118);
	if (i != -49)
	    anInt1597 = 115;
	int i_6_ = 18;
	Class322.anIntArray4031 = new int[i_6_];
	StringNode.aByteArrayArray7212 = new byte[i_6_][];
	Class239_Sub6.anIntArrayArray5894 = new int[i_6_][4];
	aa_Sub1.anIntArray5192 = new int[i_6_];
	Class14_Sub4.aByteArrayArray8642 = new byte[i_6_][];
	Class348_Sub23_Sub3.anIntArray9042 = new int[i_6_];
	r.anIntArray9724 = new int[i_6_];
	Class295.anIntArray3759 = new int[i_6_];
	Class347.aByteArrayArray4281 = new byte[i_6_][];
	GameApplet.anIntArray38 = new int[i_6_];
	Class348_Sub23_Sub1.aByteArrayArray8996 = new byte[i_6_][];
	Class129.aByteArrayArray1887 = new byte[i_6_][];
	i_6_ = 0;
	for (int i_7_ = (i_4_ + -(Class367_Sub4.anInt7319 >> 1284666244)) / 8;
	     (i_4_ - -(Class367_Sub4.anInt7319 >> 21179204)) / 8 >= i_7_;
	     i_7_++) {
	    for (int i_8_ = (-(Class348_Sub40_Sub3.anInt9109 >> 1754847652)
			     + i_5_) / 8;
		 ((i_5_ + (Class348_Sub40_Sub3.anInt9109 >> -1988934620)) / 8
		  >= i_8_);
		 i_8_++) {
		int i_9_ = i_8_ + (i_7_ << 1959591592);
		Class348_Sub23_Sub3.anIntArray9042[i_6_] = i_9_;
		aa_Sub1.anIntArray5192[i_6_]
		    = Class367_Sub10.indexLoader5
			  .getArchiveId("m" + i_7_ + "_" + i_8_);
		GameApplet.anIntArray38[i_6_]
		    = Class367_Sub10.indexLoader5
			  .getArchiveId("l" + i_7_ + "_" + i_8_);
		Class322.anIntArray4031[i_6_]
		    = Class367_Sub10.indexLoader5
			  .getArchiveId("n" + i_7_ + "_" + i_8_);
		Class295.anIntArray3759[i_6_]
		    = Class367_Sub10.indexLoader5
			  .getArchiveId("um" + i_7_ + "_" + i_8_);
		r.anIntArray9724[i_6_]
		    = (Class367_Sub10.indexLoader5.getArchiveId
		       ("ul" + i_7_ + "_" + i_8_));
		if (Class322.anIntArray4031[i_6_] == -1) {
		    aa_Sub1.anIntArray5192[i_6_] = -1;
		    GameApplet.anIntArray38[i_6_] = -1;
		    Class295.anIntArray3759[i_6_] = -1;
		    r.anIntArray9724[i_6_] = -1;
		}
		i_6_++;
	    }
	}
	for (int i_10_ = i_6_; Class322.anIntArray4031.length > i_10_;
	     i_10_++) {
	    Class322.anIntArray4031[i_10_] = -1;
	    aa_Sub1.anIntArray5192[i_10_] = -1;
	    GameApplet.anIntArray38[i_10_] = -1;
	    Class295.anIntArray3759[i_10_] = -1;
	    r.anIntArray9724[i_10_] = -1;
	}
	int i_11_;
	if (Class240.anInt4674 != 3)
	    i_11_ = 8;
	else
	    i_11_ = 4;
	Class348_Sub41.method3157(i_5_, (byte) 123, i_4_, i_11_, false);
    }
    
    abstract void method894(int i, int i_12_, int i_13_);
    
    abstract void method895(int i);
    
    abstract void method896(int i);
    
    abstract void method897(int i, int i_14_, int i_15_, int[] is);
    
    abstract void method898(Class101 class101_16_);
    
    abstract void method899(int i);
    
    abstract void method900(int i);
    
    static final void method901(RasterToolkit[] class105s, int i) {
	try {
	    anInt1599++;
	    Class239_Sub1.anInt5850 = class105s.length;
	    Class175.anIntArray2330 = new int[Class239_Sub1.anInt5850 + 10];
	    Class341.aClass105Array4234
		= new RasterToolkit[Class239_Sub1.anInt5850 + 10];
	    Class214.method1575(class105s, 0, Class341.aClass105Array4234, 0,
				Class239_Sub1.anInt5850);
	    for (int i_17_ = 0;
		 (i_17_ ^ 0xffffffff) > (Class239_Sub1.anInt5850 ^ 0xffffffff);
		 i_17_++)
		Class175.anIntArray2330[i_17_]
		    = Class341.aClass105Array4234[i_17_].method980();
	    if (i != 515880227)
		anInt1597 = 49;
	    for (int i_18_ = Class239_Sub1.anInt5850;
		 ((Class341.aClass105Array4234.length ^ 0xffffffff)
		  < (i_18_ ^ 0xffffffff));
		 i_18_++)
		Class175.anIntArray2330[i_18_] = 12;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("bca.RA("
					     + (class105s != null ? "{...}"
						: "null")
					     + ',' + i + ')'));
	}
    }
    
    abstract void method902(int i);
    
    abstract void method903(int i, int i_19_, int i_20_, int i_21_, int i_22_,
			    int i_23_);
    
    static final Class258_Sub3_Sub1 method904
	(int i, DirectxToolkit var_ha_Sub2, int i_24_, int i_25_, int i_26_) {
	try {
	    anInt1594++;
	    if (i <= 42)
		method906(123);
	    if (((DirectxToolkit) var_ha_Sub2).aBoolean7793
		|| (Class192.method1436(82, i_25_)
		    && Class192.method1436(81, i_26_)))
		return new Class258_Sub3_Sub1(var_ha_Sub2, 3553, i_24_, i_25_,
					      i_26_);
	    if (((DirectxToolkit) var_ha_Sub2).aBoolean7837)
		return new Class258_Sub3_Sub1(var_ha_Sub2, 34037, i_24_, i_25_,
					      i_26_);
	    return new Class258_Sub3_Sub1(var_ha_Sub2, i_24_, i_25_, i_26_,
					  Class33.method340(i_25_, (byte) 108),
					  Class33.method340(i_26_,
							    (byte) 108));
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("bca.TA(" + i + ','
					     + (var_ha_Sub2 != null ? "{...}"
						: "null")
					     + ',' + i_24_ + ',' + i_25_ + ','
					     + i_26_ + ')'));
	}
    }
    
    abstract void method905(int i, int i_27_, int i_28_, int[] is);
    
    public static void method906(int i) {
	anIntArray1593 = null;
	if (i != -31777)
	    method901(null, -89);
    }
    
    abstract Class101 method907();
    
    abstract void method908(int i);
    
    static final void method909(int i) {
	anInt1598++;
	if (Class348_Sub40_Sub30.aBoolean9403 && i == 3553) {
	    while ((Class65.lobbyWorlds.length ^ 0xffffffff)
		   < (Class215.anInt2834 ^ 0xffffffff)) {
		LobbyWorld class110_sub1
		    = Class65.lobbyWorlds[Class215.anInt2834];
		if (class110_sub1 == null
		    || ((LobbyWorld) class110_sub1).anInt5788 != -1)
		    Class215.anInt2834++;
		else {
		    if (Class176.aClass348_Sub26_2332 == null)
			Class176.aClass348_Sub26_2332
			    = (Class76.aClass169_1286.method1302
			       (i ^ ~0x1967,
				((LobbyWorld) class110_sub1).ipAddress));
		    int i_29_
			= (((Class348_Sub26) Class176.aClass348_Sub26_2332)
			   .anInt6887);
		    if (i_29_ == -1)
			break;
		    ((LobbyWorld) class110_sub1).anInt5788 = i_29_;
		    Class215.anInt2834++;
		    Class176.aClass348_Sub26_2332 = null;
		}
	    }
	}
    }
    
    abstract void method910();
}
