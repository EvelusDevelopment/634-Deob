/* Class216 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class216 implements Interface13
{
    int anInt4974;
    static IndexLoader indexLoader18;
    static int anInt4976;
    static int anInt4977;
    int anInt4978;
    static int anInt4979;
    float[] aFloatArray4980;
    
    static final void method1583(byte i) {
	anInt4977++;
	if ((r.anInt9721 ^ 0xffffffff) != 0) {
	    int i_0_ = Class258_Sub4.mouseMovementListener.method3597(true);
	    int i_1_ = Class258_Sub4.mouseMovementListener.method3594((byte) 72);
	    MouseEventNode class348_sub45
		= ((MouseEventNode)
		   Class318_Sub1_Sub3.aClass262_8744.getFirst(4));
	    if (class348_sub45 != null) {
		i_0_ = class348_sub45.method3308((byte) -128);
		i_1_ = class348_sub45.method3311(58);
	    }
	    int i_2_ = 0;
	    if (i != -73)
		anInt4976 = 105;
	    int i_3_ = 0;
	    if (Class59_Sub1.aBoolean5300) {
		i_2_ = s_Sub3.method4008((byte) -128);
		i_3_ = Class16.method260(false);
	    }
	    Class182.method1373(r.anInt9721, i_2_, i_2_,
				Class321.windowWidth + i_2_, i_1_, i_0_, -1391,
				i_0_ + i_2_,
				Class348_Sub42_Sub8_Sub2.windowHeight + i_3_,
				i_3_, i_3_ + i_1_, i_3_);
	    if (Class168.aClass46_2249 != null)
		Class228.method1630(0, i_3_ + i_1_, i_2_ + i_0_);
	}
    }
    
    public static void method1584(byte i) {
	if (i != -64)
	    method1584((byte) -48);
	indexLoader18 = null;
    }
    
    Class216(int i, int i_4_) {
	((Class216) this).anInt4978 = i_4_;
	((Class216) this).anInt4974 = i;
	((Class216) this).aFloatArray4980 = new float[i * i_4_];
    }
}
