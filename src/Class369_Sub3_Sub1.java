/* Class369_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.ActionEvent;

final class Class369_Sub3_Sub1 extends Class369_Sub3
{
    static int anInt10173;
    static boolean aBoolean10174 = true;
    static int anInt10175;
    static int anInt10176;
    int anInt10177;
    static int anInt10178;
    
    static final void method3575(byte i, int i_0_, int i_1_, int i_2_,
				 int i_3_, int i_4_) {
	if ((Class38.anInt513 ^ 0xffffffff) <= (i_3_ ^ 0xffffffff)
	    && (Class132.anInt1910 ^ 0xffffffff) >= (i_2_ ^ 0xffffffff)) {
	    boolean bool;
	    if ((i_4_ ^ 0xffffffff) <= (Class369.anInt4960 ^ 0xffffffff)) {
		if (i_4_ <= Class113.anInt1745)
		    bool = true;
		else {
		    bool = false;
		    i_4_ = Class113.anInt1745;
		}
	    } else {
		i_4_ = Class369.anInt4960;
		bool = false;
	    }
	    boolean bool_5_;
	    if (Class369.anInt4960 > i_0_) {
		i_0_ = Class369.anInt4960;
		bool_5_ = false;
	    } else if ((i_0_ ^ 0xffffffff)
		       < (Class113.anInt1745 ^ 0xffffffff)) {
		i_0_ = Class113.anInt1745;
		bool_5_ = false;
	    } else
		bool_5_ = true;
	    if (i_3_ < Class132.anInt1910)
		i_3_ = Class132.anInt1910;
	    else
		Class135_Sub2.method1156(-27, i_0_,
					 AnimationDefinition.anIntArrayArray255[i_3_++],
					 i_4_, i_1_);
	    if ((i_2_ ^ 0xffffffff) >= (Class38.anInt513 ^ 0xffffffff))
		Class135_Sub2.method1156(-27, i_0_,
					 AnimationDefinition.anIntArrayArray255[i_2_--],
					 i_4_, i_1_);
	    else
		i_2_ = Class38.anInt513;
	    if (!bool || !bool_5_) {
		if (!bool) {
		    if (bool_5_) {
			for (int i_6_ = i_3_; i_6_ <= i_2_; i_6_++)
			    AnimationDefinition.anIntArrayArray255[i_6_][i_0_] = i_1_;
		    }
		} else {
		    for (int i_7_ = i_3_;
			 (i_2_ ^ 0xffffffff) <= (i_7_ ^ 0xffffffff); i_7_++)
			AnimationDefinition.anIntArrayArray255[i_7_][i_4_] = i_1_;
		}
	    } else {
		for (int i_8_ = i_3_;
		     (i_8_ ^ 0xffffffff) >= (i_2_ ^ 0xffffffff); i_8_++) {
		    int[] is = AnimationDefinition.anIntArrayArray255[i_8_];
		    is[i_4_] = is[i_0_] = i_1_;
		}
	    }
	}
	if (i <= 57)
	    method3578((byte) -97, null, null);
	anInt10173++;
    }
    
    static boolean method3576(boolean bool, boolean bool_9_) {
	return bool | bool_9_;
    }
    
    public final Class223 method51(byte i) {
	anInt10175++;
	if (i < 116)
	    ((Class369_Sub3_Sub1) this).anInt10177 = -10;
	return Class187.aClass223_2507;
    }
    
    static final RasterToolkit method3577(int i, byte i_10_, IndexLoader class45) {
	anInt10176++;
	RasterToolkit class105
	    = (RasterToolkit) Class345.aClass60_4273.method583((long) i, -68);
	int i_11_ = -86 / ((55 - i_10_) / 51);
	if (class105 == null) {
	    if (Class286_Sub7.aBoolean6289)
		class105
		    = Class348_Sub8.currentToolkit
			  .method3691(Sprite.loadSingleSprite(class45, i), true);
	    else
		class105
		    = Class258_Sub3.method1969(class45.method415((byte) 73, i),
					       -5901);
	    Class345.aClass60_4273.method582(class105, (long) i, (byte) -108);
	}
	return class105;
    }
    
    static final void method3578(byte i, Object object, Signlink class297) {
	do {
	    try {
		anInt10178++;
		if (((Signlink) class297).systemEventQueue != null) {
		    int i_12_ = 0;
		    if (i != -42)
			method3578((byte) 95, null, null);
		    for (/**/;
			 i_12_ < 50 && ((Signlink) class297)
					   .systemEventQueue
					   .peekEvent() != null;
			 i_12_++)
			Class286_Sub5.method2161((byte) 30, 1L);
		    try {
			if (object == null)
			    break;
			((Signlink) class297).systemEventQueue
			    .postEvent(new ActionEvent(object, 1001, "dummy"));
		    } catch (Exception exception) {
			/* empty */
		    }
		    break;
		}
		break;
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("fu.F(" + i + ','
						 + (object != null ? "{...}"
						    : "null")
						 + ','
						 + (class297 != null ? "{...}"
						    : "null")
						 + ')'));
	    }
	} while (false);
    }
    
    Class369_Sub3_Sub1(Class221 class221, Class341 class341, int i, int i_13_,
		       int i_14_, int i_15_, int i_16_, int i_17_, int i_18_,
		       int i_19_, int i_20_, int i_21_, int i_22_, int i_23_,
		       int i_24_, int i_25_) {
	super(class221, class341, i, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_,
	      i_19_, i_20_, i_21_, i_22_, i_23_, i_24_);
	try {
	    ((Class369_Sub3_Sub1) this).anInt10177 = i_25_;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("fu.<init>(" + (class221 != null ? "{...}" : "null")
			+ ',' + (class341 != null ? "{...}" : "null") + ',' + i
			+ ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_
			+ ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_
			+ ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_
			+ ',' + i_25_ + ')'));
	}
    }
}
