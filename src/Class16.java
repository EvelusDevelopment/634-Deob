/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class16
{
    static int anInt230;
    static Class148 aClass148_231;
    static int anInt232;
    static IndexLoader aClass45_233;
    static int anInt234;
    
    static final void method258(int i, int i_0_) {
	Class357 class357 = Message.aClass357ArrayArrayArray2029[0][i][i_0_];
	for (int i_1_ = 0; i_1_ < 3; i_1_++) {
	    Class357 class357_2_
		= (Message.aClass357ArrayArrayArray2029[i_1_][i][i_0_]
		   = Message.aClass357ArrayArrayArray2029[i_1_ + 1][i][i_0_]);
	    if (class357_2_ != null) {
		for (Class148 class148
			 = ((Class357) class357_2_).aClass148_4396;
		     class148 != null;
		     class148 = ((Class148) class148).aClass148_2038) {
		    Class318_Sub1_Sub3 class318_sub1_sub3
			= ((Class148) class148).aClass318_Sub1_Sub3_2040;
		    if ((((Class318_Sub1_Sub3) class318_sub1_sub3).aShort8743
			 == i)
			&& (((Class318_Sub1_Sub3) class318_sub1_sub3)
			    .aShort8750) == i_0_)
			((Class318_Sub1) class318_sub1_sub3).aByte6381--;
		}
		if (((Class357) class357_2_).aClass318_Sub1_Sub1_4402 != null)
		    ((Class318_Sub1) (((Class357) class357_2_)
				      .aClass318_Sub1_Sub1_4402)).aByte6381--;
		if (((Class357) class357_2_).aClass318_Sub1_Sub4_4406 != null)
		    ((Class318_Sub1) (((Class357) class357_2_)
				      .aClass318_Sub1_Sub4_4406)).aByte6381--;
		if (((Class357) class357_2_).aClass318_Sub1_Sub4_4403 != null)
		    ((Class318_Sub1) (((Class357) class357_2_)
				      .aClass318_Sub1_Sub4_4403)).aByte6381--;
		if (((Class357) class357_2_).aClass318_Sub1_Sub5_4395 != null)
		    ((Class318_Sub1) (((Class357) class357_2_)
				      .aClass318_Sub1_Sub5_4395)).aByte6381--;
		if (((Class357) class357_2_).aClass318_Sub1_Sub5_4407 != null)
		    ((Class318_Sub1) (((Class357) class357_2_)
				      .aClass318_Sub1_Sub5_4407)).aByte6381--;
	    }
	}
	if (Message.aClass357ArrayArrayArray2029[0][i][i_0_] == null) {
	    Message.aClass357ArrayArrayArray2029[0][i][i_0_]
		= new Class357(0);
	    ((Class357) Message.aClass357ArrayArrayArray2029[0][i][i_0_])
		.aByte4399
		= (byte) 1;
	}
	((Class357) Message.aClass357ArrayArrayArray2029[0][i][i_0_])
	    .aClass357_4400
	    = class357;
	Message.aClass357ArrayArrayArray2029[3][i][i_0_] = null;
    }
    
    static final void method259(int i, int i_3_, boolean bool, String string,
				int i_4_) {
	anInt230++;
	Class178.method1356(false, null, i, i_4_, bool, string, true);
	int i_5_ = -1 / ((i_3_ - -33) / 63);
    }
    
    static final int method260(boolean bool) {
	if (bool != false)
	    aClass45_233 = null;
	anInt232++;
	if ((ByteBuffer.anInt7207 ^ 0xffffffff) == -2)
	    return Class348_Sub40_Sub8.anInt9157;
	return 0;
    }
    
    public static void method261(byte i) {
	aClass45_233 = null;
	aClass148_231 = null;
	if (i != -120)
	    method262(-23);
    }
    
    static final void method262(int i) {
	anInt234++;
	if (i != 0)
	    aClass148_231 = null;
	if (!IntergerVarScriptSettingDefinition.aBoolean2130) {
	    IntergerVarScriptSettingDefinition.aBoolean2130 = true;
	    Class205.aFloat2687 += (-Class205.aFloat2687 + -24.0F) / 2.0F;
	    Class369_Sub3_Sub1.aBoolean10174 = true;
	}
    }
}
