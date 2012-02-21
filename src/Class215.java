/* Class215 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Insets;

final class Class215
{
    static int anInt2834 = 0;
    static int anInt2835;
    static float aFloat2836;
    static int anInt2837;
    static int anInt2838;
    static int anInt2839;
    
    static final void method1580(byte i, boolean bool, int i_0_, int i_1_,
				 int i_2_, int i_3_) {
	if (Class34.aFrame476 != null
	    && (i_2_ != 3 || i_0_ != AbstractKeyboardListener.anInt4276
		|| i_3_ != Class239_Sub8.anInt5911)) {
	    LoadingStage.method527(Class34.aFrame476,
			      Class348_Sub23_Sub1.signlink, false);
	    Class34.aFrame476 = null;
	}
	anInt2839++;
	int i_4_ = -33 / ((-74 - i) / 51);
	if (i_2_ == 3 && Class34.aFrame476 == null) {
	    Class34.aFrame476
		= Class318_Sub1_Sub3_Sub4.method2463(i_3_, i_0_,
						     (Class348_Sub23_Sub1
						      .signlink),
						     0, 14199, 0);
	    if (Class34.aFrame476 != null) {
		AbstractKeyboardListener.anInt4276 = i_0_;
		Class239_Sub8.anInt5911 = i_3_;
		Class14_Sub2.method243(37);
	    }
	}
	if ((i_2_ ^ 0xffffffff) == -4 && Class34.aFrame476 == null)
	    method1580((byte) -126, true, -1, i_1_,
		       ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			   .aClass239_Sub8_7227.method1751(-32350),
		       -1);
	else {
	    java.awt.Container container;
	    if (Class34.aFrame476 != null) {
		Class348_Sub22.anInt6857 = i_3_;
		Class272.anInt3473 = i_0_;
		container = Class34.aFrame476;
	    } else if (ColorNode.aFrame4904 == null) {
		if (Class93.loaderApplet == null)
		    container = Class348_Sub40_Sub9.anApplet_Sub1_9169;
		else
		    container = Class93.loaderApplet;
		Class272.anInt3473 = container.getSize().width;
		Class348_Sub22.anInt6857 = container.getSize().height;
	    } else {
		Insets insets = ColorNode.aFrame4904.getInsets();
		Class272.anInt3473
		    = ColorNode.aFrame4904.getSize().width + (-insets.left
							    + -insets.right);
		Class348_Sub22.anInt6857
		    = ColorNode.aFrame4904.getSize().height - (insets.top
							     - -insets.bottom);
		container = ColorNode.aFrame4904;
	    }
	    if (i_2_ != 1)
		Class286_Sub5.method2158((byte) 56);
	    else {
		Class321.windowWidth = Class92.anInt1524;
		Class348_Sub42_Sub8_Sub2.windowHeight = DirectxToolkit.anInt7666;
		Class348_Sub48.anInt7129
		    = (Class272.anInt3473 + -Class92.anInt1524) / 2;
		Class335.anInt4167 = 0;
	    }
	    if (Class55_Sub1.aClass364_5271 != Class8.modeWhere) {
		if ((Class321.windowWidth ^ 0xffffffff) > -1025
		    && ((Class348_Sub42_Sub8_Sub2.windowHeight ^ 0xffffffff)
			> -769)) {
		    /* empty */
		}
	    }
	    if (bool)
		BufferedPacket.method3327(1406);
	    else {
		Class305.canvas.setSize(Class321.windowWidth,
					     (Class348_Sub42_Sub8_Sub2
					      .windowHeight));
		if (!Class59_Sub1.aBoolean5300)
		    Class348_Sub8.currentToolkit.method3669(Class305.canvas,
						     Class321.windowWidth,
						     (Class348_Sub42_Sub8_Sub2
						      .windowHeight));
		else
		    s.method3980(86, Class305.canvas);
		if (ColorNode.aFrame4904 == container) {
		    Insets insets = ColorNode.aFrame4904.getInsets();
		    Class305.canvas.setLocation((Class348_Sub48.anInt7129
						      + insets.left),
						     (insets.top
						      - -Class335.anInt4167));
		} else
		    Class305.canvas.setLocation(Class348_Sub48.anInt7129,
						     Class335.anInt4167);
	    }
	    if (i_2_ < 2)
		Class50_Sub1.aBoolean5219 = false;
	    else
		Class50_Sub1.aBoolean5219 = true;
	    if ((r.anInt9721 ^ 0xffffffff) != 0)
		Class239.method1713(true, 520);
	    if (Class348_Sub40_Sub8.gameConnection != null
		&& Class334.method2653(true, Class240.anInt4674))
		Class286_Sub2.method2145(-24498);
	    for (int i_5_ = 0; i_5_ < 100; i_5_++)
		Class152.aBooleanArray2076[i_5_] = true;
	    BufferedRasterizer.aBoolean4726 = true;
	}
    }
    
    static final boolean method1581(int i, char c) {
	anInt2838++;
	if (i >= -18)
	    return false;
	if (((c ^ 0xffffffff) > -66 || c > 90)
	    && (c < 97 || (c ^ 0xffffffff) < -123))
	    return false;
	return true;
    }
    
    static final void method1582(int i) {
	anInt2837++;
	if (i == 7851) {
	    do {
		try {
		    if ((Class348_Sub43.anInt7068 ^ 0xffffffff) == -2) {
			int i_6_ = Class98.aClass348_Sub16_Sub3_1564
				       .method2844((byte) 123);
			if ((i_6_ ^ 0xffffffff) < -1
			    && Class98.aClass348_Sub16_Sub3_1564
				   .method2860(124)) {
			    i_6_ -= Class239_Sub14.anInt5994;
			    if ((i_6_ ^ 0xffffffff) > -1)
				i_6_ = 0;
			    Class98.aClass348_Sub16_Sub3_1564.method2861(0,
									 i_6_);
			    break;
			}
			Class98.aClass348_Sub16_Sub3_1564.method2877(-128);
			Class98.aClass348_Sub16_Sub3_1564
			    .method2867(i ^ 0x1eaf);
			Class141.aClass26_1977 = null;
			if (Model.aClass45_1848 != null)
			    Class348_Sub43.anInt7068 = 2;
			else
			    Class348_Sub43.anInt7068 = 0;
			Class286.midiFile = null;
		    }
		    if (Class348_Sub43.anInt7068 != 3)
			break;
		    int i_7_ = Class98.aClass348_Sub16_Sub3_1564
				   .method2844((byte) -87);
		    if (i_7_ < Class58.anInt1059
			&& Class98.aClass348_Sub16_Sub3_1564.method2860(95)) {
			i_7_ += Class348_Sub40_Sub35.anInt9444;
			if ((i_7_ ^ 0xffffffff)
			    < (Class58.anInt1059 ^ 0xffffffff))
			    i_7_ = Class58.anInt1059;
			Class98.aClass348_Sub16_Sub3_1564
			    .method2861(i ^ 0x1eab, i_7_);
		    } else {
			Class348_Sub40_Sub35.anInt9444 = 0;
			Class348_Sub43.anInt7068 = 0;
		    }
		} catch (Exception exception) {
		    exception.printStackTrace();
		    Class98.aClass348_Sub16_Sub3_1564.method2877(-128);
		    Model.aClass45_1848 = null;
		    Class286.midiFile = null;
		    Class285.aClass348_Sub16_Sub3_4743 = null;
		    Class141.aClass26_1977 = null;
		    Class348_Sub43.anInt7068 = 0;
		    break;
		}
		break;
	    } while (false);
	}
    }
}
