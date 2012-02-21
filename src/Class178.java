/* Class178 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class178
{
    static int anInt2336;
    static int anInt2337;
    static IncomingPacket aClass114_2338 = new IncomingPacket(92, -1);
    static HandshakePacket aClass29_2339 = new HandshakePacket(14, 0);
    static int anInt2340;
    static HandshakePacket js5initialPacket = new HandshakePacket(15, 4);
    static HandshakePacket aClass29_2342 = new HandshakePacket(16, -2);
    static HandshakePacket aClass29_2343 = new HandshakePacket(17, 0);
    static HandshakePacket aClass29_2344 = new HandshakePacket(18, -2);
    static HandshakePacket aClass29_2345 = new HandshakePacket(19, -2);
    static HandshakePacket aClass29_2346 = new HandshakePacket(20, 6);
    static HandshakePacket aClass29_2347 = new HandshakePacket(21, 9);
    static HandshakePacket aClass29_2348 = new HandshakePacket(22, -2);
    static HandshakePacket aClass29_2349 = new HandshakePacket(23, 4);
    static HandshakePacket aClass29_2350 = new HandshakePacket(24, -1);
    static HandshakePacket aClass29_2351 = new HandshakePacket(26, 0);
    static HandshakePacket aClass29_2352 = new HandshakePacket(27, 0);
    static HandshakePacket aClass29_2353 = new HandshakePacket(28, -2);
    private static HandshakePacket[] handshakePackets = new HandshakePacket[32];
    
    public static void method1355(int i) {
	aClass29_2346 = null;
	aClass29_2349 = null;
	aClass29_2344 = null;
	aClass29_2352 = null;
	aClass114_2338 = null;
	if (i > -74)
	    method1356(true, null, -116, -47, true, null, true);
	aClass29_2350 = null;
	handshakePackets = null;
	aClass29_2353 = null;
	aClass29_2351 = null;
	aClass29_2339 = null;
	aClass29_2343 = null;
	js5initialPacket = null;
	aClass29_2345 = null;
	aClass29_2342 = null;
	aClass29_2348 = null;
	aClass29_2347 = null;
    }
    
    static final void method1356(boolean bool, String string, int i, int i_0_,
				 boolean bool_1_, String string_2_,
				 boolean bool_3_) {
	try {
	    anInt2337++;
	    ((IndexLoader) Class174.indexLoader19).unpackSettings = 1;
	    string_2_ = string_2_.toLowerCase();
	    short[] is = new short[16];
	    int i_4_ = -1;
	    String string_5_ = null;
	    if (i_0_ != -1) {
		Class254 class254
		    = Class101_Sub3.aClass326_5764.method2600(i_0_, 28364);
		if (class254 == null || bool != class254.method1925(!bool_3_))
		    return;
		if (class254.method1925(!bool_3_))
		    string_5_ = ((Class254) class254).aString3258;
		else
		    i_4_ = ((Class254) class254).anInt3256;
	    }
	    int i_6_ = 0;
	    int i_7_ = 0;
	    if (bool_3_ != true)
		aClass29_2352 = null;
	    for (/**/;
		 i_7_ < ((ItemLoader) ToolkitException.itemLoader).anInt3271;
		 i_7_++) {
		ItemDefinition class213
		    = ToolkitException.itemLoader.getItemDefinition(-74, i_7_);
		if ((!bool_1_ || ((ItemDefinition) class213).aBoolean2755)
		    && ((ItemDefinition) class213).anInt2833 == -1
		    && ((ItemDefinition) class213).anInt2812 == -1
		    && ((ItemDefinition) class213).anInt2799 == 0
		    && ((ItemDefinition) class213).aString2795.toLowerCase()
			   .indexOf(string_2_) != -1) {
		    if (i_0_ != -1) {
			if (bool) {
			    if (!string.equals(class213.method1561
					       (string_5_, i_0_, -1511086397)))
				continue;
			} else if (class213.method1567(i_4_, -116, i_0_) != i)
			    continue;
		    }
		    if ((i_6_ ^ 0xffffffff) <= -251) {
			Class192.aShortArray2579 = null;
			Class76.anInt1285 = -1;
			return;
		    }
		    if (is.length <= i_6_) {
			short[] is_8_ = new short[2 * is.length];
			for (int i_9_ = 0; i_9_ < i_6_; i_9_++)
			    is_8_[i_9_] = is[i_9_];
			is = is_8_;
		    }
		    is[i_6_++] = (short) i_7_;
		}
	    }
	    Class192.aShortArray2579 = is;
	    Class76.anInt1285 = i_6_;
	    Class148.anInt2037 = 0;
	    String[] strings = new String[Class76.anInt1285];
	    for (int i_10_ = 0;
		 (i_10_ ^ 0xffffffff) > (Class76.anInt1285 ^ 0xffffffff);
		 i_10_++)
		strings[i_10_]
		    = ((ItemDefinition) ToolkitException.itemLoader
				      .getItemDefinition(123, is[i_10_])).aString2795;
	    Class174.method1333(Class192.aShortArray2579, 26073, strings);
	    Class174.indexLoader19.removeChildren();
	    ((IndexLoader) Class174.indexLoader19).unpackSettings = 2;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("qa.A(" + bool + ','
					     + (string != null ? "{...}"
						: "null")
					     + ',' + i + ',' + i_0_ + ','
					     + bool_1_ + ','
					     + (string_2_ != null ? "{...}"
						: "null")
					     + ',' + bool_3_ + ')'));
	}
    }
    
    static {
	HandshakePacket[] packets = Class5_Sub1.getHandshakePackets((byte) 59);
	for (int i = 0; i < packets.length; i++)
	    handshakePackets[((HandshakePacket) packets[i]).opcode] = packets[i];
    }
}
