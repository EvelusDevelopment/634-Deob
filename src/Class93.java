/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.awt.Canvas;

import jaggl.OpenGL;

final class Class93
{
    static int anInt1529;
    static Applet loaderApplet;
    static String[] aStringArray1531
	= { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
    static int anInt1532;
    static int anInt1533;
    static int anInt1534 = 0;
    
    public static void method861(int i) {
	aStringArray1531 = null;
	int i_0_ = 2 / ((i - 33) / 38);
	loaderApplet = null;
    }
    
    static final AbstractToolkit createOpenglToolkit(Canvas canvas, d var_d, IndexLoader loader, int i,
			      int i_1_) {
	try {
	    anInt1532++;
	    if (!Class9.method215(27165))
		throw new RuntimeException("");
	    if (!Class348_Sub40_Sub19.method3098(i ^ ~0x158f, "jaggl"))
		throw new RuntimeException("");
	    OpenGL opengl = new OpenGL();
	    long l = opengl.init(canvas, 8, 8, 8, 24, 0, i_1_);
	    if (l == 0L)
		throw new RuntimeException("");
	    if (i != 25542)
		return null;
	    OpenGlToolkit class377 = new OpenGlToolkit(opengl, canvas, l, var_d, loader, i_1_);
	    class377.method3930((byte) 26);
	    return class377;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("lt.D(" + (canvas != null ? "{...}" : "null") + ','
			+ (var_d != null ? "{...}" : "null") + ','
			+ (loader != null ? "{...}" : "null") + ',' + i + ','
			+ i_1_ + ')'));
	}
    }
    
    static final byte[] method863(int i, byte i_2_, byte[] is) {
	if (i_2_ < 64)
	    return null;
	anInt1529++;
	byte[] is_3_ = new byte[i];
	Class214.byteArrayCopy(is, 0, is_3_, 0, i);
	return is_3_;
    }
    
    static final byte[] method864(int i, byte[] is, int i_4_, int i_5_) {
	anInt1533++;
	if (i_5_ >= -30)
	    aStringArray1531 = null;
	byte[] is_6_ = new byte[i_4_];
	Class214.byteArrayCopy(is, i, is_6_, 0, i_4_);
	return is_6_;
    }
}
