/* MidiLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class MidiLoader extends Node
{
    byte[] aByteArray6564;
    HashTable aClass356_6565;
    
    final void method2733() {
	if (((MidiLoader) this).aClass356_6565 == null) {
	    ((MidiLoader) this).aClass356_6565 = new HashTable(16);
	    int[] is = new int[16];
	    int[] is_0_ = new int[16];
	    is[9] = is_0_[9] = 128;
	    MidiFile class204 = new MidiFile(((MidiLoader) this).aByteArray6564);
	    int i = class204.method1483();
	    for (int i_1_ = 0; i_1_ < i; i_1_++) {
		class204.method1492(i_1_);
		class204.method1485(i_1_);
		class204.method1486(i_1_);
	    }
	while_123_:
	    for (;;) {
		int i_2_ = class204.method1490();
		int i_3_ = ((MidiFile) class204).anIntArray2681[i_2_];
		while (((MidiFile) class204).anIntArray2681[i_2_] == i_3_) {
		    class204.method1492(i_2_);
		    int i_4_ = class204.method1494(i_2_);
		    if (i_4_ == 1) {
			class204.method1495();
			class204.method1486(i_2_);
			if (!class204.method1480())
			    break;
			break while_123_;
		    }
		    int i_5_ = i_4_ & 0xf0;
		    if (i_5_ == 176) {
			int i_6_ = i_4_ & 0xf;
			int i_7_ = i_4_ >> 8 & 0x7f;
			int i_8_ = i_4_ >> 16 & 0x7f;
			if (i_7_ == 0)
			    is[i_6_] = (is[i_6_] & ~0x1fc000) + (i_8_ << 14);
			if (i_7_ == 32)
			    is[i_6_] = (is[i_6_] & ~0x3f80) + (i_8_ << 7);
		    }
		    if (i_5_ == 192) {
			int i_9_ = i_4_ & 0xf;
			int i_10_ = i_4_ >> 8 & 0x7f;
			is_0_[i_9_] = is[i_9_] + i_10_;
		    }
		    if (i_5_ == 144) {
			int i_11_ = i_4_ & 0xf;
			int i_12_ = i_4_ >> 8 & 0x7f;
			int i_13_ = i_4_ >> 16 & 0x7f;
			if (i_13_ > 0) {
			    int i_14_ = is_0_[i_11_];
			    Class348_Sub8 class348_sub8
				= ((Class348_Sub8)
				   ((MidiLoader) this).aClass356_6565
				       .get((long) i_14_));
			    if (class348_sub8 == null) {
				class348_sub8
				    = new Class348_Sub8(new byte[128]);
				((MidiLoader) this).aClass356_6565.putNode((long) i_14_, class348_sub8);
			    }
			    ((Class348_Sub8) class348_sub8).aByteArray6657[i_12_]= (byte)  1;
			}
		    }
		    class204.method1485(i_2_);
		    class204.method1486(i_2_);
		}
	    }
	}
    }
    
    static final MidiLoader method2734(IndexLoader class45, int i, int i_15_) {
	byte[] is = class45.loadArchiveChild(-1860, i, i_15_);
	if (is == null)
	    return null;
	return new MidiLoader(new ByteBuffer(is));
    }
    
    final void method2735() {
	((MidiLoader) this).aClass356_6565 = null;
    }
    
    private MidiLoader(ByteBuffer buffer) {
	((ByteBuffer) buffer).position = ((ByteBuffer) buffer).payload.length - 3;
	int i = buffer.getUByte();
	int i_16_ = buffer.getShort();
	int i_17_ = 14 + i * 10;
	((ByteBuffer) buffer).position = 0;
	int i_18_ = 0;
	int i_19_ = 0;
	int i_20_ = 0;
	int i_21_ = 0;
	int i_22_ = 0;
	int i_23_ = 0;
	int i_24_ = 0;
	int i_25_ = 0;
    while_121_:
	for (int i_26_ = 0; i_26_ < i; i_26_++) {
	    int i_27_ = -1;
	    for (;;) {
		int i_28_ = buffer.getUByte();
		if (i_28_ != i_27_)
		    i_17_++;
		i_27_ = i_28_ & 0xf;
		if (i_28_ == 7)
		    continue while_121_;
		if (i_28_ == 23)
		    i_18_++;
		else if (i_27_ == 0)
		    i_20_++;
		else if (i_27_ == 1)
		    i_21_++;
		else if (i_27_ == 2)
		    i_19_++;
		else if (i_27_ == 3)
		    i_22_++;
		else if (i_27_ == 4)
		    i_23_++;
		else if (i_27_ == 5)
		    i_24_++;
		else {
		    if (i_27_ != 6)
			break;
		    i_25_++;
		}
	    }
	    throw new RuntimeException();
	}
	i_17_ += 5 * i_18_;
	i_17_ += 2 * (i_20_ + i_21_ + i_19_ + i_22_ + i_24_);
	i_17_ += i_23_ + i_25_;
	int i_29_ = ((ByteBuffer) buffer).position;
	int i_30_ = (i + i_18_ + i_19_ + i_20_ + i_21_ + i_22_ + i_23_ + i_24_
		     + i_25_);
	for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
	    buffer.method3366((byte) 111);
	i_17_ += ((ByteBuffer) buffer).position - i_29_;
	int i_32_ = ((ByteBuffer) buffer).position;
	int i_33_ = 0;
	int i_34_ = 0;
	int i_35_ = 0;
	int i_36_ = 0;
	int i_37_ = 0;
	int i_38_ = 0;
	int i_39_ = 0;
	int i_40_ = 0;
	int i_41_ = 0;
	int i_42_ = 0;
	int i_43_ = 0;
	int i_44_ = 0;
	int i_45_ = 0;
	for (int i_46_ = 0; i_46_ < i_19_; i_46_++) {
	    i_45_ = i_45_ + buffer.getUByte() & 0x7f;
	    if (i_45_ == 0 || i_45_ == 32)
		i_25_++;
	    else if (i_45_ == 1)
		i_33_++;
	    else if (i_45_ == 33)
		i_34_++;
	    else if (i_45_ == 7)
		i_35_++;
	    else if (i_45_ == 39)
		i_36_++;
	    else if (i_45_ == 10)
		i_37_++;
	    else if (i_45_ == 42)
		i_38_++;
	    else if (i_45_ == 99)
		i_39_++;
	    else if (i_45_ == 98)
		i_40_++;
	    else if (i_45_ == 101)
		i_41_++;
	    else if (i_45_ == 100)
		i_42_++;
	    else if (i_45_ == 64 || i_45_ == 65 || i_45_ == 120 || i_45_ == 121
		     || i_45_ == 123)
		i_43_++;
	    else
		i_44_++;
	}
	int i_47_ = 0;
	int i_48_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_43_;
	int i_49_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_24_;
	int i_50_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_23_;
	int i_51_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_22_;
	int i_52_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_33_;
	int i_53_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_35_;
	int i_54_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_37_;
	int i_55_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_20_ + i_21_ + i_24_;
	int i_56_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_20_;
	int i_57_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_44_;
	int i_58_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_21_;
	int i_59_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_34_;
	int i_60_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_36_;
	int i_61_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_38_;
	int i_62_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_25_;
	int i_63_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_22_;
	int i_64_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_39_;
	int i_65_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_40_;
	int i_66_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_41_;
	int i_67_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_42_;
	int i_68_ = ((ByteBuffer) buffer).position;
	((ByteBuffer) buffer).position += i_18_ * 3;
	((MidiLoader) this).aByteArray6564 = new byte[i_17_];
	ByteBuffer class348_sub49_69_
	    = new ByteBuffer(((MidiLoader) this).aByteArray6564);
	class348_sub49_69_.putInt(1297377380);
	class348_sub49_69_.putInt(6);
	class348_sub49_69_.putShort(i > 1 ? 1 : 0);
	class348_sub49_69_.putShort(i);
	class348_sub49_69_.putShort(i_16_);
	((ByteBuffer) buffer).position = i_29_;
	int i_70_ = 0;
	int i_71_ = 0;
	int i_72_ = 0;
	int i_73_ = 0;
	int i_74_ = 0;
	int i_75_ = 0;
	int i_76_ = 0;
	int[] is = new int[128];
	i_45_ = 0;
	for (int i_77_ = 0; i_77_ < i; i_77_++) {
	    class348_sub49_69_.putInt(1297379947);
	    ((ByteBuffer) class348_sub49_69_).position += 4;
	    int i_78_ = ((ByteBuffer) class348_sub49_69_).position;
	    int i_79_ = -1;
	while_122_:
	    do {
		for (;;) {
		    int i_80_ = buffer.method3366((byte) 73);
		    class348_sub49_69_.method3396(i_80_, -21);
		    int i_81_ = ((((ByteBuffer) buffer)
				  .payload[i_47_++])
				 & 0xff);
		    boolean bool = i_81_ != i_79_;
		    i_79_ = i_81_ & 0xf;
		    if (i_81_ == 7) {
			if (bool)
			    class348_sub49_69_.putByte(255);
			class348_sub49_69_.putByte(47);
			class348_sub49_69_.putByte(0);
			break while_122_;
		    }
		    if (i_81_ == 23) {
			if (bool)
			    class348_sub49_69_.putByte(255);
			class348_sub49_69_.putByte(81);
			class348_sub49_69_.putByte(3);
			class348_sub49_69_.putByte((((ByteBuffer)
							       buffer)
							      .payload
							      [i_68_++]));
			class348_sub49_69_.putByte((((ByteBuffer)
							       buffer)
							      .payload
							      [i_68_++]));
			class348_sub49_69_.putByte((((ByteBuffer)
							       buffer)
							      .payload
							      [i_68_++]));
		    } else {
			i_70_ ^= i_81_ >> 4;
			if (i_79_ == 0) {
			    if (bool)
				class348_sub49_69_.putByte(144 + i_70_);
			    i_71_ += (((ByteBuffer) buffer)
				      .payload[i_55_++]);
			    i_72_ += (((ByteBuffer) buffer)
				      .payload[i_56_++]);
			    class348_sub49_69_.putByte(i_71_ & 0x7f);
			    class348_sub49_69_.putByte(i_72_ & 0x7f);
			} else if (i_79_ == 1) {
			    if (bool)
				class348_sub49_69_.putByte(128 + i_70_);
			    i_71_ += (((ByteBuffer) buffer)
				      .payload[i_55_++]);
			    i_73_ += (((ByteBuffer) buffer)
				      .payload[i_58_++]);
			    class348_sub49_69_.putByte(i_71_ & 0x7f);
			    class348_sub49_69_.putByte(i_73_ & 0x7f);
			} else if (i_79_ == 2) {
			    if (bool)
				class348_sub49_69_.putByte(176 + i_70_);
			    i_45_ = i_45_ + (((ByteBuffer) buffer)
					     .payload[i_32_++]) & 0x7f;
			    class348_sub49_69_.putByte(i_45_);
			    int i_82_;
			    if (i_45_ == 0 || i_45_ == 32)
				i_82_ = (((ByteBuffer) buffer)
					 .payload[i_62_++]);
			    else if (i_45_ == 1)
				i_82_ = (((ByteBuffer) buffer)
					 .payload[i_52_++]);
			    else if (i_45_ == 33)
				i_82_ = (((ByteBuffer) buffer)
					 .payload[i_59_++]);
			    else if (i_45_ == 7)
				i_82_ = (((ByteBuffer) buffer)
					 .payload[i_53_++]);
			    else if (i_45_ == 39)
				i_82_ = (((ByteBuffer) buffer)
					 .payload[i_60_++]);
			    else if (i_45_ == 10)
				i_82_ = (((ByteBuffer) buffer)
					 .payload[i_54_++]);
			    else if (i_45_ == 42)
				i_82_ = (((ByteBuffer) buffer)
					 .payload[i_61_++]);
			    else if (i_45_ == 99)
				i_82_ = (((ByteBuffer) buffer)
					 .payload[i_64_++]);
			    else if (i_45_ == 98)
				i_82_ = (((ByteBuffer) buffer)
					 .payload[i_65_++]);
			    else if (i_45_ == 101)
				i_82_ = (((ByteBuffer) buffer)
					 .payload[i_66_++]);
			    else if (i_45_ == 100)
				i_82_ = (((ByteBuffer) buffer)
					 .payload[i_67_++]);
			    else if (i_45_ == 64 || i_45_ == 65 || i_45_ == 120
				     || i_45_ == 121 || i_45_ == 123)
				i_82_ = (((ByteBuffer) buffer)
					 .payload[i_48_++]);
			    else
				i_82_ = (((ByteBuffer) buffer)
					 .payload[i_57_++]);
			    i_82_ += is[i_45_];
			    is[i_45_] = i_82_;
			    class348_sub49_69_.putByte(i_82_ & 0x7f);
			} else if (i_79_ == 3) {
			    if (bool)
				class348_sub49_69_.putByte(224 + i_70_);
			    i_74_ += (((ByteBuffer) buffer)
				      .payload[i_63_++]);
			    i_74_ += (((ByteBuffer) buffer)
				      .payload[i_51_++]) << 7;
			    class348_sub49_69_.putByte(i_74_ & 0x7f);
			    class348_sub49_69_.putByte(i_74_ >> 7 & 0x7f);
			} else if (i_79_ == 4) {
			    if (bool)
				class348_sub49_69_.putByte(208 + i_70_);
			    i_75_ += (((ByteBuffer) buffer)
				      .payload[i_50_++]);
			    class348_sub49_69_.putByte(i_75_ & 0x7f);
			} else if (i_79_ == 5) {
			    if (bool)
				class348_sub49_69_.putByte(160 + i_70_);
			    i_71_ += (((ByteBuffer) buffer)
				      .payload[i_55_++]);
			    i_76_ += (((ByteBuffer) buffer)
				      .payload[i_49_++]);
			    class348_sub49_69_.putByte(i_71_ & 0x7f);
			    class348_sub49_69_.putByte(i_76_ & 0x7f);
			} else {
			    if (i_79_ != 6)
				break;
			    if (bool)
				class348_sub49_69_.putByte(192 + i_70_);
			    class348_sub49_69_.putByte((((ByteBuffer)
							    buffer)
							   .payload
							   [i_62_++]));
			}
		    }
		}
		throw new RuntimeException();
	    } while (false);
	    class348_sub49_69_.method3338(-1, (((ByteBuffer)
						class348_sub49_69_).position
					       - i_78_));
	}
    }
}
