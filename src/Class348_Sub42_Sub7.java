/* Class348_Sub42_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub42_Sub7 extends SubNode
{
    static int anInt9540;
    static int anInt9541 = -1;
    int anInt9542 = 0;
    static int anInt9543;
    static int anInt9544;
    
    private final void method3191(int i, ByteBuffer class348_sub49,
				  byte i_0_) {
	if ((i ^ 0xffffffff) == -3)
	    ((Class348_Sub42_Sub7) this).anInt9542
		= class348_sub49.getShort();
	anInt9544++;
	int i_1_ = -60 / ((i_0_ - -26) / 51);
    }
    
    public Class348_Sub42_Sub7() {
	/* empty */
    }
    
    final void method3192(byte i, ByteBuffer class348_sub49) {
	for (;;) {
	    int i_2_ = class348_sub49.getUByte();
	    if ((i_2_ ^ 0xffffffff) == -1)
		break;
	    method3191(i_2_, class348_sub49, (byte) 70);
	}
	if (i != 16)
	    anInt9541 = -83;
	anInt9543++;
    }
}
