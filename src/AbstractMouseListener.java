/* AbstractMouseListener - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class AbstractMouseListener
{
    static int anInt4533;
    static int anInt4534;
    static int anInt4535;
    
    abstract boolean method3588(int i);
    
    abstract void process(int i);
    
    public AbstractMouseListener() {
	/* empty */
    }
    
    abstract boolean method3590(byte i);
    
    static final Class181 method3591(int i, int i_0_) {
	anInt4535++;
	Class181 class181
	    = (Class181) Class5.aClass60_4636.method583((long) i, i_0_ + -128);
	if (class181 != null)
	    return class181;
	byte[] is = Class239_Sub12.aClass45_5964.loadArchiveChild(-1860, i_0_, i);
	class181 = new Class181();
	if (is != null)
	    class181.method1370(24, new ByteBuffer(is));
	class181.method1371(4);
	Class5.aClass60_4636.method582(class181, (long) i, (byte) -103);
	return class181;
    }
    
    abstract void method3592(int i);
    
    final boolean method3593(int i) {
	anInt4533++;
	if (i <= 91)
	    method3593(53);
	if (!method3595(-83) && !method3588(-121) && !method3590((byte) 125))
	    return false;
	return true;
    }
    
    abstract int method3594(byte i);
    
    abstract boolean method3595(int i);
    
    abstract MouseEventNode getFirstEvent(int i);
    
    abstract int method3597(boolean bool);
}
