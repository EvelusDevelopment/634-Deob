/* Class155 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class155
{
    static int anInt2108;
    static OutgoingPacket aClass351_2109 = new OutgoingPacket(19, -1);
    static boolean aBoolean2110 = false;
    
    public static void method1236(byte i) {
	aClass351_2109 = null;
	if (i >= -78)
	    method1237((byte) 54, null);
    }
    
    static final void method1237(byte i, Widget class46) {
	anInt2108++;
	if (i < 69)
	    method1236((byte) -52);
	if (r.aBoolean9722) {
	    Huffman.anInt3775++;
	    if (((Widget) class46).scriptParameters != null) {
		Widget class46_0_
		    = Class348_Sub22.getWidgetChild(Class9.anInt169,
						Class149.anInt2046);
		if (class46_0_ != null) {
		    InterfaceScript script = new InterfaceScript();
		    ((InterfaceScript) script).parent = class46;
		    ((InterfaceScript) script).aClass46_6983 = class46_0_;
		    ((InterfaceScript) script).parameters
			= ((Widget) class46).scriptParameters;
		    ScriptExecutor.executeScript(script);
		}
	    }
	    BufferedPacket class348_sub47
		= Class286_Sub3.createBufferedPacket(AbstractBuffer.aClass351_4266,
					   Class348_Sub23_Sub2.outgoingGameIsaac);
	    ((BufferedPacket) class348_sub47).buffer
		.putInt(((Widget) class46).anInt830);
	    ((BufferedPacket) class348_sub47).buffer
		.method3356(Class149.anInt2046, -4086);
	    ((BufferedPacket) class348_sub47).buffer
		.method3335(-123, Class9.anInt169);
	    ((BufferedPacket) class348_sub47).buffer
		.putShort(Class301.anInt3829);
	    ((BufferedPacket) class348_sub47).buffer
		.method3335(92, ((Widget) class46).anInt704);
	    ((BufferedPacket) class348_sub47).buffer
		.putShort(((Widget) class46).itemId);
	    Class348_Sub42_Sub14.putBufferedPacket(-89, class348_sub47);
	}
    }
}
