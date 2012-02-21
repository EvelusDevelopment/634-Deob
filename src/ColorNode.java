/* ColorNode - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;
import java.math.BigInteger;

final class ColorNode implements Interface12
{
    static int anInt4894;
    static int compassArchvieId;
    static BigInteger aBigInteger4896 = new BigInteger("10001", 16);
    static int anInt4897;
    static int anInt4898;
    int color;
    static int anInt4900;
    static Class138 aClass138_4901;
    static int anInt4902;
    static boolean aBoolean4903 = false;
    static Frame aFrame4904;
    static OutgoingPacket aClass351_4905;
    static int[] anIntArray4906;
    static OutgoingPacket aClass351_4907;
    
    static final Class43 method490(byte i, ByteBuffer class348_sub49) {
	anInt4897++;
	Class43 class43 = new Class43();
	((Class43) class43).anInt615 = class348_sub49.getShort();
	((Class43) class43).aClass348_Sub42_Sub10_614
	    = Class239_Sub6.aClass355_5900
		  .method3471(((Class43) class43).anInt615, (byte) -90);
	int i_0_ = -91 / ((9 - i) / 54);
	return class43;
    }
    
    public final Class223 method51(byte i) {
	anInt4894++;
	if (i < 116)
	    return null;
	return Class219.aClass223_2868;
    }
    
    static final void method491(byte i) {
	for (int i_1_ = 0;
	     ((i_1_ ^ 0xffffffff)
	      > (Class348_Sub33.aByteArrayArrayArray6962.length ^ 0xffffffff));
	     i_1_++) {
	    for (int i_2_ = 0;
		 i_2_ < Class348_Sub33.aByteArrayArrayArray6962[0].length;
		 i_2_++) {
		for (int i_3_ = 0;
		     (Class348_Sub33.aByteArrayArrayArray6962[0][0].length
		      > i_3_);
		     i_3_++)
		    Class348_Sub33.aByteArrayArrayArray6962[i_1_][i_2_][i_3_]
			= (byte) 0;
	    }
	}
	int i_4_ = 119 / ((i - 47) / 34);
	anInt4902++;
    }
    
    public static void method492(int i) {
	aClass351_4905 = null;
	aClass351_4907 = null;
	aFrame4904 = null;
	if (i < -17) {
	    aBigInteger4896 = null;
	    anIntArray4906 = null;
	    aClass138_4901 = null;
	}
    }
    
    ColorNode(int i) {
	((ColorNode) this).color = i;
    }
    
    static final void method493(boolean bool) {
	if (Class328_Sub2.loadingStages == null) {
	    Class328_Sub2.loadingStages = LoadingStage.getLoadingStages();
	    WidgetVariable.currentLoadingStage = Class328_Sub2.loadingStages[0];
	    LobbyRegionInfo.loadingStartTime = Class62.getCurrentTimeMillis();
	}
	anInt4900++;
	if (ObjectDefinition.loadingHandler == null)
	    Class70.initializeLoadingHandler(116);
	LoadingStage loadingStage = WidgetVariable.currentLoadingStage;
	int i = Class164.method1278(-28660);
	if (loadingStage != WidgetVariable.currentLoadingStage) {
	    if (WidgetVariable.currentLoadingStage == LoadingStage.finalLoadingStage) {
		ObjectDefinition.loadingHandler = null;
		ByteBuffer.setClientState(2, 3);
	    } else {
		Class64_Sub2.percentLoadedStr = ((LoadingStage) loadingStage).text1.getLanguageText(Class348_Sub33.gameLanguage);
		if (((LoadingStage) WidgetVariable.currentLoadingStage).hasPercentValue)
		    Class64_Sub2.percentLoadedStr += ((LoadingStage) loadingStage).finalPercent + "%";
		Class251.anInt3236 = ((LoadingStage) loadingStage).finalPercent;
		if (((LoadingStage) WidgetVariable.currentLoadingStage).aBoolean1016 || ((LoadingStage) loadingStage).aBoolean1016)
		    LobbyRegionInfo.loadingStartTime = Class62.getCurrentTimeMillis();
	    }
	} else {
	    Class64_Sub2.percentLoadedStr
		= ((LoadingStage) WidgetVariable.currentLoadingStage).mainText
		      .getLanguageText(Class348_Sub33.gameLanguage);
	    if (((LoadingStage) WidgetVariable.currentLoadingStage).aBoolean1016)
		Class251.anInt3236 = (i * ((((LoadingStage) WidgetVariable.currentLoadingStage)
			     .finalPercent)
			    + -(((LoadingStage) WidgetVariable.currentLoadingStage)
				.initialPercent)) / 100
		       + (((LoadingStage) WidgetVariable.currentLoadingStage)
			  .initialPercent));
	    if (((LoadingStage) WidgetVariable.currentLoadingStage).hasPercentValue)
		Class64_Sub2.percentLoadedStr += Class251.anInt3236 + "%";
	}
	if (bool == true) {
	    if (ObjectDefinition.loadingHandler != null) {
		ObjectDefinition.loadingHandler.setLoadingStage((WidgetVariable.currentLoadingStage), Class64_Sub2.percentLoadedStr,
						 Class251.anInt3236,
						 LobbyRegionInfo.loadingStartTime, false);
		if (Class182.modernLoadingScreens != null) {
		    for (int i_5_ = Class375.anInt4544 - -1;
			 ((i_5_ ^ 0xffffffff)
			  > (Class182.modernLoadingScreens.length
			     ^ 0xffffffff));
			 i_5_++) {
			if ((Class182.modernLoadingScreens[i_5_]
				 .method60(-19079)
			     ^ 0xffffffff) <= -101
			    && Class375.anInt4544 == -1 + i_5_
			    && (Class240.anInt4674 ^ 0xffffffff) <= -2
			    && ObjectDefinition.loadingHandler.method2322(0)) {
			    try {
				Class182.modernLoadingScreens[i_5_]
				    .method57(117);
			    } catch (Exception exception) {
				Class182.modernLoadingScreens = null;
				break;
			    }
			    ObjectDefinition.loadingHandler.method2321
				(10559, Class182.modernLoadingScreens[i_5_]);
			    Class375.anInt4544++;
			    if ((Class375.anInt4544
				 >= (-1
				     + Class182.modernLoadingScreens.length))
				&& (Class182.modernLoadingScreens.length
				    ^ 0xffffffff) < -2)
				Class375.anInt4544
				    = !Class186_Sub1.gametipLoader
					   .method1044(26) ? -1 : 0;
			}
		    }
		}
	    }
	}
    }
    
    static final int method494(int i, int i_6_) {
	if (i <= 78)
	    aBigInteger4896 = null;
	anInt4898++;
	return 0x7f & i_6_;
    }
    
    static {
	aClass138_4901 = new Class138(12, 0, 1, 0);
	anIntArray4906 = new int[4];
	aClass351_4905 = new OutgoingPacket(44, 3);
	aClass351_4907 = new OutgoingPacket(48, 11);
    }
}
