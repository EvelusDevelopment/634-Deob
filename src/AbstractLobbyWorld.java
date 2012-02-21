/* AbstractLobbyWorld - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.lang.reflect.Field;

abstract class AbstractLobbyWorld
{
    static int anInt1699;
    static short aShort1700 = 256;
    static int anInt1701;
    static IncomingPacket aClass114_1702;
    static int anInt1703;
    int amountPlayers;
    static int anInt1705;
    static RasterToolkit aClass105_1706;
    static int anInt1707;
    int settings;
    static int anInt1709;
    static int anInt1710;
    int location;
    static boolean aBoolean1712 = false;
    /*synthetic*/ static Class aClass1713;
    /*synthetic*/ static Class aClass1714;
    
    final boolean method1029(boolean bool) {
	anInt1707++;
	if (bool != true)
	    aBoolean1712 = false;
	if ((((AbstractLobbyWorld) this).settings & 0x1 ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
    
    public static void method1030(int i) {
	aClass114_1702 = null;
	aClass105_1706 = null;
	if (i > -19)
	    readClassCheckPacket(-89, null, null, -72);
    }
    
    final boolean method1031(int i) {
	int i_0_ = 101 / ((54 - i) / 47);
	anInt1699++;
	if ((0x4 & ((AbstractLobbyWorld) this).settings) == 0)
	    return false;
	return true;
    }
    
    static final int method1032(int i) {
	anInt1701++;
	int i_1_ = 0;
	if (i != -1)
	    readClassCheckPacket(117, null, null, 29);
	Field[] fields = (aClass1713 != null ? aClass1713
			  : (aClass1713 = method1037("Class348_Sub51")))
			     .getDeclaredFields();
	Field[] fields_2_ = fields;
	for (int i_3_ = 0;
	     (i_3_ ^ 0xffffffff) > (fields_2_.length ^ 0xffffffff); i_3_++) {
	    Field field = fields_2_[i_3_];
	    if ((aClass1714 != null ? aClass1714
		 : (aClass1714 = method1037("Class239")))
		    .isAssignableFrom(field.getType()))
		i_1_++;
	}
	return i_1_ - -1;
    }
    
    final boolean method1033(int i) {
	anInt1703++;
	int i_4_ = -62 % ((i - -5) / 47);
	if ((0x8 & ((AbstractLobbyWorld) this).settings ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
    
    static final void readClassCheckPacket(int i, ByteBuffer buffer,
				 Signlink signlink, int i_5_) {
	try {
	    anInt1710++;
	    Class348_Sub48 class348_sub48 = new Class348_Sub48();
	    ((Class348_Sub48) class348_sub48).anInt7126 = buffer.getUByte();
	    ((Class348_Sub48) class348_sub48).anInt7130 = buffer.getDWord();
	    ((Class348_Sub48) class348_sub48).anIntArray7132 = new int[((Class348_Sub48) class348_sub48).anInt7126];
	    ((Class348_Sub48) class348_sub48).aByteArrayArrayArray7128 = new byte[((Class348_Sub48) class348_sub48).anInt7126][][];
	    ((Class348_Sub48) class348_sub48).aClass144Array7127 = new SignlinkRequest[((Class348_Sub48) class348_sub48).anInt7126];
	    if (i_5_ > 90) {
		((Class348_Sub48) class348_sub48).aClass144Array7135
		    = (new SignlinkRequest
		       [((Class348_Sub48) class348_sub48).anInt7126]);
		((Class348_Sub48) class348_sub48).anIntArray7131
		    = new int[((Class348_Sub48) class348_sub48).anInt7126];
		((Class348_Sub48) class348_sub48).anIntArray7136
		    = new int[((Class348_Sub48) class348_sub48).anInt7126];
		for (int i_6_ = 0;
		     i_6_ < ((Class348_Sub48) class348_sub48).anInt7126;
		     i_6_++) {
		    try {
			int i_7_ = buffer.getUByte();
			if ((i_7_ ^ 0xffffffff) != -1
			    && (i_7_ ^ 0xffffffff) != -2
			    && (i_7_ ^ 0xffffffff) != -3) {
			    if (i_7_ == 3 || i_7_ == 4) {
				String string
				    = buffer.getJStr();
				String string_8_
				    = buffer.getJStr();
				int i_9_ = buffer.getUByte();
				String[] strings = new String[i_9_];
				for (int i_10_ = 0; i_9_ > i_10_; i_10_++)
				    strings[i_10_]
					= buffer
					      .getJStr();
				byte[][] is = new byte[i_9_][];
				if (i_7_ == 3) {
				    for (int i_11_ = 0; i_11_ < i_9_;
					 i_11_++) {
					int i_12_
					    = buffer
						  .getDWord();
					is[i_11_] = new byte[i_12_];
					buffer.getBytes(is[i_11_], 0, i_12_);
				    }
				}
				((Class348_Sub48) class348_sub48)
				    .anIntArray7132[i_6_]
				    = i_7_;
				Class[] var_classes = new Class[i_9_];
				for (int i_13_ = 0;
				     ((i_9_ ^ 0xffffffff)
				      < (i_13_ ^ 0xffffffff));
				     i_13_++)
				    var_classes[i_13_]
					= (Class348_Sub40_Sub1.method3052
					   (11012, strings[i_13_]));
				((Class348_Sub48) class348_sub48)
				    .aClass144Array7127[i_6_]
				    = (signlink.method2230
				       (var_classes, 76,
					Class348_Sub40_Sub1.method3052(11012,
								       string),
					string_8_));
				((Class348_Sub48) class348_sub48)
				    .aByteArrayArrayArray7128[i_6_]
				    = is;
			    }
			} else {
			    String string
				= buffer.getJStr();
			    String string_14_
				= buffer.getJStr();
			    int i_15_ = 0;
			    if ((i_7_ ^ 0xffffffff) == -2)
				i_15_ = buffer.getDWord();
			    ((Class348_Sub48) class348_sub48)
				.anIntArray7132[i_6_]
				= i_7_;
			    ((Class348_Sub48) class348_sub48)
				.anIntArray7136[i_6_]
				= i_15_;
			    ((Class348_Sub48) class348_sub48)
				.aClass144Array7135[i_6_]
				= (signlink.method2243
				   (0, string_14_,
				    Class348_Sub40_Sub1.method3052(11012,
								   string)));
			}
		    } catch (ClassNotFoundException classnotfoundexception) {
			((Class348_Sub48) class348_sub48).anIntArray7131[i_6_]
			    = -1;
		    } catch (SecurityException securityexception) {
			((Class348_Sub48) class348_sub48).anIntArray7131[i_6_]
			    = -2;
		    } catch (NullPointerException nullpointerexception) {
			((Class348_Sub48) class348_sub48).anIntArray7131[i_6_]
			    = -3;
		    } catch (Exception exception) {
			((Class348_Sub48) class348_sub48).anIntArray7131[i_6_]
			    = -4;
		    } catch (Throwable throwable) {
			((Class348_Sub48) class348_sub48).anIntArray7131[i_6_]
			    = -5;
		    }
		}
		Class348_Sub35.aClass262_6978.addToFront(class348_sub48, -20180);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("mr.E(" + i + ','
					     + (buffer != null
						? "{...}" : "null")
					     + ','
					     + (signlink != null ? "{...}"
						: "null")
					     + ',' + i_5_ + ')'));
	}
    }
    
    static final AbstractImageFetcher method1035(int i, int i_16_, Canvas canvas,
					   int i_17_) {
	anInt1705++;
	if (i != 9029)
	    return null;
	try {
	    Class var_class = Class.forName("Class348_Sub31_Sub1");
	    AbstractImageFetcher class348_sub31
		= (AbstractImageFetcher) var_class.newInstance();
	    class348_sub31.initialize(canvas, i_17_, -90, i_16_);
	    return class348_sub31;
	} catch (Throwable throwable) {
	    GraphicsFetcher class348_sub31_sub2
		= new GraphicsFetcher();
	    class348_sub31_sub2.initialize(canvas, i_17_, -128, i_16_);
	    return class348_sub31_sub2;
	}
    }
    
    final boolean method1036(byte i) {
	anInt1709++;
	if (i != -35)
	    readClassCheckPacket(11, null, null, -12);
	if ((((AbstractLobbyWorld) this).settings & 0x2) == 0)
	    return false;
	return true;
    }
    
    public AbstractLobbyWorld() {
	/* empty */
    }
    
    /*synthetic*/ static Class method1037(String string) {
	try {
	    return Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	aClass114_1702 = new IncomingPacket(24, 6);
    }
}
