/* Class348_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub29 extends Node
{
    static IndexLoader indexLoader0;
    static int anInt6910;
    short aShort6911;
    
    public static void method3003(int i) {
	indexLoader0 = null;
	if (i != -4587)
	    method3003(-101);
    }
    
    public Class348_Sub29() {
	/* empty */
    }
    
    Class348_Sub29(short i) {
	((Class348_Sub29) this).aShort6911 = i;
    }
    
    static final void method3004(IndexLoader class45, boolean bool, d var_d) {
	do {
	    try {
		Class260.aClass45_3309 = class45;
		anInt6910++;
		Class101_Sub1.aD5684 = var_d;
		if (bool == false)
		    break;
		method3004(null, false, null);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("oia.B("
						 + (class45 != null ? "{...}"
						    : "null")
						 + ',' + bool + ','
						 + (var_d != null ? "{...}"
						    : "null")
						 + ')'));
	    }
	    break;
	} while (false);
    }
}
