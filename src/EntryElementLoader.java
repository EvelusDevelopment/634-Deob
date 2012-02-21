/* EntryElementLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class EntryElementLoader implements ElementTracker
{
    static Class65 aClass65_4787;
    private String aString4788;
    private IndexLoader indexLoader;
    static int anInt4790;
    static short[][] aShortArrayArray4791;
    static int anInt4792;
    static int anInt4793 = 1405;
    static int anInt4794;
    static int anInt4795;
    static IndexLoader indexLoader31;
    
    public static void method1159(byte i) {
	aShortArrayArray4791 = null;
	aClass65_4787 = null;
	if (i >= 36)
	    indexLoader31 = null;
    }
    
    EntryElementLoader(IndexLoader loader, String string) {
	try {
	    aString4788 = string;
	    indexLoader = loader;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("nv.<init>("
					     + (loader != null ? "{...}"
						: "null")
					     + ','
					     + (string != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    public final ElementLoaderNode getLoaderNode(int i) {
	anInt4794++;
	if (i != -15004)
	    method1159((byte) -110);
	return ElementLoaderNode.aClass69_1198;
    }
    
    public final int getPercentComplete(int i) {
	anInt4790++;
	if (indexLoader.getArchiveExists(aString4788))
	    return 100;
	return indexLoader.method397(aString4788, 0);
    }
}
