/* Class281 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class281
{
    static OutgoingPacket aClass351_3644 = new OutgoingPacket(42, 8);
    static int anInt3645;
    static int anInt3646;
    static int anInt3647;
    static OutgoingPacket aClass351_3648 = new OutgoingPacket(55, 4);
    static BitmapFont aClass143_3649;
    static int anInt3650;
    
    static final void method2106(String string, int i) {
	anInt3645++;
	BufferedPacket class348_sub47 = Class203.method1478(true);
	((BufferedPacket) class348_sub47).buffer
	    .putByte(((HandshakePacket) Class178.aClass29_2353).opcode);
	((BufferedPacket) class348_sub47).buffer
	    .putShort(0);
	int i_0_ = (((ByteBuffer) (((BufferedPacket) class348_sub47)
				       .buffer))
		    .position);
	((BufferedPacket) class348_sub47).buffer
	    .putShort(634);
	int[] is = Class50_Sub1.method463(class348_sub47, false);
	int i_1_ = (((ByteBuffer) (((BufferedPacket) class348_sub47)
				       .buffer))
		    .position);
	((BufferedPacket) class348_sub47).buffer
	    .putJStr((byte) -5, string);
	((BufferedPacket) class348_sub47).buffer
	    .putByte(Class348_Sub33.gameLanguage);
	((ByteBuffer)
	 ((BufferedPacket) class348_sub47).buffer).position
	    += 7;
	((BufferedPacket) class348_sub47).buffer.encipherXTEA
	    (is, i_1_,
	     ((ByteBuffer) (((BufferedPacket) class348_sub47)
				.buffer)).position);
	((BufferedPacket) class348_sub47).buffer.method3383
	    (1809639944,
	     -i_0_ + (((ByteBuffer) (((BufferedPacket) class348_sub47)
					 .buffer))
		      .position));
	Class348_Sub42_Sub14.putBufferedPacket(118, class348_sub47);
	if (i <= 99)
	    getNameHash(null, 70);
	Class367_Sub2.anInt7297 = 1;
	GameFont.connectionOpcode = -3;
	Class169.anInt2264 = 0;
	NativeRaster.anInt8398 = 0;
    }
    
    public static void method2107(byte i) {
	aClass351_3648 = null;
	aClass143_3649 = null;
	aClass351_3644 = null;
	if (i != 77)
	    method2107((byte) -107);
    }
    
    static final int getNameHash(String string, int i) {
	anInt3646++;
	int i_2_ = string.length();
	int i_3_ = 0;
	for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff); i_4_++)
	    i_3_ = (Class354.decodeCharacter(string.charAt(i_4_), false)
		    + ((i_3_ << -126731387) - i_3_));
	if (i != -29286)
	    return 0;
	return i_3_;
    }
}
