/* Class341 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class341
{
    static Class348_Sub24 aClass348_Sub24_4226 = new Class348_Sub24(0, 0);
    static int anInt4227;
    static int anInt4228;
    static int anInt4229;
    static int anInt4230;
    static int anInt4231;
    static int anInt4232;
    static int[][] anIntArrayArray4233 = new int[6][];
    static RasterToolkit[] aClass105Array4234;
    static int anInt4235;
    static Model[] aClass124Array4236 = new Model[4];
    static int anInt4237;
    
    static final void method2676(int i, int i_0_, int i_1_, byte i_2_,
				 int i_3_) {
	anInt4231++;
	float f = (float) Class75.anInt1267 / (float) Class75.anInt1259;
	int i_4_ = i;
	int i_5_ = i_0_;
	if (f < 1.0F)
	    i_5_ = (int) (f * (float) i);
	else
	    i_4_ = (int) ((float) i_0_ / f);
	i_1_ -= (i + -i_4_) / 2;
	i_3_ -= (i_0_ + -i_5_) / 2;
	Class48.anInt859 = -1;
	Class245.anInt3170
	    = -(Class75.anInt1267 * i_3_ / i_5_) + Class75.anInt1267;
	InterfaceScript.anInt6992 = Class75.anInt1259 * i_1_ / i_4_;
	TextureLoader.anInt4609 = -1;
	int i_6_ = 50 / ((-12 - i_2_) / 40);
	Class348_Sub15.method2811(false);
    }
    
    public final String toString() {
	anInt4227++;
	throw new IllegalStateException();
    }
    
    public static void method2677(int i) {
	anIntArrayArray4233 = null;
	aClass348_Sub24_4226 = null;
	if (i >= 93) {
	    aClass105Array4234 = null;
	    aClass124Array4236 = null;
	}
    }
    
    public Class341() {
	/* empty */
    }
    
    static final void method2678(int i) {
	if (i != -2049)
	    anIntArrayArray4233 = null;
	anInt4229++;
	if (r.aBoolean9722) {
	    Widget class46
		= Class348_Sub22.getWidgetChild(Class9.anInt169,
					    Class149.anInt2046);
	    if (class46 != null
		&& ((Widget) class46).anObjectArray680 != null) {
		InterfaceScript class348_sub36 = new InterfaceScript();
		((InterfaceScript) class348_sub36).parent = class46;
		((InterfaceScript) class348_sub36).parameters
		    = ((Widget) class46).anObjectArray680;
		ScriptExecutor.executeScript(class348_sub36);
	    }
	    Class301.anInt3829 = -1;
	    r.aBoolean9722 = false;
	    Class362.anInt4458 = -1;
	    if (class46 != null)
		Class251.method1916(-9343, class46);
	}
    }
    
    final int method2679(int i, int i_7_, int i_8_) {
	anInt4232++;
	if (i_8_ != 1595)
	    return 38;
	int i_9_ = (Class348_Sub42_Sub8_Sub2.windowHeight <= i ? i
		    : Class348_Sub42_Sub8_Sub2.windowHeight);
	if (Class186_Sub1.aClass341_5808 == this)
	    return 0;
	if (this == Class237_Sub1.aClass341_5821)
	    return i_9_ - i_7_;
	if (Class27.aClass341_399 == this)
	    return (i_9_ - i_7_) / 2;
	return 0;
    }
    
    static final String method2680(String string, boolean bool, String string_10_, String string_11_) {
	anInt4237++;
	for (int i = string_11_.indexOf(string_10_); i != -1; i = string_11_.indexOf(string_10_, string.length() + i))
	    string_11_ = (string_11_.substring(0, i) + string + string_11_.substring(string_10_.length() + i));
	if (bool != true)
	    method2678(45);
	return string_11_;
    }
    
    static final void method2681(int i) {
	if (i == 9864) {
	    anInt4230++;
	    if (Class348_Sub8.currentToolkit != null) {
		if (Class59_Sub1.aBoolean5300)
		    Class187.method1406(true);
		Class71.aClass76_1208.method775((byte) 69);
		Class318_Sub1_Sub3_Sub3.method2433();
		Class50_Sub2.method464(i + -9865);
		GameText.method2061(-127);
		Class363.method3513(-113);
		Class239_Sub14.method1779((byte) 124);
		if (IntegerVarScriptSettingLoader.aClass305_3304 != null)
		    IntegerVarScriptSettingLoader.aClass305_3304.method2295((byte) 96);
		Class299_Sub2.method2269(true);
		Class348_Sub18.method2938((byte) 127);
		Class40.method369(-29776);
		InputstreamWorker.method3616(12639);
		Class348_Sub42_Sub3.method3177(-78, false);
		for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -2049; i_12_++) {
		    Player class318_sub1_sub3_sub3_sub2
			= (ClassicLoadingScreen.players
			   [i_12_]);
		    if (class318_sub1_sub3_sub3_sub2 != null) {
			for (int i_13_ = 0; ((((Class318_Sub1_Sub3_Sub3)
					       class318_sub1_sub3_sub3_sub2)
					      .aClass64Array10323).length
					     > i_13_); i_13_++)
			    ((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub2)
				.aClass64Array10323[i_13_]
				= null;
		    }
		}
		for (int i_14_ = 0; i_14_ < Class348_Sub32.anInt6930;
		     i_14_++) {
		    Npc class318_sub1_sub3_sub3_sub1
			= (((Class348_Sub22) (Class348_Sub40_Sub23
					      .aClass348_Sub22Array9319
					      [i_14_]))
			   .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
		    if (class318_sub1_sub3_sub3_sub1 != null) {
			for (int i_15_ = 0;
			     i_15_ < (((Class318_Sub1_Sub3_Sub3)
				       class318_sub1_sub3_sub3_sub1)
				      .aClass64Array10323).length;
			     i_15_++)
			    ((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub1)
				.aClass64Array10323[i_15_]
				= null;
		    }
		}
		Class50_Sub1.aClass101_5209 = null;
		Class157.aClass101_2123 = null;
		Class348_Sub8.currentToolkit.destroy();
		Class348_Sub8.currentToolkit = null;
	    }
	}
    }
    
    static {
	anInt4235 = 0;
    }
}
