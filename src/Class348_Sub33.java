/* Class348_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class Class348_Sub33 extends Node
{
    boolean[] aBooleanArray6954;
    static Class152 aClass152_6955 = new Class152();
    static int anInt6956;
    int[] anIntArray6957;
    int anInt6958;
    int[][] anIntArrayArray6959;
    int[] anIntArray6960;
    static int anInt6961;
    static byte[][][] aByteArrayArrayArray6962;
    static long aLong6963 = 0L;
    static int anInt6964;
    int anInt6965;
    static long aLong6966;
    static int gameLanguage = 0;
    
    public static void method3024(int i) {
	aClass152_6955 = null;
	if (i >= -74)
	    gameLanguage = 12;
	aByteArrayArrayArray6962 = null;
    }
    
    static final void method3025(byte i,
				 GameBuffer class348_sub49_sub2) {
	anInt6961++;
	Class348_Sub48 class348_sub48
	    = (Class348_Sub48) Class348_Sub35.aClass262_6978.getFirst(4);
	if (class348_sub48 != null) {
	    boolean bool = false;
	    for (int i_0_ = 0;
		 i_0_ < ((Class348_Sub48) class348_sub48).anInt7126; i_0_++) {
		if (((Class348_Sub48) class348_sub48).aClass144Array7135[i_0_]
		    != null) {
		    if (((((Class348_Sub48) class348_sub48).aClass144Array7135
			  [i_0_].state)
			 ^ 0xffffffff)
			== -3)
			((Class348_Sub48) class348_sub48).anIntArray7131[i_0_]
			    = -5;
		    if (((((Class348_Sub48) class348_sub48).aClass144Array7135
			  [i_0_].state)
			 ^ 0xffffffff)
			== -1)
			bool = true;
		}
		if (((Class348_Sub48) class348_sub48).aClass144Array7127[i_0_]
		    != null) {
		    if (((((Class348_Sub48) class348_sub48).aClass144Array7127
			  [i_0_].state)
			 ^ 0xffffffff)
			== -3)
			((Class348_Sub48) class348_sub48).anIntArray7131[i_0_]
			    = -6;
		    if ((((Class348_Sub48) class348_sub48).aClass144Array7127
			 [i_0_].state)
			== 0)
			bool = true;
		}
	    }
	    if (i < 37)
		aLong6966 = -3L;
	    if (!bool) {
		int i_1_ = ((ByteBuffer) class348_sub49_sub2).position;
		class348_sub49_sub2.putInt(((Class348_Sub48)
						class348_sub48).anInt7130);
		for (int i_2_ = 0;
		     ((((Class348_Sub48) class348_sub48).anInt7126
		       ^ 0xffffffff)
		      < (i_2_ ^ 0xffffffff));
		     i_2_++) {
		    if (((Class348_Sub48) class348_sub48).anIntArray7131[i_2_]
			!= 0)
			class348_sub49_sub2.putByte((((Class348_Sub48)
							 class348_sub48)
							.anIntArray7131
							[i_2_]));
		    else {
			try {
			    int i_3_ = (((Class348_Sub48) class348_sub48)
					.anIntArray7132[i_2_]);
			    if ((i_3_ ^ 0xffffffff) != -1) {
				if ((i_3_ ^ 0xffffffff) == -2) {
				    Field field
					= ((Field)
					   (((Class348_Sub48) class348_sub48)
					    .aClass144Array7135[i_2_]
					    .returnObj));
				    field.setInt(null,
						 (((Class348_Sub48)
						   class348_sub48)
						  .anIntArray7136[i_2_]));
				    class348_sub49_sub2.putByte(0);
				} else if (i_3_ == 2) {
				    Field field
					= ((Field)
					   (((Class348_Sub48) class348_sub48)
					    .aClass144Array7135[i_2_]
					    .returnObj));
				    int i_4_ = field.getModifiers();
				    class348_sub49_sub2.putByte(0);
				    class348_sub49_sub2.putInt(i_4_);
				}
			    } else {
				Field field
				    = ((Field)
				       (((Class348_Sub48) class348_sub48)
					.aClass144Array7135[i_2_]
					.returnObj));
				int i_5_ = field.getInt(null);
				class348_sub49_sub2.putByte(0);
				class348_sub49_sub2.putInt(i_5_);
			    }
			    if (i_3_ == 3) {
				Method method
				    = ((Method)
				       (((Class348_Sub48) class348_sub48)
					.aClass144Array7127[i_2_]
					.returnObj));
				byte[][] is
				    = (((Class348_Sub48) class348_sub48)
				       .aByteArrayArrayArray7128[i_2_]);
				Object[] objects = new Object[is.length];
				for (int i_6_ = 0; is.length > i_6_; i_6_++) {
				    ObjectInputStream objectinputstream
					= (new ObjectInputStream
					   (new ByteArrayInputStream(is
								     [i_6_])));
				    objects[i_6_]
					= objectinputstream.readObject();
				}
				Object object = method.invoke(null, objects);
				if (object != null) {
				    if (object instanceof Number) {
					class348_sub49_sub2.putByte(1);
					class348_sub49_sub2.putLong
					    (((Number) object).longValue());
				    } else if (!(object instanceof String))
					class348_sub49_sub2.putByte(4);
				    else {
					class348_sub49_sub2.putByte(2);
					class348_sub49_sub2.putJStr
					    ((byte) -5, (String) object);
				    }
				} else
				    class348_sub49_sub2.putByte(0);
			    } else if (i_3_ == 4) {
				Method method
				    = ((Method)
				       (((Class348_Sub48) class348_sub48)
					.aClass144Array7127[i_2_]
					.returnObj));
				int i_7_ = method.getModifiers();
				class348_sub49_sub2.putByte(0);
				class348_sub49_sub2.putInt(i_7_);
			    }
			} catch (ClassNotFoundException classnotfoundexception) {
			    class348_sub49_sub2.putByte(-10);
			} catch (java.io.InvalidClassException invalidclassexception) {
			    class348_sub49_sub2.putByte(-11);
			} catch (java.io.StreamCorruptedException streamcorruptedexception) {
			    class348_sub49_sub2.putByte(-12);
			} catch (java.io.OptionalDataException optionaldataexception) {
			    class348_sub49_sub2.putByte(-13);
			} catch (IllegalAccessException illegalaccessexception) {
			    class348_sub49_sub2.putByte(-14);
			} catch (IllegalArgumentException illegalargumentexception) {
			    class348_sub49_sub2.putByte(-15);
			} catch (java.lang.reflect.InvocationTargetException invocationtargetexception) {
			    class348_sub49_sub2.putByte(-16);
			} catch (SecurityException securityexception) {
			    class348_sub49_sub2.putByte(-17);
			} catch (java.io.IOException ioexception) {
			    class348_sub49_sub2.putByte(-18);
			} catch (NullPointerException nullpointerexception) {
			    class348_sub49_sub2.putByte(-19);
			} catch (Exception exception) {
			    class348_sub49_sub2.putByte(-20);
			} catch (Throwable throwable) {
			    class348_sub49_sub2.putByte(-21);
			}
		    }
		}
		class348_sub49_sub2.method3344(i_1_, false);
		class348_sub48.removeNode();
	    }
	}
    }
    
    Class348_Sub33(int i, byte[] is) {
	((Class348_Sub33) this).anInt6958 = i;
	ByteBuffer class348_sub49 = new ByteBuffer(is);
	((Class348_Sub33) this).anInt6965 = class348_sub49.getUByte();
	((Class348_Sub33) this).anIntArrayArray6959
	    = new int[((Class348_Sub33) this).anInt6965][];
	((Class348_Sub33) this).anIntArray6957
	    = new int[((Class348_Sub33) this).anInt6965];
	((Class348_Sub33) this).anIntArray6960
	    = new int[((Class348_Sub33) this).anInt6965];
	((Class348_Sub33) this).aBooleanArray6954
	    = new boolean[((Class348_Sub33) this).anInt6965];
	for (int i_8_ = 0; ((((Class348_Sub33) this).anInt6965 ^ 0xffffffff)
			    < (i_8_ ^ 0xffffffff)); i_8_++) {
	    ((Class348_Sub33) this).anIntArray6957[i_8_]
		= class348_sub49.getUByte();
	    if (((Class348_Sub33) this).anIntArray6957[i_8_] == 6)
		((Class348_Sub33) this).anIntArray6957[i_8_] = 2;
	}
	for (int i_9_ = 0; ((((Class348_Sub33) this).anInt6965 ^ 0xffffffff)
			    < (i_9_ ^ 0xffffffff)); i_9_++)
	    ((Class348_Sub33) this).aBooleanArray6954[i_9_]
		= (class348_sub49.getUByte() ^ 0xffffffff) == -2;
	for (int i_10_ = 0; ((((Class348_Sub33) this).anInt6965 ^ 0xffffffff)
			     < (i_10_ ^ 0xffffffff)); i_10_++)
	    ((Class348_Sub33) this).anIntArray6960[i_10_]
		= class348_sub49.getShort();
	for (int i_11_ = 0;
	     ((i_11_ ^ 0xffffffff)
	      > (((Class348_Sub33) this).anInt6965 ^ 0xffffffff));
	     i_11_++)
	    ((Class348_Sub33) this).anIntArrayArray6959[i_11_]
		= new int[class348_sub49.getUByte()];
	for (int i_12_ = 0; i_12_ < ((Class348_Sub33) this).anInt6965;
	     i_12_++) {
	    for (int i_13_ = 0;
		 (i_13_
		  < ((Class348_Sub33) this).anIntArrayArray6959[i_12_].length);
		 i_13_++)
		((Class348_Sub33) this).anIntArrayArray6959[i_12_][i_13_]
		    = class348_sub49.getUByte();
	}
    }
    
    static {
	aLong6966 = 0L;
    }
}
