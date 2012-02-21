/* NativeLibTracker - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NativeLibTracker implements ElementTracker
{
    static int[] anIntArray4806;
    private String libraryName;
    static RasterToolkit aClass105_4808;
    static int anInt4809;
    static int anInt4810;
    static int anInt4811;
    static int[] anIntArray4812;
    static int[] anIntArray4813;
    static int anInt4814 = 50;
    static int anInt4815;
    static int runEnergy;
    static int[] anIntArray4817;
    static String[] aStringArray4818;
    static int[] anIntArray4819;
    static int anInt4820;
    static int anInt4821;
    static int[] anIntArray4822;
    static int anInt4823;
    private boolean isFinished;
    static int anInt4825;
    
    static final void method2307(int i, long l, int i_0_, int i_1_) {
	try {
	    anInt4823++;
	    if (i_1_ <= 3)
		method2308((byte) -121, 59);
	    int i_2_ = (int) l >> -1914464274 & 0x1f;
	    int i_3_ = (0x37d8b0 & (int) l) >> -425142188;
	    int i_4_ = 0x7fffffff & (int) (l >>> -587776800);
	    if (i_2_ != 10 && i_2_ != 11 && (i_2_ ^ 0xffffffff) != -23)
		Class298.method2252(true, i_0_, i, (byte) -119, 0, 0, 0, i_2_,
				    i_3_);
	    else {
		ObjectDefinition class51
		    = Class348_Sub40_Sub12.objectLoader.getObject(0, i_4_);
		int i_5_;
		int i_6_;
		if ((i_3_ ^ 0xffffffff) == -1 || (i_3_ ^ 0xffffffff) == -3) {
		    i_5_ = ((ObjectDefinition) class51).anInt926;
		    i_6_ = ((ObjectDefinition) class51).anInt961;
		} else {
		    i_5_ = ((ObjectDefinition) class51).anInt961;
		    i_6_ = ((ObjectDefinition) class51).anInt926;
		}
		int i_7_ = ((ObjectDefinition) class51).anInt914;
		if ((i_3_ ^ 0xffffffff) != -1)
		    i_7_ = (0xf & i_7_ << i_3_) + (i_7_ >> 4 + -i_3_);
		Class298.method2252(true, i_0_, i, (byte) -99, i_5_, i_7_,
				    i_6_, 0, 0);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("cf.B(" + i + ',' + l + ',' + i_0_
					     + ',' + i_1_ + ')'));
	}
    }
    
    static final boolean method2308(byte i, int i_8_) {
	if (i != 26)
	    anIntArray4822 = null;
	anInt4810++;
	if (i_8_ != 15 && i_8_ != 2 && i_8_ != 30 && (i_8_ ^ 0xffffffff) != -50
	    && (i_8_ ^ 0xffffffff) != -52 && (i_8_ ^ 0xffffffff) != -51
	    && (i_8_ ^ 0xffffffff) != -7)
	    return false;
	return true;
    }
    
    public final int getPercentComplete(int i) {
	int i_9_ = 88 % ((-43 - i) / 62);
	anInt4821++;
	int i_10_ = Class59.loadNativeLibrary(libraryName, 7468);
	if (i_10_ >= 0 && (i_10_ ^ 0xffffffff) >= -101)
	    return i_10_;
	isFinished = true;
	return 100;
    }
    
    static final byte[] method2309(int i, byte[] is) {
	anInt4825++;
	if (is == null)
	    return null;
	byte[] is_11_ = new byte[is.length];
	if (i >= -9)
	    anInt4814 = 49;
	Class214.byteArrayCopy(is, 0, is_11_, 0, is.length);
	return is_11_;
    }
    
    public final ElementLoaderNode getLoaderNode(int i) {
	anInt4809++;
	if (i != -15004)
	    aStringArray4818 = null;
	return ElementLoaderNode.aClass69_1199;
    }
    
    public static void method2310(byte i) {
	if (i < 65)
	    anIntArray4819 = null;
	aStringArray4818 = null;
	anIntArray4819 = null;
	anIntArray4822 = null;
	anIntArray4813 = null;
	anIntArray4817 = null;
	aClass105_4808 = null;
	anIntArray4806 = null;
	anIntArray4812 = null;
    }
    
    static final void method2311(byte i, int i_12_) {
	anInt4820++;
	WidgetVariable class348_sub42_sub15
	    = Class318_Sub9_Sub1.method2516(i_12_, (byte) 105, 16);
	class348_sub42_sub15.method3251(-16058);
	int i_13_ = 126 / ((i - -54) / 38);
    }
    
    static final void method2312(int i, int i_14_, Deque class262,
				 int i_15_, AbstractToolkit var_ha) {
	do {
	    try {
		anInt4811++;
		Class289.aClass262_3705.removeAll(125);
		if (!Class348_Sub1_Sub1.aBoolean8805) {
		    for (Class348_Sub21 class348_sub21
			     = (Class348_Sub21) class262.getFirst(4);
			 class348_sub21 != null;
			 class348_sub21 = ((Class348_Sub21)
					   class262.nextForward((byte) 104))) {
			Class42 class42
			    = (Class75.aClass153_1238.method1225
			       (((Class348_Sub21) class348_sub21).anInt6847,
				(byte) 82));
			if (Cache.method589(class42, -4)) {
			    boolean bool
				= Class190.method1425((byte) -31, class42,
						      class348_sub21, i_14_,
						      var_ha, i_15_);
			    if (bool)
				Class59.method549((byte) -43, class348_sub21,
						  var_ha, class42);
			}
		    }
		    if (i == -13084)
			break;
		    aStringArray4818 = null;
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("cf.G(" + i + ',' + i_14_
						 + ','
						 + (class262 != null ? "{...}"
						    : "null")
						 + ',' + i_15_ + ','
						 + (var_ha != null ? "{...}"
						    : "null")
						 + ')'));
	    }
	    break;
	} while (false);
    }
    
    final boolean isFinished(int i) {
	if (i <= 99)
	    method2309(-35, null);
	anInt4815++;
	return isFinished;
    }
    
    NativeLibTracker(String string) {
	libraryName = string;
    }
    
    static {
	anIntArray4812 = new int[anInt4814];
	anIntArray4806 = new int[anInt4814];
	anIntArray4813 = new int[anInt4814];
	anIntArray4817 = new int[anInt4814];
	runEnergy = 0;
	aStringArray4818 = new String[anInt4814];
	anIntArray4822 = new int[anInt4814];
	anIntArray4819 = new int[anInt4814];
    }
}
