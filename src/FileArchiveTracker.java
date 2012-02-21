/* FileArchiveTracker - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class FileArchiveTracker implements ElementTracker
{
    static float[] aFloatArray4772;
    static int anInt4773;
    static int anInt4774;
    static int anInt4775;
    static int anInt4776;
    static int anInt4777;
    private String fileName;
    static IncomingPacket aClass114_4779;
    static int[] anIntArray4780;
    static int anInt4781;
    static Class219 aClass219_4782;
    static long aLong4783 = 20000000L;
    static int anInt4784;
    private IndexLoader indexLoader;
    static int anInt4786;
    
    public static void method741(byte i) {
	aFloatArray4772 = null;
	anIntArray4780 = null;
	if (i != -128)
	    method743(113, -98);
	aClass114_4779 = null;
	aClass219_4782 = null;
    }
    
    static final Class189 method742(int i, int i_0_) {
	anInt4777++;
	Class189 class189 = (Class189) Class217.aClass60_2844.method583((long) i_0_, -104);
	if (class189 != null)
	    return class189;
	byte[] is = Class369_Sub3.aClass45_8601.loadArchiveChild(-1860, 0, i_0_);
	if (i != 104)
	    method741((byte) 98);
	class189 = new Class189();
	if (is != null)
	    class189.initialize(i_0_, new ByteBuffer(is), (byte) 64);
	Class217.aClass60_2844.method582(class189, (long) i_0_, (byte) -114);
	return class189;
    }
    
    public final int getPercentComplete(int i) {
	int i_1_ = -62 / ((i - -43) / 62);
	anInt4774++;
	if (indexLoader.method416((byte) -74, fileName))
	    return 100;
	return 0;
    }
    
    static final void method743(int i, int i_2_) {
	anInt4775++;
	WidgetVariable class348_sub42_sub15
	    = Class318_Sub9_Sub1.method2516(i_2_, (byte) 105, i);
	class348_sub42_sub15.method3251(i ^ ~0x3eb0);
    }
    
    public final ElementLoaderNode getLoaderNode(int i) {
	anInt4781++;
	if (i != -15004)
	    aFloatArray4772 = null;
	return ElementLoaderNode.aClass69_1197;
    }
    
    FileArchiveTracker(IndexLoader loader, String string) {
	try {
	    indexLoader = loader;
	    fileName = string;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("kk.<init>("
					     + (loader != null ? "{...}"
						: "null")
					     + ','
					     + (string != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    static {
	anInt4776 = 0;
	aFloatArray4772 = new float[16];
	anIntArray4780 = new int[] { 104, 120, 136, 168 };
	aClass114_4779 = new IncomingPacket(76, 6);
    }
}
