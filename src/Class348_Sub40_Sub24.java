/* Class348_Sub40_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub24 extends Class348_Sub40
{
    static IncomingPacket aClass114_9324 = new IncomingPacket(85, 4);
    private int anInt9325 = 0;
    static int anInt9326;
    static int anInt9327 = 0;
    static int anInt9328;
    private int anInt9329 = 10;
    static int anInt9330;
    static int anInt9331;
    private int[] anIntArray9332;
    private int[] anIntArray9333;
    private int anInt9334 = 2048;
    
    final int[] method3042(int i, int i_0_) {
	if (i_0_ != 255)
	    anIntArray9333 = null;
	anInt9328++;
	int[] is = ((Class348_Sub40) this).aClass191_7032.method1433(0, i);
	if (((Class191) ((Class348_Sub40) this).aClass191_7032).aBoolean2570) {
	    int i_1_ = Class239_Sub18.anIntArray6035[i];
	    if (anInt9325 != 0) {
		for (int i_2_ = 0; i_2_ < Class348_Sub40_Sub6.anInt9139;
		     i_2_++) {
		    int i_3_ = 0;
		    int i_4_ = 0;
		    int i_5_ = Class318_Sub6.anIntArray6432[i_2_];
		    int i_6_ = anInt9325;
		while_197_:
		    do {
			do {
			    if (i_6_ != 1) {
				if (i_6_ != 2) {
				    if ((i_6_ ^ 0xffffffff) == -4)
					break;
				    break while_197_;
				}
			    } else {
				i_3_ = i_5_;
				break while_197_;
			    }
			    i_3_ = ((i_5_ + (-4096 - -i_1_) >> -1099071423)
				    + 2048);
			    break while_197_;
			} while (false);
			i_3_ = 2048 + (i_5_ - i_1_ >> 482406657);
		    } while (false);
		    for (i_6_ = 0;
			 (anInt9329 ^ 0xffffffff) < (i_6_ ^ 0xffffffff);
			 i_6_++) {
			if (i_3_ >= anIntArray9332[i_6_]
			    && i_3_ < anIntArray9332[1 + i_6_]) {
			    if ((anIntArray9333[i_6_] ^ 0xffffffff)
				< (i_3_ ^ 0xffffffff))
				i_4_ = 4096;
			    break;
			}
		    }
		    is[i_2_] = i_4_;
		}
	    } else {
		int i_7_ = 0;
		for (int i_8_ = 0; i_8_ < anInt9329; i_8_++) {
		    if ((anIntArray9332[i_8_] ^ 0xffffffff) >= (i_1_
								^ 0xffffffff)
			&& ((anIntArray9332[i_8_ + 1] ^ 0xffffffff)
			    < (i_1_ ^ 0xffffffff))) {
			if (anIntArray9333[i_8_] > i_1_)
			    i_7_ = 4096;
			break;
		    }
		}
		Class214.method1579(is, 0, Class348_Sub40_Sub6.anInt9139,
				    i_7_);
	    }
	}
	return is;
    }
    
    final void method3044(int i) {
	if (i < 108)
	    method3049(null, -68, -1);
	anInt9330++;
	method3116((byte) -111);
    }
    
    final void method3049(ByteBuffer class348_sub49, int i, int i_9_) {
	anInt9331++;
	int i_10_ = i;
    while_198_:
	do {
	    do {
		if (i_10_ != 0) {
		    if (i_10_ != 1) {
			if ((i_10_ ^ 0xffffffff) == -3)
			    break;
			break while_198_;
		    }
		} else {
		    anInt9329 = class348_sub49.getUByte();
		    break while_198_;
		}
		anInt9334 = class348_sub49.getShort();
		break while_198_;
	    } while (false);
	    anInt9325 = class348_sub49.getUByte();
	} while (false);
	if (i_9_ != 31015)
	    method3049(null, 38, 1);
    }
    
    public static void method3115(int i) {
	if (i <= -72)
	    aClass114_9324 = null;
    }
    
    private final void method3116(byte i) {
	anInt9326++;
	int i_11_ = 0;
	anIntArray9333 = new int[anInt9329 - -1];
	anIntArray9332 = new int[anInt9329 - -1];
	int i_12_ = 4096 / anInt9329;
	int i_13_ = i_12_ * anInt9334 >> -462355156;
	for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > (anInt9329 ^ 0xffffffff);
	     i_14_++) {
	    anIntArray9332[i_14_] = i_11_;
	    anIntArray9333[i_14_] = i_13_ + i_11_;
	    i_11_ += i_12_;
	}
	if (i != -111)
	    anIntArray9332 = null;
	anIntArray9332[anInt9329] = 4096;
	anIntArray9333[anInt9329] = 4096 - -anIntArray9333[0];
    }
    
    public Class348_Sub40_Sub24() {
	super(0, true);
    }
}
