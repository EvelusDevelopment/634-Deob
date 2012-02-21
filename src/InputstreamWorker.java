/* InputstreamWorker - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

final class InputstreamWorker implements Runnable
{
    private int bufferSize;
    static int anInt4547;
    private InputStream inputstream;
    static int anInt4549;
    static int anInt4550;
    static int anInt4551;
    static int anInt4552;
    static int anInt4553;
    private byte[] buffer;
    static int anInt4555;
    private int anInt4556 = 0;
    private Thread thread;
    private int anInt4558 = 0;
    static int anInt4559 = 0;
    private IOException ioexception;
    
    final void method3615(int i) {
	synchronized (this) {
	    if (i != 15984)
		run();
	    if (ioexception == null)
		ioexception = new IOException("");
	    this.notifyAll();
	}
	anInt4552++;
	try {
	    thread.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    static final void method3616(int i) {
	anInt4549++;
	if (Class182.modernLoadingScreens != null) {
	    LoadingScreen[] interface16s = Class182.modernLoadingScreens;
	    for (int i_0_ = 0;
		 (interface16s.length ^ 0xffffffff) < (i_0_ ^ 0xffffffff);
		 i_0_++) {
		LoadingScreen interface16 = interface16s[i_0_];
		interface16.method57(108);
	    }
	}
	if (i != 12639)
	    anInt4559 = 72;
    }
    
    public final void run() {
	anInt4553++;
	for (;;) {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (ioexception != null)
			return;
		    if ((anInt4556 ^ 0xffffffff) != -1) {
			if (anInt4556 < anInt4558)
			    i = -anInt4558 + bufferSize;
			else
			    i = -1 + anInt4556 - anInt4558;
		    } else
			i = -1 + (bufferSize + -anInt4558);
		    if ((i ^ 0xffffffff) < -1)
			break;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    int i_1_;
	    try {
		i_1_ = inputstream.read(buffer, anInt4558, i);
		if (i_1_ == -1)
		    throw new EOFException();
	    } catch (IOException ioexception) {
		synchronized (this) {
		    ioexception = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt4558 = (i_1_ + anInt4558) % bufferSize;
	    }
	}
    }
    
    final int read(int len, int off, int i_3_, byte[] dest) throws IOException {
	anInt4555++;
	if ((len ^ 0xffffffff) > -1 || (off ^ 0xffffffff) > -1 || (off + len ^ 0xffffffff) < (dest.length ^ 0xffffffff))
	    throw new IOException();
	synchronized (this) {
	    int i_4_;
	    if ((anInt4558 ^ 0xffffffff) <= (anInt4556 ^ 0xffffffff))
		i_4_ = anInt4558 - anInt4556;
	    else
		i_4_ = bufferSize + (-anInt4556 - -anInt4558);
	    if ((len ^ 0xffffffff) < (i_4_ ^ 0xffffffff))
		len = i_4_;
	    if (i_3_ == len && ioexception != null)
		throw new IOException(ioexception.toString());
	    if (bufferSize < len + anInt4556) {
		int bufferOff = bufferSize - anInt4556;
		Class214.byteArrayCopy(buffer, anInt4556, dest, off, bufferOff);
		Class214.byteArrayCopy(buffer, 0, dest, off + bufferOff, len - bufferOff);
	    } else
		Class214.byteArrayCopy(buffer, anInt4556, dest, off, len);
	    anInt4556 = (anInt4556 + len) % bufferSize;
	    this.notifyAll();
	    return len;
	}
    }
    
    final void method3618(int i) {
	anInt4550++;
	if (i != 0)
	    bufferSize = 110;
	inputstream = new DummyInputstream2();
    }
    
    final boolean method3619(int i, boolean bool) throws IOException {
	anInt4551++;
	if ((i ^ 0xffffffff) >= -1 || i >= bufferSize)
	    throw new IOException();
	synchronized (this) {
	    int i_6_;
	    if ((anInt4558 ^ 0xffffffff) > (anInt4556 ^ 0xffffffff))
		i_6_ = -anInt4556 + bufferSize + anInt4558;
	    else
		i_6_ = anInt4558 - anInt4556;
	    if ((i_6_ ^ 0xffffffff) > (i ^ 0xffffffff)) {
		if (ioexception != null)
		    throw new IOException(ioexception.toString());
		return false;
	    }
	    if (bool != false)
		return false;
	    return true;
	}
    }
    
    InputstreamWorker(InputStream is, int i) {
	bufferSize = i + 1;
	inputstream = is;
	buffer = new byte[bufferSize];
	thread = new Thread(this);
	thread.setDaemon(true);
	thread.start();
    }
    
    static final Class148 method3620(Class318_Sub1_Sub3 class318_sub1_sub3,
				     int i) {
	if (i < 9)
	    anInt4559 = -27;
	anInt4547++;
	Class148 class148;
	if (Class16.aClass148_231 != null) {
	    class148 = Class16.aClass148_231;
	    Class16.aClass148_231
		= ((Class148) Class16.aClass148_231).aClass148_2038;
	    ((Class148) class148).aClass148_2038 = null;
	    DirectxToolkit.anInt7722--;
	} else
	    class148 = new Class148();
	((Class148) class148).aClass318_Sub1_Sub3_2040 = class318_sub1_sub3;
	return class148;
    }
}
