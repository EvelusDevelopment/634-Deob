/* Class148 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class148
{
    static int anInt2037;
    Class148 aClass148_2038;
    static int[] anIntArray2039 = { 1, 0, -1, 0 };
    Class318_Sub1_Sub3 aClass318_Sub1_Sub3_2040;
    static int anInt2041;
    static Class196 aClass196_2042 = new Class196();
    static int anInt2043;
    
    static final boolean method1197(int i, int i_0_) {
	if (i != -12081)
	    return true;
	anInt2041++;
	if (i_0_ == 21 || (i_0_ ^ 0xffffffff) == -11 || i_0_ == 47
	    || (i_0_ ^ 0xffffffff) == -23 || i_0_ == 5)
	    return true;
	if (i_0_ == 49 || i_0_ == 1010)
	    return true;
	return false;
    }
    
    public static void method1198(int i) {
	if (i == 1010) {
	    anIntArray2039 = null;
	    aClass196_2042 = null;
	}
    }
    
    final void method1199(byte i) {
	anInt2043++;
	if (i == -106 && DirectxToolkit.anInt7722 < 500) {
	    ((Class148) this).aClass318_Sub1_Sub3_2040 = null;
	    ((Class148) this).aClass148_2038 = Class16.aClass148_231;
	    Class16.aClass148_231 = this;
	    DirectxToolkit.anInt7722++;
	}
    }
}
