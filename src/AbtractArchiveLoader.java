/* AbtractArchiveLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class AbtractArchiveLoader
{
    static float aFloat3938 = 0.0F;
    static int anInt3939;
    static int anInt3940;
    static int anInt3941;
    static int anInt3942;
    static float aFloat3943;
    
    public AbtractArchiveLoader() {
	/* empty */
    }
    
    abstract int getLoadedPercent(int archive);
    
    static final void method2336(ObjectDefinition class51, int i, int i_1_, int i_2_,
				 int i_3_) {
	anInt3940++;
	if (i_3_ > -126)
	    anInt3941 = 15;
	for (Class348_Sub9 class348_sub9
		 = (Class348_Sub9) Class218.aClass262_2859.getFirst(4);
	     class348_sub9 != null;
	     class348_sub9 = (Class348_Sub9) Class218.aClass262_2859
						 .nextForward((byte) 123)) {
	    if (i_2_ == ((Class348_Sub9) class348_sub9).anInt6693
		&& ((i << 301027657 ^ 0xffffffff)
		    == (((Class348_Sub9) class348_sub9).anInt6678
			^ 0xffffffff))
		&& (i_1_ << -1672051223
		    == ((Class348_Sub9) class348_sub9).anInt6689)
		&& ((((ObjectDefinition) class51).anInt941 ^ 0xffffffff)
		    == (((ObjectDefinition) (((Class348_Sub9) class348_sub9)
				    .aClass51_6695)).anInt941
			^ 0xffffffff))) {
		if (((Class348_Sub9) class348_sub9).aClass348_Sub16_Sub5_6676
		    != null) {
		    Class348_Sub43.aClass348_Sub16_Sub4_7065.method2880
			(((Class348_Sub9) class348_sub9)
			 .aClass348_Sub16_Sub5_6676);
		    ((Class348_Sub9) class348_sub9).aClass348_Sub16_Sub5_6676
			= null;
		}
		if (((Class348_Sub9) class348_sub9).aClass348_Sub16_Sub5_6673
		    != null) {
		    Class348_Sub43.aClass348_Sub16_Sub4_7065.method2880
			(((Class348_Sub9) class348_sub9)
			 .aClass348_Sub16_Sub5_6673);
		    ((Class348_Sub9) class348_sub9).aClass348_Sub16_Sub5_6673
			= null;
		}
		class348_sub9.removeNode();
		break;
	    }
	}
    }
    
    static final float method2337(float f, boolean bool, float f_4_,
				  float f_5_) {
	if (bool != true)
	    method2337(-0.96692735F, false, 0.1946915F, -1.0497112F);
	anInt3942++;
	return f + (-f + f_4_) * f_5_;
    }
    
    abstract void method2338(byte i, int i_6_);
    
    abstract byte[] getValidatedArchive(int i);
    
    abstract IndexTable getIndexTable();
}
