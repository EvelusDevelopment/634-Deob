/* ByteBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

class ByteBuffer extends Node
{
	static int anInt7137;
	static int anInt7138;
	static int anInt7139;
	static int anInt7140;
	static int anInt7141;
	static int anInt7142;
	static int anInt7143;
	static int anInt7144;
	static int anInt7145;
	static int anInt7146;
	static int anInt7147;
	static int anInt7148;
	static int anInt7149;
	static int anInt7150;
	static int anInt7151;
	static int anInt7152;
	static int anInt7153;
	byte[] payload;
	static int anInt7155;
	static int anInt7156;
	static int anInt7157;
	static int anInt7158;
	static int anInt7159;
	static int anInt7160;
	static int anInt7161;
	static int anInt7162;
	static int anInt7163;
	static int anInt7164;
	static int anInt7165;
	static int anInt7166;
	static int anInt7167;
	static int anInt7168;
	static int anInt7169;
	static int anInt7170;
	static int anInt7171;
	static int anInt7172;
	static int anInt7173;
	static int anInt7174;
	static Class223 aClass223_7175 = new Class223(1, 2);
	static int anInt7176;
	static int anInt7177;
	static int anInt7178;
	static int anInt7179;
	static int anInt7180;
	static int anInt7181;
	static int anInt7182;
	static int anInt7183;
	static int anInt7184;
	static int anInt7185;
	static int anInt7186;
	static int anInt7187;
	static int anInt7188;
	static int anInt7189;
	static int anInt7190;
	static int anInt7191;
	static int anInt7192;
	static int anInt7193;
	static int anInt7194;
	static int anInt7195;
	static int anInt7196;
	int position;
	static int anInt7198;
	static int anInt7199;
	static int anInt7200;
	static int anInt7201;
	static int anInt7202;
	static int anInt7203;
	static int anInt7204;
	static int anInt7205;
	static long[] aLongArray7206 = new long[32];
	static int anInt7207;
	static int anInt7208;
	static int anInt7209;

	final int method3329(byte i) {
		anInt7163++;
		if (i != 21)
			return -10;
		return (-(((ByteBuffer) this).payload
				[((ByteBuffer) this).position++])
				& 0xff);
	}

	final int getShort() {
		((ByteBuffer) this).position += 2;
		anInt7186++;
		return ((0xff & (((ByteBuffer) this).payload
				[-1 + ((ByteBuffer) this).position]))
				+ ((((ByteBuffer) this).payload
						[-2 + ((ByteBuffer) this).position]) << -423866104
						& 0xff00));
	}

	static final int method3331(int i, byte i_0_, int i_1_) {
		anInt7161++;
		int i_2_ = 1;
		for (/**/; (i ^ 0xffffffff) < -2; i >>= 1) {
			if ((0x1 & i ^ 0xffffffff) != -1)
				i_2_ *= i_1_;
			i_1_ *= i_1_;
		}
		int i_3_ = 3 / ((i_0_ - -24) / 46);
		if (i == 1)
			return i_2_ * i_1_;
		return i_2_;
	}

	final long method3332(byte i) {
		anInt7179++;
		long l = 0xffffffffL & (long) method3359(-45);
		long l_4_ = 0xffffffffL & (long) method3359(-99);
		return (l_4_ << 32) + l;
	}

	final void putJStr(byte i, String string) {
		anInt7172++;
		if (i != -5)
			((ByteBuffer) this).payload = null;
		int i_5_ = string.indexOf('\0');
		if ((i_5_ ^ 0xffffffff) <= -1)
			throw new IllegalArgumentException("NUL character at " + i_5_
					+ " - cannot pjstr");
		((ByteBuffer) this).position
		+= FileRequest.method3255(0,
				(((ByteBuffer) this)
						.payload),
						string.length(), false, string,
						(((ByteBuffer) this)
								.position));
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) 0;
	}

	final int method3334(int i) {
		anInt7208++;
		int i_6_ = 0;
		int i_7_;
		for (i_7_ = getSmartA(); i_7_ == 32767; i_7_ = getSmartA())
			i_6_ += 32767;
		i_6_ += i_7_;
		return i_6_;
	}

	final void method3335(int i, int i_9_) {
		anInt7156++;
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (i_9_ >> 1735754632);
		int i_10_ = -35 % ((-17 - i) / 48);
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (128 + i_9_);
	}

	final void method3336(int i, byte i_11_) {
		anInt7162++;
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (i >> 2087552840);
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) i;
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (i >> 170971960);
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (i >> 1925297808);
		if (i_11_ != 44)
			anInt7207 = 1;
	}

	final void putShort(int i_12_) {
		anInt7145++;
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (i_12_ >> -1309028440);
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) i_12_;
	}

	final void method3338(int i, int i_13_) {
		((ByteBuffer) this).payload
		[-4 + ((ByteBuffer) this).position - i_13_]
		 = (byte) (i_13_ >> -542723592);
		anInt7200++;
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position - i_13_ - 3]
		 = (byte) (i_13_ >> -2122166448);
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position - (i_13_ - -2)]
		 = (byte) (i_13_ >> -1715854296);
		((ByteBuffer) this).payload
		[i + (((ByteBuffer) this).position + -i_13_)]
		 = (byte) i_13_;
	}

	final void method3339(int i, int i_14_) {
		if (i > 91) {
			((ByteBuffer) this).payload
			[((ByteBuffer) this).position - i_14_ + -1]
			 = (byte) i_14_;
			anInt7185++;
		}
	}

	final void putTri(int i_15_) {
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (i_15_ >> 609757392);
		anInt7148++;
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (i_15_ >> 2119602728);
		
			((ByteBuffer) this).payload
			[((ByteBuffer) this).position++]
			 = (byte) i_15_;
	}

	final byte method3341(int i) {
		if (i != -8679)
			aClass223_7175 = null;
		anInt7195++;
		return (byte) (-128 + (((ByteBuffer) this).payload
				[((ByteBuffer) this).position++]));
	}

	final int method3342() {
		anInt7174++;
		return (-(((ByteBuffer) this).payload
				[((ByteBuffer) this).position++]) + 128
				& 0xff);
	}

	final int method3343(byte i) {
		((ByteBuffer) this).position += 4;
		anInt7184++;
		if (i != 82)
			getSmartA();
		return ((0xff0000
				& (((ByteBuffer) this).payload
						[((ByteBuffer) this).position - 1]) << -285487952)
						+ (((((ByteBuffer) this).payload
								[((ByteBuffer) this).position - 2]) << 842397944
								& ~0xffffff)
								+ ((0xff & (((ByteBuffer) this).payload
										[((ByteBuffer) this).position + -4]))
										<< -780792312)
										+ (0xff & (((ByteBuffer) this).payload
												[((ByteBuffer) this).position - 3]))));
	}

	final int method3344(int i, boolean bool) {
		anInt7165++;
		if (bool != false)
			((ByteBuffer) this).payload = null;
		int i_17_
		= Class171.method1319(((ByteBuffer) this).position, true,
				((ByteBuffer) this).payload, i);
		putInt(i_17_);
		return i_17_;
	}

	final byte method3345(int i) {
		if (i != -27697)
			anInt7207 = -57;
		anInt7138++;
		return (byte) (-(((ByteBuffer) this).payload
				[((ByteBuffer) this).position++])
				+ 128);
	}

	final int method3346(int i) {
		((ByteBuffer) this).position += 4;
		anInt7194++;
		return (((0xff & (((ByteBuffer) this).payload
				[-1 + ((ByteBuffer) this).position]))
				<< 891474632)
				+ (((((ByteBuffer) this).payload
						[-3 + ((ByteBuffer) this).position])
						& 0xff)
						<< -1077235208)
						- (-((0xff & (((ByteBuffer) this).payload
								[((ByteBuffer) this).position - 4]))
								<< 1612198288)
								+ -(0xff & (((ByteBuffer) this).payload
										[((ByteBuffer) this).position - 2]))));
	}

	final void getBytes(byte[] is, int i, int i_18_, byte i_19_) {
		anInt7183++;
		for (int i_20_ = -1 + i_18_ + i; i_20_ >= i; i_20_--)
			is[i_20_] = (((ByteBuffer) this).payload
					[((ByteBuffer) this).position++]);
	}

	final void method3348(int i, int i_22_) {
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) i_22_;
		anInt7164++;
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (i_22_ >> 939638280);
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (i_22_ >> 82099344);
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (i_22_ >> 624183032);
		int i_23_ = -32 / ((-74 - i) / 44);
	}

	final void method3349(int i, int i_24_) {
		if (i == 4325) {
			anInt7198++;
			((ByteBuffer) this).payload
			[((ByteBuffer) this).position++]
			 = (byte) (i_24_ - -128);
			((ByteBuffer) this).payload
			[((ByteBuffer) this).position++]
			 = (byte) (i_24_ >> 1484733832);
		}
	}

	final void encipherXTEA(int[] k, int off, int len) {
		anInt7137++;
		int i_26_ = ((ByteBuffer) this).position;
		((ByteBuffer) this).position = off;
		int i_27_ = (len - off) / 8;
		for (int i_28_ = 0; i_27_ > i_28_; i_28_++) {
			int i_29_ = getDWord();
			int i_30_ = getDWord();
			int i_31_ = 0;
			int i_32_ = -1640531527;
			int i_33_ = 32;
			while (i_33_-- > 0) {
				i_29_
				+= (i_31_ - -k[i_31_ & 0x3]
				                ^ (i_30_ >>> 2045357733 ^ i_30_ << 54454276) - -i_30_);
				i_31_ += i_32_;
				i_30_ += (i_31_ - -k[(0x1a0b & i_31_) >>> -1809168789]
				^ i_29_ + (i_29_ >>> 297047045
						^ i_29_ << -1189890044));
			}
			((ByteBuffer) this).position -= 8;
			putInt(i_29_);
			putInt(i_30_);
		}
		((ByteBuffer) this).position = i_26_;
	}

	final int getTri() {
		((ByteBuffer) this).position += 3;
		anInt7203++;
		return ((0xff00
				& (((ByteBuffer) this).payload
						[-2 + ((ByteBuffer) this).position]) << -1798246168)
						+ ((((((ByteBuffer) this).payload
								[-3 + ((ByteBuffer) this).position])
								& 0xff)
								<< -963972240)
								- -((((ByteBuffer) this).payload
										[-1 + ((ByteBuffer) this).position])
										& 0xff)));
	}

	final boolean method3352(int i) {
		anInt7168++;
		((ByteBuffer) this).position -= 4;
		if (i != -25541)
			method3369((byte) 56);
		int i_34_
		= Class171.method1319(((ByteBuffer) this).position, true,
				((ByteBuffer) this).payload, 0);
		int i_35_ = getDWord();
		if ((i_34_ ^ 0xffffffff) == (i_35_ ^ 0xffffffff))
			return true;
		return false;
	}

	final void method3353(int i, byte i_36_) {
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) i;
		if (i_36_ != 3)
			((ByteBuffer) this).payload = null;
		anInt7151++;
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (i >> 1724647496);
	}

	static final void method3354(int i) {
		if (Class348_Sub34.aHa6968 != null) {
			Class348_Sub34.aHa6968.destroy();
			Class348_Sub40_Sub9.aClass324_9173 = null;
			Class348_Sub34.aHa6968 = null;
		}
		int i_37_ = -97 % ((i - -14) / 37);
		anInt7173++;
	}

	final int method3355(int i) {
		anInt7158++;
		int i_38_ = -108 / ((i - 73) / 50);
		((ByteBuffer) this).position += 2;
		return (((((ByteBuffer) this).payload
				[-2 + ((ByteBuffer) this).position]) << 623366216
				& 0xff00)
				- -(0xff & -128 + (((ByteBuffer) this).payload
						[((ByteBuffer) this).position + -1])));
	}

	final void method3356(int i, int i_39_) {
		anInt7190++;
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (i >> 1701443792);
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (i >> 1037878616);
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) i;
		if (i_39_ != -4086)
			method3372(24);
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (i >> -517604728);
	}

	final void putVariableBitValue(int i, long l, byte i_40_) {
		try {
			anInt7193++;
			if ((--i ^ 0xffffffff) > -1 || (i ^ 0xffffffff) < -8)
				throw new IllegalArgumentException();
			int i_41_ = 101 % ((-11 - i_40_) / 49);
			for (int i_42_ = 8 * i; i_42_ >= 0; i_42_ -= 8)
				((ByteBuffer) this).payload
				[((ByteBuffer) this).position++]
				 = (byte) (int) (l >> i_42_);
		} catch (RuntimeException runtimeexception) {
			throw Class348_Sub17.method2929(runtimeexception,
					("cea.JB(" + i + ',' + l + ','
							+ i_40_ + ')'));
		}
	}

	final int readLEShort128(int i) {
		anInt7181++;
		if (i > -105)
			((ByteBuffer) this).payload = null;
		((ByteBuffer) this).position += 2;
		return (((((ByteBuffer) this).payload
				[((ByteBuffer) this).position + -2]) - 128
				& 0xff)
				+ ((((ByteBuffer) this).payload
						[-1 + ((ByteBuffer) this).position]) << 1771940328
						& 0xff00));
	}

	final int method3359(int i) {
		if (i > -17)
			aLongArray7206 = null;
		anInt7188++;
		((ByteBuffer) this).position += 4;
		return (((((ByteBuffer) this).payload
				[-3 + ((ByteBuffer) this).position]) << -1639885432
				& 0xff00)
				+ ((((ByteBuffer) this).payload
						[((ByteBuffer) this).position - 1]) << -1287952296
						& ~0xffffff)
						+ (((0xff & (((ByteBuffer) this).payload
								[((ByteBuffer) this).position + -2]))
								<< -645785616)
								+ ((((ByteBuffer) this).payload
										[-4 + ((ByteBuffer) this).position])
										& 0xff)));
	}

	final void method3360(byte i) {
		if (((ByteBuffer) this).payload != null)
			Class37.method357(0, ((ByteBuffer) this).payload);
		anInt7177++;
		((ByteBuffer) this).payload = null;
		if (i != -69)
			method3344(-115, true);
	}

	final byte method3361(int i) {
		anInt7150++;
		if (i != -622951480)
			aClass223_7175 = null;
		return (byte) -(((ByteBuffer) this).payload
				[((ByteBuffer) this).position++]);
	}

	final int method3362(byte i) {
		anInt7155++;
		int i_43_ = ((((ByteBuffer) this).payload
				[((ByteBuffer) this).position])
				& 0xff);
		if (i != 77)
			getByte();
		if (i_43_ < 128)
			return -64 + getUByte();
		return getShort() - 49152;
	}

	final int method3363(int i) {
		((ByteBuffer) this).position += 3;
		anInt7144++;
		if (i != -13309)
			setClientState(94, 83);
		return (((((ByteBuffer) this).payload
				[((ByteBuffer) this).position - 3])
				& 0xff)
				+ (((((ByteBuffer) this).payload
						[-2 + ((ByteBuffer) this).position]) << -1243326136
						& 0xff00)
						+ ((((ByteBuffer) this).payload
								[-1 + ((ByteBuffer) this).position]) << -1985557744
								& 0xff0000)));
	}

	final int method3364(byte i) {
		if (i > -117)
			((ByteBuffer) this).position = 61;
		((ByteBuffer) this).position += 4;
		anInt7167++;
		return ((0xff & (((ByteBuffer) this).payload
				[((ByteBuffer) this).position - 4]))
				+ (((0xff & (((ByteBuffer) this).payload
						[-3 + ((ByteBuffer) this).position]))
						<< 1235332232)
						+ (~0xffffff & ((((ByteBuffer) this).payload
								[((ByteBuffer) this).position - 1])
								<< -386128104))
								+ (((((ByteBuffer) this).payload
										[((ByteBuffer) this).position - 2])
										& 0xff)
										<< 132057776)));
	}

	final long getLong() {
		anInt7149++;
		long l = 0xffffffffL & (long) getDWord();
		long l_44_ = (long) getDWord() & 0xffffffffL;
		return l_44_ + (l << -456577760);
	}

	final int method3366(byte i) {
		anInt7170++;
		int i_45_ = (((ByteBuffer) this).payload
				[((ByteBuffer) this).position++]);
		int i_46_ = 0;
		if (i < 23)
			return -99;
		for (/**/; i_45_ < 0; i_45_ = (((ByteBuffer) this).payload
				[((ByteBuffer) this).position++]))
			i_46_ = (0x7f & i_45_ | i_46_) << -1218222233;
		return i_46_ | i_45_;
	}

	final void decipherXTEA(int[] k, int off, int len) {
		anInt7178++;
		int i_49_ = ((ByteBuffer) this).position;
		((ByteBuffer) this).position = off;
		int i_50_ = (len - off) / 8;
		for (int i_51_ = 0; (i_51_ ^ 0xffffffff) > (i_50_ ^ 0xffffffff);
		i_51_++) {
			int i_52_ = getDWord();
			int i_53_ = getDWord();
			int i_54_ = -957401312;
			int i_55_ = -1640531527;
			int i_56_ = 32;
			while ((i_56_-- ^ 0xffffffff) < -1) {
				i_53_ -= ((i_52_ << 870651652 ^ i_52_ >>> -1871304219) + i_52_
						^ i_54_ - -k[0x4d000003 & i_54_ >>> 1029019211]);
				i_54_ -= i_55_;
				i_52_
				-= (i_54_ - -k[i_54_ & 0x3]
				                ^ (i_53_ << 180482788 ^ i_53_ >>> 607818341) - -i_53_);
			}
			((ByteBuffer) this).position -= 8;
			putInt(i_52_);
			putInt(i_53_);
		}
		((ByteBuffer) this).position = i_49_;
	}

	final long method3368(int i, int i_57_) {
		i--;
		anInt7191++;
		if (i < 0 || (i ^ 0xffffffff) < -8)
			throw new IllegalArgumentException();
		int i_58_ = 8 * i;
		long l = 0L;
		for (/**/; i_58_ >= 0; i_58_ -= 8)
			l |= ((long) (((ByteBuffer) this).payload
					[((ByteBuffer) this).position++])
					& 0xffL) << i_58_;
		return l;
	}

	final int method3369(byte i) {
		if (i != 125)
			return 100;
		anInt7139++;
		((ByteBuffer) this).position += 3;
		int i_59_ = (((((ByteBuffer) this).payload
				[((ByteBuffer) this).position - 1])
				& 0xff)
				+ ((0xff0000 & ((((ByteBuffer) this).payload
						[((ByteBuffer) this).position + -3])
						<< 567264144))
						+ ((0xff & (((ByteBuffer) this).payload
								[((ByteBuffer) this).position + -2]))
								<< -270410424)));
		if ((i_59_ ^ 0xffffffff) < -8388608)
			i_59_ -= 16777216;
		return i_59_;
	}

	final void method3370(byte i, int i_60_) {
		int i_61_ = -4 % ((-35 - i) / 33);
		anInt7142++;
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (128 - i_60_);
	}

	final String getJStr2(int i) {
		anInt7152++;
		byte i_62_ = (((ByteBuffer) this).payload
				[((ByteBuffer) this).position++]);
		if (i_62_ != 0)
			throw new IllegalStateException("Bad version number in gjstr2");
		int i_63_ = ((ByteBuffer) this).position;
		while (((((ByteBuffer) this).payload
				[((ByteBuffer) this).position++])
				^ 0xffffffff)
				!= -1) {
			/* empty */
		}
		int i_64_ = ((ByteBuffer) this).position - (i_63_ + 1);
		if (i != -13487)
			putInt(-125);
		if (i_64_ == 0)
			return "";
		return Class367_Sub8.method3546(((ByteBuffer) this).payload,
				0, i_64_, i_63_);
	}

	final int method3372(int i) {
		anInt7204++;
		if (i != 13638)
			encipherXTEA(null, -23, -10);
		((ByteBuffer) this).position += 2;
		int i_65_ = (((((ByteBuffer) this).payload
				[((ByteBuffer) this).position - 1])
				& 0xff)
				+ (((((ByteBuffer) this).payload
						[-2 + ((ByteBuffer) this).position])
						& 0xff)
						<< 2010075272));
		if ((i_65_ ^ 0xffffffff) < -32768)
			i_65_ -= 65536;
		return i_65_;
	}

	final int readLEShort(boolean bool) {
		if (bool != false)
			return 113;
		anInt7171++;
		((ByteBuffer) this).position += 2;
		return ((0xff00
				& (((ByteBuffer) this).payload
						[((ByteBuffer) this).position - 1]) << -622951480)
						+ ((((ByteBuffer) this).payload
								[-2 + ((ByteBuffer) this).position])
								& 0xff));
	}

	final void method3374(byte i, int i_66_) {
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) -i_66_;
		if (i >= -27)
			((ByteBuffer) this).payload = null;
		anInt7140++;
	}

	final int method3375(byte i) {
		anInt7187++;
		((ByteBuffer) this).position += 2;
		int i_67_ = ((0xff & -128 + (((ByteBuffer) this).payload
				[((ByteBuffer) this).position - 1]))
				+ (((((ByteBuffer) this).payload
						[-2 + ((ByteBuffer) this).position])
						& 0xff)
						<< 1003977064));
		if (i != 84)
			return 85;
		if ((i_67_ ^ 0xffffffff) < -32768)
			i_67_ -= 65536;
		return i_67_;
	}

	public static void method3376(int i) {
		aLongArray7206 = null;
		aClass223_7175 = null;
		if (i != -2)
			method3376(-87);
	}

	final String getJStr() {
		anInt7166++;
		int i_69_ = ((ByteBuffer) this).position;
		while (((((ByteBuffer) this).payload
				[((ByteBuffer) this).position++])
				^ 0xffffffff)
				!= -1) {
			/* empty */
		}
		int i_70_ = -1 + ((ByteBuffer) this).position - i_69_;
		if (i_70_ == 0)
			return "";
		return Class367_Sub8.method3546(((ByteBuffer) this).payload,
				0, i_70_, i_69_);
	}

	final void putByte(int i) {
		anInt7160++;
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) i;
	}

	static final void setClientState(int i, int state) {
		anInt7201++;
		if (state != Class240.anInt4674) {
			if ((state ^ 0xffffffff) == -14) {
				if (Class348_Sub23_Sub3.sskeyStr != null)
					Class135_Sub2.method1157(RuntimeException_Sub1.anInt4596,
							(byte) -81);
				else
					Class253.method1922(Class186.aString2496,
							RuntimeException_Sub1.anInt4596,
							Class64_Sub3.aString5600, true);
			}
			if (state != 13 && ItemDefinition.aClass238_2773 != null) {
				ItemDefinition.aClass238_2773.method1700((byte) 36);
				ItemDefinition.aClass238_2773 = null;
			}
			if (state == 3)
				Class348_Sub42_Sub8.method3198(((r.anInt9721 ^ 0xffffffff)
						!= (Class285.anInt4737
								^ 0xffffffff)),
								(byte) -45);
			if ((state ^ 0xffffffff) == -8)
				Queue.method1006(((Class54.anInt970 ^ 0xffffffff)
						!= (r.anInt9721 ^ 0xffffffff)),
						(byte) 102);
			if (state == 5) {
				if (Class348_Sub23_Sub3.sskeyStr == null)
					Class151.method1213(Class64_Sub3.aString5600,
							Class186.aString2496, -124);
				else
					Class182.method1372(-1);
			} else if ((state ^ 0xffffffff) != -7) {
				if (state == 9) {
					if (Class348_Sub23_Sub3.sskeyStr != null)
						Class135_Sub2.method1157((RuntimeException_Sub1
								.anInt4596),
								(byte) -120);
					else
						Class253.method1922(Class186.aString2496,
								RuntimeException_Sub1.anInt4596,
								Class64_Sub3.aString5600, true);
				} else if ((state ^ 0xffffffff) == -13) {
					if (Class348_Sub23_Sub3.sskeyStr == null)
						Class151.method1213(Class64_Sub3.aString5600,
								Class186.aString2496, -98);
					else
						Class182.method1372(-1);
				}
			} else if (Class348_Sub23_Sub3.sskeyStr == null)
				Class253.method1922(Class186.aString2496, RuntimeException_Sub1.anInt4596, Class64_Sub3.aString5600, true);
			else
				Class135_Sub2.method1157(RuntimeException_Sub1.anInt4596,
						(byte) -99);
			if (Class318_Sub1_Sub1_Sub2.method2402(Class240.anInt4674,
					(byte) -78)) {
				((IndexLoader) Class95.indexLoader2).unpackSettings = 2;
				((IndexLoader) Class247.indexLoader17).unpackSettings = 2;
				((IndexLoader) Class94.indexLoader16).unpackSettings = 2;
				((IndexLoader) Class216.indexLoader18).unpackSettings = 2;
				((IndexLoader) Class174.indexLoader19).unpackSettings = 2;
				((IndexLoader) r_Sub2.indexLoader20).unpackSettings = 2;
				((IndexLoader) BufferedFile.indexLoader21).unpackSettings = 2;
			}
			if (Class318_Sub1_Sub1_Sub2.method2402(state, (byte) -119)) {
				Class31.anInt443 = 1;
				Class36.anInt489 = 0;
				Class348_Sub46.anInt7115 = 1;
				Class154.anInt2101 = 0;
				Class268.anInt3441 = 0;
				Class348_Sub42_Sub3.method3177(-111, true);
				((IndexLoader) Class95.indexLoader2).unpackSettings = 1;
				((IndexLoader) Class247.indexLoader17).unpackSettings = 1;
				((IndexLoader) Class94.indexLoader16).unpackSettings = 1;
				((IndexLoader) Class216.indexLoader18).unpackSettings = 1;
				((IndexLoader) Class174.indexLoader19).unpackSettings = 1;
				((IndexLoader) r_Sub2.indexLoader20).unpackSettings = 1;
				((IndexLoader) BufferedFile.indexLoader21).unpackSettings = 1;
			}
			if ((state ^ 0xffffffff) == -12 || (state ^ 0xffffffff) == -4)
				Class348_Sub40_Sub16.method3088(9);
			boolean bool = (i == state || Class348_Sub42_Sub8.method3196(state, i ^ ~0x58) || ArchiveFetcher.method2672(state, -100));
			boolean bool_72_ = (Class240.anInt4674 == 2
					|| Class348_Sub42_Sub8.method3196(Class240.anInt4674, -110)
					|| ArchiveFetcher.method2672(Class240.anInt4674, -128));
			if (bool != bool_72_) {
				if (!bool) {
					AbstractImageFetcher.method3007(2, 22684);
					Class348_Sub4.ondemandWorker.writeStatusUpdate(true);
				} else {
					RequiredElement.anInt3428 = Class345.anInt4270;
					if (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
							.aClass239_Sub26_7245.method1838(-32350)
							!= 0) {
						Class315.method2355(((Class348_Sub51)
								BitmapTable.aClass348_Sub51_3959)
								.aClass239_Sub26_7245
								.method1838(-32350),
								(byte) 50, false,
								Class59_Sub2_Sub1.indexLoader6,
								Class345.anInt4270, 0, 2);
						Class348_Sub40_Sub17_Sub1.method3093(i ^ 0x66);
					} else
						AbstractImageFetcher.method3007(2, 22684);
					Class348_Sub4.ondemandWorker.writeStatusUpdate(false);
				}
			}
			if (Class318_Sub1_Sub1_Sub2.method2402(state, (byte) -64)
					|| (state ^ 0xffffffff) == -14)
				Class348_Sub8.currentToolkit.method3673();
			Class240.anInt4674 = state;
		}
	}

	final void putBytes(int i, int i_73_, byte[] is) {
		for (int i_75_ = i_73_; i_73_ + i > i_75_; i_75_++)
			((ByteBuffer) this).payload
			[((ByteBuffer) this).position++]
			 = is[i_75_];
		anInt7199++;
	}

	final void method3381(int i, int i_77_) {
		anInt7180++;
		if ((i_77_ ^ 0xffffffff) <= -1 && (i_77_ ^ 0xffffffff) > -129)
			putByte(i_77_);
		else if ((i_77_ ^ 0xffffffff) <= -1 && i_77_ < 32768)
			putShort(i_77_ + 32768);
		else if (i == 5537)
			throw new IllegalArgumentException();
	}

	final int getSmartA() {
		anInt7176++;
		int i_78_ = 0xff & (((ByteBuffer) this).payload[((ByteBuffer) this).position]);
		if ((i_78_ ^ 0xffffffff) > -129)
			return getUByte();
		return getShort() - 32768;
	}

	final void method3383(int i, int i_79_) {
		anInt7157++;
		((ByteBuffer) this).payload
		[-2 + -i_79_ + ((ByteBuffer) this).position]
		 = (byte) (i_79_ >> 1809639944);
		if (i != 1809639944)
			encipherXTEA(null, 93, -39);
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position - i_79_ + -1]
		 = (byte) i_79_;
	}

	final String method3384(int i) {
		anInt7205++;
		if (i <= 105)
			aLongArray7206 = null;
		if ((((ByteBuffer) this).payload[((ByteBuffer) this).position]) == 0) {
			((ByteBuffer) this).position++;
			return null;
		}
		return getJStr();
	}

	final int getDWord() {
		anInt7196++;
		((ByteBuffer) this).position += 4;
		return ((0xff & (((ByteBuffer) this).payload
				[((ByteBuffer) this).position - 1]))
				+ ((((((ByteBuffer) this).payload
						[-4 + ((ByteBuffer) this).position])
						& 0xff)
						<< -684944360)
						+ (0xff0000 & ((((ByteBuffer) this).payload
								[-3 + ((ByteBuffer) this).position])
								<< -950421808)))
								- -(((((ByteBuffer) this).payload
										[-2 + ((ByteBuffer) this).position])
										& 0xff)
										<< -1279370072));
	}

	final void putJStr2(String string, int i) {
		anInt7182++;
		int i_81_ = string.indexOf('\0');
		if ((i_81_ ^ 0xffffffff) <= -1)
			throw new IllegalArgumentException("NUL character at " + i_81_
					+ " - cannot pjstr2");
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) 0;
		((ByteBuffer) this).position
		+= FileRequest.method3255(0,
				(((ByteBuffer) this)
						.payload),
						string.length(), false, string,
						(((ByteBuffer) this)
								.position));
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) 0;
	}

	final int getUByte() {
            anInt7153++;
            return ((((ByteBuffer) this).payload[((ByteBuffer) this).position++]) & 0xff);
	}

	final byte getByte() {
		anInt7143++;
		return (((ByteBuffer) this).payload
				[((ByteBuffer) this).position++]);
	}

	final void getBytes(byte[] is, int i_82_, int i_83_) {
		anInt7159++;
		for (int i_84_ = i_82_;
		(i_84_ ^ 0xffffffff) > (i_83_ + i_82_ ^ 0xffffffff); i_84_++)
			is[i_84_] = (((ByteBuffer) this).payload
					[((ByteBuffer) this).position++]);
	}

	final void applyRSA(BigInteger exponent, BigInteger modulus) {
		try {
                    anInt7147++;
                    int i_86_ = ((ByteBuffer) this).position;
                    ((ByteBuffer) this).position = 0;
                    byte[] is = new byte[i_86_];
                    getBytes(is, 0, i_86_);
                    BigInteger biginteger_87_ = new BigInteger(is);
                    BigInteger biginteger_88_ = biginteger_87_.modPow(exponent, modulus);
                    byte[] is_89_ = biginteger_88_.toByteArray();
                    ((ByteBuffer) this).position = 0;
                    putShort(is_89_.length);
		} catch (RuntimeException runtimeexception) {
			throw Class348_Sub17.method2929(runtimeexception, 
                              ("cea.SA(" + (modulus != null ? "{...}" : "null")
				+ ',' + (exponent != null? "{...}" : "null") + ')'));
		}
	}

	final void putInt(int i_90_) {
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (i_90_ >> 1721965944);
		anInt7202++;
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (i_90_ >> 45535056);
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (i_90_ >> 987749704);
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) i_90_;
	}

	final void putLong(long l) {
		try {
			((ByteBuffer) this).payload
			[((ByteBuffer) this).position++]
			 = (byte) (int) (l >> 138152824);
			anInt7209++;
			((ByteBuffer) this).payload
			[((ByteBuffer) this).position++]
			 = (byte) (int) (l >> -632684944);
			((ByteBuffer) this).payload
			[((ByteBuffer) this).position++]
			 = (byte) (int) (l >> -2057341784);
			((ByteBuffer) this).payload
			[((ByteBuffer) this).position++]
			 = (byte) (int) (l >> 715552864);
			((ByteBuffer) this).payload
			[((ByteBuffer) this).position++]
			 = (byte) (int) (l >> 1759137368);
			((ByteBuffer) this).payload
			[((ByteBuffer) this).position++]
			 = (byte) (int) (l >> -2116993776);
			((ByteBuffer) this).payload
			[((ByteBuffer) this).position++]
			 = (byte) (int) (l >> -686284600);
			((ByteBuffer) this).payload
			[((ByteBuffer) this).position++]
			 = (byte) (int) l;
		} catch (RuntimeException runtimeexception) {
			throw Class348_Sub17.method2929(runtimeexception,
					"cea.BB(" + l + ')');
		}
	}

	final int method3393(byte i) {
		anInt7169++;
		int i_92_ = 18 / ((-28 - i) / 40);
		return ((((ByteBuffer) this).payload
				[((ByteBuffer) this).position++]) - 128
				& 0xff);
	}

	ByteBuffer(int i) {
		((ByteBuffer) this).position = 0;
		((ByteBuffer) this).payload = Class37.method359(i, -1);
	}

	final void method3394(int i, int i_93_) {
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) i_93_;
		anInt7141++;
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (i_93_ >> -708775544);
		if (i == -23892) {
			((ByteBuffer) this).payload
			[((ByteBuffer) this).position++]
			 = (byte) (i_93_ >> -463536752);
			((ByteBuffer) this).payload
			[((ByteBuffer) this).position++]
			 = (byte) (i_93_ >> -1758839336);
		}
	}

	final void method3395(byte i, int i_94_) {
		anInt7192++;
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (i_94_ + 128);
		int i_95_ = -21 % ((-8 - i) / 57);
	}

	final void method3396(int i, int i_96_) {
		if (i_96_ > -5)
			aClass223_7175 = null;
		anInt7146++;
		if ((i & ~0x7f) != 0) {
			if ((i & ~0x3fff ^ 0xffffffff) != -1) {
				if ((~0x1fffff & i ^ 0xffffffff) != -1) {
					if ((i & ~0xfffffff) != 0)
						putByte(0x80 | i >>> 1028243868);
					putByte(0x80 | i >>> 955016565);
				}
				putByte((0x2000f4 | i) >>> -1096734770);
			}
			putByte(0x80 | i >>> -541352473);
		}
		putByte(i & 0x7f);
	}

	final void method3397(int i, int i_97_) {
		anInt7189++;
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) i_97_;
		((ByteBuffer) this).payload
		[((ByteBuffer) this).position++]
		 = (byte) (i_97_ >> 811935240);
	}

	ByteBuffer(byte[] is) {
            ((ByteBuffer) this).payload = is;
            ((ByteBuffer) this).position = 0;
	}
}
