/* Class348_Sub44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub44 extends Node
{
    static int anInt7091;
    static int anInt7092;
    int anInt7093;
    static int anInt7094;
    static int anInt7095;
    static int anInt7096;
    static int anInt7097;
    int anInt7098;
    static int anInt7099;
    static int anInt7100;
    static int anInt7101;
    
    final boolean method3301(int i, boolean bool) {
	anInt7091++;
	if (bool != false)
	    anInt7092 = 29;
	if ((0x1 & ((Class348_Sub44) this).anInt7098 >> i + 1) == 0)
	    return false;
	return true;
    }
    
    final boolean method3302(int i) {
	if (i != 17356)
	    method3305(8);
	anInt7095++;
	if ((0x3df376 & ((Class348_Sub44) this).anInt7098) >> -1283732331 == 0)
	    return false;
	return true;
    }
    
    final boolean method3303(int i) {
	anInt7094++;
	if (i != 1)
	    anInt7092 = -24;
	if (((((Class348_Sub44) this).anInt7098 & 0x433bfd) >> -1271980362
	     ^ 0xffffffff)
	    == -1)
	    return false;
	return true;
    }
    
    final int method3304(byte i) {
	anInt7099++;
	if (i < 43)
	    method3301(-16, false);
	return (((Class348_Sub44) this).anInt7098 & 0x1f77eb) >> 877593970;
    }
    
    final boolean method3305(int i) {
	anInt7096++;
	if (i != 0)
	    return true;
	if ((0x1 & ((Class348_Sub44) this).anInt7098 ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
    
    static final int method3306(byte i) {
	if (i >= -90)
	    anInt7101 = -7;
	anInt7097++;
	if ((ByteBuffer.anInt7207 ^ 0xffffffff) == -2)
	    return Class239_Sub16.anInt6008;
	return Queue.anInt1651;
    }
    
    final int method3307(int i) {
	anInt7100++;
	if (i < 10)
	    ((Class348_Sub44) this).anInt7093 = -51;
	return Class348_Sub40_Sub5
		   .method3060(((Class348_Sub44) this).anInt7098, true);
    }
    
    Class348_Sub44(int i, int i_0_) {
	((Class348_Sub44) this).anInt7093 = i_0_;
	((Class348_Sub44) this).anInt7098 = i;
    }
}
