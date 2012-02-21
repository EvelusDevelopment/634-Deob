/* IntegerVarScriptSettingLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class IntegerVarScriptSettingLoader
{
    private IndexLoader aClass45_3299;
    static byte[] aByteArray3300 = new byte[2048];
    static Cache aClass60_3301 = new Cache(30);
    static int anInt3302;
    private Cache aClass60_3303 = new Cache(64);
    static Class305 aClass305_3304;
    int amountScriptGlobalInts;
    static int anInt3306 = 0;
    
    public static void method1975(byte i) {
	aClass60_3301 = null;
	int i_0_ = -54 / ((i - 77) / 37);
	aClass305_3304 = null;
	aByteArray3300 = null;
    }
    
    final IntergerVarScriptSettingDefinition getScriptSetting(int i, int i_1_) {
	anInt3302++;
	IntergerVarScriptSettingDefinition de;
	synchronized (aClass60_3303) {
	    de = (IntergerVarScriptSettingDefinition) aClass60_3303.method583((long) i, -51);
	}
	if (de != null)
	    return de;
	int i_2_ = 44 % ((-41 - i_1_) / 33);
	byte[] is;
	synchronized (aClass45_3299) {
	    is = aClass45_3299.loadArchiveChild(-1860, 19, i);
	}
	de = new IntergerVarScriptSettingDefinition();
	if (is != null)
	    de.initialize(new ByteBuffer(is), -1);
	synchronized (aClass60_3303) {
	    aClass60_3303.method582(de, (long) i, (byte) -120);
	}
	return de;
    }
    
    IntegerVarScriptSettingLoader(GameMode class230, int i, IndexLoader class45) {
	try {
	    aClass45_3299 = class45;
	    ((IntegerVarScriptSettingLoader) this).amountScriptGlobalInts = aClass45_3299.method407(19);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("uea.<init>("
					     + (class230 != null ? "{...}"
						: "null")
					     + ',' + i + ','
					     + (class45 != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
}
