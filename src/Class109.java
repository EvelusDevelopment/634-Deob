/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class109
{
    int anInt1665;
    private SoftwareToolkit aHa_Sub1_1666;
    boolean aBoolean1667 = false;
    int anInt1668;
    boolean aBoolean1669;
    private Class167 aClass167_1670;
    boolean aBoolean1671;
    int anInt1672;
    private int[] anIntArray1673;
    int anInt1674 = 0;
    private boolean aBoolean1675 = false;
    int[] anIntArray1676 = new int[4096];
    private float[] aFloatArray1677;
    private int anInt1678;
    int anInt1679;
    private boolean aBoolean1680;
    private float aFloat1681;
    private float aFloat1682;
    private int anInt1683;
    private float aFloat1684;
    private int[] anIntArray1685;
    private int anInt1686;
    private int anInt1687;
    private int anInt1688;
    private int anInt1689;
    private int anInt1690;
    private int anInt1691;
    private int[] anIntArray1692;
    private int anInt1693;
    private boolean aBoolean1694;
    private int anInt1695;
    private int anInt1696;
    private int anInt1697;
    private int[] anIntArray1698;
    
    private final void method1016
	(int[] is, int[] is_0_, int i, int i_1_, int i_2_, float f, float f_3_,
	 float f_4_, float f_5_, float f_6_, float f_7_, float f_8_,
	 float f_9_, float f_10_, float f_11_, float f_12_, float f_13_,
	 float f_14_, float f_15_, float f_16_, float f_17_) {
	int i_18_ = i_2_ - i_1_;
	float f_19_ = 1.0F / (float) i_18_;
	float f_20_ = (f_3_ - f) * f_19_;
	float f_21_ = (f_5_ - f_4_) * f_19_;
	float f_22_ = (f_7_ - f_6_) * f_19_;
	float f_23_ = (f_9_ - f_8_) * f_19_;
	float f_24_ = (f_11_ - f_10_) * f_19_;
	float f_25_ = (f_13_ - f_12_) * f_19_;
	float f_26_ = (f_15_ - f_14_) * f_19_;
	float f_27_ = (f_17_ - f_16_) * f_19_;
	if (((Class109) this).aBoolean1671) {
	    if (i_2_ > ((Class109) this).anInt1679)
		i_2_ = ((Class109) this).anInt1679;
	    if (i_1_ < 0) {
		f -= f_20_ * (float) i_1_;
		f_4_ -= f_21_ * (float) i_1_;
		f_6_ -= f_22_ * (float) i_1_;
		f_8_ -= f_23_ * (float) i_1_;
		f_10_ -= f_24_ * (float) i_1_;
		f_12_ -= f_25_ * (float) i_1_;
		f_14_ -= f_26_ * (float) i_1_;
		f_16_ -= f_27_ * (float) i_1_;
		i_1_ = 0;
	    }
	}
	if (i_1_ < i_2_) {
	    i_18_ = i_2_ - i_1_;
	    i += i_1_;
	    while (i_18_-- > 0) {
		float f_28_ = 1.0F / f;
		if (f_28_ < aFloatArray1677[i]) {
		    int i_29_ = (int) (f_4_ * f_28_ * (float) anInt1693);
		    if (aBoolean1694)
			i_29_ &= anInt1690;
		    else if (i_29_ < 0)
			i_29_ = 0;
		    else if (i_29_ > anInt1690)
			i_29_ = anInt1690;
		    int i_30_ = (int) (f_6_ * f_28_ * (float) anInt1693);
		    if (aBoolean1694)
			i_30_ &= anInt1690;
		    else if (i_30_ < 0)
			i_30_ = 0;
		    else if (i_30_ > anInt1690)
			i_30_ = anInt1690;
		    int i_31_ = anIntArray1698[i_30_ * anInt1693 + i_29_];
		    int i_32_ = 255;
		    if (anInt1683 == 2)
			i_32_ = i_31_ >> 24 & 0xff;
		    else if (anInt1683 == 1)
			i_32_ = i_31_ == 0 ? 0 : 255;
		    else
			i_32_ = (int) f_10_;
		    if (i_32_ != 0) {
			if (i_32_ != 255) {
			    int i_33_
				= (~0xffffff
				   | ((int) (f_12_ * (float) (i_31_ >> 16
							      & 0xff)) << 8
				      & 0xff0000)
				   | (int) (f_14_ * (float) (i_31_ >> 8
							     & 0xff)) & 0xff00
				   | ((int) (f_16_ * (float) (i_31_ & 0xff))
				      >> 8));
			    if (f_8_ != 0.0F) {
				int i_34_ = (int) (255.0F - f_8_);
				int i_35_
				    = ((((anInt1696 & 0xff00ff) * (int) f_8_
					 & ~0xff00ff)
					| ((anInt1696 & 0xff00) * (int) f_8_
					   & 0xff0000))
				       >>> 8);
				i_33_
				    = (((i_33_ & 0xff00ff) * i_34_ & ~0xff00ff
					| (i_33_ & 0xff00) * i_34_ & 0xff0000)
				       >>> 8) + i_35_;
			    }
			    int i_36_ = is[i];
			    int i_37_ = 255 - i_32_;
			    i_33_ = ((((i_36_ & 0xff00ff) * i_37_
				       + (i_33_ & 0xff00ff) * i_32_)
				      & ~0xff00ff)
				     + (((i_36_ & 0xff00) * i_37_
					 + (i_33_ & 0xff00) * i_32_)
					& 0xff0000)) >> 8;
			    is[i] = i_33_;
			    aFloatArray1677[i] = f_28_;
			} else {
			    int i_38_
				= (~0xffffff
				   | ((int) (f_12_ * (float) (i_31_ >> 16
							      & 0xff)) << 8
				      & 0xff0000)
				   | (int) (f_14_ * (float) (i_31_ >> 8
							     & 0xff)) & 0xff00
				   | ((int) (f_16_ * (float) (i_31_ & 0xff))
				      >> 8));
			    if (f_8_ != 0.0F) {
				int i_39_ = (int) (255.0F - f_8_);
				int i_40_
				    = ((((anInt1696 & 0xff00ff) * (int) f_8_
					 & ~0xff00ff)
					| ((anInt1696 & 0xff00) * (int) f_8_
					   & 0xff0000))
				       >>> 8);
				i_38_
				    = (((i_38_ & 0xff00ff) * i_39_ & ~0xff00ff
					| (i_38_ & 0xff00) * i_39_ & 0xff0000)
				       >>> 8) + i_40_;
			    }
			    is[i] = i_38_;
			    aFloatArray1677[i] = f_28_;
			}
		    }
		}
		i++;
		f += f_20_;
		f_4_ += f_21_;
		f_6_ += f_22_;
		f_8_ += f_23_;
		f_10_ += f_24_;
		f_12_ += f_25_;
		f_14_ += f_26_;
		f_16_ += f_27_;
	    }
	}
    }
    
    final int method1017() {
	return ((Class109) this).anIntArray1676[0] / anInt1678;
    }
    
    final void method1018(float f, float f_41_, float f_42_, float f_43_,
			  float f_44_, float f_45_, float f_46_, float f_47_,
			  float f_48_, int i) {
	if (aBoolean1675) {
	    aHa_Sub1_1666.method3645((int) f, (int) f_43_, (int) f_44_, -8003,
				     i, (int) f_41_);
	    aHa_Sub1_1666.method3645((int) f_41_, (int) f_44_, (int) f_45_,
				     -8003, i, (int) f_42_);
	    aHa_Sub1_1666.method3645((int) f_42_, (int) f_45_, (int) f_43_,
				     -8003, i, (int) f);
	} else {
	    float f_49_ = f_44_ - f_43_;
	    float f_50_ = f_41_ - f;
	    float f_51_ = f_45_ - f_43_;
	    float f_52_ = f_42_ - f;
	    float f_53_ = f_47_ - f_46_;
	    float f_54_ = f_48_ - f_46_;
	    float f_55_ = 0.0F;
	    if (f_41_ != f)
		f_55_ = (f_44_ - f_43_) / (f_41_ - f);
	    float f_56_ = 0.0F;
	    if (f_42_ != f_41_)
		f_56_ = (f_45_ - f_44_) / (f_42_ - f_41_);
	    float f_57_ = 0.0F;
	    if (f_42_ != f)
		f_57_ = (f_43_ - f_45_) / (f - f_42_);
	    float f_58_ = f_49_ * f_52_ - f_51_ * f_50_;
	    if (f_58_ != 0.0F) {
		float f_59_ = (f_53_ * f_52_ - f_54_ * f_50_) / f_58_;
		float f_60_ = (f_54_ * f_49_ - f_53_ * f_51_) / f_58_;
		if (f <= f_41_ && f <= f_42_) {
		    if (!(f >= (float) ((Class109) this).anInt1672)) {
			if (f_41_ > (float) ((Class109) this).anInt1672)
			    f_41_ = (float) ((Class109) this).anInt1672;
			if (f_42_ > (float) ((Class109) this).anInt1672)
			    f_42_ = (float) ((Class109) this).anInt1672;
			f_46_ = f_46_ - f_59_ * f_43_ + f_59_;
			if (f_41_ < f_42_) {
			    f_45_ = f_43_;
			    if (f < 0.0F) {
				f_45_ -= f_57_ * f;
				f_43_ -= f_55_ * f;
				f_46_ -= f_60_ * f;
				f = 0.0F;
			    }
			    if (f_41_ < 0.0F) {
				f_44_ -= f_56_ * f_41_;
				f_41_ = 0.0F;
			    }
			    if (f != f_41_ && f_57_ < f_55_
				|| f == f_41_ && f_57_ > f_56_) {
				f_42_ -= f_41_;
				f_41_ -= f;
				f = (float) (((Class109) this).anIntArray1676
					     [(int) f]);
				while (--f_41_ >= 0.0F) {
				    method1026(anIntArray1673, aFloatArray1677,
					       (int) f, i, 0, (int) f_45_,
					       (int) f_43_, f_46_, f_59_);
				    f_45_ += f_57_;
				    f_43_ += f_55_;
				    f_46_ += f_60_;
				    f += (float) anInt1678;
				}
				while (--f_42_ >= 0.0F) {
				    method1026(anIntArray1673, aFloatArray1677,
					       (int) f, i, 0, (int) f_45_,
					       (int) f_44_, f_46_, f_59_);
				    f_45_ += f_57_;
				    f_44_ += f_56_;
				    f_46_ += f_60_;
				    f += (float) anInt1678;
				}
			    } else {
				f_42_ -= f_41_;
				f_41_ -= f;
				f = (float) (((Class109) this).anIntArray1676
					     [(int) f]);
				while (--f_41_ >= 0.0F) {
				    method1026(anIntArray1673, aFloatArray1677,
					       (int) f, i, 0, (int) f_43_,
					       (int) f_45_, f_46_, f_59_);
				    f_45_ += f_57_;
				    f_43_ += f_55_;
				    f_46_ += f_60_;
				    f += (float) anInt1678;
				}
				while (--f_42_ >= 0.0F) {
				    method1026(anIntArray1673, aFloatArray1677,
					       (int) f, i, 0, (int) f_44_,
					       (int) f_45_, f_46_, f_59_);
				    f_45_ += f_57_;
				    f_44_ += f_56_;
				    f_46_ += f_60_;
				    f += (float) anInt1678;
				}
			    }
			} else {
			    f_44_ = f_43_;
			    if (f < 0.0F) {
				f_44_ -= f_57_ * f;
				f_43_ -= f_55_ * f;
				f_46_ -= f_60_ * f;
				f = 0.0F;
			    }
			    if (f_42_ < 0.0F) {
				f_45_ -= f_56_ * f_42_;
				f_42_ = 0.0F;
			    }
			    if (f != f_42_ && f_57_ < f_55_
				|| f == f_42_ && f_56_ > f_55_) {
				f_41_ -= f_42_;
				f_42_ -= f;
				f = (float) (((Class109) this).anIntArray1676
					     [(int) f]);
				while (--f_42_ >= 0.0F) {
				    method1026(anIntArray1673, aFloatArray1677,
					       (int) f, i, 0, (int) f_44_,
					       (int) f_43_, f_46_, f_59_);
				    f_44_ += f_57_;
				    f_43_ += f_55_;
				    f_46_ += f_60_;
				    f += (float) anInt1678;
				}
				while (--f_41_ >= 0.0F) {
				    method1026(anIntArray1673, aFloatArray1677,
					       (int) f, i, 0, (int) f_45_,
					       (int) f_43_, f_46_, f_59_);
				    f_45_ += f_56_;
				    f_43_ += f_55_;
				    f_46_ += f_60_;
				    f += (float) anInt1678;
				}
			    } else {
				f_41_ -= f_42_;
				f_42_ -= f;
				f = (float) (((Class109) this).anIntArray1676
					     [(int) f]);
				while (--f_42_ >= 0.0F) {
				    method1026(anIntArray1673, aFloatArray1677,
					       (int) f, i, 0, (int) f_43_,
					       (int) f_44_, f_46_, f_59_);
				    f_44_ += f_57_;
				    f_43_ += f_55_;
				    f_46_ += f_60_;
				    f += (float) anInt1678;
				}
				while (--f_41_ >= 0.0F) {
				    method1026(anIntArray1673, aFloatArray1677,
					       (int) f, i, 0, (int) f_43_,
					       (int) f_45_, f_46_, f_59_);
				    f_45_ += f_56_;
				    f_43_ += f_55_;
				    f_46_ += f_60_;
				    f += (float) anInt1678;
				}
			    }
			}
		    }
		} else if (f_41_ <= f_42_) {
		    if (!(f_41_ >= (float) ((Class109) this).anInt1672)) {
			if (f_42_ > (float) ((Class109) this).anInt1672)
			    f_42_ = (float) ((Class109) this).anInt1672;
			if (f > (float) ((Class109) this).anInt1672)
			    f = (float) ((Class109) this).anInt1672;
			f_47_ = f_47_ - f_59_ * f_44_ + f_59_;
			if (f_42_ < f) {
			    f_43_ = f_44_;
			    if (f_41_ < 0.0F) {
				f_43_ -= f_55_ * f_41_;
				f_44_ -= f_56_ * f_41_;
				f_47_ -= f_60_ * f_41_;
				f_41_ = 0.0F;
			    }
			    if (f_42_ < 0.0F) {
				f_45_ -= f_57_ * f_42_;
				f_42_ = 0.0F;
			    }
			    if (f_41_ != f_42_ && f_55_ < f_56_
				|| f_41_ == f_42_ && f_55_ > f_57_) {
				f -= f_42_;
				f_42_ -= f_41_;
				f_41_ = (float) (((Class109) this)
						 .anIntArray1676[(int) f_41_]);
				while (--f_42_ >= 0.0F) {
				    method1026(anIntArray1673, aFloatArray1677,
					       (int) f_41_, i, 0, (int) f_43_,
					       (int) f_44_, f_47_, f_59_);
				    f_43_ += f_55_;
				    f_44_ += f_56_;
				    f_47_ += f_60_;
				    f_41_ += (float) anInt1678;
				}
				while (--f >= 0.0F) {
				    method1026(anIntArray1673, aFloatArray1677,
					       (int) f_41_, i, 0, (int) f_43_,
					       (int) f_45_, f_47_, f_59_);
				    f_43_ += f_55_;
				    f_45_ += f_57_;
				    f_47_ += f_60_;
				    f_41_ += (float) anInt1678;
				}
			    } else {
				f -= f_42_;
				f_42_ -= f_41_;
				f_41_ = (float) (((Class109) this)
						 .anIntArray1676[(int) f_41_]);
				while (--f_42_ >= 0.0F) {
				    method1026(anIntArray1673, aFloatArray1677,
					       (int) f_41_, i, 0, (int) f_44_,
					       (int) f_43_, f_47_, f_59_);
				    f_43_ += f_55_;
				    f_44_ += f_56_;
				    f_47_ += f_60_;
				    f_41_ += (float) anInt1678;
				}
				while (--f >= 0.0F) {
				    method1026(anIntArray1673, aFloatArray1677,
					       (int) f_41_, i, 0, (int) f_45_,
					       (int) f_43_, f_47_, f_59_);
				    f_43_ += f_55_;
				    f_45_ += f_57_;
				    f_47_ += f_60_;
				    f_41_ += (float) anInt1678;
				}
			    }
			} else {
			    f_45_ = f_44_;
			    if (f_41_ < 0.0F) {
				f_45_ -= f_55_ * f_41_;
				f_44_ -= f_56_ * f_41_;
				f_47_ -= f_60_ * f_41_;
				f_41_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_43_ -= f_57_ * f;
				f = 0.0F;
			    }
			    if (f_55_ < f_56_) {
				f_42_ -= f;
				f -= f_41_;
				f_41_ = (float) (((Class109) this)
						 .anIntArray1676[(int) f_41_]);
				while (--f >= 0.0F) {
				    method1026(anIntArray1673, aFloatArray1677,
					       (int) f_41_, i, 0, (int) f_45_,
					       (int) f_44_, f_47_, f_59_);
				    f_45_ += f_55_;
				    f_44_ += f_56_;
				    f_47_ += f_60_;
				    f_41_ += (float) anInt1678;
				}
				while (--f_42_ >= 0.0F) {
				    method1026(anIntArray1673, aFloatArray1677,
					       (int) f_41_, i, 0, (int) f_43_,
					       (int) f_44_, f_47_, f_59_);
				    f_43_ += f_57_;
				    f_44_ += f_56_;
				    f_47_ += f_60_;
				    f_41_ += (float) anInt1678;
				}
			    } else {
				f_42_ -= f;
				f -= f_41_;
				f_41_ = (float) (((Class109) this)
						 .anIntArray1676[(int) f_41_]);
				while (--f >= 0.0F) {
				    method1026(anIntArray1673, aFloatArray1677,
					       (int) f_41_, i, 0, (int) f_44_,
					       (int) f_45_, f_47_, f_59_);
				    f_45_ += f_55_;
				    f_44_ += f_56_;
				    f_47_ += f_60_;
				    f_41_ += (float) anInt1678;
				}
				while (--f_42_ >= 0.0F) {
				    method1026(anIntArray1673, aFloatArray1677,
					       (int) f_41_, i, 0, (int) f_44_,
					       (int) f_43_, f_47_, f_59_);
				    f_43_ += f_57_;
				    f_44_ += f_56_;
				    f_47_ += f_60_;
				    f_41_ += (float) anInt1678;
				}
			    }
			}
		    }
		} else if (!(f_42_ >= (float) ((Class109) this).anInt1672)) {
		    if (f > (float) ((Class109) this).anInt1672)
			f = (float) ((Class109) this).anInt1672;
		    if (f_41_ > (float) ((Class109) this).anInt1672)
			f_41_ = (float) ((Class109) this).anInt1672;
		    f_48_ = f_48_ - f_59_ * f_45_ + f_59_;
		    if (f < f_41_) {
			f_44_ = f_45_;
			if (f_42_ < 0.0F) {
			    f_44_ -= f_56_ * f_42_;
			    f_45_ -= f_57_ * f_42_;
			    f_48_ -= f_60_ * f_42_;
			    f_42_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_43_ -= f_55_ * f;
			    f = 0.0F;
			}
			if (f_56_ < f_57_) {
			    f_41_ -= f;
			    f -= f_42_;
			    f_42_ = (float) (((Class109) this).anIntArray1676
					     [(int) f_42_]);
			    while (--f >= 0.0F) {
				method1026(anIntArray1673, aFloatArray1677,
					   (int) f_42_, i, 0, (int) f_44_,
					   (int) f_45_, f_48_, f_59_);
				f_44_ += f_56_;
				f_45_ += f_57_;
				f_48_ += f_60_;
				f_42_ += (float) anInt1678;
			    }
			    while (--f_41_ >= 0.0F) {
				method1026(anIntArray1673, aFloatArray1677,
					   (int) f_42_, i, 0, (int) f_44_,
					   (int) f_43_, f_48_, f_59_);
				f_44_ += f_56_;
				f_43_ += f_55_;
				f_48_ += f_60_;
				f_42_ += (float) anInt1678;
			    }
			} else {
			    f_41_ -= f;
			    f -= f_42_;
			    f_42_ = (float) (((Class109) this).anIntArray1676
					     [(int) f_42_]);
			    while (--f >= 0.0F) {
				method1026(anIntArray1673, aFloatArray1677,
					   (int) f_42_, i, 0, (int) f_45_,
					   (int) f_44_, f_48_, f_59_);
				f_44_ += f_56_;
				f_45_ += f_57_;
				f_48_ += f_60_;
				f_42_ += (float) anInt1678;
			    }
			    while (--f_41_ >= 0.0F) {
				method1026(anIntArray1673, aFloatArray1677,
					   (int) f_42_, i, 0, (int) f_43_,
					   (int) f_44_, f_48_, f_59_);
				f_44_ += f_56_;
				f_43_ += f_55_;
				f_48_ += f_60_;
				f_42_ += (float) anInt1678;
			    }
			}
		    } else {
			f_43_ = f_45_;
			if (f_42_ < 0.0F) {
			    f_43_ -= f_56_ * f_42_;
			    f_45_ -= f_57_ * f_42_;
			    f_48_ -= f_60_ * f_42_;
			    f_42_ = 0.0F;
			}
			if (f_41_ < 0.0F) {
			    f_44_ -= f_55_ * f_41_;
			    f_41_ = 0.0F;
			}
			if (f_56_ < f_57_) {
			    f -= f_41_;
			    f_41_ -= f_42_;
			    f_42_ = (float) (((Class109) this).anIntArray1676
					     [(int) f_42_]);
			    while (--f_41_ >= 0.0F) {
				method1026(anIntArray1673, aFloatArray1677,
					   (int) f_42_, i, 0, (int) f_43_,
					   (int) f_45_, f_48_, f_59_);
				f_43_ += f_56_;
				f_45_ += f_57_;
				f_48_ += f_60_;
				f_42_ += (float) anInt1678;
			    }
			    while (--f >= 0.0F) {
				method1026(anIntArray1673, aFloatArray1677,
					   (int) f_42_, i, 0, (int) f_44_,
					   (int) f_45_, f_48_, f_59_);
				f_44_ += f_55_;
				f_45_ += f_57_;
				f_48_ += f_60_;
				f_42_ += (float) anInt1678;
			    }
			} else {
			    f -= f_41_;
			    f_41_ -= f_42_;
			    f_42_ = (float) (((Class109) this).anIntArray1676
					     [(int) f_42_]);
			    while (--f_41_ >= 0.0F) {
				method1026(anIntArray1673, aFloatArray1677,
					   (int) f_42_, i, 0, (int) f_45_,
					   (int) f_43_, f_48_, f_59_);
				f_43_ += f_56_;
				f_45_ += f_57_;
				f_48_ += f_60_;
				f_42_ += (float) anInt1678;
			    }
			    while (--f >= 0.0F) {
				method1026(anIntArray1673, aFloatArray1677,
					   (int) f_42_, i, 0, (int) f_45_,
					   (int) f_44_, f_48_, f_59_);
				f_44_ += f_55_;
				f_45_ += f_57_;
				f_48_ += f_60_;
				f_42_ += (float) anInt1678;
			    }
			}
		    }
		}
	    }
	}
    }
    
    private final void method1019(int[] is, float[] fs, int i, int i_61_,
				  int i_62_, int i_63_, int i_64_, float f,
				  float f_65_, float f_66_, float f_67_) {
	if (((Class109) this).aBoolean1671) {
	    if (i_64_ > ((Class109) this).anInt1679)
		i_64_ = ((Class109) this).anInt1679;
	    if (i_63_ < 0)
		i_63_ = 0;
	}
	if (i_63_ < i_64_) {
	    i += i_63_ - 1;
	    f += f_65_ * (float) i_63_;
	    f_66_ += f_67_ * (float) i_63_;
	    if (((Class167) aClass167_1670).aBoolean2202) {
		do {
		    if (((Class109) this).aBoolean1669) {
			i_62_ = i_64_ - i_63_ >> 2;
			f_65_ *= 4.0F;
			if (((Class109) this).anInt1674 == 0) {
			    if (i_62_ > 0) {
				do {
				    i_61_ = Class126.hslColorTable[(int) f];
				    f += f_65_;
				    if (f_66_ < fs[++i]) {
					is[i] = i_61_;
					fs[i] = f_66_;
				    }
				    f_66_ += f_67_;
				    if (f_66_ < fs[++i]) {
					is[i] = i_61_;
					fs[i] = f_66_;
				    }
				    f_66_ += f_67_;
				    if (f_66_ < fs[++i]) {
					is[i] = i_61_;
					fs[i] = f_66_;
				    }
				    f_66_ += f_67_;
				    if (f_66_ < fs[++i]) {
					is[i] = i_61_;
					fs[i] = f_66_;
				    }
				    f_66_ += f_67_;
				} while (--i_62_ > 0);
			    }
			    i_62_ = i_64_ - i_63_ & 0x3;
			    if (i_62_ > 0) {
				i_61_ = Class126.hslColorTable[(int) f];
				do {
				    if (f_66_ < fs[++i]) {
					is[i] = i_61_;
					fs[i] = f_66_;
				    }
				    f_66_ += f_67_;
				} while (--i_62_ > 0);
			    }
			} else {
			    int i_68_ = ((Class109) this).anInt1674;
			    int i_69_ = 256 - ((Class109) this).anInt1674;
			    if (i_62_ > 0) {
				do {
				    i_61_ = Class126.hslColorTable[(int) f];
				    f += f_65_;
				    i_61_ = (((i_61_ & 0xff00ff) * i_69_ >> 8
					      & 0xff00ff)
					     + ((i_61_ & 0xff00) * i_69_ >> 8
						& 0xff00));
				    if (f_66_ < fs[++i]) {
					int i_70_ = is[i];
					is[i]
					    = (i_61_
					       + (((i_70_ & 0xff00ff) * i_68_
						   >> 8)
						  & 0xff00ff)
					       + ((i_70_ & 0xff00) * i_68_ >> 8
						  & 0xff00));
					fs[i] = f_66_;
				    }
				    f_66_ += f_67_;
				    if (f_66_ < fs[++i]) {
					int i_71_ = is[i];
					is[i]
					    = (i_61_
					       + (((i_71_ & 0xff00ff) * i_68_
						   >> 8)
						  & 0xff00ff)
					       + ((i_71_ & 0xff00) * i_68_ >> 8
						  & 0xff00));
					fs[i] = f_66_;
				    }
				    f_66_ += f_67_;
				    if (f_66_ < fs[++i]) {
					int i_72_ = is[i];
					is[i]
					    = (i_61_
					       + (((i_72_ & 0xff00ff) * i_68_
						   >> 8)
						  & 0xff00ff)
					       + ((i_72_ & 0xff00) * i_68_ >> 8
						  & 0xff00));
					fs[i] = f_66_;
				    }
				    f_66_ += f_67_;
				    if (f_66_ < fs[++i]) {
					int i_73_ = is[i];
					is[i]
					    = (i_61_
					       + (((i_73_ & 0xff00ff) * i_68_
						   >> 8)
						  & 0xff00ff)
					       + ((i_73_ & 0xff00) * i_68_ >> 8
						  & 0xff00));
					fs[i] = f_66_;
				    }
				    f_66_ += f_67_;
				} while (--i_62_ > 0);
			    }
			    i_62_ = i_64_ - i_63_ & 0x3;
			    if (i_62_ <= 0)
				break;
			    i_61_ = Class126.hslColorTable[(int) f];
			    i_61_
				= (((i_61_ & 0xff00ff) * i_69_ >> 8 & 0xff00ff)
				   + ((i_61_ & 0xff00) * i_69_ >> 8 & 0xff00));
			    do {
				if (f_66_ < fs[++i]) {
				    int i_74_ = is[i];
				    is[i] = (i_61_
					     + ((i_74_ & 0xff00ff) * i_68_ >> 8
						& 0xff00ff)
					     + ((i_74_ & 0xff00) * i_68_ >> 8
						& 0xff00));
				    fs[i] = f_66_;
				}
				f_66_ += f_67_;
			    } while (--i_62_ > 0);
			}
			break;
		    }
		    i_62_ = i_64_ - i_63_;
		    if (((Class109) this).anInt1674 == 0) {
			do {
			    if (f_66_ < fs[++i]) {
				is[i] = Class126.hslColorTable[(int) f];
				fs[i] = f_66_;
			    }
			    f_66_ += f_67_;
			    f += f_65_;
			} while (--i_62_ > 0);
			break;
		    }
		    int i_75_ = ((Class109) this).anInt1674;
		    int i_76_ = 256 - ((Class109) this).anInt1674;
		    do {
			if (f_66_ < fs[++i]) {
			    i_61_ = Class126.hslColorTable[(int) f];
			    i_61_
				= (((i_61_ & 0xff00ff) * i_76_ >> 8 & 0xff00ff)
				   + ((i_61_ & 0xff00) * i_76_ >> 8 & 0xff00));
			    int i_77_ = is[i];
			    is[i]
				= (i_61_
				   + ((i_77_ & 0xff00ff) * i_75_ >> 8
				      & 0xff00ff)
				   + ((i_77_ & 0xff00) * i_75_ >> 8 & 0xff00));
			    fs[i] = f_66_;
			}
			f += f_65_;
			f_66_ += f_67_;
		    } while (--i_62_ > 0);
		} while (false);
	    } else {
		do {
		    if (((Class109) this).aBoolean1669) {
			i_62_ = i_64_ - i_63_ >> 2;
			f_65_ *= 4.0F;
			if (((Class109) this).anInt1674 == 0) {
			    if (i_62_ > 0) {
				do {
				    i_61_ = Class126.hslColorTable[(int) f];
				    f += f_65_;
				    if (f_66_ < fs[++i])
					is[i] = i_61_;
				    f_66_ += f_67_;
				    if (f_66_ < fs[++i])
					is[i] = i_61_;
				    f_66_ += f_67_;
				    if (f_66_ < fs[++i])
					is[i] = i_61_;
				    f_66_ += f_67_;
				    if (f_66_ < fs[++i])
					is[i] = i_61_;
				    f_66_ += f_67_;
				} while (--i_62_ > 0);
			    }
			    i_62_ = i_64_ - i_63_ & 0x3;
			    if (i_62_ > 0) {
				i_61_ = Class126.hslColorTable[(int) f];
				do {
				    if (f_66_ < fs[++i])
					is[i] = i_61_;
				    f_66_ += f_67_;
				} while (--i_62_ > 0);
			    }
			} else {
			    int i_78_ = ((Class109) this).anInt1674;
			    int i_79_ = 256 - ((Class109) this).anInt1674;
			    if (i_62_ > 0) {
				do {
				    i_61_ = Class126.hslColorTable[(int) f];
				    f += f_65_;
				    i_61_ = (((i_61_ & 0xff00ff) * i_79_ >> 8
					      & 0xff00ff)
					     + ((i_61_ & 0xff00) * i_79_ >> 8
						& 0xff00));
				    if (f_66_ < fs[++i]) {
					int i_80_ = is[i];
					is[i]
					    = (i_61_
					       + (((i_80_ & 0xff00ff) * i_78_
						   >> 8)
						  & 0xff00ff)
					       + ((i_80_ & 0xff00) * i_78_ >> 8
						  & 0xff00));
				    }
				    f_66_ += f_67_;
				    if (f_66_ < fs[++i]) {
					int i_81_ = is[i];
					is[i]
					    = (i_61_
					       + (((i_81_ & 0xff00ff) * i_78_
						   >> 8)
						  & 0xff00ff)
					       + ((i_81_ & 0xff00) * i_78_ >> 8
						  & 0xff00));
				    }
				    f_66_ += f_67_;
				    if (f_66_ < fs[++i]) {
					int i_82_ = is[i];
					is[i]
					    = (i_61_
					       + (((i_82_ & 0xff00ff) * i_78_
						   >> 8)
						  & 0xff00ff)
					       + ((i_82_ & 0xff00) * i_78_ >> 8
						  & 0xff00));
				    }
				    f_66_ += f_67_;
				    if (f_66_ < fs[++i]) {
					int i_83_ = is[i];
					is[i]
					    = (i_61_
					       + (((i_83_ & 0xff00ff) * i_78_
						   >> 8)
						  & 0xff00ff)
					       + ((i_83_ & 0xff00) * i_78_ >> 8
						  & 0xff00));
				    }
				    f_66_ += f_67_;
				} while (--i_62_ > 0);
			    }
			    i_62_ = i_64_ - i_63_ & 0x3;
			    if (i_62_ <= 0)
				break;
			    i_61_ = Class126.hslColorTable[(int) f];
			    i_61_
				= (((i_61_ & 0xff00ff) * i_79_ >> 8 & 0xff00ff)
				   + ((i_61_ & 0xff00) * i_79_ >> 8 & 0xff00));
			    do {
				if (f_66_ < fs[++i]) {
				    int i_84_ = is[i];
				    is[i] = (i_61_
					     + ((i_84_ & 0xff00ff) * i_78_ >> 8
						& 0xff00ff)
					     + ((i_84_ & 0xff00) * i_78_ >> 8
						& 0xff00));
				}
				f_66_ += f_67_;
			    } while (--i_62_ > 0);
			}
			break;
		    }
		    i_62_ = i_64_ - i_63_;
		    if (((Class109) this).anInt1674 == 0) {
			do {
			    if (f_66_ < fs[++i])
				is[i] = Class126.hslColorTable[(int) f];
			    f_66_ += f_67_;
			    f += f_65_;
			} while (--i_62_ > 0);
			break;
		    }
		    int i_85_ = ((Class109) this).anInt1674;
		    int i_86_ = 256 - ((Class109) this).anInt1674;
		    do {
			if (f_66_ < fs[++i]) {
			    i_61_ = Class126.hslColorTable[(int) f];
			    i_61_
				= (((i_61_ & 0xff00ff) * i_86_ >> 8 & 0xff00ff)
				   + ((i_61_ & 0xff00) * i_86_ >> 8 & 0xff00));
			    int i_87_ = is[i];
			    is[i]
				= (i_61_
				   + ((i_87_ & 0xff00ff) * i_85_ >> 8
				      & 0xff00ff)
				   + ((i_87_ & 0xff00) * i_85_ >> 8 & 0xff00));
			}
			f += f_65_;
			f_66_ += f_67_;
		    } while (--i_62_ > 0);
		} while (false);
	    }
	}
    }
    
    final void method1020(float f, float f_88_, float f_89_, float f_90_,
			  float f_91_, float f_92_, float f_93_, float f_94_,
			  float f_95_, float f_96_, float f_97_, float f_98_,
			  float f_99_, float f_100_, float f_101_, int i,
			  int i_102_, int i_103_, int i_104_, int i_105_,
			  int i_106_, int i_107_, int i_108_, float f_109_,
			  int i_110_, float f_111_, int i_112_, float f_113_) {
	if (i_108_ != anInt1697) {
	    anIntArray1698 = aHa_Sub1_1666.method3718(i_108_);
	    if (anIntArray1698 == null) {
		method1027((float) (int) f, (float) (int) f_88_,
			   (float) (int) f_89_, (float) (int) f_90_,
			   (float) (int) f_91_, (float) (int) f_92_,
			   (float) (int) f_93_, (float) (int) f_94_,
			   (float) (int) f_95_,
			   Class6.method206(i, i_104_ | i_105_ << 24, 255),
			   Class6.method206(i_102_, i_104_ | i_106_ << 24,
					    255),
			   Class6.method206(i_103_, i_104_ | i_107_ << 24,
					    255));
		return;
	    }
	    anInt1693 = (aHa_Sub1_1666.method3727(i_108_) ? 64
			 : ((SoftwareToolkit) aHa_Sub1_1666).anInt7501);
	    anInt1690 = anInt1693 - 1;
	    anInt1683 = aHa_Sub1_1666.method3726(i_108_);
	}
	aFloat1681 = f_109_;
	if (i_110_ != anInt1689) {
	    anIntArray1685 = aHa_Sub1_1666.method3718(i_110_);
	    if (anIntArray1685 == null) {
		method1027((float) (int) f, (float) (int) f_88_,
			   (float) (int) f_89_, (float) (int) f_90_,
			   (float) (int) f_91_, (float) (int) f_92_,
			   (float) (int) f_93_, (float) (int) f_94_,
			   (float) (int) f_95_,
			   Class6.method206(i, i_104_ | i_105_ << 24, 255),
			   Class6.method206(i_102_, i_104_ | i_106_ << 24,
					    255),
			   Class6.method206(i_103_, i_104_ | i_107_ << 24,
					    255));
		return;
	    }
	    anInt1691 = (aHa_Sub1_1666.method3727(i_110_) ? 64
			 : ((SoftwareToolkit) aHa_Sub1_1666).anInt7501);
	    anInt1686 = anInt1691 - 1;
	}
	aFloat1684 = f_111_;
	if (i_112_ != anInt1687) {
	    anIntArray1692 = aHa_Sub1_1666.method3718(i_112_);
	    if (anIntArray1692 == null) {
		method1027((float) (int) f, (float) (int) f_88_,
			   (float) (int) f_89_, (float) (int) f_90_,
			   (float) (int) f_91_, (float) (int) f_92_,
			   (float) (int) f_93_, (float) (int) f_94_,
			   (float) (int) f_95_,
			   Class6.method206(i, i_104_ | i_105_ << 24, 255),
			   Class6.method206(i_102_, i_104_ | i_106_ << 24,
					    255),
			   Class6.method206(i_103_, i_104_ | i_107_ << 24,
					    255));
		return;
	    }
	    anInt1695 = (aHa_Sub1_1666.method3727(i_112_) ? 64
			 : ((SoftwareToolkit) aHa_Sub1_1666).anInt7501);
	    anInt1688 = anInt1695 - 1;
	}
	aFloat1682 = f_113_;
	anInt1696 = i_104_;
	float f_114_ = (float) (i >> 24 & 0xff);
	float f_115_ = (float) (i_102_ >> 24 & 0xff);
	float f_116_ = (float) (i_103_ >> 24 & 0xff);
	float f_117_ = (float) (i >> 16 & 0xff);
	float f_118_ = (float) (i_102_ >> 16 & 0xff);
	float f_119_ = (float) (i_103_ >> 16 & 0xff);
	float f_120_ = (float) (i >> 8 & 0xff);
	float f_121_ = (float) (i_102_ >> 8 & 0xff);
	float f_122_ = (float) (i_103_ >> 8 & 0xff);
	float f_123_ = (float) (i & 0xff);
	float f_124_ = (float) (i_102_ & 0xff);
	float f_125_ = (float) (i_103_ & 0xff);
	f_96_ /= f_93_;
	f_97_ /= f_94_;
	f_98_ /= f_95_;
	f_99_ /= f_93_;
	f_100_ /= f_94_;
	f_101_ /= f_95_;
	f_93_ = 1.0F / f_93_;
	f_94_ = 1.0F / f_94_;
	f_95_ = 1.0F / f_95_;
	float f_126_ = 1.0F;
	float f_127_ = 0.0F;
	float f_128_ = 0.0F;
	float f_129_ = 0.0F;
	float f_130_ = 1.0F;
	float f_131_ = 0.0F;
	float f_132_ = 0.0F;
	float f_133_ = 0.0F;
	float f_134_ = 0.0F;
	float f_135_ = 0.0F;
	float f_136_ = 0.0F;
	float f_137_ = 0.0F;
	float f_138_ = 0.0F;
	float f_139_ = 0.0F;
	float f_140_ = 0.0F;
	float f_141_ = 0.0F;
	float f_142_ = 0.0F;
	if (f_88_ != f) {
	    float f_143_ = f_88_ - f;
	    f_132_ = (f_91_ - f_90_) / f_143_;
	    f_133_ = (f_94_ - f_93_) / f_143_;
	    f_134_ = (f_97_ - f_96_) / f_143_;
	    f_135_ = (f_100_ - f_99_) / f_143_;
	    f_136_ = (float) (i_106_ - i_105_) / f_143_;
	    f_137_ = (f_115_ - f_114_) / f_143_;
	    f_138_ = (f_118_ - f_117_) / f_143_;
	    f_139_ = (f_121_ - f_120_) / f_143_;
	    f_140_ = (f_124_ - f_123_) / f_143_;
	    f_141_ = (f_127_ - f_126_) / f_143_;
	    f_142_ = (f_130_ - f_129_) / f_143_;
	}
	float f_144_ = 0.0F;
	float f_145_ = 0.0F;
	float f_146_ = 0.0F;
	float f_147_ = 0.0F;
	float f_148_ = 0.0F;
	float f_149_ = 0.0F;
	float f_150_ = 0.0F;
	float f_151_ = 0.0F;
	float f_152_ = 0.0F;
	float f_153_ = 0.0F;
	float f_154_ = 0.0F;
	if (f_89_ != f_88_) {
	    float f_155_ = f_89_ - f_88_;
	    f_144_ = (f_92_ - f_91_) / f_155_;
	    f_145_ = (f_95_ - f_94_) / f_155_;
	    f_146_ = (f_98_ - f_97_) / f_155_;
	    f_147_ = (f_101_ - f_100_) / f_155_;
	    f_148_ = (float) (i_107_ - i_106_) / f_155_;
	    f_149_ = (f_116_ - f_115_) / f_155_;
	    f_150_ = (f_119_ - f_118_) / f_155_;
	    f_151_ = (f_122_ - f_121_) / f_155_;
	    f_152_ = (f_125_ - f_124_) / f_155_;
	    f_153_ = (f_128_ - f_127_) / f_155_;
	    f_154_ = (f_131_ - f_130_) / f_155_;
	}
	float f_156_ = 0.0F;
	float f_157_ = 0.0F;
	float f_158_ = 0.0F;
	float f_159_ = 0.0F;
	float f_160_ = 0.0F;
	float f_161_ = 0.0F;
	float f_162_ = 0.0F;
	float f_163_ = 0.0F;
	float f_164_ = 0.0F;
	float f_165_ = 0.0F;
	float f_166_ = 0.0F;
	if (f != f_89_) {
	    float f_167_ = f - f_89_;
	    f_156_ = (f_90_ - f_92_) / f_167_;
	    f_157_ = (f_93_ - f_95_) / f_167_;
	    f_158_ = (f_96_ - f_98_) / f_167_;
	    f_159_ = (f_99_ - f_101_) / f_167_;
	    f_160_ = (float) (i_105_ - i_107_) / f_167_;
	    f_161_ = (f_114_ - f_116_) / f_167_;
	    f_162_ = (f_117_ - f_119_) / f_167_;
	    f_163_ = (f_120_ - f_122_) / f_167_;
	    f_164_ = (f_123_ - f_125_) / f_167_;
	    f_165_ = (f_126_ - f_128_) / f_167_;
	    f_166_ = (f_129_ - f_131_) / f_167_;
	}
	if (f <= f_88_ && f <= f_89_) {
	    if (!(f >= (float) ((Class109) this).anInt1672)) {
		if (f_88_ > (float) ((Class109) this).anInt1672)
		    f_88_ = (float) ((Class109) this).anInt1672;
		if (f_89_ > (float) ((Class109) this).anInt1672)
		    f_89_ = (float) ((Class109) this).anInt1672;
		if (f_88_ < f_89_) {
		    f_92_ = f_90_;
		    f_95_ = f_93_;
		    f_98_ = f_96_;
		    f_101_ = f_99_;
		    i_107_ = i_105_;
		    f_116_ = f_114_;
		    f_119_ = f_117_;
		    f_122_ = f_120_;
		    f_125_ = f_123_;
		    f_128_ = f_126_;
		    f_131_ = f_129_;
		    if (f < 0.0F) {
			f_90_ -= f_132_ * f;
			f_92_ -= f_156_ * f;
			f_93_ -= f_133_ * f;
			f_95_ -= f_157_ * f;
			f_96_ -= f_134_ * f;
			f_98_ -= f_158_ * f;
			f_99_ -= f_135_ * f;
			f_101_ -= f_159_ * f;
			i_105_ -= f_136_ * f;
			i_107_ -= f_160_ * f;
			f_114_ -= f_137_ * f;
			f_116_ -= f_161_ * f;
			f_117_ -= f_138_ * f;
			f_119_ -= f_162_ * f;
			f_120_ -= f_139_ * f;
			f_122_ -= f_163_ * f;
			f_123_ -= f_140_ * f;
			f_125_ -= f_164_ * f;
			f_126_ -= f_141_ * f;
			f_128_ -= f_165_ * f;
			f_129_ -= f_142_ * f;
			f_131_ -= f_166_ * f;
			f = 0.0F;
		    }
		    if (f_88_ < 0.0F) {
			f_91_ -= f_144_ * f_88_;
			f_94_ -= f_145_ * f_88_;
			f_97_ -= f_146_ * f_88_;
			f_100_ -= f_147_ * f_88_;
			i_106_ -= f_148_ * f_88_;
			f_115_ -= f_149_ * f_88_;
			f_118_ -= f_150_ * f_88_;
			f_121_ -= f_151_ * f_88_;
			f_124_ -= f_152_ * f_88_;
			f_127_ -= f_153_ * f_88_;
			f_130_ -= f_154_ * f_88_;
			f_88_ = 0.0F;
		    }
		    if (f != f_88_ && f_156_ < f_132_
			|| f == f_88_ && f_156_ > f_144_) {
			f_89_ -= f_88_;
			f_88_ -= f;
			f = (float) ((Class109) this).anIntArray1676[(int) f];
			while (--f_88_ >= 0.0F) {
			    method1025(anIntArray1673, anIntArray1698, (int) f,
				       (int) f_92_, (int) f_90_, f_95_, f_93_,
				       f_98_, f_96_, f_101_, f_99_,
				       (float) i_107_, (float) i_105_, f_116_,
				       f_114_, f_119_, f_117_, f_122_, f_120_,
				       f_125_, f_123_, f_128_, f_126_, f_131_,
				       f_129_);
			    f_90_ += f_132_;
			    f_92_ += f_156_;
			    f_93_ += f_133_;
			    f_95_ += f_157_;
			    f_96_ += f_134_;
			    f_98_ += f_158_;
			    f_99_ += f_135_;
			    f_101_ += f_159_;
			    i_105_ += f_136_;
			    i_107_ += f_160_;
			    f_114_ += f_137_;
			    f_116_ += f_161_;
			    f_117_ += f_138_;
			    f_119_ += f_162_;
			    f_120_ += f_139_;
			    f_122_ += f_163_;
			    f_123_ += f_140_;
			    f_125_ += f_164_;
			    f_126_ += f_141_;
			    f_128_ += f_165_;
			    f_129_ += f_142_;
			    f_131_ += f_142_;
			    f += (float) anInt1678;
			}
			while (--f_89_ >= 0.0F) {
			    method1025(anIntArray1673, anIntArray1698, (int) f,
				       (int) f_92_, (int) f_91_, f_95_, f_94_,
				       f_98_, f_97_, f_101_, f_100_,
				       (float) i_107_, (float) i_106_, f_116_,
				       f_115_, f_119_, f_118_, f_122_, f_121_,
				       f_125_, f_124_, f_128_, f_127_, f_131_,
				       f_130_);
			    f_91_ += f_144_;
			    f_92_ += f_156_;
			    f_94_ += f_145_;
			    f_95_ += f_157_;
			    f_97_ += f_146_;
			    f_98_ += f_158_;
			    f_100_ += f_147_;
			    f_101_ += f_159_;
			    i_106_ += f_148_;
			    i_107_ += f_160_;
			    f_115_ += f_149_;
			    f_116_ += f_161_;
			    f_118_ += f_150_;
			    f_119_ += f_162_;
			    f_121_ += f_151_;
			    f_122_ += f_163_;
			    f_124_ += f_152_;
			    f_125_ += f_164_;
			    f_127_ += f_153_;
			    f_128_ += f_165_;
			    f_130_ += f_154_;
			    f_131_ += f_166_;
			    f += (float) anInt1678;
			}
		    } else {
			f_89_ -= f_88_;
			f_88_ -= f;
			f = (float) ((Class109) this).anIntArray1676[(int) f];
			while (--f_88_ >= 0.0F) {
			    method1025(anIntArray1673, anIntArray1698, (int) f,
				       (int) f_90_, (int) f_92_, f_93_, f_95_,
				       f_96_, f_98_, f_99_, f_101_,
				       (float) i_105_, (float) i_107_, f_114_,
				       f_116_, f_117_, f_119_, f_120_, f_122_,
				       f_123_, f_125_, f_126_, f_128_, f_129_,
				       f_131_);
			    f_90_ += f_132_;
			    f_92_ += f_156_;
			    f_93_ += f_133_;
			    f_95_ += f_157_;
			    f_96_ += f_134_;
			    f_98_ += f_158_;
			    f_99_ += f_135_;
			    f_101_ += f_159_;
			    i_105_ += f_136_;
			    i_107_ += f_160_;
			    f_114_ += f_137_;
			    f_116_ += f_161_;
			    f_117_ += f_138_;
			    f_119_ += f_162_;
			    f_120_ += f_139_;
			    f_122_ += f_163_;
			    f_123_ += f_140_;
			    f_125_ += f_164_;
			    f_126_ += f_141_;
			    f_128_ += f_165_;
			    f_129_ += f_142_;
			    f_131_ += f_166_;
			    f += (float) anInt1678;
			}
			while (--f_89_ >= 0.0F) {
			    method1025(anIntArray1673, anIntArray1698, (int) f,
				       (int) f_91_, (int) f_92_, f_94_, f_95_,
				       f_97_, f_98_, f_100_, f_101_,
				       (float) i_106_, (float) i_107_, f_115_,
				       f_116_, f_118_, f_119_, f_121_, f_122_,
				       f_124_, f_125_, f_127_, f_128_, f_130_,
				       f_131_);
			    f_91_ += f_144_;
			    f_92_ += f_156_;
			    f_94_ += f_145_;
			    f_95_ += f_157_;
			    f_97_ += f_146_;
			    f_98_ += f_158_;
			    f_100_ += f_147_;
			    f_101_ += f_159_;
			    i_106_ += f_148_;
			    i_107_ += f_160_;
			    f_115_ += f_149_;
			    f_116_ += f_161_;
			    f_118_ += f_150_;
			    f_119_ += f_162_;
			    f_121_ += f_151_;
			    f_122_ += f_163_;
			    f_124_ += f_152_;
			    f_125_ += f_164_;
			    f_127_ += f_153_;
			    f_128_ += f_165_;
			    f_130_ += f_154_;
			    f_131_ += f_166_;
			    f += (float) anInt1678;
			}
		    }
		} else {
		    f_91_ = f_90_;
		    f_94_ = f_93_;
		    f_97_ = f_96_;
		    f_100_ = f_99_;
		    i_106_ = i_105_;
		    f_115_ = f_114_;
		    f_118_ = f_117_;
		    f_121_ = f_120_;
		    f_124_ = f_123_;
		    f_127_ = f_126_;
		    f_130_ = f_129_;
		    if (f < 0.0F) {
			f_90_ -= f_132_ * f;
			f_91_ -= f_156_ * f;
			f_93_ -= f_133_ * f;
			f_94_ -= f_157_ * f;
			f_96_ -= f_134_ * f;
			f_97_ -= f_158_ * f;
			f_99_ -= f_135_ * f;
			f_100_ -= f_159_ * f;
			i_105_ -= f_136_ * f;
			i_106_ -= f_160_ * f;
			f_114_ -= f_137_ * f;
			f_115_ -= f_161_ * f;
			f_117_ -= f_138_ * f;
			f_118_ -= f_162_ * f;
			f_120_ -= f_139_ * f;
			f_121_ -= f_163_ * f;
			f_123_ -= f_140_ * f;
			f_124_ -= f_164_ * f;
			f_126_ -= f_141_ * f;
			f_127_ -= f_165_ * f;
			f_129_ -= f_142_ * f;
			f_130_ -= f_166_ * f;
			f = 0.0F;
		    }
		    if (f_89_ < 0.0F) {
			f_92_ -= f_144_ * f_89_;
			f_95_ -= f_145_ * f_89_;
			f_98_ -= f_146_ * f_89_;
			f_101_ -= f_147_ * f_89_;
			i_107_ -= f_148_ * f_89_;
			f_116_ -= f_149_ * f_89_;
			f_119_ -= f_150_ * f_89_;
			f_122_ -= f_151_ * f_89_;
			f_125_ -= f_152_ * f_89_;
			f_128_ -= f_153_ * f_89_;
			f_131_ -= f_154_ * f_89_;
			f_89_ = 0.0F;
		    }
		    if (f != f_89_ && f_156_ < f_132_
			|| f == f_89_ && f_144_ > f_132_) {
			f_88_ -= f_89_;
			f_89_ -= f;
			f = (float) ((Class109) this).anIntArray1676[(int) f];
			while (--f_89_ >= 0.0F) {
			    method1025(anIntArray1673, anIntArray1698, (int) f,
				       (int) f_91_, (int) f_90_, f_94_, f_93_,
				       f_97_, f_96_, f_100_, f_99_,
				       (float) i_106_, (float) i_105_, f_115_,
				       f_114_, f_118_, f_117_, f_121_, f_120_,
				       f_124_, f_123_, f_127_, f_126_, f_130_,
				       f_129_);
			    f_90_ += f_132_;
			    f_91_ += f_156_;
			    f_93_ += f_133_;
			    f_94_ += f_157_;
			    f_96_ += f_134_;
			    f_97_ += f_158_;
			    f_99_ += f_135_;
			    f_100_ += f_159_;
			    i_105_ += f_136_;
			    i_106_ += f_160_;
			    f_114_ += f_137_;
			    f_115_ += f_161_;
			    f_117_ += f_138_;
			    f_118_ += f_162_;
			    f_120_ += f_139_;
			    f_121_ += f_163_;
			    f_123_ += f_140_;
			    f_124_ += f_164_;
			    f_126_ += f_141_;
			    f_127_ += f_165_;
			    f_129_ += f_142_;
			    f_130_ += f_166_;
			    f += (float) anInt1678;
			}
			while (--f_88_ >= 0.0F) {
			    method1025(anIntArray1673, anIntArray1698, (int) f,
				       (int) f_92_, (int) f_90_, f_95_, f_93_,
				       f_98_, f_96_, f_101_, f_99_,
				       (float) i_107_, (float) i_105_, f_116_,
				       f_114_, f_119_, f_117_, f_122_, f_120_,
				       f_125_, f_123_, f_128_, f_126_, f_131_,
				       f_129_);
			    f_92_ += f_144_;
			    f_90_ += f_132_;
			    f_95_ += f_145_;
			    f_93_ += f_133_;
			    f_98_ += f_146_;
			    f_96_ += f_134_;
			    f_101_ += f_147_;
			    f_99_ += f_135_;
			    i_107_ += f_148_;
			    i_105_ += f_136_;
			    f_116_ += f_149_;
			    f_114_ += f_137_;
			    f_119_ += f_150_;
			    f_117_ += f_138_;
			    f_122_ += f_151_;
			    f_120_ += f_139_;
			    f_125_ += f_152_;
			    f_123_ += f_140_;
			    f_128_ += f_153_;
			    f_126_ += f_141_;
			    f_131_ += f_154_;
			    f_129_ += f_142_;
			    f += (float) anInt1678;
			}
		    } else {
			f_88_ -= f_89_;
			f_89_ -= f;
			f = (float) ((Class109) this).anIntArray1676[(int) f];
			while (--f_89_ >= 0.0F) {
			    method1025(anIntArray1673, anIntArray1698, (int) f,
				       (int) f_90_, (int) f_91_, f_93_, f_94_,
				       f_96_, f_97_, f_99_, f_100_,
				       (float) i_105_, (float) i_106_, f_114_,
				       f_115_, f_117_, f_118_, f_120_, f_121_,
				       f_123_, f_124_, f_126_, f_127_, f_129_,
				       f_130_);
			    f_91_ += f_156_;
			    f_90_ += f_132_;
			    f_94_ += f_157_;
			    f_93_ += f_133_;
			    f_97_ += f_158_;
			    f_96_ += f_134_;
			    f_100_ += f_159_;
			    f_99_ += f_135_;
			    i_106_ += f_160_;
			    i_105_ += f_136_;
			    f_115_ += f_161_;
			    f_114_ += f_137_;
			    f_118_ += f_162_;
			    f_117_ += f_138_;
			    f_121_ += f_163_;
			    f_120_ += f_139_;
			    f_124_ += f_164_;
			    f_123_ += f_140_;
			    f_127_ += f_165_;
			    f_126_ += f_141_;
			    f_130_ += f_166_;
			    f_129_ += f_142_;
			    f += (float) anInt1678;
			}
			while (--f_88_ >= 0.0F) {
			    method1025(anIntArray1673, anIntArray1698, (int) f,
				       (int) f_90_, (int) f_92_, f_93_, f_95_,
				       f_96_, f_98_, f_99_, f_101_,
				       (float) i_105_, (float) i_107_, f_114_,
				       f_116_, f_117_, f_119_, f_120_, f_122_,
				       f_123_, f_125_, f_126_, f_128_, f_129_,
				       f_131_);
			    f_90_ += f_132_;
			    f_92_ += f_144_;
			    f_93_ += f_133_;
			    f_95_ += f_145_;
			    f_96_ += f_134_;
			    f_98_ += f_146_;
			    f_99_ += f_135_;
			    f_101_ += f_147_;
			    i_105_ += f_136_;
			    i_107_ += f_148_;
			    f_114_ += f_137_;
			    f_116_ += f_149_;
			    f_117_ += f_138_;
			    f_119_ += f_150_;
			    f_120_ += f_139_;
			    f_122_ += f_151_;
			    f_123_ += f_140_;
			    f_125_ += f_152_;
			    f_126_ += f_141_;
			    f_128_ += f_153_;
			    f_129_ += f_142_;
			    f_131_ += f_154_;
			    f += (float) anInt1678;
			}
		    }
		}
	    }
	} else if (f_88_ <= f_89_) {
	    if (!(f_88_ >= (float) ((Class109) this).anInt1672)) {
		if (f_89_ > (float) ((Class109) this).anInt1672)
		    f_89_ = (float) ((Class109) this).anInt1672;
		if (f > (float) ((Class109) this).anInt1672)
		    f = (float) ((Class109) this).anInt1672;
		if (f_89_ < f) {
		    f_90_ = f_91_;
		    f_93_ = f_94_;
		    f_96_ = f_97_;
		    f_99_ = f_100_;
		    i_105_ = i_106_;
		    f_114_ = f_115_;
		    f_117_ = f_118_;
		    f_120_ = f_121_;
		    f_123_ = f_124_;
		    f_126_ = f_127_;
		    f_129_ = f_130_;
		    if (f_88_ < 0.0F) {
			f_90_ -= f_132_ * f_88_;
			f_91_ -= f_144_ * f_88_;
			f_93_ -= f_133_ * f_88_;
			f_94_ -= f_145_ * f_88_;
			f_96_ -= f_134_ * f_88_;
			f_97_ -= f_146_ * f_88_;
			f_99_ -= f_135_ * f_88_;
			f_100_ -= f_147_ * f_88_;
			i_105_ -= f_136_ * f_88_;
			i_106_ -= f_148_ * f_88_;
			f_114_ -= f_137_ * f_88_;
			f_115_ -= f_149_ * f_88_;
			f_117_ -= f_138_ * f_88_;
			f_118_ -= f_150_ * f_88_;
			f_120_ -= f_139_ * f_88_;
			f_121_ -= f_151_ * f_88_;
			f_123_ -= f_140_ * f_88_;
			f_124_ -= f_152_ * f_88_;
			f_126_ -= f_141_ * f_88_;
			f_127_ -= f_153_ * f_88_;
			f_129_ -= f_142_ * f_88_;
			f_130_ -= f_154_ * f_88_;
			f_88_ = 0.0F;
		    }
		    if (f_89_ < 0.0F) {
			f_92_ -= f_156_ * f_89_;
			f_95_ -= f_157_ * f_89_;
			f_98_ -= f_158_ * f_89_;
			f_101_ -= f_159_ * f_89_;
			i_107_ -= f_160_ * f_89_;
			f_116_ -= f_161_ * f_89_;
			f_119_ -= f_162_ * f_89_;
			f_122_ -= f_163_ * f_89_;
			f_125_ -= f_164_ * f_89_;
			f_128_ -= f_165_ * f_89_;
			f_131_ -= f_166_ * f_89_;
			f_89_ = 0.0F;
		    }
		    if (f_88_ != f_89_ && f_132_ < f_144_
			|| f_88_ == f_89_ && f_132_ > f_156_) {
			f -= f_89_;
			f_89_ -= f_88_;
			f_88_ = (float) (((Class109) this).anIntArray1676
					 [(int) f_88_]);
			while (--f_89_ >= 0.0F) {
			    method1025(anIntArray1673, anIntArray1698,
				       (int) f_88_, (int) f_90_, (int) f_91_,
				       f_93_, f_94_, f_96_, f_97_, f_99_,
				       f_100_, (float) i_105_, (float) i_106_,
				       f_114_, f_115_, f_117_, f_118_, f_120_,
				       f_121_, f_123_, f_124_, f_126_, f_127_,
				       f_129_, f_130_);
			    f_90_ += f_132_;
			    f_91_ += f_144_;
			    f_93_ += f_133_;
			    f_94_ += f_145_;
			    f_96_ += f_134_;
			    f_97_ += f_146_;
			    f_99_ += f_135_;
			    f_100_ += f_147_;
			    i_105_ += f_136_;
			    i_106_ += f_148_;
			    f_114_ += f_137_;
			    f_115_ += f_149_;
			    f_117_ += f_138_;
			    f_118_ += f_150_;
			    f_120_ += f_139_;
			    f_121_ += f_151_;
			    f_123_ += f_140_;
			    f_124_ += f_152_;
			    f_126_ += f_141_;
			    f_127_ += f_153_;
			    f_129_ += f_142_;
			    f_130_ += f_154_;
			    f_88_ += (float) anInt1678;
			}
			while (--f >= 0.0F) {
			    method1025(anIntArray1673, anIntArray1698,
				       (int) f_88_, (int) f_90_, (int) f_92_,
				       f_93_, f_95_, f_96_, f_98_, f_99_,
				       f_101_, (float) i_105_, (float) i_107_,
				       f_114_, f_116_, f_117_, f_119_, f_120_,
				       f_122_, f_123_, f_125_, f_126_, f_128_,
				       f_129_, f_131_);
			    f_90_ += f_132_;
			    f_92_ += f_156_;
			    f_93_ += f_133_;
			    f_95_ += f_157_;
			    f_96_ += f_134_;
			    f_98_ += f_158_;
			    f_99_ += f_135_;
			    f_101_ += f_159_;
			    i_105_ += f_136_;
			    i_107_ += f_160_;
			    f_114_ += f_137_;
			    f_116_ += f_161_;
			    f_117_ += f_138_;
			    f_119_ += f_162_;
			    f_120_ += f_139_;
			    f_122_ += f_163_;
			    f_123_ += f_140_;
			    f_125_ += f_164_;
			    f_126_ += f_141_;
			    f_128_ += f_165_;
			    f_129_ += f_142_;
			    f_131_ += f_166_;
			    f_88_ += (float) anInt1678;
			}
		    } else {
			f -= f_89_;
			f_89_ -= f_88_;
			f_88_ = (float) (((Class109) this).anIntArray1676
					 [(int) f_88_]);
			while (--f_89_ >= 0.0F) {
			    method1025(anIntArray1673, anIntArray1698,
				       (int) f_88_, (int) f_91_, (int) f_90_,
				       f_94_, f_93_, f_97_, f_96_, f_100_,
				       f_99_, (float) i_106_, (float) i_105_,
				       f_115_, f_114_, f_118_, f_117_, f_121_,
				       f_120_, f_124_, f_123_, f_127_, f_126_,
				       f_130_, f_129_);
			    f_91_ += f_144_;
			    f_90_ += f_132_;
			    f_94_ += f_145_;
			    f_93_ += f_133_;
			    f_97_ += f_146_;
			    f_96_ += f_134_;
			    f_100_ += f_147_;
			    f_99_ += f_135_;
			    i_106_ += f_148_;
			    i_105_ += f_136_;
			    f_115_ += f_149_;
			    f_114_ += f_137_;
			    f_118_ += f_150_;
			    f_117_ += f_138_;
			    f_121_ += f_151_;
			    f_120_ += f_139_;
			    f_124_ += f_152_;
			    f_123_ += f_140_;
			    f_128_ += f_153_;
			    f_126_ += f_141_;
			    f_130_ += f_154_;
			    f_129_ += f_142_;
			    f_88_ += (float) anInt1678;
			}
			while (--f >= 0.0F) {
			    method1025(anIntArray1673, anIntArray1698,
				       (int) f_88_, (int) f_92_, (int) f_90_,
				       f_95_, f_93_, f_98_, f_96_, f_101_,
				       f_99_, (float) i_107_, (float) i_105_,
				       f_116_, f_114_, f_119_, f_117_, f_122_,
				       f_120_, f_125_, f_123_, f_128_, f_126_,
				       f_131_, f_129_);
			    f_92_ += f_156_;
			    f_90_ += f_132_;
			    f_95_ += f_157_;
			    f_93_ += f_133_;
			    f_98_ += f_158_;
			    f_96_ += f_134_;
			    f_101_ += f_159_;
			    f_99_ += f_135_;
			    i_107_ += f_160_;
			    i_105_ += f_136_;
			    f_116_ += f_161_;
			    f_114_ += f_137_;
			    f_119_ += f_162_;
			    f_117_ += f_138_;
			    f_122_ += f_163_;
			    f_120_ += f_139_;
			    f_125_ += f_164_;
			    f_123_ += f_140_;
			    f_128_ += f_165_;
			    f_126_ += f_141_;
			    f_131_ += f_166_;
			    f_129_ += f_142_;
			    f_88_ += (float) anInt1678;
			}
		    }
		} else {
		    f_92_ = f_91_;
		    f_95_ = f_94_;
		    f_98_ = f_97_;
		    f_101_ = f_100_;
		    i_107_ = i_106_;
		    f_116_ = f_115_;
		    f_119_ = f_118_;
		    f_122_ = f_121_;
		    f_125_ = f_124_;
		    f_128_ = f_127_;
		    f_131_ = f_130_;
		    if (f_88_ < 0.0F) {
			f_92_ -= f_132_ * f_88_;
			f_91_ -= f_144_ * f_88_;
			f_95_ -= f_133_ * f_88_;
			f_94_ -= f_145_ * f_88_;
			f_98_ -= f_134_ * f_88_;
			f_97_ -= f_146_ * f_88_;
			f_101_ -= f_135_ * f_88_;
			f_100_ -= f_147_ * f_88_;
			i_107_ -= f_136_ * f_88_;
			i_106_ -= f_148_ * f_88_;
			f_116_ -= f_137_ * f_88_;
			f_115_ -= f_149_ * f_88_;
			f_119_ -= f_138_ * f_88_;
			f_118_ -= f_150_ * f_88_;
			f_122_ -= f_139_ * f_88_;
			f_121_ -= f_151_ * f_88_;
			f_125_ -= f_140_ * f_88_;
			f_124_ -= f_152_ * f_88_;
			f_128_ -= f_141_ * f_88_;
			f_127_ -= f_153_ * f_88_;
			f_131_ -= f_142_ * f_88_;
			f_130_ -= f_154_ * f_88_;
			f_88_ = 0.0F;
		    }
		    if (f < 0.0F) {
			f_90_ -= f_156_ * f;
			f_93_ -= f_157_ * f;
			f_96_ -= f_158_ * f;
			f_99_ -= f_159_ * f;
			i_105_ -= f_160_ * f;
			f_114_ -= f_161_ * f;
			f_117_ -= f_162_ * f;
			f_120_ -= f_163_ * f;
			f_123_ -= f_164_ * f;
			f_126_ -= f_165_ * f;
			f_129_ -= f_166_ * f;
			f = 0.0F;
		    }
		    f_89_ -= f;
		    f -= f_88_;
		    f_88_ = (float) (((Class109) this).anIntArray1676
				     [(int) f_88_]);
		    if (f_132_ < f_144_) {
			while (--f >= 0.0F) {
			    method1025(anIntArray1673, anIntArray1698,
				       (int) f_88_, (int) f_92_, (int) f_91_,
				       f_95_, f_94_, f_98_, f_97_, f_101_,
				       f_100_, (float) i_107_, (float) i_106_,
				       f_116_, f_115_, f_119_, f_118_, f_122_,
				       f_121_, f_125_, f_124_, f_128_, f_127_,
				       f_131_, f_130_);
			    f_92_ += f_132_;
			    f_91_ += f_144_;
			    f_95_ += f_133_;
			    f_94_ += f_145_;
			    f_98_ += f_134_;
			    f_97_ += f_146_;
			    f_101_ += f_135_;
			    f_100_ += f_147_;
			    i_107_ += f_136_;
			    i_106_ += f_148_;
			    f_116_ += f_137_;
			    f_115_ += f_149_;
			    f_119_ += f_138_;
			    f_118_ += f_150_;
			    f_122_ += f_139_;
			    f_121_ += f_151_;
			    f_125_ += f_140_;
			    f_124_ += f_152_;
			    f_128_ += f_141_;
			    f_127_ += f_153_;
			    f_131_ += f_142_;
			    f_130_ += f_154_;
			    f_88_ += (float) anInt1678;
			}
			while (--f_89_ >= 0.0F) {
			    method1025(anIntArray1673, anIntArray1698,
				       (int) f_88_, (int) f_90_, (int) f_91_,
				       f_93_, f_94_, f_96_, f_97_, f_99_,
				       f_100_, (float) i_105_, (float) i_106_,
				       f_114_, f_115_, f_117_, f_118_, f_120_,
				       f_121_, f_123_, f_124_, f_126_, f_127_,
				       f_129_, f_130_);
			    f_90_ += f_156_;
			    f_91_ += f_144_;
			    f_93_ += f_157_;
			    f_94_ += f_145_;
			    f_96_ += f_158_;
			    f_97_ += f_146_;
			    f_99_ += f_159_;
			    f_100_ += f_147_;
			    i_105_ += f_160_;
			    i_106_ += f_148_;
			    f_114_ += f_161_;
			    f_115_ += f_149_;
			    f_117_ += f_162_;
			    f_118_ += f_150_;
			    f_120_ += f_163_;
			    f_121_ += f_151_;
			    f_123_ += f_164_;
			    f_124_ += f_152_;
			    f_126_ += f_165_;
			    f_127_ += f_153_;
			    f_129_ += f_166_;
			    f_130_ += f_154_;
			    f_88_ += (float) anInt1678;
			}
		    } else {
			while (--f >= 0.0F) {
			    method1025(anIntArray1673, anIntArray1698,
				       (int) f_88_, (int) f_91_, (int) f_92_,
				       f_94_, f_95_, f_97_, f_98_, f_100_,
				       f_101_, (float) i_106_, (float) i_107_,
				       f_115_, f_116_, f_118_, f_119_, f_121_,
				       f_122_, f_124_, f_125_, f_127_, f_128_,
				       f_130_, f_131_);
			    f_91_ += f_144_;
			    f_92_ += f_132_;
			    f_94_ += f_145_;
			    f_95_ += f_133_;
			    f_97_ += f_146_;
			    f_98_ += f_134_;
			    f_100_ += f_147_;
			    f_101_ += f_135_;
			    i_106_ += f_148_;
			    i_107_ += f_136_;
			    f_115_ += f_149_;
			    f_116_ += f_137_;
			    f_118_ += f_150_;
			    f_119_ += f_138_;
			    f_121_ += f_151_;
			    f_122_ += f_139_;
			    f_124_ += f_152_;
			    f_125_ += f_140_;
			    f_127_ += f_153_;
			    f_128_ += f_141_;
			    f_130_ += f_154_;
			    f_131_ += f_142_;
			    f_88_ += (float) anInt1678;
			}
			while (--f_89_ >= 0.0F) {
			    method1025(anIntArray1673, anIntArray1698,
				       (int) f_88_, (int) f_91_, (int) f_90_,
				       f_94_, f_93_, f_97_, f_96_, f_100_,
				       f_99_, (float) i_106_, (float) i_105_,
				       f_115_, f_114_, f_118_, f_117_, f_121_,
				       f_120_, f_124_, f_123_, f_127_, f_126_,
				       f_130_, f_129_);
			    f_91_ += f_144_;
			    f_90_ += f_156_;
			    f_94_ += f_145_;
			    f_93_ += f_157_;
			    f_97_ += f_146_;
			    f_96_ += f_158_;
			    f_100_ += f_147_;
			    f_99_ += f_159_;
			    i_106_ += f_148_;
			    i_105_ += f_160_;
			    f_115_ += f_149_;
			    f_114_ += f_161_;
			    f_118_ += f_150_;
			    f_117_ += f_162_;
			    f_121_ += f_151_;
			    f_120_ += f_163_;
			    f_124_ += f_152_;
			    f_123_ += f_164_;
			    f_127_ += f_153_;
			    f_126_ += f_165_;
			    f_130_ += f_154_;
			    f_129_ += f_166_;
			    f_88_ += (float) anInt1678;
			}
		    }
		}
	    }
	} else if (!(f_89_ >= (float) ((Class109) this).anInt1672)) {
	    if (f > (float) ((Class109) this).anInt1672)
		f = (float) ((Class109) this).anInt1672;
	    if (f_88_ > (float) ((Class109) this).anInt1672)
		f_88_ = (float) ((Class109) this).anInt1672;
	    if (f < f_88_) {
		f_91_ = f_92_;
		f_94_ = f_95_;
		f_97_ = f_98_;
		f_100_ = f_101_;
		i_106_ = i_107_;
		f_115_ = f_116_;
		f_118_ = f_119_;
		f_121_ = f_122_;
		f_124_ = f_125_;
		f_127_ = f_128_;
		f_130_ = f_131_;
		if (f_89_ < 0.0F) {
		    f_92_ -= f_156_ * f_89_;
		    f_91_ -= f_144_ * f_89_;
		    f_95_ -= f_157_ * f_89_;
		    f_94_ -= f_145_ * f_89_;
		    f_98_ -= f_158_ * f_89_;
		    f_97_ -= f_146_ * f_89_;
		    f_101_ -= f_159_ * f_89_;
		    f_100_ -= f_147_ * f_89_;
		    i_107_ -= f_160_ * 3.0F;
		    i_106_ -= f_148_ * f_89_;
		    f_116_ -= f_161_ * f_89_;
		    f_115_ -= f_149_ * f_89_;
		    f_119_ -= f_162_ * f_89_;
		    f_118_ -= f_150_ * f_89_;
		    f_122_ -= f_163_ * f_89_;
		    f_121_ -= f_151_ * f_89_;
		    f_125_ -= f_164_ * f_89_;
		    f_124_ -= f_152_ * f_89_;
		    f_128_ -= f_165_ * f_89_;
		    f_127_ -= f_153_ * f_89_;
		    f_131_ -= f_166_ * f_89_;
		    f_130_ -= f_154_ * f_89_;
		    f_89_ = 0.0F;
		}
		if (f < 0.0F) {
		    f_90_ -= f_132_ * f;
		    f_93_ -= f_133_ * f;
		    f_96_ -= f_134_ * f;
		    f_99_ -= f_135_ * f;
		    i_105_ -= f_136_ * f;
		    f_114_ -= f_137_ * f;
		    f_117_ -= f_138_ * f;
		    f_120_ -= f_139_ * f;
		    f_123_ -= f_140_ * f;
		    f_126_ -= f_141_ * f;
		    f_129_ -= f_142_ * f;
		    f = 0.0F;
		}
		if (f_144_ < f_156_) {
		    f_88_ -= f;
		    f -= f_89_;
		    f_89_ = (float) (((Class109) this).anIntArray1676
				     [(int) f_89_]);
		    while (--f >= 0.0F) {
			method1025(anIntArray1673, anIntArray1698, (int) f_89_,
				   (int) f_91_, (int) f_92_, f_94_, f_95_,
				   f_97_, f_98_, f_100_, f_101_,
				   (float) i_106_, (float) i_107_, f_115_,
				   f_116_, f_118_, f_119_, f_121_, f_122_,
				   f_124_, f_125_, f_127_, f_128_, f_130_,
				   f_131_);
			f_91_ += f_144_;
			f_92_ += f_156_;
			f_94_ += f_145_;
			f_95_ += f_157_;
			f_97_ += f_146_;
			f_98_ += f_158_;
			f_100_ += f_147_;
			f_101_ += f_159_;
			i_106_ += f_148_;
			i_107_ += f_160_;
			f_115_ += f_149_;
			f_116_ += f_161_;
			f_118_ += f_150_;
			f_119_ += f_162_;
			f_121_ += f_151_;
			f_122_ += f_163_;
			f_124_ += f_152_;
			f_125_ += f_164_;
			f_127_ += f_153_;
			f_128_ += f_165_;
			f_130_ += f_154_;
			f_131_ += f_166_;
			f_89_ += (float) anInt1678;
		    }
		    while (--f_88_ >= 0.0F) {
			method1025(anIntArray1673, anIntArray1698, (int) f_89_,
				   (int) f_91_, (int) f_90_, f_94_, f_93_,
				   f_97_, f_96_, f_100_, f_99_, (float) i_106_,
				   (float) i_105_, f_115_, f_114_, f_118_,
				   f_117_, f_121_, f_120_, f_124_, f_123_,
				   f_127_, f_126_, f_130_, f_129_);
			f_91_ += f_144_;
			f_90_ += f_132_;
			f_94_ += f_145_;
			f_93_ += f_133_;
			f_97_ += f_146_;
			f_96_ += f_134_;
			f_100_ += f_147_;
			f_99_ += f_135_;
			i_106_ += f_148_;
			i_105_ += f_136_;
			f_115_ += f_149_;
			f_114_ += f_137_;
			f_118_ += f_150_;
			f_117_ += f_138_;
			f_121_ += f_151_;
			f_120_ += f_139_;
			f_124_ += f_152_;
			f_123_ += f_140_;
			f_127_ += f_153_;
			f_126_ += f_141_;
			f_130_ += f_154_;
			f_129_ += f_142_;
			f_89_ += (float) anInt1678;
		    }
		} else {
		    f_88_ -= f;
		    f -= f_89_;
		    f_89_ = (float) (((Class109) this).anIntArray1676
				     [(int) f_89_]);
		    while (--f >= 0.0F) {
			method1025(anIntArray1673, anIntArray1698, (int) f_89_,
				   (int) f_92_, (int) f_91_, f_95_, f_94_,
				   f_98_, f_97_, f_101_, f_100_,
				   (float) i_107_, (float) i_106_, f_116_,
				   f_115_, f_119_, f_118_, f_122_, f_121_,
				   f_125_, f_124_, f_128_, f_127_, f_131_,
				   f_130_);
			f_92_ += f_156_;
			f_91_ += f_144_;
			f_95_ += f_157_;
			f_94_ += f_145_;
			f_98_ += f_158_;
			f_97_ += f_146_;
			f_101_ += f_159_;
			f_100_ += f_147_;
			i_107_ += f_160_;
			i_106_ += f_148_;
			f_116_ += f_161_;
			f_115_ += f_149_;
			f_119_ += f_162_;
			f_118_ += f_150_;
			f_122_ += f_163_;
			f_121_ += f_151_;
			f_125_ += f_164_;
			f_124_ += f_152_;
			f_128_ += f_165_;
			f_127_ += f_153_;
			f_131_ += f_166_;
			f_130_ += f_154_;
			f_89_ += (float) anInt1678;
		    }
		    while (--f_88_ >= 0.0F) {
			method1025(anIntArray1673, anIntArray1698, (int) f_89_,
				   (int) f_90_, (int) f_91_, f_93_, f_94_,
				   f_96_, f_97_, f_99_, f_100_, (float) i_105_,
				   (float) i_106_, f_114_, f_115_, f_117_,
				   f_118_, f_120_, f_121_, f_123_, f_124_,
				   f_126_, f_127_, f_129_, f_130_);
			f_90_ += f_132_;
			f_91_ += f_144_;
			f_93_ += f_133_;
			f_94_ += f_145_;
			f_96_ += f_134_;
			f_97_ += f_146_;
			f_99_ += f_135_;
			f_100_ += f_147_;
			i_105_ += f_136_;
			i_106_ += f_148_;
			f_114_ += f_137_;
			f_115_ += f_149_;
			f_117_ += f_138_;
			f_118_ += f_150_;
			f_120_ += f_139_;
			f_121_ += f_151_;
			f_123_ += f_140_;
			f_124_ += f_152_;
			f_126_ += f_141_;
			f_127_ += f_153_;
			f_129_ += f_142_;
			f_130_ += f_154_;
			f_89_ += (float) anInt1678;
		    }
		}
	    } else {
		f_90_ = f_92_;
		f_93_ = f_95_;
		f_96_ = f_98_;
		f_99_ = f_101_;
		i_105_ = i_107_;
		f_114_ = f_116_;
		f_117_ = f_119_;
		f_120_ = f_122_;
		f_123_ = f_125_;
		f_126_ = f_128_;
		f_129_ = f_131_;
		if (f_89_ < 0.0F) {
		    f_92_ -= f_156_ * f_89_;
		    f_90_ -= f_144_ * f_89_;
		    f_95_ -= f_157_ * f_89_;
		    f_93_ -= f_145_ * f_89_;
		    f_98_ -= f_158_ * f_89_;
		    f_96_ -= f_146_ * f_89_;
		    f_101_ -= f_159_ * f_89_;
		    f_99_ -= f_147_ * f_89_;
		    i_107_ -= f_160_ * 3.0F;
		    i_105_ -= f_148_ * f_89_;
		    f_116_ -= f_161_ * f_89_;
		    f_114_ -= f_149_ * f_89_;
		    f_119_ -= f_162_ * f_89_;
		    f_117_ -= f_150_ * f_89_;
		    f_122_ -= f_163_ * f_89_;
		    f_120_ -= f_151_ * f_89_;
		    f_125_ -= f_164_ * f_89_;
		    f_123_ -= f_152_ * f_89_;
		    f_128_ -= f_165_ * f_89_;
		    f_126_ -= f_153_ * f_89_;
		    f_131_ -= f_166_ * f_89_;
		    f_129_ -= f_154_ * f_89_;
		    f_89_ = 0.0F;
		}
		if (f_88_ < 0.0F) {
		    f_91_ -= f_132_ * f_88_;
		    f_94_ -= f_133_ * f_88_;
		    f_97_ -= f_134_ * f_88_;
		    f_100_ -= f_135_ * f_88_;
		    i_106_ -= f_136_ * f_88_;
		    f_115_ -= f_137_ * f_88_;
		    f_118_ -= f_138_ * f_88_;
		    f_121_ -= f_139_ * f_88_;
		    f_124_ -= f_140_ * f_88_;
		    f_127_ -= f_141_ * f_88_;
		    f_130_ -= f_142_ * f_88_;
		    f_88_ = 0.0F;
		}
		if (f_144_ < f_156_) {
		    f -= f_88_;
		    f_88_ -= f_89_;
		    f_89_ = (float) (((Class109) this).anIntArray1676
				     [(int) f_89_]);
		    while (--f_88_ >= 0.0F) {
			method1025(anIntArray1673, anIntArray1698, (int) f_89_,
				   (int) f_90_, (int) f_92_, f_93_, f_95_,
				   f_96_, f_98_, f_99_, f_101_, (float) i_105_,
				   (float) i_107_, f_114_, f_116_, f_117_,
				   f_119_, f_120_, f_122_, f_123_, f_125_,
				   f_126_, f_128_, f_129_, f_131_);
			f_90_ += f_144_;
			f_92_ += f_156_;
			f_93_ += f_145_;
			f_95_ += f_157_;
			f_96_ += f_146_;
			f_98_ += f_158_;
			f_99_ += f_147_;
			f_101_ += f_159_;
			i_105_ += f_148_;
			i_107_ += f_160_;
			f_114_ += f_149_;
			f_116_ += f_161_;
			f_117_ += f_150_;
			f_119_ += f_162_;
			f_120_ += f_151_;
			f_122_ += f_163_;
			f_123_ += f_152_;
			f_125_ += f_164_;
			f_126_ += f_153_;
			f_128_ += f_165_;
			f_129_ += f_154_;
			f_131_ += f_166_;
			f_89_ += (float) anInt1678;
		    }
		    while (--f >= 0.0F) {
			method1025(anIntArray1673, anIntArray1698, (int) f_89_,
				   (int) f_91_, (int) f_92_, f_94_, f_95_,
				   f_97_, f_98_, f_100_, f_101_,
				   (float) i_106_, (float) i_107_, f_115_,
				   f_116_, f_118_, f_119_, f_121_, f_122_,
				   f_124_, f_125_, f_127_, f_128_, f_130_,
				   f_131_);
			f_91_ += f_132_;
			f_92_ += f_156_;
			f_94_ += f_133_;
			f_95_ += f_157_;
			f_97_ += f_134_;
			f_98_ += f_158_;
			f_100_ += f_135_;
			f_101_ += f_159_;
			i_106_ += f_136_;
			i_107_ += f_160_;
			f_115_ += f_137_;
			f_116_ += f_161_;
			f_118_ += f_138_;
			f_119_ += f_162_;
			f_121_ += f_139_;
			f_122_ += f_163_;
			f_124_ += f_140_;
			f_125_ += f_164_;
			f_127_ += f_141_;
			f_128_ += f_165_;
			f_130_ += f_142_;
			f_131_ += f_166_;
			f_89_ += (float) anInt1678;
		    }
		} else {
		    f -= f_88_;
		    f_88_ -= f_89_;
		    f_89_ = (float) (((Class109) this).anIntArray1676
				     [(int) f_89_]);
		    while (--f_88_ >= 0.0F) {
			method1025(anIntArray1673, anIntArray1698, (int) f_89_,
				   (int) f_92_, (int) f_90_, f_95_, f_93_,
				   f_98_, f_96_, f_101_, f_99_, (float) i_107_,
				   (float) i_105_, f_116_, f_114_, f_119_,
				   f_117_, f_122_, f_120_, f_125_, f_123_,
				   f_128_, f_126_, f_131_, f_129_);
			f_92_ += f_156_;
			f_90_ += f_144_;
			f_95_ += f_157_;
			f_93_ += f_145_;
			f_98_ += f_158_;
			f_96_ += f_146_;
			f_101_ += f_159_;
			f_99_ += f_147_;
			i_107_ += f_160_;
			i_105_ += f_148_;
			f_116_ += f_161_;
			f_114_ += f_149_;
			f_119_ += f_162_;
			f_117_ += f_150_;
			f_122_ += f_163_;
			f_120_ += f_151_;
			f_125_ += f_164_;
			f_123_ += f_152_;
			f_128_ += f_165_;
			f_126_ += f_153_;
			f_131_ += f_166_;
			f_129_ += f_154_;
			f_89_ += (float) anInt1678;
		    }
		    while (--f >= 0.0F) {
			method1025(anIntArray1673, anIntArray1698, (int) f_89_,
				   (int) f_92_, (int) f_91_, f_95_, f_94_,
				   f_98_, f_97_, f_101_, f_100_,
				   (float) i_107_, (float) i_106_, f_116_,
				   f_115_, f_119_, f_118_, f_122_, f_121_,
				   f_125_, f_124_, f_128_, f_127_, f_131_,
				   f_130_);
			f_92_ += f_156_;
			f_91_ += f_132_;
			f_95_ += f_157_;
			f_94_ += f_133_;
			f_98_ += f_158_;
			f_97_ += f_134_;
			f_101_ += f_159_;
			f_100_ += f_135_;
			i_107_ += f_160_;
			i_106_ += f_136_;
			f_116_ += f_161_;
			f_115_ += f_137_;
			f_119_ += f_162_;
			f_118_ += f_138_;
			f_122_ += f_163_;
			f_121_ += f_139_;
			f_125_ += f_164_;
			f_124_ += f_140_;
			f_128_ += f_165_;
			f_127_ += f_141_;
			f_131_ += f_166_;
			f_130_ += f_142_;
			f_89_ += (float) anInt1678;
		    }
		}
	    }
	}
    }
    
    private final void method1021
	(int[] is, float[] fs, int i, int i_168_, int i_169_, int i_170_,
	 int i_171_, float f, float f_172_, float f_173_, float f_174_,
	 float f_175_, float f_176_, float f_177_, float f_178_) {
	if (((Class109) this).aBoolean1671) {
	    if (i_171_ > ((Class109) this).anInt1679)
		i_171_ = ((Class109) this).anInt1679;
	    if (i_170_ < 0)
		i_170_ = 0;
	}
	if (i_170_ < i_171_) {
	    if (aBoolean1680) {
		i += i_170_;
		f_173_ += f_174_ * (float) i_170_;
		f_175_ += f_176_ * (float) i_170_;
		f_177_ += f_178_ * (float) i_170_;
		if (((Class109) this).aBoolean1669) {
		    i_169_ = i_171_ - i_170_ >> 2;
		    f_174_ *= 4.0F;
		    f_176_ *= 4.0F;
		    f_178_ *= 4.0F;
		    if (((Class109) this).anInt1674 == 0) {
			if (i_169_ > 0) {
			    do {
				i_168_ = ~0xffffff | ((int) f_173_ & 0xff0000
						      | (int) f_175_ & 0xff00
						      | (int) f_177_ & 0xff);
				f_173_ += f_174_;
				f_175_ += f_176_;
				f_177_ += f_178_;
				is[i++] = i_168_;
				is[i++] = i_168_;
				is[i++] = i_168_;
				is[i++] = i_168_;
			    } while (--i_169_ > 0);
			}
			i_169_ = i_171_ - i_170_ & 0x3;
			if (i_169_ > 0) {
			    i_168_ = ~0xffffff | ((int) f_173_ & 0xff0000
						  | (int) f_175_ & 0xff00
						  | (int) f_177_ & 0xff);
			    do
				is[i++] = i_168_;
			    while (--i_169_ > 0);
			}
		    } else if (!((Class109) this).aBoolean1667) {
			int i_179_ = ((Class109) this).anInt1674;
			int i_180_ = 256 - ((Class109) this).anInt1674;
			if (i_169_ > 0) {
			    do {
				i_168_ = ~0xffffff | ((int) f_173_ & 0xff0000
						      | (int) f_175_ & 0xff00
						      | (int) f_177_ & 0xff);
				f_173_ += f_174_;
				f_175_ += f_176_;
				f_177_ += f_178_;
				i_168_ = (((i_168_ & 0xff00ff) * i_180_ >> 8
					   & 0xff00ff)
					  + ((i_168_ & 0xff00) * i_180_ >> 8
					     & 0xff00));
				int i_181_ = is[i];
				is[i++] = (i_168_
					   + ((i_181_ & 0xff00ff) * i_179_ >> 8
					      & 0xff00ff)
					   + ((i_181_ & 0xff00) * i_179_ >> 8
					      & 0xff00));
				i_181_ = is[i];
				is[i++] = (i_168_
					   + ((i_181_ & 0xff00ff) * i_179_ >> 8
					      & 0xff00ff)
					   + ((i_181_ & 0xff00) * i_179_ >> 8
					      & 0xff00));
				i_181_ = is[i];
				is[i++] = (i_168_
					   + ((i_181_ & 0xff00ff) * i_179_ >> 8
					      & 0xff00ff)
					   + ((i_181_ & 0xff00) * i_179_ >> 8
					      & 0xff00));
				i_181_ = is[i];
				is[i++] = (i_168_
					   + ((i_181_ & 0xff00ff) * i_179_ >> 8
					      & 0xff00ff)
					   + ((i_181_ & 0xff00) * i_179_ >> 8
					      & 0xff00));
			    } while (--i_169_ > 0);
			}
			i_169_ = i_171_ - i_170_ & 0x3;
			if (i_169_ > 0) {
			    i_168_ = ~0xffffff | ((int) f_173_ & 0xff0000
						  | (int) f_175_ & 0xff00
						  | (int) f_177_ & 0xff);
			    i_168_ = (((i_168_ & 0xff00ff) * i_180_ >> 8
				       & 0xff00ff)
				      + ((i_168_ & 0xff00) * i_180_ >> 8
					 & 0xff00));
			    do {
				int i_182_ = is[i];
				is[i++] = (i_168_
					   + ((i_182_ & 0xff00ff) * i_179_ >> 8
					      & 0xff00ff)
					   + ((i_182_ & 0xff00) * i_179_ >> 8
					      & 0xff00));
			    } while (--i_169_ > 0);
			}
		    } else {
			if (i_169_ > 0) {
			    do {
				i_168_ = ((int) f_173_ & 0xff0000
					  | (int) f_175_ & 0xff00
					  | (int) f_177_ & 0xff);
				f_173_ += f_174_;
				f_175_ += f_176_;
				f_177_ += f_178_;
				int[] is_183_ = is;
				int i_184_ = i++;
				int i_185_ = i_168_;
				int i_186_ = is_183_[i_184_];
				int i_187_ = i_185_ + i_186_;
				int i_188_ = ((i_185_ & 0xff00ff)
					      + (i_186_ & 0xff00ff));
				i_186_
				    = (i_188_ & 0x1000100) + (i_187_ - i_188_
							      & 0x10000);
				is_183_[i_184_] = (~0xffffff | i_187_ - i_186_
						   | i_186_ - (i_186_ >>> 8));
				int[] is_189_ = is;
				int i_190_ = i++;
				int i_191_ = i_168_;
				int i_192_ = is_189_[i_190_];
				int i_193_ = i_191_ + i_192_;
				int i_194_ = ((i_191_ & 0xff00ff)
					      + (i_192_ & 0xff00ff));
				i_192_
				    = (i_194_ & 0x1000100) + (i_193_ - i_194_
							      & 0x10000);
				is_189_[i_190_] = (~0xffffff | i_193_ - i_192_
						   | i_192_ - (i_192_ >>> 8));
				int[] is_195_ = is;
				int i_196_ = i++;
				int i_197_ = i_168_;
				int i_198_ = is_195_[i_196_];
				int i_199_ = i_197_ + i_198_;
				int i_200_ = ((i_197_ & 0xff00ff)
					      + (i_198_ & 0xff00ff));
				i_198_
				    = (i_200_ & 0x1000100) + (i_199_ - i_200_
							      & 0x10000);
				is_195_[i_196_] = (~0xffffff | i_199_ - i_198_
						   | i_198_ - (i_198_ >>> 8));
				int[] is_201_ = is;
				int i_202_ = i++;
				int i_203_ = i_168_;
				int i_204_ = is_201_[i_202_];
				int i_205_ = i_203_ + i_204_;
				int i_206_ = ((i_203_ & 0xff00ff)
					      + (i_204_ & 0xff00ff));
				i_204_
				    = (i_206_ & 0x1000100) + (i_205_ - i_206_
							      & 0x10000);
				is_201_[i_202_] = (~0xffffff | i_205_ - i_204_
						   | i_204_ - (i_204_ >>> 8));
			    } while (--i_169_ > 0);
			}
			i_169_ = i_171_ - i_170_ & 0x3;
			if (i_169_ > 0) {
			    i_168_ = ((int) f_173_ & 0xff0000
				      | (int) f_175_ & 0xff00
				      | (int) f_177_ & 0xff);
			    do {
				int[] is_207_ = is;
				int i_208_ = i++;
				int i_209_ = i_168_;
				int i_210_ = is_207_[i_208_];
				int i_211_ = i_209_ + i_210_;
				int i_212_ = ((i_209_ & 0xff00ff)
					      + (i_210_ & 0xff00ff));
				i_210_
				    = (i_212_ & 0x1000100) + (i_211_ - i_212_
							      & 0x10000);
				is_207_[i_208_] = (~0xffffff | i_211_ - i_210_
						   | i_210_ - (i_210_ >>> 8));
			    } while (--i_169_ > 0);
			}
		    }
		} else {
		    i_169_ = i_171_ - i_170_;
		    if (((Class109) this).anInt1674 == 0) {
			do {
			    is[i++] = ~0xffffff | ((int) f_173_ & 0xff0000
						   | (int) f_175_ & 0xff00
						   | (int) f_177_ & 0xff);
			    f_173_ += f_174_;
			    f_175_ += f_176_;
			    f_177_ += f_178_;
			} while (--i_169_ > 0);
		    } else if (!((Class109) this).aBoolean1667) {
			int i_213_ = ((Class109) this).anInt1674;
			int i_214_ = 256 - ((Class109) this).anInt1674;
			do {
			    i_168_ = ~0xffffff | ((int) f_173_ & 0xff0000
						  | (int) f_175_ & 0xff00
						  | (int) f_177_ & 0xff);
			    f_173_ += f_174_;
			    f_175_ += f_176_;
			    f_177_ += f_178_;
			    i_168_ = (((i_168_ & 0xff00ff) * i_214_ >> 8
				       & 0xff00ff)
				      + ((i_168_ & 0xff00) * i_214_ >> 8
					 & 0xff00));
			    int i_215_ = is[i];
			    is[i++] = (i_168_
				       + ((i_215_ & 0xff00ff) * i_213_ >> 8
					  & 0xff00ff)
				       + ((i_215_ & 0xff00) * i_213_ >> 8
					  & 0xff00));
			} while (--i_169_ > 0);
		    } else {
			do {
			    int[] is_216_ = is;
			    int i_217_ = i++;
			    int i_218_ = ((int) f_173_ & 0xff0000
					  | (int) f_175_ & 0xff00
					  | (int) f_177_ & 0xff);
			    int i_219_ = is_216_[i_217_];
			    int i_220_ = i_218_ + i_219_;
			    int i_221_
				= (i_218_ & 0xff00ff) + (i_219_ & 0xff00ff);
			    i_219_ = (i_221_ & 0x1000100) + (i_220_ - i_221_
							     & 0x10000);
			    is_216_[i_217_] = (~0xffffff | i_220_ - i_219_
					       | i_219_ - (i_219_ >>> 8));
			    f_173_ += f_174_;
			    f_175_ += f_176_;
			    f_177_ += f_178_;
			} while (--i_169_ > 0);
		    }
		}
	    } else {
		i += i_170_ - 1;
		f += f_172_ * (float) i_170_;
		f_173_ += f_174_ * (float) i_170_;
		f_175_ += f_176_ * (float) i_170_;
		f_177_ += f_178_ * (float) i_170_;
		if (((Class167) aClass167_1670).aBoolean2202) {
		    if (((Class109) this).aBoolean1669) {
			i_169_ = i_171_ - i_170_ >> 2;
			f_174_ *= 4.0F;
			f_176_ *= 4.0F;
			f_178_ *= 4.0F;
			if (((Class109) this).anInt1674 == 0) {
			    if (i_169_ > 0) {
				do {
				    i_168_
					= ~0xffffff | ((int) f_173_ & 0xff0000
						       | (int) f_175_ & 0xff00
						       | (int) f_177_ & 0xff);
				    f_173_ += f_174_;
				    f_175_ += f_176_;
				    f_177_ += f_178_;
				    if (f < fs[++i]) {
					is[i] = i_168_;
					fs[i] = f;
				    }
				    f += f_172_;
				    if (f < fs[++i]) {
					is[i] = i_168_;
					fs[i] = f;
				    }
				    f += f_172_;
				    if (f < fs[++i]) {
					is[i] = i_168_;
					fs[i] = f;
				    }
				    f += f_172_;
				    if (f < fs[++i]) {
					is[i] = i_168_;
					fs[i] = f;
				    }
				    f += f_172_;
				} while (--i_169_ > 0);
			    }
			    i_169_ = i_171_ - i_170_ & 0x3;
			    if (i_169_ > 0) {
				i_168_ = ~0xffffff | ((int) f_173_ & 0xff0000
						      | (int) f_175_ & 0xff00
						      | (int) f_177_ & 0xff);
				do {
				    if (f < fs[++i]) {
					is[i] = i_168_;
					fs[i] = f;
				    }
				    f += f_172_;
				} while (--i_169_ > 0);
			    }
			} else if (!((Class109) this).aBoolean1667) {
			    int i_222_ = ((Class109) this).anInt1674;
			    int i_223_ = 256 - ((Class109) this).anInt1674;
			    if (i_169_ > 0) {
				do {
				    i_168_
					= ~0xffffff | ((int) f_173_ & 0xff0000
						       | (int) f_175_ & 0xff00
						       | (int) f_177_ & 0xff);
				    f_173_ += f_174_;
				    f_175_ += f_176_;
				    f_177_ += f_178_;
				    i_168_
					= (((i_168_ & 0xff00ff) * i_223_ >> 8
					    & 0xff00ff)
					   + ((i_168_ & 0xff00) * i_223_ >> 8
					      & 0xff00));
				    if (f < fs[++i]) {
					int i_224_ = is[i];
					is[i]
					    = (i_168_
					       + (((i_224_ & 0xff00ff) * i_222_
						   >> 8)
						  & 0xff00ff)
					       + (((i_224_ & 0xff00) * i_222_
						   >> 8)
						  & 0xff00));
					fs[i] = f;
				    }
				    f += f_172_;
				    if (f < fs[++i]) {
					int i_225_ = is[i];
					is[i]
					    = (i_168_
					       + (((i_225_ & 0xff00ff) * i_222_
						   >> 8)
						  & 0xff00ff)
					       + (((i_225_ & 0xff00) * i_222_
						   >> 8)
						  & 0xff00));
					fs[i] = f;
				    }
				    f += f_172_;
				    if (f < fs[++i]) {
					int i_226_ = is[i];
					is[i]
					    = (i_168_
					       + (((i_226_ & 0xff00ff) * i_222_
						   >> 8)
						  & 0xff00ff)
					       + (((i_226_ & 0xff00) * i_222_
						   >> 8)
						  & 0xff00));
					fs[i] = f;
				    }
				    f += f_172_;
				    if (f < fs[++i]) {
					int i_227_ = is[i];
					is[i]
					    = (i_168_
					       + (((i_227_ & 0xff00ff) * i_222_
						   >> 8)
						  & 0xff00ff)
					       + (((i_227_ & 0xff00) * i_222_
						   >> 8)
						  & 0xff00));
					fs[i] = f;
				    }
				    f += f_172_;
				} while (--i_169_ > 0);
			    }
			    i_169_ = i_171_ - i_170_ & 0x3;
			    if (i_169_ > 0) {
				i_168_ = ~0xffffff | ((int) f_173_ & 0xff0000
						      | (int) f_175_ & 0xff00
						      | (int) f_177_ & 0xff);
				i_168_ = (((i_168_ & 0xff00ff) * i_223_ >> 8
					   & 0xff00ff)
					  + ((i_168_ & 0xff00) * i_223_ >> 8
					     & 0xff00));
				do {
				    if (f < fs[++i]) {
					int i_228_ = is[i];
					is[i]
					    = (i_168_
					       + (((i_228_ & 0xff00ff) * i_222_
						   >> 8)
						  & 0xff00ff)
					       + (((i_228_ & 0xff00) * i_222_
						   >> 8)
						  & 0xff00));
					fs[i] = f;
				    }
				    f += f_172_;
				} while (--i_169_ > 0);
			    }
			} else {
			    if (i_169_ > 0) {
				do {
				    i_168_ = ((int) f_173_ & 0xff0000
					      | (int) f_175_ & 0xff00
					      | (int) f_177_ & 0xff);
				    f_173_ += f_174_;
				    f_175_ += f_176_;
				    f_177_ += f_178_;
				    if (f < fs[++i]) {
					int[] is_229_ = is;
					int i_230_ = i;
					int i_231_ = i_168_;
					int i_232_ = is_229_[i_230_];
					int i_233_ = i_231_ + i_232_;
					int i_234_ = ((i_231_ & 0xff00ff)
						      + (i_232_ & 0xff00ff));
					i_232_
					    = ((i_234_ & 0x1000100)
					       + (i_233_ - i_234_ & 0x10000));
					is_229_[i_230_]
					    = (~0xffffff | i_233_ - i_232_
					       | i_232_ - (i_232_ >>> 8));
					fs[i] = f;
				    }
				    f += f_172_;
				    if (f < fs[++i]) {
					int[] is_235_ = is;
					int i_236_ = i;
					int i_237_ = i_168_;
					int i_238_ = is_235_[i_236_];
					int i_239_ = i_237_ + i_238_;
					int i_240_ = ((i_237_ & 0xff00ff)
						      + (i_238_ & 0xff00ff));
					i_238_
					    = ((i_240_ & 0x1000100)
					       + (i_239_ - i_240_ & 0x10000));
					is_235_[i_236_]
					    = (~0xffffff | i_239_ - i_238_
					       | i_238_ - (i_238_ >>> 8));
					fs[i] = f;
				    }
				    f += f_172_;
				    if (f < fs[++i]) {
					int[] is_241_ = is;
					int i_242_ = i;
					int i_243_ = i_168_;
					int i_244_ = is_241_[i_242_];
					int i_245_ = i_243_ + i_244_;
					int i_246_ = ((i_243_ & 0xff00ff)
						      + (i_244_ & 0xff00ff));
					i_244_
					    = ((i_246_ & 0x1000100)
					       + (i_245_ - i_246_ & 0x10000));
					is_241_[i_242_]
					    = (~0xffffff | i_245_ - i_244_
					       | i_244_ - (i_244_ >>> 8));
					fs[i] = f;
				    }
				    f += f_172_;
				    if (f < fs[++i]) {
					int[] is_247_ = is;
					int i_248_ = i;
					int i_249_ = i_168_;
					int i_250_ = is_247_[i_248_];
					int i_251_ = i_249_ + i_250_;
					int i_252_ = ((i_249_ & 0xff00ff)
						      + (i_250_ & 0xff00ff));
					i_250_
					    = ((i_252_ & 0x1000100)
					       + (i_251_ - i_252_ & 0x10000));
					is_247_[i_248_]
					    = (~0xffffff | i_251_ - i_250_
					       | i_250_ - (i_250_ >>> 8));
					fs[i] = f;
				    }
				    f += f_172_;
				} while (--i_169_ > 0);
			    }
			    i_169_ = i_171_ - i_170_ & 0x3;
			    if (i_169_ > 0) {
				i_168_ = ((int) f_173_ & 0xff0000
					  | (int) f_175_ & 0xff00
					  | (int) f_177_ & 0xff);
				do {
				    if (f < fs[++i]) {
					int[] is_253_ = is;
					int i_254_ = i;
					int i_255_ = i_168_;
					int i_256_ = is_253_[i_254_];
					int i_257_ = i_255_ + i_256_;
					int i_258_ = ((i_255_ & 0xff00ff)
						      + (i_256_ & 0xff00ff));
					i_256_
					    = ((i_258_ & 0x1000100)
					       + (i_257_ - i_258_ & 0x10000));
					is_253_[i_254_]
					    = (~0xffffff | i_257_ - i_256_
					       | i_256_ - (i_256_ >>> 8));
					fs[i] = f;
				    }
				    f += f_172_;
				} while (--i_169_ > 0);
			    }
			}
		    } else {
			i_169_ = i_171_ - i_170_;
			if (((Class109) this).anInt1674 == 0) {
			    do {
				if (f < fs[++i]) {
				    is[i]
					= ~0xffffff | ((int) f_173_ & 0xff0000
						       | (int) f_175_ & 0xff00
						       | (int) f_177_ & 0xff);
				    fs[i] = f;
				}
				f += f_172_;
				f_173_ += f_174_;
				f_175_ += f_176_;
				f_177_ += f_178_;
			    } while (--i_169_ > 0);
			} else if (!((Class109) this).aBoolean1667) {
			    int i_259_ = ((Class109) this).anInt1674;
			    int i_260_ = 256 - ((Class109) this).anInt1674;
			    do {
				if (f < fs[++i]) {
				    i_168_
					= ~0xffffff | ((int) f_173_ & 0xff0000
						       | (int) f_175_ & 0xff00
						       | (int) f_177_ & 0xff);
				    i_168_
					= (((i_168_ & 0xff00ff) * i_260_ >> 8
					    & 0xff00ff)
					   + ((i_168_ & 0xff00) * i_260_ >> 8
					      & 0xff00));
				    int i_261_ = is[i];
				    is[i]
					= (i_168_
					   + ((i_261_ & 0xff00ff) * i_259_ >> 8
					      & 0xff00ff)
					   + ((i_261_ & 0xff00) * i_259_ >> 8
					      & 0xff00));
				    fs[i] = f;
				}
				f += f_172_;
				f_173_ += f_174_;
				f_175_ += f_176_;
				f_177_ += f_178_;
			    } while (--i_169_ > 0);
			} else {
			    do {
				if (f < fs[++i]) {
				    int[] is_262_ = is;
				    int i_263_ = i;
				    int i_264_ = ((int) f_173_ & 0xff0000
						  | (int) f_175_ & 0xff00
						  | (int) f_177_ & 0xff);
				    int i_265_ = is_262_[i_263_];
				    int i_266_ = i_264_ + i_265_;
				    int i_267_ = ((i_264_ & 0xff00ff)
						  + (i_265_ & 0xff00ff));
				    i_265_ = ((i_267_ & 0x1000100)
					      + (i_266_ - i_267_ & 0x10000));
				    is_262_[i_263_]
					= (~0xffffff | i_266_ - i_265_
					   | i_265_ - (i_265_ >>> 8));
				    fs[i] = f;
				}
				f += f_172_;
				f_173_ += f_174_;
				f_175_ += f_176_;
				f_177_ += f_178_;
			    } while (--i_169_ > 0);
			}
		    }
		} else if (((Class109) this).aBoolean1669) {
		    i_169_ = i_171_ - i_170_ >> 2;
		    f_174_ *= 4.0F;
		    f_176_ *= 4.0F;
		    f_178_ *= 4.0F;
		    if (((Class109) this).anInt1674 == 0) {
			if (i_169_ > 0) {
			    do {
				i_168_ = ~0xffffff | ((int) f_173_ & 0xff0000
						      | (int) f_175_ & 0xff00
						      | (int) f_177_ & 0xff);
				f_173_ += f_174_;
				f_175_ += f_176_;
				f_177_ += f_178_;
				if (f < fs[++i])
				    is[i] = i_168_;
				f += f_172_;
				if (f < fs[++i])
				    is[i] = i_168_;
				f += f_172_;
				if (f < fs[++i])
				    is[i] = i_168_;
				f += f_172_;
				if (f < fs[++i])
				    is[i] = i_168_;
				f += f_172_;
			    } while (--i_169_ > 0);
			}
			i_169_ = i_171_ - i_170_ & 0x3;
			if (i_169_ > 0) {
			    i_168_ = ~0xffffff | ((int) f_173_ & 0xff0000
						  | (int) f_175_ & 0xff00
						  | (int) f_177_ & 0xff);
			    do {
				if (f < fs[++i])
				    is[i] = i_168_;
				f += f_172_;
			    } while (--i_169_ > 0);
			}
		    } else if (!((Class109) this).aBoolean1667) {
			int i_268_ = ((Class109) this).anInt1674;
			int i_269_ = 256 - ((Class109) this).anInt1674;
			if (i_169_ > 0) {
			    do {
				i_168_ = ~0xffffff | ((int) f_173_ & 0xff0000
						      | (int) f_175_ & 0xff00
						      | (int) f_177_ & 0xff);
				f_173_ += f_174_;
				f_175_ += f_176_;
				f_177_ += f_178_;
				i_168_ = (((i_168_ & 0xff00ff) * i_269_ >> 8
					   & 0xff00ff)
					  + ((i_168_ & 0xff00) * i_269_ >> 8
					     & 0xff00));
				if (f < fs[++i]) {
				    int i_270_ = is[i];
				    is[i]
					= (i_168_
					   + ((i_270_ & 0xff00ff) * i_268_ >> 8
					      & 0xff00ff)
					   + ((i_270_ & 0xff00) * i_268_ >> 8
					      & 0xff00));
				}
				f += f_172_;
				if (f < fs[++i]) {
				    int i_271_ = is[i];
				    is[i]
					= (i_168_
					   + ((i_271_ & 0xff00ff) * i_268_ >> 8
					      & 0xff00ff)
					   + ((i_271_ & 0xff00) * i_268_ >> 8
					      & 0xff00));
				}
				f += f_172_;
				if (f < fs[++i]) {
				    int i_272_ = is[i];
				    is[i]
					= (i_168_
					   + ((i_272_ & 0xff00ff) * i_268_ >> 8
					      & 0xff00ff)
					   + ((i_272_ & 0xff00) * i_268_ >> 8
					      & 0xff00));
				}
				f += f_172_;
				if (f < fs[++i]) {
				    int i_273_ = is[i];
				    is[i]
					= (i_168_
					   + ((i_273_ & 0xff00ff) * i_268_ >> 8
					      & 0xff00ff)
					   + ((i_273_ & 0xff00) * i_268_ >> 8
					      & 0xff00));
				}
				f += f_172_;
			    } while (--i_169_ > 0);
			}
			i_169_ = i_171_ - i_170_ & 0x3;
			if (i_169_ > 0) {
			    i_168_ = ~0xffffff | ((int) f_173_ & 0xff0000
						  | (int) f_175_ & 0xff00
						  | (int) f_177_ & 0xff);
			    i_168_ = (((i_168_ & 0xff00ff) * i_269_ >> 8
				       & 0xff00ff)
				      + ((i_168_ & 0xff00) * i_269_ >> 8
					 & 0xff00));
			    do {
				if (f < fs[++i]) {
				    int i_274_ = is[i];
				    is[i]
					= (i_168_
					   + ((i_274_ & 0xff00ff) * i_268_ >> 8
					      & 0xff00ff)
					   + ((i_274_ & 0xff00) * i_268_ >> 8
					      & 0xff00));
				}
				f += f_172_;
			    } while (--i_169_ > 0);
			}
		    } else {
			if (i_169_ > 0) {
			    do {
				i_168_ = ((int) f_173_ & 0xff0000
					  | (int) f_175_ & 0xff00
					  | (int) f_177_ & 0xff);
				f_173_ += f_174_;
				f_175_ += f_176_;
				f_177_ += f_178_;
				if (f < fs[++i]) {
				    int[] is_275_ = is;
				    int i_276_ = i;
				    int i_277_ = i_168_;
				    int i_278_ = is_275_[i_276_];
				    int i_279_ = i_277_ + i_278_;
				    int i_280_ = ((i_277_ & 0xff00ff)
						  + (i_278_ & 0xff00ff));
				    i_278_ = ((i_280_ & 0x1000100)
					      + (i_279_ - i_280_ & 0x10000));
				    is_275_[i_276_]
					= (~0xffffff | i_279_ - i_278_
					   | i_278_ - (i_278_ >>> 8));
				}
				f += f_172_;
				if (f < fs[++i]) {
				    int[] is_281_ = is;
				    int i_282_ = i;
				    int i_283_ = i_168_;
				    int i_284_ = is_281_[i_282_];
				    int i_285_ = i_283_ + i_284_;
				    int i_286_ = ((i_283_ & 0xff00ff)
						  + (i_284_ & 0xff00ff));
				    i_284_ = ((i_286_ & 0x1000100)
					      + (i_285_ - i_286_ & 0x10000));
				    is_281_[i_282_]
					= (~0xffffff | i_285_ - i_284_
					   | i_284_ - (i_284_ >>> 8));
				}
				f += f_172_;
				if (f < fs[++i]) {
				    int[] is_287_ = is;
				    int i_288_ = i;
				    int i_289_ = i_168_;
				    int i_290_ = is_287_[i_288_];
				    int i_291_ = i_289_ + i_290_;
				    int i_292_ = ((i_289_ & 0xff00ff)
						  + (i_290_ & 0xff00ff));
				    i_290_ = ((i_292_ & 0x1000100)
					      + (i_291_ - i_292_ & 0x10000));
				    is_287_[i_288_]
					= (~0xffffff | i_291_ - i_290_
					   | i_290_ - (i_290_ >>> 8));
				}
				f += f_172_;
				if (f < fs[++i]) {
				    int[] is_293_ = is;
				    int i_294_ = i;
				    int i_295_ = i_168_;
				    int i_296_ = is_293_[i_294_];
				    int i_297_ = i_295_ + i_296_;
				    int i_298_ = ((i_295_ & 0xff00ff)
						  + (i_296_ & 0xff00ff));
				    i_296_ = ((i_298_ & 0x1000100)
					      + (i_297_ - i_298_ & 0x10000));
				    is_293_[i_294_]
					= (~0xffffff | i_297_ - i_296_
					   | i_296_ - (i_296_ >>> 8));
				}
				f += f_172_;
			    } while (--i_169_ > 0);
			}
			i_169_ = i_171_ - i_170_ & 0x3;
			if (i_169_ > 0) {
			    i_168_ = ((int) f_173_ & 0xff0000
				      | (int) f_175_ & 0xff00
				      | (int) f_177_ & 0xff);
			    do {
				if (f < fs[++i]) {
				    int[] is_299_ = is;
				    int i_300_ = i;
				    int i_301_ = i_168_;
				    int i_302_ = is_299_[i_300_];
				    int i_303_ = i_301_ + i_302_;
				    int i_304_ = ((i_301_ & 0xff00ff)
						  + (i_302_ & 0xff00ff));
				    i_302_ = ((i_304_ & 0x1000100)
					      + (i_303_ - i_304_ & 0x10000));
				    is_299_[i_300_]
					= (~0xffffff | i_303_ - i_302_
					   | i_302_ - (i_302_ >>> 8));
				}
				f += f_172_;
			    } while (--i_169_ > 0);
			}
		    }
		} else {
		    i_169_ = i_171_ - i_170_;
		    if (((Class109) this).anInt1674 == 0) {
			do {
			    if (f < fs[++i])
				is[i] = ~0xffffff | ((int) f_173_ & 0xff0000
						     | (int) f_175_ & 0xff00
						     | (int) f_177_ & 0xff);
			    f += f_172_;
			    f_173_ += f_174_;
			    f_175_ += f_176_;
			    f_177_ += f_178_;
			} while (--i_169_ > 0);
		    } else if (!((Class109) this).aBoolean1667) {
			int i_305_ = ((Class109) this).anInt1674;
			int i_306_ = 256 - ((Class109) this).anInt1674;
			do {
			    if (f < fs[++i]) {
				i_168_ = ~0xffffff | ((int) f_173_ & 0xff0000
						      | (int) f_175_ & 0xff00
						      | (int) f_177_ & 0xff);
				i_168_ = (((i_168_ & 0xff00ff) * i_306_ >> 8
					   & 0xff00ff)
					  + ((i_168_ & 0xff00) * i_306_ >> 8
					     & 0xff00));
				int i_307_ = is[i];
				is[i] = (i_168_
					 + ((i_307_ & 0xff00ff) * i_305_ >> 8
					    & 0xff00ff)
					 + ((i_307_ & 0xff00) * i_305_ >> 8
					    & 0xff00));
			    }
			    f += f_172_;
			    f_173_ += f_174_;
			    f_175_ += f_176_;
			    f_177_ += f_178_;
			} while (--i_169_ > 0);
		    } else {
			do {
			    if (f < fs[++i]) {
				int[] is_308_ = is;
				int i_309_ = i;
				int i_310_ = ((int) f_173_ & 0xff0000
					      | (int) f_175_ & 0xff00
					      | (int) f_177_ & 0xff);
				int i_311_ = is_308_[i_309_];
				int i_312_ = i_310_ + i_311_;
				int i_313_ = ((i_310_ & 0xff00ff)
					      + (i_311_ & 0xff00ff));
				i_311_
				    = (i_313_ & 0x1000100) + (i_312_ - i_313_
							      & 0x10000);
				is_308_[i_309_] = (~0xffffff | i_312_ - i_311_
						   | i_311_ - (i_311_ >>> 8));
			    }
			    f += f_172_;
			    f_173_ += f_174_;
			    f_175_ += f_176_;
			    f_177_ += f_178_;
			} while (--i_169_ > 0);
		    }
		}
	    }
	}
    }
    
    final void method1022(float f, float f_314_, float f_315_, float f_316_,
			  float f_317_, float f_318_, float f_319_,
			  float f_320_, float f_321_, float f_322_,
			  float f_323_, float f_324_) {
	if (aBoolean1675) {
	    aHa_Sub1_1666.method3645((int) f, (int) f_316_, (int) f_317_,
				     -8003,
				     Class126.hslColorTable[(int) f_322_],
				     (int) f_314_);
	    aHa_Sub1_1666.method3645((int) f_314_, (int) f_317_, (int) f_318_,
				     -8003,
				     Class126.hslColorTable[(int) f_322_],
				     (int) f_315_);
	    aHa_Sub1_1666.method3645((int) f_315_, (int) f_318_, (int) f_316_,
				     -8003,
				     Class126.hslColorTable[(int) f_322_],
				     (int) f);
	} else {
	    float f_325_ = f_317_ - f_316_;
	    float f_326_ = f_314_ - f;
	    float f_327_ = f_318_ - f_316_;
	    float f_328_ = f_315_ - f;
	    float f_329_ = f_323_ - f_322_;
	    float f_330_ = f_324_ - f_322_;
	    float f_331_ = f_320_ - f_319_;
	    float f_332_ = f_321_ - f_319_;
	    float f_333_;
	    if (f_315_ != f_314_)
		f_333_ = (f_318_ - f_317_) / (f_315_ - f_314_);
	    else
		f_333_ = 0.0F;
	    float f_334_;
	    if (f_314_ != f)
		f_334_ = f_325_ / f_326_;
	    else
		f_334_ = 0.0F;
	    float f_335_;
	    if (f_315_ != f)
		f_335_ = f_327_ / f_328_;
	    else
		f_335_ = 0.0F;
	    float f_336_ = f_325_ * f_328_ - f_327_ * f_326_;
	    if (f_336_ != 0.0F) {
		float f_337_ = (f_329_ * f_328_ - f_330_ * f_326_) / f_336_;
		float f_338_ = (f_330_ * f_325_ - f_329_ * f_327_) / f_336_;
		float f_339_ = (f_331_ * f_328_ - f_332_ * f_326_) / f_336_;
		float f_340_ = (f_332_ * f_325_ - f_331_ * f_327_) / f_336_;
		if (f <= f_314_ && f <= f_315_) {
		    if (!(f >= (float) ((Class109) this).anInt1672)) {
			if (f_314_ > (float) ((Class109) this).anInt1672)
			    f_314_ = (float) ((Class109) this).anInt1672;
			if (f_315_ > (float) ((Class109) this).anInt1672)
			    f_315_ = (float) ((Class109) this).anInt1672;
			f_322_ = f_322_ - f_337_ * f_316_ + f_337_;
			f_319_ = f_319_ - f_339_ * f_316_ + f_339_;
			if (f_314_ < f_315_) {
			    f_318_ = f_316_;
			    if (f < 0.0F) {
				f_318_ -= f_335_ * f;
				f_316_ -= f_334_ * f;
				f_322_ -= f_338_ * f;
				f_319_ -= f_340_ * f;
				f = 0.0F;
			    }
			    if (f_314_ < 0.0F) {
				f_317_ -= f_333_ * f_314_;
				f_314_ = 0.0F;
			    }
			    if (f != f_314_ && f_335_ < f_334_
				|| f == f_314_ && f_335_ > f_333_) {
				f_315_ -= f_314_;
				f_314_ -= f;
				f = (float) (((Class109) this).anIntArray1676
					     [(int) f]);
				while (--f_314_ >= 0.0F) {
				    method1019(anIntArray1673, aFloatArray1677,
					       (int) f, 0, 0, (int) f_318_,
					       (int) f_316_, f_322_, f_337_,
					       f_319_, f_339_);
				    f_318_ += f_335_;
				    f_316_ += f_334_;
				    f_322_ += f_338_;
				    f_319_ += f_340_;
				    f += (float) anInt1678;
				}
				while (--f_315_ >= 0.0F) {
				    method1019(anIntArray1673, aFloatArray1677,
					       (int) f, 0, 0, (int) f_318_,
					       (int) f_317_, f_322_, f_337_,
					       f_319_, f_339_);
				    f_318_ += f_335_;
				    f_317_ += f_333_;
				    f_322_ += f_338_;
				    f_319_ += f_340_;
				    f += (float) anInt1678;
				}
			    } else {
				f_315_ -= f_314_;
				f_314_ -= f;
				f = (float) (((Class109) this).anIntArray1676
					     [(int) f]);
				while (--f_314_ >= 0.0F) {
				    method1019(anIntArray1673, aFloatArray1677,
					       (int) f, 0, 0, (int) f_316_,
					       (int) f_318_, f_322_, f_337_,
					       f_319_, f_339_);
				    f_318_ += f_335_;
				    f_316_ += f_334_;
				    f_322_ += f_338_;
				    f_319_ += f_340_;
				    f += (float) anInt1678;
				}
				while (--f_315_ >= 0.0F) {
				    method1019(anIntArray1673, aFloatArray1677,
					       (int) f, 0, 0, (int) f_317_,
					       (int) f_318_, f_322_, f_337_,
					       f_319_, f_339_);
				    f_318_ += f_335_;
				    f_317_ += f_333_;
				    f_322_ += f_338_;
				    f_319_ += f_340_;
				    f += (float) anInt1678;
				}
			    }
			} else {
			    f_317_ = f_316_;
			    if (f < 0.0F) {
				f_317_ -= f_335_ * f;
				f_316_ -= f_334_ * f;
				f_322_ -= f_338_ * f;
				f_319_ -= f_340_ * f;
				f = 0.0F;
			    }
			    if (f_315_ < 0.0F) {
				f_318_ -= f_333_ * f_315_;
				f_315_ = 0.0F;
			    }
			    if (f != f_315_ && f_335_ < f_334_
				|| f == f_315_ && f_333_ > f_334_) {
				f_314_ -= f_315_;
				f_315_ -= f;
				f = (float) (((Class109) this).anIntArray1676
					     [(int) f]);
				while (--f_315_ >= 0.0F) {
				    method1019(anIntArray1673, aFloatArray1677,
					       (int) f, 0, 0, (int) f_317_,
					       (int) f_316_, f_322_, f_337_,
					       f_319_, f_339_);
				    f_317_ += f_335_;
				    f_316_ += f_334_;
				    f_322_ += f_338_;
				    f_319_ += f_340_;
				    f += (float) anInt1678;
				}
				while (--f_314_ >= 0.0F) {
				    method1019(anIntArray1673, aFloatArray1677,
					       (int) f, 0, 0, (int) f_318_,
					       (int) f_316_, f_322_, f_337_,
					       f_319_, f_339_);
				    f_318_ += f_333_;
				    f_316_ += f_334_;
				    f_322_ += f_338_;
				    f_319_ += f_340_;
				    f += (float) anInt1678;
				}
			    } else {
				f_314_ -= f_315_;
				f_315_ -= f;
				f = (float) (((Class109) this).anIntArray1676
					     [(int) f]);
				while (--f_315_ >= 0.0F) {
				    method1019(anIntArray1673, aFloatArray1677,
					       (int) f, 0, 0, (int) f_316_,
					       (int) f_317_, f_322_, f_337_,
					       f_319_, f_339_);
				    f_317_ += f_335_;
				    f_316_ += f_334_;
				    f_322_ += f_338_;
				    f_319_ += f_340_;
				    f += (float) anInt1678;
				}
				while (--f_314_ >= 0.0F) {
				    method1019(anIntArray1673, aFloatArray1677,
					       (int) f, 0, 0, (int) f_316_,
					       (int) f_318_, f_322_, f_337_,
					       f_319_, f_339_);
				    f_318_ += f_333_;
				    f_316_ += f_334_;
				    f_322_ += f_338_;
				    f_319_ += f_340_;
				    f += (float) anInt1678;
				}
			    }
			}
		    }
		} else if (f_314_ <= f_315_) {
		    if (!(f_314_ >= (float) ((Class109) this).anInt1672)) {
			if (f_315_ > (float) ((Class109) this).anInt1672)
			    f_315_ = (float) ((Class109) this).anInt1672;
			if (f > (float) ((Class109) this).anInt1672)
			    f = (float) ((Class109) this).anInt1672;
			f_323_ = f_323_ - f_337_ * f_317_ + f_337_;
			f_320_ = f_320_ - f_339_ * f_317_ + f_339_;
			if (f_315_ < f) {
			    f_316_ = f_317_;
			    if (f_314_ < 0.0F) {
				f_316_ -= f_334_ * f_314_;
				f_317_ -= f_333_ * f_314_;
				f_323_ -= f_338_ * f_314_;
				f_320_ -= f_340_ * f_314_;
				f_314_ = 0.0F;
			    }
			    if (f_315_ < 0.0F) {
				f_318_ -= f_335_ * f_315_;
				f_315_ = 0.0F;
			    }
			    if (f_314_ != f_315_ && f_334_ < f_333_
				|| f_314_ == f_315_ && f_334_ > f_335_) {
				f -= f_315_;
				f_315_ -= f_314_;
				f_314_
				    = (float) (((Class109) this).anIntArray1676
					       [(int) f_314_]);
				while (--f_315_ >= 0.0F) {
				    method1019(anIntArray1673, aFloatArray1677,
					       (int) f_314_, 0, 0,
					       (int) f_316_, (int) f_317_,
					       f_323_, f_337_, f_320_, f_339_);
				    f_316_ += f_334_;
				    f_317_ += f_333_;
				    f_323_ += f_338_;
				    f_320_ += f_340_;
				    f_314_ += (float) anInt1678;
				}
				while (--f >= 0.0F) {
				    method1019(anIntArray1673, aFloatArray1677,
					       (int) f_314_, 0, 0,
					       (int) f_316_, (int) f_318_,
					       f_323_, f_337_, f_320_, f_339_);
				    f_316_ += f_334_;
				    f_318_ += f_335_;
				    f_323_ += f_338_;
				    f_320_ += f_340_;
				    f_314_ += (float) anInt1678;
				}
			    } else {
				f -= f_315_;
				f_315_ -= f_314_;
				f_314_
				    = (float) (((Class109) this).anIntArray1676
					       [(int) f_314_]);
				while (--f_315_ >= 0.0F) {
				    method1019(anIntArray1673, aFloatArray1677,
					       (int) f_314_, 0, 0,
					       (int) f_317_, (int) f_316_,
					       f_323_, f_337_, f_320_, f_339_);
				    f_316_ += f_334_;
				    f_317_ += f_333_;
				    f_323_ += f_338_;
				    f_320_ += f_340_;
				    f_314_ += (float) anInt1678;
				}
				while (--f >= 0.0F) {
				    method1019(anIntArray1673, aFloatArray1677,
					       (int) f_314_, 0, 0,
					       (int) f_318_, (int) f_316_,
					       f_323_, f_337_, f_320_, f_339_);
				    f_316_ += f_334_;
				    f_318_ += f_335_;
				    f_323_ += f_338_;
				    f_320_ += f_340_;
				    f_314_ += (float) anInt1678;
				}
			    }
			} else {
			    f_318_ = f_317_;
			    if (f_314_ < 0.0F) {
				f_318_ -= f_334_ * f_314_;
				f_317_ -= f_333_ * f_314_;
				f_323_ -= f_338_ * f_314_;
				f_320_ -= f_340_ * f_314_;
				f_314_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_316_ -= f_335_ * f;
				f = 0.0F;
			    }
			    if (f_334_ < f_333_) {
				f_315_ -= f;
				f -= f_314_;
				f_314_
				    = (float) (((Class109) this).anIntArray1676
					       [(int) f_314_]);
				while (--f >= 0.0F) {
				    method1019(anIntArray1673, aFloatArray1677,
					       (int) f_314_, 0, 0,
					       (int) f_318_, (int) f_317_,
					       f_323_, f_337_, f_320_, f_339_);
				    f_318_ += f_334_;
				    f_317_ += f_333_;
				    f_323_ += f_338_;
				    f_320_ += f_340_;
				    f_314_ += (float) anInt1678;
				}
				while (--f_315_ >= 0.0F) {
				    method1019(anIntArray1673, aFloatArray1677,
					       (int) f_314_, 0, 0,
					       (int) f_316_, (int) f_317_,
					       f_323_, f_337_, f_320_, f_339_);
				    f_316_ += f_335_;
				    f_317_ += f_333_;
				    f_323_ += f_338_;
				    f_320_ += f_340_;
				    f_314_ += (float) anInt1678;
				}
			    } else {
				f_315_ -= f;
				f -= f_314_;
				f_314_
				    = (float) (((Class109) this).anIntArray1676
					       [(int) f_314_]);
				while (--f >= 0.0F) {
				    method1019(anIntArray1673, aFloatArray1677,
					       (int) f_314_, 0, 0,
					       (int) f_317_, (int) f_318_,
					       f_323_, f_337_, f_320_, f_339_);
				    f_318_ += f_334_;
				    f_317_ += f_333_;
				    f_323_ += f_338_;
				    f_320_ += f_340_;
				    f_314_ += (float) anInt1678;
				}
				while (--f_315_ >= 0.0F) {
				    method1019(anIntArray1673, aFloatArray1677,
					       (int) f_314_, 0, 0,
					       (int) f_317_, (int) f_316_,
					       f_323_, f_337_, f_320_, f_339_);
				    f_316_ += f_335_;
				    f_317_ += f_333_;
				    f_323_ += f_338_;
				    f_320_ += f_340_;
				    f_314_ += (float) anInt1678;
				}
			    }
			}
		    }
		} else if (!(f_315_ >= (float) ((Class109) this).anInt1672)) {
		    if (f > (float) ((Class109) this).anInt1672)
			f = (float) ((Class109) this).anInt1672;
		    if (f_314_ > (float) ((Class109) this).anInt1672)
			f_314_ = (float) ((Class109) this).anInt1672;
		    f_324_ = f_324_ - f_337_ * f_318_ + f_337_;
		    f_321_ = f_321_ - f_339_ * f_318_ + f_339_;
		    if (f < f_314_) {
			f_317_ = f_318_;
			if (f_315_ < 0.0F) {
			    f_317_ -= f_333_ * f_315_;
			    f_318_ -= f_335_ * f_315_;
			    f_324_ -= f_338_ * f_315_;
			    f_321_ -= f_340_ * f_315_;
			    f_315_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_316_ -= f_334_ * f;
			    f = 0.0F;
			}
			if (f_333_ < f_335_) {
			    f_314_ -= f;
			    f -= f_315_;
			    f_315_ = (float) (((Class109) this).anIntArray1676
					      [(int) f_315_]);
			    while (--f >= 0.0F) {
				method1019(anIntArray1673, aFloatArray1677,
					   (int) f_315_, 0, 0, (int) f_317_,
					   (int) f_318_, f_324_, f_337_,
					   f_321_, f_339_);
				f_317_ += f_333_;
				f_318_ += f_335_;
				f_324_ += f_338_;
				f_321_ += f_340_;
				f_315_ += (float) anInt1678;
			    }
			    while (--f_314_ >= 0.0F) {
				method1019(anIntArray1673, aFloatArray1677,
					   (int) f_315_, 0, 0, (int) f_317_,
					   (int) f_316_, f_324_, f_337_,
					   f_321_, f_339_);
				f_317_ += f_333_;
				f_316_ += f_334_;
				f_324_ += f_338_;
				f_321_ += f_340_;
				f_315_ += (float) anInt1678;
			    }
			} else {
			    f_314_ -= f;
			    f -= f_315_;
			    f_315_ = (float) (((Class109) this).anIntArray1676
					      [(int) f_315_]);
			    while (--f >= 0.0F) {
				method1019(anIntArray1673, aFloatArray1677,
					   (int) f_315_, 0, 0, (int) f_318_,
					   (int) f_317_, f_324_, f_337_,
					   f_321_, f_339_);
				f_317_ += f_333_;
				f_318_ += f_335_;
				f_324_ += f_338_;
				f_321_ += f_340_;
				f_315_ += (float) anInt1678;
			    }
			    while (--f_314_ >= 0.0F) {
				method1019(anIntArray1673, aFloatArray1677,
					   (int) f_315_, 0, 0, (int) f_316_,
					   (int) f_317_, f_324_, f_337_,
					   f_321_, f_339_);
				f_317_ += f_333_;
				f_316_ += f_334_;
				f_324_ += f_338_;
				f_321_ += f_340_;
				f_315_ += (float) anInt1678;
			    }
			}
		    } else {
			f_316_ = f_318_;
			if (f_315_ < 0.0F) {
			    f_316_ -= f_333_ * f_315_;
			    f_318_ -= f_335_ * f_315_;
			    f_324_ -= f_338_ * f_315_;
			    f_321_ -= f_340_ * f_315_;
			    f_315_ = 0.0F;
			}
			if (f_314_ < 0.0F) {
			    f_317_ -= f_334_ * f_314_;
			    f_314_ = 0.0F;
			}
			if (f_333_ < f_335_) {
			    f -= f_314_;
			    f_314_ -= f_315_;
			    f_315_ = (float) (((Class109) this).anIntArray1676
					      [(int) f_315_]);
			    while (--f_314_ >= 0.0F) {
				method1019(anIntArray1673, aFloatArray1677,
					   (int) f_315_, 0, 0, (int) f_316_,
					   (int) f_318_, f_324_, f_337_,
					   f_321_, f_339_);
				f_316_ += f_333_;
				f_318_ += f_335_;
				f_324_ += f_338_;
				f_321_ += f_340_;
				f_315_ += (float) anInt1678;
			    }
			    while (--f >= 0.0F) {
				method1019(anIntArray1673, aFloatArray1677,
					   (int) f_315_, 0, 0, (int) f_317_,
					   (int) f_318_, f_324_, f_337_,
					   f_321_, f_339_);
				f_317_ += f_334_;
				f_318_ += f_335_;
				f_324_ += f_338_;
				f_321_ += f_340_;
				f_315_ += (float) anInt1678;
			    }
			} else {
			    f -= f_314_;
			    f_314_ -= f_315_;
			    f_315_ = (float) (((Class109) this).anIntArray1676
					      [(int) f_315_]);
			    while (--f_314_ >= 0.0F) {
				method1019(anIntArray1673, aFloatArray1677,
					   (int) f_315_, 0, 0, (int) f_318_,
					   (int) f_316_, f_324_, f_337_,
					   f_321_, f_339_);
				f_316_ += f_333_;
				f_318_ += f_335_;
				f_324_ += f_338_;
				f_321_ += f_340_;
				f_315_ += (float) anInt1678;
			    }
			    while (--f >= 0.0F) {
				method1019(anIntArray1673, aFloatArray1677,
					   (int) f_315_, 0, 0, (int) f_318_,
					   (int) f_317_, f_324_, f_337_,
					   f_321_, f_339_);
				f_317_ += f_334_;
				f_318_ += f_335_;
				f_324_ += f_338_;
				f_321_ += f_340_;
				f_315_ += (float) anInt1678;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method1023(boolean bool) {
	aBoolean1675 = bool;
    }
    
    final void method1024
	(float f, float f_341_, float f_342_, float f_343_, float f_344_,
	 float f_345_, float f_346_, float f_347_, float f_348_, float f_349_,
	 float f_350_, float f_351_, float f_352_, float f_353_, float f_354_,
	 int i, int i_355_, int i_356_, int i_357_, int i_358_, int i_359_,
	 int i_360_, int i_361_) {
	if (i_361_ != anInt1697) {
	    anIntArray1698 = aHa_Sub1_1666.method3719(i_361_);
	    if (anIntArray1698 == null) {
		method1027((float) (int) f, (float) (int) f_341_,
			   (float) (int) f_342_, (float) (int) f_343_,
			   (float) (int) f_344_, (float) (int) f_345_,
			   (float) (int) f_346_, (float) (int) f_347_,
			   (float) (int) f_348_,
			   Class6.method206(i, i_357_ | i_358_ << 24, 255),
			   Class6.method206(i_355_, i_357_ | i_359_ << 24,
					    255),
			   Class6.method206(i_356_, i_357_ | i_360_ << 24,
					    255));
		return;
	    }
	    anInt1693 = (aHa_Sub1_1666.method3727(i_361_) ? 64
			 : ((SoftwareToolkit) aHa_Sub1_1666).anInt7501);
	    anInt1690 = anInt1693 - 1;
	    anInt1683 = aHa_Sub1_1666.method3726(i_361_);
	    aBoolean1694 = aHa_Sub1_1666.method3714(i_361_);
	}
	anInt1696 = i_357_;
	float f_362_ = (float) (i >> 24 & 0xff);
	float f_363_ = (float) (i_355_ >> 24 & 0xff);
	float f_364_ = (float) (i_356_ >> 24 & 0xff);
	float f_365_ = (float) (i >> 16 & 0xff);
	float f_366_ = (float) (i_355_ >> 16 & 0xff);
	float f_367_ = (float) (i_356_ >> 16 & 0xff);
	float f_368_ = (float) (i >> 8 & 0xff);
	float f_369_ = (float) (i_355_ >> 8 & 0xff);
	float f_370_ = (float) (i_356_ >> 8 & 0xff);
	float f_371_ = (float) (i & 0xff);
	float f_372_ = (float) (i_355_ & 0xff);
	float f_373_ = (float) (i_356_ & 0xff);
	f_349_ /= f_346_;
	f_350_ /= f_347_;
	f_351_ /= f_348_;
	f_352_ /= f_346_;
	f_353_ /= f_347_;
	f_354_ /= f_348_;
	f_346_ = 1.0F / f_346_;
	f_347_ = 1.0F / f_347_;
	f_348_ = 1.0F / f_348_;
	float f_374_ = 0.0F;
	float f_375_ = 0.0F;
	float f_376_ = 0.0F;
	float f_377_ = 0.0F;
	float f_378_ = 0.0F;
	float f_379_ = 0.0F;
	float f_380_ = 0.0F;
	float f_381_ = 0.0F;
	float f_382_ = 0.0F;
	if (f_341_ != f) {
	    float f_383_ = f_341_ - f;
	    f_374_ = (f_344_ - f_343_) / f_383_;
	    f_375_ = (f_347_ - f_346_) / f_383_;
	    f_376_ = (f_350_ - f_349_) / f_383_;
	    f_377_ = (f_353_ - f_352_) / f_383_;
	    f_378_ = (float) (i_359_ - i_358_) / f_383_;
	    f_379_ = (f_363_ - f_362_) / f_383_;
	    f_380_ = (f_366_ - f_365_) / f_383_;
	    f_381_ = (f_369_ - f_368_) / f_383_;
	    f_382_ = (f_372_ - f_371_) / f_383_;
	}
	float f_384_ = 0.0F;
	float f_385_ = 0.0F;
	float f_386_ = 0.0F;
	float f_387_ = 0.0F;
	float f_388_ = 0.0F;
	float f_389_ = 0.0F;
	float f_390_ = 0.0F;
	float f_391_ = 0.0F;
	float f_392_ = 0.0F;
	if (f_342_ != f_341_) {
	    float f_393_ = f_342_ - f_341_;
	    f_384_ = (f_345_ - f_344_) / f_393_;
	    f_385_ = (f_348_ - f_347_) / f_393_;
	    f_386_ = (f_351_ - f_350_) / f_393_;
	    f_387_ = (f_354_ - f_353_) / f_393_;
	    f_388_ = (float) (i_360_ - i_359_) / f_393_;
	    f_389_ = (f_364_ - f_363_) / f_393_;
	    f_390_ = (f_367_ - f_366_) / f_393_;
	    f_391_ = (f_370_ - f_369_) / f_393_;
	    f_392_ = (f_373_ - f_372_) / f_393_;
	}
	float f_394_ = 0.0F;
	float f_395_ = 0.0F;
	float f_396_ = 0.0F;
	float f_397_ = 0.0F;
	float f_398_ = 0.0F;
	float f_399_ = 0.0F;
	float f_400_ = 0.0F;
	float f_401_ = 0.0F;
	float f_402_ = 0.0F;
	if (f != f_342_) {
	    float f_403_ = f - f_342_;
	    f_394_ = (f_343_ - f_345_) / f_403_;
	    f_395_ = (f_346_ - f_348_) / f_403_;
	    f_396_ = (f_349_ - f_351_) / f_403_;
	    f_397_ = (f_352_ - f_354_) / f_403_;
	    f_398_ = (float) (i_358_ - i_360_) / f_403_;
	    f_399_ = (f_362_ - f_364_) / f_403_;
	    f_400_ = (f_365_ - f_367_) / f_403_;
	    f_401_ = (f_368_ - f_370_) / f_403_;
	    f_402_ = (f_371_ - f_373_) / f_403_;
	}
	if (f <= f_341_ && f <= f_342_) {
	    if (!(f >= (float) ((Class109) this).anInt1672)) {
		if (f_341_ > (float) ((Class109) this).anInt1672)
		    f_341_ = (float) ((Class109) this).anInt1672;
		if (f_342_ > (float) ((Class109) this).anInt1672)
		    f_342_ = (float) ((Class109) this).anInt1672;
		if (f_341_ < f_342_) {
		    f_345_ = f_343_;
		    f_348_ = f_346_;
		    f_351_ = f_349_;
		    f_354_ = f_352_;
		    i_360_ = i_358_;
		    f_364_ = f_362_;
		    f_367_ = f_365_;
		    f_370_ = f_368_;
		    f_373_ = f_371_;
		    if (f < 0.0F) {
			f_343_ -= f_374_ * f;
			f_345_ -= f_394_ * f;
			f_346_ -= f_375_ * f;
			f_348_ -= f_395_ * f;
			f_349_ -= f_376_ * f;
			f_351_ -= f_396_ * f;
			f_352_ -= f_377_ * f;
			f_354_ -= f_397_ * f;
			i_358_ -= f_378_ * f;
			i_360_ -= f_398_ * f;
			f_362_ -= f_379_ * f;
			f_364_ -= f_399_ * f;
			f_365_ -= f_379_ * f;
			f_367_ -= f_399_ * f;
			f_368_ -= f_379_ * f;
			f_370_ -= f_399_ * f;
			f_371_ -= f_379_ * f;
			f_373_ -= f_399_ * f;
			f = 0.0F;
		    }
		    if (f_341_ < 0.0F) {
			f_344_ -= f_384_ * f_341_;
			f_347_ -= f_385_ * f_341_;
			f_350_ -= f_386_ * f_341_;
			f_353_ -= f_387_ * f_341_;
			i_359_ -= f_388_ * f_341_;
			f_363_ -= f_389_ * f_341_;
			f_366_ -= f_390_ * f_341_;
			f_369_ -= f_391_ * f_341_;
			f_372_ -= f_392_ * f_341_;
			f_341_ = 0.0F;
		    }
		    if (f != f_341_ && f_394_ < f_374_
			|| f == f_341_ && f_394_ > f_384_) {
			f_342_ -= f_341_;
			f_341_ -= f;
			f = (float) ((Class109) this).anIntArray1676[(int) f];
			while (--f_341_ >= 0.0F) {
			    method1016(anIntArray1673, anIntArray1698, (int) f,
				       (int) f_345_, (int) f_343_, f_348_,
				       f_346_, f_351_, f_349_, f_354_, f_352_,
				       (float) i_360_, (float) i_358_, f_364_,
				       f_362_, f_367_, f_365_, f_370_, f_368_,
				       f_373_, f_371_);
			    f_343_ += f_374_;
			    f_345_ += f_394_;
			    f_346_ += f_375_;
			    f_348_ += f_395_;
			    f_349_ += f_376_;
			    f_351_ += f_396_;
			    f_352_ += f_377_;
			    f_354_ += f_397_;
			    i_358_ += f_378_;
			    i_360_ += f_398_;
			    f_362_ += f_379_;
			    f_364_ += f_399_;
			    f_365_ += f_380_;
			    f_367_ += f_400_;
			    f_368_ += f_381_;
			    f_370_ += f_401_;
			    f_371_ += f_382_;
			    f_373_ += f_402_;
			    f += (float) anInt1678;
			}
			while (--f_342_ >= 0.0F) {
			    method1016(anIntArray1673, anIntArray1698, (int) f,
				       (int) f_345_, (int) f_344_, f_348_,
				       f_347_, f_351_, f_350_, f_354_, f_353_,
				       (float) i_360_, (float) i_359_, f_364_,
				       f_363_, f_367_, f_366_, f_370_, f_369_,
				       f_373_, f_372_);
			    f_344_ += f_384_;
			    f_345_ += f_394_;
			    f_347_ += f_385_;
			    f_348_ += f_395_;
			    f_350_ += f_386_;
			    f_351_ += f_396_;
			    f_353_ += f_387_;
			    f_354_ += f_397_;
			    i_359_ += f_388_;
			    i_360_ += f_398_;
			    f_363_ += f_389_;
			    f_364_ += f_399_;
			    f_366_ += f_390_;
			    f_367_ += f_400_;
			    f_369_ += f_391_;
			    f_370_ += f_401_;
			    f_372_ += f_392_;
			    f_373_ += f_402_;
			    f += (float) anInt1678;
			}
		    } else {
			f_342_ -= f_341_;
			f_341_ -= f;
			f = (float) ((Class109) this).anIntArray1676[(int) f];
			while (--f_341_ >= 0.0F) {
			    method1016(anIntArray1673, anIntArray1698, (int) f,
				       (int) f_343_, (int) f_345_, f_346_,
				       f_348_, f_349_, f_351_, f_352_, f_354_,
				       (float) i_358_, (float) i_360_, f_362_,
				       f_364_, f_365_, f_367_, f_368_, f_370_,
				       f_371_, f_373_);
			    f_343_ += f_374_;
			    f_345_ += f_394_;
			    f_346_ += f_375_;
			    f_348_ += f_395_;
			    f_349_ += f_376_;
			    f_351_ += f_396_;
			    f_352_ += f_377_;
			    f_354_ += f_397_;
			    i_358_ += f_378_;
			    i_360_ += f_398_;
			    f_362_ += f_379_;
			    f_364_ += f_399_;
			    f_365_ += f_380_;
			    f_367_ += f_400_;
			    f_368_ += f_381_;
			    f_370_ += f_401_;
			    f_371_ += f_382_;
			    f_373_ += f_402_;
			    f += (float) anInt1678;
			}
			while (--f_342_ >= 0.0F) {
			    method1016(anIntArray1673, anIntArray1698, (int) f,
				       (int) f_344_, (int) f_345_, f_347_,
				       f_348_, f_350_, f_351_, f_353_, f_354_,
				       (float) i_359_, (float) i_360_, f_363_,
				       f_364_, f_366_, f_367_, f_369_, f_370_,
				       f_372_, f_373_);
			    f_344_ += f_384_;
			    f_345_ += f_394_;
			    f_347_ += f_385_;
			    f_348_ += f_395_;
			    f_350_ += f_386_;
			    f_351_ += f_396_;
			    f_353_ += f_387_;
			    f_354_ += f_397_;
			    i_359_ += f_388_;
			    i_360_ += f_398_;
			    f_363_ += f_389_;
			    f_364_ += f_399_;
			    f_366_ += f_390_;
			    f_367_ += f_400_;
			    f_369_ += f_391_;
			    f_370_ += f_401_;
			    f_372_ += f_392_;
			    f_373_ += f_402_;
			    f += (float) anInt1678;
			}
		    }
		} else {
		    f_344_ = f_343_;
		    f_347_ = f_346_;
		    f_350_ = f_349_;
		    f_353_ = f_352_;
		    i_359_ = i_358_;
		    f_363_ = f_362_;
		    f_366_ = f_365_;
		    f_369_ = f_368_;
		    f_372_ = f_371_;
		    if (f < 0.0F) {
			f_343_ -= f_374_ * f;
			f_344_ -= f_394_ * f;
			f_346_ -= f_375_ * f;
			f_347_ -= f_395_ * f;
			f_349_ -= f_376_ * f;
			f_350_ -= f_396_ * f;
			f_352_ -= f_377_ * f;
			f_353_ -= f_397_ * f;
			i_358_ -= f_378_ * f;
			i_359_ -= f_398_ * f;
			f_362_ -= f_379_ * f;
			f_363_ -= f_399_ * f;
			f_365_ -= f_379_ * f;
			f_366_ -= f_399_ * f;
			f_368_ -= f_379_ * f;
			f_369_ -= f_399_ * f;
			f_371_ -= f_379_ * f;
			f_372_ -= f_399_ * f;
			f = 0.0F;
		    }
		    if (f_342_ < 0.0F) {
			f_345_ -= f_384_ * f_342_;
			f_348_ -= f_385_ * f_342_;
			f_351_ -= f_386_ * f_342_;
			f_354_ -= f_387_ * f_342_;
			i_360_ -= f_388_ * f_342_;
			f_364_ -= f_389_ * f_342_;
			f_367_ -= f_390_ * f_342_;
			f_370_ -= f_391_ * f_342_;
			f_373_ -= f_392_ * f_342_;
			f_342_ = 0.0F;
		    }
		    if (f != f_342_ && f_394_ < f_374_
			|| f == f_342_ && f_384_ > f_374_) {
			f_341_ -= f_342_;
			f_342_ -= f;
			f = (float) ((Class109) this).anIntArray1676[(int) f];
			while (--f_342_ >= 0.0F) {
			    method1016(anIntArray1673, anIntArray1698, (int) f,
				       (int) f_344_, (int) f_343_, f_347_,
				       f_346_, f_350_, f_349_, f_353_, f_352_,
				       (float) i_359_, (float) i_358_, f_363_,
				       f_362_, f_366_, f_365_, f_369_, f_368_,
				       f_372_, f_371_);
			    f_343_ += f_374_;
			    f_344_ += f_394_;
			    f_346_ += f_375_;
			    f_347_ += f_395_;
			    f_349_ += f_376_;
			    f_350_ += f_396_;
			    f_352_ += f_377_;
			    f_353_ += f_397_;
			    i_358_ += f_378_;
			    i_359_ += f_398_;
			    f_362_ += f_379_;
			    f_363_ += f_399_;
			    f_365_ += f_380_;
			    f_366_ += f_400_;
			    f_368_ += f_381_;
			    f_369_ += f_401_;
			    f_371_ += f_382_;
			    f_372_ += f_402_;
			    f += (float) anInt1678;
			}
			while (--f_341_ >= 0.0F) {
			    method1016(anIntArray1673, anIntArray1698, (int) f,
				       (int) f_345_, (int) f_343_, f_348_,
				       f_346_, f_351_, f_349_, f_354_, f_352_,
				       (float) i_360_, (float) i_358_, f_364_,
				       f_362_, f_367_, f_365_, f_370_, f_368_,
				       f_373_, f_371_);
			    f_345_ += f_384_;
			    f_343_ += f_374_;
			    f_348_ += f_385_;
			    f_346_ += f_375_;
			    f_351_ += f_386_;
			    f_349_ += f_376_;
			    f_354_ += f_387_;
			    f_352_ += f_377_;
			    i_360_ += f_388_;
			    i_358_ += f_378_;
			    f_364_ += f_389_;
			    f_362_ += f_379_;
			    f_367_ += f_390_;
			    f_365_ += f_380_;
			    f_370_ += f_391_;
			    f_368_ += f_381_;
			    f_373_ += f_392_;
			    f_371_ += f_382_;
			    f += (float) anInt1678;
			}
		    } else {
			f_341_ -= f_342_;
			f_342_ -= f;
			f = (float) ((Class109) this).anIntArray1676[(int) f];
			while (--f_342_ >= 0.0F) {
			    method1016(anIntArray1673, anIntArray1698, (int) f,
				       (int) f_343_, (int) f_344_, f_346_,
				       f_347_, f_349_, f_350_, f_352_, f_353_,
				       (float) i_358_, (float) i_359_, f_362_,
				       f_363_, f_365_, f_366_, f_368_, f_369_,
				       f_371_, f_372_);
			    f_344_ += f_394_;
			    f_343_ += f_374_;
			    f_347_ += f_395_;
			    f_346_ += f_375_;
			    f_350_ += f_396_;
			    f_349_ += f_376_;
			    f_353_ += f_397_;
			    f_352_ += f_377_;
			    i_359_ += f_398_;
			    i_358_ += f_378_;
			    f_363_ += f_399_;
			    f_362_ += f_379_;
			    f_366_ += f_400_;
			    f_365_ += f_380_;
			    f_369_ += f_401_;
			    f_368_ += f_381_;
			    f_372_ += f_402_;
			    f_371_ += f_382_;
			    f += (float) anInt1678;
			}
			while (--f_341_ >= 0.0F) {
			    method1016(anIntArray1673, anIntArray1698, (int) f,
				       (int) f_343_, (int) f_345_, f_346_,
				       f_348_, f_349_, f_351_, f_352_, f_354_,
				       (float) i_358_, (float) i_360_, f_362_,
				       f_364_, f_365_, f_367_, f_368_, f_370_,
				       f_371_, f_373_);
			    f_343_ += f_374_;
			    f_345_ += f_384_;
			    f_346_ += f_375_;
			    f_348_ += f_385_;
			    f_349_ += f_376_;
			    f_351_ += f_386_;
			    f_352_ += f_377_;
			    f_354_ += f_387_;
			    i_358_ += f_378_;
			    i_360_ += f_388_;
			    f_362_ += f_379_;
			    f_364_ += f_389_;
			    f_365_ += f_380_;
			    f_367_ += f_390_;
			    f_368_ += f_381_;
			    f_370_ += f_391_;
			    f_371_ += f_382_;
			    f_373_ += f_392_;
			    f += (float) anInt1678;
			}
		    }
		}
	    }
	} else if (f_341_ <= f_342_) {
	    if (!(f_341_ >= (float) ((Class109) this).anInt1672)) {
		if (f_342_ > (float) ((Class109) this).anInt1672)
		    f_342_ = (float) ((Class109) this).anInt1672;
		if (f > (float) ((Class109) this).anInt1672)
		    f = (float) ((Class109) this).anInt1672;
		if (f_342_ < f) {
		    f_343_ = f_344_;
		    f_346_ = f_347_;
		    f_349_ = f_350_;
		    f_352_ = f_353_;
		    i_358_ = i_359_;
		    f_362_ = f_363_;
		    f_365_ = f_366_;
		    f_368_ = f_369_;
		    f_371_ = f_372_;
		    if (f_341_ < 0.0F) {
			f_343_ -= f_374_ * f_341_;
			f_344_ -= f_384_ * f_341_;
			f_346_ -= f_375_ * f_341_;
			f_347_ -= f_385_ * f_341_;
			f_349_ -= f_376_ * f_341_;
			f_350_ -= f_386_ * f_341_;
			f_352_ -= f_377_ * f_341_;
			f_353_ -= f_387_ * f_341_;
			i_358_ -= f_378_ * f_341_;
			i_359_ -= f_388_ * f_341_;
			f_362_ -= f_379_ * f_341_;
			f_363_ -= f_389_ * f_341_;
			f_365_ -= f_380_ * f_341_;
			f_366_ -= f_390_ * f_341_;
			f_368_ -= f_381_ * f_341_;
			f_369_ -= f_391_ * f_341_;
			f_371_ -= f_382_ * f_341_;
			f_372_ -= f_392_ * f_341_;
			f_341_ = 0.0F;
		    }
		    if (f_342_ < 0.0F) {
			f_345_ -= f_394_ * f_342_;
			f_348_ -= f_395_ * f_342_;
			f_351_ -= f_396_ * f_342_;
			f_354_ -= f_397_ * f_342_;
			i_360_ -= f_398_ * f_342_;
			f_364_ -= f_399_ * f_342_;
			f_367_ -= f_400_ * f_342_;
			f_370_ -= f_401_ * f_342_;
			f_373_ -= f_402_ * f_342_;
			f_342_ = 0.0F;
		    }
		    if (f_341_ != f_342_ && f_374_ < f_384_
			|| f_341_ == f_342_ && f_374_ > f_394_) {
			f -= f_342_;
			f_342_ -= f_341_;
			f_341_ = (float) (((Class109) this).anIntArray1676
					  [(int) f_341_]);
			while (--f_342_ >= 0.0F) {
			    method1016(anIntArray1673, anIntArray1698,
				       (int) f_341_, (int) f_343_,
				       (int) f_344_, f_346_, f_347_, f_349_,
				       f_350_, f_352_, f_353_, (float) i_358_,
				       (float) i_359_, f_362_, f_363_, f_365_,
				       f_366_, f_368_, f_369_, f_371_, f_372_);
			    f_343_ += f_374_;
			    f_344_ += f_384_;
			    f_346_ += f_375_;
			    f_347_ += f_385_;
			    f_349_ += f_376_;
			    f_350_ += f_386_;
			    f_352_ += f_377_;
			    f_353_ += f_387_;
			    i_358_ += f_378_;
			    i_359_ += f_388_;
			    f_362_ += f_379_;
			    f_363_ += f_389_;
			    f_365_ += f_380_;
			    f_366_ += f_390_;
			    f_368_ += f_381_;
			    f_369_ += f_391_;
			    f_371_ += f_382_;
			    f_372_ += f_392_;
			    f_341_ += (float) anInt1678;
			}
			while (--f >= 0.0F) {
			    method1016(anIntArray1673, anIntArray1698,
				       (int) f_341_, (int) f_343_,
				       (int) f_345_, f_346_, f_348_, f_349_,
				       f_351_, f_352_, f_354_, (float) i_358_,
				       (float) i_360_, f_362_, f_364_, f_365_,
				       f_367_, f_368_, f_370_, f_371_, f_373_);
			    f_343_ += f_374_;
			    f_345_ += f_394_;
			    f_346_ += f_375_;
			    f_348_ += f_395_;
			    f_349_ += f_376_;
			    f_351_ += f_396_;
			    f_352_ += f_377_;
			    f_354_ += f_397_;
			    i_358_ += f_378_;
			    i_360_ += f_398_;
			    f_362_ += f_379_;
			    f_364_ += f_399_;
			    f_365_ += f_380_;
			    f_367_ += f_400_;
			    f_368_ += f_381_;
			    f_370_ += f_401_;
			    f_371_ += f_382_;
			    f_373_ += f_402_;
			    f_341_ += (float) anInt1678;
			}
		    } else {
			f -= f_342_;
			f_342_ -= f_341_;
			f_341_ = (float) (((Class109) this).anIntArray1676
					  [(int) f_341_]);
			while (--f_342_ >= 0.0F) {
			    method1016(anIntArray1673, anIntArray1698,
				       (int) f_341_, (int) f_344_,
				       (int) f_343_, f_347_, f_346_, f_350_,
				       f_349_, f_353_, f_352_, (float) i_359_,
				       (float) i_358_, f_363_, f_362_, f_366_,
				       f_365_, f_369_, f_368_, f_372_, f_371_);
			    f_344_ += f_384_;
			    f_343_ += f_374_;
			    f_347_ += f_385_;
			    f_346_ += f_375_;
			    f_350_ += f_386_;
			    f_349_ += f_376_;
			    f_353_ += f_387_;
			    f_352_ += f_377_;
			    i_359_ += f_388_;
			    i_358_ += f_378_;
			    f_363_ += f_389_;
			    f_362_ += f_379_;
			    f_366_ += f_390_;
			    f_365_ += f_380_;
			    f_369_ += f_391_;
			    f_368_ += f_381_;
			    f_372_ += f_392_;
			    f_371_ += f_382_;
			    f_341_ += (float) anInt1678;
			}
			while (--f >= 0.0F) {
			    method1016(anIntArray1673, anIntArray1698,
				       (int) f_341_, (int) f_345_,
				       (int) f_343_, f_348_, f_346_, f_351_,
				       f_349_, f_354_, f_352_, (float) i_360_,
				       (float) i_358_, f_364_, f_362_, f_367_,
				       f_365_, f_370_, f_368_, f_373_, f_371_);
			    f_345_ += f_394_;
			    f_343_ += f_374_;
			    f_348_ += f_395_;
			    f_346_ += f_375_;
			    f_351_ += f_396_;
			    f_349_ += f_376_;
			    f_354_ += f_397_;
			    f_352_ += f_377_;
			    i_360_ += f_398_;
			    i_358_ += f_378_;
			    f_364_ += f_399_;
			    f_362_ += f_379_;
			    f_367_ += f_400_;
			    f_365_ += f_380_;
			    f_370_ += f_401_;
			    f_368_ += f_381_;
			    f_373_ += f_402_;
			    f_371_ += f_382_;
			    f_341_ += (float) anInt1678;
			}
		    }
		} else {
		    f_345_ = f_344_;
		    f_348_ = f_347_;
		    f_351_ = f_350_;
		    f_354_ = f_353_;
		    i_360_ = i_359_;
		    f_364_ = f_363_;
		    f_367_ = f_366_;
		    f_370_ = f_369_;
		    f_373_ = f_372_;
		    if (f_341_ < 0.0F) {
			f_345_ -= f_374_ * f_341_;
			f_344_ -= f_384_ * f_341_;
			f_348_ -= f_375_ * f_341_;
			f_347_ -= f_385_ * f_341_;
			f_351_ -= f_376_ * f_341_;
			f_350_ -= f_386_ * f_341_;
			f_354_ -= f_377_ * f_341_;
			f_353_ -= f_387_ * f_341_;
			i_360_ -= f_378_ * f_341_;
			i_359_ -= f_388_ * f_341_;
			f_364_ -= f_379_ * f_341_;
			f_363_ -= f_389_ * f_341_;
			f_367_ -= f_380_ * f_341_;
			f_366_ -= f_390_ * f_341_;
			f_370_ -= f_381_ * f_341_;
			f_369_ -= f_391_ * f_341_;
			f_373_ -= f_382_ * f_341_;
			f_372_ -= f_392_ * f_341_;
			f_341_ = 0.0F;
		    }
		    if (f < 0.0F) {
			f_343_ -= f_394_ * f;
			f_346_ -= f_395_ * f;
			f_349_ -= f_396_ * f;
			f_352_ -= f_397_ * f;
			i_358_ -= f_398_ * f;
			f_362_ -= f_399_ * f;
			f_365_ -= f_400_ * f;
			f_368_ -= f_401_ * f;
			f_371_ -= f_402_ * f;
			f = 0.0F;
		    }
		    f_342_ -= f;
		    f -= f_341_;
		    f_341_ = (float) (((Class109) this).anIntArray1676
				      [(int) f_341_]);
		    if (f_374_ < f_384_) {
			while (--f >= 0.0F) {
			    method1016(anIntArray1673, anIntArray1698,
				       (int) f_341_, (int) f_345_,
				       (int) f_344_, f_348_, f_347_, f_351_,
				       f_350_, f_354_, f_353_, (float) i_360_,
				       (float) i_359_, f_364_, f_363_, f_367_,
				       f_366_, f_370_, f_369_, f_373_, f_372_);
			    f_345_ += f_374_;
			    f_344_ += f_384_;
			    f_348_ += f_375_;
			    f_347_ += f_385_;
			    f_351_ += f_376_;
			    f_350_ += f_386_;
			    f_354_ += f_377_;
			    f_353_ += f_387_;
			    i_360_ += f_378_;
			    i_359_ += f_388_;
			    f_364_ += f_379_;
			    f_363_ += f_389_;
			    f_367_ += f_380_;
			    f_366_ += f_390_;
			    f_370_ += f_381_;
			    f_369_ += f_391_;
			    f_373_ += f_382_;
			    f_372_ += f_392_;
			    f_341_ += (float) anInt1678;
			}
			while (--f_342_ >= 0.0F) {
			    method1016(anIntArray1673, anIntArray1698,
				       (int) f_341_, (int) f_343_,
				       (int) f_344_, f_346_, f_347_, f_349_,
				       f_350_, f_352_, f_353_, (float) i_358_,
				       (float) i_359_, f_362_, f_363_, f_365_,
				       f_366_, f_368_, f_369_, f_371_, f_372_);
			    f_343_ += f_394_;
			    f_344_ += f_384_;
			    f_346_ += f_395_;
			    f_347_ += f_385_;
			    f_349_ += f_396_;
			    f_350_ += f_386_;
			    f_352_ += f_397_;
			    f_353_ += f_387_;
			    i_358_ += f_398_;
			    i_359_ += f_388_;
			    f_362_ += f_399_;
			    f_363_ += f_389_;
			    f_365_ += f_400_;
			    f_366_ += f_390_;
			    f_368_ += f_401_;
			    f_369_ += f_391_;
			    f_371_ += f_402_;
			    f_372_ += f_392_;
			    f_341_ += (float) anInt1678;
			}
		    } else {
			while (--f >= 0.0F) {
			    method1016(anIntArray1673, anIntArray1698,
				       (int) f_341_, (int) f_344_,
				       (int) f_345_, f_347_, f_348_, f_350_,
				       f_351_, f_353_, f_354_, (float) i_359_,
				       (float) i_360_, f_363_, f_364_, f_366_,
				       f_367_, f_369_, f_370_, f_372_, f_373_);
			    f_344_ += f_384_;
			    f_345_ += f_374_;
			    f_347_ += f_385_;
			    f_348_ += f_375_;
			    f_350_ += f_386_;
			    f_351_ += f_376_;
			    f_353_ += f_387_;
			    f_354_ += f_377_;
			    i_359_ += f_388_;
			    i_360_ += f_378_;
			    f_363_ += f_389_;
			    f_364_ += f_379_;
			    f_366_ += f_390_;
			    f_367_ += f_380_;
			    f_369_ += f_391_;
			    f_370_ += f_381_;
			    f_372_ += f_392_;
			    f_373_ += f_382_;
			    f_341_ += (float) anInt1678;
			}
			while (--f_342_ >= 0.0F) {
			    method1016(anIntArray1673, anIntArray1698,
				       (int) f_341_, (int) f_344_,
				       (int) f_343_, f_347_, f_346_, f_350_,
				       f_349_, f_353_, f_352_, (float) i_359_,
				       (float) i_358_, f_363_, f_362_, f_366_,
				       f_365_, f_369_, f_368_, f_372_, f_371_);
			    f_344_ += f_384_;
			    f_343_ += f_394_;
			    f_347_ += f_385_;
			    f_346_ += f_395_;
			    f_350_ += f_386_;
			    f_349_ += f_396_;
			    f_353_ += f_387_;
			    f_352_ += f_397_;
			    i_359_ += f_388_;
			    i_358_ += f_398_;
			    f_363_ += f_389_;
			    f_362_ += f_399_;
			    f_366_ += f_390_;
			    f_365_ += f_400_;
			    f_369_ += f_391_;
			    f_368_ += f_401_;
			    f_372_ += f_392_;
			    f_371_ += f_402_;
			    f_341_ += (float) anInt1678;
			}
		    }
		}
	    }
	} else if (!(f_342_ >= (float) ((Class109) this).anInt1672)) {
	    if (f > (float) ((Class109) this).anInt1672)
		f = (float) ((Class109) this).anInt1672;
	    if (f_341_ > (float) ((Class109) this).anInt1672)
		f_341_ = (float) ((Class109) this).anInt1672;
	    if (f < f_341_) {
		f_344_ = f_345_;
		f_347_ = f_348_;
		f_350_ = f_351_;
		f_353_ = f_354_;
		i_359_ = i_360_;
		f_363_ = f_364_;
		f_366_ = f_367_;
		f_369_ = f_370_;
		f_372_ = f_373_;
		if (f_342_ < 0.0F) {
		    f_345_ -= f_394_ * f_342_;
		    f_344_ -= f_384_ * f_342_;
		    f_348_ -= f_395_ * f_342_;
		    f_347_ -= f_385_ * f_342_;
		    f_351_ -= f_396_ * f_342_;
		    f_350_ -= f_386_ * f_342_;
		    f_354_ -= f_397_ * f_342_;
		    f_353_ -= f_387_ * f_342_;
		    i_360_ -= f_398_ * 3.0F;
		    i_359_ -= f_388_ * f_342_;
		    f_364_ -= f_399_ * f_342_;
		    f_363_ -= f_389_ * f_342_;
		    f_367_ -= f_400_ * f_342_;
		    f_366_ -= f_390_ * f_342_;
		    f_370_ -= f_401_ * f_342_;
		    f_369_ -= f_391_ * f_342_;
		    f_373_ -= f_402_ * f_342_;
		    f_372_ -= f_392_ * f_342_;
		    f_342_ = 0.0F;
		}
		if (f < 0.0F) {
		    f_343_ -= f_374_ * f;
		    f_346_ -= f_375_ * f;
		    f_349_ -= f_376_ * f;
		    f_352_ -= f_377_ * f;
		    i_358_ -= f_378_ * f;
		    f_362_ -= f_379_ * f;
		    f_365_ -= f_380_ * f;
		    f_368_ -= f_381_ * f;
		    f_371_ -= f_382_ * f;
		    f = 0.0F;
		}
		if (f_384_ < f_394_) {
		    f_341_ -= f;
		    f -= f_342_;
		    f_342_ = (float) (((Class109) this).anIntArray1676
				      [(int) f_342_]);
		    while (--f >= 0.0F) {
			method1016(anIntArray1673, anIntArray1698,
				   (int) f_342_, (int) f_344_, (int) f_345_,
				   f_347_, f_348_, f_350_, f_351_, f_353_,
				   f_354_, (float) i_359_, (float) i_360_,
				   f_363_, f_364_, f_366_, f_367_, f_369_,
				   f_370_, f_372_, f_373_);
			f_344_ += f_384_;
			f_345_ += f_394_;
			f_347_ += f_385_;
			f_348_ += f_395_;
			f_350_ += f_386_;
			f_351_ += f_396_;
			f_353_ += f_387_;
			f_354_ += f_397_;
			i_359_ += f_388_;
			i_360_ += f_398_;
			f_363_ += f_389_;
			f_364_ += f_399_;
			f_366_ += f_390_;
			f_367_ += f_400_;
			f_369_ += f_391_;
			f_370_ += f_401_;
			f_372_ += f_392_;
			f_373_ += f_402_;
			f_342_ += (float) anInt1678;
		    }
		    while (--f_341_ >= 0.0F) {
			method1016(anIntArray1673, anIntArray1698,
				   (int) f_342_, (int) f_344_, (int) f_343_,
				   f_347_, f_346_, f_350_, f_349_, f_353_,
				   f_352_, (float) i_359_, (float) i_358_,
				   f_363_, f_362_, f_366_, f_365_, f_369_,
				   f_368_, f_372_, f_371_);
			f_344_ += f_384_;
			f_343_ += f_374_;
			f_347_ += f_385_;
			f_346_ += f_375_;
			f_350_ += f_386_;
			f_349_ += f_376_;
			f_353_ += f_387_;
			f_352_ += f_377_;
			i_359_ += f_388_;
			i_358_ += f_378_;
			f_363_ += f_389_;
			f_362_ += f_379_;
			f_366_ += f_390_;
			f_365_ += f_380_;
			f_369_ += f_391_;
			f_368_ += f_381_;
			f_372_ += f_392_;
			f_371_ += f_382_;
			f_342_ += (float) anInt1678;
		    }
		} else {
		    f_341_ -= f;
		    f -= f_342_;
		    f_342_ = (float) (((Class109) this).anIntArray1676
				      [(int) f_342_]);
		    while (--f >= 0.0F) {
			method1016(anIntArray1673, anIntArray1698,
				   (int) f_342_, (int) f_345_, (int) f_344_,
				   f_348_, f_347_, f_351_, f_350_, f_354_,
				   f_353_, (float) i_360_, (float) i_359_,
				   f_364_, f_363_, f_367_, f_366_, f_370_,
				   f_369_, f_373_, f_372_);
			f_345_ += f_394_;
			f_344_ += f_384_;
			f_348_ += f_395_;
			f_347_ += f_385_;
			f_351_ += f_396_;
			f_350_ += f_386_;
			f_354_ += f_397_;
			f_353_ += f_387_;
			i_360_ += f_398_;
			i_359_ += f_388_;
			f_364_ += f_399_;
			f_363_ += f_389_;
			f_367_ += f_400_;
			f_366_ += f_390_;
			f_370_ += f_401_;
			f_369_ += f_391_;
			f_373_ += f_402_;
			f_372_ += f_392_;
			f_342_ += (float) anInt1678;
		    }
		    while (--f_341_ >= 0.0F) {
			method1016(anIntArray1673, anIntArray1698,
				   (int) f_342_, (int) f_343_, (int) f_344_,
				   f_346_, f_347_, f_349_, f_350_, f_352_,
				   f_353_, (float) i_358_, (float) i_359_,
				   f_362_, f_363_, f_365_, f_366_, f_368_,
				   f_369_, f_371_, f_372_);
			f_343_ += f_374_;
			f_344_ += f_384_;
			f_346_ += f_375_;
			f_347_ += f_385_;
			f_349_ += f_376_;
			f_350_ += f_386_;
			f_352_ += f_377_;
			f_353_ += f_387_;
			i_358_ += f_378_;
			i_359_ += f_388_;
			f_362_ += f_379_;
			f_363_ += f_389_;
			f_365_ += f_380_;
			f_366_ += f_390_;
			f_368_ += f_381_;
			f_369_ += f_391_;
			f_371_ += f_382_;
			f_372_ += f_392_;
			f_342_ += (float) anInt1678;
		    }
		}
	    } else {
		f_343_ = f_345_;
		f_346_ = f_348_;
		f_349_ = f_351_;
		f_352_ = f_354_;
		i_358_ = i_360_;
		f_362_ = f_364_;
		f_365_ = f_367_;
		f_368_ = f_370_;
		f_371_ = f_373_;
		if (f_342_ < 0.0F) {
		    f_345_ -= f_394_ * f_342_;
		    f_343_ -= f_384_ * f_342_;
		    f_348_ -= f_395_ * f_342_;
		    f_346_ -= f_385_ * f_342_;
		    f_351_ -= f_396_ * f_342_;
		    f_349_ -= f_386_ * f_342_;
		    f_354_ -= f_397_ * f_342_;
		    f_352_ -= f_387_ * f_342_;
		    i_360_ -= f_398_ * 3.0F;
		    i_358_ -= f_388_ * f_342_;
		    f_364_ -= f_399_ * f_342_;
		    f_362_ -= f_389_ * f_342_;
		    f_367_ -= f_400_ * f_342_;
		    f_365_ -= f_390_ * f_342_;
		    f_370_ -= f_401_ * f_342_;
		    f_368_ -= f_391_ * f_342_;
		    f_373_ -= f_402_ * f_342_;
		    f_371_ -= f_392_ * f_342_;
		    f_342_ = 0.0F;
		}
		if (f_341_ < 0.0F) {
		    f_344_ -= f_374_ * f_341_;
		    f_347_ -= f_375_ * f_341_;
		    f_350_ -= f_376_ * f_341_;
		    f_353_ -= f_377_ * f_341_;
		    i_359_ -= f_378_ * f_341_;
		    f_363_ -= f_379_ * f_341_;
		    f_366_ -= f_380_ * f_341_;
		    f_369_ -= f_381_ * f_341_;
		    f_372_ -= f_382_ * f_341_;
		    f_341_ = 0.0F;
		}
		if (f_384_ < f_394_) {
		    f -= f_341_;
		    f_341_ -= f_342_;
		    f_342_ = (float) (((Class109) this).anIntArray1676
				      [(int) f_342_]);
		    while (--f_341_ >= 0.0F) {
			method1016(anIntArray1673, anIntArray1698,
				   (int) f_342_, (int) f_343_, (int) f_345_,
				   f_346_, f_348_, f_349_, f_351_, f_352_,
				   f_354_, (float) i_358_, (float) i_360_,
				   f_362_, f_364_, f_365_, f_367_, f_368_,
				   f_370_, f_371_, f_373_);
			f_343_ += f_384_;
			f_345_ += f_394_;
			f_346_ += f_385_;
			f_348_ += f_395_;
			f_349_ += f_386_;
			f_351_ += f_396_;
			f_352_ += f_387_;
			f_354_ += f_397_;
			i_358_ += f_388_;
			i_360_ += f_398_;
			f_362_ += f_389_;
			f_364_ += f_399_;
			f_365_ += f_390_;
			f_367_ += f_400_;
			f_368_ += f_391_;
			f_370_ += f_401_;
			f_371_ += f_392_;
			f_373_ += f_402_;
			f_342_ += (float) anInt1678;
		    }
		    while (--f >= 0.0F) {
			method1016(anIntArray1673, anIntArray1698,
				   (int) f_342_, (int) f_344_, (int) f_345_,
				   f_347_, f_348_, f_350_, f_351_, f_353_,
				   f_354_, (float) i_359_, (float) i_360_,
				   f_363_, f_364_, f_366_, f_367_, f_369_,
				   f_370_, f_372_, f_373_);
			f_344_ += f_374_;
			f_345_ += f_394_;
			f_347_ += f_375_;
			f_348_ += f_395_;
			f_350_ += f_376_;
			f_351_ += f_396_;
			f_353_ += f_377_;
			f_354_ += f_397_;
			i_359_ += f_378_;
			i_360_ += f_398_;
			f_363_ += f_379_;
			f_364_ += f_399_;
			f_366_ += f_380_;
			f_367_ += f_400_;
			f_369_ += f_381_;
			f_370_ += f_401_;
			f_372_ += f_382_;
			f_373_ += f_402_;
			f_342_ += (float) anInt1678;
		    }
		} else {
		    f -= f_341_;
		    f_341_ -= f_342_;
		    f_342_ = (float) (((Class109) this).anIntArray1676
				      [(int) f_342_]);
		    while (--f_341_ >= 0.0F) {
			method1016(anIntArray1673, anIntArray1698,
				   (int) f_342_, (int) f_345_, (int) f_343_,
				   f_348_, f_346_, f_351_, f_349_, f_354_,
				   f_352_, (float) i_360_, (float) i_358_,
				   f_364_, f_362_, f_367_, f_365_, f_370_,
				   f_368_, f_373_, f_371_);
			f_345_ += f_394_;
			f_343_ += f_384_;
			f_348_ += f_395_;
			f_346_ += f_385_;
			f_351_ += f_396_;
			f_349_ += f_386_;
			f_354_ += f_397_;
			f_352_ += f_387_;
			i_360_ += f_398_;
			i_358_ += f_388_;
			f_364_ += f_399_;
			f_362_ += f_389_;
			f_367_ += f_400_;
			f_365_ += f_390_;
			f_370_ += f_401_;
			f_368_ += f_391_;
			f_373_ += f_402_;
			f_371_ += f_392_;
			f_342_ += (float) anInt1678;
		    }
		    while (--f >= 0.0F) {
			method1016(anIntArray1673, anIntArray1698,
				   (int) f_342_, (int) f_345_, (int) f_344_,
				   f_348_, f_347_, f_351_, f_350_, f_354_,
				   f_353_, (float) i_360_, (float) i_359_,
				   f_364_, f_363_, f_367_, f_366_, f_370_,
				   f_369_, f_373_, f_372_);
			f_345_ += f_394_;
			f_344_ += f_374_;
			f_348_ += f_395_;
			f_347_ += f_375_;
			f_351_ += f_396_;
			f_350_ += f_376_;
			f_354_ += f_397_;
			f_353_ += f_377_;
			i_360_ += f_398_;
			i_359_ += f_378_;
			f_364_ += f_399_;
			f_363_ += f_379_;
			f_367_ += f_400_;
			f_366_ += f_380_;
			f_370_ += f_401_;
			f_369_ += f_381_;
			f_373_ += f_402_;
			f_372_ += f_382_;
			f_342_ += (float) anInt1678;
		    }
		}
	    }
	}
    }
    
    private final void method1025
	(int[] is, int[] is_404_, int i, int i_405_, int i_406_, float f,
	 float f_407_, float f_408_, float f_409_, float f_410_, float f_411_,
	 float f_412_, float f_413_, float f_414_, float f_415_, float f_416_,
	 float f_417_, float f_418_, float f_419_, float f_420_, float f_421_,
	 float f_422_, float f_423_, float f_424_, float f_425_) {
	int i_426_ = i_406_ - i_405_;
	float f_427_ = 1.0F / (float) i_426_;
	float f_428_ = (f_407_ - f) * f_427_;
	float f_429_ = (f_409_ - f_408_) * f_427_;
	float f_430_ = (f_411_ - f_410_) * f_427_;
	float f_431_ = (f_413_ - f_412_) * f_427_;
	float f_432_ = (f_417_ - f_416_) * f_427_;
	float f_433_ = (f_419_ - f_418_) * f_427_;
	float f_434_ = (f_421_ - f_420_) * f_427_;
	float f_435_ = (f_423_ - f_422_) * f_427_;
	float f_436_ = (f_425_ - f_424_) * f_427_;
	if (((Class109) this).aBoolean1671) {
	    if (i_406_ > ((Class109) this).anInt1679)
		i_406_ = ((Class109) this).anInt1679;
	    if (i_405_ < 0) {
		f -= f_428_ * (float) i_405_;
		f_408_ -= f_429_ * (float) i_405_;
		f_410_ -= f_430_ * (float) i_405_;
		f_412_ -= f_431_ * (float) i_405_;
		f_416_ -= f_432_ * (float) i_405_;
		f_418_ -= f_433_ * (float) i_405_;
		f_420_ -= f_434_ * (float) i_405_;
		f_422_ -= f_435_ * (float) i_405_;
		f_424_ -= f_436_ * (float) i_405_;
		i_405_ = 0;
	    }
	}
	if (i_405_ < i_406_) {
	    i_426_ = i_406_ - i_405_;
	    i += i_405_;
	    while (i_426_-- > 0) {
		float f_437_ = 1.0F / f;
		if (f_437_ < aFloatArray1677[i]) {
		    float f_438_ = f_408_ * f_437_;
		    float f_439_ = f_410_ * f_437_;
		    int i_440_
			= ((int) (f_438_ * (float) anInt1693 * aFloat1681)
			   & anInt1690);
		    int i_441_
			= ((int) (f_439_ * (float) anInt1693 * aFloat1681)
			   & anInt1690);
		    int i_442_ = anIntArray1698[i_441_ * anInt1693 + i_440_];
		    i_440_ = ((int) (f_438_ * (float) anInt1691 * aFloat1684)
			      & anInt1686);
		    i_441_ = ((int) (f_439_ * (float) anInt1691 * aFloat1684)
			      & anInt1686);
		    int i_443_ = anIntArray1685[i_441_ * anInt1691 + i_440_];
		    i_440_ = ((int) (f_438_ * (float) anInt1695 * aFloat1682)
			      & anInt1688);
		    i_441_ = ((int) (f_439_ * (float) anInt1695 * aFloat1682)
			      & anInt1688);
		    int i_444_ = anIntArray1692[i_441_ * anInt1695 + i_440_];
		    float f_445_ = 1.0F - (f_422_ + f_424_);
		    i_442_
			= (~0xffffff
			   | ((int) (f_422_ * (float) (i_442_ >> 16 & 0xff))
			      << 16)
			   | (int) (f_422_ * (float) (i_442_ >> 8 & 0xff)) << 8
			   | (int) (f_422_ * (float) (i_442_ & 0xff)));
		    i_443_
			= (~0xffffff
			   | ((int) (f_424_ * (float) (i_443_ >> 16 & 0xff))
			      << 16)
			   | (int) (f_424_ * (float) (i_443_ >> 8 & 0xff)) << 8
			   | (int) (f_424_ * (float) (i_443_ & 0xff)));
		    i_444_
			= (~0xffffff
			   | ((int) (f_445_ * (float) (i_444_ >> 16 & 0xff))
			      << 16)
			   | (int) (f_445_ * (float) (i_444_ >> 8 & 0xff)) << 8
			   | (int) (f_445_ * (float) (i_444_ & 0xff)));
		    int i_446_ = i_442_ + i_443_ + i_444_;
		    int i_447_
			= (~0xffffff
			   | ((int) (f_416_ * (float) (i_446_ >> 16 & 0xff))
			      << 8) & 0xff0000
			   | ((int) (f_418_ * (float) (i_446_ >> 8 & 0xff))
			      & 0xff00)
			   | (int) (f_420_ * (float) (i_446_ & 0xff)) >> 8);
		    if (f_412_ != 0.0F) {
			int i_448_ = (int) (255.0F - f_412_);
			int i_449_ = ((((anInt1696 & 0xff00ff) * (int) f_412_
					& ~0xff00ff)
				       | ((anInt1696 & 0xff00) * (int) f_412_
					  & 0xff0000))
				      >>> 8);
			i_447_ = (((i_447_ & 0xff00ff) * i_448_ & ~0xff00ff
				   | (i_447_ & 0xff00) * i_448_ & 0xff0000)
				  >>> 8) + i_449_;
		    }
		    is[i] = i_447_;
		    aFloatArray1677[i] = f_437_;
		}
		i++;
		f += f_428_;
		f_408_ += f_429_;
		f_410_ += f_430_;
		f_412_ += f_431_;
		f_416_ += f_432_;
		f_418_ += f_433_;
		f_420_ += f_434_;
		f_422_ += f_435_;
		f_424_ += f_436_;
	    }
	}
    }
    
    private final void method1026(int[] is, float[] fs, int i, int i_450_,
				  int i_451_, int i_452_, int i_453_, float f,
				  float f_454_) {
	if (((Class109) this).aBoolean1671) {
	    if (i_453_ > ((Class109) this).anInt1679)
		i_453_ = ((Class109) this).anInt1679;
	    if (i_452_ < 0)
		i_452_ = 0;
	}
	if (i_452_ < i_453_) {
	    i += i_452_ - 1;
	    i_451_ = i_453_ - i_452_ >> 2;
	    f += f_454_ * (float) i_452_;
	    if (((Class167) aClass167_1670).aBoolean2202) {
		if (((Class109) this).anInt1674 == 0) {
		    while (--i_451_ >= 0) {
			if (f < fs[++i]) {
			    is[i] = i_450_;
			    fs[i] = f;
			}
			f += f_454_;
			if (f < fs[++i]) {
			    is[i] = i_450_;
			    fs[i] = f;
			}
			f += f_454_;
			if (f < fs[++i]) {
			    is[i] = i_450_;
			    fs[i] = f;
			}
			f += f_454_;
			if (f < fs[++i]) {
			    is[i] = i_450_;
			    fs[i] = f;
			}
			f += f_454_;
		    }
		    i_451_ = i_453_ - i_452_ & 0x3;
		    while (--i_451_ >= 0) {
			if (f < fs[++i]) {
			    is[i] = i_450_;
			    fs[i] = f;
			}
			f += f_454_;
		    }
		} else if (((Class109) this).anInt1674 == 254) {
		    if (i_452_ != 0
			&& i_453_ <= ((Class109) this).anInt1679 - 1) {
			while (--i_451_ >= 0) {
			    if (f < fs[++i])
				is[i - 1] = is[i];
			    f += f_454_;
			    if (f < fs[++i])
				is[i - 1] = is[i];
			    f += f_454_;
			    if (f < fs[++i])
				is[i - 1] = is[i];
			    f += f_454_;
			    if (f < fs[++i])
				is[i - 1] = is[i];
			    f += f_454_;
			}
			i_451_ = i_453_ - i_452_ & 0x3;
			while (--i_451_ >= 0) {
			    if (f < fs[++i])
				is[i - 1] = is[i];
			    f += f_454_;
			}
		    }
		} else {
		    int i_455_ = ((Class109) this).anInt1674;
		    int i_456_ = 256 - ((Class109) this).anInt1674;
		    i_450_ = (((i_450_ & 0xff00ff) * i_456_ >> 8 & 0xff00ff)
			      + ((i_450_ & 0xff00) * i_456_ >> 8 & 0xff00));
		    while (--i_451_ >= 0) {
			if (f < fs[++i]) {
			    int i_457_ = is[i];
			    is[i] = (i_450_
				     + ((i_457_ & 0xff00ff) * i_455_ >> 8
					& 0xff00ff)
				     + ((i_457_ & 0xff00) * i_455_ >> 8
					& 0xff00));
			    fs[i] = f;
			}
			f += f_454_;
			if (f < fs[++i]) {
			    int i_458_ = is[i];
			    is[i] = (i_450_
				     + ((i_458_ & 0xff00ff) * i_455_ >> 8
					& 0xff00ff)
				     + ((i_458_ & 0xff00) * i_455_ >> 8
					& 0xff00));
			    fs[i] = f;
			}
			f += f_454_;
			if (f < fs[++i]) {
			    int i_459_ = is[i];
			    is[i] = (i_450_
				     + ((i_459_ & 0xff00ff) * i_455_ >> 8
					& 0xff00ff)
				     + ((i_459_ & 0xff00) * i_455_ >> 8
					& 0xff00));
			    fs[i] = f;
			}
			f += f_454_;
			if (f < fs[++i]) {
			    int i_460_ = is[i];
			    is[i] = (i_450_
				     + ((i_460_ & 0xff00ff) * i_455_ >> 8
					& 0xff00ff)
				     + ((i_460_ & 0xff00) * i_455_ >> 8
					& 0xff00));
			    fs[i] = f;
			}
			f += f_454_;
		    }
		    i_451_ = i_453_ - i_452_ & 0x3;
		    while (--i_451_ >= 0) {
			if (f < fs[++i]) {
			    int i_461_ = is[i];
			    is[i] = (i_450_
				     + ((i_461_ & 0xff00ff) * i_455_ >> 8
					& 0xff00ff)
				     + ((i_461_ & 0xff00) * i_455_ >> 8
					& 0xff00));
			    fs[i] = f;
			}
			f += f_454_;
		    }
		}
	    } else if (((Class109) this).anInt1674 == 0) {
		while (--i_451_ >= 0) {
		    if (f < fs[++i])
			is[i] = i_450_;
		    f += f_454_;
		    if (f < fs[++i])
			is[i] = i_450_;
		    f += f_454_;
		    if (f < fs[++i])
			is[i] = i_450_;
		    f += f_454_;
		    if (f < fs[++i])
			is[i] = i_450_;
		    f += f_454_;
		}
		i_451_ = i_453_ - i_452_ & 0x3;
		while (--i_451_ >= 0) {
		    if (f < fs[++i])
			is[i] = i_450_;
		    f += f_454_;
		}
	    } else if (((Class109) this).anInt1674 == 254) {
		if (i_452_ != 0 && i_453_ <= ((Class109) this).anInt1679 - 1) {
		    while (--i_451_ >= 0) {
			if (f < fs[++i])
			    is[i - 1] = is[i];
			f += f_454_;
			if (f < fs[++i])
			    is[i - 1] = is[i];
			f += f_454_;
			if (f < fs[++i])
			    is[i - 1] = is[i];
			f += f_454_;
			if (f < fs[++i])
			    is[i - 1] = is[i];
			f += f_454_;
		    }
		    i_451_ = i_453_ - i_452_ & 0x3;
		    while (--i_451_ >= 0) {
			if (f < fs[++i])
			    is[i - 1] = is[i];
			f += f_454_;
		    }
		}
	    } else {
		int i_462_ = ((Class109) this).anInt1674;
		int i_463_ = 256 - ((Class109) this).anInt1674;
		i_450_ = (((i_450_ & 0xff00ff) * i_463_ >> 8 & 0xff00ff)
			  + ((i_450_ & 0xff00) * i_463_ >> 8 & 0xff00));
		while (--i_451_ >= 0) {
		    if (f < fs[++i]) {
			int i_464_ = is[i];
			is[i]
			    = (i_450_
			       + ((i_464_ & 0xff00ff) * i_462_ >> 8 & 0xff00ff)
			       + ((i_464_ & 0xff00) * i_462_ >> 8 & 0xff00));
		    }
		    f += f_454_;
		    if (f < fs[++i]) {
			int i_465_ = is[i];
			is[i]
			    = (i_450_
			       + ((i_465_ & 0xff00ff) * i_462_ >> 8 & 0xff00ff)
			       + ((i_465_ & 0xff00) * i_462_ >> 8 & 0xff00));
		    }
		    f += f_454_;
		    if (f < fs[++i]) {
			int i_466_ = is[i];
			is[i]
			    = (i_450_
			       + ((i_466_ & 0xff00ff) * i_462_ >> 8 & 0xff00ff)
			       + ((i_466_ & 0xff00) * i_462_ >> 8 & 0xff00));
		    }
		    f += f_454_;
		    if (f < fs[++i]) {
			int i_467_ = is[i];
			is[i]
			    = (i_450_
			       + ((i_467_ & 0xff00ff) * i_462_ >> 8 & 0xff00ff)
			       + ((i_467_ & 0xff00) * i_462_ >> 8 & 0xff00));
		    }
		    f += f_454_;
		}
		i_451_ = i_453_ - i_452_ & 0x3;
		while (--i_451_ >= 0) {
		    if (f < fs[++i]) {
			int i_468_ = is[i];
			is[i]
			    = (i_450_
			       + ((i_468_ & 0xff00ff) * i_462_ >> 8 & 0xff00ff)
			       + ((i_468_ & 0xff00) * i_462_ >> 8 & 0xff00));
		    }
		    f += f_454_;
		}
	    }
	}
    }
    
    final void method1027(float f, float f_469_, float f_470_, float f_471_,
			  float f_472_, float f_473_, float f_474_,
			  float f_475_, float f_476_, int i, int i_477_,
			  int i_478_) {
	if (aBoolean1675) {
	    aHa_Sub1_1666.method3645((int) f, (int) f_471_, (int) f_472_,
				     -8003, ~0xffffff | i, (int) f_469_);
	    aHa_Sub1_1666.method3645((int) f_469_, (int) f_472_, (int) f_473_,
				     -8003, ~0xffffff | i, (int) f_470_);
	    aHa_Sub1_1666.method3645((int) f_470_, (int) f_473_, (int) f_471_,
				     -8003, ~0xffffff | i, (int) f);
	} else {
	    float f_479_ = f_472_ - f_471_;
	    float f_480_ = f_469_ - f;
	    float f_481_ = f_473_ - f_471_;
	    float f_482_ = f_470_ - f;
	    float f_483_ = f_475_ - f_474_;
	    float f_484_ = f_476_ - f_474_;
	    float f_485_ = (float) ((i_477_ & 0xff0000) - (i & 0xff0000));
	    float f_486_ = (float) ((i_478_ & 0xff0000) - (i & 0xff0000));
	    float f_487_ = (float) ((i_477_ & 0xff00) - (i & 0xff00));
	    float f_488_ = (float) ((i_478_ & 0xff00) - (i & 0xff00));
	    float f_489_ = (float) ((i_477_ & 0xff) - (i & 0xff));
	    float f_490_ = (float) ((i_478_ & 0xff) - (i & 0xff));
	    float f_491_;
	    if (f_470_ != f_469_)
		f_491_ = (f_473_ - f_472_) / (f_470_ - f_469_);
	    else
		f_491_ = 0.0F;
	    float f_492_;
	    if (f_469_ != f)
		f_492_ = f_479_ / f_480_;
	    else
		f_492_ = 0.0F;
	    float f_493_;
	    if (f_470_ != f)
		f_493_ = f_481_ / f_482_;
	    else
		f_493_ = 0.0F;
	    float f_494_ = f_479_ * f_482_ - f_481_ * f_480_;
	    if (f_494_ != 0.0F) {
		float f_495_ = (f_483_ * f_482_ - f_484_ * f_480_) / f_494_;
		float f_496_ = (f_484_ * f_479_ - f_483_ * f_481_) / f_494_;
		float f_497_ = (f_485_ * f_482_ - f_486_ * f_480_) / f_494_;
		float f_498_ = (f_486_ * f_479_ - f_485_ * f_481_) / f_494_;
		float f_499_ = (f_487_ * f_482_ - f_488_ * f_480_) / f_494_;
		float f_500_ = (f_488_ * f_479_ - f_487_ * f_481_) / f_494_;
		float f_501_ = (f_489_ * f_482_ - f_490_ * f_480_) / f_494_;
		float f_502_ = (f_490_ * f_479_ - f_489_ * f_481_) / f_494_;
		if (f <= f_469_ && f <= f_470_) {
		    if (!(f >= (float) ((Class109) this).anInt1672)) {
			if (f_469_ > (float) ((Class109) this).anInt1672)
			    f_469_ = (float) ((Class109) this).anInt1672;
			if (f_470_ > (float) ((Class109) this).anInt1672)
			    f_470_ = (float) ((Class109) this).anInt1672;
			f_474_ = f_474_ - f_495_ * f_471_ + f_495_;
			float f_503_ = ((float) (i & 0xff0000)
					- f_497_ * f_471_ + f_497_);
			float f_504_
			    = (float) (i & 0xff00) - f_499_ * f_471_ + f_499_;
			float f_505_
			    = (float) (i & 0xff) - f_501_ * f_471_ + f_501_;
			if (f_469_ < f_470_) {
			    f_473_ = f_471_;
			    if (f < 0.0F) {
				f_473_ -= f_493_ * f;
				f_471_ -= f_492_ * f;
				f_474_ -= f_496_ * f;
				f_503_ -= f_498_ * f;
				f_504_ -= f_500_ * f;
				f_505_ -= f_502_ * f;
				f = 0.0F;
			    }
			    if (f_469_ < 0.0F) {
				f_472_ -= f_491_ * f_469_;
				f_469_ = 0.0F;
			    }
			    if (f != f_469_ && f_493_ < f_492_
				|| f == f_469_ && f_493_ > f_491_) {
				f_470_ -= f_469_;
				f_469_ -= f;
				f = (float) (((Class109) this).anIntArray1676
					     [(int) f]);
				while (--f_469_ >= 0.0F) {
				    method1021(anIntArray1673, aFloatArray1677,
					       (int) f, 0, 0, (int) f_473_,
					       (int) f_471_, f_474_, f_495_,
					       f_503_, f_497_, f_504_, f_499_,
					       f_505_, f_501_);
				    f_473_ += f_493_;
				    f_471_ += f_492_;
				    f_474_ += f_496_;
				    f_503_ += f_498_;
				    f_504_ += f_500_;
				    f_505_ += f_502_;
				    f += (float) anInt1678;
				}
				while (--f_470_ >= 0.0F) {
				    method1021(anIntArray1673, aFloatArray1677,
					       (int) f, 0, 0, (int) f_473_,
					       (int) f_472_, f_474_, f_495_,
					       f_503_, f_497_, f_504_, f_499_,
					       f_505_, f_501_);
				    f_473_ += f_493_;
				    f_472_ += f_491_;
				    f_474_ += f_496_;
				    f_503_ += f_498_;
				    f_504_ += f_500_;
				    f_505_ += f_502_;
				    f += (float) anInt1678;
				}
			    } else {
				f_470_ -= f_469_;
				f_469_ -= f;
				f = (float) (((Class109) this).anIntArray1676
					     [(int) f]);
				while (--f_469_ >= 0.0F) {
				    method1021(anIntArray1673, aFloatArray1677,
					       (int) f, 0, 0, (int) f_471_,
					       (int) f_473_, f_474_, f_495_,
					       f_503_, f_497_, f_504_, f_499_,
					       f_505_, f_501_);
				    f_473_ += f_493_;
				    f_471_ += f_492_;
				    f_474_ += f_496_;
				    f_503_ += f_498_;
				    f_504_ += f_500_;
				    f_505_ += f_502_;
				    f += (float) anInt1678;
				}
				while (--f_470_ >= 0.0F) {
				    method1021(anIntArray1673, aFloatArray1677,
					       (int) f, 0, 0, (int) f_472_,
					       (int) f_473_, f_474_, f_495_,
					       f_503_, f_497_, f_504_, f_499_,
					       f_505_, f_501_);
				    f_473_ += f_493_;
				    f_472_ += f_491_;
				    f_474_ += f_496_;
				    f_503_ += f_498_;
				    f_504_ += f_500_;
				    f_505_ += f_502_;
				    f += (float) anInt1678;
				}
			    }
			} else {
			    f_472_ = f_471_;
			    if (f < 0.0F) {
				f_472_ -= f_493_ * f;
				f_471_ -= f_492_ * f;
				f_474_ -= f_496_ * f;
				f_503_ -= f_498_ * f;
				f_504_ -= f_500_ * f;
				f_505_ -= f_502_ * f;
				f = 0.0F;
			    }
			    if (f_470_ < 0.0F) {
				f_473_ -= f_491_ * f_470_;
				f_470_ = 0.0F;
			    }
			    if (f != f_470_ && f_493_ < f_492_
				|| f == f_470_ && f_491_ > f_492_) {
				f_469_ -= f_470_;
				f_470_ -= f;
				f = (float) (((Class109) this).anIntArray1676
					     [(int) f]);
				while (--f_470_ >= 0.0F) {
				    method1021(anIntArray1673, aFloatArray1677,
					       (int) f, 0, 0, (int) f_472_,
					       (int) f_471_, f_474_, f_495_,
					       f_503_, f_497_, f_504_, f_499_,
					       f_505_, f_501_);
				    f_472_ += f_493_;
				    f_471_ += f_492_;
				    f_474_ += f_496_;
				    f_503_ += f_498_;
				    f_504_ += f_500_;
				    f_505_ += f_502_;
				    f += (float) anInt1678;
				}
				while (--f_469_ >= 0.0F) {
				    method1021(anIntArray1673, aFloatArray1677,
					       (int) f, 0, 0, (int) f_473_,
					       (int) f_471_, f_474_, f_495_,
					       f_503_, f_497_, f_504_, f_499_,
					       f_505_, f_501_);
				    f_473_ += f_491_;
				    f_471_ += f_492_;
				    f_474_ += f_496_;
				    f_503_ += f_498_;
				    f_504_ += f_500_;
				    f_505_ += f_502_;
				    f += (float) anInt1678;
				}
			    } else {
				f_469_ -= f_470_;
				f_470_ -= f;
				f = (float) (((Class109) this).anIntArray1676
					     [(int) f]);
				while (--f_470_ >= 0.0F) {
				    method1021(anIntArray1673, aFloatArray1677,
					       (int) f, 0, 0, (int) f_471_,
					       (int) f_472_, f_474_, f_495_,
					       f_503_, f_497_, f_504_, f_499_,
					       f_505_, f_501_);
				    f_472_ += f_493_;
				    f_471_ += f_492_;
				    f_474_ += f_496_;
				    f_503_ += f_498_;
				    f_504_ += f_500_;
				    f_505_ += f_502_;
				    f += (float) anInt1678;
				}
				while (--f_469_ >= 0.0F) {
				    method1021(anIntArray1673, aFloatArray1677,
					       (int) f, 0, 0, (int) f_471_,
					       (int) f_473_, f_474_, f_495_,
					       f_503_, f_497_, f_504_, f_499_,
					       f_505_, f_501_);
				    f_473_ += f_491_;
				    f_471_ += f_492_;
				    f_474_ += f_496_;
				    f_503_ += f_498_;
				    f_504_ += f_500_;
				    f_505_ += f_502_;
				    f += (float) anInt1678;
				}
			    }
			}
		    }
		} else if (f_469_ <= f_470_) {
		    if (!(f_469_ >= (float) ((Class109) this).anInt1672)) {
			if (f_470_ > (float) ((Class109) this).anInt1672)
			    f_470_ = (float) ((Class109) this).anInt1672;
			if (f > (float) ((Class109) this).anInt1672)
			    f = (float) ((Class109) this).anInt1672;
			f_475_ = f_475_ - f_495_ * f_472_ + f_495_;
			float f_506_ = ((float) (i_477_ & 0xff0000)
					- f_497_ * f_472_ + f_497_);
			float f_507_ = ((float) (i_477_ & 0xff00)
					- f_499_ * f_472_ + f_499_);
			float f_508_ = ((float) (i_477_ & 0xff)
					- f_501_ * f_472_ + f_501_);
			if (f_470_ < f) {
			    f_471_ = f_472_;
			    if (f_469_ < 0.0F) {
				f_471_ -= f_492_ * f_469_;
				f_472_ -= f_491_ * f_469_;
				f_475_ -= f_496_ * f_469_;
				f_506_ -= f_498_ * f_469_;
				f_507_ -= f_500_ * f_469_;
				f_508_ -= f_502_ * f_469_;
				f_469_ = 0.0F;
			    }
			    if (f_470_ < 0.0F) {
				f_473_ -= f_493_ * f_470_;
				f_470_ = 0.0F;
			    }
			    if (f_469_ != f_470_ && f_492_ < f_491_
				|| f_469_ == f_470_ && f_492_ > f_493_) {
				f -= f_470_;
				f_470_ -= f_469_;
				f_469_
				    = (float) (((Class109) this).anIntArray1676
					       [(int) f_469_]);
				while (--f_470_ >= 0.0F) {
				    method1021(anIntArray1673, aFloatArray1677,
					       (int) f_469_, 0, 0,
					       (int) f_471_, (int) f_472_,
					       f_475_, f_495_, f_506_, f_497_,
					       f_507_, f_499_, f_508_, f_501_);
				    f_471_ += f_492_;
				    f_472_ += f_491_;
				    f_475_ += f_496_;
				    f_506_ += f_498_;
				    f_507_ += f_500_;
				    f_508_ += f_502_;
				    f_469_ += (float) anInt1678;
				}
				while (--f >= 0.0F) {
				    method1021(anIntArray1673, aFloatArray1677,
					       (int) f_469_, 0, 0,
					       (int) f_471_, (int) f_473_,
					       f_475_, f_495_, f_506_, f_497_,
					       f_507_, f_499_, f_508_, f_501_);
				    f_471_ += f_492_;
				    f_473_ += f_493_;
				    f_475_ += f_496_;
				    f_506_ += f_498_;
				    f_507_ += f_500_;
				    f_508_ += f_502_;
				    f_469_ += (float) anInt1678;
				}
			    } else {
				f -= f_470_;
				f_470_ -= f_469_;
				f_469_
				    = (float) (((Class109) this).anIntArray1676
					       [(int) f_469_]);
				while (--f_470_ >= 0.0F) {
				    method1021(anIntArray1673, aFloatArray1677,
					       (int) f_469_, 0, 0,
					       (int) f_472_, (int) f_471_,
					       f_475_, f_495_, f_506_, f_497_,
					       f_507_, f_499_, f_508_, f_501_);
				    f_471_ += f_492_;
				    f_472_ += f_491_;
				    f_475_ += f_496_;
				    f_506_ += f_498_;
				    f_507_ += f_500_;
				    f_508_ += f_502_;
				    f_469_ += (float) anInt1678;
				}
				while (--f >= 0.0F) {
				    method1021(anIntArray1673, aFloatArray1677,
					       (int) f_469_, 0, 0,
					       (int) f_473_, (int) f_471_,
					       f_475_, f_495_, f_506_, f_497_,
					       f_507_, f_499_, f_508_, f_501_);
				    f_471_ += f_492_;
				    f_473_ += f_493_;
				    f_475_ += f_496_;
				    f_506_ += f_498_;
				    f_507_ += f_500_;
				    f_508_ += f_502_;
				    f_469_ += (float) anInt1678;
				}
			    }
			} else {
			    f_473_ = f_472_;
			    if (f_469_ < 0.0F) {
				f_473_ -= f_492_ * f_469_;
				f_472_ -= f_491_ * f_469_;
				f_475_ -= f_496_ * f_469_;
				f_506_ -= f_498_ * f_469_;
				f_507_ -= f_500_ * f_469_;
				f_508_ -= f_502_ * f_469_;
				f_469_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_471_ -= f_493_ * f;
				f = 0.0F;
			    }
			    if (f_492_ < f_491_) {
				f_470_ -= f;
				f -= f_469_;
				f_469_
				    = (float) (((Class109) this).anIntArray1676
					       [(int) f_469_]);
				while (--f >= 0.0F) {
				    method1021(anIntArray1673, aFloatArray1677,
					       (int) f_469_, 0, 0,
					       (int) f_473_, (int) f_472_,
					       f_475_, f_495_, f_506_, f_497_,
					       f_507_, f_499_, f_508_, f_501_);
				    f_473_ += f_492_;
				    f_472_ += f_491_;
				    f_475_ += f_496_;
				    f_506_ += f_498_;
				    f_507_ += f_500_;
				    f_508_ += f_502_;
				    f_469_ += (float) anInt1678;
				}
				while (--f_470_ >= 0.0F) {
				    method1021(anIntArray1673, aFloatArray1677,
					       (int) f_469_, 0, 0,
					       (int) f_471_, (int) f_472_,
					       f_475_, f_495_, f_506_, f_497_,
					       f_507_, f_499_, f_508_, f_501_);
				    f_471_ += f_493_;
				    f_472_ += f_491_;
				    f_475_ += f_496_;
				    f_506_ += f_498_;
				    f_507_ += f_500_;
				    f_508_ += f_502_;
				    f_469_ += (float) anInt1678;
				}
			    } else {
				f_470_ -= f;
				f -= f_469_;
				f_469_
				    = (float) (((Class109) this).anIntArray1676
					       [(int) f_469_]);
				while (--f >= 0.0F) {
				    method1021(anIntArray1673, aFloatArray1677,
					       (int) f_469_, 0, 0,
					       (int) f_472_, (int) f_473_,
					       f_475_, f_495_, f_506_, f_497_,
					       f_507_, f_499_, f_508_, f_501_);
				    f_473_ += f_492_;
				    f_472_ += f_491_;
				    f_475_ += f_496_;
				    f_506_ += f_498_;
				    f_507_ += f_500_;
				    f_508_ += f_502_;
				    f_469_ += (float) anInt1678;
				}
				while (--f_470_ >= 0.0F) {
				    method1021(anIntArray1673, aFloatArray1677,
					       (int) f_469_, 0, 0,
					       (int) f_472_, (int) f_471_,
					       f_475_, f_495_, f_506_, f_497_,
					       f_507_, f_499_, f_508_, f_501_);
				    f_471_ += f_493_;
				    f_472_ += f_491_;
				    f_475_ += f_496_;
				    f_506_ += f_498_;
				    f_507_ += f_500_;
				    f_508_ += f_502_;
				    f_469_ += (float) anInt1678;
				}
			    }
			}
		    }
		} else if (!(f_470_ >= (float) ((Class109) this).anInt1672)) {
		    if (f > (float) ((Class109) this).anInt1672)
			f = (float) ((Class109) this).anInt1672;
		    if (f_469_ > (float) ((Class109) this).anInt1672)
			f_469_ = (float) ((Class109) this).anInt1672;
		    f_476_ = f_476_ - f_495_ * f_473_ + f_495_;
		    float f_509_ = ((float) (i_478_ & 0xff0000)
				    - f_497_ * f_473_ + f_497_);
		    float f_510_
			= (float) (i_478_ & 0xff00) - f_499_ * f_473_ + f_499_;
		    float f_511_
			= (float) (i_478_ & 0xff) - f_501_ * f_473_ + f_501_;
		    if (f < f_469_) {
			f_472_ = f_473_;
			if (f_470_ < 0.0F) {
			    f_472_ -= f_491_ * f_470_;
			    f_473_ -= f_493_ * f_470_;
			    f_476_ -= f_496_ * f_470_;
			    f_509_ -= f_498_ * f_470_;
			    f_510_ -= f_500_ * f_470_;
			    f_511_ -= f_502_ * f_470_;
			    f_470_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_471_ -= f_492_ * f;
			    f = 0.0F;
			}
			if (f_491_ < f_493_) {
			    f_469_ -= f;
			    f -= f_470_;
			    f_470_ = (float) (((Class109) this).anIntArray1676
					      [(int) f_470_]);
			    while (--f >= 0.0F) {
				method1021(anIntArray1673, aFloatArray1677,
					   (int) f_470_, 0, 0, (int) f_472_,
					   (int) f_473_, f_476_, f_495_,
					   f_509_, f_497_, f_510_, f_499_,
					   f_511_, f_501_);
				f_472_ += f_491_;
				f_473_ += f_493_;
				f_476_ += f_496_;
				f_509_ += f_498_;
				f_510_ += f_500_;
				f_511_ += f_502_;
				f_470_ += (float) anInt1678;
			    }
			    while (--f_469_ >= 0.0F) {
				method1021(anIntArray1673, aFloatArray1677,
					   (int) f_470_, 0, 0, (int) f_472_,
					   (int) f_471_, f_476_, f_495_,
					   f_509_, f_497_, f_510_, f_499_,
					   f_511_, f_501_);
				f_472_ += f_491_;
				f_471_ += f_492_;
				f_476_ += f_496_;
				f_509_ += f_498_;
				f_510_ += f_500_;
				f_511_ += f_502_;
				f_470_ += (float) anInt1678;
			    }
			} else {
			    f_469_ -= f;
			    f -= f_470_;
			    f_470_ = (float) (((Class109) this).anIntArray1676
					      [(int) f_470_]);
			    while (--f >= 0.0F) {
				method1021(anIntArray1673, aFloatArray1677,
					   (int) f_470_, 0, 0, (int) f_473_,
					   (int) f_472_, f_476_, f_495_,
					   f_509_, f_497_, f_510_, f_499_,
					   f_511_, f_501_);
				f_472_ += f_491_;
				f_473_ += f_493_;
				f_476_ += f_496_;
				f_509_ += f_498_;
				f_510_ += f_500_;
				f_511_ += f_502_;
				f_470_ += (float) anInt1678;
			    }
			    while (--f_469_ >= 0.0F) {
				method1021(anIntArray1673, aFloatArray1677,
					   (int) f_470_, 0, 0, (int) f_471_,
					   (int) f_472_, f_476_, f_495_,
					   f_509_, f_497_, f_510_, f_499_,
					   f_511_, f_501_);
				f_472_ += f_491_;
				f_471_ += f_492_;
				f_476_ += f_496_;
				f_509_ += f_498_;
				f_510_ += f_500_;
				f_511_ += f_502_;
				f_470_ += (float) anInt1678;
			    }
			}
		    } else {
			f_471_ = f_473_;
			if (f_470_ < 0.0F) {
			    f_471_ -= f_491_ * f_470_;
			    f_473_ -= f_493_ * f_470_;
			    f_476_ -= f_496_ * f_470_;
			    f_509_ -= f_498_ * f_470_;
			    f_510_ -= f_500_ * f_470_;
			    f_511_ -= f_502_ * f_470_;
			    f_470_ = 0.0F;
			}
			if (f_469_ < 0.0F) {
			    f_472_ -= f_492_ * f_469_;
			    f_469_ = 0.0F;
			}
			if (f_491_ < f_493_) {
			    f -= f_469_;
			    f_469_ -= f_470_;
			    f_470_ = (float) (((Class109) this).anIntArray1676
					      [(int) f_470_]);
			    while (--f_469_ >= 0.0F) {
				method1021(anIntArray1673, aFloatArray1677,
					   (int) f_470_, 0, 0, (int) f_471_,
					   (int) f_473_, f_476_, f_495_,
					   f_509_, f_497_, f_510_, f_499_,
					   f_511_, f_501_);
				f_471_ += f_491_;
				f_473_ += f_493_;
				f_476_ += f_496_;
				f_509_ += f_498_;
				f_510_ += f_500_;
				f_511_ += f_502_;
				f_470_ += (float) anInt1678;
			    }
			    while (--f >= 0.0F) {
				method1021(anIntArray1673, aFloatArray1677,
					   (int) f_470_, 0, 0, (int) f_472_,
					   (int) f_473_, f_476_, f_495_,
					   f_509_, f_497_, f_510_, f_499_,
					   f_511_, f_501_);
				f_472_ += f_492_;
				f_473_ += f_493_;
				f_476_ += f_496_;
				f_509_ += f_498_;
				f_510_ += f_500_;
				f_511_ += f_502_;
				f_470_ += (float) anInt1678;
			    }
			} else {
			    f -= f_469_;
			    f_469_ -= f_470_;
			    f_470_ = (float) (((Class109) this).anIntArray1676
					      [(int) f_470_]);
			    while (--f_469_ >= 0.0F) {
				method1021(anIntArray1673, aFloatArray1677,
					   (int) f_470_, 0, 0, (int) f_473_,
					   (int) f_471_, f_476_, f_495_,
					   f_509_, f_497_, f_510_, f_499_,
					   f_511_, f_501_);
				f_471_ += f_491_;
				f_473_ += f_493_;
				f_476_ += f_496_;
				f_509_ += f_498_;
				f_510_ += f_500_;
				f_511_ += f_502_;
				f_470_ += (float) anInt1678;
			    }
			    while (--f >= 0.0F) {
				method1021(anIntArray1673, aFloatArray1677,
					   (int) f_470_, 0, 0, (int) f_473_,
					   (int) f_472_, f_476_, f_495_,
					   f_509_, f_497_, f_510_, f_499_,
					   f_511_, f_501_);
				f_472_ += f_492_;
				f_473_ += f_493_;
				f_476_ += f_496_;
				f_509_ += f_498_;
				f_510_ += f_500_;
				f_511_ += f_502_;
				f_470_ += (float) anInt1678;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final int method1028() {
	return ((Class109) this).anIntArray1676[0] % anInt1678;
    }
    
    Class109(SoftwareToolkit var_ha_Sub1, Class167 class167) {
	((Class109) this).aBoolean1669 = true;
	((Class109) this).aBoolean1671 = false;
	aBoolean1680 = false;
	aFloat1682 = 0.0F;
	anIntArray1685 = null;
	anInt1687 = -1;
	aFloat1684 = 0.0F;
	anInt1693 = 0;
	anInt1691 = 0;
	anIntArray1692 = null;
	anInt1689 = -1;
	anInt1683 = 0;
	aFloat1681 = 0.0F;
	aBoolean1694 = true;
	anInt1688 = 0;
	anInt1695 = 0;
	anInt1686 = 0;
	anInt1690 = 0;
	anInt1697 = -1;
	anIntArray1698 = null;
	aHa_Sub1_1666 = var_ha_Sub1;
	aClass167_1670 = class167;
	anInt1678 = ((SoftwareToolkit) aHa_Sub1_1666).maxWidth;
	anIntArray1673 = ((SoftwareToolkit) aHa_Sub1_1666).pixelBuffer;
	aFloatArray1677 = ((SoftwareToolkit) aHa_Sub1_1666).aFloatArray7511;
    }
}
