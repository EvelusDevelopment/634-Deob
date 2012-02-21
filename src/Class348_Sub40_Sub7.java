/* Class348_Sub40_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub7 extends Class348_Sub40
{
    private boolean aBoolean9140 = true;
    static int anInt9141;
    static int anInt9142;
    static int anInt9143;
    static Class348_Sub42_Sub12 aClass348_Sub42_Sub12_9144;
    static int anInt9145;
    static int anInt9146;
    private boolean aBoolean9147 = true;
    
    final int[][] method3047(int i, int i_0_) {
	anInt9141++;
	int[][] is
	    = ((Class348_Sub40) this).aClass322_7033.method2557(-119, i);
	if (((Class322) ((Class348_Sub40) this).aClass322_7033).aBoolean4035) {
	    int[][] is_1_
		= this.method3039((byte) 120,
				  (aBoolean9147 ? -i + Class299_Sub2.anInt6325
				   : i),
				  0);
	    int[] is_2_ = is_1_[0];
	    int[] is_3_ = is_1_[1];
	    int[] is_4_ = is_1_[2];
	    int[] is_5_ = is[0];
	    int[] is_6_ = is[1];
	    int[] is_7_ = is[2];
	    if (aBoolean9140) {
		for (int i_8_ = 0; i_8_ < Class348_Sub40_Sub6.anInt9139;
		     i_8_++) {
		    is_5_[i_8_] = is_2_[Class239_Sub22.anInt6076 + -i_8_];
		    is_6_[i_8_] = is_3_[Class239_Sub22.anInt6076 - i_8_];
		    is_7_[i_8_] = is_4_[-i_8_ + Class239_Sub22.anInt6076];
		}
	    } else {
		for (int i_9_ = 0;
		     ((Class348_Sub40_Sub6.anInt9139 ^ 0xffffffff)
		      < (i_9_ ^ 0xffffffff));
		     i_9_++) {
		    is_5_[i_9_] = is_2_[i_9_];
		    is_6_[i_9_] = is_3_[i_9_];
		    is_7_[i_9_] = is_4_[i_9_];
		}
	    }
	}
	if (i_0_ != -1564599039)
	    method3065(-40, true, 93);
	return is;
    }
    
    static final void method3064(int i, int i_10_, boolean bool, int i_11_,
				 int i_12_, int i_13_, int i_14_,
				 boolean bool_15_, Widget[] class46s,
				 int i_16_, int i_17_) {
	try {
	    Class348_Sub8.currentToolkit.setDimensions(i, i_12_, i_14_, i_17_);
	    if (bool_15_ == false) {
		anInt9145++;
		int i_18_ = 0;
		for (/**/; class46s.length > i_18_; i_18_++) {
		    Widget widget = class46s[i_18_];
		    if (widget != null
			&& (((Widget) widget).anInt834 == i_16_
			    || ((i_16_ ^ 0xffffffff) == 1412584498
				&& Class289.aClass46_3701 == widget))) {
			int i_19_ = i_11_ + ((Widget) widget).anInt800;
			int i_20_ = ((Widget) widget).anInt750 + i_10_;
			int i_21_ = 1 + (((Widget) widget).anInt709 + i_19_);
			int i_22_ = ((Widget) widget).anInt789 + i_20_ - -1;
			int i_23_;
			if ((i_13_ ^ 0xffffffff) == 0) {
			    Class180.aRectangleArray2371
				[Class348_Sub38.anInt7008].setBounds
				(i_11_ + ((Widget) widget).anInt800,
				 i_10_ + ((Widget) widget).anInt750,
				 ((Widget) widget).anInt709,
				 ((Widget) widget).anInt789);
			    i_23_ = Class348_Sub38.anInt7008++;
			} else
			    i_23_ = i_13_;
			((Widget) widget).anInt794
			    = Class367_Sub11.logicCycle;
			((Widget) widget).anInt760 = i_23_;
			if (!Main.method111(widget)) {
			    if (((Widget) widget).anInt765 != 0)
				Class348_Sub18.method2942(widget, (byte) -36);
			    int i_24_ = ((Widget) widget).anInt800 - -i_11_;
			    int i_25_ = ((Widget) widget).anInt750 + i_10_;
			    int i_26_ = 0;
			    int i_27_ = 0;
			    if (Class59_Sub1.aBoolean5300) {
				i_26_ = s_Sub3.method4008((byte) -124);
				i_27_ = Class16.method260(bool_15_);
			    }
			    int alpha = ((Widget) widget).anInt696;
			    if (Class299_Sub2.aBoolean6327
				&& (((Class348_Sub44)
				     Main.method105(widget)).anInt7098 != 0
				    || (((Widget) widget).type
					^ 0xffffffff) == -1)
				&& (alpha ^ 0xffffffff) < -128)
				alpha = 127;
			    if (widget == Class289.aClass46_3701) {
				if ((i_16_ ^ 0xffffffff) != 1412584498
				    && ((Class312.anInt3930
					 == ((Widget) widget).anInt797)
					|| (DummyInputstream2.anInt78
					    == (((Widget) widget)
						.anInt797)))) {
				    EntryElementLoader.anInt4792 = i_10_;
				    Class348_Sub1.anInt6555 = i_11_;
				    Class138.aClass46Array1942 = class46s;
				    continue;
				}
				if (Class300.aBoolean3819
				    && Class127_Sub1.aBoolean8386) {
				    int i_29_ = (Class258_Sub4
						     .mouseMovementListener
						     .method3597(true)
						 - -i_26_);
				    int i_30_ = (Class258_Sub4
						     .mouseMovementListener
						     .method3594((byte) 101)
						 + i_27_);
				    i_29_ -= Class318_Sub4.anInt6411;
				    i_30_ -= Class219.anInt2872;
				    if (Class348_Sub40_Sub37.anInt9461 > i_29_)
					i_29_ = Class348_Sub40_Sub37.anInt9461;
				    if (i_30_ < Class40.anInt558)
					i_30_ = Class40.anInt558;
				    if (((Widget) widget).anInt709 + i_29_
					> ((((Widget) Class331.aClass46_4130)
					    .anInt709)
					   + Class348_Sub40_Sub37.anInt9461))
					i_29_ = (-((Widget) widget).anInt709
						 + ((Class348_Sub40_Sub37
						     .anInt9461)
						    + (((Widget)
							Class331.aClass46_4130)
						       .anInt709)));
				    if (i_30_ + ((Widget) widget).anInt789
					> (((Widget) Class331.aClass46_4130)
					   .anInt789) + Class40.anInt558)
					i_30_
					    = (-((Widget) widget).anInt789
					       + (Class40.anInt558
						  - -(((Widget)
						       Class331.aClass46_4130)
						      .anInt789)));
				    i_24_ = i_29_;
				    i_25_ = i_30_;
				}
				if ((DummyInputstream2.anInt78 ^ 0xffffffff)
				    == (((Widget) widget).anInt797
					^ 0xffffffff))
				    alpha = 128;
			    }
			    int i_31_;
			    int i_32_;
			    int i_33_;
			    int i_34_;
			    if ((((Widget) widget).type ^ 0xffffffff)
				!= -3) {
				int i_35_
				    = i_24_ - -((Widget) widget).anInt709;
				int i_36_
				    = i_25_ + ((Widget) widget).anInt789;
				if ((((Widget) widget).type ^ 0xffffffff)
				    == -10) {
				    i_36_++;
				    i_35_++;
				}
				i_31_ = i < i_24_ ? i_24_ : i;
				i_32_ = ((i_25_ ^ 0xffffffff) >= (i_12_
								  ^ 0xffffffff)
					 ? i_12_ : i_25_);
				i_34_ = i_14_ <= i_35_ ? i_14_ : i_35_;
				i_33_ = ((i_36_ ^ 0xffffffff) > (i_17_
								 ^ 0xffffffff)
					 ? i_36_ : i_17_);
			    } else {
				i_31_ = i;
				i_32_ = i_12_;
				i_33_ = i_17_;
				i_34_ = i_14_;
			    }
			    if (i_31_ < i_34_ && i_32_ < i_33_) {
				if ((((Widget) widget).anInt765 ^ 0xffffffff)
				    != -1) {
				    if (((((Widget) widget).anInt765
					  ^ 0xffffffff)
					 == (Class239_Sub10.anInt5943
					     ^ 0xffffffff))
					|| ((Class312.anInt3932 ^ 0xffffffff)
					    == (((Widget) widget).anInt765
						^ 0xffffffff))) {
					Class5_Sub2.method198(widget, false,
							      i_25_, i_24_);
					if (!Class59_Sub1.aBoolean5300) {
					    OutputStream_Sub1.method132
						(124,
						 (Class312.anInt3932
						  == (((Widget) widget)
						      .anInt765)),
						 ((Widget) widget).anInt709,
						 i_24_,
						 ((Widget) widget).anInt789,
						 i_25_);
					    Class348_Sub8.currentToolkit
						.setDimensions(i, i_12_, i_14_, i_17_);
					}
					Class152.aBooleanArray2076[i_23_]
					    = true;
					continue;
				    }
				    if ((Class290.anInt3717 ^ 0xffffffff)
					== (((Widget) widget).anInt765
					    ^ 0xffffffff)) {
					if (widget.method425((Class348_Sub8
							       .currentToolkit),
							      (byte) 8)
					    != null) {
					    Class369_Sub1.method3570(false);
					    Queue.method1007(widget,
								(Class348_Sub8
								 .currentToolkit),
								i_24_, i_25_,
								22960);
					    Class268.aBooleanArray3438[i_23_]
						= true;
					    Class348_Sub8.currentToolkit
						.setDimensions(i, i_12_, i_14_, i_17_);
					    if (Class59_Sub1.aBoolean5300) {
						if (bool)
						    Class338.method2663(-5590,
									i_19_,
									i_21_,
									i_20_,
									i_22_);
						else
						    Class54.method503
							(i_22_, i_19_,
							 (byte) -74, i_21_,
							 i_20_);
					    }
					}
					continue;
				    }
				    if ((Class239_Sub11.anInt5951 ^ 0xffffffff)
					== (((Widget) widget).anInt765
					    ^ 0xffffffff)) {
					if (widget.method425((Class348_Sub8
							       .currentToolkit),
							      (byte) 26)
					    != null) {
					    Class18.method271(i_25_, widget,
							      (byte) -98,
							      i_24_);
					    Class268.aBooleanArray3438[i_23_]
						= true;
					    Class348_Sub8.currentToolkit
						.setDimensions(i, i_12_, i_14_, i_17_);
					    if (Class59_Sub1.aBoolean5300) {
						if (!bool)
						    Class54.method503
							(i_22_, i_19_,
							 (byte) -74, i_21_,
							 i_20_);
						else
						    Class338.method2663(-5590,
									i_19_,
									i_21_,
									i_20_,
									i_22_);
					    }
					}
					continue;
				    }
				    if ((MouseEventNode.anInt7102 ^ 0xffffffff)
					== (((Widget) widget).anInt765
					    ^ 0xffffffff)) {
					Class318_Sub1_Sub3_Sub4.method2464
					    ((byte) -7, i_24_,
					     ((Widget) widget).anInt709,
					     ((Widget) widget).anInt789,
					     Class348_Sub8.currentToolkit, i_25_,
					     Class348_Sub40_Sub4.textureLoader);
					Class152.aBooleanArray2076[i_23_]
					    = true;
					Class348_Sub8.currentToolkit.setDimensions(i, i_12_,
								 i_14_, i_17_);
					continue;
				    }
				    if (Class218.anInt2861
					== ((Widget) widget).anInt765) {
					Class361.method3498
					    (((Widget) widget).anInt789,
					     Class348_Sub8.currentToolkit, i_24_,
					     ((Widget) widget).anInt709,
					     true, i_25_);
					Class152.aBooleanArray2076[i_23_]
					    = true;
					Class348_Sub8.currentToolkit.setDimensions(i, i_12_,
								 i_14_, i_17_);
					continue;
				    }
				    if ((((Widget) widget).anInt765
					 ^ 0xffffffff)
					== (EntryElementLoader.anInt4793 ^ 0xffffffff)) {
					if (Class298.aBoolean3811
					    || Class188.doRenderProfile) {
					    int i_37_
						= (((Widget) widget).anInt709
						   + i_24_);
					    int i_38_ = 15 + i_25_;
					    if (Class59_Sub1.aBoolean5300) {
						if (!bool)
						    Class54.method503
							(i_22_, i_19_,
							 (byte) -74, i_21_,
							 i_20_);
						else
						    Class338.method2663(-5590,
									i_19_,
									i_21_,
									i_20_,
									i_22_);
					    }
					    if (Class298.aBoolean3811) {
						int i_39_ = -256;
						if ((Class239_Sub5.anInt5891
						     ^ 0xffffffff)
						    > -21)
						    i_39_ = -65536;
						GameApplet.p12fullFontRasterizer
						    .drawString0
						    ("Fps:" + (Class239_Sub5
							       .anInt5891),
						     i_38_, i_39_, i_37_, -128,
						     -1);
						i_38_ += 15;
						Runtime runtime
						    = Runtime.getRuntime();
						int i_40_
						    = (int) (((runtime
								   .totalMemory
							       ())
							      + -(runtime
								      .freeMemory
								  ()))
							     / 1024L);
						int i_41_ = -256;
						if (i_40_ > 98304) {
						    i_41_ = -65536;
						    if (ConnectionMode
							.aBoolean2151) {
							Widget.method427(-35);
							for (int i_42_ = 0;
							     i_42_ < 10;
							     i_42_++)
							    System.gc();
							i_40_
							    = (int) (((runtime
									   .totalMemory
								       ())
								      - (runtime
									     .freeMemory
									 ()))
								     / 1024L);
							if (i_40_ > 65536)
							    Class59.method544
								("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.",
								 false, 4);
						    }
						}
						GameApplet.p12fullFontRasterizer
						    .drawString0
						    ("Mem:" + i_40_ + "k",
						     i_38_, i_41_, i_37_, -124,
						     -1);
						i_38_ += 15;
						GameApplet.p12fullFontRasterizer
						    .drawString0
						    (("In:"
						      + Class264.anInt3372
						      + "B/s Out:"
						      + (Class348_Sub48
							 .anInt7134)
						      + "B/s"),
						     i_38_, -256, i_37_, -127,
						     -1);
						i_38_ += 15;
						int i_43_ = (Class348_Sub8
								 .currentToolkit.E()
							     / 1024);
						GameApplet.p12fullFontRasterizer
						    .drawString0
						    ("Offheap:" + i_43_ + "k",
						     i_38_,
						     (i_43_ <= 65536 ? -256
						      : -65536),
						     i_37_, -125, -1);
						i_38_ += 15;
						int i_44_ = 0;
						int i_45_ = 0;
						int i_46_ = 0;
						for (int i_47_ = 0;
						     ((i_47_ ^ 0xffffffff)
						      > -38);
						     i_47_++) {
						    if ((Class13
							 .indexLoaders
							 [i_47_])
							!= null) {
							i_44_
							    += (Class13
								    .indexLoaders
								    [i_47_]
								    .method2345
								(0));
							i_45_
							    += (Class13
								    .indexLoaders
								    [i_47_]
								    .method2351
								(0));
							i_46_
							    += (Class13
								    .indexLoaders
								    [i_47_]
								    .getAmountEntries
								(24940));
						    }
						}
						int i_48_
						    = i_46_ * 100 / i_44_;
						int i_49_
						    = 10000 * i_45_ / i_44_;
						String string
						    = ("Cache:"
						       + (Class357.method3486
							  (2, true, 0,
							   (long) i_49_,
							   16980))
						       + "% (" + i_48_ + "%)");
						Class240.p11fullFontRasterizer
						    .drawString0
						    (string, i_38_, -256,
						     i_37_, -127, -1);
						i_38_ += 12;
					    }
					    if ((Class313.totalParticals
						 ^ 0xffffffff)
						< -1)
						Class240.p11fullFontRasterizer
						    .drawString0
						    (("Particles: "
						      + (Class318_Sub1_Sub5
							 .currentParticles)
						      + " / "
						      + Class313.totalParticals),
						     i_38_, -256, i_37_, -121,
						     -1);
					    i_38_ += 12;
					    if (Class188.doRenderProfile) {
						Class240.p11fullFontRasterizer
						    .drawString0
						    (("Polys: "
						      + Class348_Sub8
							    .currentToolkit.getAmountPolygons()
						      + " Models: "
						      + Class348_Sub8
							    .currentToolkit.getAmountModels()),
						     i_38_, -256, i_37_, -127,
						     -1);
						i_38_ += 12;
						Class240.p11fullFontRasterizer
						    .drawString0
						    (("Ls: "
						      + Class177.anInt4666
						      + " La: "
						      + Class86.anInt1482
						      + " NPC: "
						      + Class227.anInt2968
						      + " Pl: "
						      + za_Sub1.anInt9776),
						     i_38_, -256, i_37_, -122,
						     -1);
						LobbyWorld
						    .method1042((byte) -123);
						i_38_ += 12;
					    }
					    Class152.aBooleanArray2076[i_23_]
						= true;
					}
					continue;
				    }
				}
				if ((((Widget) widget).type ^ 0xffffffff)
				    == -1) {
				    if (((Class372.anInt4532 ^ 0xffffffff)
					 == (((Widget) widget).anInt765
					     ^ 0xffffffff))
					&& Class348_Sub8.currentToolkit.isBloomSupported())
					Class348_Sub8.currentToolkit.method3658
					    (i_24_, i_25_,
					     ((Widget) widget).anInt709,
					     ((Widget) widget).anInt789);
				    method3064
					(i_31_,
					 -((Widget) widget).anInt755 + i_25_,
					 bool,
					 i_24_ - ((Widget) widget).anInt747,
					 i_32_, i_23_, i_34_, false, class46s,
					 ((Widget) widget).anInt830, i_33_);
				    if (((Widget) widget).children
					!= null)
					method3064(i_31_,
						   -(((Widget) widget)
						     .anInt755) + i_25_,
						   bool,
						   i_24_ - (((Widget) widget)
							    .anInt747),
						   i_32_, i_23_, i_34_, false,
						   (((Widget) widget)
						    .children),
						   (((Widget) widget)
						    .anInt830),
						   i_33_);
				    Class348_Sub41 class348_sub41
					= ((Class348_Sub41)
					   (Class125.aClass356_4915.get
					    ((long) (((Widget) widget)
						     .anInt830))));
				    if (class348_sub41 != null)
					Class159.method1252(i_25_,
							    (((Class348_Sub41)
							      class348_sub41)
							     .anInt7050),
							    i_32_, i_23_,
							    i_24_, i_34_,
							    i_33_, (byte) 60,
							    i_31_);
				    if (((Class372.anInt4532 ^ 0xffffffff)
					 == (((Widget) widget).anInt765
					     ^ 0xffffffff))
					&& Class348_Sub8.currentToolkit.isBloomSupported())
					Class348_Sub8.currentToolkit.method3698();
				    Class348_Sub8.currentToolkit.setDimensions(i, i_12_, i_14_,
							     i_17_);
				}
				if (Class175.aBooleanArray2326[i_23_]
				    || (NativeToolkit.anInt8045 ^ 0xffffffff) < -2) {
				    if (((Widget) widget).type == 3) {
					if (alpha == 0) {
					    if (((Widget) widget)
						.aBoolean810)
						Class348_Sub8.currentToolkit.drawQuad
						    (i_24_, i_25_,
						     (((Widget) widget)
						      .anInt709),
						     (((Widget) widget)
						      .anInt789),
						     (((Widget) widget)
						      .textColor),
						     0);
					    else
						Class348_Sub8.currentToolkit
						    .method3628
						    (i_24_, i_25_,
						     (((Widget) widget)
						      .anInt709),
						     (((Widget) widget)
						      .anInt789),
						     (((Widget) widget)
						      .textColor),
						     0);
					} else if (!((Widget) widget)
						    .aBoolean810)
					    Class348_Sub8.currentToolkit.method3628
						(i_24_, i_25_,
						 ((Widget) widget).anInt709,
						 ((Widget) widget).anInt789,
						 (0xffffff & ((Widget)
							      widget).textColor
						  | (-(alpha & 0xff) + 255
						     << 245198520)),
						 1);
					else
					    Class348_Sub8.currentToolkit.drawQuad
						(i_24_, i_25_,
						 ((Widget) widget).anInt709,
						 ((Widget) widget).anInt789,
						 (0xffffff & ((Widget)
							      widget).textColor
						  | (-(0xff & alpha) + 255
						     << 1773948952)),
						 1);
					if (Class59_Sub1.aBoolean5300) {
					    if (bool)
						Class338.method2663(-5590,
								    i_19_,
								    i_21_,
								    i_20_,
								    i_22_);
					    else
						Class54.method503(i_22_, i_19_,
								  (byte) -74,
								  i_21_,
								  i_20_);
					}
				    } else if ((((Widget) widget).type
						^ 0xffffffff)
					       == -5) {
					AbstractFontRasterizer raster = widget.createWidgetFontRasterizer((Class348_Sub8.currentToolkit));
					if (raster == null) {
					    if (Class348_Sub42_Sub13
						.aBoolean9616)
						Class251.method1916(-9343,
								    widget);
					} else {
					    int textColor
						= ((Widget) widget).textColor;
					    String text
						= (((Widget) widget)
						   .text);
					    if (((Widget) widget).itemId != -1) {
						ItemDefinition class213 = (ToolkitException.itemLoader.getItemDefinition(-67,(((Widget) widget).itemId)));
						text = (((ItemDefinition) class213).aString2795);
						if (text == null)
						    text = "null";
						if (((((ItemDefinition) class213)
						      .anInt2820) == 1
						     || ((((Widget) widget)
							  .anInt781)
							 ^ 0xffffffff) != -2)
						    && ((((Widget) widget)
							 .anInt781)
							^ 0xffffffff) != 0)
						    text
							= ("<col=ff9040>"
							   + text
							   + "</col> x"
							   + (Class37.method356
							      (-127,
							       (((Widget)
								 widget)
								.anInt781))));
					    }
					    if (((Widget) widget).anInt806
						!= -1) {
						text
						    = (Class286_Sub4.method2157
						       ((((Widget) widget)
							 .anInt806),
							-1431655765));
						if (text == null)
						    text = "";
					    }
					    if (BufferedRasterizer.aClass46_4730 == widget) {
						text = (GameText.pleaseWaitGameText.getLanguageText((Class348_Sub33.gameLanguage)));
						textColor = (((Widget) widget).textColor);
					    }
					    if (Class318_Sub1_Sub3_Sub2
						.aBoolean10046)
						Class348_Sub8.currentToolkit.clipDimensions
						    (i_24_, i_25_,
						     (((Widget) widget)
						      .anInt709) + i_24_,
						     (((Widget) widget)
						      .anInt789) + i_25_);
					    raster.method2568(null,((Widget) widget).anInt789, (byte) -77, null, 0, Class113.rasterToolkits, (-(alpha & 0xff) + 255 << 24) | textColor,
						 i_25_,
						 ((Widget) widget).anInt709,
						 ((Widget) widget).anInt700,
						 text, 0, i_24_,
						 ((Widget) widget).anInt762,
						 (!(((Widget) widget)
						    .aBoolean769)
						  ? -1
						  : (-(0xff & alpha) + 255
						     << 24)),
						 ((Widget) widget).anInt773,
						 ((Widget) widget).anInt673);
					    if (Class318_Sub1_Sub3_Sub2
						.aBoolean10046)
						Class348_Sub8.currentToolkit.setDimensions
						    (i, i_12_, i_14_, i_17_);
					    if ((text.trim().length()
						 ^ 0xffffffff)
						< -1) {
						if (Class318_Sub1_Sub3_Sub2
						    .aBoolean10046) {
						    if (Class59_Sub1
							.aBoolean5300) {
							if (!bool)
							    Class54.method503
								(i_22_, i_19_,
								 (byte) -74,
								 i_21_, i_20_);
							else
							    Class338.method2663
								(-5590, i_19_,
								 i_21_, i_20_,
								 i_22_);
						    }
						} else {
						    BitmapFont class143 = (Class135.createBitmapFont(-25411,(Class348_Sub8
							     .currentToolkit),
							    (((Widget)
							      widget)
							     .bitmapFontId)));
						    int i_51_
							= (class143.method1187
							   (text, bool_15_,
							    ((Widget)
							     widget).anInt709,
							    (Class113
							     .rasterToolkits)));
						    int i_52_
							= (class143.method1185
							   ((Class113
							     .rasterToolkits),
							    0,
							    ((Widget)
							     widget).anInt673,
							    ((Widget)
							     widget).anInt709,
							    text));
						    if (Class59_Sub1
							.aBoolean5300) {
							if (!bool)
							    Class54.method503
								(i_25_ + i_52_,
								 i_24_,
								 (byte) -74,
								 (i_24_
								  - -i_51_),
								 i_25_);
							else
							    Class338.method2663
								(-5590, i_24_,
								 i_51_ + i_24_,
								 i_25_,
								 (i_25_
								  + i_52_));
						    }
						}
					    }
					}
				    } else if ((((Widget) widget).type
						^ 0xffffffff)
					       == -6) {
					if (((Widget) widget).anInt705 >= 0)
					    widget.method444
						(bool_15_,
						 Class123.aClass25_1813,
						 Class30.aClass84_413)
						.method2293
						(0, Class348_Sub8.currentToolkit,
						 (byte) -35, i_24_,
						 ((Widget) widget).anInt709,
						 i_25_,
						 (((Widget) widget).anInt835
						  << -1331349661),
						 (((Widget) widget).anInt759
						  << 61800355),
						 0,
						 ((Widget) widget).anInt789);
					else {
					    RasterToolkit class105;
					    if (((Widget) widget).itemId
						!= -1) {
						Class154 class154
						    = ((((Widget) widget)
							.aBoolean720)
						       ? (((Player)
							   (Class132
							    .localPlayer))
							  .aClass154_10536)
						       : null);
						class105
						    = (ToolkitException
							   .itemLoader
							   .method1941
						       ((((Widget) widget)
							 .anInt672),
							(byte) -74,
							(((Widget) widget)
							 .itemId),
							(((Widget) widget)
							 .anInt781),
							(~0xffffff
							 | (((Widget) widget)
							    .anInt809)),
							(((Widget) widget)
							 .anInt678),
							Class348_Sub8.currentToolkit,
							class154));
					    } else if (((((Widget) widget)
							 .anInt806)
							^ 0xffffffff)
						       == 0)
						class105
						    = (widget.method443
						       (Class348_Sub8.currentToolkit,
							(byte) -57));
					    else
						class105
						    = (Class299_Sub1_Sub2
							   .method2263
						       (Class348_Sub8.currentToolkit,
							0,
							(((Widget) widget)
							 .anInt806)));
					    if (class105 == null) {
						if (Class348_Sub42_Sub13
						    .aBoolean9616)
						    Class251.method1916
							(-9343, widget);
					    } else {
						int i_53_
						    = class105.method966();
						int i_54_
						    = class105.method980();
						int i_55_
						    = ((-(alpha & 0xff) + 255
							<< 1570074200)
						       | (((((Widget) widget)
							    .textColor)
							   ^ 0xffffffff) != -1
							  ? (((Widget)
							      widget).textColor
							     & 0xffffff)
							  : 16777215));
						if (((Widget) widget)
						    .aBoolean697) {
						    Class348_Sub8.currentToolkit.clipDimensions
							(i_24_, i_25_,
							 i_24_ - -(((Widget)
								    widget)
								   .anInt709),
							 (((Widget) widget)
							  .anInt789) + i_25_);
						    if (((((Widget) widget)
							  .anInt828)
							 ^ 0xffffffff)
							!= -1) {
							int i_56_
							    = ((i_53_ - 1
								+ (((Widget)
								    widget)
								   .anInt709))
							       / i_53_);
							int i_57_
							    = ((i_54_ - 1
								+ (((Widget)
								    widget)
								   .anInt789))
							       / i_54_);
							for (int i_58_ = 0;
							     i_58_ < i_56_;
							     i_58_++) {
							    for (int i_59_ = 0;
								 i_59_ < i_57_;
								 i_59_++) {
								if ((((Widget)
								      widget)
								     .textColor)
								    == 0)
								    class105
									.method981
									((((float) i_53_
									   / 2.0F)
									  + (float) (i_24_ - -(i_53_ * i_58_))),
									 (((float) i_54_
									   / 2.0F)
									  + (float) (i_59_ * i_54_ + i_25_)),
									 4096,
									 (((Widget)
									   widget)
									  .anInt828));
								else
								    class105
									.method977
									((((float) i_53_
									   / 2.0F)
									  + (float) (i_53_ * i_58_ + i_24_)),
									 (((float) i_54_
									   / 2.0F)
									  + (float) (i_25_ + i_59_ * i_54_)),
									 4096,
									 (((Widget)
									   widget)
									  .anInt828),
									 0,
									 i_55_,
									 1);
							    }
							}
						    } else if ((((Widget)
								 widget)
								.textColor) != 0
							       || ((alpha
								    ^ 0xffffffff)
								   != -1))
							class105.method965
							    (i_24_, i_25_,
							     (((Widget)
							       widget)
							      .anInt709),
							     (((Widget)
							       widget)
							      .anInt789),
							     0, i_55_, 1);
						    else
							class105.method972
							    (i_24_, i_25_,
							     (((Widget)
							       widget)
							      .anInt709),
							     (((Widget)
							       widget)
							      .anInt789));
						    Class348_Sub8.currentToolkit.setDimensions
							(i, i_12_, i_14_,
							 i_17_);
						} else if ((((Widget) widget)
							    .textColor) == 0
							   && alpha == 0) {
						    if (((((Widget) widget)
							  .anInt828)
							 ^ 0xffffffff)
							!= -1)
							class105.method981
							    (((float) i_24_
							      + ((float) (((Widget)
									   widget)
									  .anInt709)
								 / 2.0F)),
							     (((float) (((Widget)
									 widget)
									.anInt789)
							       / 2.0F)
							      + (float) i_25_),
							     (4096
							      * (((Widget)
								  widget)
								 .anInt709)
							      / i_53_),
							     (((Widget)
							       widget)
							      .anInt828));
						    else if ((i_53_
							      == (((Widget)
								   widget)
								  .anInt709))
							     && ((((Widget)
								   widget)
								  .anInt789)
								 == i_54_))
							class105.method974
							    (i_24_, i_25_);
						    else
							class105.method973
							    (i_24_, i_25_,
							     (((Widget)
							       widget)
							      .anInt709),
							     (((Widget)
							       widget)
							      .anInt789));
						} else if ((((Widget)
							     widget).anInt828
							    ^ 0xffffffff)
							   != -1)
						    class105.method977
							(((float) i_24_
							  + ((float) (((Widget)
								       widget)
								      .anInt709)
							     / 2.0F)),
							 ((float) i_25_
							  + ((float) (((Widget)
								       widget)
								      .anInt789)
							     / 2.0F)),
							 (4096
							  * ((Widget)
							     widget).anInt709
							  / i_53_),
							 (((Widget) widget)
							  .anInt828),
							 0, i_55_, 1);
						else if (((i_53_ ^ 0xffffffff)
							  == ((((Widget)
								widget)
							       .anInt709)
							      ^ 0xffffffff))
							 && (((Widget)
							      widget).anInt789
							     == i_54_))
						    class105.method964(i_24_,
								       i_25_,
								       0,
								       i_55_,
								       1);
						else
						    class105.method970
							(i_24_, i_25_,
							 (((Widget) widget)
							  .anInt709),
							 (((Widget) widget)
							  .anInt789),
							 0, i_55_, 1);
					    }
					}
					if (Class59_Sub1.aBoolean5300) {
					    if (!bool)
						Class54.method503(i_22_, i_19_,
								  (byte) -74,
								  i_21_,
								  i_20_);
					    else
						Class338.method2663(-5590,
								    i_19_,
								    i_21_,
								    i_20_,
								    i_22_);
					}
				    } else if (((Widget) widget).type
					       == 6) {
					Class358.method3489(115);
					AnimatableToolkit class64 = null;
					int i_60_ = 0;
					if ((((Widget) widget).itemId
					     ^ 0xffffffff)
					    != 0) {
					    ItemDefinition class213
						= (ToolkitException
						       .itemLoader
						       .getItemDefinition
						   (103, (((Widget) widget)
							  .itemId)));
					    if (class213 != null) {
						class213
						    = (class213.method1560
						       ((((Widget) widget)
							 .anInt781),
							(byte) 97));
						AnimationDefinition class17
						    = ((((Widget) widget)
							.anInt699) == -1
						       ? null
						       : (Class10
							      .animationLoader
							      .method835
							  ((((Widget) widget)
							    .anInt699),
							   7)));
						Class154 class154
						    = (!(((Widget) widget)
							 .aBoolean720)
						       ? null
						       : (((Player)
							   (Class132
							    .localPlayer))
							  .aClass154_10536));
						class64
						    = (class213.method1559
						       (class154, class17,
							Class348_Sub8.currentToolkit,
							2048,
							(((Widget) widget)
							 .anInt841),
							1,
							(((Widget) widget)
							 .anInt795),
							(byte) 88,
							(((Widget) widget)
							 .anInt730)));
						if (class64 != null)
						    i_60_ = (-class64.fa()
							     >> 1559581057);
						else
						    Class251.method1916
							(-9343, widget);
					    }
					} else if (((((Widget) widget)
						     .anInt770)
						    ^ 0xffffffff)
						   == -6) {
					    int i_61_
						= ((Widget) widget).anInt753;
					    if ((i_61_ ^ 0xffffffff) <= -1
						&& ((i_61_ ^ 0xffffffff)
						    > -2049)) {
						Player class318_sub1_sub3_sub3_sub2
						    = (ClassicLoadingScreen
						       .players
						       [i_61_]);
						AnimationDefinition class17
						    = (((((Widget) widget)
							 .anInt699)
							^ 0xffffffff) == 0
						       ? null
						       : (Class10
							      .animationLoader
							      .method835
							  ((((Widget) widget)
							    .anInt699),
							   7)));
						if ((class318_sub1_sub3_sub3_sub2
						     != null)
						    && ((i_61_
							 == (Class348_Sub42_Sub11
							     .localPlayerId))
							|| (((Class318_Sub1_Sub3_Sub1
								  .method2418
							      ((((Player)
								 class318_sub1_sub3_sub3_sub2)
								.aString10544),
							       (byte) -50))
							     ^ 0xffffffff)
							    == ((((Widget)
								  widget)
								 .anInt779)
								^ 0xffffffff))))
						    class64
							= (((Player)
							    class318_sub1_sub3_sub3_sub2)
							       .aClass154_10536
							       .method1226
							   ((Class318_Sub1_Sub3_Sub3
							     .varbitHandler),
							    null, null, true,
							    (ToolkitException
							     .itemLoader),
							    0, class17,
							    ((Widget)
							     widget).anInt730,
							    true, -1, null,
							    2048,
							    (Class348_Sub40_Sub25
							     .aClass150_9342),
							    ((Widget)
							     widget).anInt841,
							    (Class348_Sub8
							     .currentToolkit),
							    (Class189
							     .npcLoader),
							    (Class10
							     .animationLoader),
							    0,
							    ((Widget)
							     widget).anInt795,
							    0,
							    (Class64_Sub3
							     .aClass261_5558)));
					    }
					} else if (((((Widget) widget)
						     .anInt770)
						    ^ 0xffffffff) != -9
						   && (((Widget) widget)
						       .anInt770) != 9) {
					    if (((Widget) widget).anInt699
						!= -1) {
						AnimationDefinition class17
						    = (Class10.animationLoader
							   .method835
						       ((((Widget) widget)
							 .anInt699),
							7));
						class64
						    = (widget.method430
						       ((Class348_Sub40_Sub25
							 .aClass150_9342),
							Class10.animationLoader,
							2048,
							Class348_Sub8.currentToolkit,
							(((Widget) widget)
							 .anInt795),
							(((Widget) widget)
							 .anInt841),
							(ToolkitException
							 .itemLoader),
							(Class318_Sub1_Sub3_Sub3
							 .varbitHandler),
							255,
							(((Player)
							  (Class132
							   .localPlayer))
							 .aClass154_10536),
							class17,
							(Class64_Sub3
							 .aClass261_5558),
							(Class189
							 .npcLoader),
							(((Widget) widget)
							 .anInt730)));
						if (class64 == null
						    && (Class348_Sub42_Sub13
							.aBoolean9616))
						    Class251.method1916
							(-9343, widget);
					    } else {
						class64
						    = (widget.method430
						       ((Class348_Sub40_Sub25
							 .aClass150_9342),
							Class10.animationLoader,
							2048,
							Class348_Sub8.currentToolkit,
							-1, 0,
							(ToolkitException
							 .itemLoader),
							(Class318_Sub1_Sub3_Sub3
							 .varbitHandler),
							255,
							(((Player)
							  (Class132
							   .localPlayer))
							 .aClass154_10536),
							null,
							(Class64_Sub3
							 .aClass261_5558),
							(Class189
							 .npcLoader),
							-1));
						if (class64 == null
						    && (Class348_Sub42_Sub13
							.aBoolean9616))
						    Class251.method1916
							(-9343, widget);
					    }
					} else {
					    Class348_Sub13 class348_sub13
						= (Class258_Sub4.method1974
						   ((byte) -123,
						    (((Widget) widget)
						     .anInt753),
						    false));
					    AnimationDefinition class17
						= (((((Widget) widget)
						     .anInt699)
						    ^ 0xffffffff) == 0
						   ? null
						   : (Class10.animationLoader
							  .method835
						      ((((Widget) widget)
							.anInt699),
						       7)));
					    if (class348_sub13 != null) {
						Class154 class154
						    = ((((Widget) widget)
							.aBoolean720)
						       ? (((Player)
							   (Class132
							    .localPlayer))
							  .aClass154_10536)
						       : null);
						class64
						    = (class348_sub13
							   .method2803
						       (class17, class154,
							(((Widget) widget)
							 .anInt779),
							(((Widget) widget)
							 .anInt795),
							(((Widget) widget)
							 .anInt841),
							(((Widget) widget)
							 .anInt730),
							2048,
							Class348_Sub8.currentToolkit,
							(((Widget) widget)
							 .anInt770) == 9,
							-1));
					    }
					}
					if (class64 != null) {
					    int i_62_;
					    if (((Widget) widget).anInt796
						> 0)
						i_62_ = (((((Widget) widget)
							   .anInt709)
							  << -1443856247)
							 / (((Widget) widget)
							    .anInt796));
					    else
						i_62_ = 512;
					    int i_63_;
					    if ((((Widget) widget).anInt826
						 ^ 0xffffffff)
						>= -1)
						i_63_ = 512;
					    else
						i_63_ = (((((Widget) widget)
							   .anInt789)
							  << -1073852311)
							 / (((Widget) widget)
							    .anInt826));
					    int i_64_
						= (i_24_
						   - -((((Widget) widget)
							.anInt709)
						       / 2));
					    int i_65_
						= i_25_ + (((Widget) widget)
							   .anInt789) / 2;
					    if (!((Widget) widget)
						 .aBoolean784) {
						i_64_ += (i_62_ * (((Widget)
								    widget)
								   .anInt688)
							  >> -2040925559);
						i_65_ += (i_63_ * (((Widget)
								    widget)
								   .anInt799)
							  >> -1320013655);
					    }
					    Class157.aClass101_2123
						.method910();
					    Class348_Sub8.currentToolkit.method3638
						(Class157.aClass101_2123);
					    Class348_Sub8.currentToolkit.DA(i_64_,
								     i_65_,
								     i_62_,
								     i_63_);
					    Class348_Sub8.currentToolkit.ya();
					    if (((Widget) widget)
						.aBoolean754)
						Class348_Sub8.currentToolkit.C(false);
					    if (!((Widget) widget)
						 .aBoolean784) {
						int i_66_
						    = ((((((Widget) widget)
							  .anInt716)
							 << -1885378654)
							* (Class70
							   .sineTable
							   [(((Widget)
							      widget).anInt757
							     << -436072925)]))
						       >> 1786282830);
						int i_67_
						    = (((Class70.cosineTable
							 [((((Widget) widget)
							    .anInt757)
							   << -1370449085)])
							* ((((Widget) widget)
							    .anInt716)
							   << 518286114))
						       >> -908346642);
						Class50_Sub1.aClass101_5209
						    .method902
						    (-(((Widget) widget)
						       .anInt717)
						     << 632879075);
						Class50_Sub1.aClass101_5209
						    .method896
						    ((((Widget) widget)
						      .anInt675)
						     << 1285199491);
						Class50_Sub1.aClass101_5209
						    .method891
						    (((((Widget) widget)
						       .anInt808)
						      << -1809254174),
						     (((((Widget) widget)
							.anInt786)
						       << -1811115454)
						      + (i_66_ + i_60_)),
						     ((((Widget) widget)
						       .anInt786)
						      << 226771746) + i_67_);
						Class50_Sub1.aClass101_5209
						    .method900
						    ((((Widget) widget)
						      .anInt757) << -63363069);
					    } else {
						Class50_Sub1.aClass101_5209
						    .method899
						    (((Widget) widget)
						     .anInt757);
						Class50_Sub1.aClass101_5209
						    .method896
						    (((Widget) widget)
						     .anInt675);
						Class50_Sub1.aClass101_5209
						    .method908
						    (((Widget) widget)
						     .anInt717);
						Class50_Sub1.aClass101_5209
						    .method891
						    ((((Widget) widget)
						      .anInt688),
						     (((Widget) widget)
						      .anInt799),
						     (((Widget) widget)
						      .anInt787));
					    }
					    widget.method437
						(-20154, class64,
						 Class348_Sub8.currentToolkit,
						 Class367_Sub11.logicCycle,
						 Class50_Sub1.aClass101_5209);
					    if (Class318_Sub1_Sub3_Sub2
						.aBoolean10046)
						Class348_Sub8.currentToolkit.clipDimensions
						    (i_24_, i_25_,
						     (((Widget) widget)
						      .anInt709) + i_24_,
						     (i_25_
						      + (((Widget) widget)
							 .anInt789)));
					    if (!((Widget) widget)
						 .aBoolean784) {
						if (!((Widget) widget)
						     .aBoolean689) {
						    class64.method615
							((Class50_Sub1
							  .aClass101_5209),
							 null, 1);
						    if ((((Widget) widget)
							 .aClass318_Sub10_740)
							!= null)
							Class348_Sub8
							    .currentToolkit.method3684
							    (((Widget)
							      widget)
								 .aClass318_Sub10_740
								 .method2539
							     ());
						} else
						    class64.method608
							((Class50_Sub1
							  .aClass101_5209),
							 null,
							 ((((Widget) widget)
							   .anInt716)
							  << -1914185502),
							 1);
					    } else if (((Widget) widget)
						       .aBoolean689)
						class64.method608
						    ((Class50_Sub1
						      .aClass101_5209),
						     null,
						     (((Widget) widget)
						      .anInt716),
						     1);
					    else {
						class64.method615
						    ((Class50_Sub1
						      .aClass101_5209),
						     null, 1);
						if ((((Widget) widget)
						     .aClass318_Sub10_740)
						    != null)
						    Class348_Sub8.currentToolkit
							.method3684
							(((Widget) widget)
							     .aClass318_Sub10_740
							     .method2539());
					    }
					    if (Class318_Sub1_Sub3_Sub2
						.aBoolean10046)
						Class348_Sub8.currentToolkit.setDimensions
						    (i, i_12_, i_14_, i_17_);
					    if (((Widget) widget)
						.aBoolean754)
						Class348_Sub8.currentToolkit.C(true);
					}
					if (Class59_Sub1.aBoolean5300) {
					    if (bool)
						Class338.method2663(-5590,
								    i_19_,
								    i_21_,
								    i_20_,
								    i_22_);
					    else
						Class54.method503(i_22_, i_19_,
								  (byte) -74,
								  i_21_,
								  i_20_);
					}
				    } else if ((((Widget) widget).type
						^ 0xffffffff)
					       == -10) {
					int i_68_;
					int i_69_;
					int i_70_;
					int i_71_;
					if (!((Widget) widget).aBoolean744) {
					    i_71_
						= i_25_ + (((Widget) widget)
							   .anInt789);
					    i_70_
						= (((Widget) widget).anInt709
						   + i_24_);
					    i_68_ = i_25_;
					    i_69_ = i_24_;
					} else {
					    i_68_
						= (((Widget) widget).anInt789
						   + i_25_);
					    i_69_ = i_24_;
					    i_70_
						= (((Widget) widget).anInt709
						   + i_24_);
					    i_71_ = i_25_;
					}
					if ((((Widget) widget).anInt690
					     ^ 0xffffffff)
					    != -2)
					    Class348_Sub8.currentToolkit.method3688
						(i_69_, i_68_, i_70_, i_71_,
						 ((Widget) widget).textColor,
						 ((Widget) widget).anInt690,
						 0);
					else
					    Class348_Sub8.currentToolkit.method3709
						(i_69_, i_68_, i_70_, i_71_,
						 ((Widget) widget).textColor,
						 0);
					if (Class59_Sub1.aBoolean5300) {
					    if (bool)
						Class338.method2663(-5590,
								    i_19_,
								    i_21_,
								    i_20_,
								    i_22_);
					    else
						Class54.method503(i_22_, i_19_,
								  (byte) -74,
								  i_21_,
								  i_20_);
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("jia.B(" + i + ',' + i_10_ + ','
					     + bool + ',' + i_11_ + ',' + i_12_
					     + ',' + i_13_ + ',' + i_14_ + ','
					     + bool_15_ + ','
					     + (class46s != null ? "{...}"
						: "null")
					     + ',' + i_16_ + ',' + i_17_
					     + ')'));
	}
    }
    
    final void method3049(ByteBuffer class348_sub49, int i, int i_72_) {
    while_146_:
	do {
	    try {
		anInt9146++;
		if (i_72_ == 31015) {
		    int i_73_ = i;
		    do {
			if (i_73_ != 0) {
			    if ((i_73_ ^ 0xffffffff) != -2) {
				if (i_73_ == 2)
				    break;
				break while_146_;
			    }
			} else {
			    aBoolean9140 = (class348_sub49.getUByte()
					    ^ 0xffffffff) == -2;
			    return;
			}
			aBoolean9147 = class348_sub49.getUByte() == 1;
			return;
		    } while (false);
		    ((Class348_Sub40) this).aBoolean7045
			= (class348_sub49.getUByte() ^ 0xffffffff) == -2;
		    break;
		}
		break;
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("jia.F("
						 + (class348_sub49 != null
						    ? "{...}" : "null")
						 + ',' + i + ',' + i_72_
						 + ')'));
	    }
	} while (false);
    }
    
    public Class348_Sub40_Sub7() {
	super(1, false);
    }
    
    static final void method3065(int i, boolean bool, int i_74_) {
	Class318_Sub1_Sub4.anInt8765++;
	anInt9142++;
	if (bool != false)
	    method3065(-42, true, 43);
	BufferedPacket class348_sub47
	    = Class286_Sub3.createBufferedPacket(Class348_Sub40_Sub1.aClass351_9089,
				       Class348_Sub23_Sub2.outgoingGameIsaac);
	((BufferedPacket) class348_sub47).buffer
	    .method3335(52, i_74_);
	((BufferedPacket) class348_sub47).buffer
	    .method3336(i, (byte) 44);
	Class348_Sub42_Sub14.putBufferedPacket(25, class348_sub47);
    }
    
    final int[] method3042(int i, int i_75_) {
	anInt9143++;
	if (i_75_ != 255)
	    aClass348_Sub42_Sub12_9144 = null;
	int[] is = ((Class348_Sub40) this).aClass191_7032.method1433(0, i);
	if (((Class191) ((Class348_Sub40) this).aClass191_7032).aBoolean2570) {
	    int[] is_76_ = this.method3048((aBoolean9147
					    ? Class299_Sub2.anInt6325 - i : i),
					   i_75_ + 633706082, 0);
	    if (!aBoolean9140)
		Class214.method1578(is_76_, 0, is, 0,
				    Class348_Sub40_Sub6.anInt9139);
	    else {
		for (int i_77_ = 0;
		     ((Class348_Sub40_Sub6.anInt9139 ^ 0xffffffff)
		      < (i_77_ ^ 0xffffffff));
		     i_77_++)
		    is[i_77_] = is_76_[Class239_Sub22.anInt6076 + -i_77_];
	    }
	}
	return is;
    }
    
    public static void method3066(int i) {
	if (i != -1)
	    aClass348_Sub42_Sub12_9144 = null;
	aClass348_Sub42_Sub12_9144 = null;
    }
}
