/* OutputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

final class OutputStream_Sub1 extends OutputStream
{
    static int anInt92;
    static Random random = new Random();
    static int anInt94;
    static int anInt95;
    static int anInt96;
    static LobbyWorld[] lobbyWorldInfos;
    static int anInt98;
    static int[] anIntArray99;
    static int[] anIntArray100
	= { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
	    99, 99, 99, 99, 99, 99, 99, 120 };
    
    static final void method132(int i, boolean bool, int i_0_, int i_1_,
				int i_2_, int i_3_) {
	anInt94++;
	if (Message.aClass357ArrayArrayArray2029 == null)
	    Class348_Sub8.currentToolkit.method3675(i_0_, (byte) -125, i_1_, i_3_,
					     i_2_, -16777216);
	else if ((((Class318_Sub1)
		   Class132.localPlayer).anInt6377
		  ^ 0xffffffff) > -1
		 || (((Class318_Sub1)
		      Class132.localPlayer).anInt6377
		     >= Class367_Sub4.anInt7319 * 512)
		 || ((Class318_Sub1)
		     Class132.localPlayer).anInt6388 < 0
		 || ((((Class318_Sub1)
		       Class132.localPlayer).anInt6388
		      ^ 0xffffffff)
		     <= (512 * Class348_Sub40_Sub3.anInt9109 ^ 0xffffffff)))
	    Class348_Sub8.currentToolkit.method3675(i_0_, (byte) -125, i_1_, i_3_,
					     i_2_, -16777216);
	else {
	    Class239_Sub15.anInt6006++;
	    if (Class132.localPlayer != null
		&& ((((Class318_Sub1)
		      Class132.localPlayer).anInt6377
		     + -(256 * Class132.localPlayer
				   .method2436((byte) 90))
		     - -256) >> -313379639
		    ^ 0xffffffff) == (OndemandWorker.anInt3203 ^ 0xffffffff)
		&& ((((Class318_Sub1)
		      Class132.localPlayer).anInt6388
		     + 256
		     + -(256 * Class132.localPlayer
				   .method2436((byte) 112))) >> 1733391561
		    ^ 0xffffffff) == (Class97.anInt1548 ^ 0xffffffff)) {
		Class97.anInt1548 = -1;
		OndemandWorker.anInt3203 = -1;
		Class299_Sub1_Sub2.method2264(false);
	    }
	    Class192.method1434(-14988);
	    if (!bool)
		Class282.method2109(512);
	    Class108.method1014(-4);
	    Class348_Sub42_Sub3.method3174(i_1_, i_3_, i_0_, true, (byte) -82,
					   i_2_);
	    i_3_ = FileOnDisk.anInt3047;
	    i_1_ = Class295.anInt3764;
	    i_2_ = Class280.anInt3643;
	    Class132.anInt1906 = Class132.anInt1911;
	    i_0_ = Class127.anInt4656;
	    if (Class348_Sub40_Sub21.anInt9282 == 1) {
		int i_4_ = (int) Class76.aFloat1287;
		if ((i_4_ ^ 0xffffffff)
		    > (Class348_Sub35.anInt6979 >> -2058606168 ^ 0xffffffff))
		    i_4_ = Class348_Sub35.anInt6979 >> 937303208;
		if (Class181.aBooleanArray2374[4]
		    && ItemLoader.anIntArray3273[4] + 128 > i_4_)
		    i_4_ = ItemLoader.anIntArray3273[4] + 128;
		int i_5_
		    = (int) AbtractArchiveLoader.aFloat3938 + ModernLoadingScreen.anInt5016 & 0x3fff;
		AnimationDefinition.method268
		    (i_4_,
		     -200 + (Class275.method2064
			     ((((Class318_Sub1)
				Class132.localPlayer)
			       .anInt6377),
			      Class355.anInt4372, 11219,
			      (((Class318_Sub1)
				Class132.localPlayer)
			       .anInt6388))),
		     i_5_, Class192.anInt2578, i_2_, -19360,
		     Class130_Sub1.anInt5799,
		     (i_4_ >> 1623417891) * 3 + 600 << 977232418);
	    } else if (Class348_Sub40_Sub21.anInt9282 == 4) {
		int i_6_ = (int) Class76.aFloat1287;
		if (i_6_ < Class348_Sub35.anInt6979 >> 2080798280)
		    i_6_ = Class348_Sub35.anInt6979 >> -2131173688;
		if (Class181.aBooleanArray2374[4]
		    && ((ItemLoader.anIntArray3273[4] + 128 ^ 0xffffffff)
			< (i_6_ ^ 0xffffffff)))
		    i_6_ = 128 + ItemLoader.anIntArray3273[4];
		int i_7_ = (int) AbtractArchiveLoader.aFloat3938 & 0x3fff;
		AnimationDefinition.method268
		    (i_6_,
		     -200 + Class275.method2064(Class348_Sub6.anInt6633,
						Class355.anInt4372, 11219,
						Class348_Sub7.anInt6652),
		     i_7_, Class192.anInt2578, i_2_, -19360,
		     Class130_Sub1.anInt5799,
		     600 - -((i_6_ >> 1116637315) * 3) << 563807938);
	    } else if (Class348_Sub40_Sub21.anInt9282 == 5)
		Class268.method2035(i_2_, 0);
	    int i_8_ = Class286_Sub4.anInt6246;
	    int i_9_ = Class305.anInt3855;
	    int i_10_ = Class59_Sub2_Sub2.anInt8685;
	    int i_11_ = ClientScript.anInt9701;
	    int i_12_ = Class5.anInt4638;
	    for (int i_13_ = 0; i_13_ < 5; i_13_++) {
		if (Class181.aBooleanArray2374[i_13_]) {
		    int i_14_
			= (int) ((Math.random()
				  * (double) ((Class275.anIntArray3552[i_13_]
					       * 2)
					      - -1))
				 - (double) Class275.anIntArray3552[i_13_]
				 + (Math.sin((double) (Class318_Sub1_Sub1_Sub2
						       .anIntArray9981[i_13_])
					     * ((double) (Class338
							  .anIntArray4196
							  [i_13_])
						/ 100.0))
				    * (double) (ItemLoader.anIntArray3273
						[i_13_])));
		    if ((i_13_ ^ 0xffffffff) == -5) {
			ClientScript.anInt9701 += i_14_;
			if (ClientScript.anInt9701 >= 1024) {
			    if (ClientScript.anInt9701 > 3072)
				ClientScript.anInt9701 = 3072;
			} else
			    ClientScript.anInt9701 = 1024;
		    }
		    if ((i_13_ ^ 0xffffffff) == -1)
			Class286_Sub4.anInt6246 += i_14_ << -2090649694;
		    if ((i_13_ ^ 0xffffffff) == -4)
			Class5.anInt4638 = 0x3fff & i_14_ + Class5.anInt4638;
		    if ((i_13_ ^ 0xffffffff) == -2)
			Class305.anInt3855 += i_14_ << 1737719458;
		    if ((i_13_ ^ 0xffffffff) == -3)
			Class59_Sub2_Sub2.anInt8685 += i_14_ << 666991490;
		}
	    }
	    if (Class286_Sub4.anInt6246 < 0)
		Class286_Sub4.anInt6246 = 0;
	    if (-1 + (Class318_Sub7.anInt6451 << 1531551753)
		< Class286_Sub4.anInt6246)
		Class286_Sub4.anInt6246
		    = -1 + (Class318_Sub7.anInt6451 << -1280769655);
	    if ((Class59_Sub2_Sub2.anInt8685 ^ 0xffffffff) > -1)
		Class59_Sub2_Sub2.anInt8685 = 0;
	    if (((Class348_Sub41.anInt7054 << -412209207) + -1 ^ 0xffffffff)
		> (Class59_Sub2_Sub2.anInt8685 ^ 0xffffffff))
		Class59_Sub2_Sub2.anInt8685
		    = (Class348_Sub41.anInt7054 << -1496605559) - 1;
	    Class348_Sub42_Sub11.method3225(114);
	    Class348_Sub42_Sub3.method3175((byte) -107);
	    Class348_Sub8.currentToolkit.setDimensions(i_1_, i_3_, i_1_ - -i_0_, i_3_ + i_2_);
	    Class226.method1626(1, true);
	    if (Class59_Sub1.aBoolean5300) {
		Class101_Sub3.method941(124, Class187.anInt2500);
		if ((Class375.anInt4545 ^ 0xffffffff)
		    != (Class132.anInt1906 ^ 0xffffffff))
		    Class348_Sub16_Sub2.aBoolean8870 = true;
		Class375.anInt4545 = Class132.anInt1906;
	    } else {
		Class348_Sub8.currentToolkit.ya();
		int i_15_ = Class187.anInt2500;
		if (IntegerVarScriptSettingLoader.aClass305_3304 != null)
		    IntegerVarScriptSettingLoader.aClass305_3304.method2293
			(Class185.anInt2481 << -839684253,
			 Class348_Sub8.currentToolkit, (byte) -72, i_1_, i_0_, i_3_,
			 Class5.anInt4638, ClientScript.anInt9701,
			 i_15_, i_2_);
		else
		    Class348_Sub8.currentToolkit.drawScreenOverlay(i_15_);
	    }
	    Class369_Sub1.method3570(false);
	    if (i >= 80) {
		Class157.aClass101_2123.method903
		    (Class286_Sub4.anInt6246, Class305.anInt3855,
		     Class59_Sub2_Sub2.anInt8685,
		     -ClientScript.anInt9701 & 0x3fff,
		     -Class5.anInt4638 & 0x3fff, 0x3fff & -Class338.anInt4186);
		Class348_Sub8.currentToolkit.method3638(Class157.aClass101_2123);
		Class348_Sub8.currentToolkit.DA(i_0_ / 2 + i_1_, i_3_ + i_2_ / 2,
					 Class97.anInt1550 << 2047541217,
					 Class97.anInt1550 << -405504991);
		Class30.method319(Class97.anInt1550 << -1678768607,
				  Class97.anInt1550 << -1259968223, (byte) -18,
				  i_1_ + i_0_ / 2, i_3_ + i_2_ / 2);
		Class348_Sub42_Sub20.method3282(0x3fff & -(ClientScript
							   .anInt9701),
						Class59_Sub2_Sub2.anInt8685,
						Class305.anInt3855, 0,
						-Class5.anInt4638 & 0x3fff,
						Class286_Sub4.anInt6246,
						-Class338.anInt4186 & 0x3fff);
		byte i_16_ = (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
				  .aClass239_Sub14_7264.method1778(-32350) != 2
			      ? (byte) 1 : (byte) Class239_Sub15.anInt6006);
		if (Class59_Sub1.aBoolean5300) {
		    Class21.method289(-15902, 0x3fff & -Class5.anInt4638,
				      -Class338.anInt4186 & 0x3fff,
				      (-ClientScript.anInt9701
				       & 0x3fff));
		    GameMode.method1634
			(AnimatableToolkit.anIntArray1127, -2,
			 Class289.aByteArrayArrayArray3700,
			 (((Class318_Sub1)
			   Class132.localPlayer)
			  .anInt6388) >> -932753879,
			 (((Class318_Sub1)
			   Class132.localPlayer)
			  .aByte6381) - -1,
			 Class327.anIntArray4097, Class286_Sub4.anInt6246,
			 Class59_Sub2_Sub2.anInt8685,
			 ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			     .aClass239_Sub1_7246.method1720(-32350) == 0,
			 Class305.anInt3855,
			 (((Class318_Sub1)
			   Class132.localPlayer)
			  .anInt6377) >> -832039159,
			 Class156.anIntArray2117,
			 Class348_Sub40_Sub19.anIntArray9259, i_16_,
			 LoadingStage.anIntArray1045, Class367_Sub11.logicCycle,
			 true, Class132.anInt1906);
		} else
		    Class258_Sub1.method1960
			(Class367_Sub11.logicCycle, Class286_Sub4.anInt6246,
			 Class305.anInt3855, Class59_Sub2_Sub2.anInt8685,
			 Class289.aByteArrayArrayArray3700,
			 Class327.anIntArray4097, Class156.anIntArray2117,
			 Class348_Sub40_Sub19.anIntArray9259,
			 LoadingStage.anIntArray1045, AnimatableToolkit.anIntArray1127,
			 (((Class318_Sub1)
			   Class132.localPlayer)
			  .aByte6381) - -1,
			 i_16_,
			 (((Class318_Sub1)
			   Class132.localPlayer)
			  .anInt6377) >> 1790545481,
			 (((Class318_Sub1)
			   Class132.localPlayer)
			  .anInt6388) >> 1598745993,
			 (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub1_7246.method1720(-32350)
			  ^ 0xffffffff) == -1,
			 true,
			 !Class305.aBoolean3870 ? -1 : Class132.anInt1906, 0,
			 false);
		Class369_Sub1.method3570(false);
		if ((Class240.anInt4674 ^ 0xffffffff) == -11) {
		    Class19.method283(-127, i_0_, 256, i_2_, i_1_, i_3_, 256);
		    DirectxToolkit.method3802(i_3_, i_2_, 2, i_1_, i_0_, 256, 256);
		    Class318_Sub1_Sub1_Sub2.method2403(i_1_, 256, i_3_, i_0_,
						       19206, i_2_, 256);
		    Class166.method1289(i_2_, i_0_, i_3_, 8, i_1_);
		}
		Class348_Sub42_Sub11.method3223();
		Class286_Sub4.anInt6246 = i_8_;
		ClientScript.anInt9701 = i_11_;
		Class5.anInt4638 = i_12_;
		Class305.anInt3855 = i_9_;
		Class59_Sub2_Sub2.anInt8685 = i_10_;
		if (SocketConnection.aBoolean5840
		    && Class348_Sub4.ondemandWorker.getTotalPriRequests() == 0)
		    SocketConnection.aBoolean5840 = false;
		if (SocketConnection.aBoolean5840) {
		    Class348_Sub8.currentToolkit.method3675(i_0_, (byte) -125, i_1_,
						     i_3_, i_2_, -16777216);
		    Class362.method3511(false, GameApplet.p12fullFontRasterizer,
					Class246.p12fullBitmapFont,
					(GameText.loadingPleaseWaitGameText.getLanguageText
					 (Class348_Sub33.gameLanguage)),
					2, Class348_Sub8.currentToolkit);
		}
		Class226.method1626(1, false);
	    }
	}
    }
    
    public final void write(int i) throws IOException {
	anInt96++;
	throw new IOException();
    }
    
    public static void method133(byte i) {
	anIntArray100 = null;
	anIntArray99 = null;
	lobbyWorldInfos = null;
	if (i != -41)
	    anIntArray99 = null;
	random = null;
    }
    
    static final void method134(byte i) {
	if (i != -126)
	    method132(-95, true, 10, 28, 45, 100);
	if (Class355.anObject4366 == null) {
	    Class59_Sub1_Sub1 class59_sub1_sub1 = new Class59_Sub1_Sub1();
	    byte[] is = class59_sub1_sub1.method559(128, 128, (byte) 106, 16);
	    Class355.anObject4366 = Class179.getDirectByteBuffer(is);
	}
	anInt92++;
	if (Class227.anObject2969 == null) {
	    Class59_Sub2_Sub2 class59_sub2_sub2 = new Class59_Sub2_Sub2();
	    byte[] is = class59_sub2_sub2.method571(128, (byte) -38, 16, 128);
	    Class227.anObject2969 = Class179.getDirectByteBuffer(is);
	}
    }
    
    static {
	anIntArray99 = new int[] { 1, -1, -1, 1 };
    }
}
