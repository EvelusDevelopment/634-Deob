/* Class313 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class313
{
    static int anInt3933;
    static Class223 aClass223_3934 = new Class223(2, 2);
    static float aFloat3935;
    static int totalParticals = 0;
    static int anInt3937;
    
    public static void method2333(boolean bool) {
	if (bool == false)
	    aClass223_3934 = null;
    }
    
    static final void method2334(int i) {
	Class318_Sub1_Sub3_Sub4.anInt10340++;
	if (i != 0)
	    method2333(true);
	anInt3933++;
	BufferedPacket class348_sub47
	    = Class286_Sub3.createBufferedPacket(aa_Sub3.aClass351_5200,
				       Class348_Sub23_Sub2.outgoingGameIsaac);
	((BufferedPacket) class348_sub47).buffer
	    .putShort(Class135_Sub1.anInt4718);
	Class348_Sub42_Sub14.putBufferedPacket(118, class348_sub47);
    }
}
