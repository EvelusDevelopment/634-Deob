/* Class348_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.lang.reflect.Constructor;

final class Class348_Sub18 extends Node
{
    static int anInt6804;
    static int anInt6805;
    private int anInt6806;
    static int anInt6807;
    static int anInt6808;
    int anInt6809;
    private int anInt6810;
    private int anInt6811;
    int anInt6812;
    int anInt6813;
    static OutgoingPacket aClass351_6814 = new OutgoingPacket(63, 3);
    private int anInt6815;
    static int anInt6816;
    static int anInt6817;
    static int anInt6818 = 0;
    int anInt6819;
    private int anInt6820;
    static int anInt6821;
    static int anInt6822;
    /*synthetic*/ static Class aClass6823;
    
    final boolean method2934(int i, int i_0_, int i_1_) {
	anInt6822++;
	if ((anInt6820 ^ 0xffffffff) < (i_0_ ^ 0xffffffff)
	    || (anInt6806 ^ 0xffffffff) > (i_0_ ^ 0xffffffff)
	    || i_1_ < anInt6811 || anInt6810 < i_1_)
	    return false;
	return true;
    }
    
    final boolean method2935(int i, int i_2_, int i_3_, boolean bool) {
	anInt6821++;
	if (bool != true)
	    anInt6811 = -84;
	if (i_3_ != anInt6815 || (anInt6820 ^ 0xffffffff) < (i_2_ ^ 0xffffffff)
	    || anInt6806 < i_2_ || (anInt6811 ^ 0xffffffff) < (i ^ 0xffffffff)
	    || anInt6810 < i)
	    return false;
	return true;
    }
    
    public static void method2936(byte i) {
	if (i == -25)
	    aClass351_6814 = null;
    }
    
    final void method2937(int i, int i_4_, int i_5_, int[] is) {
	anInt6816++;
	is[0] = anInt6815;
	is[1] = -((Class348_Sub18) this).anInt6809 - -anInt6820 + i;
	is[2] = i_4_ + (-((Class348_Sub18) this).anInt6812 + anInt6811);
	if (i_5_ != -3069)
	    anInt6810 = -14;
    }
    
    static final void method2938(byte i) {
	anInt6804++;
	Class229.aClass268_2979.method2037(10205);
	Class362.aClass183_4460.method1381(true);
	Class348_Sub40_Sub25.aClass150_9342.method1206((byte) -37);
	Class348_Sub40_Sub12.objectLoader.method2012(-23828);
	Class189.npcLoader.method2078(-6080);
	ToolkitException.itemLoader.method1939(-110);
	Class10.animationLoader.method834((byte) -116);
	Class348_Sub40_Sub18.gfxLoader.method2546(60);
	Class229.scriptConfigLoader.method1445(64);
	Class269.aClass217_3453.method1589((byte) 127);
	Class64_Sub3.aClass261_5558.method1985(0);
	Class2.aClass141_117.method1175((byte) 125);
	Class348_Sub23_Sub2.aClass153_9031.method1219(7851);
	Class348_Sub23_Sub2.aClass187_9036.method1404((byte) -82);
	Class101_Sub3.aClass326_5764.method2601((byte) -44);
	Class30.aClass84_413.method822((byte) -120);
	Class123.aClass25_1813.method300((byte) -123);
	Class348_Sub1.aClass185_6559.method1393((byte) -13);
	Class239.aClass166_3147.method1290(-8);
	EntryElementLoader.aClass65_4787.method695(true);
	FileArchiveTracker.aClass219_4782.method1602(0);
	Class369_Sub3.method3573(-15326);
	Class164.method1277((byte) 62);
	Class84.method821(-126);
	Class318.method2375(16127);
	if (Class55_Sub1.aClass364_5271 != Class8.modeWhere) {
	    for (int i_6_ = 0; Class308.aByteArrayArray3882.length > i_6_;
		 i_6_++)
		Class308.aByteArrayArray3882[i_6_] = null;
	    Class127_Sub1.anInt8388 = 0;
	}
	LocationMode.method3517(83);
	BitmapTable.method2368(-1);
	Class239_Sub25.method1828(87);
	if (i > 53) {
	    Class24.method297(false);
	    Class186_Sub1.method1402(1);
	    ScriptExecutor.aClass60_1174.removeAll(0);
	    Class348_Sub8.currentToolkit.method3663();
	    SocketConnection.method1707(26469);
	    ByteBuffer.method3354(-52);
	    Class348_Sub29.indexLoader0.removeChildren();
	    Class186.indexLoader1.removeChildren();
	    Class95.indexLoader2.removeChildren();
	    Class348_Sub35.indexLoader3.removeChildren();
	    Class129.indexLoader4.removeChildren();
	    Class367_Sub10.indexLoader5.removeChildren();
	    Class59_Sub2_Sub1.indexLoader6.removeChildren();
	    aa_Sub3.indexLoader7.removeChildren();
	    Class21.indexLoader8.removeChildren();
	    Class369_Sub2.indexLoader9.removeChildren();
	    Class16.aClass45_233.removeChildren();
	    Class348_Sub23_Sub2.indexLoader10.removeChildren();
	    Class113.indexLoader12.removeChildren();
	    Class104.indexLoader13.removeChildren();
	    Class239_Sub4.indexLoader14.removeChildren();
	    Class123.indexLoader15.removeChildren();
	    Class94.indexLoader16.removeChildren();
	    Class247.indexLoader17.removeChildren();
	    Class216.indexLoader18.removeChildren();
	    Class174.indexLoader19.removeChildren();
	    r_Sub2.indexLoader20.removeChildren();
	    BufferedFile.indexLoader21.removeChildren();
	    Class348_Sub16_Sub3.indexLoader22.removeChildren();
	    Class348_Sub32.indexLoader23.removeChildren();
	    Class130.indexLoader24.removeChildren();
	    StringVarScriptSettingLoader.indexLoader25.removeChildren();
	    KeyboardEventNode.indexLoader26.removeChildren();
	    Class239.indexLoader27.removeChildren();
	    Class367_Sub8.indexLoader28.removeChildren();
	    Deque.indexLoader29.removeChildren();
	    Class126.indexLoader30.removeChildren();
	    EntryElementLoader.indexLoader31.removeChildren();
	    VarbitDefinition.indexLoader36.removeChildren();
	    Class353.aClass60_4346.removeAll(0);
	    Class328_Sub2.aClass60_6517.removeAll(0);
	    Class348_Sub1_Sub1.aClass60_8807.removeAll(0);
	    Class34.aClass60_463.removeAll(0);
	}
    }
    
    final boolean method2939(int i, int i_7_, int i_8_) {
	anInt6807++;
	if (i_7_ != 2)
	    return true;
	if (((Class348_Sub18) this).anInt6809 > i
	    || (i ^ 0xffffffff) < (((Class348_Sub18) this).anInt6819
				   ^ 0xffffffff)
	    || ((((Class348_Sub18) this).anInt6812 ^ 0xffffffff)
		< (i_8_ ^ 0xffffffff))
	    || (i_8_ ^ 0xffffffff) < (((Class348_Sub18) this).anInt6813
				      ^ 0xffffffff))
	    return false;
	return true;
    }
    
    final void method2940(int i, boolean bool, int[] is, int i_9_) {
	anInt6817++;
	is[0] = 0;
	is[2] = i + -anInt6811 + ((Class348_Sub18) this).anInt6812;
	is[1] = i_9_ - anInt6820 - -((Class348_Sub18) this).anInt6809;
	if (bool != true)
	    ((Class348_Sub18) this).anInt6812 = -26;
    }
    
    static final AbstractMouseListener createMouseMovementListener(Component component, int i,
				     boolean bool) {
	anInt6808++;
	try {
	    Constructor constructor
		= (Class.forName("Class373_Sub1").getDeclaredConstructor
		   (new Class[] { (aClass6823 != null ? aClass6823
				   : (aClass6823
				      = method2943("java.awt.Component"))),
				  Boolean.TYPE }));
	    return ((AbstractMouseListener)
		    constructor.newInstance(new Object[]
					    { component, new Boolean(bool) }));
	} catch (Throwable throwable) {
	    if (i != 0)
		return null;
	    return new MouseMovementListener(component, bool);
	}
    }
    
    static final void method2942(Widget class46, byte i) {
	anInt6805++;
	if ((TextureLoader.anInt4610 ^ 0xffffffff)
	    == (((Widget) class46).anInt765 ^ 0xffffffff)) {
	    if (((Player)
		 Class132.localPlayer).aString10544
		== null) {
		((Widget) class46).anInt779 = 0;
		((Widget) class46).anInt753 = 0;
	    } else {
		((Widget) class46).anInt757 = 150;
		((Widget) class46).anInt675
		    = 0x7ff & (int) (256.0
				     * Math.sin((double) (Class367_Sub11
							  .logicCycle) / 40.0));
		((Widget) class46).anInt770 = 5;
		((Widget) class46).anInt753 = Class348_Sub42_Sub11.localPlayerId;
		((Widget) class46).anInt779
		    = (Class318_Sub1_Sub3_Sub1.method2418
		       ((((Player)
			  Class132.localPlayer)
			 .aString10544),
			(byte) -41));
		((Widget) class46).anInt699
		    = ((Class318_Sub1_Sub3_Sub3)
		       Class132.localPlayer).anInt10268;
		((Widget) class46).anInt841 = 0;
		((Widget) class46).anInt730
		    = ((Class318_Sub1_Sub3_Sub3)
		       Class132.localPlayer).anInt10312;
		((Widget) class46).anInt795
		    = ((Class318_Sub1_Sub3_Sub3)
		       Class132.localPlayer).anInt10245;
		AnimationDefinition class17
		    = ((((Widget) class46).anInt699 ^ 0xffffffff) != 0
		       ? Class10.animationLoader
			     .method835(((Widget) class46).anInt699, 7)
		       : null);
		if (class17 != null)
		    Class264.method2017(((Widget) class46).anInt795, class17,
					50);
	    }
	} else {
	    int i_10_ = -14 % ((27 - i) / 59);
	}
    }
    
    Class348_Sub18(int i, int i_11_, int i_12_, int i_13_, int i_14_,
		   int i_15_, int i_16_, int i_17_, int i_18_) {
	((Class348_Sub18) this).anInt6809 = i_15_;
	((Class348_Sub18) this).anInt6819 = i_17_;
	anInt6820 = i_11_;
	anInt6811 = i_12_;
	anInt6815 = i;
	((Class348_Sub18) this).anInt6812 = i_16_;
	anInt6806 = i_13_;
	anInt6810 = i_14_;
	((Class348_Sub18) this).anInt6813 = i_18_;
    }
    
    /*synthetic*/ static Class method2943(String string) {
	try {
	    return Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
