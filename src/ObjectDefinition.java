/* ObjectDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ObjectDefinition
{
    static int anInt866;
    static int anInt867;
    int anInt868 = -1;
    int anInt869;
    static int anInt870;
    static int anInt871;
    private byte[] aByteArray872;
    private int anInt873;
    int anInt874;
    int anInt875;
    boolean aBoolean876 = false;
    int anInt877;
    int anInt878;
    private byte aByte879;
    private int anInt880;
    private HashTable aClass356_881;
    private int anInt882;
    int anInt883;
    String aString884;
    private byte[] aByteArray885;
    private byte aByte886;
    int anInt887;
    boolean aBoolean888;
    int anInt889;
    private int anInt890;
    static int anInt891;
    private short[] aShortArray892;
    private int anInt893;
    boolean aBoolean894;
    int anInt895;
    boolean aBoolean896;
    static LoadingHandler loadingHandler;
    static int anInt898;
    static int anInt899;
    private int anInt900;
    static int anInt901;
    boolean aBoolean902;
    boolean aBoolean903;
    int[] anIntArray904;
    static Class101 aClass101_905;
    boolean aBoolean906;
    private int[][] anIntArrayArray907;
    private short[] aShortArray908;
    int anInt909;
    static int anInt910;
    private int anInt911;
    boolean aBoolean912;
    String[] aStringArray913;
    int anInt914;
    private int anInt915;
    int anInt916;
    int[] anIntArray917;
    boolean aBoolean918;
    private short[] aShortArray919;
    int anInt920;
    int anInt921;
    private byte aByte922;
    int anInt923;
    boolean aBoolean924;
    boolean aBoolean925;
    int anInt926;
    static int anInt927;
    private int anInt928;
    boolean aBoolean929;
    int anInt930;
    boolean aBoolean931;
    static String[] aStringArray932 = new String[100];
    ObjectLoader aClass263_933;
    private int anInt934;
    private int anInt935;
    int anInt936;
    int anInt937;
    static int anInt938;
    private int anInt939;
    private short[] aShortArray940;
    int anInt941;
    boolean aBoolean942;
    int[] anIntArray943;
    private byte aByte944;
    int[] anIntArray945;
    private int anInt946;
    boolean aBoolean947;
    static int anInt948;
    private int anInt949;
    int anInt950;
    int anInt951;
    private byte aByte952;
    int anInt953;
    private int anInt954;
    int anInt955;
    static int anInt956;
    static int anInt957;
    static int anInt958;
    private int[] anIntArray959;
    static int anInt960;
    int anInt961;
    int anInt962;
    
    final boolean method474(byte i) {
	anInt891++;
	if (((ObjectDefinition) this).anIntArray945 == null) {
	    if (((ObjectDefinition) this).anInt887 == -1
		&& ((ObjectDefinition) this).anIntArray904 == null)
		return false;
	    return true;
	}
	for (int i_0_ = 0; i_0_ < ((ObjectDefinition) this).anIntArray945.length;
	     i_0_++) {
	    if ((((ObjectDefinition) this).anIntArray945[i_0_] ^ 0xffffffff) != 0) {
		ObjectDefinition class51_1_
		    = ((ObjectDefinition) this).aClass263_933
			  .getObject(0, ((ObjectDefinition) this).anIntArray945[i_0_]);
		if ((((ObjectDefinition) class51_1_).anInt887 ^ 0xffffffff) != 0
		    || ((ObjectDefinition) class51_1_).anIntArray904 != null)
		    return true;
	    }
	}
	int i_2_ = -28 % ((i - 3) / 46);
	return false;
    }
    
    final String method475(String string, int i, int i_3_) {
	anInt866++;
	if (aClass356_881 == null)
	    return string;
	if (i_3_ != -16)
	    return null;
	StringNode class348_sub50
	    = (StringNode) aClass356_881.get((long) i);
	if (class348_sub50 == null)
	    return string;
	return ((StringNode) class348_sub50).value;
    }
    
    final Class2 method476(AbstractToolkit var_ha, s var_s, int i, int i_4_, int i_5_,
			   boolean bool, s var_s_6_, int i_7_, int i_8_,
			   int i_9_, int i_10_) {
	try {
	    if (Class104.method955(22311, i))
		i = 4;
	    anInt938++;
	    long l = (long) (i_9_ + (i << -1253023421)
			     + (((ObjectDefinition) this).anInt941 << -1906774710));
	    l |= (long) (((AbstractToolkit) var_ha).id << 1616267869);
	    int i_11_ = i_4_;
	    if (aByte886 == 3)
		i_11_ |= 0x7;
	    else {
		if (aByte886 != 0 || (anInt954 ^ 0xffffffff) != -1)
		    i_11_ |= 0x2;
		if ((anInt893 ^ 0xffffffff) != -1)
		    i_11_ |= 0x1;
		if (anInt890 != 0)
		    i_11_ |= 0x4;
	    }
	    if (bool)
		i_11_ |= 0x40000;
	    Class2 class2;
	    synchronized (((ObjectLoader) ((ObjectDefinition) this).aClass263_933)
			  .aClass60_3361) {
		class2 = (Class2) ((ObjectLoader) ((ObjectDefinition) this).aClass263_933)
				      .aClass60_3361.method583(l, i_10_ + -25);
	    }
	    AnimatableToolkit class64
		= class2 == null ? null : ((Class2) class2).aClass64_119;
	    r var_r = null;
	    if (class64 == null
		|| var_ha.method3667(class64.ua(), i_11_) != 0) {
		if (class64 != null)
		    i_11_ = var_ha.OR(i_11_, class64.ua());
		int i_12_ = i_11_;
		if (i == 10 && i_9_ > 3)
		    i_12_ |= 0x5;
		class64 = method477(i_9_, var_ha, i, i_10_ ^ ~0xec, i_12_);
		if (class64 == null)
		    return null;
		if (i == 10 && (i_9_ ^ 0xffffffff) < -4)
		    class64.a(2048);
		if (bool)
		    var_r = class64.ba(null);
		class64.s(i_11_);
		class2 = new Class2();
		((Class2) class2).aClass64_119 = class64;
		((Class2) class2).aR118 = var_r;
		synchronized (((ObjectLoader) ((ObjectDefinition) this).aClass263_933)
			      .aClass60_3361) {
		    ((ObjectLoader) ((ObjectDefinition) this).aClass263_933)
			.aClass60_3361.method582(class2, l, (byte) -120);
		}
	    } else {
		class64 = ((Class2) class2).aClass64_119;
		var_r = ((Class2) class2).aR118;
		if (bool && var_r == null)
		    var_r = ((Class2) class2).aR118 = class64.ba(null);
	    }
	    if (i_10_ != 128)
		method477(-4, null, 72, 42, -33);
	    boolean bool_13_ = ((aByte886 ^ 0xffffffff) != -1
				&& (var_s_6_ != null || var_s != null));
	    boolean bool_14_ = (anInt893 != 0 || anInt954 != 0
				|| (anInt890 ^ 0xffffffff) != -1);
	    if (bool_13_ || bool_14_) {
		class64 = class64.method614((byte) 0, i_11_, true);
		if (bool_13_)
		    class64.p(aByte886, anInt915, var_s_6_, var_s, i_5_, i_7_,
			      i_8_);
		if (bool_14_)
		    class64.H(anInt893, anInt954, anInt890);
		class64.s(i_4_);
	    } else
		class64 = class64.method614((byte) 0, i_4_, true);
	    ((Class2) SubNode.aClass2_7058).aClass64_119 = class64;
	    ((Class2) SubNode.aClass2_7058).aR118 = var_r;
	    return SubNode.aClass2_7058;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("iv.B(" + (var_ha != null ? "{...}" : "null") + ','
			+ (var_s != null ? "{...}" : "null") + ',' + i + ','
			+ i_4_ + ',' + i_5_ + ',' + bool + ','
			+ (var_s_6_ != null ? "{...}" : "null") + ',' + i_7_
			+ ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
	}
    }
    
    private final AnimatableToolkit method477(int i, AbstractToolkit var_ha, int i_15_, int i_16_,
				    int i_17_) {
	anInt958++;
	int i_18_ = anInt949 - -64;
	int i_19_ = 850 + anInt880;
	int i_20_ = i_17_;
	boolean bool = (((ObjectDefinition) this).aBoolean902
			|| (i_15_ ^ 0xffffffff) == -3 && i > 3);
	if (bool)
	    i_17_ |= 0x10;
	if (i != 0)
	    i_17_ |= 0xd;
	else {
	    if (anInt928 != 128 || anInt900 != 0)
		i_17_ |= 0x1;
	    if ((anInt882 ^ 0xffffffff) != -129 || anInt946 != 0)
		i_17_ |= 0x4;
	}
	if (anInt935 != 128 || anInt873 != 0)
	    i_17_ |= 0x2;
	if (i_16_ > -97)
	    aByte944 = (byte) -69;
	if (aShortArray940 != null)
	    i_17_ |= 0x4000;
	if (aShortArray919 != null)
	    i_17_ |= 0x8000;
	if (aByte922 != 0)
	    i_17_ |= 0x80000;
	AnimatableToolkit class64 = null;
	if (aByteArray885 == null)
	    return null;
	int i_21_ = -1;
	for (int i_22_ = 0;
	     (i_22_ ^ 0xffffffff) > (aByteArray885.length ^ 0xffffffff);
	     i_22_++) {
	    if ((i_15_ ^ 0xffffffff) == (aByteArray885[i_22_] ^ 0xffffffff)) {
		i_21_ = i_22_;
		break;
	    }
	}
	if ((i_21_ ^ 0xffffffff) == 0)
	    return null;
	int i_23_ = anIntArrayArray907[i_21_].length;
	if ((i_23_ ^ 0xffffffff) < -1) {
	    long l = (long) ((AbstractToolkit) var_ha).id;
	    for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > (i_23_ ^ 0xffffffff);
		 i_24_++)
		l = l * 67783L + (long) anIntArrayArray907[i_21_][i_24_];
	    synchronized (((ObjectLoader) ((ObjectDefinition) this).aClass263_933)
			  .aClass60_3360) {
		class64 = (AnimatableToolkit) ((ObjectLoader) ((ObjectDefinition) this).aClass263_933)
					.aClass60_3360.method583(l, 78);
	    }
	    if (class64 != null) {
		if ((class64.WA() ^ 0xffffffff) != (i_18_ ^ 0xffffffff))
		    i_17_ |= 0x1000;
		if (i_19_ != class64.da())
		    i_17_ |= 0x2000;
	    }
	    if (class64 == null || (var_ha.method3667(class64.ua(), i_17_)
				    ^ 0xffffffff) != -1) {
		int i_25_ = i_17_ | 0x1f01f;
		if (class64 != null)
		    i_25_ = var_ha.OR(i_25_, class64.ua());
		Model class124 = null;
		synchronized (Class341.aClass124Array4236) {
		    for (int i_26_ = 0; i_26_ < i_23_; i_26_++) {
			synchronized (((ObjectLoader)
				       ((ObjectDefinition) this).aClass263_933)
				      .aClass45_3345) {
			    class124
				= Class300.createModel(0,
						      (((ObjectLoader)
							(((ObjectDefinition) this)
							 .aClass263_933))
						       .aClass45_3345),
						      (0xffff
						       & (anIntArrayArray907
							  [i_21_][i_26_])));
			}
			if (class124 == null)
			    return null;
			if (((Model) class124).anInt1830 < 13)
			    class124.method1092(2, 96);
			if ((i_23_ ^ 0xffffffff) < -2)
			    Class341.aClass124Array4236[i_26_] = class124;
		    }
		    if (i_23_ > 1)
			class124
			    = new Model(Class341.aClass124Array4236, i_23_);
		}
		class64 = var_ha.method3625(class124, i_25_,
					    (((ObjectLoader)
					      ((ObjectDefinition) this).aClass263_933)
					     .anInt3363),
					    i_18_, i_19_);
		synchronized (((ObjectLoader) ((ObjectDefinition) this).aClass263_933)
			      .aClass60_3360) {
		    ((ObjectLoader) ((ObjectDefinition) this).aClass263_933)
			.aClass60_3360.method582(class64, l, (byte) -95);
		}
	    }
	}
	AnimatableToolkit class64_27_ = class64.method614((byte) 0, i_17_, true);
	if ((class64.WA() ^ 0xffffffff) != (i_18_ ^ 0xffffffff))
	    class64_27_.C(i_18_);
	if (class64.da() != i_19_)
	    class64_27_.LA(i_19_);
	if (bool)
	    class64_27_.v();
	if ((i_15_ ^ 0xffffffff) == -5 && (i ^ 0xffffffff) < -4) {
	    class64_27_.k(2048);
	    class64_27_.H(180, 0, -180);
	}
	i &= 0x3;
	if ((i ^ 0xffffffff) == -2)
	    class64_27_.k(4096);
	else if (i != 2) {
	    if (i == 3)
		class64_27_.k(12288);
	} else
	    class64_27_.k(8192);
	if (aShortArray940 != null) {
	    for (int i_28_ = 0;
		 (i_28_ ^ 0xffffffff) > (aShortArray940.length ^ 0xffffffff);
		 i_28_++) {
		if (aByteArray872 != null
		    && (i_28_ ^ 0xffffffff) > (aByteArray872.length
					       ^ 0xffffffff))
		    class64_27_.ia(aShortArray940[i_28_],
				   (Class348_Sub26.aShortArray6889
				    [0xff & aByteArray872[i_28_]]));
		else
		    class64_27_.ia(aShortArray940[i_28_],
				   aShortArray908[i_28_]);
	    }
	}
	if (aShortArray919 != null) {
	    for (int i_29_ = 0;
		 (aShortArray919.length ^ 0xffffffff) < (i_29_ ^ 0xffffffff);
		 i_29_++)
		class64_27_.aa(aShortArray919[i_29_], aShortArray892[i_29_]);
	}
	if ((aByte922 ^ 0xffffffff) != -1)
	    class64_27_.method624(aByte944, aByte952, aByte879,
				  0xff & aByte922);
	if ((anInt928 ^ 0xffffffff) != -129 || anInt935 != 128
	    || (anInt882 ^ 0xffffffff) != -129)
	    class64_27_.O(anInt928, anInt935, anInt882);
	if (anInt900 != 0 || (anInt873 ^ 0xffffffff) != -1
	    || (anInt946 ^ 0xffffffff) != -1)
	    class64_27_.H(anInt900, anInt873, anInt946);
	class64_27_.s(i_20_);
	return class64_27_;
    }
    
    final boolean method478(int i, int i_30_) {
	if (i_30_ != -31076)
	    return false;
	anInt901++;
	if (anIntArrayArray907 == null)
	    return true;
	synchronized (((ObjectLoader) ((ObjectDefinition) this).aClass263_933)
		      .aClass45_3345) {
	    for (int i_31_ = 0; aByteArray885.length > i_31_; i_31_++) {
		if (aByteArray885[i_31_] == i) {
		    for (int i_32_ = 0;
			 ((i_32_ ^ 0xffffffff)
			  > (anIntArrayArray907[i_31_].length ^ 0xffffffff));
			 i_32_++) {
			if (!((ObjectLoader) ((ObjectDefinition) this).aClass263_933)
				 .aClass45_3345.isLoaded
			     (anIntArrayArray907[i_31_][i_32_],
			      0))
			    return false;
		    }
		    return true;
		}
	    }
	}
	return true;
    }
    
    final void method479(byte i, ByteBuffer class348_sub49) {
	anInt867++;
	for (;;) {
	    int i_33_ = class348_sub49.getUByte();
	    if (i_33_ == 0)
		break;
	    method482(class348_sub49, i_33_, (byte) -101);
	}
	if (i != 0)
	    method486(-77);
    }
    
    final ObjectDefinition method480(ConfigHandler interface17, byte i) {
	anInt870++;
	int i_34_ = -1;
	if (anInt934 == -1) {
	    if (anInt939 != -1)
		i_34_ = interface17.getRawConfig(anInt939);
	} else
	    i_34_ = interface17.getSetting(anInt934);
	if (i != 47)
	    method478(101, 42);
	if (i_34_ < 0 || -1 + ((ObjectDefinition) this).anIntArray945.length <= i_34_
	    || ((ObjectDefinition) this).anIntArray945[i_34_] == -1) {
	    int i_35_ = (((ObjectDefinition) this).anIntArray945
			 [-1 + ((ObjectDefinition) this).anIntArray945.length]);
	    if (i_35_ == -1)
		return null;
	    return ((ObjectDefinition) this).aClass263_933.getObject(0, i_35_);
	}
	return ((ObjectDefinition) this).aClass263_933
		   .getObject(i + -47, ((ObjectDefinition) this).anIntArray945[i_34_]);
    }
    
    final boolean method481(byte i, int i_36_) {
	anInt957++;
	if (i_36_ == -1)
	    return false;
	if (i_36_ == ((ObjectDefinition) this).anInt868)
	    return true;
	if (((ObjectDefinition) this).anIntArray943 != null) {
	    for (int i_37_ = 0; i_37_ < ((ObjectDefinition) this).anIntArray943.length;
		 i_37_++) {
		if ((i_36_ ^ 0xffffffff)
		    == (((ObjectDefinition) this).anIntArray943[i_37_] ^ 0xffffffff))
		    return true;
	    }
	}
	if (i < 67)
	    method481((byte) 127, 25);
	return false;
    }
    
    private final void method482(ByteBuffer class348_sub49, int i,
				 byte i_38_) {
	anInt960++;
	if (i != 1 && (i ^ 0xffffffff) != -6) {
	    if ((i ^ 0xffffffff) == -3)
		((ObjectDefinition) this).aString884
		    = class348_sub49.getJStr();
	    else if (i == 14)
		((ObjectDefinition) this).anInt961 = class348_sub49.getUByte();
	    else if ((i ^ 0xffffffff) != -16) {
		if ((i ^ 0xffffffff) == -18) {
		    ((ObjectDefinition) this).aBoolean896 = false;
		    ((ObjectDefinition) this).anInt920 = 0;
		} else if (i == 18)
		    ((ObjectDefinition) this).aBoolean896 = false;
		else if ((i ^ 0xffffffff) != -20) {
		    if (i == 21)
			aByte886 = (byte) 1;
		    else if (i != 22) {
			if ((i ^ 0xffffffff) == -24)
			    ((ObjectDefinition) this).anInt955 = 1;
			else if ((i ^ 0xffffffff) == -25) {
			    ((ObjectDefinition) this).anInt868
				= class348_sub49.getShort();
			    if ((((ObjectDefinition) this).anInt868 ^ 0xffffffff)
				== -65536)
				((ObjectDefinition) this).anInt868 = -1;
			} else if (i == 27)
			    ((ObjectDefinition) this).anInt920 = 1;
			else if (i != 28) {
			    if (i != 29) {
				if (i == 39)
				    anInt880
					= class348_sub49.getByte() * 5;
				else if ((i ^ 0xffffffff) <= -31 && i < 35)
				    ((ObjectDefinition) this).aStringArray913[-30 + i]
					= class348_sub49.getJStr();
				else if (i != 40) {
				    if (i != 41) {
					if (i != 42) {
					    if (i == 62)
						((ObjectDefinition) this).aBoolean902
						    = true;
					    else if (i != 64) {
						if (i == 65)
						    anInt928 = (class348_sub49
								    .getShort
								());
						else if (i != 66) {
						    if ((i ^ 0xffffffff)
							!= -68) {
							if (i == 69)
							    ((ObjectDefinition) this)
								.anInt914
								= (class348_sub49
								       .getUByte
								   ());
							else if ((i
								  ^ 0xffffffff)
								 != -71) {
							    if ((i
								 ^ 0xffffffff)
								== -72)
								anInt873
								    = ((class348_sub49
									    .method3372
									(13638))
								       << 732014370);
							    else if ((i
								      ^ 0xffffffff)
								     != -73) {
								if ((i
								     ^ 0xffffffff)
								    == -74)
								    ((ObjectDefinition)
								     this)
									.aBoolean947
									= true;
								else if ((i
									  ^ 0xffffffff)
									 == -75)
								    ((ObjectDefinition)
								     this)
									.aBoolean876
									= true;
								else if ((i
									  ^ 0xffffffff)
									 != -76) {
								    if (i != 77
									&& ((i
									     ^ 0xffffffff)
									    != -93)) {
									if ((i
									     ^ 0xffffffff)
									    != -79) {
									    if ((i ^ 0xffffffff) != -80) {
										if (i == 81) {
										    aByte886 = (byte) 2;
										    anInt915 = class348_sub49.getUByte() * 256;
										} else if (i != 82) {
										    if (i == 88)
											((ObjectDefinition) this).aBoolean894 = false;
										    else if (i != 89) {
											if ((i ^ 0xffffffff) == -92)
											    ((ObjectDefinition) this).aBoolean942 = true;
											else if (i != 93) {
											    if (i == 94)
												aByte886 = (byte) 4;
											    else if ((i ^ 0xffffffff) == -96) {
												aByte886 = (byte) 5;
												anInt915 = class348_sub49.method3372(13638);
											    } else if (i != 97) {
												if ((i ^ 0xffffffff) != -99) {
												    if ((i ^ 0xffffffff) != -100) {
													if (i != 100) {
													    if (i != 101) {
														if (i == 102)
														    ((ObjectDefinition) this).anInt875 = class348_sub49.getShort();
														else if ((i ^ 0xffffffff) != -104) {
														    if ((i ^ 0xffffffff) == -105)
															((ObjectDefinition) this).anInt936 = class348_sub49.getUByte();
														    else if ((i ^ 0xffffffff) != -106) {
															if (i == 106) {
															    int i_39_ = class348_sub49.getUByte();
															    ((ObjectDefinition) this).anIntArray943 = new int[i_39_];
															    anIntArray959 = new int[i_39_];
															    for (int i_40_ = 0; i_40_ < i_39_; i_40_++) {
																((ObjectDefinition) this).anIntArray943[i_40_] = class348_sub49.getShort();
																int i_41_ = class348_sub49.getUByte();
																anIntArray959[i_40_] = i_41_;
																anInt911 += i_41_;
															    }
															} else if ((i ^ 0xffffffff) != -108) {
															    if (i < 150 || i >= 155) {
																if ((i ^ 0xffffffff) != -161) {
																    if (i == 162) {
																	aByte886 = (byte) 3;
																	anInt915 = class348_sub49.getDWord();
																    } else if (i == 163) {
																	aByte944 = class348_sub49.getByte();
																	aByte952 = class348_sub49.getByte();
																	aByte879 = class348_sub49.getByte();
																	aByte922 = class348_sub49.getByte();
																    } else if (i != 164) {
																	if ((i ^ 0xffffffff) != -166) {
																	    if (i != 166) {
																		if (i == 167)
																		    ((ObjectDefinition) this).anInt930 = class348_sub49.getShort();
																		else if ((i ^ 0xffffffff) != -169) {
																		    if ((i ^ 0xffffffff) != -170) {
																			if (i != 170) {
																			    if ((i ^ 0xffffffff) == -172)
																				((ObjectDefinition) this).anInt953 = class348_sub49.getSmartA();
																			    else if (i == 173) {
																				((ObjectDefinition) this).anInt878 = class348_sub49.getShort();
																				((ObjectDefinition) this).anInt916 = class348_sub49.getShort();
																			    } else if (i == 249) {
																				int i_42_ = class348_sub49.getUByte();
																				if (aClass356_881 == null) {
																				    int i_43_ = Class33.method340(i_42_, (byte) 108);
																				    aClass356_881 = new HashTable(i_43_);
																				}
																				for (int i_44_ = 0; (i_42_ ^ 0xffffffff) < (i_44_ ^ 0xffffffff); i_44_++) {
																				    boolean bool = class348_sub49.getUByte() == 1;
																				    int i_45_ = class348_sub49.getTri();
																				    Node class348;
																				    if (!bool)
																					class348 = new Class348_Sub35(class348_sub49.getDWord());
																				    else
																					class348 = new StringNode(class348_sub49.getJStr());
																				    aClass356_881.putNode((long) i_45_, class348);
																				}
																			    }
																			} else
																			    ((ObjectDefinition) this).anInt909 = class348_sub49.getSmartA();
																		    } else
																			((ObjectDefinition) this).aBoolean903 = true;
																		} else
																		    ((ObjectDefinition) this).aBoolean888 = true;
																	    } else
																		anInt890 = class348_sub49.method3372(13638);
																	} else
																	    anInt954 = class348_sub49.method3372(13638);
																    } else
																	anInt893 = class348_sub49.method3372(13638);
																} else {
																    int i_46_ = class348_sub49.getUByte();
																    ((ObjectDefinition) this).anIntArray917 = new int[i_46_];
																    for (int i_47_ = 0; i_46_ > i_47_; i_47_++)
																	((ObjectDefinition) this).anIntArray917[i_47_] = class348_sub49.getShort();
																}
															    } else {
																((ObjectDefinition) this).aStringArray913[i + -150] = class348_sub49.getJStr();
																if (!((ObjectLoader) ((ObjectDefinition) this).aClass263_933).aBoolean3359)
																    ((ObjectDefinition) this).aStringArray913[-150 + i] = null;
															    }
															} else
															    ((ObjectDefinition) this).anInt921 = class348_sub49.getShort();
														    } else
															((ObjectDefinition) this).aBoolean925 = true;
														} else
														    ((ObjectDefinition) this).anInt955 = 0;
													    } else
														((ObjectDefinition) this).anInt923 = class348_sub49.getUByte();
													} else {
													    ((ObjectDefinition) this).anInt951 = class348_sub49.getUByte();
													    ((ObjectDefinition) this).anInt877 = class348_sub49.getShort();
													}
												    } else {
													((ObjectDefinition) this).anInt950 = class348_sub49.getUByte();
													((ObjectDefinition) this).anInt869 = class348_sub49.getShort();
												    }
												} else
												    ((ObjectDefinition) this).aBoolean929 = true;
											    } else
												((ObjectDefinition) this).aBoolean912 = true;
											} else {
											    aByte886 = (byte) 3;
											    anInt915 = class348_sub49.getShort();
											}
										    } else
											((ObjectDefinition) this).aBoolean924 = false;
										} else
										    ((ObjectDefinition) this).aBoolean931 = true;
									    } else {
										((ObjectDefinition) this).anInt962 = class348_sub49.getShort();
										((ObjectDefinition) this).anInt937 = class348_sub49.getShort();
										((ObjectDefinition) this).anInt889 = class348_sub49.getUByte();
										int i_48_ = class348_sub49.getUByte();
										((ObjectDefinition) this).anIntArray904 = new int[i_48_];
										for (int i_49_ = 0; (i_49_ ^ 0xffffffff) > (i_48_ ^ 0xffffffff); i_49_++)
										    ((ObjectDefinition) this).anIntArray904[i_49_] = class348_sub49.getShort();
									    }
									} else {
									    ((ObjectDefinition)
									     this).anInt887
										= class348_sub49.getShort();
									    ((ObjectDefinition)
									     this).anInt889
										= class348_sub49.getUByte();
									}
								    } else {
									anInt934
									    = class348_sub49.getShort();
									if ((anInt934
									     ^ 0xffffffff)
									    == -65536)
									    anInt934 = -1;
									anInt939
									    = class348_sub49.getShort();
									if (anInt939
									    == 65535)
									    anInt939 = -1;
									int i_50_
									    = -1;
									if ((i
									     ^ 0xffffffff)
									    == -93) {
									    i_50_ = class348_sub49.getShort();
									    if ((i_50_ ^ 0xffffffff) == -65536)
										i_50_ = -1;
									}
									int i_51_
									    = class348_sub49.getUByte();
									((ObjectDefinition)
									 this)
									    .anIntArray945
									    = new int[2 + i_51_];
									for (int i_52_ = 0;
									     i_51_ >= i_52_;
									     i_52_++) {
									    ((ObjectDefinition)
									     this).anIntArray945[i_52_]
										= class348_sub49.getShort();
									    if ((((ObjectDefinition) this).anIntArray945[i_52_] ^ 0xffffffff) == -65536)
										((ObjectDefinition) this).anIntArray945[i_52_] = -1;
									}
									((ObjectDefinition)
									 this)
									    .anIntArray945
									    [i_51_ + 1]
									    = i_50_;
								    }
								} else
								    ((ObjectDefinition)
								     this)
									.anInt895
									= (class348_sub49.getUByte
									   ());
							    } else
								anInt946
								    = ((class348_sub49
									    .method3372
									(13638))
								       << -414027806);
							} else
							    anInt900
								= ((class348_sub49
									.method3372
								    (13638))
								   << -1099102046);
						    } else
							anInt882
							    = (class348_sub49
								   .getShort
							       ());
						} else
						    anInt935 = (class348_sub49
								    .getShort
								());
					    } else
						((ObjectDefinition) this).aBoolean918
						    = false;
					} else {
					    int i_53_ = class348_sub49
							    .getUByte();
					    aByteArray872 = new byte[i_53_];
					    for (int i_54_ = 0; i_53_ > i_54_;
						 i_54_++)
						aByteArray872[i_54_]
						    = class348_sub49
							  .getByte();
					}
				    } else {
					int i_55_
					    = class348_sub49.getUByte();
					aShortArray892 = new short[i_55_];
					aShortArray919 = new short[i_55_];
					for (int i_56_ = 0; i_56_ < i_55_;
					     i_56_++) {
					    aShortArray919[i_56_]
						= (short) (class348_sub49
							       .getShort
							   ());
					    aShortArray892[i_56_]
						= (short) (class348_sub49
							       .getShort
							   ());
					}
				    }
				} else {
				    int i_57_ = class348_sub49.getUByte();
				    aShortArray940 = new short[i_57_];
				    aShortArray908 = new short[i_57_];
				    for (int i_58_ = 0;
					 ((i_57_ ^ 0xffffffff)
					  < (i_58_ ^ 0xffffffff));
					 i_58_++) {
					aShortArray940[i_58_]
					    = (short) (class348_sub49
							   .getShort
						       ());
					aShortArray908[i_58_]
					    = (short) (class348_sub49
							   .getShort
						       ());
				    }
				}
			    } else
				anInt949 = class348_sub49.getByte();
			} else
			    ((ObjectDefinition) this).anInt883
				= (class348_sub49.getUByte()
				   << -1561278014);
		    } else
			((ObjectDefinition) this).aBoolean906 = true;
		} else
		    ((ObjectDefinition) this).anInt874 = class348_sub49.getUByte();
	    } else
		((ObjectDefinition) this).anInt926 = class348_sub49.getUByte();
	} else {
	    if ((i ^ 0xffffffff) == -6
		&& ((ObjectLoader) ((ObjectDefinition) this).aClass263_933).aBoolean3355)
		method484(class348_sub49, -528);
	    int i_59_ = class348_sub49.getUByte();
	    anIntArrayArray907 = new int[i_59_][];
	    aByteArray885 = new byte[i_59_];
	    for (int i_60_ = 0; i_60_ < i_59_; i_60_++) {
		aByteArray885[i_60_] = class348_sub49.getByte();
		int i_61_ = class348_sub49.getUByte();
		anIntArrayArray907[i_60_] = new int[i_61_];
		for (int i_62_ = 0; i_62_ < i_61_; i_62_++)
		    anIntArrayArray907[i_60_][i_62_]
			= class348_sub49.getShort();
	    }
	    if (i == 5
		&& !((ObjectLoader) ((ObjectDefinition) this).aClass263_933).aBoolean3355)
		method484(class348_sub49, -528);
	}
	if (i_38_ >= -93)
	    aByteArray885 = null;
    }
    
    final AnimatableToolkit method483(int i, int i_63_, int i_64_, int i_65_, AbstractToolkit var_ha,
			    int i_66_, int i_67_, byte i_68_, s var_s,
			    int i_69_, int i_70_, int i_71_, AnimationDefinition class17,
			    s var_s_72_) {
	try {
	    if (Class104.method955(22311, i_64_))
		i_64_ = 4;
	    anInt910++;
	    long l = (long) ((((ObjectDefinition) this).anInt941 << 930035434)
			     + ((i_64_ << -1222243261) - -i_66_));
	    int i_73_ = i_67_;
	    l |= (long) (((AbstractToolkit) var_ha).id << 1626230813);
	    if (class17 != null)
		i_67_ |= class17.method263(i, 123, i_70_, false);
	    if ((aByte886 ^ 0xffffffff) != -4) {
		if ((aByte886 ^ 0xffffffff) != -1
		    || (anInt954 ^ 0xffffffff) != -1)
		    i_67_ |= 0x2;
		if ((anInt893 ^ 0xffffffff) != -1)
		    i_67_ |= 0x1;
		if (anInt890 != 0)
		    i_67_ |= 0x4;
	    } else
		i_67_ |= 0x7;
	    if (i_64_ == 10 && (i_66_ ^ 0xffffffff) < -4)
		i_67_ |= 0x5;
	    AnimatableToolkit class64;
	    synchronized (((ObjectLoader) ((ObjectDefinition) this).aClass263_933)
			  .aClass60_3362) {
		class64 = (AnimatableToolkit) ((ObjectLoader) ((ObjectDefinition) this).aClass263_933)
					.aClass60_3362.method583(l, 100);
	    }
	    if (class64 == null
		|| var_ha.method3667(class64.ua(), i_67_) != 0) {
		if (class64 != null)
		    i_67_ = var_ha.OR(i_67_, class64.ua());
		class64 = method477(i_66_, var_ha, i_64_, -125, i_67_);
		if (class64 == null)
		    return null;
		synchronized (((ObjectLoader) ((ObjectDefinition) this).aClass263_933)
			      .aClass60_3362) {
		    ((ObjectLoader) ((ObjectDefinition) this).aClass263_933)
			.aClass60_3362.method582(class64, l, (byte) -127);
		}
	    }
	    boolean bool = false;
	    if (i_68_ <= 38)
		return null;
	    if (class17 != null) {
		class64 = class17.method266(class64, 0x3 & i_66_, i, (byte) 1,
					    i_70_, i_63_, 663780816, i_67_);
		bool = true;
	    }
	    if (i_64_ == 10 && i_66_ > 3) {
		if (!bool) {
		    class64 = class64.method614((byte) 3, i_67_, true);
		    bool = true;
		}
		class64.a(2048);
	    }
	    if (aByte886 != 0) {
		if (!bool) {
		    bool = true;
		    class64 = class64.method614((byte) 3, i_67_, true);
		}
		class64.p(aByte886, anInt915, var_s_72_, var_s, i_71_, i_65_,
			  i_69_);
	    }
	    if (anInt893 != 0 || anInt954 != 0 || anInt890 != 0) {
		if (!bool) {
		    bool = true;
		    class64 = class64.method614((byte) 3, i_67_, true);
		}
		class64.H(anInt893, anInt954, anInt890);
	    }
	    if (bool)
		class64.s(i_73_);
	    return class64;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("iv.L(" + i + ',' + i_63_ + ',' + i_64_ + ',' + i_65_
			+ ',' + (var_ha != null ? "{...}" : "null") + ','
			+ i_66_ + ',' + i_67_ + ',' + i_68_ + ','
			+ (var_s != null ? "{...}" : "null") + ',' + i_69_
			+ ',' + i_70_ + ',' + i_71_ + ','
			+ (class17 != null ? "{...}" : "null") + ','
			+ (var_s_72_ != null ? "{...}" : "null") + ')'));
	}
    }
    
    private final void method484(ByteBuffer class348_sub49, int i) {
	if (i != -528)
	    method486(79);
	anInt871++;
	int i_74_ = class348_sub49.getUByte();
	for (int i_75_ = 0; (i_74_ ^ 0xffffffff) < (i_75_ ^ 0xffffffff);
	     i_75_++) {
	    ((ByteBuffer) class348_sub49).position++;
	    int i_76_ = class348_sub49.getUByte();
	    ((ByteBuffer) class348_sub49).position += i_76_ * 2;
	}
    }
    
    final boolean method485(int i) {
	anInt899++;
	if (i != 9773)
	    method485(-109);
	if (anIntArrayArray907 == null)
	    return true;
	boolean bool = true;
	synchronized (((ObjectLoader) ((ObjectDefinition) this).aClass263_933)
		      .aClass45_3345) {
	    for (int i_77_ = 0; i_77_ < anIntArrayArray907.length; i_77_++) {
		for (int i_78_ = 0;
		     ((i_78_ ^ 0xffffffff)
		      > (anIntArrayArray907[i_77_].length ^ 0xffffffff));
		     i_78_++)
		    bool &= (((ObjectLoader) ((ObjectDefinition) this).aClass263_933)
				 .aClass45_3345.isLoaded
			     (anIntArrayArray907[i_77_][i_78_], 0));
	    }
	}
	return bool;
    }
    
    public static void method486(int i) {
	aStringArray932 = null;
	if (i > -19)
	    method486(-34);
	aClass101_905 = null;
	loadingHandler = null;
    }
    
    final int method487(int i, int i_79_, int i_80_) {
	int i_81_ = 81 % ((i_80_ - -53) / 44);
	anInt898++;
	if (aClass356_881 == null)
	    return i_79_;
	Class348_Sub35 class348_sub35
	    = (Class348_Sub35) aClass356_881.get((long) i);
	if (class348_sub35 == null)
	    return i_79_;
	return ((Class348_Sub35) class348_sub35).anInt6976;
    }
    
    final void method488(int i) {
	if ((((ObjectDefinition) this).anInt874 ^ 0xffffffff) == 0) {
	    ((ObjectDefinition) this).anInt874 = 0;
	    if (aByteArray885 != null
		&& (aByteArray885.length ^ 0xffffffff) == -2
		&& aByteArray885[0] == 10)
		((ObjectDefinition) this).anInt874 = 1;
	    for (int i_82_ = 0; i_82_ < 5; i_82_++) {
		if (((ObjectDefinition) this).aStringArray913[i_82_] != null) {
		    ((ObjectDefinition) this).anInt874 = 1;
		    break;
		}
	    }
	}
	anInt956++;
	int i_83_ = -118 / ((-55 - i) / 46);
	if (((ObjectDefinition) this).anInt895 == -1)
	    ((ObjectDefinition) this).anInt895 = ((ObjectDefinition) this).anInt920 != 0 ? 1 : 0;
    }
    
    final int method489(int i) {
	anInt927++;
	if (((ObjectDefinition) this).anIntArray943 != null) {
	    int i_84_ = (int) (Math.random() * (double) anInt911);
	    int i_85_;
	    for (i_85_ = 0;
		 (anIntArray959[i_85_] ^ 0xffffffff) >= (i_84_ ^ 0xffffffff);
		 i_85_++)
		i_84_ -= anIntArray959[i_85_];
	    return ((ObjectDefinition) this).anIntArray943[i_85_];
	}
	if (i != -1)
	    method483(-2, 60, -13, 88, null, -68, 4, (byte) 52, null, -111,
		      -120, 102, null, null);
	return -1;
    }
    
    public ObjectDefinition() {
	((ObjectDefinition) this).anInt869 = -1;
	anInt890 = 0;
	((ObjectDefinition) this).aBoolean896 = true;
	((ObjectDefinition) this).anInt874 = -1;
	anInt882 = 128;
	((ObjectDefinition) this).aString884 = "null";
	anInt880 = 0;
	aByte886 = (byte) 0;
	((ObjectDefinition) this).aBoolean888 = false;
	((ObjectDefinition) this).aBoolean906 = false;
	((ObjectDefinition) this).aBoolean903 = false;
	((ObjectDefinition) this).anInt877 = -1;
	((ObjectDefinition) this).anInt914 = 0;
	((ObjectDefinition) this).anInt875 = -1;
	((ObjectDefinition) this).aStringArray913 = new String[5];
	((ObjectDefinition) this).aBoolean912 = false;
	((ObjectDefinition) this).aBoolean894 = true;
	((ObjectDefinition) this).aBoolean924 = true;
	((ObjectDefinition) this).anInt923 = 0;
	anInt873 = 0;
	((ObjectDefinition) this).aBoolean931 = false;
	anInt911 = 0;
	((ObjectDefinition) this).anInt916 = 256;
	((ObjectDefinition) this).anInt921 = -1;
	anInt939 = -1;
	((ObjectDefinition) this).anInt883 = 64;
	((ObjectDefinition) this).anInt926 = 1;
	anInt928 = 128;
	((ObjectDefinition) this).anInt909 = 960;
	anInt934 = -1;
	((ObjectDefinition) this).anInt889 = 0;
	((ObjectDefinition) this).anInt895 = -1;
	aByte922 = (byte) 0;
	((ObjectDefinition) this).aBoolean947 = false;
	((ObjectDefinition) this).anInt878 = 256;
	anInt893 = 0;
	((ObjectDefinition) this).anInt936 = 255;
	((ObjectDefinition) this).anIntArray943 = null;
	((ObjectDefinition) this).aBoolean902 = false;
	((ObjectDefinition) this).aBoolean918 = true;
	anInt949 = 0;
	((ObjectDefinition) this).aBoolean942 = false;
	((ObjectDefinition) this).anInt953 = 0;
	anInt954 = 0;
	((ObjectDefinition) this).anInt937 = 0;
	anInt900 = 0;
	((ObjectDefinition) this).anInt930 = 0;
	anInt915 = -1;
	((ObjectDefinition) this).anInt951 = -1;
	((ObjectDefinition) this).anInt955 = -1;
	((ObjectDefinition) this).aBoolean925 = false;
	anInt946 = 0;
	((ObjectDefinition) this).anInt950 = -1;
	anIntArray959 = null;
	((ObjectDefinition) this).anInt920 = 2;
	((ObjectDefinition) this).anInt961 = 1;
	((ObjectDefinition) this).aBoolean929 = false;
	anInt935 = 128;
	((ObjectDefinition) this).anInt962 = 0;
	((ObjectDefinition) this).anInt887 = -1;
    }
}
