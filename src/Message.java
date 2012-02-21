/* Message - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Message
{
    static int anInt2021 = 0;
    String aString2022;
    static int anInt2023;
    String aString2024;
    String aString2025;
    int anInt2026;
    int anInt2027;
    String aString2028;
    static Class357[][][] aClass357ArrayArrayArray2029;
    int touchedCycle;
    int anInt2031;
    int type;
    String aString2033;
    static Class338[] aClass338Array2034;
    static int anInt2035 = 0;
    static int anInt2036;
    
    public static void method1195(byte i) {
	if (i < 73)
	    method1195((byte) 61);
	aClass357ArrayArrayArray2029 = null;
	aClass338Array2034 = null;
    }
    
    Message(int type, int i_0_, String string, String string_1_,
	     String string_2_, String string_3_, int i_4_, String string_5_) {
	try {
	    ((Message) this).anInt2031
		= Class318_Sub1_Sub3.method2408((byte) 53);
	    ((Message) this).aString2028 = string_5_;
	    ((Message) this).type = type;
	    ((Message) this).aString2033 = string_1_;
	    ((Message) this).aString2025 = string_2_;
	    ((Message) this).aString2022 = string_3_;
	    ((Message) this).touchedCycle = Class367_Sub11.logicCycle;
	    ((Message) this).aString2024 = string;
	    ((Message) this).anInt2027 = i_0_;
	    ((Message) this).anInt2026 = i_4_;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("og.<init>(" + type + ',' + i_0_ + ','
			+ (string != null ? "{...}" : "null") + ','
			+ (string_1_ != null ? "{...}" : "null") + ','
			+ (string_2_ != null ? "{...}" : "null") + ','
			+ (string_3_ != null ? "{...}" : "null") + ',' + i_4_
			+ ',' + (string_5_ != null ? "{...}" : "null") + ')'));
	}
    }
    
    final void setValues(int i, int i_6_, String string, String string_7_,
			  String string_8_, int i_9_, int i_10_,
			  String string_11_, String string_12_) {
	try {
	    ((Message) this).anInt2031
		= Class318_Sub1_Sub3.method2408((byte) -91);
	    anInt2036++;
	    ((Message) this).aString2033 = string_7_;
	    ((Message) this).aString2024 = string_11_;
	    ((Message) this).touchedCycle = Class367_Sub11.logicCycle;
	    ((Message) this).aString2025 = string;
	    ((Message) this).type = i;
	    ((Message) this).aString2022 = string_8_;
	    ((Message) this).aString2028 = string_12_;
	    ((Message) this).anInt2027 = i_6_;
	    ((Message) this).anInt2026 = i_10_;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("og.A(" + i + ',' + i_6_ + ','
			+ (string != null ? "{...}" : "null") + ','
			+ (string_7_ != null ? "{...}" : "null") + ','
			+ (string_8_ != null ? "{...}" : "null") + ',' + i_9_
			+ ',' + i_10_ + ','
			+ (string_11_ != null ? "{...}" : "null") + ','
			+ (string_12_ != null ? "{...}" : "null") + ')'));
	}
    }
}
