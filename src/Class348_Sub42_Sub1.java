/* Class348_Sub42_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub42_Sub1 extends SubNode
{
    static int anInt9488;
    static int anInt9489;
    static int anInt9490;
    static float[] aFloatArray9491;
    static int anInt9492 = 0;
    static int anInt9493;
    private HashTable aClass356_9494;
    static boolean[][] aBooleanArrayArray9495;
    static int anInt9496;
    static int anInt9497;
    
    public static void method3165(byte i) {
	if (i > 39) {
	    aFloatArray9491 = null;
	    aBooleanArrayArray9495 = null;
	}
    }
    
    final int method3166(int i, int i_0_, byte i_1_) {
	anInt9490++;
	if (aClass356_9494 == null)
	    return i_0_;
	Class348_Sub35 class348_sub35
	    = (Class348_Sub35) aClass356_9494.get((long) i);
	if (i_1_ < 91)
	    return 72;
	if (class348_sub35 == null)
	    return i_0_;
	return ((Class348_Sub35) class348_sub35).anInt6976;
    }
    
    private final void method3167(int i, ByteBuffer class348_sub49,
				  byte i_2_) {
	if (i_2_ == -86) {
	    anInt9489++;
	    if ((i ^ 0xffffffff) == -250) {
		int i_3_ = class348_sub49.getUByte();
		if (aClass356_9494 == null) {
		    int i_4_ = Class33.method340(i_3_, (byte) 108);
		    aClass356_9494 = new HashTable(i_4_);
		}
		for (int i_5_ = 0; (i_3_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff);
		     i_5_++) {
		    boolean bool = class348_sub49.getUByte() == 1;
		    int i_6_ = class348_sub49.getTri();
		    Node class348;
		    if (bool)
			class348
			    = new StringNode(class348_sub49
						     .getJStr());
		    else
			class348
			    = new Class348_Sub35(class348_sub49
						     .getDWord());
		    aClass356_9494.putNode((long) i_6_,
					      class348);
		}
	    }
	}
    }
    
    final void method3168(ByteBuffer class348_sub49, byte i) {
	for (;;) {
	    int i_7_ = class348_sub49.getUByte();
	    if (i_7_ == 0)
		break;
	    method3167(i_7_, class348_sub49, (byte) -86);
	}
	anInt9497++;
	if (i >= -59)
	    method3169(-56, -67);
    }
    
    public Class348_Sub42_Sub1() {
	/* empty */
    }
    
    static final boolean method3169(int i, int i_8_) {
	if (i_8_ != 0)
	    return true;
	anInt9496++;
	for (Class348_Sub42_Sub12 class348_sub42_sub12
		 = ((Class348_Sub42_Sub12)
		    Class348_Sub40_Sub4.aClass262_9111.getFirst(4));
	     class348_sub42_sub12 != null;
	     class348_sub42_sub12
		 = (Class348_Sub42_Sub12) Class348_Sub40_Sub4
					      .aClass262_9111
					      .nextForward((byte) 99)) {
	    if (Class367_Sub8.method3549(((Class348_Sub42_Sub12)
					  class348_sub42_sub12).anInt9608,
					 (byte) -28)
		&& (long) i == (((Class348_Sub42_Sub12) class348_sub42_sub12)
				.aLong9605))
		return true;
	}
	return false;
    }
    
    final String method3170(int i, String string, int i_9_) {
	anInt9493++;
	if (aClass356_9494 == null)
	    return string;
	if (i != -250)
	    method3165((byte) 0);
	StringNode class348_sub50
	    = (StringNode) aClass356_9494.get((long) i_9_);
	if (class348_sub50 == null)
	    return string;
	return ((StringNode) class348_sub50).value;
    }
    
    static {
	aFloatArray9491 = new float[4];
	aBooleanArrayArray9495
	    = new boolean[][] { new boolean[13],
				{ false, false, true, true, true, true, true,
				  false, false, false, false, false, true },
				{ true, true, true, true, true, true, false,
				  false, false, false, false, false, false },
				{ true, true, true, false, false, true, true,
				  true, false, false, false, false, false },
				{ true, false, false, false, false, true, true,
				  true, false, false, false, false, false },
				{ false, false, true, true, true, true, false,
				  false, false, false, false, false, false },
				{ false, true, true, true, true, true, false,
				  false, false, false, false, false, true },
				{ false, true, true, true, true, true, true,
				  true, false, false, false, false, true },
				{ true, true, false, false, false, false,
				  false, true, false, false, false, false,
				  false },
				{ true, true, true, true, true, false, false,
				  false, true, true, false, false, false },
				{ true, false, false, false, true, true, true,
				  true, true, true, false, false, false },
				{ true, false, true, true, true, true, true,
				  true, false, false, true, true, false },
				{ true, true, true, true, true, true, true,
				  true, true, true, true, true, true },
				new boolean[13],
				{ true, true, true, true, true, true, true,
				  true, true, true, true, true, true } };
    }
}
