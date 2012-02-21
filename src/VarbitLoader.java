/* VarbitLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class VarbitLoader
{
    static int anInt2591;
    static int anInt2592;
    static int anInt2593;
    private Cache aClass60_2594 = new Cache(64);
    static int anInt2595;
    static Class279 aClass279_2596;
    private IndexLoader scriptConfigLoader;
    static int anInt2598;
    
    public static void method1441(byte i) {
	aClass279_2596 = null;
	if (i != 18)
	    aClass279_2596 = null;
    }
    
    final void method1442(int i, byte i_0_) {
	anInt2598++;
	synchronized (aClass60_2594) {
	    if (i_0_ != 1)
		aClass60_2594 = null;
	    aClass60_2594.method578(2, i);
	}
    }
    
    final void method1443(int i) {
	anInt2595++;
	int i_1_ = 14 % ((-39 - i) / 51);
	synchronized (aClass60_2594) {
	    aClass60_2594.method587(-80);
	}
    }
    
    final void method1444(int i, int i_2_) {
	int i_3_ = -6 % ((67 - i_2_) / 47);
	anInt2591++;
	synchronized (aClass60_2594) {
	    aClass60_2594.removeAll(0);
	    aClass60_2594 = new Cache(i);
	}
    }
    
    final void method1445(int i) {
	anInt2592++;
	if (i == 64) {
	    synchronized (aClass60_2594) {
		aClass60_2594.removeAll(0);
	    }
	}
    }
    
    final VarbitDefinition method1446(int i, int i_4_) {
	anInt2593++;
	VarbitDefinition class146;
	synchronized (aClass60_2594) {
	    class146 = (VarbitDefinition) aClass60_2594.method583((long) i, 76);
	}
	if (class146 != null)
	    return class146;
	byte[] is;
	synchronized (scriptConfigLoader) {
	    is = scriptConfigLoader.loadArchiveChild(i_4_ ^ 0x743,
					 Class179.method1359(true, i),
					 LongNode.method2806(false, i));
	}
	class146 = new VarbitDefinition();
	if (i_4_ != -1)
	    return null;
	if (is != null)
	    class146.initialize(i_4_ ^ ~0x800, new ByteBuffer(is));
	synchronized (aClass60_2594) {
	    aClass60_2594.method582(class146, (long) i, (byte) -105);
	}
	return class146;
    }
    
    VarbitLoader(GameMode mode, int i, IndexLoader loader) {
	do {
	    try {
		scriptConfigLoader = loader;
		if (scriptConfigLoader == null)
		    break;
		int amountChildren = scriptConfigLoader.getAmountChildren() - 1;
		scriptConfigLoader.method407(amountChildren);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("qs.<init>("
						 + (mode != null ? "{...}"
						    : "null")
						 + ',' + i + ','
						 + (loader != null ? "{...}"
						    : "null")
						 + ')'));
	    }
	    break;
	} while (false);
    }
}
