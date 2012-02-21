/* GfxLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GfxLoader
{
    static int anInt3978;
    private IndexLoader indexLoader;
    static double aDouble3980;
    IndexLoader aClass45_3981;
    static Class315[] aClass315Array3982;
    static int anInt3983;
    static int anInt3984;
    static Object anObject3985;
    static int anInt3986;
    static int anInt3987;
    static boolean aBoolean3988 = false;
    private Cache aClass60_3989 = new Cache(64);
    Cache aClass60_3990 = new Cache(60);
    int anInt3991;
    
    final void method2541(int i, int i_0_) {
	anInt3978++;
	((GfxLoader) this).anInt3991 = i_0_;
	synchronized (((GfxLoader) this).aClass60_3990) {
	    ((GfxLoader) this).aClass60_3990.removeAll(0);
	}
	if (i < 72)
	    aClass315Array3982 = null;
    }
    
    final void method2542(int i) {
	synchronized (aClass60_3989) {
	    aClass60_3989.method587(-126);
	}
	if (i >= -99)
	    aDouble3980 = 0.5896741197263589;
	anInt3986++;
	synchronized (((GfxLoader) this).aClass60_3990) {
	    ((GfxLoader) this).aClass60_3990.method587(-106);
	}
    }
    
    final GfxDefinition loadDefinition(byte i, int i_1_) {
	if (i <= 38)
	    method2542(-73);
	anInt3983++;
	GfxDefinition class368;
	synchronized (aClass60_3989) {
	    class368 = (GfxDefinition) aClass60_3989.method583((long) i_1_, 101);
	}
	if (class368 != null)
	    return class368;
	byte[] is;
	synchronized (indexLoader) {
	    is = indexLoader.loadArchiveChild(-1860,
					 Class318_Sub1_Sub3_Sub1
					     .method2419((byte) 127, i_1_),
					 Class348_Sub1_Sub2.method2729(i_1_,
								       16));
	}
	class368 = new GfxDefinition();
	((GfxDefinition) class368).aClass319_4513 = this;
	((GfxDefinition) class368).anInt4501 = i_1_;
	if (is != null)
	    class368.method3559(28105, new ByteBuffer(is));
	synchronized (aClass60_3989) {
	    aClass60_3989.method582(class368, (long) i_1_, (byte) -127);
	}
	return class368;
    }
    
    final void method2544(int i, byte i_2_) {
	synchronized (aClass60_3989) {
	    aClass60_3989.method578(2, i);
	    if (i_2_ >= -11)
		((GfxLoader) this).aClass45_3981 = null;
	}
	anInt3987++;
	synchronized (((GfxLoader) this).aClass60_3990) {
	    ((GfxLoader) this).aClass60_3990.method578(2, i);
	}
    }
    
    public static void method2545(boolean bool) {
	if (bool == true) {
	    aClass315Array3982 = null;
	    anObject3985 = null;
	}
    }
    
    final void method2546(int i) {
	anInt3984++;
	synchronized (aClass60_3989) {
	    aClass60_3989.removeAll(i ^ i);
	}
	synchronized (((GfxLoader) this).aClass60_3990) {
	    ((GfxLoader) this).aClass60_3990.removeAll(0);
	}
    }
    
    GfxLoader(GameMode class230, int i, IndexLoader class45, IndexLoader class45_3_) {
	try {
	    ((GfxLoader) this).aClass45_3981 = class45_3_;
	    indexLoader = class45;
	    int i_4_ = -1 + indexLoader.getAmountChildren();
	    indexLoader.method407(i_4_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("cn.<init>(" + (class230 != null ? "{...}" : "null")
			+ ',' + i + ',' + (class45 != null ? "{...}" : "null")
			+ ',' + (class45_3_ != null ? "{...}" : "null")
			+ ')'));
	}
    }
}
