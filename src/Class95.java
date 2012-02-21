/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class95
{
    static int anInt1539;
    static IncomingPacket aClass114_1540 = new IncomingPacket(113, 1);
    static IndexLoader indexLoader2;
    static Class221 aClass221_1542;
    static Class348_Sub42_Sub17[] aClass348_Sub42_Sub17Array1543
	= new Class348_Sub42_Sub17[14];
    
    static final int method868(int i, int i_0_, boolean bool) {
	anInt1539++;
	if (bool != false)
	    method868(89, 115, true);
	if ((i ^ 0xffffffff) == -2 || (i ^ 0xffffffff) == -4)
	    return Class348_Sub42_Sub10.anIntArray9572[i_0_ & 0x3];
	return Class348_Sub42_Sub20.anIntArray9714[i_0_ & 0x3];
    }
    
    public static void method869(int i) {
	indexLoader2 = null;
	aClass114_1540 = null;
	aClass348_Sub42_Sub17Array1543 = null;
	aClass221_1542 = null;
	if (i != 3)
	    method869(55);
    }
}
