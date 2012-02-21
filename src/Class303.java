/* Class303 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class303
{
    static IncomingPacket aClass114_3842;
    static int anInt3843;
    static int anInt3844 = 1;
    static int anInt3845;
    static int anInt3846;
    
    static final void method2285(boolean bool, byte i, int i_0_) {
	if (i > -61)
	    aClass114_3842 = null;
	anInt3843++;
	if (!bool)
	    ScriptExecutor.method701(Class141.aClass273_1966, i_0_, -1);
	else {
	    BufferedPacket class348_sub47
		= Class286_Sub3.createBufferedPacket(Class241.aClass351_3150,
					   Class348_Sub23_Sub2.outgoingGameIsaac);
	    ((BufferedPacket) class348_sub47).buffer
		.putShort(i_0_);
	    Class348_Sub42_Sub14.putBufferedPacket(42, class348_sub47);
	}
    }
    
    public static void method2286(int i) {
	aClass114_3842 = null;
	if (i != 114)
	    anInt3844 = 87;
    }
    
    static final Class125 method2287(ByteBuffer class348_sub49, byte i) {
	anInt3846++;
	int i_1_ = class348_sub49.getUByte();
	Class221 class221
	    = Class158.method1248(87)[class348_sub49.getUByte()];
	Class341 class341
	    = Class62.method596(20000)[class348_sub49.getUByte()];
	int i_2_ = class348_sub49.method3372(13638);
	int i_3_ = class348_sub49.method3372(13638);
	int i_4_ = class348_sub49.getShort();
	int i_5_ = class348_sub49.getShort();
	int i_6_ = class348_sub49.getDWord();
	int i_7_ = class348_sub49.getDWord();
	int i_8_ = class348_sub49.getDWord();
	int i_9_ = -54 / ((i - -45) / 61);
	boolean bool = class348_sub49.getUByte() == 1;
	return new Class125(i_1_, class221, class341, i_2_, i_3_, i_4_, i_5_,
			    i_6_, i_7_, i_8_, bool);
    }
    
    static final void method2288(boolean bool, AbstractToolkit var_ha) {
	anInt3845++;
	if (!Class71.aBoolean1211)
	    Class231.method1642((byte) 108, var_ha);
	else
	    Class135_Sub1.method1153(var_ha, 16);
	if (bool != false)
	    anInt3844 = -97;
    }
    
    static {
	aClass114_3842 = new IncomingPacket(114, 4);
    }
}
