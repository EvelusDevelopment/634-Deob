/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class RuntimeException_Sub1 extends RuntimeException
{
    String aString4594;
    Throwable aThrowable4595;
    static int anInt4596;
    static int anInt4597;
    static int anInt4598;
    static boolean aBoolean4599;
    static int anInt4600 = 52;
    static OutgoingPacket aClass351_4601;
    static float[] aFloatArray4602;
    static int[] anIntArray4603;
    static boolean aBoolean4604;
    static int anInt4605;
    
    static final aa_Sub1 method4009(int i, int[] is, int[] is_0_, int i_1_,
				    DirectxToolkit var_ha_Sub2, int i_2_) {
	try {
	    anInt4597++;
	    byte[] is_3_ = new byte[i * i_2_];
	    for (int i_4_ = i_1_; (i_2_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff);
		 i_4_++) {
		int i_5_ = i * i_4_ - -is[i_4_];
		for (int i_6_ = 0;
		     (is_0_[i_4_] ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++)
		    is_3_[i_5_++] = (byte) -1;
	    }
	    return new aa_Sub1(var_ha_Sub2, i, i_2_, is_3_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("kg.C(" + i + ','
					     + (is != null ? "{...}" : "null")
					     + ','
					     + (is_0_ != null ? "{...}"
						: "null")
					     + ',' + i_1_ + ','
					     + (var_ha_Sub2 != null ? "{...}"
						: "null")
					     + ',' + i_2_ + ')'));
	}
    }
    
    public static void method4010(int i) {
	if (i == -3) {
	    anIntArray4603 = null;
	    aFloatArray4602 = null;
	    aClass351_4601 = null;
	}
    }
    
    RuntimeException_Sub1(Throwable throwable, String string) {
	((RuntimeException_Sub1) this).aString4594 = string;
	((RuntimeException_Sub1) this).aThrowable4595 = throwable;
    }
    
    static final void method4011(int i, IndexLoader class45) {
	anInt4598++;
	if (i != 1024)
	    method4012(null, (byte) 68);
	Main.anInt5171 = 0;
	Class348_Sub1_Sub1.anInt8808 = 0;
	Class152.aClass243_2077 = new Class243();
	Class239_Sub25.aClass318_Sub9_Sub2_Sub1Array6103
	    = new Class318_Sub9_Sub2_Sub1[1024];
	Class348_Sub51.aClass318_Sub10Array7249
	    = new Class318_Sub10[(Class348_Sub42_Sub9.anIntArray9558
				  [Class348_Sub6.anInt6637]) + 1];
	Class258_Sub3.anInt8550 = 0;
	InputstreamWorker.anInt4559 = 0;
	Class117.method1072(class45, (byte) -107);
	Class2.method172(30284, class45);
    }
    
    static final void method4012(byte[] is, byte i) {
	anInt4605++;
	ByteBuffer class348_sub49 = new ByteBuffer(is);
	int i_7_ = -91 % ((i - -51) / 42);
	boolean bool = false;
	for (;;) {
	    int i_8_ = class348_sub49.getUByte();
	    if ((i_8_ ^ 0xffffffff) == -1)
		break;
	    if (i_8_ == 1) {
		if (Class118.anIntArray1786 == null) {
		    Class118.anIntArray1786 = new int[4];
		    Class132.anInt1905 = 4;
		    AlternativeFontLoader.anIntArray1636 = new int[4];
		}
		for (int i_9_ = 0; i_9_ < Class118.anIntArray1786.length;
		     i_9_++) {
		    Class118.anIntArray1786[i_9_]
			= class348_sub49.method3372(13638);
		    AlternativeFontLoader.anIntArray1636[i_9_]
			= class348_sub49.method3372(13638);
		}
		bool = true;
	    } else if ((i_8_ ^ 0xffffffff) != -3) {
		if ((i_8_ ^ 0xffffffff) == -4) {
		    Class132.anInt1905 = class348_sub49.getUByte();
		    Class118.anIntArray1786 = new int[Class132.anInt1905];
		    AlternativeFontLoader.anIntArray1636 = new int[Class132.anInt1905];
		}
	    } else
		AbstractImageFetcher.anInt6923
		    = class348_sub49.getShort();
	}
	if (!bool) {
	    if (Class118.anIntArray1786 == null) {
		Class118.anIntArray1786 = new int[4];
		AlternativeFontLoader.anIntArray1636 = new int[4];
		Class132.anInt1905 = 4;
	    }
	    for (int i_10_ = 0; i_10_ < Class118.anIntArray1786.length;
		 i_10_++) {
		Class118.anIntArray1786[i_10_] = 0;
		AlternativeFontLoader.anIntArray1636[i_10_] = i_10_ * 20;
	    }
	}
    }
    
    static {
	aBoolean4599 = true;
	anInt4596 = -1;
	aFloatArray4602 = new float[4];
	aBoolean4604 = false;
	aClass351_4601 = new OutgoingPacket(65, 3);
    }
}
