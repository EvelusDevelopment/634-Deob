/* Class127_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

final class Class127_Sub1 extends Class127
{
    static Class271 aClass271_8378;
    static int anInt8379;
    static int anInt8380;
    static int anInt8381;
    static int anInt8382;
    private int anInt8383 = 0;
    static IncomingPacket aClass114_8384 = new IncomingPacket(18, 0);
    static IncomingPacket aClass114_8385;
    static boolean aBoolean8386 = false;
    static int anInt8387;
    static int anInt8388;
    /*synthetic*/ static Class aClass8389;
    
    public final void draw(byte i, boolean bool) {
	anInt8379++;
	int i_0_
	    = ((((Class288) ((Class127) this).aClass288_4659)
		    .aClass221_4955.method1607
		(Class92.anInt1524,
		 ((Class127) this).raster.method966(), (byte) -117))
	       - -((Class288) ((Class127) this).aClass288_4659).anInt4950);
	int i_1_ = ((((Class288) ((Class127) this).aClass288_4659)
			 .aClass341_4952.method2679
		     (DirectxToolkit.anInt7666,
		      ((Class127) this).raster.method980(), 1595))
		    + ((Class288) ((Class127) this).aClass288_4659).anInt4951);
	((Class127) this).raster.method981
	    ((float) (((Class127) this).raster.method966() / 2 + i_0_),
	     (float) (((Class127) this).raster.method980() / 2 + i_1_),
	     4096, anInt8383);
	anInt8383 += ((Class288_Sub1) (Class288_Sub1)
		      ((Class127) this).aClass288_4659).anInt8577;
	if (i != -49)
	    draw((byte) -26, true);
    }
    
    static final void method1118(boolean bool, boolean bool_2_,
				 Class348_Sub41 class348_sub41, int i) {
	anInt8382++;
	int i_3_ = ((Class348_Sub41) class348_sub41).anInt7050;
	int i_4_ = (int) ((Node) class348_sub41).nodeKey;
	if (i == 2533) {
	    class348_sub41.removeNode();
	    if (bool)
		Class14.method235(i_3_, (byte) -116);
	    Class166.method1288(i ^ ~0x9e2, i_3_);
	    Widget class46 = AbstractFontRasterizer.getWidget(i_4_);
	    if (class46 != null)
		Class251.method1916(-9343, class46);
	    Class348_Sub42_Sub17.method3270((byte) 119);
	    if (!bool_2_ && (r.anInt9721 ^ 0xffffffff) != 0)
		Class239_Sub12.method1775((byte) -8, r.anInt9721, 1);
	    Class333 class333 = new Class333(Class125.aClass356_4915);
	    for (Class348_Sub41 class348_sub41_5_
		     = (Class348_Sub41) class333.method2644((byte) 123);
		 class348_sub41_5_ != null;
		 class348_sub41_5_
		     = (Class348_Sub41) class333.method2646((byte) 99)) {
		if (!class348_sub41_5_.method2712((byte) 4)) {
		    class348_sub41_5_
			= (Class348_Sub41) class333.method2644((byte) 123);
		    if (class348_sub41_5_ == null)
			break;
		}
		if (((Class348_Sub41) class348_sub41_5_).anInt7053 == 3) {
		    int i_6_ = (int) ((Node) class348_sub41_5_).nodeKey;
		    if (i_3_ == i_6_ >>> -1572345968)
			method1118(true, bool_2_, class348_sub41_5_, 2533);
		}
	    }
	}
    }
    
    Class127_Sub1(IndexLoader class45, Class288_Sub1 class288_sub1) {
	super(class45, (Class288) class288_sub1);
    }
    
    static final void method1119(boolean bool) {
	anInt8381++;
	try {
	    Method method
		= (aClass8389 != null ? aClass8389
		   : (aClass8389 = method1121("java.lang.Runtime")))
		      .getMethod("availableProcessors", new Class[0]);
	    if (bool != false)
		method1118(false, false, null, -35);
	    if (method != null) {
		try {
		    Runtime runtime = Runtime.getRuntime();
		    Integer integer = (Integer) method.invoke(runtime, null);
		    Class348_Sub40_Sub29.anInt9372 = integer.intValue();
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public static void method1120(int i) {
	aClass114_8384 = null;
	aClass271_8378 = null;
	aClass114_8385 = null;
	if (i != 1)
	    method1119(true);
    }
    
    /*synthetic*/ static Class method1121(String string) {
	try {
	    return Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	aClass114_8385 = new IncomingPacket(10, -2);
	anInt8388 = 0;
    }
}
