/* i - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class i extends AnimatableToolkit implements ModelToolkit
{
    private SafeToolkit anOa5117;
    Class342[] aClass342Array5118;
    long nativeid;
    Class129[] aClass129Array5119;
    private ya aYa5120;
    
    final native void C(int i);
    
    final native void k(int i);
    
    public final native void w(boolean bool);
    
    final native void O(int i, int i_0_, int i_1_);
    
    final native void s(int i);
    
    final native void LA(int i);
    
    final native int fa();
    
    final native boolean NA();
    
    final native boolean F();
    
    final native void ZA(i var_i_2_, i var_i_3_, int i, boolean bool,
			 boolean bool_4_);
    
    final void method613(AnimatableToolkit class64, int i, int i_5_, int i_6_,
			 boolean bool) {
	anOa5117.method3973().method144(this, class64, i, i_5_, i_6_, bool);
    }
    
    final native void aa(short i, short i_7_);
    
    final boolean method623(int i, int i_8_, Class101 class101, boolean bool,
			    int i_9_, int i_10_) {
	return anOa5117.method3973().method143(this, i, i_8_, class101, bool,
					       i_10_);
    }
    
    final native int EA();
    
    final Class129[] method619() {
	return ((i) this).aClass129Array5119;
    }
    
    final native void wa();
    
    final native void P(int i, int i_11_, int i_12_, int i_13_);
    
    final void method608(Class101 class101, Class318_Sub3 class318_sub3, int i,
			 int i_14_) {
	if (class318_sub3 == null)
	    anOa5117.method3973().method149(this, class101, null, i, i_14_);
	else {
	    SafeToolkit.anIntArray5132[5] = 0;
	    anOa5117.method3973().method149(this, class101, SafeToolkit.anIntArray5132,
					    i, i_14_);
	    ((Class318_Sub3) class318_sub3).anInt6405 = SafeToolkit.anIntArray5132[0];
	    ((Class318_Sub3) class318_sub3).anInt6402 = SafeToolkit.anIntArray5132[1];
	    ((Class318_Sub3) class318_sub3).anInt6406 = SafeToolkit.anIntArray5132[2];
	    ((Class318_Sub3) class318_sub3).anInt6404 = SafeToolkit.anIntArray5132[3];
	    ((Class318_Sub3) class318_sub3).anInt6403 = SafeToolkit.anIntArray5132[4];
	    ((Class318_Sub3) class318_sub3).aBoolean6401
		= SafeToolkit.anIntArray5132[5] != 0;
	}
    }
    
    final native void v();
    
    private final native void l(long l, int i, int[] is, int i_15_, int i_16_,
				int i_17_, int i_18_, boolean bool);
    
    final boolean method618() {
	return true;
    }
    
    final void method621() {
	if (((SafeToolkit) anOa5117).anInt5141 > 1) {
	    synchronized (this) {
		((AnimatableToolkit) this).aBoolean1124 = false;
		this.notifyAll();
	    }
	}
    }
    
    final native void VA(int i);
    
    final boolean method628(int i, int i_19_, Class101 class101, boolean bool,
			    int i_20_) {
	return anOa5117.method3973().method146(this, i, i_19_, class101, bool);
    }
    
    final AnimatableToolkit method614(byte i, int i_21_, boolean bool) {
	return anOa5117.method3973().method152(this, i, i_21_, bool);
    }
    
    final native int na();
    
    final native int HA();
    
    final void method612() {
	/* empty */
    }
    
    final native void p(int i, int i_22_, s var_s, s var_s_23_, int i_24_,
			int i_25_, int i_26_);
    
    final native int V();
    
    final native int da();
    
    final void method605(int i, int[] is, int i_27_, int i_28_, int i_29_,
			 int i_30_, boolean bool) {
	l(((i) this).nativeid, i, is, i_27_, i_28_, i_29_, i_30_, bool);
    }
    
    final native int G();
    
    final native int ma();
    
    private final native void R
	(SafeToolkit var_oa, ya var_ya, int i, int i_31_, int[] is, int[] is_32_,
	 int[] is_33_, int[] is_34_, short[] is_35_, int i_36_, short[] is_37_,
	 short[] is_38_, short[] is_39_, byte[] is_40_, byte[] is_41_,
	 byte[] is_42_, byte[] is_43_, short[] is_44_, short[] is_45_,
	 int[] is_46_, byte i_47_, short[] is_48_, int i_49_, byte[] is_50_,
	 short[] is_51_, short[] is_52_, short[] is_53_, int[] is_54_,
	 int[] is_55_, int[] is_56_, byte[] is_57_, byte[] is_58_,
	 int[] is_59_, int[] is_60_, int[] is_61_, int[] is_62_, int i_63_,
	 int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int[] is_69_);
    
    final native void FA(int i);
    
    final void method624(int i, int i_70_, int i_71_, int i_72_) {
	/* empty */
    }
    
    final native void ia(short i, short i_73_);
    
    protected final void finalize() {
	if (((i) this).nativeid != 0L)
	    Class257.method1947(0, this);
    }
    
    final native int WA();
    
    final void method610(Class101 class101, int i, boolean bool) {
	A(((ja) (ja) class101).nativeid, i, bool);
    }
    
    final void method622() {
	if (((SafeToolkit) anOa5117).anInt5141 > 1) {
	    synchronized (this) {
		while (((AnimatableToolkit) this).aBoolean1124) {
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		((AnimatableToolkit) this).aBoolean1124 = true;
	    }
	}
    }
    
    final void method615(Class101 class101, Class318_Sub3 class318_sub3,
			 int i) {
	if (class318_sub3 == null)
	    anOa5117.method3973().method145(this, class101, null, i);
	else {
	    SafeToolkit.anIntArray5132[5] = 0;
	    anOa5117.method3973().method145(this, class101, SafeToolkit.anIntArray5132,
					    i);
	    ((Class318_Sub3) class318_sub3).anInt6405 = SafeToolkit.anIntArray5132[0];
	    ((Class318_Sub3) class318_sub3).anInt6402 = SafeToolkit.anIntArray5132[1];
	    ((Class318_Sub3) class318_sub3).anInt6406 = SafeToolkit.anIntArray5132[2];
	    ((Class318_Sub3) class318_sub3).anInt6404 = SafeToolkit.anIntArray5132[3];
	    ((Class318_Sub3) class318_sub3).anInt6403 = SafeToolkit.anIntArray5132[4];
	    ((Class318_Sub3) class318_sub3).aBoolean6401
		= SafeToolkit.anIntArray5132[5] != 0;
	}
    }
    
    final native boolean r();
    
    final void method620(Class101 class101) {
	method693(SafeToolkit.anIntArray5140, class101);
	int i = 0;
	if (((i) this).aClass129Array5119 != null) {
	    for (int i_74_ = 0; i_74_ < ((i) this).aClass129Array5119.length;
		 i_74_++) {
		Class129 class129 = ((i) this).aClass129Array5119[i_74_];
		((Class129) class129).anInt1882 = SafeToolkit.anIntArray5140[i++];
		((Class129) class129).anInt1891 = SafeToolkit.anIntArray5140[i++];
		((Class129) class129).anInt1889 = SafeToolkit.anIntArray5140[i++];
		((Class129) class129).anInt1883 = SafeToolkit.anIntArray5140[i++];
		((Class129) class129).anInt1890 = SafeToolkit.anIntArray5140[i++];
		((Class129) class129).anInt1880 = SafeToolkit.anIntArray5140[i++];
		((Class129) class129).anInt1876 = SafeToolkit.anIntArray5140[i++];
		((Class129) class129).anInt1874 = SafeToolkit.anIntArray5140[i++];
		((Class129) class129).anInt1884 = SafeToolkit.anIntArray5140[i++];
	    }
	}
	if (((i) this).aClass342Array5118 != null) {
	    for (int i_75_ = 0; i_75_ < ((i) this).aClass342Array5118.length;
		 i_75_++) {
		Class342 class342 = ((i) this).aClass342Array5118[i_75_];
		Class342 class342_76_ = class342;
		if (((Class342) class342).aClass342_4248 != null)
		    class342_76_ = ((Class342) class342).aClass342_4248;
		if (((Class342) class342).aClass101_4252 != null)
		    ((Class342) class342).aClass101_4252.method898(class101);
		else
		    ((Class342) class342).aClass101_4252
			= class101.method907();
		((Class342) class342_76_).anInt4238 = SafeToolkit.anIntArray5140[i++];
		((Class342) class342_76_).anInt4239 = SafeToolkit.anIntArray5140[i++];
		((Class342) class342_76_).anInt4240 = SafeToolkit.anIntArray5140[i++];
	    }
	}
    }
    
    final native void a(int i);
    
    final Class342[] method604() {
	return ((i) this).aClass342Array5118;
    }
    
    private final void method693(int[] is, Class101 class101) {
	anOa5117.method3973().method151(this, is, class101);
    }
    
    final native int ua();
    
    final native void H(int i, int i_77_, int i_78_);
    
    i(SafeToolkit var_oa, ya var_ya, Model class124, int i, int i_79_, int i_80_,
      int i_81_) {
	anOa5117 = var_oa;
	aYa5120 = var_ya;
	((i) this).aClass129Array5119
	    = ((Model) class124).aClass129Array1846;
	((i) this).aClass342Array5118
	    = ((Model) class124).aClass342Array1866;
	int i_82_ = (((Model) class124).aClass129Array1846 == null ? 0
		     : ((Model) class124).aClass129Array1846.length);
	int i_83_ = (((Model) class124).aClass342Array1866 == null ? 0
		     : ((Model) class124).aClass342Array1866.length);
	int i_84_ = 0;
	int[] is = new int[i_82_ * 3 + i_83_];
	for (int i_85_ = 0; i_85_ < i_82_; i_85_++) {
	    is[i_84_++]
		= ((Class129) ((i) this).aClass129Array5119[i_85_]).anInt1881;
	    is[i_84_++]
		= ((Class129) ((i) this).aClass129Array5119[i_85_]).anInt1877;
	    is[i_84_++]
		= ((Class129) ((i) this).aClass129Array5119[i_85_]).anInt1892;
	}
	for (int i_86_ = 0; i_86_ < i_83_; i_86_++)
	    is[i_84_++]
		= ((Class342) ((i) this).aClass342Array5118[i_86_]).anInt4244;
	int i_87_ = (((Model) class124).polygons == null ? 0
		     : ((Model) class124).polygons.length);
	int[] is_88_ = new int[i_87_ * 8];
	int i_89_ = 0;
	for (int i_90_ = 0; i_90_ < i_87_; i_90_++) {
	    ModelPolygon class162
		= ((Model) class124).polygons[i_90_];
	    Class189 class189
		= FileArchiveTracker.method742(104, ((ModelPolygon) class162).x);
	    is_88_[i_89_++] = ((ModelPolygon) class162).alpha;
	    is_88_[i_89_++] = ((Class189) class189).anInt2526;
	    is_88_[i_89_++] = ((Class189) class189).anInt2530;
	    is_88_[i_89_++] = ((Class189) class189).anInt2525;
	    is_88_[i_89_++] = ((Class189) class189).anInt2533;
	    is_88_[i_89_++] = ((Class189) class189).anInt2534;
	    is_88_[i_89_++] = ((Class189) class189).aBoolean2531 ? -1 : 0;
	}
	for (int i_91_ = 0; i_91_ < i_87_; i_91_++) {
	    ModelPolygon class162
		= ((Model) class124).polygons[i_91_];
	    is_88_[i_89_++] = ((ModelPolygon) class162).tGroup;
	}
	R(anOa5117, aYa5120, ((Model) class124).vertices,
	  ((Model) class124).anInt1821,
	  ((Model) class124).vertexX,
	  ((Model) class124).vertexY,
	  ((Model) class124).vertexZ,
	  ((Model) class124).vgroups,
	  ((Model) class124).aShortArray1842,
	  ((Model) class124).triangles,
	  ((Model) class124).aShortArray1863,
	  ((Model) class124).aShortArray1835,
	  ((Model) class124).aShortArray1855,
	  ((Model) class124).aByteArray1843,
	  ((Model) class124).aByteArray1839,
	  ((Model) class124).polyAlphas,
	  ((Model) class124).aByteArray1820,
	  ((Model) class124).triangleColors,
	  ((Model) class124).aShortArray1822,
	  ((Model) class124).anIntArray1824,
	  ((Model) class124).aByte1851,
	  ((Model) class124).aShortArray1856,
	  ((Model) class124).anInt1818,
	  ((Model) class124).aByteArray1823,
	  ((Model) class124).aShortArray1829,
	  ((Model) class124).aShortArray1849,
	  ((Model) class124).aShortArray1825,
	  ((Model) class124).anIntArray1859,
	  ((Model) class124).anIntArray1816,
	  ((Model) class124).anIntArray1844,
	  ((Model) class124).aByteArray1833,
	  ((Model) class124).aByteArray1853,
	  ((Model) class124).anIntArray1867,
	  ((Model) class124).anIntArray1857,
	  ((Model) class124).anIntArray1865, is, i_82_, i_83_, i, i_79_,
	  i_80_, i_81_, is_88_);
    }
    
    private final native void A(long l, int i, boolean bool);
    
    final native r ba(r var_r);
    
    private final native void oa(SafeToolkit var_oa);
    
    i(SafeToolkit var_oa) {
	anOa5117 = var_oa;
	aYa5120 = null;
	oa(var_oa);
    }
    
    final native int RA();
    
    final native void I(int i, int[] is, int i_92_, int i_93_, int i_94_,
			boolean bool, int i_95_, int[] is_96_);
}
