/* Class239_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

final class Class239_Sub24 extends Class239
{
    static int anInt6084;
    static int anInt6085;
    static int anInt6086;
    static int anInt6087;
    static int anInt6088;
    static IncomingPacket aClass114_6089 = new IncomingPacket(41, 3);
    static int anInt6090;
    static int anInt6091;
    static int anInt6092;
    static String[][] aStringArrayArray6093
	= { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" },
	    { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };
    static int anInt6094;
    static int anInt6095;
    static Cache aClass60_6096 = new Cache(8);
    static RasterToolkit aClass105_6097;
    static Class299 aClass299_6098;
    
    final void method1712(int i, int i_0_) {
	int i_1_ = -73 % ((i - 82) / 35);
	((Class239) this).anInt3138 = i_0_;
	anInt6085++;
    }
    
    Class239_Sub24(Class348_Sub51 class348_sub51) {
	super(class348_sub51);
    }
    
    final int method1820(int i) {
	if (i != -32350)
	    return -43;
	anInt6091++;
	return ((Class239) this).anInt3138;
    }
    
    static final byte[] loadFile(int i, File file) {
	anInt6086++;
	int i_2_ = 34 % ((i - 31) / 39);
	return Class327.loadFile((int) file.length(), file, 121);
    }
    
    public static void method1822(byte i) {
	aClass114_6089 = null;
	aClass60_6096 = null;
	aClass105_6097 = null;
	aStringArrayArray6093 = null;
	aClass299_6098 = null;
	if (i != 110)
	    aClass299_6098 = null;
    }
    
    final int method1710(int i) {
	if (i != 20014)
	    return -20;
	anInt6084++;
	return 1;
    }
    
    final int method1714(int i, int i_3_) {
	anInt6092++;
	if (((Class239) this).aClass348_Sub51_3136.method3422(674)
	    == Class10.aClass230_186) {
	    if (((Class239) this).aClass348_Sub51_3136.method3425(i + -70))
		return 3;
	    if ((i_3_ ^ 0xffffffff) == -1
		|| ((Class348_Sub51) ((Class239) this).aClass348_Sub51_3136)
		       .aClass239_Sub9_7256.method1759(-32350) == 1)
		return 1;
	    return 2;
	}
	if (i != 3)
	    method1716(true);
	return 3;
    }
    
    static final void method1823(AbstractToolkit var_ha, int i, int i_4_, byte i_5_) {
	anInt6088++;
	int i_6_ = 56 % ((68 - i_5_) / 58);
	if (i >= 0 && (i_4_ ^ 0xffffffff) <= -1
	    && (Class18.anInt282 ^ 0xffffffff) != -1
	    && (Class305.anInt3861 ^ 0xffffffff) != -1) {
	    Class101 class101;
	    int i_7_;
	    int i_8_;
	    int i_9_;
	    int i_10_;
	    int i_11_;
	    int i_12_;
	    if (!Class59_Sub1.aBoolean5300) {
		var_ha.DA(Class336.anInt4171, Class205.anInt2688,
			  Class18.anInt282, Class305.anInt3861);
		i_8_ = Class205.anInt2688;
		i_9_ = Class305.anInt3861;
		i_7_ = Class336.anInt4171;
		i_10_ = Class18.anInt282;
		var_ha.setDimensions(Class120.anInt4911, SocketConnection.anInt5832,
			  Class18.anInt282, Class305.anInt3861);
		class101 = var_ha.method3654();
		class101.method903(Class14_Sub4.anInt8633,
				   Class59_Sub2_Sub1.anInt8668,
				   Class43.anInt620, Class348_Sub44.anInt7092,
				   Class281.anInt3650,
				   Class348_Sub51.anInt7244);
		var_ha.method3638(class101);
		i_12_ = i_4_;
		i_11_ = i;
	    } else {
		Queue.method1010(false, false);
		class101 = var_ha.method3640();
		int[] is = var_ha.Y();
		i_7_ = is[0];
		i_8_ = is[1];
		i_9_ = is[3];
		i_10_ = is[2];
		i_11_ = i + Class121.method1082(-81, false);
		i_12_ = Class348_Sub23.method2960(false, -52) + i_4_;
	    }
	    Class226.method1626(1, true);
	    if ((i_10_ ^ 0xffffffff) == -1)
		i_10_ = 1;
	    if (i_9_ == 0)
		i_9_ = 1;
	    if (Class348_Sub1_Sub1.aSArray8801 != null
		&& (!r.aBoolean9722 || (0x40 & Class38.anInt500) != 0)) {
		int i_13_ = -1;
		int i_14_ = -1;
		int i_15_ = var_ha.i();
		int i_16_ = var_ha.XA();
		int i_17_;
		int i_18_;
		int i_19_;
		int i_20_;
		if (!Class305.aBoolean3870) {
		    i_17_ = i_15_ * (-i_7_ + i_11_) / i_10_;
		    i_19_ = i_15_ * (i_12_ + -i_8_) / i_9_;
		    i_20_ = i_16_ * (-i_8_ + i_12_) / i_9_;
		    i_18_ = (i_11_ - i_7_) * i_16_ / i_10_;
		} else {
		    i_17_ = i_18_
			= Class132.anInt1906 * (-i_7_ + i_11_) / i_10_;
		    i_19_ = i_20_
			= Class132.anInt1906 * (-i_8_ + i_12_) / i_9_;
		}
		int[] is = { i_17_, i_19_, i_15_ };
		int[] is_21_ = { i_18_, i_20_, i_16_ };
		class101.method890(is);
		class101.method890(is_21_);
		float f = Class108.method1012((float) is[1], (float) is_21_[0],
					      (float) is[2], (float) is_21_[2],
					      4, (float) is[0], (byte) 123,
					      (float) is_21_[1]);
		if (f > 0.0F) {
		    int i_22_ = is_21_[0] + -is[0];
		    int i_23_ = -is[2] + is_21_[2];
		    int i_24_ = (int) ((float) is[0] + (float) i_22_ * f);
		    int i_25_ = (int) ((float) is[2] + (float) i_23_ * f);
		    i_13_ = (Class132.localPlayer
				 .method2436((byte) 71) + -1
			     << 1815171976) + i_24_ >> -2137959831;
		    i_14_
			= i_25_ - -(Class132
					.localPlayer
					.method2436((byte) 73) + -1
				    << -1176190008) >> -1962267255;
		    int i_26_ = (((Class318_Sub1)
				  Class132.localPlayer)
				 .aByte6381);
		    if (i_26_ < 3
			&& ((0x2 & (Class348_Sub33.aByteArrayArrayArray6962[1]
				    [i_24_ >> 499347017][i_25_ >> -149021879]))
			    != 0))
			i_26_++;
		}
		if (i_13_ != -1 && i_14_ != -1) {
		    if (!r.aBoolean9722 || (0x40 & Class38.anInt500) == 0) {
			if (Class122.aBoolean1801)
			    Class50_Sub3.method466
				(false, "", i_14_, (byte) -109, true, i_13_,
				 -1, true, 12,
				 (long) (i_14_ | i_13_ << 1788797600),
				 (GameText.aClass274_3510.getLanguageText
				  (Class348_Sub33.gameLanguage)),
				 0L, -1);
			GameFont.anInt4334++;
			Class50_Sub3.method466(false, "", i_14_, (byte) -82,
					       true, i_13_, -1, true, 19,
					       (long) (i_14_
						       | i_13_ << 1196643744),
					       Class239_Sub4.aString5882, 0L,
					       Class333.anInt4144);
		    } else {
			Widget class46
			    = Class348_Sub22.getWidgetChild(Class9.anInt169,
							Class149.anInt2046);
			if (class46 == null)
			    Class341.method2678(-2049);
			else
			    Class50_Sub3.method466(false, " ->", i_14_,
						   (byte) -101, true, i_13_,
						   -1, true, 15,
						   (long) (i_13_ << 2084983008
							   | i_14_),
						   Class28.aString5001, 0L,
						   (FloatBuffer
						    .anInt9747));
		    }
		}
	    }
	    if (Class59_Sub1.aBoolean5300)
		Class285_Sub1.method2129((byte) 86);
	    for (int i_27_ = 0;
		 (((!Class59_Sub1.aBoolean5300 ? 1 : 2) ^ 0xffffffff)
		  < (i_27_ ^ 0xffffffff));
		 i_27_++) {
		boolean bool = i_27_ == 0;
		Class76 class76 = (bool ? Class71.aClass76_1208
				   : Class348_Sub42_Sub8_Sub2.aClass76_10436);
		int i_28_ = i;
		int i_29_ = i_4_;
		if (Class59_Sub1.aBoolean5300) {
		    Queue.method1010(false, bool);
		    i_28_ += Class121.method1082(-92, bool);
		    i_29_ += Class348_Sub23.method2960(bool, -48);
		}
		Class243 class243 = ((Class76) class76).aClass243_1282;
		for (Class318_Sub4 class318_sub4
			 = (Class318_Sub4) class243.method1872(8);
		     class318_sub4 != null;
		     class318_sub4
			 = (Class318_Sub4) class243.method1878((byte) -123)) {
		    if ((RuntimeException_Sub1.aBoolean4599
			 || ((((Class318_Sub1)
			       Class132.localPlayer)
			      .aByte6381)
			     == ((Class318_Sub1)
				 (((Class318_Sub4) class318_sub4)
				  .aClass318_Sub1_6410)).aByte6381))
			&& class318_sub4.method2504(i_29_, i_28_, var_ha,
						    -115)) {
			boolean bool_30_ = false;
			boolean bool_31_ = false;
			int i_32_;
			int i_33_;
			if (((Class318_Sub4) class318_sub4).aClass318_Sub1_6410
			    instanceof Class318_Sub1_Sub3) {
			    i_32_ = ((Class318_Sub1_Sub3) (Class318_Sub1_Sub3)
				     (((Class318_Sub4) class318_sub4)
				      .aClass318_Sub1_6410)).aShort8750;
			    i_33_ = ((Class318_Sub1_Sub3) (Class318_Sub1_Sub3)
				     (((Class318_Sub4) class318_sub4)
				      .aClass318_Sub1_6410)).aShort8743;
			} else {
			    i_32_ = (((Class318_Sub1)
				      (((Class318_Sub4) class318_sub4)
				       .aClass318_Sub1_6410)).anInt6388
				     >> 1531405961);
			    i_33_ = (((Class318_Sub1)
				      (((Class318_Sub4) class318_sub4)
				       .aClass318_Sub1_6410)).anInt6377
				     >> -1761317527);
			}
			if (((Class318_Sub4) class318_sub4).aClass318_Sub1_6410
			    instanceof Player) {
			    Player class318_sub1_sub3_sub3_sub2
				= ((Player)
				   (((Class318_Sub4) class318_sub4)
				    .aClass318_Sub1_6410));
			    int i_34_ = class318_sub1_sub3_sub3_sub2
					    .method2436((byte) 78);
			    if (((0x1 & i_34_ ^ 0xffffffff) == -1
				 && (0x1ff & (((Class318_Sub1)
					       class318_sub1_sub3_sub3_sub2)
					      .anInt6377)) == 0
				 && (0x1ff & (((Class318_Sub1)
					       class318_sub1_sub3_sub3_sub2)
					      .anInt6388)
				     ^ 0xffffffff) == -1)
				|| ((i_34_ & 0x1 ^ 0xffffffff) == -2
				    && ((((Class318_Sub1)
					  class318_sub1_sub3_sub3_sub2)
					 .anInt6377) & 0x1ff
					^ 0xffffffff) == -257
				    && ((((Class318_Sub1)
					  class318_sub1_sub3_sub3_sub2)
					 .anInt6388)
					& 0x1ff) == 256)) {
				int i_35_
				    = (((Class318_Sub1)
					class318_sub1_sub3_sub3_sub2).anInt6377
				       - (-1 + class318_sub1_sub3_sub3_sub2
						   .method2436((byte) 82)
					  << 1764881480));
				int i_36_
				    = (((Class318_Sub1)
					class318_sub1_sub3_sub3_sub2).anInt6388
				       + -(-1 + class318_sub1_sub3_sub3_sub2
						    .method2436((byte) 105)
					   << 1426659528));
				for (int i_37_ = 0;
				     ((i_37_ ^ 0xffffffff)
				      > (Class150.anInt2057 ^ 0xffffffff));
				     i_37_++) {
				    Class348_Sub22 class348_sub22
					= ((Class348_Sub22)
					   (Class282.aClass356_3654.get
					    ((long) (Class74.anIntArray1233
						     [i_37_]))));
				    if (class348_sub22 != null) {
					Npc class318_sub1_sub3_sub3_sub1
					    = (((Class348_Sub22)
						class348_sub22)
					       .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
					if ((((((Class318_Sub1_Sub3_Sub3)
						class318_sub1_sub3_sub3_sub1)
					       .anInt10215)
					      ^ 0xffffffff)
					     != (Class367_Sub11.logicCycle
						 ^ 0xffffffff))
					    && (((Class318_Sub1_Sub3_Sub3)
						 class318_sub1_sub3_sub3_sub1)
						.aBoolean10309)) {
					    int i_38_
						= ((((Class318_Sub1)
						     class318_sub1_sub3_sub3_sub1)
						    .anInt6377)
						   - ((((NpcDefinition)
							(((Npc)
							  class318_sub1_sub3_sub3_sub1)
							 .definition))
						       .anInt1399) + -1
						      << 896661000));
					    int i_39_
						= (-((-1
						      + (((NpcDefinition)
							  (((Npc)
							    class318_sub1_sub3_sub3_sub1)
							   .definition))
							 .anInt1399))
						     << 1588361832)
						   + (((Class318_Sub1)
						       class318_sub1_sub3_sub3_sub1)
						      .anInt6388));
					    if (i_35_ <= i_38_
						&& (((((NpcDefinition)
						       (((Npc)
							 class318_sub1_sub3_sub3_sub1)
							.definition))
						      .anInt1399)
						     ^ 0xffffffff)
						    >= ((-(i_38_ + -i_35_
							   >> 1809057289)
							 + (class318_sub1_sub3_sub3_sub2
								.method2436
							    ((byte) 68)))
							^ 0xffffffff))
						&& i_36_ <= i_39_
						&& (((((NpcDefinition)
						       (((Npc)
							 class318_sub1_sub3_sub3_sub1)
							.definition))
						      .anInt1399)
						     ^ 0xffffffff)
						    >= ((-(-i_36_ + i_39_
							   >> 2135088393)
							 + (class318_sub1_sub3_sub3_sub2
								.method2436
							    ((byte) 97)))
							^ 0xffffffff))) {
						Class286_Sub3.method2150
						    ((((((Class318_Sub1)
							 (Class132
							  .localPlayer))
							.aByte6381)
						       ^ 0xffffffff)
						      != ((((Class318_Sub1)
							    (((Class318_Sub4)
							      class318_sub4)
							     .aClass318_Sub1_6410))
							   .aByte6381)
							  ^ 0xffffffff)),
						     false,
						     class318_sub1_sub3_sub3_sub1);
						((Class318_Sub1_Sub3_Sub3)
						 class318_sub1_sub3_sub3_sub1)
						    .anInt10215
						    = Class367_Sub11.logicCycle;
					    }
					}
				    }
				}
				int i_40_ = Class328_Sub1.anInt6513;
				int[] is = Class286_Sub7.anIntArray6290;
				for (int i_41_ = 0;
				     ((i_41_ ^ 0xffffffff)
				      > (i_40_ ^ 0xffffffff));
				     i_41_++) {
				    Player class318_sub1_sub3_sub3_sub2_42_
					= (ClassicLoadingScreen
					   .players
					   [is[i_41_]]);
				    if ((class318_sub1_sub3_sub3_sub2_42_
					 != null)
					&& (Class367_Sub11.logicCycle
					    != (((Class318_Sub1_Sub3_Sub3)
						 class318_sub1_sub3_sub3_sub2_42_)
						.anInt10215))
					&& (class318_sub1_sub3_sub3_sub2
					    != class318_sub1_sub3_sub3_sub2_42_)
					&& (((Class318_Sub1_Sub3_Sub3)
					     class318_sub1_sub3_sub3_sub2_42_)
					    .aBoolean10309)) {
					int i_43_
					    = ((((Class318_Sub1)
						 class318_sub1_sub3_sub3_sub2_42_)
						.anInt6377)
					       + -((class318_sub1_sub3_sub3_sub2_42_
							.method2436((byte) 94)
						    - 1)
						   << -1994364120));
					int i_44_
					    = ((((Class318_Sub1)
						 class318_sub1_sub3_sub3_sub2_42_)
						.anInt6388)
					       + -((-1
						    + (class318_sub1_sub3_sub3_sub2_42_
							   .method2436
						       ((byte) 82)))
						   << -1058179480));
					if (((i_35_ ^ 0xffffffff)
					     >= (i_43_ ^ 0xffffffff))
					    && ((class318_sub1_sub3_sub3_sub2_42_
						     .method2436((byte) 89)
						 ^ 0xffffffff)
						>= ((class318_sub1_sub3_sub3_sub2
							 .method2436((byte) 70)
						     - (-i_35_ + i_43_
							>> 434911209))
						    ^ 0xffffffff))
					    && ((i_36_ ^ 0xffffffff)
						>= (i_44_ ^ 0xffffffff))
					    && ((class318_sub1_sub3_sub3_sub2_42_
						     .method2436((byte) 127)
						 ^ 0xffffffff)
						>= ((class318_sub1_sub3_sub3_sub2
							 .method2436((byte) 42)
						     - (i_44_ - i_36_
							>> -140208471))
						    ^ 0xffffffff))) {
					    Class348_Sub43.method3298
						((byte) 114,
						 (((((Class318_Sub1)
						     (Class132
						      .localPlayer))
						    .aByte6381)
						   ^ 0xffffffff)
						  != ((((Class318_Sub1)
							(((Class318_Sub4)
							  class318_sub4)
							 .aClass318_Sub1_6410))
						       .aByte6381)
						      ^ 0xffffffff)),
						 class318_sub1_sub3_sub3_sub2_42_);
					    ((Class318_Sub1_Sub3_Sub3)
					     class318_sub1_sub3_sub3_sub2_42_)
						.anInt10215
						= Class367_Sub11.logicCycle;
					}
				    }
				}
			    }
			    if (Class367_Sub11.logicCycle
				== ((Class318_Sub1_Sub3_Sub3)
				    class318_sub1_sub3_sub3_sub2).anInt10215)
				continue;
			    Class348_Sub43.method3298
				((byte) 96,
				 ((((Class318_Sub1)
				    (Class132
				     .localPlayer))
				   .aByte6381)
				  != ((Class318_Sub1)
				      (((Class318_Sub4) class318_sub4)
				       .aClass318_Sub1_6410)).aByte6381),
				 class318_sub1_sub3_sub3_sub2);
			    ((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub2).anInt10215
				= Class367_Sub11.logicCycle;
			}
			if (((Class318_Sub4) class318_sub4).aClass318_Sub1_6410
			    instanceof Npc) {
			    Npc class318_sub1_sub3_sub3_sub1
				= ((Npc)
				   (((Class318_Sub4) class318_sub4)
				    .aClass318_Sub1_6410));
			    if (((Npc)
				 class318_sub1_sub3_sub3_sub1).definition
				!= null) {
				if (((((NpcDefinition)
				       (((Npc)
					 class318_sub1_sub3_sub3_sub1)
					.definition)).anInt1399 & 0x1
				      ^ 0xffffffff) == -1
				     && ((0x1ff
					  & (((Class318_Sub1)
					      class318_sub1_sub3_sub3_sub1)
					     .anInt6377))
					 ^ 0xffffffff) == -1
				     && (0x1ff
					 & (((Class318_Sub1)
					     class318_sub1_sub3_sub3_sub1)
					    .anInt6388)) == 0)
				    || ((0x1
					 & ((NpcDefinition)
					    (((Npc)
					      class318_sub1_sub3_sub3_sub1)
					     .definition)).anInt1399) == 1
					&& (0x1ff
					    & (((Class318_Sub1)
						class318_sub1_sub3_sub3_sub1)
					       .anInt6377)) == 256
					&& ((((Class318_Sub1)
					      class318_sub1_sub3_sub3_sub1)
					     .anInt6388)
					    & 0x1ff) == 256)) {
				    int i_45_
					= ((((Class318_Sub1)
					     class318_sub1_sub3_sub3_sub1)
					    .anInt6377)
					   - ((-1
					       + ((NpcDefinition)
						  (((Npc)
						    class318_sub1_sub3_sub3_sub1)
						   .definition)).anInt1399)
					      << 904343880));
				    int i_46_
					= ((((Class318_Sub1)
					     class318_sub1_sub3_sub3_sub1)
					    .anInt6388)
					   - (((NpcDefinition)
					       (((Npc)
						 class318_sub1_sub3_sub3_sub1)
						.definition)).anInt1399 - 1
					      << -523292472));
				    for (int i_47_ = 0;
					 i_47_ < Class150.anInt2057; i_47_++) {
					Class348_Sub22 class348_sub22
					    = ((Class348_Sub22)
					       (Class282.aClass356_3654
						    .get
						((long) (Class74.anIntArray1233
							 [i_47_]))));
					if (class348_sub22 != null) {
					    Npc class318_sub1_sub3_sub3_sub1_48_
						= (((Class348_Sub22)
						    class348_sub22)
						   .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
					    if (((Class367_Sub11.logicCycle
						  ^ 0xffffffff)
						 != ((((Class318_Sub1_Sub3_Sub3)
						       class318_sub1_sub3_sub3_sub1_48_)
						      .anInt10215)
						     ^ 0xffffffff))
						&& (class318_sub1_sub3_sub3_sub1
						    != class318_sub1_sub3_sub3_sub1_48_)
						&& (((Class318_Sub1_Sub3_Sub3)
						     class318_sub1_sub3_sub3_sub1_48_)
						    .aBoolean10309)) {
						int i_49_
						    = (-((((NpcDefinition)
							   (((Npc)
							     class318_sub1_sub3_sub3_sub1_48_)
							    .definition))
							  .anInt1399) - 1
							 << 88355048)
						       + (((Class318_Sub1)
							   class318_sub1_sub3_sub3_sub1_48_)
							  .anInt6377));
						int i_50_
						    = ((((Class318_Sub1)
							 class318_sub1_sub3_sub3_sub1_48_)
							.anInt6388)
						       + -((((NpcDefinition)
							     (((Npc)
							       class318_sub1_sub3_sub3_sub1_48_)
							      .definition))
							    .anInt1399) - 1
							   << 714727304));
						if (i_49_ >= i_45_
						    && ((((((NpcDefinition)
							    (((Npc)
							      class318_sub1_sub3_sub3_sub1)
							     .definition))
							   .anInt1399)
							  - (-i_45_ + i_49_
							     >> 482546697))
							 ^ 0xffffffff)
							<= ((((NpcDefinition)
							      (((Npc)
								class318_sub1_sub3_sub3_sub1_48_)
							       .definition))
							     .anInt1399)
							    ^ 0xffffffff))
						    && ((i_50_ ^ 0xffffffff)
							<= (i_46_
							    ^ 0xffffffff))
						    && ((((((NpcDefinition)
							    (((Npc)
							      class318_sub1_sub3_sub3_sub1)
							     .definition))
							   .anInt1399)
							  + -(i_50_ + -i_46_
							      >> 1096173929))
							 ^ 0xffffffff)
							<= ((((NpcDefinition)
							      (((Npc)
								class318_sub1_sub3_sub3_sub1_48_)
							       .definition))
							     .anInt1399)
							    ^ 0xffffffff))) {
						    Class286_Sub3.method2150
							((((((Class318_Sub1)
							     (Class132
							      .localPlayer))
							    .aByte6381)
							   ^ 0xffffffff)
							  != ((((Class318_Sub1)
								(((Class318_Sub4)
								  class318_sub4)
								 .aClass318_Sub1_6410))
							       .aByte6381)
							      ^ 0xffffffff)),
							 false,
							 class318_sub1_sub3_sub3_sub1_48_);
						    ((Class318_Sub1_Sub3_Sub3)
						     class318_sub1_sub3_sub3_sub1_48_)
							.anInt10215
							= (Class367_Sub11
							   .logicCycle);
						}
					    }
					}
				    }
				    int i_51_ = Class328_Sub1.anInt6513;
				    int[] is = Class286_Sub7.anIntArray6290;
				    for (int i_52_ = 0;
					 ((i_52_ ^ 0xffffffff)
					  > (i_51_ ^ 0xffffffff));
					 i_52_++) {
					Player class318_sub1_sub3_sub3_sub2
					    = (ClassicLoadingScreen
					       .players
					       [is[i_52_]]);
					if ((class318_sub1_sub3_sub3_sub2
					     != null)
					    && (((((Class318_Sub1_Sub3_Sub3)
						   class318_sub1_sub3_sub3_sub2)
						  .anInt10215)
						 ^ 0xffffffff)
						!= (Class367_Sub11.logicCycle
						    ^ 0xffffffff))
					    && (((Class318_Sub1_Sub3_Sub3)
						 class318_sub1_sub3_sub3_sub2)
						.aBoolean10309)) {
					    int i_53_
						= ((((Class318_Sub1)
						     class318_sub1_sub3_sub3_sub2)
						    .anInt6377)
						   - ((-1
						       + (class318_sub1_sub3_sub3_sub2
							      .method2436
							  ((byte) 116)))
						      << -1764392888));
					    int i_54_
						= ((((Class318_Sub1)
						     class318_sub1_sub3_sub3_sub2)
						    .anInt6388)
						   + -((class318_sub1_sub3_sub3_sub2
							    .method2436
							((byte) 121)) + -1
						       << -1116878872));
					    if (((i_45_ ^ 0xffffffff)
						 >= (i_53_ ^ 0xffffffff))
						&& ((class318_sub1_sub3_sub3_sub2
							 .method2436((byte) 114)
						     ^ 0xffffffff)
						    >= ((-(-i_45_ + i_53_
							   >> 1032801289)
							 + (((NpcDefinition)
							     (((Npc)
							       class318_sub1_sub3_sub3_sub1)
							      .definition))
							    .anInt1399))
							^ 0xffffffff))
						&& ((i_46_ ^ 0xffffffff)
						    >= (i_54_ ^ 0xffffffff))
						&& (class318_sub1_sub3_sub3_sub2
							.method2436((byte) 58)
						    <= ((((NpcDefinition)
							  (((Npc)
							    class318_sub1_sub3_sub3_sub1)
							   .definition))
							 .anInt1399)
							- (i_54_ + -i_46_
							   >> 515256425)))) {
						Class348_Sub43.method3298
						    ((byte) 125,
						     (((((Class318_Sub1)
							 (Class132
							  .localPlayer))
							.aByte6381)
						       ^ 0xffffffff)
						      != ((((Class318_Sub1)
							    (((Class318_Sub4)
							      class318_sub4)
							     .aClass318_Sub1_6410))
							   .aByte6381)
							  ^ 0xffffffff)),
						     class318_sub1_sub3_sub3_sub2);
						((Class318_Sub1_Sub3_Sub3)
						 class318_sub1_sub3_sub3_sub2)
						    .anInt10215
						    = Class367_Sub11.logicCycle;
					    }
					}
				    }
				}
				if ((((Class318_Sub1_Sub3_Sub3)
				      class318_sub1_sub3_sub3_sub1).anInt10215
				     ^ 0xffffffff)
				    == (Class367_Sub11.logicCycle ^ 0xffffffff))
				    continue;
				Class286_Sub3.method2150
				    ((((Class318_Sub1)
				       (((Class318_Sub4) class318_sub4)
					.aClass318_Sub1_6410)).aByte6381
				      != (((Class318_Sub1)
					   (Class132
					    .localPlayer))
					  .aByte6381)),
				     false, class318_sub1_sub3_sub3_sub1);
				((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3_sub1).anInt10215
				    = Class367_Sub11.logicCycle;
			    }
			}
			if (((Class318_Sub4) class318_sub4).aClass318_Sub1_6410
			    instanceof Class318_Sub1_Sub2_Sub1) {
			    int i_55_ = za_Sub2.anInt9780 + i_33_;
			    int i_56_ = i_32_ - -Class90.anInt1517;
			    Class348_Sub37 class348_sub37
				= ((Class348_Sub37)
				   (Class130.aClass356_1895.get
				    ((long) ((((Class318_Sub1)
					       (((Class318_Sub4) class318_sub4)
						.aClass318_Sub1_6410))
					      .aByte6381) << -1312548548
					     | i_56_ << -623006738 | i_55_))));
			    if (class348_sub37 != null) {
				int i_57_ = 0;
				Class348_Sub34 class348_sub34
				    = ((Class348_Sub34)
				       ((Class348_Sub37) class348_sub37)
					   .aClass262_6998.getLast(-92));
				while (class348_sub34 != null) {
				    ItemDefinition class213
					= (ToolkitException.itemLoader
					       .getItemDefinition
					   (79,
					    (((Class348_Sub34) class348_sub34)
					     .anInt6973)));
				    if (r.aBoolean9722
					&& ((((Class318_Sub1)
					      (((Class318_Sub4) class318_sub4)
					       .aClass318_Sub1_6410)).aByte6381
					     ^ 0xffffffff)
					    == ((((Class318_Sub1)
						  (Class132
						   .localPlayer))
						 .aByte6381)
						^ 0xffffffff))) {
					Class254 class254
					    = (Class246.anInt3176 != -1
					       ? (Class101_Sub3
						      .aClass326_5764
						      .method2600
						  (Class246.anInt3176, 28364))
					       : null);
					if ((Class38.anInt500 & 0x1) != 0
					    && (class254 == null
						|| (((class213.method1567
						      ((((Class254) class254)
							.anInt3256),
						       29, Class246.anInt3176))
						     ^ 0xffffffff)
						    != ((((Class254) class254)
							 .anInt3256)
							^ 0xffffffff)))) {
					    Class97.anInt1555++;
					    Class50_Sub3.method466
						(false,
						 (Class28.aString5000
						  + " -> <col=ff9040>"
						  + (((ItemDefinition) class213)
						     .aString2795)),
						 i_32_, (byte) -76, false,
						 i_33_, -1, true, 49,
						 (long) i_57_,
						 Class28.aString5001,
						 (long) (((Class348_Sub34)
							  class348_sub34)
							 .anInt6973),
						 (FloatBuffer
						  .anInt9747));
					}
				    }
				    if (((Class318_Sub1)
					 (((Class318_Sub4) class318_sub4)
					  .aClass318_Sub1_6410)).aByte6381
					== (((Class318_Sub1)
					     (Class132
					      .localPlayer))
					    .aByte6381)) {
					String[] strings
					    = (((ItemDefinition) class213)
					       .aStringArray2811);
					for (int i_58_ = 4;
					     (i_58_ ^ 0xffffffff) <= -1;
					     i_58_--) {
					    if (strings != null
						&& strings[i_58_] != null) {
						int i_59_ = 0;
						if (i_58_ == 0)
						    i_59_ = 21;
						int i_60_ = Class38.anInt506;
						if (i_58_ == 1)
						    i_59_ = 10;
						if ((i_58_ ^ 0xffffffff) == -3)
						    i_59_ = 47;
						if (i_58_ == 3)
						    i_59_ = 22;
						if (((((ItemDefinition) class213)
						      .anInt2752)
						     ^ 0xffffffff)
						    == (i_58_ ^ 0xffffffff))
						    i_60_
							= ((ItemDefinition)
							   class213).anInt2759;
						if ((i_58_ ^ 0xffffffff) == -5)
						    i_59_ = 5;
						if ((i_58_ ^ 0xffffffff)
						    == ((((ItemDefinition) class213)
							 .anInt2764)
							^ 0xffffffff))
						    i_60_
							= ((ItemDefinition)
							   class213).anInt2830;
						Class50_Sub3.method466
						    (false,
						     ("<col=ff9040>"
						      + (((ItemDefinition) class213)
							 .aString2795)),
						     i_32_, (byte) -119, false,
						     i_33_, -1, true, i_59_,
						     (long) i_57_,
						     strings[i_58_],
						     (long) (((Class348_Sub34)
							      class348_sub34)
							     .anInt6973),
						     i_60_);
						Class348_Sub42_Sub8
						    .anInt9548++;
					    }
					}
				    }
				    Class348_Sub33.anInt6956++;
				    Class50_Sub3.method466
					(((((Class318_Sub1)
					    (((Class318_Sub4) class318_sub4)
					     .aClass318_Sub1_6410)).aByte6381
					   ^ 0xffffffff)
					  != ((((Class318_Sub1)
						(Class132
						 .localPlayer))
					       .aByte6381)
					      ^ 0xffffffff)),
					 ("<col=ff9040>"
					  + ((ItemDefinition) class213).aString2795),
					 i_32_, (byte) -122, false, i_33_, -1,
					 true, 1010, (long) i_57_,
					 (GameText.examineGameText.getLanguageText
					  (Class348_Sub33.gameLanguage)),
					 (long) ((Class348_Sub34)
						 class348_sub34).anInt6973,
					 Class286_Sub8.anInt6299);
				    class348_sub34
					= ((Class348_Sub34)
					   ((Class348_Sub37) class348_sub37)
					       .aClass262_6998
					       .nextBack(-127));
				    i_57_++;
				}
			    }
			}
			if (((Class318_Sub4) class318_sub4).aClass318_Sub1_6410
			    instanceof Interface10) {
			    Interface10 interface10
				= ((Interface10)
				   (((Class318_Sub4) class318_sub4)
				    .aClass318_Sub1_6410));
			    ObjectDefinition class51
				= (Class348_Sub40_Sub12.objectLoader
				       .getObject
				   (0, interface10.method42(-100)));
			    if (((ObjectDefinition) class51).anIntArray945 != null)
				class51 = (class51.method480
					   ((Class318_Sub1_Sub3_Sub3
					     .varbitHandler),
					    (byte) 47));
			    if (class51 != null) {
				if (r.aBoolean9722
				    && ((((Class318_Sub1)
					  (Class132
					   .localPlayer))
					 .aByte6381)
					== (((Class318_Sub1)
					     (((Class318_Sub4) class318_sub4)
					      .aClass318_Sub1_6410))
					    .aByte6381))) {
				    Class254 class254
					= (Class246.anInt3176 != -1
					   ? (Class101_Sub3.aClass326_5764
						  .method2600
					      (Class246.anInt3176, 28364))
					   : null);
				    if (((0x4 & Class38.anInt500 ^ 0xffffffff)
					 != -1)
					&& (class254 == null
					    || (((class51.method487
						  (Class246.anInt3176,
						   (((Class254) class254)
						    .anInt3256),
						   54))
						 ^ 0xffffffff)
						!= ((((Class254) class254)
						     .anInt3256)
						    ^ 0xffffffff)))) {
					Class220.anInt2877++;
					Class50_Sub3.method466
					    (false,
					     (Class28.aString5000
					      + " -> <col=00ffff>"
					      + (((ObjectDefinition) class51)
						 .aString884)),
					     i_32_, (byte) -94, false, i_33_,
					     -1, true, 2,
					     (long) interface10.hashCode(),
					     Class28.aString5001,
					     (Class348_Sub40_Sub21.method3107
					      ((byte) 95, interface10, i_32_,
					       i_33_)),
					     FloatBuffer.anInt9747);
				    }
				}
				if (((((Class318_Sub1)
				       (Class132
					.localPlayer))
				      .aByte6381)
				     ^ 0xffffffff)
				    == (((Class318_Sub1)
					 (((Class318_Sub4) class318_sub4)
					  .aClass318_Sub1_6410)).aByte6381
					^ 0xffffffff)) {
				    String[] strings
					= ((ObjectDefinition) class51).aStringArray913;
				    if (strings != null) {
					for (int i_61_ = 4;
					     (i_61_ ^ 0xffffffff) <= -1;
					     i_61_--) {
					    if (strings[i_61_] != null) {
						int i_62_ = 0;
						if (i_61_ == 0)
						    i_62_ = 3;
						int i_63_ = Class38.anInt506;
						if ((i_61_ ^ 0xffffffff) == -2)
						    i_62_ = 4;
						if ((i_61_ ^ 0xffffffff) == -3)
						    i_62_ = 9;
						if (i_61_ == 3)
						    i_62_ = 59;
						if ((i_61_ ^ 0xffffffff) == -5)
						    i_62_ = 1007;
						if ((((ObjectDefinition) class51)
						     .anInt950)
						    == i_61_)
						    i_63_
							= (((ObjectDefinition) class51)
							   .anInt869);
						if (i_61_
						    == (((ObjectDefinition) class51)
							.anInt951))
						    i_63_
							= (((ObjectDefinition) class51)
							   .anInt877);
						Class50_Sub3.method466
						    (false,
						     ("<col=00ffff>"
						      + (((ObjectDefinition) class51)
							 .aString884)),
						     i_32_, (byte) -100, false,
						     i_33_, -1, true, i_62_,
						     (long) interface10
								.hashCode(),
						     strings[i_61_],
						     (Class348_Sub40_Sub21
							  .method3107
						      ((byte) -116,
						       interface10, i_32_,
						       i_33_)),
						     i_63_);
						Class83.anInt1445++;
					    }
					}
				    }
				    Class50_Sub3.method466
					(((((Class318_Sub1)
					    (((Class318_Sub4) class318_sub4)
					     .aClass318_Sub1_6410)).aByte6381
					   ^ 0xffffffff)
					  != ((((Class318_Sub1)
						(Class132
						 .localPlayer))
					       .aByte6381)
					      ^ 0xffffffff)),
					 ("<col=00ffff>"
					  + ((ObjectDefinition) class51).aString884),
					 i_32_, (byte) -120, false, i_33_, -1,
					 true, 1001,
					 (long) interface10.hashCode(),
					 (GameText.examineGameText.getLanguageText
					  (Class348_Sub33.gameLanguage)),
					 (long) ((ObjectDefinition) class51).anInt941,
					 Class286_Sub8.anInt6299);
				    anInt6094++;
				}
			    }
			}
		    }
		}
		if (Class59_Sub1.aBoolean5300)
		    Class285_Sub1.method2129((byte) 86);
	    }
	    Class226.method1626(1, false);
	}
    }
    
    final void method1716(boolean bool) {
	if (((Class239) this).aClass348_Sub51_3136.method3422(674)
	    != Class10.aClass230_186)
	    ((Class239) this).anInt3138 = 1;
	else if (((Class239) this).aClass348_Sub51_3136.method3425(-95))
	    ((Class239) this).anInt3138 = 0;
	anInt6090++;
	if ((((Class239) this).anInt3138 ^ 0xffffffff) != -1
	    && (((Class239) this).anInt3138 ^ 0xffffffff) != -2)
	    ((Class239) this).anInt3138 = method1710(20014);
	if (bool != false)
	    aClass60_6096 = null;
    }
    
    final boolean method1824(int i) {
	anInt6087++;
	if (i < 85)
	    method1823(null, 104, -95, (byte) 26);
	if (((Class239) this).aClass348_Sub51_3136.method3422(674)
	    == Class10.aClass230_186) {
	    if (!((Class239) this).aClass348_Sub51_3136.method3425(-96))
		return true;
	    return false;
	}
	return false;
    }
    
    Class239_Sub24(int i, Class348_Sub51 class348_sub51) {
	super(i, class348_sub51);
    }
}
