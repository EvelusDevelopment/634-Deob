/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

final class Canvas_Sub1 extends Canvas
{
    static int[] anIntArray60;
    static int anInt61;
    static int anInt62;
    static int anInt63;
    private Component aComponent64;
    static int anInt65;
    static int anInt66;
    static int anInt67 = 0;
    static int anInt68;
    static int anInt69;
    static int anInt70;
    
    static final void method119(int i, long l) {
	try {
	    anInt66++;
	    int i_0_
		= (Class20.anInt319
		   + ((Class318_Sub1)
		      Class132.localPlayer).anInt6377);
	    int i_1_
		= (Class260.anInt3310
		   + ((Class318_Sub1)
		      Class132.localPlayer).anInt6388);
	    if (-i_0_ + Class130_Sub1.anInt5799 < -2000
		|| (-i_0_ + Class130_Sub1.anInt5799 ^ 0xffffffff) < -2001
		|| Class192.anInt2578 - i_1_ < -2000
		|| (-i_1_ + Class192.anInt2578 ^ 0xffffffff) < -2001) {
		Class192.anInt2578 = i_1_;
		Class130_Sub1.anInt5799 = i_0_;
	    }
	    if ((i_0_ ^ 0xffffffff)
		!= (Class130_Sub1.anInt5799 ^ 0xffffffff)) {
		int i_2_ = i_0_ - Class130_Sub1.anInt5799;
		int i_3_ = (int) ((long) i_2_ * l / 320L);
		if (i_2_ <= 0) {
		    if (i_3_ == 0)
			i_3_ = -1;
		    else if ((i_2_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff))
			i_3_ = i_2_;
		} else if ((i_3_ ^ 0xffffffff) == -1)
		    i_3_ = 1;
		else if ((i_2_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff))
		    i_3_ = i_2_;
		Class130_Sub1.anInt5799 += i_3_;
	    }
	    if (i == -1) {
		AbtractArchiveLoader.aFloat3938 += Class205.aFloat2687 * (float) l / 6.0F;
		if ((Class192.anInt2578 ^ 0xffffffff) != (i_1_ ^ 0xffffffff)) {
		    int i_4_ = i_1_ - Class192.anInt2578;
		    int i_5_ = (int) ((long) i_4_ * l / 320L);
		    if ((i_4_ ^ 0xffffffff) < -1) {
			if (i_5_ != 0) {
			    if ((i_4_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff))
				i_5_ = i_4_;
			} else
			    i_5_ = 1;
		    } else if ((i_5_ ^ 0xffffffff) != -1) {
			if ((i_4_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff))
			    i_5_ = i_4_;
		    } else
			i_5_ = -1;
		    Class192.anInt2578 += i_5_;
		}
		Class76.aFloat1287
		    += Class348_Sub27.aFloat6898 * (float) l / 6.0F;
		Class239_Sub2.method1725(262144);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "vg.A(" + i + ',' + l + ')');
	}
    }
    
    public final void update(Graphics graphics) {
	anInt61++;
	aComponent64.update(graphics);
    }
    
    public static void method120(boolean bool) {
	anIntArray60 = null;
	if (bool != false)
	    anIntArray60 = null;
    }
    
