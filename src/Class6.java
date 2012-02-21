/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class6
{
    short aShort143;
    int anInt144;
    boolean aBoolean145;
    short aShort146;
    static int anInt147;
    byte aByte148;
    static int anInt149;
    short aShort150;
    static Class227 aClass227_151 = new Class227(2);
    static int anInt152;
    static int anInt153;
    int anInt154;
    static int anInt155;
    byte aByte156;
    
    static final void method203(int i, int i_0_, int i_1_, int i_2_,
				int i_3_) {
	anInt149++;
	int i_4_ = 0;
	if (i > -92)
	    aClass227_151 = null;
	int i_5_ = i_3_;
	int i_6_ = -i_3_;
	int i_7_ = -1;
	int i_8_ = Whirlpool.method831(Class113.anInt1745, i_3_ + i_0_,
				     Class369.anInt4960, -108);
	int i_9_ = Whirlpool.method831(Class113.anInt1745, -i_3_ + i_0_,
				     Class369.anInt4960, 81);
	Class135_Sub2.method1156(-27, i_8_, AnimationDefinition.anIntArrayArray255[i_2_],
				 i_9_, i_1_);
	while (i_5_ > i_4_) {
	    i_7_ += 2;
	    i_6_ += i_7_;
	    if ((i_6_ ^ 0xffffffff) < -1) {
		i_5_--;
		i_6_ -= i_5_ << -1793741023;
		int i_10_ = -i_5_ + i_2_;
		int i_11_ = i_5_ + i_2_;
		if ((Class132.anInt1910 ^ 0xffffffff) >= (i_11_ ^ 0xffffffff)
		    && (i_10_ ^ 0xffffffff) >= (Class38.anInt513
						^ 0xffffffff)) {
		    int i_12_
			= Whirlpool.method831(Class113.anInt1745, i_4_ + i_0_,
					    Class369.anInt4960, 74);
		    int i_13_
			= Whirlpool.method831(Class113.anInt1745, i_0_ + -i_4_,
					    Class369.anInt4960, 98);
		    if (i_11_ <= Class38.anInt513)
			Class135_Sub2.method1156(-27, i_12_,
						 (AnimationDefinition.anIntArrayArray255
						  [i_11_]),
						 i_13_, i_1_);
		    if ((i_10_ ^ 0xffffffff)
			<= (Class132.anInt1910 ^ 0xffffffff))
			Class135_Sub2.method1156(-27, i_12_,
						 (AnimationDefinition.anIntArrayArray255
						  [i_10_]),
						 i_13_, i_1_);
		}
	    }
	    int i_14_ = -++i_4_ + i_2_;
	    int i_15_ = i_2_ - -i_4_;
	    if ((i_15_ ^ 0xffffffff) <= (Class132.anInt1910 ^ 0xffffffff)
		&& Class38.anInt513 >= i_14_) {
		int i_16_ = Whirlpool.method831(Class113.anInt1745, i_0_ + i_5_,
					      Class369.anInt4960, 52);
		int i_17_ = Whirlpool.method831(Class113.anInt1745, i_0_ + -i_5_,
					      Class369.anInt4960, -106);
		if ((Class38.anInt513 ^ 0xffffffff) <= (i_15_ ^ 0xffffffff))
		    Class135_Sub2.method1156(-27, i_16_,
					     AnimationDefinition.anIntArrayArray255[i_15_],
					     i_17_, i_1_);
		if ((Class132.anInt1910 ^ 0xffffffff) >= (i_14_ ^ 0xffffffff))
		    Class135_Sub2.method1156(-27, i_16_,
					     AnimationDefinition.anIntArrayArray255[i_14_],
					     i_17_, i_1_);
	    }
	}
    }
    
    static final void method204(int i) {
	anInt155++;
	while (Class299.gameBuffer
		   .method3415(-62, Class348_Sub40_Sub25.currentPacketSize)
	       >= 15) {
	    int i_18_
		= Class299.gameBuffer.method3410((byte) -24,
								15);
	    if ((i_18_ ^ 0xffffffff) == -32768)
		break;
	    boolean bool = false;
	    Class348_Sub22 class348_sub22
		= ((Class348_Sub22)
		   Class282.aClass356_3654.get((long) i_18_));
	    if (class348_sub22 == null) {
		Npc class318_sub1_sub3_sub3_sub1
		    = new Npc();
		((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub1)
		    .anInt10290
		    = i_18_;
		class348_sub22
		    = new Class348_Sub22(class318_sub1_sub3_sub3_sub1);
		Class282.aClass356_3654.putNode((long) i_18_,
						   class348_sub22);
		bool = true;
		Class348_Sub40_Sub23.aClass348_Sub22Array9319
		    [Class348_Sub32.anInt6930++]
		    = class348_sub22;
	    }
	    Npc class318_sub1_sub3_sub3_sub1
		= (((Class348_Sub22) class348_sub22)
		   .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
	    Class74.anIntArray1233[Class150.anInt2057++] = i_18_;
	    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub1).anInt10306
		= Class348_Sub23_Sub3.anInt9041;
	    if ((((Npc) class318_sub1_sub3_sub3_sub1)
		 .definition) != null
		&& ((Npc)
		    class318_sub1_sub3_sub3_sub1)
		       .definition.method793(0))
		Class5.method181(true, class318_sub1_sub3_sub3_sub1);
	    int i_19_
		= Class299.gameBuffer.method3410((byte) -24, 2);
	    int i_20_
		= Class299.gameBuffer.method3410((byte) -24, 1);
	    int i_21_
		= Class299.gameBuffer.method3410((byte) -24, 5);
	    if ((i_21_ ^ 0xffffffff) < -16)
		i_21_ -= 32;
	    int i_22_
		= Class299.gameBuffer.method3410((byte) -24, 5);
	    if ((i_22_ ^ 0xffffffff) < -16)
		i_22_ -= 32;
	    int i_23_
		= 0x3d01 & 4 + Class299.gameBuffer
				   .method3410((byte) -24, 3) << -724138005;
	    int i_24_
		= Class299.gameBuffer.method3410((byte) -24, 1);
	    if (i_24_ == 1)
		Class13.anIntArray224[Class101.anInt1597++] = i_18_;
	    class318_sub1_sub3_sub3_sub1.method2448
		((Class189.npcLoader.getNpcDefinition
		  (Class299.gameBuffer.method3410((byte) -24,
								 14),
		   -1)),
		 i ^ 0x2b297815);
	    class318_sub1_sub3_sub3_sub1.method2434
		((byte) 111, ((NpcDefinition) (((Npc)
					  class318_sub1_sub3_sub3_sub1)
					 .definition)).anInt1399);
	    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub1).anInt10310
		= (((NpcDefinition) ((Npc)
			       class318_sub1_sub3_sub3_sub1).definition)
		   .anInt1329) << -233569405;
	    if (bool)
		class318_sub1_sub3_sub3_sub1.method2435((byte) -108, i_23_,
							true);
	    class318_sub1_sub3_sub3_sub1.method2444
		((((Class318_Sub1_Sub3_Sub3)
		   Class132.localPlayer)
		  .anIntArray10317[0]) - -i_21_,
		 (i_20_ ^ 0xffffffff) == -2,
		 (((Class318_Sub1_Sub3_Sub3)
		   Class132.localPlayer)
		  .anIntArray10320[0]) + i_22_,
		 i + 724138125,
		 class318_sub1_sub3_sub3_sub1.method2436((byte) 50), i_19_);
	    if (((Npc) class318_sub1_sub3_sub3_sub1)
		    .definition.method793(0))
		Class223.method1614
		    (979190089, class318_sub1_sub3_sub3_sub1,
		     ((Class318_Sub1) class318_sub1_sub3_sub3_sub1).aByte6381,
		     (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub1)
		      .anIntArray10317[0]),
		     (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub1)
		      .anIntArray10320[0]),
		     null, null, 0);
	}
	if (i == -724138005)
	    Class299.gameBuffer.finalizeBitAccess(false);
    }
    
    static final void method205(int i, int i_25_, int i_26_, String string,
				int i_27_, int i_28_, int i_29_, int i_30_) {
	try {
	    anInt147++;
	    Class318_Sub5 class318_sub5 = new Class318_Sub5();
	    ((Class318_Sub5) class318_sub5).anInt6419 = i_25_;
	    ((Class318_Sub5) class318_sub5).anInt6418 = i_30_;
	    ((Class318_Sub5) class318_sub5).anInt6422 = i_29_;
	    ((Class318_Sub5) class318_sub5).anInt6421
		= i + Class367_Sub11.logicCycle;
	    if (i_28_ >= -48)
		method206(-90, -126, -8);
	    ((Class318_Sub5) class318_sub5).aString6416 = string;
	    ((Class318_Sub5) class318_sub5).anInt6415 = i_26_;
	    ((Class318_Sub5) class318_sub5).anInt6420 = i_27_;
	    Class225.aClass243_2957.method1869(-103, class318_sub5);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("go.F(" + i + ',' + i_25_ + ','
					     + i_26_ + ','
					     + (string != null ? "{...}"
						: "null")
					     + ',' + i_27_ + ',' + i_28_ + ','
					     + i_29_ + ',' + i_30_ + ')'));
	}
    }
    
    static final int method206(int i, int i_31_, int i_32_) {
	anInt152++;
	int i_33_ = i_31_ >>> 991466168;
	int i_34_ = -i_33_ + i_32_;
	i_31_ = (0xff0000 & (i_31_ & 0xff00) * i_33_
		 | (0xff00ff & i_31_) * i_33_ & ~0xff00ff) >>> 931628616;
	return i_31_ + (((i & 0xff00) * i_34_ & 0xff0000
			 | ~0xff00ff & (0xff00ff & i) * i_34_)
			>>> -658762712);
    }
    
    static final void drawConsole(AbstractToolkit toolkit) {
	do {
	    try {
		anInt153++;
		int widthOffset = 0;
		int heightOffset = 0;
		if (Class59_Sub1.aBoolean5300) {
		    widthOffset = s_Sub3.method4008((byte) -127);
		    heightOffset = Class16.method260(false);
		}
		toolkit.setDimensions(widthOffset, heightOffset, Class321.windowWidth + widthOffset, heightOffset + 350);
		toolkit.drawQuad(widthOffset, heightOffset, Class321.windowWidth, 350, 0x332277 | Class168.consoleAlpha << 24, 1);
		Class338.method2663(-5590, widthOffset, Class321.windowWidth + widthOffset, heightOffset, heightOffset + 350);
		int i_37_ = 350 / Class68.anInt1188;
		if ((Class369_Sub2.anInt8587 ^ 0xffffffff) < -1) {
		    int i_38_ = 342 - Class68.anInt1188;
		    int i_39_ = (i_37_ * i_38_ / (-1 + (i_37_ + Class369_Sub2.anInt8587)));
		    int i_40_ = 4;
		    if (Class369_Sub2.anInt8587 > 1)
			i_40_ += ((Class369_Sub2.anInt8587 + (-1 + -Class284.anInt3676)) * (i_38_ - i_39_)/(Class369_Sub2.anInt8587 + -1));
		    toolkit.drawQuad((Class321.windowWidth + widthOffset) - 16, heightOffset + i_40_, 12, i_39_, 0x332277 | Class168.consoleAlpha << 24, 2);
		    for (int i_41_ = Class284.anInt3676; (((i_37_ + Class284.anInt3676 ^ 0xffffffff) < (i_41_ ^ 0xffffffff)) && (i_41_ ^ 0xffffffff) > (Class369_Sub2.anInt8587 ^ 0xffffffff)); i_41_++) {
			String[] strings = (Class348_Sub40_Sub23.split('\010', Class286_Sub1.consoleMessages[i_41_]));
			int i_42_ = (-16 + Class321.windowWidth - 8) / strings.length;
			for (int i_43_ = 0; i_43_ < strings.length; i_43_++) {
			    int i_44_ = i_42_ * i_43_ + 8;
			    toolkit.setDimensions(widthOffset + i_44_, heightOffset, i_42_ + widthOffset - (-i_44_ - -8), heightOffset + 350);
			    GameApplet.p12fullFontRasterizer.drawString1(Class250.method1909((byte) 31, strings[i_43_]), -1, (-((-Class284.anInt3676 + i_41_) * Class68.anInt1188) + (-GraphicsFetcher.anInt9077 + heightOffset - (-350
					- (-2 + -(((BitmapFont)
						   Class246.p12fullBitmapFont)
						  .anInt1993))))),
				 widthOffset + i_44_, -16777216, -110);
			}
		    }
		}
		Class240.p11fullFontRasterizer.drawString0("Build: 634", 350 + (heightOffset + -20), -1, (Class321.windowWidth + widthOffset + -25), -121, -16777216);
		toolkit.setDimensions(widthOffset, heightOffset, widthOffset + Class321.windowWidth, heightOffset + 350);
		toolkit.drawSolidHorizontalLine((byte) -80, Class321.windowWidth, -GraphicsFetcher.anInt9077 + (350 + heightOffset), -1, widthOffset);
		Deque.b12fullFontRasterizer.drawString1
		    ("--> " + Class250.method1909((byte) 31,
						  Class363.aString4461),
		     -1,
		     (heightOffset
		      - (-350 + ((BitmapFont) Class369.b12FullBitmapFont).anInt1993)
		      - 1),
		     10 + widthOffset, -16777216, -127);
		if (!Class175.isWindowActive)
		    break;
		int i_45_ = -1;
		if (Class367_Sub11.logicCycle % 30 > 15)
		    i_45_ = 16777215;
		toolkit.drawSolidLine
		    (10 + (widthOffset
			   - -(Class369.b12FullBitmapFont.method1183
			       (true,
				"--> " + (Class250.method1909
					      ((byte) 31, Class363.aString4461)
					      .substring
					  (0, Class348_Sub38.anInt7006))))),
		     i_45_, 12,
		     350 + (heightOffset
			    + -((BitmapFont) Class369.b12FullBitmapFont).anInt1993
			    - 11),
		     true);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("go.B("
						 + (toolkit != null ? "{...}"
						    : "null")
						 +  ')'));
	    }
	    break;
	} while (false);
    }
    
    public static void method208(byte i) {
	if (i != 0)
	    method204(29);
	aClass227_151 = null;
    }
    
    Class6(int i, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_,
	   int i_51_, int i_52_, int i_53_, boolean bool, int i_54_) {
	((Class6) this).aBoolean145 = bool;
	((Class6) this).aByte156 = (byte) i_53_;
	((Class6) this).anInt154 = i_54_;
	((Class6) this).aShort143 = (short) i_50_;
	((Class6) this).aByte148 = (byte) i_52_;
	((Class6) this).aShort146 = (short) i_51_;
	((Class6) this).aShort150 = (short) i_49_;
	((Class6) this).anInt144 = i;
    }
}
