/* Class222 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class222
{
    int anInt2883;
    static int anInt2884 = 0;
    static Class138 aClass138_2885 = new Class138(4, 1, 1, 1);
    Class166 aClass166_2886;
    static int anInt2887;
    static int anInt2888;
    static int anInt2889;
    int anInt2890;
    private int anInt2891;
    static OutgoingPacket aClass351_2892 = new OutgoingPacket(39, 8);
    
    private final void method1608(int i, ByteBuffer class348_sub49,
				  byte i_0_) {
	anInt2887++;
	if ((i ^ 0xffffffff) == -2)
	    anInt2891 = class348_sub49.getShort();
	else if (i == 2) {
	    ((Class222) this).anInt2883 = class348_sub49.getUByte();
	    ((Class222) this).anInt2890 = class348_sub49.getUByte();
	}
	if (i_0_ != 4)
	    method1608(-8, null, (byte) 81);
    }
    
    public static void method1609(byte i) {
	if (i <= -71) {
	    aClass351_2892 = null;
	    aClass138_2885 = null;
	}
    }
    
    final synchronized Sprite method1610(byte i) {
	anInt2888++;
	Sprite class207
	    = (Sprite) ((Class166) ((Class222) this).aClass166_2886)
			     .aClass60_2190.method583((long) anInt2891, -70);
	if (class207 != null)
	    return class207;
	class207
	    = Sprite.loadSingleSprite(((Class166) (((Class222) this)
					       .aClass166_2886)).aClass45_2180,
				  anInt2891, 0);
	if (i < 49)
	    method1609((byte) 93);
	if (class207 != null)
	    ((Class166) ((Class222) this).aClass166_2886).aClass60_2190
		.method582(class207, (long) anInt2891, (byte) -120);
	return class207;
    }
    
    final void method1611(ByteBuffer class348_sub49, boolean bool) {
	for (;;) {
	    int i = class348_sub49.getUByte();
	    if (i == 0)
		break;
	    method1608(i, class348_sub49, (byte) 4);
	}
	anInt2889++;
	if (bool != false)
	    method1610((byte) -86);
    }
    
    public Class222() {
	/* empty */
    }
}
