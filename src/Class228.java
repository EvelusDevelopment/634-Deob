/* Class228 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

final class Class228
{
    static int anInt2971;
    static IncomingPacket aClass114_2972 = new IncomingPacket(49, 4);
    static int anInt2973;
    static Class57[] aClass57Array2974;
    static int anInt2975;
    
    public static void method1628(byte i) {
	aClass57Array2974 = null;
	if (i <= 47)
	    aClass57Array2974 = null;
	aClass114_2972 = null;
    }
    
    static final boolean method1629(boolean bool) {
	anInt2973++;
	Hashtable hashtable = new Hashtable();
	Enumeration enumeration
	    = Player.aHashtable10565.keys();
	while (enumeration.hasMoreElements()) {
	    Object object = enumeration.nextElement();
	    hashtable.put(object, Player
				      .aHashtable10565.get(object));
	}
	try {
	    Class var_class
		= Class.forName("java.lang.reflect.AccessibleObject");
	    Class var_class_0_ = Class.forName("java.lang.ClassLoader");
	    Field field = var_class_0_.getDeclaredField("nativeLibraries");
	    if (bool != true)
		return false;
	    Method method
		= var_class.getDeclaredMethod("setAccessible",
					      new Class[] { Boolean.TYPE });
	    method.invoke(field, new Object[] { Boolean.TRUE });
	    try {
		enumeration
		    = Player.aHashtable10565.keys();
		while (enumeration.hasMoreElements()) {
		    String string = (String) enumeration.nextElement();
		    try {
			File file = (File) Class275.nativeLibraries.get(string);
			Class var_class_1_
			    = (Class) Player
					  .aHashtable10565.get(string);
			Vector vector
			    = ((Vector)
			       field.get(var_class_1_.getClassLoader()));
			for (int i = 0;
			     (vector.size() ^ 0xffffffff) < (i ^ 0xffffffff);
			     i++) {
			    try {
				Object object = vector.elementAt(i);
				Field field_2_ = object.getClass()
						     .getDeclaredField("name");
				method.invoke(field_2_,
					      new Object[] { Boolean.TRUE });
				try {
				    String string_3_
					= (String) field_2_.get(object);
				    if (string_3_ != null
					&& (string_3_.equalsIgnoreCase
					    (file.getCanonicalPath()))) {
					Field field_4_
					    = object.getClass()
						  .getDeclaredField("handle");
					Method method_5_
					    = (object.getClass()
						   .getDeclaredMethod
					       ("finalize", new Class[0]));
					method.invoke(field_4_,
						      (new Object[]
						       { Boolean.TRUE }));
					method.invoke(method_5_,
						      (new Object[]
						       { Boolean.TRUE }));
					try {
					    method_5_.invoke(object,
							     new Object[0]);
					    field_4_.set(object,
							 new Integer(0));
					    hashtable.remove(string);
					} catch (Throwable throwable) {
					    /* empty */
					}
					method.invoke(method_5_,
						      (new Object[]
						       { Boolean.FALSE }));
					method.invoke(field_4_,
						      (new Object[]
						       { Boolean.FALSE }));
				    }
				} catch (Throwable throwable) {
				    /* empty */
				}
				method.invoke(field_2_,
					      new Object[] { Boolean.FALSE });
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    method.invoke(field, new Object[] { Boolean.FALSE });
	} catch (Throwable throwable) {
	    /* empty */
	}
	Player.aHashtable10565 = hashtable;
	return Player.aHashtable10565.isEmpty();
    }
    
    static final void method1630(int i, int i_6_, int i_7_) {
	if (!(Class75.aFloat1249 > Class75.aFloat1247)) {
	    if (Class75.aFloat1247 > Class75.aFloat1249) {
		Class75.aFloat1247 -= (double) Class75.aFloat1247 / 30.0;
		if (Class75.aFloat1249 > Class75.aFloat1247)
		    Class75.aFloat1247 = Class75.aFloat1249;
		Class348_Sub15.method2811(false);
		Class75.anInt1255 = (int) Class75.aFloat1247 >> -1950894367;
		Class75.aByteArrayArrayArray1251
		    = Class325.method2596(Class75.anInt1255, i + 12871);
	    }
	} else {
	    Class75.aFloat1247 += (double) Class75.aFloat1247 / 30.0;
	    if (Class75.aFloat1249 < Class75.aFloat1247)
		Class75.aFloat1247 = Class75.aFloat1249;
	    Class348_Sub15.method2811(false);
	    Class75.anInt1255 = (int) Class75.aFloat1247 >> 1963656225;
	    Class75.aByteArrayArrayArray1251
		= Class325.method2596(Class75.anInt1255, 12871);
	}
	anInt2971++;
	if (i != (TextureLoader.anInt4609 ^ 0xffffffff)
	    && (Class48.anInt859 ^ 0xffffffff) != 0) {
	    int i_8_ = TextureLoader.anInt4609 - InterfaceScript.anInt6992;
	    if (i_8_ < 2 || i_8_ > 2)
		i_8_ /= 8;
	    int i_9_ = -Class245.anInt3170 + Class48.anInt859;
	    InterfaceScript.anInt6992 = i_8_ + InterfaceScript.anInt6992;
	    if (i_9_ < 2 || i_9_ > 2)
		i_9_ /= 8;
	    Class245.anInt3170 -= -i_9_;
	    if ((i_8_ ^ 0xffffffff) == -1 && i_9_ == 0) {
		TextureLoader.anInt4609 = -1;
		Class48.anInt859 = -1;
	    }
	    Class348_Sub15.method2811(false);
	}
	if (Class367_Sub9.anInt7379 > 0) {
	    Class164.anInt2173--;
	    if ((Class164.anInt2173 ^ 0xffffffff) == -1) {
		Class367_Sub9.anInt7379--;
		Class164.anInt2173 = 100;
	    }
	} else {
	    Class34.anInt481 = -1;
	    Class348_Sub40_Sub30.anInt9399 = -1;
	}
	if (Class246.aBoolean3174 && Class289.aClass262_3705 != null) {
	    for (Class348_Sub12 class348_sub12
		     = (Class348_Sub12) Class289.aClass262_3705.getFirst(4);
		 class348_sub12 != null;
		 class348_sub12
		     = ((Class348_Sub12)
			Class289.aClass262_3705.nextForward((byte) 116))) {
		Class42 class42
		    = (Class75.aClass153_1238.method1225
		       (((Class348_Sub21) (((Class348_Sub12) class348_sub12)
					   .aClass348_Sub21_6751)).anInt6847,
			(byte) 125));
		if (class348_sub12.method2799(i_6_, i_7_, 95)) {
		    if (((Class42) class42).aStringArray577 != null) {
			if (((Class42) class42).aStringArray577[4] != null)
			    Class50_Sub3.method466
				(false, ((Class42) class42).aString565, 0,
				 (byte) -100, false,
				 ((Class42) class42).anInt596, -1, true, 1006,
				 (long) ((Class348_Sub21)
					 (((Class348_Sub12) class348_sub12)
					  .aClass348_Sub21_6751)).anInt6847,
				 ((Class42) class42).aStringArray577[4],
				 (long) ((Class348_Sub21)
					 (((Class348_Sub12) class348_sub12)
					  .aClass348_Sub21_6751)).anInt6847,
				 -1);
			if (((Class42) class42).aStringArray577[3] != null)
			    Class50_Sub3.method466
				(false, ((Class42) class42).aString565, 0,
				 (byte) -127, false,
				 ((Class42) class42).anInt596, -1, true, 1003,
				 (long) ((Class348_Sub21)
					 (((Class348_Sub12) class348_sub12)
					  .aClass348_Sub21_6751)).anInt6847,
				 ((Class42) class42).aStringArray577[3],
				 (long) ((Class348_Sub21)
					 (((Class348_Sub12) class348_sub12)
					  .aClass348_Sub21_6751)).anInt6847,
				 -1);
			if (((Class42) class42).aStringArray577[2] != null)
			    Class50_Sub3.method466
				(false, ((Class42) class42).aString565, 0,
				 (byte) -108, false,
				 ((Class42) class42).anInt596, -1, true, 1002,
				 (long) ((Class348_Sub21)
					 (((Class348_Sub12) class348_sub12)
					  .aClass348_Sub21_6751)).anInt6847,
				 ((Class42) class42).aStringArray577[2],
				 (long) ((Class348_Sub21)
					 (((Class348_Sub12) class348_sub12)
					  .aClass348_Sub21_6751)).anInt6847,
				 -1);
			if (((Class42) class42).aStringArray577[1] != null)
			    Class50_Sub3.method466
				(false, ((Class42) class42).aString565, 0,
				 (byte) -69, false,
				 ((Class42) class42).anInt596, -1, true, 1012,
				 (long) ((Class348_Sub21)
					 (((Class348_Sub12) class348_sub12)
					  .aClass348_Sub21_6751)).anInt6847,
				 ((Class42) class42).aStringArray577[1],
				 (long) ((Class348_Sub21)
					 (((Class348_Sub12) class348_sub12)
					  .aClass348_Sub21_6751)).anInt6847,
				 -1);
			if (((Class42) class42).aStringArray577[0] != null)
			    Class50_Sub3.method466
				(false, ((Class42) class42).aString565, 0,
				 (byte) -92, false,
				 ((Class42) class42).anInt596, -1, true, 1009,
				 (long) ((Class348_Sub21)
					 (((Class348_Sub12) class348_sub12)
					  .aClass348_Sub21_6751)).anInt6847,
				 ((Class42) class42).aStringArray577[0],
				 (long) ((Class348_Sub21)
					 (((Class348_Sub12) class348_sub12)
					  .aClass348_Sub21_6751)).anInt6847,
				 -1);
		    }
		    if (!((Class348_Sub21) (((Class348_Sub12) class348_sub12)
					    .aClass348_Sub21_6751))
			 .aBoolean6848) {
			((Class348_Sub21) (((Class348_Sub12) class348_sub12)
					   .aClass348_Sub21_6751)).aBoolean6848
			    = true;
			ScriptExecutor.method701(Class90.aClass273_1512,
					  ((Class348_Sub21)
					   (((Class348_Sub12) class348_sub12)
					    .aClass348_Sub21_6751)).anInt6847,
					  ((Class42) class42).anInt596);
		    }
		    if (((Class348_Sub21) (((Class348_Sub12) class348_sub12)
					   .aClass348_Sub21_6751))
			.aBoolean6848)
			ScriptExecutor.method701(Class59_Sub1_Sub2.aClass273_8664,
					  ((Class348_Sub21)
					   (((Class348_Sub12) class348_sub12)
					    .aClass348_Sub21_6751)).anInt6847,
					  ((Class42) class42).anInt596);
		} else if (((Class348_Sub21) (((Class348_Sub12) class348_sub12)
					      .aClass348_Sub21_6751))
			   .aBoolean6848) {
		    ((Class348_Sub21) (((Class348_Sub12) class348_sub12)
				       .aClass348_Sub21_6751)).aBoolean6848
			= false;
		    ScriptExecutor.method701(ISAAC.aClass273_1298,
				      ((Class348_Sub21)
				       (((Class348_Sub12) class348_sub12)
					.aClass348_Sub21_6751)).anInt6847,
				      ((Class42) class42).anInt596);
		}
	    }
	}
    }
}
