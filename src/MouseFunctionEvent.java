/* MouseFunctionEvent - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class MouseFunctionEvent extends MouseEventNode
{
    int anInt9725;
    long aLong9726;
    int anInt9727;
    int anInt9728;
    int anInt9729;
    
    final int getType(int i) {
	if (i < 50)
	    return 113;
	return ((MouseFunctionEvent) this).anInt9728;
    }
    
    final long method3312(byte i) {
	if (i > -79)
	    method3308((byte) -8);
	return ((MouseFunctionEvent) this).aLong9726;
    }
    
    final int method3311(int i) {
	int i_0_ = 48 % ((i - -61) / 40);
	return ((MouseFunctionEvent) this).anInt9725;
    }
    
    final int getClickCount(int i) {
	if (i != 0)
	    return 57;
	return ((MouseFunctionEvent) this).anInt9727;
    }
    
    final int method3308(byte i) {
	if (i >= -126)
	    return -80;
	return ((MouseFunctionEvent) this).anInt9729;
    }
}
