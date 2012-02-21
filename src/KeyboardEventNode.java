/* KeyboardEventNode - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class KeyboardEventNode extends Node implements KeyboardEvent
{
    static int anInt4760;
    char ch;
    static int anInt4762;
    static int anInt4763;
    long timestamp;
    static int anInt4765;
    int anInt4766;
    int anInt4767;
    static int anInt4768;
    static int anInt4769;
    static IndexLoader indexLoader26;
    int anInt4771;
    
    public final int method27(int i) {
	if (i != 26276)
	    method27(113);
	anInt4769++;
	return ((KeyboardEventNode) this).anInt4771;
    }
    
    public final char getCharacter(byte i) {
	anInt4768++;
	if (i < 8)
	    method27(113);
	return ((KeyboardEventNode) this).ch;
    }
    
    public final int method26(int i) {
	anInt4762++;
	if (i != -7616)
	    method29((byte) 38);
	return ((KeyboardEventNode) this).anInt4766;
    }
    
    public final long method29(byte i) {
	int i_0_ = 17 / ((i - 46) / 58);
	anInt4765++;
	return ((KeyboardEventNode) this).timestamp;
    }
    
    public static void method2796(byte i) {
	indexLoader26 = null;
	if (i != 104)
	    method2796((byte) -6);
    }
    
    static final boolean method2797(String string, byte i) {
	anInt4763++;
	if (string == null)
	    return false;
	for (int i_1_ = 0; ((Class348_Sub40_Sub30.anInt9383 ^ 0xffffffff)
			    < (i_1_ ^ 0xffffffff)); i_1_++) {
	    if (string.equalsIgnoreCase(Class83.aStringArray1441[i_1_]))
		return true;
	}
	if (string.equalsIgnoreCase(((Player)
				     (Class132
				      .localPlayer))
				    .aString10544))
	    return true;
	if (i != -63)
	    return false;
	return false;
    }
    
    public final int method30(boolean bool) {
	anInt4760++;
	if (bool != false)
	    return -114;
	return ((KeyboardEventNode) this).anInt4767;
    }
}
