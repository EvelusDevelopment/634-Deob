/* Class348_Sub42_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub42_Sub18 extends SubNode
{
    static int anInt9681;
    Class318_Sub1_Sub3_Sub5 aClass318_Sub1_Sub3_Sub5_9682;
    static int anInt9683;
    static OutgoingPacket aClass351_9684 = new OutgoingPacket(81, 3);
    static Class251 aClass251_9685 = new Class251();
    static int anInt9686;
    
    static final void method3273(boolean bool, int i,
				 Class348_Sub16_Sub3 class348_sub16_sub3) {
	if (i > -55)
	    method3275(117, -54, 56);
	Class348_Sub40.aClass279_7042.method2088(false, class348_sub16_sub3);
	anInt9681++;
	if (bool)
	    Class318_Sub7.method2510(Class129.indexLoader4,
				     class348_sub16_sub3,
				     Class239_Sub4.indexLoader14, false,
				     Class348_Sub40.aClass279_7042,
				     Class123.indexLoader15);
    }
    
    public static void method3274(boolean bool) {
	if (bool != true)
	    method3273(true, -84, null);
	aClass351_9684 = null;
	aClass251_9685 = null;
    }
    
    Class348_Sub42_Sub18(Class318_Sub1_Sub3_Sub5 class318_sub1_sub3_sub5) {
	((Class348_Sub42_Sub18) this).aClass318_Sub1_Sub3_Sub5_9682
	    = class318_sub1_sub3_sub5;
    }
    
    static final void method3275(int i, int i_0_, int i_1_) {
	anInt9683++;
	if (i != 1)
	    aClass351_9684 = null;
	if (Class348_Sub42_Sub8_Sub2.gameType
	    != Class14_Sub4.aClass230_8638) {
	    if (!Class298.method2252(false, i_1_, i_0_, (byte) -108, 1, 0, 1,
				     -3, 0))
		Class298.method2252(false, i_1_, i_0_, (byte) -99, 1, 0, 1, -2,
				    0);
	} else if (!Class298.method2252(false, i_1_, i_0_, (byte) -128, 1, 0,
					1, -2, 0))
	    Class298.method2252(false, i_1_, i_0_, (byte) -115, 1, 0, 1, -3,
				0);
    }
}
