/* Class237_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class237_Sub1 extends Class237
{
    static int anInt5815;
    static int anInt5816;
    static int anInt5817;
    static int anInt5818;
    static int anInt5819;
    static int anInt5820;
    static Class341 aClass341_5821 = new Class341();
    static int anInt5822;
    static int anInt5823;
    int anInt5824 = 99;
    static int anInt5825;
    static int anInt5826;
    /*synthetic*/ static Class aClass5827;
    
    final void method1689(int i, int i_0_, int i_1_, AbstractToolkit var_ha, int i_2_,
			  int i_3_, int i_4_, int i_5_, int i_6_, int i_7_,
			  Class361 class361) {
	try {
	    anInt5823++;
	    if (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		    .aClass239_Sub27_7261.method1840(i_3_ ^ ~0x7e6f) != 0
		|| Class58.method536(i_5_, false, i, Class167.anInt2204,
				     i_2_)) {
		if ((i_0_ ^ 0xffffffff)
		    > (((Class237_Sub1) this).anInt5824 ^ 0xffffffff))
		    ((Class237_Sub1) this).anInt5824 = i_0_;
		ObjectDefinition class51
		    = Class348_Sub40_Sub12.objectLoader.getObject(0, i_1_);
		if ((((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			 .aClass239_Sub24_7235.method1820(i_3_ + -32400)
		     ^ 0xffffffff) != -1
		    || !((ObjectDefinition) class51).aBoolean931) {
		    int i_8_;
		    int i_9_;
		    if (i_7_ == 1 || (i_7_ ^ 0xffffffff) == -4) {
			i_8_ = ((ObjectDefinition) class51).anInt961;
			i_9_ = ((ObjectDefinition) class51).anInt926;
		    } else {
			i_8_ = ((ObjectDefinition) class51).anInt926;
			i_9_ = ((ObjectDefinition) class51).anInt961;
		    }
		    if (i_3_ != 50)
			method1695(null, null, -32, null, -51, 80);
		    int i_10_;
		    int i_11_;
		    if ((((Class237) this).anInt3117 ^ 0xffffffff)
			<= (i - -i_9_ ^ 0xffffffff)) {
			i_10_ = (i_9_ >> 66283169) + i;
			i_11_ = i + (1 + i_9_ >> 1735661825);
		    } else {
			i_10_ = i;
			i_11_ = 1 + i;
		    }
		    int i_12_;
		    int i_13_;
		    if (((Class237) this).anInt3114 < i_8_ + i_5_) {
			i_12_ = i_5_ + 1;
			i_13_ = i_5_;
		    } else {
			i_12_ = (1 + i_8_ >> 1203717857) + i_5_;
			i_13_ = (i_8_ >> -435678175) + i_5_;
		    }
		    s var_s = aa_Sub1.aSArray5191[i_2_];
		    int i_14_
			= ((var_s.method3982((byte) -86, i_13_, i_10_)
			    + var_s.method3982((byte) -86, i_13_, i_11_)
			    - (-var_s.method3982((byte) -86, i_12_, i_10_)
			       - var_s.method3982((byte) -86, i_12_, i_11_)))
			   >> -1531216478);
		    int i_15_ = (i << 1832206761) - -(i_9_ << 2012059304);
		    int i_16_ = (i_8_ << -163621048) + (i_5_ << -1814777175);
		    boolean bool = (Class348_Sub42_Sub3.aBoolean9498
				    && !((Class237) this).aBoolean3109
				    && ((ObjectDefinition) class51).aBoolean906);
		    if (class51.method474((byte) 82))
			Class223.method1614(979190089, null, i_0_, i_5_, i,
					    null, class51, i_7_);
		    boolean bool_17_
			= ((i_6_ ^ 0xffffffff) == 0
			   && ((ObjectDefinition) class51).anInt868 == -1
			   && ((ObjectDefinition) class51).anIntArray943 == null
			   && ((ObjectDefinition) class51).anIntArray945 == null
			   && !((ObjectDefinition) class51).aBoolean929);
		    if (!BufferedRasterizer.aBoolean4728
			|| ((!Class140.method1172((byte) -85, i_4_)
			     || ((ObjectDefinition) class51).anInt955 == 1)
			    && (!Class231.method1639(i_4_, i_3_ ^ 0x3918)
				|| ((ObjectDefinition) class51).anInt955 != 0))) {
			if ((i_4_ ^ 0xffffffff) == -23) {
			    if ((((Class348_Sub51)
				  BitmapTable.aClass348_Sub51_3959)
				     .aClass239_Sub4_7220.method1737(-32350)
				 != 0)
				|| ((((ObjectDefinition) class51).anInt874 ^ 0xffffffff)
				    != -1)
				|| ((((ObjectDefinition) class51).anInt920 ^ 0xffffffff)
				    == -2)
				|| ((ObjectDefinition) class51).aBoolean947) {
				Class318_Sub1_Sub1 class318_sub1_sub1;
				if (!bool_17_)
				    class318_sub1_sub1
					= (new Class318_Sub1_Sub1_Sub1
					   (var_ha, class51, i_0_, i_2_, i_15_,
					    i_14_, i_16_,
					    ((Class237) this).aBoolean3109,
					    i_7_, i_6_));
				else {
				    Class318_Sub1_Sub1_Sub2 class318_sub1_sub1_sub2
					= (new Class318_Sub1_Sub1_Sub2
					   (var_ha, class51, i_0_, i_2_, i_15_,
					    i_14_, i_16_,
					    ((Class237) this).aBoolean3109,
					    i_7_, bool));
				    class318_sub1_sub1
					= class318_sub1_sub1_sub2;
				    if (class318_sub1_sub1_sub2
					    .method38(-18443))
					class318_sub1_sub1_sub2
					    .method44(836, var_ha);
				}
				Class75_Sub1.method770(i_0_, i, i_5_,
						       class318_sub1_sub1);
				if ((((ObjectDefinition) class51).anInt920
				     ^ 0xffffffff) == -2
				    && class361 != null)
				    class361.method3496(i_5_, i, 1);
			    }
			} else if ((i_4_ ^ 0xffffffff) == -11 || i_4_ == 11) {
			    Class318_Sub1_Sub3_Sub1 class318_sub1_sub3_sub1
				= null;
			    Class318_Sub1_Sub3 class318_sub1_sub3;
			    int i_18_;
			    if (!bool_17_) {
				i_18_ = 15;
				class318_sub1_sub3
				    = (new Class318_Sub1_Sub3_Sub2
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, i,
					i_9_ + (i + -1), i_5_,
					-1 + (i_5_ + i_8_), i_4_, i_7_, i_6_));
			    } else {
				Class318_Sub1_Sub3_Sub1 class318_sub1_sub3_sub1_19_
				    = (new Class318_Sub1_Sub3_Sub1
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, i,
					i_9_ + (i + -1), i_5_,
					-1 + (i_8_ + i_5_), i_4_, i_7_, bool));
				class318_sub1_sub3
				    = class318_sub1_sub3_sub1_19_;
				class318_sub1_sub3_sub1
				    = class318_sub1_sub3_sub1_19_;
				i_18_ = class318_sub1_sub3_sub1_19_
					    .method2416(15);
			    }
			    if (Class89.method850(class318_sub1_sub3, false)) {
				if (class318_sub1_sub3_sub1 != null
				    && class318_sub1_sub3_sub1
					   .method38(-18443))
				    class318_sub1_sub3_sub1.method44(836,
								     var_ha);
				if (((ObjectDefinition) class51).aBoolean918
				    && Class348_Sub42_Sub3.aBoolean9498) {
				    if ((i_18_ ^ 0xffffffff) < -31)
					i_18_ = 30;
				    for (int i_20_ = 0;
					 ((i_9_ ^ 0xffffffff)
					  <= (i_20_ ^ 0xffffffff));
					 i_20_++) {
					for (int i_21_ = 0; i_8_ >= i_21_;
					     i_21_++)
					    var_s.ka(i_20_ + i, i_5_ + i_21_,
						     i_18_);
				    }
				}
			    }
			    if (((((ObjectDefinition) class51).anInt920 ^ 0xffffffff)
				 != -1)
				&& class361 != null)
				class361.method3505(!(((ObjectDefinition) class51)
						      .aBoolean876),
						    i_9_, i_5_, true, i,
						    (((ObjectDefinition) class51)
						     .aBoolean896),
						    i_8_);
			} else if (i_4_ >= 12 && i_4_ <= 17
				   || ((i_4_ ^ 0xffffffff) <= -19
				       && i_4_ <= 21)) {
			    Class318_Sub1_Sub3 class318_sub1_sub3;
			    if (!bool_17_)
				class318_sub1_sub3
				    = (new Class318_Sub1_Sub3_Sub2
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, i,
					i + (i_9_ - 1), i_5_,
					i_5_ - (-i_8_ - -1), i_4_, i_7_,
					i_6_));
			    else {
				Class318_Sub1_Sub3_Sub1 class318_sub1_sub3_sub1
				    = (new Class318_Sub1_Sub3_Sub1
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, i,
					-1 + (i_9_ + i), i_5_,
					-1 + i_5_ + i_8_, i_4_, i_7_, bool));
				class318_sub1_sub3 = class318_sub1_sub3_sub1;
				if (class318_sub1_sub3_sub1.method38(-18443))
				    class318_sub1_sub3_sub1
					.method44(i_3_ + 786, var_ha);
			    }
			    Class89.method850(class318_sub1_sub3, false);
			    if (Class348_Sub42_Sub3.aBoolean9498
				&& !((Class237) this).aBoolean3109
				&& (i_4_ ^ 0xffffffff) <= -13
				&& (i_4_ ^ 0xffffffff) >= -18 && i_4_ != 13
				&& i_0_ > 0
				&& ((((ObjectDefinition) class51).anInt955 ^ 0xffffffff)
				    != -1))
				((Class237) this).aByteArrayArrayArray3108
				    [i_0_][i][i_5_]
				    = (byte) (Class273.method2057
					      ((((Class237) this)
						.aByteArrayArrayArray3108[i_0_]
						[i][i_5_]),
					       4));
			    if (((((ObjectDefinition) class51).anInt920 ^ 0xffffffff)
				 != -1)
				&& class361 != null)
				class361.method3505(!(((ObjectDefinition) class51)
						      .aBoolean876),
						    i_9_, i_5_, true, i,
						    (((ObjectDefinition) class51)
						     .aBoolean896),
						    i_8_);
			} else if ((i_4_ ^ 0xffffffff) == -1) {
			    int i_22_ = ((ObjectDefinition) class51).anInt955;
			    if (Class348_Sub40_Sub10.aBoolean9184
				&& ((((ObjectDefinition) class51).anInt955 ^ 0xffffffff)
				    == 0))
				i_22_ = 1;
			    Class318_Sub1_Sub4 class318_sub1_sub4;
			    if (!bool_17_)
				class318_sub1_sub4
				    = (new Class318_Sub1_Sub4_Sub2
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, i_4_,
					i_7_, i_6_));
			    else {
				Class318_Sub1_Sub4_Sub1 class318_sub1_sub4_sub1
				    = (new Class318_Sub1_Sub4_Sub1
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, i_4_,
					i_7_, bool));
				if (class318_sub1_sub4_sub1.method38(-18443))
				    class318_sub1_sub4_sub1.method44(836,
								     var_ha);
				class318_sub1_sub4 = class318_sub1_sub4_sub1;
			    }
			    FileRequest.method3254(i_0_, i, i_5_,
							    class318_sub1_sub4,
							    null);
			    if ((i_7_ ^ 0xffffffff) == -1) {
				if (Class348_Sub42_Sub3.aBoolean9498
				    && ((ObjectDefinition) class51).aBoolean918) {
				    var_s.ka(i, i_5_, 50);
				    var_s.ka(i, i_5_ - -1, 50);
				}
				if (i_22_ == 1
				    && !((Class237) this).aBoolean3109)
				    Class239_Sub21.method1810
					(i, ((ObjectDefinition) class51).anInt953,
					 ((ObjectDefinition) class51).anInt909, i_5_,
					 i_3_ + -51, i_0_, 1);
			    } else if (i_7_ == 1) {
				if (Class348_Sub42_Sub3.aBoolean9498
				    && ((ObjectDefinition) class51).aBoolean918) {
				    var_s.ka(i, 1 + i_5_, 50);
				    var_s.ka(1 + i, 1 + i_5_, 50);
				}
				if ((i_22_ ^ 0xffffffff) == -2
				    && !((Class237) this).aBoolean3109)
				    Class239_Sub21.method1810
					(i, -((ObjectDefinition) class51).anInt953,
					 ((ObjectDefinition) class51).anInt909,
					 1 + i_5_, -1, i_0_, 2);
			    } else if (i_7_ != 2) {
				if (i_7_ == 3) {
				    if (Class348_Sub42_Sub3.aBoolean9498
					&& ((ObjectDefinition) class51).aBoolean918) {
					var_s.ka(i, i_5_, 50);
					var_s.ka(1 + i, i_5_, 50);
				    }
				    if (i_22_ == 1
					&& !((Class237) this).aBoolean3109)
					Class239_Sub21.method1810
					    (i, ((ObjectDefinition) class51).anInt953,
					     ((ObjectDefinition) class51).anInt909,
					     i_5_, -1, i_0_, 2);
				}
			    } else {
				if (Class348_Sub42_Sub3.aBoolean9498
				    && ((ObjectDefinition) class51).aBoolean918) {
				    var_s.ka(i - -1, i_5_, 50);
				    var_s.ka(1 + i, 1 + i_5_, 50);
				}
				if (i_22_ == 1
				    && !((Class237) this).aBoolean3109)
				    Class239_Sub21.method1810
					(1 + i, -((ObjectDefinition) class51).anInt953,
					 ((ObjectDefinition) class51).anInt909, i_5_,
					 i_3_ + -51, i_0_, 1);
			    }
			    if (((ObjectDefinition) class51).anInt920 != 0
				&& class361 != null)
				class361.method3510(i_5_, i, i_3_ ^ ~0x1b,
						    i_4_, i_7_,
						    !(((ObjectDefinition) class51)
						      .aBoolean876),
						    (((ObjectDefinition) class51)
						     .aBoolean896));
			    if ((((ObjectDefinition) class51).anInt883 ^ 0xffffffff)
				!= -65)
				Class240.method1852(i_0_, i, i_5_,
						    (((ObjectDefinition) class51)
						     .anInt883));
			} else if (i_4_ == 1) {
			    Class318_Sub1_Sub4 class318_sub1_sub4;
			    if (!bool_17_)
				class318_sub1_sub4
				    = (new Class318_Sub1_Sub4_Sub2
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, i_4_,
					i_7_, i_6_));
			    else {
				Class318_Sub1_Sub4_Sub1 class318_sub1_sub4_sub1
				    = (new Class318_Sub1_Sub4_Sub1
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, i_4_,
					i_7_, bool));
				if (class318_sub1_sub4_sub1.method38(-18443))
				    class318_sub1_sub4_sub1.method44(836,
								     var_ha);
				class318_sub1_sub4 = class318_sub1_sub4_sub1;
			    }
			    FileRequest.method3254(i_0_, i, i_5_,
							    class318_sub1_sub4,
							    null);
			    if (((ObjectDefinition) class51).aBoolean918
				&& Class348_Sub42_Sub3.aBoolean9498) {
				if (i_7_ == 0)
				    var_s.ka(i, i_5_ + 1, 50);
				else if (i_7_ != 1) {
				    if ((i_7_ ^ 0xffffffff) != -3) {
					if (i_7_ == 3)
					    var_s.ka(i, i_5_, 50);
				    } else
					var_s.ka(1 + i, i_5_, 50);
				} else
				    var_s.ka(1 + i, 1 + i_5_, 50);
			    }
			    if (((((ObjectDefinition) class51).anInt920 ^ 0xffffffff)
				 != -1)
				&& class361 != null)
				class361.method3510(i_5_, i, -63, i_4_, i_7_,
						    !(((ObjectDefinition) class51)
						      .aBoolean876),
						    (((ObjectDefinition) class51)
						     .aBoolean896));
			} else if ((i_4_ ^ 0xffffffff) == -3) {
			    int i_23_ = i_7_ - -1 & 0x3;
			    Class318_Sub1_Sub4 class318_sub1_sub4;
			    Class318_Sub1_Sub4 class318_sub1_sub4_24_;
			    if (bool_17_) {
				Class318_Sub1_Sub4_Sub1 class318_sub1_sub4_sub1
				    = (new Class318_Sub1_Sub4_Sub1
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, i_4_,
					4 + i_7_, bool));
				Class318_Sub1_Sub4_Sub1 class318_sub1_sub4_sub1_25_
				    = (new Class318_Sub1_Sub4_Sub1
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, i_4_,
					i_23_, bool));
				if (class318_sub1_sub4_sub1.method38(-18443))
				    class318_sub1_sub4_sub1.method44(836,
								     var_ha);
				class318_sub1_sub4_24_
				    = class318_sub1_sub4_sub1_25_;
				class318_sub1_sub4 = class318_sub1_sub4_sub1;
				if (class318_sub1_sub4_sub1_25_
					.method38(i_3_ ^ ~0x4838))
				    class318_sub1_sub4_sub1_25_
					.method44(836, var_ha);
			    } else {
				class318_sub1_sub4
				    = (new Class318_Sub1_Sub4_Sub2
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, i_4_,
					i_7_ + 4, i_6_));
				class318_sub1_sub4_24_
				    = (new Class318_Sub1_Sub4_Sub2
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, i_4_,
					i_23_, i_6_));
			    }
			    FileRequest.method3254
				(i_0_, i, i_5_, class318_sub1_sub4,
				 class318_sub1_sub4_24_);
			    if ((((((ObjectDefinition) class51).anInt955 ^ 0xffffffff)
				  == -2)
				 || (Class348_Sub40_Sub10.aBoolean9184
				     && ((ObjectDefinition) class51).anInt955 == -1))
				&& !((Class237) this).aBoolean3109) {
				if ((i_7_ ^ 0xffffffff) != -1) {
				    if (i_7_ != 1) {
					if ((i_7_ ^ 0xffffffff) != -3) {
					    if ((i_7_ ^ 0xffffffff) == -4) {
						Class239_Sub21.method1810
						    (i,
						     (((ObjectDefinition) class51)
						      .anInt953),
						     (((ObjectDefinition) class51)
						      .anInt909),
						     i_5_, -1, i_0_, 1);
						Class239_Sub21.method1810
						    (i,
						     (((ObjectDefinition) class51)
						      .anInt953),
						     (((ObjectDefinition) class51)
						      .anInt909),
						     i_5_, -1, i_0_, 2);
					    }
					} else {
					    Class239_Sub21.method1810
						(1 + i,
						 ((ObjectDefinition) class51).anInt953,
						 ((ObjectDefinition) class51).anInt909,
						 i_5_, -1, i_0_, 1);
					    Class239_Sub21.method1810
						(i,
						 ((ObjectDefinition) class51).anInt953,
						 ((ObjectDefinition) class51).anInt909,
						 i_5_, -1, i_0_, 2);
					}
				    } else {
					Class239_Sub21.method1810
					    (1 + i,
					     ((ObjectDefinition) class51).anInt953,
					     ((ObjectDefinition) class51).anInt909,
					     i_5_, -1, i_0_, 1);
					Class239_Sub21.method1810
					    (i, ((ObjectDefinition) class51).anInt953,
					     ((ObjectDefinition) class51).anInt909,
					     i_5_ + 1, -1, i_0_, 2);
				    }
				} else {
				    Class239_Sub21.method1810
					(i, ((ObjectDefinition) class51).anInt953,
					 ((ObjectDefinition) class51).anInt909, i_5_,
					 -1, i_0_, 1);
				    Class239_Sub21.method1810
					(i, ((ObjectDefinition) class51).anInt953,
					 ((ObjectDefinition) class51).anInt909,
					 1 + i_5_, -1, i_0_, 2);
				}
			    }
			    if (((((ObjectDefinition) class51).anInt920 ^ 0xffffffff)
				 != -1)
				&& class361 != null)
				class361.method3510(i_5_, i, -102, i_4_, i_7_,
						    !(((ObjectDefinition) class51)
						      .aBoolean876),
						    (((ObjectDefinition) class51)
						     .aBoolean896));
			    if (((ObjectDefinition) class51).anInt883 != 64)
				Class240.method1852(i_0_, i, i_5_,
						    (((ObjectDefinition) class51)
						     .anInt883));
			} else if ((i_4_ ^ 0xffffffff) == -4) {
			    Class318_Sub1_Sub4 class318_sub1_sub4;
			    if (bool_17_) {
				Class318_Sub1_Sub4_Sub1 class318_sub1_sub4_sub1
				    = (new Class318_Sub1_Sub4_Sub1
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, i_4_,
					i_7_, bool));
				if (class318_sub1_sub4_sub1
					.method38(i_3_ + -18493))
				    class318_sub1_sub4_sub1.method44(836,
								     var_ha);
				class318_sub1_sub4 = class318_sub1_sub4_sub1;
			    } else
				class318_sub1_sub4
				    = (new Class318_Sub1_Sub4_Sub2
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, i_4_,
					i_7_, i_6_));
			    FileRequest.method3254(i_0_, i, i_5_,
							    class318_sub1_sub4,
							    null);
			    if (((ObjectDefinition) class51).aBoolean918
				&& Class348_Sub42_Sub3.aBoolean9498) {
				if (i_7_ == 0)
				    var_s.ka(i, 1 + i_5_, 50);
				else if ((i_7_ ^ 0xffffffff) == -2)
				    var_s.ka(1 + i, 1 + i_5_, 50);
				else if ((i_7_ ^ 0xffffffff) != -3) {
				    if (i_7_ == 3)
					var_s.ka(i, i_5_, 50);
				} else
				    var_s.ka(i + 1, i_5_, 50);
			    }
			    if (((((ObjectDefinition) class51).anInt920 ^ 0xffffffff)
				 != -1)
				&& class361 != null)
				class361.method3510(i_5_, i, i_3_ ^ ~0x46,
						    i_4_, i_7_,
						    !(((ObjectDefinition) class51)
						      .aBoolean876),
						    (((ObjectDefinition) class51)
						     .aBoolean896));
			} else if (i_4_ == 9) {
			    Class318_Sub1_Sub3 class318_sub1_sub3;
			    if (bool_17_) {
				Class318_Sub1_Sub3_Sub1 class318_sub1_sub3_sub1
				    = (new Class318_Sub1_Sub3_Sub1
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, i, i,
					i_5_, i_5_, i_4_, i_7_, bool));
				if (class318_sub1_sub3_sub1
					.method38(i_3_ + -18493))
				    class318_sub1_sub3_sub1.method44(836,
								     var_ha);
				class318_sub1_sub3 = class318_sub1_sub3_sub1;
			    } else
				class318_sub1_sub3
				    = (new Class318_Sub1_Sub3_Sub2
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, i,
					-1 + i + i_9_, i_5_, i_5_ + (i_8_ - 1),
					i_4_, i_7_, i_6_));
			    Class89.method850(class318_sub1_sub3, false);
			    if (((((ObjectDefinition) class51).anInt955 ^ 0xffffffff)
				 == -2)
				&& !((Class237) this).aBoolean3109) {
				int i_26_;
				if ((i_7_ & 0x1) == 0)
				    i_26_ = 8;
				else
				    i_26_ = 16;
				Class239_Sub21.method1810(i, 0,
							  (((ObjectDefinition) class51)
							   .anInt909),
							  i_5_, -1, i_0_,
							  i_26_);
			    }
			    if (((ObjectDefinition) class51).anInt920 != 0
				&& class361 != null)
				class361.method3505(!(((ObjectDefinition) class51)
						      .aBoolean876),
						    i_9_, i_5_, true, i,
						    (((ObjectDefinition) class51)
						     .aBoolean896),
						    i_8_);
			    if (((ObjectDefinition) class51).anInt883 != 64)
				Class240.method1852(i_0_, i, i_5_,
						    (((ObjectDefinition) class51)
						     .anInt883));
			} else if ((i_4_ ^ 0xffffffff) == -5) {
			    Class318_Sub1_Sub5 class318_sub1_sub5;
			    if (!bool_17_)
				class318_sub1_sub5
				    = (new Class318_Sub1_Sub5_Sub2
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, 0, 0,
					i_4_, i_7_, i_6_));
			    else {
				Class318_Sub1_Sub5_Sub1 class318_sub1_sub5_sub1
				    = (new Class318_Sub1_Sub5_Sub1
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, 0, 0,
					i_4_, i_7_));
				if (class318_sub1_sub5_sub1.method38(-18443))
				    class318_sub1_sub5_sub1
					.method44(i_3_ + 786, var_ha);
				class318_sub1_sub5 = class318_sub1_sub5_sub1;
			    }
			    Class44.method388(i_0_, i, i_5_,
					      class318_sub1_sub5, null);
			} else if ((i_4_ ^ 0xffffffff) == -6) {
			    int i_27_ = 65;
			    Interface10 interface10
				= ((Interface10)
				   r_Sub2.method3297(i_0_, i, i_5_));
			    if (interface10 != null)
				i_27_ = 1 + (((ObjectDefinition)
					      (Class348_Sub40_Sub12
						   .objectLoader.getObject
					       (0, interface10.method42(-93))))
					     .anInt883);
			    Class318_Sub1_Sub5 class318_sub1_sub5;
			    if (bool_17_) {
				Class318_Sub1_Sub5_Sub1 class318_sub1_sub5_sub1
				    = (new Class318_Sub1_Sub5_Sub1
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109,
					i_27_ * Class148.anIntArray2039[i_7_],
					(Class348_Sub40_Sub16.anIntArray9230
					 [i_7_]) * i_27_,
					i_4_, i_7_));
				if (class318_sub1_sub5_sub1.method38(-18443))
				    class318_sub1_sub5_sub1.method44(836,
								     var_ha);
				class318_sub1_sub5 = class318_sub1_sub5_sub1;
			    } else
				class318_sub1_sub5
				    = (new Class318_Sub1_Sub5_Sub2
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109,
					Class148.anIntArray2039[i_7_] * i_27_,
					i_27_ * (Class348_Sub40_Sub16
						 .anIntArray9230[i_7_]),
					i_4_, i_7_, i_6_));
			    Class44.method388(i_0_, i, i_5_,
					      class318_sub1_sub5, null);
			} else if (i_4_ == 6) {
			    int i_28_ = 33;
			    Interface10 interface10
				= ((Interface10)
				   r_Sub2.method3297(i_0_, i, i_5_));
			    if (interface10 != null)
				i_28_
				    = 1 + (((ObjectDefinition)
					    (Class348_Sub40_Sub12
						 .objectLoader.getObject
					     (0, interface10.method42(-117))))
					   .anInt883) / 2;
			    Class318_Sub1_Sub5 class318_sub1_sub5;
			    if (bool_17_) {
				Class318_Sub1_Sub5_Sub1 class318_sub1_sub5_sub1
				    = (new Class318_Sub1_Sub5_Sub1
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109,
					i_28_ * Class148.anIntArray2039[i_7_],
					(Class348_Sub40_Sub16.anIntArray9230
					 [i_7_]) * i_28_,
					i_4_, 4 + i_7_));
				if (class318_sub1_sub5_sub1.method38(-18443))
				    class318_sub1_sub5_sub1.method44(836,
								     var_ha);
				class318_sub1_sub5 = class318_sub1_sub5_sub1;
			    } else
				class318_sub1_sub5
				    = (new Class318_Sub1_Sub5_Sub2
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109,
					(OutputStream_Sub1.anIntArray99[i_7_]
					 * i_28_),
					i_28_ * Class273.anIntArray5165[i_7_],
					i_4_, 4 + i_7_, i_6_));
			    Class44.method388(i_0_, i, i_5_,
					      class318_sub1_sub5, null);
			} else if ((i_4_ ^ 0xffffffff) == -8) {
			    int i_29_ = 0x3 & 2 + i_7_;
			    Class318_Sub1_Sub5 class318_sub1_sub5;
			    if (!bool_17_)
				class318_sub1_sub5
				    = (new Class318_Sub1_Sub5_Sub2
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, 0, 0,
					i_4_, 4 + i_29_, i_6_));
			    else {
				Class318_Sub1_Sub5_Sub1 class318_sub1_sub5_sub1
				    = (new Class318_Sub1_Sub5_Sub1
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, 0, 0,
					i_4_, 4 + i_29_));
				if (class318_sub1_sub5_sub1
					.method38(i_3_ ^ ~0x4838))
				    class318_sub1_sub5_sub1.method44(836,
								     var_ha);
				class318_sub1_sub5 = class318_sub1_sub5_sub1;
			    }
			    Class44.method388(i_0_, i, i_5_,
					      class318_sub1_sub5, null);
			} else if (i_4_ == 8) {
			    int i_30_ = 2 + i_7_ & 0x3;
			    int i_31_ = 33;
			    Interface10 interface10
				= ((Interface10)
				   r_Sub2.method3297(i_0_, i, i_5_));
			    if (interface10 != null)
				i_31_ = (((ObjectDefinition)
					  (Class348_Sub40_Sub12
					       .objectLoader.getObject
					   (i_3_ + -50,
					    interface10.method42(-122))))
					 .anInt883) / 2 + 1;
			    Class318_Sub1_Sub5 class318_sub1_sub5;
			    Class318_Sub1_Sub5 class318_sub1_sub5_32_;
			    if (!bool_17_) {
				Class318_Sub1_Sub5_Sub2 class318_sub1_sub5_sub2
				    = (new Class318_Sub1_Sub5_Sub2
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109,
					i_31_ * (OutputStream_Sub1.anIntArray99
						 [i_7_]),
					i_31_ * Class273.anIntArray5165[i_7_],
					i_4_, i_7_ - -4, i_6_));
				Class318_Sub1_Sub5_Sub2 class318_sub1_sub5_sub2_33_
				    = (new Class318_Sub1_Sub5_Sub2
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, 0, 0,
					i_4_, i_30_ + 4, i_6_));
				class318_sub1_sub5_32_
				    = class318_sub1_sub5_sub2;
				class318_sub1_sub5
				    = class318_sub1_sub5_sub2_33_;
			    } else {
				Class318_Sub1_Sub5_Sub1 class318_sub1_sub5_sub1
				    = (new Class318_Sub1_Sub5_Sub1
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109,
					i_31_ * (OutputStream_Sub1.anIntArray99
						 [i_7_]),
					Class273.anIntArray5165[i_7_] * i_31_,
					i_4_, 4 + i_7_));
				Class318_Sub1_Sub5_Sub1 class318_sub1_sub5_sub1_34_
				    = (new Class318_Sub1_Sub5_Sub1
				       (var_ha, class51, i_0_, i_2_, i_15_,
					i_14_, i_16_,
					((Class237) this).aBoolean3109, 0, 0,
					i_4_, 4 + i_30_));
				if (class318_sub1_sub5_sub1.method38(-18443))
				    class318_sub1_sub5_sub1.method44(836,
								     var_ha);
				if (class318_sub1_sub5_sub1_34_
					.method38(i_3_ ^ ~0x4838))
				    class318_sub1_sub5_sub1_34_
					.method44(836, var_ha);
				class318_sub1_sub5
				    = class318_sub1_sub5_sub1_34_;
				class318_sub1_sub5_32_
				    = class318_sub1_sub5_sub1;
			    }
			    Class44.method388(i_0_, i, i_5_,
					      class318_sub1_sub5_32_,
					      class318_sub1_sub5);
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("vaa.W(" + i + ',' + i_0_ + ','
					     + i_1_ + ','
					     + (var_ha != null ? "{...}"
						: "null")
					     + ',' + i_2_ + ',' + i_3_ + ','
					     + i_4_ + ',' + i_5_ + ',' + i_6_
					     + ',' + i_7_ + ','
					     + (class361 != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    private final Interface10 method1690(int i, int i_35_, int i_36_,
					 int i_37_, int i_38_) {
	anInt5822++;
	Interface10 interface10 = null;
	if ((i ^ 0xffffffff) == -1)
	    interface10 = (Interface10) r_Sub2.method3297(i_37_, i_36_, i_35_);
	if (i == 1)
	    interface10
		= (Interface10) Class348_Sub40_Sub32.method3135(i_37_, i_36_,
								i_35_);
	if (i == 2)
	    interface10
		= ((Interface10)
		   Class177.method1353(i_37_, i_36_, i_35_,
				       (aClass5827 != null ? aClass5827
					: (aClass5827
					   = method1699("Interface10")))));
	if (i_38_ != 30987)
	    method1698(-120);
	if ((i ^ 0xffffffff) == -4)
	    interface10
		= (Interface10) Class348_Sub16_Sub3.method2878(i_37_, i_36_,
							       i_35_);
	return interface10;
    }
    
    final void method1691(int i, AbstractToolkit var_ha, ByteBuffer class348_sub49,
			  int[] is, int i_39_, byte i_40_) {
	do {
	    try {
		anInt5818++;
		if (!((Class237) this).aBoolean3109) {
		    boolean bool = false;
		    Class190 class190 = null;
		    int i_41_ = -112 / ((-71 - i_40_) / 38);
		    if (is != null)
			is[0] = -1;
		    while (((((ByteBuffer) class348_sub49)
			     .payload).length
			    ^ 0xffffffff)
			   < (((ByteBuffer) class348_sub49).position
			      ^ 0xffffffff)) {
			int i_42_ = class348_sub49.getUByte();
			if ((i_42_ ^ 0xffffffff) == -1)
			    class190 = new Class190(class348_sub49);
			else if ((i_42_ ^ 0xffffffff) != -2) {
			    if ((i_42_ ^ 0xffffffff) == -3) {
				if (class190 == null)
				    class190 = new Class190();
				class190.method1423(8, class348_sub49);
			    } else if (i_42_ != 128) {
				if ((i_42_ ^ 0xffffffff) == -130) {
				    if ((((Class237) this)
					 .aByteArrayArrayArray3104)
					== null)
					((Class237) this)
					    .aByteArrayArrayArray3104
					    = new byte[4][][];
				    for (int i_43_ = 0;
					 (i_43_ ^ 0xffffffff) > -5; i_43_++) {
					byte i_44_
					    = class348_sub49.getByte();
					if (i_44_ != 0
					    || (((Class237) this)
						.aByteArrayArrayArray3104
						[i_43_]) == null) {
					    if ((i_44_ ^ 0xffffffff) != -2) {
						if (i_44_ == 2) {
						    if ((((Class237) this)
							 .aByteArrayArrayArray3104
							 [i_43_])
							== null)
							((Class237) this)
							    .aByteArrayArrayArray3104
							    [i_43_]
							    = (new byte
							       [((((Class237)
								   this)
								  .anInt3117)
								 - -1)]
							       [((((Class237)
								   this)
								  .anInt3114)
								 + 1)]);
						    if ((i_43_ ^ 0xffffffff)
							< -1) {
							int i_45_ = i_39_;
							int i_46_ = 64 + i_39_;
							int i_47_ = i;
							if ((i_46_
							     ^ 0xffffffff)
							    <= -1) {
							    if ((((Class237)
								  this)
								 .anInt3117)
								<= i_46_)
								i_46_
								    = (((Class237)
									this)
								       .anInt3117);
							} else
							    i_46_ = 0;
							if (i_47_ < 0)
							    i_47_ = 0;
							else if ((((Class237)
								   this)
								  .anInt3114)
								 <= i_47_)
							    i_47_
								= (((Class237)
								    this)
								   .anInt3114);
							int i_48_ = 64 + i;
							if (i_45_ >= 0) {
							    if ((i_45_
								 ^ 0xffffffff)
								<= ((((Class237)
								      this)
								     .anInt3117)
								    ^ 0xffffffff))
								i_45_
								    = (((Class237)
									this)
								       .anInt3117);
							} else
							    i_45_ = 0;
							if (i_48_ >= 0) {
							    if (i_48_
								>= (((Class237)
								     this)
								    .anInt3114))
								i_48_
								    = (((Class237)
									this)
								       .anInt3114);
							} else
							    i_48_ = 0;
							for (/**/;
							     ((i_45_
							       ^ 0xffffffff)
							      > (i_46_
								 ^ 0xffffffff));
							     i_45_++) {
							    for (/**/;
								 ((i_47_
								   ^ 0xffffffff)
								  > (i_48_
								     ^ 0xffffffff));
								 i_47_++)
								((Class237)
								 this)
								    .aByteArrayArrayArray3104
								    [i_43_]
								    [i_45_]
								    [i_47_]
								    = (((Class237)
									this)
								       .aByteArrayArrayArray3104
								       [(-1
									 + i_43_)]
								       [i_45_]
								       [i_47_]);
							}
						    }
						}
					    } else {
						if ((((Class237) this)
						     .aByteArrayArrayArray3104
						     [i_43_])
						    == null)
						    ((Class237) this)
							.aByteArrayArrayArray3104
							[i_43_]
							= (new byte
							   [1 + (((Class237)
								  this)
								 .anInt3117)]
							   [1 + (((Class237)
								  this)
								 .anInt3114)]);
						for (int i_49_ = 0;
						     ((i_49_ ^ 0xffffffff)
						      > -65);
						     i_49_ += 4) {
						    for (int i_50_ = 0;
							 ((i_50_ ^ 0xffffffff)
							  > -65);
							 i_50_ += 4) {
							byte i_51_
							    = (class348_sub49
								   .getByte
							       ());
							for (int i_52_
								 = (i_49_
								    + i_39_);
							     (((4 + i_49_
								+ i_39_)
							       ^ 0xffffffff)
							      < (i_52_
								 ^ 0xffffffff));
							     i_52_++) {
							    for (int i_53_
								     = i + i_50_;
								 ((i_53_
								   ^ 0xffffffff)
								  > ((4 + i
								      + i_50_)
								     ^ 0xffffffff));
								 i_53_++) {
								if (i_52_ >= 0
								    && ((i_52_
									 ^ 0xffffffff)
									> (((Class237)
									    this).anInt3117
									   ^ 0xffffffff))
								    && (i_53_
									>= 0)
								    && (i_53_
									< (((Class237)
									    this)
									   .anInt3114)))
								    ((Class237)
								     this)
									.aByteArrayArrayArray3104
									[i_43_]
									[i_52_]
									[i_53_]
									= i_51_;
							    }
							}
						    }
						}
					    }
					} else {
					    int i_54_ = i_39_;
					    int i_55_ = i_39_ - -64;
					    int i_56_ = i;
					    if ((i_56_ ^ 0xffffffff) > -1)
						i_56_ = 0;
					    else if ((i_56_ ^ 0xffffffff)
						     <= ((((Class237) this)
							  .anInt3114)
							 ^ 0xffffffff))
						i_56_ = (((Class237) this)
							 .anInt3114);
					    if (i_54_ >= 0) {
						if ((i_54_ ^ 0xffffffff)
						    <= ((((Class237) this)
							 .anInt3117)
							^ 0xffffffff))
						    i_54_ = (((Class237) this)
							     .anInt3117);
					    } else
						i_54_ = 0;
					    int i_57_ = i - -64;
					    if (i_55_ < 0)
						i_55_ = 0;
					    else if (i_55_
						     >= (((Class237) this)
							 .anInt3117))
						i_55_ = (((Class237) this)
							 .anInt3117);
					    if ((i_57_ ^ 0xffffffff) > -1)
						i_57_ = 0;
					    else if ((i_57_ ^ 0xffffffff)
						     <= ((((Class237) this)
							  .anInt3114)
							 ^ 0xffffffff))
						i_57_ = (((Class237) this)
							 .anInt3114);
					    for (/**/; i_54_ < i_55_;
						 i_54_++) {
						for (/**/; i_57_ > i_56_;
						     i_56_++)
						    ((Class237) this)
							.aByteArrayArrayArray3104
							[i_43_][i_54_][i_56_]
							= (byte) 0;
					    }
					}
				    }
				    bool = true;
				} else
				    throw new IllegalStateException("");
			    } else if (is != null) {
				is[0] = class348_sub49.getShort();
				is[1] = class348_sub49.method3372(13638);
				is[2] = class348_sub49.method3372(13638);
				is[3] = class348_sub49.method3372(13638);
				is[4] = class348_sub49.getShort();
			    } else
				((ByteBuffer) class348_sub49).position
				    += 10;
			} else {
			    int i_58_ = class348_sub49.getUByte();
			    if ((i_58_ ^ 0xffffffff) < -1) {
				for (int i_59_ = 0; i_58_ > i_59_; i_59_++) {
				    Class211 class211
					= new Class211(var_ha, class348_sub49,
						       2);
				    if (((Class211) class211).anInt2734
					== 31) {
					Class253 class253
					    = (Class348_Sub1.aClass185_6559
						   .method1391
					       ((byte) -1,
						class348_sub49
						    .getShort()));
					class211.method1539
					    (((Class253) class253).anInt3251,
					     (byte) 115,
					     ((Class253) class253).anInt3249,
					     ((Class253) class253).anInt3245,
					     ((Class253) class253).anInt3244);
				    }
				    if (var_ha.method3704() > 0) {
					Class348_Sub1 class348_sub1
					    = (((Class211) class211)
					       .aClass348_Sub1_2745);
					int i_60_
					    = ((i_39_ << 242363433)
					       + class348_sub1.method2724(-1));
					int i_61_ = (class348_sub1
							 .method2717((byte) 93)
						     + (i << -1030098167));
					int i_62_ = i_60_ >> 1935424617;
					int i_63_ = i_61_ >> 836557641;
					if ((i_62_ ^ 0xffffffff) <= -1
					    && (i_63_ ^ 0xffffffff) <= -1
					    && (((Class237) this).anInt3117
						> i_62_)
					    && (((Class237) this).anInt3114
						> i_63_)) {
					    class348_sub1.method2725
						(i_60_, (byte) 70, i_61_,
						 ((((Class237) this)
						   .anIntArrayArrayArray3122
						   [(((Class211) class211)
						     .anInt2731)]
						   [i_62_][i_63_])
						  + -class348_sub1
							 .method2722(120)));
					    ClientScript
						.method3276(class211);
					}
				    }
				}
			    }
			}
		    }
		    if (class190 != null) {
			for (int i_64_ = 0; i_64_ < 8; i_64_++) {
			    for (int i_65_ = 0; i_65_ < 8; i_65_++) {
				int i_66_ = i_64_ + (i_39_ >> 1316882563);
				int i_67_ = (i >> -1715812765) - -i_65_;
				if (i_66_ >= 0
				    && ((i_66_ ^ 0xffffffff)
					> ((((Class237) this).anInt3117
					    >> -976492157)
					   ^ 0xffffffff))
				    && i_67_ >= 0
				    && ((((Class237) this).anInt3114
					 >> -2027336509)
					^ 0xffffffff) < (i_67_ ^ 0xffffffff))
				    Class5_Sub2.method192(class190, 10000,
							  i_66_, i_67_);
			    }
			}
		    }
		    if (bool
			|| ((Class237) this).aByteArrayArrayArray3104 == null)
			break;
		    for (int i_68_ = 0; i_68_ < 4; i_68_++) {
			if (((Class237) this).aByteArrayArrayArray3104[i_68_]
			    != null) {
			    for (int i_69_ = 0; (i_69_ ^ 0xffffffff) > -17;
				 i_69_++) {
				for (int i_70_ = 0; (i_70_ ^ 0xffffffff) > -17;
				     i_70_++) {
				    int i_71_ = (i_39_ >> 272531234) + i_69_;
				    int i_72_ = i_70_ + (i >> -126225918);
				    if (i_71_ >= 0
					&& (i_71_ ^ 0xffffffff) > -27
					&& i_72_ >= 0
					&& (i_72_ ^ 0xffffffff) > -27)
					((Class237) this)
					    .aByteArrayArrayArray3104[i_68_]
					    [i_71_][i_72_]
					    = (byte) 0;
				}
			    }
			}
		    }
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929
			  (runtimeexception,
			   ("vaa.AA(" + i + ','
			    + (var_ha != null ? "{...}" : "null") + ','
			    + (class348_sub49 != null ? "{...}" : "null") + ','
			    + (is != null ? "{...}" : "null") + ',' + i_39_
			    + ',' + i_40_ + ')'));
	    }
	    break;
	} while (false);
    }
    
    final void method1692(int i, int i_73_, byte[] is, int i_74_, int i_75_,
			  AbstractToolkit var_ha, int i_76_, int i_77_, int i_78_,
			  Class361[] class361s, int i_79_) {
	try {
	    anInt5826++;
	    if (i_78_ != 7)
		method1693('\uffb8', -54);
	    ByteBuffer class348_sub49 = new ByteBuffer(is);
	    int i_80_ = -1;
	    for (;;) {
		int i_81_ = class348_sub49.method3334(-85);
		if ((i_81_ ^ 0xffffffff) == -1)
		    break;
		i_80_ += i_81_;
		int i_82_ = 0;
		for (;;) {
		    int i_83_ = class348_sub49.getSmartA();
		    if (i_83_ == 0)
			break;
		    i_82_ += -1 + i_83_;
		    int i_84_ = i_82_ & 0x3f;
		    int i_85_ = i_82_ >> -2140633114 & 0x3f;
		    int i_86_ = i_82_ >> -1732605940;
		    int i_87_ = class348_sub49.getUByte();
		    int i_88_ = i_87_ >> -518193950;
		    int i_89_ = i_87_ & 0x3;
		    if (i_74_ == i_86_
			&& (i_85_ ^ 0xffffffff) <= (i ^ 0xffffffff)
			&& i - -8 > i_85_
			&& (i_84_ ^ 0xffffffff) <= (i_75_ ^ 0xffffffff)
			&& (i_84_ ^ 0xffffffff) > (i_75_ - -8 ^ 0xffffffff)) {
			ObjectDefinition class51 = Class348_Sub40_Sub12
					      .objectLoader
					      .getObject(0, i_80_);
			int i_90_
			    = Class249.method1908(0x7 & i_84_, i_85_ & 0x7,
						  i_73_, true,
						  ((ObjectDefinition) class51).anInt926,
						  ((ObjectDefinition) class51).anInt961,
						  i_89_) + i_77_;
			int i_91_
			    = i_76_ + GametipLoader.method1045(0x7 & i_85_,
							  (((ObjectDefinition) class51)
							   .anInt926),
							  i_89_,
							  (((ObjectDefinition) class51)
							   .anInt961),
							  i_84_ & 0x7, i_73_,
							  (byte) 16);
			if (i_90_ > 0 && i_91_ > 0
			    && i_90_ < -1 + ((Class237) this).anInt3117
			    && -1 + ((Class237) this).anInt3114 > i_91_) {
			    Class361 class361 = null;
			    if (!((Class237) this).aBoolean3109) {
				int i_92_ = i_79_;
				if ((0x2
				     & (Class348_Sub33.aByteArrayArrayArray6962
					[1][i_90_][i_91_]))
				    == 2)
				    i_92_--;
				if ((i_92_ ^ 0xffffffff) <= -1)
				    class361 = class361s[i_92_];
			    }
			    method1689(i_90_, i_79_, i_80_, var_ha, i_79_, 50,
				       i_88_, i_91_, -1, i_89_ - -i_73_ & 0x3,
				       class361);
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("vaa.S(" + i + ',' + i_73_ + ','
					     + (is != null ? "{...}" : "null")
					     + ',' + i_74_ + ',' + i_75_ + ','
					     + (var_ha != null ? "{...}"
						: "null")
					     + ',' + i_76_ + ',' + i_77_ + ','
					     + i_78_ + ','
					     + (class361s != null ? "{...}"
						: "null")
					     + ',' + i_79_ + ')'));
	}
    }
    
    static final boolean method1693(char c, int i) {
	anInt5815++;
	if (i > -100)
	    method1693('\uffa3', 97);
	if (c >= 32 && c <= 126)
	    return true;
	if (c >= 160 && (c ^ 0xffffffff) >= -256)
	    return true;
	if (c == 8364 || (c ^ 0xffffffff) == -339 || (c ^ 0xffffffff) == -8213
	    || c == 339 || (c ^ 0xffffffff) == -377)
	    return true;
	return false;
    }
    
    final void method1694(Class361 class361, int i, int i_93_, AbstractToolkit var_ha,
			  int i_94_, int i_95_, byte i_96_) {
    while_77_:
	do {
	    do {
		try {
		    anInt5817++;
		    Interface10 interface10
			= method1690(i, i_95_, i_94_, i_93_, 30987);
		    if (i_96_ <= 66)
			anInt5819 = -107;
		    if (interface10 == null)
			break while_77_;
		    ObjectDefinition class51
			= Class348_Sub40_Sub12.objectLoader
			      .getObject(0, interface10.method42(-89));
		    int i_97_ = interface10.method39(-128);
		    int i_98_ = interface10.method41(-32228);
		    if (class51.method474((byte) -50))
			AbtractArchiveLoader.method2336(class51, i_94_, i_95_, i_93_,
					    -128);
		    if (interface10.method38(-18443))
			interface10.method43(var_ha, -14218);
		    if (i == 0) {
			Class348_Sub40_Sub4.method3058(i_93_, i_94_, i_95_);
			if ((((ObjectDefinition) class51).anInt920 ^ 0xffffffff) != -1)
			    class361.method3506((((ObjectDefinition) class51)
						 .aBoolean896),
						i_98_, i_94_, i_97_, i_95_,
						!(((ObjectDefinition) class51)
						  .aBoolean876),
						29216);
			if ((((ObjectDefinition) class51).anInt955 ^ 0xffffffff)
			    == -2) {
			    if (i_98_ != 0) {
				if ((i_98_ ^ 0xffffffff) != -2) {
				    if (i_98_ != 2) {
					if (i_98_ == 3)
					    Class348_Sub23_Sub4.method2987
						(i_93_, 2, i_95_, -3951,
						 i_94_);
				    } else
					Class348_Sub23_Sub4.method2987
					    (i_93_, 1, i_95_, -3951,
					     1 + i_94_);
				} else
				    Class348_Sub23_Sub4.method2987(i_93_, 2,
								   1 + i_95_,
								   -3951,
								   i_94_);
			    } else {
				Class348_Sub23_Sub4.method2987(i_93_, 1, i_95_,
							       -3951, i_94_);
				break;
			    }
			    break;
			}
		    } else {
			if ((i ^ 0xffffffff) != -2) {
			    if (i != 2) {
				if ((i ^ 0xffffffff) == -4) {
				    Class348_Sub16_Sub3
					.method2879(i_93_, i_94_, i_95_);
				    if (((ObjectDefinition) class51).anInt920 == 1)
					class361.method3499((byte) -52, i_94_,
							    i_95_);
				}
			    } else {
				FileRequest.method3253
				    (i_93_, i_94_, i_95_,
				     (aClass5827 != null ? aClass5827
				      : (aClass5827
					 = method1699("Interface10"))));
				if ((((ObjectDefinition) class51).anInt920
				     ^ 0xffffffff) != -1
				    && (((ObjectDefinition) class51).anInt961 + i_94_
					< ((Class237) this).anInt3117)
				    && (i_95_ - -((ObjectDefinition) class51).anInt961
					< ((Class237) this).anInt3114)
				    && (((ObjectDefinition) class51).anInt926 + i_94_
					< ((Class237) this).anInt3117)
				    && (((Class237) this).anInt3114
					> (i_95_
					   + ((ObjectDefinition) class51).anInt926)))
				    class361.method3509
					(i_98_,
					 !((ObjectDefinition) class51).aBoolean876,
					 ((ObjectDefinition) class51).aBoolean896,
					 i_94_, i_95_,
					 ((ObjectDefinition) class51).anInt926, 84,
					 ((ObjectDefinition) class51).anInt961);
				if (i_97_ != 9)
				    break;
				if ((0x1 & i_98_) != 0)
				    Class348_Sub23_Sub4.method2987(i_93_, 16,
								   i_95_,
								   -3951,
								   i_94_);
				else
				    Class348_Sub23_Sub4.method2987(i_93_, 8,
								   i_95_,
								   -3951,
								   i_94_);
			    }
			    break;
			}
			Class286_Sub7.method2168(i_93_, i_94_, i_95_);
		    }
		} catch (RuntimeException runtimeexception) {
		    throw Class348_Sub17.method2929(runtimeexception,
						    ("vaa.U("
						     + (class361 != null
							? "{...}" : "null")
						     + ',' + i + ',' + i_93_
						     + ','
						     + (var_ha != null
							? "{...}" : "null")
						     + ',' + i_94_ + ','
						     + i_95_ + ',' + i_96_
						     + ')'));
		}
	    } while (false);
	    break;
	} while (false);
    }
    
    final void method1695(byte[] is, Class361[] class361s, int i, AbstractToolkit var_ha,
			  int i_99_, int i_100_) {
	try {
	    anInt5820++;
	    if (i_100_ == 1359) {
		ByteBuffer class348_sub49 = new ByteBuffer(is);
		int i_101_ = -1;
		for (;;) {
		    int i_102_ = class348_sub49.method3334(-57);
		    if (i_102_ == 0)
			break;
		    i_101_ += i_102_;
		    int i_103_ = 0;
		    for (;;) {
			int i_104_ = class348_sub49.getSmartA();
			if ((i_104_ ^ 0xffffffff) == -1)
			    break;
			i_103_ += i_104_ + -1;
			int i_105_ = 0x3f & i_103_;
			int i_106_ = i_103_ >> 664943686 & 0x3f;
			int i_107_ = i_103_ >> -106385364;
			int i_108_ = class348_sub49.getUByte();
			int i_109_ = i_108_ >> -126132382;
			int i_110_ = 0x3 & i_108_;
			int i_111_ = i_99_ + i_106_;
			int i_112_ = i + i_105_;
			if (i_111_ > 0 && (i_112_ ^ 0xffffffff) < -1
			    && ((((Class237) this).anInt3117 - 1 ^ 0xffffffff)
				< (i_111_ ^ 0xffffffff))
			    && i_112_ < ((Class237) this).anInt3114 - 1) {
			    Class361 class361 = null;
			    if (!((Class237) this).aBoolean3109) {
				int i_113_ = i_107_;
				if ((0x2
				     & (Class348_Sub33.aByteArrayArrayArray6962
					[1][i_111_][i_112_]))
				    == 2)
				    i_113_--;
				if ((i_113_ ^ 0xffffffff) <= -1)
				    class361 = class361s[i_113_];
			    }
			    method1689(i_111_, i_107_, i_101_, var_ha, i_107_,
				       i_100_ ^ 0x57d, i_109_, i_112_, -1,
				       i_110_, class361);
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("vaa.R(" + (is != null ? "{...}" : "null") + ','
			+ (class361s != null ? "{...}" : "null") + ',' + i
			+ ',' + (var_ha != null ? "{...}" : "null") + ','
			+ i_99_ + ',' + i_100_ + ')'));
	}
    }
    
    Class237_Sub1(int i, int i_114_, int i_115_, boolean bool) {
	super(i, i_114_, i_115_, bool, Class229.aClass268_2979,
	      Class362.aClass183_4460);
    }
    
    final void method1696(ByteBuffer class348_sub49, boolean bool, int i,
			  int i_116_, int i_117_, int i_118_, int i_119_,
			  int i_120_, AbstractToolkit var_ha, int[] is, int i_121_) {
	do {
	    try {
		anInt5825++;
		if (!((Class237) this).aBoolean3109) {
		    boolean bool_122_ = bool;
		    Class190 class190 = null;
		    if (is != null)
			is[0] = -1;
		    int i_123_ = 8 * (0x7 & i_116_);
		    int i_124_ = (i & 0x7) * 8;
		    while ((((ByteBuffer) class348_sub49)
			    .payload).length
			   > ((ByteBuffer) class348_sub49).position) {
			int i_125_ = class348_sub49.getUByte();
			if ((i_125_ ^ 0xffffffff) != -1) {
			    if (i_125_ == 1) {
				int i_126_ = class348_sub49.getUByte();
				if (i_126_ > 0) {
				    for (int i_127_ = 0;
					 ((i_127_ ^ 0xffffffff)
					  > (i_126_ ^ 0xffffffff));
					 i_127_++) {
					Class211 class211
					    = new Class211(var_ha,
							   class348_sub49, 2);
					if (((Class211) class211).anInt2734
					    == 31) {
					    Class253 class253
						= (Class348_Sub1
						       .aClass185_6559
						       .method1391
						   ((byte) 111,
						    (class348_sub49.getShort
						     ())));
					    class211.method1539
						((((Class253) class253)
						  .anInt3251),
						 (byte) 124,
						 (((Class253) class253)
						  .anInt3249),
						 (((Class253) class253)
						  .anInt3245),
						 (((Class253) class253)
						  .anInt3244));
					}
					if ((var_ha.method3704() ^ 0xffffffff)
					    < -1) {
					    Class348_Sub1 class348_sub1
						= (((Class211) class211)
						   .aClass348_Sub1_2745);
					    int i_128_
						= (class348_sub1.method2724(-1)
						   >> 1484065129);
					    int i_129_
						= (class348_sub1
						       .method2717((byte) 79)
						   >> -758650679);
					    if ((((((Class211) class211)
						   .anInt2731)
						  ^ 0xffffffff)
						 == (i_121_ ^ 0xffffffff))
						&& ((i_128_ ^ 0xffffffff)
						    <= (i_123_ ^ 0xffffffff))
						&& ((i_128_ ^ 0xffffffff)
						    > (i_123_ + 8
						       ^ 0xffffffff))
						&& i_124_ <= i_129_
						&& ((i_129_ ^ 0xffffffff)
						    > (i_124_ - -8
						       ^ 0xffffffff))) {
						int i_130_
						    = ((i_117_ << 1020027113)
						       + (Class149.method1201
							  ((0xfff
							    & (class348_sub1
								   .method2717
							       ((byte) 95))),
							   (0xfff
							    & (class348_sub1
								   .method2724
							       (-1))),
							   -2, i_119_)));
						int i_131_
						    = ((i_120_ << -1600541655)
						       + (Class119_Sub2
							      .method1079
							  (4095, i_119_,
							   (0xfff
							    & (class348_sub1
								   .method2717
							       ((byte) 119))),
							   (0xfff
							    & (class348_sub1
								   .method2724
							       (-1))))));
						i_128_ = i_130_ >> 983466441;
						i_129_ = i_131_ >> 1974667721;
						if (i_128_ >= 0
						    && ((i_129_ ^ 0xffffffff)
							<= -1)
						    && (i_128_
							< (((Class237) this)
							   .anInt3117))
						    && ((i_129_ ^ 0xffffffff)
							> ((((Class237) this)
							    .anInt3114)
							   ^ 0xffffffff))) {
						    class348_sub1.method2725
							(i_130_, (byte) 70,
							 i_131_,
							 ((((Class237) this)
							   .anIntArrayArrayArray3122
							   [i_121_][i_128_]
							   [i_129_])
							  - (class348_sub1
								 .method2722
							     (124))));
						    ClientScript
							.method3276(class211);
						}
					    }
					}
				    }
				}
			    } else if ((i_125_ ^ 0xffffffff) == -3) {
				if (class190 == null)
				    class190 = new Class190();
				class190.method1423(8, class348_sub49);
			    } else if (i_125_ == 128) {
				if (is != null) {
				    is[0]
					= class348_sub49.getShort();
				    is[1] = class348_sub49.method3372(13638);
				    is[2] = class348_sub49.method3372(13638);
				    is[3] = class348_sub49.method3372(13638);
				    is[4]
					= class348_sub49.getShort();
				} else
				    ((ByteBuffer) class348_sub49).position
					+= 10;
			    } else if (i_125_ == 129) {
				if (((Class237) this).aByteArrayArrayArray3104
				    == null)
				    ((Class237) this).aByteArrayArrayArray3104
					= new byte[4][][];
				for (int i_132_ = 0; i_132_ < 4; i_132_++) {
				    byte i_133_
					= class348_sub49.getByte();
				    if ((i_133_ ^ 0xffffffff) == -1
					&& ((((Class237) this)
					     .aByteArrayArrayArray3104[i_118_])
					    != null)) {
					if (i_121_ >= i_132_) {
					    int i_134_ = i_117_;
					    int i_135_ = i_117_ - -7;
					    int i_136_ = i_120_;
					    if ((i_135_ ^ 0xffffffff) <= -1) {
						if (((Class237) this).anInt3117
						    <= i_135_)
						    i_135_ = (((Class237) this)
							      .anInt3117);
					    } else
						i_135_ = 0;
					    if (i_134_ < 0)
						i_134_ = 0;
					    else if (((((Class237) this)
						       .anInt3117)
						      ^ 0xffffffff)
						     >= (i_134_ ^ 0xffffffff))
						i_134_ = (((Class237) this)
							  .anInt3117);
					    int i_137_ = i_120_ - -7;
					    if ((i_136_ ^ 0xffffffff) > -1)
						i_136_ = 0;
					    else if ((i_136_ ^ 0xffffffff)
						     <= ((((Class237) this)
							  .anInt3114)
							 ^ 0xffffffff))
						i_136_ = (((Class237) this)
							  .anInt3114);
					    if ((i_137_ ^ 0xffffffff) <= -1) {
						if (i_137_
						    >= (((Class237) this)
							.anInt3114))
						    i_137_ = (((Class237) this)
							      .anInt3114);
					    } else
						i_137_ = 0;
					    for (/**/;
						 ((i_135_ ^ 0xffffffff)
						  < (i_134_ ^ 0xffffffff));
						 i_134_++) {
						for (/**/; i_136_ < i_137_;
						     i_136_++)
						    ((Class237) this)
							.aByteArrayArrayArray3104
							[i_118_][i_134_]
							[i_136_]
							= (byte) 0;
					    }
					}
				    } else if ((i_133_ ^ 0xffffffff) == -2) {
					if ((((Class237) this)
					     .aByteArrayArrayArray3104[i_118_])
					    == null)
					    ((Class237) this)
						.aByteArrayArrayArray3104
						[i_118_]
						= (new byte
						   [(((Class237) this)
						     .anInt3117) + 1]
						   [1 + (((Class237) this)
							 .anInt3114)]);
					for (int i_138_ = 0;
					     (i_138_ ^ 0xffffffff) > -65;
					     i_138_ += 4) {
					    for (int i_139_ = 0;
						 (i_139_ ^ 0xffffffff) > -65;
						 i_139_ += 4) {
						byte i_140_
						    = class348_sub49
							  .getByte();
						if (i_132_ <= i_121_) {
						    for (int i_141_ = i_138_;
							 ((i_138_ - -4
							   ^ 0xffffffff)
							  < (i_141_
							     ^ 0xffffffff));
							 i_141_++) {
							for (int i_142_
								 = i_139_;
							     ((i_139_ - -4
							       ^ 0xffffffff)
							      < (i_142_
								 ^ 0xffffffff));
							     i_142_++) {
							    if (((i_123_
								  ^ 0xffffffff)
								 >= (i_141_
								     ^ 0xffffffff))
								&& (i_141_
								    < 8 + i_123_)
								&& (i_124_
								    <= i_142_)
								&& ((i_124_
								     ^ 0xffffffff)
								    > (8 + i_124_
								       ^ 0xffffffff))) {
								int i_143_
								    = (i_117_
								       - -(Class295.method2220
									   ((0x7
									     & i_142_),
									    i_119_,
									    (i_141_
									     & 0x7),
									    (byte) 71)));
								int i_144_
								    = (i_120_
								       + (AnimationLoader
									      .method837
									  ((i_141_
									    & 0x7),
									   true,
									   (0x7
									    & i_142_),
									   i_119_)));
								if (i_143_ >= 0
								    && ((i_143_
									 ^ 0xffffffff)
									> (((Class237)
									    this).anInt3117
									   ^ 0xffffffff))
								    && ((i_144_
									 ^ 0xffffffff)
									<= -1)
								    && ((((Class237)
									  this)
									 .anInt3114)
									> i_144_))
								    ((Class237)
								     this)
									.aByteArrayArrayArray3104
									[i_118_]
									[i_143_]
									[i_144_]
									= i_140_;
							    }
							}
						    }
						}
					    }
					}
				    }
				}
			    } else
				throw new IllegalStateException("");
			} else
			    class190 = new Class190(class348_sub49);
		    }
		    if (class190 != null)
			Class5_Sub2.method192(class190, 10000,
					      i_117_ >> -1830399805,
					      i_120_ >> 1365636387);
		    if (bool_122_
			|| ((Class237) this).aByteArrayArrayArray3104 == null
			|| (((Class237) this).aByteArrayArrayArray3104[i_118_]
			    == null))
			break;
		    int i_145_ = 7 + i_117_;
		    int i_146_ = 7 + i_120_;
		    for (int i_147_ = i_117_;
			 (i_147_ ^ 0xffffffff) > (i_145_ ^ 0xffffffff);
			 i_147_++) {
			for (int i_148_ = i_120_; i_148_ < i_146_; i_148_++)
			    ((Class237) this).aByteArrayArrayArray3104
				[i_118_][i_147_][i_148_]
				= (byte) 0;
		    }
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929
			  (runtimeexception,
			   ("vaa.O("
			    + (class348_sub49 != null ? "{...}" : "null") + ','
			    + bool + ',' + i + ',' + i_116_ + ',' + i_117_
			    + ',' + i_118_ + ',' + i_119_ + ',' + i_120_ + ','
			    + (var_ha != null ? "{...}" : "null") + ','
			    + (is != null ? "{...}" : "null") + ',' + i_121_
			    + ')'));
	    }
	    break;
	} while (false);
    }
    
    final void method1697(boolean bool, AbstractToolkit var_ha, int i) {
	try {
	    Class342.method2686();
	    anInt5816++;
	    if (!bool) {
		if ((((Class237) this).anInt3130 ^ 0xffffffff) < -2) {
		    for (int i_149_ = 0; ((Class237) this).anInt3117 > i_149_;
			 i_149_++) {
			for (int i_150_ = 0;
			     ((Class237) this).anInt3114 > i_150_; i_150_++) {
			    if ((0x2 & (Class348_Sub33.aByteArrayArrayArray6962
					[1][i_149_][i_150_]))
				== 2)
				Class16.method258(i_149_, i_150_);
			}
		    }
		}
		for (int i_151_ = 0;
		     ((i_151_ ^ 0xffffffff)
		      > (((Class237) this).anInt3130 ^ 0xffffffff));
		     i_151_++) {
		    for (int i_152_ = 0; ((Class237) this).anInt3114 >= i_152_;
			 i_152_++) {
			for (int i_153_ = 0;
			     ((i_153_ ^ 0xffffffff)
			      >= (((Class237) this).anInt3117 ^ 0xffffffff));
			     i_153_++) {
			    if ((0x4 & (((Class237) this)
					.aByteArrayArrayArray3108[i_151_]
					[i_153_][i_152_])
				 ^ 0xffffffff)
				!= -1) {
				int i_154_ = i_153_;
				int i_155_ = i_153_;
				int i_156_ = i_152_;
				int i_157_ = i_152_;
				for (/**/;
				     (i_156_ > 0
				      && ((((Class237) this)
					   .aByteArrayArrayArray3108[i_151_]
					   [i_153_][-1 + i_156_]) & 0x4
					  ^ 0xffffffff) != -1);
				     i_156_--) {
				    if (i_157_ - i_156_ >= 10)
					break;
				}
				for (/**/;
				     (((Class237) this).anInt3114 > i_157_
				      && (0x4
					  & (((Class237) this)
					     .aByteArrayArrayArray3108[i_151_]
					     [i_153_][i_157_ + 1])) != 0);
				     i_157_++) {
				    if ((-i_156_ + i_157_ ^ 0xffffffff) <= -11)
					break;
				}
			    while_78_:
				for (/**/; (i_154_ ^ 0xffffffff) < -1;
				     i_154_--) {
				    if (i_155_ + -i_154_ >= 10)
					break;
				    for (int i_158_ = i_156_;
					 ((i_157_ ^ 0xffffffff)
					  <= (i_158_ ^ 0xffffffff));
					 i_158_++) {
					if (((((Class237) this)
					      .aByteArrayArrayArray3108[i_151_]
					      [-1 + i_154_][i_158_]) & 0x4
					     ^ 0xffffffff)
					    == -1)
					    break while_78_;
				    }
				}
			    while_79_:
				for (/**/;
				     (i_155_ < ((Class237) this).anInt3117
				      && -i_154_ + i_155_ < 10);
				     i_155_++) {
				    for (int i_159_ = i_156_;
					 ((i_159_ ^ 0xffffffff)
					  >= (i_157_ ^ 0xffffffff));
					 i_159_++) {
					if (((((Class237) this)
					      .aByteArrayArrayArray3108[i_151_]
					      [i_155_ + 1][i_159_])
					     & 0x4)
					    == 0)
					    break while_79_;
				    }
				}
				if (((1 + (-i_156_ + i_157_))
				     * (i_155_ + (-i_154_ + 1)))
				    >= 4) {
				    int i_160_ = (((Class237) this)
						  .anIntArrayArrayArray3122
						  [i_151_][i_154_][i_156_]);
				    Class258_Sub3.method1966
					(512 + (i_155_ << -20246743), i_160_,
					 i_156_ << 247045161, i_160_, (byte) 0,
					 4, (i_157_ << 1504508777) + 512,
					 i_151_, i_154_ << -460697143);
				    for (int i_161_ = i_154_;
					 ((i_155_ ^ 0xffffffff)
					  <= (i_161_ ^ 0xffffffff));
					 i_161_++) {
					for (int i_162_ = i_156_;
					     ((i_162_ ^ 0xffffffff)
					      >= (i_157_ ^ 0xffffffff));
					     i_162_++)
					    ((Class237) this)
						.aByteArrayArrayArray3108
						[i_151_][i_161_][i_162_]
						= (byte) (Class139.method1166
							  ((((Class237) this)
							    .aByteArrayArrayArray3108
							    [i_151_][i_161_]
							    [i_162_]),
							   -5));
				    }
				}
			    }
			}
		    }
		}
		Class328_Sub3.method2616(12);
	    }
	    if (i < -6)
		((Class237) this).aByteArrayArrayArray3108 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("vaa.T(" + bool + ','
					     + (var_ha != null ? "{...}"
						: "null")
					     + ',' + i + ')'));
	}
    }
    
    public static void method1698(int i) {
	aClass341_5821 = null;
	if (i != 1)
	    method1698(-10);
    }
    
    /*synthetic*/ static Class method1699(String string) {
	try {
	    return Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
