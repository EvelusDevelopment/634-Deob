/* Class300 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class300
{
    static int anInt3815;
    static int anInt3816;
    int anInt3817;
    static int anInt3818;
    static boolean aBoolean3819 = false;
    static int anInt3820;
    int[] anIntArray3821;
    static int anInt3822;
    int anInt3823 = -1;
    static int anInt3824;
    
    static final BufferedPacket getBufferedOutgoingPacket() {
	anInt3824++;
	if ((Class239_Sub13.anInt5980 ^ 0xffffffff) == -1)
	    return new BufferedPacket();
	return Class176.bufferedPackets[--Class239_Sub13.anInt5980];
    }
    
    static final int method2274(String string, int i) {
	anInt3816++;
	if (string == null)
	    return -1;
	if (i >= -41)
	    return 97;
	for (int i_0_ = 0; ((Class348_Sub40_Sub30.anInt9383 ^ 0xffffffff)
			    < (i_0_ ^ 0xffffffff)); i_0_++) {
	    if (string.equalsIgnoreCase(Class83.aStringArray1441[i_0_]))
		return i_0_;
	}
	return -1;
    }
    
    final void method2275(ByteBuffer class348_sub49, byte i) {
	anInt3818++;
	for (;;) {
	    int i_1_ = class348_sub49.getUByte();
	    if (i_1_ == 0)
		break;
	    method2276(0, class348_sub49, i_1_);
	}
	int i_2_ = -63 / ((72 - i) / 37);
    }
    
    private final void method2276(int i, ByteBuffer class348_sub49,
				  int i_3_) {
	if (i_3_ == 1)
	    ((Class300) this).anInt3817 = class348_sub49.getShort();
	else if ((i_3_ ^ 0xffffffff) != -3) {
	    if (i_3_ == 3)
		((Class300) this).anInt3823 = class348_sub49.getUByte();
	} else {
	    ((Class300) this).anIntArray3821
		= new int[class348_sub49.getUByte()];
	    for (int i_4_ = 0;
		 ((((Class300) this).anIntArray3821.length ^ 0xffffffff)
		  < (i_4_ ^ 0xffffffff));
		 i_4_++)
		((Class300) this).anIntArray3821[i_4_]
		    = class348_sub49.getShort();
	}
	if (i != 0)
	    aBoolean3819 = true;
	anInt3822++;
    }
    
    static final Model createModel(int childId, IndexLoader indexLoader, int archiveId) {
	anInt3815++;
	byte[] is = indexLoader.loadArchiveChild(-1860, archiveId, childId);
	if (is == null)
	    return null;
	return new Model(is);
    }
    
    public Class300() {
	((Class300) this).anInt3817 = -1;
    }
}
