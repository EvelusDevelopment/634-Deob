/* MouseFunctionListener - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

final class MouseFunctionListener extends AbstractMouseListener
    implements MouseListener, MouseMotionListener, MouseWheelListener
{
    private int anInt7416;
    private int anInt7417;
    private Deque aClass262_7418 = new Deque();
    private int anInt7419;
    private Deque aClass262_7420 = new Deque();
    private int anInt7421;
    private int anInt7422;
    private int anInt7423;
    private boolean aBoolean7424;
    private Component aComponent7425;
    
    final boolean method3588(int i) {
	int i_0_ = -59 % ((i - -38) / 48);
	return -1 != (anInt7419 & 0x2 ^ 0xffffffff);
    }
    
    private final void addEvent(int i, int i_1_, int i_2_, int i_3_,
				  boolean bool) {
	MouseFunctionEvent class348_sub45_sub1 = new MouseFunctionEvent();
	((MouseFunctionEvent) class348_sub45_sub1).anInt9725 = i_3_;
	((MouseFunctionEvent) class348_sub45_sub1).anInt9728 = i_1_;
	((MouseFunctionEvent) class348_sub45_sub1).anInt9729 = i;
	((MouseFunctionEvent) class348_sub45_sub1).aLong9726
	    = Class62.getCurrentTimeMillis();
	((MouseFunctionEvent) class348_sub45_sub1).anInt9727 = i_2_;
	if (bool)
	    mouseDragged(null);
	aClass262_7420.addToFront(class348_sub45_sub1, -20180);
    }
    
    public final synchronized void mouseReleased(MouseEvent mouseevent) {
	int i = method3600(mouseevent, -75);
	if (-1 == (i & anInt7422 ^ 0xffffffff))
	    i = anInt7422;
	if (0 != (0x1 & i))
	    addEvent(mouseevent.getX(), 3, mouseevent.getClickCount(),
		       mouseevent.getY(), false);
	if (-1 != (i & 0x4 ^ 0xffffffff))
	    addEvent(mouseevent.getX(), 5, mouseevent.getClickCount(),
		       mouseevent.getY(), false);
	if ((0x2 & i) != 0)
	    addEvent(mouseevent.getX(), 4, mouseevent.getClickCount(),
		       mouseevent.getY(), false);
	anInt7422 &= i ^ 0xffffffff;
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    final int method3594(byte i) {
	if (i < 69)
	    addEvent(92, 34, 59, 2, false);
	return anInt7416;
    }
    
    private final void method3599(int i, int i_4_, int i_5_) {
	if (i_4_ == -1) {
	    anInt7421 = i_5_;
	    anInt7423 = i;
	    if (aBoolean7424)
		addEvent(i, -1, 0, i_5_, false);
	}
    }
    
    final boolean method3590(byte i) {
	if (i <= 112)
	    return false;
	return (anInt7419 & 0x4 ^ 0xffffffff) != -1;
    }
    
    public final synchronized void mousePressed(MouseEvent mouseevent) {
	int i = method3600(mouseevent, -90);
	if (1 == i)
	    addEvent(mouseevent.getX(), 0, mouseevent.getClickCount(),
		       mouseevent.getY(), false);
	else if ((i ^ 0xffffffff) == -5)
	    addEvent(mouseevent.getX(), 2, mouseevent.getClickCount(),
		       mouseevent.getY(), false);
	else if (-3 == (i ^ 0xffffffff))
	    addEvent(mouseevent.getX(), 1, mouseevent.getClickCount(),
		       mouseevent.getY(), false);
	anInt7422 |= i;
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    final int method3597(boolean bool) {
	if (bool != true)
	    return 27;
	return anInt7417;
    }
    
    private final int method3600(MouseEvent mouseevent, int i) {
	if (mouseevent.getButton() == 1) {
	    if (mouseevent.isMetaDown())
		return 4;
	    return 1;
	}
	if (mouseevent.getButton() == 2)
	    return 2;
	int i_6_ = -27 % ((57 - i) / 63);
	if (mouseevent.getButton() == 3)
	    return 4;
	return 0;
    }
    
    public final synchronized void mouseEntered(MouseEvent mouseevent) {
	method3599(mouseevent.getX(), -1, mouseevent.getY());
    }
    
    public final synchronized void mouseClicked(MouseEvent mouseevent) {
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    final boolean method3595(int i) {
	if (i >= -67)
	    mouseMoved(null);
	return (anInt7419 & 0x1 ^ 0xffffffff) != -1;
    }
    
    final MouseEventNode getFirstEvent(int i) {
	if (i != 0)
	    mouseReleased(null);
	return (MouseEventNode) aClass262_7418.removeFirst(8);
    }
    
    public final synchronized void mouseMoved(MouseEvent mouseevent) {
	method3599(mouseevent.getX(), -1, mouseevent.getY());
    }
    
    private final void method3601(int i) {
	if (null != aComponent7425) {
	    int i_7_ = 11 % ((i - -21) / 55);
	    aComponent7425.removeMouseWheelListener(this);
	    aComponent7425.removeMouseMotionListener(this);
	    aComponent7425.removeMouseListener(this);
	    aComponent7425 = null;
	    anInt7423 = anInt7421 = anInt7422 = 0;
	    anInt7417 = anInt7416 = anInt7419 = 0;
	    aClass262_7418 = null;
	    aClass262_7420 = null;
	}
    }
    
    final synchronized void process(int i) {
	anInt7416 = anInt7421;
	anInt7417 = anInt7423;
	anInt7419 = anInt7422;
	if (i == 0) {
	    Deque class262 = aClass262_7418;
	    aClass262_7418 = aClass262_7420;
	    aClass262_7420 = class262;
	    aClass262_7420.removeAll(127);
	}
    }
    
    public final synchronized void mouseWheelMoved
	(MouseWheelEvent mousewheelevent) {
	int i = mousewheelevent.getX();
	int i_8_ = mousewheelevent.getY();
	int i_9_ = mousewheelevent.getWheelRotation();
	addEvent(i, 6, i_9_, i_8_, false);
	mousewheelevent.consume();
    }
    
    public final synchronized void mouseExited(MouseEvent mouseevent) {
	method3599(mouseevent.getX(), -1, mouseevent.getY());
    }
    
    public final synchronized void mouseDragged(MouseEvent mouseevent) {
	method3599(mouseevent.getX(), -1, mouseevent.getY());
    }
    
    final void method3592(int i) {
	if (i == 0)
	    method3601(46);
    }
    
    private final void method3602(int i, Component component) {
	method3601(i ^ 0x6e);
	aComponent7425 = component;
	if (i != 0)
	    aComponent7425 = null;
	aComponent7425.addMouseListener(this);
	aComponent7425.addMouseMotionListener(this);
	aComponent7425.addMouseWheelListener(this);
    }
    
    MouseFunctionListener(Component component, boolean bool) {
	method3602(0, component);
	aBoolean7424 = bool;
    }
}
