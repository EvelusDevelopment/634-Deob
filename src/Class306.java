/* Class306 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

final class Class306
{
    static int anInt3872 = -1;
    static int[] anIntArray3873 = new int[13];
    static int anInt3874;
    static int anInt3875;
    static int anInt3876;
    
    static final AbstractToolkit createSafeToolkit(int i, int i_0_, d var_d, Canvas canvas,
			       int i_1_) {
	try {
	    if (i != -6)
		createSafeToolkit(23, -44, null, null, -57);
	    anInt3875++;
	    return new SafeToolkit(canvas, var_d, i_1_, i_0_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ws.C(" + i + ',' + i_0_ + ','
					     + (var_d != null ? "{...}"
						: "null")
					     + ','
					     + (canvas != null ? "{...}"
						: "null")
					     + ',' + i_1_ + ')'));
	}
    }
    
    static final void method2298(byte i, String string) {
	anInt3876++;
	if (Class169.aClass19Array2261 != null) {
	    Class119_Sub1.anInt4698++;
	    BufferedPacket class348_sub47
		= Class286_Sub3.createBufferedPacket(Class357.aClass351_4405,
					   Class348_Sub23_Sub2.outgoingGameIsaac);
	    ((BufferedPacket) class348_sub47).buffer
		.putByte(Class239_Sub6.getStringLength(string, -65));
	    ((BufferedPacket) class348_sub47).buffer
		.putJStr((byte) -5, string);
	    if (i > -50)
		createSafeToolkit(104, 26, null, null, -19);
	    Class348_Sub42_Sub14.putBufferedPacket(-43, class348_sub47);
	}
    }
    
    public static void method2299(byte i) {
	anIntArray3873 = null;
	if (i != -128)
	    createSafeToolkit(66, -48, null, null, 100);
    }
}
