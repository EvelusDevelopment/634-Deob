/* IntergerVarScriptSettingDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class IntergerVarScriptSettingDefinition
{
    static int anInt2129;
    static boolean aBoolean2130;
    static float[] aFloatArray2131;
    char loadFromSettings;
    static boolean[][] aBooleanArrayArray2133
	= { { true, true, true, true, true, true, true, true, true, true, true,
	      true, true },
	    { true, true, true, false, false, false, true, true, false, false,
	      false, false, true },
	    { true, false, false, false, false, true, true, true, false, false,
	      false, false, false },
	    { false, false, true, true, true, true, false, false, false, false,
	      false, false, false },
	    { true, true, true, true, true, true, false, false, false, false,
	      false, false, false },
	    { true, true, true, false, false, true, true, true, false, false,
	      false, false, false },
	    { true, true, false, false, false, true, true, true, false, false,
	      false, false, true },
	    { true, true, false, false, false, false, false, true, false,
	      false, false, false, false },
	    { false, true, true, true, true, true, true, true, false, false,
	      false, false, false },
	    { true, false, false, false, true, true, true, true, true, true,
	      false, false, false },
	    { true, true, true, true, true, false, false, false, true, true,
	      false, false, false },
	    { true, true, true, false, false, false, false, false, false,
	      false, true, true, false },
	    new boolean[13],
	    { true, true, true, true, true, true, true, true, true, true, true,
	      true, true },
	    new boolean[13] };
    static int anInt2134;
    int isUnactive = 1;
    static int anInt2136;
    static float aFloat2137;
    
    public static void method1254(byte i) {
	aBooleanArrayArray2133 = null;
	aFloatArray2131 = null;
	if (i <= 11)
	    aBooleanArrayArray2133 = null;
    }
    
    final void initialize(ByteBuffer class348_sub49, int i) {
	for (;;) {
	    int i_0_ = class348_sub49.getUByte();
	    if ((i_0_ ^ 0xffffffff) == -1)
		break;
	    initialize(-90, i_0_, class348_sub49);
	}
	if (i != -1)
	    aBoolean2130 = false;
	anInt2129++;
    }
    
    private final void initialize(int i, int i_1_,
				  ByteBuffer class348_sub49) {
	anInt2136++;
	if ((i_1_ ^ 0xffffffff) != -2) {
	    if (i_1_ == 2)
		((IntergerVarScriptSettingDefinition) this).isUnactive = 0;
	} else
	    ((IntergerVarScriptSettingDefinition) this).loadFromSettings
		= Class50_Sub1.method462(class348_sub49.getByte(),
					 -128);
	if (i >= -73)
	    initialize(null, -43);
    }
    
    static final boolean method1257(int i, int i_2_, int i_3_) {
	if (i > -23)
	    aBooleanArrayArray2133 = null;
	anInt2134++;
	if ((0x20 & i_3_ ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
    
    public IntergerVarScriptSettingDefinition() {
	/* empty */
    }
    
    static {
	aFloatArray2131 = new float[4];
	aBoolean2130 = false;
    }
}
