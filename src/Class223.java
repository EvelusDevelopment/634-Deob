/* Class223 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class223
{
    static Class221 aClass221_2893;
    static int anInt2894;
    static boolean aBoolean2895 = false;
    int anInt2896;
    static int anInt2897;
    static int anInt2898;
    static int[] anIntArray2899;
    static int[][] anIntArrayArray2900;
    
    public static void method1612(byte i) {
	anIntArray2899 = null;
	if (i != -9)
	    method1614(-47, null, -126, -99, 117, null, null, 90);
	anIntArrayArray2900 = null;
	aClass221_2893 = null;
    }
    
    public final String toString() {
	anInt2894++;
	throw new IllegalStateException();
    }
    
    static final boolean method1613(boolean bool, int i, int i_0_) {
	if (bool != false)
	    method1612((byte) -104);
	anInt2897++;
	if ((i_0_ & 0x22 ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
    
    Class223(int i, int i_1_) {
	((Class223) this).anInt2896 = i_1_;
    }
    
    static final void method1614
	(int i, Npc class318_sub1_sub3_sub3_sub1,
	 int i_2_, int i_3_, int i_4_,
	 Player class318_sub1_sub3_sub3_sub2,
	 ObjectDefinition class51, int i_5_) {
	try {
	    anInt2898++;
	    if (i != 979190089)
		aBoolean2895 = false;
	    Class348_Sub9 class348_sub9 = new Class348_Sub9();
	    ((Class348_Sub9) class348_sub9).anInt6678 = i_4_ << 1855627529;
	    ((Class348_Sub9) class348_sub9).anInt6693 = i_2_;
	    ((Class348_Sub9) class348_sub9).anInt6689 = i_3_ << -90042871;
	    if (class51 == null) {
		if (class318_sub1_sub3_sub3_sub1 != null) {
		    ((Class348_Sub9) class348_sub9)
			.aClass318_Sub1_Sub3_Sub3_Sub1_6691
			= class318_sub1_sub3_sub3_sub1;
		    NpcDefinition class79 = (((Npc)
					class318_sub1_sub3_sub3_sub1)
				       .definition);
		    if (((NpcDefinition) class79).anIntArray1377 != null) {
			((Class348_Sub9) class348_sub9).aBoolean6684 = true;
			class79 = class79.method794((Class318_Sub1_Sub3_Sub3
						     .varbitHandler),
						    i ^ ~0x3a5d4149);
		    }
		    if (class79 != null) {
			((Class348_Sub9) class348_sub9).anInt6698
			    = (i_4_ + ((NpcDefinition) class79).anInt1399
			       << 2136949737);
			((Class348_Sub9) class348_sub9).anInt6687
			    = (i_3_ - -((NpcDefinition) class79).anInt1399
			       << -871288535);
			((Class348_Sub9) class348_sub9).anInt6685
			    = Class8.method214(class318_sub1_sub3_sub3_sub1,
					       -1);
			((Class348_Sub9) class348_sub9).anInt6696
			    = ((NpcDefinition) class79).anInt1340;
			((Class348_Sub9) class348_sub9).anInt6694
			    = ((NpcDefinition) class79).anInt1392 << 2145198185;
			((Class348_Sub9) class348_sub9).anInt6677
			    = ((NpcDefinition) class79).anInt1356;
			((Class348_Sub9) class348_sub9).anInt6681
			    = ((NpcDefinition) class79).anInt1363;
			((Class348_Sub9) class348_sub9).aBoolean6674
			    = ((NpcDefinition) class79).aBoolean1370;
		    }
		    Main.aClass262_5185.addToFront(class348_sub9,
						     i + -979210269);
		} else if (class318_sub1_sub3_sub3_sub2 != null) {
		    ((Class348_Sub9) class348_sub9)
			.aClass318_Sub1_Sub3_Sub3_Sub2_6679
			= class318_sub1_sub3_sub3_sub2;
		    ((Class348_Sub9) class348_sub9).anInt6698
			= (class318_sub1_sub3_sub3_sub2.method2436((byte) 74)
			   + i_4_) << -5982327;
		    ((Class348_Sub9) class348_sub9).anInt6687
			= (class318_sub1_sub3_sub3_sub2.method2436((byte) 86)
			   + i_3_) << 1741296713;
		    ((Class348_Sub9) class348_sub9).anInt6685
			= Class315.method2357(-1,
					      class318_sub1_sub3_sub3_sub2);
		    ((Class348_Sub9) class348_sub9).anInt6681 = 256;
		    ((Class348_Sub9) class348_sub9).anInt6694
			= (((Player)
			    class318_sub1_sub3_sub3_sub2).anInt10553
			   << 979190089);
		    ((Class348_Sub9) class348_sub9).anInt6677
			= ((Player)
			   class318_sub1_sub3_sub3_sub2).anInt10558;
		    ((Class348_Sub9) class348_sub9).anInt6696 = 256;
		    ((Class348_Sub9) class348_sub9).aBoolean6674
			= ((Player)
			   class318_sub1_sub3_sub3_sub2).aBoolean10517;
		    FileIndexRequest.aClass356_10465.putNode
			((long) ((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3_sub2).anInt10290,
			 class348_sub9);
		}
	    } else {
		((Class348_Sub9) class348_sub9).aClass51_6695 = class51;
		int i_6_ = ((ObjectDefinition) class51).anInt961;
		int i_7_ = ((ObjectDefinition) class51).anInt926;
		if (i_5_ == 1 || (i_5_ ^ 0xffffffff) == -4) {
		    i_6_ = ((ObjectDefinition) class51).anInt926;
		    i_7_ = ((ObjectDefinition) class51).anInt961;
		}
		((Class348_Sub9) class348_sub9).anInt6687
		    = i_7_ + i_3_ << 648119049;
		((Class348_Sub9) class348_sub9).anInt6680
		    = ((ObjectDefinition) class51).anInt962;
		((Class348_Sub9) class348_sub9).anInt6685
		    = ((ObjectDefinition) class51).anInt887;
		((Class348_Sub9) class348_sub9).anInt6681
		    = ((ObjectDefinition) class51).anInt916;
		((Class348_Sub9) class348_sub9).anIntArray6697
		    = ((ObjectDefinition) class51).anIntArray904;
		((Class348_Sub9) class348_sub9).anInt6696
		    = ((ObjectDefinition) class51).anInt878;
		((Class348_Sub9) class348_sub9).aBoolean6699
		    = ((ObjectDefinition) class51).aBoolean903;
		((Class348_Sub9) class348_sub9).anInt6694
		    = ((ObjectDefinition) class51).anInt889 << -800621463;
		((Class348_Sub9) class348_sub9).anInt6668
		    = ((ObjectDefinition) class51).anInt937;
		((Class348_Sub9) class348_sub9).anInt6698
		    = i_6_ + i_4_ << -513314007;
		((Class348_Sub9) class348_sub9).anInt6677
		    = ((ObjectDefinition) class51).anInt936;
		((Class348_Sub9) class348_sub9).aBoolean6674
		    = ((ObjectDefinition) class51).aBoolean888;
		if (((ObjectDefinition) class51).anIntArray945 != null) {
		    ((Class348_Sub9) class348_sub9).aBoolean6684 = true;
		    class348_sub9.method2781((byte) 21);
		}
		if (((Class348_Sub9) class348_sub9).anIntArray6697 != null)
		    ((Class348_Sub9) class348_sub9).anInt6670
			= (((Class348_Sub9) class348_sub9).anInt6680
			   - -(int) ((double) (-((Class348_Sub9)
						 class348_sub9).anInt6680
					       + ((Class348_Sub9)
						  class348_sub9).anInt6668)
				     * Math.random()));
		Class218.aClass262_2859.addToFront(class348_sub9, -20180);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("ad.B(" + i + ','
			+ (class318_sub1_sub3_sub3_sub1 != null ? "{...}"
			   : "null")
			+ ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ','
			+ (class318_sub1_sub3_sub3_sub2 != null ? "{...}"
			   : "null")
			+ ',' + (class51 != null ? "{...}" : "null") + ','
			+ i_5_ + ')'));
	}
    }
    
    static {
	aClass221_2893 = new Class221();
	anIntArray2899 = new int[13];
	anIntArrayArray2900 = new int[128][128];
    }
}
