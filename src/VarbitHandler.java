/* VarbitHandler - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class VarbitHandler implements ConfigHandler
{
    static int anInt5062;
    int[] configs;
    static int anInt5064;
    static int anInt5065;
    static int anInt5066;
    static Class237_Sub1 aClass237_Sub1_5067;
    static int anInt5068;
    static int anInt5069;
    private HashTable accessTimes = new HashTable(128);
    static int anInt5071;
    static int anInt5072;
    static int anInt5073;
    static int anInt5074;
    static int anInt5075;
    static int anInt5076;
    static int anInt5077;
    private int[] queue;
    static int anInt5079;
    static int anInt5080;
    static int anInt5081;
    
    final int handleQueuedConfig(boolean fromFront) {
	anInt5071++;
	long currentTime = Class62.getCurrentTimeMillis();
	for (LongNode node = (fromFront ? (LongNode) accessTimes.method3484(0) : (LongNode) accessTimes.method3482(0)); node != null; node = (LongNode) accessTimes.method3482(0)) {
	    if (((((LongNode) node).value & 0x3fffffffffffffffL) ^ 0xffffffffffffffffL) > (currentTime ^ 0xffffffffffffffffL)) {
		if ((0x4000000000000000L & ((LongNode) node).value) != 0L) {
		    int settingId = (int) ((Node) node).nodeKey;
		    ((VarbitHandler) this).configs[settingId] = queue[settingId];
		    node.removeNode();
		    return settingId;
		}
		node.removeNode();
	    }
	}
	return -1;
    }
    
    final void putConfig(int settingId, int value) {
        anInt5066++;
        ((VarbitHandler) this).configs[settingId] = value;
        LongNode node = ((LongNode) accessTimes.get((long) settingId));
        if (node == null) {
            node = new LongNode(500L + Class62.getCurrentTimeMillis());
            accessTimes.putNode((long) settingId, node);
        } else
            ((LongNode) node).value = Class62.getCurrentTimeMillis() + 500L;
    }
    
    public final int getSetting(int id) {
	anInt5068++;
	VarbitDefinition config = Class229.scriptConfigLoader.method1446(id, -1);
	int configId = ((VarbitDefinition) config).id;
	int lowBit = ((VarbitDefinition) config).lowestBit;
	int highBit = ((VarbitDefinition) config).highestBit;
	int mask = Class129.maskTable[-lowBit + highBit];
	return ((VarbitHandler) this).configs[configId] >> lowBit & mask;
    }
    
    final void putSetting(int id, int value) {
	anInt5074++;
	VarbitDefinition class146 = Class229.scriptConfigLoader.method1446(id, -1);
	int configId = ((VarbitDefinition) class146).id;
	int lowBit = ((VarbitDefinition) class146).lowestBit;
	int highBit = ((VarbitDefinition) class146).highestBit;
	int mask = Class129.maskTable[-lowBit + highBit];
	if (-1 < (value ^ 0xffffffff) || (value ^ 0xffffffff) < (mask ^ 0xffffffff))
	    value = 0;
	mask <<= lowBit;
	putConfig(configId, value << lowBit & mask | (((VarbitHandler) this).configs[configId]) & (mask ^ 0xffffffff));
    }
    
    static final void method1308(int i, int i_14_, int i_15_, int i_16_,
				 byte i_17_, int i_18_, int i_19_, int i_20_) {
	anInt5072++;
	if (Class369.anInt4960 <= i_15_ && i_19_ <= Class113.anInt1745
	    && i_14_ >= Class132.anInt1910 && Class38.anInt513 >= i_20_)
	    Class239_Sub3.method1730(i_16_, i_20_, i_14_, i_19_, i, i_18_,
				     -128, i_15_);
	else
	    s_Sub3.method4004(i_20_, i_19_, i_14_, i, i_18_, -80, i_15_,
			      i_16_);
	if (i_17_ > -113)
	    aClass237_Sub1_5067 = null;
    }
    
    static final void method1309(boolean bool, int i) {
	if (ObjectDefinition.loadingHandler == null)
	    Class70.initializeLoadingHandler(92);
	if (i < 116)
	    aClass237_Sub1_5067 = null;
	anInt5062++;
	if (bool)
	    ObjectDefinition.loadingHandler.method2326(96);
    }
    
    public static void method1310(boolean bool) {
	if (bool == true)
	    aClass237_Sub1_5067 = null;
    }
    
    static final void method1311(int i, AbstractToolkit var_ha) {
	Class199.aClass352Array2636 = new GameFont[Class348_Sub1.anIntArray6547.length];
	anInt5064++;
	if (i != 5139)
	    anInt5065 = 62;
	for (int i_21_ = 0; ((Class348_Sub1.anIntArray6547.length ^ 0xffffffff)
			     < (i_21_ ^ 0xffffffff)); i_21_++) {
	    int i_22_ = Class348_Sub1.anIntArray6547[i_21_];
	    BitmapFont class143 = Class239_Sub10.createBitmapFont((byte) -86, i_22_,
							  s.fontIndexLoader);
	    AbstractFontRasterizer class324
		= var_ha.createFontRasterizer(class143,
				    Sprite.method1523(Class39.spriteIndexLoader,
							i_22_),
				    true);
	    Class199.aClass352Array2636[i_21_]
		= new GameFont(class324, class143);
	}
    }
    
    static final ColorNode method1312(byte i, ByteBuffer class348_sub49) {
	anInt5075++;
	int i_23_ = class348_sub49.getDWord();
	if (i < 47)
	    method1315(4);
	return new ColorNode(i_23_);
    }
    
    final void putQueuedConfig(int configId, int value) {
	anInt5073++;
	queue[configId] = value;
	LongNode node = ((LongNode) accessTimes.get((long) configId));
	if (node == null) {
	    node = new LongNode(4611686018427387905L);
	    accessTimes.putNode((long) configId, node);
	} else if (((LongNode) node).value != 4611686018427387905L)
	    ((LongNode) node).value = 0x4000000000000000L | 500L + Class62.getCurrentTimeMillis();
    }
    
    final void reset() {
	for (int i_26_ = 0; ((((Class217) Class269.aClass217_3453).anInt2845 ^ 0xffffffff)
	      < (i_26_ ^ 0xffffffff));
	     i_26_++) {
	    Class159 class159
		= Class269.aClass217_3453.method1588(-105, i_26_);
	    if (class159 != null
		&& (((Class159) class159).anInt2125 ^ 0xffffffff) == -1) {
		queue[i_26_] = 0;
		((VarbitHandler) this).configs[i_26_] = 0;
	    }
	}
	anInt5076++;
	accessTimes = new HashTable(128);
    }
    
    public final int getRawConfig(int i) {
	anInt5081++;
	return ((VarbitHandler) this).configs[i];
    }
    
    static final void method1315(int i) {
	anInt5077++;
	if (Class318_Sub1_Sub5.aClass144_8766 != null) {
	    if ((Class318_Sub1_Sub5.aClass144_8766.state ^ 0xffffffff)
		== -2) {
		Class318_Sub1_Sub5.aClass144_8766 = null;
		return;
	    }
	    if (Class318_Sub1_Sub5.aClass144_8766.state == 2) {
		Class348_Sub16_Sub3.method2862(ModernLoadingScreen.aClass297_5017,
					       Class348_Sub42_Sub8.aString9554,
					       -120, 2);
		Class318_Sub1_Sub5.aClass144_8766 = null;
		return;
	    }
	}
	int i_29_ = -31 / ((-29 - i) / 61);
    }
    
    final void putQueuedSetting(int id, int value) {
	anInt5069++;
	VarbitDefinition class146 = Class229.scriptConfigLoader.method1446(id, -1);
	int i_32_ = ((VarbitDefinition) class146).id;
	int shift = ((VarbitDefinition) class146).lowestBit;
        int i_34_ = ((VarbitDefinition) class146).highestBit;
        int i_35_ = Class129.maskTable[i_34_ - shift];
        if ((value ^ 0xffffffff) > -1 || i_35_ < value)
            value = 0;
        i_35_ <<= shift;
        putQueuedConfig(i_32_, value << shift & i_35_ | (i_35_ ^ 0xffffffff) & queue[i_32_]);
    }
    
    static final boolean method1317(int i, byte i_36_, int i_37_) {
	anInt5079++;
	if (i_36_ >= -67)
	    method1317(43, (byte) 36, 20);
	if (!(ClassicLoadingScreen.method2217(i, i_37_, 0) | (i_37_ & 0x70000) != 0)
	    && !Class264.method2015(i_37_, i, 7))
	    return false;
	return true;
    }
    
    static final void method1318(int i) {
	if (i != -65536)
	    method1310(false);
	for (int i_38_ = 0; i_38_ < Class101.anInt1597; i_38_++) {
	    int i_39_ = Class13.anIntArray224[i_38_];
	    Npc npc
		= (((Class348_Sub22) (Class348_Sub22)
		    Class282.aClass356_3654.get((long) i_39_))
		   .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
	    int i_40_ = Class299.gameBuffer.getUByte();
	    if ((0x10 & i_40_ ^ 0xffffffff) != -1)
		i_40_ += Class299.gameBuffer
			     .getUByte() << -1561154840;
	    if ((0x2 & i_40_) != 0) {
		if (((Npc) npc).definition.method793(i ^ ~0xffff))
		    Class5.method181(true, npc);
		npc.method2448((Class189.npcLoader.getNpcDefinition(Class299.gameBuffer.method3355(-1), -1)), -2);
		npc.method2434
		    ((byte) 95, ((NpcDefinition) (((Npc)
					     npc)
					    .definition)).anInt1399);
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10310
		    = ((NpcDefinition) (((Npc)
				   npc)
				  .definition)).anInt1329 << -572056477;
		if (((Npc)
		     npc)
			.definition.method793(0))
		    Class223.method1614(979190089,
					npc,
					(((Class318_Sub1)
					  npc)
					 .aByte6381),
					(((Class318_Sub1_Sub3_Sub3)
					  npc)
					 .anIntArray10317[0]),
					(((Class318_Sub1_Sub3_Sub3)
					  npc)
					 .anIntArray10320[0]),
					null, null, 0);
	    }
	    if ((0x8 & i_40_ ^ 0xffffffff) != -1) {
		int[] is = new int[4];
		for (int i_41_ = 0; (i_41_ ^ 0xffffffff) > -5; i_41_++) {
		    is[i_41_] = Class299.gameBuffer
				    .getShort();
		    if (is[i_41_] == 65535)
			is[i_41_] = -1;
		}
		int i_42_ = Class299.gameBuffer
				.method3342();
		Class348_Sub17.method2931(i_42_, (byte) 115, is,
					  npc);
	    }
	    if ((i_40_ & 0x20) != 0) {
		int i_43_
		    = Class299.gameBuffer.readLEShort(false);
		int i_44_
		    = Class299.gameBuffer.method3343((byte) 82);
		if ((i_43_ ^ 0xffffffff) == -65536)
		    i_43_ = -1;
		int i_45_ = Class299.gameBuffer.getUByte();
		int i_46_ = 0x7 & i_45_;
		int i_47_ = (i_45_ & 0x79) >> 1196815907;
		if ((i_47_ ^ 0xffffffff) == -16)
		    i_47_ = -1;
		npc.method2437(i_46_, i_43_,
							i ^ 0x3c569b2e, i_47_,
							false, i_44_);
	    }
	    if ((0x4000 & i_40_) != 0) {
		int i_48_
		    = Class299.gameBuffer.method3329((byte) 21);
		int[] is = new int[i_48_];
		int[] is_49_ = new int[i_48_];
		int[] is_50_ = new int[i_48_];
		for (int i_51_ = 0;
		     (i_51_ ^ 0xffffffff) > (i_48_ ^ 0xffffffff); i_51_++) {
		    int i_52_ = Class299.gameBuffer
				    .getShort();
		    if ((i_52_ ^ 0xffffffff) == -65536)
			i_52_ = -1;
		    is[i_51_] = i_52_;
		    is_49_[i_51_] = Class299.gameBuffer
					.method3329((byte) 21);
		    is_50_[i_51_]
			= Class299.gameBuffer.readLEShort128(-109);
		}
		Class367_Sub8.method3548(-7387, npc,
					 is_50_, is, is_49_);
	    }
	    if ((i_40_ & 0x200) != 0) {
		int i_53_ = Class299.gameBuffer
				.method3342();
		int[] is = new int[i_53_];
		int[] is_54_ = new int[i_53_];
		for (int i_55_ = 0;
		     (i_55_ ^ 0xffffffff) > (i_53_ ^ 0xffffffff); i_55_++) {
		    int i_56_
			= Class299.gameBuffer.method3355(124);
		    if ((0xc000 & i_56_ ^ 0xffffffff) == -49153) {
			int i_57_ = Class299.gameBuffer
					.getShort();
			is[i_55_]
			    = Class273.method2057(i_57_, i_56_ << -1521885072);
		    } else
			is[i_55_] = i_56_;
		    is_54_[i_55_] = Class299.gameBuffer
					.getShort();
		}
		npc.method2430(is_54_, is, -100);
	    }
	    if ((0x4 & i_40_) != 0) {
		((Npc) npc)
		    .anInt10499
		    = Class299.gameBuffer.method3355(124);
		((Npc) npc)
		    .anInt10512
		    = Class299.gameBuffer.readLEShort(false);
	    }
	    if ((0x1000 & i_40_) != 0) {
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10293
		    = Class299.gameBuffer.method3345(-27697);
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10314
		    = Class299.gameBuffer.method3345(-27697);
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10241
		    = Class299.gameBuffer.getByte();
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10288
		    = Class299.gameBuffer.method3345(-27697);
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10239
		    = (Class299.gameBuffer.readLEShort(false)
		       + Class367_Sub11.logicCycle);
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10300
		    = (Class299.gameBuffer.method3355(12)
		       - -Class367_Sub11.logicCycle);
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10231
		    = Class299.gameBuffer.method3342();
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10314
		    += ((Class318_Sub1_Sub3_Sub3)
			npc).anIntArray10317[0];
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10322
		    = 0;
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10288
		    += ((Class318_Sub1_Sub3_Sub3)
			npc).anIntArray10317[0];
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10293
		    += ((Class318_Sub1_Sub3_Sub3)
			npc).anIntArray10320[0];
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10241
		    += ((Class318_Sub1_Sub3_Sub3)
			npc).anIntArray10320[0];
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10319
		    = 1;
	    }
	    if ((i_40_ & 0x2000) != 0) {
		((Class318_Sub1_Sub3_Sub3) npc)
		    .aByte10255
		    = Class299.gameBuffer
			  .method3361(-622951480);
		((Class318_Sub1_Sub3_Sub3) npc)
		    .aByte10206
		    = Class299.gameBuffer.method3345(-27697);
		((Class318_Sub1_Sub3_Sub3) npc)
		    .aByte10270
		    = Class299.gameBuffer
			  .method3361(i + -622885944);
		((Class318_Sub1_Sub3_Sub3) npc)
		    .aByte10279
		    = (byte) Class299.gameBuffer
				 .getUByte();
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10248
		    = Class367_Sub11.logicCycle + Class299
						     .gameBuffer
						     .getShort();
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10250
		    = Class367_Sub11.logicCycle + Class299
						     .gameBuffer
						     .getShort();
	    }
	    if ((i_40_ & 0x40 ^ 0xffffffff) != -1) {
		int i_58_ = Class299.gameBuffer
				.method3342();
		if (i_58_ > 0) {
		    for (int i_59_ = 0;
			 (i_59_ ^ 0xffffffff) > (i_58_ ^ 0xffffffff);
			 i_59_++) {
			int i_60_ = -1;
			int i_61_ = -1;
			int i_62_ = -1;
			int i_63_ = Class299.gameBuffer
					.getSmartA();
			if (i_63_ != 32767) {
			    if ((i_63_ ^ 0xffffffff) != -32767)
				i_61_ = Class299.gameBuffer
					    .getSmartA();
			    else
				i_63_ = -1;
			} else {
			    i_63_ = Class299.gameBuffer
					.getSmartA();
			    i_61_ = Class299.gameBuffer
					.getSmartA();
			    i_60_ = Class299.gameBuffer
					.getSmartA();
			    i_62_ = Class299.gameBuffer
					.getSmartA();
			}
			int i_64_ = Class299.gameBuffer
					.getSmartA();
			int i_65_ = Class299.gameBuffer
					.getUByte();
			npc.method2438
			    (i_61_, Class367_Sub11.logicCycle, i_63_, i_62_,
			     i_60_, i_64_, i_65_, (byte) 124);
		    }
		}
	    }
	    if ((i_40_ & 0x80 ^ 0xffffffff) != -1) {
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10275
		    = Class299.gameBuffer.getShort();
		if ((((Class318_Sub1_Sub3_Sub3) npc)
		     .anInt10275)
		    == 65535)
		    ((Class318_Sub1_Sub3_Sub3) npc)
			.anInt10275
			= -1;
	    }
	    if ((0x1 & i_40_) != 0) {
		((Class318_Sub1_Sub3_Sub3) npc)
		    .aString10292
		    = Class299.gameBuffer
			  .getJStr();
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10264
		    = 100;
	    }
	    if ((i_40_ & 0x800 ^ 0xffffffff) != -1) {
		int i_66_
		    = Class299.gameBuffer.getShort();
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10227
		    = Class299.gameBuffer
			  .method3342();
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10271
		    = Class299.gameBuffer
			  .method3342();
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10210
		    = 0x7fff & i_66_;
		((Class318_Sub1_Sub3_Sub3) npc)
		    .aBoolean10226
		    = (0x8000 & i_66_) != 0;
		((Class318_Sub1_Sub3_Sub3) npc)
		    .anInt10287
		    = (((Class318_Sub1_Sub3_Sub3)
			npc).anInt10227
		       + Class367_Sub11.logicCycle
		       + ((Class318_Sub1_Sub3_Sub3)
			  npc).anInt10210);
	    }
	    if ((i_40_ & 0x400) != 0) {
		int i_67_
		    = Class299.gameBuffer.readLEShort(false);
		int i_68_ = Class299.gameBuffer
				.method3364((byte) -127);
		if ((i_67_ ^ 0xffffffff) == -65536)
		    i_67_ = -1;
		int i_69_ = Class299.gameBuffer
				.method3342();
		int i_70_ = i_69_ & 0x7;
		int i_71_ = (i_69_ & 0x7e) >> -776504605;
		if (i_71_ == 15)
		    i_71_ = -1;
		npc.method2437(i_70_, i_67_,
							i ^ 0x3c569b2e, i_71_,
							true, i_68_);
	    }
	}
	anInt5080++;
    }
    
    public VarbitHandler() {
	((VarbitHandler) this).configs = new int[((Class217) Class269.aClass217_3453).anInt2845];
	queue = new int[((Class217) Class269.aClass217_3453).anInt2845];
    }
}
