/* Class271 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class271
{
    private Cache aClass60_3466 = new Cache(64);
    static IncomingPacket aClass114_3467 = new IncomingPacket(45, 8);
    private IndexLoader aClass45_3468;
    static int anInt3469;
    
    final Class348_Sub42_Sub7 method2044(int i, int i_0_) {
	anInt3469++;
	Class348_Sub42_Sub7 class348_sub42_sub7;
	synchronized (aClass60_3466) {
	    class348_sub42_sub7
		= (Class348_Sub42_Sub7) aClass60_3466.method583((long) i_0_,
								-85);
	}
	if (class348_sub42_sub7 != null)
	    return class348_sub42_sub7;
	byte[] is;
	synchronized (aClass45_3468) {
	    is = aClass45_3468.loadArchiveChild(-1860, 5, i_0_);
	}
	class348_sub42_sub7 = new Class348_Sub42_Sub7();
	if (i < 78)
	    method2046();
	if (is != null)
	    class348_sub42_sub7.method3192((byte) 16, new ByteBuffer(is));
	synchronized (aClass60_3466) {
	    aClass60_3466.method582(class348_sub42_sub7, (long) i_0_,
				    (byte) -93);
	}
	return class348_sub42_sub7;
    }
    
    public static void method2045(byte i) {
	aClass114_3467 = null;
	if (i != 62)
	    method2046();
    }
    
    static final void method2046() {
	Class71.aClass76_1208 = Class71.aClass76_1210;
    }
    
    Class271(GameMode class230, int i, IndexLoader class45) {
	try {
	    aClass45_3468 = class45;
	    aClass45_3468.method407(5);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ut.<init>("
					     + (class230 != null ? "{...}"
						: "null")
					     + ',' + i + ','
					     + (class45 != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
}
