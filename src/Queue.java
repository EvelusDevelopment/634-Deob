/* Queue - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Queue
{
    static int anInt1642;
    static int anInt1643;
    static int anInt1644;
    static int anInt1645 = -2;
    static int anInt1646;
    SubNode parent = new SubNode();
    static int anInt1648;
    static int anInt1649;
    static int[] anIntArray1650 = new int[1000];
    static int anInt1651;
    private SubNode iterator;
    static int anInt1653;
    static int anInt1654;
    static int anInt1655;
    
    final int getSize() {
	anInt1643++;
	int i_0_ = 0;
	for (SubNode class348_sub42 = (((SubNode) ((Queue) this).parent).subnodeParent); ((Queue) this).parent != class348_sub42; class348_sub42 = ((SubNode) class348_sub42).subnodeParent)
	    i_0_++;
	return i_0_;
    }
    
    final SubNode next() {
	anInt1644++;
	SubNode class348_sub42 = iterator;
	if (class348_sub42 == ((Queue) this).parent) {
	    iterator = null;
	    return null;
	}
	iterator = ((SubNode) class348_sub42).subnodeParent;
	return class348_sub42;
    }
    
    public static void method1004(byte i) {
	anIntArray1650 = null;
    }
    
    final void add(SubNode node) {
	if (((SubNode) node).subnodeChild != null)
	    node.removeSubnode();
	anInt1654++;
	((SubNode) node).subnodeParent = ((Queue) this).parent;
	((SubNode) node).subnodeChild = (((SubNode) ((Queue) this).parent).subnodeChild);
	((SubNode) (((SubNode) node).subnodeChild)).subnodeParent = node;
	((SubNode) (((SubNode) node).subnodeParent)).subnodeChild = node;
    }
    
    static final void method1006(boolean bool, byte i) {
	anInt1655++;
	if (bool) {
	    if (r.anInt9721 != -1)
		Class14.method235(r.anInt9721, (byte) -108);
	    for (Class348_Sub41 class348_sub41
		     = (Class348_Sub41) Class125.aClass356_4915.method3484(0);
		 class348_sub41 != null;
		 class348_sub41 = ((Class348_Sub41)
				   Class125.aClass356_4915.method3482(0))) {
		if (!class348_sub41.method2712((byte) 4)) {
		    class348_sub41 = ((Class348_Sub41)
				      Class125.aClass356_4915.method3484(0));
		    if (class348_sub41 == null)
			break;
		}
		Class127_Sub1.method1118(true, false, class348_sub41, 2533);
	    }
	    r.anInt9721 = -1;
	    Class125.aClass356_4915 = new HashTable(8);
	    Class99.method882((byte) 11);
	    r.anInt9721 = Class54.anInt970;
	    Class239.method1713(false, 520);
	    Class354.method3466(-119);
	    ScriptExecutor.method703(r.anInt9721);
	}
	Class223.aBoolean2895 = true;
	if (i < 49)
	    anInt1651 = 10;
    }
    
    static final void method1007(Widget class46, AbstractToolkit var_ha, int i, int i_1_,
				 int i_2_) {
	try {
	    anInt1648++;
	    aa var_aa = class46.method425(var_ha, (byte) 40);
	    if (var_aa != null) {
		if (i_2_ != 22960)
		    anIntArray1650 = null;
		var_ha.setDimensions(i, i_1_, i + ((Widget) class46).anInt709,
			  ((Widget) class46).anInt789 + i_1_);
		if ((IntegerVarScriptSettingLoader.anInt3306 ^ 0xffffffff) != -3
		    && IntegerVarScriptSettingLoader.anInt3306 != 5
		    && Class108.aClass105_1664 != null) {
		    int i_3_;
		    int i_4_;
		    int i_5_;
		    int i_6_;
		    if (Class348_Sub40_Sub21.anInt9282 != 4) {
			i_5_ = 4096 - 16 * FloatBuffer.anInt9750;
			i_3_ = (((Class318_Sub1)
				 Class132.localPlayer)
				.anInt6388);
			i_6_ = ((int) -AbtractArchiveLoader.aFloat3938 - -r_Sub2.anInt10483
				& 0x3fff);
			i_4_ = (((Class318_Sub1)
				 Class132.localPlayer)
				.anInt6377);
		    } else {
			i_3_ = Class348_Sub7.anInt6652;
			i_4_ = Class348_Sub6.anInt6633;
			i_5_ = 4096;
			i_6_ = 0x3fff & (int) -AbtractArchiveLoader.aFloat3938;
		    }
		    int i_7_ = 48 - (-(i_4_ / 128)
				     - -(Class367_Sub4.anInt7319 * 2)) - -208;
		    int i_8_
			= (208 - (Class348_Sub40_Sub3.anInt9109 * 2 - 48)
			   + 4 * Class348_Sub40_Sub3.anInt9109 - i_3_ / 128);
		    Class108.aClass105_1664.method967
			(((float) ((Widget) class46).anInt709 / 2.0F
			  + (float) i),
			 ((float) ((Widget) class46).anInt789 / 2.0F
			  + (float) i_1_),
			 (float) i_7_, (float) i_8_, i_5_, i_6_ << 2110355138,
			 var_aa, i, i_1_);
		    for (Class348_Sub35 class348_sub35
			     = (Class348_Sub35) Class318_Sub1_Sub5_Sub1
						    .aClass262_10125
						    .getFirst(i_2_ ^ 0x59b4);
			 class348_sub35 != null;
			 class348_sub35
			     = (Class348_Sub35) Class318_Sub1_Sub5_Sub1
						    .aClass262_10125
						    .nextForward((byte) 92)) {
			int i_9_ = ((Class348_Sub35) class348_sub35).anInt6976;
			int i_10_ = (-za_Sub2.anInt9780
				     + ((0xfffe5b0
					 & (((Class252) r_Sub2.aClass252_10488)
					    .anIntArray3238[i_9_]))
					>> -1329227730));
			int i_11_
			    = (-Class90.anInt1517
			       + (0x3fff & (((Class252) r_Sub2.aClass252_10488)
					    .anIntArray3238[i_9_])));
			int i_12_ = -(i_4_ / 128) + 2 + 4 * i_10_;
			int i_13_ = 2 + (4 * i_11_ - i_3_ / 128);
			Class318_Sub1.method2385(class46, i_1_, var_aa,
						 (((Class252)
						   r_Sub2.aClass252_10488)
						  .anIntArray3239[i_9_]),
						 i_12_, i, (byte) -94, i_13_,
						 var_ha);
		    }
		    for (int i_14_ = 0;
			 ((i_14_ ^ 0xffffffff)
			  > (Class348_Sub40_Sub38.anInt9479 ^ 0xffffffff));
			 i_14_++) {
			int i_15_ = (Class348_Sub15.anIntArray6770[i_14_] * 4
				     - -2 - i_4_ / 128);
			int i_16_
			    = (-(i_3_ / 128)
			       + Class348_Sub40_Sub37.anIntArray9458[i_14_] * 4
			       - -2);
			ObjectDefinition class51
			    = (Class348_Sub40_Sub12.objectLoader.getObject
			       (0, ObjectLoader.anIntArray3347[i_14_]));
			if (((ObjectDefinition) class51).anIntArray945 != null) {
			    class51
				= class51.method480((Class318_Sub1_Sub3_Sub3
						     .varbitHandler),
						    (byte) 47);
			    if (class51 == null
				|| ((((ObjectDefinition) class51).anInt921 ^ 0xffffffff)
				    == 0))
				continue;
			}
			Class318_Sub1.method2385(class46, i_1_, var_aa,
						 ((ObjectDefinition) class51).anInt921,
						 i_15_, i, (byte) -113, i_16_,
						 var_ha);
		    }
		    for (Class348_Sub37 class348_sub37
			     = (Class348_Sub37) Class130.aClass356_1895
						    .method3484(i_2_ ^ 0x59b0);
			 class348_sub37 != null;
			 class348_sub37
			     = ((Class348_Sub37)
				Class130.aClass356_1895.method3482(0))) {
			int i_17_ = (int) (0x3L & (((Node) class348_sub37)
						   .nodeKey) >> 1012614876);
			if (Class334.anInt4155 == i_17_) {
			    int i_18_ = (-za_Sub2.anInt9780
					 + (int) ((((Node) class348_sub37)
						   .nodeKey)
						  & 0x3fffL));
			    int i_19_ = (-Class90.anInt1517
					 + (int) ((((Node) class348_sub37)
						   .nodeKey) >> -1442950322
						  & 0x3fffL));
			    int i_20_ = -(i_4_ / 128) + (2 + i_18_ * 4);
			    int i_21_ = -(i_3_ / 128) + (2 + i_19_ * 4);
			    Class151.method1211(i_1_,
						(Class348_Sub12
						 .aClass105Array6742[0]),
						i, class46, var_aa, i_21_,
						i_2_ ^ 0x59b2, i_20_);
			}
		    }
		    for (int i_22_ = 0; ((Class150.anInt2057 ^ 0xffffffff)
					 < (i_22_ ^ 0xffffffff)); i_22_++) {
			Class348_Sub22 class348_sub22
			    = ((Class348_Sub22)
			       (Class282.aClass356_3654.get
				((long) Class74.anIntArray1233[i_22_])));
			if (class348_sub22 != null) {
			    Npc class318_sub1_sub3_sub3_sub1
				= (((Class348_Sub22) class348_sub22)
				   .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
			    if (class318_sub1_sub3_sub3_sub1
				    .method2445((byte) -126)
				&& (((((Class318_Sub1)
				       (Class132
					.localPlayer))
				      .aByte6381)
				     ^ 0xffffffff)
				    == ((((Class318_Sub1)
					  class318_sub1_sub3_sub3_sub1)
					 .aByte6381)
					^ 0xffffffff))) {
				NpcDefinition class79
				    = (((Npc)
					class318_sub1_sub3_sub3_sub1)
				       .definition);
				if (class79 != null
				    && (((NpcDefinition) class79).anIntArray1377
					!= null))
				    class79 = (class79.method794
					       ((Class318_Sub1_Sub3_Sub3
						 .varbitHandler),
						-1));
				if (class79 != null
				    && ((NpcDefinition) class79).aBoolean1397
				    && ((NpcDefinition) class79).aBoolean1396) {
				    int i_23_
					= (-(i_4_ / 128)
					   + (((Class318_Sub1)
					       class318_sub1_sub3_sub3_sub1)
					      .anInt6377) / 128);
				    int i_24_
					= ((((Class318_Sub1)
					     class318_sub1_sub3_sub3_sub1)
					    .anInt6388) / 128
					   + -(i_3_ / 128));
				    if ((((NpcDefinition) class79).anInt1383
					 ^ 0xffffffff)
					!= 0)
					Class318_Sub1.method2385
					    (class46, i_1_, var_aa,
					     ((NpcDefinition) class79).anInt1383,
					     i_23_, i, (byte) -73, i_24_,
					     var_ha);
				    else
					Class151.method1211
					    (i_1_,
					     (Class348_Sub12.aClass105Array6742
					      [1]),
					     i, class46, var_aa, i_24_, 2,
					     i_23_);
				}
			    }
			}
		    }
		    int i_25_ = Class328_Sub1.anInt6513;
		    int[] is = Class286_Sub7.anIntArray6290;
		    for (int i_26_ = 0;
			 (i_25_ ^ 0xffffffff) < (i_26_ ^ 0xffffffff);
			 i_26_++) {
			Player class318_sub1_sub3_sub3_sub2
			    = (ClassicLoadingScreen.players
			       [is[i_26_]]);
			if (class318_sub1_sub3_sub3_sub2 != null
			    && class318_sub1_sub3_sub3_sub2
				   .method2457((byte) 37)
			    && !((Player)
				 class318_sub1_sub3_sub3_sub2).aBoolean10551
			    && (Class132.localPlayer
				!= class318_sub1_sub3_sub3_sub2)
			    && (((((Class318_Sub1)
				   Class132.localPlayer)
				  .aByte6381)
				 ^ 0xffffffff)
				== (((Class318_Sub1)
				     class318_sub1_sub3_sub3_sub2).aByte6381
				    ^ 0xffffffff))) {
			    int i_27_ = (-(i_4_ / 128)
					 + (((Class318_Sub1)
					     class318_sub1_sub3_sub3_sub2)
					    .anInt6377) / 128);
			    int i_28_ = (-(i_3_ / 128)
					 + (((Class318_Sub1)
					     class318_sub1_sub3_sub3_sub2)
					    .anInt6388) / 128);
			    boolean bool = false;
			    for (int i_29_ = 0;
				 ((i_29_ ^ 0xffffffff)
				  > (Class348_Sub40_Sub30.anInt9383
				     ^ 0xffffffff));
				 i_29_++) {
				if ((((Player)
				      class318_sub1_sub3_sub3_sub2)
					 .aString10544.equals
				     (Class83.aStringArray1441[i_29_]))
				    && ((AbstractToolkit.anIntArray4578[i_29_] ^ 0xffffffff)
					!= -1)) {
				    bool = true;
				    break;
				}
			    }
			    boolean bool_30_ = false;
			    for (int i_31_ = 0; Class37.anInt496 > i_31_;
				 i_31_++) {
				if (((Player)
				     class318_sub1_sub3_sub3_sub2)
					.aString10544.equals
				    (((Class19) (Class169.aClass19Array2261
						 [i_31_])).aString306)) {
				    bool_30_ = true;
				    break;
				}
			    }
			    boolean bool_32_ = false;
			    if ((((Player)
				  Class132.localPlayer)
				 .anInt10542) != 0
				&& (((Player)
				     class318_sub1_sub3_sub3_sub2).anInt10542
				    != 0)
				&& (((Player)
				     class318_sub1_sub3_sub3_sub2).anInt10542
				    == (((Player)
					 (Class132
					  .localPlayer))
					.anInt10542)))
				bool_32_ = true;
			    if (!((Player)
				  class318_sub1_sub3_sub3_sub2)
				 .aBoolean10554) {
				if (!bool) {
				    if (bool_30_)
					Class151.method1211
					    (i_1_,
					     (Class348_Sub12.aClass105Array6742
					      [5]),
					     i, class46, var_aa, i_28_,
					     i_2_ + -22958, i_27_);
				    else if (!bool_32_)
					Class151.method1211
					    (i_1_,
					     (Class348_Sub12.aClass105Array6742
					      [2]),
					     i, class46, var_aa, i_28_, 2,
					     i_27_);
				    else
					Class151.method1211
					    (i_1_,
					     (Class348_Sub12.aClass105Array6742
					      [4]),
					     i, class46, var_aa, i_28_, 2,
					     i_27_);
				} else
				    Class151.method1211(i_1_,
							(Class348_Sub12
							 .aClass105Array6742
							 [3]),
							i, class46, var_aa,
							i_28_, 2, i_27_);
			    } else
				Class151.method1211(i_1_,
						    (Class348_Sub12
						     .aClass105Array6742[6]),
						    i, class46, var_aa, i_28_,
						    i_2_ + -22958, i_27_);
			}
		    }
		    Class302[] class302s = Class348_Sub27.aClass302Array6897;
		    for (int i_33_ = 0; ((class302s.length ^ 0xffffffff)
					 < (i_33_ ^ 0xffffffff)); i_33_++) {
			Class302 class302 = class302s[i_33_];
			if (class302 != null
			    && ((((Class302) class302).anInt3840 ^ 0xffffffff)
				!= -1)
			    && Class367_Sub11.logicCycle % 20 < 10) {
			    if ((((Class302) class302).anInt3840 ^ 0xffffffff)
				== -2) {
				Class348_Sub22 class348_sub22
				    = ((Class348_Sub22)
				       (Class282.aClass356_3654.get
					((long) (((Class302) class302)
						 .anInt3833))));
				if (class348_sub22 != null) {
				    Npc class318_sub1_sub3_sub3_sub1
					= (((Class348_Sub22) class348_sub22)
					   .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
				    int i_34_
					= (-(i_4_ / 128)
					   + (((Class318_Sub1)
					       class318_sub1_sub3_sub3_sub1)
					      .anInt6377) / 128);
				    int i_35_
					= (-(i_3_ / 128)
					   + (((Class318_Sub1)
					       class318_sub1_sub3_sub3_sub1)
					      .anInt6388) / 128);
				    GametipDefinition.method2181(360000L, i_1_, -125,
							i_35_, i, class46,
							i_34_,
							(((Class302) class302)
							 .anInt3831),
							var_aa);
				}
			    }
			    if ((((Class302) class302).anInt3840 ^ 0xffffffff)
				== -3) {
				int i_36_ = (-(i_4_ / 128)
					     + (((Class302) class302).anInt3835
						/ 128));
				int i_37_ = (-(i_3_ / 128)
					     + (((Class302) class302).anInt3832
						/ 128));
				long l
				    = (long) (((Class302) class302).anInt3837
					      << -660810585);
				l *= l;
				GametipDefinition.method2181(l, i_1_, -112, i_37_, i,
						    class46, i_36_,
						    (((Class302) class302)
						     .anInt3831),
						    var_aa);
			    }
			    if (((((Class302) class302).anInt3840 ^ 0xffffffff)
				 == -11)
				&& (((Class302) class302).anInt3833
				    ^ 0xffffffff) <= -1
				&& (((ClassicLoadingScreen
				      .players).length
				     ^ 0xffffffff)
				    < (((Class302) class302).anInt3833
				       ^ 0xffffffff))) {
				Player class318_sub1_sub3_sub3_sub2
				    = (ClassicLoadingScreen
				       .players
				       [((Class302) class302).anInt3833]);
				if (class318_sub1_sub3_sub3_sub2 != null) {
				    int i_38_
					= (-(i_4_ / 128)
					   + (((Class318_Sub1)
					       class318_sub1_sub3_sub3_sub2)
					      .anInt6377) / 128);
				    int i_39_
					= (-(i_3_ / 128)
					   + (((Class318_Sub1)
					       class318_sub1_sub3_sub3_sub2)
					      .anInt6388) / 128);
				    GametipDefinition.method2181(360000L, i_1_, -121,
							i_39_, i, class46,
							i_38_,
							(((Class302) class302)
							 .anInt3831),
							var_aa);
				}
			    }
			}
		    }
		    if (Class348_Sub40_Sub21.anInt9282 != 4) {
			if ((OndemandWorker.anInt3203 ^ 0xffffffff) != -1) {
			    int i_40_
				= (-(i_4_ / 128) + (OndemandWorker.anInt3203 * 4 + 2)
				   - (-(2
					* Class132
					      .localPlayer
					      .method2436((byte) 77))
				      - -2));
			    int i_41_
				= (4 * Class97.anInt1548 - (-2 + i_3_ / 128)
				   + (2
				      * (Class132
					     .localPlayer
					     .method2436((byte) 59)
					 - 1)));
			    Class151.method1211(i_1_,
						(Class25.aClass105Array367
						 [(!Class348_Sub13.aBoolean6759
						   ? 0 : 1)]),
						i, class46, var_aa, i_41_, 2,
						i_40_);
			}
			if (!((Player)
			      Class132.localPlayer)
			     .aBoolean10551)
			    var_ha.method3675(3, (byte) -125,
					      -1 + (i - -((((Widget) class46)
							   .anInt709)
							  / 2)),
					      -1 + ((((Widget) class46)
						     .anInt789) / 2
						    + i_1_),
					      3, -1);
		    }
		} else
		    var_ha.A(-16777216, var_aa, i, i_1_);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("mn.F("
					     + (class46 != null ? "{...}"
						: "null")
					     + ','
					     + (var_ha != null ? "{...}"
						: "null")
					     + ',' + i + ',' + i_1_ + ','
					     + i_2_ + ')'));
	}
    }
    
    final SubNode removeFirst() {
	anInt1653++;
	SubNode request = (((SubNode) ((Queue) this).parent).subnodeParent);
	if (request == ((Queue) this).parent)
	    return null;
	request.removeSubnode();
	return request;
    }
    
    final void removeAll() {
	anInt1646++;
        for (;;) {
            SubNode class348_sub42
                = (((SubNode)
                    ((Queue) this).parent)
                   .subnodeParent);
            if (((Queue) this).parent == class348_sub42)
                break;
            class348_sub42.removeSubnode();
        }
        iterator = null;
    }
    
    static final void method1010(boolean bool, boolean bool_42_) {
	r.aClass101_9720.method898(Class21.aHa326.method3640());
	anInt1642++;
	int[] is = Class21.aHa326.Y();
	Class14_Sub3.anInt8630 = is[2];
	OndemandWorker.anInt3202 = is[0];
	Class27.anInt394 = is[3];
	Class239_Sub5.anInt5886 = is[1];
	if (!bool_42_) {
	    Class21.aHa326.DA(Class120.anInt4910, Class328_Sub1_Sub1.anInt8799,
			      Class286_Sub5.anInt6255,
			      OutputStream_Sub1.anInt95);
	    r.method3284(true, Class14_Sub2.aDouble8621);
	} else {
	    Class21.aHa326.DA(Class94.anInt1537, Class318_Sub5.anInt6417,
			      Class193.anInt2590, Class129.anInt1879);
	    r.method3284(true, Class318_Sub1_Sub5_Sub1.aDouble10120);
	}
	if (bool != false)
	    method1010(true, true);
    }
    
    final SubNode getFirst() {
	anInt1649++;
	SubNode class348_sub42
	    = (((SubNode) ((Queue) this).parent)
	       .subnodeParent);
	if (class348_sub42 == ((Queue) this).parent) {
	    iterator = null;
	    return null;
	}
	iterator = ((SubNode) class348_sub42).subnodeParent;
	return class348_sub42;
    }
    
    public Queue() {
	((SubNode) ((Queue) this).parent).subnodeChild  = ((Queue) this).parent;
	((SubNode) ((Queue) this).parent).subnodeParent = ((Queue) this).parent;
    }
}
