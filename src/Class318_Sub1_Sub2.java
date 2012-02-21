/* Class318_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class318_Sub1_Sub2 extends Class318_Sub1
{
    static int anInt8729;
    static int anInt8730;
    static int anInt8731;
    static Cache aClass60_8732 = new Cache(64);
    static int anInt8733;
    static int anInt8734;
    static int anInt8735;
    static int anInt8736;
    static Class70 aClass70_8737 = new Class70();
    static int anInt8738;
    
    static final void writeScriptSettings(int i) {
	anInt8729++;
	FileOnDisk class234 = null;
	try {
	    class234 = Signlink.method2231("2", -1141472112);
	    ByteBuffer class348_sub49
		= new ByteBuffer(3 + 6 * Class335.amountActiveCsVars);
	    class348_sub49.putByte(1);
	    class348_sub49.putShort(Class335.amountActiveCsVars);
	    int i_0_ = -4 % ((-12 - i) / 38);
	    for (int varId = 0; ((ISAAC.globalScriptIntVars.length ^ 0xffffffff)
				< (varId ^ 0xffffffff)); varId++) {
		if (Class286_Sub6.isCsVariableActive[varId]) {
		    class348_sub49.putShort(varId);
		    class348_sub49.putInt(ISAAC.globalScriptIntVars[varId]);
		}
	    }
	    class234.write((byte) 117, 0,
				((ByteBuffer) class348_sub49).position,
				(((ByteBuffer) class348_sub49)
				 .payload));
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (class234 != null)
		class234.method1657(false);
	} catch (Exception exception) {
	    /* empty */
	}
	Class34.aLong482 = Class62.getCurrentTimeMillis();
	Class184.aBoolean2469 = false;
    }
    
    final boolean method2382(byte i) {
	if (i > -51)
	    return false;
	anInt8733++;
	Class148 class148
	    = ModernLoadingScreen.method1449(((Class318_Sub1) this).aByte6381,
				  (((Class318_Sub1) this).anInt6377
				   >> Class362.anInt4459),
				  (((Class318_Sub1) this).anInt6388
				   >> Class362.anInt4459));
	if (class148 == null
	    || !((Class318_Sub1_Sub3)
		 ((Class148) class148).aClass318_Sub1_Sub3_2040).aBoolean8741)
	    return aa_Sub2.method164(((Class318_Sub1) this).aByte6381,
				     (((Class318_Sub1) this).anInt6377
				      >> Class362.anInt4459),
				     (byte) -97,
				     (((Class318_Sub1) this).anInt6388
				      >> Class362.anInt4459));
	return (Class125.method1110
		(((Class318_Sub1) this).anInt6388 >> Class362.anInt4459,
		 ((Class148) class148).aClass318_Sub1_Sub3_2040
		     .method2394(true) + this.method2394(true),
		 ((Class318_Sub1) this).aByte6381, (byte) -79,
		 ((Class318_Sub1) this).anInt6377 >> Class362.anInt4459));
    }
    
    final boolean method2378(int i) {
	if (i != 0)
	    method2406(79);
	anInt8734++;
	return (Class99.aBooleanArrayArray1572
		[(Class318_Sub1_Sub4_Sub1.anInt10084
		  + -Class239_Sub25.anInt6111
		  + (((Class318_Sub1) this).anInt6377 >> Class362.anInt4459))]
		[(Class318_Sub1_Sub4_Sub1.anInt10084
		  + (-Class285_Sub2.anInt8502
		     + (((Class318_Sub1) this).anInt6388
			>> Class362.anInt4459)))]);
    }
    
    final void method2392(boolean bool) {
	if (bool != true)
	    anInt8731 = 119;
	anInt8730++;
	throw new IllegalStateException();
    }
    
    public static void method2406(int i) {
	if (i > -126)
	    anInt8731 = 118;
	aClass60_8732 = null;
	aClass70_8737 = null;
    }
    
    final int method2384(Class348_Sub1[] class348_sub1s, int i) {
	anInt8735++;
	int i_2_ = -79 % ((-14 - i) / 61);
	return this.method2390(class348_sub1s,
			       (((Class318_Sub1) this).anInt6377
				>> Class362.anInt4459),
			       -2,
			       (((Class318_Sub1) this).anInt6388
				>> Class362.anInt4459));
    }
    
    final boolean method2388(int i) {
	if (i > -65)
	    anInt8731 = -84;
	anInt8738++;
	return false;
    }
    
    final void method2380(AbstractToolkit var_ha, int i, boolean bool,
			  Class318_Sub1 class318_sub1, int i_3_, byte i_4_,
			  int i_5_) {
	try {
	    if (i_4_ > -106)
		writeScriptSettings(-8);
	    anInt8736++;
	    throw new IllegalStateException();
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("fha.N("
					     + (var_ha != null ? "{...}"
						: "null")
					     + ',' + i + ',' + bool + ','
					     + (class318_sub1 != null ? "{...}"
						: "null")
					     + ',' + i_3_ + ',' + i_4_ + ','
					     + i_5_ + ')'));
	}
    }
    
    Class318_Sub1_Sub2(int i, int i_6_, int i_7_, int i_8_, int i_9_) {
	((Class318_Sub1) this).anInt6377 = i;
	((Class318_Sub1) this).aByte6381 = (byte) i_8_;
	((Class318_Sub1) this).anInt6382 = i_6_;
	((Class318_Sub1) this).aByte6376 = (byte) i_9_;
	((Class318_Sub1) this).anInt6388 = i_7_;
    }
}
