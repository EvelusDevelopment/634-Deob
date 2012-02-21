/* ba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ba extends r implements ModelToolkit
{
    long nativeid;
    
    ba(SafeToolkit var_oa) {
	/* empty */
    }
    
    protected final void finalize() {
	if (((ba) this).nativeid != 0L)
	    Class257.method1947(0, this);
    }
    
    public final native void w(boolean bool);
}
