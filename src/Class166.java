/* Class166 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

final class Class166
{
    static int anInt2178;
    static int anInt2179;
    IndexLoader aClass45_2180;
    static int anInt2181;
    static int anInt2182;
    static IncomingPacket aClass114_2183 = new IncomingPacket(0, -1);
    static int anInt2184;
    private Cache aClass60_2185 = new Cache(64);
    static int anInt2186;
    static Deque aClass262_2187 = new Deque();
    private IndexLoader aClass45_2188;
    static int anInt2189;
    Cache aClass60_2190 = new Cache(2);
    
    final void method1283(int i) {
	synchronized (aClass60_2185) {
	    aClass60_2185.method587(-76);
	}
	anInt2178++;
	synchronized (((Class166) this).aClass60_2190) {
	    ((Class166) this).aClass60_2190.method587(-110);
	}
	if (i != 1)
	    method1286(null, -124, null);
    }
    
    public static void method1284(int i) {
	aClass114_2183 = null;
	if (i == -21165)
	    aClass262_2187 = null;
    }
    
    final void method1285(int i, int i_0_) {
	anInt2189++;
	synchronized (aClass60_2185) {
	    aClass60_2185.method578(2, i);
	}
	synchronized (((Class166) this).aClass60_2190) {
	    if (i_0_ != 8)
		((Class166) this).aClass45_2180 = null;
	    ((Class166) this).aClass60_2190.method578(i_0_ + -6, i);
	}
    }
    
    static final void method1286(File file, int i, String string) {
	do {
	    try {
		anInt2181++;
		Class275.nativeLibraries.put(string, file);
		if (i == 64)
		    break;
		aClass114_2183 = null;
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("pg.F("
						 + (file != null ? "{...}"
						    : "null")
						 + ',' + i + ','
						 + (string != null ? "{...}"
						    : "null")
						 + ')'));
	    }
	    break;
	} while (false);
    }
    
    final Class222 method1287(byte i, int i_1_) {
	anInt2182++;
	Class222 class222;
	synchronized (aClass60_2185) {
	    class222
		= (Class222) aClass60_2185.method583((long) i_1_, i ^ ~0x1d);
	}
	if (class222 != null)
	    return class222;
	if (i != -104)
	    ((Class166) this).aClass60_2190 = null;
	byte[] is;
	synchronized (aClass45_2188) {
	    is = aClass45_2188.loadArchiveChild(-1860, 33, i_1_);
	}
	class222 = new Class222();
	((Class222) class222).aClass166_2886 = this;
	if (is != null)
	    class222.method1611(new ByteBuffer(is), false);
	synchronized (aClass60_2185) {
	    aClass60_2185.method582(class222, (long) i_1_, (byte) -116);
	}
	return class222;
    }
    
    static final void method1288(int i, int i_2_) {
	anInt2186++;
	for (Node class348 = Class226.aClass356_2959.method3484(i ^ i);
	     class348 != null;
	     class348 = Class226.aClass356_2959.method3482(0)) {
	    if ((((Node) class348).nodeKey >> 275343216 & 0xffffL)
		== (long) i_2_)
		class348.removeNode();
	}
    }
    
    static final void method1289(int i, int i_3_, int i_4_, int i_5_,
				 int i_6_) {
	anInt2179++;
	int i_7_ = Class26.anInt385;
	if (i_5_ != 8)
	    method1284(-59);
	int i_8_ = Class93.anInt1534;
	if (Class59_Sub1.aBoolean5300) {
	    i_7_ += s_Sub3.method4008((byte) -126);
	    i_8_ += Class16.method260(false);
	}
	if (Class239_Sub20.anInt6048 == 1) {
	    RasterToolkit class105 = (Class348_Sub40_Sub37.aClass105Array9467
				 [Node.anInt4292 / 100]);
	    class105.method974(i_7_ - 8, i_8_ + -8);
	    Class338.method2663(-5590, -8 + i_7_,
				-8 + (i_7_ - -class105.method966()), -8 + i_8_,
				class105.method980() + -8 + i_8_);
	}
	if ((Class239_Sub20.anInt6048 ^ 0xffffffff) == -3) {
	    RasterToolkit class105 = (Class348_Sub40_Sub37.aClass105Array9467
				 [Node.anInt4292 / 100 + 4]);
	    class105.method974(i_7_ + -8, -8 + i_8_);
	    Class338.method2663(-5590, i_7_ - 8,
				class105.method966() + i_7_ + -8, -8 + i_8_,
				class105.method980() + -8 + i_8_);
	}
	Class289.method2192((byte) 80);
    }
    
    final void method1290(int i) {
	anInt2184++;
	synchronized (aClass60_2185) {
	    aClass60_2185.removeAll(0);
	}
	synchronized (((Class166) this).aClass60_2190) {
	    ((Class166) this).aClass60_2190.removeAll(0);
	    if (i != -8)
		aClass114_2183 = null;
	}
    }
    
    Class166(GameMode class230, int i, IndexLoader class45, IndexLoader class45_9_) {
	try {
	    aClass45_2188 = class45;
	    ((Class166) this).aClass45_2180 = class45_9_;
	    aClass45_2188.method407(33);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("pg.<init>(" + (class230 != null ? "{...}" : "null")
			+ ',' + i + ',' + (class45 != null ? "{...}" : "null")
			+ ',' + (class45_9_ != null ? "{...}" : "null")
			+ ')'));
	}
    }
}
