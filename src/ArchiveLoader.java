/* ArchiveLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ArchiveLoader extends AbtractArchiveLoader
{
    static IncomingPacket aClass114_6340 = new IncomingPacket(74, 28);
    static int anInt6341;
    private IndexTable indexTable;
    static int anInt6343;
    private int checksum;
    static int anInt6345;
    private byte[] src;
    private OndemandWorker requestWorker;
    static int anInt6348;
    static int anInt6349;
    private int indexId;
    private byte[] archiveStates;
    private int anInt6352;
    static int anInt6353;
    private FileIndexWorker fileIndexWorker;
    private FileRequest indexTableRequest;
    static int anInt6356;
    static int anInt6357;
    static int anInt6358;
    static int anInt6359;
    private HashTable requestTable;
    private int anInt6361 = 0;
    static int anInt6362;
    static int anInt6363;
    private FileIndex aClass137_6364;
    private FileIndex fileIndex;
    static int anInt6366;
    static int anInt6367;
    private boolean aBoolean6368;
    private Deque requestsDeque;
    static int anInt6370;
    private boolean aBoolean6371;
    private Deque aClass262_6372;
    private int anInt6373;
    private long aLong6374;
    private boolean aBoolean6375;
    
    final int getAmountEntries(int i) {
	anInt6370++;
	if (indexTable == null)
	    return 0;
	if (!aBoolean6368)
	    return ((IndexTable) indexTable).amountEntries;
	if (i != 24940)
	    method2345(-32);
	Node class348 = aClass262_6372.getFirst(i ^ 0x6168);
	if (class348 == null)
	    return 0;
	return (int) ((Node) class348).nodeKey;
    }
    
    final void method2342(int i) {
	anInt6349++;
	if (i != 0)
	    aBoolean6375 = false;
	if (aClass262_6372 != null && getIndexTable() != null) {
	    for (Node class348 = requestsDeque.getFirst(4); class348 != null; class348 = requestsDeque.nextForward((byte) 112)) {
		int archiveId = (int) ((Node) class348).nodeKey;
		if (archiveId < 0 || ((archiveId ^ 0xffffffff) <= (((IndexTable) indexTable).maximumEntry ^ 0xffffffff)) || ((IndexTable) indexTable).amountChildren[archiveId] == 0)
		    class348.removeNode();
		else {
		    if (archiveStates[archiveId] == 0)
			process(archiveId, 1);
		    if (archiveStates[archiveId] == -1)
			process(archiveId, 2);
		    if (archiveStates[archiveId] == 1)
			class348.removeNode();
		}
	    }
	}
    }
    
    final void method2343(int i) {
	anInt6356++;
	if (aClass262_6372 != null) {
	    if (getIndexTable() == null)
		return;
	    if (aBoolean6368) {
		boolean bool = true;
		for (Node class348 = aClass262_6372.getFirst(4);
		     class348 != null;
		     class348 = aClass262_6372.nextForward((byte) 106)) {
		    int i_1_ = (int) ((Node) class348).nodeKey;
		    if (archiveStates[i_1_] == 0)
			process(i_1_, 1);
		    if (archiveStates[i_1_] != 0)
			class348.removeNode();
		    else
			bool = false;
		}
		while ((anInt6373 ^ 0xffffffff)
		       > (((IndexTable) indexTable).amountChildren.length
			  ^ 0xffffffff)) {
		    if ((((IndexTable) indexTable).amountChildren[anInt6373]
			 ^ 0xffffffff)
			== -1)
			anInt6373++;
		    else {
			if (((FileIndexWorker) fileIndexWorker).amountRequests >= 250) {
			    bool = false;
			    break;
			}
			if (archiveStates[anInt6373] == 0)
			    process(anInt6373, 1);
			if ((archiveStates[anInt6373] ^ 0xffffffff) == -1) {
			    Node class348 = new Node();
			    ((Node) class348).nodeKey = (long) anInt6373;
			    aClass262_6372.addToFront(class348, -20180);
			    bool = false;
			}
			anInt6373++;
		    }
		}
		if (bool) {
		    anInt6373 = 0;
		    aBoolean6368 = false;
		}
	    } else if (aBoolean6371) {
		boolean bool = true;
		for (Node class348 = aClass262_6372.getFirst(4);
		     class348 != null;
		     class348 = aClass262_6372.nextForward((byte) 43)) {
		    int i_2_ = (int) ((Node) class348).nodeKey;
		    if ((archiveStates[i_2_] ^ 0xffffffff) != -2)
			process(i_2_, 2);
		    if (archiveStates[i_2_] != 1)
			bool = false;
		    else
			class348.removeNode();
		}
		while ((anInt6373 ^ 0xffffffff)
		       > (((IndexTable) indexTable).amountChildren.length
			  ^ 0xffffffff)) {
		    if ((((IndexTable) indexTable).amountChildren[anInt6373]
			 ^ 0xffffffff)
			== -1)
			anInt6373++;
		    else {
			if (requestWorker.isRegularRequestsFull()) {
			    bool = false;
			    break;
			}
			if (archiveStates[anInt6373] != 1)
			    process(anInt6373, 2);
			if ((archiveStates[anInt6373] ^ 0xffffffff) != -2) {
			    Node class348 = new Node();
			    ((Node) class348).nodeKey = (long) anInt6373;
			    bool = false;
			    aClass262_6372.addToFront(class348, i + -20179);
			}
			anInt6373++;
		    }
		}
		if (bool) {
		    anInt6373 = 0;
		    aBoolean6371 = false;
		}
	    } else
		aClass262_6372 = null;
	}
	if (i == -1) {
	    if (aBoolean6375 && Class62.getCurrentTimeMillis() >= aLong6374) {
		for (FileRequest class348_sub42_sub16
			 = (FileRequest) requestTable.method3484(0);
		     class348_sub42_sub16 != null;
		     class348_sub42_sub16 = ((FileRequest)
					     requestTable.method3482(0))) {
		    if (!((FileRequest) class348_sub42_sub16)
			 .isActive) {
			if (!((FileRequest) class348_sub42_sub16)
			     .aBoolean9667)
			    ((FileRequest) class348_sub42_sub16)
				.aBoolean9667
				= true;
			else {
			    if (!((FileRequest) class348_sub42_sub16)
				 .boolParameter)
				throw new RuntimeException();
			    class348_sub42_sub16.removeNode();
			}
		    }
		}
		aLong6374 = Class62.getCurrentTimeMillis() - -1000L;
	    }
	}
    }
    
    public static void method2344(int i) {
	if (i == 0)
	    aClass114_6340 = null;
    }
    
    final int method2345(int i) {
	anInt6357++;
	if (indexTable == null)
	    return 0;
	if (i != 0)
	    method2338((byte) -34, 120);
	return ((IndexTable) indexTable).amountEntries;
    }
    
    final byte[] getValidatedArchive(int archiveId) {
	anInt6363++;
	FileRequest request = process(archiveId, 0);
	if (request == null)
	    return null;
	byte[] is = request.getPayload();
	request.removeNode();
	return is;
    }
    
    final void method2346(int i) {
	if (i == 27872) {
	    anInt6366++;
	    if (fileIndex != null) {
		aBoolean6371 = true;
		if (aClass262_6372 == null)
		    aClass262_6372 = new Deque();
	    }
	}
    }
    
    final void method2338(byte i, int entry) {
	anInt6345++;
	if (i != -52)
	    indexTable = null;
	if (fileIndex != null) {
	    for (Node class348 = requestsDeque.getFirst(i ^ ~0x37);
		class348 != null;
		class348 = requestsDeque.nextForward((byte) 124)) {
		if ((long) entry == ((Node) class348).nodeKey)
		    return;
	    }
	    Node class348 = new Node();
	    ((Node) class348).nodeKey = (long) entry;
	    requestsDeque.addToFront(class348, -20180);
	}
    }
    
    static final String method2347(byte i) {
	if (i != -119)
	    return null;
	anInt6343++;
	if (Class5_Sub1.aBoolean8335
	    || BitmapTable.aClass348_Sub42_Sub12_3963 == null)
	    return "";
	if (((((Class348_Sub42_Sub12) BitmapTable.aClass348_Sub42_Sub12_3963)
	      .aString9601) == null
	     || (((Class348_Sub42_Sub12) BitmapTable.aClass348_Sub42_Sub12_3963)
		     .aString9601.length()
		 ^ 0xffffffff) == -1)
	    && (((Class348_Sub42_Sub12) BitmapTable.aClass348_Sub42_Sub12_3963)
		.aString9595) != null
	    && ((Class348_Sub42_Sub12) BitmapTable.aClass348_Sub42_Sub12_3963)
		   .aString9595.length() > 0)
	    return (((Class348_Sub42_Sub12)
		     BitmapTable.aClass348_Sub42_Sub12_3963)
		    .aString9595);
	return (((Class348_Sub42_Sub12) BitmapTable.aClass348_Sub42_Sub12_3963)
		.aString9601);
    }
    
    static final int method2348(int i) {
	anInt6353++;
	if (i != -8454)
	    method2352(44, -11, 126);
	int i_6_;
	if (Class226.anInt2964 < 96) {
	    Class348_Sub40_Sub12.method3076(0, true);
	    i_6_ = 1;
	} else {
	    int i_7_ = Class284.method2116(-26584);
	    if (i_7_ > 100) {
		if ((i_7_ ^ 0xffffffff) >= -501) {
		    i_6_ = 3;
		    Class47.method447((byte) -59);
		} else if (i_7_ <= 1000) {
		    i_6_ = 2;
		    ConnectionMode.method1263(true);
		} else {
		    Class348_Sub40_Sub12.method3076(0, true);
		    i_6_ = 1;
		}
	    } else {
		i_6_ = 4;
		Class133.method1140(58);
	    }
	}
	if (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		.aClass239_Sub25_7271.method1829(-32350)
	    != 0) {
	    BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						     (((Class348_Sub51)
						       (BitmapTable
							.aClass348_Sub51_3959))
						      .aClass239_Sub25_7251),
						     0);
	    Class367_Sub10.method3553(false, (byte) 120, 0);
	}
	Class14_Sub2.method243(37);
	return i_6_;
    }
    
    final int getTableRequestPercentComplete() {
	anInt6367++;
	if (getIndexTable() == null) {
	    if (indexTableRequest == null)
		return 0;
	    return indexTableRequest.getPercentComplete();
	}
	return 100;
    }
    
    final int getLoadedPercent(int i) {
	anInt6341++;
	FileRequest request = ((FileRequest) requestTable.get((long) i));
	if (request != null)
	    return request.getPercentComplete();
	return 0;
    }
    
    private final FileRequest process(int file, int type) {
	anInt6362++;
	FileRequest request = ((FileRequest) requestTable.get((long) file));
	if (request != null && type == 0 && !((FileRequest) request).boolParameter && ((FileRequest) request).isActive) {
	    request.removeNode();
	    request = null;
	}
	if (request == null) {
	    if (type == 0) {
		if (fileIndex == null || archiveStates[file] == -1) {
		    if (requestWorker.isPriorityRequestsFull())
			return null;
		    request = requestWorker.createOndemandRequest((byte) 2, true, file, indexId);
		} else
		    request = fileIndexWorker.createQuickReadRequest(fileIndex, file, (byte) -110);
	    } else if (type == -1) {
		if (fileIndex == null)
		    throw new RuntimeException();
		request  = fileIndexWorker.createReadRequest(fileIndex, file);
	    } else {
		if (type != -2)
		    throw new RuntimeException();
		if (fileIndex == null)
		    throw new RuntimeException();
		if (archiveStates[file] != -1)
		    throw new RuntimeException();
		if (requestWorker.isRegularRequestsFull())
		    return null;
		request = requestWorker.createOndemandRequest((byte) 2, false, file, indexId);
	    }
	    requestTable.putNode((long) file, request);
	}
	if (((FileRequest) request).isActive)
	    return null;
	byte[] srcArray = request.getPayload();
	if (!(request instanceof FileIndexRequest)) {
	    try {
		if (srcArray == null || srcArray.length <= 2)
		    throw new RuntimeException();
		GametipDefinition.CRC32.reset();
		GametipDefinition.CRC32.update(srcArray, 0, srcArray.length - 2);
		int i_11_ = (int) GametipDefinition.CRC32.getValue();
		if ((i_11_ ^ 0xffffffff) != (((IndexTable) indexTable).checksums[file] ^ 0xffffffff))
		    throw new RuntimeException();
		if (((IndexTable) indexTable).whirlpoolDigests != null && (((IndexTable) indexTable).whirlpoolDigests[file] != null)) {
		    byte[] tableDigest = ((IndexTable) indexTable).whirlpoolDigests[file];
		    byte[] srcDigest = Class348_Sub1_Sub2.getWhirlpoolDigest(srcArray, 0, srcArray.length + -2);
		    for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -65; i_14_++) {
			if ((srcDigest[i_14_] ^ 0xffffffff) != (tableDigest[i_14_] ^ 0xffffffff))
			    throw new RuntimeException();
		    }
		}
		((OndemandWorker) requestWorker).attempts = 0;
		((OndemandWorker) requestWorker).status = 0;
	    } catch (RuntimeException runtimeexception) {
		requestWorker.setDecipherKey(-1);
		request.removeNode();
		if (((FileRequest) request).boolParameter
		    && !requestWorker.isPriorityRequestsFull()) {
		    OndemandFileRequest class348_sub42_sub16_sub1
			= requestWorker.createOndemandRequest((byte) 2, true,
						    file, indexId);
		    requestTable.putNode((long) file,
					      class348_sub42_sub16_sub1);
		}
		return null;
	    }
	    srcArray[srcArray.length - 2] = (byte) (((IndexTable) indexTable).versions[file] >>> 8);
	    srcArray[srcArray.length - 1] = (byte) ((IndexTable) indexTable).versions[file];
	    if (fileIndex != null) {
		fileIndexWorker.createWriteRequest(srcArray, fileIndex, file);
		if (archiveStates[file] != -2) {
		    anInt6361++;
		    archiveStates[file] = (byte) 1;
		}
	    }
	    if (!((FileRequest) request).boolParameter)
		request.removeNode();
	    return request;
	}
	try {
	    if (srcArray == null || (srcArray.length ^ 0xffffffff) >= -3)
		throw new RuntimeException();
	    GametipDefinition.CRC32.reset();
	    GametipDefinition.CRC32.update(srcArray, 0, srcArray.length - 2);
	    int i_15_ = (int) GametipDefinition.CRC32.getValue();
	    if ((((IndexTable) indexTable).checksums[file] ^ 0xffffffff) != (i_15_ ^ 0xffffffff))
		throw new RuntimeException();
	    if (((IndexTable) indexTable).whirlpoolDigests != null
		&& (((IndexTable) indexTable).whirlpoolDigests[file]
		    != null)) {
		byte[] is_16_ = ((IndexTable) indexTable).whirlpoolDigests[file];
		byte[] is_17_ = Class348_Sub1_Sub2.getWhirlpoolDigest(srcArray, 0, srcArray.length - 2);
		for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > -65; i_18_++) {
		    if ((is_16_[i_18_] ^ 0xffffffff) != (is_17_[i_18_] ^ 0xffffffff))
			throw new RuntimeException();
		}
	    }
	    int i_19_ = ((0xff00 & srcArray[-2 + srcArray.length] << -1875567128) + (0xff & srcArray[srcArray.length + -1]));
	    if ((((IndexTable) indexTable).versions[file] & 0xffff)
		!= i_19_)
		throw new RuntimeException();
	    if (archiveStates[file] != 1) {
		anInt6361++;
		archiveStates[file] = (byte) 1;
	    }
	    if (!((FileRequest) request).boolParameter)
		request.removeNode();
	    return request;
	} catch (Exception exception) {
	    archiveStates[file] = (byte) -1;
	    request.removeNode();
	    if (((FileRequest) request).boolParameter
		&& !requestWorker.isPriorityRequestsFull()) {
		OndemandFileRequest class348_sub42_sub16_sub1
		    = requestWorker.createOndemandRequest((byte) 2, true, file,
						indexId);
		requestTable.putNode((long) file,
					  class348_sub42_sub16_sub1);
	    }
	    return null;
	}
    }
    
    final int method2351(int i) {
	if (i != 0)
	    return -19;
	anInt6359++;
	return anInt6361;
    }
    
    final IndexTable getIndexTable() {
	anInt6348++;
	if (indexTable != null)
	    return indexTable;
	if (indexTableRequest == null) {
	    if (requestWorker.isPriorityRequestsFull())
		return null;
	    indexTableRequest = requestWorker.createOndemandRequest((byte) 0, true, indexId, 255);
	}
	if (((FileRequest) indexTableRequest).isActive)
	    return null;
	byte[] is = indexTableRequest.getPayload();
	do {
	    if (indexTableRequest
		instanceof FileIndexRequest) {
		try {
		    if (is == null)
			throw new RuntimeException();
		    indexTable
			= new IndexTable(is, checksum, src);
                    if(!Main.skipUpdate)
                        if ((((IndexTable) indexTable).tableVersion ^ 0xffffffff) != (anInt6352 ^ 0xffffffff))
                            throw new RuntimeException();
		    break;
		} catch (RuntimeException runtimeexception) {
		    indexTable = null;
		    if (requestWorker.isPriorityRequestsFull())
			indexTableRequest = null;
		    else
			indexTableRequest = requestWorker.createOndemandRequest((byte) 0, true, indexId, 255);
		    return null;
		}
	    }
	    try {
		if (is == null)
		    throw new RuntimeException();
		indexTable = new IndexTable(is, checksum, src);
	    } catch (RuntimeException runtimeexception) {
		requestWorker.setDecipherKey(-1);
		indexTable = null;
		if (requestWorker.isPriorityRequestsFull())
		    indexTableRequest = null;
		else
		    indexTableRequest
			= requestWorker.createOndemandRequest((byte) 0, true,
						    indexId, 255);
		return null;
	    }
	    if (aClass137_6364 != null)
		fileIndexWorker.createWriteRequest(is, aClass137_6364,
					  indexId);
	} while (false);
	indexTableRequest = null;
	if (fileIndex != null) {
	    anInt6361 = 0;
	    archiveStates = new byte[((IndexTable) indexTable).maximumEntry];
	}
	return indexTable;
    }
    
    static final boolean method2352(int i, int i_20_, int i_21_) {
	anInt6358++;
	if ((0x10 & i_21_ ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
    
    ArchiveLoader(int i, FileIndex class137, FileIndex class137_23_, OndemandWorker requester, FileIndexWorker class112, int i_24_, byte[] is, int i_25_, boolean bool) {
	requestTable = new HashTable(16);
	anInt6373 = 0;
	requestsDeque = new Deque();
	aLong6374 = 0L;
	do {
	    try {
		indexId = i;
		fileIndex = class137;
		if (fileIndex != null) {
		    aBoolean6368 = true;
		    aClass262_6372 = new Deque();
		} else
		    aBoolean6368 = false;
		checksum = i_24_;
		src = is;
		anInt6352 = i_25_;
		aClass137_6364 = class137_23_;
		aBoolean6375 = bool;
		requestWorker = requester;
		fileIndexWorker = class112;
		if (aClass137_6364 == null)
		    break;
		indexTableRequest = fileIndexWorker.createQuickReadRequest(aClass137_6364, indexId, (byte) -112);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929
			  (runtimeexception,
			   ("bja.<init>(" + i + ','
			    + (class137 != null ? "{...}" : "null") + ','
			    + (class137_23_ != null ? "{...}" : "null") + ','
			    + (requester != null ? "{...}" : "null") + ','
			    + (class112 != null ? "{...}" : "null") + ','
			    + i_24_ + ',' + (is != null ? "{...}" : "null")
			    + ',' + i_25_ + ',' + bool + ')'));
	    }
	    break;
	} while (false);
    }
}
