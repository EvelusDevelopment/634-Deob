/* Class135 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

import jaclib.memory.Buffer;

import jaggl.OpenGL;

abstract class Class135
{
    private int anInt1921;
    static int anInt1922;
    private boolean aBoolean1923;
    static int anInt1924;
    static int anInt1925;
    static int anInt1926;
    DirectxToolkit aHa_Sub2_1927;
    static Color[] aColorArray1928
	= { new Color(9179409), new Color(3289650), new Color(3289650),
	    new Color(3289650) };
    int anInt1929;
    private int anInt1930;
    
    static final void method1148(int i, int i_0_) {
	anInt1925++;
	WidgetVariable class348_sub42_sub15
	    = Class318_Sub9_Sub1.method2516(i, (byte) 105, i_0_);
	class348_sub42_sub15.method3251(i_0_ ^ ~0x3ebf);
    }
    
    public static void method1149(int i) {
	int i_1_ = -90 / ((-50 - i) / 37);
	aColorArray1928 = null;
    }
    
    final void method1150(byte[] is, int i, int i_2_) {
	anInt1926++;
	if (i != 0)
	    method1148(-47, 124);
	method1152(i ^ ~0x74);
	if (anInt1921 >= i_2_)
	    OpenGL.glBufferSubDataARBub(anInt1930, 0, i_2_, is, 0);
	else {
	    OpenGL.glBufferDataARBub(anInt1930, i_2_, is, 0,
				     !aBoolean1923 ? 35044 : 35040);
	    ((DirectxToolkit) ((Class135) this).aHa_Sub2_1927).anInt7747
		+= -anInt1921 + i_2_;
	    anInt1921 = i_2_;
	}
    }
    
    protected final void finalize() throws Throwable {
	anInt1922++;
	((Class135) this).aHa_Sub2_1927
	    .method3780(anInt1921, -1, ((Class135) this).anInt1929);
	super.finalize();
    }
    
    static final BitmapFont createBitmapFont(int i, AbstractToolkit var_ha, int i_3_) {
	anInt1924++;
	if (i != -25411)
	    return null;
	GameFont class352
	    = Class239_Sub3.createGameFont(i_3_, var_ha, (byte) -81, true);
	if (class352 == null)
	    return null;
	return ((GameFont) class352).bitmapFont;
    }
    
    abstract void method1152(int i);
    
    Class135(DirectxToolkit var_ha_Sub2, int i, byte[] is, int i_4_, boolean bool) {
	try {
	    aBoolean1923 = bool;
	    ((Class135) this).aHa_Sub2_1927 = var_ha_Sub2;
	    anInt1930 = i;
	    anInt1921 = i_4_;
	    OpenGL.glGenBuffersARB(1, r_Sub1.anIntArray10478, 0);
	    ((Class135) this).anInt1929 = r_Sub1.anIntArray10478[0];
	    method1152(-111);
	    OpenGL.glBufferDataARBub(i, anInt1921, is, 0,
				     aBoolean1923 ? 35040 : 35044);
	    ((DirectxToolkit) ((Class135) this).aHa_Sub2_1927).anInt7747 += anInt1921;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("bi.<init>("
					     + (var_ha_Sub2 != null ? "{...}"
						: "null")
					     + ',' + i + ','
					     + (is != null ? "{...}" : "null")
					     + ',' + i_4_ + ',' + bool + ')'));
	}
    }
    
    Class135(DirectxToolkit var_ha_Sub2, int i, Buffer buffer, int i_5_,
	     boolean bool) {
	try {
	    anInt1930 = i;
	    anInt1921 = i_5_;
	    ((Class135) this).aHa_Sub2_1927 = var_ha_Sub2;
	    aBoolean1923 = bool;
	    OpenGL.glGenBuffersARB(1, r_Sub1.anIntArray10478, 0);
	    ((Class135) this).anInt1929 = r_Sub1.anIntArray10478[0];
	    method1152(-126);
	    OpenGL.glBufferDataARBa(i, anInt1921, buffer.getAddress(),
				    !aBoolean1923 ? 35044 : 35040);
	    ((DirectxToolkit) ((Class135) this).aHa_Sub2_1927).anInt7747 += anInt1921;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("bi.<init>("
					     + (var_ha_Sub2 != null ? "{...}"
						: "null")
					     + ',' + i + ','
					     + (buffer != null ? "{...}"
						: "null")
					     + ',' + i_5_ + ',' + bool + ')'));
	}
    }
}
