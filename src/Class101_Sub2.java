/* Class101_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class101_Sub2 extends Class101
{
    static int anInt5690;
    float aFloat5691;
    static int anInt5692;
    static int anInt5693;
    static int anInt5694;
    static int anInt5695;
    static int anInt5696;
    static int anInt5697;
    static int anInt5698;
    static OutgoingPacket aClass351_5699;
    float aFloat5700;
    static int anInt5701;
    static int anInt5702;
    static int anInt5703;
    float aFloat5704;
    static int anInt5705;
    static int anInt5706;
    static int anInt5707;
    float aFloat5708;
    static int anInt5709;
    float aFloat5710;
    float aFloat5711;
    static int anInt5712;
    static int anInt5713 = -1;
    static int anInt5714;
    static int anInt5715;
    float aFloat5716;
    static int anInt5717;
    static int anInt5718;
    static int anInt5719;
    static int anInt5720;
    static int anInt5721;
    float aFloat5722;
    static int anInt5723;
    float aFloat5724;
    static int anInt5725;
    static int anInt5726;
    static int anInt5727;
    static int anInt5728;
    float aFloat5729;
    static int anInt5730;
    static int anInt5731;
    float aFloat5732;
    static int anInt5733;
    static int anInt5734;
    static int anInt5735;
    float aFloat5736;
    static int anInt5737;
    static int anInt5738;
    static int anInt5739;
    static int anInt5740;
    static int anInt5741;
    static IncomingPacket aClass114_5742;
    static int anInt5743;
    static int anInt5744;
    static long aLong5745;
    
    final void method902(int i) {
	((Class101_Sub2) this).aFloat5716 = 1.0F;
	anInt5712++;
	((Class101_Sub2) this).aFloat5711
	    = ((Class101_Sub2) this).aFloat5722
	    = Class239_Sub4.aFloatArray5876[0x3fff & i];
	((Class101_Sub2) this).aFloat5708
	    = Class239_Sub4.aFloatArray5874[i & 0x3fff];
	((Class101_Sub2) this).aFloat5700 = -((Class101_Sub2) this).aFloat5708;
	((Class101_Sub2) this).aFloat5704
	    = ((Class101_Sub2) this).aFloat5729
	    = ((Class101_Sub2) this).aFloat5732
	    = ((Class101_Sub2) this).aFloat5710
	    = ((Class101_Sub2) this).aFloat5736
	    = ((Class101_Sub2) this).aFloat5691
	    = ((Class101_Sub2) this).aFloat5724 = 0.0F;
    }
    
    final void method914(float f, float f_0_, int i, float f_1_) {
	if (i == 0) {
	    ((Class101_Sub2) this).aFloat5724 *= f_0_;
	    ((Class101_Sub2) this).aFloat5729 *= f_1_;
	    ((Class101_Sub2) this).aFloat5732 *= f;
	    ((Class101_Sub2) this).aFloat5708 *= f;
	    ((Class101_Sub2) this).aFloat5704 *= f_1_;
	    ((Class101_Sub2) this).aFloat5722 *= f;
	    ((Class101_Sub2) this).aFloat5710 *= f;
	    ((Class101_Sub2) this).aFloat5716 *= f_0_;
	    ((Class101_Sub2) this).aFloat5736 *= f_0_;
	    anInt5728++;
	    ((Class101_Sub2) this).aFloat5711 *= f_1_;
	    ((Class101_Sub2) this).aFloat5691 *= f_0_;
	    ((Class101_Sub2) this).aFloat5700 *= f_1_;
	}
    }
    
    final void method894(int i, int i_2_, int i_3_) {
	((Class101_Sub2) this).aFloat5724 = (float) i_3_;
	((Class101_Sub2) this).aFloat5711
	    = ((Class101_Sub2) this).aFloat5722
	    = ((Class101_Sub2) this).aFloat5716 = 1.0F;
	((Class101_Sub2) this).aFloat5710 = (float) i_2_;
	((Class101_Sub2) this).aFloat5729 = (float) i;
	anInt5706++;
	((Class101_Sub2) this).aFloat5708
	    = ((Class101_Sub2) this).aFloat5736
	    = ((Class101_Sub2) this).aFloat5700
	    = ((Class101_Sub2) this).aFloat5691
	    = ((Class101_Sub2) this).aFloat5704
	    = ((Class101_Sub2) this).aFloat5732 = 0.0F;
    }
    
    final void method910() {
	((Class101_Sub2) this).aFloat5711
	    = ((Class101_Sub2) this).aFloat5722
	    = ((Class101_Sub2) this).aFloat5716 = 1.0F;
	((Class101_Sub2) this).aFloat5708
	    = ((Class101_Sub2) this).aFloat5736
	    = ((Class101_Sub2) this).aFloat5700
	    = ((Class101_Sub2) this).aFloat5691
	    = ((Class101_Sub2) this).aFloat5704
	    = ((Class101_Sub2) this).aFloat5732
	    = ((Class101_Sub2) this).aFloat5729
	    = ((Class101_Sub2) this).aFloat5710
	    = ((Class101_Sub2) this).aFloat5724 = 0.0F;
	anInt5696++;
    }
    
    final float[] method915(float[] fs, int i) {
	fs[7] = ((Class101_Sub2) this).aFloat5710;
	anInt5726++;
	fs[5] = ((Class101_Sub2) this).aFloat5722;
	fs[4] = ((Class101_Sub2) this).aFloat5708;
	fs[6] = ((Class101_Sub2) this).aFloat5732;
	fs[i] = ((Class101_Sub2) this).aFloat5700;
	fs[2] = ((Class101_Sub2) this).aFloat5704;
	fs[3] = ((Class101_Sub2) this).aFloat5729;
	fs[0] = ((Class101_Sub2) this).aFloat5711;
	return fs;
    }
    
    final void method903(int i, int i_4_, int i_5_, int i_6_, int i_7_,
			 int i_8_) {
	anInt5733++;
	float f = Class239_Sub4.aFloatArray5876[i_6_ & 0x3fff];
	float f_9_ = Class239_Sub4.aFloatArray5874[i_6_ & 0x3fff];
	float f_10_ = Class239_Sub4.aFloatArray5876[0x3fff & i_7_];
	float f_11_ = Class239_Sub4.aFloatArray5874[0x3fff & i_7_];
	float f_12_ = Class239_Sub4.aFloatArray5876[0x3fff & i_8_];
	float f_13_ = Class239_Sub4.aFloatArray5874[i_8_ & 0x3fff];
	float f_14_ = f_12_ * f_9_;
	float f_15_ = f_9_ * f_13_;
	((Class101_Sub2) this).aFloat5700 = f_13_ * f;
	((Class101_Sub2) this).aFloat5704 = -f_11_ * f_12_ + f_10_ * f_15_;
	((Class101_Sub2) this).aFloat5716 = f * f_10_;
	((Class101_Sub2) this).aFloat5732 = f_13_ * f_11_ + f_14_ * f_10_;
	((Class101_Sub2) this).aFloat5711 = f_10_ * f_12_ + f_15_ * f_11_;
	((Class101_Sub2) this).aFloat5736 = f * f_11_;
	((Class101_Sub2) this).aFloat5722 = f_12_ * f;
	((Class101_Sub2) this).aFloat5691 = -f_9_;
	((Class101_Sub2) this).aFloat5708 = f_11_ * f_14_ + f_13_ * -f_10_;
	((Class101_Sub2) this).aFloat5729
	    = (-(((Class101_Sub2) this).aFloat5704 * (float) i_5_)
	       + (-((float) i_4_ * ((Class101_Sub2) this).aFloat5700)
		  + ((Class101_Sub2) this).aFloat5711 * (float) -i));
	((Class101_Sub2) this).aFloat5710
	    = ((float) -i * ((Class101_Sub2) this).aFloat5708
	       - ((Class101_Sub2) this).aFloat5722 * (float) i_4_
	       - (float) i_5_ * ((Class101_Sub2) this).aFloat5732);
	((Class101_Sub2) this).aFloat5724
	    = (-(((Class101_Sub2) this).aFloat5716 * (float) i_5_)
	       + (((Class101_Sub2) this).aFloat5736 * (float) -i
		  - ((Class101_Sub2) this).aFloat5691 * (float) i_4_));
    }
    
    final void method895(int i) {
	((Class101_Sub2) this).aFloat5722 = 1.0F;
	anInt5738++;
	((Class101_Sub2) this).aFloat5711
	    = ((Class101_Sub2) this).aFloat5716
	    = Class239_Sub4.aFloatArray5876[0x3fff & i];
	((Class101_Sub2) this).aFloat5704
	    = Class239_Sub4.aFloatArray5874[i & 0x3fff];
	((Class101_Sub2) this).aFloat5736 = -((Class101_Sub2) this).aFloat5704;
	((Class101_Sub2) this).aFloat5700
	    = ((Class101_Sub2) this).aFloat5729
	    = ((Class101_Sub2) this).aFloat5708
	    = ((Class101_Sub2) this).aFloat5732
	    = ((Class101_Sub2) this).aFloat5710
	    = ((Class101_Sub2) this).aFloat5691
	    = ((Class101_Sub2) this).aFloat5724 = 0.0F;
    }
    
    final void method899(int i) {
	((Class101_Sub2) this).aFloat5711 = 1.0F;
	anInt5721++;
	((Class101_Sub2) this).aFloat5722
	    = ((Class101_Sub2) this).aFloat5716
	    = Class239_Sub4.aFloatArray5876[0x3fff & i];
	((Class101_Sub2) this).aFloat5691
	    = Class239_Sub4.aFloatArray5874[0x3fff & i];
	((Class101_Sub2) this).aFloat5700
	    = ((Class101_Sub2) this).aFloat5704
	    = ((Class101_Sub2) this).aFloat5729
	    = ((Class101_Sub2) this).aFloat5708
	    = ((Class101_Sub2) this).aFloat5710
	    = ((Class101_Sub2) this).aFloat5736
	    = ((Class101_Sub2) this).aFloat5724 = 0.0F;
	((Class101_Sub2) this).aFloat5732 = -((Class101_Sub2) this).aFloat5691;
    }
    
    final void method892(int i, int i_16_, int i_17_, int[] is) {
	anInt5694++;
	i_17_ -= ((Class101_Sub2) this).aFloat5724;
	i -= ((Class101_Sub2) this).aFloat5729;
	i_16_ -= ((Class101_Sub2) this).aFloat5710;
	is[2] = (int) ((float) i_17_ * ((Class101_Sub2) this).aFloat5716
		       + ((float) i_16_ * ((Class101_Sub2) this).aFloat5732
			  + (float) i * ((Class101_Sub2) this).aFloat5704));
	is[0] = (int) ((float) i * ((Class101_Sub2) this).aFloat5711
		       + (float) i_16_ * ((Class101_Sub2) this).aFloat5708
		       + ((Class101_Sub2) this).aFloat5736 * (float) i_17_);
	is[1] = (int) (((Class101_Sub2) this).aFloat5700 * (float) i
		       + ((Class101_Sub2) this).aFloat5722 * (float) i_16_
		       + ((Class101_Sub2) this).aFloat5691 * (float) i_17_);
    }
    
    final void method916(float f, boolean bool, float f_18_, float f_19_) {
	((Class101_Sub2) this).aFloat5710 = f;
	((Class101_Sub2) this).aFloat5724 = f_18_;
	((Class101_Sub2) this).aFloat5711
	    = ((Class101_Sub2) this).aFloat5722
	    = ((Class101_Sub2) this).aFloat5716 = 1.0F;
	if (bool == true) {
	    ((Class101_Sub2) this).aFloat5729 = f_19_;
	    ((Class101_Sub2) this).aFloat5708
		= ((Class101_Sub2) this).aFloat5736
		= ((Class101_Sub2) this).aFloat5700
		= ((Class101_Sub2) this).aFloat5691
		= ((Class101_Sub2) this).aFloat5704
		= ((Class101_Sub2) this).aFloat5732 = 0.0F;
	    anInt5735++;
	}
    }
    
    final void method891(int i, int i_20_, int i_21_) {
	((Class101_Sub2) this).aFloat5729 += (float) i;
	((Class101_Sub2) this).aFloat5710 += (float) i_20_;
	anInt5707++;
	((Class101_Sub2) this).aFloat5724 += (float) i_21_;
    }
    
    final void method917(Class101 class101, byte i) {
	anInt5698++;
	Class101_Sub2 class101_sub2_22_ = (Class101_Sub2) class101;
	float f = ((Class101_Sub2) this).aFloat5711;
	float f_23_ = ((Class101_Sub2) this).aFloat5708;
	float f_24_ = ((Class101_Sub2) this).aFloat5700;
	float f_25_ = ((Class101_Sub2) this).aFloat5722;
	float f_26_ = ((Class101_Sub2) this).aFloat5704;
	float f_27_ = ((Class101_Sub2) this).aFloat5732;
	if (i <= 104)
	    ((Class101_Sub2) this).aFloat5732 = -0.557632F;
	float f_28_ = ((Class101_Sub2) this).aFloat5729;
	((Class101_Sub2) this).aFloat5708
	    = (f * ((Class101_Sub2) class101_sub2_22_).aFloat5708
	       + ((Class101_Sub2) class101_sub2_22_).aFloat5722 * f_23_
	       + (((Class101_Sub2) this).aFloat5736
		  * ((Class101_Sub2) class101_sub2_22_).aFloat5732));
	((Class101_Sub2) this).aFloat5711
	    = ((((Class101_Sub2) class101_sub2_22_).aFloat5704
		* ((Class101_Sub2) this).aFloat5736)
	       + (((Class101_Sub2) class101_sub2_22_).aFloat5711 * f
		  + f_23_ * ((Class101_Sub2) class101_sub2_22_).aFloat5700));
	float f_29_ = ((Class101_Sub2) this).aFloat5710;
	((Class101_Sub2) this).aFloat5722
	    = ((((Class101_Sub2) class101_sub2_22_).aFloat5732
		* ((Class101_Sub2) this).aFloat5691)
	       + (f_24_ * ((Class101_Sub2) class101_sub2_22_).aFloat5708
		  + ((Class101_Sub2) class101_sub2_22_).aFloat5722 * f_25_));
	((Class101_Sub2) this).aFloat5700
	    = ((((Class101_Sub2) this).aFloat5691
		* ((Class101_Sub2) class101_sub2_22_).aFloat5704)
	       + (((Class101_Sub2) class101_sub2_22_).aFloat5711 * f_24_
		  + f_25_ * ((Class101_Sub2) class101_sub2_22_).aFloat5700));
	((Class101_Sub2) this).aFloat5736
	    = (f_23_ * ((Class101_Sub2) class101_sub2_22_).aFloat5691
	       + ((Class101_Sub2) class101_sub2_22_).aFloat5736 * f
	       + (((Class101_Sub2) this).aFloat5736
		  * ((Class101_Sub2) class101_sub2_22_).aFloat5716));
	((Class101_Sub2) this).aFloat5691
	    = ((((Class101_Sub2) this).aFloat5691
		* ((Class101_Sub2) class101_sub2_22_).aFloat5716)
	       + (f_25_ * ((Class101_Sub2) class101_sub2_22_).aFloat5691
		  + ((Class101_Sub2) class101_sub2_22_).aFloat5736 * f_24_));
	((Class101_Sub2) this).aFloat5732
	    = (((Class101_Sub2) class101_sub2_22_).aFloat5722 * f_27_
	       + ((Class101_Sub2) class101_sub2_22_).aFloat5708 * f_26_
	       + (((Class101_Sub2) this).aFloat5716
		  * ((Class101_Sub2) class101_sub2_22_).aFloat5732));
	((Class101_Sub2) this).aFloat5704
	    = ((((Class101_Sub2) this).aFloat5716
		* ((Class101_Sub2) class101_sub2_22_).aFloat5704)
	       + (((Class101_Sub2) class101_sub2_22_).aFloat5711 * f_26_
		  + f_27_ * ((Class101_Sub2) class101_sub2_22_).aFloat5700));
	((Class101_Sub2) this).aFloat5729
	    = (((Class101_Sub2) class101_sub2_22_).aFloat5729
	       + (f_28_ * ((Class101_Sub2) class101_sub2_22_).aFloat5711
		  + ((Class101_Sub2) class101_sub2_22_).aFloat5700 * f_29_
		  + (((Class101_Sub2) class101_sub2_22_).aFloat5704
		     * ((Class101_Sub2) this).aFloat5724)));
	((Class101_Sub2) this).aFloat5710
	    = (((Class101_Sub2) class101_sub2_22_).aFloat5708 * f_28_
	       + f_29_ * ((Class101_Sub2) class101_sub2_22_).aFloat5722
	       + (((Class101_Sub2) this).aFloat5724
		  * ((Class101_Sub2) class101_sub2_22_).aFloat5732)
	       + ((Class101_Sub2) class101_sub2_22_).aFloat5710);
	((Class101_Sub2) this).aFloat5716
	    = ((((Class101_Sub2) this).aFloat5716
		* ((Class101_Sub2) class101_sub2_22_).aFloat5716)
	       + (((Class101_Sub2) class101_sub2_22_).aFloat5736 * f_26_
		  + ((Class101_Sub2) class101_sub2_22_).aFloat5691 * f_27_));
	((Class101_Sub2) this).aFloat5724
	    = (((Class101_Sub2) class101_sub2_22_).aFloat5736 * f_28_
	       + ((Class101_Sub2) class101_sub2_22_).aFloat5691 * f_29_
	       + (((Class101_Sub2) this).aFloat5724
		  * ((Class101_Sub2) class101_sub2_22_).aFloat5716)
	       + ((Class101_Sub2) class101_sub2_22_).aFloat5724);
    }
    
    final float[] method918(float[] fs, int i) {
	fs[7] = 0.0F;
	fs[13] = ((Class101_Sub2) this).aFloat5710;
	fs[14] = ((Class101_Sub2) this).aFloat5724;
	fs[12] = ((Class101_Sub2) this).aFloat5729;
	fs[11] = 0.0F;
	anInt5709++;
	fs[9] = ((Class101_Sub2) this).aFloat5732;
	fs[8] = ((Class101_Sub2) this).aFloat5704;
	fs[4] = ((Class101_Sub2) this).aFloat5700;
	fs[0] = ((Class101_Sub2) this).aFloat5711;
	fs[10] = ((Class101_Sub2) this).aFloat5716;
	fs[5] = ((Class101_Sub2) this).aFloat5722;
	fs[15] = 1.0F;
	fs[1] = ((Class101_Sub2) this).aFloat5708;
	fs[3] = (float) i;
	fs[2] = ((Class101_Sub2) this).aFloat5736;
	fs[6] = ((Class101_Sub2) this).aFloat5691;
	return fs;
    }
    
    final void method919(float f, float[] fs, float f_30_, float f_31_,
			 float f_32_, byte i) {
	anInt5727++;
	if (i != -120)
	    method921((byte) -93, false);
	fs[0] = (f_30_ * ((Class101_Sub2) this).aFloat5700
		 + f_31_ * ((Class101_Sub2) this).aFloat5711
		 + ((Class101_Sub2) this).aFloat5704 * f);
	fs[1] = (((Class101_Sub2) this).aFloat5708 * f_31_
		 + f_30_ * ((Class101_Sub2) this).aFloat5722
		 + ((Class101_Sub2) this).aFloat5732 * f);
	float f_33_;
	float f_34_;
	float f_35_;
	if (f_31_ > 0.00390625F || f_31_ < -0.00390625F) {
	    float f_36_ = -f_32_ / f_31_;
	    f_34_ = (((Class101_Sub2) this).aFloat5724
		     + f_36_ * ((Class101_Sub2) this).aFloat5736);
	    f_35_ = (((Class101_Sub2) this).aFloat5729
		     + f_36_ * ((Class101_Sub2) this).aFloat5711);
	    f_33_ = (f_36_ * ((Class101_Sub2) this).aFloat5708
		     + ((Class101_Sub2) this).aFloat5710);
	} else if (f_30_ > 0.00390625F || f_30_ < -0.00390625F) {
	    float f_37_ = -f_32_ / f_30_;
	    f_33_ = (((Class101_Sub2) this).aFloat5710
		     + f_37_ * ((Class101_Sub2) this).aFloat5722);
	    f_34_ = (((Class101_Sub2) this).aFloat5724
		     + ((Class101_Sub2) this).aFloat5691 * f_37_);
	    f_35_ = (((Class101_Sub2) this).aFloat5729
		     + ((Class101_Sub2) this).aFloat5700 * f_37_);
	} else {
	    float f_38_ = -f_32_ / f;
	    f_35_ = (((Class101_Sub2) this).aFloat5704 * f_38_
		     + ((Class101_Sub2) this).aFloat5729);
	    f_33_ = (((Class101_Sub2) this).aFloat5732 * f_38_
		     + ((Class101_Sub2) this).aFloat5710);
	    f_34_ = (((Class101_Sub2) this).aFloat5724
		     + f_38_ * ((Class101_Sub2) this).aFloat5716);
	}
	fs[2] = (f * ((Class101_Sub2) this).aFloat5716
		 + (((Class101_Sub2) this).aFloat5691 * f_30_
		    + f_31_ * ((Class101_Sub2) this).aFloat5736));
	fs[3] = -(fs[2] * f_34_ + (fs[0] * f_35_ + fs[1] * f_33_));
    }
    
    final void method900(int i) {
	anInt5734++;
	float f = Class239_Sub4.aFloatArray5876[0x3fff & i];
	float f_39_ = Class239_Sub4.aFloatArray5874[0x3fff & i];
	float f_40_ = ((Class101_Sub2) this).aFloat5708;
	float f_41_ = ((Class101_Sub2) this).aFloat5722;
	float f_42_ = ((Class101_Sub2) this).aFloat5732;
	((Class101_Sub2) this).aFloat5708
	    = f_40_ * f - f_39_ * ((Class101_Sub2) this).aFloat5736;
	float f_43_ = ((Class101_Sub2) this).aFloat5710;
	((Class101_Sub2) this).aFloat5722
	    = f_41_ * f - f_39_ * ((Class101_Sub2) this).aFloat5691;
	((Class101_Sub2) this).aFloat5736
	    = f * ((Class101_Sub2) this).aFloat5736 + f_39_ * f_40_;
	((Class101_Sub2) this).aFloat5691
	    = f * ((Class101_Sub2) this).aFloat5691 + f_39_ * f_41_;
	((Class101_Sub2) this).aFloat5732
	    = f_42_ * f - ((Class101_Sub2) this).aFloat5716 * f_39_;
	((Class101_Sub2) this).aFloat5710
	    = f * f_43_ - f_39_ * ((Class101_Sub2) this).aFloat5724;
	((Class101_Sub2) this).aFloat5716
	    = f * ((Class101_Sub2) this).aFloat5716 + f_42_ * f_39_;
	((Class101_Sub2) this).aFloat5724
	    = f_39_ * f_43_ + f * ((Class101_Sub2) this).aFloat5724;
    }
    
    final void method920(float f, boolean bool, float f_44_, float f_45_) {
	((Class101_Sub2) this).aFloat5724 += f_44_;
	anInt5717++;
	((Class101_Sub2) this).aFloat5729 += f_45_;
	((Class101_Sub2) this).aFloat5710 += f;
	if (bool != false)
	    method915(null, 69);
    }
    
    static final void method921(byte i, boolean bool) {
	if (i == 99) {
	    for (Class348_Sub9 class348_sub9
		     = (Class348_Sub9) Class218.aClass262_2859.getFirst(4);
		 class348_sub9 != null;
		 class348_sub9 = (Class348_Sub9) Class218.aClass262_2859
						     .nextForward((byte) 120)) {
		if (((Class348_Sub9) class348_sub9).aClass348_Sub16_Sub5_6676
		    != null) {
		    Class348_Sub43.aClass348_Sub16_Sub4_7065.method2880
			(((Class348_Sub9) class348_sub9)
			 .aClass348_Sub16_Sub5_6676);
		    ((Class348_Sub9) class348_sub9).aClass348_Sub16_Sub5_6676
			= null;
		}
		if (((Class348_Sub9) class348_sub9).aClass348_Sub16_Sub5_6673
		    != null) {
		    Class348_Sub43.aClass348_Sub16_Sub4_7065.method2880
			(((Class348_Sub9) class348_sub9)
			 .aClass348_Sub16_Sub5_6673);
		    ((Class348_Sub9) class348_sub9).aClass348_Sub16_Sub5_6673
			= null;
		}
		class348_sub9.removeNode();
	    }
	    anInt5739++;
	    if (bool) {
		for (Class348_Sub9 class348_sub9
			 = (Class348_Sub9) Main.aClass262_5185.getFirst(4);
		     class348_sub9 != null;
		     class348_sub9
			 = ((Class348_Sub9)
			    Main.aClass262_5185.nextForward((byte) 69))) {
		    if ((((Class348_Sub9) class348_sub9)
			 .aClass348_Sub16_Sub5_6676)
			!= null) {
			Class348_Sub43.aClass348_Sub16_Sub4_7065.method2880
			    (((Class348_Sub9) class348_sub9)
			     .aClass348_Sub16_Sub5_6676);
			((Class348_Sub9) class348_sub9)
			    .aClass348_Sub16_Sub5_6676
			    = null;
		    }
		    class348_sub9.removeNode();
		}
		for (Class348_Sub9 class348_sub9
			 = (Class348_Sub9) FileIndexRequest
					       .aClass356_10465.method3484(0);
		     class348_sub9 != null;
		     class348_sub9 = (Class348_Sub9) FileIndexRequest
							 .aClass356_10465
							 .method3482(0)) {
		    if ((((Class348_Sub9) class348_sub9)
			 .aClass348_Sub16_Sub5_6676)
			!= null) {
			Class348_Sub43.aClass348_Sub16_Sub4_7065.method2880
			    (((Class348_Sub9) class348_sub9)
			     .aClass348_Sub16_Sub5_6676);
			((Class348_Sub9) class348_sub9)
			    .aClass348_Sub16_Sub5_6676
			    = null;
		    }
		    class348_sub9.removeNode();
		}
	    }
	}
    }
    
    final float method922(byte i, float f, float f_46_, float f_47_) {
	anInt5701++;
	if (i <= 63)
	    ((Class101_Sub2) this).aFloat5700 = -0.2392172F;
	return (((Class101_Sub2) this).aFloat5722 * f_47_
		+ f * ((Class101_Sub2) this).aFloat5708
		+ f_46_ * ((Class101_Sub2) this).aFloat5732
		+ ((Class101_Sub2) this).aFloat5710);
    }
    
    final void method923(float f, float f_48_, byte i, float f_49_,
			 float[] fs) {
	fs[2] = (f_49_ * ((Class101_Sub2) this).aFloat5716
		 + (((Class101_Sub2) this).aFloat5691 * f_48_
		    + ((Class101_Sub2) this).aFloat5736 * f));
	if (i > -23)
	    method897(30, -104, -112, null);
	anInt5697++;
	fs[1] = (((Class101_Sub2) this).aFloat5732 * f_49_
		 + (f_48_ * ((Class101_Sub2) this).aFloat5722
		    + f * ((Class101_Sub2) this).aFloat5708));
	fs[0] = (f_49_ * ((Class101_Sub2) this).aFloat5704
		 + (((Class101_Sub2) this).aFloat5711 * f
		    + f_48_ * ((Class101_Sub2) this).aFloat5700));
    }
    
    final float[] method924(int i, float[] fs) {
	fs[2] = ((Class101_Sub2) this).aFloat5704;
	fs[0] = ((Class101_Sub2) this).aFloat5711;
	fs[6] = ((Class101_Sub2) this).aFloat5732;
	fs[13] = 0.0F;
	fs[3] = ((Class101_Sub2) this).aFloat5729;
	fs[7] = ((Class101_Sub2) this).aFloat5710;
	fs[12] = 0.0F;
	fs[14] = 0.0F;
	anInt5705++;
	fs[10] = ((Class101_Sub2) this).aFloat5716;
	fs[8] = ((Class101_Sub2) this).aFloat5736;
	fs[1] = ((Class101_Sub2) this).aFloat5700;
	fs[5] = ((Class101_Sub2) this).aFloat5722;
	fs[9] = ((Class101_Sub2) this).aFloat5691;
	fs[15] = 1.0F;
	fs[4] = ((Class101_Sub2) this).aFloat5708;
	fs[i] = ((Class101_Sub2) this).aFloat5724;
	return fs;
    }
    
    public static void method925(int i) {
	if (i == -5997) {
	    aClass351_5699 = null;
	    aClass114_5742 = null;
	}
    }
    
    final Class101 method907() {
	anInt5695++;
	Class101_Sub2 class101_sub2_50_ = new Class101_Sub2();
	((Class101_Sub2) class101_sub2_50_).aFloat5691
	    = ((Class101_Sub2) this).aFloat5691;
	((Class101_Sub2) class101_sub2_50_).aFloat5724
	    = ((Class101_Sub2) this).aFloat5724;
	((Class101_Sub2) class101_sub2_50_).aFloat5700
	    = ((Class101_Sub2) this).aFloat5700;
	((Class101_Sub2) class101_sub2_50_).aFloat5729
	    = ((Class101_Sub2) this).aFloat5729;
	((Class101_Sub2) class101_sub2_50_).aFloat5736
	    = ((Class101_Sub2) this).aFloat5736;
	((Class101_Sub2) class101_sub2_50_).aFloat5710
	    = ((Class101_Sub2) this).aFloat5710;
	((Class101_Sub2) class101_sub2_50_).aFloat5722
	    = ((Class101_Sub2) this).aFloat5722;
	((Class101_Sub2) class101_sub2_50_).aFloat5704
	    = ((Class101_Sub2) this).aFloat5704;
	((Class101_Sub2) class101_sub2_50_).aFloat5708
	    = ((Class101_Sub2) this).aFloat5708;
	((Class101_Sub2) class101_sub2_50_).aFloat5716
	    = ((Class101_Sub2) this).aFloat5716;
	((Class101_Sub2) class101_sub2_50_).aFloat5711
	    = ((Class101_Sub2) this).aFloat5711;
	((Class101_Sub2) class101_sub2_50_).aFloat5732
	    = ((Class101_Sub2) this).aFloat5732;
	return class101_sub2_50_;
    }
    
    final void method926(int i, Class101 class101) {
	anInt5737++;
	if (i != -15699)
	    ((Class101_Sub2) this).aFloat5722 = 0.6372093F;
	Class101_Sub2 class101_sub2_51_ = (Class101_Sub2) class101;
	((Class101_Sub2) this).aFloat5711
	    = ((Class101_Sub2) class101_sub2_51_).aFloat5711;
	((Class101_Sub2) this).aFloat5710 = 0.0F;
	((Class101_Sub2) this).aFloat5722
	    = ((Class101_Sub2) class101_sub2_51_).aFloat5722;
	((Class101_Sub2) this).aFloat5736
	    = ((Class101_Sub2) class101_sub2_51_).aFloat5736;
	((Class101_Sub2) this).aFloat5691
	    = ((Class101_Sub2) class101_sub2_51_).aFloat5691;
	((Class101_Sub2) this).aFloat5716
	    = ((Class101_Sub2) class101_sub2_51_).aFloat5716;
	((Class101_Sub2) this).aFloat5700
	    = ((Class101_Sub2) class101_sub2_51_).aFloat5700;
	((Class101_Sub2) this).aFloat5708
	    = ((Class101_Sub2) class101_sub2_51_).aFloat5708;
	((Class101_Sub2) this).aFloat5732
	    = ((Class101_Sub2) class101_sub2_51_).aFloat5732;
	((Class101_Sub2) this).aFloat5724 = 0.0F;
	((Class101_Sub2) this).aFloat5729 = 0.0F;
	((Class101_Sub2) this).aFloat5704
	    = ((Class101_Sub2) class101_sub2_51_).aFloat5704;
    }
    
    final void method927(Class101 class101, Class101 class101_52_) {
	try {
	    anInt5743++;
	    Class101_Sub2 class101_sub2_53_ = (Class101_Sub2) class101;
	    Class101_Sub2 class101_sub2_54_ = (Class101_Sub2) class101_52_;
	    ((Class101_Sub2) this).aFloat5711
		= ((((Class101_Sub2) class101_sub2_53_).aFloat5704
		    * ((Class101_Sub2) class101_sub2_54_).aFloat5736)
		   + ((((Class101_Sub2) class101_sub2_53_).aFloat5711
		       * ((Class101_Sub2) class101_sub2_54_).aFloat5711)
		      + (((Class101_Sub2) class101_sub2_54_).aFloat5708
			 * ((Class101_Sub2) class101_sub2_53_).aFloat5700)));
	    ((Class101_Sub2) this).aFloat5708
		= ((((Class101_Sub2) class101_sub2_53_).aFloat5722
		    * ((Class101_Sub2) class101_sub2_54_).aFloat5708)
		   + (((Class101_Sub2) class101_sub2_54_).aFloat5711
		      * ((Class101_Sub2) class101_sub2_53_).aFloat5708)
		   + (((Class101_Sub2) class101_sub2_53_).aFloat5732
		      * ((Class101_Sub2) class101_sub2_54_).aFloat5736));
	    ((Class101_Sub2) this).aFloat5736
		= ((((Class101_Sub2) class101_sub2_54_).aFloat5736
		    * ((Class101_Sub2) class101_sub2_53_).aFloat5716)
		   + ((((Class101_Sub2) class101_sub2_53_).aFloat5736
		       * ((Class101_Sub2) class101_sub2_54_).aFloat5711)
		      + (((Class101_Sub2) class101_sub2_54_).aFloat5708
			 * ((Class101_Sub2) class101_sub2_53_).aFloat5691)));
	    ((Class101_Sub2) this).aFloat5700
		= ((((Class101_Sub2) class101_sub2_54_).aFloat5691
		    * ((Class101_Sub2) class101_sub2_53_).aFloat5704)
		   + ((((Class101_Sub2) class101_sub2_54_).aFloat5722
		       * ((Class101_Sub2) class101_sub2_53_).aFloat5700)
		      + (((Class101_Sub2) class101_sub2_54_).aFloat5700
			 * ((Class101_Sub2) class101_sub2_53_).aFloat5711)));
	    ((Class101_Sub2) this).aFloat5722
		= ((((Class101_Sub2) class101_sub2_53_).aFloat5708
		    * ((Class101_Sub2) class101_sub2_54_).aFloat5700)
		   + (((Class101_Sub2) class101_sub2_54_).aFloat5722
		      * ((Class101_Sub2) class101_sub2_53_).aFloat5722)
		   + (((Class101_Sub2) class101_sub2_53_).aFloat5732
		      * ((Class101_Sub2) class101_sub2_54_).aFloat5691));
	    ((Class101_Sub2) this).aFloat5704
		= ((((Class101_Sub2) class101_sub2_53_).aFloat5700
		    * ((Class101_Sub2) class101_sub2_54_).aFloat5732)
		   + (((Class101_Sub2) class101_sub2_53_).aFloat5711
		      * ((Class101_Sub2) class101_sub2_54_).aFloat5704)
		   + (((Class101_Sub2) class101_sub2_53_).aFloat5704
		      * ((Class101_Sub2) class101_sub2_54_).aFloat5716));
	    ((Class101_Sub2) this).aFloat5691
		= ((((Class101_Sub2) class101_sub2_53_).aFloat5716
		    * ((Class101_Sub2) class101_sub2_54_).aFloat5691)
		   + ((((Class101_Sub2) class101_sub2_53_).aFloat5736
		       * ((Class101_Sub2) class101_sub2_54_).aFloat5700)
		      + (((Class101_Sub2) class101_sub2_53_).aFloat5691
			 * ((Class101_Sub2) class101_sub2_54_).aFloat5722)));
	    ((Class101_Sub2) this).aFloat5732
		= ((((Class101_Sub2) class101_sub2_53_).aFloat5708
		    * ((Class101_Sub2) class101_sub2_54_).aFloat5704)
		   + (((Class101_Sub2) class101_sub2_53_).aFloat5722
		      * ((Class101_Sub2) class101_sub2_54_).aFloat5732)
		   + (((Class101_Sub2) class101_sub2_54_).aFloat5716
		      * ((Class101_Sub2) class101_sub2_53_).aFloat5732));
	    ((Class101_Sub2) this).aFloat5729
		= (((Class101_Sub2) class101_sub2_53_).aFloat5729
		   + ((((Class101_Sub2) class101_sub2_54_).aFloat5724
		       * ((Class101_Sub2) class101_sub2_53_).aFloat5704)
		      + ((((Class101_Sub2) class101_sub2_54_).aFloat5710
			  * ((Class101_Sub2) class101_sub2_53_).aFloat5700)
			 + (((Class101_Sub2) class101_sub2_53_).aFloat5711
			    * (((Class101_Sub2) class101_sub2_54_)
			       .aFloat5729)))));
	    ((Class101_Sub2) this).aFloat5716
		= ((((Class101_Sub2) class101_sub2_53_).aFloat5691
		    * ((Class101_Sub2) class101_sub2_54_).aFloat5732)
		   + (((Class101_Sub2) class101_sub2_53_).aFloat5736
		      * ((Class101_Sub2) class101_sub2_54_).aFloat5704)
		   + (((Class101_Sub2) class101_sub2_53_).aFloat5716
		      * ((Class101_Sub2) class101_sub2_54_).aFloat5716));
	    ((Class101_Sub2) this).aFloat5710
		= (((Class101_Sub2) class101_sub2_53_).aFloat5710
		   + ((((Class101_Sub2) class101_sub2_53_).aFloat5732
		       * ((Class101_Sub2) class101_sub2_54_).aFloat5724)
		      + ((((Class101_Sub2) class101_sub2_54_).aFloat5710
			  * ((Class101_Sub2) class101_sub2_53_).aFloat5722)
			 + (((Class101_Sub2) class101_sub2_53_).aFloat5708
			    * (((Class101_Sub2) class101_sub2_54_)
			       .aFloat5729)))));
	    ((Class101_Sub2) this).aFloat5724
		= ((((Class101_Sub2) class101_sub2_53_).aFloat5691
		    * ((Class101_Sub2) class101_sub2_54_).aFloat5710)
		   + (((Class101_Sub2) class101_sub2_53_).aFloat5736
		      * ((Class101_Sub2) class101_sub2_54_).aFloat5729)
		   + (((Class101_Sub2) class101_sub2_54_).aFloat5724
		      * ((Class101_Sub2) class101_sub2_53_).aFloat5716)
		   + ((Class101_Sub2) class101_sub2_53_).aFloat5724);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("haa.HA("
					     + (class101 != null ? "{...}"
						: "null")
					     + ','
					     + (class101_52_ != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    final float[] method928(float[] fs, int i) {
	fs[13] = 0.0F;
	fs[i] = ((Class101_Sub2) this).aFloat5708;
	fs[5] = ((Class101_Sub2) this).aFloat5722;
	fs[6] = 0.0F;
	fs[3] = 0.0F;
	fs[15] = 1.0F;
	fs[4] = ((Class101_Sub2) this).aFloat5700;
	fs[14] = 0.0F;
	fs[10] = ((Class101_Sub2) this).aFloat5724;
	fs[2] = 0.0F;
	fs[0] = ((Class101_Sub2) this).aFloat5711;
	fs[7] = 0.0F;
	fs[11] = 0.0F;
	fs[12] = 0.0F;
	anInt5690++;
	fs[8] = ((Class101_Sub2) this).aFloat5729;
	fs[9] = ((Class101_Sub2) this).aFloat5710;
	return fs;
    }
    
    final float method929(float f, float f_55_, byte i, float f_56_) {
	anInt5720++;
	if (i != 45)
	    ((Class101_Sub2) this).aFloat5722 = 0.64777815F;
	return (f * ((Class101_Sub2) this).aFloat5704
		+ (f_55_ * ((Class101_Sub2) this).aFloat5700
		   + f_56_ * ((Class101_Sub2) this).aFloat5711)
		+ ((Class101_Sub2) this).aFloat5729);
    }
    
    final void method908(int i) {
	anInt5702++;
	float f = Class239_Sub4.aFloatArray5876[i & 0x3fff];
	float f_57_ = Class239_Sub4.aFloatArray5874[i & 0x3fff];
	float f_58_ = ((Class101_Sub2) this).aFloat5711;
	float f_59_ = ((Class101_Sub2) this).aFloat5700;
	float f_60_ = ((Class101_Sub2) this).aFloat5704;
	float f_61_ = ((Class101_Sub2) this).aFloat5729;
	((Class101_Sub2) this).aFloat5711
	    = f_58_ * f - ((Class101_Sub2) this).aFloat5708 * f_57_;
	((Class101_Sub2) this).aFloat5708
	    = f * ((Class101_Sub2) this).aFloat5708 + f_58_ * f_57_;
	((Class101_Sub2) this).aFloat5700
	    = f_59_ * f - ((Class101_Sub2) this).aFloat5722 * f_57_;
	((Class101_Sub2) this).aFloat5722
	    = ((Class101_Sub2) this).aFloat5722 * f + f_59_ * f_57_;
	((Class101_Sub2) this).aFloat5704
	    = f_60_ * f - f_57_ * ((Class101_Sub2) this).aFloat5732;
	((Class101_Sub2) this).aFloat5729
	    = -(f_57_ * ((Class101_Sub2) this).aFloat5710) + f * f_61_;
	((Class101_Sub2) this).aFloat5732
	    = f_57_ * f_60_ + f * ((Class101_Sub2) this).aFloat5732;
	((Class101_Sub2) this).aFloat5710
	    = f_57_ * f_61_ + ((Class101_Sub2) this).aFloat5710 * f;
    }
    
    final void method890(int[] is) {
	anInt5715++;
	float f = -((Class101_Sub2) this).aFloat5729 + (float) is[0];
	float f_62_ = (float) is[1] - ((Class101_Sub2) this).aFloat5710;
	float f_63_ = (float) is[2] - ((Class101_Sub2) this).aFloat5724;
	is[2] = (int) (f_63_ * ((Class101_Sub2) this).aFloat5716
		       + (((Class101_Sub2) this).aFloat5704 * f
			  + f_62_ * ((Class101_Sub2) this).aFloat5732));
	is[1] = (int) (((Class101_Sub2) this).aFloat5691 * f_63_
		       + (((Class101_Sub2) this).aFloat5722 * f_62_
			  + f * ((Class101_Sub2) this).aFloat5700));
	is[0] = (int) (((Class101_Sub2) this).aFloat5708 * f_62_
		       + ((Class101_Sub2) this).aFloat5711 * f
		       + f_63_ * ((Class101_Sub2) this).aFloat5736);
    }
    
    final void method897(int i, int i_64_, int i_65_, int[] is) {
	is[2] = (int) ((float) i_64_ * ((Class101_Sub2) this).aFloat5691
		       + ((Class101_Sub2) this).aFloat5736 * (float) i
		       + ((Class101_Sub2) this).aFloat5716 * (float) i_65_
		       + ((Class101_Sub2) this).aFloat5724);
	anInt5723++;
	is[1] = (int) (((Class101_Sub2) this).aFloat5732 * (float) i_65_
		       + (((Class101_Sub2) this).aFloat5722 * (float) i_64_
			  + (float) i * ((Class101_Sub2) this).aFloat5708)
		       + ((Class101_Sub2) this).aFloat5710);
	is[0] = (int) (((Class101_Sub2) this).aFloat5729
		       + (((Class101_Sub2) this).aFloat5704 * (float) i_65_
			  + ((float) i * ((Class101_Sub2) this).aFloat5711
			     + (((Class101_Sub2) this).aFloat5700
				* (float) i_64_))));
    }
    
    final void method905(int i, int i_66_, int i_67_, int[] is) {
	is[0] = (int) ((float) i * ((Class101_Sub2) this).aFloat5711
		       + ((Class101_Sub2) this).aFloat5700 * (float) i_66_
		       + (float) i_67_ * ((Class101_Sub2) this).aFloat5704);
	is[1] = (int) ((float) i_66_ * ((Class101_Sub2) this).aFloat5722
		       + ((Class101_Sub2) this).aFloat5708 * (float) i
		       + ((Class101_Sub2) this).aFloat5732 * (float) i_67_);
	anInt5741++;
	is[2] = (int) ((float) i * ((Class101_Sub2) this).aFloat5736
		       + ((Class101_Sub2) this).aFloat5691 * (float) i_66_
		       + (float) i_67_ * ((Class101_Sub2) this).aFloat5716);
    }
    
    final float[] method930(int i, float[] fs) {
	fs[7] = 0.0F;
	fs[14] = 0.0F;
	fs[8] = ((Class101_Sub2) this).aFloat5736;
	fs[6] = ((Class101_Sub2) this).aFloat5732;
	fs[4] = ((Class101_Sub2) this).aFloat5708;
	fs[2] = ((Class101_Sub2) this).aFloat5704;
	fs[11] = 0.0F;
	anInt5719++;
	fs[15] = 0.0F;
	fs[9] = ((Class101_Sub2) this).aFloat5691;
	fs[12] = 0.0F;
	fs[13] = (float) i;
	fs[3] = 0.0F;
	fs[1] = ((Class101_Sub2) this).aFloat5700;
	fs[0] = ((Class101_Sub2) this).aFloat5711;
	fs[10] = ((Class101_Sub2) this).aFloat5716;
	fs[5] = ((Class101_Sub2) this).aFloat5722;
	return fs;
    }
    
    final void method931(int i, Class101 class101) {
	anInt5730++;
	Class101_Sub2 class101_sub2_68_ = (Class101_Sub2) class101;
	((Class101_Sub2) this).aFloat5700
	    = ((Class101_Sub2) class101_sub2_68_).aFloat5708;
	((Class101_Sub2) this).aFloat5704
	    = ((Class101_Sub2) class101_sub2_68_).aFloat5736;
	((Class101_Sub2) this).aFloat5711
	    = ((Class101_Sub2) class101_sub2_68_).aFloat5711;
	((Class101_Sub2) this).aFloat5708
	    = ((Class101_Sub2) class101_sub2_68_).aFloat5700;
	((Class101_Sub2) this).aFloat5722
	    = ((Class101_Sub2) class101_sub2_68_).aFloat5722;
	((Class101_Sub2) this).aFloat5736
	    = ((Class101_Sub2) class101_sub2_68_).aFloat5704;
	((Class101_Sub2) this).aFloat5732
	    = ((Class101_Sub2) class101_sub2_68_).aFloat5691;
	((Class101_Sub2) this).aFloat5691
	    = ((Class101_Sub2) class101_sub2_68_).aFloat5732;
	if (i != -25519)
	    method932(0.19733748F, -0.027194114F, -1.3929868F, (byte) 77);
	((Class101_Sub2) this).aFloat5729
	    = -((((Class101_Sub2) this).aFloat5704
		 * ((Class101_Sub2) class101_sub2_68_).aFloat5724)
		+ ((((Class101_Sub2) class101_sub2_68_).aFloat5710
		    * ((Class101_Sub2) this).aFloat5700)
		   + (((Class101_Sub2) class101_sub2_68_).aFloat5729
		      * ((Class101_Sub2) this).aFloat5711)));
	((Class101_Sub2) this).aFloat5716
	    = ((Class101_Sub2) class101_sub2_68_).aFloat5716;
	((Class101_Sub2) this).aFloat5710
	    = -((((Class101_Sub2) class101_sub2_68_).aFloat5724
		 * ((Class101_Sub2) this).aFloat5732)
		+ ((((Class101_Sub2) this).aFloat5708
		    * ((Class101_Sub2) class101_sub2_68_).aFloat5729)
		   + (((Class101_Sub2) class101_sub2_68_).aFloat5710
		      * ((Class101_Sub2) this).aFloat5722)));
	((Class101_Sub2) this).aFloat5724
	    = -((((Class101_Sub2) class101_sub2_68_).aFloat5710
		 * ((Class101_Sub2) this).aFloat5691)
		+ (((Class101_Sub2) this).aFloat5736
		   * ((Class101_Sub2) class101_sub2_68_).aFloat5729)
		+ (((Class101_Sub2) this).aFloat5716
		   * ((Class101_Sub2) class101_sub2_68_).aFloat5724));
    }
    
    final void method896(int i) {
	anInt5725++;
	float f = Class239_Sub4.aFloatArray5876[i & 0x3fff];
	float f_69_ = Class239_Sub4.aFloatArray5874[i & 0x3fff];
	float f_70_ = ((Class101_Sub2) this).aFloat5711;
	float f_71_ = ((Class101_Sub2) this).aFloat5700;
	float f_72_ = ((Class101_Sub2) this).aFloat5704;
	((Class101_Sub2) this).aFloat5711
	    = f * f_70_ + ((Class101_Sub2) this).aFloat5736 * f_69_;
	float f_73_ = ((Class101_Sub2) this).aFloat5729;
	((Class101_Sub2) this).aFloat5736
	    = -(f_69_ * f_70_) + ((Class101_Sub2) this).aFloat5736 * f;
	((Class101_Sub2) this).aFloat5700
	    = f * f_71_ + f_69_ * ((Class101_Sub2) this).aFloat5691;
	((Class101_Sub2) this).aFloat5691
	    = -(f_69_ * f_71_) + ((Class101_Sub2) this).aFloat5691 * f;
	((Class101_Sub2) this).aFloat5704
	    = f * f_72_ + ((Class101_Sub2) this).aFloat5716 * f_69_;
	((Class101_Sub2) this).aFloat5716
	    = -(f_72_ * f_69_) + ((Class101_Sub2) this).aFloat5716 * f;
	((Class101_Sub2) this).aFloat5729
	    = f_73_ * f + f_69_ * ((Class101_Sub2) this).aFloat5724;
	((Class101_Sub2) this).aFloat5724
	    = -(f_73_ * f_69_) + f * ((Class101_Sub2) this).aFloat5724;
    }
    
    final void method932(float f, float f_74_, float f_75_, byte i) {
	((Class101_Sub2) this).aFloat5722 = f_74_;
	((Class101_Sub2) this).aFloat5704 = 0.0F;
	((Class101_Sub2) this).aFloat5700 = 0.0F;
	anInt5692++;
	((Class101_Sub2) this).aFloat5729 = 0.0F;
	((Class101_Sub2) this).aFloat5716 = f;
	((Class101_Sub2) this).aFloat5724 = 0.0F;
	((Class101_Sub2) this).aFloat5732 = 0.0F;
	((Class101_Sub2) this).aFloat5710 = 0.0F;
	if (i > -5)
	    method900(-55);
	((Class101_Sub2) this).aFloat5736 = 0.0F;
	((Class101_Sub2) this).aFloat5708 = 0.0F;
	((Class101_Sub2) this).aFloat5691 = 0.0F;
	((Class101_Sub2) this).aFloat5711 = f_75_;
    }
    
    final float method933(byte i, float f, float f_76_, float f_77_) {
	if (i != -105)
	    ((Class101_Sub2) this).aFloat5724 = -0.26493254F;
	anInt5740++;
	return (((Class101_Sub2) this).aFloat5724
		+ (((Class101_Sub2) this).aFloat5736 * f
		   + f_77_ * ((Class101_Sub2) this).aFloat5691
		   + ((Class101_Sub2) this).aFloat5716 * f_76_));
    }
    
    public Class101_Sub2() {
	method910();
    }
    
    final void method934(byte i) {
	((Class101_Sub2) this).aFloat5710 = -((Class101_Sub2) this).aFloat5710;
	if (i == 64) {
	    ((Class101_Sub2) this).aFloat5691
		= -((Class101_Sub2) this).aFloat5691;
	    ((Class101_Sub2) this).aFloat5736
		= -((Class101_Sub2) this).aFloat5736;
	    ((Class101_Sub2) this).aFloat5732
		= -((Class101_Sub2) this).aFloat5732;
	    ((Class101_Sub2) this).aFloat5724
		= -((Class101_Sub2) this).aFloat5724;
	    anInt5731++;
	    ((Class101_Sub2) this).aFloat5716
		= -((Class101_Sub2) this).aFloat5716;
	    ((Class101_Sub2) this).aFloat5708
		= -((Class101_Sub2) this).aFloat5708;
	    ((Class101_Sub2) this).aFloat5722
		= -((Class101_Sub2) this).aFloat5722;
	}
    }
    
    final void method898(Class101 class101) {
	anInt5693++;
	Class101_Sub2 class101_sub2_78_ = (Class101_Sub2) class101;
	((Class101_Sub2) this).aFloat5724
	    = ((Class101_Sub2) class101_sub2_78_).aFloat5724;
	((Class101_Sub2) this).aFloat5736
	    = ((Class101_Sub2) class101_sub2_78_).aFloat5736;
	((Class101_Sub2) this).aFloat5729
	    = ((Class101_Sub2) class101_sub2_78_).aFloat5729;
	((Class101_Sub2) this).aFloat5700
	    = ((Class101_Sub2) class101_sub2_78_).aFloat5700;
	((Class101_Sub2) this).aFloat5691
	    = ((Class101_Sub2) class101_sub2_78_).aFloat5691;
	((Class101_Sub2) this).aFloat5711
	    = ((Class101_Sub2) class101_sub2_78_).aFloat5711;
	((Class101_Sub2) this).aFloat5704
	    = ((Class101_Sub2) class101_sub2_78_).aFloat5704;
	((Class101_Sub2) this).aFloat5732
	    = ((Class101_Sub2) class101_sub2_78_).aFloat5732;
	((Class101_Sub2) this).aFloat5716
	    = ((Class101_Sub2) class101_sub2_78_).aFloat5716;
	((Class101_Sub2) this).aFloat5722
	    = ((Class101_Sub2) class101_sub2_78_).aFloat5722;
	((Class101_Sub2) this).aFloat5710
	    = ((Class101_Sub2) class101_sub2_78_).aFloat5710;
	((Class101_Sub2) this).aFloat5708
	    = ((Class101_Sub2) class101_sub2_78_).aFloat5708;
    }
    
    final void method935(float f, float f_79_, float f_80_, float f_81_,
			 float f_82_, float f_83_, float f_84_, float f_85_,
			 float f_86_, int i) {
	anInt5718++;
	((Class101_Sub2) this).aFloat5708 = f_79_;
	((Class101_Sub2) this).aFloat5716 = f;
	((Class101_Sub2) this).aFloat5700 = f_80_;
	((Class101_Sub2) this).aFloat5724 = 0.0F;
	((Class101_Sub2) this).aFloat5732 = f_85_;
	((Class101_Sub2) this).aFloat5729 = 0.0F;
	((Class101_Sub2) this).aFloat5722 = f_83_;
	((Class101_Sub2) this).aFloat5704 = f_84_;
	((Class101_Sub2) this).aFloat5710 = (float) i;
	((Class101_Sub2) this).aFloat5691 = f_82_;
	((Class101_Sub2) this).aFloat5736 = f_81_;
	((Class101_Sub2) this).aFloat5711 = f_86_;
    }
    
    final void method936(int i, int i_87_, int i_88_, float f, float f_89_,
			 float f_90_, int i_91_) {
	anInt5703++;
	if (i != i_87_) {
	    float f_92_ = Class239_Sub4.aFloatArray5876[i & 0x3fff];
	    float f_93_ = Class239_Sub4.aFloatArray5874[0x3fff & i];
	    ((Class101_Sub2) this).aFloat5711 = 2.0F * f_92_ * (float) i_91_;
	    ((Class101_Sub2) this).aFloat5710
		= (-0.5F * f_93_ - f_92_ * 0.5F) * (float) (2 * i_88_) + f_90_;
	    ((Class101_Sub2) this).aFloat5722 = (float) i_88_ * (f_92_ * 2.0F);
	    ((Class101_Sub2) this).aFloat5716 = 1.0F;
	    ((Class101_Sub2) this).aFloat5700 = -2.0F * f_93_ * (float) i_88_;
	    ((Class101_Sub2) this).aFloat5736
		= ((Class101_Sub2) this).aFloat5691
		= ((Class101_Sub2) this).aFloat5704
		= ((Class101_Sub2) this).aFloat5732 = 0.0F;
	    ((Class101_Sub2) this).aFloat5724 = f_89_;
	    ((Class101_Sub2) this).aFloat5708 = (float) i_91_ * (f_93_ * 2.0F);
	    ((Class101_Sub2) this).aFloat5729
		= f + (float) (2 * i_91_) * (0.5F * f_93_ - f_92_ * 0.5F);
	} else {
	    ((Class101_Sub2) this).aFloat5708
		= ((Class101_Sub2) this).aFloat5736
		= ((Class101_Sub2) this).aFloat5700
		= ((Class101_Sub2) this).aFloat5691
		= ((Class101_Sub2) this).aFloat5704
		= ((Class101_Sub2) this).aFloat5732 = 0.0F;
	    ((Class101_Sub2) this).aFloat5729 = f - (float) i_91_;
	    ((Class101_Sub2) this).aFloat5716 = 1.0F;
	    ((Class101_Sub2) this).aFloat5710 = (float) -i_88_ + f_90_;
	    ((Class101_Sub2) this).aFloat5711 = (float) (i_91_ * 2);
	    ((Class101_Sub2) this).aFloat5722 = (float) (2 * i_88_);
	    ((Class101_Sub2) this).aFloat5724 = f_89_;
	}
    }
    
    static {
	aClass351_5699 = new OutgoingPacket(53, -1);
	aClass114_5742 = new IncomingPacket(119, 6);
    }
}
