/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class15
{
    static Cache aClass60_225 = new Cache(4);
    static int anInt226;
    static int anInt227;
    static int anInt228;
    static IncomingPacket aClass114_229 = new IncomingPacket(51, 17);
    
    public static void method255(int i) {
	aClass60_225 = null;
	if (i != 6725)
	    aClass60_225 = null;
	aClass114_229 = null;
    }
    
    static final int method256(int i, byte i_0_) {
	anInt228++;
	if (i_0_ < 61)
	    getNumOfChar(-27, null, 'G');
	return i >>> 129941127;
    }
    
    static final int getNumOfChar(int i, String string, char c) {
	anInt227++;
	int i_1_ = 0;
	if (i != 4)
	    aClass114_229 = null;
	int i_2_ = string.length();
	for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff); i_3_++) {
	    if (c == string.charAt(i_3_))
		i_1_++;
	}
	return i_1_;
    }
}
