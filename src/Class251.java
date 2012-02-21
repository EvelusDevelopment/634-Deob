/* Class251 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class251
{
    static int anInt3229;
    static int anInt3230;
    static int anInt3231;
    static OutgoingPacket aClass351_3232 = new OutgoingPacket(51, 3);
    static int anInt3233;
    static int anInt3234 = 0;
    static int anInt3235;
    static int anInt3236;
    
    public static void method1912(int i) {
	if (i == 8549)
	    aClass351_3232 = null;
    }
    
    static final void method1913(boolean bool, int i, Widget class46) {
	anInt3235++;
	int i_0_ = -40 % ((-35 - i) / 51);
	int i_1_
	    = (((Widget) class46).anInt698 == 0 ? ((Widget) class46).anInt709
	       : ((Widget) class46).anInt698);
	int i_2_
	    = (((Widget) class46).anInt791 != 0 ? ((Widget) class46).anInt791
	       : ((Widget) class46).anInt789);
	Class367_Sub1.method3534(false, ((Widget) class46).anInt830, i_1_,
				 bool, i_2_,
				 (Class348_Sub40_Sub33.aClass46ArrayArray9427
				  [(((Widget) class46).anInt830
				    >> 1869042672)]));
	if (((Widget) class46).children != null)
	    Class367_Sub1.method3534(false, ((Widget) class46).anInt830, i_1_,
				     bool, i_2_,
				     ((Widget) class46).children);
	Class348_Sub41 class348_sub41
	    = ((Class348_Sub41)
	       Class125.aClass356_4915
		   .get((long) ((Widget) class46).anInt830));
	if (class348_sub41 != null)
	    Class239_Sub3.method1728(i_2_, -1,
				     (((Class348_Sub41) class348_sub41)
				      .anInt7050),
				     bool, i_1_);
    }
    
    static final int method1914(int i, int i_3_) {
	anInt3231++;
	if (i != -23590)
	    method1913(false, -115, null);
	return i_3_ & 0xff;
    }
    
    public final String toString() {
	anInt3230++;
	throw new IllegalStateException();
    }
    
    static final boolean method1915(byte i, int i_4_) {
	if (i != 4)
	    return false;
	anInt3233++;
	if ((i_4_ ^ 0xffffffff) == -2 || i_4_ == 7)
	    return false;
	return true;
    }
    
    static final void method1916(int i, Widget class46) {
	anInt3229++;
	if (((Widget) class46).anInt794 == Class58.anInt1064)
	    Class152.aBooleanArray2076[((Widget) class46).anInt760] = true;
    }
    
    public Class251() {
	/* empty */
    }
}
