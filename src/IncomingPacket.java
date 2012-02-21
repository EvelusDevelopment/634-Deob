/* IncomingPacket - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class IncomingPacket
{
    static int anInt1746;
    private int opcode;
    static int anInt1748;
    int size;
    static int anInt1750;
    
    final int getOpcode(byte i) {
	if (i <= 108)
	    opcode = 110;
	anInt1746++;
	return opcode;
    }
    
    public final String toString() {
	anInt1750++;
	throw new IllegalStateException();
    }
    
    IncomingPacket(int i, int i_0_) {
	((IncomingPacket) this).size = i_0_;
	opcode = i;
    }
    
    static final Class179 method1059(byte i, int i_1_) {
	anInt1748++;
	if (i != 95)
	    method1059((byte) 120, -75);
	Class179 class179 = new Class179(i_1_, false);
	return class179;
    }
}
