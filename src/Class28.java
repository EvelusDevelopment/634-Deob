/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class28 implements Interface15
{
    static int anInt4996;
    static Class223 aClass223_4997 = new Class223(6, 1);
    static IncomingPacket aClass114_4998;
    static int anInt4999 = 0;
    static String aString5000 = null;
    static String aString5001 = null;
    static boolean forcedTween = false;
    
    public Class28() {
	/* empty */
    }
    
    public final String method54(int i, long l, Class138 class138, int[] is) {
	try {
	    anInt4996++;
	    if (FileOnDisk.aClass138_3044 == class138) {
		Class117 class117
		    = Class348_Sub7.aClass33_6653.method337(true, is[0]);
		return class117.method1074((int) l, 91);
	    }
	    if (Class299_Sub1.aClass138_6321 == class138
		|| za.aClass138_7274 == class138) {
		ItemDefinition class213
		    = ToolkitException.itemLoader.getItemDefinition(i + -99,
							      (int) l);
		return ((ItemDefinition) class213).aString2795;
	    }
	    if (i != 1)
		method54(85, -41L, null, null);
	    if (class138 == Class348_Sub42_Sub5.aClass138_9530
		|| class138 == FloatBuffer.aClass138_9748
		|| Class71.aClass138_1213 == class138)
		return Class348_Sub7.aClass33_6653.method337(true, is[0])
			   .method1074((int) l, i ^ 0x48);
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("hu.A(" + i + ',' + l + ','
					     + (class138 != null ? "{...}"
						: "null")
					     + ','
					     + (is != null ? "{...}" : "null")
					     + ')'));
	}
    }
    
    public static void method318(int i) {
	aString5001 = null;
	aString5000 = null;
	int i_0_ = 74 / ((i - 58) / 49);
	aClass223_4997 = null;
	aClass114_4998 = null;
    }
    
    static {
	aClass114_4998 = new IncomingPacket(59, 3);
    }
}
