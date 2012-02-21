/* FileIndexWorker - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class FileIndexWorker implements Runnable
{
    static int anInt1726;
    static Sprite aClass207_1727;
    static int anInt1728;
    static int anInt1729;
    private Queue requestQueue = new Queue();
    static int anInt1731;
    static int anInt1732;
    private Thread thread;
    int amountRequests;
    static int anInt1735;
    static int cycle;
    static int anInt1737;
    private boolean aBoolean1738 = false;
    
    final FileIndexRequest createWriteRequest(byte[] src, FileIndex index, int file) {
	try {
	    anInt1732++;
	    FileIndexRequest request = new FileIndexRequest();
	    ((FileIndexRequest) request).payload = src;
	    ((FileRequest) request).boolParameter = false;
	    ((FileIndexRequest) request).fileIndex = index;
	    ((SubNode) request).subnodeKey = (long) file;
	    ((FileIndexRequest) request).type = 2;
	    addRequest(request);
	    return request;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("aca.G("
					     + (src != null ? "{...}" : "null")
					     + ','
					     + (index != null ? "{...}"
						: "null")
					      + ',' + file + ')'));
	}
    }
    
    private final void addRequest(FileIndexRequest request) {
	anInt1735++;
	synchronized (requestQueue) {
	    requestQueue.add(request);
	    ((FileIndexWorker) this).amountRequests++;
	    requestQueue.notifyAll();
	}
    }
    
    final void method1051(boolean bool) {
	aBoolean1738 = bool;
	anInt1731++;
	synchronized (requestQueue) {
	    requestQueue.notifyAll();
	}
	try {
	    thread.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	thread = null;
    }
    
    public static void method1052(byte i) {
	aClass207_1727 = null;
    }
    
    static final int method1053(int i) {
	anInt1728++;
	if (i != 3112)
	    method1052((byte) 121);
	if (Class289.aClass46_3701 == null) {
	    if (!Class5_Sub1.aBoolean8335
		&& BitmapTable.aClass348_Sub42_Sub12_3963 != null)
		return (((Class348_Sub42_Sub12)
			 BitmapTable.aClass348_Sub42_Sub12_3963)
			.anInt9609);
	    int i_2_ = Class258_Sub4.mouseMovementListener.method3597(true);
	    int i_3_ = Class258_Sub4.mouseMovementListener.method3594((byte) 81);
	    if (Class348_Sub42_Sub6.aBoolean9535) {
		if ((Class135_Sub1.anInt4717 ^ 0xffffffff) <= (i_2_
							       ^ 0xffffffff)
		    || i_2_ >= Class63.anInt1117 + Class135_Sub1.anInt4717) {
		    if (Class242.aClass348_Sub42_Sub13_3152 != null
			&& Class50_Sub3.anInt5252 < i_2_
			&& (i_2_ ^ 0xffffffff) > ((Class348_Sub1_Sub1.anInt8806
						   + Class50_Sub3.anInt5252)
						  ^ 0xffffffff)) {
			int i_4_ = -1;
			for (int i_5_ = 0;
			     ((i_5_ ^ 0xffffffff)
			      > ((((Class348_Sub42_Sub13)
				   Class242.aClass348_Sub42_Sub13_3152)
				  .anInt9615)
				 ^ 0xffffffff));
			     i_5_++) {
			    if (!Class71.aBoolean1211) {
				int i_6_ = i_5_ * 16 + 31 + AbstractMouseListener.anInt4534;
				if ((i_3_ ^ 0xffffffff) < (-13 + i_6_
							   ^ 0xffffffff)
				    && i_6_ - -3 >= i_3_)
				    i_4_ = i_5_;
			    } else {
				int i_7_
				    = AbstractMouseListener.anInt4534 + (33 + 16 * i_5_);
				if (-13 + i_7_ < i_3_
				    && (i_3_ ^ 0xffffffff) >= (3 + i_7_
							       ^ 0xffffffff))
				    i_4_ = i_5_;
			    }
			}
			if ((i_4_ ^ 0xffffffff) != 0) {
			    int i_8_ = 0;
			    Class156 class156
				= new Class156(((Class348_Sub42_Sub13)
						(Class242
						 .aClass348_Sub42_Sub13_3152))
					       .aClass107_9621);
			    for (Class348_Sub42_Sub12 class348_sub42_sub12
				     = ((Class348_Sub42_Sub12)
					class156.method1240(9));
				 class348_sub42_sub12 != null;
				 class348_sub42_sub12
				     = ((Class348_Sub42_Sub12)
					class156.method1243((byte) 90))) {
				if (i_8_++ == i_4_)
				    return (((Class348_Sub42_Sub12)
					     class348_sub42_sub12)
					    .anInt9609);
			    }
			}
		    }
		} else {
		    int i_9_ = -1;
		    for (int i_10_ = 0; Class8.anInt166 > i_10_; i_10_++) {
			if (Class71.aBoolean1211) {
			    int i_11_ = (Class348_Sub42_Sub5.anInt9532 - -33
					 - -(i_10_ * 16));
			    if ((-13 + i_11_ ^ 0xffffffff) > (i_3_
							      ^ 0xffffffff)
				&& i_3_ <= i_11_ + 3)
				i_9_ = i_10_;
			} else {
			    int i_12_ = (i_10_ * 16 + 31
					 + Class348_Sub42_Sub5.anInt9532);
			    if ((-13 + i_12_ ^ 0xffffffff) > (i_3_
							      ^ 0xffffffff)
				&& (i_12_ + 3 ^ 0xffffffff) <= (i_3_
								^ 0xffffffff))
				i_9_ = i_10_;
			}
		    }
		    if (i_9_ != -1) {
			int i_13_ = 0;
			Class156 class156
			    = new Class156(Class233.aClass107_3022);
			for (Class348_Sub42_Sub13 class348_sub42_sub13
				 = ((Class348_Sub42_Sub13)
				    class156.method1240(110));
			     class348_sub42_sub13 != null;
			     class348_sub42_sub13
				 = ((Class348_Sub42_Sub13)
				    class156.method1243((byte) 77))) {
			    if (i_9_ == i_13_++)
				return ((Class348_Sub42_Sub12)
					(Class348_Sub42_Sub12)
					(((SubNode)
					  (((Queue) (((Class348_Sub42_Sub13)
							 class348_sub42_sub13)
							.aClass107_9621))
					   .parent))
					 .subnodeParent)).anInt9609;
			}
		    }
		}
	    } else if ((Class135_Sub1.anInt4717 ^ 0xffffffff) > (i_2_
								 ^ 0xffffffff)
		       && (i_2_
			   < Class135_Sub1.anInt4717 - -Class63.anInt1117)) {
		int i_14_ = -1;
		for (int i_15_ = 0; FileArchiveTracker.anInt4776 > i_15_; i_15_++) {
		    if (!Class71.aBoolean1211) {
			int i_16_
			    = 31 + (Class348_Sub42_Sub5.anInt9532
				    + (-i_15_ + (FileArchiveTracker.anInt4776 - 1)) * 16);
			if ((i_3_ ^ 0xffffffff) < (-13 + i_16_ ^ 0xffffffff)
			    && i_16_ + 3 >= i_3_)
			    i_14_ = i_15_;
		    } else {
			int i_17_ = ((-i_15_ + (-1 + FileArchiveTracker.anInt4776)) * 16
				     + Class348_Sub42_Sub5.anInt9532 + 33);
			if (i_3_ > i_17_ - 13
			    && (i_3_ ^ 0xffffffff) >= (i_17_ + 3 ^ 0xffffffff))
			    i_14_ = i_15_;
		    }
		}
		if ((i_14_ ^ 0xffffffff) != 0) {
		    int i_18_ = 0;
		    Class312 class312
			= new Class312(Class348_Sub40_Sub4.aClass262_9111);
		    for (Class348_Sub42_Sub12 class348_sub42_sub12
			     = ((Class348_Sub42_Sub12)
				class312.method2327((byte) -53));
			 class348_sub42_sub12 != null;
			 class348_sub42_sub12
			     = ((Class348_Sub42_Sub12)
				class312.method2329(i + -3102))) {
			if (i_14_ == i_18_++)
			    return (((Class348_Sub42_Sub12)
				     class348_sub42_sub12)
				    .anInt9609);
		    }
		}
	    }
	}
	return -1;
    }
    
    final FileIndexRequest createReadRequest(FileIndex index, int file) {
	anInt1729++;
	FileIndexRequest request = new FileIndexRequest();
	((FileRequest) request).boolParameter = false;
	((FileIndexRequest) request).type = 3;
	((SubNode) request).subnodeKey = (long) file;
	((FileIndexRequest) request).fileIndex = index;
	addRequest(request);
	return request;
    }
    
    public final void run() {
	while (!aBoolean1738) {
	    FileIndexRequest request;
	    synchronized (requestQueue) {
		request = ((FileIndexRequest) requestQueue.removeFirst());
		if (request != null)
		    ((FileIndexWorker) this).amountRequests--;
		else {
		    try {
			requestQueue.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		    continue;
		}
	    }
	    try {
		if ((((FileIndexRequest) request).type) != 2) {
		    if (((FileIndexRequest) request).type == 3)
			((FileIndexRequest) request).payload = (((FileIndexRequest) request).fileIndex.getArchive((byte) -4, (int) ((SubNode) request).subnodeKey));
		} else
		    ((FileIndexRequest) request).fileIndex.writeArchive(((FileIndexRequest)request ).payload.length, (int) (((SubNode) request).subnodeKey), ((FileIndexRequest) request).payload, -7305);
	    } catch (Exception exception) {
		Class156.method1242(null, exception, 15004);
	    }
	    ((FileRequest) request).isActive = false;
	}
	cycle++;
    }
    
    final FileIndexRequest createQuickReadRequest(FileIndex index, int file, byte i_20_) {
	anInt1737++;
	FileIndexRequest request = new FileIndexRequest();
	((FileIndexRequest) request).type = 1;
	synchronized (requestQueue) {
	    for (FileIndexRequest fileRequest = ((FileIndexRequest) requestQueue.getFirst()); fileRequest != null; fileRequest = ((FileIndexRequest) requestQueue.next())) {
		if ((((SubNode) fileRequest).subnodeKey == (long) file) && (((FileIndexRequest) fileRequest).fileIndex == index) && ((FileIndexRequest) fileRequest).type == 2) {
		    ((FileIndexRequest) request).payload = ((FileIndexRequest) fileRequest).payload;
		    ((FileRequest) request).isActive = false;
		    return request;
		}
	    }
	}
	((FileIndexRequest) request).payload = index.getArchive((byte) -4, file);
	((FileRequest) request).boolParameter = true;
	((FileRequest) request).isActive = false;
	return request;
    }
    
    FileIndexWorker(Signlink sinklink) {
	((FileIndexWorker) this).amountRequests = 0;
	SignlinkRequest request = sinklink.createThreadRequest(this, -10240, 5);
	while (request.state == 0)
	    Class286_Sub5.method2161((byte) 43, 10L);
	if ((request.state ^ 0xffffffff) == -3)
	    throw new RuntimeException();
	thread = (Thread) request.returnObj;
    }
}
