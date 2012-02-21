/* WidgetVariable - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

import jaggl.OpenGL;

final class WidgetVariable extends SubNode
{
    static int anInt9646;
    static int anInt9647;
    static int anInt9648;
    static int anInt9649;
    int anInt9650;
    int anInt9651;
    int intArg;
    static int anInt9653;
    String aString9654;
    static int anInt9655;
    static int anInt9656;
    static BigInteger aBigInteger9657
	= (new BigInteger
	   ("89f018c88a15e33ac48c69b4ccb7c0507852aaf8d4acaddf48e0350253bd68b20ad2e0154f1fee2f4c11f6b32324a63ca9923c630fc44e1c1f14d97fa18850a9f30a0eb030add40e7abcb977ffd1a6c9fce8c7f01a8ac20a9f86aad657fdf2584e20a84369b1d44cb7bb4f107dd897f9b42de1bf158d4c1d5d73c7750ea12a75",
	    16));
    static RasterToolkit aClass105_9658;
    static RasterToolkit aClass105_9659;
    static LoadingStage currentLoadingStage;
    
    final int getType(boolean bool) {
	anInt9646++;
	if (bool != true)
	    getId(-60);
	return (int) (((Node) this).nodeKey >>> 32 & 0xffL);
    }
    
    final void method3246(int i) {
	((SubNode) this).subnodeKey |= ~0x7fffffffffffffffL;
	anInt9653++;
	if (method3250((byte) -89) == 0L)
	    Class367_Sub4.aClass107_7325.add(this);
	if (i != -25490)
	    aClass105_9659 = null;
    }
    
    public static void method3247(int i) {
	if (i > -49)
	    method3247(49);
	currentLoadingStage = null;
	aClass105_9658 = null;
	aClass105_9659 = null;
	aBigInteger9657 = null;
    }
    
    final int getId(int i) {
	if (i != 1)
	    return -110;
	anInt9647++;
	return (int) ((Node) this).nodeKey;
    }
    
    static final Class242 method3249(int i, int i_0_, DirectxToolkit var_ha_Sub2,
				     String string) {
	try {
	    anInt9656++;
	    int i_1_ = -89 / ((29 - i_0_) / 47);
	    long l = OpenGL.glCreateShaderObjectARB(i);
	    OpenGL.glShaderSourceARB(l, string);
	    OpenGL.glCompileShaderARB(l);
	    OpenGL.glGetObjectParameterivARB(l, 35713, (Class348_Sub42_Sub4
							.anIntArray9519), 0);
	    if ((Class348_Sub42_Sub4.anIntArray9519[0] ^ 0xffffffff) == -1) {
		if (Class348_Sub42_Sub4.anIntArray9519[0] == 0)
		    System.out.println("Shader compile failed:");
		OpenGL.glGetObjectParameterivARB(l, 35716,
						 (Class348_Sub42_Sub4
						  .anIntArray9519),
						 1);
		if ((Class348_Sub42_Sub4.anIntArray9519[1] ^ 0xffffffff)
		    < -2) {
		    byte[] is
			= new byte[Class348_Sub42_Sub4.anIntArray9519[1]];
		    OpenGL.glGetInfoLogARB(l,
					   (Class348_Sub42_Sub4.anIntArray9519
					    [1]),
					   Class348_Sub42_Sub4.anIntArray9519,
					   0, is, 0);
		    System.out.println(new String(is));
		}
		if ((Class348_Sub42_Sub4.anIntArray9519[0] ^ 0xffffffff)
		    == -1) {
		    OpenGL.glDeleteObjectARB(l);
		    return null;
		}
	    }
	    return new Class242(var_ha_Sub2, l, i);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("et.G(" + i + ',' + i_0_ + ','
					     + (var_ha_Sub2 != null ? "{...}"
						: "null")
					     + ','
					     + (string != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    final long method3250(byte i) {
	anInt9649++;
	if (i >= -37)
	    method3250((byte) 79);
	return ((SubNode) this).subnodeKey & 0x7fffffffffffffffL;
    }
    
    WidgetVariable(int i, int i_2_) {
	((Node) this).nodeKey = (long) i << -1165915296 | (long) i_2_;
    }
    
    final void method3251(int i) {
	anInt9648++;
	((SubNode) this).subnodeKey
	    = (~0x7fffffffffffffffL & ((SubNode) this).subnodeKey
	       | Class62.getCurrentTimeMillis() + 500L);
	s_Sub2.aClass107_8241.add(this);
	if (i != -16058)
	    aClass105_9658 = null;
    }
}
