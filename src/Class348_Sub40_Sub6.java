/* Class348_Sub40_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub6 extends Class348_Sub40
{
    static int anInt9131;
    static int anInt9132;
    private int anInt9133 = 32768;
    static byte[][][] aByteArrayArrayArray9134;
    static int[] anIntArray9135;
    static int anInt9136;
    static int anInt9137;
    static int anInt9138;
    static int anInt9139;
    
    public Class348_Sub40_Sub6() {
	super(3, false);
    }
    
    final int[] method3042(int i, int i_0_) {
	anInt9137++;
	int[] is = ((Class348_Sub40) this).aClass191_7032.method1433(0, i);
	if (i_0_ != 255)
	    method3049(null, -123, 82);
	if (((Class191) ((Class348_Sub40) this).aClass191_7032).aBoolean2570) {
	    int[] is_1_ = this.method3048(i, i_0_ + 633706082, 1);
	    int[] is_2_ = this.method3048(i, i_0_ ^ 0x25c5979e, 2);
	    for (int i_3_ = 0; (anInt9139 ^ 0xffffffff) < (i_3_ ^ 0xffffffff);
		 i_3_++) {
		int i_4_ = 0xff & is_1_[i_3_] >> -1057746428;
		int i_5_ = anInt9133 * is_2_[i_3_] >> 542117612;
		int i_6_ = Class127.anIntArray4654[i_4_] * i_5_ >> -978359348;
		int i_7_ = Class235.anIntArray3068[i_4_] * i_5_ >> 38221900;
		int i_8_
		    = i_3_ - -(i_6_ >> -1105470068) & Class239_Sub22.anInt6076;
		int i_9_
		    = i - -(i_7_ >> -1522742420) & Class299_Sub2.anInt6325;
		int[] is_10_ = this.method3048(i_9_, 633706337, 0);
		is[i_3_] = is_10_[i_8_];
	    }
	}
	return is;
    }
    
    public static void method3062(boolean bool) {
	if (bool != true)
	    aByteArrayArrayArray9134 = null;
	anIntArray9135 = null;
	aByteArrayArrayArray9134 = null;
    }
    
    final void method3049(ByteBuffer class348_sub49, int i, int i_11_) {
	int i_12_ = i;
	do {
	    if ((i_12_ ^ 0xffffffff) != -1) {
		if (i_12_ != 1)
		    break;
	    } else {
		anInt9133
		    = class348_sub49.getShort() << -1225450108;
		break;
	    }
	    ((Class348_Sub40) this).aBoolean7045
		= (class348_sub49.getUByte() ^ 0xffffffff) == -2;
	} while (false);
	if (i_11_ != 31015)
	    method3062(false);
	anInt9138++;
    }
    
    final void method3044(int i) {
	Class220.method1605(26188);
	anInt9136++;
	if (i < 108)
	    anInt9139 = 126;
    }
    
    final int[][] method3047(int i, int i_13_) {
	anInt9131++;
	int[][] is = ((Class348_Sub40) this).aClass322_7033
			 .method2557(i_13_ ^ 0x5d41e284, i);
	if (i_13_ != -1564599039)
	    aByteArrayArrayArray9134 = null;
	if (((Class322) ((Class348_Sub40) this).aClass322_7033).aBoolean4035) {
	    int[] is_14_ = this.method3048(i, 633706337, 1);
	    int[] is_15_ = this.method3048(i, 633706337, 2);
	    int[] is_16_ = is[0];
	    int[] is_17_ = is[1];
	    int[] is_18_ = is[2];
	    for (int i_19_ = 0; anInt9139 > i_19_; i_19_++) {
		int i_20_ = 0xff & 255 * is_14_[i_19_] >> 1215680268;
		int i_21_ = anInt9133 * is_15_[i_19_] >> -1594555700;
		int i_22_
		    = i_21_ * Class127.anIntArray4654[i_20_] >> 809053772;
		int i_23_
		    = i_21_ * Class235.anIntArray3068[i_20_] >> -1029082388;
		int i_24_
		    = i_19_ + (i_22_ >> 505579148) & Class239_Sub22.anInt6076;
		int i_25_
		    = (i_23_ >> -1087594612) + i & Class299_Sub2.anInt6325;
		int[][] is_26_ = this.method3039((byte) -57, i_25_, 0);
		is_16_[i_19_] = is_26_[0][i_24_];
		is_17_[i_19_] = is_26_[1][i_24_];
		is_18_[i_19_] = is_26_[2][i_24_];
	    }
	}
	return is;
    }
    
    static final int nextLoadingStage(boolean bool) {
	anInt9132++;
	int i = WidgetVariable.currentLoadingStage.getStageId();
	if (i < Class328_Sub2.loadingStages.length - 1)
	    WidgetVariable.currentLoadingStage = Class328_Sub2.loadingStages[1 + i];
	return 100;
    }
}
