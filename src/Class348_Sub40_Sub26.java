/* Class348_Sub40_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub26 extends Class348_Sub40
{
    private int anInt9344 = 4096;
    static int anInt9345;
    static int anInt9346 = 0;
    private int anInt9347 = 4096;
    static int anInt9348;
    static int anInt9349;
    static int anInt9350;
    static boolean[] activeToolkits;
    static boolean aBoolean9352 = true;
    static int anInt9353;
    private int anInt9354 = 4096;
    static int anInt9355;
    
    public static void method3118(byte i) {
	activeToolkits = null;
	int i_0_ = 37 / ((28 - i) / 61);
    }
    
    static final boolean method3119(int i, int i_1_, int i_2_) {
	if (i_1_ <= 39)
	    method3119(-106, 118, -21);
	anInt9355++;
	if ((i & 0xc580 ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
    
    final int[][] method3047(int i, int i_3_) {
	if (i_3_ != -1564599039)
	    return null;
	anInt9353++;
	int[][] is = ((Class348_Sub40) this).aClass322_7033
			 .method2557(i_3_ + 1564598957, i);
	if (((Class322) ((Class348_Sub40) this).aClass322_7033).aBoolean4035) {
	    int[][] is_4_ = this.method3039((byte) -60, i, 0);
	    int[] is_5_ = is_4_[0];
	    int[] is_6_ = is_4_[1];
	    int[] is_7_ = is_4_[2];
	    int[] is_8_ = is[0];
	    int[] is_9_ = is[1];
	    int[] is_10_ = is[2];
	    for (int i_11_ = 0; ((Class348_Sub40_Sub6.anInt9139 ^ 0xffffffff)
				 < (i_11_ ^ 0xffffffff)); i_11_++) {
		int i_12_ = is_5_[i_11_];
		int i_13_ = is_7_[i_11_];
		int i_14_ = is_6_[i_11_];
		if (i_13_ != i_12_
		    || (i_14_ ^ 0xffffffff) != (i_13_ ^ 0xffffffff)) {
		    is_8_[i_11_] = anInt9344;
		    is_9_[i_11_] = anInt9354;
		    is_10_[i_11_] = anInt9347;
		} else {
		    is_8_[i_11_] = i_12_ * anInt9344 >> -1822350100;
		    is_9_[i_11_] = anInt9354 * i_13_ >> 1973584748;
		    is_10_[i_11_] = anInt9347 * i_14_ >> -2011567156;
		}
	    }
	}
	return is;
    }
    
    static final void method3120(int i) {
	Class312.anInt3931 = 0;
	anInt9345++;
	int i_15_ = Class299.gameBuffer.method3342();
	int i_16_ = Class299.gameBuffer.readLEShort128(-117);
	int i_17_ = Class299.gameBuffer.readLEShort(false);
	boolean bool
	    = ((Class299.gameBuffer.method3329((byte) 21)
		^ 0xffffffff)
	       == -2);
	
	System.out.println("i_15_: "+i_15_);
	System.out.println("i_16_: "+i_16_);
	System.out.println("i_17_: "+i_17_);
	
	Class322.method2554((byte) -45);
	Class348_Sub40_Sub22.method3111(111, i_15_);
	int i_18_
	    = (-((ByteBuffer) Class299.gameBuffer).position
	       + Class348_Sub40_Sub25.currentPacketSize) / 16;
	Class239_Sub6.anIntArrayArray5894 = new int[i_18_][4];
	for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
	    for (int i_20_ = 0; i_20_ < 4; i_20_++)
		Class239_Sub6.anIntArrayArray5894[i_19_][i_20_]
		    = Class299.gameBuffer
			  .getDWord();
	}
	Class348_Sub23_Sub1.aByteArrayArray8996 = new byte[i_18_][];
	Class129.aByteArrayArray1887 = new byte[i_18_][];
	aa_Sub1.anIntArray5192 = new int[i_18_];
	Class14_Sub4.aByteArrayArray8642 = new byte[i_18_][];
	GameApplet.anIntArray38 = new int[i_18_];
	StringNode.aByteArrayArray7212 = null;
	r.anIntArray9724 = new int[i_18_];
	Class322.anIntArray4031 = null;
	Class347.aByteArrayArray4281 = new byte[i_18_][];
	if (i >= -47)
	    anInt9349 = -54;
	Class295.anIntArray3759 = new int[i_18_];
	Class348_Sub23_Sub3.anIntArray9042 = new int[i_18_];
	i_18_ = 0;
	for (int i_21_
		 = (-(Class367_Sub4.anInt7319 >> -647938396) + i_17_) / 8;
	     i_21_ <= (i_17_ + (Class367_Sub4.anInt7319 >> -1293697276)) / 8;
	     i_21_++) {
	    for (int i_22_ = (i_16_ - (Class348_Sub40_Sub3.anInt9109
				       >> -1689129020)) / 8;
		 ((((Class348_Sub40_Sub3.anInt9109 >> -163377948) + i_16_) / 8
		   ^ 0xffffffff)
		  <= (i_22_ ^ 0xffffffff));
		 i_22_++) {
		Class348_Sub23_Sub3.anIntArray9042[i_18_]
		    = i_22_ + (i_21_ << -209519576);
		aa_Sub1.anIntArray5192[i_18_]
		    = Class367_Sub10.indexLoader5
			  .getArchiveId("m" + i_21_ + "_" + i_22_);
		GameApplet.anIntArray38[i_18_]
		    = Class367_Sub10.indexLoader5
			  .getArchiveId("l" + i_21_ + "_" + i_22_);
		Class295.anIntArray3759[i_18_]
		    = Class367_Sub10.indexLoader5
			  .getArchiveId("um" + i_21_ + "_" + i_22_);
		r.anIntArray9724[i_18_]
		    = Class367_Sub10.indexLoader5
			  .getArchiveId("ul" + i_21_ + "_" + i_22_);
		i_18_++;
	    }
	}
	Class348_Sub41.method3157(i_16_, (byte) 123, i_17_, 11, bool);
    }
    
    final void method3049(ByteBuffer class348_sub49, int i, int i_23_) {
	do {
	    try {
		int i_24_ = i;
	    while_201_:
		do {
		    do {
			if (i_24_ != 0) {
			    if (i_24_ != 1) {
				if ((i_24_ ^ 0xffffffff) == -3)
				    break;
				break while_201_;
			    }
			} else {
			    anInt9344
				= class348_sub49.getShort();
			    break while_201_;
			}
			anInt9354 = class348_sub49.getShort();
			break while_201_;
		    } while (false);
		    anInt9347 = class348_sub49.getShort();
		} while (false);
		anInt9350++;
		if (i_23_ == 31015)
		    break;
		method3118((byte) 96);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("uf.F("
						 + (class348_sub49 != null
						    ? "{...}" : "null")
						 + ',' + i + ',' + i_23_
						 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public Class348_Sub40_Sub26() {
	super(1, false);
    }
    
    static {
	activeToolkits = new boolean[8];
    }
}
