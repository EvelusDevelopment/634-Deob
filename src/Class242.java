/* Class242 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class242
{
    static int anInt3151;
    static Class348_Sub42_Sub13 aClass348_Sub42_Sub13_3152 = null;
    private DirectxToolkit aHa_Sub2_3153;
    static int anInt3154;
    static int anInt3155;
    long aLong3156;
    
    public static void method1866(int i) {
	if (i != 0)
	    aClass348_Sub42_Sub13_3152 = null;
	aClass348_Sub42_Sub13_3152 = null;
    }
    
    static final void method1867(int i) {
	if (i < 44)
	    method1868((byte) -81, null);
	anInt3155++;
	Class88.anInt1498++;
	BufferedPacket class348_sub47
	    = Class286_Sub3.createBufferedPacket(Class318_Sub1_Sub1.aClass351_8724,
				       Class348_Sub23_Sub2.outgoingGameIsaac);
	((BufferedPacket) class348_sub47).buffer
	    .putByte(0);
	Class348_Sub42_Sub14.putBufferedPacket(118, class348_sub47);
    }
    
    protected final void finalize() throws Throwable {
	anInt3151++;
	aHa_Sub2_3153.method3769(((Class242) this).aLong3156, false);
	super.finalize();
    }
    
    static final void method1868(byte i,
				 Class348_Sub42_Sub13 class348_sub42_sub13) {
	int i_0_ = -104 / ((i - 38) / 54);
	anInt3154++;
	class348_sub42_sub13.removeSubnode();
	boolean bool = false;
	for (Class348_Sub42_Sub13 class348_sub42_sub13_1_
		 = ((Class348_Sub42_Sub13)
		    Class233.aClass107_3022.getFirst());
	     class348_sub42_sub13_1_ != null;
	     class348_sub42_sub13_1_
		 = ((Class348_Sub42_Sub13)
		    Class233.aClass107_3022.next())) {
	    if (Class318_Sub2.method2496(class348_sub42_sub13_1_
					     .method3235(-17937),
					 class348_sub42_sub13
					     .method3235(-17937),
					 true)) {
		ElementLoaderNode.method721(class348_sub42_sub13_1_,
				  class348_sub42_sub13, -1);
		bool = true;
		break;
	    }
	}
	if (!bool)
	    Class233.aClass107_3022.add(class348_sub42_sub13);
    }
    
    Class242(DirectxToolkit var_ha_Sub2, long l, int i) {
	try {
	    aHa_Sub2_3153 = var_ha_Sub2;
	    ((Class242) this).aLong3156 = l;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("tba.<init>("
					     + (var_ha_Sub2 != null ? "{...}"
						: "null")
					     + ',' + l + ',' + i + ')'));
	}
    }
}
