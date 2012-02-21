/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class67 implements Interface1
{
    static int anInt4642;
    static RasterToolkit aClass105_4643;
    static int anInt4644;
    static int anInt4645;
    private Class158 aClass158_4646;
    static int anInt4647;
    static int[] anIntArray4648 = new int[14];
    private AbstractFontRasterizer aClass324_4649;
    private IndexLoader aClass45_4650;
    private IndexLoader aClass45_4651;
    
    public static void method716(int i) {
	if (i == 1) {
	    aClass105_4643 = null;
	    anIntArray4648 = null;
	}
    }
    
    public final void draw(byte i, boolean bool) {
	if (bool) {
	    int i_0_ = ((((Class158) aClass158_4646).aClass221_4948.method1607
			 (Class92.anInt1524,
			  ((Class158) aClass158_4646).anInt4931, (byte) -119))
			+ ((Class158) aClass158_4646).anInt4947);
	    int i_1_ = ((((Class158) aClass158_4646).aClass341_4945.method2679
			 (DirectxToolkit.anInt7666,
			  ((Class158) aClass158_4646).anInt4936, i + 1644))
			+ ((Class158) aClass158_4646).anInt4932);
	    aClass324_4649.method2584(null,
				      ((Class158) aClass158_4646).anInt4937,
				      ((Class158) aClass158_4646).anInt4940,
				      null,
				      ((Class158) aClass158_4646).anInt4935,
				      ((Class158) aClass158_4646).anInt4946,
				      ((Class158) aClass158_4646).anInt4936,
				      null, i_1_, 0, 0,
				      ((Class158) aClass158_4646).anInt4931,
				      i_0_, false,
				      ((Class158) aClass158_4646).anInt4943,
				      ((Class158) aClass158_4646).aString4942);
	}
	if (i == -49)
	    anInt4642++;
    }
    
    public final boolean method8(byte i) {
	anInt4644++;
	boolean bool = true;
	if (!aClass45_4650.getArchiveLoaded(false,
				     ((Class158) aClass158_4646).anInt4944))
	    bool = false;
	if (!aClass45_4651.getArchiveLoaded(false,
				     ((Class158) aClass158_4646).anInt4944))
	    bool = false;
	int i_2_ = -53 % ((i - 25) / 52);
	return bool;
    }
    
    static final boolean method717(int i) {
	anInt4645++;
	if (Class289.aBoolean3697) {
	    try {
		Class224.method1617((byte) 125, Class93.loaderApplet,
				    "showVideoAd");
		return true;
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	if (i != -2511)
	    method716(-67);
	return false;
    }
    
    public final void method7(int i) {
	anInt4647++;
	BitmapFont class143
	    = Class239_Sub10.createBitmapFont((byte) -45,
					((Class158) aClass158_4646).anInt4944,
					aClass45_4651);
	if (i == 10286)
	    aClass324_4649
		= (Class348_Sub8.currentToolkit.createFontRasterizer
		   (class143,
		    Sprite.method1523(aClass45_4650,
					((Class158) aClass158_4646).anInt4944),
		    true));
    }
    
    Class67(IndexLoader class45, IndexLoader class45_3_, Class158 class158) {
	try {
	    aClass45_4651 = class45_3_;
	    aClass158_4646 = class158;
	    aClass45_4650 = class45;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("kd.<init>(" + (class45 != null ? "{...}" : "null")
			+ ',' + (class45_3_ != null ? "{...}" : "null") + ','
			+ (class158 != null ? "{...}" : "null") + ')'));
	}
    }
    
    static final void method718(Class318_Sub1[] class318_sub1s, int i,
				int i_4_) {
	if (i < i_4_) {
	    int i_5_ = (i + i_4_) / 2;
	    int i_6_ = i;
	    Class318_Sub1 class318_sub1 = class318_sub1s[i_5_];
	    class318_sub1s[i_5_] = class318_sub1s[i_4_];
	    class318_sub1s[i_4_] = class318_sub1;
	    int i_7_ = ((Class318_Sub1) class318_sub1).anInt6389;
	    for (int i_8_ = i; i_8_ < i_4_; i_8_++) {
		if (((Class318_Sub1) class318_sub1s[i_8_]).anInt6389
		    > i_7_ + (i_8_ & 0x1)) {
		    Class318_Sub1 class318_sub1_9_ = class318_sub1s[i_8_];
		    class318_sub1s[i_8_] = class318_sub1s[i_6_];
		    class318_sub1s[i_6_++] = class318_sub1_9_;
		}
	    }
	    class318_sub1s[i_4_] = class318_sub1s[i_6_];
	    class318_sub1s[i_6_] = class318_sub1;
	    method718(class318_sub1s, i, i_6_ - 1);
	    method718(class318_sub1s, i_6_ + 1, i_4_);
	}
    }
}
