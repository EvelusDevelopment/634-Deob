/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class84
{
    private Cache aClass60_1449 = new Cache(16);
    static int[] anIntArray1450 = { 1, 2, 4, 8 };
    static int anInt1451;
    static int anInt1452;
    static int anInt1453;
    static int anInt1454;
    static int anInt1455;
    static int anInt1456;
    static int anInt1457;
    static int anInt1458;
    static int anInt1459;
    private IndexLoader aClass45_1460;
    
    final void method816(boolean bool) {
	anInt1455++;
	synchronized (aClass60_1449) {
	    if (bool != false)
		method819((byte) 107, 46);
	    aClass60_1449.method587(-119);
	}
    }
    
    static final Class318_Sub1_Sub3_Sub3 method817(int i, int i_0_, int i_1_,
						   int i_2_) {
	anInt1456++;
	Class357 class357
	    = Message.aClass357ArrayArrayArray2029[i_1_][i_0_][i_2_];
	if (class357 == null)
	    return null;
	if (i != 252)
	    return null;
	Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3 = null;
	int i_3_ = -1;
	for (Class148 class148 = ((Class357) class357).aClass148_4396;
	     class148 != null;
	     class148 = ((Class148) class148).aClass148_2038) {
	    Class318_Sub1_Sub3 class318_sub1_sub3
		= ((Class148) class148).aClass318_Sub1_Sub3_2040;
	    if (class318_sub1_sub3 instanceof Class318_Sub1_Sub3_Sub3) {
		Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3_4_
		    = (Class318_Sub1_Sub3_Sub3) class318_sub1_sub3;
		int i_5_ = 252 + (-1 + class318_sub1_sub3_sub3_4_
					   .method2436((byte) 88)) * 256;
		int i_6_
		    = (-i_5_ + (((Class318_Sub1) class318_sub1_sub3_sub3_4_)
				.anInt6377)
		       >> -482650455);
		int i_7_
		    = (-i_5_ + (((Class318_Sub1) class318_sub1_sub3_sub3_4_)
				.anInt6388)
		       >> -605332215);
		int i_8_ = i_5_ + (((Class318_Sub1) class318_sub1_sub3_sub3_4_)
				   .anInt6377) >> 1651294377;
		int i_9_
		    = ((((Class318_Sub1) class318_sub1_sub3_sub3_4_).anInt6388
			+ i_5_)
		       >> 783412073);
		if ((i_6_ ^ 0xffffffff) >= (i_0_ ^ 0xffffffff)
		    && (i_2_ ^ 0xffffffff) <= (i_7_ ^ 0xffffffff)
		    && i_0_ <= i_8_ && i_2_ <= i_9_) {
		    int i_10_ = (1 + i_9_ - i_2_) * (-i_0_ + (1 + i_8_));
		    if ((i_10_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) {
			i_3_ = i_10_;
			class318_sub1_sub3_sub3 = class318_sub1_sub3_sub3_4_;
		    }
		}
	    }
	}
	return class318_sub1_sub3_sub3;
    }
    
    static final int method818(int i, int i_11_, int i_12_) {
	anInt1451++;
	int i_13_ = i_11_;
	while (i > 0) {
	    i_13_ = i_12_ & 0x1 | i_13_ << 127982945;
	    i--;
	    i_12_ >>>= 1;
	}
	return i_13_;
    }
    
    final void method819(byte i, int i_14_) {
	synchronized (aClass60_1449) {
	    aClass60_1449.method578(2, i_14_);
	    if (i <= 8)
		method826(91, -94, 117, 24, 39, -100, null);
	}
	anInt1457++;
    }
    
    private final Class300 method820(int i, int i_15_) {
	anInt1458++;
	Class300 class300;
	synchronized (aClass60_1449) {
	    class300 = (Class300) aClass60_1449.method583((long) i, 116);
	}
	if (class300 != null)
	    return class300;
	byte[] is;
	synchronized (aClass45_1460) {
	    is = aClass45_1460.loadArchiveChild(-1860, i_15_, i);
	}
	class300 = new Class300();
	if (is != null)
	    class300.method2275(new ByteBuffer(is), (byte) -123);
	synchronized (aClass60_1449) {
	    aClass60_1449.method582(class300, (long) i, (byte) -106);
	}
	return class300;
    }
    
    static final void method821(int i) {
	Class332.aClass60_4139.removeAll(0);
	int i_16_ = -67 / ((i - 39) / 33);
	anInt1459++;
    }
    
    final void method822(byte i) {
	synchronized (aClass60_1449) {
	    aClass60_1449.removeAll(0);
	}
	if (i >= -13)
	    method825(14);
	anInt1452++;
    }
    
    final Class305 method823(int i, int i_17_, int i_18_, int i_19_,
			     Class25 class25, int i_20_) {
	anInt1453++;
	Class72[] class72s = null;
	Class300 class300 = method820(i_20_, 29);
	if (i_19_ > -36)
	    return null;
	if (((Class300) class300).anIntArray3821 != null) {
	    class72s
		= new Class72[((Class300) class300).anIntArray3821.length];
	    for (int i_21_ = 0;
		 (i_21_ ^ 0xffffffff) > (class72s.length ^ 0xffffffff);
		 i_21_++) {
		Class38 class38 = class25.method301((((Class300) class300)
						     .anIntArray3821[i_21_]),
						    29);
		class72s[i_21_] = new Class72(((Class38) class38).anInt498,
					      ((Class38) class38).anInt504,
					      ((Class38) class38).anInt499,
					      ((Class38) class38).anInt502,
					      ((Class38) class38).anInt508,
					      ((Class38) class38).anInt501,
					      ((Class38) class38).anInt503,
					      ((Class38) class38).aBoolean507);
	    }
	}
	return new Class305(((Class300) class300).anInt3817, class72s,
			    ((Class300) class300).anInt3823, i_18_, i, i_17_);
    }
    
    static final void method824(int i) {
	Canvas_Sub1.anInt67 = i;
	for (int i_22_ = 0; i_22_ < Class318_Sub7.anInt6451; i_22_++) {
	    for (int i_23_ = 0; i_23_ < Class348_Sub41.anInt7054; i_23_++) {
		if (Message.aClass357ArrayArrayArray2029[i][i_22_][i_23_]
		    == null)
		    Message.aClass357ArrayArrayArray2029[i][i_22_][i_23_]
			= new Class357(i);
	    }
	}
    }
    
    public static void method825(int i) {
	anIntArray1450 = null;
	if (i > -73)
	    anIntArray1450 = null;
    }
    
    static final void method826(int i, int i_24_, int i_25_, int i_26_,
				int i_27_, int i_28_, AbstractToolkit var_ha) {
	if ((Class174.aClass105_2309 == null
	     || WidgetVariable.aClass105_9658 == null
	     || WidgetVariable.aClass105_9659 == null)
	    && Class21.indexLoader8
		   .getArchiveLoaded(false, Class318_Sub1_Sub3_Sub3.anInt10257)
	    && Class21.indexLoader8.getArchiveLoaded(false, Class313.anInt3937)
	    && Class21.indexLoader8.getArchiveLoaded(false, NpcDefinition.anInt1387)) {
	    Sprite class207 = Sprite.loadSingleSprite(Class21.indexLoader8,
						    Class313.anInt3937, 0);
	    WidgetVariable.aClass105_9658
		= var_ha.method3691(class207, true);
	    class207.reflectY();
	    NativeLibTracker.aClass105_4808 = var_ha.method3691(class207, true);
	    Class174.aClass105_2309
		= (var_ha.method3691
		   (Sprite.loadSingleSprite(Class21.indexLoader8,
					Class318_Sub1_Sub3_Sub3.anInt10257, 0),
		    true));
	    Sprite class207_29_ = Sprite.loadSingleSprite(Class21.indexLoader8,
							NpcDefinition.anInt1387, 0);
	    WidgetVariable.aClass105_9659
		= var_ha.method3691(class207_29_, true);
	    class207_29_.reflectY();
	    AbstractLobbyWorld.aClass105_1706 = var_ha.method3691(class207_29_, true);
	}
	anInt1454++;
	if (Class174.aClass105_2309 != null
	    && WidgetVariable.aClass105_9658 != null
	    && WidgetVariable.aClass105_9659 != null) {
	    int i_30_ = (-(WidgetVariable.aClass105_9659.getWidth() * 2)
			 + i_25_) / Class174.aClass105_2309.getWidth();
	    for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
		Class174.aClass105_2309.method974
		    (i_24_ + (WidgetVariable.aClass105_9659.getWidth()
			      - -(i_31_
				  * Class174.aClass105_2309.getWidth())),
		     -Class174.aClass105_2309.getHeight() + (i_28_ + i_26_));
	    int i_32_
		= ((i_26_
		    - (i + WidgetVariable.aClass105_9659.getHeight()))
		   / WidgetVariable.aClass105_9658.getHeight());
	    for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
		WidgetVariable.aClass105_9658.method974
		    (i_24_,
		     (WidgetVariable.aClass105_9658.getHeight() * i_33_
		      + (i_28_ + i)));
		NativeLibTracker.aClass105_4808.method974
		    (-NativeLibTracker.aClass105_4808.getWidth() + i_25_ + i_24_,
		     (WidgetVariable.aClass105_9658.getHeight() * i_33_
		      + i + i_28_));
	    }
	    WidgetVariable.aClass105_9659.method974
		(i_24_, (-WidgetVariable.aClass105_9659.getHeight()
			 + i_28_ + i_26_));
	    AbstractLobbyWorld.aClass105_1706.method974
		(i_24_ + (i_25_
			  + -WidgetVariable.aClass105_9659.getWidth()),
		 i_28_ - (-i_26_
			  + WidgetVariable.aClass105_9659.getHeight()));
	}
	int i_34_ = -24 % ((i_27_ - 85) / 35);
    }
    
    Class84(GameMode class230, int i, IndexLoader class45) {
	try {
	    aClass45_1460 = class45;
	    aClass45_1460.method407(29);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("lca.<init>("
					     + (class230 != null ? "{...}"
						: "null")
					     + ',' + i + ','
					     + (class45 != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
}
