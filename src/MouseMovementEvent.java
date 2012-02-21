/* MouseMovementEvent - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class MouseMovementEvent extends MouseEventNode
{
    int clickCount;
    static int anInt9731;
    static int anInt9732;
    int y;
    long timestamp;
    static int anInt9735;
    int type;
    static int anInt9737;
    static int anInt9738;
    int x;
    static int anInt9740;
    
    final int getType(int i) {
	anInt9731++;
	if (i < 50)
	    ((MouseMovementEvent) this).x = 69;
	return ((MouseMovementEvent) this).type;
    }
    
    static final void method3316(int i, int i_0_) {
	anInt9732++;
	WidgetVariable class348_sub42_sub15
	    = Class318_Sub9_Sub1.method2516(i_0_, (byte) 105, 3);
	if (i > 108)
	    class348_sub42_sub15.method3251(-16058);
    }
    
    final int method3311(int i) {
	anInt9740++;
	int i_1_ = 49 / ((-61 - i) / 40);
	return ((MouseMovementEvent) this).y;
    }
    
    final int method3308(byte i) {
	anInt9735++;
	if (i > -126)
	    ((MouseMovementEvent) this).x = 25;
	return ((MouseMovementEvent) this).x;
    }
    
    final long method3312(byte i) {
	if (i > -79)
	    return 102L;
	anInt9737++;
	return ((MouseMovementEvent) this).timestamp;
    }
    
    final int getClickCount(int i) {
	if (i != 0)
	    ((MouseMovementEvent) this).x = 66;
	anInt9738++;
	return ((MouseMovementEvent) this).clickCount;
    }
}
