/* ElementLoaderNode - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ElementLoaderNode
{
    static int anInt1191;
    static int anInt1192;
    static int anInt1193;
    static int anInt1194;
    static ElementLoaderNode aClass69_1195 = new ElementLoaderNode();
    static int anInt1196;
    static ElementLoaderNode aClass69_1197 = new ElementLoaderNode();
    static ElementLoaderNode aClass69_1198 = new ElementLoaderNode();
    static ElementLoaderNode aClass69_1199 = new ElementLoaderNode();
    static int anInt1200;
    static Class173 aClass173_1201 = new Class173();
    static int anInt1202;
    
    static final void method720(int i, int i_0_) {
	anInt1193++;
	Class168.anInt2251 = i;
	synchronized (Class130.aClass60_1894) {
	    if (i_0_ != 1226)
		aClass173_1201 = null;
	    Class130.aClass60_1894.removeAll(0);
	}
	synchronized (Class24.aClass60_355) {
	    Class24.aClass60_355.removeAll(0);
	}
    }
    
    static final void method721(SubNode class348_sub42,
				SubNode class348_sub42_1_, int i) {
	do {
	    try {
		if (((SubNode) class348_sub42_1_).subnodeChild
		    != null)
		    class348_sub42_1_.removeSubnode();
		anInt1194++;
		((SubNode) class348_sub42_1_).subnodeParent
		    = class348_sub42;
		((SubNode) class348_sub42_1_).subnodeChild
		    = ((SubNode) class348_sub42).subnodeChild;
		((SubNode) (((SubNode) class348_sub42_1_)
				   .subnodeChild)).subnodeParent
		    = class348_sub42_1_;
		((SubNode) (((SubNode) class348_sub42_1_)
				   .subnodeParent)).subnodeChild
		    = class348_sub42_1_;
		if (i == -1)
		    break;
		aClass69_1199 = null;
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("kea.B("
						 + (class348_sub42 != null
						    ? "{...}" : "null")
						 + ','
						 + (class348_sub42_1_ != null
						    ? "{...}" : "null")
						 + ',' + i + ')'));
	    }
	    break;
	} while (false);
    }
    
    public ElementLoaderNode() {
	/* empty */
    }
    
    public static void method722(int i) {
	aClass69_1198 = null;
	if (i != 13569)
	    aClass69_1199 = null;
	aClass69_1197 = null;
	aClass69_1195 = null;
	aClass69_1199 = null;
	aClass173_1201 = null;
    }
    
    static final boolean method723(int i, int i_2_, byte i_3_) {
	anInt1196++;
	if (i_3_ >= -66)
	    return true;
	return (ArchiveLoader.method2352(113, i_2_, i)
		& Class156.method1238(i, i_2_, -29));
    }
    
    static final boolean method724(int i, int i_4_, int i_5_) {
	anInt1191++;
	if (i_5_ != 393216)
	    method723(25, 30, (byte) -113);
	if (!(ArchiveLoader.method2352(124, i_4_, i)
	      | (0x60000 & i ^ 0xffffffff) != -1)
	    && !Class273.method2056(i, 90, i_4_)
	    && !method723(i, i_4_, (byte) -120))
	    return false;
	return true;
    }
    
    public final String toString() {
	anInt1192++;
	throw new IllegalStateException();
    }
}
