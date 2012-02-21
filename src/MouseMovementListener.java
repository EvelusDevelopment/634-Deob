/* MouseMovementListener - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

final class MouseMovementListener extends AbstractMouseListener
    implements MouseListener, MouseMotionListener
{
    static int anInt7426;
    static int anInt7427;
    static int anInt7428;
    static int anInt7429;
    static int anInt7430;
    static int anInt7431;
    private int oldButtonMask;
    static int anInt7433;
    static int anInt7434;
    static int anInt7435;
    static int anInt7436;
    static int anInt7437;
    static int anInt7438;
    static int anInt7439;
    static int anInt7440;
    private Deque oldEventDeque = new Deque();
    private int oldCurrentY;
    static int anInt7443;
    static boolean aBoolean7444 = false;
    static int anInt7445;
    static LobbyRegionInfo[] lobbyRegionInfo;
    static int anInt7447;
    private int oldCurrentX;
    static int anInt7449;
    private Deque currentEventDeque = new Deque();
    static int anInt7451;
    static int anInt7452;
    private int currentY;
    private int currentX;
    static int anInt7455;
    private int buttonMask;
    static int anInt7457;
    private boolean trackMovement;
    private Component aComponent7459;
    
    private final void method3603(byte i, Component component) {
	anInt7447++;
	if (i >= -83)
	    mouseExited(null);
	destroy(85);
	aComponent7459 = component;
	aComponent7459.addMouseListener(this);
	aComponent7459.addMouseMotionListener(this);
    }
    
    public final synchronized void mouseDragged(MouseEvent mouseevent) {
	setCurrentCoordinates(mouseevent.getY(), (byte) -76, mouseevent.getX());
	anInt7427++;
    }
    
    public final synchronized void mouseEntered(MouseEvent mouseevent) {
	setCurrentCoordinates(mouseevent.getY(), (byte) -76, mouseevent.getX());
	anInt7426++;
    }
    
    private final int getMouseButton(MouseEvent mouseevent) {
	anInt7436++;
	int modifiers = mouseevent.getModifiers();
	boolean isButton1 = (0x10 & modifiers) != 0;
	boolean isButton2 = (modifiers & 0x8) != 0;
	boolean isButton3 = (0x4 & modifiers) != 0;
	if (isButton2 && (isButton1 || isButton3))
	    isButton2 = false;
	if (isButton1 && isButton3)
	    return 4;
	if (isButton1)
	    return 1;
	if (isButton2)
	    return 2;
	if (isButton3)
	    return 4;
	return 0;
    }
    
    public final synchronized void mouseExited(MouseEvent mouseevent) {
	setCurrentCoordinates(mouseevent.getY(), (byte) -76, mouseevent.getX());
	anInt7452++;
    }
    
    final boolean method3590(byte i) {
	anInt7457++;
	if (i <= 112)
	    addEvent(-77, 6, -104, -59);
	if ((oldButtonMask & 0x4 ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
    
    final synchronized void process(int i) {
	oldButtonMask = buttonMask;
	anInt7440++;
	oldCurrentX = currentY;
	oldCurrentY = currentX;
	Deque deque = oldEventDeque;
	oldEventDeque = currentEventDeque;
	currentEventDeque = deque;
	currentEventDeque.removeAll(i ^ 0x66);
    }
    
    public final synchronized void mouseMoved(MouseEvent mouseevent) {
	anInt7435++;
	setCurrentCoordinates(mouseevent.getY(), (byte) -76, mouseevent.getX());
    }
    
    private final void setCurrentCoordinates(int y, byte i_3_, int x) {
	anInt7445++;
	currentX = x;
	currentY = y;
	if (trackMovement)
	    addEvent(-1, y, x, 0);
    }
    
    final int method3594(byte i) {
	anInt7430++;
	if (i <= 69)
	    return -123;
	return oldCurrentX;
    }
    
    final MouseEventNode getFirstEvent(int i) {
	if (i != 0)
	    mouseReleased(null);
	anInt7437++;
	return (MouseEventNode) oldEventDeque.removeFirst(i + 8);
    }
    
    private final void addEvent(int type, int y, int x, int clicks) {
	anInt7439++;
	MouseMovementEvent event = new MouseMovementEvent();
	((MouseMovementEvent) event).x = x;
	((MouseMovementEvent) event).y = y;
	((MouseMovementEvent) event).clickCount = clicks;
	((MouseMovementEvent) event).type = type;
	((MouseMovementEvent) event).timestamp = Class62.getCurrentTimeMillis();
	currentEventDeque.addToFront(event, -20180);
    }
    
    public final synchronized void mouseClicked(MouseEvent mouseevent) {
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
	anInt7438++;
    }
    
    final void method3592(int i) {
	if (i != 0)
	    method3597(false);
	anInt7433++;
	destroy(84);
    }
    
    final boolean method3588(int i) {
	int i_9_ = -108 % ((-38 - i) / 48);
	anInt7434++;
	if ((oldButtonMask & 0x2 ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
    
    final boolean method3595(int i) {
	anInt7455++;
	if (i >= -67)
	    mouseExited(null);
	if ((oldButtonMask & 0x1) == 0)
	    return false;
	return true;
    }
    
    static final String method3607(int i, ByteBuffer class348_sub49,
				   int i_10_) {
	int i_11_ = 17 % ((9 - i_10_) / 59);
	anInt7451++;
	try {
	    int i_12_ = class348_sub49.getSmartA();
	    if ((i_12_ ^ 0xffffffff) < (i ^ 0xffffffff))
		i_12_ = i;
	    byte[] is = new byte[i_12_];
	    ((ByteBuffer) class348_sub49).position
		+= (AnimatableToolkit.huffman.method2226
		    (is, ((ByteBuffer) class348_sub49).position,
		     ((ByteBuffer) class348_sub49).payload, i_12_,
		     -1, 0));
	    String string = Class367_Sub8.method3546(is, 0, i_12_, 0);
	    return string;
	} catch (Exception exception) {
	    return "Cabbage";
	}
    }
    
    public final synchronized void mouseReleased(MouseEvent mouseevent) {
	anInt7428++;
	int button = getMouseButton(mouseevent);
	if ((button & buttonMask ^ 0xffffffff) == -1)
	    button = buttonMask;
	if ((button & 0x1 ^ 0xffffffff) != -1)
	    addEvent(3, mouseevent.getY(), mouseevent.getX(), mouseevent.getClickCount());
	if ((0x4 & button) != 0)
	    addEvent(5, mouseevent.getY(), mouseevent.getX(),
		       mouseevent.getClickCount());
	if ((0x2 & button) != 0)
	    addEvent(4, mouseevent.getY(), mouseevent.getX(), mouseevent.getClickCount());
	buttonMask &= button ^ 0xffffffff;
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    private final void destroy(int i) {
	anInt7431++;
	if (aComponent7459 != null) {
	    aComponent7459.removeMouseMotionListener(this);
	    aComponent7459.removeMouseListener(this);
	    aComponent7459 = null;
	    oldEventDeque = null;
	    currentEventDeque = null;
	    oldCurrentY = oldCurrentX = oldButtonMask = 0;
	    int i_13_ = -106 / ((-57 - i) / 46);
	    currentX = currentY = buttonMask = 0;
	}
    }
    
    final int method3597(boolean bool) {
	if (bool != true)
	    currentY = -101;
	anInt7443++;
	return oldCurrentY;
    }
    
    public final synchronized void mousePressed(MouseEvent mouseevent) {
	anInt7449++;
	int button = getMouseButton(mouseevent);
	if (button != 1) {
	    if (button == 4)
		addEvent(2, mouseevent.getY(), mouseevent.getX(),
			   mouseevent.getClickCount());
	    else if (button == 2)
		addEvent(1, mouseevent.getY(), mouseevent.getX(),
			   mouseevent.getClickCount());
	} else
	    addEvent(0, mouseevent.getY(), mouseevent.getX(),
		       mouseevent.getClickCount());
	buttonMask |= button;
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    public static void method3609(byte i) {
	lobbyRegionInfo = null;
    }
    
    MouseMovementListener(Component component, boolean bool) {
	method3603((byte) -108, component);
	trackMovement = bool;
    }
}
