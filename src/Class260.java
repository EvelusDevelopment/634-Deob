/* Class260 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class260
{
    static IncomingPacket aClass114_3307 = new IncomingPacket(56, 2);
    static int anInt3308;
    static IndexLoader aClass45_3309;
    static int anInt3310;
    static int[] anIntArray3311;
    static int anInt3312 = 0;
    
    static final boolean method1977(byte i, int i_0_) {
	if (i != -79)
	    return false;
	anInt3308++;
	if (i_0_ != 3 && i_0_ != 7 && (i_0_ ^ 0xffffffff) != -11)
	    return false;
	return true;
    }
    
    static final void method1978() {
	for (int i = 0; i < Class348_Sub40_Sub34.aClass293Array9432.length;
	     i++)
	    Class348_Sub40_Sub34.aClass293Array9432[i].method2205();
	Class348_Sub40_Sub34.aClass293Array9432 = null;
    }
    
    public static void method1979(byte i) {
	aClass45_3309 = null;
	anIntArray3311 = null;
	if (i < 105)
	    method1978();
	aClass114_3307 = null;
    }
    
    static {
	anInt3310 = 0;
	anIntArray3311 = new int[1];
    }
}
