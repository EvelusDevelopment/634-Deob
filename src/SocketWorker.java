/* SocketWorker - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

final class SocketWorker implements Runnable
{
    static int anInt2646;
    static int anInt2647;
    private int anInt2648 = 0;
    private Signlink signlink;
    static int anInt2650;
    static int anInt2651;
    private InputStream inputstream;
    static int anInt2653;
    private boolean isPaused = false;
    static int anInt2655;
    private int anInt2656 = 0;
    private OutputStream outputstream;
    private SignlinkRequest request;
    private boolean caughIoex = false;
    static int anInt2660;
    static OutgoingPacket aClass351_2661 = new OutgoingPacket(24, 7);
    static int anInt2662;
    private byte[] aByteArray2663;
    static int anInt2664;
    static IncomingPacket aClass114_2665 = new IncomingPacket(12, 0);
    static int anInt2666;
    static int anInt2667;
    private Socket socket;
    private int bufferSize;
    static int anInt2670 = 0;
    static Cache aClass60_2671 = new Cache(10);
    
    final int getAvailable(byte i) throws IOException {
	anInt2651++;
	if (i != 83)
	    aClass114_2665 = null;
	if (isPaused)
	    return 0;
	return inputstream.available();
    }
    
    final void initializeWorkers(int i) {
	anInt2667++;
	if (!isPaused) {
	    inputstream = new DummyInputstream();
	    outputstream = new DummyOutputstream();
	}
    }
    
    static final void method1469(int i) {
	anInt2662++;
	Class286.anInt3682 = 0;
	Class239_Sub24.anInt6095 = 0;
	int i_0_ = 29 % ((-42 - i) / 63);
	for (int i_1_ = 0;
	     (i_1_ ^ 0xffffffff) > (Class250.anInt3225 ^ 0xffffffff); i_1_++) {
	    int i_2_ = Class31.anInt425 * i_1_;
	    for (int i_3_ = 0; i_3_ < Class31.anInt425; i_3_++) {
		int i_4_ = i_2_ - -i_3_;
		Class92.anInterface4Array1525[i_4_].drawf
		    (i_3_ * Class58.anInt1067, i_1_ * AbstractBuffer.anInt4267,
		     Class58.anInt1067, AbstractBuffer.anInt4267, 0, 0, true, true);
	    }
	}
    }
    
    final void write(byte[] src, int off, int len)
	throws IOException {
	anInt2655++;
	if (!isPaused) {
	    if (caughIoex) {
		caughIoex = false;
		throw new IOException();
	    }
	    if (aByteArray2663 == null)
		aByteArray2663 = new byte[bufferSize];
	    synchronized (this) {
		
		    for (int i_7_ = 0; (len ^ 0xffffffff) < (i_7_ ^ 0xffffffff);
			 i_7_++) {
			aByteArray2663[anInt2648] = src[i_7_ + off];
			anInt2648 = (anInt2648 - -1) % bufferSize;
			if (((anInt2656 - (-bufferSize - -100)) % bufferSize
			     ^ 0xffffffff)
			    == (anInt2648 ^ 0xffffffff))
			    throw new IOException();
		    }
		    if (request == null)
			request
			    = signlink.createThreadRequest(this, -10240, 3);
		    this.notifyAll();
		
	    }
	}
    }
    
    public static void method1471(byte i) {
	if (i >= 80) {
	    aClass60_2671 = null;
	    aClass114_2665 = null;
	    aClass351_2661 = null;
	}
    }
    
    final void method1472() throws IOException {
	anInt2650++;
	if (!isPaused) {
	    if (caughIoex) {
		caughIoex = false;
		throw new IOException();
	    }
	}
    }
    
    final int readByte() throws IOException {
	anInt2647++;
	if (isPaused)
	    return 0;
	return inputstream.read();
    }
    
    public final void run() {
	try {
	    for (;;) {
		int i;
		int i_8_;
		synchronized (this) {
		    if (anInt2648 == anInt2656) {
			if (isPaused)
			    break;
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
		    }
		    i = anInt2656;
		    if (anInt2656 > anInt2648)
			i_8_ = bufferSize - anInt2656;
		    else
			i_8_ = -anInt2656 + anInt2648;
		}
		if (i_8_ > 0) {
		    try {
			outputstream.write(aByteArray2663, i, i_8_);
		    } catch (IOException ioexception) {
			caughIoex = true;
		    }
		    anInt2656 = (i_8_ + anInt2656) % bufferSize;
		    try {
			if (anInt2648 == anInt2656)
			    outputstream.flush();
		    } catch (IOException ioexception) {
			caughIoex = true;
		    }
		}
	    }
	    try {
		if (inputstream != null)
		    inputstream.close();
		if (outputstream != null)
		    outputstream.close();
		if (socket != null)
		    socket.close();
	    } catch (IOException ioexception) {
		/* empty */
	    }
	    aByteArray2663 = null;
	} catch (Exception exception) {
	    Class156.method1242(null, exception, 15004);
	}
	anInt2664++;
    }
    
    final void read(byte[] is, int i, byte i_9_, int i_10_)
	throws IOException {
	anInt2666++;
	if (!isPaused) {
	    while (i_10_ > 0) {
		int i_11_ = inputstream.read(is, i, i_10_);
		if ((i_11_ ^ 0xffffffff) >= -1)
		    throw new EOFException();
		i_10_ -= i_11_;
		i += i_11_;
	    }
	    if (i_9_ != -72)
		run();
	}
    }
    
    static final boolean method1475(byte i, int i_12_, int i_13_) {
	anInt2653++;
	if (i > -95)
	    method1469(-48);
	return (Class286_Sub9.method2174((byte) -115, i_13_, i_12_)
		& FileIndex.method1163(i_12_, (byte) -72, i_13_));
    }
    
    protected final void finalize() {
	anInt2646++;
	reset();
    }
    
    final void reset() {
	anInt2660++;
	if (!isPaused) {
	    synchronized (this) {
		isPaused = true;
		this.notifyAll();
	    }
	    if (request != null) {
		while (request.state == 0)
		    Class286_Sub5.method2161((byte) 105, 1L);
		if (request.state == 1) {
		    try {
			((Thread) request.returnObj).join();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    request = null;
	}
    }
    
    SocketWorker(Socket s, Signlink sl, int size) throws IOException {
	try {
	    socket = s;
	    signlink = sl;
	    socket.setSoTimeout(30000);
	    socket.setTcpNoDelay(true);
	    inputstream = socket.getInputStream();
	    outputstream = socket.getOutputStream();
	    bufferSize = size;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("re.<init>("
					     + (socket != null ? "{...}"
						: "null")
					     + ','
					     + (sl != null ? "{...}"
						: "null")
					     + ',' + size + ')'));
	}
    }
}
