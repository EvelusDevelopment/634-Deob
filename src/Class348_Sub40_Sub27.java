/* Class348_Sub40_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.Clipboard;

final class Class348_Sub40_Sub27 extends Class348_Sub40
{
    static int anInt9356;
    static Clipboard systemClipboard;
    static int anInt9358;
    static int anInt9359;
    static int anInt9360;
    
    final int[][] method3047(int i, int i_0_) {
	if (i_0_ != -1564599039)
	    return null;
	anInt9356++;
	int[][] is = ((Class348_Sub40) this).aClass322_7033.method2557(-90, i);
	if (((Class322) ((Class348_Sub40) this).aClass322_7033).aBoolean4035) {
	    int[] is_1_ = this.method3048(i, i_0_ + -2096661920, 2);
	    int[][] is_2_ = this.method3039((byte) -74, i, 0);
	    int[][] is_3_ = this.method3039((byte) -58, i, 1);
	    int[] is_4_ = is[0];
	    int[] is_5_ = is[1];
	    int[] is_6_ = is[2];
	    int[] is_7_ = is_2_[0];
	    int[] is_8_ = is_2_[1];
	    int[] is_9_ = is_2_[2];
	    int[] is_10_ = is_3_[0];
	    int[] is_11_ = is_3_[1];
	    int[] is_12_ = is_3_[2];
	    for (int i_13_ = 0; ((Class348_Sub40_Sub6.anInt9139 ^ 0xffffffff)
				 < (i_13_ ^ 0xffffffff)); i_13_++) {
		int i_14_ = is_1_[i_13_];
		if (i_14_ != 4096) {
		    if ((i_14_ ^ 0xffffffff) != -1) {
			int i_15_ = 4096 + -i_14_;
			is_4_[i_13_]
			    = (is_10_[i_13_] * i_15_ + is_7_[i_13_] * i_14_
			       >> -1228186868);
			is_5_[i_13_]
			    = (is_11_[i_13_] * i_15_ + is_8_[i_13_] * i_14_
			       >> 604651308);
			is_6_[i_13_]
			    = (is_9_[i_13_] * i_14_ - -(is_12_[i_13_] * i_15_)
			       >> -354421652);
		    } else {
			is_4_[i_13_] = is_10_[i_13_];
			is_5_[i_13_] = is_11_[i_13_];
			is_6_[i_13_] = is_12_[i_13_];
		    }
		} else {
		    is_4_[i_13_] = is_7_[i_13_];
		    is_5_[i_13_] = is_8_[i_13_];
		    is_6_[i_13_] = is_9_[i_13_];
		}
	    }
	}
	return is;
    }
    
    final int[] method3042(int i, int i_16_) {
	if (i_16_ != 255)
	    return null;
	anInt9359++;
	int[] is = ((Class348_Sub40) this).aClass191_7032.method1433(0, i);
	if (((Class191) ((Class348_Sub40) this).aClass191_7032).aBoolean2570) {
	    int[] is_17_ = this.method3048(i, i_16_ ^ 0x25c5979e, 0);
	    int[] is_18_ = this.method3048(i, 633706337, 1);
	    int[] is_19_ = this.method3048(i, i_16_ + 633706082, 2);
	    for (int i_20_ = 0; Class348_Sub40_Sub6.anInt9139 > i_20_;
		 i_20_++) {
		int i_21_ = is_19_[i_20_];
		if (i_21_ != 4096) {
		    if ((i_21_ ^ 0xffffffff) == -1)
			is[i_20_] = is_18_[i_20_];
		    else
			is[i_20_]
			    = (i_21_ * is_17_[i_20_] - -(is_18_[i_20_]
							 * (-i_21_ + 4096))
			       >> 252256908);
		} else
		    is[i_20_] = is_17_[i_20_];
	    }
	}
	return is;
    }
    
    public static void method3121(byte i) {
	systemClipboard = null;
	if (i <= 21)
	    systemClipboard = null;
    }
    
    public Class348_Sub40_Sub27() {
	super(3, false);
    }
    
    final void method3049(ByteBuffer class348_sub49, int i, int i_22_) {
	anInt9358++;
	if (i_22_ != 31015)
	    anInt9360 = -16;
	if (i == 0)
	    ((Class348_Sub40) this).aBoolean7045
		= class348_sub49.getUByte() == 1;
    }
}
