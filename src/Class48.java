/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class48
{
    int anInt847;
    static int anInt848;
    static int anInt849;
    static int anInt850;
    static short aShort851;
    static char[] aCharArray852
	= { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
	    'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
	    'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    int anInt853;
    int anInt854;
    static int anInt855;
    int anInt856;
    int anInt857 = 128;
    int anInt858;
    static int anInt859;
    static int[] anIntArray860;
    
    public static void method448(byte i) {
	aCharArray852 = null;
	anIntArray860 = null;
	int i_0_ = -50 % ((37 - i) / 40);
    }
    
    static final void method449(String string, String string_1_, boolean bool,
				int i, boolean bool_2_) {
	do {
	    try {
		anInt849++;
		BufferedPacket class348_sub47 = Class203.method1478(true);
		((BufferedPacket) class348_sub47).buffer
		    .putByte
		    (((HandshakePacket) Class178.aClass29_2348).opcode);
		((BufferedPacket) class348_sub47).buffer
		    .putShort(0);
		int i_3_
		    = (((ByteBuffer) (((BufferedPacket) class348_sub47)
					  .buffer))
		       .position);
		((BufferedPacket) class348_sub47).buffer
		    .putShort(634);
		int[] is = Class50_Sub1.method463(class348_sub47, false);
		int i_4_
		    = (((ByteBuffer) (((BufferedPacket) class348_sub47)
					  .buffer))
		       .position);
		((BufferedPacket) class348_sub47).buffer
		    .putJStr((byte) -5, string_1_);
		((BufferedPacket) class348_sub47).buffer
		    .putShort(SocketWorker.anInt2670);
		((BufferedPacket) class348_sub47).buffer
		    .putJStr((byte) -5, string);
		((BufferedPacket) class348_sub47).buffer
		    .putLong(TextureLoader.aLong4615);
		((BufferedPacket) class348_sub47).buffer
		    .putByte(Class348_Sub33.gameLanguage);
		((BufferedPacket) class348_sub47).buffer
		    .putByte
		    ((((GameMode) Class348_Sub42_Sub8_Sub2.gameType)
		      .id));
		s_Sub2.method4002((((BufferedPacket) class348_sub47)
				   .buffer),
				  (byte) 55);
		String string_5_ = Class14_Sub1.aString8605;
		((BufferedPacket) class348_sub47).buffer
		    .putByte(string_5_ == null ? 0 : 1);
		if (string_5_ != null)
		    ((BufferedPacket) class348_sub47)
			.buffer
			.putJStr((byte) -5, string_5_);
		((BufferedPacket) class348_sub47).buffer
		    .putByte(i);
		((BufferedPacket) class348_sub47).buffer
		    .putByte(!bool_2_ ? 0 : 1);
		((ByteBuffer) (((BufferedPacket) class348_sub47)
				   .buffer)).position
		    += 7;
		((BufferedPacket) class348_sub47).buffer
		    .encipherXTEA
		    (is, i_4_,
		     (((ByteBuffer) (((BufferedPacket) class348_sub47)
					 .buffer))
		      .position));
		((BufferedPacket) class348_sub47).buffer
		    .method3383
		    (1809639944,
		     (((ByteBuffer) (((BufferedPacket) class348_sub47)
					 .buffer)).position
		      + -i_3_));
		Class348_Sub42_Sub14.putBufferedPacket(2, class348_sub47);
		GameFont.connectionOpcode = -3;
		Class367_Sub2.anInt7297 = 1;
		Class169.anInt2264 = 0;
		NativeRaster.anInt8398 = 0;
		if ((i ^ 0xffffffff) <= -14)
		    break;
		Class330.aBoolean4127 = true;
		Class286_Sub8.method2172(60);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("iq.D("
						 + (string != null ? "{...}"
						    : "null")
						 + ','
						 + (string_1_ != null ? "{...}"
						    : "null")
						 + ',' + bool + ',' + i + ','
						 + bool_2_ + ')'));
	    }
	    break;
	} while (false);
    }
    
    static final int method450(int i, String string, int i_6_) {
	if (i != -20188)
	    return 88;
	anInt850++;
	return Class239_Sub26.method1836(-123, i_6_, true, string);
    }
    
    final void method451(Class48 class48_7_, byte i) {
	((Class48) this).anInt857 = ((Class48) class48_7_).anInt857;
	((Class48) this).anInt858 = ((Class48) class48_7_).anInt858;
	((Class48) this).anInt856 = ((Class48) class48_7_).anInt856;
	((Class48) this).anInt854 = ((Class48) class48_7_).anInt854;
	anInt855++;
	((Class48) this).anInt847 = ((Class48) class48_7_).anInt847;
	((Class48) this).anInt853 = ((Class48) class48_7_).anInt853;
	if (i != -110)
	    method448((byte) -93);
    }
    
    final Class48 method452(boolean bool) {
	anInt848++;
	if (bool != true)
	    method448((byte) -81);
	return new Class48(((Class48) this).anInt858,
			   ((Class48) this).anInt856,
			   ((Class48) this).anInt857,
			   ((Class48) this).anInt854,
			   ((Class48) this).anInt847,
			   ((Class48) this).anInt853);
    }
    
    Class48(int i) {
	((Class48) this).anInt856 = 128;
	((Class48) this).anInt858 = i;
    }
    
    private Class48(int i, int i_8_, int i_9_, int i_10_, int i_11_,
		    int i_12_) {
	((Class48) this).anInt856 = 128;
	((Class48) this).anInt847 = i_11_;
	((Class48) this).anInt854 = i_10_;
	((Class48) this).anInt853 = i_12_;
	((Class48) this).anInt858 = i;
	((Class48) this).anInt856 = i_8_;
	((Class48) this).anInt857 = i_9_;
    }
    
    static {
	aShort851 = (short) 32767;
	anInt859 = -1;
	anIntArray860 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
    }
}
