/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class4 {
	int anInt126;
	private static short[] aShortArray127 = new short[500];
	short[] aShortArray128;
	boolean aBoolean129;
	short[] aShortArray130;
	boolean aBoolean131 = false;
	byte[] aByteArray132;
	private static short[] aShortArray133 = new short[500];
	Class348_Sub33 aClass348_Sub33_134;
	short[] aShortArray135;
	private static byte[] aByteArray136 = new byte[500];
	short[] aShortArray137;
	private static short[] aShortArray138 = new short[500];
	boolean aBoolean139;
	short[] aShortArray140;
	private static short[] aShortArray141;
	private static short[] aShortArray142 = new short[500];

	Class4(byte[] is, Class348_Sub33 class348_sub33) {
		((Class4) this).aBoolean129 = false;
		((Class4) this).aClass348_Sub33_134 = null;
		((Class4) this).aBoolean139 = false;
		((Class4) this).anInt126 = 0;
		((Class4) this).aClass348_Sub33_134 = class348_sub33;
		try {
			ByteBuffer class348_sub49 = new ByteBuffer(is);
			ByteBuffer class348_sub49_0_ = new ByteBuffer(is);
			class348_sub49.getUByte();
			((ByteBuffer) class348_sub49).position += 2;
			int i = class348_sub49.getUByte();//byte
			int i_1_ = 0;
			int i_2_ = -1;
			int i_3_ = -1;
			((ByteBuffer) class348_sub49_0_).position = ((ByteBuffer) class348_sub49).position
					+ i;
			for (int i_4_ = 0; i_4_ < i; i_4_++) {
				int i_5_ = (((Class348_Sub33) ((Class4) this).aClass348_Sub33_134).anIntArray6957[i_4_]);
				if (i_5_ == 0)
					i_2_ = i_4_;
				int i_6_ = class348_sub49.getUByte();//byte
				if (i_6_ > 0) {
					if (i_5_ == 0)
						i_3_ = i_4_;
					aShortArray141[i_1_] = (short) i_4_;
					short i_7_ = 0;
					if (i_5_ == 3 || i_5_ == 10)
						i_7_ = (short) 128;
					if ((i_6_ & 0x1) != 0)
						aShortArray127[i_1_] = (short) class348_sub49_0_.method3362((byte) 77);//smart
					else
						aShortArray127[i_1_] = i_7_;
					if ((i_6_ & 0x2) != 0)
						aShortArray133[i_1_] = (short) class348_sub49_0_.method3362((byte) 77);//smart
					else
						aShortArray133[i_1_] = i_7_;
					if ((i_6_ & 0x4) != 0)
						aShortArray142[i_1_] = (short) class348_sub49_0_.method3362((byte) 77);//smart
					else
						aShortArray142[i_1_] = i_7_;
					aByteArray136[i_1_] = (byte) (i_6_ >>> 3 & 0x3);
					if (i_5_ == 2 || i_5_ == 9) {
						aShortArray127[i_1_] = (short) (aShortArray127[i_1_] << 2 & 0x3fff);
						aShortArray133[i_1_] = (short) (aShortArray133[i_1_] << 2 & 0x3fff);
						aShortArray142[i_1_] = (short) (aShortArray142[i_1_] << 2 & 0x3fff);
					}
					aShortArray138[i_1_] = (short) -1;
					if (i_5_ == 1 || i_5_ == 2 || i_5_ == 3) {
						if (i_2_ > i_3_) {
							aShortArray138[i_1_] = (short) i_2_;
							i_3_ = i_2_;
						}
					} else if (i_5_ == 5)
						((Class4) this).aBoolean139 = true;
					else if (i_5_ == 7)
						((Class4) this).aBoolean131 = true;
					else if (i_5_ == 9 || i_5_ == 10 || i_5_ == 8)
						((Class4) this).aBoolean129 = true;
					i_1_++;
				}
			}
			if (((ByteBuffer) class348_sub49_0_).position != is.length)
				throw new RuntimeException();
			((Class4) this).anInt126 = i_1_;
			((Class4) this).aShortArray130 = new short[i_1_];
			((Class4) this).aShortArray140 = new short[i_1_];
			((Class4) this).aShortArray137 = new short[i_1_];
			((Class4) this).aShortArray135 = new short[i_1_];
			((Class4) this).aShortArray128 = new short[i_1_];
			((Class4) this).aByteArray132 = new byte[i_1_];
			for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
				((Class4) this).aShortArray130[i_8_] = aShortArray141[i_8_];
				((Class4) this).aShortArray140[i_8_] = aShortArray127[i_8_];
				((Class4) this).aShortArray137[i_8_] = aShortArray133[i_8_];
				((Class4) this).aShortArray135[i_8_] = aShortArray142[i_8_];
				((Class4) this).aShortArray128[i_8_] = aShortArray138[i_8_];
				((Class4) this).aByteArray132[i_8_] = aByteArray136[i_8_];
			}
		} catch (Exception exception) {
			((Class4) this).anInt126 = 0;
			((Class4) this).aBoolean139 = false;
			((Class4) this).aBoolean131 = false;
		}
	}

	public static void method177() {
		aShortArray141 = null;
		aShortArray127 = null;
		aShortArray133 = null;
		aShortArray142 = null;
		aShortArray138 = null;
		aByteArray136 = null;
	}

	static {
		aShortArray141 = new short[500];
	}
}
