/* BufferedRasterizer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class BufferedRasterizer implements AbstractRasterizer
{
    float[] aFloatArray4719;
    static float aFloat4720;
    static int anInt4721;
    int anInt4722;
    static int anInt4723;
    private Class216 aClass216_4724;
    int anInt4725;
    static volatile boolean aBoolean4726 = true;
    static int anInt4727;
    static boolean aBoolean4728 = false;
    private SoftwareToolkit aHa_Sub1_4729;
    static Widget aClass46_4730 = null;
    int[] anIntArray4731;
    
    public static void method453(int i) {
	if (i == -2001)
	    aClass46_4730 = null;
    }
    
    static final int method454(int i, byte i_0_) {
	int i_1_ = 20 / ((i_0_ - -4) / 37);
	anInt4727++;
	int i_2_;
	if ((i ^ 0xffffffff) < -12001) {
	    Class133.method1140(73);
	    i_2_ = 4;
	} else if (i > 5000) {
	    Class47.method447((byte) -59);
	    i_2_ = 3;
	} else if ((i ^ 0xffffffff) >= -2001) {
	    i_2_ = 1;
	    Class348_Sub40_Sub12.method3076(0, true);
	} else {
	    i_2_ = 2;
	    ConnectionMode.method1263(true);
	}
	if (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		.aClass239_Sub25_7271.method1829(-32350)
	    != 2) {
	    BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						     (((Class348_Sub51)
						       (BitmapTable
							.aClass348_Sub51_3959))
						      .aClass239_Sub25_7251),
						     2);
	    Class367_Sub10.method3553(false, (byte) 119, 2);
	}
	Class14_Sub2.method243(37);
	return i_2_;
    }
    
    public final void drawi(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, boolean bool, boolean bool_8_) {
	anInt4723++;
	ItemDefinition.populate((((AbstractImageFetcher) ((SoftwareToolkit) aHa_Sub1_4729).abstractImageFetcher).pixelBuffer), bool_8_ ? ((SoftwareToolkit) aHa_Sub1_4729).aFloatArray7502 : null, bool ? ((BufferedRasterizer) this).anIntArray4731 : null, !bool_8_ ? null : ((BufferedRasterizer) this).aFloatArray4719, i, i_3_, ((BufferedRasterizer) this).anInt4725, (((AbstractImageFetcher) ((SoftwareToolkit) aHa_Sub1_4729).abstractImageFetcher).width), i_7_, i_6_, i_4_, i_5_);
    }
    
    public final void drawf(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, boolean bool, boolean bool_14_) {
	anInt4721++;
	ItemDefinition.populate(((BufferedRasterizer) this).anIntArray4731, bool_14_ ? ((BufferedRasterizer) this).aFloatArray4719 : null, !bool ? null : (((AbstractImageFetcher) ((SoftwareToolkit) aHa_Sub1_4729).abstractImageFetcher).pixelBuffer), bool_14_ ? ((SoftwareToolkit) aHa_Sub1_4729).aFloatArray7502 : null, i, i_9_,
	     (((AbstractImageFetcher) ((SoftwareToolkit) aHa_Sub1_4729).abstractImageFetcher)
	      .width), ((BufferedRasterizer) this).anInt4725, i_13_,
	     i_12_, i_10_, i_11_);
    }
    
    BufferedRasterizer(SoftwareToolkit var_ha_Sub1, RasterToolkit class105, Class216 class216) {
	do {
	    try {
		aHa_Sub1_4729 = var_ha_Sub1;
		if (!(class105 instanceof BasicSoftwareRaster)) {
		    if (!(class105 instanceof BufferedSoftwareRaster))
			throw new RuntimeException();
		    BufferedSoftwareRaster class105_sub3_sub3
			= (BufferedSoftwareRaster) class105;
		    ((BufferedRasterizer) this).anInt4725
			= ((SoftwareRaster) class105_sub3_sub3).width;
		    ((BufferedRasterizer) this).anInt4722
			= ((SoftwareRaster) class105_sub3_sub3).height;
		    ((BufferedRasterizer) this).anIntArray4731
			= (((BufferedSoftwareRaster) class105_sub3_sub3)
			   .pixelArray);
		} else {
		    BasicSoftwareRaster class105_sub3_sub1
			= (BasicSoftwareRaster) class105;
		    ((BufferedRasterizer) this).anIntArray4731
			= (((BasicSoftwareRaster) class105_sub3_sub1)
			   .anIntArray9933);
		    ((BufferedRasterizer) this).anInt4722
			= ((SoftwareRaster) class105_sub3_sub1).height;
		    ((BufferedRasterizer) this).anInt4725
			= ((SoftwareRaster) class105_sub3_sub1).width;
		}
		if (class216 == null)
		    break;
		aClass216_4724 = class216;
		if ((((Class216) aClass216_4724).anInt4974
		     != ((BufferedRasterizer) this).anInt4725)
		    || (((BufferedRasterizer) this).anInt4722
			!= ((Class216) aClass216_4724).anInt4978))
		    throw new RuntimeException();
		((BufferedRasterizer) this).aFloatArray4719
		    = ((Class216) aClass216_4724).aFloatArray4980;
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929
			  (runtimeexception,
			   ("it.<init>("
			    + (var_ha_Sub1 != null ? "{...}" : "null") + ','
			    + (class105 != null ? "{...}" : "null") + ','
			    + (class216 != null ? "{...}" : "null") + ')'));
	    }
	    break;
	} while (false);
    }
}
