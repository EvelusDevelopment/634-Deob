/* Class348_Sub40_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub12 extends Class348_Sub40
{
    static OutgoingPacket aClass351_9189 = new OutgoingPacket(28, 2);
    static int anInt9190;
    static int anInt9191;
    static int anInt9192;
    static int anInt9193;
    private int[][] anIntArrayArray9194;
    static ObjectLoader objectLoader;
    static int anInt9196;
    static IncomingPacket aClass114_9197 = new IncomingPacket(61, -1);
    static int anInt9198;
    private int[] anIntArray9199 = new int[257];
    static int anInt9200;
    
    final void method3049(ByteBuffer class348_sub49, int i, int i_0_) {
	if (i == 0) {
	    int i_1_ = class348_sub49.getUByte();
	    if ((i_1_ ^ 0xffffffff) != -1)
		method3078(i_1_, i_0_ + -31111);
	    else {
		anIntArrayArray9194
		    = new int[class348_sub49.getUByte()][4];
		for (int i_2_ = 0; anIntArrayArray9194.length > i_2_; i_2_++) {
		    anIntArrayArray9194[i_2_][0]
			= class348_sub49.getShort();
		    anIntArrayArray9194[i_2_][1]
			= class348_sub49.getUByte() << 7871428;
		    anIntArrayArray9194[i_2_][2]
			= class348_sub49.getUByte() << -327340252;
		    anIntArrayArray9194[i_2_][3]
			= ((class348_sub49.getUByte
			    ())
			   << 1256833060);
		}
	    }
	}
	anInt9190++;
	if (i_0_ != 31015)
	    method3077((byte) 100);
    }
    
    static final void method3076(int i, boolean bool) {
	anInt9198++;
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub27_7255),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub27_7261),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub14_7250),
						 1);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub14_7264),
						 1);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub4_7220),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub16_7247),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub9_7256),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub13_7236),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub1_7246),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub21_7270),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub7_7238),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub24_7235),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub28_7230),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub18_7259),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub20_7216),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub20_7248),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub15_7224),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub6_7226),
						 i);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub12_7243),
						 0);
	Class237.method1686(i ^ 0x6e);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub23_7231),
						 2);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub29_7229),
						 1);
	Class348_Sub40.method3038(-1);
	Class76.method773(true);
	RuntimeException_Sub1.aBoolean4604 = true;
    }
    
    final int[][] method3047(int i, int i_3_) {
	anInt9192++;
	int[][] is = ((Class348_Sub40) this).aClass322_7033
			 .method2557(i_3_ ^ 0x5d41e287, i);
	if (((Class322) ((Class348_Sub40) this).aClass322_7033).aBoolean4035) {
	    int[] is_4_ = this.method3048(i, 633706337, 0);
	    int[] is_5_ = is[0];
	    int[] is_6_ = is[1];
	    int[] is_7_ = is[2];
	    for (int i_8_ = 0;
		 ((i_8_ ^ 0xffffffff)
		  > (Class348_Sub40_Sub6.anInt9139 ^ 0xffffffff));
		 i_8_++) {
		int i_9_ = is_4_[i_8_] >> -1107729820;
		if ((i_9_ ^ 0xffffffff) > -1)
		    i_9_ = 0;
		if (i_9_ > 256)
		    i_9_ = 256;
		i_9_ = anIntArray9199[i_9_];
		is_5_[i_8_] = Class139.method1166(i_9_, 16711680) >> 684122924;
		is_6_[i_8_] = Class139.method1166(65280, i_9_) >> 104937220;
		is_7_[i_8_] = Class139.method1166(4080, i_9_ << -1353587132);
	    }
	}
	if (i_3_ != -1564599039)
	    return null;
	return is;
    }
    
    public static void method3077(byte i) {
	aClass351_9189 = null;
	aClass114_9197 = null;
	if (i != -98)
	    method3077((byte) 27);
	objectLoader = null;
    }
    
    final void method3044(int i) {
	if (i >= 108) {
	    anInt9196++;
	    if (anIntArrayArray9194 == null)
		method3078(1, -97);
	    method3079(-29547);
	}
    }
    
    private final void method3078(int i, int i_10_) {
	anInt9193++;
    while_157_:
	do {
	    if (i != 0) {
		int i_11_ = i;
	    while_156_:
		do {
		while_155_:
		    do {
		    while_154_:
			do {
			while_153_:
			    do {
				do {
				    if (i_11_ != 1) {
					if ((i_11_ ^ 0xffffffff) != -3) {
					    if ((i_11_ ^ 0xffffffff) != -4) {
						if ((i_11_ ^ 0xffffffff)
						    != -5) {
						    if (i_11_ != 5) {
							if (i_11_ != 6)
							    break while_156_;
						    } else
							break while_154_;
						    break while_155_;
						}
					    } else
						break;
					    break while_153_;
					}
				    } else {
					anIntArrayArray9194 = new int[2][4];
					anIntArrayArray9194[0][1] = 0;
					anIntArrayArray9194[0][2] = 0;
					anIntArrayArray9194[0][0] = 0;
					anIntArrayArray9194[0][3] = 0;
					anIntArrayArray9194[1][3] = 4096;
					anIntArrayArray9194[1][2] = 4096;
					anIntArrayArray9194[1][1] = 4096;
					anIntArrayArray9194[1][0] = 4096;
					break while_157_;
				    }
				    anIntArrayArray9194 = new int[8][4];
				    anIntArrayArray9194[0][3] = 2361;
				    anIntArrayArray9194[0][1] = 2650;
				    anIntArrayArray9194[0][0] = 0;
				    anIntArrayArray9194[0][2] = 2602;
				    anIntArrayArray9194[1][2] = 1799;
				    anIntArrayArray9194[1][1] = 2313;
				    anIntArrayArray9194[1][3] = 1558;
				    anIntArrayArray9194[1][0] = 2867;
				    anIntArrayArray9194[2][2] = 1734;
				    anIntArrayArray9194[2][1] = 2618;
				    anIntArrayArray9194[2][3] = 1413;
				    anIntArrayArray9194[2][0] = 3072;
				    anIntArrayArray9194[3][2] = 1220;
				    anIntArrayArray9194[3][0] = 3276;
				    anIntArrayArray9194[3][3] = 947;
				    anIntArrayArray9194[3][1] = 2296;
				    anIntArrayArray9194[4][2] = 963;
				    anIntArrayArray9194[4][3] = 722;
				    anIntArrayArray9194[4][0] = 3481;
				    anIntArrayArray9194[4][1] = 2072;
				    anIntArrayArray9194[5][3] = 1766;
				    anIntArrayArray9194[5][2] = 2152;
				    anIntArrayArray9194[5][0] = 3686;
				    anIntArrayArray9194[5][1] = 2730;
				    anIntArrayArray9194[6][2] = 1060;
				    anIntArrayArray9194[6][0] = 3891;
				    anIntArrayArray9194[6][1] = 2232;
				    anIntArrayArray9194[6][3] = 915;
				    anIntArrayArray9194[7][2] = 1413;
				    anIntArrayArray9194[7][3] = 1140;
				    anIntArrayArray9194[7][1] = 1686;
				    anIntArrayArray9194[7][0] = 4096;
				    break while_157_;
				} while (false);
				anIntArrayArray9194 = new int[7][4];
				anIntArrayArray9194[0][0] = 0;
				anIntArrayArray9194[0][1] = 0;
				anIntArrayArray9194[0][2] = 0;
				anIntArrayArray9194[0][3] = 4096;
				anIntArrayArray9194[1][3] = 4096;
				anIntArrayArray9194[1][1] = 0;
				anIntArrayArray9194[1][0] = 663;
				anIntArrayArray9194[1][2] = 4096;
				anIntArrayArray9194[2][0] = 1363;
				anIntArrayArray9194[2][2] = 4096;
				anIntArrayArray9194[2][1] = 0;
				anIntArrayArray9194[2][3] = 0;
				anIntArrayArray9194[3][0] = 2048;
				anIntArrayArray9194[3][2] = 4096;
				anIntArrayArray9194[3][3] = 0;
				anIntArrayArray9194[3][1] = 4096;
				anIntArrayArray9194[4][0] = 2727;
				anIntArrayArray9194[4][1] = 4096;
				anIntArrayArray9194[4][2] = 0;
				anIntArrayArray9194[4][3] = 0;
				anIntArrayArray9194[5][0] = 3411;
				anIntArrayArray9194[5][3] = 4096;
				anIntArrayArray9194[5][2] = 0;
				anIntArrayArray9194[5][1] = 4096;
				anIntArrayArray9194[6][2] = 0;
				anIntArrayArray9194[6][3] = 4096;
				anIntArrayArray9194[6][0] = 4096;
				anIntArrayArray9194[6][1] = 0;
				break while_157_;
			    } while (false);
			    anIntArrayArray9194 = new int[6][4];
			    anIntArrayArray9194[0][2] = 0;
			    anIntArrayArray9194[0][1] = 0;
			    anIntArrayArray9194[0][3] = 0;
			    anIntArrayArray9194[0][0] = 0;
			    anIntArrayArray9194[1][3] = 1493;
			    anIntArrayArray9194[1][1] = 0;
			    anIntArrayArray9194[1][2] = 0;
			    anIntArrayArray9194[1][0] = 1843;
			    anIntArrayArray9194[2][3] = 2939;
			    anIntArrayArray9194[2][2] = 0;
			    anIntArrayArray9194[2][1] = 0;
			    anIntArrayArray9194[2][0] = 2457;
			    anIntArrayArray9194[3][3] = 3565;
			    anIntArrayArray9194[3][1] = 0;
			    anIntArrayArray9194[3][2] = 1124;
			    anIntArrayArray9194[3][0] = 2781;
			    anIntArrayArray9194[4][2] = 3084;
			    anIntArrayArray9194[4][0] = 3481;
			    anIntArrayArray9194[4][1] = 546;
			    anIntArrayArray9194[4][3] = 4031;
			    anIntArrayArray9194[5][0] = 4096;
			    anIntArrayArray9194[5][3] = 4096;
			    anIntArrayArray9194[5][2] = 4096;
			    anIntArrayArray9194[5][1] = 4096;
			    break while_157_;
			} while (false);
			anIntArrayArray9194 = new int[16][4];
			anIntArrayArray9194[0][0] = 0;
			anIntArrayArray9194[0][3] = 321;
			anIntArrayArray9194[0][2] = 192;
			anIntArrayArray9194[0][1] = 80;
			anIntArrayArray9194[1][0] = 155;
			anIntArrayArray9194[1][2] = 449;
			anIntArrayArray9194[1][3] = 562;
			anIntArrayArray9194[1][1] = 321;
			anIntArrayArray9194[2][0] = 389;
			anIntArrayArray9194[2][3] = 803;
			anIntArrayArray9194[2][1] = 578;
			anIntArrayArray9194[2][2] = 690;
			anIntArrayArray9194[3][1] = 947;
			anIntArrayArray9194[3][3] = 1140;
			anIntArrayArray9194[3][0] = 671;
			anIntArrayArray9194[3][2] = 995;
			anIntArrayArray9194[4][1] = 1285;
			anIntArrayArray9194[4][3] = 1509;
			anIntArrayArray9194[4][2] = 1397;
			anIntArrayArray9194[4][0] = 897;
			anIntArrayArray9194[5][2] = 1429;
			anIntArrayArray9194[5][3] = 1413;
			anIntArrayArray9194[5][0] = 1175;
			anIntArrayArray9194[5][1] = 1525;
			anIntArrayArray9194[6][0] = 1368;
			anIntArrayArray9194[6][2] = 1461;
			anIntArrayArray9194[6][1] = 1734;
			anIntArrayArray9194[6][3] = 1333;
			anIntArrayArray9194[7][2] = 1525;
			anIntArrayArray9194[7][1] = 1413;
			anIntArrayArray9194[7][0] = 1507;
			anIntArrayArray9194[7][3] = 1702;
			anIntArrayArray9194[8][3] = 2056;
			anIntArrayArray9194[8][1] = 1108;
			anIntArrayArray9194[8][2] = 1590;
			anIntArrayArray9194[8][0] = 1736;
			anIntArrayArray9194[9][2] = 2056;
			anIntArrayArray9194[9][3] = 2666;
			anIntArrayArray9194[9][0] = 2088;
			anIntArrayArray9194[9][1] = 1766;
			anIntArrayArray9194[10][0] = 2355;
			anIntArrayArray9194[10][2] = 2586;
			anIntArrayArray9194[10][1] = 2409;
			anIntArrayArray9194[10][3] = 3276;
			anIntArrayArray9194[11][2] = 3148;
			anIntArrayArray9194[11][3] = 3228;
			anIntArrayArray9194[11][1] = 3116;
			anIntArrayArray9194[11][0] = 2691;
			anIntArrayArray9194[12][3] = 3196;
			anIntArrayArray9194[12][0] = 3031;
			anIntArrayArray9194[12][1] = 3806;
			anIntArrayArray9194[12][2] = 3710;
			anIntArrayArray9194[13][3] = 3019;
			anIntArrayArray9194[13][1] = 3437;
			anIntArrayArray9194[13][2] = 3421;
			anIntArrayArray9194[13][0] = 3522;
			anIntArrayArray9194[14][1] = 3116;
			anIntArrayArray9194[14][2] = 3148;
			anIntArrayArray9194[14][3] = 3228;
			anIntArrayArray9194[14][0] = 3727;
			anIntArrayArray9194[15][2] = 2505;
			anIntArrayArray9194[15][3] = 2746;
			anIntArrayArray9194[15][1] = 2377;
			anIntArrayArray9194[15][0] = 4096;
			break while_157_;
		    } while (false);
		    anIntArrayArray9194 = new int[4][4];
		    anIntArrayArray9194[0][1] = 0;
		    anIntArrayArray9194[0][2] = 4096;
		    anIntArrayArray9194[0][3] = 0;
		    anIntArrayArray9194[0][0] = 2048;
		    anIntArrayArray9194[1][0] = 2867;
		    anIntArrayArray9194[1][3] = 0;
		    anIntArrayArray9194[1][1] = 4096;
		    anIntArrayArray9194[1][2] = 4096;
		    anIntArrayArray9194[2][0] = 3276;
		    anIntArrayArray9194[2][1] = 4096;
		    anIntArrayArray9194[2][3] = 0;
		    anIntArrayArray9194[2][2] = 4096;
		    anIntArrayArray9194[3][0] = 4096;
		    anIntArrayArray9194[3][2] = 0;
		    anIntArrayArray9194[3][1] = 4096;
		    anIntArrayArray9194[3][3] = 0;
		    break while_157_;
		} while (false);
		throw new RuntimeException("Invalid gradient preset");
	    }
	} while (false);
	if (i_10_ > -95)
	    anInt9200 = -61;
    }
    
    private final void method3079(int i) {
	anInt9191++;
	if (i != -29547)
	    method3076(-28, false);
	int i_12_ = anIntArrayArray9194.length;
	if ((i_12_ ^ 0xffffffff) < -1) {
	    for (int i_13_ = 0; i_13_ < 257; i_13_++) {
		int i_14_ = 0;
		int i_15_ = i_13_ << -1331710044;
		for (int i_16_ = 0; i_16_ < i_12_; i_16_++) {
		    if (anIntArrayArray9194[i_16_][0] > i_15_)
			break;
		    i_14_++;
		}
		int i_17_;
		int i_18_;
		int i_19_;
		if (i_14_ >= i_12_) {
		    int[] is = anIntArrayArray9194[i_12_ + -1];
		    i_17_ = is[1];
		    i_19_ = is[2];
		    i_18_ = is[3];
		} else {
		    int[] is = anIntArrayArray9194[i_14_];
		    if ((i_14_ ^ 0xffffffff) >= -1) {
			i_17_ = is[1];
			i_18_ = is[3];
			i_19_ = is[2];
		    } else {
			int[] is_20_ = anIntArrayArray9194[-1 + i_14_];
			int i_21_ = ((i_15_ - is_20_[0] << -959332244)
				     / (-is_20_[0] + is[0]));
			int i_22_ = -i_21_ + 4096;
			i_17_
			    = is_20_[1] * i_22_ + is[1] * i_21_ >> -1444451732;
			i_18_ = (i_21_ * is[3] - -(i_22_ * is_20_[3])
				 >> 1800015980);
			i_19_ = is_20_[2] * i_22_ + is[2] * i_21_ >> -74674484;
		    }
		}
		i_19_ >>= 4;
		i_17_ >>= 4;
		i_18_ >>= 4;
		if (i_17_ < 0)
		    i_17_ = 0;
		else if ((i_17_ ^ 0xffffffff) < -256)
		    i_17_ = 255;
		if (i_18_ >= 0) {
		    if ((i_18_ ^ 0xffffffff) < -256)
			i_18_ = 255;
		} else
		    i_18_ = 0;
		if ((i_19_ ^ 0xffffffff) <= -1) {
		    if (i_19_ > 255)
			i_19_ = 255;
		} else
		    i_19_ = 0;
		anIntArray9199[i_13_]
		    = (Class273.method2057
		       (i_18_, Class273.method2057(i_17_ << -1135762768,
						   i_19_ << -2037449336)));
	    }
	}
    }
    
    public Class348_Sub40_Sub12() {
	super(1, false);
    }
}
