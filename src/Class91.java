/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class91
{
    static Class74 aClass74_1519;
    static int anInt1520;
    static int[] anIntArray1521 = { 7, 8, 9, 10, 11, 12, 13, 15 };
    static int anInt1522;
    static StringVarScriptSettingLoader scriptGlobalStrArgsLoader;
    
    static final void method855(int i, int i_0_, int i_1_) {
	anInt1520++;
	WidgetVariable class348_sub42_sub15
	    = Class318_Sub9_Sub1.method2516(i_1_, (byte) 105, i);
	class348_sub42_sub15.method3246(i ^ ~0x6397);
	((WidgetVariable) class348_sub42_sub15).intArg = i_0_;
    }
    
    static final void method856(byte i) {
	Class358.anInt4411 = 0;
	Class101.anInt1597 = 0;
	anInt1522++;
	Class348_Sub23_Sub3.anInt9041++;
	Class139.method1165(1);
	Class6.method204(-724138005);
	VarbitHandler.method1318(-65536);
	boolean bool = false;
	for (int i_2_ = 0; i_2_ < Class358.anInt4411; i_2_++) {
	    int i_3_ = Class5_Sub1_Sub1.anIntArray9932[i_2_];
	    Class348_Sub22 class348_sub22
		= ((Class348_Sub22)
		   Class282.aClass356_3654.get((long) i_3_));
	    Npc class318_sub1_sub3_sub3_sub1
		= (((Class348_Sub22) class348_sub22)
		   .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
	    if (Class5_Sub1.aBoolean8335
		&& Class348_Sub42_Sub1.method3169(i_3_, 0))
		Class286_Sub2.method2146((byte) 84);
	    if (((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub1)
		  .anInt10306)
		 ^ 0xffffffff)
		!= (Class348_Sub23_Sub3.anInt9041 ^ 0xffffffff)) {
		if (((Npc)
		     class318_sub1_sub3_sub3_sub1)
			.definition.method793(0))
		    Class5.method181(true, class318_sub1_sub3_sub3_sub1);
		class318_sub1_sub3_sub3_sub1.method2448(null, -2);
		class348_sub22.removeNode();
		bool = true;
	    }
	}
	if (bool) {
	    Class348_Sub32.anInt6930 = Class282.aClass356_3654.method3474(1);
	    Class282.aClass356_3654
		.method3477(3, Class348_Sub40_Sub23.aClass348_Sub22Array9319);
	}
	if (Class348_Sub40_Sub25.currentPacketSize
	    != ((ByteBuffer) Class299.gameBuffer).position)
	    throw new RuntimeException("gnp1 pos:"
				       + (((ByteBuffer)
					   Class299.gameBuffer)
					  .position)
				       + " psize:"
				       + Class348_Sub40_Sub25.currentPacketSize);
	if (i <= 47)
	    aClass74_1519 = null;
	for (int i_4_ = 0; Class150.anInt2057 > i_4_; i_4_++) {
	    if (Class282.aClass356_3654
		    .get((long) Class74.anIntArray1233[i_4_])
		== null)
		throw new RuntimeException("gnp2 pos:" + i_4_ + " size:"
					   + Class150.anInt2057);
	}
	if ((Class348_Sub32.anInt6930 - Class150.anInt2057 ^ 0xffffffff) != -1)
	    throw new RuntimeException("gnp3 mis:" + (Class348_Sub32.anInt6930
						      - Class150.anInt2057));
	for (int i_5_ = 0; i_5_ < Class348_Sub32.anInt6930; i_5_++) {
	    if (((Class318_Sub1_Sub3_Sub3)
		 (((Class348_Sub22)
		   Class348_Sub40_Sub23.aClass348_Sub22Array9319[i_5_])
		  .aClass318_Sub1_Sub3_Sub3_Sub1_6859)).anInt10306
		!= Class348_Sub23_Sub3.anInt9041)
		throw new RuntimeException
			  ("gnp4 uk:"
			   + (((Class318_Sub1_Sub3_Sub3)
			       (((Class348_Sub22) (Class348_Sub40_Sub23
						   .aClass348_Sub22Array9319
						   [i_5_]))
				.aClass318_Sub1_Sub3_Sub3_Sub1_6859))
			      .anInt10290));
	}
    }
    
    public static void method857(int i) {
	anIntArray1521 = null;
	scriptGlobalStrArgsLoader = null;
	aClass74_1519 = null;
	if (i < 121)
	    method856((byte) -72);
    }
    
    static {
	aClass74_1519 = new Class74(10, 8);
    }
}
