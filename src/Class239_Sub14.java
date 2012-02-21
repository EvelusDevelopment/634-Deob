/* Class239_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;

final class Class239_Sub14 extends Class239
{
    static int anInt5982;
    static int anInt5983;
    static int anInt5984;
    static int anInt5985;
    static int anInt5986;
    static int anInt5987;
    static int anInt5988;
    static Class251 aClass251_5989 = new Class251();
    static Class190 aClass190_5990;
    static int[][] anIntArrayArray5991 = new int[6][];
    static IncomingPacket aClass114_5992 = new IncomingPacket(17, 4);
    static Class211[] aClass211Array5993;
    static int anInt5994;
    static IntegerVarScriptSettingLoader scriptGlobalIntArgsLoader;
    
    final int method1778(int i) {
	if (i != -32350)
	    aClass190_5990 = null;
	anInt5984++;
	return ((Class239) this).anInt3138;
    }
    
    final void method1716(boolean bool) {
	if (((Class348_Sub51) ((Class239) this).aClass348_Sub51_3136)
		.aClass239_Sub3_7222.method1735(bool)
	    && ((Class239) this).anInt3138 == 2)
	    ((Class239) this).anInt3138 = 1;
	anInt5988++;
	if (((Class239) this).anInt3138 < 0
	    || (((Class239) this).anInt3138 ^ 0xffffffff) < -3)
	    ((Class239) this).anInt3138 = method1710(20014);
    }
    
    Class239_Sub14(int i, Class348_Sub51 class348_sub51) {
	super(i, class348_sub51);
    }
    
    Class239_Sub14(Class348_Sub51 class348_sub51) {
	super(class348_sub51);
    }
    
    static final void method1779(byte i) {
	anInt5985++;
	LocationMode.method3517(73);
	Deque.aClass190ArrayArray3335 = null;
	Cache.aHa1098 = null;
	if (i <= 89)
	    anInt5994 = -75;
	Class239_Sub24.aClass299_6098 = null;
	Class158.aClass299_4938 = null;
	Class348_Sub42_Sub10.aClass299_9571 = null;
    }
    
    public static void method1780(int i) {
	aClass114_5992 = null;
	int i_0_ = 108 % ((-24 - i) / 54);
	aClass251_5989 = null;
	anIntArrayArray5991 = null;
	scriptGlobalIntArgsLoader = null;
	aClass211Array5993 = null;
	aClass190_5990 = null;
    }
    
    static final int method1781(int i, int i_1_, int i_2_) {
	anInt5983++;
	if (AbstractImageFetcher.anInt6923 == -1)
	    return 1;
	if ((((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		 .aClass239_Sub25_7271.method1829(-32350)
	     ^ 0xffffffff)
	    != (i ^ 0xffffffff)) {
	    Class258_Sub3_Sub1.method1971
		(-2,
		 GameText.aClass274_3496.getLanguageText(Class348_Sub33.gameLanguage),
		 true, i);
	    if (i != ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			 .aClass239_Sub25_7271.method1829(-32350))
		return -1;
	}
	try {
	    Dimension dimension = Class305.canvas.getSize();
	    Class362.method3511(true, GameApplet.p12fullFontRasterizer,
				Class246.p12fullBitmapFont,
				GameText.aClass274_3496
				    .getLanguageText(Class348_Sub33.gameLanguage),
				2, Class348_Sub8.currentToolkit);
	    Model model = Class300.createModel(0, aa_Sub3.indexLoader7, AbstractImageFetcher.anInt6923);
	    long l = Class62.getCurrentTimeMillis();
	    Class348_Sub8.currentToolkit.la();
	    Class157.aClass101_2123.method894(0, Class348_Sub23_Sub2.anInt9037, 0);
	    Class348_Sub8.currentToolkit.method3638(Class157.aClass101_2123);
	    Class348_Sub8.currentToolkit.DA(dimension.width / 2, dimension.height / 2,
				     512, 512);
	    Class348_Sub8.currentToolkit.xa(1.0F);
	    if (i_1_ >= -66)
		aClass190_5990 = null;
	    Class348_Sub8.currentToolkit.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F,
				     30.0F);
	    AnimatableToolkit class64 = Class348_Sub8.currentToolkit.method3625(model, 2048, 64, 64, 768);
	    int i_3_ = 0;
	while_80_:
	    for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -501; i_4_++) {
		Class348_Sub8.currentToolkit.drawScreenOverlay(0);
		Class348_Sub8.currentToolkit.ya();
		for (int i_5_ = 15; (i_5_ ^ 0xffffffff) <= -1; i_5_--) {
		    for (int i_6_ = 0;
			 (i_5_ ^ 0xffffffff) <= (i_6_ ^ 0xffffffff); i_6_++) {
			Class50_Sub1.aClass101_5209.method894
			    ((int) ((-((float) i_5_ / 2.0F) + (float) i_6_)
				    * (float) Class270.anInt3465),
			     0, (i_5_ + 1) * Class270.anInt3465);
			i_3_++;
			class64.method615(Class50_Sub1.aClass101_5209, null,
					  0);
			if (((long) i_2_ ^ 0xffffffffffffffffL)
			    >= (Class62.getCurrentTimeMillis() + -l
				^ 0xffffffffffffffffL))
			    break while_80_;
		    }
		}
	    }
	    Class348_Sub8.currentToolkit.method3633();
	    long l_7_ = (long) (1000 * i_3_) / (Class62.getCurrentTimeMillis() + -l);
	    Class348_Sub8.currentToolkit.drawScreenOverlay(0);
	    Class348_Sub8.currentToolkit.ya();
	    return (int) l_7_;
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    return -1;
	}
    }
    
    final void method1712(int i, int i_8_) {
	((Class239) this).anInt3138 = i_8_;
	anInt5987++;
	int i_9_ = -73 / ((82 - i) / 35);
    }
    
    final int method1710(int i) {
	anInt5982++;
	if (i != 20014)
	    aClass211Array5993 = null;
	return 2;
    }
    
    final int method1714(int i, int i_10_) {
	if (i != 3)
	    return 23;
	anInt5986++;
	return 1;
    }
}
