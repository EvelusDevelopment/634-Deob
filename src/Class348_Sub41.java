/* Class348_Sub41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub41 extends Node
{
    static int anInt7046;
    static int anInt7047;
    static String aString7048;
    static int anInt7049;
    int anInt7050;
    static int anInt7051;
    static IncomingPacket aClass114_7052 = new IncomingPacket(86, 6);
    int anInt7053;
    static int anInt7054;
    static int anInt7055;
    /*synthetic*/ static Class aClass7056;
    
    static final boolean method3154(int i, int i_0_, int i_1_, int i_2_,
				    byte[] is, byte i_3_) {
	anInt7047++;
	if (i_3_ != 39)
	    aClass114_7052 = null;
	boolean bool = true;
	ByteBuffer class348_sub49 = new ByteBuffer(is);
	int i_4_ = -1;
	for (;;) {
	    int i_5_ = class348_sub49.method3334(107);
	    if (i_5_ == 0)
		break;
	    i_4_ += i_5_;
	    int i_6_ = 0;
	    boolean bool_7_ = false;
	    for (;;) {
		if (bool_7_) {
		    int i_8_ = class348_sub49.getSmartA();
		    if (i_8_ == 0)
			break;
		    class348_sub49.getUByte();
		} else {
		    int i_9_ = class348_sub49.getSmartA();
		    if (i_9_ == 0)
			break;
		    i_6_ += -1 + i_9_;
		    int i_10_ = i_6_ & 0x3f;
		    int i_11_ = i_6_ >> -131632442 & 0x3f;
		    int i_12_ = class348_sub49.getUByte() >> 1964747714;
		    int i_13_ = i_11_ - -i_0_;
		    int i_14_ = i_2_ + i_10_;
		    if (i_13_ > 0 && i_14_ > 0 && i_13_ < -1 + i
			&& (i_14_ ^ 0xffffffff) > (-1 + i_1_ ^ 0xffffffff)) {
			ObjectDefinition class51 = Class348_Sub40_Sub12
					      .objectLoader
					      .getObject(0, i_4_);
			if (i_12_ != 22
			    || ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
				   .aClass239_Sub4_7220.method1737(-32350) != 0
			    || ((ObjectDefinition) class51).anInt874 != 0
			    || ((((ObjectDefinition) class51).anInt920 ^ 0xffffffff)
				== -2)
			    || ((ObjectDefinition) class51).aBoolean947) {
			    bool_7_ = true;
			    if (!class51.method485(9773)) {
				Class154.anInt2101++;
				bool = false;
			    }
			}
		    }
		}
	    }
	}
	return bool;
    }
    
    public static void method3155(int i) {
	aString7048 = null;
	aClass114_7052 = null;
	if (i != -5)
	    anInt7054 = 110;
    }
    
    static final int method3156(boolean bool, String string) {
	anInt7055++;
	if (bool != true)
	    aClass114_7052 = null;
	return Class239_Sub26.method1836(-123, 10, true, string);
    }
    
    static final void method3157(int i, byte i_15_, int i_16_, int i_17_,
				 boolean bool) {
	anInt7049++;
	if (bool || i_16_ != AbstractToolkit.anInt4581
	    || (i ^ 0xffffffff) != (Class327.anInt4095 ^ 0xffffffff)
	    || (Class355.anInt4372 != Class167.anInt2204
		&& ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		       .aClass239_Sub27_7261.method1840(-32350) != 1)) {
	    AbstractToolkit.anInt4581 = i_16_;
	    Class327.anInt4095 = i;
	    Class167.anInt2204 = Class355.anInt4372;
	    if (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		    .aClass239_Sub27_7261.method1840(-32350)
		== 1)
		Class167.anInt2204 = 0;
	    ByteBuffer.setClientState(2, i_17_);
	    Class362.method3511(true, GameApplet.p12fullFontRasterizer,
				Class246.p12fullBitmapFont,
				GameText.loadingPleaseWaitGameText
				    .getLanguageText(Class348_Sub33.gameLanguage),
				2, Class348_Sub8.currentToolkit);
	    int i_18_ = za_Sub2.anInt9780;
	    int i_19_ = Class90.anInt1517;
	    za_Sub2.anInt9780
		= (-(Class367_Sub4.anInt7319 >> 22403844) + AbstractToolkit.anInt4581) * 8;
	    Class90.anInt1517
		= 8 * (Class327.anInt4095
		       - (Class348_Sub40_Sub3.anInt9109 >> 809039044));
	    Class348_Sub26.aClass348_Sub42_Sub14_6885
		= Class75.method766(AbstractToolkit.anInt4581 * 8, Class327.anInt4095 * 8);
	    r_Sub2.aClass252_10488 = null;
	    int i_20_ = za_Sub2.anInt9780 - i_18_;
	    int i_21_ = -i_19_ + Class90.anInt1517;
	    if (i_17_ == 11) {
		for (int i_22_ = 0; Class348_Sub32.anInt6930 > i_22_;
		     i_22_++) {
		    Class348_Sub22 class348_sub22
			= Class348_Sub40_Sub23.aClass348_Sub22Array9319[i_22_];
		    if (class348_sub22 != null) {
			Npc class318_sub1_sub3_sub3_sub1
			    = (((Class348_Sub22) class348_sub22)
			       .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
			for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > -11;
			     i_23_++) {
			    ((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub1)
				.anIntArray10320[i_23_]
				-= i_20_;
			    ((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub1)
				.anIntArray10317[i_23_]
				-= i_21_;
			}
			((Class318_Sub1) class318_sub1_sub3_sub3_sub1)
			    .anInt6388
			    -= i_21_ * 512;
			((Class318_Sub1) class318_sub1_sub3_sub3_sub1)
			    .anInt6377
			    -= i_20_ * 512;
		    }
		}
	    } else {
		Class150.anInt2057 = 0;
		boolean bool_24_ = false;
		int i_25_ = Class367_Sub4.anInt7319 * 512 - 512;
		int i_26_ = 512 * (-1 + Class348_Sub40_Sub3.anInt9109);
		for (int i_27_ = 0;
		     ((i_27_ ^ 0xffffffff)
		      > (Class348_Sub32.anInt6930 ^ 0xffffffff));
		     i_27_++) {
		    Class348_Sub22 class348_sub22
			= Class348_Sub40_Sub23.aClass348_Sub22Array9319[i_27_];
		    if (class348_sub22 != null) {
			Npc class318_sub1_sub3_sub3_sub1
			    = (((Class348_Sub22) class348_sub22)
			       .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
			((Class318_Sub1) class318_sub1_sub3_sub3_sub1)
			    .anInt6388
			    -= 512 * i_21_;
			((Class318_Sub1) class318_sub1_sub3_sub3_sub1)
			    .anInt6377
			    -= 512 * i_20_;
			if ((((Class318_Sub1) class318_sub1_sub3_sub3_sub1)
			     .anInt6377) < 0
			    || ((((Class318_Sub1) class318_sub1_sub3_sub3_sub1)
				 .anInt6377)
				^ 0xffffffff) < (i_25_ ^ 0xffffffff)
			    || (((Class318_Sub1) class318_sub1_sub3_sub3_sub1)
				.anInt6388) < 0
			    || i_26_ < (((Class318_Sub1)
					 class318_sub1_sub3_sub3_sub1)
					.anInt6388)) {
			    class318_sub1_sub3_sub3_sub1.method2448(null, -2);
			    class348_sub22.removeNode();
			    bool_24_ = true;
			} else {
			    boolean bool_28_ = true;
			    for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > -11;
				 i_29_++) {
				((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3_sub1)
				    .anIntArray10320[i_29_]
				    -= i_20_;
				((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3_sub1)
				    .anIntArray10317[i_29_]
				    -= i_21_;
				if ((((Class318_Sub1_Sub3_Sub3)
				      class318_sub1_sub3_sub3_sub1)
				     .anIntArray10320[i_29_]) < 0
				    || ((Class367_Sub4.anInt7319 ^ 0xffffffff)
					>= ((((Class318_Sub1_Sub3_Sub3)
					      class318_sub1_sub3_sub3_sub1)
					     .anIntArray10320[i_29_])
					    ^ 0xffffffff))
				    || ((((Class318_Sub1_Sub3_Sub3)
					  class318_sub1_sub3_sub3_sub1)
					 .anIntArray10317[i_29_])
					^ 0xffffffff) > -1
				    || (((((Class318_Sub1_Sub3_Sub3)
					   class318_sub1_sub3_sub3_sub1)
					  .anIntArray10317[i_29_])
					 ^ 0xffffffff)
					<= (Class348_Sub40_Sub3.anInt9109
					    ^ 0xffffffff)))
				    bool_28_ = false;
			    }
			    if (!bool_28_) {
				class318_sub1_sub3_sub3_sub1.method2448(null,
									-2);
				bool_24_ = true;
				class348_sub22.removeNode();
			    } else
				Class74.anIntArray1233[Class150.anInt2057++]
				    = (((Class318_Sub1_Sub3_Sub3)
					class318_sub1_sub3_sub3_sub1)
				       .anInt10290);
			}
		    }
		}
		if (bool_24_) {
		    Class348_Sub32.anInt6930
			= Class282.aClass356_3654.method3474(1);
		    Class282.aClass356_3654.method3477
			(3, Class348_Sub40_Sub23.aClass348_Sub22Array9319);
		}
	    }
	    if (i_15_ > 122) {
		for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > -2049; i_30_++) {
		    Player class318_sub1_sub3_sub3_sub2
			= (ClassicLoadingScreen.players
			   [i_30_]);
		    if (class318_sub1_sub3_sub3_sub2 != null) {
			for (int i_31_ = 0; i_31_ < 10; i_31_++) {
			    ((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub2)
				.anIntArray10320[i_31_]
				-= i_20_;
			    ((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub2)
				.anIntArray10317[i_31_]
				-= i_21_;
			}
			((Class318_Sub1) class318_sub1_sub3_sub3_sub2)
			    .anInt6377
			    -= i_20_ * 512;
			((Class318_Sub1) class318_sub1_sub3_sub3_sub2)
			    .anInt6388
			    -= 512 * i_21_;
		    }
		}
		Class302[] class302s = Class348_Sub27.aClass302Array6897;
		for (int i_32_ = 0;
		     (i_32_ ^ 0xffffffff) > (class302s.length ^ 0xffffffff);
		     i_32_++) {
		    Class302 class302 = class302s[i_32_];
		    if (class302 != null) {
			((Class302) class302).anInt3832 -= i_21_ * 512;
			((Class302) class302).anInt3835 -= 512 * i_20_;
		    }
		}
		for (Class348_Sub27 class348_sub27
			 = ((Class348_Sub27)
			    Class348_Sub42_Sub20.aClass262_9711.getFirst(4));
		     class348_sub27 != null;
		     class348_sub27
			 = (Class348_Sub27) Class348_Sub42_Sub20
						.aClass262_9711
						.nextForward((byte) 68)) {
		    ((Class348_Sub27) class348_sub27).anInt6896 -= i_21_;
		    ((Class348_Sub27) class348_sub27).anInt6905 -= i_20_;
		    if ((Class312.anInt3931 ^ 0xffffffff) != -5
			&& (((Class348_Sub27) class348_sub27).anInt6905 < 0
			    || ((Class348_Sub27) class348_sub27).anInt6896 < 0
			    || ((Class367_Sub4.anInt7319 ^ 0xffffffff)
				>= (((Class348_Sub27) class348_sub27).anInt6905
				    ^ 0xffffffff))
			    || (Class348_Sub40_Sub3.anInt9109
				<= (((Class348_Sub27) class348_sub27)
				    .anInt6896))))
			class348_sub27.removeNode();
		}
		if ((Class312.anInt3931 ^ 0xffffffff) != -5) {
		    for (Class348_Sub37 class348_sub37
			     = ((Class348_Sub37)
				Class130.aClass356_1895.method3484(0));
			 class348_sub37 != null;
			 class348_sub37
			     = ((Class348_Sub37)
				Class130.aClass356_1895.method3482(0))) {
			int i_33_
			    = (int) (0x3fffL
				     & ((Node) class348_sub37).nodeKey);
			int i_34_ = -za_Sub2.anInt9780 + i_33_;
			int i_35_
			    = (int) (0x3fffL
				     & (((Node) class348_sub37).nodeKey
					>> -1372612402));
			int i_36_ = i_35_ + -Class90.anInt1517;
			if ((i_34_ ^ 0xffffffff) > -1
			    || (i_36_ ^ 0xffffffff) > -1
			    || ((Class367_Sub4.anInt7319 ^ 0xffffffff)
				>= (i_34_ ^ 0xffffffff))
			    || i_36_ >= Class348_Sub40_Sub3.anInt9109)
			    class348_sub37.removeNode();
		    }
		}
		if ((OndemandWorker.anInt3203 ^ 0xffffffff) != -1) {
		    OndemandWorker.anInt3203 -= i_20_;
		    Class97.anInt1548 -= i_21_;
		}
		Class348_Sub17.method2928(true);
		if ((i_17_ ^ 0xffffffff) != -12) {
		    Class275.anInt3550 -= i_21_;
		    Class286_Sub4.anInt6246 -= 512 * i_20_;
		    GameFont.anInt4336 -= i_20_;
		    Class281.anInt3647 -= i_21_;
		    Class348_Sub35.anInt6981 -= i_20_;
		    Class59_Sub2_Sub2.anInt8685 -= 512 * i_21_;
		    if (((Math.abs(i_20_) ^ 0xffffffff)
			 < (Class367_Sub4.anInt7319 ^ 0xffffffff))
			|| Math.abs(i_21_) > Class348_Sub40_Sub3.anInt9109)
			Class76.method773(true);
		} else if ((Class348_Sub40_Sub21.anInt9282 ^ 0xffffffff)
			   == -5) {
		    Class348_Sub7.anInt6652 -= i_21_ * 512;
		    Class130_Sub1.anInt5799 -= i_20_ * 512;
		    Class192.anInt2578 -= 512 * i_21_;
		    Class348_Sub6.anInt6633 -= i_20_ * 512;
		} else {
		    Class348_Sub40_Sub21.anInt9282 = 1;
		    Class9.anInt167 = Class318_Sub1_Sub5_Sub2.anInt10163 = -1;
		}
		Class348_Sub40_Sub39.method3153(0);
		Class50_Sub2.method464(-1);
		r_Sub2.aClass262_10492.removeAll(107);
		Class348_Sub40_Sub17.aClass262_9240.removeAll(103);
		Class225.aClass243_2957.method1876((byte) -45);
		Class250.method1911((byte) 99);
	    }
	}
    }
    
    static final byte[] unpackFileContainer(byte[] is, int i) {
	anInt7046++;
	ByteBuffer class348_sub49 = new ByteBuffer(is);
	int i_37_ = class348_sub49.getUByte();
	if (i > -74)
	    method3156(true, null);
	int i_38_ = class348_sub49.getDWord();
	if (i_38_ < 0
	    || (HandshakePacket.anInt401 != 0
		&& (HandshakePacket.anInt401 ^ 0xffffffff) > (i_38_ ^ 0xffffffff)))
	    throw new RuntimeException();
	if (i_37_ != 0) {
	    int i_39_ = class348_sub49.getDWord();
	    if (i_39_ < 0
		|| ((HandshakePacket.anInt401 ^ 0xffffffff) != -1
		    && (HandshakePacket.anInt401 ^ 0xffffffff) > (i_39_ ^ 0xffffffff)))
		throw new RuntimeException();
	    byte[] is_40_ = new byte[i_39_];
	    if (i_37_ == 1)
		Class212.method1547(is_40_, i_39_, is, i_38_, 9);
	    else {
		synchronized (Class348_Sub33.aClass152_6955) {
		    Class348_Sub33.aClass152_6955.method1218(is_40_, 29123,
							     class348_sub49);
		}
	    }
	    return is_40_;
	}
	byte[] is_41_ = new byte[i_38_];
	class348_sub49.getBytes(is_41_, 0, i_38_);
	return is_41_;
    }
    
    static final void method3159(int i, int i_42_, boolean bool, int i_43_,
				 int i_44_, int i_45_, AbstractToolkit var_ha, int i_46_,
				 int i_47_) {
	anInt7051++;
	Interface10 interface10
	    = (Interface10) r_Sub2.method3297(i_43_, i_45_, i_44_);
	if (interface10 != null) {
	    ObjectDefinition class51 = Class348_Sub40_Sub12.objectLoader
				  .getObject(0, interface10.method42(-124));
	    int i_48_ = 0x3 & interface10.method41(-32228);
	    int i_49_ = interface10.method39(35);
	    if ((((ObjectDefinition) class51).anInt875 ^ 0xffffffff) != 0)
		RequiredElement.method2028(i_46_, class51, i_42_, var_ha, i_48_, 126);
	    else {
		int i_50_ = i_47_;
		if ((((ObjectDefinition) class51).anInt874 ^ 0xffffffff) < -1)
		    i_50_ = i;
		if ((i_49_ ^ 0xffffffff) == -1 || (i_49_ ^ 0xffffffff) == -3) {
		    if (i_48_ != 0) {
			if ((i_48_ ^ 0xffffffff) == -2)
			    var_ha.drawSolidHorizontalLine((byte) -79, 4, i_42_, i_50_,
					      i_46_);
			else if (i_48_ == 2)
			    var_ha.drawSolidLine(3 + i_46_, i_50_, 4, i_42_,
					      true);
			else if ((i_48_ ^ 0xffffffff) == -4)
			    var_ha.drawSolidHorizontalLine((byte) -121, 4, i_42_ + 3, i_50_,
					      i_46_);
		    } else
			var_ha.drawSolidLine(i_46_, i_50_, 4, i_42_, !bool);
		}
		if (i_49_ == 3) {
		    if ((i_48_ ^ 0xffffffff) != -1) {
			if ((i_48_ ^ 0xffffffff) == -2)
			    var_ha.method3675(1, (byte) -125, 3 + i_46_, i_42_,
					      1, i_50_);
			else if ((i_48_ ^ 0xffffffff) != -3) {
			    if (i_48_ == 3)
				var_ha.method3675(1, (byte) -125, i_46_,
						  3 + i_42_, 1, i_50_);
			} else
			    var_ha.method3675(1, (byte) -125, 3 + i_46_,
					      3 + i_42_, 1, i_50_);
		    } else
			var_ha.method3675(1, (byte) -125, i_46_, i_42_, 1,
					  i_50_);
		}
		if ((i_49_ ^ 0xffffffff) == -3) {
		    if ((i_48_ ^ 0xffffffff) != -1) {
			if (i_48_ == 1)
			    var_ha.drawSolidLine(3 + i_46_, i_50_, 4, i_42_,
					      true);
			else if (i_48_ != 2) {
			    if ((i_48_ ^ 0xffffffff) == -4)
				var_ha.drawSolidLine(i_46_, i_50_, 4, i_42_,
						  true);
			} else
			    var_ha.drawSolidHorizontalLine((byte) -106, 4, 3 + i_42_, i_50_,
					      i_46_);
		    } else
			var_ha.drawSolidHorizontalLine((byte) -96, 4, i_42_, i_50_, i_46_);
		}
	    }
	}
	if (bool != false)
	    anInt7054 = 122;
	interface10 = ((Interface10)
		       Class177.method1353(i_43_, i_45_, i_44_,
					   (aClass7056 != null ? aClass7056
					    : (aClass7056
					       = method3160("Interface10")))));
	if (interface10 != null) {
	    ObjectDefinition class51 = Class348_Sub40_Sub12.objectLoader
				  .getObject(0, interface10.method42(-88));
	    int i_51_ = interface10.method41(-32228) & 0x3;
	    int i_52_ = interface10.method39(-126);
	    if ((((ObjectDefinition) class51).anInt875 ^ 0xffffffff) != 0)
		RequiredElement.method2028(i_46_, class51, i_42_, var_ha, i_51_, -86);
	    else if (i_52_ == 9) {
		int i_53_ = -1118482;
		if (((ObjectDefinition) class51).anInt874 > 0)
		    i_53_ = -1179648;
		if (i_51_ != 0 && i_51_ != 2)
		    var_ha.method3645(i_42_, i_46_, 3 + i_46_, -8003, i_53_,
				      i_42_ + 3);
		else
		    var_ha.method3645(i_42_ + 3, i_46_, 3 + i_46_, -8003,
				      i_53_, i_42_);
	    }
	}
	interface10
	    = (Interface10) Class348_Sub16_Sub3.method2878(i_43_, i_45_,
							   i_44_);
	if (interface10 != null) {
	    ObjectDefinition class51 = Class348_Sub40_Sub12.objectLoader
				  .getObject(0, interface10.method42(-118));
	    int i_54_ = interface10.method41(-32228) & 0x3;
	    if ((((ObjectDefinition) class51).anInt875 ^ 0xffffffff) != 0)
		RequiredElement.method2028(i_46_, class51, i_42_, var_ha, i_54_, -5);
	}
    }
    
    public Class348_Sub41() {
	/* empty */
    }
    
    /*synthetic*/ static Class method3160(String string) {
	try {
	    return Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
