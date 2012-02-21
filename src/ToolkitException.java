/* ToolkitException - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ToolkitException extends Exception
{
    static int anInt109;
    static int[] anIntArray110 = new int[4096];
    static int[][] anIntArrayArray111
	= { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 },
	    { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 },
	    { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 },
	    { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };
    static ItemLoader itemLoader;
    
    public ToolkitException() {
	/* empty */
    }
    
    public static void method140(byte i) {
	itemLoader = null;
	anIntArray110 = null;
	if (i == -126)
	    anIntArrayArray111 = null;
    }
    
    static final Widget method141(Widget class46, byte i) {
	anInt109++;
	int i_0_ = 98 / ((i - -14) / 41);
	Widget class46_1_ = Main.method108(class46);
	if (class46_1_ == null)
	    class46_1_ = ((Widget) class46).aClass46_782;
	return class46_1_;
    }
}
