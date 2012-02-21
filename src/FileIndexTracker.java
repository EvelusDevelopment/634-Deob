/* FileIndexTracker - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class FileIndexTracker implements ElementTracker
{
    static int anInt4797 = 0;
    static IncomingPacket aClass114_4798;
    static int anInt4799;
    static int anInt4800;
    static int anInt4801;
    static int anInt4802;
    static int anInt4803 = -1;
    private IndexLoader indexLoader;
    static int anInt4805;
    
    static final int method2201(int i) {
	anInt4805++;
	synchronized (Class24.aClass60_355) {
	    if (i != 2121)
		method2202(-113);
	    return Class24.aClass60_355.method575(0);
	}
    }
    
    public final int getPercentComplete(int i) {
	anInt4801++;
	int i_0_ = 16 / ((i - -43) / 62);
	if (indexLoader.isCompletelyLoaded(125))
	    return 100;
	return indexLoader.getPercentLoaded((byte) -31);
    }
    
    public static void method2202(int i) {
	aClass114_4798 = null;
	if (i != -17902)
	    anInt4803 = 78;
    }
    
    public final ElementLoaderNode getLoaderNode(int i) {
	if (i != -15004)
	    return null;
	anInt4800++;
	return ElementLoaderNode.aClass69_1195;
    }
    
    static final boolean method2203(byte i) {
	int i_1_ = 11 % ((12 - i) / 53);
	anInt4802++;
	try {
	    return Class348_Sub42_Sub8_Sub2.parseIncomingPacket(true);
	} catch (java.io.IOException ioexception) {
	    Class272.method2049(106);
	    return true;
	} catch (Exception exception) {
	    String string
		= ("T2 - "
		   + (Class348_Sub3.currentIncomingPacket != null
		      ? Class348_Sub3.currentIncomingPacket.getOpcode((byte) 119)
		      : -1)
		   + ","
		   + (Class239.aClass114_3145 != null
		      ? Class239.aClass114_3145.getOpcode((byte) 119) : -1)
		   + ","
		   + (Class348_Sub40_Sub36.aClass114_9456 == null ? -1
		      : Class348_Sub40_Sub36.aClass114_9456
			    .getOpcode((byte) 113))
		   + " - " + Class348_Sub40_Sub25.currentPacketSize + ","
		   + ((((Class318_Sub1_Sub3_Sub3)
			Class132.localPlayer)
		       .anIntArray10320[0])
		      + za_Sub2.anInt9780)
		   + ","
		   + (Class90.anInt1517
		      - -(((Class318_Sub1_Sub3_Sub3)
			   Class132.localPlayer)
			  .anIntArray10317[0]))
		   + " - ");
	    for (int i_2_ = 0;
		 Class348_Sub40_Sub25.currentPacketSize > i_2_ && i_2_ < 50; i_2_++)
		string
		    += (((ByteBuffer) Class299.gameBuffer)
			.payload[i_2_]) + ",";
	    Class156.method1242(string, exception, 15004);
	    Class348_Sub40_Sub34.method3141(false, (byte) 11);
	    return true;
	}
    }
    
    FileIndexTracker(IndexLoader loader) {
	indexLoader = loader;
    }
    
    static {
	aClass114_4798 = new IncomingPacket(29, 7);
    }
}
