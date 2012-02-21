/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class2
{
    static int anInt116;
    static Class141 aClass141_117;
    r aR118;
    AnimatableToolkit aClass64_119;
    static int anInt120;
    static int anInt121;
    static int anInt122;
    
    static final LobbyWorld getNextLobbyWorld(boolean bool) {
	if (bool != true)
	    method174(-106, -36);
	anInt122++;
	if (InterfaceScript.anInt6985 < Class65.lobbyWorlds.length)
	    return Class65.lobbyWorlds[InterfaceScript.anInt6985++];
	return null;
    }
    
    public static void method171(byte i) {
	aClass141_117 = null;
	if (i != 72)
	    method173(39, null, null);
    }
    
    static final void method172(int i, IndexLoader class45) {
	if (i != 30284)
	    getNextLobbyWorld(true);
	anInt116++;
	Class59_Sub2_Sub1.aClass45_8670 = class45;
    }
    
    static final void method173(int i, Widget class46, Widget class46_0_) {
	try {
	    anInt120++;
	    Class348_Sub38.anInt7009++;
	    BufferedPacket class348_sub47
		= Class286_Sub3.createBufferedPacket(Class239_Sub9.aClass351_5934,
					   Class348_Sub23_Sub2.outgoingGameIsaac);
	    ((BufferedPacket) class348_sub47).buffer
		.putInt(((Widget) class46).anInt830);
	    ((BufferedPacket) class348_sub47).buffer
		.method3353(((Widget) class46_0_).anInt704, (byte) 3);
	    ((BufferedPacket) class348_sub47).buffer
		.method3336(((Widget) class46_0_).anInt830, (byte) 44);
	    ((BufferedPacket) class348_sub47).buffer
		.putShort(((Widget) class46_0_).itemId);
	    ((BufferedPacket) class348_sub47).buffer
		.method3349(4325, ((Widget) class46).anInt704);
	    ((BufferedPacket) class348_sub47).buffer
		.method3349(4325, ((Widget) class46).itemId);
	    if (i > -50)
		aClass141_117 = null;
	    Class348_Sub42_Sub14.putBufferedPacket(-100, class348_sub47);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ak.E(" + i + ','
					     + (class46 != null ? "{...}"
						: "null")
					     + ','
					     + (class46_0_ != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    static final void method174(int i, int i_1_) {
	if (i_1_ != -30742)
	    aClass141_117 = null;
	anInt121++;
	Class332.aClass60_4139.method578(2, i);
    }
    
    public Class2() {
	/* empty */
    }
}
