/* Class182 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class182
{
    int anInt2445;
    static int anInt2446;
    static LoadingScreen[] modernLoadingScreens;
    int anInt2448;
    static AbstractKeyboardListener keyboardListener;
    static int anInt2450;
    int anInt2451;
    static int anInt2452;
    static int anInt2453;
    int anInt2454;
    int anInt2455;
    int anInt2456;
    
    static final void method1372(int i) {
	RuntimeException_Sub1.anInt4596 = i;
	Class239_Sub12.anInt5969 = 1;
	anInt2452++;
	long l = 0L;
	if (Class348_Sub23_Sub3.sskeyStr != null) {
	    ByteBuffer class348_sub49
		= new ByteBuffer(Class98.method878((LobbyWorld
							    .method1039
							((Class348_Sub23_Sub3
							  .sskeyStr),
							 true)),
						       -125));
	    l = class348_sub49.getLong();
	    Class348_Sub33.aLong6966 = class348_sub49.getLong();
	} else {
	    Class14_Sub4.method254(35, (byte) -101);
	    return;
	}
	Class132.method1138(Class27.method313(l, -100), true, "", (byte) -115);
    }
    
    static final void method1373(int i, int i_0_, int i_1_, int i_2_, int i_3_,
				 int i_4_, int i_5_, int i_6_, int i_7_,
				 int i_8_, int i_9_, int i_10_) {
	anInt2450++;
	if (Class320.method2547(i, (byte) 84) && i_5_ == -1391) {
	    if (Class369_Sub2.aClass46ArrayArray8584[i] == null)
		Main.method107((Class348_Sub40_Sub33.aClass46ArrayArray9427
				  [i]),
				 -1, i_1_, i_10_, i_2_, i_7_, i_0_, i_8_, i_4_,
				 i_3_, i_6_, i_9_);
	    else
		Main.method107(Class369_Sub2.aClass46ArrayArray8584[i], -1,
				 i_1_, i_10_, i_2_, i_7_, i_0_, i_8_, i_4_,
				 i_3_, i_6_, i_9_);
	}
    }
    
    static final Class50_Sub4 method1374(int i,
					 ByteBuffer class348_sub49) {
	if (i < 106)
	    keyboardListener = null;
	anInt2453++;
	return new Class50_Sub4(class348_sub49.method3372(13638),
				class348_sub49.method3372(13638),
				class348_sub49.method3372(13638),
				class348_sub49.method3372(13638),
				class348_sub49.getTri(),
				class348_sub49.getUByte());
    }
    
    public static void method1375(int i) {
	if (i != 5616)
	    keyboardListener = null;
	keyboardListener = null;
	modernLoadingScreens = null;
    }
    
    public Class182() {
	/* empty */
    }
}