    static final void method121(int i, int i_6_, boolean bool, int i_7_,
				int i_8_, int i_9_) {
	if (i_6_ != -364570972)
	    anInt70 = -4;
	anInt68++;
	long l = (long) (i | (!bool ? 0 : -2147483648));
	Class348_Sub13 class348_sub13
	    = ((Class348_Sub13)
	       Class348_Sub40.aClass356_7041.get(l));
	if (class348_sub13 == null) {
	    class348_sub13 = new Class348_Sub13();
	    Class348_Sub40.aClass356_7041.putNode(l,
						     class348_sub13);
	}
	if (((Class348_Sub13) class348_sub13).anIntArray6757.length <= i_7_) {
	    int[] is = new int[1 + i_7_];
	    int[] is_10_ = new int[1 + i_7_];
	    for (int i_11_ = 0;
		 ((i_11_ ^ 0xffffffff)
		  > (((Class348_Sub13) class348_sub13).anIntArray6757.length
		     ^ 0xffffffff));
		 i_11_++) {
		is[i_11_]
		    = ((Class348_Sub13) class348_sub13).anIntArray6757[i_11_];
		is_10_[i_11_]
		    = ((Class348_Sub13) class348_sub13).anIntArray6758[i_11_];
	    }
	    for (int i_12_
		     = ((Class348_Sub13) class348_sub13).anIntArray6757.length;
		 (i_7_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++) {
		is[i_12_] = -1;
		is_10_[i_12_] = 0;
	    }
	    ((Class348_Sub13) class348_sub13).anIntArray6757 = is;
	    ((Class348_Sub13) class348_sub13).anIntArray6758 = is_10_;
	}
	((Class348_Sub13) class348_sub13).anIntArray6757[i_7_] = i_9_;
	((Class348_Sub13) class348_sub13).anIntArray6758[i_7_] = i_8_;
    }
    
    public final void paint(Graphics graphics) {
	aComponent64.paint(graphics);
	anInt65++;
    }
    
    static final AnimatableToolkit method122(int i, int i_13_, int i_14_, int i_15_,
				   int i_16_, byte i_17_, AbstractToolkit var_ha) {
	anInt62++;
	if (i_17_ != -35)
	    anInt70 = 10;
	long l = (long) i_16_;
	AnimatableToolkit class64 = (AnimatableToolkit) Class15.aClass60_225.method583(l, 81);
	int i_18_ = 2055;
	if (class64 == null) {
	    Model class124
		= Class300.createModel(0, aa_Sub3.indexLoader7, i_16_);
	    if (class124 == null)
		return null;
	    if ((((Model) class124).anInt1830 ^ 0xffffffff) > -14)
		class124.method1092(2, 105);
	    class64 = var_ha.method3625(class124, i_18_, Class171.anInt2275,
					64, 768);
	    Class15.aClass60_225.method582(class64, l, (byte) -122);
	}
	class64 = class64.method614((byte) 2, i_18_, true);
	if (i_15_ != 0)
	    class64.a(i_15_);
	if ((i_13_ ^ 0xffffffff) != -1)
	    class64.FA(i_13_);
	if ((i_14_ ^ 0xffffffff) != -1)
	    class64.VA(i_14_);
	if ((i ^ 0xffffffff) != -1)
	    class64.H(0, i, 0);
	return class64;
    }
    
    static final void method123(int i) {
	anInt63++;
	Class289.method2193(false, (byte) -125);
	Class268.anInt3441 = 0;
	boolean bool = true;
	for (int i_19_ = 0; Class347.aByteArrayArray4281.length > i_19_;
	     i_19_++) {
	    if ((aa_Sub1.anIntArray5192[i_19_] ^ 0xffffffff) != 0
		&& Class347.aByteArrayArray4281[i_19_] == null) {
		Class347.aByteArrayArray4281[i_19_]
		    = Class367_Sub10.indexLoader5
			  .loadArchiveChild(-1860, aa_Sub1.anIntArray5192[i_19_], 0);
		if (Class347.aByteArrayArray4281[i_19_] == null) {
		    bool = false;
		    Class268.anInt3441++;
		}
	    }
	    if (GameApplet.anIntArray38[i_19_] != -1
		&& Class14_Sub4.aByteArrayArray8642[i_19_] == null) {
		Class14_Sub4.aByteArrayArray8642[i_19_] = (Class367_Sub10.indexLoader5.loadArchiveChild(GameApplet.anIntArray38[i_19_], 0, i + 2, Class239_Sub6.anIntArrayArray5894[i_19_]));
		if (Class14_Sub4.aByteArrayArray8642[i_19_] == null) {
		    Class268.anInt3441++;
		    bool = false;
		}
	    }
	    if ((Class295.anIntArray3759[i_19_] ^ 0xffffffff) != 0
		&& Class129.aByteArrayArray1887[i_19_] == null) {
		Class129.aByteArrayArray1887[i_19_]
		    = Class367_Sub10.indexLoader5
			  .loadArchiveChild(-1860, Class295.anIntArray3759[i_19_], 0);
		if (Class129.aByteArrayArray1887[i_19_] == null) {
		    Class268.anInt3441++;
		    bool = false;
		}
	    }
	    if (r.anIntArray9724[i_19_] != -1
		&& Class348_Sub23_Sub1.aByteArrayArray8996[i_19_] == null) {
		Class348_Sub23_Sub1.aByteArrayArray8996[i_19_]
		    = Class367_Sub10.indexLoader5
			  .loadArchiveChild(-1860, r.anIntArray9724[i_19_], 0);
		if (Class348_Sub23_Sub1.aByteArrayArray8996[i_19_] == null) {
		    bool = false;
		    Class268.anInt3441++;
		}
	    }
	    if (Class322.anIntArray4031 != null
		&& StringNode.aByteArrayArray7212[i_19_] == null
		&& Class322.anIntArray4031[i_19_] != -1) {
		StringNode.aByteArrayArray7212[i_19_]
		    = (Class367_Sub10.indexLoader5.loadArchiveChild
		       (Class322.anIntArray4031[i_19_], 0, i + 2,
			Class239_Sub6.anIntArrayArray5894[i_19_]));
		if (StringNode.aByteArrayArray7212[i_19_] == null) {
		    bool = false;
		    Class268.anInt3441++;
		}
	    }
	}
	if (r_Sub2.aClass252_10488 == null) {
	    if (Class348_Sub26.aClass348_Sub42_Sub14_6885 != null
		&& (Class348_Sub32.indexLoader23.method400
		    (-18308, (((Class348_Sub42_Sub14)
			       Class348_Sub26.aClass348_Sub42_Sub14_6885)
			      .aString9625) + "_staticelements"))) {
		if (Class348_Sub32.indexLoader23.getArchiveExists
		    ((((Class348_Sub42_Sub14)
			    Class348_Sub26.aClass348_Sub42_Sub14_6885)
			   .aString9625) + "_staticelements"))
		    r_Sub2.aClass252_10488
			= Class307.method2300(Class348_Sub32.indexLoader23,
					      ((((Class348_Sub42_Sub14)
						 (Class348_Sub26
						  .aClass348_Sub42_Sub14_6885))
						.aString9625)
					       + "_staticelements"),
					      Class130.aBoolean1900,
					      (byte) -91);
		else {
		    bool = false;
		    Class268.anInt3441++;
		}
	    } else
		r_Sub2.aClass252_10488 = new Class252(0);
	}
	if (!bool)
	    Class36.anInt489 = 1;
	else {
	    bool = true;
	    Class154.anInt2101 = 0;
	    for (int i_20_ = 0; i_20_ < Class347.aByteArrayArray4281.length;
		 i_20_++) {
		byte[] is = Class14_Sub4.aByteArrayArray8642[i_20_];
		if (is != null) {
		    int i_21_ = 64 * (Class348_Sub23_Sub3.anIntArray9042[i_20_]
				      >> 766963688) - za_Sub2.anInt9780;
		    int i_22_ = 64 * (Class348_Sub23_Sub3.anIntArray9042[i_20_]
				      & 0xff) - Class90.anInt1517;
		    if ((Class312.anInt3931 ^ 0xffffffff) != -1) {
			i_22_ = 10;
			i_21_ = 10;
		    }
		    bool &= Class348_Sub41.method3154(Class367_Sub4.anInt7319,
						      i_21_,
						      (Class348_Sub40_Sub3
						       .anInt9109),
						      i_22_, is, (byte) 39);
		}
		is = Class348_Sub23_Sub1.aByteArrayArray8996[i_20_];
		if (is != null) {
		    int i_23_ = 64 * (Class348_Sub23_Sub3.anIntArray9042[i_20_]
				      >> -686311832) - za_Sub2.anInt9780;
		    int i_24_ = 64 * (Class348_Sub23_Sub3.anIntArray9042[i_20_]
				      & 0xff) + -Class90.anInt1517;
		    if (Class312.anInt3931 != 0) {
			i_24_ = 10;
			i_23_ = 10;
		    }
		    bool &= Class348_Sub41.method3154(Class367_Sub4.anInt7319,
						      i_23_,
						      (Class348_Sub40_Sub3
						       .anInt9109),
						      i_24_, is, (byte) 39);
		}
	    }
	    if (!bool)
		Class36.anInt489 = 2;
	    else {
		if ((Class36.anInt489 ^ 0xffffffff) != -1)
		    Class362.method3511(true, GameApplet.p12fullFontRasterizer,
					Class246.p12fullBitmapFont,
					((GameText.loadingPleaseWaitGameText.getLanguageText
					  (Class348_Sub33.gameLanguage))
					 + "<br>(100%)"),
					2, Class348_Sub8.currentToolkit);
		Class369_Sub1.method3570(false);
		Class348_Sub18.method2938((byte) 102);
		Class239_Sub12.method1772(i ^ 0x41);
		boolean bool_25_ = false;
		if (Class348_Sub8.currentToolkit.method3639()
		    && (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			    .aClass239_Sub18_7259.method1800(-32350)
			^ 0xffffffff) == -3) {
		    for (int i_26_ = 0;
			 ((Class347.aByteArrayArray4281.length ^ 0xffffffff)
			  < (i_26_ ^ 0xffffffff));
			 i_26_++) {
			if ((Class348_Sub23_Sub1.aByteArrayArray8996[i_26_]
			     != null)
			    || Class129.aByteArrayArray1887[i_26_] != null) {
			    bool_25_ = true;
			    break;
			}
		    }
		}
		int i_27_;
		if (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			.aClass239_Sub16_7247.method1789(-32350)
		    != 1)
		    i_27_ = Class9.anIntArray168[Class348_Sub15.anInt6769];
		else
		    i_27_ = (Class286_Sub8.anIntArray6296
			     [Class348_Sub15.anInt6769]);
		if (Class348_Sub8.currentToolkit.method3670())
		    i_27_++;
		Class348_Sub42_Sub2.method3171
		    (Class348_Sub8.currentToolkit, Class239_Sub16.renderCores, 9, 4,
		     Class367_Sub4.anInt7319, Class348_Sub40_Sub3.anInt9109,
		     i_27_, bool_25_,
		     (Class348_Sub8.currentToolkit.method3704() ^ 0xffffffff) < -1);
		Class348_Sub32.method3018(Class318_Sub1_Sub4_Sub2.anInt10096);
		if ((Class318_Sub1_Sub4_Sub2.anInt10096 ^ 0xffffffff) != -1)
		    Class348_Sub48.method3328(Class240.p11fullFontRasterizer);
		else
		    Class348_Sub48.method3328(null);
		for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > -5; i_28_++)
		    MouseEventNode.aClass361Array7108[i_28_]
			.method3500(i ^ 0x2bc);
		ColorNode.method491((byte) -86);
		Class101_Sub2.method921((byte) 99, false);
		NativeToolkit.method3936(i + i);
		IntegerVarScriptSettingLoader.aClass305_3304 = null;
		Class55_Sub1.aBoolean5265 = false;
		Class369_Sub1.method3570(false);
		System.gc();
		Class289.method2193(true, (byte) -128);
		Class36.method354(2);
		IndexTable.anInt3720
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub7_7238.method1748(-32350);
		Huffman.aBoolean3767 = Class226.anInt2964 >= 96;
		Class369.aBoolean4972
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub18_7259.method1800(-32350) == 2;
		Class186.aBoolean2492
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub28_7230.method1845(i + -32350) == 1;
		DummyOutputstream.anInt101
		    = (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			   .aClass239_Sub27_7261.method1840(-32350)
		       ^ 0xffffffff) == -2 ? -1 : Class167.anInt2204;
		IOException_Sub1.aBoolean86
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub9_7256.method1759(-32350) == 1;
		Class47.aBoolean845
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub24_7235.method1820(i ^ ~0x7e5d) == 1;
		Class338.aClass237_Sub1_4197
		    = new Class237_Sub1(4, Class367_Sub4.anInt7319,
					Class348_Sub40_Sub3.anInt9109, false);
		if (Class312.anInt3931 != 0)
		    Class44.method385(false, Class338.aClass237_Sub1_4197,
				      Class347.aByteArrayArray4281);
		else
		    Class348_Sub1_Sub1.method2727((byte) -65,
						  Class338.aClass237_Sub1_4197,
						  (Class347
						   .aByteArrayArray4281));
		Class108.method1015(Class367_Sub4.anInt7319 >> -364570972,
				    (Class348_Sub40_Sub3.anInt9109
				     >> -1707431740),
				    true);
		Class348_Sub42_Sub3.method3175((byte) -77);
		if (bool_25_) {
		    Class243.method1879(true);
		    VarbitHandler.aClass237_Sub1_5067
			= new Class237_Sub1(1, Class367_Sub4.anInt7319,
					    Class348_Sub40_Sub3.anInt9109,
					    true);
		    if (Class312.anInt3931 == 0) {
			Class348_Sub1_Sub1.method2727((byte) -44,
						      (VarbitHandler
						       .aClass237_Sub1_5067),
						      (Class129
						       .aByteArrayArray1887));
			Class289.method2193(true, (byte) -119);
		    } else {
			Class44.method385(false, VarbitHandler.aClass237_Sub1_5067,
					  Class129.aByteArrayArray1887);
			Class289.method2193(true, (byte) -125);
		    }
		    VarbitHandler.aClass237_Sub1_5067.method1679
			(0, 0, (((Class237) Class338.aClass237_Sub1_4197)
				.anIntArrayArrayArray3122[0]));
		    VarbitHandler.aClass237_Sub1_5067
			.method1685(Class348_Sub8.currentToolkit, null, 21407, null);
		    Class243.method1879(false);
		}
		Class338.aClass237_Sub1_4197.method1685
		    (Class348_Sub8.currentToolkit,
		     (!bool_25_ ? null
		      : (((Class237) VarbitHandler.aClass237_Sub1_5067)
			 .anIntArrayArrayArray3122)),
		     21407, MouseEventNode.aClass361Array7108);
		if (Class312.anInt3931 == 0) {
		    Class289.method2193(true, (byte) -128);
		    Class122.method1090(Class14_Sub4.aByteArrayArray8642,
					i + 65536,
					Class338.aClass237_Sub1_4197);
		    if (StringNode.aByteArrayArray7212 != null)
			Class92.method859(i ^ ~0x7e);
		} else {
		    Class289.method2193(true, (byte) -121);
		    Class101_Sub3.method944(i + -8212,
					    Class14_Sub4.aByteArrayArray8642,
					    Class338.aClass237_Sub1_4197);
		}
		Class348_Sub18.method2938((byte) 66);
		if (Class226.anInt2964 < 96)
		    Class299_Sub2_Sub1.method2271(31268);
		Class289.method2193(true, (byte) -119);
		Class338.aClass237_Sub1_4197.method1680(null, (byte) -125,
							(!bool_25_ ? null
							 : (Class332
							    .aSArray4142[0])),
							Class348_Sub8.currentToolkit);
		Class338.aClass237_Sub1_4197
		    .method1697(false, Class348_Sub8.currentToolkit, -36);
		Class289.method2193(true, (byte) -122);
		if (bool_25_) {
		    Class243.method1879(true);
		    Class289.method2193(true, (byte) -124);
		    if (Class312.anInt3931 != 0)
			Class101_Sub3.method944(-8212,
						(Class348_Sub23_Sub1
						 .aByteArrayArray8996),
						VarbitHandler.aClass237_Sub1_5067);
		    else
			Class122.method1090((Class348_Sub23_Sub1
					     .aByteArrayArray8996),
					    i + 65536,
					    VarbitHandler.aClass237_Sub1_5067);
		    Class348_Sub18.method2938((byte) 73);
		    Class289.method2193(true, (byte) -121);
		    VarbitHandler.aClass237_Sub1_5067.method1680((Class348_Sub1_Sub1
							     .aSArray8801[0]),
							    (byte) -127, null,
							    (Class348_Sub8
							     .currentToolkit));
		    VarbitHandler.aClass237_Sub1_5067
			.method1697(true, Class348_Sub8.currentToolkit, i + -60);
		    Class289.method2193(true, (byte) -126);
		    Class243.method1879(false);
		}
		StringNode.method3419(13022);
		int i_29_
		    = ((Class237_Sub1) Class338.aClass237_Sub1_4197).anInt5824;
		if ((Class355.anInt4372 ^ 0xffffffff) > (i_29_ ^ 0xffffffff))
		    i_29_ = Class355.anInt4372;
		if ((-1 + Class355.anInt4372 ^ 0xffffffff)
		    < (i_29_ ^ 0xffffffff))
		    i_29_ = Class355.anInt4372 - 1;
		if ((((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			 .aClass239_Sub27_7261.method1840(-32350)
		     ^ 0xffffffff)
		    == -1)
		    Class84.method824(i_29_);
		else
		    Class84.method824(0);
		for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > -5; i_30_++) {
		    for (int i_31_ = 0; Class367_Sub4.anInt7319 > i_31_;
			 i_31_++) {
			for (int i_32_ = 0;
			     Class348_Sub40_Sub3.anInt9109 > i_32_; i_32_++)
			    Class203.method1479(i_32_, (byte) -126, i_31_,
						i_30_);
		    }
		}
		Class348_Sub40_Sub9.method3072((byte) -99);
		Class369_Sub1.method3570(false);
		Class363.method3514((byte) -105);
		Class348_Sub18.method2938((byte) 62);
		Class130_Sub1.method1131(99);
		if (ColorNode.aFrame4904 != null
		    && Class348_Sub40_Sub8.gameConnection != null
		    && Class240.anInt4674 == 11) {
		    GameFont.anInt4335++;
		    BufferedPacket class348_sub47
			= Class286_Sub3.createBufferedPacket(Class327.aClass351_4094,
						   (Class348_Sub23_Sub2
						    .outgoingGameIsaac));
		    ((BufferedPacket) class348_sub47)
			.buffer
			.putInt(1057001181);
		    Class348_Sub42_Sub14.putBufferedPacket(-122, class348_sub47);
		}
		if ((Class312.anInt3931 ^ 0xffffffff) == -1) {
		    int i_33_ = ((AbstractToolkit.anInt4581
				  + -(Class367_Sub4.anInt7319 >> -1412642876))
				 / 8);
		    int i_34_ = ((AbstractToolkit.anInt4581
				  - -(Class367_Sub4.anInt7319 >> 779819780))
				 / 8);
		    int i_35_
			= ((Class327.anInt4095
			    + -(Class348_Sub40_Sub3.anInt9109 >> -667376572))
			   / 8);
		    int i_36_ = (((Class348_Sub40_Sub3.anInt9109 >> 831940228)
				  + Class327.anInt4095)
				 / 8);
		    for (int i_37_ = i_33_ - 1;
			 (i_34_ - -1 ^ 0xffffffff) <= (i_37_ ^ 0xffffffff);
			 i_37_++) {
			for (int i_38_ = i_35_ + -1;
			     (i_36_ - -1 ^ 0xffffffff) <= (i_38_ ^ 0xffffffff);
			     i_38_++) {
			    if (i_33_ > i_37_ || i_34_ < i_37_ || i_38_ < i_35_
				|| (i_36_ ^ 0xffffffff) > (i_38_
							   ^ 0xffffffff)) {
				Class367_Sub10.indexLoader5.method409
				    ("m" + i_37_ + "_" + i_38_, true);
				Class367_Sub10.indexLoader5.method409
				    ("l" + i_37_ + "_" + i_38_, true);
			    }
			}
		    }
		}
		if ((Class240.anInt4674 ^ 0xffffffff) != -5) {
		    if (Class240.anInt4674 != 8) {
			ByteBuffer.setClientState(2, 10);
			if (Class348_Sub40_Sub8.gameConnection != null) {
			    BufferedPacket class348_sub47
				= Class286_Sub3.createBufferedPacket((ArchiveFetcher
							    .aClass351_4223),
							   (Class348_Sub23_Sub2
							    .outgoingGameIsaac));
			    Class348_Sub42_Sub14.putBufferedPacket(127,
							    class348_sub47);
			}
		    } else
			ByteBuffer.setClientState(2, 7);
		} else
		    ByteBuffer.setClientState(i ^ 0x2, 3);
		Class348_Sub1.method2718(-106);
		Class369_Sub1.method3570(false);
		Class94.method867(true);
		Class348_Sub16_Sub2.aBoolean8870 = true;
		if (Class258_Sub4.aBoolean8558) {
		    GameApplet.addConsoleMessage(("Took: "
					  + (Class62.getCurrentTimeMillis()
					     + -Class90.aLong1516)
					  + "ms"));
		    Class258_Sub4.aBoolean8558 = false;
		}
	    }
	}
    }
    
    Canvas_Sub1(Component component) {
	aComponent64 = component;
    }
    
    static {
	anIntArray60 = new int[8];
    }
}
