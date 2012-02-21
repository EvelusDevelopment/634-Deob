/* ModernLoadingScreen - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ModernLoadingScreen implements LoadingScreen
{
    static int anInt5003;
    static int anInt5004;
    static int anInt5005;
    private GametipDefinition gameTip;
    static int[] anIntArray5007 = new int[4];
    static int anInt5008;
    static int anInt5009;
    private AbstractToolkit toolkit;
    private boolean aBoolean5011;
    private Interface1[] anInterface1Array5012;
    static boolean aBoolean5013 = false;
    static int anInt5014;
    static OutgoingPacket aClass351_5015;
    static int anInt5016 = 0;
    static Signlink aClass297_5017;
    static int anInt5018;
    static int anInt5019;
    
    public static void method1447(int i) {
	if (i == 76) {
	    anIntArray5007 = null;
	    aClass297_5017 = null;
	    aClass351_5015 = null;
	}
    }
    
    static final void method1448(int i) {
	anInt5003++;
	if (i <= -55)
	    Class348_Sub40_Sub7.aClass348_Sub42_Sub12_9144
		= new Class348_Sub42_Sub12((GameText.aClass274_3487.getLanguageText
					    (Class348_Sub33.gameLanguage)),
					   "", Class362.anInt4458, 1004, -1,
					   0L, 0, 0, true, false, 0L, true);
    }
    
    public final void method57(int i) {
	anInt5004++;
	if (toolkit != Class348_Sub8.currentToolkit) {
	    toolkit = Class348_Sub8.currentToolkit;
	    aBoolean5011 = true;
	}
	toolkit.drawScreenOverlay(0);
	Interface1[] interface1s = anInterface1Array5012;
	for (int i_0_ = 0; interface1s.length > i_0_; i_0_++) {
	    Interface1 interface1 = interface1s[i_0_];
	    if (interface1 != null)
		interface1.method7(10286);
	}
	if (i <= 84)
	    isUpdatedNeeded((byte) 2, 40L);
    }
    
    public final void draw(boolean bool) {
	anInt5018++;
	bool = true;
	Interface1[] interface1s = anInterface1Array5012;
	for (int i_1_ = 0; interface1s.length > i_1_; i_1_++) {
	    Interface1 interface1 = interface1s[i_1_];
	    if (interface1 != null)
		interface1.draw((byte) -49, bool || aBoolean5011);
	}
	aBoolean5011 = false;
    }
    
    public final void method59(int i) {
	anInt5008++;
	if (i != -9719)
	    aClass351_5015 = null;
    }
    
    public final int method55(byte i) {
	anInt5009++;
	if (i != -58)
	    draw(false);
	return ((GametipDefinition) gameTip).anInt3687;
    }
    
    static final Class148 method1449(int i, int i_2_, int i_3_) {
	Class357 class357
	    = Message.aClass357ArrayArrayArray2029[i][i_2_][i_3_];
	if (class357 == null)
	    return null;
	return ((Class357) class357).aClass148_4396;
    }
    
    public final boolean isUpdatedNeeded(byte i, long l) {
	try {
	    anInt5005++;
	    if (i < 30)
		method1449(-81, 10, -115);
	    if ((Class62.getCurrentTimeMillis() ^ 0xffffffffffffffffL) > (l + (long) ((GametipDefinition) gameTip).activeTime ^ 0xffffffffffffffffL))
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "qt.I(" + i + ',' + l + ')');
	}
    }
    
    ModernLoadingScreen(GametipDefinition tip, AlternativeFontLoader class106) {
	try {
	    gameTip = tip;
	    anInterface1Array5012 = new Interface1[(((GametipDefinition) gameTip).anInterface12Array3688).length];
	    for (int i = 0; ((anInterface1Array5012.length ^ 0xffffffff) < (i ^ 0xffffffff)); i++)
		anInterface1Array5012[i] = class106.method1000(true, (((GametipDefinition) gameTip).anInterface12Array3688[i]));
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("qt.<init>("
					     + (tip != null ? "{...}"
						: "null")
					     + ','
					     + (class106 != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    public final int method60(int i) {
	if (i != -19079)
	    draw(false);
	anInt5014++;
	int i_4_ = 0;
	Interface1[] interface1s = anInterface1Array5012;
	for (int i_5_ = 0; interface1s.length > i_5_; i_5_++) {
	    Interface1 interface1 = interface1s[i_5_];
	    if (interface1 == null || interface1.method8((byte) -121))
		i_4_++;
	}
	return i_4_ * 100 / anInterface1Array5012.length;
    }
    
    static {
	aClass351_5015 = new OutgoingPacket(76, 4);
	anInt5019 = 0;
    }
}
