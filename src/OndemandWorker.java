/* OndemandWorker - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class OndemandWorker
{
    static int anInt3185;
    static int anInt3186;
    static int anInt3187;
    static int anInt3188;
    static int anInt3189;
    static int anInt3190;
    static int anInt3191;
    static int anInt3192;
    static int anInt3193;
    static int anInt3194;
    static int anInt3195;
    static Class229 aClass229_3196 = new Class229();
    private Queue priRequestsQueue = new Queue();
    static int anInt3198;
    static int anInt3199;
    static int anInt3200;
    static int anInt3201;
    static int anInt3202;
    static int anInt3203 = -1;
    private Queue priHoldingQueue = new Queue();
    private Queue requestsQueue = new Queue();
    private Queue reqHoldingQueue = new Queue();
    private long lastTime;
    private ByteBuffer requestByteBuffer = new ByteBuffer(4);
    private SocketWorker socketWorker;
    private int totalTime;
    private ByteBuffer headerBuffer;
    private byte decipherKey = 0;
    volatile int attempts = 0;
    volatile int status = 0;
    private OndemandFileRequest currentFileRequest;
    
    final void writeStatusUpdate(boolean connected) {
	anInt3194++;
	if (socketWorker != null) {
	    try {
		((ByteBuffer) requestByteBuffer).position = 0;
		requestByteBuffer.putByte(connected ? 2 : 3);
		requestByteBuffer.putTri(0);
		socketWorker.write((((ByteBuffer) requestByteBuffer).payload), 0, 4);
	    } catch (IOException ioexception) {
		try {
		    socketWorker.reset();
		} catch (Exception exception) {
		    /* empty */
		}
		((OndemandWorker) this).attempts++;
		socketWorker = null;
		((OndemandWorker) this).status = -2;
	    }
	}
    }
    
    final boolean process() {
	if (socketWorker != null) {
	    long curTime = Class62.getCurrentTimeMillis();
	    int delta = (int) (curTime - lastTime);
	    if ((delta ^ 0xffffffff) < -201)
		delta = 200;
	    lastTime = curTime;
	    totalTime += delta;
	    if (totalTime > 30000) {
		try {
		    socketWorker.reset();
		} catch (Exception exception) {
		    /* empty */
		}
		socketWorker = null;
	    }
	}
	anInt3190++;
	if (socketWorker == null) {
	    if (getTotalPriRequests() != 0 || getTotalRegRequests() != 0)
		return false;
	    return true;
	}
	try {
	    socketWorker.method1472();
	    for (OndemandFileRequest request = ((OndemandFileRequest) priRequestsQueue.getFirst()); request != null; request = ((OndemandFileRequest) priRequestsQueue.next())) {
		((ByteBuffer) requestByteBuffer).position = 0;
		requestByteBuffer.putByte(1);
		requestByteBuffer.putTri((int) (((SubNode) request).subnodeKey));
		socketWorker.write((((ByteBuffer) requestByteBuffer).payload), 0, 4);
		priHoldingQueue.add(request);
	    }
	    OndemandFileRequest request = (OndemandFileRequest) requestsQueue.getFirst();
	    for (/**/; request != null; request = ((OndemandFileRequest) requestsQueue.next())) {
		((ByteBuffer) requestByteBuffer).position = 0;
		requestByteBuffer.putByte(0);
		requestByteBuffer.putTri((int) (((SubNode) request).subnodeKey));
		socketWorker.write((((ByteBuffer) requestByteBuffer).payload), 0, 4);
		reqHoldingQueue.add(request);
	    }
	    for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -101; i_1_++) {
		int avail = socketWorker.getAvailable((byte) 83);
		if ((avail ^ 0xffffffff) > -1)
		    throw new IOException();
		if (avail == 0)
		    break;
		totalTime = 0;
		int availNeeded = 0;
		if (currentFileRequest == null)
		    availNeeded = 8;
		else if (((OndemandFileRequest) currentFileRequest).blockOffset == 0)
		    availNeeded = 1;
		if ((availNeeded ^ 0xffffffff) >= -1) {
		    int fileOffset = (((ByteBuffer) (((OndemandFileRequest) currentFileRequest).buffer)).payload.length - ((OndemandFileRequest) currentFileRequest).loadOffset);
		    int blockOffset = (512 - ((OndemandFileRequest) currentFileRequest).blockOffset);
		    if ((fileOffset - ((ByteBuffer) (((OndemandFileRequest) currentFileRequest).buffer)).position) > blockOffset)
			blockOffset = fileOffset - ((ByteBuffer) (((OndemandFileRequest) currentFileRequest).buffer)).position;
		    if (avail < blockOffset)
			blockOffset = avail;
		    socketWorker.read((((ByteBuffer) (((OndemandFileRequest) currentFileRequest).buffer)).payload), ((ByteBuffer) (((OndemandFileRequest) currentFileRequest).buffer)).position, (byte) -72, blockOffset);
		    if (decipherKey != 0) {
			for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (blockOffset ^ 0xffffffff); i_6_++)
			    ((ByteBuffer) (((OndemandFileRequest) currentFileRequest).buffer)).payload[i_6_ + ((ByteBuffer)(((OndemandFileRequest)currentFileRequest).buffer)).position] = (byte) (Class348_Sub21.XOR((((ByteBuffer)(((OndemandFileRequest) currentFileRequest).buffer)).payload[(i_6_ + (((ByteBuffer)(((OndemandFileRequest)currentFileRequest).buffer)).position))]), decipherKey));
		    }
		    ((OndemandFileRequest) currentFileRequest).blockOffset += blockOffset;
		    ((ByteBuffer) (((OndemandFileRequest) currentFileRequest).buffer)).position += blockOffset;
		    if ((((ByteBuffer) (((OndemandFileRequest) currentFileRequest).buffer)).position ^ 0xffffffff) == (fileOffset ^ 0xffffffff)) {
			currentFileRequest.removeSubnode();
			((FileRequest) currentFileRequest).isActive = false;
			currentFileRequest = null;
		    } else if (((OndemandFileRequest) currentFileRequest).blockOffset == 512)
			((OndemandFileRequest) currentFileRequest).blockOffset = 0;
		} else {
		    int i_7_ = availNeeded - (((ByteBuffer) headerBuffer).position);
		    if (avail < i_7_)
			i_7_ = avail;
		    socketWorker.read((((ByteBuffer) headerBuffer).payload), ((ByteBuffer) headerBuffer).position, (byte) -72, i_7_);
		    if ((decipherKey ^ 0xffffffff) != -1) {
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
			    ((ByteBuffer) headerBuffer).payload[i_8_ + ((ByteBuffer) headerBuffer).position] = (byte) (Class348_Sub21.XOR((((ByteBuffer)headerBuffer).payload[i_8_ + (((ByteBuffer) headerBuffer).position)]), decipherKey));
		    }
		    ((ByteBuffer) headerBuffer).position += i_7_;
		    if (((ByteBuffer) headerBuffer).position >= availNeeded) {
			if (currentFileRequest == null) {
			    ((ByteBuffer) headerBuffer).position
				= 0;
			    int index = headerBuffer.getUByte();
			    int file = headerBuffer.getShort();
			    int settings = headerBuffer.getUByte();
			    int archiveSize = headerBuffer.getDWord();
			    int compression = 0x7f & settings;
			    boolean isNormalRequest = (0x80 & settings) != 0;
			    long archiveHash = (long) ((index << 16) + file);
			    Object object = null;
			    OndemandFileRequest fileRequest;
			    if (isNormalRequest) {
				for (fileRequest = ((OndemandFileRequest) reqHoldingQueue.getFirst()); fileRequest != null; fileRequest = ((OndemandFileRequest) reqHoldingQueue.next())) {
                                     if(archiveHash == (((SubNode) fileRequest).subnodeKey))
                                        break;
				}
			    } else {
				for (fileRequest = ((OndemandFileRequest) priHoldingQueue.getFirst()); fileRequest != null; fileRequest  = ((OndemandFileRequest) priHoldingQueue.next()))  {
				    if ((((SubNode) fileRequest).subnodeKey) == archiveHash)
					break;
                                }
			    }
			    if (fileRequest == null)
				throw new IOException();
			    int headerSize = (compression ^ 0xffffffff) == -1 ? 5 : 9;
			    currentFileRequest = fileRequest;
			    ((OndemandFileRequest) currentFileRequest).buffer = (new ByteBuffer((((OndemandFileRequest) currentFileRequest).loadOffset) + headerSize + archiveSize));
			    ((OndemandFileRequest)
			     currentFileRequest).buffer.putByte(compression);
			    ((OndemandFileRequest) currentFileRequest).buffer.putInt(archiveSize);
			    ((ByteBuffer) headerBuffer).position= 0;
			    ((OndemandFileRequest) currentFileRequest).blockOffset = 8;
			} else if ((((OndemandFileRequest) currentFileRequest).blockOffset) == 0) {
			    if ((((ByteBuffer) headerBuffer).payload[0]) != -1)
				currentFileRequest = null;
			    else {
				((OndemandFileRequest) currentFileRequest).blockOffset = 1;
				((ByteBuffer) headerBuffer).position= 0; 
			    }
			} else
			    throw new IOException();
		    }
		}
	    }
	    return true;
	} catch (IOException ioexception) {
	    try {
		socketWorker.reset();
	    } catch (Exception exception) {
		/* empty */
	    }
	    ((OndemandWorker) this).status = -2;
	    ((OndemandWorker) this).attempts++;
	    socketWorker = null;
	    if ((getTotalPriRequests() ^ 0xffffffff) == -1 && getTotalRegRequests() == 0)
		return true;
	    return false;
	}
    }
    
    private final int getTotalRegRequests() {
	anInt3199++;
	return requestsQueue.getSize() + reqHoldingQueue.getSize();
    }
    
    static final void method1895(int i, byte[] is, int i_16_, int i_17_,
				 int i_18_, int i_19_, byte[] is_20_,
				 int i_21_, byte i_22_) {
	try {
	    anInt3198++;
	    int i_23_ = -(i_21_ >> 375931490);
	    i_21_ = -(0x3 & i_21_);
	    if (i_22_ != 121)
		aClass229_3196 = null;
	    for (int i_24_ = -i_16_; (i_24_ ^ 0xffffffff) > -1; i_24_++) {
		for (int i_25_ = i_23_; i_25_ < 0; i_25_++) {
		    is[i_17_++] += -is_20_[i++];
		    is[i_17_++] += -is_20_[i++];
		    is[i_17_++] += -is_20_[i++];
		    is[i_17_++] += -is_20_[i++];
		}
		for (int i_26_ = i_21_; i_26_ < 0; i_26_++)
		    is[i_17_++] += -is_20_[i++];
		i_17_ += i_18_;
		i += i_19_;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("tha.M(" + i + ','
					     + (is != null ? "{...}" : "null")
					     + ',' + i_16_ + ',' + i_17_ + ','
					     + i_18_ + ',' + i_19_ + ','
					     + (is_20_ != null ? "{...}"
						: "null")
					     + ',' + i_21_ + ',' + i_22_
					     + ')'));
	}
    }
    
    private final void writeConnectionRequest() {	
        anInt3191++;
        if (socketWorker != null) {
            try {
                ((ByteBuffer) requestByteBuffer).position = 0;
                requestByteBuffer.putByte(6);
                requestByteBuffer.putTri(3);
                socketWorker.write((((ByteBuffer) requestByteBuffer).payload), 0, 4);
            } catch (IOException ioexception) {
                try {
                    socketWorker.reset();
                } catch (Exception exception) {
                    /* empty */
                }
                ((OndemandWorker) this).status = -2;
                socketWorker = null;
                ((OndemandWorker) this).attempts++;
            }
        }
    }
    
    public static void method1897(byte i) {
	if (i == 119)
	    aClass229_3196 = null;
    }
    
    final void initializeSocketWorkers(boolean bool) {
	if (socketWorker != null)
	    socketWorker.initializeWorkers(72);
	anInt3185++;
    }
    
    final boolean isRegularRequestsFull() {
	anInt3186++;
	if (getTotalRegRequests() < 20)
	    return false;
	return true;
    }
    
    final boolean isPriorityRequestsFull() {
	anInt3195++;
	if (getTotalPriRequests() < 20)
	    return false;
	return true;
    }
    
    final void resetSocket(int i) {
	if (socketWorker != null)
	    socketWorker.reset();
	anInt3200++;
    }
    
    final int getTotalPriRequests() {
	anInt3192++;
	return priRequestsQueue.getSize() + priHoldingQueue.getSize();
    }
    
    final void initialize(boolean isOnline, SocketWorker worker) {
	if (socketWorker != null) {
	    try {
		socketWorker.reset();
	    } catch (Exception exception) {
		/* empty */
	    }
	    socketWorker = null;
	}
	anInt3193++;
	socketWorker = worker;
	writeConnectionRequest();
	writeStatusUpdate(isOnline);
	((ByteBuffer) headerBuffer).position = 0;
	currentFileRequest = null;
	for (;;) {
	    OndemandFileRequest request = (OndemandFileRequest) priHoldingQueue.removeFirst();
	    if (request == null)
		break;
	    priRequestsQueue.add(request);
	}
	for (;;) {
	    OndemandFileRequest request
		= (OndemandFileRequest) reqHoldingQueue.removeFirst();
	    if (request == null)
		break;
	    requestsQueue.add(request);
	}
	if (decipherKey != 0) {
	    try {
		((ByteBuffer) requestByteBuffer).position = 0;
		requestByteBuffer.putByte(4);
		requestByteBuffer.putByte(decipherKey);
		requestByteBuffer.putShort(0);
		socketWorker.write((((ByteBuffer) requestByteBuffer) .payload), 0, 4);
	    } catch (IOException ioexception) {
		try {
		    socketWorker.reset();
		} catch (Exception exception) {
		    /* empty */
		}
		((OndemandWorker) this).status = -2;
		((OndemandWorker) this).attempts++;
		socketWorker = null;
	    }
	}
	totalTime = 0;
	lastTime = Class62.getCurrentTimeMillis();
    }
    
    final void setDecipherKey(int i) {
	try {
	    socketWorker.reset();
	} catch (Exception exception) {
	    /* empty */
	}
	anInt3189++;
	socketWorker = null;
	((OndemandWorker) this).attempts++;
	decipherKey = (byte) (int) (Math.random() * 255.0 + 1.0);
	((OndemandWorker) this).status = i;
    }
    
    final void writeDisconnectRequest() {
	anInt3188++;
	if (socketWorker != null) {
	    try {
		((ByteBuffer) requestByteBuffer).position = 0;
		requestByteBuffer.putByte(7);
		requestByteBuffer.putTri(0);
		socketWorker.write((((ByteBuffer) requestByteBuffer).payload), 0, 4);
	    } catch (IOException ioexception) {
		try {
		    socketWorker.reset();
		} catch (Exception exception) {
		    /* empty */
		}
		((OndemandWorker) this).status = -2;
		((OndemandWorker) this).attempts++;
		socketWorker = null;
	    }
	}
    }
    
    final OndemandFileRequest createOndemandRequest(byte offset, boolean pri, int fileId, int indexId) {
	anInt3187++;
	long hash = (long) ((indexId << -433204560) + fileId);
	OndemandFileRequest fileRequest = new OndemandFileRequest();
	((FileRequest) fileRequest).boolParameter = pri;
	((SubNode) fileRequest).subnodeKey = hash;
	((OndemandFileRequest) fileRequest).loadOffset = offset;
	if (!pri) {
	    if (getTotalRegRequests() >= 20)
		throw new RuntimeException();
	    requestsQueue.add(fileRequest);
	} else {
	    if (getTotalPriRequests() >= 20)
		throw new RuntimeException();
	    priRequestsQueue.add(fileRequest);
	}
	return fileRequest;
    }
    
    public OndemandWorker() {
	headerBuffer = new ByteBuffer(8);
    }
}
