/* Class167 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class167
{
    private SoftwareToolkit softwareToolkit;
    int anInt2192;
    static int anInt2193;
    static int anInt2194;
    boolean aBoolean2195 = false;
    static IncomingPacket aClass114_2196 = new IncomingPacket(111, -1);
    int anInt2197;
    Runnable runnable;
    static int anInt2199;
    static int anInt2200;
    boolean aBoolean2201;
    boolean aBoolean2202;
    static float aFloat2203;
    static int anInt2204 = 0;
    int anInt2205;
    static int anInt2206;
    static Class229 aClass229_2207 = new Class229();
    static IndexLoader nativeLibIndexLoader;
    Class101_Sub1 aClass101_Sub1_2209;
    int anInt2210;
    int anInt2211;
    int[] anIntArray2212;
    int[] anIntArray2213;
    int[] anIntArray2214;
    int anInt2215;
    int[] anIntArray2216;
    int[] anIntArray2217;
    int[] anIntArray2218;
    Class64_Sub1 aClass64_Sub1_2219;
    Class109 aClass109_2220;
    int anInt2221;
    int[] anIntArray2222;
    Class64_Sub1 aClass64_Sub1_2223;
    Class64_Sub1 aClass64_Sub1_2224;
    Class64_Sub1 aClass64_Sub1_2225;
    float[] aFloatArray2226;
    Class64_Sub1 aClass64_Sub1_2227;
    int[] anIntArray2228;
    int anInt2229;
    int[] anIntArray2230;
    Class64_Sub1 aClass64_Sub1_2231;
    int[] anIntArray2232;
    Class64_Sub1 aClass64_Sub1_2233;
    int[] anIntArray2234;
    int[] anIntArray2235;
    int[] anIntArray2236;
    int[] anIntArray2237;
    int[] anIntArray2238;
    Class64_Sub1 aClass64_Sub1_2239;
    int[] anIntArray2240;
    int[] anIntArray2241;
    int[] anIntArray2242;
    Class64_Sub1 aClass64_Sub1_2243;
    int[] anIntArray2244;
    int[] anIntArray2245;
    Class64_Sub1 aClass64_Sub1_2246;
    int[] anIntArray2247;
    
    final void method1291(int i, Runnable runnable) {
	if (i == 10000) {
	    ((Class167) this).runnable = runnable;
	    anInt2193++;
	}
    }
    
    final void method1292(int i) {
	if (i == 64) {
	    anInt2194++;
	    ((Class167) this).aClass109_2220
		= new Class109(softwareToolkit, this);
	}
    }
    
    public static void method1293(int i) {
	aClass114_2196 = null;
	nativeLibIndexLoader = null;
	aClass229_2207 = null;
	if (i != 1)
	    method1295(null, -117, -102);
    }
    
    static final boolean method1294(byte i, byte[] is) {
	anInt2199++;
	ByteBuffer class348_sub49 = new ByteBuffer(is);
	int i_0_ = class348_sub49.getUByte();
	if (i_0_ != 2)
	    return false;
	boolean bool = (class348_sub49.getUByte() ^ 0xffffffff) == -2;
	if (bool)
	    Class59_Sub2_Sub2.parseLobbyWorldList(class348_sub49);
	Class348_Sub42_Sub6.method3188((byte) -67, class348_sub49);
	return true;
    }
    
    static final void method1295(Class318_Sub1[] class318_sub1s, int i,
				 int i_1_) {
	if (i < i_1_) {
	    int i_2_ = (i + i_1_) / 2;
	    int i_3_ = i;
	    Class318_Sub1 class318_sub1 = class318_sub1s[i_2_];
	    class318_sub1s[i_2_] = class318_sub1s[i_1_];
	    class318_sub1s[i_1_] = class318_sub1;
	    int i_4_ = ((Class318_Sub1) class318_sub1).anInt6389;
	    for (int i_5_ = i; i_5_ < i_1_; i_5_++) {
		if (((Class318_Sub1) class318_sub1s[i_5_]).anInt6389
		    < i_4_ + (i_5_ & 0x1)) {
		    Class318_Sub1 class318_sub1_6_ = class318_sub1s[i_5_];
		    class318_sub1s[i_5_] = class318_sub1s[i_3_];
		    class318_sub1s[i_3_++] = class318_sub1_6_;
		}
	    }
	    class318_sub1s[i_1_] = class318_sub1s[i_3_];
	    class318_sub1s[i_3_] = class318_sub1;
	    method1295(class318_sub1s, i, i_3_ - 1);
	    method1295(class318_sub1s, i_3_ + 1, i_1_);
	}
    }
    
    static final boolean method1296(boolean bool) {
	if (bool != true)
	    method1297((byte) 88, null, null, null, null);
	anInt2200++;
	if ((Class348_Sub43.anInt7068 ^ 0xffffffff) != -1)
	    return true;
	return Class98.aClass348_Sub16_Sub3_1564.method2860(120);
    }
    
    static final void method1297
	(byte i, Player class318_sub1_sub3_sub3_sub2,
	 int[] is, int[] is_7_, int[] is_8_) {
	try {
	    anInt2206++;
	    if (i > -96)
		aFloat2203 = 0.6824298F;
	    for (int i_9_ = 0;
		 (i_9_ ^ 0xffffffff) > (is_7_.length ^ 0xffffffff); i_9_++) {
		int i_10_ = is_7_[i_9_];
		int i_11_ = is[i_9_];
		int i_12_ = is_8_[i_9_];
		for (int i_13_ = 0;
		     i_11_ != 0 && i_13_ < (((Class318_Sub1_Sub3_Sub3)
					     class318_sub1_sub3_sub3_sub2)
					    .aClass182Array10308).length;
		     i_11_ >>>= 1) {
		    if ((i_11_ & 0x1) != 0) {
			if ((i_10_ ^ 0xffffffff) != 0) {
			    AnimationDefinition class17
				= Class10.animationLoader.method835(i_10_, 7);
			    int i_14_ = ((AnimationDefinition) class17).anInt248;
			    Class182 class182 = (((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3_sub2)
						 .aClass182Array10308[i_13_]);
			    if (class182 != null) {
				if ((i_10_ ^ 0xffffffff)
				    == (((Class182) class182).anInt2454
					^ 0xffffffff)) {
				    if ((i_14_ ^ 0xffffffff) == -1)
					class182
					    = ((Class318_Sub1_Sub3_Sub3)
					       class318_sub1_sub3_sub3_sub2)
						  .aClass182Array10308[i_13_]
					    = null;
				    else if ((i_14_ ^ 0xffffffff) != -2) {
					if (i_14_ == 2)
					    ((Class182) class182).anInt2445
						= 0;
				    } else {
					((Class182) class182).anInt2448
					    = i_12_;
					((Class182) class182).anInt2455 = 1;
					((Class182) class182).anInt2456 = 0;
					((Class182) class182).anInt2451 = 0;
					((Class182) class182).anInt2445 = 0;
					if (!((Class318_Sub1_Sub3_Sub3)
					      class318_sub1_sub3_sub3_sub2)
					     .aBoolean10309)
					    GametipDefinition.method2178
						(class318_sub1_sub3_sub3_sub2,
						 0, class17, -54);
				    }
				} else if (((AnimationDefinition) class17).anInt239
					   >= ((AnimationDefinition)
					       (Class10.animationLoader.method835
						((((Class182) class182)
						  .anInt2454),
						 7))).anInt239)
				    class182
					= ((Class318_Sub1_Sub3_Sub3)
					   class318_sub1_sub3_sub3_sub2)
					      .aClass182Array10308[i_13_]
					= null;
			    }
			    if (class182 == null) {
				class182
				    = ((Class318_Sub1_Sub3_Sub3)
				       class318_sub1_sub3_sub3_sub2)
					  .aClass182Array10308[i_13_]
				    = new Class182();
				((Class182) class182).anInt2445 = 0;
				((Class182) class182).anInt2455 = 1;
				((Class182) class182).anInt2448 = i_12_;
				((Class182) class182).anInt2456 = 0;
				((Class182) class182).anInt2454 = i_10_;
				((Class182) class182).anInt2451 = 0;
				if (!((Class318_Sub1_Sub3_Sub3)
				      class318_sub1_sub3_sub3_sub2)
				     .aBoolean10309)
				    GametipDefinition.method2178
					(class318_sub1_sub3_sub3_sub2, 0,
					 class17, -123);
			    }
			} else
			    ((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub2)
				.aClass182Array10308[i_13_]
				= null;
		    }
		    i_13_++;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("pga.G(" + i + ','
			+ (class318_sub1_sub3_sub3_sub2 != null ? "{...}"
			   : "null")
			+ ',' + (is != null ? "{...}" : "null") + ','
			+ (is_7_ != null ? "{...}" : "null") + ','
			+ (is_8_ != null ? "{...}" : "null") + ')'));
	}
    }
    
    Class167(SoftwareToolkit toolkit) {
	((Class167) this).anInt2192 = 0;
	((Class167) this).anInt2197 = 0;
	((Class167) this).anInt2205 = 0;
	((Class167) this).aBoolean2202 = true;
	((Class167) this).anInt2211 = 0;
	((Class167) this).aClass101_Sub1_2209 = new Class101_Sub1();
	((Class167) this).anIntArray2213 = new int[Class64_Sub1.anInt5350];
	((Class167) this).anIntArray2214 = new int[Class64_Sub1.anInt5350];
	((Class167) this).anIntArray2212 = new int[64];
	((Class167) this).aFloatArray2226 = new float[2];
	((Class167) this).anIntArray2216 = new int[10000];
	((Class167) this).anIntArray2222 = new int[Class64_Sub1.anInt5350];
	((Class167) this).anIntArray2232 = new int[64];
	((Class167) this).anIntArray2218 = new int[8];
	((Class167) this).anIntArray2237 = new int[Class64_Sub1.anInt5350];
	((Class167) this).anIntArray2236 = new int[10000];
	((Class167) this).anIntArray2230 = new int[Class64_Sub1.anInt5350];
	((Class167) this).anIntArray2240 = new int[10];
	((Class167) this).anIntArray2228 = new int[64];
	((Class167) this).anIntArray2238 = new int[10];
	((Class167) this).anIntArray2241 = new int[8];
	((Class167) this).anIntArray2235 = new int[10];
	((Class167) this).anIntArray2245 = new int[8];
	((Class167) this).anIntArray2217 = new int[64];
	((Class167) this).anIntArray2244 = new int[Class64_Sub1.anInt5350];
	((Class167) this).anIntArray2247 = new int[10];
	((Class167) this).anIntArray2234 = new int[Class64_Sub1.anInt5350];
	softwareToolkit = toolkit;
	((Class167) this).anInt2210 = ((SoftwareToolkit) softwareToolkit).anInt7494 + -255;
	((Class167) this).aClass109_2220 = new Class109(toolkit, this);
	((Class167) this).aClass64_Sub1_2243 = new Class64_Sub1(softwareToolkit);
	((Class167) this).aClass64_Sub1_2224 = new Class64_Sub1(softwareToolkit);
	((Class167) this).aClass64_Sub1_2219 = new Class64_Sub1(softwareToolkit);
	((Class167) this).aClass64_Sub1_2239 = new Class64_Sub1(softwareToolkit);
	((Class167) this).aClass64_Sub1_2233 = new Class64_Sub1(softwareToolkit);
	((Class167) this).aClass64_Sub1_2231 = new Class64_Sub1(softwareToolkit);
	((Class167) this).aClass64_Sub1_2223 = new Class64_Sub1(softwareToolkit);
	((Class167) this).aClass64_Sub1_2227 = new Class64_Sub1(softwareToolkit);
	((Class167) this).aClass64_Sub1_2246 = new Class64_Sub1(softwareToolkit);
	((Class167) this).aClass64_Sub1_2225 = new Class64_Sub1(softwareToolkit);
	((Class167) this).anIntArray2242 = new int[Class64_Sub1.anInt5346];
	for (int i = 0;
	     (i ^ 0xffffffff) > (Class64_Sub1.anInt5346 ^ 0xffffffff); i++)
	    ((Class167) this).anIntArray2242[i] = -1;
    }
}
