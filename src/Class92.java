/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class92
{
    static int anInt1524;
    static AbstractRasterizer[] anInterface4Array1525;
    static int anInt1526;
    static int anInt1527;
    static float[] aFloatArray1528 = { 0.0F, -1.0F, 0.0F, 0.0F };
    
    static final void method858
	(boolean bool,
	 Player class318_sub1_sub3_sub3_sub2) {
	anInt1526++;
	Class348_Sub9 class348_sub9
	    = ((Class348_Sub9)
	       (FileIndexRequest.aClass356_10465.get
		((long) ((Class318_Sub1_Sub3_Sub3)
			 class318_sub1_sub3_sub3_sub2).anInt10290)));
	if (bool == true) {
	    if (class348_sub9 == null)
		Class223.method1614
		    (979190089, null,
		     ((Class318_Sub1) class318_sub1_sub3_sub3_sub2).aByte6381,
		     (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub2)
		      .anIntArray10317[0]),
		     (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub2)
		      .anIntArray10320[0]),
		     class318_sub1_sub3_sub3_sub2, null, 0);
	    else
		class348_sub9.method2781((byte) 21);
	}
    }
    
    static final void method859(int i) {
	anInt1527++;
	int i_0_ = StringNode.aByteArrayArray7212.length;
	if (i < -125) {
	    for (int i_1_ = 0; i_0_ > i_1_; i_1_++) {
		if (StringNode.aByteArrayArray7212[i_1_] != null) {
		    int i_2_ = -1;
		    for (int i_3_ = 0; i_3_ < Class27.anInt388; i_3_++) {
			if ((Class348_Sub23_Sub3.anIntArray9042[i_1_]
			     ^ 0xffffffff)
			    == (Class342.anIntArray4250[i_3_] ^ 0xffffffff)) {
			    i_2_ = i_3_;
			    break;
			}
		    }
		    if ((i_2_ ^ 0xffffffff) == 0) {
			Class342.anIntArray4250[Class27.anInt388]
			    = Class348_Sub23_Sub3.anIntArray9042[i_1_];
			i_2_ = Class27.anInt388++;
		    }
		    ByteBuffer class348_sub49
			= new ByteBuffer(StringNode.aByteArrayArray7212
					     [i_1_]);
		    int i_4_ = 0;
		    while ((StringNode.aByteArrayArray7212[i_1_].length
			    ^ 0xffffffff)
			   < (((ByteBuffer) class348_sub49).position
			      ^ 0xffffffff)) {
			if ((i_4_ ^ 0xffffffff) <= -512
			    || (Class150.anInt2057 ^ 0xffffffff) <= -1024)
			    break;
			int i_5_ = i_2_ | i_4_++ << 1526835142;
			int i_6_ = class348_sub49.getShort();
			int i_7_ = i_6_ >> -377444754;
			int i_8_ = 0x3f & i_6_ >> 1964330791;
			int i_9_ = i_6_ & 0x3f;
			int i_10_
			    = (i_8_
			       + (-za_Sub2.anInt9780
				  + (Class348_Sub23_Sub3.anIntArray9042[i_1_]
				     >> -1716641816) * 64));
			int i_11_ = (-Class90.anInt1517
				     + (64 * (0xff & (Class348_Sub23_Sub3
						      .anIntArray9042[i_1_]))
					- -i_9_));
			NpcDefinition class79
			    = (Class189.npcLoader.getNpcDefinition
			       (class348_sub49.getShort(), -1));
			Class348_Sub22 class348_sub22
			    = ((Class348_Sub22)
			       Class282.aClass356_3654.get((long) i_5_));
			if (class348_sub22 == null
			    && (((NpcDefinition) class79).aByte1325 & 0x1) > 0
			    && i_7_ == Class167.anInt2204
			    && (i_10_ ^ 0xffffffff) <= -1
			    && ((i_10_ - -((NpcDefinition) class79).anInt1399
				 ^ 0xffffffff)
				> (Class367_Sub4.anInt7319 ^ 0xffffffff))
			    && i_11_ >= 0
			    && ((i_11_ + ((NpcDefinition) class79).anInt1399
				 ^ 0xffffffff)
				> (Class348_Sub40_Sub3.anInt9109
				   ^ 0xffffffff))) {
			    Npc class318_sub1_sub3_sub3_sub1
				= new Npc();
			    ((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub1).anInt10290
				= i_5_;
			    Class348_Sub22 class348_sub22_12_
				= (new Class348_Sub22
				   (class318_sub1_sub3_sub3_sub1));
			    Class282.aClass356_3654.putNode
				((long) i_5_, class348_sub22_12_);
			    Class348_Sub40_Sub23.aClass348_Sub22Array9319
				[Class348_Sub32.anInt6930++]
				= class348_sub22_12_;
			    Class74.anIntArray1233[Class150.anInt2057++]
				= i_5_;
			    ((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub1).anInt10306
				= Class367_Sub11.logicCycle;
			    class318_sub1_sub3_sub3_sub1.method2448(class79,
								    -2);
			    class318_sub1_sub3_sub3_sub1.method2434
				((byte) 120,
				 ((NpcDefinition) (((Npc)
					      class318_sub1_sub3_sub3_sub1)
					     .definition)).anInt1399);
			    ((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub1).anInt10310
				= (((NpcDefinition) (((Npc)
						class318_sub1_sub3_sub3_sub1)
					       .definition)).anInt1329
				   << -1022992797);
			    class318_sub1_sub3_sub3_sub1.method2435
				((byte) -108,
				 (((NpcDefinition) (((Npc)
					       class318_sub1_sub3_sub3_sub1)
					      .definition)).aByte1355 - -4
				  & ~0x631ffff8) << -1060468053,
				 true);
			    class318_sub1_sub3_sub3_sub1.method2444
				(i_11_, true, i_10_, 123,
				 class318_sub1_sub3_sub3_sub1
				     .method2436((byte) 54),
				 i_7_);
			}
		    }
		}
	    }
	}
    }
    
    public static void method860(byte i) {
	anInterface4Array1525 = null;
	if (i > 43)
	    aFloatArray1528 = null;
    }
    
    static {
	anInt1524 = 765;
    }
}
