/* Class59_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class59_Sub2_Sub2 extends Class59_Sub2
{
    static int anInt8675;
    static int anInt8676;
    static int anInt8677;
    static int anInt8678;
    static HashTable aClass356_8679 = new HashTable(16);
    static int anInt8680;
    private byte[] aByteArray8681;
    static int anInt8682;
    static IncomingPacket aClass114_8683 = new IncomingPacket(100, -1);
    static int[] anIntArray8684;
    static int anInt8685;
    
    static final void parseLobbyWorldList(ByteBuffer buffer) {
	anInt8675++;
	int amountLocations = buffer.getSmartA();
	MouseMovementListener.lobbyRegionInfo = new LobbyRegionInfo[amountLocations];
	for (int i_1_ = 0; i_1_ < amountLocations; i_1_++) {
	    MouseMovementListener.lobbyRegionInfo[i_1_] = new LobbyRegionInfo();
	    ((LobbyRegionInfo) MouseMovementListener.lobbyRegionInfo[i_1_]).country = buffer.getSmartA();
	    ((LobbyRegionInfo) MouseMovementListener.lobbyRegionInfo[i_1_]).region = buffer.getJStr2(-13487);
	}
	Class318_Sub1_Sub2.anInt8731 = buffer.getSmartA();
	Class239_Sub29.anInt6151 = buffer.getSmartA();
	Class225.amountWorlds = buffer.getSmartA();
	OutputStream_Sub1.lobbyWorldInfos = new LobbyWorld[1 + (Class239_Sub29.anInt6151 - Class318_Sub1_Sub2.anInt8731)];
	for (int i = 0; i < Class225.amountWorlds; i++) {
	    int i_3_ = buffer.getSmartA();
	    LobbyWorld class110_sub1 = (OutputStream_Sub1.lobbyWorldInfos[i_3_] = new LobbyWorld());
	    ((AbstractLobbyWorld) class110_sub1).location = buffer.getUByte();
	    ((AbstractLobbyWorld) class110_sub1).settings = buffer.getDWord();
	    ((LobbyWorld) class110_sub1).anInt5786 = Class318_Sub1_Sub2.anInt8731 + i_3_;
	    ((LobbyWorld) class110_sub1).activity = buffer.getJStr2(-13487);
	    ((LobbyWorld) class110_sub1).ipAddress = buffer.getJStr2(-13487);
	}
	Class5_Sub1.lobbyUnknown = buffer.getDWord();
	ModernLoadingScreen.aBoolean5013 = true;
    }
    
    public static void method570(int i) {
	if (i < 51)
	    method570(-85);
	aClass114_8683 = null;
	anIntArray8684 = null;
	aClass356_8679 = null;
    }
    
    public Class59_Sub2_Sub2() {
	super(12, 5, 16, 2, 2, 0.45F);
    }
    
    final byte[] method571(int i, byte i_4_, int i_5_, int i_6_) {
	aByteArray8681 = new byte[i_5_ * (i_6_ * (i * 2))];
	int i_7_ = -82 % ((i_4_ - 70) / 37);
	anInt8678++;
	this.method542(i, i_6_, 0, i_5_);
	return aByteArray8681;
    }
    
    final void method563(byte i, int i_8_, byte i_9_) {
	anInt8682++;
	i_9_ = (byte) (127 + ((0xff & i_9_) >> -745213055));
	int i_10_ = 2 * i_8_;
	aByteArray8681[i_10_++] = i_9_;
	aByteArray8681[i_10_] = i_9_;
	if (i <= 79)
	    method574(-29, -37, 73, null, true, (byte) -64, 2, -112, 50, null,
		      -65, null, -92, 30, -5);
    }
    
    static final String method572(String string, int i) {
	anInt8677++;
	if (i != 23034)
	    aClass356_8679 = null;
	int i_11_ = string.length();
	int i_12_ = 0;
	for (int i_13_ = 0; i_11_ > i_13_; i_13_++) {
	    char c = string.charAt(i_13_);
	    if (c == '<' || c == '>')
		i_12_ += 3;
	}
	StringBuffer stringbuffer = new StringBuffer(i_12_ + i_11_);
	for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
	    char c = string.charAt(i_14_);
	    if (c != 60) {
		if ((c ^ 0xffffffff) != -63)
		    stringbuffer.append(c);
		else
		    stringbuffer.append("<gt>");
	    } else
		stringbuffer.append("<lt>");
	}
	return stringbuffer.toString();
    }
    
    static final void method573(SubNode class348_sub42,
				SubNode class348_sub42_15_, byte i) {
	try {
	    if (((SubNode) class348_sub42).subnodeChild != null)
		class348_sub42.removeSubnode();
	    anInt8680++;
	    ((SubNode) class348_sub42).subnodeChild
		= class348_sub42_15_;
	    ((SubNode) class348_sub42).subnodeParent
		= ((SubNode) class348_sub42_15_).subnodeParent;
	    if (i != 63)
		anInt8685 = 110;
	    ((SubNode) (((SubNode) class348_sub42)
			       .subnodeChild)).subnodeParent
		= class348_sub42;
	    ((SubNode) (((SubNode) class348_sub42)
			       .subnodeParent)).subnodeChild
		= class348_sub42;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wd.F("
					     + (class348_sub42 != null
						? "{...}" : "null")
					     + ','
					     + (class348_sub42_15_ != null
						? "{...}" : "null")
					     + ',' + i + ')'));
	}
    }
    
    static final int method574
	(int i, int i_16_, int i_17_, int[] is, boolean bool, byte i_18_,
	 int i_19_, int i_20_, int i_21_, int[] is_22_, int i_23_,
	 Class361 class361, int i_24_, int i_25_, int i_26_) {
	try {
	    for (int i_27_ = 0; (i_27_ ^ 0xffffffff) > -129; i_27_++) {
		for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > -129; i_28_++) {
		    r.anIntArrayArray9723[i_27_][i_28_] = 0;
		    Class223.anIntArrayArray2900[i_27_][i_28_] = 99999999;
		}
	    }
	    anInt8676++;
	    boolean bool_29_;
	    if ((i_16_ ^ 0xffffffff) != -2) {
		if (i_16_ == 2)
		    bool_29_ = ObjectLoader.method2007(i_19_, -125, i_23_,
						   class361, i, i_21_, i_24_,
						   i_17_, i_25_, i_20_, i_26_);
		else
		    bool_29_
			= Class189.method1420(i_24_, i_26_, -73, i_21_, i_17_,
					      i, i_20_, i_25_, i_16_, class361,
					      i_19_, i_23_);
	    } else
		bool_29_ = Class5_Sub1.method187(i, i_23_, i_21_, i_26_, i_25_,
						 i_24_, class361, i_19_, i_17_,
						 i_20_, 1109655552);
	    int i_30_ = i_20_ - 64;
	    int i_31_ = i_21_ + -64;
	    int i_32_ = Class348_Sub40_Sub30.anInt9388;
	    int i_33_ = Class115.anInt1753;
	    if (!bool_29_) {
		if (!bool)
		    return -1;
		int i_34_ = 2147483647;
		int i_35_ = 2147483647;
		int i_36_ = 10;
		for (int i_37_ = -i_36_ + i; i - -i_36_ >= i_37_; i_37_++) {
		    for (int i_38_ = i_23_ - i_36_;
			 (i_23_ - -i_36_ ^ 0xffffffff) <= (i_38_ ^ 0xffffffff);
			 i_38_++) {
			int i_39_ = i_37_ - i_30_;
			int i_40_ = -i_31_ + i_38_;
			if ((i_39_ ^ 0xffffffff) <= -1 && i_40_ >= 0
			    && i_39_ < 128 && i_40_ < 128
			    && (Class223.anIntArrayArray2900[i_39_][i_40_]
				< 100)) {
			    int i_41_ = 0;
			    if ((i_37_ ^ 0xffffffff) <= (i ^ 0xffffffff)) {
				if (-1 + i_24_ + i < i_37_)
				    i_41_ = i_37_ - -1 - (i + i_24_);
			    } else
				i_41_ = -i_37_ + i;
			    int i_42_ = 0;
			    if (i_38_ >= i_23_) {
				if ((i_38_ ^ 0xffffffff)
				    < (i_17_ + (i_23_ - 1) ^ 0xffffffff))
				    i_42_ = -i_17_ - i_23_ - (-1 - i_38_);
			    } else
				i_42_ = -i_38_ + i_23_;
			    int i_43_ = i_41_ * i_41_ + i_42_ * i_42_;
			    if ((i_34_ ^ 0xffffffff) < (i_43_ ^ 0xffffffff)
				|| i_34_ == i_43_ && ((i_35_ ^ 0xffffffff)
						      < ((Class223
							  .anIntArrayArray2900
							  [i_39_][i_40_])
							 ^ 0xffffffff))) {
				i_34_ = i_43_;
				i_32_ = i_37_;
				i_35_ = (Class223.anIntArrayArray2900[i_39_]
					 [i_40_]);
				i_33_ = i_38_;
			    }
			}
		    }
		}
		if (i_34_ == 2147483647)
		    return -1;
	    }
	    if ((i_32_ ^ 0xffffffff) == (i_20_ ^ 0xffffffff)
		&& (i_21_ ^ 0xffffffff) == (i_33_ ^ 0xffffffff))
		return 0;
	    int i_44_ = 0;
	    if (i_18_ != 120)
		aClass114_8683 = null;
	    Class367_Sub11.anIntArray7397[i_44_] = i_32_;
	    Class205.anIntArray2694[i_44_++] = i_33_;
	    int i_46_;
	    int i_45_
		= (i_46_
		   = r.anIntArrayArray9723[i_32_ + -i_30_][-i_31_ + i_33_]);
	    while ((i_20_ ^ 0xffffffff) != (i_32_ ^ 0xffffffff)
		   || i_33_ != i_21_) {
		if ((i_45_ ^ 0xffffffff) != (i_46_ ^ 0xffffffff)) {
		    Class367_Sub11.anIntArray7397[i_44_] = i_32_;
		    i_46_ = i_45_;
		    Class205.anIntArray2694[i_44_++] = i_33_;
		}
		if ((i_45_ & 0x2 ^ 0xffffffff) == -1) {
		    if ((0x8 & i_45_) != 0)
			i_32_--;
		} else
		    i_32_++;
		if ((0x1 & i_45_) == 0) {
		    if ((0x4 & i_45_ ^ 0xffffffff) != -1)
			i_33_--;
		} else
		    i_33_++;
		i_45_ = r.anIntArrayArray9723[-i_30_ + i_32_][i_33_ + -i_31_];
	    }
	    int i_47_ = 0;
	    while ((i_44_-- ^ 0xffffffff) < -1) {
		is_22_[i_47_] = Class367_Sub11.anIntArray7397[i_44_];
		is[i_47_++] = Class205.anIntArray2694[i_44_];
		if (is_22_.length <= i_47_)
		    break;
	    }
	    return i_47_;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("wd.B(" + i + ',' + i_16_ + ',' + i_17_ + ','
			+ (is != null ? "{...}" : "null") + ',' + bool + ','
			+ i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ','
			+ (is_22_ != null ? "{...}" : "null") + ',' + i_23_
			+ ',' + (class361 != null ? "{...}" : "null") + ','
			+ i_24_ + ',' + i_25_ + ',' + i_26_ + ')'));
	}
    }
}
