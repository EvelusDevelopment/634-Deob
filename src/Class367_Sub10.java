/* Class367_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class367_Sub10 extends Class367
{
    static int anInt7381;
    static IndexLoader indexLoader5;
    static int anInt7383;
    static int anInt7384;
    private boolean aBoolean7385 = false;
    static int anInt7386;
    static int anInt7387;
    static int anInt7388;
    static int anInt7389;
    
    final void method3527(int i, Interface18 interface18, int i_0_) {
	((Class367) this).aHa_Sub3_4479.method3850((byte) 79, interface18);
	if (i_0_ != -16776)
	    aBoolean7385 = false;
	anInt7381++;
	((Class367) this).aHa_Sub3_4479.method3923(true, i);
    }
    
    static final void method3553(boolean bool, byte i, int i_1_) {
	if (i <= 98)
	    method3553(true, (byte) 34, 120);
	Class258_Sub3_Sub1.method1971
	    (-2,
	     GameText.loadingPleaseWaitGameText.getLanguageText(Class348_Sub33.gameLanguage),
	     bool, i_1_);
	anInt7388++;
    }
    
    final void method3525(int i, boolean bool) {
	anInt7384++;
	Interface18_Impl2 interface18_impl2
	    = ((Class367) this).aHa_Sub3_4479.method3834(-16777216);
	if (i != 15192)
	    aBoolean7385 = false;
	if (interface18_impl2 != null && bool) {
	    ((Class367) this).aHa_Sub3_4479.method3897(1, i + -19574);
	    ((Class367) this).aHa_Sub3_4479.method3850((byte) 96,
						       interface18_impl2);
	    ((Class367) this).aHa_Sub3_4479.method3871(Class261.aClass113_3314,
						       i + -15192);
	    ((Class367) this).aHa_Sub3_4479.method3897(1, -4382);
	    ((Class367) this).aHa_Sub3_4479.method3874
		(Class328_Sub3.aClass229_6519, 104, OndemandWorker.aClass229_3196);
	    ((Class367) this).aHa_Sub3_4479.method3924(true, false, 2,
						       (Class318_Sub1_Sub2
							.aClass70_8737),
						       false);
	    ((Class367) this).aHa_Sub3_4479
		.method3885(0, true, Class285_Sub2.aClass70_8503);
	    Class101_Sub2 class101_sub2
		= ((Class367) this).aHa_Sub3_4479.method3820(false);
	    class101_sub2.method926(i + -30891, ((Class367) this)
						    .aHa_Sub3_4479
						    .method3854((byte) -44));
	    ((Class367) this).aHa_Sub3_4479
		.method3853(i ^ ~0x3b47, Class348_Sub40_Sub38.aClass251_9477);
	    ((Class367) this).aHa_Sub3_4479.method3897(0, -4382);
	    aBoolean7385 = true;
	} else
	    ((Class367) this).aHa_Sub3_4479
		.method3885(0, true, Class285_Sub2.aClass70_8503);
    }
    
    public static void method3554(int i) {
	if (i != 1)
	    indexLoader5 = null;
	indexLoader5 = null;
    }
    
    final void method3520(byte i) {
	if (i != 87)
	    indexLoader5 = null;
	anInt7386++;
	if (!aBoolean7385)
	    ((Class367) this).aHa_Sub3_4479.method3885(0, true,
						       Class342.aClass70_4247);
	else {
	    ((Class367) this).aHa_Sub3_4479.method3897(1, -4382);
	    ((Class367) this).aHa_Sub3_4479.method3871(Class150.aClass113_2047,
						       i ^ 0x57);
	    ((Class367) this).aHa_Sub3_4479.method3874(Class167.aClass229_2207,
						       103,
						       (Class167
							.aClass229_2207));
	    ((Class367) this).aHa_Sub3_4479
		.method3849((byte) 47, 2, Class348_Sub40_Sub39.aClass70_9485);
	    ((Class367) this).aHa_Sub3_4479.method3885(0, true,
						       Class342.aClass70_4247);
	    ((Class367) this).aHa_Sub3_4479.method3879(-8629);
	    ((Class367) this).aHa_Sub3_4479.method3850((byte) -111, null);
	    ((Class367) this).aHa_Sub3_4479.method3897(0, -4382);
	    aBoolean7385 = false;
	}
	((Class367) this).aHa_Sub3_4479.method3874(Class167.aClass229_2207,
						   i ^ 0x2c,
						   Class167.aClass229_2207);
    }
    
    final void method3526(int i, int i_2_, int i_3_) {
	anInt7389++;
	if (i != 10756)
	    aBoolean7385 = false;
    }
    
    final boolean method3530(int i) {
	anInt7387++;
	if (i > -57)
	    indexLoader5 = null;
	return true;
    }
    
    final void method3521(boolean bool, byte i) {
	if (i == -103) {
	    anInt7383++;
	    ((Class367) this).aHa_Sub3_4479.method3874
		(Class328_Sub3.aClass229_6519, 99, Class167.aClass229_2207);
	}
    }
    
    Class367_Sub10(NativeToolkit var_ha_Sub3) {
	super(var_ha_Sub3);
    }
}
