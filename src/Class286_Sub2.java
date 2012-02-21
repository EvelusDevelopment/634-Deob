/* Class286_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class286_Sub2 extends Class286
{
    static int anInt6203;
    static int anInt6204;
    static String[] aStringArray6205 = new String[200];
    static int anInt6206;
    static int anInt6207;
    static int anInt6208;
    static int anInt6209;
    static int anInt6210;
    static int anInt6211;
    static int anInt6212;
    static int anInt6213;
    
    final void method2133(int i) {
	if (i < -75) {
	    ((Class286) this).aHa_Sub2_3684.method3804(false, (byte) -61);
	    anInt6211++;
	}
    }
    
    static final void handleMessage(String string, int type, int intArg,
				 String string_2_, String subStr,
				 String subStr2) {
	do {
	    try {
		Class318_Sub1_Sub3_Sub5.handleMessage(string, string_2_, -1, subStr,
						   null, type, intArg, subStr2);
		anInt6203++;
		aStringArray6205 = null;
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929
			  (runtimeexception,
			   ("di.G(" + (string != null ? "{...}" : "null") + ','
			    + type + ',' + intArg + ','
			    + (string_2_ != null ? "{...}" : "null") + ','
			    + (subStr != null ? "{...}" : "null") + ','
			    + (subStr2 != null ? "{...}" : "null") + ')'));
	    }
	    break;
	} while (false);
    }
    
    Class286_Sub2(DirectxToolkit var_ha_Sub2) {
	super(var_ha_Sub2);
    }
    
    static final void method2145(int i) {
	anInt6210++;
	GfxDefinition.anInt4494++;
	BufferedPacket class348_sub47
	    = Class286_Sub3.createBufferedPacket(Class59_Sub1.aClass351_5288,
				       Class348_Sub23_Sub2.outgoingGameIsaac);
	((BufferedPacket) class348_sub47).buffer
	    .putByte(Class348_Sub42_Sub12.method3229());
	((BufferedPacket) class348_sub47).buffer
	    .putShort(Class321.windowWidth);
	((BufferedPacket) class348_sub47).buffer
	    .putShort(Class348_Sub42_Sub8_Sub2.windowHeight);
	if (i != -24498)
	    aStringArray6205 = null;
	((BufferedPacket) class348_sub47).buffer.putByte
	    (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			.aClass239_Sub20_7248.method1808(-32350));
	Class348_Sub42_Sub14.putBufferedPacket(-101, class348_sub47);
    }
    
    final void method2140(Class258 class258, byte i, int i_5_) {
	anInt6206++;
	((Class286) this).aHa_Sub2_3684.method3771((byte) -80, class258);
	if (i >= -89)
	    method2136(-67, -39, (byte) 18);
	((Class286) this).aHa_Sub2_3684.method3761(0, i_5_);
    }
    
    static final void method2146(byte i) {
	int i_6_ = 34 % ((i - 32) / 38);
	anInt6213++;
	ClientScript.method3277((byte) -48);
	Class5_Sub1.aBoolean8335 = false;
	Class13.method226(Class135_Sub1.anInt4717, Class63.anInt1117,
			  Class348_Sub42_Sub5.anInt9532, 0,
			  Class237_Sub1.anInt5819);
    }
    
    final void method2136(int i, int i_7_, byte i_8_) {
	anInt6209++;
	if (i_8_ > -42)
	    method2133(35);
    }
    
    final boolean method2137(int i) {
	anInt6208++;
	if (i > -5)
	    anInt6212 = 1;
	return true;
    }
    
    public static void method2147(int i) {
	if (i != -1)
	    anInt6212 = -79;
	aStringArray6205 = null;
    }
    
    final void method2134(boolean bool, boolean bool_9_) {
	((Class286) this).aHa_Sub2_3684.method3804(true, (byte) -83);
	if (bool_9_ != false)
	    method2136(-78, 73, (byte) 12);
	anInt6204++;
    }
    
    final void method2139(boolean bool, byte i) {
	int i_10_ = 23 / ((-60 - i) / 38);
	anInt6207++;
    }
}
