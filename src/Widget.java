/* Widget - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Widget
{
    Object[] anObjectArray671;
    int anInt672;
    int anInt673 = 0;
    int anInt674;
    int anInt675;
    boolean aBoolean676;
    int[] anIntArray677;
    int anInt678 = 2;
    Object[] scriptParameters;
    Object[] anObjectArray680;
    byte aByte681;
    boolean aBoolean682;
    Object[] anObjectArray683;
    static int anInt684;
    Object[] anObjectArray685;
    int[] configScriptTriggers;
    Object[] anObjectArray687;
    int anInt688 = 0;
    boolean aBoolean689;
    int anInt690;
    static int anInt691;
    Object[] anObjectArray692;
    int anInt693;
    static int anInt694;
    int anInt695;
    int anInt696 = 0;
    boolean aBoolean697;
    int anInt698;
    int anInt699;
    int anInt700;
    Object[] anObjectArray701;
    int bitmapFontId = -1;
    int anInt703;
    int anInt704;
    int anInt705;
    int[] anIntArray706;
    int[] anIntArray707;
    Object[] anObjectArray708;
    int anInt709;
    int anInt710;
    private HashTable aClass356_711;
    static int anInt712;
    int anInt713;
    Object[] anObjectArray714;
    int anInt715;
    int anInt716;
    int anInt717;
    static int anInt718;
    int anInt719;
    boolean aBoolean720;
    String aString721;
    static int anInt722;
    int anInt723;
    byte aByte724;
    int anInt725;
    int anInt726;
    Object[] anObjectArray727;
    int anInt728;
    int anInt729;
    int anInt730;
    int[] anIntArray731;
    int anInt732;
    int anInt733;
    Object[] anObjectArray734;
    boolean aBoolean735;
    static int anInt736;
    boolean aBoolean737;
    int anInt738;
    int anInt739;
    Class318_Sub10 aClass318_Sub10_740;
    Object[] anObjectArray741;
    Object[] anObjectArray742;
    static int anInt743;
    boolean aBoolean744;
    boolean aBoolean745;
    byte[] aByteArray746;
    int anInt747;
    Class348_Sub44 aClass348_Sub44_748;
    int textColor;
    int anInt750;
    Object[] anObjectArray751;
    String aString752;
    int anInt753;
    boolean aBoolean754;
    int anInt755;
    int id;
    int anInt757;
    static int anInt758;
    int anInt759;
    int anInt760;
    Object[] anObjectArray761;
    int anInt762;
    Object[] anObjectArray763;
    Object[] logicCycleScriptParameters;
    int anInt765;
    static int anInt766;
    static int anInt767;
    static int anInt768;
    boolean aBoolean769;
    int anInt770;
    int[] anIntArray771;
    int[] anIntArray772;
    int anInt773;
    int type;
    int anInt775;
    boolean aBoolean776;
    Object[] configTriggeredScriptParameters;
    byte aByte778;
    int anInt779;
    String aString780;
    int anInt781;
    Widget aClass46_782;
    static int anInt783;
    boolean aBoolean784;
    Object[] anObjectArray785;
    int anInt786;
    int anInt787;
    int anInt788;
    int anInt789;
    boolean aBoolean790;
    int anInt791;
    String text;
    boolean aBoolean793;
    int anInt794;
    int anInt795;
    int anInt796;
    int anInt797;
    Widget[] children;
    int anInt799;
    int anInt800;
    int[] anIntArray801;
    static int anInt802;
    Object[] anObjectArray803;
    static int anInt804;
    Object[] anObjectArray805;
    int anInt806;
    Object[] anObjectArray807;
    int anInt808;
    int anInt809;
    boolean aBoolean810;
    Object[] anObjectArray811;
    int itemId;
    boolean aBoolean813;
    int anInt814;
    Object[] anObjectArray815;
    String aString816;
    byte aByte817;
    int[] anIntArray818;
    static int anInt819;
    Object[] anObjectArray820;
    static byte[] aByteArray821 = new byte[32896];
    Object[] anObjectArray822;
    Object[] anObjectArray823;
    int anInt824;
    static int anInt825;
    int anInt826;
    static int anInt827;
    int anInt828;
    static int anInt829;
    int anInt830;
    int[] anIntArray831;
    byte[] aByteArray832;
    String[] aStringArray833;
    int anInt834;
    int anInt835;
    Object[] anObjectArray836;
    static int anInt837;
    static Class196 aClass196_838;
    Object[] anObjectArray839;
    Object[] anObjectArray840;
    int anInt841;
    int anInt842;
    
    static final void method424(int i, int i_0_, AbstractToolkit var_ha, int i_1_, int i_2_,
				int i_3_, int i_4_, byte[][][] is, int i_5_,
				int i_6_, int i_7_, int i_8_, int i_9_) {
	try {
	    anInt768++;
	    if (i_7_ != i_1_ && i_3_ != 0) {
		if ((i_7_ ^ 0xffffffff) == -10) {
		    i_7_ = 1;
		    i_4_ = i_4_ - -1 & 0x3;
		}
		if (i_7_ == 10) {
		    i_4_ = 3 + i_4_ & 0x3;
		    i_7_ = 1;
		}
		if ((i_7_ ^ 0xffffffff) == -12) {
		    i_4_ = i_4_ + 3 & 0x3;
		    i_7_ = 8;
		}
		var_ha.drawBitmapQuad(i_6_, i_9_, i_5_, i_8_, i_0_, i, is[i_7_ - 1][i_4_],
			 i_3_, i_2_);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("at.S(" + i + ',' + i_0_ + ','
					     + (var_ha != null ? "{...}"
						: "null")
					     + ',' + i_1_ + ',' + i_2_ + ','
					     + i_3_ + ',' + i_4_ + ','
					     + (is != null ? "{...}" : "null")
					     + ',' + i_5_ + ',' + i_6_ + ','
					     + i_7_ + ',' + i_8_ + ',' + i_9_
					     + ')'));
	}
    }
    
    final aa method425(AbstractToolkit var_ha, byte i) {
	anInt767++;
	aa var_aa = (aa) Class239_Sub24.aClass60_6096
			     .method583((long) ((Widget) this).anInt830, 119);
	if (var_aa != null)
	    return var_aa;
	Sprite class207 = Sprite.loadSingleSprite(Class318_Sub1_Sub3.widgetSpriteIndexLoader, ((Widget) this).id, 0);
	if (class207 == null)
	    return null;
	int totalWidth = (((Sprite) class207).widthOffset + (((Sprite) class207).indexWidth + ((Sprite) class207).widthPadding));
	int totalHeight = (((Sprite) class207).heightOffset + (((Sprite) class207).indexHeight + ((Sprite) class207).heightPadding));
	((Widget) this).anIntArray772 = new int[totalHeight];
	((Widget) this).anIntArray677 = new int[totalHeight];
	for (int y = 0; ((((Sprite) class207).indexHeight ^ 0xffffffff) < (y ^ 0xffffffff)); y++) {
	    int i_13_ = 0;
	    for (int x = 0; ((((Sprite) class207).indexWidth ^ 0xffffffff)< (x ^ 0xffffffff)); x++) {
		if ((((Sprite) class207).colorIndex[((Sprite) class207).indexWidth * y + x]) != 0) {
		    i_13_ = x;
		    break;
		}
	    }
	    int i_15_ = totalWidth;
	    for (int x = i_13_; ((((Sprite) class207).indexWidth ^ 0xffffffff) < (x ^ 0xffffffff)); x++) {
		if ((((Sprite) class207).colorIndex[((Sprite) class207).indexWidth * y + x]) == 0) {
		    i_15_ = x;
		    break;
		}
	    }
	    ((Widget) this).anIntArray677[(((Sprite) class207).heightOffset + y)] = ((Sprite) class207).widthOffset + i_13_;
	    ((Widget) this).anIntArray772[(y + ((Sprite) class207).heightOffset)] = i_15_ + -i_13_;
	}
	if (i < 0)
	    initialize(null, false);
	var_aa = var_ha.method3661(totalWidth, totalHeight, ((Widget) this).anIntArray677, ((Widget) this).anIntArray772);
	Class239_Sub24.aClass60_6096.method582(var_aa, (long) ((Widget) this).anInt830, (byte) -104);
	return var_aa;
    }
    
    final AbstractFontRasterizer createWidgetFontRasterizer(AbstractToolkit toolkit) {
	anInt827++;
	AbstractFontRasterizer rasterizer = Class14.createFontRasterizer(toolkit, (byte) -53, false, ((Widget) this).bitmapFontId);
	Class348_Sub42_Sub13.aBoolean9616 = rasterizer == null;
	return rasterizer;
    }
    
    static final void method427(int i) {
	anInt837++;
	Class229.aClass268_2979.method2033((byte) 46);
	Class362.aClass183_4460.method1377(2);
	Class348_Sub40_Sub25.aClass150_9342.method1204(0);
	Class348_Sub40_Sub12.objectLoader.method2006(88);
	Class189.npcLoader.method2080(127);
	ToolkitException.itemLoader.method1938(126);
	Class10.animationLoader.method838(7);
	Class348_Sub40_Sub18.gfxLoader.method2542(-101);
	Class229.scriptConfigLoader.method1443(83);
	Class269.aClass217_3453.method1590(0);
	Class64_Sub3.aClass261_5558.method1986((byte) -91);
	Class2.aClass141_117.method1174((byte) -99);
	Class348_Sub23_Sub2.aClass153_9031.method1222(true);
	Class348_Sub23_Sub2.aClass187_9036.method1410(-27995);
	Class101_Sub3.aClass326_5764.method2602(0);
	Class30.aClass84_413.method816(false);
	Class123.aClass25_1813.method302(-797644856);
	Class348_Sub1.aClass185_6559.method1390(23);
	Class239.aClass166_3147.method1283(1);
	EntryElementLoader.aClass65_4787.method694(-1007);
	FileArchiveTracker.aClass219_4782.method1598(111);
	Class331.method2638(-4631);
	Class172.method1328(-26162);
	Class348_Sub40_Sub20.method3102(22385);
	Class44.method386((byte) -106);
	Class163.method1271(0);
	Class353.aClass60_4346.method587(-108);
	Class328_Sub2.aClass60_6517.method587(-109);
	Class348_Sub1_Sub1.aClass60_8807.method587(-113);
	Class34.aClass60_463.method587(-83);
	ScriptExecutor.aClass60_1174.method587(-91);
	int i_17_ = 54 / ((26 - i) / 53);
    }
    
    final int method428(int i, int i_18_, int i_19_) {
	anInt736++;
	if (aClass356_711 == null)
	    return i;
	if (i_19_ >= -124)
	    ((Widget) this).anInt700 = 46;
	Class348_Sub35 class348_sub35
	    = (Class348_Sub35) aClass356_711.get((long) i_18_);
	if (class348_sub35 == null)
	    return i;
	return ((Class348_Sub35) class348_sub35).anInt6976;
    }
    
    final String method429(int i, String string, int i_20_) {
	anInt783++;
	if (i_20_ != -1)
	    method437(-123, null, null, -35, null);
	if (aClass356_711 == null)
	    return string;
	StringNode class348_sub50
	    = (StringNode) aClass356_711.get((long) i);
	if (class348_sub50 == null)
	    return string;
	return ((StringNode) class348_sub50).value;
    }
    
    final AnimatableToolkit method430(Class150 class150, AnimationLoader class87, int i,
			    AbstractToolkit toolkit, int i_21_, int i_22_, ItemLoader class255,
			    ConfigHandler interface17, int i_23_,
			    Class154 class154, AnimationDefinition class17,
			    Class261 class261, NpcLoader class278, int i_24_) {
	try {
	    anInt684++;
	    Class348_Sub42_Sub13.aBoolean9616 = false;
	    if ((((Widget) this).anInt770 ^ 0xffffffff) == -1)
		return null;
	    if ((((Widget) this).anInt770 ^ 0xffffffff) == -2
		&& (((Widget) this).anInt753 ^ 0xffffffff) == 0)
		return null;
	    if ((((Widget) this).anInt770 ^ 0xffffffff) == -2) {
		int i_25_ = i;
		if (class17 != null)
		    i |= class17.method263(i_24_, 106, i_21_, true);
		long key = (long) (((Widget) this).anInt753 + ((((Widget) this).anInt770 << 16) + (((AbstractToolkit) toolkit).id << 29)));
		AnimatableToolkit class64 = (AnimatableToolkit) Class358.aClass60_4417.method583(key, -90);
		if (class64 == null
		    || toolkit.method3667(class64.ua(), i) != 0) {
		    if (class64 != null)
			i = toolkit.OR(i, class64.ua());
		    Model class124
			= Class300.createModel(0,
					      (Class348_Sub40_Sub28
					       .aClass45_9365),
					      ((Widget) this).anInt753);
		    if (class124 == null) {
			Class348_Sub42_Sub13.aBoolean9616 = true;
			return null;
		    }
		    if (((Model) class124).anInt1830 < 13)
			class124.method1092(2, 114);
		    class64
			= toolkit.method3625(class124, i,
					    Class14_Sub3.anInt8628, 64, 768);
		    Class358.aClass60_4417.method582(class64, key, (byte) -125);
		}
		if (class17 != null)
		    class64 = class17.method269(-101, class64, i_24_, i_22_, i,
						i_21_);
		class64.s(i_25_);
		return class64;
	    }
	    if ((((Widget) this).anInt770 ^ 0xffffffff) == -3) {
		AnimatableToolkit class64
		    = (class278.getNpcDefinition(((Widget) this).anInt753, -1)
			   .method803
		       (interface17, toolkit, i_22_, i_24_, class17, class87,
			i_21_, 104, i));
		if (class64 == null) {
		    Class348_Sub42_Sub13.aBoolean9616 = true;
		    return null;
		}
		return class64;
	    }
	    if (i_23_ != 255)
		loadScriptParameters(null, -50);
	    if ((((Widget) this).anInt770 ^ 0xffffffff) == -4) {
		if (class154 == null)
		    return null;
		AnimatableToolkit class64
		    = class154.method1230(class255, -402058072, class87,
					  class150, interface17, class278,
					  i_21_, i_24_, i, class17, i_22_,
					  toolkit);
		if (class64 == null) {
		    Class348_Sub42_Sub13.aBoolean9616 = true;
		    return null;
		}
		return class64;
	    }
	    if ((((Widget) this).anInt770 ^ 0xffffffff) == -5) {
		ItemDefinition class213
		    = class255.getItemDefinition(i_23_ + -365,
					  ((Widget) this).anInt753);
		AnimatableToolkit class64
		    = class213.method1559(class154, class17, toolkit, i, i_22_,
					  10, i_21_, (byte) 88, i_24_);
		if (class64 == null) {
		    Class348_Sub42_Sub13.aBoolean9616 = true;
		    return null;
		}
		return class64;
	    }
	    if ((((Widget) this).anInt770 ^ 0xffffffff) == -7) {
		AnimatableToolkit class64
		    = (class278.getNpcDefinition(((Widget) this).anInt753, -1)
			   .method800
		       (0, null, class87, false, null, 0, class261, i_21_,
			class17, interface17, toolkit, 0, null, i_24_, 0, i,
			i_22_));
		if (class64 == null) {
		    Class348_Sub42_Sub13.aBoolean9616 = true;
		    return null;
		}
		return class64;
	    }
	    if (((Widget) this).anInt770 == 7) {
		if (class154 == null)
		    return null;
		int i_26_ = ((Widget) this).anInt753 >>> -2052415248;
		int i_27_ = 0xffff & ((Widget) this).anInt753;
		int i_28_ = ((Widget) this).anInt779;
		AnimatableToolkit class64
		    = class154.method1232(i_24_, i, i_28_, i_27_, class87,
					  class150, -15331, i_26_, i_22_,
					  toolkit, i_21_, class17);
		if (class64 == null) {
		    Class348_Sub42_Sub13.aBoolean9616 = true;
		    return null;
		}
		return class64;
	    }
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("at.G(" + (class150 != null ? "{...}" : "null") + ','
			+ (class87 != null ? "{...}" : "null") + ',' + i + ','
			+ (toolkit != null ? "{...}" : "null") + ',' + i_21_
			+ ',' + i_22_ + ','
			+ (class255 != null ? "{...}" : "null") + ','
			+ (interface17 != null ? "{...}" : "null") + ','
			+ i_23_ + ',' + (class154 != null ? "{...}" : "null")
			+ ',' + (class17 != null ? "{...}" : "null") + ','
			+ (class261 != null ? "{...}" : "null") + ','
			+ (class278 != null ? "{...}" : "null") + ',' + i_24_
			+ ')'));
	}
    }
    
    final void method431(int i, int i_29_, byte i_30_) {
	anInt712++;
	if (((Widget) this).anIntArray706 == null
	    || ((((Widget) this).anIntArray706.length ^ 0xffffffff)
		>= (i ^ 0xffffffff))) {
	    int[] is = new int[1 + i];
	    if (((Widget) this).anIntArray706 != null) {
		for (int i_31_ = 0;
		     ((((Widget) this).anIntArray706.length ^ 0xffffffff)
		      < (i_31_ ^ 0xffffffff));
		     i_31_++)
		    is[i_31_] = ((Widget) this).anIntArray706[i_31_];
		for (int i_32_ = ((Widget) this).anIntArray706.length;
		     (i_32_ ^ 0xffffffff) > (i ^ 0xffffffff); i_32_++)
		    is[i_32_] = -1;
	    }
	    ((Widget) this).anIntArray706 = is;
	}
	((Widget) this).anIntArray706[i] = i_29_;
	if (i_30_ > -18)
	    ((Widget) this).anInt779 = 13;
    }
    
    private final Object[] loadScriptParameters(ByteBuffer class348_sub49, int i) {
	if (i != -1)
	    return null;
	anInt691++;
	int i_33_ = class348_sub49.getUByte();
	if (i_33_ == 0)
	    return null;
	Object[] objects = new Object[i_33_];
	for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
	    int i_35_ = class348_sub49.getUByte();
	    if ((i_35_ ^ 0xffffffff) != -1) {
		if ((i_35_ ^ 0xffffffff) == -2)
		    objects[i_34_] = class348_sub49.getJStr();
	    } else
		objects[i_34_] = new Integer(class348_sub49.getDWord());
	}
	((Widget) this).aBoolean682 = true;
	return objects;
    }
    
    final void initialize(ByteBuffer class348_sub49, boolean bool) {
	anInt743++;
	int i = class348_sub49.getUByte();
	if (i == 255)
	    i = -1;
	((Widget) this).type = class348_sub49.getUByte();
	if ((0x80 & ((Widget) this).type) != 0) {
	    ((Widget) this).type &= 0x7f;
	    ((Widget) this).aString721 = class348_sub49.getJStr();
            System.out.println("Odd String: " + aString721);
	}
	((Widget) this).anInt765 = class348_sub49.getShort();
	((Widget) this).anInt788 = class348_sub49.method3372(13638);
	((Widget) this).anInt739 = class348_sub49.method3372(13638);
	((Widget) this).anInt842 = class348_sub49.getShort();
	((Widget) this).anInt728 = class348_sub49.getShort();
	((Widget) this).aByte778 = class348_sub49.getByte();
	((Widget) this).aByte724 = class348_sub49.getByte();
	((Widget) this).aByte817 = class348_sub49.getByte();
	((Widget) this).aByte681 = class348_sub49.getByte();
	((Widget) this).anInt834 = class348_sub49.getShort();
	if (((Widget) this).anInt834 == 65535)
	    ((Widget) this).anInt834 = -1;
	else
	    ((Widget) this).anInt834 = ((~0xffff & ((Widget) this).anInt830) + ((Widget) this).anInt834);
	int i_36_ = class348_sub49.getUByte();
	if (i >= 0)
	    ((Widget) this).aBoolean776 = (0x2 & i_36_ ^ 0xffffffff) != -1;
	((Widget) this).aBoolean813 = (0x1 & i_36_ ^ 0xffffffff) != -1;
	if ((((Widget) this).type ^ 0xffffffff) == -1) {
	    ((Widget) this).anInt698 = class348_sub49.getShort();
	    ((Widget) this).anInt791 = class348_sub49.getShort();
	    if ((i ^ 0xffffffff) > -1)
		((Widget) this).aBoolean776 = class348_sub49.getUByte() == 1;
	}
	if ((((Widget) this).type ^ 0xffffffff) == -6) {
	    ((Widget) this).id = class348_sub49.getDWord();
	    ((Widget) this).anInt828 = class348_sub49.getShort();
	    int i_37_ = class348_sub49.getUByte();
	    ((Widget) this).aBoolean697 = (i_37_ & 0x1) != 0;
	    ((Widget) this).aBoolean745 = (0x2 & i_37_ ^ 0xffffffff) != -1;
	    ((Widget) this).anInt696 = class348_sub49.getUByte();
	    ((Widget) this).anInt672 = class348_sub49.getUByte();
	    ((Widget) this).anInt809 = class348_sub49.getDWord();
	    ((Widget) this).aBoolean790
		= (class348_sub49.getUByte() ^ 0xffffffff) == -2;
	    ((Widget) this).aBoolean735
		= (class348_sub49.getUByte() ^ 0xffffffff) == -2;
	    ((Widget) this).textColor = class348_sub49.getDWord();
	}
	if (((Widget) this).type == 6) {
	    ((Widget) this).anInt770 = 1;
	    ((Widget) this).anInt753 = class348_sub49.getShort();
	    if ((((Widget) this).anInt753 ^ 0xffffffff) == -65536)
		((Widget) this).anInt753 = -1;
	    int i_38_ = class348_sub49.getUByte();
	    ((Widget) this).aBoolean784 = (0x2 & i_38_) == 2;
	    boolean bool_39_ = (i_38_ & 0x1) == 1;
	    ((Widget) this).aBoolean689 = (i_38_ & 0x4 ^ 0xffffffff) == -5;
	    ((Widget) this).aBoolean754 = (i_38_ & 0x8) == 8;
	    if (!bool_39_) {
		if (((Widget) this).aBoolean784) {
		    ((Widget) this).anInt688
			= class348_sub49.method3372(13638);
		    ((Widget) this).anInt799
			= class348_sub49.method3372(13638);
		    ((Widget) this).anInt787
			= class348_sub49.method3372(13638);
		    ((Widget) this).anInt757
			= class348_sub49.getShort();
		    ((Widget) this).anInt675
			= class348_sub49.getShort();
		    ((Widget) this).anInt717
			= class348_sub49.getShort();
		    ((Widget) this).anInt716
			= class348_sub49.method3372(13638);
		}
	    } else {
		((Widget) this).anInt688 = class348_sub49.method3372(13638);
		((Widget) this).anInt799 = class348_sub49.method3372(13638);
		((Widget) this).anInt757
		    = class348_sub49.getShort();
		((Widget) this).anInt675
		    = class348_sub49.getShort();
		((Widget) this).anInt717
		    = class348_sub49.getShort();
		((Widget) this).anInt716
		    = class348_sub49.getShort();
	    }
	    ((Widget) this).anInt699 = class348_sub49.getShort();
	    if (((Widget) this).anInt699 == 65535)
		((Widget) this).anInt699 = -1;
	    if (((Widget) this).aByte778 != 0)
		((Widget) this).anInt796
		    = class348_sub49.getShort();
	    if ((((Widget) this).aByte724 ^ 0xffffffff) != -1)
		((Widget) this).anInt826
		    = class348_sub49.getShort();
	}
	if ((((Widget) this).type ^ 0xffffffff) == -5) {
	    ((Widget) this).bitmapFontId = class348_sub49.getShort();
	    if (((Widget) this).bitmapFontId == 65535)
		((Widget) this).bitmapFontId = -1;
	    ((Widget) this).text = class348_sub49.getJStr();
	    ((Widget) this).anInt673 = class348_sub49.getUByte();
	    ((Widget) this).anInt762 = class348_sub49.getUByte();
	    ((Widget) this).anInt700 = class348_sub49.getUByte();
	    ((Widget) this).aBoolean769
		= (class348_sub49.getUByte() ^ 0xffffffff) == -2;
	    ((Widget) this).textColor = class348_sub49.getDWord();
	    ((Widget) this).anInt696 = class348_sub49.getUByte();
	    if (i >= 0)
		((Widget) this).anInt773 = class348_sub49.getUByte();
	}
	if ((((Widget) this).type ^ 0xffffffff) == -4) {
	    ((Widget) this).textColor = class348_sub49.getDWord();
	    ((Widget) this).aBoolean810
		= (class348_sub49.getUByte() ^ 0xffffffff) == -2;
	    ((Widget) this).anInt696 = class348_sub49.getUByte();
	}
	if ((((Widget) this).type ^ 0xffffffff) == -10) {
	    ((Widget) this).anInt690 = class348_sub49.getUByte();
	    ((Widget) this).textColor = class348_sub49.getDWord();
	    ((Widget) this).aBoolean744 = class348_sub49.getUByte() == 1;
	}
	int i_40_ = class348_sub49.getTri();
	int i_41_ = class348_sub49.getUByte();
	if ((i_41_ ^ 0xffffffff) != -1) {
	    ((Widget) this).aByteArray832 = new byte[11];
	    ((Widget) this).aByteArray746 = new byte[11];
	    ((Widget) this).anIntArray707 = new int[11];
	    for (/**/; (i_41_ ^ 0xffffffff) != -1;
		 i_41_ = class348_sub49.getUByte()) {
		int i_42_ = -1 + (i_41_ >> 202238372);
		i_41_ = i_41_ << -1198606488 | class348_sub49.getUByte();
		i_41_ &= 0xfff;
		if ((i_41_ ^ 0xffffffff) == -4096)
		    i_41_ = -1;
		byte i_43_ = class348_sub49.getByte();
		if (i_43_ != 0)
		    ((Widget) this).aBoolean676 = true;
		byte i_44_ = class348_sub49.getByte();
		((Widget) this).anIntArray707[i_42_] = i_41_;
		((Widget) this).aByteArray746[i_42_] = i_43_;
		((Widget) this).aByteArray832[i_42_] = i_44_;
	    }
	}
	((Widget) this).aString752 = class348_sub49.getJStr();
	int i_45_ = class348_sub49.getUByte();
	int i_46_ = 0xf & i_45_;
	if ((i_46_ ^ 0xffffffff) < -1) {
	    ((Widget) this).aStringArray833 = new String[i_46_];
	    for (int i_47_ = 0; i_47_ < i_46_; i_47_++)
		((Widget) this).aStringArray833[i_47_]
		    = class348_sub49.getJStr();
	}
	int i_48_ = i_45_ >> -315745276;
	if ((i_48_ ^ 0xffffffff) < -1) {
	    int i_49_ = class348_sub49.getUByte();
	    ((Widget) this).anIntArray706 = new int[1 + i_49_];
	    for (int i_50_ = 0; i_50_ < ((Widget) this).anIntArray706.length;
		 i_50_++)
		((Widget) this).anIntArray706[i_50_] = -1;
	    ((Widget) this).anIntArray706[i_49_]
		= class348_sub49.getShort();
	}
	if (i_48_ > 1) {
	    int i_51_ = class348_sub49.getUByte();
	    ((Widget) this).anIntArray706[i_51_]
		= class348_sub49.getShort();
	}
	((Widget) this).aString816 = class348_sub49.getJStr();
	if (((Widget) this).aString816.equals(""))
	    ((Widget) this).aString816 = null;
	((Widget) this).anInt729 = class348_sub49.getUByte();
	((Widget) this).anInt703 = class348_sub49.getUByte();
	((Widget) this).anInt797 = class348_sub49.getUByte();
	((Widget) this).aString780 = class348_sub49.getJStr();
	int i_52_ = -1;
	if (Class348_Sub40_Sub5.method3060(i_40_, bool) != 0) {
	    i_52_ = class348_sub49.getShort();
	    ((Widget) this).anInt824 = class348_sub49.getShort();
	    if (i_52_ == 65535)
		i_52_ = -1;
	    if ((((Widget) this).anInt824 ^ 0xffffffff) == -65536)
		((Widget) this).anInt824 = -1;
	    ((Widget) this).anInt695 = class348_sub49.getShort();
	    if ((((Widget) this).anInt695 ^ 0xffffffff) == -65536)
		((Widget) this).anInt695 = -1;
	}
	if (i >= 0) {
	    ((Widget) this).anInt719 = class348_sub49.getShort();
	    if ((((Widget) this).anInt719 ^ 0xffffffff) == -65536)
		((Widget) this).anInt719 = -1;
	}
	((Widget) this).aClass348_Sub44_748
	    = new Class348_Sub44(i_40_, i_52_);
	if (i >= 0) {
	    int i_53_ = class348_sub49.getUByte();
	    for (int i_54_ = 0; (i_54_ ^ 0xffffffff) > (i_53_ ^ 0xffffffff);
		 i_54_++) {
		int i_55_ = class348_sub49.getTri();
		int i_56_ = class348_sub49.getDWord();
		aClass356_711.putNode((long) i_55_, new Class348_Sub35(i_56_));
	    }
	    int i_57_ = class348_sub49.getUByte();
	    for (int i_58_ = 0; (i_57_ ^ 0xffffffff) < (i_58_ ^ 0xffffffff);
		 i_58_++) {
		int i_59_ = class348_sub49.getTri();
		String string = class348_sub49.getJStr2(-13487);
		aClass356_711.putNode((long) i_59_,
					 new StringNode(string));
	    }
	}
	((Widget) this).anObjectArray815 = loadScriptParameters(class348_sub49, -1);
	((Widget) this).anObjectArray811 = loadScriptParameters(class348_sub49, -1);
	((Widget) this).anObjectArray683 = loadScriptParameters(class348_sub49, -1);
	((Widget) this).anObjectArray680 = loadScriptParameters(class348_sub49, -1);
	((Widget) this).anObjectArray714 = loadScriptParameters(class348_sub49, -1);
	((Widget) this).configTriggeredScriptParameters = loadScriptParameters(class348_sub49, -1);
	((Widget) this).anObjectArray751 = loadScriptParameters(class348_sub49, -1);
	((Widget) this).anObjectArray671 = loadScriptParameters(class348_sub49, -1);
	((Widget) this).logicCycleScriptParameters = loadScriptParameters(class348_sub49, -1);
	((Widget) this).anObjectArray741 = loadScriptParameters(class348_sub49, -1);
	if (i >= 0)
	    ((Widget) this).scriptParameters = loadScriptParameters(class348_sub49, -1);
	((Widget) this).anObjectArray839 = loadScriptParameters(class348_sub49, -1);
	((Widget) this).anObjectArray763 = loadScriptParameters(class348_sub49, -1);
	((Widget) this).anObjectArray785 = loadScriptParameters(class348_sub49, -1);
	((Widget) this).anObjectArray742 = loadScriptParameters(class348_sub49, -1);
	((Widget) this).anObjectArray805 = loadScriptParameters(class348_sub49, -1);
	((Widget) this).anObjectArray823 = loadScriptParameters(class348_sub49, -1);
	((Widget) this).anObjectArray692 = loadScriptParameters(class348_sub49, -1);
	((Widget) this).anObjectArray803 = loadScriptParameters(class348_sub49, -1);
	((Widget) this).anObjectArray685 = loadScriptParameters(class348_sub49, -1);
	((Widget) this).anObjectArray708 = loadScriptParameters(class348_sub49, -1);
	((Widget) this).configScriptTriggers = method441(!bool, class348_sub49);
	((Widget) this).anIntArray771 = method441(!bool, class348_sub49);
	((Widget) this).anIntArray731 = method441(!bool, class348_sub49);
	((Widget) this).anIntArray818 = method441(false, class348_sub49);
	((Widget) this).anIntArray831 = method441(false, class348_sub49);
    }
    
    final void method434(boolean bool) {
	((Widget) this).anIntArray771 = null;
	((Widget) this).anIntArray731 = null;
	((Widget) this).anObjectArray820 = null;
	((Widget) this).configScriptTriggers = null;
	((Widget) this).anObjectArray839 = null;
	((Widget) this).anObjectArray763 = null;
	((Widget) this).anIntArray831 = null;
	((Widget) this).anObjectArray741 = null;
	((Widget) this).logicCycleScriptParameters = null;
	((Widget) this).anObjectArray836 = null;
	((Widget) this).anObjectArray701 = null;
	((Widget) this).anObjectArray751 = null;
	((Widget) this).anObjectArray822 = null;
	((Widget) this).anObjectArray714 = null;
	((Widget) this).anObjectArray671 = null;
	((Widget) this).anObjectArray785 = null;
	((Widget) this).anObjectArray727 = null;
	((Widget) this).anObjectArray811 = null;
	((Widget) this).anObjectArray683 = null;
	((Widget) this).anIntArray818 = null;
	((Widget) this).anObjectArray708 = null;
	((Widget) this).anObjectArray687 = null;
	((Widget) this).anObjectArray803 = null;
	((Widget) this).anObjectArray823 = null;
	((Widget) this).anObjectArray805 = null;
	anInt829++;
	((Widget) this).anObjectArray685 = null;
	((Widget) this).anObjectArray815 = null;
	((Widget) this).anObjectArray692 = null;
	((Widget) this).scriptParameters = null;
	if (bool != false)
	    ((Widget) this).anInt799 = 96;
	((Widget) this).anObjectArray742 = null;
	((Widget) this).anObjectArray840 = null;
	((Widget) this).configTriggeredScriptParameters = null;
	((Widget) this).anObjectArray807 = null;
	((Widget) this).anObjectArray761 = null;
	((Widget) this).anObjectArray734 = null;
	((Widget) this).anObjectArray680 = null;
    }
    
    final void method435(int i, int i_60_) {
	anInt802++;
	if (aClass356_711 != null) {
	    Node class348 = aClass356_711.get((long) i);
	    if (class348 != null)
		class348.removeNode();
	}
	if (i_60_ != -3437)
	    method425(null, (byte) 83);
    }
    
    final void method436(int i, int i_61_, int i_62_) {
	anInt694++;
	if (aClass356_711 == null) {
	    aClass356_711 = new HashTable(16);
	    aClass356_711.putNode((long) i_61_,
				     new Class348_Sub35(i_62_));
	} else if (i < -38) {
	    Class348_Sub35 class348_sub35
		= ((Class348_Sub35)
		   aClass356_711.get((long) i_61_));
	    if (class348_sub35 == null)
		aClass356_711.putNode((long) i_61_,
					 new Class348_Sub35(i_62_));
	    else
		((Class348_Sub35) class348_sub35).anInt6976 = i_62_;
	}
    }
    
    final void method437(int i, AnimatableToolkit class64, AbstractToolkit var_ha, int i_63_,
			 Class101 class101) {
	do {
	    try {
		if (i != -20154)
		    method438(15, -50, null);
		anInt718++;
		class64.method620(class101);
		Class129[] class129s = class64.method619();
		Class342[] class342s = class64.method604();
		if ((((Widget) this).aClass318_Sub10_740 == null
		     || ((Class318_Sub10)
			 ((Widget) this).aClass318_Sub10_740).aBoolean6470)
		    && (class129s != null || class342s != null))
		    ((Widget) this).aClass318_Sub10_740
			= Class318_Sub10.method2526(i_63_, false);
		if (((Widget) this).aClass318_Sub10_740 == null)
		    break;
		((Widget) this).aClass318_Sub10_740.method2536(var_ha,
								(long) i_63_,
								class129s,
								class342s,
								false);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("at.J(" + i + ','
						 + (class64 != null ? "{...}"
						    : "null")
						 + ','
						 + (var_ha != null ? "{...}"
						    : "null")
						 + ',' + i_63_ + ','
						 + (class101 != null ? "{...}"
						    : "null")
						 + ')'));
	    }
	    break;
	} while (false);
    }
    
    final void method438(int i, int i_64_, String string) {
	if (((Widget) this).aStringArray833 == null
	    || i >= ((Widget) this).aStringArray833.length) {
	    String[] strings = new String[i + 1];
	    if (((Widget) this).aStringArray833 != null) {
		for (int i_65_ = 0; ((i_65_ ^ 0xffffffff)
				     > (((Widget) this).aStringArray833.length
					^ 0xffffffff)); i_65_++)
		    strings[i_65_] = ((Widget) this).aStringArray833[i_65_];
	    }
	    ((Widget) this).aStringArray833 = strings;
	}
	if (i_64_ > 77) {
	    anInt766++;
	    ((Widget) this).aStringArray833[i] = string;
	}
    }
    
    final void putString(String string, int key) {
	anInt758++;
	if (aClass356_711 == null) {
	    aClass356_711 = new HashTable(16);
	    aClass356_711.putNode((long) key, new StringNode(string));
	} else {
	    StringNode class348_sub50
		= ((StringNode)
		   aClass356_711.get((long) key));
	    if (class348_sub50 == null)
		aClass356_711.putNode((long) key,
					 new StringNode(string));
	    else
		((StringNode) class348_sub50).value = string;
	}
    }
    
    static final void method440(int i, byte i_67_) {
	Class348_Sub40_Sub19.anIntArray9259 = new int[i];
	if (i_67_ == -61) {
	    LoadingStage.anIntArray1045 = new int[i];
	    Class156.anIntArray2117 = new int[i];
	    anInt825++;
	    AnimatableToolkit.anIntArray1127 = new int[i];
	    Class327.anIntArray4097 = new int[i];
	}
    }
    
    private final int[] method441(boolean bool,
				  ByteBuffer class348_sub49) {
	anInt722++;
	int i = class348_sub49.getUByte();
	if (bool != false)
	    return null;
	if ((i ^ 0xffffffff) == -1)
	    return null;
	int[] is = new int[i];
	for (int i_68_ = 0; i_68_ < i; i_68_++)
	    is[i_68_] = class348_sub49.getDWord();
	return is;
    }
    
    public static void method442(byte i) {
	if (i <= -8) {
	    aClass196_838 = null;
	    aByteArray821 = null;
	}
    }
    
    final RasterToolkit method443(AbstractToolkit var_ha, byte i) {
	anInt819++;
	Class348_Sub42_Sub13.aBoolean9616 = false;
	long l = (((long) ((Widget) this).anInt809 << 1562209832)
		  + (((((Widget) this).aBoolean790 ? 1L : 0L) << 1884969510)
		     + (((long) ((Widget) this).anInt672 << 164034916)
			+ ((((Widget) this).aBoolean745 ? 1L : 0L)
			   << -187380061)))
		  + ((long) ((Widget) this).id
		     + ((!((Widget) this).aBoolean735 ? 0L : 1L)
			<< -888958681)));
	RasterToolkit class105
	    = (RasterToolkit) OutgoingPacket.aClass60_4327.method583(l, -71);
	if (i > -27)
	    method434(true);
	if (class105 != null)
	    return class105;
	Sprite class207
	    = Sprite.loadSingleSprite(Class318_Sub1_Sub3.widgetSpriteIndexLoader,
				  ((Widget) this).id, 0);
	if (class207 == null) {
	    Class348_Sub42_Sub13.aBoolean9616 = true;
	    return null;
	}
	if (((Widget) this).aBoolean790)
	    class207.reflectX();
	if (((Widget) this).aBoolean735)
	    class207.reflectY();
	if ((((Widget) this).anInt672 ^ 0xffffffff) < -1)
	    class207.unpack(((Widget) this).anInt672);
	else if (((Widget) this).anInt809 != 0)
	    class207.unpack(1);
	if (((Widget) this).anInt672 >= 1)
	    class207.replaceSomething(1);
	if (((Widget) this).anInt672 >= 2)
	    class207.replaceSomething(16777215);
	if ((((Widget) this).anInt809 ^ 0xffffffff) != -1)
	    class207.method1511(~0xffffff | ((Widget) this).anInt809);
	class105 = var_ha.method3691(class207, true);
	OutgoingPacket.aClass60_4327.put(31902, class105, l,
					 (class105.getWidth()
					  * class105.getHeight() * 4));
	return class105;
    }
    
    final Class305 method444(boolean bool, Class25 class25, Class84 class84) {
	try {
	    if (bool != false)
		method424(122, -123, null, -111, 40, 28, -109, null, 76, 127,
			  -66, 8, -45);
	    anInt804++;
	    if ((((Widget) this).anInt705 ^ 0xffffffff) == 0)
		return null;
	    long l = (((long) ((Widget) this).anInt693 << -1127798448
		       & 65535L << 177554128)
		      | (((long) ((Widget) this).anInt733 << -1024504224
			  & 65535L << -611758752)
			 | ((long) ((Widget) this).anInt674 << 885236336
			    & 65535L << -767283792))
		      | (long) ((Widget) this).anInt705 & 0xffffL);
	    Class305 class305
		= ((Class305)
		   Class348_Sub40_Sub9.aClass60_9171.method583(l, 78));
	    if (class305 == null) {
		class305
		    = class84.method823(((Widget) this).anInt733,
					((Widget) this).anInt693,
					((Widget) this).anInt674, -43,
					class25, ((Widget) this).anInt705);
		Class348_Sub40_Sub9.aClass60_9171.method582(class305, l,
							    (byte) -120);
	    }
	    return class305;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("at.N(" + bool + ','
					     + (class25 != null ? "{...}"
						: "null")
					     + ','
					     + (class84 != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    public Widget() {
	((Widget) this).anInt695 = -1;
	((Widget) this).anInt700 = 0;
	((Widget) this).aBoolean676 = false;
	((Widget) this).anInt726 = -1;
	((Widget) this).aBoolean682 = false;
	((Widget) this).anInt690 = 1;
	((Widget) this).anInt716 = 100;
	((Widget) this).anInt757 = 0;
	((Widget) this).anInt704 = -1;
	((Widget) this).anInt750 = 0;
	((Widget) this).anInt675 = 0;
	((Widget) this).textColor = 0;
	((Widget) this).id = -1;
	((Widget) this).anInt710 = 1;
	((Widget) this).anInt738 = 0;
	((Widget) this).anInt672 = 0;
	((Widget) this).anInt730 = 1;
	((Widget) this).aBoolean754 = false;
	((Widget) this).anInt747 = 0;
	((Widget) this).anInt723 = 0;
	((Widget) this).aBoolean776 = false;
	((Widget) this).anInt788 = 0;
	((Widget) this).anInt699 = -1;
	((Widget) this).aBoolean769 = false;
	((Widget) this).aBoolean720 = false;
	((Widget) this).anInt713 = -1;
	((Widget) this).anInt739 = 0;
	((Widget) this).anInt729 = 0;
	((Widget) this).anInt728 = 0;
	((Widget) this).anInt797 = DummyInputstream2.anInt78;
	((Widget) this).anInt779 = -1;
	((Widget) this).anInt709 = 0;
	((Widget) this).anInt775 = 1;
	((Widget) this).anInt719 = -1;
	((Widget) this).aBoolean793 = false;
	((Widget) this).anInt791 = 0;
	((Widget) this).anInt715 = 0;
	((Widget) this).aBoolean689 = false;
	((Widget) this).aBoolean697 = false;
	((Widget) this).anInt808 = 0;
	((Widget) this).anInt765 = 0;
	((Widget) this).anInt755 = 0;
	((Widget) this).aClass348_Sub44_748 = Class205.aClass348_Sub44_2692;
	((Widget) this).anInt786 = 0;
	((Widget) this).anInt760 = -1;
	((Widget) this).anInt800 = 0;
	((Widget) this).anInt770 = 1;
	((Widget) this).aByte778 = (byte) 0;
	((Widget) this).aBoolean810 = false;
	((Widget) this).aByte724 = (byte) 0;
	((Widget) this).aClass46_782 = null;
	((Widget) this).anInt773 = 0;
	((Widget) this).anInt794 = -1;
	((Widget) this).anInt725 = 0;
	((Widget) this).anInt799 = 0;
	((Widget) this).aBoolean737 = false;
	((Widget) this).anInt703 = 0;
	((Widget) this).anInt828 = 0;
	((Widget) this).aString752 = "";
	((Widget) this).aBoolean745 = false;
	((Widget) this).anInt698 = 0;
	((Widget) this).text = "";
	((Widget) this).anInt814 = 0;
	((Widget) this).anInt781 = 0;
	((Widget) this).aBoolean813 = false;
	((Widget) this).anInt824 = -1;
	((Widget) this).anInt830 = -1;
	((Widget) this).aByte681 = (byte) 0;
	((Widget) this).anInt809 = 0;
	((Widget) this).anInt834 = -1;
	((Widget) this).anInt762 = 0;
	((Widget) this).anInt789 = 0;
	((Widget) this).aString780 = "";
	((Widget) this).aBoolean744 = false;
	((Widget) this).anInt826 = 0;
	((Widget) this).anInt787 = 0;
	((Widget) this).anInt705 = -1;
	((Widget) this).anInt795 = 0;
	((Widget) this).itemId = -1;
	((Widget) this).anInt717 = 0;
	((Widget) this).anInt806 = -1;
	((Widget) this).anInt842 = 0;
	((Widget) this).anInt796 = 0;
	((Widget) this).anInt841 = 0;
	((Widget) this).aByte817 = (byte) 0;
    }
    
    static {
	int i = 0;
	for (int i_69_ = 0; i_69_ < 256; i_69_++) {
	    for (int i_70_ = 0; i_69_ >= i_70_; i_70_++)
		aByteArray821[i++]
		    = (byte) (int) (255.0
				    / Math.sqrt((double) ((float) ((i_69_
								    * i_69_)
								   + (i_70_
								      * i_70_)
								   - -65535)
							  / 65535.0F)));
	}
	aClass196_838 = new Class196();
    }
}
