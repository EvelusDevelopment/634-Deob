/* Class347 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class347
{
    static boolean aBoolean4278 = true;
    int anInt4279;
    static int anInt4280;
    static byte[][] aByteArrayArray4281;
    int anInt4282;
    int anInt4283;
    static boolean aBoolean4284 = false;
    
    public Class347() {
	/* empty */
    }
    
    public static void method2707(boolean bool) {
	aByteArrayArray4281 = null;
	if (bool != false)
	    method2708(57);
    }
    
    static final void method2708(int i) {
	Class251.method1916(-9343, Class289.aClass46_3701);
	anInt4280++;
	Class318_Sub1.anInt6392++;
	if (!Class50_Sub1.aBoolean5221 || !Class127_Sub1.aBoolean8386) {
	    if ((Class318_Sub1.anInt6392 ^ 0xffffffff) < -2)
		Class289.aClass46_3701 = null;
	} else {
	    int i_0_ = 0;
	    int i_1_ = 0;
	    if (Class59_Sub1.aBoolean5300) {
		i_0_ = s_Sub3.method4008((byte) -124);
		i_1_ = Class16.method260(false);
	    }
	    int i_2_ = i_0_ + Class258_Sub4.mouseMovementListener.method3597(true);
	    int i_3_
		= i_1_ + Class258_Sub4.mouseMovementListener.method3594((byte) 80);
	    i_3_ -= Class219.anInt2872;
	    i_2_ -= Class318_Sub4.anInt6411;
	    if (i_2_ < Class348_Sub40_Sub37.anInt9461)
		i_2_ = Class348_Sub40_Sub37.anInt9461;
	    if (i == -30206) {
		if (i_2_ - -((Widget) Class289.aClass46_3701).anInt709
		    > (Class348_Sub40_Sub37.anInt9461
		       - -((Widget) Class331.aClass46_4130).anInt709))
		    i_2_
			= (((Widget) Class331.aClass46_4130).anInt709
			   + (Class348_Sub40_Sub37.anInt9461
			      + -((Widget) Class289.aClass46_3701).anInt709));
		if (i_3_ < Class40.anInt558)
		    i_3_ = Class40.anInt558;
		if (((Widget) Class289.aClass46_3701).anInt789 + i_3_
		    > (Class40.anInt558
		       - -((Widget) Class331.aClass46_4130).anInt789))
		    i_3_
			= (-((Widget) Class289.aClass46_3701).anInt789
			   + (Class40.anInt558
			      - -((Widget) Class331.aClass46_4130).anInt789));
		int i_4_
		    = (-Class348_Sub40_Sub37.anInt9461
		       + (i_2_
			  - -((Widget) Class331.aClass46_4130).anInt747));
		int i_5_
		    = (-Class40.anInt558
		       + (i_3_ + ((Widget) Class331.aClass46_4130).anInt755));
		if (!Class258_Sub4.mouseMovementListener.method3593(94)) {
		    if (!Class300.aBoolean3819) {
			if (((Class318_Sub1_Sub5.anInt8770 ^ 0xffffffff) == -2
			     || Class318_Sub1_Sub5.method2485(-113))
			    && (FileArchiveTracker.anInt4776 ^ 0xffffffff) < -3)
			    Class5_Sub2.method191(true,
						  (NativeToolkit.anInt8001
						   + Class318_Sub4.anInt6411),
						  (Class219.anInt2872
						   - -(Class348_Sub40_Sub13
						       .anInt9203)));
			else if (Class101_Sub1.method913((byte) 127))
			    Class5_Sub2.method191(true,
						  (NativeToolkit.anInt8001
						   + Class318_Sub4.anInt6411),
						  (Class219.anInt2872
						   + (Class348_Sub40_Sub13
						      .anInt9203)));
		    } else {
			Class341.method2678(-2049);
			if (((Widget) Class289.aClass46_3701).anObjectArray692
			    != null) {
			    InterfaceScript class348_sub36
				= new InterfaceScript();
			    ((InterfaceScript) class348_sub36).aClass46_6983
				= Class318_Sub1_Sub3_Sub4.aClass46_10336;
			    ((InterfaceScript) class348_sub36).anInt6984 = i_4_;
			    ((InterfaceScript) class348_sub36).parameters
				= (((Widget) Class289.aClass46_3701)
				   .anObjectArray692);
			    ((InterfaceScript) class348_sub36).anInt6995 = i_5_;
			    ((InterfaceScript) class348_sub36).parent
				= Class289.aClass46_3701;
			    ScriptExecutor.executeScript(class348_sub36);
			}
			if (Class318_Sub1_Sub3_Sub4.aClass46_10336 != null
			    && (Main.method108(Class289.aClass46_3701)
				!= null))
			    Class2.method173(-67, Class289.aClass46_3701,
					     (Class318_Sub1_Sub3_Sub4
					      .aClass46_10336));
		    }
		    Class289.aClass46_3701 = null;
		} else {
		    if (((Widget) Class289.aClass46_3701).anInt703
			< Class318_Sub1.anInt6392) {
			int i_6_ = i_2_ + -NativeToolkit.anInt8001;
			int i_7_ = -Class348_Sub40_Sub13.anInt9203 + i_3_;
			if (((Widget) Class289.aClass46_3701).anInt729 < i_6_
			    || (-((Widget) Class289.aClass46_3701).anInt729
				> i_6_)
			    || (i_7_
				> ((Widget) Class289.aClass46_3701).anInt729)
			    || (-((Widget) Class289.aClass46_3701).anInt729
				^ 0xffffffff) < (i_7_ ^ 0xffffffff))
			    Class300.aBoolean3819 = true;
		    }
		    if ((((Widget) Class289.aClass46_3701).anObjectArray823
			 != null)
			&& Class300.aBoolean3819) {
			InterfaceScript class348_sub36 = new InterfaceScript();
			((InterfaceScript) class348_sub36).parent
			    = Class289.aClass46_3701;
			((InterfaceScript) class348_sub36).anInt6984 = i_4_;
			((InterfaceScript) class348_sub36).parameters
			    = (((Widget) Class289.aClass46_3701)
			       .anObjectArray823);
			((InterfaceScript) class348_sub36).anInt6995 = i_5_;
			ScriptExecutor.executeScript(class348_sub36);
		    }
		}
	    }
	}
    }
}
