/* Class348_Sub40_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class348_Sub40_Sub17 extends Class348_Sub40
{
    int[] anIntArray9232;
    static int anInt9233;
    static OutgoingPacket aClass351_9234 = new OutgoingPacket(67, -1);
    static int anInt9235;
    static int anInt9236;
    int anInt9237;
    static int anInt9238;
    static int anInt9239;
    static Deque aClass262_9240 = new Deque();
    int anInt9241;
    static boolean aBoolean9242;
    private int anInt9243 = -1;
    
    final boolean method3090(boolean bool) {
	anInt9235++;
	if (bool != true)
	    return true;
	if (((Class348_Sub40_Sub17) this).anIntArray9232 != null)
	    return true;
	if ((anInt9243 ^ 0xffffffff) <= -1) {
	    Sprite class207
		= ((Class101_Sub2.anInt5713 ^ 0xffffffff) <= -1
		   ? Sprite.loadSingleSprite(Node.aClass45_4286,
					 Class101_Sub2.anInt5713, anInt9243)
		   : Sprite.loadSingleSprite(Node.aClass45_4286, anInt9243));
	    class207.method1524();
	    ((Class348_Sub40_Sub17) this).anIntArray9232
		= class207.toPixelArray();
	    ((Class348_Sub40_Sub17) this).anInt9237
		= ((Sprite) class207).indexWidth;
	    ((Class348_Sub40_Sub17) this).anInt9241
		= ((Sprite) class207).indexHeight;
	    return true;
	}
	return false;
    }
    
    public Class348_Sub40_Sub17() {
	super(0, false);
    }
    
    final void method3049(ByteBuffer class348_sub49, int i, int i_0_) {
	if (i_0_ == 31015) {
	    if (i == 0)
		anInt9243 = class348_sub49.getShort();
	    anInt9236++;
	}
    }
    
    final int method3037(int i) {
	anInt9233++;
	if (i > -113)
	    aBoolean9242 = false;
	return anInt9243;
    }
    
    final void method3046(byte i) {
	super.method3046((byte) -112);
	if (i < -102) {
	    anInt9238++;
	    ((Class348_Sub40_Sub17) this).anIntArray9232 = null;
	}
    }
    
    int[][] method3047(int i, int i_1_) {
	anInt9239++;
	if (i_1_ != -1564599039)
	    method3047(8, -86);
	int[][] is
	    = ((Class348_Sub40) this).aClass322_7033.method2557(-108, i);
	if (((Class322) ((Class348_Sub40) this).aClass322_7033).aBoolean4035
	    && method3090(true)) {
	    int[] is_2_ = is[0];
	    int[] is_3_ = is[1];
	    int[] is_4_ = is[2];
	    int i_5_ = (((Class348_Sub40_Sub17) this).anInt9237
			* (((Class286_Sub2.anInt6212 ^ 0xffffffff)
			    != (((Class348_Sub40_Sub17) this).anInt9241
				^ 0xffffffff))
			   ? (((Class348_Sub40_Sub17) this).anInt9241 * i
			      / Class286_Sub2.anInt6212)
			   : i));
	    if (Class348_Sub40_Sub6.anInt9139
		== ((Class348_Sub40_Sub17) this).anInt9237) {
		for (int i_6_ = 0;
		     ((i_6_ ^ 0xffffffff)
		      > (Class348_Sub40_Sub6.anInt9139 ^ 0xffffffff));
		     i_6_++) {
		    int i_7_
			= ((Class348_Sub40_Sub17) this).anIntArray9232[i_5_++];
		    is_4_[i_6_]
			= Class139.method1166(4080, i_7_ << 1154281412);
		    is_3_[i_6_]
			= Class139.method1166(65280, i_7_) >> 1238793732;
		    is_2_[i_6_] = Class139.method1166(4080, i_7_ >> 812723916);
		}
	    } else {
		for (int i_8_ = 0;
		     ((i_8_ ^ 0xffffffff)
		      > (Class348_Sub40_Sub6.anInt9139 ^ 0xffffffff));
		     i_8_++) {
		    int i_9_ = (((Class348_Sub40_Sub17) this).anInt9237 * i_8_
				/ Class348_Sub40_Sub6.anInt9139);
		    int i_10_ = (((Class348_Sub40_Sub17) this).anIntArray9232
				 [i_9_ + i_5_]);
		    is_4_[i_8_]
			= Class139.method1166(i_10_, 255) << -1837452316;
		    is_3_[i_8_]
			= Class139.method1166(i_10_ >> -2005178940, 4080);
		    is_2_[i_8_]
			= Class139.method1166(i_10_, 16711680) >> 77341932;
		}
	    }
	}
	return is;
    }
    
    public static void method3091(boolean bool) {
	aClass351_9234 = null;
	aClass262_9240 = null;
	if (bool != true)
	    method3091(false);
    }
}
