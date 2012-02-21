/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;

final class Class140
{
    static int anInt1956;
    static int anInt1957;
    static int anInt1958;
    static IncomingPacket aClass114_1959 = new IncomingPacket(81, 6);
    static int anInt1960;
    static OutgoingPacket aClass351_1961 = new OutgoingPacket(77, -1);
    static int anInt1962;
    
    static final void method1168(int i, int i_0_, Rectangle[] rectangles)
	throws ToolkitException {
	anInt1957++;
	if ((ByteBuffer.anInt7207 ^ 0xffffffff) != -2)
	    Class21.aHa326.method3707(rectangles, i, 0, 0);
	else
	    Class21.aHa326.method3707(rectangles, i, Class339.anInt4211,
				      Class348_Sub40_Sub8.anInt9157);
	if (i_0_ != 0)
	    aClass351_1961 = null;
    }
    
    public static void method1169(boolean bool) {
	aClass351_1961 = null;
	aClass114_1959 = null;
	if (bool != false)
	    aClass351_1961 = null;
    }
    
    static final void method1170(byte i) {
	anInt1956++;
	if (Class34.aFrame476 == null) {
	    int i_1_ = Class348_Sub48.anInt7129;
	    int i_2_ = Class335.anInt4167;
	    if (i > -25)
		method1172((byte) -22, -1);
	    int i_3_ = -i_1_ + -Class321.windowWidth + Class272.anInt3473;
	    int i_4_ = -i_2_ + (Class348_Sub22.anInt6857
				+ -Class348_Sub42_Sub8_Sub2.windowHeight);
	    do {
		if ((i_1_ ^ 0xffffffff) < -1 || (i_3_ ^ 0xffffffff) < -1
		    || (i_2_ ^ 0xffffffff) < -1 || (i_4_ ^ 0xffffffff) < -1) {
		    try {
			java.awt.Container container;
			if (ColorNode.aFrame4904 == null) {
			    if (Class93.loaderApplet == null)
				container
				    = Class348_Sub40_Sub9.anApplet_Sub1_9169;
			    else
				container = Class93.loaderApplet;
			} else
			    container = ColorNode.aFrame4904;
			int i_5_ = 0;
			int i_6_ = 0;
			if (container == ColorNode.aFrame4904) {
			    Insets insets = ColorNode.aFrame4904.getInsets();
			    i_5_ = insets.left;
			    i_6_ = insets.top;
			}
			Graphics graphics = container.getGraphics();
			graphics.setColor(Color.black);
			if (i_1_ > 0)
			    graphics.fillRect(i_5_, i_6_, i_1_,
					      Class348_Sub22.anInt6857);
			if (i_2_ > 0)
			    graphics.fillRect(i_5_, i_6_, Class272.anInt3473,
					      i_2_);
			if ((i_3_ ^ 0xffffffff) < -1)
			    graphics.fillRect((-i_3_ + Class272.anInt3473
					       + i_5_),
					      i_6_, i_3_,
					      Class348_Sub22.anInt6857);
			if (i_4_ <= 0)
			    break;
			graphics.fillRect(i_5_,
					  Class348_Sub22.anInt6857 + (i_6_
								      - i_4_),
					  Class272.anInt3473, i_4_);
		    } catch (Exception exception) {
			break;
		    }
		    break;
		}
	    } while (false);
	}
    }
    
    static final String method1171(int i, int i_7_, boolean bool) {
	if (i_7_ < 43)
	    return null;
	anInt1958++;
	if (!bool || (i ^ 0xffffffff) > -1)
	    return Integer.toString(i);
	return Class367_Sub9.method3551(8320, 10, i, bool);
    }
    
    static final boolean method1172(byte i, int i_8_) {
	anInt1960++;
	int i_9_ = 35 / ((-45 - i) / 38);
	if (((i_8_ ^ 0xffffffff) > -1 || i_8_ > 3)
	    && (i_8_ ^ 0xffffffff) != -10)
	    return false;
	return true;
    }
}
