/* LoadingHandler - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class LoadingHandler implements Runnable {
    static int anInt3897;
    static OutgoingPacket aClass351_3898 = new OutgoingPacket(11, 8);
    static int anInt3899;
    static int anInt3900;
    static int anInt3901;
    static int anInt3902;
    static int anInt3903;
    static int anInt3904;
    static int anInt3905;
    static int anInt3906;
    private LoadingScreen loadingScreen = new ClassicLoadingScreen();
    private boolean aBoolean3908;
    static int anInt3909;
    private volatile boolean isRunning;
    static int anInt3911;
    static int anInt3912;
    static Widget aClass46_3913;
    private long aLong3914;
    private int currentPercent;
    private LoadingStage loadingStage;
    private long updatedTime;
    static int anInt3918 = 1;
    private LoadingScreen anInterface16_3919 = null;
    private int anInt3920;
    private String loadingMsg;
    
    final int getCurrentPercent() {
	anInt3909++;
	if (loadingStage == null)
	    return 0;
	int stage = loadingStage.getStageId();
	if (((LoadingStage) loadingStage).aBoolean1016 && (((LoadingStage) loadingStage).finalPercent > currentPercent))
	    return 1 + currentPercent;
	if (stage < 0 || Class328_Sub2.loadingStages.length - 1 <= stage)
	    return 100;
	if (currentPercent == ((LoadingStage) loadingStage).initialPercent)
	    return ((LoadingStage) loadingStage).finalPercent;
	return ((LoadingStage) loadingStage).initialPercent;
    }
    
    final synchronized void setLoadingStage(LoadingStage class56, String string, int i, long l, boolean bool) {
	try {
	    loadingMsg = string;
	    currentPercent = i;
	    anInt3897++;
	    updatedTime = l;
	    loadingStage = class56;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ae.J("
					     + (class56 != null ? "{...}"
						: "null")
					     + ','
					     + (string != null ? "{...}"
						: "null")
					     + ',' + i + ',' + l + ',' + bool
					     + ')'));
	}
    }
    
    public final void run() {
	anInt3902++;
	while (!isRunning) {
	    long time = Class62.getCurrentTimeMillis();
	    synchronized (this) {
		try {
		    anInt3920++;
		    if (loadingScreen instanceof ClassicLoadingScreen)
			loadingScreen.draw(aBoolean3908);
		    else {
			long l_1_ = Class62.getCurrentTimeMillis();
			if (Class348_Sub8.currentToolkit != null && anInterface16_3919 != null
			    && anInterface16_3919.method55((byte) -58) != 0
			    && (aLong3914 >= l_1_ - (long) anInterface16_3919.method55((byte) -58))) {
			    int alpha = (int) ((l_1_ - aLong3914) * 255L / (long) anInterface16_3919.method55((byte) -58));
			    int compAlpha = 255 - alpha;
			    compAlpha = 0xffffff | compAlpha << 24;
			    alpha = 0xffffff | alpha << 24;
			    Class140.method1170((byte) -121);
			    Class348_Sub8.currentToolkit.drawScreenOverlay(0);
			    RasterToolkit raster = Class348_Sub8.currentToolkit.createRasterToolkit(Class321.windowWidth, Class348_Sub42_Sub8_Sub2.windowHeight, true);
			    Class348_Sub8.currentToolkit.method3681(raster, 0);
			    anInterface16_3919.draw(true);
			    Class348_Sub8.currentToolkit.method3672();
			    raster.method964(0, 0, 0, compAlpha, 1);
			    Class348_Sub8.currentToolkit.method3681(raster, 0);
			    Class348_Sub8.currentToolkit.drawScreenOverlay(0);
			    loadingScreen.draw(true);
			    Class348_Sub8.currentToolkit.method3672();
			    raster.method964(0, 0, 0, alpha, 1);
			} else {
			    if (anInterface16_3919 != null) {
				aBoolean3908 = true;
				anInterface16_3919.method59(-9719);
				anInterface16_3919 = null;
			    }
			    if (aBoolean3908) {
				Class140.method1170((byte) -64);
				if (Class348_Sub8.currentToolkit != null)
				    Class348_Sub8.currentToolkit.drawScreenOverlay(0);
			    }
			    loadingScreen.draw
				((aBoolean3908
				  || (Class348_Sub8.currentToolkit != null
				      && Class348_Sub8.currentToolkit.method3655())));
			}
			try {
			    if (Class348_Sub8.currentToolkit != null
				&& !(loadingScreen instanceof ClassicLoadingScreen))
				Class348_Sub8.currentToolkit.method3689((byte) 57);
			} catch (ToolkitException exception_sub1) {
			    Class156.method1242((exception_sub1.getMessage()
						 + " (Recovered) "
						 + NpcDefinition.aClient1367
						       .method81((byte) 80)),
						exception_sub1, 15004);
			    Class367_Sub10.method3553(true, (byte) 114, 0);
			}
		    }
		    java.awt.Container container;
		    if (ColorNode.aFrame4904 != null)
			container = ColorNode.aFrame4904;
		    else if (Class93.loaderApplet != null)
			container = Class93.loaderApplet;
		    else
			container = Class348_Sub40_Sub9.anApplet_Sub1_9169;
		    container.getSize();
		    container.getSize();
		    if (ColorNode.aFrame4904 == container)
			ColorNode.aFrame4904.getInsets();
		    aBoolean3908 = false;
		    if (Class348_Sub8.currentToolkit != null && !(loadingScreen instanceof ClassicLoadingScreen) && (loadingStage.getStageId() < LoadingStage.loadingStage18.getStageId()))
			Class367_Sub11.method3556(false);
		} catch (Exception exception) {
		    continue;
		}
	    }
	    long l_3_ = Class62.getCurrentTimeMillis();
	    int i = (int) (time + 20L - l_3_);
	    if ((i ^ 0xffffffff) < -1)
		Class286_Sub5.method2161((byte) -3, (long) i);
	}
    }
    
    public static void method2317(byte i) {
	if (i > 50) {
	    aClass351_3898 = null;
	    aClass46_3913 = null;
	}
    }
    
    final String getLoadingMsg(int i) {
	if (i != -9324)
	    method2320((byte) -47);
	anInt3903++;
	return loadingMsg;
    }
    
    final void method2319(byte i) {
	isRunning = true;
	anInt3906++;
    }
    
    final int method2320(byte i) {
	anInt3901++;
	int i_4_ = -127 / ((29 - i) / 45);
	return currentPercent;
    }
    
    final synchronized void method2321(int i, LoadingScreen interface16) {
	anInt3911++;
	if (i != 10559)
	    aClass46_3913 = null;
	anInterface16_3919 = loadingScreen;
	loadingScreen = interface16;
	aLong3914 = Class62.getCurrentTimeMillis();
    }
    
    final synchronized boolean method2322(int i) {
	anInt3900++;
	if (i != 0)
	    return false;
	return loadingScreen.isUpdatedNeeded((byte) 125, aLong3914);
    }
    
    final long getUpdatedTime(int i) {
	anInt3912++;
	return updatedTime;
    }
    
    final LoadingStage getCurrentLoadingStage(int i) {
	anInt3904++;
	if (i <= 45)
	    return null;
	return loadingStage;
    }
    
    final int method2325(byte i) {
	int i_5_ = 32 / ((i - -41) / 47);
	anInt3899++;
	return anInt3920;
    }
    
    final synchronized void method2326(int i) {
	if (i <= 39)
	    getCurrentPercent();
	anInt3905++;
	aBoolean3908 = true;
    }
    
    public LoadingHandler() {
	/* empty */
    }
}
