/* Class348_Sub40_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub19 extends Class348_Sub40
{
    static int anInt9253;
    static IncomingPacket aClass114_9254 = new IncomingPacket(73, 3);
    static int anInt9255;
    static int anInt9256;
    static IncomingPacket aClass114_9257;
    static int anInt9258;
    static int[] anIntArray9259 = new int[2];
    /*synthetic*/ static Class aClass9260;
    
    static final void method3097(Widget[] class46s, int i, int i_0_) {
	if (i_0_ >= 116) {
	    for (int i_1_ = 0;
		 (i_1_ ^ 0xffffffff) > (class46s.length ^ 0xffffffff);
		 i_1_++) {
		Widget class46 = class46s[i_1_];
		if (class46 != null) {
		    if ((((Widget) class46).type ^ 0xffffffff) == -1) {
			if (((Widget) class46).children != null)
			    method3097(((Widget) class46).children, i,
				       125);
			Class348_Sub41 class348_sub41
			    = ((Class348_Sub41)
			       (Class125.aClass356_4915.get
				((long) ((Widget) class46).anInt830)));
			if (class348_sub41 != null)
			    Class239_Sub12.method1775((byte) -8,
						      (((Class348_Sub41)
							class348_sub41)
						       .anInt7050),
						      i);
		    }
		    if ((i ^ 0xffffffff) == -1
			&& ((Widget) class46).anObjectArray840 != null) {
			InterfaceScript class348_sub36 = new InterfaceScript();
			((InterfaceScript) class348_sub36).parent
			    = class46;
			((InterfaceScript) class348_sub36).parameters
			    = ((Widget) class46).anObjectArray840;
			ScriptExecutor.executeScript(class348_sub36);
		    }
		    if (i == 1
			&& ((Widget) class46).anObjectArray701 != null) {
			if (((Widget) class46).anInt704 >= 0) {
			    Widget class46_2_
				= AbstractFontRasterizer.getWidget((((Widget) class46)
						       .anInt830));
			    if (class46_2_ == null
				|| (((Widget) class46_2_).children
				    == null)
				|| (((((Widget) class46_2_)
				      .children).length
				     ^ 0xffffffff)
				    >= (((Widget) class46).anInt704
					^ 0xffffffff))
				|| class46 != (((Widget) class46_2_)
					       .children
					       [((Widget) class46).anInt704]))
				continue;
			}
			InterfaceScript class348_sub36 = new InterfaceScript();
			((InterfaceScript) class348_sub36).parent
			    = class46;
			((InterfaceScript) class348_sub36).parameters
			    = ((Widget) class46).anObjectArray701;
			ScriptExecutor.executeScript(class348_sub36);
		    }
		}
	    }
	    anInt9258++;
	}
    }
    
    final int[] method3042(int i, int i_3_) {
	if (i_3_ != 255)
	    aClass114_9254 = null;
	anInt9256++;
	return Class318_Sub6.anIntArray6432;
    }
    
    public Class348_Sub40_Sub19() {
	super(0, true);
    }
    
    static final boolean method3098(int i, String string) {
	if (i != -30282)
	    return true;
	anInt9255++;
	return Class348_Sub6.registerNativeLibrary((aClass9260 != null ? aClass9260
					 : (aClass9260 = method3101("Class90"))),
					(byte) 20, string);
    }
    
    public static void method3099(byte i) {
	aClass114_9254 = null;
	aClass114_9257 = null;
	anIntArray9259 = null;
	if (i >= -63)
	    anIntArray9259 = null;
    }
    
    static final boolean method3100(int i, boolean bool, int i_4_) {
	anInt9253++;
	if (bool != false)
	    anIntArray9259 = null;
	if (!(GameMode.method1637(i, 32768, i_4_) | (0x800 & i_4_) != 0)
	    && !Class273.method2056(i_4_, 86, i))
	    return false;
	return true;
    }
    
    /*synthetic*/ static Class method3101(String string) {
	try {
	    return Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	aClass114_9257 = new IncomingPacket(102, 3);
    }
}
