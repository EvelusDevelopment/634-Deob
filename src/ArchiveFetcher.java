/* ArchiveFetcher - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

final class ArchiveFetcher
{
    private OndemandWorker ondemandWorker;
    private BigInteger exponent;
    static int anInt4214;
    private ByteBuffer parentTableBuffer;
    private ArchiveLoader[] archiveLoaders;
    private FileIndexWorker fileIndexWorker;
    private BigInteger modulus;
    static int anInt4219;
    private OndemandFileRequest parentTableRequest;
    static int anInt4221;
    static int anInt4222;
    static OutgoingPacket aClass351_4223 = new OutgoingPacket(4, 0);
    static int anInt4224;
    static OutgoingPacket aClass351_4225 = new OutgoingPacket(43, -1);
    
    final void method2670(int i) {
	anInt4222++;
	if (archiveLoaders != null) {
	    for (int i_0_ = 0; ((archiveLoaders.length ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
		if (archiveLoaders[i_0_] != null)
		    archiveLoaders[i_0_].method2342(0);
	    }
	    for (int i_1_ = i; i_1_ < archiveLoaders.length; i_1_++) {
		if (archiveLoaders[i_1_] != null)
		    archiveLoaders[i_1_].method2343(-1);
	    }
	}
    }
    
    public static void method2671(int i) {
	aClass351_4225 = null;
	aClass351_4223 = null;
	if (i != 0)
	    method2672(92, 5);
    }
    
    static final boolean method2672(int i, int i_2_) {
	anInt4224++;
	if (i_2_ >= -89)
	    return true;
	if (i != 7 && (i ^ 0xffffffff) != -9 && (i ^ 0xffffffff) != -10)
	    return false;
	return true;
    }
    
    final ArchiveLoader method2673(FileIndex fileIndex, int index, FileIndex class137_3_, int i_4_) {
	try {
	    anInt4219++;
	    return getArchiveLoader(true, index, fileIndex, class137_3_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("eb.D("
					     + (fileIndex != null ? "{...}"
						: "null")
					     + ',' + index + ','
					     + (class137_3_ != null ? "{...}"
						: "null")
					     + ',' + i_4_ + ')'));
	}
    }
    
    final boolean isParentTableFetched() {
	anInt4214++;
	if (parentTableBuffer != null)
	    return true;
	if (parentTableRequest == null) {
	    if (ondemandWorker.isPriorityRequestsFull())
		return false;
	    parentTableRequest = ondemandWorker.createOndemandRequest((byte) 0, true, 255, 255);
	}
	if (((FileRequest) parentTableRequest).isActive)
	    return false;
	ByteBuffer buffer = new ByteBuffer(parentTableRequest.getPayload());
	((ByteBuffer) buffer).position = 5;
	int entries = buffer.getUByte();
	((ByteBuffer) buffer).position += entries * 72;
	byte[] is = new byte[(((ByteBuffer) buffer).payload.length - ((ByteBuffer) buffer).position)];
	buffer.getBytes(is, 0, is.length);
	byte[] encipheredDigest;
	if (exponent != null && modulus != null) {
	    BigInteger biginteger = new BigInteger(is);
	    BigInteger biginteger_7_ = biginteger.modPow(exponent, modulus);
	    encipheredDigest = biginteger_7_.toByteArray();
	} else {
	    encipheredDigest = is;
        }
	if (encipheredDigest.length != 65)
	    throw new RuntimeException();
	byte[] digest = Class348_Sub1_Sub2.getWhirlpoolDigest((((ByteBuffer) buffer).payload), 5, (((ByteBuffer) buffer).position) - (is.length + 5));
	for (int i_9_ = 0; i_9_ < 64; i_9_++) {
	    if (encipheredDigest[i_9_ + 1] != digest[i_9_])
		throw new RuntimeException();
	}
	parentTableBuffer = buffer;
	archiveLoaders = new ArchiveLoader[entries];
	return true;
    }
    
    private final ArchiveLoader getArchiveLoader(boolean bool, int entry, FileIndex class137, FileIndex class137_11_) {
	try {
	    anInt4221++;
            if(!Main.skipUpdate) {
                if (parentTableBuffer == null)
                  throw new RuntimeException();
                if (entry < 0 || entry >= archiveLoaders.length)
                    throw new RuntimeException();
                if (archiveLoaders[entry] != null)
                    return archiveLoaders[entry];
                ((ByteBuffer) parentTableBuffer).position = 6 + entry * 72;
            }
	    int crc = Main.skipUpdate ? 0 : parentTableBuffer.getDWord();
	    int version = Main.skipUpdate ? 0 : parentTableBuffer.getDWord();
	    byte[] is = new byte[64];
            if(!Main.skipUpdate)
                parentTableBuffer.getBytes(is, 0, 64);
	    ArchiveLoader loaders = new ArchiveLoader(entry, class137, class137_11_, ondemandWorker, fileIndexWorker, crc, is, version, bool);
	    if(!Main.skipUpdate)
                archiveLoaders[entry] = loaders;
	    return loaders;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("eb.E(" + bool + ','
					     + entry + ','
					     + (class137 != null ? "{...}"
						: "null")
					     + ','
					     + (class137_11_ != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    ArchiveFetcher(OndemandWorker ondemandworker, FileIndexWorker indexworker, BigInteger e, BigInteger m) {
	do {
	    try {
		fileIndexWorker = indexworker;
		modulus = m;
		exponent = e;
		ondemandWorker = ondemandworker;
		if (ondemandWorker.isPriorityRequestsFull())
		    break;
		parentTableRequest = ondemandWorker.createOndemandRequest((byte) 0, true, 255, 255);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929
			  (runtimeexception,
			   ("eb.<init>("
			    + (ondemandworker != null ? "{...}" : "null") + ','
			    + (indexworker != null ? "{...}" : "null") + ','
			    + (e != null ? "{...}" : "null") + ','
			    + (m != null ? "{...}" : "null")
			    + ')'));
	    }
	    break;
	} while (false);
    }
}
