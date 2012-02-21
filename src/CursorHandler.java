/* CursorHandler - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

final class CursorHandler
{
    private Robot robot;
    private Component aComponent2177;
    
    final void moveCursor(int i, int i_0_) {
	robot.mouseMove(i, i_0_);
    }
    
    final void setCursorImage(Component component, boolean bool) {
	if (bool)
	    component = null;
	else if (component == null)
	    throw new NullPointerException();
	if (component != aComponent2177) {
	    if (null != aComponent2177) {
		aComponent2177.setCursor(null);
		aComponent2177 = null;
	    }
	    if (null != component) {
		component.setCursor(component.getToolkit().createCustomCursor
				    (new BufferedImage(1, 1, 2),
				     new Point(0, 0), null));
		aComponent2177 = component;
	    }
	}
    }
    
    final void setCursorImage(Component component, int[] is, int i, int i_1_,
			  Point point) {
	if (is != null) {
	    BufferedImage bufferedimage = new BufferedImage(i, i_1_, 2);
	    bufferedimage.setRGB(0, 0, i, i_1_, is, 0, i);
	    component.setCursor
		(component.getToolkit().createCustomCursor(bufferedimage,
							   point, null));
	} else
	    component.setCursor(null);
    }
    
    CursorHandler() throws Exception {
	robot = new Robot();
    }
}
