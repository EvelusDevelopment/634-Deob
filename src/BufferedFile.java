/* BufferedFile - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;

final class BufferedFile
{
    static int anInt1304;
    private byte[] aByteArray1305;
    static int anInt1306;
    static int anInt1307;
    static int anInt1308;
    static int anInt1309;
    static int anInt1310;
    private byte[] aByteArray1311;
    private FileOnDisk fileOnDisk;
    static int anInt1313;
    private int anInt1314 = 0;
    private long aLong1315;
    static int anInt1316;
    private long aLong1317;
    static int anInt1318;
    private long aLong1319 = -1L;
    private int anInt1320;
    private long aLong1321 = -1L;
    static IndexLoader indexLoader21;
    private long aLong1323;
    private long aLong1324;
    
    final void method783(int i, int i_0_, boolean bool, byte[] is)
	throws IOException {
	anInt1310++;
	try {
	    if ((aLong1323 ^ 0xffffffffffffffffL)
		> (aLong1324 - -(long) i_0_ ^ 0xffffffffffffffffL))
		aLong1323 = (long) i_0_ + aLong1324;
	    if ((aLong1321 ^ 0xffffffffffffffffL) != 0L
		&& ((aLong1324 ^ 0xffffffffffffffffL) > (aLong1321
							 ^ 0xffffffffffffffffL)
		    || (((long) anInt1314 + aLong1321 ^ 0xffffffffffffffffL)
			> (aLong1324 ^ 0xffffffffffffffffL))))
		method791(-1);
	    if (aLong1321 != -1L
		&& (aLong1324 + (long) i_0_
		    > (long) aByteArray1305.length + aLong1321)) {
		int i_1_ = (int) ((long) aByteArray1305.length
				  + (aLong1321 + -aLong1324));
		Class214.byteArrayCopy(is, i, aByteArray1305,
				    (int) (-aLong1321 + aLong1324), i_1_);
		i += i_1_;
		i_0_ -= i_1_;
		aLong1324 += (long) i_1_;
		anInt1314 = aByteArray1305.length;
		method791(-1);
	    }
	    if ((i_0_ ^ 0xffffffff) < (aByteArray1305.length ^ 0xffffffff)) {
		if (aLong1315 != aLong1324) {
		    fileOnDisk.method1661(-18968, aLong1324);
		    aLong1315 = aLong1324;
		}
		fileOnDisk.write((byte) 115, i, i_0_, is);
		aLong1315 += (long) i_0_;
		if ((aLong1315 ^ 0xffffffffffffffffL)
		    < (aLong1317 ^ 0xffffffffffffffffL))
		    aLong1317 = aLong1315;
		long l = -1L;
		if (((aLong1324 ^ 0xffffffffffffffffL)
		     <= (aLong1319 ^ 0xffffffffffffffffL))
		    && ((aLong1324 ^ 0xffffffffffffffffL)
			> (aLong1319 + (long) anInt1320
			   ^ 0xffffffffffffffffL)))
		    l = aLong1324;
		else if (((aLong1319 ^ 0xffffffffffffffffL)
			  <= (aLong1324 ^ 0xffffffffffffffffL))
			 && aLong1319 < aLong1324 - -(long) i_0_)
		    l = aLong1319;
		long l_2_ = -1L;
		if ((long) i_0_ + aLong1324 > aLong1319
		    && (long) anInt1320 + aLong1319 >= aLong1324 + (long) i_0_)
		    l_2_ = (long) i_0_ + aLong1324;
		else if ((((long) anInt1320 + aLong1319 ^ 0xffffffffffffffffL)
			  < (aLong1324 ^ 0xffffffffffffffffL))
			 && ((long) i_0_ + aLong1324
			     >= aLong1319 + (long) anInt1320))
		    l_2_ = (long) anInt1320 + aLong1319;
		if (l > -1L && l_2_ > l) {
		    int i_3_ = (int) (l_2_ + -l);
		    Class214.byteArrayCopy(is, (int) (-aLong1324 + l + (long) i),
					aByteArray1311, (int) (-aLong1319 + l),
					i_3_);
		}
		aLong1324 += (long) i_0_;
		return;
	    }
	    if ((i_0_ ^ 0xffffffff) < -1) {
		if (aLong1321 == -1L)
		    aLong1321 = aLong1324;
		Class214.byteArrayCopy(is, i, aByteArray1305,
				    (int) (-aLong1321 + aLong1324), i_0_);
		aLong1324 += (long) i_0_;
		if (aLong1324 + -aLong1321 > (long) anInt1314)
		    anInt1314 = (int) (-aLong1321 + aLong1324);
		return;
	    }
	} catch (IOException ioexception) {
	    aLong1315 = -1L;
	    throw ioexception;
	}
	if (bool != true)
	    anInt1314 = -69;
    }
    
    final void method784(int i, byte[] is) throws IOException {
	int i_4_ = -98 % ((1 - i) / 40);
	method788(0, is, is.length, -16717);
	anInt1313++;
    }
    
    private final File method785(int i) {
	anInt1316++;
	if (i != -8659)
	    method785(-88);
	return fileOnDisk.method1660(i ^ ~0x2198);
    }
    
    public static void method786(byte i) {
	if (i != 0)
	    indexLoader21 = null;
	indexLoader21 = null;
    }
    
    final long method787() {
	anInt1318++;
	return aLong1323;
    }
    
    final void method788(int i, byte[] is, int i_5_, int i_6_)
	throws IOException {
	anInt1307++;
	try {
	    if (i_5_ + i > is.length)
		throw new ArrayIndexOutOfBoundsException(i + (i_5_
							      - is.length));
	    if (i_6_ != -16717)
		return;
	    if ((aLong1321 ^ 0xffffffffffffffffL) != 0L
		&& (aLong1321 ^ 0xffffffffffffffffL) >= (aLong1324
							 ^ 0xffffffffffffffffL)
		&& (((long) anInt1314 + aLong1321 ^ 0xffffffffffffffffL)
		    <= (aLong1324 - -(long) i_5_ ^ 0xffffffffffffffffL))) {
		Class214.byteArrayCopy(aByteArray1305,
				    (int) (-aLong1321 + aLong1324), is, i,
				    i_5_);
		aLong1324 += (long) i_5_;
		return;
	    }
	    long l = aLong1324;
	    int i_7_ = i;
	    int i_8_ = i_5_;
	    if (aLong1324 >= aLong1319
		&& ((aLong1324 ^ 0xffffffffffffffffL)
		    > (aLong1319 - -(long) anInt1320 ^ 0xffffffffffffffffL))) {
		int i_9_ = (int) ((long) anInt1320 - (-aLong1319 + aLong1324));
		if (i_5_ < i_9_)
		    i_9_ = i_5_;
		Class214.byteArrayCopy(aByteArray1311,
				    (int) (aLong1324 + -aLong1319), is, i,
				    i_9_);
		aLong1324 += (long) i_9_;
		i_5_ -= i_9_;
		i += i_9_;
	    }
	    if (i_5_ > aByteArray1311.length) {
		fileOnDisk.method1661(i_6_ + -2251, aLong1324);
		aLong1315 = aLong1324;
		int i_10_;
		for (/**/; (i_5_ ^ 0xffffffff) < -1; i_5_ -= i_10_) {
		    i_10_ = fileOnDisk.read(is, i, (byte) 8, i_5_);
		    if (i_10_ == -1)
			break;
		    i += i_10_;
		    aLong1315 += (long) i_10_;
		    aLong1324 += (long) i_10_;
		}
	    } else if ((i_5_ ^ 0xffffffff) < -1) {
		method792((byte) -46);
		int i_11_ = i_5_;
		if ((i_11_ ^ 0xffffffff) < (anInt1320 ^ 0xffffffff))
		    i_11_ = anInt1320;
		Class214.byteArrayCopy(aByteArray1311, 0, is, i, i_11_);
		i += i_11_;
		aLong1324 += (long) i_11_;
		i_5_ -= i_11_;
	    }
	    if (aLong1321 != -1L) {
		if ((aLong1321 ^ 0xffffffffffffffffL) < (aLong1324
							 ^ 0xffffffffffffffffL)
		    && i_5_ > 0) {
		    int i_12_ = (int) (aLong1321 - aLong1324) + i;
		    if ((i_12_ ^ 0xffffffff) < (i + i_5_ ^ 0xffffffff))
			i_12_ = i + i_5_;
		    while ((i ^ 0xffffffff) > (i_12_ ^ 0xffffffff)) {
			is[i++] = (byte) 0;
			i_5_--;
			aLong1324++;
		    }
		}
		long l_13_ = -1L;
		if ((l ^ 0xffffffffffffffffL) < (aLong1321
						 ^ 0xffffffffffffffffL)
		    || ((aLong1321 ^ 0xffffffffffffffffL)
			<= (l - -(long) i_8_ ^ 0xffffffffffffffffL))) {
		    if ((l ^ 0xffffffffffffffffL) <= (aLong1321
						      ^ 0xffffffffffffffffL)
			&& (aLong1321 - -(long) anInt1314
			    ^ 0xffffffffffffffffL) < (l ^ 0xffffffffffffffffL))
			l_13_ = l;
		} else
		    l_13_ = aLong1321;
		long l_14_ = -1L;
		if ((l ^ 0xffffffffffffffffL) <= ((long) anInt1314 + aLong1321
						  ^ 0xffffffffffffffffL)
		    || (((long) anInt1314 + aLong1321 ^ 0xffffffffffffffffL)
			< ((long) i_8_ + l ^ 0xffffffffffffffffL))) {
		    if (((l - -(long) i_8_ ^ 0xffffffffffffffffL)
			 < (aLong1321 ^ 0xffffffffffffffffL))
			&& ((l - -(long) i_8_ ^ 0xffffffffffffffffL)
			    >= ((long) anInt1314 + aLong1321
				^ 0xffffffffffffffffL)))
			l_14_ = l + (long) i_8_;
		} else
		    l_14_ = aLong1321 - -(long) anInt1314;
		if (l_13_ > -1L && ((l_14_ ^ 0xffffffffffffffffL)
				    < (l_13_ ^ 0xffffffffffffffffL))) {
		    int i_15_ = (int) (l_14_ + -l_13_);
		    Class214.byteArrayCopy(aByteArray1305,
					(int) (l_13_ + -aLong1321), is,
					i_7_ - -(int) (l_13_ - l), i_15_);
		    if ((aLong1324 ^ 0xffffffffffffffffL)
			> (l_14_ ^ 0xffffffffffffffffL)) {
			i_5_ -= -aLong1324 + l_14_;
			aLong1324 = l_14_;
		    }
		}
	    }
	} catch (IOException ioexception) {
	    aLong1315 = -1L;
	    throw ioexception;
	}
	if (i_5_ > 0)
	    throw new EOFException();
    }
    
    final void method789(long l, byte i) throws IOException {
	try {
	    anInt1309++;
	    if ((l ^ 0xffffffffffffffffL) > -1L)
		throw new IOException("Invalid seek to " + l + " in file "
				      + method785(-8659));
	    int i_16_ = -67 / ((i - -49) / 34);
	    aLong1324 = l;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "l.A(" + l + ',' + i + ')');
	}
    }
    
    final void method790(byte i) throws IOException {
	anInt1304++;
	method791(-1);
	fileOnDisk.method1657(false);
    }
    
    private final void method791(int i) throws IOException {
	if (i != -1)
	    aLong1321 = 47L;
	if ((aLong1321 ^ 0xffffffffffffffffL) != 0L) {
	    if (aLong1315 != aLong1321) {
		fileOnDisk.method1661(-18968, aLong1321);
		aLong1315 = aLong1321;
	    }
	    fileOnDisk.write((byte) 120, 0, anInt1314,
				      aByteArray1305);
	    aLong1315 += (long) anInt1314;
	    if (aLong1317 < aLong1315)
		aLong1317 = aLong1315;
	    long l = -1L;
	    long l_18_ = -1L;
	    if ((aLong1321 ^ 0xffffffffffffffffL) <= (aLong1319
						      ^ 0xffffffffffffffffL)
		&& (((long) anInt1320 + aLong1319 ^ 0xffffffffffffffffL)
		    < (aLong1321 ^ 0xffffffffffffffffL)))
		l = aLong1321;
	    else if (((aLong1321 ^ 0xffffffffffffffffL)
		      >= (aLong1319 ^ 0xffffffffffffffffL))
		     && ((aLong1321 - -(long) anInt1314 ^ 0xffffffffffffffffL)
			 < (aLong1319 ^ 0xffffffffffffffffL)))
		l = aLong1319;
	    if (((aLong1319 ^ 0xffffffffffffffffL)
		 > ((long) anInt1314 + aLong1321 ^ 0xffffffffffffffffL))
		&& ((long) anInt1314 + aLong1321
		    <= (long) anInt1320 + aLong1319))
		l_18_ = aLong1321 - -(long) anInt1314;
	    else if (((aLong1319 + (long) anInt1320 ^ 0xffffffffffffffffL)
		      < (aLong1321 ^ 0xffffffffffffffffL))
		     && (aLong1319 + (long) anInt1320
			 <= (long) anInt1314 + aLong1321))
		l_18_ = (long) anInt1320 + aLong1319;
	    if ((l ^ 0xffffffffffffffffL) < 0L && l < l_18_) {
		int i_19_ = (int) (-l + l_18_);
		Class214.byteArrayCopy(aByteArray1305, (int) (l - aLong1321),
				    aByteArray1311, (int) (-aLong1319 + l),
				    i_19_);
	    }
	    aLong1321 = -1L;
	    anInt1314 = 0;
	}
	anInt1308++;
    }
    
    private final void method792(byte i) throws IOException {
	anInt1320 = 0;
	anInt1306++;
	if (i != -46)
	    method785(111);
	if (aLong1315 != aLong1324) {
	    fileOnDisk.method1661(-18968, aLong1324);
	    aLong1315 = aLong1324;
	}
	aLong1319 = aLong1324;
	while ((aByteArray1311.length ^ 0xffffffff)
	       < (anInt1320 ^ 0xffffffff)) {
	    int i_20_ = -anInt1320 + aByteArray1311.length;
	    if (i_20_ > 200000000)
		i_20_ = 200000000;
	    int i_21_ = fileOnDisk.read(aByteArray1311, anInt1320,
						  (byte) 125, i_20_);
	    if (i_21_ == -1)
		break;
	    anInt1320 += i_21_;
	    aLong1315 += (long) i_21_;
	}
    }
    
    BufferedFile(FileOnDisk class234, int i, int i_22_) throws IOException {
	fileOnDisk = class234;
	aLong1323 = aLong1317 = class234.method1662((byte) -46);
	aByteArray1305 = new byte[i_22_];
	aByteArray1311 = new byte[i];
	aLong1324 = 0L;
    }
}
