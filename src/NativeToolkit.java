/* NativeToolkit - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;

import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;

import jagex3.graphics2.hw.NativeInterface;

abstract class NativeToolkit extends AbstractToolkit
{
    static int anInt7884;
    static int anInt7885;
    static int anInt7886;
    static int anInt7887;
    static int anInt7888;
    static int anInt7889;
    static int anInt7890;
    NativeHeap aNativeHeap7891;
    static int anInt7892;
    static int anInt7893;
    static int anInt7894;
    static int anInt7895;
    static int anInt7896;
    static int anInt7897;
    static int anInt7898;
    static int anInt7899;
    static int anInt7900;
    static int anInt7901;
    static int anInt7902;
    static int anInt7903;
    static int anInt7904;
    long aLong7905;
    static int anInt7906;
    static int anInt7907;
    static int anInt7908;
    static int anInt7909;
    private Canvas aCanvas7910;
    static int anInt7911;
    static int anInt7912;
    static int anInt7913;
    static int anInt7914;
    static int anInt7915;
    static int anInt7916;
    static int anInt7917;
    static int anInt7918;
    Object anObject7919;
    static int anInt7920;
    static int anInt7921;
    static int anInt7922;
    static int anInt7923;
    NativeInterface aNativeInterface7924;
    Canvas aCanvas7925;
    static int anInt7926;
    private Deque aClass262_7927 = new Deque();
    static int anInt7928;
    static int anInt7929;
    static int anInt7930;
    int anInt7931;
    static int anInt7932;
    static int anInt7933;
    static int anInt7934;
    static int anInt7935;
    static int anInt7936;
    Class269 aClass269_7937;
    static int anInt7938;
    static int anInt7939;
    static int anInt7940;
    static int anInt7941;
    static int anInt7942;
    static int anInt7943;
    static int anInt7944;
    static int anInt7945;
    static int anInt7946;
    static int anInt7947;
    static int anInt7948;
    static int anInt7949;
    static int anInt7950;
    static int anInt7951;
    static int anInt7952;
    static int anInt7953;
    static int anInt7954;
    static int anInt7955;
    static int anInt7956;
    static int anInt7957;
    private int anInt7958;
    static int anInt7959;
    static int anInt7960;
    static int anInt7961;
    int anInt7962;
    static int anInt7963;
    static int anInt7964;
    static int anInt7965;
    static int anInt7966;
    static int anInt7967;
    static int anInt7968;
    static int anInt7969;
    static int anInt7970;
    static int anInt7971;
    static int anInt7972;
    static int anInt7973;
    NativeHeapBuffer aNativeHeapBuffer7974;
    static int anInt7975;
    static int anInt7976;
    static int anInt7977;
    static int anInt7978;
    static int anInt7979;
    static int anInt7980;
    static int anInt7981;
    static int anInt7982;
    static int anInt7983;
    static int anInt7984;
    static int anInt7985;
    static int anInt7986;
    private int anInt7987;
    static int anInt7988;
    static int anInt7989;
    static int anInt7990;
    static int anInt7991;
    static int anInt7992;
    static int anInt7993;
    static int anInt7994;
    static int anInt7995;
    static int anInt7996;
    static int anInt7997;
    static int anInt7998;
    static int anInt7999;
    static int anInt8000;
    static int anInt8001;
    static int anInt8002;
    static int anInt8003;
    static int anInt8004;
    static int anInt8005;
    static int anInt8006;
    static int anInt8007;
    static int anInt8008;
    static int anInt8009;
    static int anInt8010;
    static int anInt8011;
    static int anInt8012;
    static int anInt8013;
    private Hashtable aHashtable8014;
    static int anInt8015;
    static int anInt8016;
    static int anInt8017;
    static int anInt8018;
    static String[] aStringArray8019 = new String[5];
    private Object anObject8020;
    static int anInt8021;
    static int anInt8022;
    static int anInt8023;
    static int anInt8024;
    static int anInt8025;
    static int anInt8026;
    static int anInt8027;
    static int anInt8028;
    static int anInt8029;
    static int anInt8030;
    static int anInt8031;
    static int anInt8032;
    static int anInt8033;
    static int anInt8034;
    static int anInt8035;
    static int anInt8036;
    static int anInt8037;
    static int anInt8038;
    IndexLoader aClass45_8039;
    static int anInt8040;
    static int anInt8041;
    static int anInt8042;
    static int anInt8043;
    static int anInt8044;
    static int anInt8045 = 0;
    static int anInt8046;
    static int anInt8047;
    static int anInt8048;
    static int anInt8049;
    static int anInt8050;
    static int anInt8051;
    static int anInt8052;
    static int anInt8053;
    static int anInt8054;
    static int anInt8055;
    static int anInt8056;
    static int anInt8057;
    static int anInt8058;
    static int anInt8059;
    static int anInt8060;
    static int anInt8061;
    int anInt8062;
    int anInt8063;
    static int anInt8064;
    static int anInt8065;
    static int anInt8066;
    static int anInt8067;
    static int anInt8068;
    boolean aBoolean8069 = true;
    static int anInt8070;
    static int anInt8071;
    static int anInt8072;
    static int anInt8073;
    Class101_Sub2 aClass101_Sub2_8074 = new Class101_Sub2();
    static int anInt8075;
    static int anInt8076;
    static int anInt8077;
    static int anInt8078;
    int anInt8079;
    Class101_Sub2 aClass101_Sub2_8080 = new Class101_Sub2();
    static int anInt8081;
    Class101_Sub2 aClass101_Sub2_8082 = new Class101_Sub2();
    Class101_Sub2 aClass101_Sub2_8083 = new Class101_Sub2();
    private Class101_Sub2 aClass101_Sub2_8084 = new Class101_Sub2();
    private Class101_Sub2 aClass101_Sub2_8085 = new Class101_Sub2();
    Class229[] aClass229Array8086;
    float aFloat8087;
    private Stream aStream8088;
    float aFloat8089;
    int anInt8090;
    int anInt8091;
    Class229[] aClass229Array8092;
    float aFloat8093 = 1.0F;
    int anInt8094;
    int anInt8095;
    int anInt8096;
    private boolean aBoolean8097;
    private Interface18[] anInterface18Array8098;
    private int anInt8099 = -1;
    private int anInt8100;
    boolean aBoolean8101;
    float[] aFloatArray8102;
    float aFloat8103;
    private int anInt8104;
    int anInt8105;
    int anInt8106;
    int anInt8107;
    private int anInt8108;
    int anInt8109;
    boolean aBoolean8110;
    private float[] aFloatArray8111;
    private boolean aBoolean8112;
    Class251[] aClass251Array8113;
    int anInt8114;
    float aFloat8115;
    boolean aBoolean8116;
    int anInt8117;
    boolean aBoolean8118;
    int anInt8119;
    private float[] aFloatArray8120;
    private boolean aBoolean8121;
    int anInt8122;
    boolean aBoolean8123;
    boolean aBoolean8124;
    int anInt8125;
    float aFloat8126;
    private boolean aBoolean8127;
    private float aFloat8128;
    int anInt8129;
    int anInt8130;
    Class101_Sub2[] aClass101_Sub2Array8131;
    Class348_Sub1[] aClass348_Sub1Array8132;
    int anInt8133;
    int anInt8134;
    float[] aFloatArray8135;
    private Class280 aClass280_8136;
    private Class372 aClass372_8137;
    int anInt8138;
    private Class367[] aClass367Array8139;
    private float[] aFloatArray8140;
    boolean aBoolean8141;
    private float[] aFloatArray8142;
    private Class367 aClass367_8143;
    int anInt8144;
    boolean aBoolean8145;
    int anInt8146;
    Interface18 anInterface18_8147;
    boolean aBoolean8148;
    boolean aBoolean8149;
    int fontSize;
    int anInt8151;
    private float[] aFloatArray8152;
    private boolean aBoolean8153;
    int anInt8154;
    private float aFloat8155;
    private int anInt8156;
    private float[] aFloatArray8157;
    float aFloat8158;
    boolean aBoolean8159;
    boolean aBoolean8160;
    private int anInt8161;
    private int anInt8162;
    Class173 aClass173_8163;
    boolean aBoolean8164;
    int anInt8165;
    private float aFloat8166;
    private int anInt8167;
    float aFloat8168;
    float aFloat8169;
    float[] aFloatArray8170;
    private Class299_Sub2 aClass299_Sub2_8171;
    private int anInt8172;
    float aFloat8173;
    float aFloat8174;
    int anInt8175;
    private boolean aBoolean8176;
    private int anInt8177;
    int anInt8178;
    private int anInt8179;
    float aFloat8180;
    int anInt8181;
    boolean aBoolean8182;
    int anInt8183;
    Class196 aClass196_8184;
    float aFloat8185;
    float aFloat8186;
    Class64_Sub2 aClass64_Sub2_8187;
    Class64_Sub2 aClass64_Sub2_8188;
    Class64_Sub2 aClass64_Sub2_8189;
    private Class130 aClass130_8190;
    Class130 aClass130_8191;
    Class64_Sub2 aClass64_Sub2_8192;
    private Interface5_Impl1 anInterface5_Impl1_8193;
    Class64_Sub2 aClass64_Sub2_8194;
    private Interface5_Impl2 anInterface5_Impl2_8195;
    private Class101_Sub2 aClass101_Sub2_8196;
    private Class130 aClass130_8197;
    Class64_Sub2 aClass64_Sub2_8198;
    Class64_Sub2 aClass64_Sub2_8199;
    Class64_Sub2 aClass64_Sub2_8200;
    private Interface5_Impl1 anInterface5_Impl1_8201;
    Class130 aClass130_8202;
    private Interface5_Impl1 anInterface5_Impl1_8203;
    Class130 aClass130_8204;
    private Class130 aClass130_8205;
    Class64_Sub2 aClass64_Sub2_8206;
    Class64_Sub2 aClass64_Sub2_8207;
    Class130 aClass130_8208;
    boolean aBoolean8209;
    private int anInt8210;
    /*synthetic*/ static Class aClass8211;
    
    final void da(int i, int i_0_, int i_1_, int[] is) {
	try {
	    anInt7966++;
	    float f
		= ((NativeToolkit) this).aClass101_Sub2_8080.method933((byte) -105,
								 (float) i,
								 (float) i_1_,
								 (float) i_0_);
	    int i_2_;
	    int i_3_;
	    if (f < -0.0078125F || f > 0.0078125F) {
		i_3_ = (int) ((float) ((NativeToolkit) this).anInt8129
			      * (((NativeToolkit) this).aClass101_Sub2_8080.method929
				 ((float) i_1_, (float) i_0_, (byte) 45,
				  (float) i))
			      / f);
		i_2_ = (int) ((float) ((NativeToolkit) this).anInt8134
			      * (((NativeToolkit) this).aClass101_Sub2_8080.method922
				 ((byte) 108, (float) i, (float) i_1_,
				  (float) i_0_))
			      / f);
	    } else {
		i_2_ = ((NativeToolkit) this).anInt8130;
		i_3_ = ((NativeToolkit) this).anInt8094;
	    }
	    is[2] = (int) f;
	    is[0] = (int) ((float) i_3_ - ((NativeToolkit) this).aFloat8126);
	    is[1] = (int) ((float) i_2_ - ((NativeToolkit) this).aFloat8103);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.da(" + i + ',' + i_0_ + ','
					     + i_1_ + ','
					     + (is != null ? "{...}" : "null")
					     + ')'));
	}
    }
    
    final void method3651(za var_za) {
	try {
	    anInt8005++;
	    ((NativeToolkit) this).aNativeHeap7891
		= ((za_Sub2) (za_Sub2) var_za).aNativeHeap9782;
	    ((NativeToolkit) this).aNativeHeapBuffer7974
		= ((NativeToolkit) this).aNativeHeap7891.a(32768, false);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "wga.PF(" + (var_za != null
							 ? "{...}"
							 : "null") + ')');
	}
    }
    
    final int JA(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
	anInt8071++;
	int i_9_ = 0;
	float f
	    = ((float) i_4_ * ((Class101_Sub2)
			       ((NativeToolkit) this).aClass101_Sub2_8080).aFloat5691
	       + (((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
		  .aFloat5736) * (float) i
	       + ((float) i_5_
		  * (((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
		     .aFloat5716))
	       + (((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
		  .aFloat5724));
	if (f < 1.0F)
	    f = 1.0F;
	float f_10_
	    = ((((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
		.aFloat5724)
	       + ((((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
		   .aFloat5691) * (float) i_7_
		  + (((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
		     .aFloat5736) * (float) i_6_
		  + ((float) i_8_
		     * (((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
			.aFloat5716))));
	if (f_10_ < 1.0F)
	    f_10_ = 1.0F;
	if (!((float) ((NativeToolkit) this).anInt8095 > f)
	    || !((float) ((NativeToolkit) this).anInt8095 > f_10_)) {
	    if (f > (float) ((NativeToolkit) this).anInt8154
		&& (float) ((NativeToolkit) this).anInt8154 < f_10_)
		i_9_ |= 0x20;
	} else
	    i_9_ |= 0x10;
	int i_11_
	    = (int) (((((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
		       .aFloat5729)
		      + ((float) i_5_ * (((Class101_Sub2)
					  ((NativeToolkit) this).aClass101_Sub2_8080)
					 .aFloat5704)
			 + ((float) i * (((Class101_Sub2)
					  ((NativeToolkit) this).aClass101_Sub2_8080)
					 .aFloat5711)
			    + (((Class101_Sub2)
				((NativeToolkit) this).aClass101_Sub2_8080)
			       .aFloat5700) * (float) i_4_)))
		     * (float) ((NativeToolkit) this).anInt8129 / f);
	int i_12_
	    = (int) (((((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
		       .aFloat5729)
		      + ((((Class101_Sub2)
			   ((NativeToolkit) this).aClass101_Sub2_8080).aFloat5700
			  * (float) i_7_)
			 + (float) i_6_ * ((Class101_Sub2)
					   (((NativeToolkit) this)
					    .aClass101_Sub2_8080)).aFloat5711
			 + (float) i_8_ * ((Class101_Sub2)
					   (((NativeToolkit) this)
					    .aClass101_Sub2_8080)).aFloat5704))
		     * (float) ((NativeToolkit) this).anInt8129 / f_10_);
	if ((float) i_11_ < ((NativeToolkit) this).aFloat8126
	    && (float) i_12_ < ((NativeToolkit) this).aFloat8126)
	    i_9_ |= 0x1;
	else if (((NativeToolkit) this).aFloat8158 < (float) i_11_
		 && (float) i_12_ > ((NativeToolkit) this).aFloat8158)
	    i_9_ |= 0x2;
	int i_13_
	    = (int) ((float) ((NativeToolkit) this).anInt8134
		     * ((((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
			 .aFloat5732) * (float) i_5_
			+ ((((Class101_Sub2)
			     ((NativeToolkit) this).aClass101_Sub2_8080).aFloat5722
			    * (float) i_4_)
			   + (float) i * ((Class101_Sub2)
					  (((NativeToolkit) this)
					   .aClass101_Sub2_8080)).aFloat5708)
			+ ((Class101_Sub2)
			   ((NativeToolkit) this).aClass101_Sub2_8080).aFloat5710)
		     / f);
	int i_14_
	    = (int) ((float) ((NativeToolkit) this).anInt8134
		     * ((float) i_8_ * (((Class101_Sub2)
					 ((NativeToolkit) this).aClass101_Sub2_8080)
					.aFloat5732)
			+ ((float) i_7_ * ((Class101_Sub2)
					   (((NativeToolkit) this)
					    .aClass101_Sub2_8080)).aFloat5722
			   + ((float) i_6_
			      * (((Class101_Sub2)
				  ((NativeToolkit) this).aClass101_Sub2_8080)
				 .aFloat5708)))
			+ ((Class101_Sub2)
			   ((NativeToolkit) this).aClass101_Sub2_8080).aFloat5710)
		     / f_10_);
	if (!(((NativeToolkit) this).aFloat8103 > (float) i_13_)
	    || !((float) i_14_ < ((NativeToolkit) this).aFloat8103)) {
	    if ((float) i_13_ > ((NativeToolkit) this).aFloat8185
		&& (float) i_14_ > ((NativeToolkit) this).aFloat8185)
		i_9_ |= 0x8;
	} else
	    i_9_ |= 0x4;
	return i_9_;
    }
    
    abstract Class130 method3812(int i, Class58[] class58s);
    
    final void ZA(int i, float f, float f_15_, float f_16_, float f_17_,
		  float f_18_) {
	anInt7912++;
	boolean bool = (anInt8172 ^ 0xffffffff) != (i ^ 0xffffffff);
	if (bool || f != ((NativeToolkit) this).aFloat8174
	    || f_15_ != ((NativeToolkit) this).aFloat8186) {
	    anInt8172 = i;
	    ((NativeToolkit) this).aFloat8174 = f;
	    ((NativeToolkit) this).aFloat8186 = f_15_;
	    if (bool) {
		((NativeToolkit) this).aFloat8087
		    = (float) (anInt8172 & 0xff00) / 65280.0F;
		((NativeToolkit) this).aFloat8180
		    = (float) (0xff0000 & anInt8172) / 1.671168E7F;
		((NativeToolkit) this).aFloat8168
		    = (float) (0xff & anInt8172) / 255.0F;
		method3928(0);
	    }
	    ((NativeToolkit) this).aNativeInterface7924.setSunColour
		(((NativeToolkit) this).aFloat8180, ((NativeToolkit) this).aFloat8087,
		 ((NativeToolkit) this).aFloat8168, f, f_15_);
	    method3842(true);
	}
	if (aFloatArray8142[0] != f_16_ || aFloatArray8142[1] != f_17_
	    || aFloatArray8142[2] != f_18_) {
	    aFloatArray8142[2] = f_18_;
	    aFloatArray8142[1] = f_17_;
	    aFloatArray8142[0] = f_16_;
	    aFloatArray8140[2] = -f_18_;
	    aFloatArray8140[0] = -f_16_;
	    aFloatArray8140[1] = -f_17_;
	    float f_19_
		= (float) (1.0
			   / Math.sqrt((double) (f_17_ * f_17_ + f_16_ * f_16_
						 + f_18_ * f_18_)));
	    ((NativeToolkit) this).aFloatArray8170[1] = f_19_ * f_17_;
	    ((NativeToolkit) this).aFloatArray8170[2] = f_19_ * f_18_;
	    ((NativeToolkit) this).aFloatArray8170[0] = f_16_ * f_19_;
	    ((NativeToolkit) this).aFloatArray8102[1]
		= -((NativeToolkit) this).aFloatArray8170[1];
	    ((NativeToolkit) this).aFloatArray8102[2]
		= -((NativeToolkit) this).aFloatArray8170[2];
	    ((NativeToolkit) this).aFloatArray8102[0]
		= -((NativeToolkit) this).aFloatArray8170[0];
	    ((NativeToolkit) this).aNativeInterface7924.setSunDirection
		(((NativeToolkit) this).aFloatArray8170[0],
		 ((NativeToolkit) this).aFloatArray8170[1],
		 ((NativeToolkit) this).aFloatArray8170[2]);
	    method3892(0);
	    ((NativeToolkit) this).anInt8133 = (int) (f_16_ * 256.0F / f_17_);
	    ((NativeToolkit) this).anInt8114 = (int) (256.0F * f_18_ / f_17_);
	}
	method3884((byte) 101);
    }
    
    abstract void method3813(boolean bool);
    
    final void method3814(boolean bool, boolean bool_20_, int i, byte i_21_) {
	if (i_21_ >= 27) {
	    anInt8081++;
	    if ((i ^ 0xffffffff) != (anInt8104 ^ 0xffffffff)
		|| !aBoolean8153 == ((NativeToolkit) this).aBoolean8160) {
		Interface18_Impl3 interface18_impl3 = null;
		int i_22_ = 0;
		byte i_23_ = 0;
		int i_24_ = 0;
		byte i_25_
		    = ((NativeToolkit) this).aBoolean8160 ? (byte) 3 : (byte) 0;
		if (i >= 0) {
		    interface18_impl3
			= aClass372_8137.method3587((byte) -97, i);
		    TextureDefinition class12 = ((AbstractToolkit) this).aD4579.getTexture(i, -6662);
		    if (((TextureDefinition) class12).aByte198 == 0
			&& ((TextureDefinition) class12).aByte211 == 0)
			method3879(-8629);
		    else {
			int i_26_
			    = !((TextureDefinition) class12).aBoolean199 ? 128 : 64;
			int i_27_ = i_26_ * 50;
			Class101_Sub2 class101_sub2 = method3820(false);
			class101_sub2.method916
			    (((float) (((NativeToolkit) this).anInt8146 % i_27_
				       * ((TextureDefinition) class12).aByte211)
			      / (float) i_27_),
			     true, 0.0F,
			     ((float) (((TextureDefinition) class12).aByte198
				       * (((NativeToolkit) this).anInt8146 % i_27_))
			      / (float) i_27_));
			method3853(-32, Class239_Sub18.aClass251_6030);
		    }
		    i_22_ = ((TextureDefinition) class12).anInt203;
		    if (!((NativeToolkit) this).aBoolean8160) {
			i_23_ = ((TextureDefinition) class12).aByte202;
			i_25_ = ((TextureDefinition) class12).aByte213;
			i_24_ = ((TextureDefinition) class12).anInt206;
		    }
		} else
		    method3879(-8629);
		method3875(i_23_, bool_20_, bool, i_25_, i_24_, -103);
		if (aClass367_8143 != null)
		    aClass367_8143.method3527(i_22_, interface18_impl3,
					      -16776);
		else {
		    method3850((byte) -86, interface18_impl3);
		    method3923(true, i_22_);
		}
		aBoolean8153 = ((NativeToolkit) this).aBoolean8160;
		anInt8104 = i;
	    }
	    anInt8100 &= ~0x7;
	}
    }
    
    final void method3815(int i, Class101_Sub2 class101_sub2) {
	try {
	    anInt8029++;
	    if (i != 0)
		((NativeToolkit) this).anInt8062 = -6;
	    ((NativeToolkit) this).aClass101_Sub2_8074.method898(class101_sub2);
	    ((NativeToolkit) this).aBoolean8069 = false;
	    method3836(1);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.JH(" + i + ','
					     + (class101_sub2 != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    private final void method3816(byte i) {
	anInterface5_Impl1_8203 = method3889(true, 16711680);
	int i_28_ = -85 / ((41 - i) / 54);
	anInt7948++;
	anInterface5_Impl1_8203.method20(24, (byte) 125, 12);
	aClass130_8205
	    = method3812(0, (new Class58[]
			     { new Class58(Class325.aClass325_4073) }));
    }
    
    final void method3817(int i, int i_29_) {
	if (i <= 53)
	    method3878(-0.15425435F, 84, -0.11598543F, 0.9862154F, -1.0921319F,
		       -1.1620088F, -1.5202727F);
	if (anInt8167 != i_29_) {
	    boolean bool;
	    Class173 class173;
	    boolean bool_30_;
	    if (i_29_ == 1) {
		bool = true;
		class173 = Class348_Sub4.aClass173_6602;
		bool_30_ = true;
	    } else if ((i_29_ ^ 0xffffffff) != -3) {
		if ((i_29_ ^ 0xffffffff) == -129) {
		    bool = true;
		    class173 = Class273.aClass173_5169;
		    bool_30_ = true;
		} else {
		    bool_30_ = false;
		    class173 = Class225.aClass173_2944;
		    bool = false;
		}
	    } else {
		class173 = ElementLoaderNode.aClass173_1201;
		bool_30_ = true;
		bool = false;
	    }
	    if (bool != ((NativeToolkit) this).aBoolean8141) {
		((NativeToolkit) this).aBoolean8141 = bool;
		method3939((byte) 100);
	    }
	    if (!bool_30_ == ((NativeToolkit) this).aBoolean8116) {
		((NativeToolkit) this).aBoolean8116 = bool_30_;
		method3947(4);
	    }
	    if (class173 != ((NativeToolkit) this).aClass173_8163) {
		((NativeToolkit) this).aClass173_8163 = class173;
		method3950(0);
	    }
	    anInt8100 &= ~0x1c;
	    anInt8167 = i_29_;
	}
	anInt7938++;
    }
    
    final aa method3661(int i, int i_31_, int[] is, int[] is_32_) {
	try {
	    anInt7957++;
	    return Class318_Sub4.method2501(i_31_, this, is, (byte) -42,
					    is_32_, i);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.RF(" + i + ',' + i_31_ + ','
					     + (is != null ? "{...}" : "null")
					     + ','
					     + (is_32_ != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    abstract void method3818(boolean bool);
    
    abstract void method3819(byte i);
    
    final Class101_Sub2 method3820(boolean bool) {
	anInt8004++;
	if (bool != false)
	    method3903(true);
	return (((NativeToolkit) this).aClass101_Sub2Array8131
		[((NativeToolkit) this).anInt8175]);
    }
    
    final void method3821(int i) {
	anInt7890++;
	method3932((byte) -125);
	method3929(true);
	if (i != -4845)
	    method3858(false);
    }
    
    final Interface5_Impl2 method3822(int i, int i_33_) {
	if ((2 * i_33_ ^ 0xffffffff)
	    < (anInterface5_Impl2_8195.method16(false) ^ 0xffffffff))
	    anInterface5_Impl2_8195.method23(15959, i_33_);
	if (i <= 23)
	    return null;
	anInt7975++;
	return anInterface5_Impl2_8195;
    }
    
    void method3823(byte i) {
	int i_34_ = 23 / ((-39 - i) / 62);
	((NativeToolkit) this).anInt8122 = ((NativeToolkit) this).anInt8151;
	anInt8006++;
	((NativeToolkit) this).anInt8151 = 0;
    }
    
    static final void method3824(int i, int i_35_, int i_36_, int i_37_,
				 int i_38_, int i_39_, int i_40_, int i_41_) {
	anInt7933++;
	if ((i_37_ ^ 0xffffffff) <= -1 && i >= 0
	    && -1 + Class367_Sub4.anInt7319 > i_37_
	    && ((-1 + Class348_Sub40_Sub3.anInt9109 ^ 0xffffffff)
		< (i ^ 0xffffffff))) {
	    if (Message.aClass357ArrayArrayArray2029 == null)
		return;
	    if (i_41_ == 0) {
		Interface10 interface10
		    = (Interface10) r_Sub2.method3297(i_40_, i_37_, i);
		Interface10 interface10_42_
		    = (Interface10) StringVarScriptSettingLoader.method813(i_40_, i_37_, i);
		if (interface10 != null && i_36_ != 2) {
		    if (interface10 instanceof Class318_Sub1_Sub4_Sub2)
			((Class318_Sub1_Sub4_Sub2) (Class318_Sub1_Sub4_Sub2)
			 interface10)
			    .aClass235_10115.method1671(262144, i_35_);
		    else
			Class218.method1591(i_37_, 89, i_41_, i_35_,
					    interface10.method42(-76), i_36_,
					    i, i_38_, i_40_);
		}
		if (interface10_42_ != null) {
		    if (interface10_42_ instanceof Class318_Sub1_Sub4_Sub2)
			((Class318_Sub1_Sub4_Sub2) (Class318_Sub1_Sub4_Sub2)
			 interface10_42_)
			    .aClass235_10115.method1671(262144, i_35_);
		    else
			Class218.method1591(i_37_, 92, i_41_, i_35_,
					    interface10_42_.method42(-71),
					    i_36_, i, i_38_, i_40_);
		}
	    } else if ((i_41_ ^ 0xffffffff) != -2) {
		if ((i_41_ ^ 0xffffffff) != -3) {
		    if ((i_41_ ^ 0xffffffff) == -4) {
			Interface10 interface10
			    = ((Interface10)
			       Class348_Sub16_Sub3.method2878(i_40_, i_37_,
							      i));
			if (interface10 != null) {
			    if (interface10 instanceof Class318_Sub1_Sub1_Sub1)
				((Class318_Sub1_Sub1_Sub1)
				 (Class318_Sub1_Sub1_Sub1) interface10)
				    .aClass235_9955.method1671(262144, i_35_);
			    else
				Class218.method1591(i_37_, 28, i_41_, i_35_,
						    interface10.method42(-123),
						    i_36_, i, i_38_, i_40_);
			}
		    }
		} else {
		    Interface10 interface10
			= ((Interface10)
			   (Class177.method1353
			    (i_40_, i_37_, i,
			     (aClass8211 != null ? aClass8211
			      : (aClass8211 = method3951("Interface10"))))));
		    if (interface10 != null) {
			if (i_36_ == 11)
			    i_36_ = 10;
			if (!(interface10 instanceof Class318_Sub1_Sub3_Sub2))
			    Class218.method1591(i_37_, 43, i_41_, i_35_,
						interface10.method42(-107),
						i_36_, i, i_38_, i_40_);
			else
			    ((Class318_Sub1_Sub3_Sub2)
			     (Class318_Sub1_Sub3_Sub2) interface10)
				.aClass235_10045.method1671(262144, i_35_);
		    }
		}
	    } else {
		Interface10 interface10
		    = ((Interface10)
		       Class348_Sub40_Sub32.method3135(i_40_, i_37_, i));
		if (interface10 != null) {
		    if (interface10 instanceof Class318_Sub1_Sub5_Sub2)
			((Class318_Sub1_Sub5_Sub2) (Class318_Sub1_Sub5_Sub2)
			 interface10)
			    .aClass235_10155.method1671(262144, i_35_);
		    else {
			int i_43_ = interface10.method42(-83);
			if (i_36_ != 4 && (i_36_ ^ 0xffffffff) != -6) {
			    if ((i_36_ ^ 0xffffffff) != -7) {
				if (i_36_ == 7)
				    Class218.method1591(i_37_, 50, i_41_,
							i_35_, i_43_, 4, i,
							4 + (0x3 & 2 + i_38_),
							i_40_);
				else if (i_36_ == 8) {
				    Class218.method1591(i_37_, 116, i_41_,
							i_35_, i_43_, 4, i,
							4 + i_38_, i_40_);
				    Class218.method1591(i_37_, 91, i_41_,
							i_35_, i_43_, 4, i,
							4 + (0x3 & i_38_ - -2),
							i_40_);
				}
			    } else
				Class218.method1591(i_37_, 22, i_41_, i_35_,
						    i_43_, 4, i, i_38_ + 4,
						    i_40_);
			} else
			    Class218.method1591(i_37_, 86, i_41_, i_35_, i_43_,
						4, i, i_38_, i_40_);
		    }
		}
	    }
	}
	if (i_39_ < 98)
	    method3936(-100);
    }
    
    final boolean method3699() {
	anInt7903++;
	return ((NativeToolkit) this).aBoolean8182;
    }
    
    final boolean supportsMultipleCores() {
	anInt7902++;
	return false;
    }
    
    final void method3825(int i) {
	if ((anInt8100 ^ 0xffffffff) != -9) {
	    method3895(-8);
	    method3838(true, true);
	    method3890(true, (byte) 111);
	    method3946(i ^ ~0x17, true);
	    method3817(69, 1);
	    anInt8100 = 8;
	}
	anInt8007++;
	if (i != 8)
	    method3901((byte) 20);
    }
    
    void method3652() {
	anInt8065++;
	if (!aBoolean8176) {
	    for (Node class348 = aClass262_7927.getFirst(4);
		 class348 != null;
		 class348 = aClass262_7927.nextForward((byte) 102))
		((za_Sub2) class348).method3445(-9503);
	    Enumeration enumeration = aHashtable8014.keys();
	    while (enumeration.hasMoreElements()) {
		Canvas canvas = (Canvas) enumeration.nextElement();
		method3911(canvas, 1, aHashtable8014.get(canvas));
	    }
	    Class286_Sub8.method2173(true, -125, false);
	    ((NativeToolkit) this).aNativeInterface7924.release();
	    aBoolean8176 = true;
	}
    }
    
    final void HA(int i, int i_44_, int i_45_, int i_46_, int[] is) {
	try {
	    anInt7979++;
	    float f = (((NativeToolkit) this).aClass101_Sub2_8080.method933
		       ((byte) -105, (float) i, (float) i_45_, (float) i_44_));
	    if ((float) ((NativeToolkit) this).anInt8095 > f
		|| (float) ((NativeToolkit) this).anInt8154 < f)
		is[0] = is[1] = is[2] = -1;
	    else {
		int i_47_
		    = (int) ((float) ((NativeToolkit) this).anInt8129
			     * (((NativeToolkit) this).aClass101_Sub2_8080.method929
				((float) i_45_, (float) i_44_, (byte) 45,
				 (float) i))
			     / (float) i_46_);
		int i_48_
		    = (int) ((float) ((NativeToolkit) this).anInt8134
			     * (((NativeToolkit) this).aClass101_Sub2_8080.method922
				((byte) 67, (float) i, (float) i_45_,
				 (float) i_44_))
			     / (float) i_46_);
		is[2] = (int) f;
		is[1] = (int) (-((NativeToolkit) this).aFloat8103 + (float) i_48_);
		is[0] = (int) (-((NativeToolkit) this).aFloat8126 + (float) i_47_);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.HA(" + i + ',' + i_44_ + ','
					     + i_45_ + ',' + i_46_ + ','
					     + (is != null ? "{...}" : "null")
					     + ')'));
	}
    }
    
    final boolean method3670() {
	anInt7898++;
	return true;
    }
    
    final int method3826(byte i) {
	if (i != -70)
	    method3702(-1);
	anInt8050++;
	return anInt8177;
    }
    
    final void drawBitmapQuad(int i, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_,
		 byte[] is, int i_54_, int i_55_) {
	try {
	    anInt8000++;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.Q(" + i + ',' + i_49_ + ','
					     + i_50_ + ',' + i_51_ + ','
					     + i_52_ + ',' + i_53_ + ','
					     + (is != null ? "{...}" : "null")
					     + ',' + i_54_ + ',' + i_55_
					     + ')'));
	}
    }
    
    final void method3638(Class101 class101) {
	do {
	    try {
		((NativeToolkit) this).aClass101_Sub2_8080
		    = (Class101_Sub2) class101;
		anInt7923++;
		((NativeToolkit) this).aClass101_Sub2_8083
		    .method898(((NativeToolkit) this).aClass101_Sub2_8080);
		((NativeToolkit) this).aClass101_Sub2_8083.method934((byte) 64);
		aClass101_Sub2_8084
		    .method931(-25519, ((NativeToolkit) this).aClass101_Sub2_8083);
		((NativeToolkit) this).aClass101_Sub2_8082
		    .method931(-25519, ((NativeToolkit) this).aClass101_Sub2_8080);
		if (!((NativeToolkit) this).aClass196_8184.method1450(-112))
		    break;
		method3913((byte) 107);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						"wga.DE(" + (class101 != null
							     ? "{...}"
							     : "null") + ')');
	    }
	    break;
	} while (false);
    }
    
    abstract void method3827(byte i);
    
    private final void method3828(boolean bool) {
	anInterface5_Impl1_8193 = method3889(bool, 16711680);
	anInt7985++;
	anInterface5_Impl1_8193.method20(140, (byte) 123, 28);
	for (int i = 0; i < 4; i++) {
	    Buffer buffer = anInterface5_Impl1_8193.method19(true, 26775);
	    if (buffer != null) {
		Stream stream = method3893(buffer, 9179);
		if (!Stream.c()) {
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(1.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(1.0F);
		    stream.b(0.0F);
		    stream.b(1.0F);
		    stream.b(1.0F);
		    stream.b(1.0F);
		    stream.b(0.0F);
		    stream.b(1.0F);
		    stream.b(1.0F);
		    stream.b(1.0F);
		    stream.b(1.0F);
		    stream.b(1.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(1.0F);
		    stream.b(0.0F);
		    stream.b(1.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		} else {
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(1.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(1.0F);
		    stream.a(0.0F);
		    stream.a(1.0F);
		    stream.a(1.0F);
		    stream.a(1.0F);
		    stream.a(0.0F);
		    stream.a(1.0F);
		    stream.a(1.0F);
		    stream.a(1.0F);
		    stream.a(1.0F);
		    stream.a(1.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(1.0F);
		    stream.a(0.0F);
		    stream.a(1.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		}
		stream.a();
		if (anInterface5_Impl1_8193.method18(6331))
		    break;
	    }
	}
	aClass130_8197
	    = method3812(0, (new Class58[]
			     { new Class58(new Class325[]
					   { Class325.aClass325_4073,
					     Class325.aClass325_4078,
					     Class325.aClass325_4078 }) }));
    }
    
    abstract void method3829(Class70 class70, int i, byte i_56_, boolean bool);
    
    abstract Interface18_Impl3 method3830(int i, int[] is, boolean bool,
					  byte i_57_, int i_58_, int i_59_,
					  int i_60_);
    
    final void method3631(int i) {
	anInt7963++;
	if (i != 1)
	    throw new IllegalArgumentException("");
    }
    
    private final void method3831(byte i) {
	if (i != 19)
	    createRasterToolkit(31, -7, false);
	aBoolean8097 = false;
	anInt7893++;
	method3906((byte) 122);
	if (Class180.aClass196_2372 == ((NativeToolkit) this).aClass196_8184)
	    method3929(true);
    }
    
    Class367 method3832(int i, byte i_61_) {
	if (i_61_ > -57)
	    method3817(22, -65);
	anInt7969++;
	int i_62_ = i;
    while_231_:
	do {
	while_230_:
	    do {
		do {
		    if (i_62_ != 6) {
			if (i_62_ != 1) {
			    if (i_62_ != 2) {
				if ((i_62_ ^ 0xffffffff) != -8)
				    break while_231_;
			    } else
				break;
			    break while_230_;
			}
		    } else
			return new Class367_Sub3(this);
		    return new Class367_Sub4(this);
		} while (false);
		return new Class367_Sub8(this,
					 ((NativeToolkit) this).aClass269_7937);
	    } while (false);
	    return new Class367_Sub10(this);
	} while (false);
	return new Class367_Sub1(this);
    }
    
    final int method3833(byte i) {
	anInt7994++;
	if (i != -58)
	    method3820(true);
	return anInt8179;
    }
    
    final Interface18_Impl2 method3834(int i) {
	if (i != -16777216)
	    anInt8100 = 109;
	anInt7934++;
	if (aClass299_Sub2_8171 != null)
	    return aClass299_Sub2_8171.method2266(true);
	return null;
    }
    
    final float[] method3835(float[] fs, int i) {
	try {
	    fs[0] = ((NativeToolkit) this).aFloatArray8135[0];
	    fs[4] = ((NativeToolkit) this).aFloatArray8135[1];
	    fs[12] = ((NativeToolkit) this).aFloatArray8135[3];
	    if (i > -77)
		method3827((byte) 43);
	    anInt8053++;
	    fs[8] = ((NativeToolkit) this).aFloatArray8135[2];
	    fs[9] = ((NativeToolkit) this).aFloatArray8135[6];
	    fs[13] = ((NativeToolkit) this).aFloatArray8135[7];
	    fs[2] = ((NativeToolkit) this).aFloatArray8135[8];
	    fs[1] = ((NativeToolkit) this).aFloatArray8135[4];
	    fs[5] = ((NativeToolkit) this).aFloatArray8135[5];
	    fs[10] = ((NativeToolkit) this).aFloatArray8135[10];
	    fs[14] = ((NativeToolkit) this).aFloatArray8135[11];
	    fs[3] = ((NativeToolkit) this).aFloatArray8135[12];
	    fs[6] = ((NativeToolkit) this).aFloatArray8135[9];
	    fs[7] = ((NativeToolkit) this).aFloatArray8135[13];
	    fs[15] = ((NativeToolkit) this).aFloatArray8135[15];
	    fs[11] = ((NativeToolkit) this).aFloatArray8135[14];
	    return fs;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.OA("
					     + (fs != null ? "{...}" : "null")
					     + ',' + i + ')'));
	}
    }
    
    private final void method3836(int i) {
	if (Class148.aClass196_2042 == ((NativeToolkit) this).aClass196_8184) {
	    float f = method3858(false);
	    ((NativeToolkit) this).aClass101_Sub2_8074.method920(f, false, 0.0F, f);
	}
	anInt8023++;
	aBoolean8121 = false;
	method3901((byte) -48);
	if (i == 1) {
	    if (aClass367_8143 != null)
		aClass367_8143.method3523((byte) 12);
	}
    }
    
    final float[] method3837(boolean bool) {
	if (bool != true)
	    method3863(-25);
	anInt7992++;
	return aFloatArray8111;
    }
    
    final void method3838(boolean bool, boolean bool_63_) {
	if (bool != true)
	    aFloatArray8157 = null;
	if (((NativeToolkit) this).aBoolean8123 == !bool_63_) {
	    ((NativeToolkit) this).aBoolean8123 = bool_63_;
	    method3827((byte) -84);
	    anInt8100 &= ~0x1f;
	}
	anInt7967++;
    }
    
    final Interface18_Impl3 method3839(int i, int i_64_, int i_65_,
				       boolean bool, int[] is) {
	try {
	    if (i_65_ != -15137)
		((NativeToolkit) this).aFloat8126 = -0.13315333F;
	    anInt7965++;
	    return method3830(i_64_, is, bool, (byte) 107, 0, 0, i);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.JG(" + i + ',' + i_64_ + ','
					     + i_65_ + ',' + bool + ','
					     + (is != null ? "{...}" : "null")
					     + ')'));
	}
    }
    
    abstract Interface5_Impl2 method3840(int i, boolean bool);
    
    abstract void method3841(byte i);
    
    abstract void method3842(boolean bool);
    
    abstract Interface18_Impl3 method3843
	(int i, int i_66_, int i_67_, int i_68_, byte[] is, Class304 class304,
	 int i_69_, boolean bool);
    
    final void X(int i) {
	anInt7920++;
	((NativeToolkit) this).anInt8107 = 0;
	for (/**/; (i ^ 0xffffffff) < -2; i >>= 1)
	    ((NativeToolkit) this).anInt8107++;
	((NativeToolkit) this).anInt8125 = 1 << ((NativeToolkit) this).anInt8107;
    }
    
    abstract void method3844(int i, Canvas canvas, Object object);
    
    final void drawQuad(int i, int i_70_, int i_71_, int i_72_, int i_73_,
		  int i_74_) {
	method3903(false);
	anInt8017++;
	method3894(-28186, i_73_);
	method3849((byte) 47, 0, Class348_Sub40_Sub39.aClass70_9485);
	method3885(0, true, Class348_Sub40_Sub39.aClass70_9485);
	method3817(113, i_74_);
	((NativeToolkit) this).aClass101_Sub2_8074
	    .method932(1.0F, (float) i_72_, (float) i_71_, (byte) -22);
	((NativeToolkit) this).aClass101_Sub2_8074.method891(i, i_70_, 0);
	method3915(0);
	method3926((byte) 67, false);
	method3933(-70);
	method3926((byte) 83, true);
	method3885(0, true, Class342.aClass70_4247);
	method3849((byte) 47, 0, Class342.aClass70_4247);
    }
    
    private final void method3845(byte i) {
	if (Class148.aClass196_2042 != ((NativeToolkit) this).aClass196_8184) {
	    Class196 class196 = ((NativeToolkit) this).aClass196_8184;
	    ((NativeToolkit) this).aClass196_8184 = Class148.aClass196_2042;
	    if (class196.method1450(-48))
		method3913((byte) -121);
	    method3919(20794);
	    ((NativeToolkit) this).aFloatArray8135 = aFloatArray8120;
	    method3929(true);
	    anInt8100 &= ~0x18;
	}
	anInt7907++;
	if (i < 12)
	    aStringArray8019 = null;
    }
    
    private final void method3846(byte i) {
	anInt7928++;
	aBoolean8112 = false;
	int i_75_ = -77 / ((i - 78) / 48);
	method3949((byte) -58);
	if (Widget.aClass196_838 == ((NativeToolkit) this).aClass196_8184)
	    method3929(true);
    }
    
    private final void method3847(int i) {
	if (i != 0)
	    ((NativeToolkit) this).aFloatArray8102 = null;
	if (Widget.aClass196_838 != ((NativeToolkit) this).aClass196_8184) {
	    Class196 class196 = ((NativeToolkit) this).aClass196_8184;
	    ((NativeToolkit) this).aClass196_8184 = Widget.aClass196_838;
	    if (!class196.method1450(-45))
		method3913((byte) 94);
	    method3949((byte) -113);
	    ((NativeToolkit) this).aFloatArray8135 = aFloatArray8157;
	    method3929(true);
	    anInt8100 &= ~0x7;
	}
	anInt7999++;
    }
    
    final Class101_Sub2 method3848(int i) {
	anInt8031++;
	if (i != 5)
	    method3890(false, (byte) 95);
	return (((NativeToolkit) this).aClass101_Sub2Array8131
		[((NativeToolkit) this).anInt8175]);
    }
    
    final void method3849(byte i, int i_76_, Class70 class70) {
	try {
	    if (i != 47)
		((NativeToolkit) this).aFloat8087 = -0.68323714F;
	    anInt8036++;
	    method3924(false, false, i_76_, class70, false);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.NJ(" + i + ',' + i_76_ + ','
					     + (class70 != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    final void method3709(int i, int i_77_, int i_78_, int i_79_, int i_80_,
			  int i_81_) {
	anInt7915++;
	float f = (float) -i + (float) i_78_;
	float f_82_ = (float) i_79_ - (float) i_77_;
	if (f != 0.0F || f_82_ != 0.0F) {
	    float f_83_
		= (float) (1.0 / Math.sqrt((double) (f_82_ * f_82_ + f * f)));
	    f_82_ *= f_83_;
	    f *= f_83_;
	} else
	    f = 1.0F;
	if (method3878((float) i_77_, 0, (float) i_78_ + f, 0.0F,
		       f_82_ + (float) i_79_, 0.0F, (float) i)) {
	    method3903(false);
	    method3894(-28186, i_80_);
	    method3849((byte) 47, 0, Class348_Sub40_Sub39.aClass70_9485);
	    method3885(0, true, Class348_Sub40_Sub39.aClass70_9485);
	    method3817(112, i_81_);
	    method3942(5);
	    method3926((byte) 45, false);
	    method3907(true);
	    method3926((byte) 48, true);
	    method3885(0, true, Class342.aClass70_4247);
	    method3849((byte) 47, 0, Class342.aClass70_4247);
	}
    }
    
    final void method3850(byte i, Interface18 interface18) {
	try {
	    if (anInterface18Array8098[((NativeToolkit) this).anInt8175]
		!= interface18) {
		anInterface18Array8098[((NativeToolkit) this).anInt8175]
		    = interface18;
		if (interface18 != null)
		    interface18.method63((byte) -30);
		else
		    method3819((byte) -107);
		anInt8100 &= ~0x1;
	    }
	    int i_84_ = 96 / ((i - 20) / 42);
	    anInt7900++;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.WA(" + i + ','
					     + (interface18 != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    final Class101 method3640() {
	anInt7945++;
	return ((NativeToolkit) this).aClass101_Sub2_8080;
    }
    
    final void A(int i, aa var_aa, int i_85_, int i_86_) {
	try {
	    anInt7940++;
	    aa_Sub2 var_aa_Sub2 = (aa_Sub2) var_aa;
	    Interface18_Impl3 interface18_impl3
		= ((aa_Sub2) var_aa_Sub2).anInterface18_Impl3_5196;
	    method3864(81);
	    method3850((byte) -47, interface18_impl3);
	    method3817(99, 1);
	    method3874(Class328_Sub3.aClass229_6519, 114,
		       Class328_Sub3.aClass229_6519);
	    method3849((byte) 47, 0, Class348_Sub40_Sub39.aClass70_9485);
	    method3894(-28186, i);
	    ((NativeToolkit) this).aClass101_Sub2_8074.method932
		(0.0F, (float) ((NativeToolkit) this).anInt7962,
		 (float) ((NativeToolkit) this).anInt7931, (byte) -52);
	    method3915(0);
	    ((NativeToolkit) this).aClass101_Sub2Array8131[0].method932
		(1.0F,
		 interface18_impl3
		     .method71((byte) -46, (float) ((NativeToolkit) this).anInt7962),
		 interface18_impl3.method67((float) ((NativeToolkit) this).anInt7931,
					    109),
		 (byte) -37);
	    ((NativeToolkit) this).aClass101_Sub2Array8131[0].method920
		(interface18_impl3.method71((byte) -52, (float) -i_86_), false,
		 0.0F, interface18_impl3.method67((float) -i_85_, 94));
	    ((NativeToolkit) this).aClass251Array8113[0]
		= Class239_Sub18.aClass251_6030;
	    method3905((byte) 127);
	    method3933(-127);
	    method3879(-8629);
	    method3849((byte) 47, 0, Class342.aClass70_4247);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.A(" + i + ','
					     + (var_aa != null ? "{...}"
						: "null")
					     + ',' + i_85_ + ',' + i_86_
					     + ')'));
	}
    }
    
    final AnimatableToolkit method3625(Model class124, int i, int i_87_, int i_88_,
			     int i_89_) {
	try {
	    anInt8016++;
	    return new Class64_Sub2(this, class124, i, i_88_, i_89_, i_87_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.EG("
					     + (class124 != null ? "{...}"
						: "null")
					     + ',' + i + ',' + i_87_ + ','
					     + i_88_ + ',' + i_89_ + ')'));
	}
    }
    
    final void method3669(Canvas canvas, int i, int i_90_) {
	do {
	    try {
		anInt8025++;
		Object object = null;
		if (canvas == null || canvas == ((NativeToolkit) this).aCanvas7925)
		    object = anObject8020;
		else if (aHashtable8014.containsKey(canvas))
		    object = aHashtable8014.get(canvas);
		if (object == null)
		    throw new RuntimeException();
		method3844(12727, canvas, object);
		if (canvas != aCanvas7910)
		    break;
		method3917(false);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("wga.HF("
						 + (canvas != null ? "{...}"
						    : "null")
						 + ',' + i + ',' + i_90_
						 + ')'));
	    }
	    break;
	} while (false);
    }
    
    abstract void method3851(int i);
    
    final boolean method3694() {
	anInt7901++;
	return false;
    }
    
    final void method3852(int i, boolean bool) {
	anInt8003++;
	if (bool == !((NativeToolkit) this).aBoolean8148) {
	    ((NativeToolkit) this).aBoolean8148 = bool;
	    method3827((byte) -43);
	}
	if (i != 9)
	    aFloatArray8140 = null;
    }
    
    final void method3853(int i, Class251 class251) {
	try {
	    anInt8057++;
	    if (i != -32)
		aFloatArray8142 = null;
	    ((NativeToolkit) this).aClass251Array8113[((NativeToolkit) this).anInt8175]
		= class251;
	    method3905((byte) 111);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.HI(" + i + ','
					     + (class251 != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    final boolean method3695() {
	anInt7991++;
	return true;
    }
    
    final Class101_Sub2 method3854(byte i) {
	anInt7983++;
	int i_91_ = 97 / ((i - 35) / 63);
	return aClass101_Sub2_8084;
    }
    
    abstract Interface18_Impl3 method3855(Class304 class304, int i, int i_92_,
					  float[] fs, boolean bool, int i_93_,
					  int i_94_, int i_95_);
    
    private final void method3856(byte i) {
	anInt8044++;
	if (aClass367_8143 != null)
	    aClass367_8143.method3522(-16252);
	method3851(25644);
	if (i <= 56)
	    aBoolean8176 = false;
    }
    
    final void method3857(byte i) {
	int i_96_ = -76 % ((i - 44) / 41);
	anInt8051++;
	if (anInt8100 != 16) {
	    method3847(0);
	    method3838(true, true);
	    method3890(true, (byte) 125);
	    method3946(-32, true);
	    method3817(123, 1);
	    anInt8100 = 16;
	}
    }
    
    final RasterToolkit createRasterToolkit(int i, int i_97_, boolean bool) {
	anInt8040++;
	return new NativeRaster(this, i, i_97_, bool);
    }
    
    abstract float method3858(boolean bool);
    
    abstract void method3859(int i);
    
    private final void method3860(Class21 class21, int i, int i_98_) {
	try {
	    method3925(-96, anInterface5_Impl1_8193, 0);
	    anInt8067++;
	    method3862(i_98_ ^ i_98_, aClass130_8197);
	    method3899(i, 0, class21, true);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.QI("
					     + (class21 != null ? "{...}"
						: "null")
					     + ',' + i + ',' + i_98_ + ')'));
	}
    }
    
    abstract Interface18_Impl3 method3861(int i, byte i_99_, int i_100_,
					  Class68 class68, Class304 class304);
    
    abstract void method3862(int i, Class130 class130);
    
    final int method3863(int i) {
	int i_101_ = -95 / ((i - 7) / 57);
	anInt7917++;
	return anInt8099;
    }
    
    final void getDimensions(int[] is) {
	try {
	    is[0] = ((NativeToolkit) this).anInt8106;
	    anInt8061++;
	    is[3] = ((NativeToolkit) this).anInt8096;
	    is[2] = ((NativeToolkit) this).anInt8183;
	    is[1] = ((NativeToolkit) this).anInt8165;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "wga.K(" + (is != null ? "{...}"
							: "null") + ')');
	}
    }
    
    final void method3864(int i) {
	int i_102_ = 51 / ((40 - i) / 34);
	if ((anInt8100 ^ 0xffffffff) != -3) {
	    method3845((byte) 76);
	    method3838(true, false);
	    method3866(false, true);
	    method3890(false, (byte) 102);
	    method3946(-32, false);
	    method3814(false, false, -2, (byte) 43);
	    anInt8100 = 2;
	}
	anInt7930++;
    }
    
    final Class101 method3705() {
	anInt8077++;
	return aClass101_Sub2_8196;
    }
    
    final void C(boolean bool) {
	((NativeToolkit) this).aBoolean8124 = bool;
	anInt7989++;
	method3841((byte) -116);
    }
    
    final void method3865(boolean bool, int i) {
	if (i < 20)
	    method3685(null, -88);
	if (bool == !((NativeToolkit) this).aBoolean8110) {
	    ((NativeToolkit) this).aBoolean8110 = bool;
	    method3818(true);
	}
	anInt7953++;
    }
    
    final void method3866(boolean bool, boolean bool_103_) {
	anInt8010++;
	if (!((NativeToolkit) this).aBoolean8145 != !bool) {
	    ((NativeToolkit) this).aBoolean8145 = bool;
	    method3883(-24);
	    anInt8100 &= ~0x7;
	}
	if (bool_103_ != true)
	    ((NativeToolkit) this).anInt8095 = 22;
    }
    
    final void method3703(int i, int i_104_, int i_105_, int i_106_,
			  int i_107_, int i_108_, aa var_aa, int i_109_,
			  int i_110_, int i_111_, int i_112_, int i_113_) {
	try {
	    anInt7914++;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.IF(" + i + ',' + i_104_ + ','
					     + i_105_ + ',' + i_106_ + ','
					     + i_107_ + ',' + i_108_ + ','
					     + (var_aa != null ? "{...}"
						: "null")
					     + ',' + i_109_ + ',' + i_110_
					     + ',' + i_111_ + ',' + i_112_
					     + ',' + i_113_ + ')'));
	}
    }
    
    final boolean method3639() {
	anInt8073++;
	return aClass367Array8139[3].method3530(-78);
    }
    
    final void method3867(float f, int i) {
	anInt8024++;
	if (f != aFloat8155) {
	    aFloat8155 = f;
	    method3846((byte) 30);
	}
	int i_114_ = 72 % ((-8 - i) / 36);
    }
    
    abstract void method3868(boolean bool);
    
    final NativeHeapBuffer method3869(byte i, boolean bool, int i_115_) {
	int i_116_ = -44 % ((-27 - i) / 52);
	anInt7916++;
	return ((NativeToolkit) this).aNativeHeap7891.a(i_115_, bool);
    }
    
    public static void method3870(int i) {
	aStringArray8019 = null;
	if (i <= 99)
	    anInt8045 = -72;
    }
    
    final int E() {
	anInt7951++;
	return (((NativeToolkit) this).anInt8079 + ((NativeToolkit) this).anInt8062
		+ ((NativeToolkit) this).anInt8063);
    }
    
    abstract void method3871(Class113 class113, int i);
    
    abstract Interface18_Impl1 method3872(int i, int i_117_, Class304 class304,
					  boolean bool, int i_118_, byte[] is);
    
    final void setDimensions(int i, int i_119_, int i_120_, int i_121_) {
	anInt7972++;
	if ((i ^ 0xffffffff) >= -1
	    && (-1 + ((NativeToolkit) this).anInt7931 ^ 0xffffffff) >= (i_120_
								  ^ 0xffffffff)
	    && i_119_ <= 0 && ((NativeToolkit) this).anInt7962 - 1 <= i_121_)
	    la();
	else {
	    ((NativeToolkit) this).anInt8165
		= (i_119_ ^ 0xffffffff) <= -1 ? i_119_ : 0;
	    ((NativeToolkit) this).anInt8106 = (i ^ 0xffffffff) > -1 ? 0 : i;
	    ((NativeToolkit) this).anInt8096
		= (i_121_ ^ 0xffffffff) >= (((NativeToolkit) this).anInt7931
					    ^ 0xffffffff) ? i_121_ : 0;
	    ((NativeToolkit) this).anInt8183
		= i_120_ > ((NativeToolkit) this).anInt7931 ? 0 : i_120_;
	    if (!((NativeToolkit) this).aBoolean8209) {
		((NativeToolkit) this).aBoolean8209 = true;
		method3921(1);
	    }
	    method3888(6259);
	    method3904(-70);
	}
    }
    
    final s method3648(int i, int i_122_, int[][] is, int[][] is_123_,
		       int i_124_, int i_125_, int i_126_) {
	try {
	    anInt8011++;
	    return new s_Sub3(this, i_125_, i_126_, i, i_122_, is, is_123_,
			      i_124_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.VE(" + i + ',' + i_122_ + ','
					     + (is != null ? "{...}" : "null")
					     + ','
					     + (is_123_ != null ? "{...}"
						: "null")
					     + ',' + i_124_ + ',' + i_125_
					     + ',' + i_126_ + ')'));
	}
    }
    
    static final byte[] split(byte[] is, int i) {
	try {
	    anInt8015++;
	    int i_127_ = is.length;
	    byte[] is_128_ = new byte[i_127_];
	    Class214.byteArrayCopy(is, i, is_128_, 0, i_127_);
	    return is_128_;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.GI("
					     + (is != null ? "{...}" : "null")
					     + ',' + i + ')'));
	}
    }
    
    final void method3650(int i) {
	anInt7908++;
    }
    
    final void method3678(int i) {
	anInt8002++;
    }
    
    final void method3874(Class229 class229, int i, Class229 class229_129_) {
	do {
	    try {
		anInt7959++;
		boolean bool = false;
		if (class229_129_ != (((NativeToolkit) this).aClass229Array8086
				      [((NativeToolkit) this).anInt8175])) {
		    ((NativeToolkit) this).aClass229Array8086[(((NativeToolkit) this)
							 .anInt8175)]
			= class229_129_;
		    method3920(10);
		    bool = true;
		}
		if (i <= 97)
		    method3888(89);
		if ((((NativeToolkit) this).aClass229Array8092
		     [((NativeToolkit) this).anInt8175])
		    != class229) {
		    ((NativeToolkit) this).aClass229Array8092[(((NativeToolkit) this)
							 .anInt8175)]
			= class229;
		    bool = true;
		    method3935(-100);
		}
		if (!bool)
		    break;
		anInt8100 &= ~0x1d;
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("wga.RI("
						 + (class229 != null ? "{...}"
						    : "null")
						 + ',' + i + ','
						 + (class229_129_ != null
						    ? "{...}" : "null")
						 + ')'));
	    }
	    break;
	} while (false);
    }
    
    final void method3696(int i) {
	anInt7995++;
	if (i < 128 || i > 1024)
	    throw new IllegalArgumentException();
	if (aClass372_8137 != null)
	    aClass372_8137.method3585(7271);
	((NativeToolkit) this).fontSize = i;
    }
    
    private final void method3875(int i, boolean bool, boolean bool_130_,
				  int i_131_, int i_132_, int i_133_) {
	if (i_133_ >= -26)
	    ((NativeToolkit) this).aClass130_8204 = null;
	anInt7932++;
	bool_130_ &= method3639();
	if (!bool_130_
	    && (i_131_ == 4 || i_131_ == 8 || (i_131_ ^ 0xffffffff) == -10)) {
	    i_131_ = 2;
	    i_132_ = (i_131_ ^ 0xffffffff) == -5 ? i & 0x1 : 1;
	    i = 0;
	}
	if ((i_131_ ^ 0xffffffff) != -1 && bool)
	    i_131_ |= ~0x7fffffff;
	if (anInt8156 != i_131_) {
	    if (anInt8156 != 0)
		aClass367Array8139[0x7fffffff & anInt8156]
		    .method3520((byte) 87);
	    if ((i_131_ ^ 0xffffffff) != -1) {
		aClass367_8143 = aClass367Array8139[0x7fffffff & i_131_];
		aClass367_8143.method3525(15192, bool);
		aClass367_8143.method3521(bool, (byte) -103);
		aClass367_8143.method3526(10756, i, i_132_);
	    } else
		aClass367_8143 = null;
	    anInt8156 = i_131_;
	    anInt8161 = i;
	    anInt8108 = i_132_;
	} else if (anInt8156 != 0) {
	    aClass367Array8139[0x7fffffff & anInt8156].method3521(bool,
								  (byte) -103);
	    if ((anInt8161 ^ 0xffffffff) != (i ^ 0xffffffff)
		|| anInt8108 != i_132_) {
		aClass367Array8139[anInt8156 & 0x7fffffff].method3526(10756, i,
								      i_132_);
		anInt8108 = i_132_;
		anInt8161 = i;
	    }
	}
    }
    
    final void za(int i, int i_134_, int i_135_, int i_136_, int i_137_) {
	anInt8026++;
	method3903(false);
	method3894(-28186, i_136_);
	method3849((byte) 47, 0, Class348_Sub40_Sub39.aClass70_9485);
	method3885(0, true, Class348_Sub40_Sub39.aClass70_9485);
	method3817(83, i_137_);
	((NativeToolkit) this).aClass101_Sub2_8074
	    .method932(1.0F, (float) i_135_, (float) i_135_, (byte) -75);
	((NativeToolkit) this).aClass101_Sub2_8074.method891(i, i_134_, 0);
	method3915(0);
	method3926((byte) 75, false);
	method3925(23, anInterface5_Impl1_8201, 0);
	method3862(0, aClass130_8190);
	method3899(256, 0, FileRequest.aClass21_9661, true);
	method3926((byte) 41, true);
	method3885(0, true, Class342.aClass70_4247);
	method3849((byte) 47, 0, Class342.aClass70_4247);
    }
    
    final int i() {
	anInt8021++;
	return ((NativeToolkit) this).anInt8095;
    }
    
    abstract Object method3876(int i, Canvas canvas);
    
    final void la() {
	((NativeToolkit) this).anInt8183 = ((NativeToolkit) this).anInt7931;
	((NativeToolkit) this).anInt8096 = ((NativeToolkit) this).anInt7962;
	anInt8037++;
	((NativeToolkit) this).anInt8165 = 0;
	((NativeToolkit) this).anInt8106 = 0;
	if (((NativeToolkit) this).aBoolean8209) {
	    ((NativeToolkit) this).aBoolean8209 = false;
	    method3921(1);
	}
	method3904(-95);
    }
    
    final int method3877(byte i) {
	if (i != -126)
	    return -10;
	anInt7973++;
	return ((NativeToolkit) this).anInt8175;
    }
    
    final void f(int i, int i_138_) {
	anInt7976++;
	if ((((NativeToolkit) this).anInt8095 ^ 0xffffffff) != (i ^ 0xffffffff)
	    || (i_138_ ^ 0xffffffff) != (((NativeToolkit) this).anInt8154
					 ^ 0xffffffff)) {
	    ((NativeToolkit) this).anInt8154 = i_138_;
	    ((NativeToolkit) this).anInt8095 = i;
	    method3831((byte) 19);
	    method3846((byte) 127);
	    method3856((byte) 57);
	}
    }
    
    final Class299 method3697(int i, int i_139_, int i_140_, int i_141_,
			      int i_142_, int i_143_) {
	anInt7892++;
	return new Class299_Sub2_Sub1(this, i, i_139_, i_140_, i_141_, i_142_,
				      i_143_);
    }
    
    private final boolean method3878(float f, int i, float f_144_,
				     float f_145_, float f_146_, float f_147_,
				     float f_148_) {
	if (i != 0)
	    return true;
	anInt8066++;
	Buffer buffer = anInterface5_Impl1_8203.method19(true, 26775);
	if (buffer == null)
	    return false;
	Stream stream = method3893(buffer, 9179);
	if (Stream.c()) {
	    stream.a(f_148_);
	    stream.a(f);
	    stream.a(f_145_);
	    stream.a(f_144_);
	    stream.a(f_146_);
	    stream.a(f_147_);
	} else {
	    stream.b(f_148_);
	    stream.b(f);
	    stream.b(f_145_);
	    stream.b(f_144_);
	    stream.b(f_146_);
	    stream.b(f_147_);
	}
	stream.a();
	return anInterface5_Impl1_8203.method18(i ^ 0x18bb);
    }
    
    final void method3879(int i) {
	if (((NativeToolkit) this).aClass251Array8113[((NativeToolkit) this).anInt8175]
	    != Class348_Sub42_Sub18.aClass251_9685) {
	    ((NativeToolkit) this).aClass251Array8113[((NativeToolkit) this).anInt8175]
		= Class348_Sub42_Sub18.aClass251_9685;
	    ((NativeToolkit) this).aClass101_Sub2Array8131
		[((NativeToolkit) this).anInt8175].method910();
	    method3905((byte) 95);
	}
	if (i == -8629)
	    anInt7896++;
    }
    
    final void ra(int i, int i_149_, int i_150_, int i_151_) {
	anInt8179 = i_150_;
	anInt8177 = i_151_;
	anInt8099 = i_149_;
	anInt8064++;
	((NativeToolkit) this).aBoolean8160 = true;
	anInt8162 = i;
    }
    
    abstract boolean method3880(Class68 class68, Class304 class304, byte i);
    
    abstract void method3881(Object object, byte i, Canvas canvas);
    
    void method3882(byte i) {
	if (i < 45)
	    ((NativeToolkit) this).aFloat8174 = -0.73899394F;
	anInt7982++;
	method3916((byte) 103);
    }
    
    abstract void method3883(int i);
    
    final void xa(float f) {
	if (((NativeToolkit) this).aFloat8093 != f) {
	    ((NativeToolkit) this).aFloat8093 = f;
	    ((NativeToolkit) this).aNativeInterface7924.setAmbient(f);
	    method3928(0);
	    method3884((byte) 101);
	}
	anInt7980++;
    }
    
    abstract void method3884(byte i);
    
    final boolean method3655() {
	anInt7913++;
	return true;
    }
    
    final void method3659(int i) {
	anInt7954++;
    }
    
    final boolean method3644() {
	anInt8054++;
	return true;
    }
    
    final void method3676(int i, int i_152_, int i_153_, int i_154_,
			  int i_155_, int i_156_, int i_157_, int i_158_,
			  int i_159_, int i_160_, int i_161_, int i_162_,
			  int i_163_) {
	anInt8032++;
    }
    
    final void method3885(int i, boolean bool, Class70 class70) {
	do {
	    try {
		method3829(class70, i, (byte) 80, false);
		anInt8041++;
		if (bool == true)
		    break;
		method3643(null, -42, 69);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("wga.IH(" + i + ',' + bool
						 + ','
						 + (class70 != null ? "{...}"
						    : "null")
						 + ')'));
	    }
	    break;
	} while (false);
    }
    
    static final void method3886(int i) {
	Class345.aClass60_4273.removeAll(0);
	if (i >= -58)
	    method3824(43, 63, -121, -1, 72, 77, -11, 22);
	anInt8018++;
    }
    
    final void clipDimensions(int i, int i_164_, int i_165_, int i_166_) {
	anInt8043++;
	boolean bool = false;
	if (((NativeToolkit) this).anInt8106 < i) {
	    bool = true;
	    ((NativeToolkit) this).anInt8106 = i;
	}
	if ((i_165_ ^ 0xffffffff)
	    > (((NativeToolkit) this).anInt8183 ^ 0xffffffff)) {
	    ((NativeToolkit) this).anInt8183 = i_165_;
	    bool = true;
	}
	if ((i_164_ ^ 0xffffffff)
	    < (((NativeToolkit) this).anInt8165 ^ 0xffffffff)) {
	    bool = true;
	    ((NativeToolkit) this).anInt8165 = i_164_;
	}
	if ((i_166_ ^ 0xffffffff)
	    > (((NativeToolkit) this).anInt8096 ^ 0xffffffff)) {
	    ((NativeToolkit) this).anInt8096 = i_166_;
	    bool = true;
	}
	if (bool) {
	    if (!((NativeToolkit) this).aBoolean8209) {
		((NativeToolkit) this).aBoolean8209 = true;
		method3921(1);
	    }
	    method3888(6259);
	    method3904(-128);
	}
    }
    
    final Class101_Sub2 method3887(byte i) {
	int i_167_ = 62 / ((i - -58) / 33);
	anInt7941++;
	return ((NativeToolkit) this).aClass101_Sub2_8083;
    }
    
    abstract void method3888(int i);
    
    final boolean method3682() {
	anInt8056++;
	return true;
    }
    
    abstract Interface5_Impl1 method3889(boolean bool, int i);
    
    final void method3890(boolean bool, byte i) {
	if (i <= 10)
	    ((NativeToolkit) this).aNativeHeapBuffer7974 = null;
	if (bool == !((NativeToolkit) this).aBoolean8164) {
	    ((NativeToolkit) this).aBoolean8164 = bool;
	    method3859(3);
	    anInt8100 &= ~0x1f;
	}
	anInt8072++;
    }
    
    final Interface18_Impl3 method3891(float[] fs, int i, int i_168_,
				       Class304 class304, int i_169_,
				       boolean bool) {
	try {
	    int i_170_ = 97 / ((i_169_ - -38) / 57);
	    anInt8052++;
	    return method3855(class304, i, 0, fs, bool, 0, 2, i_168_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.LI("
					     + (fs != null ? "{...}" : "null")
					     + ',' + i + ',' + i_168_ + ','
					     + (class304 != null ? "{...}"
						: "null")
					     + ',' + i_169_ + ',' + bool
					     + ')'));
	}
    }
    
    abstract void method3892(int i);
    
    final Stream method3893(Buffer buffer, int i) {
	try {
	    anInt8048++;
	    aStream8088.a(buffer);
	    if (i != 9179)
		((NativeToolkit) this).aFloat8093 = -1.2765714F;
	    return aStream8088;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.FI("
					     + (buffer != null ? "{...}"
						: "null")
					     + ',' + i + ')'));
	}
    }
    
    final void EA(int i, int i_171_, int i_172_, int i_173_) {
	anInt7909++;
	if (!((NativeToolkit) this).aBoolean8160)
	    throw new RuntimeException("");
	anInt8179 = i_172_;
	anInt8162 = i;
	anInt8177 = i_173_;
	anInt8099 = i_171_;
	if (aBoolean8153) {
	    aClass367Array8139[3].method3528(102);
	    aClass367Array8139[3].method3522(-16252);
	}
    }
    
    final void method3632(int[] is) {
	try {
	    is[1] = ((NativeToolkit) this).anInt7962;
	    is[0] = ((NativeToolkit) this).anInt7931;
	    anInt8076++;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "wga.KE(" + (is != null ? "{...}"
							 : "null") + ')');
	}
    }
    
    final void method3653(Class299 class299) {
	try {
	    aClass299_Sub2_8171 = (Class299_Sub2) class299;
	    anInt7950++;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "wga.DF(" + (class299 != null
							 ? "{...}"
							 : "null") + ')');
	}
    }
    
    final void method3894(int i, int i_174_) {
	if ((((NativeToolkit) this).anInt8119 ^ 0xffffffff)
	    != (i_174_ ^ 0xffffffff)) {
	    ((NativeToolkit) this).anInt8119 = i_174_;
	    method3945(-120);
	}
	if (i != -28186)
	    ((NativeToolkit) this).aFloat8186 = 0.24125333F;
	anInt7998++;
    }
    
    final void L(int i, int i_175_, int i_176_) {
	anInt8078++;
	if ((((NativeToolkit) this).anInt8144 ^ 0xffffffff) != (i ^ 0xffffffff)
	    || ((NativeToolkit) this).anInt8091 != i_175_
	    || (((NativeToolkit) this).anInt8105 ^ 0xffffffff) != (i_176_
							     ^ 0xffffffff)) {
	    ((NativeToolkit) this).anInt8144 = i;
	    ((NativeToolkit) this).anInt8105 = i_176_;
	    ((NativeToolkit) this).anInt8091 = i_175_;
	    method3856((byte) 119);
	    method3827((byte) -72);
	}
    }
    
    private final void method3895(int i) {
	anInt8035++;
	if (i != -8)
	    method3644();
	if (Class180.aClass196_2372 != ((NativeToolkit) this).aClass196_8184) {
	    Class196 class196 = ((NativeToolkit) this).aClass196_8184;
	    ((NativeToolkit) this).aClass196_8184 = Class180.aClass196_2372;
	    if (!class196.method1450(-90))
		method3913((byte) 60);
	    method3906((byte) 118);
	    ((NativeToolkit) this).aFloatArray8135 = aFloatArray8152;
	    method3929(true);
	    anInt8100 &= ~0x7;
	}
    }
    
    static final void setHuffman(Huffman class296, byte i) {
	do {
	    try {
		anInt8028++;
		AnimatableToolkit.huffman = class296;
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("wga.DI("
						 + (class296 != null ? "{...}"
						    : "null")
						 + ',' + i + ')'));
	    }
	    break;
	} while (false);
    }
    
    final void method3897(int i, int i_177_) {
	if (i != ((NativeToolkit) this).anInt8175) {
	    ((NativeToolkit) this).anInt8175 = i;
	    method3868(false);
	}
	if (i_177_ != -4382)
	    ((NativeToolkit) this).anInt8106 = 67;
	anInt7961++;
    }
    
    abstract void method3898(int i);
    
    final void method3630(boolean bool) {
	anInt8068++;
    }
    
    abstract void method3899(int i, int i_178_, Class21 class21, boolean bool);
    
    final void DA(int i, int i_179_, int i_180_, int i_181_) {
	((NativeToolkit) this).anInt8130 = i_179_;
	((NativeToolkit) this).anInt8134 = i_181_;
	anInt8009++;
	((NativeToolkit) this).anInt8094 = i;
	((NativeToolkit) this).anInt8129 = i_180_;
	method3846((byte) 127);
	method3831((byte) 19);
	method3932((byte) -118);
	method3904(-82);
    }
    
    abstract Interface18_Impl2 method3900(int[][] is, boolean bool, int i,
					  int i_182_);
    
    abstract void method3901(byte i);
    
    final void method3902(byte i) {
	anInt7946++;
	if (i != -42)
	    method3711(null, -98, 55, 15, 73, false);
	Hashtable hashtable = new Hashtable();
	if (aHashtable8014 != null && !aHashtable8014.isEmpty()) {
	    Enumeration enumeration = aHashtable8014.keys();
	    while (enumeration.hasMoreElements()) {
		Canvas canvas = (Canvas) enumeration.nextElement();
		hashtable.put(canvas, method3876(-1, canvas));
	    }
	}
	aHashtable8014 = hashtable;
	method3828(false);
	method3816((byte) -87);
	method3914((byte) -107);
	aClass280_8136.method2100((byte) 124, this);
    }
    
    private final void method3903(boolean bool) {
	if ((anInt8100 ^ 0xffffffff) != -2) {
	    method3845((byte) 24);
	    method3838(true, false);
	    method3866(false, true);
	    method3890(false, (byte) 55);
	    method3946(-32, false);
	    method3814(false, false, -2, (byte) 112);
	    method3923(!bool, 1);
	    method3850((byte) -47, ((NativeToolkit) this).anInterface18_8147);
	    anInt8100 = 1;
	}
	if (bool != false)
	    EA(-102, -47, -121, -51);
	anInt7981++;
    }
    
    final int r(int i, int i_183_, int i_184_, int i_185_, int i_186_,
		int i_187_, int i_188_) {
	anInt7960++;
	int i_189_ = 0;
	float f
	    = ((((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
		.aFloat5724)
	       + ((((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
		   .aFloat5691) * (float) i_183_
		  + ((float) i
		     * (((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
			.aFloat5736))
		  + ((float) i_184_
		     * (((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
			.aFloat5716))));
	float f_190_
	    = ((((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
		.aFloat5736) * (float) i_185_
	       + (((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
		  .aFloat5691) * (float) i_186_
	       + (((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
		  .aFloat5716) * (float) i_187_
	       + (((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
		  .aFloat5724));
	if (!((float) ((NativeToolkit) this).anInt8095 > f)
	    || !(f_190_ < (float) ((NativeToolkit) this).anInt8095)) {
	    if ((float) ((NativeToolkit) this).anInt8154 < f
		&& (float) ((NativeToolkit) this).anInt8154 < f_190_)
		i_189_ |= 0x20;
	} else
	    i_189_ |= 0x10;
	int i_191_
	    = (int) (((float) i_183_ * (((Class101_Sub2)
					 ((NativeToolkit) this).aClass101_Sub2_8080)
					.aFloat5700)
		      + (float) i * (((Class101_Sub2)
				      ((NativeToolkit) this).aClass101_Sub2_8080)
				     .aFloat5711)
		      + ((float) i_184_
			 * ((Class101_Sub2)
			    ((NativeToolkit) this).aClass101_Sub2_8080).aFloat5704)
		      + (((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
			 .aFloat5729))
		     * (float) ((NativeToolkit) this).anInt8129 / (float) i_188_);
	int i_192_
	    = (int) ((float) ((NativeToolkit) this).anInt8129
		     * ((((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
			 .aFloat5729)
			+ ((float) i_185_ * ((Class101_Sub2)
					     (((NativeToolkit) this)
					      .aClass101_Sub2_8080)).aFloat5711
			   + ((float) i_186_
			      * (((Class101_Sub2)
				  ((NativeToolkit) this).aClass101_Sub2_8080)
				 .aFloat5700))
			   + ((float) i_187_
			      * (((Class101_Sub2)
				  ((NativeToolkit) this).aClass101_Sub2_8080)
				 .aFloat5704))))
		     / (float) i_188_);
	if (((NativeToolkit) this).aFloat8126 > (float) i_191_
	    && (float) i_192_ < ((NativeToolkit) this).aFloat8126)
	    i_189_ |= 0x1;
	else if (((NativeToolkit) this).aFloat8158 < (float) i_191_
		 && (float) i_192_ > ((NativeToolkit) this).aFloat8158)
	    i_189_ |= 0x2;
	int i_193_
	    = (int) ((float) ((NativeToolkit) this).anInt8134
		     * ((((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
			 .aFloat5710)
			+ ((((Class101_Sub2)
			     ((NativeToolkit) this).aClass101_Sub2_8080).aFloat5732
			    * (float) i_184_)
			   + ((((Class101_Sub2)
				((NativeToolkit) this).aClass101_Sub2_8080)
			       .aFloat5708) * (float) i
			      + (((Class101_Sub2)
				  ((NativeToolkit) this).aClass101_Sub2_8080)
				 .aFloat5722) * (float) i_183_)))
		     / (float) i_188_);
	int i_194_
	    = (int) ((float) ((NativeToolkit) this).anInt8134
		     * ((((Class101_Sub2) ((NativeToolkit) this).aClass101_Sub2_8080)
			 .aFloat5732) * (float) i_187_
			+ ((float) i_185_ * ((Class101_Sub2)
					     (((NativeToolkit) this)
					      .aClass101_Sub2_8080)).aFloat5708
			   + ((float) i_186_
			      * (((Class101_Sub2)
				  ((NativeToolkit) this).aClass101_Sub2_8080)
				 .aFloat5722)))
			+ ((Class101_Sub2)
			   ((NativeToolkit) this).aClass101_Sub2_8080).aFloat5710)
		     / (float) i_188_);
	if (!((float) i_193_ < ((NativeToolkit) this).aFloat8103)
	    || !(((NativeToolkit) this).aFloat8103 > (float) i_194_)) {
	    if (((NativeToolkit) this).aFloat8185 < (float) i_193_
		&& ((NativeToolkit) this).aFloat8185 < (float) i_194_)
		i_189_ |= 0x8;
	} else
	    i_189_ |= 0x4;
	return i_189_;
    }
    
    private final void method3904(int i) {
	anInt7885++;
	if (i > -50)
	    anInt8001 = 12;
	((NativeToolkit) this).aFloat8103 = (float) (((NativeToolkit) this).anInt8165
					       - ((NativeToolkit) this).anInt8130);
	((NativeToolkit) this).aFloat8126 = (float) (((NativeToolkit) this).anInt8106
					       + -((NativeToolkit) this).anInt8094);
	((NativeToolkit) this).aFloat8185 = (float) (((NativeToolkit) this).anInt8096
					       + -((NativeToolkit) this).anInt8130);
	((NativeToolkit) this).aFloat8158 = (float) (-((NativeToolkit) this).anInt8094
					       + ((NativeToolkit) this).anInt8183);
    }
    
    private final void method3905(byte i) {
	method3940(1);
	if (i < 80)
	    aClass262_7927 = null;
	anInt8047++;
	if (aClass367_8143 != null)
	    aClass367_8143.method3532(10425);
    }
    
    final void method3643(Canvas canvas, int i, int i_195_) {
	do {
	    try {
		anInt7955++;
		if (canvas == ((NativeToolkit) this).aCanvas7925)
		    throw new RuntimeException();
		if (aHashtable8014.containsKey(canvas))
		    break;
		if (!canvas.isShowing())
		    throw new RuntimeException();
		try {
		    Class var_class = Class.forName("java.awt.Canvas");
		    Method method
			= var_class.getMethod("setIgnoreRepaint",
					      new Class[] { Boolean.TYPE });
		    method.invoke(canvas, new Object[] { Boolean.TRUE });
		} catch (Exception exception) {
		    /* empty */
		}
		Object object = method3876(-1, canvas);
		if (object == null)
		    throw new RuntimeException();
		aHashtable8014.put(canvas, object);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("wga.VF("
						 + (canvas != null ? "{...}"
						    : "null")
						 + ',' + i + ',' + i_195_
						 + ')'));
	    }
	    break;
	} while (false);
    }
    
    final int method3704() {
	anInt7935++;
	return -2 + ((NativeToolkit) this).anInt8138;
    }
    
    private final void method3906(byte i) {
	if (i < 81)
	    method3840(-113, false);
	if (!aBoolean8097) {
	    float[] fs = aFloatArray8152;
	    float f = ((float) (((NativeToolkit) this).anInt8095
				* -((NativeToolkit) this).anInt8094)
		       / (float) ((NativeToolkit) this).anInt8129);
	    float f_196_ = ((float) (((NativeToolkit) this).anInt8095
				     * (((NativeToolkit) this).anInt7931
					+ -((NativeToolkit) this).anInt8094))
			    / (float) ((NativeToolkit) this).anInt8129);
	    float f_197_ = ((float) (((NativeToolkit) this).anInt8095
				     * ((NativeToolkit) this).anInt8130)
			    / (float) ((NativeToolkit) this).anInt8134);
	    float f_198_ = ((float) (((NativeToolkit) this).anInt8095
				     * (-((NativeToolkit) this).anInt7962
					+ ((NativeToolkit) this).anInt8130))
			    / (float) ((NativeToolkit) this).anInt8134);
	    if (f == f_196_ || f_197_ == f_198_) {
		fs[12] = 0.0F;
		fs[0] = 1.0F;
		fs[13] = 0.0F;
		fs[4] = 0.0F;
		fs[3] = 0.0F;
		fs[10] = 1.0F;
		fs[15] = 1.0F;
		fs[9] = 0.0F;
		fs[14] = 0.0F;
		fs[1] = 0.0F;
		fs[2] = 0.0F;
		fs[11] = 0.0F;
		fs[6] = 0.0F;
		fs[7] = 0.0F;
		fs[8] = 0.0F;
		fs[5] = 1.0F;
	    } else {
		float f_199_ = 2.0F * (float) ((NativeToolkit) this).anInt8095;
		fs[13] = 0.0F;
		fs[3] = 0.0F;
		fs[2] = 0.0F;
		fs[11] = -1.0F;
		fs[7] = 0.0F;
		fs[5] = f_199_ / (-f_198_ + f_197_);
		fs[1] = 0.0F;
		fs[12] = 0.0F;
		fs[14] = aFloat8128
		    = ((float) (((NativeToolkit) this).anInt8154
				* ((NativeToolkit) this).anInt8095)
		       / (float) (((NativeToolkit) this).anInt8095
				  - ((NativeToolkit) this).anInt8154));
		fs[0] = f_199_ / (-f + f_196_);
		fs[15] = 0.0F;
		fs[8] = (f_196_ + f) / (-f + f_196_);
		fs[9] = (f_197_ + f_198_) / (f_197_ - f_198_);
		fs[10] = aFloat8166
		    = ((float) ((NativeToolkit) this).anInt8154
		       / (float) (-((NativeToolkit) this).anInt8154
				  + ((NativeToolkit) this).anInt8095));
		fs[4] = 0.0F;
		fs[6] = 0.0F;
	    }
	    method3912(-1568);
	    aBoolean8097 = true;
	}
	anInt7943++;
    }
    
    private final void method3907(boolean bool) {
	anInt7888++;
	method3925(-128, anInterface5_Impl1_8203, 0);
	method3862(0, aClass130_8205);
	method3899(1, 0, Class249.aClass21_3217, bool);
    }
    
    final int[] Y() {
	anInt7886++;
	return (new int[]
		{ ((NativeToolkit) this).anInt8094, ((NativeToolkit) this).anInt8130,
		  ((NativeToolkit) this).anInt8129, ((NativeToolkit) this).anInt8134 });
    }
    
    private final void method3908(byte i) {
	if (i < 2)
	    method3949((byte) 23);
	anInt8070++;
	((NativeToolkit) this).aFloat8089 = (float) ((NativeToolkit) this).anInt8154;
    }
    
    final void method3688(int i, int i_200_, int i_201_, int i_202_,
			  int i_203_, int i_204_, int i_205_) {
	anInt7942++;
    }
    
    final RasterToolkit createRaster(int i, int i_206_, int i_207_, int i_208_,
			      boolean bool) {
	anInt7993++;
	NativeRaster class105_sub1
	    = new NativeRaster(this, i_207_, i_208_, bool);
	class105_sub1.method979(0, 0, i_207_, i_208_, i, i_206_);
	return class105_sub1;
    }
    
    final void method3909(byte i, int i_209_) {
	method3894(-28186,
		   i | (i << 374072168 | (i << -578597712 | i << 645072952)));
	anInt7996++;
	if (i_209_ > -103)
	    method3887((byte) 51);
    }
    
    abstract void method3910(byte i, int i_210_);
    
    final void method3685(Class98 class98, int i) {
	try {
	    aClass280_8136.method2101(this, class98, i, 0);
	    anInt7968++;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.FG("
					     + (class98 != null ? "{...}"
						: "null")
					     + ',' + i + ')'));
	}
    }
    
    final RasterToolkit method3691(Sprite class207, boolean bool) {
	try {
	    anInt7978++;
	    RasterToolkit class105;
	    if ((((Sprite) class207).indexWidth ^ 0xffffffff) == -1
		|| ((Sprite) class207).indexHeight == 0)
		class105 = this.method3662(1, new int[1], (byte) 94, 0, 1, 1);
	    else {
		int[] is = new int[(((Sprite) class207).indexWidth
				    * ((Sprite) class207).indexHeight)];
		int i = 0;
		int i_211_ = 0;
		if (((Sprite) class207).alphaIndex == null) {
		    for (int i_212_ = 0;
			 ((((Sprite) class207).indexHeight ^ 0xffffffff)
			  < (i_212_ ^ 0xffffffff));
			 i_212_++) {
			for (int i_213_ = 0;
			     i_213_ < ((Sprite) class207).indexWidth;
			     i_213_++) {
			    int i_214_ = (((Sprite) class207).colors
					  [0xff & (((Sprite) class207)
						   .colorIndex[i++])]);
			    is[i_211_++]
				= (i_214_ != 0
				   ? Class273.method2057(i_214_, -16777216)
				   : 0);
			}
		    }
		} else {
		    for (int i_215_ = 0;
			 i_215_ < ((Sprite) class207).indexHeight; i_215_++) {
			for (int i_216_ = 0;
			     ((Sprite) class207).indexWidth > i_216_;
			     i_216_++) {
			    is[i_211_++]
				= (Class273.method2057
				   ((((Sprite) class207).colors
				     [Class139.method1166((((Sprite)
							    class207)
							   .colorIndex[i]),
							  255)]),
				    (((Sprite) class207).alphaIndex[i]
				     << 109322168)));
			    i++;
			}
		    }
		}
		class105 = this.method3662(((Sprite) class207).indexWidth, is,
					   (byte) 94, 0,
					   ((Sprite) class207).indexWidth,
					   ((Sprite) class207).indexHeight);
	    }
	    class105.method985(((Sprite) class207).widthOffset,
			       ((Sprite) class207).heightOffset,
			       ((Sprite) class207).widthPadding,
			       ((Sprite) class207).heightPadding);
	    return class105;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.GF("
					     + (class207 != null ? "{...}"
						: "null")
					     + ',' + bool + ')'));
	}
    }
    
    final void method3636(int i, int i_217_, int i_218_, int i_219_,
			  int i_220_, int i_221_, aa var_aa, int i_222_,
			  int i_223_) {
	try {
	    anInt7918++;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.ME(" + i + ',' + i_217_ + ','
					     + i_218_ + ',' + i_219_ + ','
					     + i_220_ + ',' + i_221_ + ','
					     + (var_aa != null ? "{...}"
						: "null")
					     + ',' + i_222_ + ',' + i_223_
					     + ')'));
	}
    }
    
    final void method3663() {
	anInt7887++;
	if (aClass372_8137 != null)
	    aClass372_8137.method3585(7271);
    }
    
    abstract void method3911(Canvas canvas, int i, Object object);
    
    final Class101 method3654() {
	anInt8060++;
	return new Class101_Sub2();
    }
    
    private final void method3912(int i) {
	aFloatArray8152[14] = aFloat8128;
	anInt8022++;
	if (i == -1568) {
	    aFloatArray8152[10] = aFloat8166;
	    ((NativeToolkit) this).aFloat8169
		= ((aFloatArray8152[14] - (float) ((NativeToolkit) this).anInt8154)
		   / aFloatArray8152[10]);
	}
    }
    
    private final void method3913(byte i) {
	int i_224_ = -106 / ((-8 - i) / 33);
	anInt8058++;
	aBoolean8121 = false;
	if (aClass367_8143 != null)
	    aClass367_8143.method3531(false);
	method3898(12);
    }
    
    private final void method3914(byte i) {
	anInt7922++;
	anInterface5_Impl1_8201 = method3889(false, 16711680);
	if (i <= -97) {
	    anInterface5_Impl1_8201.method20(3096, (byte) 126, 12);
	    for (int i_225_ = 0; i_225_ < 4; i_225_++) {
		Buffer buffer = anInterface5_Impl1_8201.method19(true, 26775);
		if (buffer != null) {
		    Stream stream = method3893(buffer, 9179);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    for (int i_226_ = 0; i_226_ <= 256; i_226_++) {
			double d = (3.141592653589793 * (double) (i_226_ * 2)
				    / 256.0);
			float f = (float) Math.cos(d);
			float f_227_ = (float) Math.sin(d);
			if (!Stream.c()) {
			    stream.b(f_227_);
			    stream.b(f);
			    stream.b(0.0F);
			} else {
			    stream.a(f_227_);
			    stream.a(f);
			    stream.a(0.0F);
			}
		    }
		    stream.a();
		    if (anInterface5_Impl1_8201.method18(6331))
			break;
		}
	    }
	    aClass130_8190
		= method3812(0, (new Class58[]
				 { new Class58(Class325.aClass325_4073) }));
	}
    }
    
    final void method3915(int i) {
	((NativeToolkit) this).aBoolean8069 = false;
	anInt7964++;
	method3836(1);
	if (i != 0)
	    aFloatArray8142 = null;
    }
    
    private final void method3916(byte i) {
	anInt8075++;
	method3928(0);
	method3842(true);
	method3883(106);
	method3823((byte) 53);
	if (i != 103)
	    method3840(-124, true);
	method3892(0);
	method3884((byte) 101);
	method3818(true);
	method3859(i + -100);
	method3841((byte) -116);
	method3827((byte) -117);
	method3851(25644);
	method3947(4);
	method3950(0);
	method3939((byte) 100);
	for (int i_228_ = ((NativeToolkit) this).anInt8090 + -1;
	     (i_228_ ^ 0xffffffff) <= -1; i_228_--) {
	    method3897(i_228_, i ^ ~0x117a);
	    method3920(i ^ 0x6d);
	    method3935(-101);
	    method3879(i + -8732);
	}
	method3945(-127);
	method3937((byte) -33);
	method3813(true);
	method3901((byte) -102);
	method3898(12);
    }
    
    private final void method3917(boolean bool) {
	if (aCanvas7910 == null)
	    anInt7958 = anInt7987 = 1;
	else {
	    Dimension dimension = aCanvas7910.getSize();
	    anInt7987 = dimension.height;
	    anInt7958 = dimension.width;
	}
	if (bool != false)
	    aHashtable8014 = null;
	anInt8033++;
	((NativeToolkit) this).anInt7962 = anInt7987;
	((NativeToolkit) this).anInt7931 = anInt7958;
	method3918(1);
	method3831((byte) 19);
	method3846((byte) 126);
	method3937((byte) -33);
	method3904(-71);
	method3932((byte) -126);
	la();
    }
    
    private final void method3918(int i) {
	anInt7904++;
	if (i != 1)
	    aStream8088 = null;
	aBoolean8127 = false;
	if (Class148.aClass196_2042 == ((NativeToolkit) this).aClass196_8184) {
	    method3919(i + 20793);
	    method3929(true);
	}
    }
    
    final void drawVerticalLine(int i, int i_229_, int i_230_, int i_231_, int i_232_) {
	anInt8013++;
	method3709(i, i_229_, i, i_230_ + i_229_, i_231_, i_232_);
    }
    
    private final void method3919(int i) {
	if (i == 20794) {
	    if (!aBoolean8127) {
		float[] fs = aFloatArray8120;
		if ((((NativeToolkit) this).anInt7931 ^ 0xffffffff) != -1
		    && ((NativeToolkit) this).anInt7962 != 0) {
		    fs[9] = 0.0F;
		    fs[12] = -1.0F;
		    fs[2] = 0.0F;
		    fs[0] = 2.0F / (float) ((NativeToolkit) this).anInt7931;
		    fs[4] = 0.0F;
		    fs[15] = 1.0F;
		    fs[13] = 1.0F;
		    fs[6] = 0.0F;
		    fs[3] = 0.0F;
		    fs[10] = 0.5F;
		    fs[8] = 0.0F;
		    fs[1] = 0.0F;
		    fs[14] = 0.5F;
		    fs[7] = 0.0F;
		    fs[5] = -2.0F / (float) ((NativeToolkit) this).anInt7962;
		    fs[11] = 0.0F;
		} else {
		    fs[3] = 0.0F;
		    fs[12] = 0.0F;
		    fs[6] = 0.0F;
		    fs[9] = 0.0F;
		    fs[11] = 0.0F;
		    fs[15] = 1.0F;
		    fs[1] = 0.0F;
		    fs[8] = 0.0F;
		    fs[2] = 0.0F;
		    fs[14] = 0.0F;
		    fs[5] = 1.0F;
		    fs[13] = 0.0F;
		    fs[7] = 0.0F;
		    fs[10] = 1.0F;
		    fs[4] = 0.0F;
		    fs[0] = 1.0F;
		}
		aBoolean8127 = true;
	    }
	    anInt7970++;
	}
    }
    
    final void method3677(Canvas canvas) {
	try {
	    anObject8020 = null;
	    anInt7936++;
	    aCanvas7910 = null;
	    if (canvas != null && canvas != ((NativeToolkit) this).aCanvas7925) {
		if (aHashtable8014.containsKey(canvas)) {
		    anObject8020 = aHashtable8014.get(canvas);
		    aCanvas7910 = canvas;
		}
	    } else {
		anObject8020 = ((NativeToolkit) this).anObject7919;
		aCanvas7910 = ((NativeToolkit) this).aCanvas7925;
	    }
	    if (aCanvas7910 == null || anObject8020 == null)
		throw new RuntimeException();
	    method3881(anObject8020, (byte) 99, aCanvas7910);
	    method3917(false);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "wga.MF(" + (canvas != null
							 ? "{...}"
							 : "null") + ')');
	}
    }
    
    abstract void method3920(int i);
    
    abstract void method3921(int i);
    
    void method3646(int i) {
	if (aClass372_8137 != null)
	    aClass372_8137.method3586(-16130);
	anInt8059++;
	((NativeToolkit) this).anInt8146 = 0x7fffffff & i;
    }
    
    final void method3674(int i, int i_233_, int i_234_, int i_235_,
			  int i_236_, int i_237_, int i_238_, int i_239_,
			  int i_240_) {
	anInt8046++;
	float f = (float) i_234_ - (float) i;
	float f_241_ = (float) i_235_ - (float) i_233_;
	if (f != 0.0F || f_241_ != 0.0F) {
	    float f_242_ = (float) (1.0 / Math.sqrt((double) (f_241_ * f_241_
							      + f * f)));
	    f *= f_242_;
	    f_241_ *= f_242_;
	} else
	    f = 1.0F;
	method3903(false);
	method3894(-28186, i_236_);
	method3849((byte) 47, 0, Class348_Sub40_Sub39.aClass70_9485);
	method3885(0, true, Class348_Sub40_Sub39.aClass70_9485);
	method3817(94, i_237_);
	method3942(5);
	method3926((byte) 86, false);
	i_240_ %= i_238_ + i_239_;
	float f_243_ = (float) i_238_ * f;
	float f_244_ = (float) i_238_ * f_241_;
	float f_245_ = 0.0F;
	float f_246_ = 0.0F;
	float f_247_ = f_243_;
	float f_248_ = f_244_;
	if (i_238_ >= i_240_) {
	    f_248_ = (float) (-i_240_ + i_238_) * f_241_;
	    f_247_ = f * (float) (i_238_ + -i_240_);
	} else {
	    f_246_ = (float) (-i_240_ + (i_238_ - -i_239_)) * f_241_;
	    f_245_ = f * (float) (i_238_ + i_239_ - i_240_);
	}
	float f_249_ = (float) i + f_245_;
	float f_250_ = f_246_ + (float) i_233_;
	float f_251_ = (float) i_239_ * f;
	float f_252_ = f_241_ * (float) i_239_;
	for (;;) {
	    if ((i ^ 0xffffffff) > (i_234_ ^ 0xffffffff)) {
		if (f_249_ > (float) i_234_)
		    break;
		if ((float) i_234_ < f_249_ + f_247_)
		    f_247_ = (float) i_234_ - f_249_;
	    } else {
		if (f_249_ < (float) i_234_)
		    break;
		if ((float) i_234_ > f_249_ + f_247_)
		    f_247_ = (float) i_234_ - f_249_;
	    }
	    if (i_233_ < i_235_) {
		if ((float) i_235_ < f_250_)
		    break;
		if (f_248_ + f_250_ > (float) i_235_)
		    f_248_ = (float) i_235_ - f_250_;
	    } else {
		if (f_250_ < (float) i_235_)
		    break;
		if (f_248_ + f_250_ < (float) i_235_)
		    f_248_ = (float) i_235_ - f_250_;
	    }
	    if (!method3878(f_250_, 0, f_249_ + f_247_, 0.0F, f_250_ + f_248_,
			    0.0F, f_249_))
		return;
	    method3907(true);
	    f_250_ += f_252_ + f_248_;
	    f_249_ += f_251_ + f_247_;
	    f_247_ = f_243_;
	    f_248_ = f_244_;
	}
	method3926((byte) 88, true);
	method3885(0, true, Class342.aClass70_4247);
	method3849((byte) 47, 0, Class342.aClass70_4247);
    }
    
    final void pa() {
	anInt7947++;
	((NativeToolkit) this).aBoolean8160 = false;
    }
    
    final void method3922(boolean bool) {
	if (bool != false)
	    getAmountModels();
	anInt7911++;
	Enumeration enumeration = aHashtable8014.keys();
	while (enumeration.hasMoreElements()) {
	    Canvas canvas = (Canvas) enumeration.nextElement();
	    method3911(canvas, 1, aHashtable8014.get(canvas));
	}
	anInterface5_Impl1_8193.method21(23315);
	anInterface5_Impl1_8203.method21(23315);
	anInterface5_Impl1_8201.method21(23315);
	((NativeToolkit) this).aClass64_Sub2_8198.method664(-23755);
	((NativeToolkit) this).aClass64_Sub2_8194.method664(-23755);
	((NativeToolkit) this).aClass64_Sub2_8187.method664(-23755);
	((NativeToolkit) this).aClass64_Sub2_8199.method664(-23755);
	((NativeToolkit) this).aClass64_Sub2_8189.method664(-23755);
	aClass280_8136.method2105(-122);
	anInterface5_Impl2_8195.method21(23315);
    }
    
    final void method3923(boolean bool, int i) {
	if (i != 1) {
	    if ((i ^ 0xffffffff) != -1) {
		if ((i ^ 0xffffffff) == -3)
		    method3874(Class328_Sub3.aClass229_6519, 117,
			       OndemandWorker.aClass229_3196);
		else if (i == 3)
		    method3874(Class167.aClass229_2207, 111,
			       Class348_Sub23_Sub2.aClass229_9011);
		else if ((i ^ 0xffffffff) == -5)
		    method3874(Class348_Sub7.aClass229_6644, 126,
			       Class348_Sub7.aClass229_6644);
	    } else
		method3874(Class167.aClass229_2207, 120,
			   Class167.aClass229_2207);
	} else
	    method3874(Class328_Sub3.aClass229_6519, 127,
		       Class328_Sub3.aClass229_6519);
	anInt8034++;
	if (bool != true)
	    aFloatArray8152 = null;
    }
    
    abstract void method3924(boolean bool, boolean bool_253_, int i,
			     Class70 class70, boolean bool_254_);
    
    abstract void method3925(int i, Interface5_Impl1 interface5_impl1,
			     int i_255_);
    
    abstract void method3926(byte i, boolean bool);
    
    final void drawHorizontalLine(int i, int i_256_, int i_257_, int i_258_, int i_259_) {
	method3709(i, i_256_, i - -i_257_, i_256_, i_258_, i_259_);
	anInt7926++;
    }
    
    final void method3927(boolean bool) {
	if (anInt8100 != 4) {
	    method3845((byte) 49);
	    method3838(true, false);
	    method3866(false, bool);
	    method3890(false, (byte) 108);
	    method3946(-32, false);
	    method3814(false, false, -2, (byte) 35);
	    method3817(120, 1);
	    method3923(true, 0);
	    anInt8100 = 4;
	}
	if (bool != true)
	    ((NativeToolkit) this).aClass64_Sub2_8200 = null;
	anInt7986++;
    }
    
    abstract void method3928(int i);
    
    final void removeImageFetcher(Canvas canvas) {
	do {
	    try {
		anInt7906++;
		if (((NativeToolkit) this).aCanvas7925 == canvas)
		    throw new RuntimeException();
		if (!aHashtable8014.containsKey(canvas))
		    break;
		method3911(canvas, 1, aHashtable8014.get(canvas));
		aHashtable8014.remove(canvas);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						"wga.AG(" + (canvas != null
							     ? "{...}"
							     : "null") + ')');
	    }
	    break;
	} while (false);
    }
    
    final RasterToolkit method3711(int[] is, int i, int i_260_, int i_261_,
			      int i_262_, boolean bool) {
	try {
	    anInt7944++;
	    return new NativeRaster(this, i_261_, i_262_, is, i, i_260_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.BE("
					     + (is != null ? "{...}" : "null")
					     + ',' + i + ',' + i_260_ + ','
					     + i_261_ + ',' + i_262_ + ','
					     + bool + ')'));
	}
    }
    
    private final void method3929(boolean bool) {
	method3813(bool);
	anInt7949++;
	if (aClass367_8143 != null)
	    aClass367_8143.method3524(-14775);
    }
    
    final void method3930(byte i) {
	((NativeToolkit) this).aClass101_Sub2Array8131
	    = new Class101_Sub2[((NativeToolkit) this).anInt8090];
	anInterface18Array8098 = new Interface18[((NativeToolkit) this).anInt8090];
	((NativeToolkit) this).aClass229Array8086
	    = new Class229[((NativeToolkit) this).anInt8090];
	((NativeToolkit) this).aClass229Array8092
	    = new Class229[((NativeToolkit) this).anInt8090];
	((NativeToolkit) this).aClass251Array8113
	    = new Class251[((NativeToolkit) this).anInt8090];
	anInt7889++;
	for (int i_263_ = 0;
	     (i_263_ ^ 0xffffffff) > (((NativeToolkit) this).anInt8090 ^ 0xffffffff);
	     i_263_++) {
	    ((NativeToolkit) this).aClass229Array8092[i_263_]
		= Class167.aClass229_2207;
	    ((NativeToolkit) this).aClass229Array8086[i_263_]
		= Class167.aClass229_2207;
	    ((NativeToolkit) this).aClass251Array8113[i_263_]
		= Class348_Sub42_Sub18.aClass251_9685;
	    ((NativeToolkit) this).aClass101_Sub2Array8131[i_263_]
		= new Class101_Sub2();
	}
	((NativeToolkit) this).aClass348_Sub1Array8132
	    = new Class348_Sub1[-2 + ((NativeToolkit) this).anInt8138];
	((NativeToolkit) this).anInterface18_8147
	    = method3861(1, (byte) -84, 1, Class68.aClass68_1183,
			 Class108.aClass304_1662);
	method3651(new za_Sub2(262144));
	((NativeToolkit) this).aClass130_8204
	    = method3812(0, (new Class58[]
			     { new Class58(new Class325[]
					   { Class325.aClass325_4073,
					     Class325.aClass325_4078 }) }));
	((NativeToolkit) this).aClass130_8202
	    = method3812(i ^ 0x1a,
			 (new Class58[]
			  { new Class58(new Class325[]
					{ Class325.aClass325_4073,
					  Class325.aClass325_4076 }) }));
	((NativeToolkit) this).aClass130_8208
	    = method3812(0, (new Class58[]
			     { new Class58(Class325.aClass325_4073),
			       new Class58(Class325.aClass325_4076),
			       new Class58(Class325.aClass325_4078),
			       new Class58(Class325.aClass325_4075) }));
	((NativeToolkit) this).aClass130_8191
	    = method3812(0, (new Class58[]
			     { new Class58(Class325.aClass325_4073),
			       new Class58(Class325.aClass325_4076),
			       new Class58(Class325.aClass325_4078) }));
	((NativeToolkit) this).aClass64_Sub2_8206
	    = new Class64_Sub2(this, 0, 0, false, false);
	((NativeToolkit) this).aClass64_Sub2_8198
	    = new Class64_Sub2(this, 0, 0, true, true);
	((NativeToolkit) this).aClass64_Sub2_8192
	    = new Class64_Sub2(this, 0, 0, false, false);
	((NativeToolkit) this).aClass64_Sub2_8194
	    = new Class64_Sub2(this, 0, 0, true, true);
	((NativeToolkit) this).aClass64_Sub2_8200
	    = new Class64_Sub2(this, 0, 0, false, false);
	((NativeToolkit) this).aClass64_Sub2_8187
	    = new Class64_Sub2(this, 0, 0, true, true);
	((NativeToolkit) this).aClass64_Sub2_8188
	    = new Class64_Sub2(this, 0, 0, false, false);
	((NativeToolkit) this).aClass64_Sub2_8199
	    = new Class64_Sub2(this, 0, 0, true, true);
	((NativeToolkit) this).aClass64_Sub2_8207
	    = new Class64_Sub2(this, 0, 0, false, false);
	((NativeToolkit) this).aClass64_Sub2_8189
	    = new Class64_Sub2(this, 0, 0, true, true);
	aClass280_8136 = new Class280(this);
	anInterface5_Impl2_8195 = method3840(-28633, true);
	method3902((byte) -42);
	((NativeToolkit) this).aClass269_7937 = new Class269(this);
	aClass367Array8139[1] = method3832(1, (byte) -103);
	aClass367Array8139[2] = method3832(2, (byte) -65);
	aClass367Array8139[4] = method3832(4, (byte) -73);
	aClass367Array8139[5] = method3832(5, (byte) -101);
	if (i != 26)
	    ((NativeToolkit) this).aClass130_8204 = null;
	aClass367Array8139[6] = method3832(6, (byte) -60);
	aClass367Array8139[7] = method3832(7, (byte) -100);
	aClass367Array8139[3] = method3832(3, (byte) -63);
	aClass367Array8139[8] = method3832(8, (byte) -60);
	aClass367Array8139[9] = method3832(9, (byte) -78);
	if (!aClass367Array8139[2].method3530(-58))
	    aClass367Array8139[2] = method3832(0, (byte) -74);
	if (!aClass367Array8139[4].method3530(-74))
	    aClass367Array8139[4] = aClass367Array8139[2];
	if (!aClass367Array8139[8].method3530(-116))
	    aClass367Array8139[8] = aClass367Array8139[4];
	if (!aClass367Array8139[9].method3530(-104))
	    aClass367Array8139[9] = aClass367Array8139[8];
	method3882((byte) 52);
	la();
	this.method3673();
    }
    
    abstract boolean method3931(boolean bool, Class304 class304,
				Class68 class68);
    
    final void method3932(byte i) {
	if (((NativeToolkit) this).aClass196_8184 != Class219.aClass196_2864) {
	    Class196 class196 = ((NativeToolkit) this).aClass196_8184;
	    ((NativeToolkit) this).aClass196_8184 = Class219.aClass196_2864;
	    if (class196.method1450(-116))
		method3913((byte) -100);
	    anInt8100 &= ~0x1f;
	    ((NativeToolkit) this).aFloatArray8135 = aFloatArray8111;
	}
	anInt7977++;
	if (i > -106)
	    ((NativeToolkit) this).anInt8146 = 6;
    }
    
    final void H(int i, int i_264_, int i_265_, int[] is) {
	try {
	    anInt8012++;
	    float f
		= (((NativeToolkit) this).aClass101_Sub2_8080.method933
		   ((byte) -105, (float) i, (float) i_265_, (float) i_264_));
	    int i_266_;
	    int i_267_;
	    if (f < -0.0078125F || f > 0.0078125F) {
		i_267_
		    = (int) ((float) ((NativeToolkit) this).anInt8129
			     * (((NativeToolkit) this).aClass101_Sub2_8080.method929
				((float) i_265_, (float) i_264_, (byte) 45,
				 (float) i))
			     / f);
		i_266_
		    = (int) ((float) ((NativeToolkit) this).anInt8134
			     * (((NativeToolkit) this).aClass101_Sub2_8080.method922
				((byte) 64, (float) i, (float) i_265_,
				 (float) i_264_))
			     / f);
	    } else {
		i_266_ = ((NativeToolkit) this).anInt8130;
		i_267_ = ((NativeToolkit) this).anInt8094;
	    }
	    is[1] = (int) ((float) i_266_ - ((NativeToolkit) this).aFloat8103);
	    is[0] = (int) ((float) i_267_ - ((NativeToolkit) this).aFloat8126);
	    is[2] = (int) f;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.H(" + i + ',' + i_264_ + ','
					     + i_265_ + ','
					     + (is != null ? "{...}" : "null")
					     + ')'));
	}
    }
    
    final void method3933(int i) {
	anInt7956++;
	if (i >= -34)
	    aClass299_Sub2_8171 = null;
	method3860(FileRequest.aClass21_9661, 2, 8);
    }
    
    final void method3628(int i, int i_268_, int i_269_, int i_270_,
			  int i_271_, int i_272_) {
	anInt7971++;
	float f = method3858(false);
	method3903(false);
	method3894(-28186, i_271_);
	method3849((byte) 47, 0, Class348_Sub40_Sub39.aClass70_9485);
	method3885(0, true, Class348_Sub40_Sub39.aClass70_9485);
	method3817(89, i_272_);
	((NativeToolkit) this).aClass101_Sub2_8074.method932(1.0F,
						       (float) (-1 + i_270_),
						       (float) (i_269_ - 1),
						       (byte) -33);
	((NativeToolkit) this).aClass101_Sub2_8074
	    .method920(-f + (float) i_268_, false, 0.0F, (float) i - f);
	method3915(0);
	method3926((byte) 98, false);
	method3860(Class348_Sub5_Sub1.aClass21_8832, 4, 8);
	method3926((byte) 104, true);
	method3885(0, true, Class342.aClass70_4247);
	method3849((byte) 47, 0, Class342.aClass70_4247);
    }
    
    final Class101_Sub2 method3934(int i) {
	if (i > -69)
	    return null;
	anInt8055++;
	return ((NativeToolkit) this).aClass101_Sub2_8074;
    }
    
    abstract void method3935(int i);
    
    final int XA() {
	anInt7897++;
	return ((NativeToolkit) this).anInt8154;
    }
    
    final int OR(int i, int i_273_) {
	anInt8030++;
	return i_273_ | i;
    }
    
    static final void method3936(int i) {
	anInt7990++;
	if (Deque.aClass190ArrayArray3335 != null) {
	    for (int i_274_ = 0;
		 ((Deque.aClass190ArrayArray3335.length ^ 0xffffffff)
		  < (i_274_ ^ 0xffffffff));
		 i_274_++) {
		for (int i_275_ = 0;
		     ((i_275_ ^ 0xffffffff)
		      > (Deque.aClass190ArrayArray3335[i_274_].length
			 ^ 0xffffffff));
		     i_275_++)
		    Deque.aClass190ArrayArray3335[i_274_][i_275_]
			= GameText.aClass190_3547;
	    }
	}
	if (i != 0)
	    method3870(-90);
    }
    
    abstract void method3937(byte i);
    
    abstract void method3938(Class21 class21, int i,
			     Interface5_Impl2 interface5_impl2, int i_276_,
			     int i_277_, int i_278_, int i_279_);
    
    final int method3667(int i, int i_280_) {
	anInt7997++;
	return i_280_ & i ^ i_280_;
    }
    
    abstract void method3939(byte i);
    
    final AbstractFontRasterizer createFontRasterizer(BitmapFont class143, Sprite[] class207s,
			      boolean bool) {
	try {
	    anInt7952++;
	    return new Class324_Sub2(this, class143, class207s, bool);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.JE("
					     + (class143 != null ? "{...}"
						: "null")
					     + ','
					     + (class207s != null ? "{...}"
						: "null")
					     + ',' + bool + ')'));
	}
    }
    
    final void method3642(int i, Class348_Sub1[] class348_sub1s) {
	do {
	    try {
		for (int i_281_ = 0; i_281_ < i; i_281_++)
		    ((NativeToolkit) this).aClass348_Sub1Array8132[i_281_]
			= class348_sub1s[i_281_];
		anInt7988++;
		((NativeToolkit) this).anInt8151 = i;
		if (!((NativeToolkit) this).aClass196_8184.method1450(-94))
		    break;
		method3823((byte) 51);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("wga.FF(" + i + ','
						 + (class348_sub1s != null
						    ? "{...}" : "null")
						 + ')'));
	    }
	    break;
	} while (false);
    }
    
    final boolean method3627() {
	anInt8038++;
	return false;
    }
    
    final za method3702(int i) {
	anInt8049++;
	za_Sub2 var_za_Sub2 = new za_Sub2(i);
	aClass262_7927.addToFront(var_za_Sub2, -20180);
	return var_za_Sub2;
    }
    
    final int getAmountModels() {
	anInt7884++;
	return anInt8210;
    }
    
    abstract void method3940(int i);
    
    final int method3941(int i) {
	int i_282_ = -33 / ((55 - i) / 36);
	anInt7921++;
	return anInt8162;
    }
    
    final void method3942(int i) {
	if (i != 5)
	    anInt8045 = -47;
	anInt8008++;
	((NativeToolkit) this).aClass101_Sub2_8074.method910();
	((NativeToolkit) this).aBoolean8069 = true;
	method3836(1);
    }
    
    final Class348_Sub1 method3690(int i, int i_283_, int i_284_, int i_285_,
				   int i_286_, float f) {
	anInt7894++;
	return new Class348_Sub1_Sub3(i, i_283_, i_284_, i_285_, i_286_, f);
    }
    
    final void method3943(boolean bool, int i) {
	if (i != -31953)
	    aClass101_Sub2_8085 = null;
	anInt7899++;
	if (bool == !((NativeToolkit) this).aBoolean8149) {
	    ((NativeToolkit) this).aBoolean8149 = bool;
	    method3883(-90);
	}
    }
    
    final Interface18_Impl3 method3944(byte[] is, int i, Class304 class304,
				       int i_287_, boolean bool, int i_288_) {
	try {
	    if (i_287_ != 2)
		return null;
	    anInt7929++;
	    return method3843(i_288_, 0, i, 0, is, class304, i_287_ ^ 0x22,
			      bool);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wga.MG("
					     + (is != null ? "{...}" : "null")
					     + ',' + i + ','
					     + (class304 != null ? "{...}"
						: "null")
					     + ',' + i_287_ + ',' + bool + ','
					     + i_288_ + ')'));
	}
    }
    
    abstract void method3945(int i);
    
    final boolean method3693() {
	anInt7939++;
	return true;
    }
    
    NativeToolkit(Canvas canvas, Object object, d var_d, IndexLoader class45, int i,
	    int i_289_) {
	super(var_d);
	((NativeToolkit) this).aFloat8089 = 3584.0F;
	((NativeToolkit) this).anInt8095 = 50;
	((NativeToolkit) this).anInt8094 = 0;
	((NativeToolkit) this).aFloat8087 = 1.0F;
	aBoolean8112 = false;
	((NativeToolkit) this).anInt8096 = 0;
	((NativeToolkit) this).anInt8105 = 0;
	((NativeToolkit) this).anInt8129 = 512;
	((NativeToolkit) this).aBoolean8118 = false;
	anInt8108 = 0;
	((NativeToolkit) this).anInt8091 = -1;
	aBoolean8121 = false;
	((NativeToolkit) this).aBoolean8116 = true;
	((NativeToolkit) this).anInt8125 = 8;
	((NativeToolkit) this).aFloatArray8102
	    = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };
	aFloatArray8142 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
	aFloatArray8111
	    = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F,
			    0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };
	((NativeToolkit) this).anInt8130 = 0;
	aFloatArray8157 = new float[16];
	((NativeToolkit) this).aBoolean8110 = true;
	((NativeToolkit) this).anInt8109 = 0;
	aFloatArray8120 = new float[16];
	anInt8104 = -1;
	((NativeToolkit) this).aBoolean8124 = true;
	aBoolean8127 = false;
	anInt8156 = 0;
	aBoolean8153 = false;
	((NativeToolkit) this).anInt8144 = -1;
	((NativeToolkit) this).anInt8154 = 3584;
	((NativeToolkit) this).anInt8107 = 3;
	aClass367Array8139 = new Class367[10];
	((NativeToolkit) this).fontSize = 128;
	((NativeToolkit) this).anInt8134 = 512;
	((NativeToolkit) this).aBoolean8164 = false;
	aFloatArray8140 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
	((NativeToolkit) this).aFloat8169 = 3584.0F;
	((NativeToolkit) this).aBoolean8141 = true;
	((NativeToolkit) this).aClass173_8163 = Class348_Sub4.aClass173_6602;
	((NativeToolkit) this).aBoolean8148 = true;
	aBoolean8097 = false;
	((NativeToolkit) this).anInt8165 = 0;
	((NativeToolkit) this).aBoolean8145 = false;
	aFloatArray8152 = new float[16];
	aBoolean8176 = false;
	anInt8161 = 0;
	((NativeToolkit) this).anInt8106 = 0;
	((NativeToolkit) this).aBoolean8149 = false;
	aFloat8155 = 1.0F;
	((NativeToolkit) this).aFloatArray8135 = aFloatArray8111;
	anInt8167 = 1;
	anInt8179 = -1;
	((NativeToolkit) this).anInt8175 = 0;
	anInt8177 = 0;
	((NativeToolkit) this).aFloat8168 = 1.0F;
	((NativeToolkit) this).aFloat8174 = -1.0F;
	((NativeToolkit) this).aFloatArray8170
	    = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
	((NativeToolkit) this).anInt8181 = 0;
	((NativeToolkit) this).aClass196_8184 = Class219.aClass196_2864;
	((NativeToolkit) this).aFloat8180 = 1.0F;
	((NativeToolkit) this).aFloat8186 = -1.0F;
	anInt8172 = 16777215;
	((NativeToolkit) this).anInt8183 = 0;
	aStream8088 = new Stream();
	aClass101_Sub2_8196 = new Class101_Sub2();
	try {
	    try {
		((NativeToolkit) this).anInt8117 = i;
		((NativeToolkit) this).aClass45_8039 = class45;
		aCanvas7910 = ((NativeToolkit) this).aCanvas7925 = canvas;
		anObject8020 = ((NativeToolkit) this).anObject7919 = object;
		Dimension dimension = canvas.getSize();
		((NativeToolkit) this).anInt7962 = anInt7987 = dimension.height;
		((NativeToolkit) this).anInt7931 = anInt7958 = dimension.width;
		((NativeToolkit) this).anInt8178 = i_289_;
		Class59_Sub2_Sub1.method566(false, true, (byte) -127);
		if (((AbstractToolkit) this).aD4579 == null) {
		    ((NativeToolkit) this).aNativeInterface7924
			= new NativeInterface(0, ((NativeToolkit) this).anInt8178);
		    aClass372_8137 = null;
		} else {
		    aClass372_8137 = new Class372(this, ((AbstractToolkit) this).aD4579);
		    ((NativeToolkit) this).aNativeInterface7924
			= new NativeInterface(((AbstractToolkit) this).aD4579.method2(true),
					      ((NativeToolkit) this).anInt8178);
		    for (int i_290_ = 0;
			 ((AbstractToolkit) this).aD4579.method2(true) > i_290_; i_290_++) {
			TextureDefinition class12
			    = ((AbstractToolkit) this).aD4579.getTexture(i_290_, -6662);
			if (class12 != null)
			    ((NativeToolkit) this).aNativeInterface7924
				.initTextureMetrics
				(i_290_, ((TextureDefinition) class12).aByte201,
				 ((TextureDefinition) class12).aByte216);
		    }
		}
	    } catch (Throwable throwable) {
		throwable.printStackTrace();
		this.destroy();
		throw new RuntimeException("");
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("wga.<init>(" + (canvas != null ? "{...}" : "null")
			+ ',' + (object != null ? "{...}" : "null") + ','
			+ (var_d != null ? "{...}" : "null") + ','
			+ (class45 != null ? "{...}" : "null") + ',' + i + ','
			+ i_289_ + ')'));
	}
    }
    
    final void method3946(int i, boolean bool) {
	if (i != -32)
	    aClass101_Sub2_8085 = null;
	anInt8027++;
	if (!bool == ((NativeToolkit) this).aBoolean8118) {
	    ((NativeToolkit) this).aBoolean8118 = bool;
	    method3841((byte) -116);
	    anInt8100 &= ~0x1f;
	}
    }
    
    abstract void method3947(int i);
    
    final void method3684(Class98 class98) {
	try {
	    aClass280_8136.method2101(this, class98, -1, 0);
	    anInt7984++;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "wga.EF(" + (class98 != null
							 ? "{...}"
							 : "null") + ')');
	}
    }
    
    final Class101_Sub2 method3948(int i) {
	if (!aBoolean8121) {
	    aClass101_Sub2_8085.method927(((NativeToolkit) this).aClass101_Sub2_8083,
					  (((NativeToolkit) this)
					   .aClass101_Sub2_8074));
	    aBoolean8121 = true;
	}
	anInt8042++;
	if (i != -22036)
	    anInt8104 = 66;
	return aClass101_Sub2_8085;
    }
    
    private final void method3949(byte i) {
	anInt7895++;
	if (!aBoolean8112) {
	    float[] fs = aFloatArray8157;
	    float f = (float) ((NativeToolkit) this).anInt8095;
	    float f_291_ = (float) ((NativeToolkit) this).anInt8154;
	    float f_292_ = (aFloat8155 * (float) -((NativeToolkit) this).anInt8130
			    / (float) ((NativeToolkit) this).anInt8134);
	    float f_293_ = ((float) -((NativeToolkit) this).anInt8094 * aFloat8155
			    / (float) ((NativeToolkit) this).anInt8129);
	    float f_294_ = (aFloat8155
			    * (float) (-((NativeToolkit) this).anInt8094
				       + ((NativeToolkit) this).anInt7931)
			    / (float) ((NativeToolkit) this).anInt8129);
	    float f_295_ = ((float) (-((NativeToolkit) this).anInt8130
				     + ((NativeToolkit) this).anInt7962)
			    * aFloat8155 / (float) ((NativeToolkit) this).anInt8134);
	    if (f_294_ != f_293_ && f_292_ != f_295_) {
		fs[0] = 2.0F / (f_294_ - f_293_);
		fs[12] = (f_294_ + f_293_) / (f_293_ - f_294_);
		fs[6] = 0.0F;
		fs[3] = 0.0F;
		fs[11] = 0.0F;
		fs[8] = 0.0F;
		fs[14] = f / (f - f_291_);
		fs[1] = 0.0F;
		fs[4] = 0.0F;
		fs[2] = 0.0F;
		fs[9] = 0.0F;
		fs[13] = (f_292_ + f_295_) / (f_295_ - f_292_);
		fs[10] = 1.0F / (-f_291_ + f);
		fs[5] = 2.0F / (f_295_ - f_292_);
		fs[7] = 0.0F;
		fs[15] = 1.0F;
	    } else {
		fs[11] = 0.0F;
		fs[8] = 0.0F;
		fs[7] = 0.0F;
		fs[10] = 1.0F;
		fs[15] = 1.0F;
		fs[9] = 0.0F;
		fs[0] = 1.0F;
		fs[1] = 0.0F;
		fs[13] = 0.0F;
		fs[4] = 0.0F;
		fs[6] = 0.0F;
		fs[12] = 0.0F;
		fs[5] = 1.0F;
		fs[2] = 0.0F;
		fs[14] = 0.0F;
		fs[3] = 0.0F;
	    }
	    method3908((byte) 29);
	    aBoolean8112 = true;
	}
	if (i >= -37)
	    method3631(74);
    }
    
    abstract void method3950(int i);
    
    /*synthetic*/ static Class method3951(String string) {
	try {
	    return Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	anInt8001 = -1;
    }
}
