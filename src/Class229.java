/* Class229 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class229
{
    static int anInt2976;
    static int anInt2977;
    static IndexLoader aClass45_2978;
    static Class268 aClass268_2979;
    static int anInt2980;
    static VarbitLoader scriptConfigLoader;
    
    static final Class241 method1631(boolean bool) {
	anInt2980++;
	if (bool != false)
	    scriptConfigLoader = null;
	try {
	    return new Class241_Sub2();
	} catch (Throwable throwable) {
	    try {
		return (Class241) Class.forName("Class241_Sub3").newInstance();
	    } catch (Throwable throwable_0_) {
		return new Class241_Sub1();
	    }
	}
    }
    
    public static void method1632(int i) {
	aClass45_2978 = null;
	int i_1_ = -20 / ((-87 - i) / 34);
	scriptConfigLoader = null;
	aClass268_2979 = null;
    }
    
    public Class229() {
	/* empty */
    }
    
    static final boolean method1633(boolean bool, int i, int i_2_) {
	if (bool != false)
	    method1633(false, 85, -80);
	anInt2977++;
	if ((0x400 & i ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
}
