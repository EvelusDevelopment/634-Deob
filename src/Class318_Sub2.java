/* Class318_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class318_Sub2 extends Class318
{
    static int[] anIntArray6393 = new int[8];
    int anInt6394;
    static int anInt6395;
    static int anInt6396;
    static int anInt6397;
    static int anInt6398;
    static int anInt6399;
    static Message[] messages = new Message[100];
    
    static final void method2494(int i, int i_0_, int i_1_, AbstractToolkit var_ha,
				 Class348_Sub42_Sub12 class348_sub42_sub12,
				 int i_2_, int i_3_, int i_4_, byte i_5_,
				 int i_6_, int i_7_, int i_8_) {
	do {
	    try {
		anInt6397++;
		if (i_5_ < 123)
		    method2499(27, -8, -96, 71, 72, (byte) 72, -82);
		if ((i_7_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff)
		    && (i_8_ ^ 0xffffffff) > (i_7_ + i_2_ ^ 0xffffffff)
		    && i_3_ > -13 + i_1_
		    && (i_3_ ^ 0xffffffff) > (i_1_ + 3 ^ 0xffffffff)
		    && (((Class348_Sub42_Sub12) class348_sub42_sub12)
			.aBoolean9610))
		    i_4_ = i_0_;
		int[] is = null;
		if (!Class148.method1197(-12081,
					 ((Class348_Sub42_Sub12)
					  class348_sub42_sub12).anInt9608)) {
		    if (((((Class348_Sub42_Sub12) class348_sub42_sub12)
			  .anInt9599)
			 ^ 0xffffffff)
			== 0) {
			if (!Class367_Sub8.method3549((((Class348_Sub42_Sub12)
							class348_sub42_sub12)
						       .anInt9608),
						      (byte) -119)) {
			    if (Class239_Sub21.method1813
				(8806,
				 (((Class348_Sub42_Sub12) class348_sub42_sub12)
				  .anInt9608))) {
				Object object = null;
				ObjectDefinition class51;
				if ((((Class348_Sub42_Sub12)
				      class348_sub42_sub12).anInt9608
				     ^ 0xffffffff)
				    != -1002)
				    class51
					= (Class348_Sub40_Sub12
					       .objectLoader.getObject
					   (0,
					    (int) (0x7fffffffL
						   & ((((Class348_Sub42_Sub12)
							class348_sub42_sub12)
						       .aLong9605)
						      >>> 1787173280))));
				else
				    class51
					= (Class348_Sub40_Sub12
					       .objectLoader.getObject
					   (0, (int) (((Class348_Sub42_Sub12)
						       class348_sub42_sub12)
						      .aLong9605)));
				if (((ObjectDefinition) class51).anIntArray945 != null)
				    class51 = (class51.method480
					       ((Class318_Sub1_Sub3_Sub3
						 .varbitHandler),
						(byte) 47));
				if (class51 != null)
				    is = ((ObjectDefinition) class51).anIntArray917;
			    }
			} else {
			    Class348_Sub22 class348_sub22
				= ((Class348_Sub22)
				   (Class282.aClass356_3654.get
				    ((long) (int) (((Class348_Sub42_Sub12)
						    class348_sub42_sub12)
						   .aLong9605))));
			    if (class348_sub22 != null) {
				Npc class318_sub1_sub3_sub3_sub1
				    = (((Class348_Sub22) class348_sub22)
				       .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
				NpcDefinition class79
				    = (((Npc)
					class318_sub1_sub3_sub3_sub1)
				       .definition);
				if (((NpcDefinition) class79).anIntArray1377 != null)
				    class79 = (class79.method794
					       ((Class318_Sub1_Sub3_Sub3
						 .varbitHandler),
						-1));
				if (class79 != null)
				    is = ((NpcDefinition) class79).anIntArray1342;
			    }
			}
		    } else
			is = ((ItemDefinition)
			      (ToolkitException.itemLoader.getItemDefinition
			       (113,
				(((Class348_Sub42_Sub12) class348_sub42_sub12)
				 .anInt9599)))).anIntArray2772;
		} else
		    is = (((ItemDefinition) (ToolkitException.itemLoader.getItemDefinition
				       (-67, (int) (((Class348_Sub42_Sub12)
						     class348_sub42_sub12)
						    .aLong9605))))
			  .anIntArray2772);
		String string
		    = BitmapTable.method2367((byte) 125, class348_sub42_sub12);
		if (is != null)
		    string += Class163.method1273(is, true);
		Deque.b12fullFontRasterizer.method2567(i_1_, string, (byte) 116,
						   i_4_, 0, i_7_ - -3,
						   Class341.aClass105Array4234,
						   Class175.anIntArray2330);
		if (!((Class348_Sub42_Sub12) class348_sub42_sub12)
		     .aBoolean9597)
		    break;
		Class239_Sub24.aClass105_6097.method974
		    (Class369.b12FullBitmapFont.method1183(true, string) + (i_7_
									 - -5),
		     -12 + i_1_);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929
			  (runtimeexception,
			   ("vo.C(" + i + ',' + i_0_ + ',' + i_1_ + ','
			    + (var_ha != null ? "{...}" : "null") + ','
			    + (class348_sub42_sub12 != null ? "{...}" : "null")
			    + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_
			    + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static void method2495(byte i) {
	if (i <= 110)
	    anIntArray6393 = null;
	anIntArray6393 = null;
	messages = null;
    }
    
    static final boolean method2496(int i, int i_9_, boolean bool) {
	if (bool != true)
	    method2497(null, (byte) -29, null, 73);
	anInt6396++;
	if (i >= 1000 && (i_9_ ^ 0xffffffff) > -1001)
	    return true;
	if ((i ^ 0xffffffff) > -1001 && i_9_ < 1000) {
	    if (NativeLibTracker.method2308((byte) 26, i_9_))
		return true;
	    if (NativeLibTracker.method2308((byte) 26, i))
		return false;
	    return true;
	}
	if ((i ^ 0xffffffff) <= -1001 && (i_9_ ^ 0xffffffff) <= -1001)
	    return true;
	return false;
    }
    
    Class318_Sub2(int i) {
	((Class318_Sub2) this).anInt6394 = i;
    }
    
    static final int method2497(byte[] is, byte i, String string, int i_10_) {
	try {
	    anInt6399++;
	    int i_11_ = i_10_;
	    int i_12_ = string.length();
	    int i_13_ = 0;
	    if (i != 0)
		method2496(21, -5, true);
	    for (/**/; (i_13_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff);
		 i_13_ += 4) {
		int i_14_ = Class186_Sub1.method1399(7, string.charAt(i_13_));
		int i_15_
		    = (i_12_ > i_13_ - -1
		       ? Class186_Sub1.method1399(7, string.charAt(1 + i_13_))
		       : -1);
		int i_16_
		    = (2 + i_13_ < i_12_
		       ? Class186_Sub1.method1399(7, string.charAt(i_13_ + 2))
		       : -1);
		int i_17_
		    = ((3 + i_13_ ^ 0xffffffff) <= (i_12_ ^ 0xffffffff) ? -1
		       : Class186_Sub1.method1399(7,
						  string.charAt(i_13_ + 3)));
		is[i_10_++] = (byte) Class273.method2057(i_14_ << -1270769342,
							 i_15_ >>> 1087501732);
		if ((i_16_ ^ 0xffffffff) == 0)
		    break;
		is[i_10_++]
		    = (byte) Class273.method2057((Class139.method1166(15,
								      i_15_)
						  << -2046845404),
						 i_16_ >>> 647108994);
		if (i_17_ == -1)
		    break;
		is[i_10_++]
		    = (byte) Class273.method2057((Class139.method1166(3, i_16_)
						  << -1508075802),
						 i_17_);
	    }
	    return -i_11_ + i_10_;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("vo.B("
					     + (is != null ? "{...}" : "null")
					     + ',' + i + ','
					     + (string != null ? "{...}"
						: "null")
					     + ',' + i_10_ + ')'));
	}
    }
    
    static final void method2498(Class338 class338, AbstractToolkit var_ha, byte i,
				 int i_18_) {
	try {
	    anInt6395++;
	    if (i > -101)
		anIntArray6393 = null;
	    if (Player.anIntArray10566 != null
		&& (i_18_ ^ 0xffffffff) >= (((Class338) class338).aByte4181
					    ^ 0xffffffff)) {
		for (int i_19_ = 0;
		     (i_19_
		      < Player.anIntArray10566.length);
		     i_19_++) {
		    if ((Player.anIntArray10566[i_19_]
			 != -1000000)
			&& (((((Class338) class338).anIntArray4191[0]
			      ^ 0xffffffff)
			     >= ((Player.anIntArray10566
				  [i_19_])
				 ^ 0xffffffff))
			    || (((Class338) class338).anIntArray4191[1]
				<= (Player
				    .anIntArray10566[i_19_]))
			    || (((Class338) class338).anIntArray4191[2]
				<= (Player
				    .anIntArray10566[i_19_]))
			    || ((Player.anIntArray10566
				 [i_19_])
				>= ((Class338) class338).anIntArray4191[3]))
			&& ((((Class338) class338).anIntArray4187[0]
			     <= Class59_Sub1_Sub2.anIntArray8666[i_19_])
			    || (((Class338) class338).anIntArray4187[1]
				<= Class59_Sub1_Sub2.anIntArray8666[i_19_])
			    || (((Class338) class338).anIntArray4187[2]
				<= Class59_Sub1_Sub2.anIntArray8666[i_19_])
			    || (Class59_Sub1_Sub2.anIntArray8666[i_19_]
				>= ((Class338) class338).anIntArray4187[3]))
			&& ((((Class338) class338).anIntArray4187[0]
			     >= Class250.anIntArray3220[i_19_])
			    || (Class250.anIntArray3220[i_19_]
				<= ((Class338) class338).anIntArray4187[1])
			    || (((Class338) class338).anIntArray4187[2]
				>= Class250.anIntArray3220[i_19_])
			    || (Class250.anIntArray3220[i_19_]
				<= ((Class338) class338).anIntArray4187[3]))
			&& ((Class299_Sub2_Sub1.anIntArray8712[i_19_]
			     >= ((Class338) class338).anIntArray4184[0])
			    || ((((Class338) class338).anIntArray4184[1]
				 ^ 0xffffffff)
				>= (Class299_Sub2_Sub1.anIntArray8712[i_19_]
				    ^ 0xffffffff))
			    || (((Class338) class338).anIntArray4184[2]
				<= Class299_Sub2_Sub1.anIntArray8712[i_19_])
			    || (Class299_Sub2_Sub1.anIntArray8712[i_19_]
				>= ((Class338) class338).anIntArray4184[3]))
			&& ((((Class338) class338).anIntArray4184[0]
			     >= Main.anIntArray5176[i_19_])
			    || (((Class338) class338).anIntArray4184[1]
				>= Main.anIntArray5176[i_19_])
			    || (((Class338) class338).anIntArray4184[2]
				>= Main.anIntArray5176[i_19_])
			    || (((Class338) class338).anIntArray4184[3]
				>= Main.anIntArray5176[i_19_])))
			return;
		}
	    }
	    if (((Class338) class338).aByte4192 == 1) {
		int i_20_ = (Class318_Sub1_Sub4_Sub1.anInt10084
			     + (-Class239_Sub25.anInt6111
				+ ((Class338) class338).aShort4185));
		if ((i_20_ ^ 0xffffffff) <= -1
		    && i_20_ <= (Class318_Sub1_Sub4_Sub1.anInt10084
				 + Class318_Sub1_Sub4_Sub1.anInt10084)) {
		    int i_21_ = (Class318_Sub1_Sub4_Sub1.anInt10084
				 + ((Class338) class338).aShort4193
				 - Class285_Sub2.anInt8502);
		    if ((i_21_ ^ 0xffffffff) > -1)
			i_21_ = 0;
		    else if ((i_21_ ^ 0xffffffff)
			     < ((Class318_Sub1_Sub4_Sub1.anInt10084
				 + Class318_Sub1_Sub4_Sub1.anInt10084)
				^ 0xffffffff))
			return;
		    int i_22_ = (-Class285_Sub2.anInt8502
				 + (((Class338) class338).aShort4190
				    - -Class318_Sub1_Sub4_Sub1.anInt10084));
		    if ((Class318_Sub1_Sub4_Sub1.anInt10084
			 - -Class318_Sub1_Sub4_Sub1.anInt10084)
			< i_22_)
			i_22_ = (Class318_Sub1_Sub4_Sub1.anInt10084
				 - -Class318_Sub1_Sub4_Sub1.anInt10084);
		    else if ((i_22_ ^ 0xffffffff) > -1)
			return;
		    boolean bool = false;
		    while ((i_21_ ^ 0xffffffff) >= (i_22_ ^ 0xffffffff)) {
			if (Class99.aBooleanArrayArray1572[i_20_][i_21_++]) {
			    bool = true;
			    break;
			}
		    }
		    if (bool) {
			float f = (float) (Class141.anInt1974
					   - (((Class338) class338)
					      .anIntArray4187[0]));
			if (f < 0.0F)
			    f *= -1.0F;
			if (!(f < (float) Class11.anInt194)
			    && Class354.method3465(0, 1, class338)
			    && Class354.method3465(1, 1, class338)
			    && Class354.method3465(2, 1, class338)
			    && Class354.method3465(3, 1, class338))
			    ClientScript.aClass338Array9700
				[Class348_Sub42_Sub10.anInt9577++]
				= class338;
		    }
		}
	    } else if (((Class338) class338).aByte4192 == 2) {
		int i_23_ = (Class318_Sub1_Sub4_Sub1.anInt10084
			     + (((Class338) class338).aShort4193
				- Class285_Sub2.anInt8502));
		if ((i_23_ ^ 0xffffffff) <= -1
		    && i_23_ <= (Class318_Sub1_Sub4_Sub1.anInt10084
				 + Class318_Sub1_Sub4_Sub1.anInt10084)) {
		    int i_24_ = (((Class338) class338).aShort4185
				 + (-Class239_Sub25.anInt6111
				    + Class318_Sub1_Sub4_Sub1.anInt10084));
		    if ((i_24_ ^ 0xffffffff) <= -1) {
			if (i_24_ > (Class318_Sub1_Sub4_Sub1.anInt10084
				     + Class318_Sub1_Sub4_Sub1.anInt10084))
			    return;
		    } else
			i_24_ = 0;
		    int i_25_ = (-Class239_Sub25.anInt6111
				 + (((Class338) class338).aShort4182
				    - -Class318_Sub1_Sub4_Sub1.anInt10084));
		    if ((Class318_Sub1_Sub4_Sub1.anInt10084
			 + Class318_Sub1_Sub4_Sub1.anInt10084)
			>= i_25_) {
			if ((i_25_ ^ 0xffffffff) > -1)
			    return;
		    } else
			i_25_ = (Class318_Sub1_Sub4_Sub1.anInt10084
				 + Class318_Sub1_Sub4_Sub1.anInt10084);
		    boolean bool = false;
		    while ((i_25_ ^ 0xffffffff) <= (i_24_ ^ 0xffffffff)) {
			if (Class99.aBooleanArrayArray1572[i_24_++][i_23_]) {
			    bool = true;
			    break;
			}
		    }
		    if (bool) {
			float f = (float) (Class348_Sub40_Sub27.anInt9360
					   - (((Class338) class338)
					      .anIntArray4184[0]));
			if (f < 0.0F)
			    f *= -1.0F;
			if (!(f < (float) Class11.anInt194)
			    && Class354.method3465(0, 1, class338)
			    && Class354.method3465(1, 1, class338)
			    && Class354.method3465(2, 1, class338)
			    && Class354.method3465(3, 1, class338))
			    ClientScript.aClass338Array9700
				[Class348_Sub42_Sub10.anInt9577++]
				= class338;
		    }
		}
	    } else if (((Class338) class338).aByte4192 == 16
		       || ((Class338) class338).aByte4192 == 8) {
		int i_26_ = (Class318_Sub1_Sub4_Sub1.anInt10084
			     + (-Class239_Sub25.anInt6111
				+ ((Class338) class338).aShort4185));
		if (i_26_ >= 0
		    && i_26_ <= (Class318_Sub1_Sub4_Sub1.anInt10084
				 - -Class318_Sub1_Sub4_Sub1.anInt10084)) {
		    int i_27_ = (((Class338) class338).aShort4193
				 + (-Class285_Sub2.anInt8502
				    - -Class318_Sub1_Sub4_Sub1.anInt10084));
		    if (i_27_ >= 0
			&& ((i_27_ ^ 0xffffffff)
			    >= ((Class318_Sub1_Sub4_Sub1.anInt10084
				 - -Class318_Sub1_Sub4_Sub1.anInt10084)
				^ 0xffffffff))
			&& Class99.aBooleanArrayArray1572[i_26_][i_27_]) {
			float f = (float) (Class141.anInt1974
					   - (((Class338) class338)
					      .anIntArray4187[0]));
			if (f < 0.0F)
			    f *= -1.0F;
			float f_28_ = (float) (Class348_Sub40_Sub27.anInt9360
					       + -(((Class338) class338)
						   .anIntArray4184[0]));
			if (f_28_ < 0.0F)
			    f_28_ *= -1.0F;
			if ((!(f < (float) Class11.anInt194)
			     || !((float) Class11.anInt194 > f_28_))
			    && Class354.method3465(0, 1, class338)
			    && Class354.method3465(1, 1, class338)
			    && Class354.method3465(2, 1, class338)
			    && Class354.method3465(3, 1, class338))
			    ClientScript.aClass338Array9700
				[Class348_Sub42_Sub10.anInt9577++]
				= class338;
		    }
		}
	    } else if ((((Class338) class338).aByte4192 ^ 0xffffffff) == -5) {
		float f = (float) (-Class232.anInt3006
				   + ((Class338) class338).anIntArray4191[0]);
		if (!(f <= (float) DirectxToolkit.anInt7714)) {
		    int i_29_ = (Class318_Sub1_Sub4_Sub1.anInt10084
				 + -Class285_Sub2.anInt8502
				 + ((Class338) class338).aShort4193);
		    if ((i_29_ ^ 0xffffffff) <= -1) {
			if ((Class318_Sub1_Sub4_Sub1.anInt10084
			     + Class318_Sub1_Sub4_Sub1.anInt10084)
			    < i_29_)
			    return;
		    } else
			i_29_ = 0;
		    int i_30_ = (Class318_Sub1_Sub4_Sub1.anInt10084
				 + -Class285_Sub2.anInt8502
				 + ((Class338) class338).aShort4190);
		    if (((Class318_Sub1_Sub4_Sub1.anInt10084
			  + Class318_Sub1_Sub4_Sub1.anInt10084)
			 ^ 0xffffffff)
			<= (i_30_ ^ 0xffffffff)) {
			if ((i_30_ ^ 0xffffffff) > -1)
			    return;
		    } else
			i_30_ = (Class318_Sub1_Sub4_Sub1.anInt10084
				 - -Class318_Sub1_Sub4_Sub1.anInt10084);
		    int i_31_ = (-Class239_Sub25.anInt6111
				 + (((Class338) class338).aShort4185
				    + Class318_Sub1_Sub4_Sub1.anInt10084));
		    if ((i_31_ ^ 0xffffffff) > -1)
			i_31_ = 0;
		    else if (i_31_ > (Class318_Sub1_Sub4_Sub1.anInt10084
				      + Class318_Sub1_Sub4_Sub1.anInt10084))
			return;
		    int i_32_ = (Class318_Sub1_Sub4_Sub1.anInt10084
				 + ((Class338) class338).aShort4182
				 - Class239_Sub25.anInt6111);
		    if ((Class318_Sub1_Sub4_Sub1.anInt10084
			 - -Class318_Sub1_Sub4_Sub1.anInt10084)
			< i_32_)
			i_32_ = (Class318_Sub1_Sub4_Sub1.anInt10084
				 + Class318_Sub1_Sub4_Sub1.anInt10084);
		    else if ((i_32_ ^ 0xffffffff) > -1)
			return;
		    boolean bool = false;
		while_102_:
		    for (int i_33_ = i_31_;
			 (i_32_ ^ 0xffffffff) <= (i_33_ ^ 0xffffffff);
			 i_33_++) {
			for (int i_34_ = i_29_;
			     (i_34_ ^ 0xffffffff) >= (i_30_ ^ 0xffffffff);
			     i_34_++) {
			    if (Class99.aBooleanArrayArray1572[i_33_][i_34_]) {
				bool = true;
				break while_102_;
			    }
			}
		    }
		    if (bool && Class354.method3465(0, 1, class338)
			&& Class354.method3465(1, 1, class338)
			&& Class354.method3465(2, 1, class338)
			&& Class354.method3465(3, 1, class338))
			ClientScript.aClass338Array9700
			    [Class348_Sub42_Sub10.anInt9577++]
			    = class338;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("vo.A("
					     + (class338 != null ? "{...}"
						: "null")
					     + ','
					     + (var_ha != null ? "{...}"
						: "null")
					     + ',' + i + ',' + i_18_ + ')'));
	}
    }
    
    static final boolean method2499(int i, int i_35_, int i_36_, int i_37_,
				    int i_38_, byte i_39_, int i_40_) {
	anInt6398++;
	if (!Class348_Sub40_Sub23.aBoolean9307 || !Class23.aBoolean351)
	    return false;
	if ((Class225.anInt2946 ^ 0xffffffff) > -101)
	    return false;
	if ((i_40_ ^ 0xffffffff) == (i_38_ ^ 0xffffffff) && i_36_ == i_35_) {
	    if (!aa_Sub2.method164(i, i_38_, (byte) -97, i_36_))
		return false;
	    int i_41_ = i_38_ << Class362.anInt4459;
	    int i_42_ = i_36_ << Class362.anInt4459;
	    if (Class121.method1084(i_37_, Class270.anInt3465, i_42_, i_41_,
				    aa_Sub1.aSArray5191[i]
					.method3982((byte) -86, i_36_, i_38_),
				    Class270.anInt3465, 18507)) {
		Class348_Sub40_Sub4.anInt9112++;
		return true;
	    }
	    return false;
	}
	if (i_39_ <= 101)
	    method2499(66, -39, -55, 105, 96, (byte) 114, -44);
	for (int i_43_ = i_38_; (i_40_ ^ 0xffffffff) <= (i_43_ ^ 0xffffffff);
	     i_43_++) {
	    for (int i_44_ = i_36_;
		 (i_35_ ^ 0xffffffff) <= (i_44_ ^ 0xffffffff); i_44_++) {
		if (Class354.anIntArrayArrayArray4356[i][i_43_][i_44_]
		    == -FileOnDisk.anInt3049)
		    return false;
	    }
	}
	int i_45_ = (i_38_ << Class362.anInt4459) + 1;
	int i_46_ = (i_36_ << Class362.anInt4459) + 2;
	if (!Class121.method1084(i_37_,
				 (1 + -i_38_ + i_40_) * Class270.anInt3465,
				 i_46_, i_45_,
				 aa_Sub1.aSArray5191[i]
				     .method3982((byte) -86, i_36_, i_38_),
				 Class270.anInt3465 * (i_35_ + -i_36_ + 1),
				 18507))
	    return false;
	Class348_Sub40_Sub4.anInt9112++;
	return true;
    }
}
