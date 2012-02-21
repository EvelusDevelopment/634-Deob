/* MidiFile - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class MidiFile
{
    private static byte[] aByteArray2676
	= { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1,
	    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
	    1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    private ByteBuffer buffer;
    private int[] anIntArray2678;
    private int[] anIntArray2679;
    private long aLong2680;
    int[] anIntArray2681;
    private int[] positions;
    int anInt2683;
    private int anInt2684;
    
    final boolean method1480() {
	int i = positions.length;
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    if (positions[i_0_] >= 0)
		return false;
	}
	return true;
    }
    
    private final int method1481(int i, int i_1_) {
	if (i_1_ == 255) {
	    int i_2_ = buffer.getUByte();
	    int i_3_ = buffer.method3366((byte) 112);
	    if (i_2_ == 47) {
		((ByteBuffer) buffer).position += i_3_;
		return 1;
	    }
	    if (i_2_ == 81) {
		int i_4_ = buffer.getTri();
		i_3_ -= 3;
		int i_5_ = ((MidiFile) this).anIntArray2681[i];
		aLong2680 += (long) i_5_ * (long) (anInt2684 - i_4_);
		anInt2684 = i_4_;
		((ByteBuffer) buffer).position += i_3_;
		return 2;
	    }
	    ((ByteBuffer) buffer).position += i_3_;
	    return 3;
	}
	byte i_6_ = aByteArray2676[i_1_ - 128];
	int i_7_ = i_1_;
	if (i_6_ >= 1)
	    i_7_ |= buffer.getUByte() << 8;
	if (i_6_ >= 2)
	    i_7_ |= buffer.getUByte() << 16;
	return i_7_;
    }
    
    final void initialize(byte[] is) {
	((ByteBuffer) buffer).payload = is;
	((ByteBuffer) buffer).position = 10;
	int i = buffer.getShort();
	((MidiFile) this).anInt2683 = buffer.getShort();
	anInt2684 = 500000;
	anIntArray2679 = new int[i];
	int i_8_ = 0;
	while (i_8_ < i) {
	    int i_9_ = buffer.getDWord();
	    int i_10_ = buffer.getDWord();
	    if (i_9_ == 1297379947) {
		anIntArray2679[i_8_] = ((ByteBuffer) buffer).position;
		i_8_++;
	    }
	    ((ByteBuffer) buffer).position += i_10_;
	}
	aLong2680 = 0L;
	positions = new int[i];
	for (int i_11_ = 0; i_11_ < i; i_11_++)
	    positions[i_11_] = anIntArray2679[i_11_];
	((MidiFile) this).anIntArray2681 = new int[i];
	anIntArray2678 = new int[i];
    }
    
    final int method1483() {
	return positions.length;
    }
    
    final void method1484(long l) {
	aLong2680 = l;
	int i = positions.length;
	for (int i_12_ = 0; i_12_ < i; i_12_++) {
	    ((MidiFile) this).anIntArray2681[i_12_] = 0;
	    anIntArray2678[i_12_] = 0;
	    ((ByteBuffer) buffer).position
		= anIntArray2679[i_12_];
	    method1485(i_12_);
	    positions[i_12_]
		= ((ByteBuffer) buffer).position;
	}
    }
    
    final void method1485(int i) {
	int i_13_ = buffer.method3366((byte) 98);
	((MidiFile) this).anIntArray2681[i] += i_13_;
    }
    
    final void method1486(int i) {
	positions[i] = ((ByteBuffer) buffer).position;
    }
    
    final void method1487() {
	((ByteBuffer) buffer).payload = null;
	anIntArray2679 = null;
	positions = null;
	((MidiFile) this).anIntArray2681 = null;
	anIntArray2678 = null;
    }
    
    final long method1488(int i) {
	return aLong2680 + (long) i * (long) anInt2684;
    }
    
    private final int method1489(int i) {
	int i_14_ = (((ByteBuffer) buffer).payload
		     [((ByteBuffer) buffer).position]);
	if (i_14_ < 0) {
	    i_14_ &= 0xff;
	    anIntArray2678[i] = i_14_;
	    ((ByteBuffer) buffer).position++;
	} else
	    i_14_ = anIntArray2678[i];
	if (i_14_ == 240 || i_14_ == 247) {
	    int i_15_ = buffer.method3366((byte) 40);
	    if (i_14_ == 247 && i_15_ > 0) {
		int i_16_
		    = ((((ByteBuffer) buffer).payload
			[((ByteBuffer) buffer).position])
		       & 0xff);
		if (i_16_ >= 241 && i_16_ <= 243 || i_16_ == 246
		    || i_16_ == 248 || i_16_ >= 250 && i_16_ <= 252
		    || i_16_ == 254) {
		    ((ByteBuffer) buffer).position++;
		    anIntArray2678[i] = i_16_;
		    return method1481(i, i_16_);
		}
	    }
	    ((ByteBuffer) buffer).position += i_15_;
	    return 0;
	}
	return method1481(i, i_14_);
    }
    
    final int method1490() {
	int i = positions.length;
	int i_17_ = -1;
	int i_18_ = 2147483647;
	for (int i_19_ = 0; i_19_ < i; i_19_++) {
	    if (positions[i_19_] >= 0
		&& ((MidiFile) this).anIntArray2681[i_19_] < i_18_) {
		i_17_ = i_19_;
		i_18_ = ((MidiFile) this).anIntArray2681[i_19_];
	    }
	}
	return i_17_;
    }
    
    final boolean method1491() {
	if (((ByteBuffer) buffer).payload == null)
	    return false;
	return true;
    }
    
    final void method1492(int i) {
	((ByteBuffer) buffer).position = positions[i];
    }
    
    public static void method1493() {
	aByteArray2676 = null;
    }
    
    final int method1494(int i) {
	int i_20_ = method1489(i);
	return i_20_;
    }
    
    final void method1495() {
	((ByteBuffer) buffer).position = -1;
    }
    
    public MidiFile() {
	buffer = new ByteBuffer(null);
    }
    
    MidiFile(byte[] is) {
	buffer = new ByteBuffer(null);
	initialize(is);
    }
}
