/* Class348_Sub42_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub42_Sub3 extends SubNode
{
    static boolean aBoolean9498;
    byte[] aByteArray9499;
    static int anInt9500;
    static int anInt9501;
    static short[] aShortArray9502;
    static IncomingPacket aClass114_9503;
    static int anInt9504;
    static int[] anIntArray9505 = new int[3];
    static int anInt9506;
    static int anInt9507;
    static int anInt9508;
    static int anInt9509;
    
    static final void method3174(int i, int i_0_, int i_1_, boolean bool,
				 byte i_2_, int i_3_) {
	if (i_1_ < 1)
	    i_1_ = 1;
	anInt9507++;
	if ((i_3_ ^ 0xffffffff) > -2)
	    i_3_ = 1;
	int i_4_ = i_3_ - 334;
	if (i_4_ < 0)
	    i_4_ = 0;
	else if ((i_4_ ^ 0xffffffff) < -101)
	    i_4_ = 100;
	int i_5_ = ((-AbstractLobbyWorld.aShort1700 + Class168.aShort2250) * i_4_ / 100
		    + AbstractLobbyWorld.aShort1700);
	if ((Class348_Sub42_Sub8.aShort9555 ^ 0xffffffff)
	    < (i_5_ ^ 0xffffffff))
	    i_5_ = Class348_Sub42_Sub8.aShort9555;
	else if (Class48.aShort851 < i_5_)
	    i_5_ = Class48.aShort851;
	int i_6_ = 512 * i_5_ * i_3_ / (i_1_ * 334);
	if (i_6_ >= Class367_Sub8.aShort7355) {
	    if ((Class171.aShort2269 ^ 0xffffffff) > (i_6_ ^ 0xffffffff)) {
		i_6_ = Class171.aShort2269;
		i_5_ = i_1_ * i_6_ * 334 / (i_3_ * 512);
		if ((Class348_Sub42_Sub8.aShort9555 ^ 0xffffffff)
		    < (i_5_ ^ 0xffffffff)) {
		    i_5_ = Class348_Sub42_Sub8.aShort9555;
		    int i_7_ = i_6_ * (i_1_ * 334) / (i_5_ * 512);
		    int i_8_ = (-i_7_ + i_3_) / 2;
		    if (bool) {
			Class348_Sub8.currentToolkit.la();
			Class348_Sub8.currentToolkit.method3675(i_1_, (byte) -125, i,
							 i_0_, i_8_,
							 -16777216);
			Class348_Sub8.currentToolkit.method3675(i_1_, (byte) -125, i,
							 i_3_ + i_0_ - i_8_,
							 i_8_, -16777216);
		    }
		    i_0_ += i_8_;
		    i_3_ -= 2 * i_8_;
		}
	    }
	} else {
	    i_6_ = Class367_Sub8.aShort7355;
	    i_5_ = i_6_ * (i_1_ * 334) / (i_3_ * 512);
	    if ((i_5_ ^ 0xffffffff) < (Class48.aShort851 ^ 0xffffffff)) {
		i_5_ = Class48.aShort851;
		int i_9_ = i_5_ * i_3_ * 512 / (334 * i_6_);
		int i_10_ = (i_1_ + -i_9_) / 2;
		if (bool) {
		    Class348_Sub8.currentToolkit.la();
		    Class348_Sub8.currentToolkit.method3675(i_10_, (byte) -125, i,
						     i_0_, i_3_, -16777216);
		    Class348_Sub8.currentToolkit.method3675(i_10_, (byte) -125,
						     -i_10_ + i + i_1_, i_0_,
						     i_3_, -16777216);
		}
		i += i_10_;
		i_1_ -= i_10_ * 2;
	    }
	}
	Class97.anInt1550 = i_3_ * i_5_ / 334;
	FileOnDisk.anInt3047 = i_0_;
	Class280.anInt3643 = (short) i_3_;
	Class127.anInt4656 = (short) i_1_;
	Class295.anInt3764 = i;
	int i_11_ = -3 % ((-8 - i_2_) / 56);
    }
    
    static final void method3175(byte i) {
	if (!Class348_Sub42_Sub8.method3196(Class240.anInt4674, -114)
	    && !ArchiveFetcher.method2672(Class240.anInt4674, -103)) {
	    int i_12_ = ((((Class318_Sub1_Sub3_Sub3)
			   Class132.localPlayer)
			  .anIntArray10320[0])
			 >> 123282371);
	    int i_13_ = ((((Class318_Sub1_Sub3_Sub3)
			   Class132.localPlayer)
			  .anIntArray10317[0])
			 >> 1031515907);
	    if ((i_12_ ^ 0xffffffff) > -1
		|| Class367_Sub4.anInt7319 >> -1390409597 <= i_12_
		|| (i_13_ ^ 0xffffffff) > -1
		|| ((i_13_ ^ 0xffffffff)
		    <= (Class348_Sub40_Sub3.anInt9109 >> 269827523
			^ 0xffffffff)))
		KeyboardListener.method2703(0,
					 Class367_Sub4.anInt7319 >> -887543164,
					 (Class348_Sub40_Sub3.anInt9109
					  >> -2041704060),
					 (byte) -13);
	    else
		KeyboardListener.method2703(5000, i_12_, i_13_, (byte) -13);
	} else
	    KeyboardListener.method2703(5000,
				     Class286_Sub4.anInt6246 >> 1946107980,
				     Class59_Sub2_Sub2.anInt8685 >> 313659148,
				     (byte) -13);
	anInt9509++;
	Class348_Sub40_Sub32.method3134(-1);
	Class348_Sub23_Sub4.method2988(true);
	int i_14_ = -8 % ((-30 - i) / 38);
	Class348_Sub40_Sub30.method3126((byte) 98);
	Class130_Sub1.method1131(117);
    }
    
    Class348_Sub42_Sub3(byte[] is) {
	((Class348_Sub42_Sub3) this).aByteArray9499 = is;
    }
    
    public static void method3176(boolean bool) {
	anIntArray9505 = null;
	aShortArray9502 = null;
	if (bool != true)
	    aShortArray9502 = null;
	aClass114_9503 = null;
    }
    
    static final void method3177(int i, boolean bool) {
	if (!bool || Class75.aClass348_Sub42_Sub14_1243 == null)
	    Class239_Sub13.anInt5976 = -1;
	else
	    Class239_Sub13.anInt5976
		= (((Class348_Sub42_Sub14) Class75.aClass348_Sub42_Sub14_1243)
		   .anInt9628);
	anInt9500++;
	Class75.aClass348_Sub42_Sub14_1243 = null;
	Class168.aClass46_2249 = null;
	Node.anInt4290 = 0;
	Class289.aClass262_3705 = null;
	Class75.method749();
	Class75.aClass262_1254.removeAll(127);
	Class285.aClass323_4754 = null;
	Class168.aClass323_2252 = null;
	Class67.aClass105_4643 = null;
	Class125.aClass323_4921 = null;
	Class176.aClass323_2333 = null;
	Class348_Sub3.aClass323_6581 = null;
	Class39.aClass323_521 = null;
	Class75.aClass252_1246 = null;
	Class14_Sub4.aClass323_8644 = null;
	Class48.anInt859 = -1;
	if (i <= -44) {
	    TextureLoader.anInt4609 = -1;
	    Class240.aClass323_4672 = null;
	    if (Class75.aClass153_1238 != null) {
		Class75.aClass153_1238.method1219(7851);
		Class75.aClass153_1238.method1220((byte) -100, 64, 128);
	    }
	    if (Class75.aClass141_1242 != null)
		Class75.aClass141_1242.method1178(64, 1, 64);
	    if (Class75.aClass263_1245 != null)
		Class75.aClass263_1245.method2014(64, true);
	    Class229.scriptConfigLoader.method1444(64, -124);
	}
    }
    
    static final void method3178(IndexLoader class45, int i, int[] is,
				 IndexLoader class45_15_) {
	try {
	    anInt9506++;
	    if (is != null)
		Class348_Sub1.anIntArray6547 = is;
	    s.fontIndexLoader = class45;
	    if (i >= -6)
		method3177(-36, true);
	    Class39.spriteIndexLoader = class45_15_;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("lk.F(" + (class45 != null ? "{...}" : "null") + ','
			+ i + ',' + (is != null ? "{...}" : "null") + ','
			+ (class45_15_ != null ? "{...}" : "null") + ')'));
	}
    }
    
    static final void method3179(int i) {
	Class3.method175((byte) -50);
	anInt9508++;
	int i_16_ = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			.aClass239_Sub3_7222.method1727(-32350);
	do {
	    if (i_16_ != 2) {
		if (i_16_ != 3)
		    break;
	    } else {
		Class121.method1083(Class348_Sub8.currentToolkit, 100, (byte) 9,
				    Class348_Sub42_Sub8_Sub2.windowHeight, 100,
				    Class321.windowWidth);
		break;
	    }
	    Class18.method282(2, Class348_Sub8.currentToolkit, Class321.windowWidth,
			      (byte) 73, IndexLoader.anInt666,
			      Class186_Sub1.anInt5812,
			      Class348_Sub42_Sub8_Sub2.windowHeight, 2);
	} while (false);
	if (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		.aClass239_Sub3_7222.method1735(false))
	    s.method3980(i + 93, Class305.canvas);
	if (Class348_Sub8.currentToolkit != null)
	    Class290.method2196((byte) -9);
	Class305.aBoolean3870
	    = i != ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		       .aClass239_Sub3_7222.method1727(-32350);
	Class59_Sub1.aBoolean5300
	    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		  .aClass239_Sub3_7222.method1735(false);
    }
    
    static {
	anInt9501 = 0;
	aShortArray9502 = new short[256];
	aClass114_9503 = new IncomingPacket(9, -1);
    }
}
