/* Class337 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class337
{
    private DirectxToolkit aHa_Sub2_4173;
    static float[][] aFloatArrayArray4174
	= { { -0.333333F, -0.333333F, -0.333333F },
	    { 0.333333F, -0.333333F, -0.333333F },
	    { -0.333333F, 0.333333F, -0.333333F },
	    { 0.333333F, 0.333333F, -0.333333F },
	    { -0.333333F, -0.333333F, 0.333333F },
	    { 0.333333F, -0.333333F, 0.333333F },
	    { -0.333333F, 0.333333F, 0.333333F },
	    { 0.333333F, 0.333333F, 0.333333F } };
    static int anInt4175;
    static int anInt4176;
    static Object anObject4177;
    long aLong4178;
    static int anInt4179 = -1;
    static int anInt4180;
    
    public static void method2658(boolean bool) {
	aFloatArrayArray4174 = null;
	anObject4177 = null;
	if (bool != true)
	    aFloatArrayArray4174 = null;
    }
    
    protected final void finalize() throws Throwable {
	aHa_Sub2_4173.method3769(((Class337) this).aLong4178, false);
	anInt4175++;
	super.finalize();
    }
    
    Class337(DirectxToolkit var_ha_Sub2, long l, Class242[] class242s) {
	try {
	    aHa_Sub2_4173 = var_ha_Sub2;
	    ((Class337) this).aLong4178 = l;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("dw.<init>("
					     + (var_ha_Sub2 != null ? "{...}"
						: "null")
					     + ',' + l + ','
					     + (class242s != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    static final boolean method2659(byte i, int i_0_, int i_1_) {
	int i_2_ = 24 % ((i - 76) / 42);
	anInt4176++;
	if (!((0x70000 & i_0_) != 0 | Node.method2709(i_1_, i_0_, -1))
	    && !Class288.method2187(i_0_, -84, i_1_))
	    return false;
	return true;
    }
    
    static final Class288_Sub1 method2660(byte i,
					  ByteBuffer class348_sub49) {
	anInt4180++;
	if (i != 26)
	    return null;
	Class288 class288 = Class288_Sub1.method2189(class348_sub49, i + 59);
	int i_3_ = class348_sub49.method3369((byte) 125);
	return new Class288_Sub1(((Class288) class288).anInt4958,
				 ((Class288) class288).aClass221_4955,
				 ((Class288) class288).aClass341_4952,
				 ((Class288) class288).anInt4950,
				 ((Class288) class288).anInt4951, i_3_);
    }
}
