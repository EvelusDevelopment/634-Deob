/* Class358 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class358
{
    static int anInt4411 = 0;
    float[][] aFloatArrayArray4412;
    static int anInt4413;
    int[] anIntArray4414;
    int[] anIntArray4415;
    int[] anIntArray4416;
    static Cache aClass60_4417 = new Cache(50);
    static OutgoingPacket aClass351_4418 = new OutgoingPacket(33, 8);
    
    public static void method3488(int i) {
	if (i < 25)
	    method3489(30);
	aClass351_4418 = null;
	aClass60_4417 = null;
    }
    
    static final void method3489(int i) {
	Cache.aHa1098.xa(((float) ((Class348_Sub51)
				     BitmapTable.aClass348_Sub51_3959)
					.aClass239_Sub10_7232
					.method1764(-32350) * 0.1F
			    + 0.7F) * 1.1523438F);
	anInt4413++;
	Cache.aHa1098.ZA(Class268.anInt3439, 0.69921875F, 1.2F, -200.0F,
			   -240.0F, -200.0F);
	Cache.aHa1098.L(Class268.anInt3444, -1, 0);
	int i_0_ = -35 / ((45 - i) / 44);
	Cache.aHa1098.method3653(Class348_Sub42_Sub10.aClass299_9571);
    }
    
    Class358(int[] is, int[] is_1_, int[] is_2_, float[][] fs) {
	try {
	    ((Class358) this).anIntArray4414 = is_2_;
	    ((Class358) this).aFloatArrayArray4412 = fs;
	    ((Class358) this).anIntArray4415 = is_1_;
	    ((Class358) this).anIntArray4416 = is;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("ew.<init>(" + (is != null ? "{...}" : "null") + ','
			+ (is_1_ != null ? "{...}" : "null") + ','
			+ (is_2_ != null ? "{...}" : "null") + ','
			+ (fs != null ? "{...}" : "null") + ')'));
	}
    }
}
