/* GameFont - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GameFont
{
    static int anInt4330;
    static IncomingPacket aClass114_4331 = new IncomingPacket(31, -1);
    AbstractFontRasterizer fontRasterizer;
    BitmapFont bitmapFont = null;
    static int anInt4334;
    static int anInt4335;
    static int anInt4336;
    static int connectionOpcode = -2;
    
    public static void method3458(int i) {
	if (i != 2672)
	    method3459(null, -32, 14, -44, 95);
	aClass114_4331 = null;
    }
    
    static final void method3459(Class348_Sub34 class348_sub34, int i,
				 int i_0_, int i_1_, int i_2_) {
	anInt4330++;
	long l = (long) (i_0_ << -1072233266 | i << 1409307868 | i_1_);
	Class348_Sub37 class348_sub37
	    = (Class348_Sub37) Class130.aClass356_1895.get(l);
	if (class348_sub37 == null) {
	    class348_sub37 = new Class348_Sub37();
	    Class130.aClass356_1895.putNode(l, class348_sub37);
	    ((Class348_Sub37) class348_sub37).aClass262_6998
		.addToFront(class348_sub34, -20180);
	} else {
	    ItemDefinition class213
		= ToolkitException.itemLoader.getItemDefinition(i_2_ ^ ~0x72,
							  (((Class348_Sub34)
							    class348_sub34)
							   .anInt6973));
	    int i_3_ = ((ItemDefinition) class213).anInt2819;
	    if (i_2_ == (((ItemDefinition) class213).anInt2820 ^ 0xffffffff))
		i_3_ *= 1 + ((Class348_Sub34) class348_sub34).anInt6971;
	    for (Class348_Sub34 class348_sub34_4_
		     = (Class348_Sub34) ((Class348_Sub37) class348_sub37)
					    .aClass262_6998
					    .getFirst(i_2_ + 6);
		 class348_sub34_4_ != null;
		 class348_sub34_4_
		     = (Class348_Sub34) ((Class348_Sub37) class348_sub37)
					    .aClass262_6998
					    .nextForward((byte) 34)) {
		class213
		    = (ToolkitException.itemLoader.getItemDefinition
		       (104, ((Class348_Sub34) class348_sub34_4_).anInt6973));
		int i_5_ = ((ItemDefinition) class213).anInt2819;
		if ((((ItemDefinition) class213).anInt2820 ^ 0xffffffff) == -2)
		    i_5_
			*= ((Class348_Sub34) class348_sub34_4_).anInt6971 - -1;
		if ((i_5_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff)) {
		    FileIndexRequest.chain(class348_sub34,
							 class348_sub34_4_);
		    return;
		}
	    }
	    ((Class348_Sub37) class348_sub37).aClass262_6998
		.addToFront(class348_sub34, i_2_ ^ 0x4ed2);
	}
    }
    
    GameFont(AbstractFontRasterizer class324) {
	((GameFont) this).fontRasterizer = null;
	((GameFont) this).fontRasterizer = class324;
    }
    
    GameFont(AbstractFontRasterizer class324, BitmapFont class143) {
	((GameFont) this).fontRasterizer = null;
	try {
	    ((GameFont) this).bitmapFont = class143;
	    ((GameFont) this).fontRasterizer = class324;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("el.<init>("
					     + (class324 != null ? "{...}"
						: "null")
					     + ','
					     + (class143 != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
}
