/* Class348_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub7 extends Node
{
    static int anInt6641;
    int anInt6642;
    static Sprite aClass207_6643;
    static Class229 aClass229_6644 = new Class229();
    int anInt6645;
    static int anInt6646;
    int anInt6647;
    int anInt6648;
    int anInt6649;
    boolean aBoolean6650;
    static long aLong6651 = -1L;
    static int anInt6652 = 0;
    static Class33 aClass33_6653;
    
    static final void method2772(int i, byte i_0_) {
	anInt6641++;
	if (Class320.method2547(i, (byte) 84) && i_0_ > 105) {
	    Widget[] class46s
		= Class348_Sub40_Sub33.aClass46ArrayArray9427[i];
	    for (int i_1_ = 0;
		 (class46s.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff);
		 i_1_++) {
		Widget class46 = class46s[i_1_];
		if (class46 != null) {
		    ((Widget) class46).anInt795 = 0;
		    ((Widget) class46).anInt730 = 1;
		    ((Widget) class46).anInt841 = 0;
		}
	    }
	}
    }
    
    public static void method2773(int i) {
	aClass207_6643 = null;
	aClass229_6644 = null;
	if (i == 0)
	    aClass33_6653 = null;
    }
    
    Class348_Sub7(int i, int i_2_, int i_3_, int i_4_, int i_5_,
		  boolean bool) {
	((Class348_Sub7) this).anInt6647 = i_4_;
	((Class348_Sub7) this).anInt6645 = i_3_;
	((Class348_Sub7) this).anInt6648 = i_2_;
	((Class348_Sub7) this).aBoolean6650 = bool;
	((Class348_Sub7) this).anInt6642 = i_5_;
	((Class348_Sub7) this).anInt6649 = i;
    }
}
