/* Class326 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class326
{
    static int anInt4083;
    static int anInt4084;
    private IndexLoader aClass45_4085;
    static int anInt4086 = 0;
    private Cache aClass60_4087 = new Cache(64);
    static int anInt4088;
    static int anInt4089;
    
    final Class254 method2600(int i, int i_0_) {
	anInt4084++;
	Class254 class254;
	synchronized (aClass60_4087) {
	    class254 = (Class254) aClass60_4087.method583((long) i, -67);
	}
	if (class254 != null)
	    return class254;
	if (i_0_ != 28364)
	    anInt4086 = 117;
	byte[] is;
	synchronized (aClass45_4085) {
	    is = aClass45_4085.loadArchiveChild(-1860, 11, i);
	}
	class254 = new Class254();
	if (is != null)
	    class254.method1924(new ByteBuffer(is), (byte) -127);
	synchronized (aClass60_4087) {
	    aClass60_4087.method582(class254, (long) i, (byte) -114);
	}
	return class254;
    }
    
    final void method2601(byte i) {
	synchronized (aClass60_4087) {
	    aClass60_4087.removeAll(0);
	    int i_1_ = -46 / ((i - 3) / 47);
	}
	anInt4088++;
    }
    
    final void method2602(int i) {
	anInt4089++;
	synchronized (aClass60_4087) {
	    aClass60_4087.method587(-91);
	    if (i != 0)
		aClass60_4087 = null;
	}
    }
    
    final void method2603(int i, int i_2_) {
	synchronized (aClass60_4087) {
	    if (i_2_ != 11)
		return;
	    aClass60_4087.method578(2, i);
	}
	anInt4083++;
    }
    
    Class326(GameMode class230, int i, IndexLoader class45) {
	do {
	    try {
		aClass45_4085 = class45;
		if (aClass45_4085 == null)
		    break;
		aClass45_4085.method407(11);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("dc.<init>("
						 + (class230 != null ? "{...}"
						    : "null")
						 + ',' + i + ','
						 + (class45 != null ? "{...}"
						    : "null")
						 + ')'));
	    }
	    break;
	} while (false);
    }
}
