/* Class348_Sub16_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

final class Class348_Sub16_Sub3 extends Class348_Sub16
{
    static int anInt8889;
    static int anInt8890;
    private HashTable aClass356_8891;
    static int anInt8892;
    static int anInt8893;
    private int[] anIntArray8894;
    int[] anIntArray8895;
    private int[] anIntArray8896;
    static int anInt8897;
    static int anInt8898;
    private int[] anIntArray8899;
    static int anInt8900;
    static int anInt8901;
    private int[] anIntArray8902;
    static int anInt8903;
    private int[] anIntArray8904;
    static int anInt8905;
    int[] anIntArray8906;
    static int anInt8907;
    static int anInt8908;
    static int anInt8909;
    static int[][] anIntArrayArray8910
	= { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 },
	    { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 },
	    { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 },
	    { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
    static int anInt8911;
    static int anInt8912;
    static int anInt8913;
    int[] anIntArray8914;
    private Class348_Sub43[][] aClass348_Sub43ArrayArray8915;
    private int[] anIntArray8916;
    static int anInt8917;
    static int anInt8918;
    static int anInt8919;
    static int anInt8920;
    private int anInt8921;
    static int anInt8922;
    static int anInt8923;
    static int anInt8924;
    private int[] anIntArray8925;
    static IndexLoader indexLoader22;
    static int anInt8927;
    private Class348_Sub43[][] aClass348_Sub43ArrayArray8928;
    static int anInt8929;
    static int anInt8930;
    static int anInt8931;
    static int anInt8932;
    private int anInt8933;
    static int anInt8934;
    static int anInt8935;
    static int anInt8936;
    private int[] anIntArray8937;
    static int anInt8938;
    private int[] anIntArray8939;
    static int anInt8940;
    static int anInt8941;
    private int[] anIntArray8942;
    static int anInt8943;
    private MidiFile aClass204_8944;
    private int[] anIntArray8945;
    static int anInt8946;
    private int[] anIntArray8947;
    static int anInt8948;
    static int anInt8949;
    static int anInt8950;
    static int anInt8951;
    static int anInt8952;
    private int[] anIntArray8953;
    static int anInt8954;
    static int anInt8955;
    private int anInt8956;
    private long aLong8957;
    private Class348_Sub16_Sub1 aClass348_Sub16_Sub1_8958;
    private long aLong8959;
    private int anInt8960;
    private boolean aBoolean8961;
    private int anInt8962;
    private MidiLoader aClass348_Sub2_8963;
    private boolean aBoolean8964;
    
    static final void method2839(int i, int i_0_, int i_1_) {
	anInt8890++;
	TextureLoader.anInt4609 = i - Class75.anInt1266;
	Class48.anInt859 = i_1_ + -Class75.anInt1263;
	if (i_0_ != -17)
	    method2839(-112, -58, -95);
    }
    
    final synchronized Class348_Sub16 method2818() {
	anInt8946++;
	return null;
    }
    
    private final synchronized void method2840(boolean bool, byte i) {
	aClass204_8944.method1487();
	anInt8950++;
	aClass348_Sub2_8963 = null;
	method2851(true, bool);
	if (i >= -74)
	    method2879(-43, 88, -33);
    }
    
    final synchronized void method2841(int i, int i_2_, int i_3_) {
	if (i_2_ < -34) {
	    anInt8935++;
	    method2854(i_3_, i, 98);
	}
    }
    
    private final void method2842(int i, int i_4_) {
	anInt8922++;
	int i_5_ = i_4_ & 0xf0;
	if (i_5_ == 128) {
	    int i_6_ = i_4_ & 0xf;
	    int i_7_ = (0x7f44 & i_4_) >> 1139497832;
	    int i_8_ = (0x7f9fe0 & i_4_) >> 473540144;
	    method2849(i_8_, i_7_, (byte) 97, i_6_);
	} else if ((i_5_ ^ 0xffffffff) == -145) {
	    int i_9_ = 0xf & i_4_;
	    int i_10_ = 0x7f & i_4_ >> -854525880;
	    int i_11_ = 0x7f & i_4_ >> 1911082992;
	    if ((i_11_ ^ 0xffffffff) >= -1)
		method2849(64, i_10_, (byte) 74, i_9_);
	    else
		method2853(0, i_11_, i_10_, i_9_);
	} else if (i_5_ == 160) {
	    int i_12_ = 0xf & i_4_;
	    int i_13_ = i_4_ >> -1548895640 & 0x7f;
	    int i_14_ = (i_4_ & 0x7fba60) >> 878358832;
	    method2863(i_14_, 90, i_12_, i_13_);
	} else if ((i_5_ ^ 0xffffffff) == -177) {
	    int i_15_ = 0xf & i_4_;
	    int i_16_ = (0x7f93 & i_4_) >> -1645698584;
	    int i_17_ = 0x7f & i_4_ >> 247629712;
	    if (i_16_ == 0)
		anIntArray8947[i_15_]
		    = ((i_17_ << 970567726)
		       + Class139.method1166(anIntArray8947[i_15_], -2080769));
	    if (i_16_ == 32)
		anIntArray8947[i_15_]
		    = ((i_17_ << 362394375)
		       + Class139.method1166(anIntArray8947[i_15_], -16257));
	    if ((i_16_ ^ 0xffffffff) == -2)
		anIntArray8899[i_15_]
		    = (Class139.method1166(-16257, anIntArray8899[i_15_])
		       + (i_17_ << -95360601));
	    if ((i_16_ ^ 0xffffffff) == -34)
		anIntArray8899[i_15_]
		    = (Class139.method1166(anIntArray8899[i_15_], -128)
		       - -i_17_);
	    if ((i_16_ ^ 0xffffffff) == -6)
		anIntArray8939[i_15_]
		    = (Class139.method1166(anIntArray8939[i_15_], -16257)
		       - -(i_17_ << -498217529));
	    if ((i_16_ ^ 0xffffffff) == -38)
		anIntArray8939[i_15_]
		    = i_17_ + Class139.method1166(-128, anIntArray8939[i_15_]);
	    if ((i_16_ ^ 0xffffffff) == -8)
		anIntArray8953[i_15_]
		    = ((i_17_ << 1772496327)
		       + Class139.method1166(-16257, anIntArray8953[i_15_]));
	    if (i_16_ == 39)
		anIntArray8953[i_15_]
		    = i_17_ + Class139.method1166(anIntArray8953[i_15_], -128);
	    if ((i_16_ ^ 0xffffffff) == -11)
		anIntArray8894[i_15_]
		    = ((i_17_ << -530898297)
		       + Class139.method1166(anIntArray8894[i_15_], -16257));
	    if ((i_16_ ^ 0xffffffff) == -43)
		anIntArray8894[i_15_]
		    = i_17_ + Class139.method1166(anIntArray8894[i_15_], -128);
	    if ((i_16_ ^ 0xffffffff) == -12)
		anIntArray8896[i_15_]
		    = ((i_17_ << -1257694585)
		       + Class139.method1166(-16257, anIntArray8896[i_15_]));
	    if (i_16_ == 43)
		anIntArray8896[i_15_]
		    = (Class139.method1166(-128, anIntArray8896[i_15_])
		       - -i_17_);
	    if ((i_16_ ^ 0xffffffff) == -65) {
		if (i_17_ < 64)
		    ((Class348_Sub16_Sub3) this).anIntArray8895[i_15_]
			= Class139.method1166((((Class348_Sub16_Sub3) this)
					       .anIntArray8895[i_15_]),
					      -2);
		else
		    ((Class348_Sub16_Sub3) this).anIntArray8895[i_15_]
			= Class273.method2057((((Class348_Sub16_Sub3) this)
					       .anIntArray8895[i_15_]),
					      1);
	    }
	    if (i_16_ == 65) {
		if (i_17_ >= 64)
		    ((Class348_Sub16_Sub3) this).anIntArray8895[i_15_]
			= Class273.method2057((((Class348_Sub16_Sub3) this)
					       .anIntArray8895[i_15_]),
					      2);
		else {
		    method2858(-106, i_15_);
		    ((Class348_Sub16_Sub3) this).anIntArray8895[i_15_]
			= Class139.method1166((((Class348_Sub16_Sub3) this)
					       .anIntArray8895[i_15_]),
					      -3);
		}
	    }
	    if ((i_16_ ^ 0xffffffff) == -100)
		anIntArray8904[i_15_]
		    = ((i_17_ << -1622342009)
		       + Class139.method1166(127, anIntArray8904[i_15_]));
	    if (i_16_ == 98)
		anIntArray8904[i_15_]
		    = (Class139.method1166(16256, anIntArray8904[i_15_])
		       + i_17_);
	    if ((i_16_ ^ 0xffffffff) == -102)
		anIntArray8904[i_15_]
		    = (16384 - -Class139.method1166(anIntArray8904[i_15_], 127)
		       + (i_17_ << -1645682425));
	    if ((i_16_ ^ 0xffffffff) == -101)
		anIntArray8904[i_15_]
		    = i_17_ + (Class139.method1166(16256,
						   anIntArray8904[i_15_])
			       + 16384);
	    if ((i_16_ ^ 0xffffffff) == -121)
		method2872(2005674600, i_15_);
	    if (i_16_ == 121)
		method2865(0, i_15_);
	    if ((i_16_ ^ 0xffffffff) == -124)
		method2855(i_15_, (byte) -70);
	    if (i_16_ == 6) {
		int i_18_ = anIntArray8904[i_15_];
		if (i_18_ == 16384)
		    anIntArray8902[i_15_]
			= ((i_17_ << 92762759)
			   + Class139.method1166(anIntArray8902[i_15_],
						 -16257));
	    }
	    if ((i_16_ ^ 0xffffffff) == -39) {
		int i_19_ = anIntArray8904[i_15_];
		if ((i_19_ ^ 0xffffffff) == -16385)
		    anIntArray8902[i_15_]
			= i_17_ + Class139.method1166(-128,
						      anIntArray8902[i_15_]);
	    }
	    if ((i_16_ ^ 0xffffffff) == -17)
		((Class348_Sub16_Sub3) this).anIntArray8914[i_15_]
		    = (Class139.method1166(-16257,
					   (((Class348_Sub16_Sub3) this)
					    .anIntArray8914[i_15_]))
		       + (i_17_ << -120655961));
	    if ((i_16_ ^ 0xffffffff) == -49)
		((Class348_Sub16_Sub3) this).anIntArray8914[i_15_]
		    = Class139.method1166((((Class348_Sub16_Sub3) this)
					   .anIntArray8914[i_15_]),
					  -128) - -i_17_;
	    if (i_16_ == 81) {
		if ((i_17_ ^ 0xffffffff) <= -65)
		    ((Class348_Sub16_Sub3) this).anIntArray8895[i_15_]
			= Class273.method2057((((Class348_Sub16_Sub3) this)
					       .anIntArray8895[i_15_]),
					      4);
		else {
		    method2850(i_15_, 0);
		    ((Class348_Sub16_Sub3) this).anIntArray8895[i_15_]
			= Class139.method1166((((Class348_Sub16_Sub3) this)
					       .anIntArray8895[i_15_]),
					      -5);
		}
	    }
	    if (i_16_ == 17)
		method2857(i_15_, 125,
			   (i_17_ << 675441127) + (~0x3f80
						   & anIntArray8942[i_15_]));
	    if ((i_16_ ^ 0xffffffff) == -50)
		method2857(i_15_, 125,
			   i_17_ + (~0x7f & anIntArray8942[i_15_]));
	} else if (i_5_ == 192) {
	    int i_20_ = i_4_ & 0xf;
	    int i_21_ = 0x7f & i_4_ >> -1526934616;
	    method2873((byte) -21, anIntArray8947[i_20_] + i_21_, i_20_);
	} else if ((i_5_ ^ 0xffffffff) == -209) {
	    int i_22_ = 0xf & i_4_;
	    int i_23_ = (0x7f48 & i_4_) >> -52598648;
	    method2859(i_22_, i_23_, -32);
	} else {
	    if (i < 54)
		anInt8956 = -51;
	    if (i_5_ == 224) {
		int i_24_ = 0xf & i_4_;
		int i_25_ = ((0x7f & i_4_ >> 2005674600)
			     + ((0x7f0064 & i_4_) >> 1291018921));
		method2875(i_24_, 2, i_25_);
	    } else {
		i_5_ = 0xff & i_4_;
		if (i_5_ == 255)
		    method2851(true, true);
	    }
	}
    }
    
    final synchronized void method2843(int i, int i_26_, int i_27_) {
	if (i_26_ < 0) {
	    for (int i_28_ = 0; i_28_ < 16; i_28_++)
		anIntArray8925[i_28_] = i;
	} else
	    anIntArray8925[i_26_] = i;
	anInt8907++;
	if (i_27_ != -7836)
	    method2843(41, 73, 85);
    }
    
    final int method2844(byte i) {
	int i_29_ = -88 / ((8 - i) / 40);
	anInt8892++;
	return anInt8933;
    }
    
    private final int method2845(int i, Class348_Sub43 class348_sub43) {
	try {
	    if (i != 0)
		anInt8956 = 53;
	    anInt8934++;
	    int i_30_ = (((Class348_Sub43) class348_sub43).anInt7080
			 - -((((Class348_Sub43) class348_sub43).anInt7072
			      * ((Class348_Sub43) class348_sub43).anInt7089)
			     >> -1974421652));
	    i_30_ += (((anIntArray8937
			[((Class348_Sub43) class348_sub43).anInt7067])
		       - 8192)
		      * anIntArray8902[(((Class348_Sub43) class348_sub43)
					.anInt7067)]) >> -1163129076;
	    Class23 class23 = ((Class348_Sub43) class348_sub43).aClass23_7075;
	    if ((((Class23) class23).anInt352 ^ 0xffffffff) < -1
		&& (((Class23) class23).anInt353 > 0
		    || (anIntArray8899
			[((Class348_Sub43) class348_sub43).anInt7067]) > 0)) {
		int i_31_ = ((Class23) class23).anInt353 << 558860802;
		int i_32_ = ((Class23) class23).anInt346 << -492350367;
		if ((((Class348_Sub43) class348_sub43).anInt7083 ^ 0xffffffff)
		    > (i_32_ ^ 0xffffffff))
		    i_31_
			= (i_31_ * ((Class348_Sub43) class348_sub43).anInt7083
			   / i_32_);
		i_31_ += anIntArray8899[(((Class348_Sub43) class348_sub43)
					 .anInt7067)] >> 1264416711;
		double d
		    = Math.sin((double) ((((Class348_Sub43) class348_sub43)
					  .anInt7076)
					 & 0x1ff) * 0.01227184630308513);
		i_30_ += (int) (d * (double) i_31_);
	    }
	    int i_33_
		= (int) (((double) (((Class348_Sub19_Sub1)
				     (((Class348_Sub43) class348_sub43)
				      .aClass348_Sub19_Sub1_7077)).anInt8988
				    * 256)
			  * Math.pow(2.0,
				     3.255208333333333E-4 * (double) i_30_)
			  / (double) Class22.anInt339)
			 + 0.5);
	    if ((i_33_ ^ 0xffffffff) > -2)
		return 1;
	    return i_33_;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ma.JA(" + i + ','
					     + (class348_sub43 != null
						? "{...}" : "null")
					     + ')'));
	}
    }
    
    private final synchronized void method2846(boolean bool, boolean bool_34_,
					       MidiLoader class348_sub2,
					       boolean bool_35_) {
	do {
	    try {
		method2840(bool_34_, (byte) -127);
		anInt8889++;
		aClass204_8944.initialize(((MidiLoader) class348_sub2)
					  .aByteArray6564);
		aLong8959 = 0L;
		aBoolean8961 = bool_35_;
		int i = aClass204_8944.method1483();
		for (int i_36_ = 0; i_36_ < i; i_36_++) {
		    aClass204_8944.method1492(i_36_);
		    aClass204_8944.method1485(i_36_);
		    aClass204_8944.method1486(i_36_);
		}
		anInt8960 = aClass204_8944.method1490();
		anInt8956
		    = ((MidiFile) aClass204_8944).anIntArray2681[anInt8960];
		aLong8957 = aClass204_8944.method1488(anInt8956);
		if (bool == false)
		    break;
		aClass348_Sub16_Sub1_8958 = null;
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("ma.T(" + bool + ','
						 + bool_34_ + ','
						 + (class348_sub2 != null
						    ? "{...}" : "null")
						 + ',' + bool_35_ + ')'));
	    }
	    break;
	} while (false);
    }
    
    final boolean method2847(int i, Class348_Sub43 class348_sub43) {
	try {
	    anInt8948++;
	    int i_37_ = 47 / ((i - -62) / 36);
	    if (((Class348_Sub43) class348_sub43).aClass348_Sub16_Sub5_7081
		== null) {
		if ((((Class348_Sub43) class348_sub43).anInt7087 ^ 0xffffffff)
		    <= -1) {
		    class348_sub43.removeNode();
		    if ((((Class348_Sub43) class348_sub43).anInt7088
			 ^ 0xffffffff) < -1
			&& (class348_sub43
			    == (aClass348_Sub43ArrayArray8915
				[((Class348_Sub43) class348_sub43).anInt7067]
				[(((Class348_Sub43) class348_sub43)
				  .anInt7088)])))
			aClass348_Sub43ArrayArray8915
			    [((Class348_Sub43) class348_sub43).anInt7067]
			    [((Class348_Sub43) class348_sub43).anInt7088]
			    = null;
		}
		return true;
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ma.W(" + i + ','
					     + (class348_sub43 != null
						? "{...}" : "null")
					     + ')'));
	}
    }
    
    private final int method2848(Class348_Sub43 class348_sub43, byte i) {
	try {
	    if (i != -70)
		anIntArray8942 = null;
	    anInt8936++;
	    int i_38_
		= anIntArray8894[((Class348_Sub43) class348_sub43).anInt7067];
	    if (i_38_ >= 8192)
		return 16384 - ((-((Class348_Sub43) class348_sub43).anInt7074
				 + 128) * (16384 - i_38_) - -32
				>> -1420149306);
	    return (((Class348_Sub43) class348_sub43).anInt7074 * i_38_ - -32
		    >> -237342522);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ma.GA("
					     + (class348_sub43 != null
						? "{...}" : "null")
					     + ',' + i + ')'));
	}
    }
    
    private final void method2849(int i, int i_39_, byte i_40_, int i_41_) {
	anInt8941++;
	Class348_Sub43 class348_sub43
	    = aClass348_Sub43ArrayArray8928[i_41_][i_39_];
	if (class348_sub43 != null) {
	    int i_42_ = -123 % ((i_40_ - 24) / 42);
	    aClass348_Sub43ArrayArray8928[i_41_][i_39_] = null;
	    if ((((Class348_Sub16_Sub3) this).anIntArray8895[i_41_] & 0x2
		 ^ 0xffffffff)
		!= -1) {
		for (Class348_Sub43 class348_sub43_43_
			 = ((Class348_Sub43)
			    ((Class348_Sub16_Sub1) aClass348_Sub16_Sub1_8958)
				.aClass262_8848.getFirst(4));
		     class348_sub43_43_ != null;
		     class348_sub43_43_
			 = ((Class348_Sub43)
			    ((Class348_Sub16_Sub1) aClass348_Sub16_Sub1_8958)
				.aClass262_8848.nextForward((byte) 36))) {
		    if ((((Class348_Sub43) class348_sub43_43_).anInt7067
			 == ((Class348_Sub43) class348_sub43).anInt7067)
			&& (((Class348_Sub43) class348_sub43_43_).anInt7087
			    ^ 0xffffffff) > -1
			&& class348_sub43 != class348_sub43_43_) {
			((Class348_Sub43) class348_sub43).anInt7087 = 0;
			break;
		    }
		}
	    } else
		((Class348_Sub43) class348_sub43).anInt7087 = 0;
	}
    }
    
    private final void method2850(int i, int i_44_) {
	if ((0x4 & ((Class348_Sub16_Sub3) this).anIntArray8895[i] ^ 0xffffffff)
	    != -1) {
	    for (Class348_Sub43 class348_sub43
		     = ((Class348_Sub43)
			((Class348_Sub16_Sub1) aClass348_Sub16_Sub1_8958)
			    .aClass262_8848.getFirst(4));
		 class348_sub43 != null;
		 class348_sub43
		     = ((Class348_Sub43)
			((Class348_Sub16_Sub1) aClass348_Sub16_Sub1_8958)
			    .aClass262_8848.nextForward((byte) 65))) {
		if (i == ((Class348_Sub43) class348_sub43).anInt7067)
		    ((Class348_Sub43) class348_sub43).anInt7082 = 0;
	    }
	}
	if (i_44_ == 0)
	    anInt8897++;
    }
    
    private final void method2851(boolean bool, boolean bool_45_) {
	if (bool_45_)
	    method2872(2005674600, -1);
	else
	    method2855(-1, (byte) -79);
	anInt8951++;
	method2865(0, -1);
	if (bool != true)
	    anIntArray8947 = null;
	for (int i = 0; (i ^ 0xffffffff) > -17; i++)
	    anIntArray8916[i] = anIntArray8945[i];
	for (int i = 0; (i ^ 0xffffffff) > -17; i++)
	    anIntArray8947[i] = Class139.method1166(anIntArray8945[i], -128);
    }
    
    final boolean method2852(int[] is, int i, Class348_Sub43 class348_sub43,
			     int i_46_, byte i_47_) {
	try {
	    ((Class348_Sub43) class348_sub43).anInt7086
		= Class22.anInt339 / 100;
	    anInt8952++;
	    if (((Class348_Sub43) class348_sub43).anInt7087 >= 0
		&& ((((Class348_Sub43) class348_sub43)
		     .aClass348_Sub16_Sub5_7081) == null
		    || ((Class348_Sub43) class348_sub43)
			   .aClass348_Sub16_Sub5_7081.method2890())) {
		class348_sub43.method3299((byte) 36);
		class348_sub43.removeNode();
		if (((Class348_Sub43) class348_sub43).anInt7088 > 0
		    && (class348_sub43
			== (aClass348_Sub43ArrayArray8915
			    [((Class348_Sub43) class348_sub43).anInt7067]
			    [((Class348_Sub43) class348_sub43).anInt7088])))
		    aClass348_Sub43ArrayArray8915
			[((Class348_Sub43) class348_sub43).anInt7067]
			[((Class348_Sub43) class348_sub43).anInt7088]
			= null;
		return true;
	    }
	    int i_48_ = ((Class348_Sub43) class348_sub43).anInt7089;
	    if (i_47_ != -4)
		return false;
	    if ((i_48_ ^ 0xffffffff) < -1) {
		i_48_ -= (int) (0.5
				+ (16.0
				   * Math.pow(2.0,
					      (4.921259842519685E-4
					       * (double) (anIntArray8939
							   [(((Class348_Sub43)
							      class348_sub43)
							     .anInt7067)])))));
		if ((i_48_ ^ 0xffffffff) > -1)
		    i_48_ = 0;
		((Class348_Sub43) class348_sub43).anInt7089 = i_48_;
	    }
	    ((Class348_Sub43) class348_sub43).aClass348_Sub16_Sub5_7081
		.method2901(method2845(0, class348_sub43));
	    Class23 class23 = ((Class348_Sub43) class348_sub43).aClass23_7075;
	    boolean bool = false;
	    ((Class348_Sub43) class348_sub43).anInt7076
		+= ((Class23) class23).anInt352;
	    ((Class348_Sub43) class348_sub43).anInt7083++;
	    double d
		= (double) ((((Class348_Sub43) class348_sub43).anInt7071 - 60
			     << -1467192088)
			    - -((((Class348_Sub43) class348_sub43).anInt7072
				 * ((Class348_Sub43) class348_sub43).anInt7089)
				>> -1596097716)) * 5.086263020833333E-6;
	    if (((Class23) class23).anInt347 > 0) {
		if (((Class23) class23).anInt350 <= 0)
		    ((Class348_Sub43) class348_sub43).anInt7090 += 128;
		else
		    ((Class348_Sub43) class348_sub43).anInt7090
			+= (int) ((128.0
				   * Math.pow(2.0,
					      (double) (((Class23) class23)
							.anInt350) * d))
				  + 0.5);
		if ((((Class23) class23).anInt347
		     * ((Class348_Sub43) class348_sub43).anInt7090)
		    >= 819200)
		    bool = true;
	    }
	    if (((Class23) class23).aByteArray348 != null) {
		if (((Class23) class23).anInt345 > 0)
		    ((Class348_Sub43) class348_sub43).anInt7070
			+= (int) (0.5
				  + (128.0
				     * Math.pow(2.0,
						d * (double) (((Class23)
							       class23)
							      .anInt345))));
		else
		    ((Class348_Sub43) class348_sub43).anInt7070 += 128;
		for (/**/;
		     (((-2 + ((Class23) class23).aByteArray348.length
			^ 0xffffffff)
		       < (((Class348_Sub43) class348_sub43).anInt7069
			  ^ 0xffffffff))
		      && (((Class348_Sub43) class348_sub43).anInt7070
			  > (0xff00 & (((Class23) class23).aByteArray348
				       [2 + (((Class348_Sub43) class348_sub43)
					     .anInt7069)]) << 1736832296)));
		     ((Class348_Sub43) class348_sub43).anInt7069 += 2) {
		    /* empty */
		}
		if ((((Class348_Sub43) class348_sub43).anInt7069
		     == -2 + ((Class23) class23).aByteArray348.length)
		    && ((((Class23) class23).aByteArray348
			 [1 + ((Class348_Sub43) class348_sub43).anInt7069])
			== 0))
		    bool = true;
	    }
	    if (((Class348_Sub43) class348_sub43).anInt7087 >= 0
		&& ((Class23) class23).aByteArray344 != null
		&& (0x1 & (((Class348_Sub16_Sub3) this).anIntArray8895
			   [((Class348_Sub43) class348_sub43).anInt7067])) == 0
		&& (((Class348_Sub43) class348_sub43).anInt7088 < 0
		    || ((aClass348_Sub43ArrayArray8915
			 [((Class348_Sub43) class348_sub43).anInt7067]
			 [((Class348_Sub43) class348_sub43).anInt7088])
			!= class348_sub43))) {
		if ((((Class23) class23).anInt349 ^ 0xffffffff) < -1)
		    ((Class348_Sub43) class348_sub43).anInt7087
			+= (int) ((Math.pow(2.0, (double) (((Class23) class23)
							   .anInt349) * d)
				   * 128.0)
				  + 0.5);
		else
		    ((Class348_Sub43) class348_sub43).anInt7087 += 128;
		for (/**/;
		     (((-2 + ((Class23) class23).aByteArray344.length
			^ 0xffffffff)
		       < (((Class348_Sub43) class348_sub43).anInt7084
			  ^ 0xffffffff))
		      && ((((Class348_Sub43) class348_sub43).anInt7087
			   ^ 0xffffffff)
			  < ((((Class23) class23).aByteArray344
			      [(((Class348_Sub43) class348_sub43).anInt7084
				- -2)]) << 2103373160 & 0xff00
			     ^ 0xffffffff)));
		     ((Class348_Sub43) class348_sub43).anInt7084 += 2) {
		    /* empty */
		}
		if ((-2 + ((Class23) class23).aByteArray344.length
		     ^ 0xffffffff)
		    == (((Class348_Sub43) class348_sub43).anInt7084
			^ 0xffffffff))
		    bool = true;
	    }
	    if (bool) {
		((Class348_Sub43) class348_sub43).aClass348_Sub16_Sub5_7081
		    .method2902(((Class348_Sub43) class348_sub43).anInt7086);
		if (is == null)
		    ((Class348_Sub43) class348_sub43)
			.aClass348_Sub16_Sub5_7081.method2819(i);
		else
		    ((Class348_Sub43) class348_sub43)
			.aClass348_Sub16_Sub5_7081.method2817(is, i_46_, i);
		if (((Class348_Sub43) class348_sub43)
			.aClass348_Sub16_Sub5_7081.method2895())
		    ((Class348_Sub16_Sub1) aClass348_Sub16_Sub1_8958)
			.aClass348_Sub16_Sub4_8855.method2883
			(((Class348_Sub43) class348_sub43)
			 .aClass348_Sub16_Sub5_7081);
		class348_sub43.method3299((byte) -100);
		if ((((Class348_Sub43) class348_sub43).anInt7087 ^ 0xffffffff)
		    <= -1) {
		    class348_sub43.removeNode();
		    if ((((Class348_Sub43) class348_sub43).anInt7088
			 ^ 0xffffffff) < -1
			&& (class348_sub43
			    == (aClass348_Sub43ArrayArray8915
				[((Class348_Sub43) class348_sub43).anInt7067]
				[(((Class348_Sub43) class348_sub43)
				  .anInt7088)])))
			aClass348_Sub43ArrayArray8915
			    [((Class348_Sub43) class348_sub43).anInt7067]
			    [((Class348_Sub43) class348_sub43).anInt7088]
			    = null;
		}
		return true;
	    }
	    ((Class348_Sub43) class348_sub43).aClass348_Sub16_Sub5_7081
		.method2888
		(((Class348_Sub43) class348_sub43).anInt7086,
		 method2868(class348_sub43, -76),
		 method2848(class348_sub43, (byte) -70));
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ma.U("
					     + (is != null ? "{...}" : "null")
					     + ',' + i + ','
					     + (class348_sub43 != null
						? "{...}" : "null")
					     + ',' + i_46_ + ',' + i_47_
					     + ')'));
	}
    }
    
    private final void method2853(int i, int i_49_, int i_50_, int i_51_) {
	method2849(64, i_50_, (byte) 86, i_51_);
	anInt8931++;
	if ((0x2 & ((Class348_Sub16_Sub3) this).anIntArray8895[i_51_]
	     ^ 0xffffffff)
	    != -1) {
	    for (Class348_Sub43 class348_sub43
		     = ((Class348_Sub43)
			((Class348_Sub16_Sub1) aClass348_Sub16_Sub1_8958)
			    .aClass262_8848.getLast(i ^ ~0x51));
		 class348_sub43 != null;
		 class348_sub43
		     = ((Class348_Sub43)
			((Class348_Sub16_Sub1) aClass348_Sub16_Sub1_8958)
			    .aClass262_8848.nextBack(-50))) {
		if (((i_51_ ^ 0xffffffff)
		     == (((Class348_Sub43) class348_sub43).anInt7067
			 ^ 0xffffffff))
		    && (((Class348_Sub43) class348_sub43).anInt7087
			^ 0xffffffff) > -1) {
		    aClass348_Sub43ArrayArray8928[i_51_]
			[((Class348_Sub43) class348_sub43).anInt7071]
			= null;
		    aClass348_Sub43ArrayArray8928[i_51_][i_50_]
			= class348_sub43;
		    int i_52_
			= (((((Class348_Sub43) class348_sub43).anInt7089
			     * ((Class348_Sub43) class348_sub43).anInt7072)
			    >> 253092012)
			   + ((Class348_Sub43) class348_sub43).anInt7080);
		    ((Class348_Sub43) class348_sub43).anInt7080
			+= (-((Class348_Sub43) class348_sub43).anInt7071
			    + i_50_) << 2112069640;
		    ((Class348_Sub43) class348_sub43).anInt7072
			= -((Class348_Sub43) class348_sub43).anInt7080 + i_52_;
		    ((Class348_Sub43) class348_sub43).anInt7071 = i_50_;
		    ((Class348_Sub43) class348_sub43).anInt7089 = 4096;
		    return;
		}
	    }
	}
	Class348_Sub17 class348_sub17
	    = ((Class348_Sub17)
	       aClass356_8891.get((long) anIntArray8916[i_51_]));
	if (class348_sub17 != null) {
	    Class348_Sub19_Sub1 class348_sub19_sub1
		= (((Class348_Sub17) class348_sub17)
		   .aClass348_Sub19_Sub1Array6800[i_50_]);
	    if (class348_sub19_sub1 != null) {
		Class348_Sub43 class348_sub43 = new Class348_Sub43();
		((Class348_Sub43) class348_sub43).anInt7067 = i_51_;
		((Class348_Sub43) class348_sub43).aClass348_Sub17_7085
		    = class348_sub17;
		((Class348_Sub43) class348_sub43).aClass348_Sub19_Sub1_7077
		    = class348_sub19_sub1;
		((Class348_Sub43) class348_sub43).aClass23_7075
		    = (((Class348_Sub17) class348_sub17).aClass23Array6796
		       [i_50_]);
		((Class348_Sub43) class348_sub43).anInt7088
		    = ((Class348_Sub17) class348_sub17).aByteArray6798[i_50_];
		((Class348_Sub43) class348_sub43).anInt7071 = i_50_;
		((Class348_Sub43) class348_sub43).anInt7066
		    = 1024 + ((((Class348_Sub17) class348_sub17).aByteArray6799
			       [i_50_])
			      * (((Class348_Sub17) class348_sub17).anInt6797
				 * (i_49_ * i_49_))) >> -1803095381;
		((Class348_Sub43) class348_sub43).anInt7074
		    = (((Class348_Sub17) class348_sub17).aByteArray6792[i_50_]
		       & 0xff);
		((Class348_Sub43) class348_sub43).anInt7080
		    = ((i_50_ << -1040790136)
		       + -((((Class348_Sub17) class348_sub17).aShortArray6795
			    [i_50_])
			   & 0x7fff));
		((Class348_Sub43) class348_sub43).anInt7087 = -1;
		((Class348_Sub43) class348_sub43).anInt7070 = 0;
		((Class348_Sub43) class348_sub43).anInt7069 = i;
		((Class348_Sub43) class348_sub43).anInt7090 = 0;
		((Class348_Sub43) class348_sub43).anInt7084 = 0;
		if ((((Class348_Sub16_Sub3) this).anIntArray8914[i_51_]
		     ^ 0xffffffff)
		    == -1)
		    ((Class348_Sub43) class348_sub43).aClass348_Sub16_Sub5_7081
			= (Class348_Sub16_Sub5.method2911
			   (class348_sub19_sub1, method2845(0, class348_sub43),
			    method2868(class348_sub43, i + -82),
			    method2848(class348_sub43, (byte) -70)));
		else {
		    ((Class348_Sub43) class348_sub43).aClass348_Sub16_Sub5_7081
			= (Class348_Sub16_Sub5.method2911
			   (class348_sub19_sub1, method2845(0, class348_sub43),
			    0, method2848(class348_sub43, (byte) -70)));
		    method2874(i ^ 0x7a,
			       (((Class348_Sub17) class348_sub17)
				.aShortArray6795[i_50_]) < 0,
			       class348_sub43);
		}
		if (((Class348_Sub17) class348_sub17).aShortArray6795[i_50_]
		    < 0)
		    ((Class348_Sub43) class348_sub43)
			.aClass348_Sub16_Sub5_7081.method2917(-1);
		if ((((Class348_Sub43) class348_sub43).anInt7088 ^ 0xffffffff)
		    <= -1) {
		    Class348_Sub43 class348_sub43_53_
			= (aClass348_Sub43ArrayArray8915[i_51_]
			   [((Class348_Sub43) class348_sub43).anInt7088]);
		    if (class348_sub43_53_ != null
			&& (((Class348_Sub43) class348_sub43_53_).anInt7087
			    ^ 0xffffffff) > -1) {
			aClass348_Sub43ArrayArray8928[i_51_]
			    [((Class348_Sub43) class348_sub43_53_).anInt7071]
			    = null;
			((Class348_Sub43) class348_sub43_53_).anInt7087 = 0;
		    }
		    aClass348_Sub43ArrayArray8915[i_51_]
			[((Class348_Sub43) class348_sub43).anInt7088]
			= class348_sub43;
		}
		((Class348_Sub16_Sub1) aClass348_Sub16_Sub1_8958)
		    .aClass262_8848.addToFront(class348_sub43, i ^ ~0x4ed3);
		aClass348_Sub43ArrayArray8928[i_51_][i_50_] = class348_sub43;
	    }
	}
    }
    
    private final void method2854(int i, int i_54_, int i_55_) {
	anInt8943++;
	anIntArray8945[i_54_] = i;
	if (i_55_ < 39)
	    indexLoader22 = null;
	anIntArray8947[i_54_] = Class139.method1166(i, -128);
	method2873((byte) -21, i, i_54_);
    }
    
    private final void method2855(int i, byte i_56_) {
	anInt8927++;
	if (i_56_ < -42) {
	    for (Class348_Sub43 class348_sub43
		     = ((Class348_Sub43)
			((Class348_Sub16_Sub1) aClass348_Sub16_Sub1_8958)
			    .aClass262_8848.getFirst(4));
		 class348_sub43 != null;
		 class348_sub43
		     = ((Class348_Sub43)
			((Class348_Sub16_Sub1) aClass348_Sub16_Sub1_8958)
			    .aClass262_8848.nextForward((byte) 60))) {
		if ((i < 0 || (((Class348_Sub43) class348_sub43).anInt7067
			       ^ 0xffffffff) == (i ^ 0xffffffff))
		    && (((Class348_Sub43) class348_sub43).anInt7087
			^ 0xffffffff) > -1) {
		    aClass348_Sub43ArrayArray8928
			[((Class348_Sub43) class348_sub43).anInt7067]
			[((Class348_Sub43) class348_sub43).anInt7071]
			= null;
		    ((Class348_Sub43) class348_sub43).anInt7087 = 0;
		}
	    }
	}
    }
    
    private final void method2856(byte i) {
	anInt8955++;
	int i_57_ = anInt8960;
	int i_58_ = anInt8956;
	long l = aLong8957;
	if (aClass348_Sub2_8963 != null && anInt8962 == i_58_) {
	    method2846(false, aBoolean8964, aClass348_Sub2_8963, aBoolean8961);
	    method2856((byte) 124);
	} else {
	    while ((anInt8956 ^ 0xffffffff) == (i_58_ ^ 0xffffffff)) {
		while (((MidiFile) aClass204_8944).anIntArray2681[i_57_]
		       == i_58_) {
		    aClass204_8944.method1492(i_57_);
		    int i_59_ = aClass204_8944.method1494(i_57_);
		    if (i_59_ == 1) {
			aClass204_8944.method1495();
			aClass204_8944.method1486(i_57_);
			if (aClass204_8944.method1480()) {
			    if (aClass348_Sub2_8963 != null) {
				method2869(aClass348_Sub2_8963, aBoolean8961,
					   false);
				method2856((byte) 124);
				return;
			    }
			    if (aBoolean8961 && (i_58_ ^ 0xffffffff) != -1)
				aClass204_8944.method1484(l);
			    else {
				method2851(true, true);
				aClass204_8944.method1487();
				return;
			    }
			}
			break;
		    }
		    if ((0x80 & i_59_ ^ 0xffffffff) != -1)
			method2842(i ^ 0x40, i_59_);
		    aClass204_8944.method1485(i_57_);
		    aClass204_8944.method1486(i_57_);
		}
		i_57_ = aClass204_8944.method1490();
		i_58_ = ((MidiFile) aClass204_8944).anIntArray2681[i_57_];
		l = aClass204_8944.method1488(i_58_);
	    }
	    if (i != 124)
		method2879(-127, -46, -96);
	    aLong8957 = l;
	    anInt8956 = i_58_;
	    anInt8960 = i_57_;
	    if (aClass348_Sub2_8963 != null && i_58_ > anInt8962) {
		anInt8960 = -1;
		anInt8956 = anInt8962;
		aLong8957 = aClass204_8944.method1488(anInt8956);
	    }
	}
    }
    
    private final void method2857(int i, int i_60_, int i_61_) {
	anInt8917++;
	anIntArray8942[i] = i_61_;
	((Class348_Sub16_Sub3) this).anIntArray8906[i]
	    = (int) (0.5
		     + 2097152.0 * Math.pow(2.0,
					    5.4931640625E-4 * (double) i_61_));
	if (i_60_ < 124)
	    ((Class348_Sub16_Sub3) this).anIntArray8906 = null;
    }
    
    private final void method2858(int i, int i_62_) {
	anInt8893++;
	if (i >= -101)
	    method2856((byte) -89);
	if ((((Class348_Sub16_Sub3) this).anIntArray8895[i_62_] & 0x2
	     ^ 0xffffffff)
	    != -1) {
	    for (Class348_Sub43 class348_sub43
		     = ((Class348_Sub43)
			((Class348_Sub16_Sub1) aClass348_Sub16_Sub1_8958)
			    .aClass262_8848.getFirst(4));
		 class348_sub43 != null;
		 class348_sub43
		     = ((Class348_Sub43)
			((Class348_Sub16_Sub1) aClass348_Sub16_Sub1_8958)
			    .aClass262_8848.nextForward((byte) 41))) {
		if (((i_62_ ^ 0xffffffff)
		     == (((Class348_Sub43) class348_sub43).anInt7067
			 ^ 0xffffffff))
		    && (aClass348_Sub43ArrayArray8928[i_62_]
			[((Class348_Sub43) class348_sub43).anInt7071]) == null
		    && ((Class348_Sub43) class348_sub43).anInt7087 < 0)
		    ((Class348_Sub43) class348_sub43).anInt7087 = 0;
	    }
	}
    }
    
    final synchronized void method2819(int i) {
	anInt8908++;
	if (aClass204_8944.method1491()) {
	    int i_63_ = (((MidiFile) aClass204_8944).anInt2683 * anInt8921
			 / Class22.anInt339);
	    do {
		long l = aLong8959 + (long) i_63_ * (long) i;
		if (-l + aLong8957 >= 0L) {
		    aLong8959 = l;
		    break;
		}
		int i_64_
		    = (int) ((-1L + -aLong8959 + aLong8957 + (long) i_63_)
			     / (long) i_63_);
		aLong8959 += (long) i_64_ * (long) i_63_;
		aClass348_Sub16_Sub1_8958.method2819(i_64_);
		i -= i_64_;
		method2856((byte) 124);
	    } while (aClass204_8944.method1491());
	}
	aClass348_Sub16_Sub1_8958.method2819(i);
    }
    
    private final void method2859(int i, int i_65_, int i_66_) {
	anInt8905++;
	if (i_66_ != -32)
	    anIntArray8916 = null;
    }
    
    final synchronized boolean method2860(int i) {
	if (i <= 94)
	    method2818();
	anInt8949++;
	return aClass204_8944.method1491();
    }
    
    final synchronized void method2817(int[] is, int i, int i_67_) {
	try {
	    anInt8898++;
	    if (aClass204_8944.method1491()) {
		int i_68_ = (anInt8921 * ((MidiFile) aClass204_8944).anInt2683
			     / Class22.anInt339);
		do {
		    long l = aLong8959 + (long) i_67_ * (long) i_68_;
		    if (aLong8957 + -l >= 0L) {
			aLong8959 = l;
			break;
		    }
		    int i_69_
			= (int) ((-1L + (long) i_68_ + aLong8957 + -aLong8959)
				 / (long) i_68_);
		    aLong8959 += (long) i_68_ * (long) i_69_;
		    aClass348_Sub16_Sub1_8958.method2817(is, i, i_69_);
		    i += i_69_;
		    i_67_ -= i_69_;
		    method2856((byte) 124);
		} while (aClass204_8944.method1491());
	    }
	    aClass348_Sub16_Sub1_8958.method2817(is, i, i_67_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ma.C("
					     + (is != null ? "{...}" : "null")
					     + ',' + i + ',' + i_67_ + ')'));
	}
    }
    
    final synchronized void method2861(int i, int i_70_) {
	if (i != 0)
	    method2878(56, 73, 54);
	anInt8933 = i_70_;
	anInt8938++;
    }
    
    static final SignlinkRequest method2862(Signlink class297, String string, int i,
				     int i_71_) {
	try {
	    int i_72_ = 16 % ((-37 - i) / 51);
	    anInt8911++;
	    if (i_71_ == 0)
		return class297.method2245(string, 16);
	    if ((i_71_ ^ 0xffffffff) == -2) {
		try {
		    Class224.method1616("openjs",
					(new Object[]
					 { new URL(Class93.loaderApplet
						       .getCodeBase(),
						   string).toString() }),
					Class93.loaderApplet, (byte) 38);
		    SignlinkRequest class144 = new SignlinkRequest();
		    class144.state = 1;
		    return class144;
		} catch (Throwable throwable) {
		    SignlinkRequest class144 = new SignlinkRequest();
		    class144.state = 2;
		    return class144;
		}
	    }
	    if ((i_71_ ^ 0xffffffff) == -3) {
		try {
		    Class93.loaderApplet.getAppletContext().showDocument
			(new URL(Class93.loaderApplet.getCodeBase(), string),
			 "_blank");
		    SignlinkRequest class144 = new SignlinkRequest();
		    class144.state = 1;
		    return class144;
		} catch (Exception exception) {
		    SignlinkRequest class144 = new SignlinkRequest();
		    class144.state = 2;
		    return class144;
		}
	    }
	    if (i_71_ == 3) {
		try {
		    Class224.method1617((byte) 125, Class93.loaderApplet,
					"loggedout");
		} catch (Throwable throwable) {
		    /* empty */
		}
		try {
		    Class93.loaderApplet.getAppletContext().showDocument
			(new URL(Class93.loaderApplet.getCodeBase(), string),
			 "_top");
		    SignlinkRequest class144 = new SignlinkRequest();
		    class144.state = 1;
		    return class144;
		} catch (Exception exception) {
		    SignlinkRequest class144 = new SignlinkRequest();
		    class144.state = 2;
		    return class144;
		}
	    }
	    throw new IllegalArgumentException();
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ma.EA("
					     + (class297 != null ? "{...}"
						: "null")
					     + ','
					     + (string != null ? "{...}"
						: "null")
					     + ',' + i + ',' + i_71_ + ')'));
	}
    }
    
    private final void method2863(int i, int i_73_, int i_74_, int i_75_) {
	if (i_73_ <= 38)
	    anIntArray8942 = null;
	anInt8940++;
    }
    
    final synchronized void method2864(byte i) {
	anInt8924++;
	if (i <= 46)
	    aClass204_8944 = null;
	for (Class348_Sub17 class348_sub17
		 = (Class348_Sub17) aClass356_8891.method3484(0);
	     class348_sub17 != null;
	     class348_sub17 = (Class348_Sub17) aClass356_8891.method3482(0))
	    class348_sub17.method2933((byte) -103);
    }
    
    private final void method2865(int i, int i_76_) {
	anInt8900++;
	if (i_76_ < 0) {
	    for (i_76_ = 0; i_76_ < 16; i_76_++)
		method2865(i, i_76_);
	} else {
	    anIntArray8953[i_76_] = 12800;
	    anIntArray8894[i_76_] = 8192;
	    anIntArray8896[i_76_] = 16383;
	    anIntArray8937[i_76_] = 8192;
	    anIntArray8899[i_76_] = i;
	    anIntArray8939[i_76_] = 8192;
	    method2858(-124, i_76_);
	    method2850(i_76_, 0);
	    ((Class348_Sub16_Sub3) this).anIntArray8895[i_76_] = 0;
	    anIntArray8904[i_76_] = 32767;
	    anIntArray8902[i_76_] = 256;
	    ((Class348_Sub16_Sub3) this).anIntArray8914[i_76_] = 0;
	    method2857(i_76_, 127, 8192);
	}
    }
    
    final synchronized boolean method2866(MidiLoader class348_sub2, int i,
					  Class26 class26, IndexLoader class45,
					  int i_77_) {
	try {
	    class348_sub2.method2733();
	    anInt8954++;
	    boolean bool = true;
	    int[] is = null;
	    if (i > 0)
		is = new int[] { i };
	    for (Class348_Sub8 class348_sub8
		     = (Class348_Sub8) ((MidiLoader) class348_sub2)
					   .aClass356_6565.method3484(0);
		 class348_sub8 != null;
		 class348_sub8
		     = (Class348_Sub8) ((MidiLoader) class348_sub2)
					   .aClass356_6565.method3482(0)) {
		int i_78_ = (int) ((Node) class348_sub8).nodeKey;
		Class348_Sub17 class348_sub17
		    = ((Class348_Sub17)
		       aClass356_8891.get((long) i_78_));
		if (class348_sub17 == null) {
		    class348_sub17 = Class188.method1417(0, class45, i_78_);
		    if (class348_sub17 == null) {
			bool = false;
			continue;
		    }
		    aClass356_8891.putNode((long) i_78_,
					      class348_sub17);
		}
		if (!class348_sub17.method2932(class26, is,
					       (((Class348_Sub8) class348_sub8)
						.aByteArray6657),
					       0))
		    bool = false;
	    }
	    if (i_77_ >= -13)
		return true;
	    if (bool)
		class348_sub2.method2735();
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("ma.CA(" + (class348_sub2 != null ? "{...}" : "null")
			+ ',' + i + ',' + (class26 != null ? "{...}" : "null")
			+ ',' + (class45 != null ? "{...}" : "null") + ','
			+ i_77_ + ')'));
	}
    }
    
    final synchronized void method2867(int i) {
	anInt8903++;
	if (i == 4) {
	    for (Class348_Sub17 class348_sub17
		     = (Class348_Sub17) aClass356_8891.method3484(0);
		 class348_sub17 != null;
		 class348_sub17
		     = (Class348_Sub17) aClass356_8891.method3482(i ^ 0x4))
		class348_sub17.removeNode();
	}
    }
    
    private final int method2868(Class348_Sub43 class348_sub43, int i) {
	try {
	    if (i >= -16)
		method2879(-95, 66, 110);
	    anInt8920++;
	    if (anIntArray8925[((Class348_Sub43) class348_sub43).anInt7067]
		== 0)
		return 0;
	    Class23 class23 = ((Class348_Sub43) class348_sub43).aClass23_7075;
	    int i_79_
		= ((anIntArray8953[((Class348_Sub43) class348_sub43).anInt7067]
		    * (anIntArray8896
		       [((Class348_Sub43) class348_sub43).anInt7067])) + 4096
		   >> 1635750221);
	    i_79_ = 16384 + i_79_ * i_79_ >> 1819043023;
	    i_79_
		= (16384 + i_79_ * ((Class348_Sub43) class348_sub43).anInt7066
		   >> 1497613295);
	    i_79_ = i_79_ * anInt8933 + 128 >> 1766889960;
	    i_79_ = 128 + anIntArray8925[(((Class348_Sub43) class348_sub43)
					  .anInt7067)] * i_79_ >> -697099096;
	    if ((((Class23) class23).anInt347 ^ 0xffffffff) < -1)
		i_79_
		    = (int) (0.5
			     + ((double) i_79_
				* Math.pow(0.5,
					   ((double) ((Class348_Sub43)
						      class348_sub43).anInt7090
					    * 1.953125E-5
					    * (double) (((Class23) class23)
							.anInt347)))));
	    if (((Class23) class23).aByteArray348 != null) {
		int i_80_ = ((Class348_Sub43) class348_sub43).anInt7070;
		int i_81_
		    = (((Class23) class23).aByteArray348
		       [((Class348_Sub43) class348_sub43).anInt7069 + 1]);
		if (((Class348_Sub43) class348_sub43).anInt7069
		    < ((Class23) class23).aByteArray348.length + -2) {
		    int i_82_ = 0xff00 & (((Class23) class23).aByteArray348
					  [(((Class348_Sub43) class348_sub43)
					    .anInt7069)]) << -780228824;
		    int i_83_ = ((0xff & (((Class23) class23).aByteArray348
					  [(((Class348_Sub43) class348_sub43)
					    .anInt7069) + 2]))
				 << -628082392);
		    i_81_
			+= (-i_81_
			    + (((Class23) class23).aByteArray348
			       [(((Class348_Sub43) class348_sub43).anInt7069
				 - -3)])) * (i_80_ + -i_82_) / (i_83_ - i_82_);
		}
		i_79_ = i_79_ * i_81_ + 32 >> 1469343014;
	    }
	    if ((((Class348_Sub43) class348_sub43).anInt7087 ^ 0xffffffff) < -1
		&& ((Class23) class23).aByteArray344 != null) {
		int i_84_ = ((Class348_Sub43) class348_sub43).anInt7087;
		int i_85_
		    = (((Class23) class23).aByteArray344
		       [1 + ((Class348_Sub43) class348_sub43).anInt7084]);
		if (((Class23) class23).aByteArray344.length + -2
		    > ((Class348_Sub43) class348_sub43).anInt7084) {
		    int i_86_ = 0xff00 & (((Class23) class23).aByteArray344
					  [(((Class348_Sub43) class348_sub43)
					    .anInt7084)]) << -1686208504;
		    int i_87_
			= ((((Class23) class23).aByteArray344
			    [((Class348_Sub43) class348_sub43).anInt7084 - -2])
			   << 1025132200) & 0xff00;
		    i_85_
			+= ((((Class23) class23).aByteArray344
			     [3 + ((Class348_Sub43) class348_sub43).anInt7084])
			    + -i_85_) * (i_84_ + -i_86_) / (-i_86_ + i_87_);
		}
		i_79_ = i_85_ * i_79_ + 32 >> 806616262;
	    }
	    return i_79_;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ma.DA("
					     + (class348_sub43 != null
						? "{...}" : "null")
					     + ',' + i + ')'));
	}
    }
    
    final synchronized void method2869(MidiLoader class348_sub2,
				       boolean bool, boolean bool_88_) {
	try {
	    anInt8932++;
	    method2846(bool_88_, true, class348_sub2, bool);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ma.L("
					     + (class348_sub2 != null ? "{...}"
						: "null")
					     + ',' + bool + ',' + bool_88_
					     + ')'));
	}
    }
    
    final synchronized void method2870(MidiLoader class348_sub2, long l,
				       boolean bool, boolean bool_89_,
				       byte i) {
	try {
	    method2846(false, bool_89_, class348_sub2, bool);
	    if (i > 17) {
		anInt8930++;
		method2876((long) ((MidiFile) aClass204_8944).anInt2683 * l,
			   -125);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ma.O("
					     + (class348_sub2 != null ? "{...}"
						: "null")
					     + ',' + l + ',' + bool + ','
					     + bool_89_ + ',' + i + ')'));
	}
    }
    
    final synchronized Class348_Sub16 method2816() {
	anInt8912++;
	return aClass348_Sub16_Sub1_8958;
    }
    
    public static void method2871(int i) {
	anIntArrayArray8910 = null;
	if (i != -65)
	    method2862(null, null, 96, -71);
	indexLoader22 = null;
    }
    
    private final void method2872(int i, int i_90_) {
	anInt8918++;
	for (Class348_Sub43 class348_sub43
		 = ((Class348_Sub43)
		    ((Class348_Sub16_Sub1) aClass348_Sub16_Sub1_8958)
			.aClass262_8848.getFirst(i + -2005674596));
	     class348_sub43 != null;
	     class348_sub43
		 = ((Class348_Sub43)
		    ((Class348_Sub16_Sub1) aClass348_Sub16_Sub1_8958)
			.aClass262_8848.nextForward((byte) 68))) {
	    if (i_90_ < 0 || ((i_90_ ^ 0xffffffff)
			      == (((Class348_Sub43) class348_sub43).anInt7067
				  ^ 0xffffffff))) {
		if (((Class348_Sub43) class348_sub43).aClass348_Sub16_Sub5_7081
		    != null) {
		    ((Class348_Sub43) class348_sub43)
			.aClass348_Sub16_Sub5_7081
			.method2902(Class22.anInt339 / 100);
		    if (((Class348_Sub43) class348_sub43)
			    .aClass348_Sub16_Sub5_7081.method2895())
			((Class348_Sub16_Sub1) aClass348_Sub16_Sub1_8958)
			    .aClass348_Sub16_Sub4_8855.method2883
			    (((Class348_Sub43) class348_sub43)
			     .aClass348_Sub16_Sub5_7081);
		    class348_sub43.method3299((byte) 72);
		}
		if ((((Class348_Sub43) class348_sub43).anInt7087 ^ 0xffffffff)
		    > -1)
		    aClass348_Sub43ArrayArray8928
			[((Class348_Sub43) class348_sub43).anInt7067]
			[((Class348_Sub43) class348_sub43).anInt7071]
			= null;
		class348_sub43.removeNode();
	    }
	}
	if (i != 2005674600)
	    anIntArray8902 = null;
    }
    
    private final void method2873(byte i, int i_91_, int i_92_) {
	if (i == -21) {
	    anInt8929++;
	    if (i_91_ != anIntArray8916[i_92_]) {
		anIntArray8916[i_92_] = i_91_;
		for (int i_93_ = 0; i_93_ < 128; i_93_++)
		    aClass348_Sub43ArrayArray8915[i_92_][i_93_] = null;
	    }
	}
    }
    
    final void method2874(int i, boolean bool, Class348_Sub43 class348_sub43) {
	try {
	    anInt8909++;
	    int i_94_
		= (((Class348_Sub19_Sub1) (((Class348_Sub43) class348_sub43)
					   .aClass348_Sub19_Sub1_7077))
		   .aByteArray8984).length;
	    int i_95_;
	    if (bool
		&& (((Class348_Sub19_Sub1) (((Class348_Sub43) class348_sub43)
					    .aClass348_Sub19_Sub1_7077))
		    .aBoolean8987)) {
		int i_96_ = (i_94_ + i_94_
			     + -((Class348_Sub19_Sub1)
				 (((Class348_Sub43) class348_sub43)
				  .aClass348_Sub19_Sub1_7077)).anInt8986);
		i_95_ = (int) ((long) (((Class348_Sub16_Sub3) this)
				       .anIntArray8914
				       [(((Class348_Sub43) class348_sub43)
					 .anInt7067)]) * (long) i_96_
			       >> 1439097542);
		i_94_ <<= 8;
		if (i_94_ <= i_95_) {
		    i_95_ = i_94_ + i_94_ - 1 - i_95_;
		    ((Class348_Sub43) class348_sub43)
			.aClass348_Sub16_Sub5_7081.method2891(true);
		}
	    } else
		i_95_ = (int) (((long) i_94_
				* (long) (((Class348_Sub16_Sub3) this)
					  .anIntArray8914
					  [(((Class348_Sub43) class348_sub43)
					    .anInt7067)]))
			       >> -1975078330);
	    if (i > 93)
		((Class348_Sub43) class348_sub43).aClass348_Sub16_Sub5_7081
		    .method2924(i_95_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ma.WA(" + i + ',' + bool + ','
					     + (class348_sub43 != null
						? "{...}" : "null")
					     + ')'));
	}
    }
    
    private final void method2875(int i, int i_97_, int i_98_) {
	anIntArray8937[i] = i_98_;
	anInt8923++;
	if (i_97_ != 2)
	    anIntArray8937 = null;
    }
    
    private final void method2876(long l, int i) {
	try {
	    anInt8919++;
	    if (i <= -124) {
		while (aLong8957 <= l) {
		    int i_99_ = anInt8960;
		    int i_100_ = anInt8956;
		    long l_101_ = aLong8957;
		    while (anInt8956 == i_100_) {
			while ((((MidiFile) aClass204_8944).anIntArray2681
				[i_99_])
			       == i_100_) {
			    aClass204_8944.method1492(i_99_);
			    int i_102_ = aClass204_8944.method1494(i_99_);
			    if (i_102_ == 1) {
				aClass204_8944.method1495();
				aClass204_8944.method1486(i_99_);
				if (aClass204_8944.method1480()) {
				    if (aBoolean8961 && i_100_ != 0)
					aClass204_8944.method1484(l_101_);
				    else {
					method2851(true, true);
					aClass204_8944.method1487();
					return;
				    }
				}
				break;
			    }
			    if ((i_102_ & 0x80) != 0 && (0xf0 & i_102_) != 144)
				method2842(65, i_102_);
			    aClass204_8944.method1485(i_99_);
			    aClass204_8944.method1486(i_99_);
			}
			aLong8959 = l_101_;
			i_99_ = aClass204_8944.method1490();
			i_100_ = (((MidiFile) aClass204_8944).anIntArray2681
				  [i_99_]);
			l_101_ = aClass204_8944.method1488(i_100_);
		    }
		    anInt8960 = i_99_;
		    aLong8957 = l_101_;
		    anInt8956 = i_100_;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "ma.UA(" + l + ',' + i + ')');
	}
    }
    
    final synchronized void method2877(int i) {
	method2840(true, (byte) -95);
	if (i != -128)
	    method2849(103, -71, (byte) -108, -63);
	anInt8913++;
    }
    
    final synchronized int method2821() {
	anInt8901++;
	return 0;
    }
    
    static final Class318_Sub1_Sub1 method2878(int i, int i_103_, int i_104_) {
	Class357 class357
	    = Message.aClass357ArrayArrayArray2029[i][i_103_][i_104_];
	if (class357 == null
	    || ((Class357) class357).aClass318_Sub1_Sub1_4402 == null)
	    return null;
	return ((Class357) class357).aClass318_Sub1_Sub1_4402;
    }
    
    static final void method2879(int i, int i_105_, int i_106_) {
	Class357 class357
	    = Message.aClass357ArrayArrayArray2029[i][i_105_][i_106_];
	if (class357 != null) {
	    Class183
		.method1376(((Class357) class357).aClass318_Sub1_Sub1_4402);
	    if (((Class357) class357).aClass318_Sub1_Sub1_4402 != null)
		((Class357) class357).aClass318_Sub1_Sub1_4402 = null;
	}
    }
    
    public Class348_Sub16_Sub3() {
	anIntArray8896 = new int[16];
	aClass348_Sub43ArrayArray8915 = new Class348_Sub43[16][128];
	anIntArray8904 = new int[16];
	((Class348_Sub16_Sub3) this).anIntArray8914 = new int[16];
	((Class348_Sub16_Sub3) this).anIntArray8906 = new int[16];
	anIntArray8894 = new int[16];
	anIntArray8899 = new int[16];
	anIntArray8925 = new int[16];
	anIntArray8902 = new int[16];
	((Class348_Sub16_Sub3) this).anIntArray8895 = new int[16];
	aClass348_Sub43ArrayArray8928 = new Class348_Sub43[16][128];
	anIntArray8937 = new int[16];
	anIntArray8939 = new int[16];
	anInt8921 = 1000000;
	anIntArray8942 = new int[16];
	anIntArray8945 = new int[16];
	anIntArray8916 = new int[16];
	anInt8933 = 256;
	anIntArray8953 = new int[16];
	anIntArray8947 = new int[16];
	aClass204_8944 = new MidiFile();
	aClass348_Sub16_Sub1_8958 = new Class348_Sub16_Sub1(this);
	aClass356_8891 = new HashTable(128);
	method2843(256, -1, -7836);
	method2851(true, true);
    }
    
    Class348_Sub16_Sub3(Class348_Sub16_Sub3 class348_sub16_sub3_107_) {
	anIntArray8896 = new int[16];
	aClass348_Sub43ArrayArray8915 = new Class348_Sub43[16][128];
	anIntArray8904 = new int[16];
	((Class348_Sub16_Sub3) this).anIntArray8914 = new int[16];
	((Class348_Sub16_Sub3) this).anIntArray8906 = new int[16];
	anIntArray8894 = new int[16];
	anIntArray8899 = new int[16];
	anIntArray8925 = new int[16];
	anIntArray8902 = new int[16];
	((Class348_Sub16_Sub3) this).anIntArray8895 = new int[16];
	aClass348_Sub43ArrayArray8928 = new Class348_Sub43[16][128];
	anIntArray8937 = new int[16];
	anIntArray8939 = new int[16];
	anInt8921 = 1000000;
	anIntArray8942 = new int[16];
	anIntArray8945 = new int[16];
	anIntArray8916 = new int[16];
	anInt8933 = 256;
	anIntArray8953 = new int[16];
	anIntArray8947 = new int[16];
	aClass204_8944 = new MidiFile();
	aClass348_Sub16_Sub1_8958 = new Class348_Sub16_Sub1(this);
	try {
	    aClass356_8891 = class348_sub16_sub3_107_.aClass356_8891;
	    method2843(256, -1, -7836);
	    method2851(true, true);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ma.<init>("
					     + ((class348_sub16_sub3_107_
						 != null)
						? "{...}" : "null")
					     + ')'));
	}
    }
}
