/* BufferedPacket - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;

final class BufferedPacket extends Node
{
    GameBuffer buffer;
    static int anInt7117;
    OutgoingPacket outgoingPacket;
    int bufferPosition;
    static int anInt7120;
    static int anInt7121;
    int sizeType;
    static int anInt7123;
    static IncomingPacket aClass114_7124 = new IncomingPacket(62, 4);
    static int anInt7125 = 1406;
    
    public static void method3323(int i) {
	int i_0_ = -14 / ((73 - i) / 51);
	aClass114_7124 = null;
    }
    
    static final void method3324(AbstractToolkit var_ha, byte i, long l) {
	do {
	    try {
		Class122.anInt1803 = 0;
		FileIndexTracker.anInt4797 = Class313.totalParticals;
		Class318_Sub1_Sub5.currentParticles = 0;
		anInt7120++;
		Class313.totalParticals = 0;
		long l_1_ = Class62.getCurrentTimeMillis();
		Class318_Sub10 class318_sub10
		    = (Class318_Sub10) Class152.aClass243_2077.method1872(8);
		if (i > 40) {
		    for (/**/; class318_sub10 != null;
			 class318_sub10
			     = (Class318_Sub10) Class152.aClass243_2077
						    .method1878((byte) -64)) {
			if (class318_sub10.method2535(var_ha, l))
			    Class318_Sub1_Sub5.currentParticles++;
		    }
		    if (!Class348_Sub16_Sub2.aBoolean8874
			|| (l % 100L ^ 0xffffffffffffffffL) != -1L)
			break;
		    System.out.println("Particle system count: "
				       + Class152.aClass243_2077.method1874(0)
				       + ", running: "
				       + Class318_Sub1_Sub5.currentParticles);
		    System.out.println("Emitters: " + Class122.anInt1803
				       + " Particles: " + Class313.totalParticals
				       + ". Time taken: "
				       + (-l_1_ + Class62.getCurrentTimeMillis())
				       + "ms");
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("wm.A("
						 + (var_ha != null ? "{...}"
						    : "null")
						 + ',' + i + ',' + l + ')'));
	    }
	    break;
	} while (false);
    }
    
    static final boolean method3325(int i, int i_2_, boolean bool) {
	if (bool != true)
	    return false;
	anInt7121++;
	return (((0x2000 & i ^ 0xffffffff) != -1
		 | Class156.method1241(i_2_, i, -118)
		 | Class239_Sub1.method1722(i, i_2_, (byte) 94))
		& aa_Sub3.method166((byte) 105, i_2_, i));
    }
    
    final void method3326(byte i) {
	anInt7117++;
	if (Class176.bufferedPackets.length > Class239_Sub13.anInt5980
	    && i == -45)
	    Class176.bufferedPackets[Class239_Sub13.anInt5980++]
		= this;
    }
    
    static final void method3327(int i) {
	if (i == 1406) {
	    if (!Class348_Sub8.currentToolkit.method3694())
		Class367_Sub10.method3553(false, (byte) 100,
					  ((Class348_Sub51)
					   BitmapTable.aClass348_Sub51_3959)
					      .aClass239_Sub25_7271
					      .method1829(-32350));
	    else {
		Class348_Sub8.currentToolkit.removeImageFetcher(Class305.canvas);
		Class348_Sub22.method2959(-1);
		if (!Class59_Sub1.aBoolean5300) {
		    Dimension dimension = Class305.canvas.getSize();
		    Class348_Sub8.currentToolkit.method3643(Class305.canvas,
						     dimension.width,
						     dimension.height);
		} else
		    Model.method1108((byte) -99, Class305.canvas);
		Class348_Sub8.currentToolkit.method3677(Class305.canvas);
	    }
	    anInt7123++;
	    Class354.method3466(i + -1347);
	    Class348_Sub16_Sub2.aBoolean8870 = true;
	}
    }
}
