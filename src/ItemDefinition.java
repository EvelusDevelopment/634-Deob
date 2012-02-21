/* ItemDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ItemDefinition
{
    static int anInt2751;
    int anInt2752 = -1;
    private int anInt2753;
    static int anInt2754;
    boolean aBoolean2755;
    private int anInt2756;
    HashTable aClass356_2757;
    int anInt2758;
    int anInt2759;
    private int anInt2760;
    ItemLoader aClass255_2761;
    int[] anIntArray2762;
    String[] aStringArray2763;
    int anInt2764;
    private int anInt2765;
    int anInt2766;
    private int anInt2767;
    static int anInt2768;
    int anInt2769;
    private int anInt2770 = -1;
    private short[] aShortArray2771;
    int[] anIntArray2772;
    static AbstractConnection aClass238_2773;
    int anInt2774;
    private int anInt2775;
    static int anInt2776;
    private short[] aShortArray2777;
    int anInt2778;
    int anInt2779;
    static int anInt2780;
    int anInt2781;
    static int anInt2782;
    boolean aBoolean2783;
    int anInt2784;
    private short[] aShortArray2785;
    private int anInt2786;
    int anInt2787;
    int anInt2788;
    static long aLong2789;
    static int anInt2790;
    private int anInt2791;
    private int anInt2792;
    static int anInt2793;
    private int anInt2794;
    String aString2795;
    static int anInt2796;
    private int anInt2797;
    static int anInt2798 = 0;
    int anInt2799;
    static int anInt2800;
    private short[] aShortArray2801;
    int anInt2802;
    private int anInt2803;
    private int anInt2804;
    private int anInt2805;
    static int anInt2806;
    private int anInt2807;
    private int anInt2808;
    static int anInt2809;
    int anInt2810;
    String[] aStringArray2811;
    int anInt2812;
    static int anInt2813;
    static int anInt2814;
    int anInt2815;
    static int anInt2816;
    int anInt2817;
    int anInt2818;
    int anInt2819;
    int anInt2820;
    private byte[] aByteArray2821;
    private int anInt2822;
    private int anInt2823;
    private int anInt2824;
    int anInt2825;
    int anInt2826;
    int anInt2827;
    static int anInt2828;
    static int anInt2829;
    int anInt2830;
    int[] anIntArray2831;
    static int anInt2832;
    int anInt2833;
    
    final Model method1554(boolean bool, int i) {
	anInt2796++;
	int i_0_ = anInt2792;
	int i_1_ = anInt2767;
	if (bool) {
	    i_1_ = anInt2775;
	    i_0_ = anInt2822;
	}
	if ((i_0_ ^ 0xffffffff) == 0)
	    return null;
	Model class124
	    = Class300.createModel(0,
				  ((ItemLoader) (((ItemDefinition) this)
					       .aClass255_2761)).modelIndexLoader,
				  i_0_);
	if ((((Model) class124).anInt1830 ^ 0xffffffff) > i)
	    class124.method1092(2, 54);
	if ((i_1_ ^ 0xffffffff) != 0) {
	    Model class124_2_
		= Class300.createModel(0, (((ItemLoader)
					   ((ItemDefinition) this).aClass255_2761)
					  .modelIndexLoader), i_1_);
	    if ((((Model) class124_2_).anInt1830 ^ 0xffffffff) > -14)
		class124_2_.method1092(2, i ^ ~0x78);
	    Model[] class124s = { class124, class124_2_ };
	    class124 = new Model(class124s, 2);
	}
	if (aShortArray2777 != null) {
	    for (int i_3_ = 0; i_3_ < aShortArray2777.length; i_3_++)
		class124.recolorTriangles(aShortArray2777[i_3_], (byte) 126,
				    aShortArray2771[i_3_]);
	}
	if (aShortArray2785 != null) {
	    for (int i_4_ = 0;
		 (aShortArray2785.length ^ 0xffffffff) < (i_4_ ^ 0xffffffff);
		 i_4_++)
		class124.method1095(aShortArray2785[i_4_], 0,
				    aShortArray2801[i_4_]);
	}
	return class124;
    }
    
    final boolean method1555(byte i, boolean bool) {
	anInt2828++;
	int i_5_ = anInt2792;
	int i_6_ = -15 / ((28 - i) / 55);
	int i_7_ = anInt2767;
	if (bool) {
	    i_5_ = anInt2822;
	    i_7_ = anInt2775;
	}
	if ((i_5_ ^ 0xffffffff) == 0)
	    return true;
	boolean bool_8_ = true;
	if (!((ItemLoader) ((ItemDefinition) this).aClass255_2761).modelIndexLoader
		 .isLoaded(i_5_, 0))
	    bool_8_ = false;
	if ((i_7_ ^ 0xffffffff) != 0
	    && !((ItemLoader) ((ItemDefinition) this).aClass255_2761).modelIndexLoader
		    .isLoaded(i_7_, 0))
	    bool_8_ = false;
	return bool_8_;
    }
    
    final void method1556(ItemDefinition class213_9_, byte i,
			  ItemDefinition class213_10_) {
	try {
	    anInt2808 = class213_9_.anInt2808;
	    ((ItemDefinition) this).anInt2779 = ((ItemDefinition) class213_10_).anInt2779;
	    ((ItemDefinition) this).anInt2819 = 0;
	    aShortArray2785 = class213_9_.aShortArray2785;
	    ((ItemDefinition) this).anInt2788 = ((ItemDefinition) class213_9_).anInt2788;
	    ((ItemDefinition) this).anInt2781 = ((ItemDefinition) class213_10_).anInt2781;
	    ((ItemDefinition) this).aStringArray2811
		= ((ItemDefinition) class213_9_).aStringArray2811;
	    anInt2797 = class213_9_.anInt2797;
	    aByteArray2821 = class213_9_.aByteArray2821;
	    aShortArray2771 = class213_9_.aShortArray2771;
	    ((ItemDefinition) this).aString2795
		= ((ItemDefinition) class213_9_).aString2795;
	    anInt2756 = class213_10_.anInt2756;
	    anInt2770 = class213_9_.anInt2770;
	    aShortArray2777 = class213_9_.aShortArray2777;
	    ((ItemDefinition) this).anInt2815 = ((ItemDefinition) class213_9_).anInt2815;
	    anInt2822 = class213_9_.anInt2822;
	    anInt2804 = class213_9_.anInt2804;
	    ((ItemDefinition) this).anInt2825 = ((ItemDefinition) class213_10_).anInt2825;
	    anInt2767 = class213_9_.anInt2767;
	    aShortArray2801 = class213_9_.aShortArray2801;
	    ((ItemDefinition) this).aBoolean2783
		= ((ItemDefinition) class213_9_).aBoolean2783;
	    ((ItemDefinition) this).anInt2810 = ((ItemDefinition) class213_10_).anInt2810;
	    ((ItemDefinition) this).aStringArray2763 = new String[5];
	    if (i > -5)
		method1554(false, -92);
	    anInt2823 = class213_9_.anInt2823;
	    anInt2775 = class213_9_.anInt2775;
	    anInt2832++;
	    anInt2807 = class213_9_.anInt2807;
	    anInt2792 = class213_9_.anInt2792;
	    ((ItemDefinition) this).aClass356_2757
		= ((ItemDefinition) class213_9_).aClass356_2757;
	    anInt2805 = class213_9_.anInt2805;
	    ((ItemDefinition) this).anInt2827 = ((ItemDefinition) class213_9_).anInt2827;
	    ((ItemDefinition) this).anInt2787 = ((ItemDefinition) class213_10_).anInt2787;
	    anInt2760 = class213_9_.anInt2760;
	    anInt2753 = class213_9_.anInt2753;
	    anInt2803 = class213_9_.anInt2803;
	    ((ItemDefinition) this).anInt2826 = ((ItemDefinition) class213_10_).anInt2826;
	    if (((ItemDefinition) class213_9_).aStringArray2763 != null) {
		for (int i_11_ = 0; i_11_ < 4; i_11_++)
		    ((ItemDefinition) this).aStringArray2763[i_11_]
			= ((ItemDefinition) class213_9_).aStringArray2763[i_11_];
	    }
	    ((ItemDefinition) this).aStringArray2763[4]
		= GameText.aClass274_3489.getLanguageText((((ItemLoader)
						       (((ItemDefinition) this)
							.aClass255_2761))
						      .anInt3286));
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("rq.G("
					     + (class213_9_ != null ? "{...}"
						: "null")
					     + ',' + i + ','
					     + (class213_10_ != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    private final String method1557(int i, int i_12_) {
	anInt2816++;
	if (i_12_ != -11619)
	    ((ItemDefinition) this).anInt2788 = -113;
	if ((i ^ 0xffffffff) > -100001)
	    return "<col=ffff00>" + i + "</col>";
	if ((i ^ 0xffffffff) > -10000001)
	    return ("<col=ffffff>" + i / 1000
		    + GameText.aClass274_3519.getLanguageText((((ItemLoader)
							   (((ItemDefinition) this)
							    .aClass255_2761))
							  .anInt3286))
		    + "</col>");
	return ("<col=00ff80>" + i / 1000000
		+ GameText.aClass274_3517.getLanguageText((((ItemLoader)
						       (((ItemDefinition) this)
							.aClass255_2761))
						      .anInt3286))
		+ "</col>");
    }
    
    final Model method1558(boolean bool, boolean bool_13_) {
	anInt2809++;
	int i = ((ItemDefinition) this).anInt2815;
	int i_14_ = anInt2804;
	if (bool_13_ != false)
	    ((ItemDefinition) this).aClass356_2757 = null;
	int i_15_ = anInt2805;
	if (bool) {
	    i = ((ItemDefinition) this).anInt2788;
	    i_15_ = anInt2770;
	    i_14_ = anInt2760;
	}
	if (i == -1)
	    return null;
	Model class124
	    = Class300.createModel(0,
				  ((ItemLoader) (((ItemDefinition) this)
					       .aClass255_2761)).modelIndexLoader,
				  i);
	if ((((Model) class124).anInt1830 ^ 0xffffffff) > -14)
	    class124.method1092(2, 64);
	if ((i_14_ ^ 0xffffffff) != 0) {
	    Model class124_16_
		= Class300.createModel(0, (((ItemLoader)
					   ((ItemDefinition) this).aClass255_2761)
					  .modelIndexLoader), i_14_);
	    if ((((Model) class124_16_).anInt1830 ^ 0xffffffff) > -14)
		class124_16_.method1092(2, 89);
	    if (i_15_ != -1) {
		Model class124_17_
		    = Class300.createModel(0, (((ItemLoader) (((ItemDefinition) this)
							   .aClass255_2761))
					      .modelIndexLoader), i_15_);
		if (((Model) class124_17_).anInt1830 < 13)
		    class124_17_.method1092(2, 109);
		Model[] class124s
		    = { class124, class124_16_, class124_17_ };
		class124 = new Model(class124s, 3);
	    } else {
		Model[] class124s = { class124, class124_16_ };
		class124 = new Model(class124s, 2);
	    }
	}
	if (class124 == null)
	    return null;
	if (!bool && (anInt2807 != 0 || (anInt2797 ^ 0xffffffff) != -1
		      || (anInt2808 ^ 0xffffffff) != -1))
	    class124.method1099((byte) 110, anInt2808, anInt2807, anInt2797);
	if (bool && ((anInt2803 ^ 0xffffffff) != -1 || anInt2753 != 0
		     || (anInt2823 ^ 0xffffffff) != -1))
	    class124.method1099((byte) 24, anInt2823, anInt2803, anInt2753);
	if (aShortArray2777 != null) {
	    for (int i_18_ = 0;
		 (i_18_ ^ 0xffffffff) > (aShortArray2777.length ^ 0xffffffff);
		 i_18_++)
		class124.recolorTriangles(aShortArray2777[i_18_], (byte) 126,
				    aShortArray2771[i_18_]);
	}
	if (aShortArray2785 != null) {
	    for (int i_19_ = 0; aShortArray2785.length > i_19_; i_19_++)
		class124.method1095(aShortArray2785[i_19_], 0,
				    aShortArray2801[i_19_]);
	}
	return class124;
    }
    
    final AnimatableToolkit method1559(Class154 class154, AnimationDefinition class17, AbstractToolkit var_ha,
			     int i, int i_20_, int i_21_, int i_22_,
			     byte i_23_, int i_24_) {
	try {
	    anInt2813++;
	    if (((ItemDefinition) this).anIntArray2762 != null
		&& (i_21_ ^ 0xffffffff) < -2) {
		int i_25_ = -1;
		for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > -11; i_26_++) {
		    if (i_21_ >= ((ItemDefinition) this).anIntArray2831[i_26_]
			&& ((ItemDefinition) this).anIntArray2831[i_26_] != 0)
			i_25_ = ((ItemDefinition) this).anIntArray2762[i_26_];
		}
		if ((i_25_ ^ 0xffffffff) != 0)
		    return (((ItemDefinition) this).aClass255_2761.getItemDefinition
				(103, i_25_).method1559
			    (class154, class17, var_ha, i, i_20_, 1, i_22_,
			     (byte) 88, i_24_));
	    }
	    if (i_23_ != 88)
		((ItemDefinition) this).aString2795 = null;
	    int i_27_ = i;
	    if (class17 != null)
		i_27_ |= class17.method263(i_24_, 105, i_22_, true);
	    AnimatableToolkit class64;
	    synchronized (((ItemLoader) ((ItemDefinition) this).aClass255_2761)
			  .aClass60_3287) {
		class64
		    = (AnimatableToolkit) (((ItemLoader) ((ItemDefinition) this).aClass255_2761)
				     .aClass60_3287.method583
				 ((long) (((AbstractToolkit) var_ha).id << -786392163
					  | ((ItemDefinition) this).anInt2769),
				  69));
	    }
	    if (class64 == null || (var_ha.method3667(class64.ua(), i_27_)
				    ^ 0xffffffff) != -1) {
		if (class64 != null)
		    i_27_ = var_ha.OR(i_27_, class64.ua());
		int i_28_ = i_27_;
		if (aShortArray2785 != null)
		    i_28_ |= 0x8000;
		if (aShortArray2777 != null || class154 != null)
		    i_28_ |= 0x4000;
		if ((anInt2786 ^ 0xffffffff) != -129)
		    i_28_ |= 0x1;
		if (anInt2786 != 128)
		    i_28_ |= 0x2;
		if ((anInt2786 ^ 0xffffffff) != -129)
		    i_28_ |= 0x4;
		Model class124
		    = Class300.createModel(0, (((ItemLoader) (((ItemDefinition) this)
							   .aClass255_2761))
					      .modelIndexLoader), anInt2756);
		if (class124 == null)
		    return null;
		if (((Model) class124).anInt1830 < 13)
		    class124.method1092(2, 97);
		class64 = var_ha.method3625(class124, i_28_,
					    (((ItemLoader)
					      ((ItemDefinition) this).aClass255_2761)
					     .anInt3291),
					    anInt2791 + 64, 850 - -anInt2824);
		if (anInt2786 != 128 || (anInt2794 ^ 0xffffffff) != -129
		    || (anInt2765 ^ 0xffffffff) != -129)
		    class64.O(anInt2786, anInt2794, anInt2765);
		if (aShortArray2777 != null) {
		    for (int i_29_ = 0; ((aShortArray2777.length ^ 0xffffffff)
					 < (i_29_ ^ 0xffffffff)); i_29_++) {
			if (aByteArray2821 == null
			    || (i_29_ ^ 0xffffffff) <= (aByteArray2821.length
							^ 0xffffffff))
			    class64.ia(aShortArray2777[i_29_],
				       aShortArray2771[i_29_]);
			else
			    class64.ia(aShortArray2777[i_29_],
				       (Class336.aShortArray4172
					[aByteArray2821[i_29_] & 0xff]));
		    }
		}
		if (aShortArray2785 != null) {
		    for (int i_30_ = 0; aShortArray2785.length > i_30_;
			 i_30_++)
			class64.aa(aShortArray2785[i_30_],
				   aShortArray2801[i_30_]);
		}
		if (class154 != null) {
		    for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > -6; i_31_++) {
			for (int i_32_ = 0;
			     (Class367_Sub2.aShortArrayArrayArray7290.length
			      > i_32_);
			     i_32_++) {
			    if (((Class154) class154).anIntArray2095[i_31_]
				< (Class367_Sub2.aShortArrayArrayArray7290
				   [i_32_][i_31_]).length)
				class64.ia((EntryElementLoader.aShortArrayArray4791
					    [i_32_][i_31_]),
					   (Class367_Sub2
					    .aShortArrayArrayArray7290[i_32_]
					    [i_31_]
					    [(((Class154) class154)
					      .anIntArray2095[i_31_])]));
			}
		    }
		}
		class64.s(i_27_);
		synchronized (((ItemLoader) ((ItemDefinition) this).aClass255_2761)
			      .aClass60_3287) {
		    ((ItemLoader) ((ItemDefinition) this).aClass255_2761)
			.aClass60_3287.method582
			(class64,
			 (long) (((AbstractToolkit) var_ha).id << -1631386755
				 | ((ItemDefinition) this).anInt2769),
			 (byte) -111);
		}
	    }
	    if (class17 != null)
		class64 = class17.method269(116, class64, i_24_, i_20_, i_27_,
					    i_22_);
	    class64.s(i);
	    return class64;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("rq.S(" + (class154 != null ? "{...}" : "null") + ','
			+ (class17 != null ? "{...}" : "null") + ','
			+ (var_ha != null ? "{...}" : "null") + ',' + i + ','
			+ i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ','
			+ i_24_ + ')'));
	}
    }
    
    final ItemDefinition method1560(int i, byte i_33_) {
	if (i_33_ != 97)
	    ((ItemDefinition) this).anIntArray2762 = null;
	anInt2768++;
	if (((ItemDefinition) this).anIntArray2762 != null
	    && (i ^ 0xffffffff) < -2) {
	    int i_34_ = -1;
	    for (int i_35_ = 0; i_35_ < 10; i_35_++) {
		if (i >= ((ItemDefinition) this).anIntArray2831[i_35_]
		    && ((ItemDefinition) this).anIntArray2831[i_35_] != 0)
		    i_34_ = ((ItemDefinition) this).anIntArray2762[i_35_];
	    }
	    if ((i_34_ ^ 0xffffffff) != 0)
		return ((ItemDefinition) this).aClass255_2761.getItemDefinition(95, i_34_);
	}
	return this;
    }
    
    final String method1561(String string, int i, int i_36_) {
	try {
	    anInt2751++;
	    if (((ItemDefinition) this).aClass356_2757 == null)
		return string;
	    if (i_36_ != -1511086397)
		method1569(25, null);
	    StringNode class348_sub50
		= ((StringNode)
		   ((ItemDefinition) this).aClass356_2757
		       .get((long) i));
	    if (class348_sub50 == null)
		return string;
	    return ((StringNode) class348_sub50).value;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("rq.N("
					     + (string != null ? "{...}"
						: "null")
					     + ',' + i + ',' + i_36_ + ')'));
	}
    }
    
    final int[] method1562(int i, boolean bool, int i_37_, AbstractToolkit var_ha,
			   AbstractToolkit var_ha_38_, AbstractFontRasterizer class324, Class154 class154,
			   int i_39_, byte i_40_, int i_41_) {
	try {
	    anInt2806++;
	    Model class124
		= Class300.createModel(0,
				      (((ItemLoader)
					((ItemDefinition) this).aClass255_2761)
				       .modelIndexLoader),
				      anInt2756);
	    if (class124 == null)
		return null;
	    if (((Model) class124).anInt1830 < 13)
		class124.method1092(2, i_40_ ^ ~0xb);
	    if (aShortArray2777 != null) {
		for (int i_42_ = 0;
		     ((i_42_ ^ 0xffffffff)
		      > (aShortArray2777.length ^ 0xffffffff));
		     i_42_++) {
		    if (aByteArray2821 == null
			|| i_42_ >= aByteArray2821.length)
			class124.recolorTriangles(aShortArray2777[i_42_], (byte) 126,
					    aShortArray2771[i_42_]);
		    else
			class124.recolorTriangles(aShortArray2777[i_42_], (byte) 126,
					    (Class336.aShortArray4172
					     [aByteArray2821[i_42_] & 0xff]));
		}
	    }
	    if (aShortArray2785 != null) {
		for (int i_43_ = 0;
		     ((i_43_ ^ 0xffffffff)
		      > (aShortArray2785.length ^ 0xffffffff));
		     i_43_++)
		    class124.method1095(aShortArray2785[i_43_], 0,
					aShortArray2801[i_43_]);
	    }
	    if (class154 != null) {
		for (int i_44_ = 0; i_44_ < 5; i_44_++) {
		    for (int i_45_ = 0;
			 (i_45_
			  < Class367_Sub2.aShortArrayArrayArray7290.length);
			 i_45_++) {
			if ((Class367_Sub2.aShortArrayArrayArray7290[i_45_]
			     [i_44_]).length
			    > ((Class154) class154).anIntArray2095[i_44_])
			    class124.recolorTriangles((EntryElementLoader.aShortArrayArray4791
						 [i_45_][i_44_]),
						(byte) 126,
						(Class367_Sub2
						 .aShortArrayArrayArray7290
						 [i_45_][i_44_]
						 [(((Class154) class154)
						   .anIntArray2095[i_44_])]));
		    }
		}
	    }
	    int i_46_ = 2048;
	    boolean bool_47_ = false;
	    if (anInt2786 != 128 || anInt2794 != 128
		|| (anInt2765 ^ 0xffffffff) != -129) {
		i_46_ |= 0x7;
		bool_47_ = true;
	    }
	    AnimatableToolkit class64
		= var_ha_38_.method3625(class124, i_46_, 64, anInt2791 + 64,
					768 + anInt2824);
	    if (!class64.method618())
		return null;
	    if (bool_47_)
		class64.O(anInt2786, anInt2794, anInt2765);
	    RasterToolkit class105 = null;
	    if ((((ItemDefinition) this).anInt2833 ^ 0xffffffff) == 0) {
		if (((ItemDefinition) this).anInt2812 != -1) {
		    class105 = (((ItemDefinition) this).aClass255_2761.method1932
				(var_ha_38_, i_37_, i, class324, class154, 0,
				 true, (byte) 83, var_ha,
				 ((ItemDefinition) this).anInt2778, false, i_41_));
		    if (class105 == null)
			return null;
		}
	    } else {
		class105 = (((ItemDefinition) this).aClass255_2761.method1932
			    (var_ha_38_, 0, 10, class324, class154, 0, true,
			     (byte) 83, var_ha, ((ItemDefinition) this).anInt2758,
			     true, 1));
		if (class105 == null)
		    return null;
	    }
	    int i_48_;
	    if (!bool) {
		if ((i_41_ ^ 0xffffffff) == -3)
		    i_48_
			= ((int) (1.04 * (double) ((ItemDefinition) this).anInt2825)
			   << -1862212478);
		else
		    i_48_ = ((ItemDefinition) this).anInt2825 << -1012953438;
	    } else
		i_48_ = ((int) (1.5 * (double) ((ItemDefinition) this).anInt2825)
			 << -1409493118);
	    var_ha_38_.DA(16, 16, 512, 512);
	    Class101 class101 = var_ha_38_.method3654();
	    class101.method910();
	    var_ha_38_.method3638(class101);
	    var_ha_38_.xa(1.0F);
	    var_ha_38_.ZA(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
	    Class101 class101_49_ = var_ha_38_.method3705();
	    class101_49_
		.method902(-((ItemDefinition) this).anInt2810 << -1511086397);
	    class101_49_.method896(((ItemDefinition) this).anInt2781 << -276342205);
	    class101_49_.method891
		(((ItemDefinition) this).anInt2779 << 680634690,
		 ((i_48_ * (Class70.sineTable
			    [((ItemDefinition) this).anInt2787 << -2046860573])
		   >> -1439442898)
		  - class64.fa() / 2
		  + (((ItemDefinition) this).anInt2826 << 203456290)),
		 ((i_48_ * (Class70.cosineTable
			    [((ItemDefinition) this).anInt2787 << 935998435])
		   >> 1535648686)
		  - -(((ItemDefinition) this).anInt2826 << 1979023778)));
	    class101_49_.method900(((ItemDefinition) this).anInt2787 << 324700291);
	    int i_50_ = var_ha_38_.i();
	    int i_51_ = var_ha_38_.XA();
	    var_ha_38_.f(50, 2147483647);
	    var_ha_38_.ya();
	    var_ha_38_.la();
	    var_ha_38_.drawQuad(0, 0, 36, 32, 0, 0);
	    class64.method615(class101_49_, null, 1);
	    var_ha_38_.f(i_50_, i_51_);
	    int[] is = var_ha_38_.na(0, 0, 36, 32);
	    if (i_40_ != -102)
		method1554(false, 37);
	    if (i_41_ >= 1) {
		is = method1572(-16777214, -1, is);
		if ((i_41_ ^ 0xffffffff) <= -3)
		    is = method1572(-1, -1, is);
	    }
	    if (i_37_ != 0)
		method1571(i_37_, is, (byte) 119);
	    var_ha_38_.method3662(36, is, (byte) 94, 0, 36, 32).method974(0,
									  0);
	    if (((ItemDefinition) this).anInt2833 == -1) {
		if ((((ItemDefinition) this).anInt2812 ^ 0xffffffff) != 0)
		    class105.method974(0, 0);
	    } else
		class105.method974(0, 0);
	    if (i_39_ == 1 || ((i_39_ ^ 0xffffffff) == -3
			       && (((ItemDefinition) this).anInt2820 == 1 || i != 1)
			       && i != -1))
		class324.drawString1(method1557(i, i_40_ + -11517), -256, 9, 0,
				    -16777215, i_40_ + -15);
	    is = var_ha_38_.na(0, 0, 36, 32);
	    for (int i_52_ = 0;
		 (is.length ^ 0xffffffff) < (i_52_ ^ 0xffffffff); i_52_++) {
		if ((0xffffff & is[i_52_] ^ 0xffffffff) != -1)
		    is[i_52_] = Class273.method2057(is[i_52_], -16777216);
		else
		    is[i_52_] = 0;
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("rq.O(" + i + ',' + bool + ',' + i_37_ + ','
			+ (var_ha != null ? "{...}" : "null") + ','
			+ (var_ha_38_ != null ? "{...}" : "null") + ','
			+ (class324 != null ? "{...}" : "null") + ','
			+ (class154 != null ? "{...}" : "null") + ',' + i_39_
			+ ',' + i_40_ + ',' + i_41_ + ')'));
	}
    }
    
    final void method1563(byte i) {
	if (i < 32)
	    ((ItemDefinition) this).anInt2752 = -31;
	anInt2814++;
    }
    
    public static void method1564(int i) {
	aClass238_2773 = null;
	if (i <= 54)
	    aLong2789 = -74L;
    }
    
    final boolean method1565(boolean bool, int i) {
	anInt2780++;
	int i_53_ = ((ItemDefinition) this).anInt2815;
	int i_54_ = anInt2804;
	int i_55_ = anInt2805;
	if (bool) {
	    i_55_ = anInt2770;
	    i_53_ = ((ItemDefinition) this).anInt2788;
	    i_54_ = anInt2760;
	}
	if (i_53_ == -1)
	    return true;
	boolean bool_56_ = true;
	if (!((ItemLoader) ((ItemDefinition) this).aClass255_2761).modelIndexLoader
		 .isLoaded(i_53_, 0))
	    bool_56_ = false;
	if ((i_54_ ^ 0xffffffff) != 0
	    && !((ItemLoader) ((ItemDefinition) this).aClass255_2761).modelIndexLoader
		    .isLoaded(i_54_, 0))
	    bool_56_ = false;
	if (i != i_55_ && !((ItemLoader) ((ItemDefinition) this).aClass255_2761)
			       .modelIndexLoader.isLoaded(i_55_, 0))
	    bool_56_ = false;
	return bool_56_;
    }
    
    private final void method1566(int i, int i_57_,
				  ByteBuffer class348_sub49) {
	try {
	    if (i != 4)
		method1564(9);
	    if (i_57_ != 1) {
		if ((i_57_ ^ 0xffffffff) != -3) {
		    if (i_57_ == 4)
			((ItemDefinition) this).anInt2825
			    = class348_sub49.getShort();
		    else if ((i_57_ ^ 0xffffffff) == -6)
			((ItemDefinition) this).anInt2787
			    = class348_sub49.getShort();
		    else if ((i_57_ ^ 0xffffffff) == -7)
			((ItemDefinition) this).anInt2781
			    = class348_sub49.getShort();
		    else if (i_57_ == 7) {
			((ItemDefinition) this).anInt2779
			    = class348_sub49.getShort();
			if ((((ItemDefinition) this).anInt2779 ^ 0xffffffff)
			    < -32768)
			    ((ItemDefinition) this).anInt2779 -= 65536;
		    } else if ((i_57_ ^ 0xffffffff) != -9) {
			if ((i_57_ ^ 0xffffffff) != -12) {
			    if ((i_57_ ^ 0xffffffff) != -13) {
				if ((i_57_ ^ 0xffffffff) == -17)
				    ((ItemDefinition) this).aBoolean2783 = true;
				else if (i_57_ == 18)
				    ((ItemDefinition) this).anInt2802
					= class348_sub49
					      .getShort();
				else if (i_57_ == 23)
				    ((ItemDefinition) this).anInt2815
					= class348_sub49.getShort();
				else if (i_57_ == 24)
				    anInt2804
					= class348_sub49
					      .getShort();
				else if (i_57_ == 25)
				    ((ItemDefinition) this).anInt2788
					= class348_sub49
					      .getShort();
				else if (i_57_ == 26)
				    anInt2760 = class348_sub49
						    .getShort();
				else if ((i_57_ ^ 0xffffffff) > -31
					 || i_57_ >= 35) {
				    if (i_57_ >= 35 && i_57_ < 40)
					((ItemDefinition) this).aStringArray2763
					    [-35 + i_57_]
					    = class348_sub49
						  .getJStr();
				    else if ((i_57_ ^ 0xffffffff) == -41) {
					int i_58_
					    = class348_sub49.getUByte();
					aShortArray2777 = new short[i_58_];
					aShortArray2771 = new short[i_58_];
					for (int i_59_ = 0; i_58_ > i_59_;
					     i_59_++) {
					    aShortArray2777[i_59_]
						= (short) (class348_sub49
							       .getShort
							   ());
					    aShortArray2771[i_59_]
						= (short) (class348_sub49
							       .getShort
							   ());
					}
				    } else if (i_57_ != 41) {
					if ((i_57_ ^ 0xffffffff) == -43) {
					    int i_60_
						= class348_sub49
						      .getUByte();
					    aByteArray2821 = new byte[i_60_];
					    for (int i_61_ = 0; i_61_ < i_60_;
						 i_61_++)
						aByteArray2821[i_61_]
						    = class348_sub49
							  .getByte();
					} else if (i_57_ == 65)
					    ((ItemDefinition) this).aBoolean2755
						= true;
					else if (i_57_ == 78)
					    anInt2805
						= class348_sub49
						      .getShort();
					else if ((i_57_ ^ 0xffffffff) == -80)
					    anInt2770
						= (class348_sub49.getShort
						   ());
					else if ((i_57_ ^ 0xffffffff) == -91)
					    anInt2792
						= class348_sub49
						      .getShort();
					else if (i_57_ == 91)
					    anInt2822
						= class348_sub49
						      .getShort();
					else if (i_57_ != 92) {
					    if (i_57_ != 93) {
						if ((i_57_ ^ 0xffffffff)
						    != -96) {
						    if ((i_57_ ^ 0xffffffff)
							!= -97) {
							if ((i_57_
							     ^ 0xffffffff)
							    == -98)
							    ((ItemDefinition) this)
								.anInt2758
								= (class348_sub49
								       .getShort
								   ());
							else if (i_57_ == 98)
							    ((ItemDefinition) this)
								.anInt2833
								= (class348_sub49
								       .getShort
								   ());
							else if (((i_57_
								   ^ 0xffffffff)
								  <= -101)
								 && (i_57_
								     < 110)) {
							    if ((((ItemDefinition)
								  this)
								 .anIntArray2762)
								== null) {
								((ItemDefinition)
								 this)
								    .anIntArray2831
								    = (new int
								       [10]);
								((ItemDefinition)
								 this)
								    .anIntArray2762
								    = (new int
								       [10]);
							    }
							    ((ItemDefinition) this)
								.anIntArray2762
								[i_57_ - 100]
								= (class348_sub49
								       .getShort
								   ());
							    ((ItemDefinition) this)
								.anIntArray2831
								[i_57_ + -100]
								= (class348_sub49
								       .getShort
								   ());
							} else if (i_57_
								   == 110)
							    anInt2786
								= (class348_sub49
								       .getShort
								   ());
							else if (i_57_
								 != 111) {
							    if (i_57_ == 112)
								anInt2765
								    = (class348_sub49
									   .getShort
								       ());
							    else if ((i_57_
								      ^ 0xffffffff)
								     != -114) {
								if (i_57_
								    == 114)
								    anInt2824
									= ((class348_sub49.getByte
									    ())
									   * 5);
								else if (i_57_
									 == 115)
								    ((ItemDefinition)
								     this)
									.anInt2827
									= (class348_sub49.getUByte
									   ());
								else if ((i_57_
									  ^ 0xffffffff)
									 != -122) {
								    if (i_57_
									!= 122) {
									if (i_57_
									    != 125) {
									    if (i_57_ != 126) {
										if ((i_57_ ^ 0xffffffff) != -128) {
										    if (i_57_ != 128) {
											if (i_57_ == 129) {
											    ((ItemDefinition) this).anInt2766 = class348_sub49.getUByte();
											    ((ItemDefinition) this).anInt2818 = class348_sub49.getShort();
											} else if (i_57_ == 130) {
											    ((ItemDefinition) this).anInt2774 = class348_sub49.getUByte();
											    ((ItemDefinition) this).anInt2817 = class348_sub49.getShort();
											} else if ((i_57_ ^ 0xffffffff) == -133) {
											    int i_62_ = class348_sub49.getUByte();
											    ((ItemDefinition) this).anIntArray2772 = new int[i_62_];
											    for (int i_63_ = 0; (i_63_ ^ 0xffffffff) > (i_62_ ^ 0xffffffff); i_63_++)
												((ItemDefinition) this).anIntArray2772[i_63_] = class348_sub49.getShort();
											} else if ((i_57_ ^ 0xffffffff) == -135)
											    ((ItemDefinition) this).anInt2784 = class348_sub49.getUByte();
											else if ((i_57_ ^ 0xffffffff) == -250) {
											    int i_64_ = class348_sub49.getUByte();
											    if (((ItemDefinition) this).aClass356_2757 == null) {
												int i_65_ = Class33.method340(i_64_, (byte) 108);
												((ItemDefinition) this).aClass356_2757 = new HashTable(i_65_);
											    }
											    for (int i_66_ = 0; i_66_ < i_64_; i_66_++) {
												boolean bool = (class348_sub49.getUByte() ^ 0xffffffff) == -2;
												int i_67_ = class348_sub49.getTri();
												Node class348;
												if (bool)
												    class348 = new StringNode(class348_sub49.getJStr());
												else
												    class348 = new Class348_Sub35(class348_sub49.getDWord());
												((ItemDefinition) this).aClass356_2757.putNode((long) i_67_, class348);
											    }
											}
										    } else {
											((ItemDefinition) this).anInt2764 = class348_sub49.getUByte();
											((ItemDefinition) this).anInt2830 = class348_sub49.getShort();
										    }
										} else {
										    ((ItemDefinition) this).anInt2752 = class348_sub49.getUByte();
										    ((ItemDefinition) this).anInt2759 = class348_sub49.getShort();
										}
									    } else {
										anInt2803 = class348_sub49.getByte() << -39131134;
										anInt2753 = class348_sub49.getByte() << -179898174;
										anInt2823 = class348_sub49.getByte() << -1917956926;
									    }
									} else {
									    anInt2807 = class348_sub49.getByte() << 448961666;
									    anInt2797 = class348_sub49.getByte() << 1336603138;
									    anInt2808 = class348_sub49.getByte() << 1630838114;
									}
								    } else
									((ItemDefinition)
									 this)
									    .anInt2812
									    = class348_sub49.getShort();
								} else
								    ((ItemDefinition)
								     this)
									.anInt2778
									= (class348_sub49.getShort
									   ());
							    } else
								anInt2791
								    = (class348_sub49
									   .getByte
								       ());
							} else
							    anInt2794
								= (class348_sub49
								       .getShort
								   ());
						    } else
							((ItemDefinition) this)
							    .anInt2799
							    = (class348_sub49
								   .getUByte
							       ());
						} else
						    ((ItemDefinition) this).anInt2810
							= (class348_sub49
							       .getShort
							   ());
					    } else
						anInt2775 = (class348_sub49
								 .getShort
							     ());
					} else
					    anInt2767
						= class348_sub49
						      .getShort();
				    } else {
					int i_68_ = class348_sub49
							.getUByte();
					aShortArray2801 = new short[i_68_];
					aShortArray2785 = new short[i_68_];
					for (int i_69_ = 0; i_69_ < i_68_;
					     i_69_++) {
					    aShortArray2785[i_69_]
						= (short) (class348_sub49
							       .getShort
							   ());
					    aShortArray2801[i_69_]
						= (short) (class348_sub49
							       .getShort
							   ());
					}
				    }
				} else
				    ((ItemDefinition) this).aStringArray2811
					[-30 + i_57_]
					= class348_sub49.getJStr();
			    } else
				((ItemDefinition) this).anInt2819
				    = class348_sub49.getDWord();
			} else
			    ((ItemDefinition) this).anInt2820 = 1;
		    } else {
			((ItemDefinition) this).anInt2826
			    = class348_sub49.getShort();
			if ((((ItemDefinition) this).anInt2826 ^ 0xffffffff)
			    < -32768)
			    ((ItemDefinition) this).anInt2826 -= 65536;
		    }
		} else
		    ((ItemDefinition) this).aString2795
			= class348_sub49.getJStr();
	    } else
		anInt2756 = class348_sub49.getShort();
	    anInt2754++;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("rq.L(" + i + ',' + i_57_ + ','
					     + (class348_sub49 != null
						? "{...}" : "null")
					     + ')'));
	}
    }
    
    final int method1567(int i, int i_70_, int i_71_) {
	anInt2793++;
	if (((ItemDefinition) this).aClass356_2757 == null)
	    return i;
	Class348_Sub35 class348_sub35
	    = ((Class348_Sub35)
	       ((ItemDefinition) this).aClass356_2757.get((long) i_71_));
	if (class348_sub35 == null)
	    return i;
	int i_72_ = 56 % ((-32 - i_70_) / 50);
	return ((Class348_Sub35) class348_sub35).anInt6976;
    }
    
    static final void populate(int[] idest, float[] fdest, int[] isrc, float[] fsrc, int srcX, int srcY, int w, int h, int destX, int destY, int off, int loops) {
	try {
	    anInt2782++;
	    int srcOffset = srcY * w - srcX;
	    int destOffset = destY + h * destX;
	    int widthOff =  w - off;
	    int heightOff = h - off;
	    if (isrc == null) {
		for (int i = 0; i < loops; i++) {
		    int i_88_ = srcOffset + off;
		    while (i_88_ > srcOffset)
			fdest[destOffset++] = fsrc[srcOffset++];
		    srcOffset += widthOff;
		    destOffset += heightOff;
		}
	    } else if (fsrc != null) {
		for (int loop = 0; loops > loop; loop++) {
		    int i_90_ = srcOffset + off;
		    while ((i_90_ ^ 0xffffffff) < (srcOffset ^ 0xffffffff)) {
			idest[destOffset] = isrc[srcOffset];
			fdest[destOffset++] = fsrc[srcOffset++];
		    }
		    srcOffset += widthOff;
		    destOffset += heightOff;
		}
	    } else {
		for (int i = 0; i < loops; i++) {
		    int i_92_ = off + srcOffset;
		    while ((i_92_ ^ 0xffffffff) < (srcOffset ^ 0xffffffff))
			idest[destOffset++] = isrc[srcOffset++];
		    srcOffset += widthOff;
		    destOffset += heightOff;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("rq.C(" + (idest != null ? "{...}" : "null") + ',' + srcY
			+ ',' + srcX + ',' + destX + ','
			+ (fdest != null ? "{...}" : "null") + ','
			+ (isrc != null ? "{...}" : "null") + ',' + off
			+ ',' + loops + ',' + h + ',' + w
			+ ',' + destY + ','
			+ (fsrc != null ? "{...}" : "null") + ')'));
	}
    }
    
    final void method1569(int i, ByteBuffer class348_sub49) {
	try {
	    if (i != 768)
		method1565(true, -71);
	    for (;;) {
		int i_93_ = class348_sub49.getUByte();
		if ((i_93_ ^ 0xffffffff) == -1)
		    break;
		method1566(4, i_93_, class348_sub49);
	    }
	    anInt2800++;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("rq.I(" + i + ','
					     + (class348_sub49 != null
						? "{...}" : "null")
					     + ')'));
	}
    }
    
    final void method1570(int i, ItemDefinition class213_94_,
			  ItemDefinition class213_95_) {
	try {
	    aShortArray2771 = class213_95_.aShortArray2771;
	    aShortArray2785 = class213_95_.aShortArray2785;
	    aByteArray2821 = class213_95_.aByteArray2821;
	    ((ItemDefinition) this).aBoolean2783
		= ((ItemDefinition) class213_94_).aBoolean2783;
	    ((ItemDefinition) this).anInt2787 = ((ItemDefinition) class213_95_).anInt2787;
	    ((ItemDefinition) this).anInt2810 = ((ItemDefinition) class213_95_).anInt2810;
	    anInt2776++;
	    ((ItemDefinition) this).anInt2779 = ((ItemDefinition) class213_95_).anInt2779;
	    aShortArray2801 = class213_95_.aShortArray2801;
	    ((ItemDefinition) this).anInt2781 = ((ItemDefinition) class213_95_).anInt2781;
	    ((ItemDefinition) this).anInt2819 = ((ItemDefinition) class213_94_).anInt2819;
	    ((ItemDefinition) this).anInt2826 = ((ItemDefinition) class213_95_).anInt2826;
	    ((ItemDefinition) this).anInt2820 = i;
	    aShortArray2777 = class213_95_.aShortArray2777;
	    ((ItemDefinition) this).anInt2825 = ((ItemDefinition) class213_95_).anInt2825;
	    ((ItemDefinition) this).aString2795
		= ((ItemDefinition) class213_94_).aString2795;
	    anInt2756 = class213_95_.anInt2756;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("rq.F(" + i + ','
					     + (class213_94_ != null ? "{...}"
						: "null")
					     + ','
					     + (class213_95_ != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    private final void method1571(int i, int[] is, byte i_96_) {
	try {
	    if (i_96_ <= 81)
		anInt2805 = -46;
	    for (int i_97_ = 31; i_97_ > 0; i_97_--) {
		int i_98_ = 36 * i_97_;
		for (int i_99_ = 35; i_99_ > 0; i_99_--) {
		    if (is[i_99_ - -i_98_] == 0
			&& is[i_99_ + i_98_ - 1 + -36] != 0)
			is[i_98_ + i_99_] = i;
		}
	    }
	    anInt2790++;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("rq.M(" + i + ','
					     + (is != null ? "{...}" : "null")
					     + ',' + i_96_ + ')'));
	}
    }
    
    public ItemDefinition() {
	((ItemDefinition) this).anInt2766 = -1;
	anInt2775 = -1;
	anInt2765 = 128;
	((ItemDefinition) this).anInt2778 = -1;
	((ItemDefinition) this).anInt2758 = -1;
	((ItemDefinition) this).aString2795 = "null";
	anInt2794 = 128;
	((ItemDefinition) this).anInt2799 = 0;
	((ItemDefinition) this).anInt2788 = -1;
	((ItemDefinition) this).anInt2784 = 0;
	anInt2804 = -1;
	anInt2792 = -1;
	((ItemDefinition) this).aBoolean2755 = false;
	((ItemDefinition) this).anInt2787 = 0;
	((ItemDefinition) this).anInt2812 = -1;
	((ItemDefinition) this).anInt2810 = 0;
	anInt2767 = -1;
	anInt2760 = -1;
	((ItemDefinition) this).anInt2817 = -1;
	((ItemDefinition) this).anInt2779 = 0;
	anInt2786 = 128;
	anInt2808 = 0;
	anInt2803 = 0;
	anInt2822 = -1;
	((ItemDefinition) this).anInt2815 = -1;
	anInt2823 = 0;
	((ItemDefinition) this).anInt2818 = -1;
	((ItemDefinition) this).anInt2781 = 0;
	((ItemDefinition) this).anInt2774 = -1;
	((ItemDefinition) this).anInt2826 = 0;
	anInt2807 = 0;
	anInt2791 = 0;
	anInt2805 = -1;
	((ItemDefinition) this).anInt2764 = -1;
	((ItemDefinition) this).anInt2820 = 0;
	((ItemDefinition) this).anInt2759 = -1;
	((ItemDefinition) this).anInt2802 = -1;
	anInt2797 = 0;
	((ItemDefinition) this).anInt2830 = -1;
	((ItemDefinition) this).anInt2827 = 0;
	anInt2824 = 0;
	((ItemDefinition) this).anInt2819 = 1;
	anInt2753 = 0;
	((ItemDefinition) this).anInt2825 = 2000;
	((ItemDefinition) this).anInt2833 = -1;
	((ItemDefinition) this).aBoolean2783 = false;
    }
    
    private final int[] method1572(int i, int i_100_, int[] is) {
	try {
	    anInt2829++;
	    if (i_100_ != -1)
		return null;
	    int[] is_101_ = new int[1152];
	    int i_102_ = 0;
	    for (int i_103_ = 0; i_103_ < 32; i_103_++) {
		for (int i_104_ = 0; i_104_ < 36; i_104_++) {
		    int i_105_ = is[i_102_];
		    if (i_105_ == 0) {
			if ((i_104_ ^ 0xffffffff) >= -1
			    || is[i_102_ - 1] == 0) {
			    if ((i_103_ ^ 0xffffffff) < -1
				&& is[-36 + i_102_] != 0)
				i_105_ = i;
			    else if ((i_104_ ^ 0xffffffff) > -36
				     && is[i_102_ + 1] != 0)
				i_105_ = i;
			    else if ((i_103_ ^ 0xffffffff) > -32
				     && is[i_102_ + 36] != 0)
				i_105_ = i;
			} else
			    i_105_ = i;
		    }
		    is_101_[i_102_++] = i_105_;
		}
	    }
	    return is_101_;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("rq.K(" + i + ',' + i_100_ + ','
					     + (is != null ? "{...}" : "null")
					     + ')'));
	}
    }
}
