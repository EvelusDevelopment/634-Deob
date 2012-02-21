/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class116
{
    static int anInt1758;
    static boolean aBoolean1759 = false;
    static int anInt1760;
    static String aString1761;
    static IncomingPacket incomingPacket50;
    
    public static void method1062(byte i) {
	if (i == 35) {
	    incomingPacket50 = null;
	    aString1761 = null;
	}
    }
    
    static final void loadScriptSettings(int i) {
	if (i != 1)
	    aString1761 = null;
	anInt1760++;
	FileOnDisk class234 = null;
	try {
	    SignlinkRequest class144
		= Class348_Sub23_Sub1.signlink.method2233((byte) -46,
								"2", true);
	    while ((class144.state ^ 0xffffffff) == -1)
		Class286_Sub5.method2161((byte) 63, 1L);
	    if ((class144.state ^ 0xffffffff) == -2) {
		class234 = (FileOnDisk) class144.returnObj;
		byte[] is = new byte[(int) class234.method1662((byte) -46)];
		int i_0_;
		for (int i_1_ = 0;
		     (i_1_ ^ 0xffffffff) > (is.length ^ 0xffffffff);
		     i_1_ += i_0_) {
		    i_0_ = class234.read(is, i_1_, (byte) -12,
					       is.length + -i_1_);
		    if ((i_0_ ^ 0xffffffff) == 0)
			throw new IOException("EOF");
		}
		AbstractImageFetcher.readScriptSettings(new ByteBuffer(is), (byte) -40);
	    }
	} catch (Exception exception) {
	    /* empty */
	}
	do {
	    try {
		if (class234 == null)
		    break;
		class234.method1657(false);
	    } catch (Exception exception) {
		break;
	    }
	    break;
	} while (false);
    }
    
    static {
	anInt1758 = 0;
	incomingPacket50 = new IncomingPacket(50, -1);
    }
}
