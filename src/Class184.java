/* Class184 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class184
{
    int[] anIntArray2468;
    static boolean aBoolean2469;
    static int anInt2470;
    static int[] anIntArray2471 = new int[14];
    static int anInt2472;
    String[] aStringArray2473;
    ClientScript aClass348_Sub42_Sub19_2474;
    static int anInt2475;
    static int anInt2476;
    int anInt2477 = -1;
    /*synthetic*/ static Class aClass2478;
    
    static final int method1384(int i, int i_0_, int i_1_) {
	i_1_ = (0x7f & i) * i_1_ >> 1421041063;
	if (i_0_ != 1421041063)
	    return -72;
	anInt2476++;
	if (i_1_ >= 2) {
	    if (i_1_ > 126)
		i_1_ = 126;
	} else
	    i_1_ = 2;
	return i_1_ + (0xff80 & i);
    }
    
    static final void parseLobbyWorldList(boolean bool, byte[] is, byte i) {
	anInt2475++;
	if (Class299_Sub1_Sub2.lobbylistBuffer == null)
	    Class299_Sub1_Sub2.lobbylistBuffer = new ByteBuffer(20000);
	Class299_Sub1_Sub2.lobbylistBuffer.putBytes(is.length, 0, is);
	if (bool) {
	    Class167.method1294((byte) -113, (((ByteBuffer) Class299_Sub1_Sub2.lobbylistBuffer).payload));
	    Class65.lobbyWorlds = new LobbyWorld[Class225.amountWorlds];
	    int i_2_ = 0;
	    for (int i_3_ = Class318_Sub1_Sub2.anInt8731; ((i_3_ ^ 0xffffffff) >= (Class239_Sub29.anInt6151 ^ 0xffffffff)); i_3_++) {
		LobbyWorld info = Class239_Sub5.getLobbyWorld(i_3_);
		if (info != null)
		    Class65.lobbyWorlds[i_2_++] = info;
	    }
	    Class130.aBoolean1899 = false;
	    Class240.lastUpdatedTime = Class62.getCurrentTimeMillis();
	    Class299_Sub1_Sub2.lobbylistBuffer = null;
	}
    }
    
    public static void method1386(boolean bool) {
	anIntArray2471 = null;
	if (bool != true)
	    aBoolean2469 = true;
    }
    
    static final void method1387(int i, Class348_Sub27 class348_sub27) {
	anInt2470++;
	if (Message.aClass357ArrayArrayArray2029 != null) {
	    if (i >= -38)
		method1384(-77, 22, 77);
	    Interface10 interface10 = null;
	    if (((Class348_Sub27) class348_sub27).anInt6904 == 0)
		interface10
		    = ((Interface10)
		       r_Sub2.method3297((((Class348_Sub27) class348_sub27)
					  .anInt6899),
					 (((Class348_Sub27) class348_sub27)
					  .anInt6905),
					 (((Class348_Sub27) class348_sub27)
					  .anInt6896)));
	    if (((Class348_Sub27) class348_sub27).anInt6904 == 1)
		interface10
		    = ((Interface10)
		       (Class348_Sub40_Sub32.method3135
			(((Class348_Sub27) class348_sub27).anInt6899,
			 ((Class348_Sub27) class348_sub27).anInt6905,
			 ((Class348_Sub27) class348_sub27).anInt6896)));
	    if (((Class348_Sub27) class348_sub27).anInt6904 == 2)
		interface10
		    = ((Interface10)
		       (Class177.method1353
			(((Class348_Sub27) class348_sub27).anInt6899,
			 ((Class348_Sub27) class348_sub27).anInt6905,
			 ((Class348_Sub27) class348_sub27).anInt6896,
			 (aClass2478 != null ? aClass2478
			  : (aClass2478 = method1389("Interface10"))))));
	    if ((((Class348_Sub27) class348_sub27).anInt6904 ^ 0xffffffff)
		== -4)
		interface10
		    = ((Interface10)
		       (Class348_Sub16_Sub3.method2878
			(((Class348_Sub27) class348_sub27).anInt6899,
			 ((Class348_Sub27) class348_sub27).anInt6905,
			 ((Class348_Sub27) class348_sub27).anInt6896)));
	    if (interface10 == null) {
		((Class348_Sub27) class348_sub27).anInt6892 = 0;
		((Class348_Sub27) class348_sub27).anInt6902 = -1;
		((Class348_Sub27) class348_sub27).anInt6903 = 0;
	    } else {
		((Class348_Sub27) class348_sub27).anInt6902
		    = interface10.method42(-103);
		((Class348_Sub27) class348_sub27).anInt6903
		    = interface10.method39(111);
		((Class348_Sub27) class348_sub27).anInt6892
		    = interface10.method41(-32228);
	    }
	}
    }
    
    static final void method1388(int i, int i_4_, int i_5_, int i_6_, int i_7_,
				 int i_8_) {
	Class135_Sub2.method1156(-27, i_6_, AnimationDefinition.anIntArrayArray255[i++],
				 i_7_, i_4_);
	anInt2472++;
	Class135_Sub2.method1156(-27, i_6_, AnimationDefinition.anIntArrayArray255[i_8_--],
				 i_7_, i_4_);
	int i_9_ = -52 / ((i_5_ - -32) / 55);
	for (int i_10_ = i; i_8_ >= i_10_; i_10_++) {
	    int[] is = AnimationDefinition.anIntArrayArray255[i_10_];
	    is[i_7_] = is[i_6_] = i_4_;
	}
    }
    
    /*synthetic*/ static Class method1389(String string) {
	try {
	    return Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	aBoolean2469 = false;
    }
}
