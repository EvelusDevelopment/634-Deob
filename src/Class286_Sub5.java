/* Class286_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class286_Sub5 extends Class286
{
    static d aD6247;
    static int anInt6248 = -1;
    static int anInt6249;
    static int anInt6250;
    static int anInt6251;
    static int anInt6252;
    static int anInt6253;
    private Class61 aClass61_6254;
    static int anInt6255;
    static int anInt6256;
    static int anInt6257;
    static int anInt6258;
    private Class83 aClass83_6259;
    static int[] anIntArray6260 = new int[1];
    static int anInt6261;
    
    static final void method2158(byte i) {
	anInt6256++;
	int i_0_ = 0;
	if (BitmapTable.aClass348_Sub51_3959 != null)
	    i_0_ = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		       .aClass239_Sub23_7231.method1818(-32350);
	if (i == 56) {
	    if (i_0_ == 2) {
		int i_1_ = ((Class272.anInt3473 ^ 0xffffffff) >= -801
			    ? Class272.anInt3473 : 800);
		Class321.windowWidth = i_1_;
		Class348_Sub48.anInt7129 = (Class272.anInt3473 + -i_1_) / 2;
		int i_2_ = ((Class348_Sub22.anInt6857 ^ 0xffffffff) < -601
			    ? 600 : Class348_Sub22.anInt6857);
		Class348_Sub42_Sub8_Sub2.windowHeight = i_2_;
		Class335.anInt4167 = 0;
	    } else if ((i_0_ ^ 0xffffffff) != -2) {
		Class335.anInt4167 = 0;
		Class348_Sub42_Sub8_Sub2.windowHeight = Class348_Sub22.anInt6857;
		Class348_Sub48.anInt7129 = 0;
		Class321.windowWidth = Class272.anInt3473;
	    } else {
		int i_3_
		    = Class272.anInt3473 <= 1024 ? Class272.anInt3473 : 1024;
		Class348_Sub48.anInt7129 = (Class272.anInt3473 + -i_3_) / 2;
		int i_4_ = (Class348_Sub22.anInt6857 <= 768
			    ? Class348_Sub22.anInt6857 : 768);
		Class321.windowWidth = i_3_;
		Class335.anInt4167 = 0;
		Class348_Sub42_Sub8_Sub2.windowHeight = i_4_;
	    }
	}
    }
    
    final void method2136(int i, int i_5_, byte i_6_) {
	anInt6252++;
	float f = -5.0E-4F * (float) (1 + (i & 0x3));
	float f_7_ = 5.0E-4F * (float) (1 + ((i & 0x18) >> -466719645));
	float f_8_
	    = (i & 0x40 ^ 0xffffffff) == -1 ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
	if (bool) {
	    LobbyWorld.aFloatArray5791[1] = 0.0F;
	    LobbyWorld.aFloatArray5791[0] = f_8_;
	    LobbyWorld.aFloatArray5791[3] = 0.0F;
	    LobbyWorld.aFloatArray5791[2] = 0.0F;
	} else {
	    LobbyWorld.aFloatArray5791[1] = 0.0F;
	    LobbyWorld.aFloatArray5791[0] = 0.0F;
	    LobbyWorld.aFloatArray5791[2] = f_8_;
	    LobbyWorld.aFloatArray5791[3] = 0.0F;
	}
	OpenGL.glTexGenfv(8192, 9474, LobbyWorld.aFloatArray5791, 0);
	LobbyWorld.aFloatArray5791[0] = 0.0F;
	LobbyWorld.aFloatArray5791[1] = f_8_;
	LobbyWorld.aFloatArray5791[3]
	    = (f
	       * (float) ((DirectxToolkit) ((Class286) this).aHa_Sub2_3684).anInt7735
	       % 1.0F);
	if (i_6_ >= -42)
	    method2136(-27, -15, (byte) -43);
	LobbyWorld.aFloatArray5791[2] = 0.0F;
	OpenGL.glTexGenfv(8193, 9474, LobbyWorld.aFloatArray5791, 0);
	if (((Class83) aClass83_6259).aBoolean1442) {
	    LobbyWorld.aFloatArray5791[0] = 0.0F;
	    LobbyWorld.aFloatArray5791[3]
		= (float) (((DirectxToolkit) ((Class286) this).aHa_Sub2_3684)
			   .anInt7735) * f_7_ % 1.0F;
	    LobbyWorld.aFloatArray5791[2] = 0.0F;
	    LobbyWorld.aFloatArray5791[1] = 0.0F;
	    OpenGL.glTexGenfv(8194, 9473, LobbyWorld.aFloatArray5791, 0);
	} else {
	    int i_9_ = (int) (16.0F
			      * ((float) ((DirectxToolkit) (((Class286) this)
						     .aHa_Sub2_3684)).anInt7735
				 * f_7_));
	    ((Class286) this).aHa_Sub2_3684.method3771
		((byte) -81,
		 ((Class83) aClass83_6259).aClass258_Sub3Array1448[i_9_ % 16]);
	}
	((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
    }
    
    final void method2140(Class258 class258, byte i, int i_10_) {
	anInt6257++;
	((Class286) this).aHa_Sub2_3684.method3771((byte) -118, class258);
	((Class286) this).aHa_Sub2_3684.method3761(0, i_10_);
	if (i > -89)
	    method2140(null, (byte) 109, -112);
    }
    
    final void method2133(int i) {
	anInt6249++;
	aClass61_6254.method594('\001', 28666);
	((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
	((Class286) this).aHa_Sub2_3684.method3771((byte) -113, null);
	if (i > -75)
	    anInt6248 = -7;
	((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
    }
    
    Class286_Sub5(DirectxToolkit var_ha_Sub2, Class83 class83) {
	super(var_ha_Sub2);
	try {
	    aClass83_6259 = class83;
	    aClass61_6254 = new Class61(var_ha_Sub2, 2);
	    aClass61_6254.method595((byte) 104, 0);
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
	    if (((Class83) aClass83_6259).aBoolean1442) {
		OpenGL.glTexGeni(8194, 9472, 9217);
		OpenGL.glEnable(3170);
	    }
	    OpenGL.glTexGeni(8192, 9472, 9216);
	    OpenGL.glTexGeni(8193, 9472, 9216);
	    OpenGL.glEnable(3168);
	    OpenGL.glEnable(3169);
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
	    aClass61_6254.method591(-1);
	    aClass61_6254.method595((byte) 117, 1);
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
	    if (((Class83) aClass83_6259).aBoolean1442)
		OpenGL.glDisable(3170);
	    OpenGL.glDisable(3168);
	    OpenGL.glDisable(3169);
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
	    aClass61_6254.method591(-1);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("gn.<init>("
					     + (var_ha_Sub2 != null ? "{...}"
						: "null")
					     + ','
					     + (class83 != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    static final void method2159(IndexLoader loader) {
	Class348_Sub22.hitmarksArchiveId = loader.getArchiveId("hitmarks");
	anInt6258++;
	AlternativeFontLoader.anInt1639 = loader.getArchiveId("hitbar_default");
	MouseMovementListener.anInt7429 = loader.getArchiveId("timerbar_default");
	AbstractToolkit.anInt4562 = loader.getArchiveId("headicons_pk");
	StringVarScriptSettingLoader.headiconsArchiveId = loader.getArchiveId("headicons_prayer");
	Class115.anInt1756 = loader.getArchiveId("hint_headicons");
	IndexTable.anInt3739 = loader.getArchiveId("hint_mapmarkers");
	Class86.mapflagArchiveId = loader.getArchiveId("mapflag");
	Class239_Sub10.anInt5948 = loader.getArchiveId("cross");
	Class113.mapdotsArchvieId = loader.getArchiveId("mapdots");
	LocationMode.anInt4469 = loader.getArchiveId("scrollbar");
	Class348_Sub40_Sub38.anInt9473 = loader.getArchiveId("name_icons");
	Class187.anInt2510 = loader.getArchiveId("floorshadows");
	ColorNode.compassArchvieId = loader.getArchiveId("compass");
	Class186_Sub1.anInt5814 = loader.getArchiveId("otherlevel");
	Class5_Sub3.anInt8370 = loader.getArchiveId("hint_mapedge");
    }
    
    final void method2134(boolean bool, boolean bool_11_) {
	anInt6250++;
	aClass61_6254.method594('\0', 28666);
	if (((Class83) aClass83_6259).aBoolean1442) {
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
	    ((Class286) this).aHa_Sub2_3684.method3771((byte) -117,
						       (((Class83)
							 aClass83_6259)
							.aClass258_Sub1_1446));
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
	}
	if (bool_11_ != false)
	    anInt6248 = -68;
    }
    
    public static void method2160(int i) {
	if (i == 0) {
	    aD6247 = null;
	    anIntArray6260 = null;
	}
    }
    
    final void method2139(boolean bool, byte i) {
	anInt6261++;
	int i_12_ = -52 % ((i - -60) / 38);
    }
    
    final boolean method2137(int i) {
	if (i >= -5)
	    anInt6248 = 124;
	anInt6253++;
	return true;
    }
    
    static final void method2161(byte i, long l) {
	try {
	    anInt6251++;
	    if (l > 0L) {
		if ((l % 10L ^ 0xffffffffffffffffL) != -1L)
		    Class327.method2606(59, l);
		else {
		    Class327.method2606(-125, -1L + l);
		    Class327.method2606(-125, 1L);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "gn.D(" + i + ',' + l + ')');
	}
    }
}
