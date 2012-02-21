/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class113
{
    static long aLong1739 = 0L;
    static int anInt1740;
    static int anInt1741;
    static int mapdotsArchvieId;
    static IndexLoader indexLoader12;
    static RasterToolkit[] rasterToolkits;
    static int anInt1745 = 100;
    
    public Class113() {
	/* empty */
    }
    
    public final String toString() {
	anInt1741++;
	throw new IllegalStateException();
    }
    
    static final int method1056(int i, int i_0_, char c) {
	if (i_0_ != 30316)
	    return 27;
	anInt1740++;
	int i_1_ = c << -939602812;
	if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
	    int i_2_ = Character.toLowerCase(c);
	    i_1_ = 1 + (i_2_ << 648405028);
	}
	return i_1_;
    }
    
    public static void method1057(boolean bool) {
	indexLoader12 = null;
	rasterToolkits = null;
	if (bool != true)
	    method1056(110, -57, '\uffd1');
    }
}
