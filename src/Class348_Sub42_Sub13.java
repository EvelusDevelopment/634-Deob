/* Class348_Sub42_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub42_Sub13 extends SubNode
{
    static int anInt9613;
    static int anInt9614;
    int anInt9615;
    static boolean aBoolean9616 = false;
    String aString9617;
    static int anInt9618;
    static int anInt9619;
    static int anInt9620;
    Queue aClass107_9621;
    
    static final void method3232(double d, byte i) {
	if (i <= -54) {
	    if (d != Class299_Sub2_Sub1.aDouble8713) {
		for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -257; i_0_++) {
		    int i_1_
			= (int) (255.0 * Math.pow((double) i_0_ / 255.0, d));
		    Class318_Sub1_Sub3_Sub3.anIntArray10266[i_0_]
			= i_1_ > 255 ? 255 : i_1_;
		}
		Class299_Sub2_Sub1.aDouble8713 = d;
	    }
	    anInt9618++;
	}
    }
    
    final boolean method3233(Class348_Sub42_Sub12 class348_sub42_sub12,
			     int i) {
	anInt9613++;
	boolean bool = true;
	class348_sub42_sub12.removeSubnode();
	Class348_Sub42_Sub12 class348_sub42_sub12_2_
	    = ((Class348_Sub42_Sub12)
	       ((Class348_Sub42_Sub13) this).aClass107_9621.getFirst());
	while (class348_sub42_sub12_2_ != null) {
	    if (Class318_Sub2.method2496
		(((Class348_Sub42_Sub12) class348_sub42_sub12_2_).anInt9608,
		 ((Class348_Sub42_Sub12) class348_sub42_sub12).anInt9608,
		 true)) {
		ElementLoaderNode.method721(class348_sub42_sub12_2_,
				  class348_sub42_sub12, -1);
		((Class348_Sub42_Sub13) this).anInt9615++;
		if (bool)
		    return false;
		return true;
	    }
	    class348_sub42_sub12_2_
		= (Class348_Sub42_Sub12) ((Class348_Sub42_Sub13) this)
					     .aClass107_9621
					     .next();
	    bool = false;
	}
	((Class348_Sub42_Sub13) this).aClass107_9621
	    .add(class348_sub42_sub12);
	int i_3_ = 80 % ((i - -81) / 33);
	((Class348_Sub42_Sub13) this).anInt9615++;
	return bool;
    }
    
    final boolean method3234(byte i,
			     Class348_Sub42_Sub12 class348_sub42_sub12) {
	anInt9614++;
	int i_4_ = 41 % ((-30 - i) / 39);
	int i_5_ = method3235(-17937);
	class348_sub42_sub12.removeSubnode();
	((Class348_Sub42_Sub13) this).anInt9615--;
	if (((Class348_Sub42_Sub13) this).anInt9615 == 0) {
	    this.removeNode();
	    this.removeSubnode();
	    Class8.anInt166--;
	    IntegerVarScriptSettingLoader.aClass60_3301.method582(this,
					     ((Class348_Sub42_Sub12)
					      class348_sub42_sub12).aLong9600,
					     (byte) -128);
	    return false;
	}
	if ((method3235(-17937) ^ 0xffffffff) == (i_5_ ^ 0xffffffff))
	    return false;
	return true;
    }
    
    Class348_Sub42_Sub13(String string) {
	((Class348_Sub42_Sub13) this).aString9617 = string;
	((Class348_Sub42_Sub13) this).aClass107_9621 = new Queue();
    }
    
    final int method3235(int i) {
	if (i != -17937)
	    return 104;
	anInt9619++;
	if ((((Queue) ((Class348_Sub42_Sub13) this).aClass107_9621)
	     .parent)
	    != ((SubNode)
		(((Queue) ((Class348_Sub42_Sub13) this).aClass107_9621)
		 .parent)).subnodeParent)
	    return ((Class348_Sub42_Sub12) (Class348_Sub42_Sub12)
		    ((SubNode)
		     (((Queue) ((Class348_Sub42_Sub13) this).aClass107_9621)
		      .parent)).subnodeParent).anInt9608;
	return -1;
    }
}
