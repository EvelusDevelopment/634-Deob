/* Class369 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class369 implements Interface12
{
    int anInt4959;
    static int anInt4960 = 0;
    int anInt4961;
    static BitmapFont b12FullBitmapFont;
    int anInt4963;
    static int anInt4964;
    int anInt4965;
    int anInt4966;
    static int anInt4967;
    Class221 aClass221_4968;
    static int anInt4969;
    int anInt4970;
    int anInt4971;
    static boolean aBoolean4972 = false;
    Class341 aClass341_4973;
    
    public static void method3567(int i) {
	b12FullBitmapFont = null;
	int i_0_ = 105 % ((-15 - i) / 36);
    }
    
    static final void method3568(AbstractToolkit toolkit, int i) {
	anInt4964++;
	Class240.p11fullFontRasterizer = Class14.createFontRasterizer(toolkit, (byte) -53, true, LoadingStage.p11fullArchiveId);
	Class258_Sub1.p11fullBitmapFont
	    = Class135.createBitmapFont(-25411, toolkit, LoadingStage.p11fullArchiveId);
	if (i != 4)
	    b12FullBitmapFont = null;
	GameApplet.p12fullFontRasterizer
	    = Class14.createFontRasterizer(toolkit, (byte) -53, true, AnimationDefinition.p12fullArchiveId);
	Class246.p12fullBitmapFont
	    = Class135.createBitmapFont(-25411, toolkit, AnimationDefinition.p12fullArchiveId);
	Deque.b12fullFontRasterizer = Class14.createFontRasterizer(toolkit, (byte) -53, true, IndexTable.b12fullArchiveId);
	b12FullBitmapFont
	    = Class135.createBitmapFont(-25411, toolkit, IndexTable.b12fullArchiveId);
    }
    
    static final void method3569(int i, int i_1_) {
	anInt4969++;
	int i_2_ = 83 % ((i_1_ - -87) / 37);
	WidgetVariable class348_sub42_sub15
	    = Class318_Sub9_Sub1.method2516(i, (byte) 105, 4);
	class348_sub42_sub15.method3251(-16058);
    }
    
    public Class223 method51(byte i) {
	if (i < 116)
	    return null;
	anInt4967++;
	return null;
    }
    
    Class369(Class221 class221, Class341 class341, int i, int i_3_, int i_4_,
	     int i_5_, int i_6_, int i_7_, int i_8_) {
	try {
	    ((Class369) this).anInt4961 = i_8_;
	    ((Class369) this).anInt4971 = i_4_;
	    ((Class369) this).anInt4965 = i_7_;
	    ((Class369) this).anInt4966 = i_6_;
	    ((Class369) this).anInt4959 = i_3_;
	    ((Class369) this).aClass341_4973 = class341;
	    ((Class369) this).anInt4970 = i;
	    ((Class369) this).aClass221_4968 = class221;
	    ((Class369) this).anInt4963 = i_5_;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("fn.<init>("
					     + (class221 != null ? "{...}"
						: "null")
					     + ','
					     + (class341 != null ? "{...}"
						: "null")
					     + ',' + i + ',' + i_3_ + ','
					     + i_4_ + ',' + i_5_ + ',' + i_6_
					     + ',' + i_7_ + ',' + i_8_ + ')'));
	}
    }
}
