/* Class318_Sub1_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class318_Sub1_Sub4_Sub1 extends Class318_Sub1_Sub4
    implements Interface10
{
    private byte aByte10062;
    static int anInt10063;
    private boolean aBoolean10064;
    static int anInt10065;
    private boolean aBoolean10066;
    static int anInt10067;
    static int anInt10068;
    static int anInt10069;
    static int anInt10070;
    AnimatableToolkit aClass64_10071;
    static int anInt10072;
    static int anInt10073;
    static int anInt10074;
    static int anInt10075;
    private boolean aBoolean10076;
    static int anInt10077;
    static int anInt10078;
    private byte aByte10079;
    static int anInt10080;
    private short aShort10081;
    private Class30 aClass30_10082;
    static int anInt10083;
    static int anInt10084;
    static int anInt10085;
    static int anInt10086;
    static int anInt10087;
    static int anInt10088;
    static int anInt10089;
    private boolean aBoolean10090;
    static int anInt10091;
    static int anInt10092;
    static int anInt10093;
    private r aR10094;
    
    Class318_Sub1_Sub4_Sub1(AbstractToolkit var_ha, ObjectDefinition class51, int i, int i_0_,
			    int i_1_, int i_2_, int i_3_, boolean bool,
			    int i_4_, int i_5_, boolean bool_6_) {
	super(i_1_, i_2_, i_3_, i, i_0_,
	      Class286_Sub9.method2175(i_5_, (byte) -34, i_4_));
	do {
	    try {
		aShort10081 = (short) ((ObjectDefinition) class51).anInt941;
		aBoolean10066 = bool;
		aBoolean10090 = bool_6_;
		((Class318_Sub1) this).anInt6377 = i_1_;
		aBoolean10076
		    = ((((ObjectDefinition) class51).anInt874 ^ 0xffffffff) != -1
		       && !bool);
		((Class318_Sub1) this).anInt6388 = i_3_;
		aByte10079 = (byte) i_4_;
		aByte10062 = (byte) i_5_;
		aBoolean10064
		    = (var_ha.method3682() && ((ObjectDefinition) class51).aBoolean894
		       && !aBoolean10066
		       && ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub7_7238.method1748(-32350) != 0);
		int i_7_ = 2048;
		if (aBoolean10090)
		    i_7_ |= 0x10000;
		Class2 class2 = method2481(aBoolean10064, i_7_, -4, var_ha);
		if (class2 == null)
		    break;
		aR10094 = ((Class2) class2).aR118;
		((Class318_Sub1_Sub4_Sub1) this).aClass64_10071
		    = ((Class2) class2).aClass64_119;
		if (!aBoolean10090)
		    break;
		((Class318_Sub1_Sub4_Sub1) this).aClass64_10071
		    = ((Class318_Sub1_Sub4_Sub1) this).aClass64_10071
			  .method614((byte) 0, i_7_, false);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929
			  (runtimeexception,
			   ("ge.<init>(" + (var_ha != null ? "{...}" : "null")
			    + ',' + (class51 != null ? "{...}" : "null") + ','
			    + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ','
			    + i_3_ + ',' + bool + ',' + i_4_ + ',' + i_5_ + ','
			    + bool_6_ + ')'));
	    }
	    break;
	} while (false);
    }
    
    public final int method39(int i) {
	anInt10080++;
	int i_8_ = 69 % ((i - -91) / 35);
	return aByte10079;
    }
    
    public final void method40(int i) {
	anInt10077++;
	if (((Class318_Sub1_Sub4_Sub1) this).aClass64_10071 != null)
	    ((Class318_Sub1_Sub4_Sub1) this).aClass64_10071.method612();
	if (i != -12031)
	    method38(-122);
    }
    
    final boolean method2391(AbstractToolkit var_ha, int i, int i_9_, int i_10_) {
	anInt10070++;
	AnimatableToolkit class64 = method2482(var_ha, (byte) 126, 131072);
	if (i_10_ != 0)
	    method41(-96);
	if (class64 != null) {
	    Class101 class101 = var_ha.method3705();
	    class101.method894(((Class318_Sub1) this).anInt6377,
			       ((Class318_Sub1) this).anInt6382,
			       ((Class318_Sub1) this).anInt6388);
	    if (Class305.aBoolean3870)
		return class64.method623(i_9_, i, class101, false, 0,
					 Class132.anInt1906);
	    return class64.method628(i_9_, i, class101, false, 0);
	}
	return false;
    }
    
    final void method2387(AbstractToolkit var_ha, int i) {
	if (i > -125)
	    method42(115);
	anInt10067++;
    }
    
    public final int method41(int i) {
	anInt10087++;
	if (i != -32228)
	    return 1;
	return aByte10062;
    }
    
    final void method2392(boolean bool) {
	anInt10091++;
	if (bool != true)
	    method2394(true);
	aBoolean10090 = false;
	if (((Class318_Sub1_Sub4_Sub1) this).aClass64_10071 != null)
	    ((Class318_Sub1_Sub4_Sub1) this).aClass64_10071.s
		(((Class318_Sub1_Sub4_Sub1) this).aClass64_10071.ua()
		 & ~0x10000);
    }
    
    final Class30 method2381(AbstractToolkit var_ha, int i) {
	anInt10075++;
	if (aClass30_10082 == null)
	    aClass30_10082 = (Class348_Sub23_Sub1.method2967
			      (((Class318_Sub1) this).anInt6377,
			       method2482(var_ha, (byte) 117, 0),
			       ((Class318_Sub1) this).anInt6388,
			       ((Class318_Sub1) this).anInt6382, i + -5));
	if (i != 7)
	    aBoolean10066 = false;
	return aClass30_10082;
    }
    
    public final int method42(int i) {
	anInt10088++;
	if (i > -62)
	    return -96;
	return aShort10081 & 0xffff;
    }
    
    final int method2379(int i) {
	anInt10063++;
	if (i != -25675)
	    aByte10079 = (byte) 53;
	if (((Class318_Sub1_Sub4_Sub1) this).aClass64_10071 != null)
	    return ((Class318_Sub1_Sub4_Sub1) this).aClass64_10071.ma();
	return 0;
    }
    
    public final boolean method38(int i) {
	anInt10078++;
	if (i != -18443)
	    aShort10081 = (short) 37;
	return aBoolean10064;
    }
    
    final void method2380(AbstractToolkit var_ha, int i, boolean bool,
			  Class318_Sub1 class318_sub1, int i_11_, byte i_12_,
			  int i_13_) {
	try {
	    if (i_12_ > -106)
		method2388(-102);
	    if (class318_sub1 instanceof Class318_Sub1_Sub4_Sub1) {
		Class318_Sub1_Sub4_Sub1 class318_sub1_sub4_sub1_14_
		    = (Class318_Sub1_Sub4_Sub1) class318_sub1;
		if (((Class318_Sub1_Sub4_Sub1) this).aClass64_10071 != null
		    && (((Class318_Sub1_Sub4_Sub1) class318_sub1_sub4_sub1_14_)
			.aClass64_10071) != null)
		    ((Class318_Sub1_Sub4_Sub1) this).aClass64_10071.method613
			(((Class318_Sub1_Sub4_Sub1)
			  class318_sub1_sub4_sub1_14_).aClass64_10071,
			 i_13_, i, i_11_, bool);
	    } else if (class318_sub1 instanceof Class318_Sub1_Sub3_Sub1) {
		Class318_Sub1_Sub3_Sub1 class318_sub1_sub3_sub1
		    = (Class318_Sub1_Sub3_Sub1) class318_sub1;
		if (((Class318_Sub1_Sub4_Sub1) this).aClass64_10071 != null
		    && (((Class318_Sub1_Sub3_Sub1) class318_sub1_sub3_sub1)
			.aClass64_10028) != null)
		    ((Class318_Sub1_Sub4_Sub1) this).aClass64_10071.method613
			((((Class318_Sub1_Sub3_Sub1) class318_sub1_sub3_sub1)
			  .aClass64_10028),
			 i_13_, i, i_11_, bool);
	    }
	    anInt10083++;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ge.N("
					     + (var_ha != null ? "{...}"
						: "null")
					     + ',' + i + ',' + bool + ','
					     + (class318_sub1 != null ? "{...}"
						: "null")
					     + ',' + i_11_ + ',' + i_12_ + ','
					     + i_13_ + ')'));
	}
    }
    
    public final void method44(int i, AbstractToolkit var_ha) {
	anInt10092++;
	Object object = null;
	r var_r;
	if (aR10094 == null && aBoolean10064) {
	    Class2 class2 = method2481(true, 262144, -4, var_ha);
	    var_r = class2 == null ? null : ((Class2) class2).aR118;
	} else {
	    var_r = aR10094;
	    aR10094 = null;
	}
	if (var_r != null)
	    Class130.method1130(var_r, ((Class318_Sub1) this).aByte6376,
				((Class318_Sub1) this).anInt6377,
				((Class318_Sub1) this).anInt6388, null);
	if (i != 836)
	    aR10094 = null;
    }
    
    private final Class2 method2481(boolean bool, int i, int i_15_,
				    AbstractToolkit var_ha) {
	if (i_15_ != -4)
	    aClass30_10082 = null;
	anInt10086++;
	ObjectDefinition class51 = Class348_Sub40_Sub12.objectLoader
			      .getObject(0, aShort10081 & 0xffff);
	s var_s;
	s var_s_16_;
	if (!aBoolean10066) {
	    var_s_16_ = (Class348_Sub1_Sub1.aSArray8801
			 [((Class318_Sub1) this).aByte6376]);
	    if ((((Class318_Sub1) this).aByte6376 ^ 0xffffffff) > -4)
		var_s = (Class348_Sub1_Sub1.aSArray8801
			 [1 + ((Class318_Sub1) this).aByte6376]);
	    else
		var_s = null;
	} else {
	    var_s = Class348_Sub1_Sub1.aSArray8801[0];
	    var_s_16_ = Class332.aSArray4142[((Class318_Sub1) this).aByte6376];
	}
	return class51.method476(var_ha, var_s, aByte10079, i,
				 ((Class318_Sub1) this).anInt6377, bool,
				 var_s_16_, ((Class318_Sub1) this).anInt6382,
				 ((Class318_Sub1) this).anInt6388, aByte10062,
				 i_15_ + 132);
    }
    
    final Class318_Sub4 method2386(int i, AbstractToolkit var_ha) {
	anInt10069++;
	if (((Class318_Sub1_Sub4_Sub1) this).aClass64_10071 == null)
	    return null;
	Class101 class101 = var_ha.method3705();
	class101.method894(((Class318_Sub1) this).anInt6377,
			   ((Class318_Sub1) this).anInt6382,
			   ((Class318_Sub1) this).anInt6388);
	Class318_Sub4 class318_sub4
	    = DummyOutputstream.method136(i, aBoolean10076, false);
	if (!Class305.aBoolean3870)
	    ((Class318_Sub1_Sub4_Sub1) this).aClass64_10071.method615
		(class101,
		 ((Class318_Sub4) class318_sub4).aClass318_Sub3Array6414[0],
		 0);
	else
	    ((Class318_Sub1_Sub4_Sub1) this).aClass64_10071.method608
		(class101,
		 ((Class318_Sub4) class318_sub4).aClass318_Sub3Array6414[0],
		 Class132.anInt1906, 0);
	return class318_sub4;
    }
    
    private final AnimatableToolkit method2482(AbstractToolkit var_ha, byte i, int i_17_) {
	if (i <= 113)
	    method2387(null, -99);
	anInt10072++;
	if (((Class318_Sub1_Sub4_Sub1) this).aClass64_10071 != null
	    && (var_ha.method3667(((Class318_Sub1_Sub4_Sub1) this)
				      .aClass64_10071.ua(),
				  i_17_)
		^ 0xffffffff) == -1)
	    return ((Class318_Sub1_Sub4_Sub1) this).aClass64_10071;
	Class2 class2 = method2481(false, i_17_, -4, var_ha);
	if (class2 != null)
	    return ((Class2) class2).aClass64_119;
	return null;
    }
    
    final int method2394(boolean bool) {
	anInt10093++;
	if (bool != true)
	    aByte10062 = (byte) -75;
	if (((Class318_Sub1_Sub4_Sub1) this).aClass64_10071 == null)
	    return 0;
	return ((Class318_Sub1_Sub4_Sub1) this).aClass64_10071.fa();
    }
    
    final boolean method2388(int i) {
	anInt10089++;
	if (i > -65)
	    return true;
	return aBoolean10090;
    }
    
    final boolean method2377(byte i) {
	anInt10065++;
	if (i != 122)
	    return true;
	if (((Class318_Sub1_Sub4_Sub1) this).aClass64_10071 == null)
	    return false;
	return ((Class318_Sub1_Sub4_Sub1) this).aClass64_10071.F();
    }
    
    final boolean method2376(int i) {
	if (i >= -12)
	    method2388(-68);
	anInt10085++;
	if (((Class318_Sub1_Sub4_Sub1) this).aClass64_10071 != null) {
	    if (((Class318_Sub1_Sub4_Sub1) this).aClass64_10071.r())
		return false;
	    return true;
	}
	return true;
    }
    
    public final void method43(AbstractToolkit var_ha, int i) {
	if (i != -14218)
	    aClass30_10082 = null;
	anInt10068++;
	Object object = null;
	r var_r;
	if (aR10094 == null && aBoolean10064) {
	    Class2 class2 = method2481(true, 262144, -4, var_ha);
	    var_r = class2 == null ? null : ((Class2) class2).aR118;
	} else {
	    var_r = aR10094;
	    aR10094 = null;
	}
	if (var_r != null)
	    Class169.method1301(var_r, ((Class318_Sub1) this).aByte6376,
				((Class318_Sub1) this).anInt6377,
				((Class318_Sub1) this).anInt6388, null);
    }
}
