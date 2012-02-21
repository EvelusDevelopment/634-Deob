/* Class348_Sub23_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

final class Class348_Sub23_Sub4 extends Class348_Sub23
{
    static int anInt9047;
    private float aFloat9048;
    static int anInt9049;
    static int[] anIntArray9050 = new int[14];
    private String aString9051;
    static int anInt9052;
    static int anInt9053;
    private int anInt9054;
    private int anInt9055;
    static int anInt9056;
    private String aString9057;
    private String aString9058;
    static int anInt9059;
    static int anInt9060;
    static int anInt9061;
    private float aFloat9062;
    static int anInt9063;
    
    Class348_Sub23_Sub4(OggStreamState oggstreamstate) {
	super(oggstreamstate);
    }
    
    final void method2961(byte i) {
	anInt9056++;
	if (i != 13)
	    aString9058 = null;
    }
    
    final float method2983(byte i) {
	if (i <= 61)
	    return -0.49539495F;
	anInt9052++;
	return aFloat9062;
    }
    
    final float method2984(byte i) {
	anInt9060++;
	if (i != 97)
	    aFloat9048 = -0.6790166F;
	return aFloat9048;
    }
    
    static final boolean method2985(int i, int i_0_, int i_1_) {
	if (i != -31735)
	    method2990((byte) -62);
	anInt9059++;
	if ((0x100 & i_1_ ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
    
    final void method2964(byte i, OggPacket oggpacket) {
	anInt9063++;
	if ((((Class348_Sub23) this).anInt6868 ^ 0xffffffff) >= -1
	    || "SUB".equals(aString9057)) {
	    ByteBuffer class348_sub49
		= new ByteBuffer(oggpacket.getData());
	    int i_2_ = class348_sub49.getUByte();
	    if (((Class348_Sub23) this).anInt6868 <= 8) {
		if (((i_2_ | 0x80) ^ 0xffffffff) == -1)
		    throw new IllegalStateException();
		if (((Class348_Sub23) this).anInt6868 == 0) {
		    ((ByteBuffer) class348_sub49).position += 23;
		    anInt9055 = class348_sub49.method3359(-89);
		    anInt9054 = class348_sub49.method3359(-41);
		    if ((anInt9055 ^ 0xffffffff) == -1 || anInt9054 == 0)
			throw new IllegalStateException();
		    ByteBuffer class348_sub49_3_ = new ByteBuffer(16);
		    class348_sub49.getBytes((((ByteBuffer)
                                              class348_sub49_3_)
                                             .payload), 0, 16);
		    aString9051 = class348_sub49_3_.getJStr();
		    ((ByteBuffer) class348_sub49_3_).position = 0;
		    class348_sub49.getBytes((((ByteBuffer)
                                              class348_sub49_3_)
                                             .payload), 0, 16);
		    aString9057 = class348_sub49_3_.getJStr();
		}
	    } else {
		if (i_2_ == 0) {
		    long l = class348_sub49.method3332((byte) 109);
		    long l_4_ = class348_sub49.method3332((byte) 90);
		    long l_5_ = class348_sub49.method3332((byte) 122);
		    if ((l ^ 0xffffffffffffffffL) > -1L
			|| (l_4_ ^ 0xffffffffffffffffL) > -1L
			|| (l_5_ ^ 0xffffffffffffffffL) > -1L || l_5_ > l)
			throw new IllegalStateException();
		    aFloat9062
			= (float) ((long) anInt9054 * l) / (float) anInt9055;
		    aFloat9048 = ((float) ((l - -l_4_) * (long) anInt9054)
				  / (float) anInt9055);
		    int i_6_ = class348_sub49.method3359(-93);
		    if (i_6_ < 0
			|| ((-((ByteBuffer) class348_sub49).position
			     + (((ByteBuffer) class348_sub49)
				.payload).length)
			    ^ 0xffffffff) > (i_6_ ^ 0xffffffff))
			throw new IllegalStateException();
		    aString9058
			= (Class239_Sub17.method1793
			   (((ByteBuffer) class348_sub49).payload,
			    ((ByteBuffer) class348_sub49).position, -123,
			    i_6_));
		}
		if ((i_2_ | 0x80) != 0)
		    return;
	    }
	    if (i >= -91)
		anInt9055 = 88;
	}
    }
    
    final String method2986(int i) {
	anInt9053++;
	if (i < 26)
	    method2986(-122);
	return aString9051;
    }
    
    static final void method2987(int i, int i_7_, int i_8_, int i_9_,
				 int i_10_) {
	anInt9047++;
	if (i_7_ != 8 && (i_7_ ^ 0xffffffff) != -17) {
	    Class357 class357
		= Message.aClass357ArrayArrayArray2029[i][i_10_][i_8_];
	    if (class357 != null) {
		if (i_7_ != 1) {
		    if ((i_7_ ^ 0xffffffff) == -3)
			((Class357) class357).aShort4398 = (short) 0;
		} else
		    ((Class357) class357).aShort4409 = (short) 0;
	    }
	    Class286_Sub3.method2152(false);
	} else {
	    for (int i_11_ = 0;
		 ((i_11_ ^ 0xffffffff)
		  > (Class348_Sub44.anInt7101 ^ 0xffffffff));
		 i_11_++) {
		Class338 class338 = ClassicLoadingScreen.aClass338Array5060[i_11_];
		if ((((Class338) class338).aByte4192 == i_7_
		     && i_10_ == ((Class338) class338).aShort4185
		     && i_8_ == ((Class338) class338).aShort4193)
		    || (((i_10_ ^ 0xffffffff)
			 == (((Class338) class338).aShort4182 ^ 0xffffffff))
			&& ((i_8_ ^ 0xffffffff)
			    == (((Class338) class338).aShort4193
				^ 0xffffffff)))) {
		    if ((Class348_Sub44.anInt7101 ^ 0xffffffff)
			!= (i_11_ ^ 0xffffffff))
			Class214.method1575(ClassicLoadingScreen.aClass338Array5060,
					    1 + i_11_,
					    ClassicLoadingScreen.aClass338Array5060, i_11_,
					    (ClassicLoadingScreen.aClass338Array5060.length
					     + -i_11_ - 1));
		    Class348_Sub44.anInt7101--;
		    return;
		}
	    }
	}
	if (i_9_ != -3951)
	    anIntArray9050 = null;
    }
    
    static final void method2988(boolean bool) {
	Cache.aHa1098.xa(((float) ((Class348_Sub51)
				     BitmapTable.aClass348_Sub51_3959)
					.aClass239_Sub10_7232
					.method1764(-32350) * 0.1F
			    + 0.7F) * IntergerVarScriptSettingDefinition.aFloat2137);
	anInt9049++;
	Cache.aHa1098.ZA(Class119_Sub1.anInt4703, TextureLoader.aFloat4626,
			   Class361.aFloat4455,
			   (float) (Class21.anInt325 << -1467252254),
			   (float) (Class318_Sub1_Sub3_Sub1.anInt10023
				    << 1007991618),
			   (float) (Class196.anInt2601 << -2056140414));
	Cache.aHa1098.method3653(Class158.aClass299_4938);
	if (bool != true)
	    anIntArray9050 = null;
    }
    
    final String method2989(int i) {
	int i_12_ = 4 / ((i - -63) / 50);
	anInt9061++;
	return aString9058;
    }
    
    public static void method2990(byte i) {
	anIntArray9050 = null;
	if (i <= 101)
	    anIntArray9050 = null;
    }
}
