/* Class50_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class50_Sub1 extends Class50
{
    static Class101 aClass101_5209;
    static int anInt5210;
    static int anInt5211;
    private int anInt5212;
    private int anInt5213;
    private int anInt5214;
    static int anInt5215;
    static int anInt5216;
    static OutgoingPacket aClass351_5217;
    static int anInt5218;
    static boolean aBoolean5219 = true;
    static int anInt5220;
    static boolean aBoolean5221 = false;
    private int anInt5222;
    static String[] aStringArray5223;
    static boolean aBoolean5224;
    static boolean[][] aBooleanArrayArray5225;
    static boolean aBoolean5226;
    
    final void method455(int i, int i_0_, int i_1_) {
	anInt5220++;
	if (i_1_ >= -98)
	    aBoolean5221 = false;
	int i_2_ = anInt5214 * i >> -1153073620;
	int i_3_ = i * anInt5213 >> -641039412;
	int i_4_ = anInt5212 * i_0_ >> 53146732;
	int i_5_ = i_0_ * anInt5222 >> -376712532;
	Class299_Sub2.method2267(10499, i_5_, i_2_, ((Class50) this).anInt865,
				 ((Class50) this).anInt864,
				 ((Class50) this).anInt862, i_4_, i_3_);
    }
    
    public static void method460(int i) {
	if (i != 2)
	    method460(-52);
	aClass101_5209 = null;
	aBooleanArrayArray5225 = null;
	aStringArray5223 = null;
	aClass351_5217 = null;
    }
    
    Class50_Sub1(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_,
		 int i_11_) {
	super(i_9_, i_10_, i_11_);
	anInt5214 = i;
	anInt5222 = i_8_;
	anInt5213 = i_7_;
	anInt5212 = i_6_;
    }
    
    final void method457(int i, int i_12_, int i_13_) {
	anInt5211++;
	if (i_13_ >= -29)
	    method460(-42);
    }
    
    final void method456(int i, int i_14_, int i_15_) {
	if (i <= 87)
	    anInt5214 = -17;
	anInt5218++;
	int i_16_ = i_14_ * anInt5214 >> -246469844;
	int i_17_ = anInt5213 * i_14_ >> -678539124;
	int i_18_ = anInt5212 * i_15_ >> -49634420;
	int i_19_ = i_15_ * anInt5222 >> -938127988;
	AbstractToolkit.method3641(i_18_, i_19_, (byte) -75, ((Class50) this).anInt864,
		      i_17_, i_16_);
    }
    
    static final byte[] getVariableBufferArray(boolean bool, Object object, int i) {
	anInt5215++;
	if (object == null)
	    return null;
	if (object instanceof byte[]) {
	    byte[] is = (byte[]) object;
	    if (bool)
		return NativeToolkit.split(is, 0);
	    return is;
	}
	if (i != 53146732)
	    return null;
	if (object instanceof AbstractBuffer) {
	    AbstractBuffer class344 = (AbstractBuffer) object;
	    return class344.getPayload();
	}
	throw new IllegalArgumentException();
    }
    
    static final char method462(byte i, int i_20_) {
	anInt5216++;
	int i_21_ = 0xff & i;
	if ((i_21_ ^ 0xffffffff) == -1)
	    throw new IllegalArgumentException("Non cp1252 character 0x"
					       + Integer.toString(i_21_, 16)
					       + " provided");
	if ((i_21_ ^ 0xffffffff) <= -129 && i_21_ < 160) {
	    int i_22_ = Class44.aCharArray625[i_21_ + -128];
	    if ((i_22_ ^ 0xffffffff) == -1)
		i_22_ = 63;
	    i_21_ = i_22_;
	}
	if (i_20_ != -128)
	    method463(null, false);
	return (char) i_21_;
    }
    
    static final int[] method463(BufferedPacket class348_sub47, boolean bool) {
	anInt5210++;
	ByteBuffer class348_sub49 = new ByteBuffer(518);
	int[] is = new int[4];
	for (int i = 0; (i ^ 0xffffffff) > -5; i++)
	    is[i] = (int) (Math.random() * 9.9999999E7);
	class348_sub49.putByte(10);
	class348_sub49.putInt(is[0]);
	class348_sub49.putInt(is[1]);
	class348_sub49.putInt(is[2]);
	class348_sub49.putInt(is[3]);
	for (int i = 0; (i ^ 0xffffffff) > -11; i++)
	    class348_sub49.putInt((int) (9.9999999E7 * Math.random()));
	class348_sub49.putShort((int) (9.9999999E7 * Math.random()));
	class348_sub49.applyRSA(Class318_Sub1_Sub4.aBigInteger8762, AbstractImageFetcher.aBigInteger6921);
	((BufferedPacket) class348_sub47).buffer.putBytes
	    (((ByteBuffer) class348_sub49).position, 0,
	     ((ByteBuffer) class348_sub49).payload);
	return is;
    }
    
    static {
	aClass351_5217 = new OutgoingPacket(17, 8);
	aBooleanArrayArray5225
	    = (new boolean[][]
	       { new boolean[4], { false, true, true, false },
		 { true, false, true, false }, { true, false, true, false },
		 { false, false, true, false }, { false, false, true, false },
		 { true, false, true, false }, { true, false, false, true },
		 { true, false, false, true }, { true, true, false, false },
		 new boolean[4], { false, true, false, true },
		 new boolean[4] });
	aBoolean5226 = false;
	aBoolean5224 = false;
    }
}
