/* na - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class na extends aa implements ModelToolkit
{
    long nativeid;
    
    public final native void w(boolean bool);
    
    protected final void finalize() {
	if (((na) this).nativeid != 0L)
	    Class257.method1947(0, this);
    }
    
    private final native void ma(SafeToolkit var_oa, ya var_ya, int i, int i_0_,
				 int[] is, int[] is_1_);
    
    na(SafeToolkit var_oa, ya var_ya, int i, int i_2_, int[] is, int[] is_3_) {
	ma(var_oa, var_ya, i, i_2_, is, is_3_);
    }
}
