/* Class363 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class363
{
    static String aString4461 = "";
    static int anInt4462;
    static int[] anIntArray4463 = new int[8];
    static int anInt4464;
    static int anInt4465;
    
    static final void method3513(int i) {
	synchronized (Class318.aClass243Array3974) {
	    for (int i_0_ = 0;
		 ((Class318.aClass243Array3974.length ^ 0xffffffff)
		  < (i_0_ ^ 0xffffffff));
		 i_0_++) {
		Class318.aClass243Array3974[i_0_] = new Class243();
		Class331.anIntArray4128[i_0_] = 0;
	    }
	}
	anInt4462++;
	int i_1_ = 60 / ((-36 - i) / 57);
    }
    
    static final void method3514(byte i) {
	anInt4465++;
	for (Class348_Sub27 class348_sub27
		 = ((Class348_Sub27)
		    Class348_Sub42_Sub20.aClass262_9711.getFirst(4));
	     class348_sub27 != null;
	     class348_sub27
		 = (Class348_Sub27) Class348_Sub42_Sub20.aClass262_9711
					.nextForward((byte) 57)) {
	    if ((((Class348_Sub27) class348_sub27).anInt6893 ^ 0xffffffff)
		== 0) {
		((Class348_Sub27) class348_sub27).anInt6894 = 0;
		if (((((Class348_Sub27) class348_sub27).anInt6905 ^ 0xffffffff)
		     <= -1)
		    && (((Class348_Sub27) class348_sub27).anInt6896
			^ 0xffffffff) <= -1
		    && ((Class367_Sub4.anInt7319 ^ 0xffffffff)
			< (((Class348_Sub27) class348_sub27).anInt6905
			   ^ 0xffffffff))
		    && ((Class348_Sub40_Sub3.anInt9109 ^ 0xffffffff)
			< (((Class348_Sub27) class348_sub27).anInt6896
			   ^ 0xffffffff)))
		    Class184.method1387(i + 26, class348_sub27);
	    } else
		class348_sub27.removeNode();
	}
	if (i != -105)
	    method3516(-128);
    }
    
    static final void method3515(int i) {
	int i_2_ = 52 / ((33 - i) / 40);
	Class348_Sub40.aClass356_7041.removeAll(0);
	anInt4464++;
    }
    
    public static void method3516(int i) {
	aString4461 = null;
	if (i <= 123)
	    anIntArray4463 = null;
	anIntArray4463 = null;
    }
}
