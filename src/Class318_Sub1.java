/* Class318_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class318_Sub1 extends Class318
{
    byte aByte6376;
    int anInt6377;
    static int anInt6378;
    Class318_Sub1 aClass318_Sub1_6379;
    int anInt6380;
    byte aByte6381;
    int anInt6382;
    static IncomingPacket aClass114_6383 = new IncomingPacket(11, 6);
    static int anInt6384;
    static int anInt6385;
    int anInt6386;
    boolean aBoolean6387;
    int anInt6388;
    int anInt6389;
    static int anInt6390;
    boolean aBoolean6391 = false;
    static int anInt6392;
    
    abstract boolean method2376(int i);
    
    abstract boolean method2377(byte i);
    
    abstract boolean method2378(int i);
    
    abstract int method2379(int i);
    
    abstract void method2380(AbstractToolkit var_ha, int i, boolean bool,
			     Class318_Sub1 class318_sub1_0_, int i_1_,
			     byte i_2_, int i_3_);
    
    abstract Class30 method2381(AbstractToolkit var_ha, int i);
    
    abstract boolean method2382(byte i);
    
    static final void method2383(AbstractToolkit var_ha, int i, Widget class46) {
	do {
	    try {
		if (i != -2)
		    method2383(null, -63, null);
		anInt6385++;
		boolean bool
		    = ((ToolkitException.itemLoader.method1941
			(((Widget) class46).anInt672, (byte) -74,
			 ((Widget) class46).itemId,
			 ((Widget) class46).anInt781,
			 ~0xffffff | ((Widget) class46).anInt809,
			 ((Widget) class46).anInt678, var_ha,
			 (!((Widget) class46).aBoolean720 ? null
			  : (((Player)
			      Class132.localPlayer)
			     .aClass154_10536))))
		       == null);
		if (!bool)
		    break;
		Class5_Sub1_Sub1.aClass262_9931.addToFront
		    (new Class348_Sub7(((Widget) class46).itemId,
				       ((Widget) class46).anInt781,
				       ((Widget) class46).anInt672,
				       (~0xffffff
					| ((Widget) class46).anInt809),
				       ((Widget) class46).anInt678,
				       ((Widget) class46).aBoolean720),
		     i ^ 0x4ed2);
		Class251.method1916(-9343, class46);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("ga.QA("
						 + (var_ha != null ? "{...}"
						    : "null")
						 + ',' + i + ','
						 + (class46 != null ? "{...}"
						    : "null")
						 + ')'));
	    }
	    break;
	} while (false);
    }
    
    abstract int method2384(Class348_Sub1[] class348_sub1s, int i);
    
    static final void method2385(Widget class46, int i, aa var_aa, int i_4_,
				 int i_5_, int i_6_, byte i_7_, int i_8_,
				 AbstractToolkit var_ha) {
	do {
	    try {
		anInt6390++;
		Class42 class42
		    = Class348_Sub23_Sub2.aClass153_9031.method1225(i_4_,
								    (byte) 98);
		if (i_7_ < -52) {
		    if (class42 == null || !((Class42) class42).aBoolean569
			|| !class42.method373((Class318_Sub1_Sub3_Sub3
					       .varbitHandler),
					      69))
			break;
		    if (((Class42) class42).anIntArray591 != null) {
			int[] is
			    = (new int
			       [((Class42) class42).anIntArray591.length]);
			for (int i_9_ = 0; is.length / 2 > i_9_; i_9_++) {
			    int i_10_;
			    if (Class348_Sub40_Sub21.anInt9282 != 4)
				i_10_ = 0x3fff & (r_Sub2.anInt10483
						  + (int) AbtractArchiveLoader.aFloat3938);
			    else
				i_10_ = (int) AbtractArchiveLoader.aFloat3938 & 0x3fff;
			    int i_11_ = Class70.sineTable[i_10_];
			    int i_12_ = Class70.cosineTable[i_10_];
			    if ((Class348_Sub40_Sub21.anInt9282 ^ 0xffffffff)
				!= -5) {
				i_11_ = (i_11_ * 256
					 / (FloatBuffer.anInt9750
					    + 256));
				i_12_
				    = i_12_ * 256 / (256 + (FloatBuffer
							    .anInt9750));
			    }
			    is[i_9_ * 2]
				= (((i_11_ * (((((Class42) class42)
						.anIntArray591[i_9_ * 2 - -1])
					       * 4)
					      + i_8_)
				     + (i_5_ - -(4 * (((Class42) class42)
						      .anIntArray591
						      [2 * i_9_]))) * i_12_)
				    >> 248635758)
				   + (i_6_
				      - -(((Widget) class46).anInt709 / 2)));
			    is[i_9_ * 2 - -1]
				= (-((((((Class42) class42).anIntArray591
					[1 + i_9_ * 2]) * 4
				       + i_8_) * i_12_
				      - (i_5_ - -((((Class42) class42)
						   .anIntArray591[i_9_ * 2])
						  * 4)) * i_11_)
				     >> -772369970)
				   + i + ((Widget) class46).anInt789 / 2);
			}
			Class329.method2619(var_ha, is,
					    ((Class42) class42).anInt582,
					    ((Widget) class46).anIntArray677,
					    ((Widget) class46).anIntArray772);
			if ((((Class42) class42).anInt584 ^ 0xffffffff) < -1) {
			    for (int i_13_ = 0;
				 ((-1 + is.length / 2 ^ 0xffffffff)
				  < (i_13_ ^ 0xffffffff));
				 i_13_++) {
				int i_14_ = is[i_13_ * 2];
				int i_15_ = is[1 + 2 * i_13_];
				int i_16_ = is[2 + i_13_ * 2];
				int i_17_ = is[1 + 2 * (i_13_ - -1)];
				if (i_14_ <= i_16_) {
				    if ((i_16_ ^ 0xffffffff) == (i_14_
								 ^ 0xffffffff)
					&& i_15_ > i_17_) {
					int i_18_ = i_15_;
					i_15_ = i_17_;
					i_17_ = i_18_;
				    }
				} else {
				    int i_19_ = i_14_;
				    i_14_ = i_16_;
				    int i_20_ = i_15_;
				    i_15_ = i_17_;
				    i_16_ = i_19_;
				    i_17_ = i_20_;
				}
				var_ha.method3703(i_14_, i_15_, i_16_, i_17_,
						  (((Class42) class42)
						   .anIntArray572
						   [((((Class42) class42)
						      .aByteArray564[i_13_])
						     & 0xff)]),
						  1, var_aa, i_6_, i,
						  ((Class42) class42).anInt584,
						  ((Class42) class42).anInt575,
						  (((Class42) class42)
						   .anInt601));
			    }
			    int i_21_ = is[-2 + is.length];
			    int i_22_ = is[-1 + is.length];
			    int i_23_ = is[0];
			    int i_24_ = is[1];
			    if (i_23_ < i_21_) {
				int i_25_ = i_21_;
				i_21_ = i_23_;
				int i_26_ = i_22_;
				i_22_ = i_24_;
				i_23_ = i_25_;
				i_24_ = i_26_;
			    } else if (i_21_ == i_23_ && i_22_ > i_24_) {
				int i_27_ = i_22_;
				i_22_ = i_24_;
				i_24_ = i_27_;
			    }
			    var_ha.method3703(i_21_, i_22_, i_23_, i_24_,
					      (((Class42) class42)
					       .anIntArray572
					       [(((Class42) class42)
						 .aByteArray564
						 [((((Class42) class42)
						    .aByteArray564).length
						   - 1)]) & 0xff]),
					      1, var_aa, i_6_, i,
					      ((Class42) class42).anInt584,
					      ((Class42) class42).anInt575,
					      ((Class42) class42).anInt601);
			} else {
			    for (int i_28_ = 0; -1 + is.length / 2 > i_28_;
				 i_28_++)
				var_ha.method3636(is[i_28_ * 2],
						  is[2 * i_28_ + 1],
						  is[2 * (i_28_ - -1)],
						  is[2 * i_28_ + 3],
						  (((Class42) class42)
						   .anIntArray572
						   [((((Class42) class42)
						      .aByteArray564[i_28_])
						     & 0xff)]),
						  1, var_aa, i_6_, i);
			    var_ha.method3636(is[is.length + -2],
					      is[-1 + is.length], is[0], is[1],
					      (((Class42) class42)
					       .anIntArray572
					       [(((Class42) class42)
						 .aByteArray564
						 [((((Class42) class42)
						    .aByteArray564).length
						   + -1)]) & 0xff]),
					      1, var_aa, i_6_, i);
			}
		    }
		    RasterToolkit class105 = null;
		    if ((((Class42) class42).anInt578 ^ 0xffffffff) != 0) {
			class105
			    = class42.method374(false, var_ha, (byte) 127);
			if (class105 != null)
			    Class151.method1211(i, class105, i_6_, class46,
						var_aa, i_8_, 2, i_5_);
		    }
		    if (((Class42) class42).aString597 == null)
			break;
		    int i_29_ = 0;
		    if (class105 != null)
			i_29_ = class105.getHeight();
		    AbstractFontRasterizer class324 = Class240.p11fullFontRasterizer;
		    BitmapFont class143 = Class258_Sub1.p11fullBitmapFont;
		    if ((((Class42) class42).anInt576 ^ 0xffffffff) == -2) {
			class324 = GameApplet.p12fullFontRasterizer;
			class143 = Class246.p12fullBitmapFont;
		    }
		    if (((Class42) class42).anInt576 == 2) {
			class143 = Class369.b12FullBitmapFont;
			class324 = Deque.b12fullFontRasterizer;
		    }
		    Class334.method2650(class143, ((Class42) class42).anInt580,
					var_aa, i_8_, i_6_,
					((Class42) class42).aString597, i,
					class324, i_29_, class46, i_5_, 100);
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929
			  (runtimeexception,
			   ("ga.KA(" + (class46 != null ? "{...}" : "null")
			    + ',' + i + ','
			    + (var_aa != null ? "{...}" : "null") + ',' + i_4_
			    + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_
			    + ',' + (var_ha != null ? "{...}" : "null")
			    + ')'));
	    }
	    break;
	} while (false);
    }
    
    abstract Class318_Sub4 method2386(int i, AbstractToolkit var_ha);
    
    abstract void method2387(AbstractToolkit var_ha, int i);
    
    abstract boolean method2388(int i);
    
    public static void method2389(int i) {
	aClass114_6383 = null;
	if (i != 1)
	    aClass114_6383 = null;
    }
    
    final int method2390(Class348_Sub1[] class348_sub1s, int i, int i_30_,
			 int i_31_) {
	anInt6384++;
	if (i_30_ != -2)
	    ((Class318_Sub1) this).aByte6376 = (byte) 33;
	long l = (Class348_Sub42_Sub8_Sub2.aLongArrayArrayArray10431
		  [((Class318_Sub1) this).aByte6381][i][i_31_]);
	long l_32_ = 0L;
	int i_33_ = 0;
	for (/**/; (l_32_ ^ 0xffffffffffffffffL) >= -49L; l_32_ += 16L) {
	    int i_34_ = (int) (0xffffL & l >> (int) l_32_);
	    if ((i_34_ ^ 0xffffffff) >= -1)
		break;
	    class348_sub1s[i_33_++]
		= (((Class211) Class239_Sub14.aClass211Array5993[i_34_ + -1])
		   .aClass348_Sub1_2745);
	}
	for (int i_35_ = i_33_; i_35_ < 4; i_35_++)
	    class348_sub1s[i_35_] = null;
	return i_33_;
    }
    
    abstract boolean method2391(AbstractToolkit var_ha, int i, int i_36_, int i_37_);
    
    abstract void method2392(boolean bool);
    
    public Class318_Sub1() {
	/* empty */
    }
    
    int method2393(int i) {
	if (i >= -109)
	    method2385(null, 23, null, -94, -53, 18, (byte) -3, 35, null);
	anInt6378++;
	return 0;
    }
    
    abstract int method2394(boolean bool);
}
