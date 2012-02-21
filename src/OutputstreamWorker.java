/* OutputstreamWorker - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

final class OutputstreamWorker implements Runnable
{
    private IOException anIOException2704;
    private int anInt2705 = 0;
    private byte[] aByteArray2706;
    static Deque aClass262_2707 = new Deque();
    private Thread aThread2708;
    static int anInt2709;
    static int anInt2710;
    static int anInt2711;
    private OutputStream anOutputStream2712;
    private int anInt2713 = 0;
    static int anInt2714;
    private int bufferSize;
    
    public static void method1525(byte i) {
	if (i != 4)
	    aClass262_2707 = null;
	aClass262_2707 = null;
    }
    
    public final void run() {
	anInt2710++;
	for (;;) {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (anIOException2704 != null)
			return;
		    if ((anInt2713 ^ 0xffffffff) > (anInt2705 ^ 0xffffffff))
			i = -anInt2705 + bufferSize - -anInt2713;
		    else
			i = anInt2713 - anInt2705;
		    if ((i ^ 0xffffffff) < -1)
			break;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    try {
		if (bufferSize >= anInt2705 - -i)
		    anOutputStream2712.write(aByteArray2706, anInt2705, i);
		else {
		    int i_0_ = -anInt2705 + bufferSize;
		    anOutputStream2712.write(aByteArray2706, anInt2705, i_0_);
		    anOutputStream2712.write(aByteArray2706, 0, -i_0_ + i);
		}
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException2704 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt2705 = (anInt2705 + i) % bufferSize;
	    }
	}
    }
    
    final void destroy(byte i) {
	synchronized (this) {
	    if (anIOException2704 == null)
		anIOException2704 = new IOException("");
	    this.notifyAll();
	}
	anInt2714++;
	if (i != -99)
	    anIOException2704 = null;
	try {
	    aThread2708.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    final void method1527(int i) {
	if (i != -21179)
	    method1525((byte) 113);
	anInt2711++;
	anOutputStream2712 = new OutputStream_Sub1();
    }
    
    final void write(byte i, int i_1_, int i_2_, byte[] is)
	throws IOException {
	anInt2709++;
	if (i_1_ < 0 || i_2_ < 0
	    || (is.length ^ 0xffffffff) > (i_1_ + i_2_ ^ 0xffffffff))
	    throw new IOException();
	synchronized (this) {
	    if (anIOException2704 != null)
		throw new IOException(anIOException2704.toString());
	    int i_3_;
	    if (anInt2705 <= anInt2713)
		i_3_ = anInt2705 + bufferSize - (anInt2713 - -1);
	    else
		i_3_ = -1 + (-anInt2713 + anInt2705);
	    if (i_3_ < i_1_)
		throw new IOException("");
	    if (i < 4)
		method1527(65);
	    if (i_1_ + anInt2713 > bufferSize) {
		int i_4_ = bufferSize - anInt2713;
		Class214.byteArrayCopy(is, i_2_, aByteArray2706, anInt2713, i_4_);
		Class214.byteArrayCopy(is, i_2_ - -i_4_, aByteArray2706, 0,
				    -i_4_ + i_1_);
	    } else
		Class214.byteArrayCopy(is, i_2_, aByteArray2706, anInt2713, i_1_);
	    anInt2713 = (i_1_ + anInt2713) % bufferSize;
	    this.notifyAll();
	}
    }
    
    OutputstreamWorker(OutputStream outputstream, int size) {
	anOutputStream2712 = outputstream;
	bufferSize = 1 + size;
	aByteArray2706 = new byte[bufferSize];
	aThread2708 = new Thread(this);
	aThread2708.setDaemon(true);
	aThread2708.start();
    }
}
