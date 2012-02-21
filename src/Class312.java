/* Class312 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class312
{
    private Node aClass348_3922;
    private Deque aClass262_3923;
    static int anInt3924;
    static IncomingPacket aClass114_3925;
    static int anInt3926;
    static int anInt3927;
    static int anInt3928;
    static int anInt3929;
    static int anInt3930 = 2;
    static int anInt3931;
    static int anInt3932;
    
    final Node method2327(byte i) {
	anInt3929++;
	Node class348
	    = (((Node) ((Deque) aClass262_3923).parent)
	       .nodeParent);
	if (i != -53)
	    method2329(-21);
	if (((Deque) aClass262_3923).parent == class348) {
	    aClass348_3922 = null;
	    return null;
	}
	aClass348_3922 = ((Node) class348).nodeParent;
	return class348;
    }
    
    final void method2328(Deque class262, int i) {
	anInt3927++;
	if (i <= 73)
	    method2327((byte) -67);
	aClass262_3923 = class262;
    }
    
    final Node method2329(int i) {
	anInt3928++;
	if (i != 10)
	    method2330((byte) -25);
	Node class348 = aClass348_3922;
	if (((Deque) aClass262_3923).parent == class348) {
	    aClass348_3922 = null;
	    return null;
	}
	aClass348_3922 = ((Node) class348).nodeParent;
	return class348;
    }
    
    static final void method2330(byte i) {
	Class348_Sub3.method2739(0);
	anInt3924++;
	if (i == 86) {
	    Class348_Sub40_Sub25.currentPacketSize = 0;
	    Class348_Sub40_Sub36.aClass114_9456 = null;
	    ((ByteBuffer) Class299.gameBuffer).position
		= 0;
	    AbstractConnection.aClass114_3133 = null;
	    Class239.aClass114_3145 = null;
	    StringNode.anInt7213 = 0;
	    Class348_Sub3.currentIncomingPacket = null;
	    Class289.anInt3699 = 0;
	    Class348_Sub40_Sub39.method3153(0);
	    Class348_Sub40_Sub37.method3147((byte) 27);
	    for (int i_0_ = 0; i_0_ < 2048; i_0_++)
		ClassicLoadingScreen.players[i_0_] = null;
	    Class132.localPlayer = null;
	    for (int i_1_ = 0;
		 (i_1_ ^ 0xffffffff) > (Class348_Sub32.anInt6930 ^ 0xffffffff);
		 i_1_++) {
		Npc class318_sub1_sub3_sub3_sub1
		    = (((Class348_Sub22)
			Class348_Sub40_Sub23.aClass348_Sub22Array9319[i_1_])
		       .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
		if (class318_sub1_sub3_sub3_sub1 != null)
		    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub1)
			.anInt10275
			= -1;
	    }
	    Class363.method3515(i + 36);
	    Class9.anInt167 = Class318_Sub1_Sub5_Sub2.anInt10163 = -1;
	    Class348_Sub40_Sub21.anInt9282 = 1;
	    ByteBuffer.setClientState(2, 10);
	    for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -101; i_2_++)
		Class152.aBooleanArray2076[i_2_] = true;
	    Class286_Sub2.method2145(-24498);
	    Class239_Sub4.aClass348_Sub26_5881 = null;
	    Class101_Sub2.aLong5745 = 0L;
	}
    }
    
    public static void method2331(boolean bool) {
	aClass114_3925 = null;
	if (bool != true)
	    anInt3930 = -53;
    }
    
    static final boolean method2332(int i, byte i_3_, int i_4_) {
	if (i_3_ <= 120)
	    anInt3930 = 6;
	anInt3926++;
	if ((0x20 & i_4_) == 0)
	    return false;
	return true;
    }
    
    public Class312() {
	/* empty */
    }
    
    Class312(Deque class262) {
	aClass262_3923 = class262;
    }
    
    static {
	aClass114_3925 = new IncomingPacket(27, 3);
	anInt3931 = 0;
	anInt3932 = 1403;
    }
}
