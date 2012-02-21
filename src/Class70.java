/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class70
{
    static int anInt1203;
    static int[] cosineTable;
    static int anInt1205;
    static int anInt1206;
    static int[] sineTable = new int[16384];
    
    public static void method725(int i) {
	sineTable = null;
	cosineTable = null;
	if (i != 16384)
	    sineTable = null;
    }
    
    static final void initializeLoadingHandler(int i) {
	if (i <= 88)
	    cosineTable = null;
	anInt1206++;
	if (WidgetVariable.currentLoadingStage != null) {
	    ObjectDefinition.loadingHandler = new LoadingHandler();
	    ObjectDefinition.loadingHandler.setLoadingStage(WidgetVariable.currentLoadingStage, ((LoadingStage) WidgetVariable.currentLoadingStage).mainText.getLanguageText(Class348_Sub33.gameLanguage), ((LoadingStage) WidgetVariable.currentLoadingStage).initialPercent, LobbyRegionInfo.loadingStartTime, false);
	    Class348_Sub32.aThread6946 = new Thread(ObjectDefinition.loadingHandler, "");
	    Class348_Sub32.aThread6946.start();
	}
    }
    
    static final void method727(byte i, int i_0_, int i_1_, int i_2_) {
	anInt1205++;
	WidgetVariable class348_sub42_sub15
	    = Class318_Sub9_Sub1.method2516(i_2_, (byte) 105, 9);
	class348_sub42_sub15.method3246(i + -25427);
	((WidgetVariable) class348_sub42_sub15).intArg = i_1_;
	((WidgetVariable) class348_sub42_sub15).anInt9651 = i_0_;
	if (i != -63)
	    sineTable = null;
    }
    
    public final String toString() {
	anInt1203++;
	throw new IllegalStateException();
    }
    
    public Class70() {
	/* empty */
    }
    
    static {
	cosineTable = new int[16384];
	double d = 3.834951969714103E-4;
	for (int i = 0; (i ^ 0xffffffff) > -16385; i++) {
	    sineTable[i] = (int) (16384.0 * Math.sin(d * (double) i));
	    cosineTable[i] = (int) (Math.cos(d * (double) i) * 16384.0);
	}
    }
}
