/* Class299_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class299_Sub2_Sub1 extends Class299_Sub2
{
    private int anInt8708;
    static int anInt8709;
    static int anInt8710;
    private int anInt8711;
    static int[] anIntArray8712;
    static double aDouble8713 = -1.0;
    private int anInt8714;
    private int anInt8715;
    private int anInt8716;
    private int anInt8717;
    private NativeToolkit aHa_Sub3_8718;
    private Interface18_Impl2 anInterface18_Impl2_8719;
    static int anInt8720;
    
    final Interface18_Impl2 method2266(boolean bool) {
	if (bool != true)
	    return null;
	anInt8720++;
	if (anInterface18_Impl2_8719 == null) {
	    Class270.anIntArray3464[3] = anInt8711;
	    Class270.anIntArray3464[1] = anInt8717;
	    Class270.anIntArray3464[4] = anInt8708;
	    d var_d = ((AbstractToolkit) aHa_Sub3_8718).aD4579;
	    Class270.anIntArray3464[5] = anInt8714;
	    Class270.anIntArray3464[2] = anInt8715;
	    Class270.anIntArray3464[0] = anInt8716;
	    boolean bool_0_ = false;
	    int i = 0;
	    for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -7; i_1_++) {
		if (!var_d.method4(-7953, Class270.anIntArray3464[i_1_]))
		    return null;
		TextureDefinition class12
		    = var_d.getTexture(Class270.anIntArray3464[i_1_], -6662);
		int i_2_ = ((TextureDefinition) class12).aBoolean199 ? 64 : 128;
		if ((i_2_ ^ 0xffffffff) < (i ^ 0xffffffff))
		    i = i_2_;
		if ((((TextureDefinition) class12).aByte205 ^ 0xffffffff) < -1)
		    bool_0_ = true;
	    }
	    for (int i_3_ = 0; i_3_ < 6; i_3_++)
		Class239_Sub14.anIntArrayArray5991[i_3_]
		    = var_d.method5(false, Class270.anIntArray3464[i_3_], 1.0F,
				    i, i, 81);
	    anInterface18_Impl2_8719
		= aHa_Sub3_8718.method3900(Class239_Sub14.anIntArrayArray5991,
					   bool_0_, 61, i);
	}
	return anInterface18_Impl2_8719;
    }
    
    static final void method2270(int i, int i_4_, AbstractToolkit var_ha, String string,
				 boolean bool, int i_5_, int i_6_, int i_7_) {
	try {
	    if (DummyOutputstream.aClass105_106 == null
		|| Class121.aClass105_1800 == null) {
		if (Class21.indexLoader8.getArchiveLoaded(false, Class231.anInt2996)
		    && Class21.indexLoader8
			   .getArchiveLoaded(false, Class348_Sub40_Sub16.anInt9231)) {
		    DummyOutputstream.aClass105_106
			= (var_ha.method3691
			   (Sprite.loadSingleSprite(Class21.indexLoader8,
						Class231.anInt2996, 0),
			    true));
		    Sprite class207
			= Sprite.loadSingleSprite(Class21.indexLoader8,
					      Class348_Sub40_Sub16.anInt9231,
					      0);
		    Class121.aClass105_1800
			= var_ha.method3691(class207, true);
		    class207.reflectY();
		    Class348_Sub5.aClass105_6627
			= var_ha.method3691(class207, true);
		} else
		    var_ha.drawQuad(i_4_, i_5_, i, i_7_,
			      (255 + -ObjectDefinition.anInt948 << -833477000
			       | Class264.anInt3376),
			      1);
	    }
	    anInt8709++;
	    if (DummyOutputstream.aClass105_106 != null
		&& Class121.aClass105_1800 != null) {
		int i_8_ = ((i - 2 * Class121.aClass105_1800.getWidth())
			    / DummyOutputstream.aClass105_106.getWidth());
		for (int i_9_ = 0; (i_8_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff);
		     i_9_++)
		    DummyOutputstream.aClass105_106.method974
			((Class121.aClass105_1800.getWidth() + i_4_
			  + (DummyOutputstream.aClass105_106.getWidth()
			     * i_9_)),
			 i_5_);
		Class121.aClass105_1800.method974(i_4_, i_5_);
		Class348_Sub5.aClass105_6627.method974((-Class348_Sub5
							     .aClass105_6627
							     .getWidth()
							+ i_4_ - -i),
						       i_5_);
	    }
	    if (bool == false) {
		Deque.b12fullFontRasterizer.drawString1(string,
						   (Class348_Sub42_Sub11
						    .anInt9586) | ~0xffffff,
						   14 + i_5_, 3 + i_4_, -1,
						   -127);
		var_ha.drawQuad(i_4_, i_7_ + i_5_, i, i_6_ + -i_7_,
			  (Class264.anInt3376
			   | 255 + -ObjectDefinition.anInt948 << 602467960),
			  1);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("kv.G(" + i + ',' + i_4_ + ','
					     + (var_ha != null ? "{...}"
						: "null")
					     + ','
					     + (string != null ? "{...}"
						: "null")
					     + ',' + bool + ',' + i_5_ + ','
					     + i_6_ + ',' + i_7_ + ')'));
	}
    }
    
    static final void method2271(int i) {
	anInt8710++;
	if (!Class55_Sub1.aBoolean5265) {
	    Class152.method1217(i ^ i, Class65.aClass357ArrayArrayArray1148);
	    if (GraphicsFetcher.aClass357ArrayArrayArray9082 != null)
		Class152.method1217(0, (GraphicsFetcher
					.aClass357ArrayArrayArray9082));
	    Class55_Sub1.aBoolean5265 = true;
	}
    }
    
    public static void method2272(int i) {
	if (i < 85)
	    method2271(-124);
	anIntArray8712 = null;
    }
    
    Class299_Sub2_Sub1(NativeToolkit var_ha_Sub3, int i, int i_10_, int i_11_,
		       int i_12_, int i_13_, int i_14_) {
	anInt8715 = i_11_;
	anInt8708 = i_13_;
	anInt8716 = i;
	anInt8711 = i_12_;
	anInt8717 = i_10_;
	anInt8714 = i_14_;
	aHa_Sub3_8718 = var_ha_Sub3;
    }
}
