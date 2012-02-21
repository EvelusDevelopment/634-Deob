/* OutgoingPacket - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;

final class OutgoingPacket
{
    static int anInt4322;
    int sizeType;
    static int anInt4324;
    static int anInt4325;
    private int opcode;
    static Cache aClass60_4327 = new Cache(3000000, 200);
    static boolean consoleActive = false;
    static Font aFont4329;
    
    static final boolean method3455(String string, int i) {
	anInt4324++;
	if (string == null)
	    return false;
	for (int i_0_ = 0; ((Class348_Sub42_Sub12.anInt9604 ^ 0xffffffff)
			    < (i_0_ ^ 0xffffffff)); i_0_++) {
	    if (string.equalsIgnoreCase(Class122.aStringArray1808[i_0_]))
		return true;
	    if (string.equalsIgnoreCase(aa_Sub2.aStringArray5197[i_0_]))
		return true;
	}
	if (i != 28280)
	    consoleActive = false;
	return false;
    }
    
    public final String toString() {
	anInt4325++;
	throw new IllegalStateException();
    }
    
    final int getOpcode(int i) {
	anInt4322++;
	if (i != 200)
	    opcode = -78;
	return opcode;
    }
    
    public static void method3457(boolean bool) {
	aFont4329 = null;
	aClass60_4327 = null;
	if (bool != true)
	    method3455(null, -16);
    }
    
    OutgoingPacket(int op, int size) {
	opcode = op;
	((OutgoingPacket) this).sizeType = size;
    }
}
