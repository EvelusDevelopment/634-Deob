/* Class268 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class268
{
    int anInt3429;
    private static short[] aShortArray3430 = { -1, -1, -1, -1, -1 };
    static int anInt3431;
    static int[] anIntArray3432 = new int[500];
    private Cache aClass60_3433 = new Cache(64);
    static int anInt3434;
    static int anInt3435;
    static int anInt3436;
    private static short[] aShortArray3437;
    static boolean[] aBooleanArray3438;
    static int anInt3439 = 16777215;
    static int anInt3440;
    static int anInt3441 = 0;
    private IndexLoader aClass45_3442;
    static short[][] aShortArrayArray3443;
    static int anInt3444;
    static int anInt3445;
    static int anInt3446;
    int anInt3447 = 0;
    static int anInt3448;
    private static short[] aShortArray3449;
    
    static final long method2031(int i, String string) {
	anInt3448++;
	long l = 0L;
	int i_0_ = string.length();
	for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
	    l *= 37L;
	    int i_2_ = string.charAt(i_1_);
	    if (i_2_ < 65 || (i_2_ ^ 0xffffffff) < -91) {
		if ((i_2_ ^ 0xffffffff) <= -98 && (i_2_ ^ 0xffffffff) >= -123)
		    l += (long) (1 - (-i_2_ + 97));
		else if (i_2_ >= 48 && i_2_ <= 57)
		    l += (long) (i_2_ + 27 - 48);
	    } else
		l += (long) (1 + (i_2_ + -65));
	    if ((l ^ 0xffffffffffffffffL) <= -177917621779460414L)
		break;
	}
	if (i != -1994)
	    aShortArrayArray3443 = null;
	for (/**/; ((l % 37L ^ 0xffffffffffffffffL) == -1L
		    && (l ^ 0xffffffffffffffffL) != -1L); l /= 37L) {
	    /* empty */
	}
	return l;
    }
    
    final void method2032(int i, int i_3_) {
	synchronized (aClass60_3433) {
	    aClass60_3433.method578(2, i);
	    if (i_3_ > -10)
		method2035(116, 38);
	}
	anInt3436++;
    }
    
    final void method2033(byte i) {
	anInt3434++;
	synchronized (aClass60_3433) {
	    if (i != 46)
		method2037(-66);
	    aClass60_3433.method587(-94);
	}
    }
    
    final Class277 method2034(int i, boolean bool) {
	if (bool != false)
	    aShortArray3437 = null;
	anInt3431++;
	Class277 class277;
	synchronized (aClass60_3433) {
	    class277 = (Class277) aClass60_3433.method583((long) i, 64);
	}
	if (class277 != null)
	    return class277;
	byte[] is;
	synchronized (aClass45_3442) {
	    is = aClass45_3442.loadArchiveChild(-1860, 4, i);
	}
	class277 = new Class277();
	((Class277) class277).anInt3573 = i;
	((Class277) class277).aClass268_3562 = this;
	if (is != null)
	    class277.method2070(true, new ByteBuffer(is));
	class277.method2067(-4860);
	synchronized (aClass60_3433) {
	    aClass60_3433.method582(class277, (long) i, (byte) -111);
	}
	return class277;
    }
    
    static final void method2035(int i, int i_4_) {
	anInt3445++;
	int i_5_ = Class367_Sub11.logicCycle - FloatBuffer.anInt9751;
	if ((i_5_ ^ 0xffffffff) <= -101) {
	    Class348_Sub40_Sub21.anInt9282 = 1;
	    Class9.anInt167 = Class318_Sub1_Sub5_Sub2.anInt10163 = -1;
	} else {
	    int i_6_ = (int) Class76.aFloat1287;
	    if ((Class348_Sub35.anInt6979 >> 838758760 ^ 0xffffffff)
		< (i_6_ ^ 0xffffffff))
		i_6_ = Class348_Sub35.anInt6979 >> -1334580536;
	    if (Class181.aBooleanArray2374[4]
		&& ItemLoader.anIntArray3273[4] - -128 > i_6_)
		i_6_ = ItemLoader.anIntArray3273[4] + 128;
	    int i_7_ = 0x3fff & (int) AbtractArchiveLoader.aFloat3938 + ModernLoadingScreen.anInt5016;
	    if (i_4_ != 0)
		method2031(-117, null);
	    AnimationDefinition.method268(i_6_,
			      -200 + (Class275.method2064
				      ((((Class318_Sub1)
					 (Class132
					  .localPlayer))
					.anInt6377),
				       Class355.anInt4372, 11219,
				       (((Class318_Sub1)
					 (Class132
					  .localPlayer))
					.anInt6388))),
			      i_7_, Class192.anInt2578, i, -19360,
			      Class130_Sub1.anInt5799,
			      3 * (i_6_ >> 214328355) + 600 << 1969254946);
	    float f = (-((float) ((100 + -i_5_) * (100 - i_5_) * (-i_5_ + 100))
			 / 1000000.0F)
		       + 1.0F);
	    Class286_Sub4.anInt6246
		= (int) ((float) Class318_Sub1_Sub3_Sub2.anInt10047
			 + f * (float) (-Class318_Sub1_Sub3_Sub2.anInt10047
					+ Class286_Sub4.anInt6246));
	    Class305.anInt3855 = (int) ((float) (-Class5_Sub3.anInt8368
						 + Class305.anInt3855) * f
					+ (float) Class5_Sub3.anInt8368);
	    ClientScript.anInt9701
		= (int) ((float) LobbyRegionInfo.anInt3662
			 + (float) (ClientScript.anInt9701
				    - LobbyRegionInfo.anInt3662) * f);
	    Class59_Sub2_Sub2.anInt8685
		= (int) ((float) Class359.anInt4424
			 + f * (float) (-Class359.anInt4424
					+ Class59_Sub2_Sub2.anInt8685));
	    int i_8_ = Class5.anInt4638 - Class253.anInt3253;
	    if (i_8_ <= 8192) {
		if ((i_8_ ^ 0xffffffff) > 8191)
		    i_8_ += 16384;
	    } else
		i_8_ -= 16384;
	    Class5.anInt4638
		= (int) ((float) i_8_ * f + (float) Class253.anInt3253);
	    Class5.anInt4638 &= 0x3fff;
	}
    }
    
    public static void method2036(byte i) {
	aShortArrayArray3443 = null;
	aShortArray3437 = null;
	if (i != 121)
	    method2035(57, 35);
	aShortArray3449 = null;
	aShortArray3430 = null;
	anIntArray3432 = null;
	aBooleanArray3438 = null;
    }
    
    final void method2037(int i) {
	synchronized (aClass60_3433) {
	    aClass60_3433.removeAll(i ^ i);
	}
	anInt3440++;
    }
    
    static final void method2038(int i) {
	if (i <= -47) {
	    for (int i_9_ = 0;
		 (Message.anInt2021 ^ 0xffffffff) < (i_9_ ^ 0xffffffff);
		 i_9_++) {
		Class10 class10 = Class258_Sub2.aClass10Array8531[i_9_];
		if (((Class10) class10).aByte180 == 3) {
		    if (((Class10) class10).aClass348_Sub16_Sub5_176 == null)
			((Class10) class10).anInt188 = -2147483648;
		    else
			Class348_Sub43.aClass348_Sub16_Sub4_7065.method2880
			    (((Class10) class10).aClass348_Sub16_Sub5_176);
		}
	    }
	    anInt3446++;
	}
    }
    
    Class268(GameMode class230, int i, IndexLoader class45) {
	try {
	    aClass45_3442 = class45;
	    ((Class268) this).anInt3429 = aClass45_3442.method407(4);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("cb.<init>("
					     + (class230 != null ? "{...}"
						: "null")
					     + ',' + i + ','
					     + (class45 != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    static {
	aShortArray3437 = new short[] { -1, -1, -1, -1, -1 };
	anInt3444 = 13156520;
	anInt3435 = -1;
	aBooleanArray3438 = new boolean[100];
	aShortArray3449 = new short[] { 6798, 8741, 25238, 4626, 4550 };
	aShortArrayArray3443
	    = new short[][] { aShortArray3449, aShortArray3437,
			      aShortArray3430 };
    }
}
