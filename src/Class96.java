/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.lang.reflect.Method;

final class Class96
{
    static final AbstractToolkit createDirectxToolkit(int i, int i_0_, d var_d, IndexLoader loader,
			      Canvas canvas) {
	if (i_0_ != 18993)
	    return null;
	AbstractToolkit var_ha;
	try {
	    if (!Class9.method215(27165))
		throw new RuntimeException("");
	    if (!Class348_Sub40_Sub19.method3098(-30282, "jagdx"))
		throw new RuntimeException("");
	    Class var_class = Class.forName("Class378");
	    Method method
		= (var_class.getDeclaredMethod
		   ("createToolkit",
		    new Class[] { Class.forName("java.awt.Canvas"),
				  Class.forName("d"), Class.forName("IndexLoader"),
				  Class.forName("java.lang.Integer") }));
	    var_ha = (AbstractToolkit) method.invoke(null,
					new Object[] { canvas, var_d, loader,
						       new Integer(i) });
	} catch (Throwable throwable) {
	    throw new RuntimeException("");
	}
	return var_ha;
    }
}
