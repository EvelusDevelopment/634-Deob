/* Class348_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

final class Class348_Sub24 extends Node
{
    static int anInt6871;
    int anInt6872;
    static int anInt6873;
    static int anInt6874;
    int anInt6875;
    static String aString6876;
    static String aString6877;
    static int[] anIntArray6878;
    
    static final void method2991(int i) {
	if ((Class289.anInt3699 ^ 0xffffffff) < -2) {
	    Class348_Sub40_Sub23.anInt9313 = LoadingHandler.anInt3918;
	    Class289.anInt3699--;
	}
	anInt6874++;
	if (AbstractLobbyWorld.aBoolean1712) {
	    AbstractLobbyWorld.aBoolean1712 = false;
	    Class272.method2049(67);
	} else {
	    if (!Class5_Sub1.aBoolean8335)
		Class64_Sub2.method661((byte) 95);
	    for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -101; i_0_++) {
		if (!FileIndexTracker.method2203((byte) -52))
		    break;
	    }
	    if (Class240.anInt4674 == 10) {
		while (Class286.method2138(i ^ 0x2ca2)) {
		    BufferedPacket class348_sub47
			= Class286_Sub3.createBufferedPacket(Class140.aClass351_1961,
						   (Class348_Sub23_Sub2
						    .outgoingGameIsaac));
		    ((BufferedPacket) class348_sub47)
			.buffer.putByte(0);
		    int i_1_
			= (((ByteBuffer) (((BufferedPacket) class348_sub47)
					      .buffer))
			   .position);
		    Class348_Sub33.method3025((byte) 121,
					      (((BufferedPacket)
						class348_sub47)
					       .buffer));
		    ((BufferedPacket) class348_sub47)
			.buffer.method3339
			(113,
			 (((ByteBuffer) (((BufferedPacket) class348_sub47)
					     .buffer))
			  .position) + -i_1_);
		    Class348_Sub42_Sub14.putBufferedPacket(119, class348_sub47);
		}
		if (Class239_Sub4.aClass348_Sub26_5881 != null) {
		    if ((((Class348_Sub26) Class239_Sub4.aClass348_Sub26_5881)
			 .anInt6887)
			!= -1) {
			BufferedPacket class348_sub47
			    = Class286_Sub3.createBufferedPacket((Class367_Sub4
							.aClass351_7318),
						       (Class348_Sub23_Sub2
							.outgoingGameIsaac));
			((BufferedPacket) class348_sub47)
			    .buffer.putShort
			    (((Class348_Sub26)
			      Class239_Sub4.aClass348_Sub26_5881).anInt6887);
			Class348_Sub42_Sub14.putBufferedPacket(122, class348_sub47);
			Class239_Sub4.aClass348_Sub26_5881 = null;
			Class101_Sub2.aLong5745
			    = Class62.getCurrentTimeMillis() + 30000L;
		    }
		} else if ((Class62.getCurrentTimeMillis() ^ 0xffffffffffffffffL)
			   <= (Class101_Sub2.aLong5745 ^ 0xffffffffffffffffL))
		    Class239_Sub4.aClass348_Sub26_5881
			= Class76.aClass169_1286.method1302(-5255,
							    (((ConnectionMode)
							      (Class3
							       .currentConnection))
							     .address));
		MouseEventNode class348_sub45
		    = ((MouseEventNode)
		       Class318_Sub1_Sub3.aClass262_8744.getFirst(4));
		if (class348_sub45 != null
		    || ((-2000L + Class62.getCurrentTimeMillis() ^ 0xffffffffffffffffL)
			< (Class355.aLong4367 ^ 0xffffffffffffffffL))) {
		    BufferedPacket class348_sub47 = null;
		    int i_2_ = 0;
		    for (MouseEventNode class348_sub45_3_
			     = ((MouseEventNode)
				r_Sub1.aClass262_10479.getFirst(4));
			 class348_sub45_3_ != null;
			 class348_sub45_3_
			     = (MouseEventNode) r_Sub1.aClass262_10479
						    .nextForward((byte) 79)) {
			if (class348_sub47 != null
			    && (((ByteBuffer)
				 (((BufferedPacket) class348_sub47)
				  .buffer)).position - i_2_
				>= 240))
			    break;
			class348_sub45_3_.removeNode();
			int i_4_ = class348_sub45_3_.method3311(-15);
			if ((i_4_ ^ 0xffffffff) <= 0) {
			    if (i_4_ > 65534)
				i_4_ = 65534;
			} else
			    i_4_ = -1;
			int i_5_ = class348_sub45_3_.method3308((byte) -127);
			if ((i_5_ ^ 0xffffffff) <= 0) {
			    if ((i_5_ ^ 0xffffffff) < -65535)
				i_5_ = 65534;
			} else
			    i_5_ = -1;
			if (s_Sub2.anInt8270 != i_5_
			    || i_4_ != Class322.anInt4032) {
			    if (class348_sub47 == null) {
				Class361.anInt4450++;
				class348_sub47
				    = (Class286_Sub3.createBufferedPacket
				       (Class348_Sub42_Sub11.aClass351_9590,
					Class348_Sub23_Sub2.outgoingGameIsaac));
				((BufferedPacket) class348_sub47)
				    .buffer
				    .putByte(0);
				i_2_
				    = ((ByteBuffer)
				       (((BufferedPacket) class348_sub47)
					.buffer)).position;
			    }
			    int i_6_ = -s_Sub2.anInt8270 + i_5_;
			    s_Sub2.anInt8270 = i_5_;
			    int i_7_ = i_4_ - Class322.anInt4032;
			    Class322.anInt4032 = i_4_;
			    int i_8_ = (int) ((class348_sub45_3_
						   .method3312((byte) -107)
					       + -Class355.aLong4367)
					      / 20L);
			    if ((i_8_ ^ 0xffffffff) <= -9
				|| (i_6_ ^ 0xffffffff) > 31
				|| (i_6_ ^ 0xffffffff) < -32 || i_7_ < -32
				|| i_7_ > 31) {
				if ((i_8_ ^ 0xffffffff) > -33 && i_6_ >= -128
				    && (i_6_ ^ 0xffffffff) >= -128
				    && (i_7_ ^ 0xffffffff) <= 127
				    && i_7_ <= 127) {
				    i_6_ += 128;
				    i_7_ += 128;
				    ((BufferedPacket) class348_sub47)
					.buffer
					.putByte(128 + i_8_);
				    ((BufferedPacket) class348_sub47)
					.buffer.putShort
					(i_7_ + (i_6_ << 262250184));
				} else if ((i_8_ ^ 0xffffffff) <= -33) {
				    ((BufferedPacket) class348_sub47)
					.buffer
					.putShort(57344 + i_8_);
				    if (i_5_ == 1 || (i_4_ ^ 0xffffffff) == 0)
					((BufferedPacket) class348_sub47)
					    .buffer
					    .putInt
					    (-2147483648);
				    else
					((BufferedPacket) class348_sub47)
					    .buffer
					    .putInt
					    (i_4_ << 1284577936 | i_5_);
				} else {
				    ((BufferedPacket) class348_sub47)
					.buffer
					.putByte(192 + i_8_);
				    if ((i_5_ ^ 0xffffffff) != -2
					&& (i_4_ ^ 0xffffffff) != 0)
					((BufferedPacket) class348_sub47)
					    .buffer
					    .putInt
					    (i_5_ | i_4_ << -1666152656);
				    else
					((BufferedPacket) class348_sub47)
					    .buffer
					    .putInt
					    (-2147483648);
				}
			    } else {
				i_6_ += 32;
				i_7_ += 32;
				((BufferedPacket) class348_sub47)
				    .buffer.putShort
				    ((i_7_ + (i_6_ << 612662566)
						  + (i_8_ << -2011999892)));
			    }
			    Class355.aLong4367
				= class348_sub45_3_.method3312((byte) -109);
			}
		    }
		    if (class348_sub47 != null) {
			((BufferedPacket) class348_sub47)
			    .buffer.method3339
			    (105,
			     ((ByteBuffer)
			      (((BufferedPacket) class348_sub47)
			       .buffer)).position + -i_2_);
			Class348_Sub42_Sub14.putBufferedPacket(23, class348_sub47);
		    }
		}
		if (class348_sub45 != null) {
		    long l = ((class348_sub45.method3312((byte) -110)
			       + -Class14.aLong5089)
			      / 50L);
		    Class14.aLong5089 = class348_sub45.method3312((byte) -87);
		    if ((l ^ 0xffffffffffffffffL) < -32768L)
			l = 32767L;
		    int i_9_ = class348_sub45.method3311(20);
		    if ((i_9_ ^ 0xffffffff) <= -1) {
			if ((i_9_ ^ 0xffffffff) < -65536)
			    i_9_ = 65535;
		    } else
			i_9_ = 0;
		    int i_10_ = class348_sub45.method3308((byte) -128);
		    if (i_10_ < 0)
			i_10_ = 0;
		    else if (i_10_ > 65535)
			i_10_ = 65535;
		    int i_11_ = 0;
		    if ((class348_sub45.getType(i ^ 0x2cee) ^ 0xffffffff)
			== -3)
			i_11_ = 1;
		    int i_12_ = (int) l;
		    Class10.anInt182++;
		    BufferedPacket class348_sub47
			= Class286_Sub3.createBufferedPacket(Class27.aClass351_395,
						   (Class348_Sub23_Sub2
						    .outgoingGameIsaac));
		    ((BufferedPacket) class348_sub47)
			.buffer
			.putShort(i_12_ | i_11_ << -1239858161);
		    ((BufferedPacket) class348_sub47)
			.buffer
			.putInt(i_9_ << 1300787888 | i_10_);
		    Class348_Sub42_Sub14.putBufferedPacket(25, class348_sub47);
		}
		if (Class253.anInt3246 > 0) {
		    Class348_Sub40_Sub26.anInt9348++;
		    BufferedPacket class348_sub47
			= Class286_Sub3.createBufferedPacket((Class328_Sub1_Sub1
						    .aClass351_8798),
						   (Class348_Sub23_Sub2
						    .outgoingGameIsaac));
		    ((BufferedPacket) class348_sub47)
			.buffer
			.putByte(3 * Class253.anInt3246);
		    for (int i_13_ = 0; ((Class253.anInt3246 ^ 0xffffffff)
					 < (i_13_ ^ 0xffffffff)); i_13_++) {
			KeyboardEvent interface6
			    = Class308.anInterface6Array3884[i_13_];
			long l = ((interface6.method29((byte) -29)
				   + -Class348_Sub7.aLong6651)
				  / 50L);
			Class348_Sub7.aLong6651
			    = interface6.method29((byte) 106);
			if (l > 65535L)
			    l = 65535L;
			((BufferedPacket) class348_sub47)
			    .buffer
			    .putByte(interface6.method30(false));
			((BufferedPacket) class348_sub47)
			    .buffer
			    .putShort((int) l);
		    }
		    Class348_Sub42_Sub14.putBufferedPacket(-49, class348_sub47);
		}
		if (Message.anInt2035 > 0)
		    Message.anInt2035--;
		if (Class369_Sub3_Sub1.aBoolean10174
		    && Message.anInt2035 <= 0) {
		    Class239_Sub18.anInt6033++;
		    Class369_Sub3_Sub1.aBoolean10174 = false;
		    Message.anInt2035 = 20;
		    BufferedPacket class348_sub47
			= Class286_Sub3.createBufferedPacket(Class281.aClass351_3648,
						   (Class348_Sub23_Sub2
						    .outgoingGameIsaac));
		    ((BufferedPacket) class348_sub47)
			.buffer.method3349
			(i ^ 0x3c4d, (int) AbtractArchiveLoader.aFloat3938 >> 1023549699);
		    ((BufferedPacket) class348_sub47)
			.buffer.putShort
			((int) Class76.aFloat1287 >> -2047846301);
		    Class348_Sub42_Sub14.putBufferedPacket(-31, class348_sub47);
		}
		if (Class347.aBoolean4278 != Class175.isWindowActive) {
		    Class269.anInt3460++;
		    Class347.aBoolean4278 = Class175.isWindowActive;
		    BufferedPacket class348_sub47
			= Class286_Sub3.createBufferedPacket((DummyInputstream2
						    .aClass351_77),
						   (Class348_Sub23_Sub2
						    .outgoingGameIsaac));
		    ((BufferedPacket) class348_sub47)
			.buffer
			.putByte(!Class175.isWindowActive ? 0 : 1);
		    Class348_Sub42_Sub14.putBufferedPacket(i + -11501,
						    class348_sub47);
		}
		if (!r.aBoolean9719) {
		    Class62.anInt1110++;
		    BufferedPacket class348_sub47
			= Class286_Sub3.createBufferedPacket((FloatBuffer
						    .aClass351_9743),
						   (Class348_Sub23_Sub2
						    .outgoingGameIsaac));
		    ((BufferedPacket) class348_sub47)
			.buffer.putByte(0);
		    int i_14_
			= (((ByteBuffer) (((BufferedPacket) class348_sub47)
					      .buffer))
			   .position);
		    ByteBuffer class348_sub49
			= BitmapTable.aClass348_Sub51_3959.method3427(i ^ 0x2cb0);
		    ((BufferedPacket) class348_sub47)
			.buffer.putBytes
			(((ByteBuffer) class348_sub49).position, 0,
			 ((ByteBuffer) class348_sub49).payload);
		    ((BufferedPacket) class348_sub47)
			.buffer.method3339
			(96,
			 (((ByteBuffer) (((BufferedPacket) class348_sub47)
					     .buffer))
			  .position) + -i_14_);
		    Class348_Sub42_Sub14.putBufferedPacket(i + -11473,
						    class348_sub47);
		    r.aBoolean9719 = true;
		}
		if (Message.aClass357ArrayArrayArray2029 != null) {
		    if ((Class348_Sub40_Sub21.anInt9282 ^ 0xffffffff) == -3)
			Class14_Sub1.method241((byte) 127);
		    else if (Class348_Sub40_Sub21.anInt9282 == 3)
			Class348_Sub21.method2954((byte) -4);
		}
		if (!IntergerVarScriptSettingDefinition.aBoolean2130)
		    Class205.aFloat2687 /= 2.0F;
		else
		    IntergerVarScriptSettingDefinition.aBoolean2130 = false;
		if (!Class50_Sub1.aBoolean5224)
		    Class348_Sub27.aFloat6898 /= 2.0F;
		else
		    Class50_Sub1.aBoolean5224 = false;
		Class348_Sub35.method3027((byte) 33);
		if (Class240.anInt4674 == 10) {
		    Class348_Sub42_Sub3.method3175((byte) 55);
		    Class38.method362(i + -11335);
		    Class206.method1501(-123);
		    StringNode.anInt7213++;
		    if (StringNode.anInt7213 > 750)
			Class272.method2049(83);
		    else {
			Class34.method349(i + -6692);
			Class348_Sub40_Sub38.method3150(true);
			Class186.method1397(0);
			for (int id = Class318_Sub1_Sub3_Sub3.varbitHandler.handleQueuedConfig(true); (id ^ 0xffffffff) != 0; id = Class318_Sub1_Sub3_Sub3.varbitHandler.handleQueuedConfig(false)) {
			    Class239_Sub11.method1767(true, id);
			    Class327.anIntArray4096[Class139.method1166(31, GametipDefinition.anInt3695++)] = id;
			}
			for (WidgetVariable variable
				 = Class348_Sub40_Sub30.method3127(2681);
			     variable != null;
			     variable
				 = Class348_Sub40_Sub30.method3127(2681)) {
			    int type = variable.getType(true);
			    int id = variable.getId(1);
			    if (type == 1) {
				ISAAC.globalScriptIntVars[id] = ((WidgetVariable)
				       variable).intArg;
				Class184.aBoolean2469
				    |= Class286_Sub6.isCsVariableActive[id];
				Class348_Sub26.anIntArray6890
				    [Class139.method1166(31, Class5_Sub1
								 .anInt8352++)]
				    = id;
			    } else if (type == 2) {
				Class258_Sub2.globalScriptStrVars[id]
				    = ((WidgetVariable)
				       variable).aString9654;
				Class239_Sub21.anIntArray6061
				    [Class139.method1166(Class348_Sub40_Sub30
							     .anInt9385++,
							 31)]
				    = id;
			    } else if (type != 3) {
				if (type == 4) {
				    Widget widget
					= AbstractFontRasterizer.getWidget(id);
				    int i_18_ = (((WidgetVariable)
						  variable)
						 .intArg);
				    int i_19_ = (((WidgetVariable)
						  variable)
						 .anInt9651);
				    int i_20_ = (((WidgetVariable)
						  variable)
						 .anInt9650);
				    if ((((Widget) widget).anInt770
					 ^ 0xffffffff) != (i_18_ ^ 0xffffffff)
					|| ((i_19_ ^ 0xffffffff)
					    != (((Widget) widget).anInt753
						^ 0xffffffff))
					|| ((((Widget) widget).anInt779
					     ^ 0xffffffff)
					    != (i_20_ ^ 0xffffffff))) {
					((Widget) widget).anInt753 = i_19_;
					((Widget) widget).anInt770 = i_18_;
					((Widget) widget).anInt779 = i_20_;
					Class251.method1916(-9343, widget);
				    }
				} else if (type == 5) {
				    Widget class46
					= AbstractFontRasterizer.getWidget(id);
				    if (((((WidgetVariable)
					   variable).intArg
					  ^ 0xffffffff)
					 != (((Widget) class46).anInt699
					     ^ 0xffffffff))
					|| (((WidgetVariable)
					     variable).intArg
					    == -1)) {
					((Widget) class46).anInt699
					    = ((WidgetVariable)
					       variable).intArg;
					((Widget) class46).anInt795 = 0;
					((Widget) class46).anInt841 = 0;
					((Widget) class46).anInt730 = 1;
					AnimationDefinition class17
					    = ((((Widget) class46).anInt699
						== -1)
					       ? null
					       : (Class10.animationLoader
						      .method835
						  ((((Widget) class46)
						    .anInt699),
						   7)));
					if (class17 != null)
					    Class264.method2017((((Widget)
								  class46)
								 .anInt795),
								class17, 30);
					Class251.method1916(-9343, class46);
				    }
				} else if ((type ^ 0xffffffff) == -7) {
				    int i_21_ = (((WidgetVariable)
						  variable)
						 .intArg);
				    int i_22_
					= (0x7ff9 & i_21_) >> -1381220406;
				    int i_23_ = 0x1f & i_21_ >> 1431203525;
				    int i_24_ = 0x1f & i_21_;
				    int i_25_ = ((i_24_ << -419981053)
						 + ((i_22_ << -776313261)
						    - -(i_23_ << 1658085547)));
				    Widget class46
					= AbstractFontRasterizer.getWidget(id);
				    if ((i_25_ ^ 0xffffffff)
					!= (((Widget) class46).textColor
					    ^ 0xffffffff)) {
					((Widget) class46).textColor = i_25_;
					Class251.method1916(-9343, class46);
				    }
				} else if (type == 7) {
				    Widget class46
					= AbstractFontRasterizer.getWidget(id);
				    boolean bool
					= (((WidgetVariable)
					    variable).intArg
					   == 1);
				    if (!((Widget) class46).aBoolean813
					== bool) {
					((Widget) class46).aBoolean813 = bool;
					Class251.method1916(-9343, class46);
				    }
				} else if (type == 8) {
				    Widget class46
					= AbstractFontRasterizer.getWidget(id);
				    if ((((Widget) class46).anInt757
					 != ((WidgetVariable)
					     variable).intArg)
					|| ((((WidgetVariable)
					      variable).anInt9651
					     ^ 0xffffffff)
					    != (((Widget) class46).anInt675
						^ 0xffffffff))
					|| ((((WidgetVariable)
					      variable).anInt9650
					     ^ 0xffffffff)
					    != (((Widget) class46).anInt716
						^ 0xffffffff))) {
					((Widget) class46).anInt716
					    = ((WidgetVariable)
					       variable).anInt9650;
					((Widget) class46).anInt675
					    = ((WidgetVariable)
					       variable).anInt9651;
					((Widget) class46).anInt757
					    = ((WidgetVariable)
					       variable).intArg;
					if ((((Widget) class46).itemId
					     ^ 0xffffffff)
					    != 0) {
					    if (((Widget) class46).anInt796
						<= 0) {
						if ((((Widget) class46)
						     .anInt842)
						    > 0)
						    ((Widget) class46)
							.anInt716
							= (32
							   * ((Widget)
							      class46).anInt716
							   / (((Widget)
							       class46)
							      .anInt842));
					    } else
						((Widget) class46).anInt716
						    = ((((Widget) class46)
							.anInt716)
						       * 32
						       / (((Widget) class46)
							  .anInt796));
					}
					Class251.method1916(-9343, class46);
				    }
				} else if (type != 9) {
				    if ((type ^ 0xffffffff) != -11) {
					if (type != 11) {
					    if ((type ^ 0xffffffff) != -13) {
						if ((type ^ 0xffffffff)
						    == -15) {
						    Widget class46
							= (AbstractFontRasterizer.getWidget
							   (id));
						    ((Widget) class46)
							.id
							= (((WidgetVariable)
							    variable)
							   .intArg);
						} else if (type == 15) {
						    Class97.anInt1548
							= (((WidgetVariable)
							    variable)
							   .anInt9651);
						    OndemandWorker.anInt3203
							= (((WidgetVariable)
							    variable)
							   .intArg);
						    Class348_Sub13.aBoolean6759
							= true;
						} else if ((type ^ 0xffffffff)
							   != -17) {
						    if (type == 17) {
							Widget class46
							    = (AbstractFontRasterizer
								   .getWidget
							       (id));
							((Widget) class46)
							    .anInt806
							    = (((WidgetVariable)
								variable)
							       .intArg);
						    }
						} else {
						    Widget class46
							= (AbstractFontRasterizer.getWidget
							   (id));
						    ((Widget) class46)
							.bitmapFontId
							= (((WidgetVariable)
							    variable)
							   .intArg);
						}
					    } else {
						Widget class46
						    = (AbstractFontRasterizer.getWidget
						       (id));
						int i_26_
						    = (((WidgetVariable)
							variable)
						       .intArg);
						if (class46 != null
						    && ((((Widget) class46)
							 .type)
							^ 0xffffffff) == -1) {
						    if ((-(((Widget) class46)
							   .anInt789)
							 + (((Widget) class46)
							    .anInt791))
							< i_26_)
							i_26_
							    = ((((Widget)
								 class46)
								.anInt791)
							       - (((Widget)
								   class46)
								  .anInt789));
						    if ((i_26_ ^ 0xffffffff)
							> -1)
							i_26_ = 0;
						    if (i_26_
							!= (((Widget) class46)
							    .anInt755)) {
							((Widget) class46)
							    .anInt755
							    = i_26_;
							Class251.method1916
							    (-9343, class46);
						    }
						}
					    }
					} else {
					    Widget class46
						= (AbstractFontRasterizer.getWidget
						   (id));
					    ((Widget) class46).aByte817
						= (byte) 0;
					    ((Widget) class46).anInt750
						= ((Widget) class46).anInt739
						= (((WidgetVariable)
						    variable)
						   .anInt9651);
					    ((Widget) class46).aByte681
						= (byte) 0;
					    ((Widget) class46).anInt800
						= ((Widget) class46).anInt788
						= (((WidgetVariable)
						    variable)
						   .intArg);
					    Class251.method1916(-9343,
								class46);
					}
				    } else {
					Widget class46
					    = AbstractFontRasterizer.getWidget(id);
					if ((((Widget) class46).anInt808
					     != (((WidgetVariable)
						  variable)
						 .intArg))
					    || (((((WidgetVariable)
						   variable)
						  .anInt9651)
						 ^ 0xffffffff)
						!= ((((Widget) class46)
						     .anInt786)
						    ^ 0xffffffff))
					    || ((((Widget) class46).anInt717
						 ^ 0xffffffff)
						!= ((((WidgetVariable)
						      variable)
						     .anInt9650)
						    ^ 0xffffffff))) {
					    ((Widget) class46).anInt786
						= (((WidgetVariable)
						    variable)
						   .anInt9651);
					    ((Widget) class46).anInt808
						= (((WidgetVariable)
						    variable)
						   .intArg);
					    ((Widget) class46).anInt717
						= (((WidgetVariable)
						    variable)
						   .anInt9650);
					    Class251.method1916(-9343,
								class46);
					}
				    }
				} else {
				    Widget class46
					= AbstractFontRasterizer.getWidget(id);
				    if ((((WidgetVariable)
					  variable).intArg
					 != ((Widget) class46).itemId)
					|| (((WidgetVariable)
					     variable).anInt9651
					    != ((Widget) class46).anInt781)) {
					((Widget) class46).anInt781
					    = ((WidgetVariable)
					       variable).anInt9651;
					((Widget) class46).itemId
					    = ((WidgetVariable)
					       variable).intArg;
					Class251.method1916(-9343, class46);
				    }
				}
			    } else {
				Widget class46
				    = AbstractFontRasterizer.getWidget(id);
				if (!((WidgetVariable)
				      variable)
					 .aString9654.equals
				     (((Widget) class46).text)) {
				    ((Widget) class46).text
					= ((WidgetVariable)
					   variable).aString9654;
				    Class251.method1916(-9343, class46);
				}
			    }
			}
			Class348_Sub51.anInt7267++;
			if (Class239_Sub20.anInt6048 != 0) {
			    Node.anInt4292 += 20;
			    if (Node.anInt4292 >= 400)
				Class239_Sub20.anInt6048 = 0;
			}
			if (LoadingHandler.aClass46_3913 != null) {
			    Class108.anInt1656++;
			    if (Class108.anInt1656 >= 15) {
				Class251.method1916(-9343,
						    LoadingHandler.aClass46_3913);
				LoadingHandler.aClass46_3913 = null;
			    }
			}
			Class318_Sub1_Sub3_Sub4.aClass46_10336 = null;
			Class50_Sub1.aBoolean5221 = false;
			Class168.aClass46_2249 = null;
			Class127_Sub1.aBoolean8386 = false;
			Class5_Sub2.method198(null, false, -1, -1);
			Class175.method1343(-1, null, 1, -1);
			if (!r.aBoolean9722)
			    Class362.anInt4458 = -1;
			Class216.method1583((byte) -73);
			LoadingHandler.anInt3918++;
			if (Class237.aBoolean3103) {
			    Class98.anInt1568++;
			    BufferedPacket class348_sub47
				= Class286_Sub3.createBufferedPacket((DirectxToolkit
							    .aClass351_7715),
							   (Class348_Sub23_Sub2
							    .outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer.putInt
				((DummyInputstream.anInt85 << -1934580594
				  | (Class348_Sub40_Sub26.anInt9349
				     << 1832868092)
				  | NpcDefinition.anInt1404));
			    Class348_Sub42_Sub14.putBufferedPacket(30,
							    class348_sub47);
			    Class237.aBoolean3103 = false;
			}
			for (;;) {
			    InterfaceScript class348_sub36
				= ((InterfaceScript)
				   OutputstreamWorker.aClass262_2707.removeFirst(8));
			    if (class348_sub36 == null)
				break;
			    Widget class46
				= (((InterfaceScript) class348_sub36)
				   .parent);
			    if (((Widget) class46).anInt704 >= 0) {
				Widget class46_27_
				    = AbstractFontRasterizer.getWidget((((Widget) class46)
							   .anInt834));
				if (class46_27_ == null
				    || (((Widget) class46_27_)
					.children) == null
				    || ((((Widget) class46_27_)
					 .children).length
					<= ((Widget) class46).anInt704)
				    || (class46
					!= (((Widget) class46_27_)
					    .children
					    [((Widget) class46).anInt704])))
				    continue;
			    }
			    ScriptExecutor.executeScript(class348_sub36);
			}
			for (;;) {
			    InterfaceScript class348_sub36
				= ((InterfaceScript)
				   ToolkitInfo.aClass262_4473.removeFirst(8));
			    if (class348_sub36 == null)
				break;
			    Widget class46
				= (((InterfaceScript) class348_sub36)
				   .parent);
			    if ((((Widget) class46).anInt704 ^ 0xffffffff)
				<= -1) {
				Widget class46_28_
				    = AbstractFontRasterizer.getWidget((((Widget) class46)
							   .anInt834));
				if (class46_28_ == null
				    || (((Widget) class46_28_)
					.children) == null
				    || (((((Widget) class46_28_)
					  .children).length
					 ^ 0xffffffff)
					>= (((Widget) class46).anInt704
					    ^ 0xffffffff))
				    || ((((Widget) class46_28_)
					 .children
					 [((Widget) class46).anInt704])
					!= class46))
				    continue;
			    }
			    ScriptExecutor.executeScript(class348_sub36);
			}
			for (;;) {
			    InterfaceScript class348_sub36
				= ((InterfaceScript)
				   Class348_Sub1_Sub2.aClass262_8810
				       .removeFirst(i + -11424));
			    if (class348_sub36 == null)
				break;
			    Widget class46
				= (((InterfaceScript) class348_sub36)
				   .parent);
			    if ((((Widget) class46).anInt704 ^ 0xffffffff)
				<= -1) {
				Widget class46_29_
				    = AbstractFontRasterizer.getWidget((((Widget) class46)
							   .anInt834));
				if (class46_29_ == null
				    || (((Widget) class46_29_)
					.children) == null
				    || (((Widget) class46).anInt704
					>= (((Widget) class46_29_)
					    .children).length)
				    || ((((Widget) class46_29_)
					 .children
					 [((Widget) class46).anInt704])
					!= class46))
				    continue;
			    }
			    ScriptExecutor.executeScript(class348_sub36);
			}
			if (Class168.aClass46_2249 == null)
			    SubNode.anInt7059 = 0;
			if (Class289.aClass46_3701 != null)
			    Class347.method2708(-30206);
			if ((Class192.anInt2581 ^ 0xffffffff) < -1
			    && Class182.keyboardListener.method2696(82,
								  i ^ ~0x2cd5)
			    && Class182.keyboardListener.method2696(81, -121)
			    && (Class98.anInt1565 ^ 0xffffffff) != -1) {
			    int i_30_
				= ((((Class318_Sub1)
				     (Class132
				      .localPlayer))
				    .aByte6381)
				   - Class98.anInt1565);
			    if ((i_30_ ^ 0xffffffff) <= -1) {
				if (i_30_ > 3)
				    i_30_ = 3;
			    } else
				i_30_ = 0;
			    Class361.method3502
				((((Class318_Sub1_Sub3_Sub3)
				   Class132.localPlayer)
				  .anIntArray10317[0]) + Class90.anInt1517,
				 i ^ 0x2caa, i_30_,
				 (((Class318_Sub1_Sub3_Sub3)
				   Class132.localPlayer)
				  .anIntArray10320[0]) + za_Sub2.anInt9780);
			}
			Class261.method1987(-120);
			int i_31_ = 0;
			if (i == 11432) {
			    for (/**/; (i_31_ ^ 0xffffffff) > -6; i_31_++)
				Class318_Sub1_Sub1_Sub2.anIntArray9981
				    [i_31_]++;
			    if (Class184.aBoolean2469
				&& (-60000L + Class62.getCurrentTimeMillis()
				    > Class34.aLong482))
				Class318_Sub1_Sub2.writeScriptSettings(i + -11313);
			    for (Class318_Sub9_Sub1 class318_sub9_sub1
				     = ((Class318_Sub9_Sub1)
					Class348_Sub42_Sub14.aClass243_9642
					    .method1872(i + -11424));
				 class318_sub9_sub1 != null;
				 class318_sub9_sub1
				     = ((Class318_Sub9_Sub1)
					Class348_Sub42_Sub14.aClass243_9642
					    .method1878((byte) -105))) {
				if ((Class62.getCurrentTimeMillis() / 1000L
				     + -5L)
				    > (long) ((Class318_Sub9_Sub1)
					      class318_sub9_sub1).anInt8787) {
				    if ((((Class318_Sub9_Sub1)
					  class318_sub9_sub1).aShort8786
					 ^ 0xffffffff)
					< -1)
					Class286_Sub2.handleMessage
					    ("", 5, 0,
					     (((Class318_Sub9_Sub1)
					       class318_sub9_sub1).aString8783
					      + (GameText.aClass274_3502
						     .getLanguageText
						 (Class348_Sub33.gameLanguage))),
					     "", "");
				    if (((Class318_Sub9_Sub1)
					 class318_sub9_sub1).aShort8786
					== 0)
					Class286_Sub2.handleMessage
					    ("", 5, 0,
					     (((Class318_Sub9_Sub1)
					       class318_sub9_sub1).aString8783
					      + (GameText.aClass274_3503
						     .getLanguageText
						 (Class348_Sub33.gameLanguage))),
					     "", "");
				    class318_sub9_sub1.method2373(false);
				}
			    }
			    Class28.anInt4999++;
			    if ((Class28.anInt4999 ^ 0xffffffff) < -501) {
				Class28.anInt4999 = 0;
				int i_32_ = (int) (8.0 * Math.random());
				if ((0x4 & i_32_ ^ 0xffffffff) == -5)
				    ModernLoadingScreen.anInt5016 += Class303.anInt3844;
				if ((i_32_ & 0x1) == 1)
				    Class20.anInt319
					+= Class318_Sub1_Sub5.anInt8775;
				if ((0x2 & i_32_ ^ 0xffffffff) == -3)
				    Class260.anInt3310 += AbstractBuffer.anInt4263;
			    }
			    if (Class20.anInt319 < -50)
				Class318_Sub1_Sub5.anInt8775 = 2;
			    if (Class20.anInt319 > 50)
				Class318_Sub1_Sub5.anInt8775 = -2;
			    if (Class260.anInt3310 < -55)
				AbstractBuffer.anInt4263 = 2;
			    if (ModernLoadingScreen.anInt5016 < -40)
				Class303.anInt3844 = 1;
			    if ((Class260.anInt3310 ^ 0xffffffff) < -56)
				AbstractBuffer.anInt4263 = -2;
			    Class285.anInt4753++;
			    if (ModernLoadingScreen.anInt5016 > 40)
				Class303.anInt3844 = -1;
			    if ((Class285.anInt4753 ^ 0xffffffff) < -501) {
				Class285.anInt4753 = 0;
				int i_33_ = (int) (Math.random() * 8.0);
				if ((i_33_ & 0x2) == 2)
				    FloatBuffer.anInt9750
					+= Class348_Sub42_Sub14.anInt9645;
				if ((i_33_ & 0x1 ^ 0xffffffff) == -2)
				    r_Sub2.anInt10483
					+= Class348_Sub42_Sub9_Sub1.anInt10443;
			    }
			    if ((r_Sub2.anInt10483 ^ 0xffffffff) > 59)
				Class348_Sub42_Sub9_Sub1.anInt10443 = 2;
			    if ((FloatBuffer.anInt9750 ^ 0xffffffff)
				> 19)
				Class348_Sub42_Sub14.anInt9645 = 1;
			    if ((r_Sub2.anInt10483 ^ 0xffffffff) < -61)
				Class348_Sub42_Sub9_Sub1.anInt10443 = -2;
			    if (FloatBuffer.anInt9750 > 10)
				Class348_Sub42_Sub14.anInt9645 = -1;
			    Class11.anInt193++;
			    if (Class11.anInt193 > 50) {
				IOException_Sub1.anInt88++;
				BufferedPacket class348_sub47
				    = (Class286_Sub3.createBufferedPacket
				       (Class239_Sub10.aClass351_5938,
					Class348_Sub23_Sub2.outgoingGameIsaac));
				Class348_Sub42_Sub14
				    .putBufferedPacket(i ^ ~0x2cc0, class348_sub47);
			    }
			    if (Class239_Sub29.aBoolean6147) {
				Class313.method2334(0);
				Class239_Sub29.aBoolean6147 = false;
			    }
			    try {
				Class239_Sub18.method1802(0);
			    } catch (java.io.IOException ioexception) {
				Class272.method2049(93);
			    }
			}
		    }
		}
	    }
	}
    }
    
    static final byte[] method2992(String string, byte i) {
	try {
	    anInt6873++;
	    int i_34_ = string.length();
	    byte[] is = new byte[i_34_];
	    if (i != -20)
		method2991(-54);
	    for (int i_35_ = 0; (i_34_ ^ 0xffffffff) < (i_35_ ^ 0xffffffff);
		 i_35_++) {
		int i_36_ = string.charAt(i_35_);
		if ((i_36_ ^ 0xffffffff) < -1 && i_36_ < 128
		    || i_36_ >= 160 && (i_36_ ^ 0xffffffff) >= -256)
		    is[i_35_] = (byte) i_36_;
		else if (i_36_ != 8364) {
		    if ((i_36_ ^ 0xffffffff) != -8219) {
			if (i_36_ != 402) {
			    if (i_36_ == 8222)
				is[i_35_] = (byte) -124;
			    else if ((i_36_ ^ 0xffffffff) == -8231)
				is[i_35_] = (byte) -123;
			    else if (i_36_ != 8224) {
				if (i_36_ != 8225) {
				    if ((i_36_ ^ 0xffffffff) == -711)
					is[i_35_] = (byte) -120;
				    else if ((i_36_ ^ 0xffffffff) == -8241)
					is[i_35_] = (byte) -119;
				    else if ((i_36_ ^ 0xffffffff) == -353)
					is[i_35_] = (byte) -118;
				    else if ((i_36_ ^ 0xffffffff) != -8250) {
					if (i_36_ != 338) {
					    if ((i_36_ ^ 0xffffffff) != -382) {
						if (i_36_ == 8216)
						    is[i_35_] = (byte) -111;
						else if (i_36_ == 8217)
						    is[i_35_] = (byte) -110;
						else if (i_36_ != 8220) {
						    if (i_36_ != 8221) {
							if ((i_36_
							     ^ 0xffffffff)
							    == -8227)
							    is[i_35_]
								= (byte) -107;
							else if ((i_36_
								  ^ 0xffffffff)
								 == -8212)
							    is[i_35_]
								= (byte) -106;
							else if (i_36_
								 != 8212) {
							    if (i_36_ != 732) {
								if (i_36_
								    != 8482) {
								    if ((i_36_
									 ^ 0xffffffff)
									== -354)
									is[i_35_]
									    = (byte) -102;
								    else if ((i_36_
									      ^ 0xffffffff)
									     == -8251)
									is[i_35_]
									    = (byte) -101;
								    else if (i_36_
									     != 339) {
									if (i_36_
									    == 382)
									    is[i_35_] = (byte) -98;
									else if (i_36_ != 376)
									    is[i_35_] = (byte) 63;
									else
									    is[i_35_] = (byte) -97;
								    } else
									is[i_35_]
									    = (byte) -100;
								} else
								    is[i_35_]
									= (byte) -103;
							    } else
								is[i_35_]
								    = (byte) -104;
							} else
							    is[i_35_]
								= (byte) -105;
						    } else
							is[i_35_]
							    = (byte) -108;
						} else
						    is[i_35_] = (byte) -109;
					    } else
						is[i_35_] = (byte) -114;
					} else
					    is[i_35_] = (byte) -116;
				    } else
					is[i_35_] = (byte) -117;
				} else
				    is[i_35_] = (byte) -121;
			    } else
				is[i_35_] = (byte) -122;
			} else
			    is[i_35_] = (byte) -125;
		    } else
			is[i_35_] = (byte) -126;
		} else
		    is[i_35_] = (byte) -128;
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ls.B("
					     + (string != null ? "{...}"
						: "null")
					     + ',' + i + ')'));
	}
    }
    
    public static void method2993(byte i) {
	anIntArray6878 = null;
	aString6876 = null;
	aString6877 = null;
	int i_37_ = 31 % ((3 - i) / 37);
    }
    
    static final void method2994(int i) {
	anInt6871++;
	if (i == 2)
	    Class199.aClass352Array2636 = null;
    }
    
    Class348_Sub24(int i, int i_38_) {
	((Class348_Sub24) this).anInt6872 = i;
	((Class348_Sub24) this).anInt6875 = i_38_;
    }
    
    static {
	String string = "Unknown";
	try {
	    string = System.getProperty("java.vendor").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	string.toLowerCase();
	string = "Unknown";
	try {
	    string = System.getProperty("java.version").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	string.toLowerCase();
	string = "Unknown";
	try {
	    string = System.getProperty("os.name").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	aString6877 = string.toLowerCase();
	string = "Unknown";
	try {
	    string = System.getProperty("os.arch").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	aString6876 = string.toLowerCase();
	string = "Unknown";
	try {
	    string = System.getProperty("os.version").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	string.toLowerCase();
	string = "~/";
	try {
	    string = System.getProperty("user.home").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	new File(string);
    }
}
