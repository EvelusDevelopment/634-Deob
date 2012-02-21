/* ModelPolygon - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ModelPolygon
{
    static int anInt2152;
    int x;
    static int anInt2154;
    int alpha;
    int tGroup;
    static Class74 aClass74_2157 = new Class74(5, 16);
    int group;
    
    static final void method1265(int i) {
	anInt2152++;
	if (i != 16)
	    aClass74_2157 = null;
	if (Class348_Sub40.aClass279_7042 != null)
	    Class348_Sub40.aClass279_7042.method2093(true);
	if (VarbitLoader.aClass279_2596 != null)
	    VarbitLoader.aClass279_2596.method2093(true);
    }
    
    final ModelPolygon method1266(int i, int i_0_) {
	if (i != 5)
	    method1266(82, -25);
	anInt2154++;
	return new ModelPolygon(((ModelPolygon) this).x, i_0_,
			    ((ModelPolygon) this).tGroup,
			    ((ModelPolygon) this).group);
    }
    
    ModelPolygon(int i, int i_1_, int i_2_, int i_3_) {
	((ModelPolygon) this).tGroup = i_2_;
	((ModelPolygon) this).alpha = i_1_;
	((ModelPolygon) this).group = i_3_;
	((ModelPolygon) this).x = i;
    }
    
    public static void method1267(byte i) {
	aClass74_2157 = null;
	if (i != 85)
	    method1267((byte) 121);
    }
}
