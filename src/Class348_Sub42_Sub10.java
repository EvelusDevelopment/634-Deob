/* Class348_Sub42_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub42_Sub10 extends SubNode
{
    static int anInt9560;
    static int anInt9561;
    boolean aBoolean9562 = true;
    static int anInt9563;
    private String[] aStringArray9564;
    private int[][] anIntArrayArray9565;
    int[] anIntArray9566;
    Class355 aClass355_9567;
    static int anInt9568;
    static int anInt9569;
    static int anInt9570;
    static Class299 aClass299_9571;
    static int[] anIntArray9572;
    static int anInt9573;
    private int[] anIntArray9574;
    static int anInt9575;
    static int anInt9576;
    static int anInt9577 = 0;
    static int anInt9578;
    
    final void method3209(boolean bool) {
	if (bool != false)
	    anInt9577 = 26;
	anInt9563++;
	if (((Class348_Sub42_Sub10) this).anIntArray9566 != null) {
	    for (int i = 0;
		 ((Class348_Sub42_Sub10) this).anIntArray9566.length > i; i++)
		((Class348_Sub42_Sub10) this).anIntArray9566[i]
		    = Class273.method2057((((Class348_Sub42_Sub10) this)
					   .anIntArray9566[i]),
					  32768);
	}
    }
    
    final void method3210(byte i, int[] is, ByteBuffer class348_sub49) {
    while_221_:
	do {
	    try {
		anInt9560++;
		int i_0_ = -107 / ((-71 - i) / 50);
		if (anIntArray9574 != null) {
		    int i_1_ = 0;
		    for (;;) {
			if ((i_1_ ^ 0xffffffff)
			    <= (anIntArray9574.length ^ 0xffffffff))
			    break while_221_;
			if ((is.length ^ 0xffffffff) >= (i_1_ ^ 0xffffffff))
			    break;
			int i_2_ = ((Class138) method3212(0, i_1_)).anInt1945;
			if ((i_2_ ^ 0xffffffff) < -1)
			    class348_sub49.putVariableBitValue(i_2_, (long) is[i_1_],
						      (byte) 116);
			i_1_++;
		    }
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("td.C(" + i + ','
						 + (is != null ? "{...}"
						    : "null")
						 + ','
						 + (class348_sub49 != null
						    ? "{...}" : "null")
						 + ')'));
	    }
	    break;
	} while (false);
    }
    
    static final void method3211(byte i) {
	NpcDefinition.aClient1367.method83(true);
	anInt9569++;
	Class348_Sub3.method2739(0);
	Class289.anInt3699 = 0;
	Class348_Sub40_Sub36.aClass114_9456 = null;
	StringNode.anInt7213 = 0;
	Class239.aClass114_3145 = null;
	((ByteBuffer) Class299.gameBuffer).position = 0;
	int i_3_ = -122 % ((i - 13) / 45);
	AbstractConnection.aClass114_3133 = null;
	Class305.method2296(-99);
	Class348_Sub40_Sub30.anInt9383 = 0;
	Class50.aString863 = null;
	Class37.anInt496 = 0;
	Class169.aClass19Array2261 = null;
	Class125.anInt4930 = 0;
    }
    
    final Class138 method3212(int i, int i_4_) {
	anInt9561++;
	if (i != 0)
	    anIntArray9572 = null;
	if (anIntArray9574 == null || i_4_ < 0 || anIntArray9574.length < i_4_)
	    return null;
	return Class348_Sub5.method2752(anIntArray9574[i_4_], 0);
    }
    
    final int method3213(int i, int i_5_, boolean bool) {
	anInt9576++;
	if (bool != true)
	    method3213(41, 104, true);
	if (anIntArray9574 == null || i_5_ < 0
	    || (anIntArray9574.length ^ 0xffffffff) > (i_5_ ^ 0xffffffff))
	    return -1;
	if (anIntArrayArray9565[i_5_] == null || (i ^ 0xffffffff) > -1
	    || ((anIntArrayArray9565[i_5_].length ^ 0xffffffff)
		> (i ^ 0xffffffff)))
	    return -1;
	return anIntArrayArray9565[i_5_][i];
    }
    
    private final void method3214(int i, ByteBuffer class348_sub49,
				  int i_6_) {
	if (i_6_ == 60) {
	    if (i != 1) {
		if ((i ^ 0xffffffff) == -3) {
		    int i_7_ = class348_sub49.getUByte();
		    ((Class348_Sub42_Sub10) this).anIntArray9566
			= new int[i_7_];
		    for (int i_8_ = 0;
			 (i_7_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++)
			((Class348_Sub42_Sub10) this).anIntArray9566[i_8_]
			    = class348_sub49.getShort();
		} else if (i == 3) {
		    int i_9_ = class348_sub49.getUByte();
		    anIntArrayArray9565 = new int[i_9_][];
		    anIntArray9574 = new int[i_9_];
		    for (int i_10_ = 0;
			 (i_10_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff); i_10_++) {
			int i_11_ = class348_sub49.getShort();
			Class138 class138
			    = Class348_Sub5.method2752(i_11_, i_6_ + -60);
			if (class138 != null) {
			    anIntArray9574[i_10_] = i_11_;
			    anIntArrayArray9565[i_10_]
				= new int[((Class138) class138).anInt1944];
			    for (int i_12_ = 0;
				 ((i_12_ ^ 0xffffffff)
				  > (((Class138) class138).anInt1944
				     ^ 0xffffffff));
				 i_12_++)
				anIntArrayArray9565[i_10_][i_12_]
				    = class348_sub49
					  .getShort();
			}
		    }
		} else if (i == 4)
		    ((Class348_Sub42_Sub10) this).aBoolean9562 = false;
	    } else
		aStringArray9564
		    = (Class348_Sub40_Sub23.split
		       ('<', class348_sub49.getJStr()));
	    anInt9575++;
	}
    }
    
    public Class348_Sub42_Sub10() {
	/* empty */
    }
    
    final int method3215(byte i) {
	anInt9570++;
	if (i > -32)
	    ((Class348_Sub42_Sub10) this).anIntArray9566 = null;
	if (anIntArray9574 == null)
	    return 0;
	return anIntArray9574.length;
    }
    
    final String method3216(ByteBuffer class348_sub49, byte i) {
	anInt9578++;
	if (i < 33)
	    method3219(-91);
	StringBuffer stringbuffer = new StringBuffer(80);
	if (anIntArray9574 != null) {
	    for (int i_13_ = 0; i_13_ < anIntArray9574.length; i_13_++) {
		stringbuffer.append(aStringArray9564[i_13_]);
		stringbuffer.append
		    (((Class348_Sub42_Sub10) this).aClass355_9567.method3472
		     ((class348_sub49.method3368
		       ((((Class138)
			  Class348_Sub5.method2752(anIntArray9574[i_13_], 0))
			 .anInt1943),
			3060)),
		      anIntArrayArray9565[i_13_], -1, method3212(0, i_13_)));
	    }
	}
	stringbuffer.append(aStringArray9564[aStringArray9564.length + -1]);
	return stringbuffer.toString();
    }
    
    public static void method3217(byte i) {
	if (i != 61)
	    method3211((byte) -95);
	aClass299_9571 = null;
	anIntArray9572 = null;
    }
    
    final void method3218(ByteBuffer class348_sub49, int i) {
	anInt9568++;
	for (;;) {
	    int i_14_ = class348_sub49.getUByte();
	    if (i_14_ == 0)
		break;
	    method3214(i_14_, class348_sub49, 60);
	}
	if (i != 0)
	    method3217((byte) -66);
    }
    
    final String method3219(int i) {
	anInt9573++;
	if (i < 66)
	    aStringArray9564 = null;
	StringBuffer stringbuffer = new StringBuffer(80);
	if (aStringArray9564 == null)
	    return "";
	stringbuffer.append(aStringArray9564[0]);
	for (int i_15_ = 1; i_15_ < aStringArray9564.length; i_15_++) {
	    stringbuffer.append("...");
	    stringbuffer.append(aStringArray9564[i_15_]);
	}
	return stringbuffer.toString();
    }
    
    static {
	anIntArray9572 = new int[] { 16, 32, 64, 128 };
    }
}
