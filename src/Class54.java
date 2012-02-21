/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class54
{
    private byte aByte966;
    int anInt967;
    static int anInt968;
    int anInt969;
    static int anInt970;
    static int anInt971;
    static int anInt972;
    int anInt973;
    static String[] aStringArray974;
    static int anInt975;
    int anInt976;
    int anInt977;
    
    final int method499(int i) {
	anInt972++;
	if (i != 21110)
	    return -38;
	if ((aByte966 & 0x8) != 8)
	    return 0;
	return 1;
    }
    
    static final int method500(int i, int i_0_) {
	anInt975++;
	if (i != 7)
	    return -107;
	return i_0_ >>> 503944;
    }
    
    public static void method501(int i) {
	aStringArray974 = null;
	if (i != 1)
	    method501(-15);
    }
    
    final int method502(byte i) {
	anInt971++;
	int i_1_ = 4 / ((3 - i) / 43);
	return aByte966 & 0x7;
    }
    
    public Class54() {
	/* empty */
    }
    
    static final void method503(int i, int i_2_, byte i_3_, int i_4_,
				int i_5_) {
	anInt968++;
	int i_6_ = FileIndexRequest.anInt10463;
    while_4_:
	do {
	    do {
		if (i_6_ != 0) {
		    if ((i_6_ ^ 0xffffffff) != -2) {
			if (i_6_ == 2)
			    break;
			break while_4_;
		    }
		} else
		    return;
		Class348_Sub3.anInt6585 = i;
		AbtractArchiveLoader.anInt3941 = i_2_;
		Class239.anInt3142 = i_5_;
		FileIndexRequest.anInt10463 = 2;
		AbtractArchiveLoader.anInt3939 = i_4_;
		return;
	    } while (false);
	    if (AbtractArchiveLoader.anInt3939 < i_4_)
		AbtractArchiveLoader.anInt3939 = i_4_;
	    if ((i_2_ ^ 0xffffffff) > (AbtractArchiveLoader.anInt3941 ^ 0xffffffff))
		AbtractArchiveLoader.anInt3941 = i_2_;
	    if ((i_5_ ^ 0xffffffff) > (Class239.anInt3142 ^ 0xffffffff))
		Class239.anInt3142 = i_5_;
	    if (i > Class348_Sub3.anInt6585)
		Class348_Sub3.anInt6585 = i;
	    return;
	} while (false);
	if (i_3_ != -74)
	    method501(46);
    }
    
    Class54(ByteBuffer class348_sub49) {
	aByte966 = class348_sub49.getByte();
	((Class54) this).anInt969 = class348_sub49.getShort();
	((Class54) this).anInt976 = class348_sub49.getDWord();
	((Class54) this).anInt967 = class348_sub49.getDWord();
	((Class54) this).anInt977 = class348_sub49.getDWord();
	((Class54) this).anInt973 = class348_sub49.getDWord();
    }
}
