/* Class133 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

final class Class133
{
	static int anInt1912;
	static int anInt1913;
	static IncomingPacket aClass114_1914 = new IncomingPacket(84, 7);
	static boolean aBoolean1915 = false;
	static int anInt1916;
	static IncomingPacket aClass114_1917 = new IncomingPacket(20, -2);
	static byte[][] aByteArrayArray1918 = new byte[250][];
	/*synthetic*/ static Class aClass1919;
	/*synthetic*/ static Class aClass1920;

	public static void method1139(int i) {
		if (i == 2767) {
			aByteArrayArray1918 = null;
			aClass114_1917 = null;
			aClass114_1914 = null;
		}
	}

	static final void method1140(int i) {
		anInt1916++;
		BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
				(((Class348_Sub51)
						(BitmapTable
								.aClass348_Sub51_3959))
								.aClass239_Sub27_7255),
								1);
		BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
				(((Class348_Sub51)
						(BitmapTable
								.aClass348_Sub51_3959))
								.aClass239_Sub27_7261),
								1);
		BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
				(((Class348_Sub51)
						(BitmapTable
								.aClass348_Sub51_3959))
								.aClass239_Sub14_7250),
								2);
		BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
				(((Class348_Sub51)
						(BitmapTable
								.aClass348_Sub51_3959))
								.aClass239_Sub14_7264),
								2);
		BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
				(((Class348_Sub51)
						(BitmapTable
								.aClass348_Sub51_3959))
								.aClass239_Sub4_7220),
								1);
		BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
				(((Class348_Sub51)
						(BitmapTable
								.aClass348_Sub51_3959))
								.aClass239_Sub9_7256),
								1);
		BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
				(((Class348_Sub51)
						(BitmapTable
								.aClass348_Sub51_3959))
								.aClass239_Sub13_7236),
								1);
		BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
				(((Class348_Sub51)
						(BitmapTable
								.aClass348_Sub51_3959))
								.aClass239_Sub1_7246),
								1);
		BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
				(((Class348_Sub51)
						(BitmapTable
								.aClass348_Sub51_3959))
								.aClass239_Sub21_7270),
								1);
		if (i >= 45) {
			BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
					(((Class348_Sub51)
							(BitmapTable
									.aClass348_Sub51_3959))
									.aClass239_Sub24_7235),
									1);
			BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
					(((Class348_Sub51)
							(BitmapTable
									.aClass348_Sub51_3959))
									.aClass239_Sub7_7238),
									2);
			BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
					(((Class348_Sub51)
							(BitmapTable
									.aClass348_Sub51_3959))
									.aClass239_Sub28_7230),
									1);
			BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
					(((Class348_Sub51)
							(BitmapTable
									.aClass348_Sub51_3959))
									.aClass239_Sub18_7259),
									2);
			BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
					(((Class348_Sub51)
							(BitmapTable
									.aClass348_Sub51_3959))
									.aClass239_Sub16_7247),
									1);
			BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
					(((Class348_Sub51)
							(BitmapTable
									.aClass348_Sub51_3959))
									.aClass239_Sub20_7216),
									0);
			BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
					(((Class348_Sub51)
							(BitmapTable
									.aClass348_Sub51_3959))
									.aClass239_Sub20_7248),
									0);
			BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
					(((Class348_Sub51)
							(BitmapTable
									.aClass348_Sub51_3959))
									.aClass239_Sub15_7224),
									2);
			BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
					(((Class348_Sub51)
							(BitmapTable
									.aClass348_Sub51_3959))
									.aClass239_Sub6_7226),
									0);
			BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
					(((Class348_Sub51)
							(BitmapTable
									.aClass348_Sub51_3959))
									.aClass239_Sub12_7243),
									0);
			Class237.method1686(-127);
			BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
					(((Class348_Sub51)
							(BitmapTable
									.aClass348_Sub51_3959))
									.aClass239_Sub23_7231),
									0);
			BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
					(((Class348_Sub51)
							(BitmapTable
									.aClass348_Sub51_3959))
									.aClass239_Sub29_7229),
									4);
			Class348_Sub40.method3038(-1);
			Class76.method773(true);
			RuntimeException_Sub1.aBoolean4604 = true;
		}
	}

	static final void method1141
	(GameBuffer class348_sub49_sub2, int i, int i_0_, int i_1_,
			Player class318_sub1_sub3_sub3_sub2) {
		do {
			try {
				anInt1912++;
				if (i_1_ >= 41) {
					byte i_2_ = -1;
					if ((i_0_ & 0x1 ^ 0xffffffff) != -1) {
						int i_3_ = class348_sub49_sub2.getShort();
						if ((i_3_ ^ 0xffffffff) == -65536)
							i_3_ = -1;
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).anInt10275
								= i_3_;
					}
					if ((0x10000 & i_0_ ^ 0xffffffff) != -1) {
						int i_4_ = class348_sub49_sub2.getUByte();
						int[] is = new int[i_4_];
						int[] is_5_ = new int[i_4_];
						for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
							int i_7_ = class348_sub49_sub2.readLEShort128(-118);
							if ((i_7_ & 0xc000 ^ 0xffffffff) == -49153) {
								int i_8_
								= class348_sub49_sub2.readLEShort(false);
								is[i_6_]
								   = Class273.method2057(i_7_ << -66426544,
										   i_8_);
							} else
								is[i_6_] = i_7_;
							is_5_[i_6_]
							      = class348_sub49_sub2.readLEShort(false);
						}
						class318_sub1_sub3_sub3_sub2.method2430(is_5_, is,
								-116);
					}
					if ((0x400 & i_0_ ^ 0xffffffff) != -1) {
						int i_9_ = class348_sub49_sub2.readLEShort(false);
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).anInt10227
								= class348_sub49_sub2.method3342();
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).anInt10271
								= class348_sub49_sub2.method3342();
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).anInt10210
								= 0x7fff & i_9_;
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).aBoolean10226
								= (i_9_ & 0x8000) != 0;
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).anInt10287
								= (((Class318_Sub1_Sub3_Sub3)
										class318_sub1_sub3_sub3_sub2).anInt10210
										+ (Class367_Sub11.logicCycle
												+ (((Class318_Sub1_Sub3_Sub3)
														class318_sub1_sub3_sub3_sub2)
														.anInt10227)));
					}
					if ((0x1000 & i_0_ ^ 0xffffffff) != -1) {
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).aString10292
								= class348_sub49_sub2.getJStr();
						if (((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2)
								.aString10292.charAt(0)
								!= '~') {
							if (Class132.localPlayer
									== class318_sub1_sub3_sub3_sub2)
								Class286_Sub2.handleMessage
								(class318_sub1_sub3_sub3_sub2
										.method2450(false, -88),
										2, 0,
										(((Class318_Sub1_Sub3_Sub3)
												class318_sub1_sub3_sub3_sub2)
												.aString10292),
												class318_sub1_sub3_sub3_sub2
												.method2456(true, 255),
												(((Player)
														class318_sub1_sub3_sub3_sub2)
														.username));
						} else {
							((Class318_Sub1_Sub3_Sub3)
									class318_sub1_sub3_sub3_sub2).aString10292
									= ((Class318_Sub1_Sub3_Sub3)
											class318_sub1_sub3_sub3_sub2)
											.aString10292.substring(1);
							Class286_Sub2.handleMessage
							(class318_sub1_sub3_sub3_sub2.method2450(false,
									-70),
									2, 0,
									((Class318_Sub1_Sub3_Sub3)
											class318_sub1_sub3_sub3_sub2).aString10292,
											class318_sub1_sub3_sub3_sub2.method2456(true,
													255),
													((Player)
															class318_sub1_sub3_sub3_sub2).username);
						}
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).anInt10264
								= 150;
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).anInt10234
								= 0;
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).anInt10201
								= 0;
					}
					if ((i_0_ & 0x4) != 0) {
						int i_10_ = class348_sub49_sub2.method3329((byte) 21);
						if ((i_10_ ^ 0xffffffff) < -1) {
							for (int i_11_ = 0; i_10_ > i_11_; i_11_++) {
								int i_12_ = -1;
								int i_13_ = -1;
								int i_14_
								= class348_sub49_sub2.getSmartA();
								int i_15_ = -1;
								if ((i_14_ ^ 0xffffffff) != -32768) {
									if (i_14_ != 32766)
										i_13_ = class348_sub49_sub2
										.getSmartA();
									else
										i_14_ = -1;
								} else {
									i_14_
									= class348_sub49_sub2.getSmartA();
									i_13_
									= class348_sub49_sub2.getSmartA();
									i_12_
									= class348_sub49_sub2.getSmartA();
									i_15_
									= class348_sub49_sub2.getSmartA();
								}
								int i_16_
								= class348_sub49_sub2.getSmartA();
								int i_17_ = class348_sub49_sub2
								.method3393((byte) -98);
								class318_sub1_sub3_sub3_sub2.method2438
								(i_13_, Class367_Sub11.logicCycle, i_14_,
										i_15_, i_12_, i_16_, i_17_, (byte) 102);
							}
						}
					}
					if ((i_0_ & 0x2 ^ 0xffffffff) != -1) {
						((Player)
								class318_sub1_sub3_sub3_sub2).anInt10524
								= class348_sub49_sub2.getShort();
						if (((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).anInt10319
								== 0) {
							class318_sub1_sub3_sub3_sub2.method2440
							((byte) 49,
									((Player)
											class318_sub1_sub3_sub3_sub2).anInt10524);
							((Player)
									class318_sub1_sub3_sub3_sub2).anInt10524
									= -1;
						}
					}
					if ((0x8000 & i_0_ ^ 0xffffffff) != -1)
						((Player)
								class318_sub1_sub3_sub3_sub2).aBoolean10554
								= class348_sub49_sub2.method3393((byte) -94) == 1;
					if ((i_0_ & 0x100) != 0) {
						int i_18_ = class348_sub49_sub2.method3329((byte) 21);
						int[] is = new int[i_18_];
						int[] is_19_ = new int[i_18_];
						int[] is_20_ = new int[i_18_];
						for (int i_21_ = 0;
						(i_18_ ^ 0xffffffff) < (i_21_ ^ 0xffffffff);
						i_21_++) {
							int i_22_
							= class348_sub49_sub2.getShort();
							if (i_22_ == 65535)
								i_22_ = -1;
							is[i_21_] = i_22_;
							is_19_[i_21_]
							       = class348_sub49_sub2.method3329((byte) 21);
							is_20_[i_21_]
							       = class348_sub49_sub2.getShort();
						}
						Class167.method1297((byte) -116,
								class318_sub1_sub3_sub3_sub2,
								is_20_, is, is_19_);
					}
					if ((0x2000 & i_0_) != 0) {
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).anInt10293
								= class348_sub49_sub2.getByte();
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).anInt10314
								= class348_sub49_sub2.method3345(-27697);
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).anInt10241
								= class348_sub49_sub2.method3361(-622951480);
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).anInt10288
								= class348_sub49_sub2.method3361(-622951480);
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).anInt10239
								= (class348_sub49_sub2.readLEShort128(-118)
										- -Class367_Sub11.logicCycle);
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).anInt10300
								= (class348_sub49_sub2.method3355(19)
										- -Class367_Sub11.logicCycle);
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).anInt10231
								= class348_sub49_sub2.getUByte();
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).anInt10322
								= 0;
						if (!((Player)
								class318_sub1_sub3_sub3_sub2).aBoolean10539) {
							((Class318_Sub1_Sub3_Sub3)
									class318_sub1_sub3_sub3_sub2).anInt10241
									+= (((Class318_Sub1_Sub3_Sub3)
											class318_sub1_sub3_sub3_sub2)
											.anIntArray10320[0]);
							((Class318_Sub1_Sub3_Sub3)
									class318_sub1_sub3_sub3_sub2).anInt10288
									+= (((Class318_Sub1_Sub3_Sub3)
											class318_sub1_sub3_sub3_sub2)
											.anIntArray10317[0]);
							((Class318_Sub1_Sub3_Sub3)
									class318_sub1_sub3_sub3_sub2).anInt10319
									= 1;
							((Class318_Sub1_Sub3_Sub3)
									class318_sub1_sub3_sub3_sub2).anInt10314
									+= (((Class318_Sub1_Sub3_Sub3)
											class318_sub1_sub3_sub3_sub2)
											.anIntArray10317[0]);
							((Class318_Sub1_Sub3_Sub3)
									class318_sub1_sub3_sub3_sub2).anInt10293
									+= (((Class318_Sub1_Sub3_Sub3)
											class318_sub1_sub3_sub3_sub2)
											.anIntArray10320[0]);
						} else {
							((Class318_Sub1_Sub3_Sub3)
									class318_sub1_sub3_sub3_sub2).anInt10288
									+= ((Player)
											class318_sub1_sub3_sub3_sub2).anInt10531;
							((Class318_Sub1_Sub3_Sub3)
									class318_sub1_sub3_sub3_sub2).anInt10293
									+= ((Player)
											class318_sub1_sub3_sub3_sub2).anInt10549;
							((Class318_Sub1_Sub3_Sub3)
									class318_sub1_sub3_sub3_sub2).anInt10314
									+= ((Player)
											class318_sub1_sub3_sub3_sub2).anInt10531;
							((Class318_Sub1_Sub3_Sub3)
									class318_sub1_sub3_sub3_sub2).anInt10241
									+= ((Player)
											class318_sub1_sub3_sub3_sub2).anInt10549;
							((Class318_Sub1_Sub3_Sub3)
									class318_sub1_sub3_sub3_sub2).anInt10319
									= 0;
						}
					}
					if ((0x200 & i_0_) != 0) {
						int i_23_ = class348_sub49_sub2.readLEShort128(-107);
						if (i_23_ == 65535)
							i_23_ = -1;
						int i_24_
						= class348_sub49_sub2.method3364((byte) -121);
						int i_25_ = class348_sub49_sub2.method3342();
						int i_26_ = i_25_ & 0x7;
						int i_27_ = 0xf & i_25_ >> 946985891;
						if ((i_27_ ^ 0xffffffff) == -16)
							i_27_ = -1;
						class318_sub1_sub3_sub3_sub2.method2437(i_26_, i_23_,
								-1012294866,
								i_27_, true,
								i_24_);
					}
					if ((i_0_ & 0x40000) != 0) {
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).aByte10255
								= class348_sub49_sub2.method3361(-622951480);
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).aByte10206
								= class348_sub49_sub2.getByte();
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).aByte10270
								= class348_sub49_sub2.getByte();
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).aByte10279
								= (byte) class348_sub49_sub2.getUByte();
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).anInt10248
								= (Class367_Sub11.logicCycle
										- -class348_sub49_sub2.readLEShort128(-120));
						((Class318_Sub1_Sub3_Sub3)
								class318_sub1_sub3_sub3_sub2).anInt10250
								= (Class367_Sub11.logicCycle
										- -class348_sub49_sub2.method3355(125));
					}
					if ((i_0_ & 0x80) != 0)
						IntegerVarScriptSettingLoader.aByteArray3300[i]
						                        = class348_sub49_sub2.method3345(-27697);
					if ((i_0_ & 0x20 ^ 0xffffffff) != -1) {
						int i_28_ = class348_sub49_sub2.readLEShort128(-126);
						if ((i_28_ ^ 0xffffffff) == -65536)
							i_28_ = -1;
						int i_29_ = class348_sub49_sub2.method3346(255);
						int i_30_
						= class348_sub49_sub2.method3393((byte) -125);
						int i_31_ = i_30_ & 0x7;
						int i_32_ = (0x78 & i_30_) >> -1543635709;
								   if ((i_32_ ^ 0xffffffff) == -16)
									   i_32_ = -1;
								   class318_sub1_sub3_sub3_sub2.method2437(i_31_, i_28_,
										   -1012294866,
										   i_32_, false,
										   i_29_);
					}
					if ((0x8 & i_0_ ^ 0xffffffff) != -1) {
						int[] is = new int[4];
						for (int i_33_ = 0; (i_33_ ^ 0xffffffff) > -5;
						i_33_++) {
							is[i_33_] = class348_sub49_sub2.method3355(123);
							if ((is[i_33_] ^ 0xffffffff) == -65536)
								is[i_33_] = -1;
						}
						int i_34_
						= class348_sub49_sub2.method3393((byte) -101);
						Class239_Sub16.method1791
						(23946, is, i_34_, class318_sub1_sub3_sub3_sub2);
					}
					if ((i_0_ & 0x10 ^ 0xffffffff) != -1) {
						int i_35_ = class348_sub49_sub2.getUByte();
						byte[] is = new byte[i_35_];
						ByteBuffer class348_sub49 = new ByteBuffer(is);
						class348_sub49_sub2.getBytes(is, 0, i_35_,
								(byte) -124);
						Class154.aClass348_Sub49Array2105[i] = class348_sub49;
						class318_sub1_sub3_sub3_sub2
						.method2452((byte) 84, class348_sub49);
					}
					if ((0x800 & i_0_) != 0)
						i_2_ = class348_sub49_sub2.method3361(-622951480);
					if (!((Player)
							class318_sub1_sub3_sub3_sub2).aBoolean10539)
						break;
					if (i_2_ != 127) {
						byte i_36_;
						if (i_2_ != -1)
							i_36_ = i_2_;
						else
							i_36_ = IntegerVarScriptSettingLoader.aByteArray3300[i];
						Class348_Sub42_Sub9_Sub1.method3208
						(class318_sub1_sub3_sub3_sub2, i_36_, -21);
						class318_sub1_sub3_sub3_sub2.method2455
						(((Player)
								class318_sub1_sub3_sub3_sub2).anInt10531,
								-26443, i_36_,
								((Player)
										class318_sub1_sub3_sub3_sub2).anInt10549);
					} else
						class318_sub1_sub3_sub3_sub2.method2449
						(((Player)
								class318_sub1_sub3_sub3_sub2).anInt10531,
								((Player)
										class318_sub1_sub3_sub3_sub2).anInt10549,
										(byte) 84);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class348_Sub17.method2929
				(runtimeexception,
						("ns.A("
								+ (class348_sub49_sub2 != null ? "{...}" : "null")
								+ ',' + i + ',' + i_0_ + ',' + i_1_ + ','
								+ (class318_sub1_sub3_sub3_sub2 != null ? "{...}"
										: "null")
										+ ')'));
			}
			break;
		} while (false);
	}

	static final synchronized void method1142(byte i) {
		anInt1913++;
		if (Class168.anObject2256 == null) {
			try {
				Class var_class
				= Class.forName("java.lang.management.ManagementFactory");
				Method method
				= var_class.getDeclaredMethod("getPlatformMBeanServer",
						null);
				Object object = method.invoke(null, null);
				if (i == 26) {
					Method method_37_
					= (var_class.getMethod
							("newPlatformMXBeanProxy",
									(new Class[]
									           { (Class.forName
									        		   ("javax.management.MBeanServerConnection")),
									        		   (aClass1919 != null ? aClass1919
									        				   : (aClass1919
									        						   = method1143("java.lang.String"))),
									        						   (aClass1920 != null ? aClass1920
									        								   : (aClass1920
									        										   = method1143("java.lang.Class"))) })));
					Class168.anObject2256
					= (method_37_.invoke
							(null,
									(new Object[]
									            { object,
											"com.sun.management:type=HotSpotDiagnostic",
											(Class.forName
													("com.sun.management.HotSpotDiagnosticMXBean")) })));
				}
			} catch (Exception exception) {
				System.out.println("HeapDump setup error:");
				exception.printStackTrace();
			}
		}
	}

	/*synthetic*/ static Class method1143(String string) {
		try {
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception
					.getMessage());
		}
	}
}
