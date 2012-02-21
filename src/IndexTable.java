/* IndexTable - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class IndexTable
{
    int checksum;
    static int anInt3720 = 0;
    int[][] anIntArrayArray3721;
    int[] versions;
    BitmapTable nameHashTable;
    int[] maxChildEntry;
    int[] amountChildren;
    static int[] anIntArray3726;
    int amountEntries;
    BitmapTable[] childHashTables;
    int[] checksums;
    byte[][] whirlpoolDigests;
    static int anInt3731;
    int tableVersion;
    int[] nameHashes;
    int maximumEntry;
    int[][] anIntArrayArray3735;
    static int b12fullArchiveId;
    static Class318_Sub1[] aClass318_Sub1Array3737;
    int[] anIntArray3738;
    static int anInt3739;
    private byte[] tableDigest;
    static int anInt3741;
    
    static final int method2198(int i, int i_0_, int i_1_) {
	i_0_ = i_0_ * (i_1_ & 0x7f) >> 1298920711;
	if (i != 0)
	    method2198(52, -11, 108);
	anInt3741++;
	if (i_0_ >= 2) {
	    if ((i_0_ ^ 0xffffffff) < -127)
		i_0_ = 126;
	} else
	    i_0_ = 2;
	return (0xff80 & i_1_) - -i_0_;
    }
    
    public static void method2199(byte i) {
	anIntArray3726 = null;
	if (i < 55)
	    aClass318_Sub1Array3737 = null;
	aClass318_Sub1Array3737 = null;
    }
    
    private final void initialize(byte[] is) {
	anInt3731++;
	ByteBuffer class348_sub49 = new ByteBuffer(Class348_Sub41.unpackFileContainer(is, -105));
	int i_2_ = class348_sub49.getUByte();
	if (i_2_ < 5 || i_2_ > 6)
	    throw new RuntimeException();
	if ((i_2_ ^ 0xffffffff) > -7)
	    ((IndexTable) this).tableVersion = 0;
	else
	    ((IndexTable) this).tableVersion = class348_sub49.getDWord();
	int flags = class348_sub49.getUByte();
	boolean isNamed = (flags & 0x1) != 0;
	boolean isHashed = (flags & 0x2) != 0;
	((IndexTable) this).amountEntries = class348_sub49.getShort();
	int i_5_ = 0;
	((IndexTable) this).anIntArray3738 = new int[((IndexTable) this).amountEntries];
	int i_6_ = -1;
	for (int i_7_ = 0;
	     (((IndexTable) this).amountEntries ^ 0xffffffff) < (i_7_ ^ 0xffffffff);
	     i_7_++) {
	    ((IndexTable) this).anIntArray3738[i_7_] = i_5_
		+= class348_sub49.getShort();
	    if (i_6_ < ((IndexTable) this).anIntArray3738[i_7_])
		i_6_ = ((IndexTable) this).anIntArray3738[i_7_];
	}
	((IndexTable) this).maximumEntry = i_6_ + 1;
	if (isHashed)
	    ((IndexTable) this).whirlpoolDigests
		= new byte[((IndexTable) this).maximumEntry][];
	((IndexTable) this).checksums
	    = new int[((IndexTable) this).maximumEntry];
	((IndexTable) this).maxChildEntry
	    = new int[((IndexTable) this).maximumEntry];
	((IndexTable) this).amountChildren
	    = new int[((IndexTable) this).maximumEntry];
	((IndexTable) this).versions
	    = new int[((IndexTable) this).maximumEntry];
	((IndexTable) this).anIntArrayArray3721
	    = new int[((IndexTable) this).maximumEntry][];
	if (isNamed) {
	    ((IndexTable) this).nameHashes
		= new int[((IndexTable) this).maximumEntry];
	    for (int i_8_ = 0; i_8_ < ((IndexTable) this).maximumEntry; i_8_++)
		((IndexTable) this).nameHashes[i_8_] = -1;
	    for (int i_9_ = 0;
		 ((i_9_ ^ 0xffffffff)
		  > (((IndexTable) this).amountEntries ^ 0xffffffff));
		 i_9_++)
		((IndexTable) this).nameHashes[(((IndexTable) this)
						  .anIntArray3738[i_9_])]
		    = class348_sub49.getDWord();
	    ((IndexTable) this).nameHashTable = new BitmapTable(((IndexTable) this).nameHashes);
	}
	for (int i_10_ = 0;
	     (((IndexTable) this).amountEntries ^ 0xffffffff) < (i_10_ ^ 0xffffffff);
	     i_10_++)
	    ((IndexTable) this).checksums[(((IndexTable) this).anIntArray3738
					      [i_10_])]
		= class348_sub49.getDWord();
	if (isHashed) {
	    for (int i_11_ = 0; i_11_ < ((IndexTable) this).amountEntries; i_11_++) {
		byte[] is_12_ = new byte[64];
		class348_sub49.getBytes(is_12_, 0, 64);
		((IndexTable) this).whirlpoolDigests[(((IndexTable) this)
						       .anIntArray3738[i_11_])]
		    = is_12_;
	    }
	}
	for (int i_13_ = 0; i_13_ < ((IndexTable) this).amountEntries; i_13_++)
	    ((IndexTable) this).versions[(((IndexTable) this).anIntArray3738
					      [i_13_])]
		= class348_sub49.getDWord();
	for (int i_14_ = 0; ((IndexTable) this).amountEntries > i_14_; i_14_++)
	    ((IndexTable) this).amountChildren[(((IndexTable) this).anIntArray3738
					      [i_14_])]
		= class348_sub49.getShort();
	for (int i_15_ = 0;
	     (i_15_ ^ 0xffffffff) > (((IndexTable) this).amountEntries ^ 0xffffffff);
	     i_15_++) {
	    int i_16_ = ((IndexTable) this).anIntArray3738[i_15_];
	    i_5_ = 0;
	    int i_17_ = ((IndexTable) this).amountChildren[i_16_];
	    int i_18_ = -1;
	    ((IndexTable) this).anIntArrayArray3721[i_16_] = new int[i_17_];
	    for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff);
		 i_19_++) {
		int i_20_
		    = (((IndexTable) this).anIntArrayArray3721[i_16_][i_19_]
		       = i_5_ += class348_sub49.getShort());
		if ((i_20_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff))
		    i_18_ = i_20_;
	    }
	    ((IndexTable) this).maxChildEntry[i_16_] = i_18_ + 1;
	    if ((i_17_ ^ 0xffffffff) == (1 + i_18_ ^ 0xffffffff))
		((IndexTable) this).anIntArrayArray3721[i_16_] = null;
	}
	if (isNamed) {
	    ((IndexTable) this).anIntArrayArray3735 = new int[i_6_ + 1][];
	    ((IndexTable) this).childHashTables = new BitmapTable[1 + i_6_];
	    for (int i_21_ = 0; i_21_ < ((IndexTable) this).amountEntries; i_21_++) {
		int i_22_ = ((IndexTable) this).anIntArray3738[i_21_];
		int i_23_ = ((IndexTable) this).amountChildren[i_22_];
		((IndexTable) this).anIntArrayArray3735[i_22_]
		    = new int[((IndexTable) this).maxChildEntry[i_22_]];
		for (int i_24_ = 0;
		     ((IndexTable) this).maxChildEntry[i_22_] > i_24_; i_24_++)
		    ((IndexTable) this).anIntArrayArray3735[i_22_][i_24_] = -1;
		for (int i_25_ = 0; i_23_ > i_25_; i_25_++) {
		    int i_26_;
		    if (((IndexTable) this).anIntArrayArray3721[i_22_] != null)
			i_26_ = (((IndexTable) this).anIntArrayArray3721[i_22_]
				 [i_25_]);
		    else
			i_26_ = i_25_;
		    ((IndexTable) this).anIntArrayArray3735[i_22_][i_26_]
			= class348_sub49.getDWord();
		}
		((IndexTable) this).childHashTables[i_22_]
		    = new BitmapTable(((IndexTable) this).anIntArrayArray3735
				   [i_22_]);
	    }
	}
    }
    
    IndexTable(byte[] src, int crc, byte[] digest) {
	try {
	    ((IndexTable) this).checksum = Class59_Sub1.getCalculatedChecksum(5126, src.length, src);
            if(!Main.skipUpdate) {
                if (crc != ((IndexTable) this).checksum)
                  throw new RuntimeException();
                if (digest != null) {
                    if (digest.length != 64)
                        throw new RuntimeException();
                    tableDigest = Class348_Sub1_Sub2.getWhirlpoolDigest(src, 0, src.length);
                    for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > -65; i_28_++) {
                        if ((digest[i_28_] ^ 0xffffffff) != (tableDigest[i_28_] ^ 0xffffffff))
                            throw new RuntimeException();
                    }
                }
            }
	    initialize(src);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("vw.<init>("
					     + (src != null ? "{...}" : "null")
					     + ',' + crc + ','
					     + (digest != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
}
