/* Class203 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class203
{
    static int anInt2672;
    static int anInt2673;
    static volatile boolean aBoolean2674 = false;
    static int anInt2675;
    
    static final void method1477(int i, int i_0_) {
	anInt2672++;
	WidgetVariable class348_sub42_sub15
	    = Class318_Sub9_Sub1.method2516(i, (byte) 105, i_0_);
	class348_sub42_sub15.method3251(-16058);
    }
    
    static final BufferedPacket method1478(boolean bool) {
	anInt2673++;
	BufferedPacket class348_sub47 = Class300.getBufferedOutgoingPacket();
	if (bool != true)
	    return null;
	((BufferedPacket) class348_sub47).sizeType = 0;
	((BufferedPacket) class348_sub47).outgoingPacket = null;
	((BufferedPacket) class348_sub47).buffer
	    = new GameBuffer(5000);
	return class348_sub47;
    }
    
    static final void method1479(int i, byte i_1_, int i_2_, int i_3_) {
	anInt2675++;
	int i_4_ = i_2_ - -za_Sub2.anInt9780;
	int i_5_ = Class90.anInt1517 + i;
	if (Message.aClass357ArrayArrayArray2029 != null && i_2_ >= 0
	    && i >= 0
	    && (i_2_ ^ 0xffffffff) > (Class367_Sub4.anInt7319 ^ 0xffffffff)
	    && Class348_Sub40_Sub3.anInt9109 > i
	    && (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		    .aClass239_Sub27_7261.method1840(-32350) != 0
		|| i_3_ == (((Class318_Sub1)
			     Class132.localPlayer)
			    .aByte6381))) {
	    long l = (long) (i_5_ << 1618270446 | i_3_ << 1870646844 | i_4_);
	    Class348_Sub37 class348_sub37
		= ((Class348_Sub37)
		   Class130.aClass356_1895.get(l));
	    if (class348_sub37 == null)
		Class282.method2110(i_3_, i_2_, i);
	    else {
		Class348_Sub34 class348_sub34
		    = (Class348_Sub34) ((Class348_Sub37) class348_sub37)
					   .aClass262_6998.getFirst(4);
		if (class348_sub34 == null)
		    Class282.method2110(i_3_, i_2_, i);
		else {
		    Class318_Sub1_Sub2_Sub1 class318_sub1_sub2_sub1
			= ((Class318_Sub1_Sub2_Sub1)
			   Class282.method2110(i_3_, i_2_, i));
		    if (class318_sub1_sub2_sub1 == null)
			class318_sub1_sub2_sub1
			    = (new Class318_Sub1_Sub2_Sub1
			       (i_2_ << -524295447,
				aa_Sub1.aSArray5191[i_3_]
				    .method3982((byte) -86, i, i_2_),
				i << 1681443753, i_3_, i_3_));
		    else
			((Class318_Sub1_Sub2_Sub1) class318_sub1_sub2_sub1)
			    .anInt10189
			    = ((Class318_Sub1_Sub2_Sub1)
			       class318_sub1_sub2_sub1).anInt10180
			    = -1;
		    ((Class318_Sub1_Sub2_Sub1) class318_sub1_sub2_sub1)
			.anInt10181
			= ((Class348_Sub34) class348_sub34).anInt6973;
		    if (i_1_ >= -112)
			aBoolean2674 = true;
		    ((Class318_Sub1_Sub2_Sub1) class318_sub1_sub2_sub1)
			.anInt10185
			= ((Class348_Sub34) class348_sub34).anInt6971;
		    for (;;) {
			Class348_Sub34 class348_sub34_6_
			    = ((Class348_Sub34)
			       ((Class348_Sub37) class348_sub37)
				   .aClass262_6998.nextForward((byte) 55));
			if (class348_sub34_6_ == null)
			    break;
			if ((((Class318_Sub1_Sub2_Sub1)
			      class318_sub1_sub2_sub1).anInt10181
			     ^ 0xffffffff)
			    != (((Class348_Sub34) class348_sub34_6_).anInt6973
				^ 0xffffffff)) {
			    ((Class318_Sub1_Sub2_Sub1) class318_sub1_sub2_sub1)
				.anInt10189
				= (((Class348_Sub34) class348_sub34_6_)
				   .anInt6973);
			    ((Class318_Sub1_Sub2_Sub1) class318_sub1_sub2_sub1)
				.anInt10190
				= (((Class348_Sub34) class348_sub34_6_)
				   .anInt6971);
			    for (;;) {
				Class348_Sub34 class348_sub34_7_
				    = ((Class348_Sub34)
				       ((Class348_Sub37) class348_sub37)
					   .aClass262_6998
					   .nextForward((byte) 55));
				if (class348_sub34_7_ == null)
				    break;
				if ((((((Class348_Sub34) class348_sub34_7_)
				       .anInt6973)
				      ^ 0xffffffff)
				     != (((Class318_Sub1_Sub2_Sub1)
					  class318_sub1_sub2_sub1).anInt10181
					 ^ 0xffffffff))
				    && (((((Class348_Sub34) class348_sub34_7_)
					  .anInt6973)
					 ^ 0xffffffff)
					!= ((((Class318_Sub1_Sub2_Sub1)
					      class318_sub1_sub2_sub1)
					     .anInt10189)
					    ^ 0xffffffff))) {
				    ((Class318_Sub1_Sub2_Sub1)
				     class318_sub1_sub2_sub1).anInt10180
					= (((Class348_Sub34) class348_sub34_7_)
					   .anInt6973);
				    ((Class318_Sub1_Sub2_Sub1)
				     class318_sub1_sub2_sub1).anInt10186
					= (((Class348_Sub34) class348_sub34_7_)
					   .anInt6971);
				}
			    }
			    break;
			}
		    }
		    int i_8_
			= Class275.method2064(256 + (i_2_ << 841315273), i_3_,
					      11219, 256 + (i << -737638519));
		    ((Class318_Sub1) class318_sub1_sub2_sub1).anInt6388
			= i << 1186653097;
		    ((Class318_Sub1) class318_sub1_sub2_sub1).aByte6381
			= (byte) i_3_;
		    ((Class318_Sub1_Sub2_Sub1) class318_sub1_sub2_sub1)
			.anInt10196
			= 0;
		    ((Class318_Sub1) class318_sub1_sub2_sub1).anInt6377
			= i_2_ << -1403769975;
		    ((Class318_Sub1) class318_sub1_sub2_sub1).anInt6382 = i_8_;
		    ((Class318_Sub1) class318_sub1_sub2_sub1).aByte6376
			= (byte) i_3_;
		    if (NpcDefinition.method802(i, i_2_, true))
			((Class318_Sub1) class318_sub1_sub2_sub1).aByte6376++;
		    Class367_Sub2.method3536(i_3_, i_2_, i, i_8_,
					     class318_sub1_sub2_sub1);
		}
	    }
	}
    }
}
