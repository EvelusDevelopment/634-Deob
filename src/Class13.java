/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

final class Class13
{
    static int anInt219;
    static IncomingPacket aClass114_220 = new IncomingPacket(40, -1);
    static int anInt221;
    static int[] anIntArray222;
    static ArchiveLoader[] indexLoaders = new ArchiveLoader[37];
    static int[] anIntArray224;
    
    public static void method225(byte i) {
	if (i > 54) {
	    aClass114_220 = null;
	    anIntArray224 = null;
	    anIntArray222 = null;
	    indexLoaders = null;
	}
    }
    
    static final void method226(int i, int i_0_, int i_1_, int i_2_,
				int i_3_) {
	for (int i_4_ = i_2_; Class348_Sub38.anInt7008 > i_4_; i_4_++) {
	    Rectangle rectangle = Class180.aRectangleArray2371[i_4_];
	    if ((rectangle.width + rectangle.x ^ 0xffffffff) < (i ^ 0xffffffff)
		&& (rectangle.x ^ 0xffffffff) > (i_0_ + i ^ 0xffffffff)
		&& ((rectangle.y - -rectangle.height ^ 0xffffffff)
		    < (i_1_ ^ 0xffffffff))
		&& rectangle.y < i_1_ + i_3_)
		Class152.aBooleanArray2076[i_4_] = true;
	}
	anInt219++;
	Class338.method2663(i_2_ + -5590, i, i - -i_0_, i_1_, i_3_ + i_1_);
    }
    
    static final void method227(Class318_Sub1 class318_sub1, boolean bool,
				boolean bool_5_) {
	((Class318_Sub1) class318_sub1).aBoolean6391 = bool_5_;
	if (Class348_Sub40_Sub5.aBoolean9121) {
	    if (bool)
		GfxLoader.aClass315Array3982
		    [GfxLoader.aClass315Array3982.length - 1]
		    .method2353(class318_sub1, false);
	    else {
		int i
		    = Class286_Sub4.method2154(((Class318_Sub1) class318_sub1)
					       .anInt6386);
		int i_6_ = (ColorNode.anIntArray4906[2]
			    * class318_sub1.method2379(-25675)
			    / ((Class318_Sub1) class318_sub1).anInt6389);
		int i_7_
		    = Class286_Sub4.method2154((((Class318_Sub1) class318_sub1)
						.anInt6386) - i_6_);
		int i_8_
		    = Class286_Sub4.method2154((((Class318_Sub1) class318_sub1)
						.anInt6386) + i_6_);
		if (i_7_ == i_8_)
		    GfxLoader.aClass315Array3982[i].method2353(class318_sub1,
							      false);
		else if (i_8_ - i_7_ == 1)
		    GfxLoader.aClass315Array3982
			[Class75_Sub1.anInt5652 + i_7_]
			.method2353(class318_sub1, false);
		else
		    GfxLoader.aClass315Array3982
			[GfxLoader.aClass315Array3982.length - 1]
			.method2353(class318_sub1, false);
	    }
	} else
	    Class38.method365(class318_sub1, Class115.aClass348_Sub1Array1752);
    }
    
    static {
	anIntArray222 = new int[3];
	anIntArray224 = new int[250];
    }
}
