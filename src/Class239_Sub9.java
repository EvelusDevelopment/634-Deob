/* Class239_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub9 extends Class239
{
    static int anInt5925;
    static int anInt5926;
    static int anInt5927;
    static int anInt5928;
    static OutgoingPacket aClass351_5929 = new OutgoingPacket(25, 3);
    static int anInt5930;
    static int anInt5931;
    static GameMode aClass230_5932 = new GameMode("game4", 3);
    static RasterToolkit[] aClass105Array5933;
    static OutgoingPacket aClass351_5934 = new OutgoingPacket(78, 16);
    
    Class239_Sub9(int i, Class348_Sub51 class348_sub51) {
	super(i, class348_sub51);
    }
    
    final void method1712(int i, int i_0_) {
	anInt5925++;
	int i_1_ = -123 % ((82 - i) / 35);
	((Class239) this).anInt3138 = i_0_;
    }
    
    final boolean method1757(int i) {
	anInt5927++;
	if (((Class239) this).aClass348_Sub51_3136.method3425(-122))
	    return false;
	if (i < 85)
	    method1759(117);
	if (((Class239) this).aClass348_Sub51_3136.method3422(674)
	    == Class10.aClass230_186)
	    return true;
	return false;
    }
    
    public static void method1758(int i) {
	if (i != -16211)
	    aClass351_5934 = null;
	aClass230_5932 = null;
	aClass351_5929 = null;
	aClass105Array5933 = null;
	aClass351_5934 = null;
    }
    
    final int method1714(int i, int i_2_) {
	anInt5926++;
	if (((Class239) this).aClass348_Sub51_3136.method3425(-114))
	    return 3;
	if (((Class239) this).aClass348_Sub51_3136.method3422(674)
	    == Class10.aClass230_186) {
	    if ((i_2_ ^ 0xffffffff) == -1) {
		if (((Class348_Sub51) ((Class239) this).aClass348_Sub51_3136)
			.aClass239_Sub16_7247.method1789(-32350)
		    == 1)
		    return 2;
		if ((((Class348_Sub51) ((Class239) this).aClass348_Sub51_3136)
			 .aClass239_Sub24_7235.method1820(i + -32353)
		     ^ 0xffffffff)
		    == -2)
		    return 2;
		if ((((Class348_Sub51) ((Class239) this).aClass348_Sub51_3136)
			 .aClass239_Sub18_7259.method1800(-32350)
		     ^ 0xffffffff)
		    < -1)
		    return 2;
	    }
	    return 1;
	}
	if (i != 3)
	    method1710(57);
	return 3;
    }
    
    final void method1716(boolean bool) {
	anInt5931++;
	if (bool != false)
	    aClass351_5929 = null;
	if (((Class239) this).aClass348_Sub51_3136.method3422(674)
	    != Class10.aClass230_186)
	    ((Class239) this).anInt3138 = 1;
	else if (((Class239) this).aClass348_Sub51_3136.method3425(-125))
	    ((Class239) this).anInt3138 = 0;
	if (((Class239) this).anInt3138 != 0
	    && ((Class239) this).anInt3138 != 1)
	    ((Class239) this).anInt3138 = method1710(20014);
    }
    
    final int method1759(int i) {
	anInt5930++;
	if (i != -32350)
	    method1714(-83, -18);
	return ((Class239) this).anInt3138;
    }
    
    Class239_Sub9(Class348_Sub51 class348_sub51) {
	super(class348_sub51);
    }
    
    final int method1710(int i) {
	if (i != 20014)
	    aClass351_5934 = null;
	anInt5928++;
	return 1;
    }
}
