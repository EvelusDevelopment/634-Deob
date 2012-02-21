/* RequiredElement - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class RequiredElement
{
    static int anInt3390;
    static int anInt3391;
    private ElementLoaderNode loaderNode;
    static int anInt3393;
    private int size = 1;
    static int anInt3395;
    static RequiredElement fileIndex28tracker = new RequiredElement(ElementLoaderNode.aClass69_1195);
    static int anInt3397;
    private ElementTracker elementLoader;
    static int anInt3399;
    static int anInt3400;
    static RequiredElement jaclibRequiredElement = new RequiredElement(ElementLoaderNode.aClass69_1199);
    static RequiredElement jagglRequiredElement = new RequiredElement(ElementLoaderNode.aClass69_1199);
    static RequiredElement jagmiscRequiredElement = new RequiredElement(ElementLoaderNode.aClass69_1199);
    static RequiredElement aClass267_3404 = new RequiredElement(ElementLoaderNode.aClass69_1199);
    static RequiredElement aClass267_3405 = new RequiredElement(ElementLoaderNode.aClass69_1199);
    static RequiredElement aClass267_3406 = new RequiredElement(ElementLoaderNode.aClass69_1199);
    static RequiredElement aClass267_3407 = new RequiredElement(ElementLoaderNode.aClass69_1199);
    static RequiredElement aClass267_3408 = new RequiredElement(ElementLoaderNode.aClass69_1195);
    static RequiredElement aClass267_3409 = new RequiredElement(ElementLoaderNode.aClass69_1195);
    static RequiredElement aClass267_3410 = new RequiredElement(ElementLoaderNode.aClass69_1195);
    static RequiredElement aClass267_3411 = new RequiredElement(ElementLoaderNode.aClass69_1195);
    static RequiredElement aClass267_3412 = new RequiredElement(ElementLoaderNode.aClass69_1195);
    static RequiredElement aClass267_3413 = new RequiredElement(ElementLoaderNode.aClass69_1195);
    static RequiredElement aClass267_3414 = new RequiredElement(ElementLoaderNode.aClass69_1195);
    static RequiredElement aClass267_3415 = new RequiredElement(ElementLoaderNode.aClass69_1195);
    static RequiredElement aClass267_3416 = new RequiredElement(ElementLoaderNode.aClass69_1195);
    static RequiredElement aClass267_3417 = new RequiredElement(ElementLoaderNode.aClass69_1195);
    static RequiredElement aClass267_3418 = new RequiredElement(ElementLoaderNode.aClass69_1195);
    static RequiredElement aClass267_3419 = new RequiredElement(ElementLoaderNode.aClass69_1195);
    static RequiredElement aClass267_3420 = new RequiredElement(ElementLoaderNode.aClass69_1195);
    static RequiredElement aClass267_3421 = new RequiredElement(ElementLoaderNode.aClass69_1195);
    static RequiredElement aClass267_3422 = new RequiredElement(ElementLoaderNode.aClass69_1197);
    static RequiredElement aClass267_3423 = new RequiredElement(ElementLoaderNode.aClass69_1195);
    static RequiredElement aClass267_3424 = new RequiredElement(ElementLoaderNode.aClass69_1195);
    static RequiredElement aClass267_3425 = new RequiredElement(ElementLoaderNode.aClass69_1195);
    static RequiredElement aClass267_3426 = new RequiredElement(ElementLoaderNode.aClass69_1198);
    static IncomingPacket incomingPacket93 = new IncomingPacket(93, -2);
    static int anInt3428 = -1;
    
    final int getSize() {
	anInt3390++;
	return size;
    }
    
    final void setElementLoader(ElementTracker interface7) {
	anInt3399++;
	if (interface7.getLoaderNode(-15004) != loaderNode)
	    throw new IllegalArgumentException();
	elementLoader = interface7;
    }
    
    public static void method2026(int i) {
	aClass267_3421 = null;
	aClass267_3413 = null;
	aClass267_3404 = null;
	aClass267_3405 = null;
	jagmiscRequiredElement = null;
	aClass267_3411 = null;
	if (i == 23377) {
	    aClass267_3410 = null;
	    aClass267_3420 = null;
	    aClass267_3414 = null;
	    aClass267_3409 = null;
	    aClass267_3418 = null;
	    aClass267_3426 = null;
	    aClass267_3412 = null;
	    aClass267_3423 = null;
	    aClass267_3424 = null;
	    aClass267_3408 = null;
	    aClass267_3416 = null;
	    aClass267_3407 = null;
	    aClass267_3406 = null;
	    aClass267_3419 = null;
	    jaclibRequiredElement = null;
	    aClass267_3425 = null;
	    jagglRequiredElement = null;
	    aClass267_3415 = null;
	    fileIndex28tracker = null;
	    incomingPacket93 = null;
	    aClass267_3422 = null;
	    aClass267_3417 = null;
	}
    }
    
    public final String toString() {
	anInt3400++;
	throw new IllegalStateException();
    }
    
    final ElementTracker getElementLoader() {
	anInt3391++;
	return elementLoader;
    }
    
    static final void method2028(int i, ObjectDefinition class51, int i_0_, AbstractToolkit var_ha,
				 int i_1_, int i_2_) {
	try {
	    anInt3395++;
	    Class218 class218
		= Class2.aClass141_117
		      .method1173((byte) 31, ((ObjectDefinition) class51).anInt875);
	    if ((((Class218) class218).anInt2853 ^ 0xffffffff) != 0) {
		if (((ObjectDefinition) class51).aBoolean912) {
		    i_1_ += ((ObjectDefinition) class51).anInt923;
		    i_1_ &= 0x3;
		} else
		    i_1_ = 0;
		RasterToolkit class105
		    = class218.method1596(i_1_,
					  ((ObjectDefinition) class51).aBoolean925, 82,
					  var_ha);
		if (class105 != null) {
		    int i_3_ = ((ObjectDefinition) class51).anInt961;
		    int i_4_ = ((ObjectDefinition) class51).anInt926;
		    int i_5_ = 60 % ((52 - i_2_) / 56);
		    if ((0x1 & i_1_) == 1) {
			i_3_ = ((ObjectDefinition) class51).anInt926;
			i_4_ = ((ObjectDefinition) class51).anInt961;
		    }
		    int i_6_ = class105.method966();
		    int i_7_ = class105.method980();
		    if (((Class218) class218).aBoolean2854) {
			i_7_ = i_4_ * 4;
			i_6_ = i_3_ * 4;
		    }
		    if (((Class218) class218).anInt2856 == 0)
			class105.method973(i, -((i_4_ + -1) * 4) + i_0_, i_6_,
					   i_7_);
		    else
			class105.method970(i, i_0_ - 4 * (-1 + i_4_), i_6_,
					   i_7_, 0,
					   (((Class218) class218).anInt2856
					    | ~0xffffff),
					   1);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("up.C(" + i + ','
					     + (class51 != null ? "{...}"
						: "null")
					     + ',' + i_0_ + ','
					     + (var_ha != null ? "{...}"
						: "null")
					     + ',' + i_1_ + ',' + i_2_ + ')'));
	}
    }
    
    static final RequiredElement[] getRequiredElements(int i) {
	if (i <= 99)
	    return null;
	anInt3393++;
	return (new RequiredElement[]
		{ fileIndex28tracker, jaclibRequiredElement, jagglRequiredElement,
		  jagmiscRequiredElement, aClass267_3404, aClass267_3405,
		  aClass267_3406, aClass267_3407, aClass267_3408,
		  aClass267_3409, aClass267_3410, aClass267_3411,
		  aClass267_3412, aClass267_3413, aClass267_3414,
		  aClass267_3415, aClass267_3416, aClass267_3417,
		  aClass267_3418, aClass267_3419, aClass267_3420,
		  aClass267_3421, aClass267_3422, aClass267_3423,
		  aClass267_3424, aClass267_3425, aClass267_3426 });
    }
    
    final void setSize(int i_8_) {
	size = i_8_;
	anInt3397++;
    }
    
    private RequiredElement(ElementLoaderNode class69) {
	loaderNode = class69;
    }
}
