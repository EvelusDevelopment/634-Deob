/* VarbitDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class VarbitDefinition
{
    static int anInt2012;
    static long[] aLongArray2013 = new long[10];
    static int anInt2014;
    static IndexLoader indexLoader36;
    int lowestBit;
    static int anInt2017;
    static int anInt2018;
    int id;
    int highestBit;
    
    final void initialize(int i, ByteBuffer class348_sub49) {
	if (i == 2048) {
	    anInt2018++;
	    for (;;) {
		int i_0_ = class348_sub49.getUByte();
		if (i_0_ == 0)
		    break;
		method1192(i_0_, class348_sub49, (byte) 17);
	    }
	}
    }
    
    private final void method1192(int i, ByteBuffer class348_sub49,
				  byte i_1_) {
	anInt2014++;
	if (i_1_ != 17)
	    method1194(-80);
	if (i == 1) {
	    ((VarbitDefinition) this).id = class348_sub49.getShort();
	    ((VarbitDefinition) this).lowestBit = class348_sub49.getUByte();
	    ((VarbitDefinition) this).highestBit = class348_sub49.getUByte();
	}
    }
    
    static final boolean method1193(int i, int i_2_, boolean bool) {
	if (bool != true)
	    return true;
	anInt2017++;
	if ((i_2_ & 0x800 ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
    
    public static void method1194(int i) {
	if (i != 10)
	    method1193(91, -68, true);
	aLongArray2013 = null;
	indexLoader36 = null;
    }
    
    public VarbitDefinition() {
	/* empty */
    }
}
