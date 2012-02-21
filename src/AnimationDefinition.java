/* AnimationDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class AnimationDefinition {
	static int p12fullArchiveId;
	int[] anIntArray236;
	int[] anIntArray237;
	int anInt238;
	int anInt239;
	static int anInt240;
	boolean aBoolean241;
	boolean aBoolean242 = false;
	static int anInt243;
	int anInt244;
	int anInt245;
	static int anInt246;
	static boolean aBoolean247 = false;
	int anInt248;
	int anInt249;
	static IncomingPacket incomingPacket4 = new IncomingPacket(4, 1);
	AnimationLoader aClass87_251;
	static AbstractRasterizer anInterface4_252;
	int[] anIntArray253;
	boolean aBoolean254;
	static int[][] anIntArrayArray255;
	static int[] anIntArray256;
	static int anInt257;
	static int anInt258;
	static int anInt259;
	private int[] anIntArray260;
	int anInt261;
	int anInt262;
	boolean[] aBooleanArray263;
	int[][] anIntArrayArray264;
	int[] anIntArray265;
	static int anInt266;
	int[] anIntArray267;
	boolean aBoolean268;
	int anInt269;

	final int method263(int i, int i_0_, int i_1_, boolean bool) {
		anInt240++;
		int i_2_ = 0;
		int i_3_ = 0;
		int i_4_ = ((AnimationDefinition) this).anIntArray237[i_1_];
		Class348_Sub42_Sub17 class348_sub42_sub17 = null;
		Class348_Sub42_Sub17 class348_sub42_sub17_5_ = ((AnimationDefinition) this).aClass87_251
				.method839(i_4_ >> -1425405904, 3);
		i_4_ &= 0xffff;
		if (class348_sub42_sub17_5_ == null)
			return i_2_;
		if ((((AnimationDefinition) this).aBoolean241 || Class28.forcedTween)
				&& (i ^ 0xffffffff) != 0
				&& i < ((AnimationDefinition) this).anIntArray237.length) {
			i_3_ = ((AnimationDefinition) this).anIntArray237[i];
			class348_sub42_sub17 = ((AnimationDefinition) this).aClass87_251.method839(
					i_3_ >> -1126055824, 3);
			i_3_ &= 0xffff;
		}
		if (i_0_ <= 96)
			return 11;
		if (((AnimationDefinition) this).aBoolean242)
			i_2_ |= 0x200;
		if (class348_sub42_sub17_5_.method3272(i_4_, 0))
			i_2_ |= 0x80;
		if (class348_sub42_sub17_5_.method3271(i_4_, 14))
			i_2_ |= 0x100;
		if (class348_sub42_sub17_5_.method3267((byte) -110, i_4_))
			i_2_ |= 0x400;
		if (class348_sub42_sub17 != null) {
			if (class348_sub42_sub17.method3272(i_3_, 0))
				i_2_ |= 0x80;
			if (class348_sub42_sub17.method3271(i_3_, 14))
				i_2_ |= 0x100;
			if (class348_sub42_sub17.method3267((byte) -127, i_3_))
				i_2_ |= 0x400;
		}
		if (anIntArray260 != null && bool) {
			if ((i_1_ ^ 0xffffffff) > (anIntArray260.length ^ 0xffffffff)) {
				int i_6_ = anIntArray260[i_1_];
				if ((i_6_ ^ 0xffffffff) != -65536) {
					Class348_Sub42_Sub17 class348_sub42_sub17_7_ = ((AnimationDefinition) this).aClass87_251
							.method839(i_6_ >> 743125296, 3);
					i_6_ &= 0xffff;
					if (class348_sub42_sub17_7_ != null) {
						if (class348_sub42_sub17_7_.method3272(i_6_, 0))
							i_2_ |= 0x80;
						if (class348_sub42_sub17_7_.method3271(i_6_, 14))
							i_2_ |= 0x100;
						if (class348_sub42_sub17_7_.method3267((byte) -103,
								i_6_))
							i_2_ |= 0x400;
					}
				}
			}
			if ((((AnimationDefinition) this).aBoolean241 || Class28.forcedTween)
					&& (i ^ 0xffffffff) != 0
					&& (i ^ 0xffffffff) > (anIntArray260.length ^ 0xffffffff)) {
				int i_8_ = anIntArray260[i];
				if (i_8_ != 65535) {
					Class348_Sub42_Sub17 class348_sub42_sub17_9_ = ((AnimationDefinition) this).aClass87_251
							.method839(i_8_ >> -1324248592, 3);
					i_8_ &= 0xffff;
					if (class348_sub42_sub17_9_ != null) {
						if (class348_sub42_sub17_9_.method3272(i_8_, 0))
							i_2_ |= 0x80;
						if (class348_sub42_sub17_9_.method3271(i_8_, 14))
							i_2_ |= 0x100;
						if (class348_sub42_sub17_9_
								.method3267((byte) -93, i_8_))
							i_2_ |= 0x400;
					}
				}
			}
		}
		return 0x20 | i_2_;
	}

	private final void initialize(ByteBuffer class348_sub49, int i, int i_10_) {
		if (i_10_ == -14861) {
			if ((i ^ 0xffffffff) == -2) {
				int i_11_ = class348_sub49.getShort();//short
				((AnimationDefinition) this).anIntArray267 = new int[i_11_];
				((AnimationDefinition) this).anIntArray237 = new int[i_11_];
				for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
					((AnimationDefinition) this).anIntArray267[i_12_] = class348_sub49.getShort();
				for (int i_13_ = 0; i_13_ < i_11_; i_13_++)
					((AnimationDefinition) this).anIntArray237[i_13_] = class348_sub49.getShort();
				for (int i_14_ = 0; (i_11_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++)
					((AnimationDefinition) this).anIntArray237[i_14_] = ((class348_sub49.getShort() << -1063557680) + ((AnimationDefinition) this).anIntArray237[i_14_]);
			} else if (i != 2) {
				if ((i ^ 0xffffffff) == -4) {
					((AnimationDefinition) this).aBooleanArray263 = new boolean[256];
					int i_15_ = class348_sub49.getUByte();//byte
					for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
						((AnimationDefinition) this).aBooleanArray263[class348_sub49.getUByte()] = true;
				} else if ((i ^ 0xffffffff) != -6) {
					if (i != 6) {
						if (i != 7) {
							if ((i ^ 0xffffffff) != -9) {
								if ((i ^ 0xffffffff) == -10)
									((AnimationDefinition) this).anInt262 = class348_sub49
											.getUByte();
								else if ((i ^ 0xffffffff) == -11)
									((AnimationDefinition) this).anInt245 = class348_sub49
											.getUByte();
								else if ((i ^ 0xffffffff) != -12) {
									if (i == 12) {
										int i_17_ = class348_sub49
												.getUByte();
										anIntArray260 = new int[i_17_];
										for (int i_18_ = 0; ((i_17_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff)); i_18_++)
											anIntArray260[i_18_] = class348_sub49
													.getShort();
										for (int i_19_ = 0; ((i_19_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff)); i_19_++)
											anIntArray260[i_19_] = ((class348_sub49
													.getShort() << -960144720) - -anIntArray260[i_19_]);
									} else if (i == 13) {
										int i_20_ = class348_sub49
												.getShort();
										((AnimationDefinition) this).anIntArrayArray264 = new int[i_20_][];
										for (int i_21_ = 0; ((i_20_ ^ 0xffffffff) < (i_21_ ^ 0xffffffff)); i_21_++) {
											int i_22_ = class348_sub49
													.getUByte();
											if ((i_22_ ^ 0xffffffff) < -1) {
												((AnimationDefinition) this).anIntArrayArray264[i_21_] = new int[i_22_];
												((AnimationDefinition) this).anIntArrayArray264[i_21_][0] = class348_sub49
														.getTri();
												for (int i_23_ = 1; ((i_23_ ^ 0xffffffff) > (i_22_ ^ 0xffffffff)); i_23_++)
													((AnimationDefinition) this).anIntArrayArray264[i_21_][i_23_] = (class348_sub49
															.getShort());
											}
										}
									} else if ((i ^ 0xffffffff) != -15) {
										if ((i ^ 0xffffffff) == -16)
											((AnimationDefinition) this).aBoolean241 = true;
										else if (i == 16)
											((AnimationDefinition) this).aBoolean254 = true;
										else if (i == 18)
											((AnimationDefinition) this).aBoolean268 = true;
										else if (i == 19) {
											if (((AnimationDefinition) this).anIntArray253 == null) {
												((AnimationDefinition) this).anIntArray253 = (new int[(((AnimationDefinition) this).anIntArrayArray264).length]);
												for (int i_24_ = 0; ((i_24_ ^ 0xffffffff) > ((((AnimationDefinition) this).anIntArrayArray264).length ^ 0xffffffff)); i_24_++)
													((AnimationDefinition) this).anIntArray253[i_24_] = 255;
											}
											((AnimationDefinition) this).anIntArray253[class348_sub49
													.getUByte()] = (class348_sub49
													.getUByte());
										} else if (i == 20) {
											if ((((AnimationDefinition) this).anIntArray236 == null)
													|| (((AnimationDefinition) this).anIntArray265) == null) {
												((AnimationDefinition) this).anIntArray236 = (new int[(((AnimationDefinition) this).anIntArrayArray264).length]);
												((AnimationDefinition) this).anIntArray265 = (new int[(((AnimationDefinition) this).anIntArrayArray264).length]);
												for (int i_25_ = 0; ((i_25_ ^ 0xffffffff) > ((((AnimationDefinition) this).anIntArrayArray264).length ^ 0xffffffff)); i_25_++) {
													((AnimationDefinition) this).anIntArray236[i_25_] = 256;
													((AnimationDefinition) this).anIntArray265[i_25_] = 256;
												}
											}
											int i_26_ = class348_sub49
													.getUByte();
											((AnimationDefinition) this).anIntArray236[i_26_] = class348_sub49
													.getShort();
											((AnimationDefinition) this).anIntArray265[i_26_] = class348_sub49
													.getShort();
										}
									} else
										((AnimationDefinition) this).aBoolean242 = true;
								} else
									((AnimationDefinition) this).anInt248 = class348_sub49
											.getUByte();
							} else
								((AnimationDefinition) this).anInt244 = class348_sub49
										.getUByte();
						} else
							((AnimationDefinition) this).anInt261 = class348_sub49
									.getShort();
					} else
						((AnimationDefinition) this).anInt249 = class348_sub49
								.getShort();
				} else
					((AnimationDefinition) this).anInt239 = class348_sub49
							.getUByte();
			} else
				((AnimationDefinition) this).anInt238 = class348_sub49.getShort();
			anInt257++;
		}
	}

	public static void method265(boolean bool) {
		anIntArray256 = null;
		incomingPacket4 = null;
		anIntArrayArray255 = null;
		if (bool != false)
			method268(-22, -54, -101, -115, -107, 90, 13, -47);
		anInterface4_252 = null;
	}

	final AnimatableToolkit method266(AnimatableToolkit class64, int i, int i_27_, byte i_28_,
			int i_29_, int i_30_, int i_31_, int i_32_) {
		anInt266++;
		int i_33_ = ((AnimationDefinition) this).anIntArray267[i_29_];
		i_29_ = ((AnimationDefinition) this).anIntArray237[i_29_];
		Class348_Sub42_Sub17 class348_sub42_sub17 = ((AnimationDefinition) this).aClass87_251
				.method839(i_29_ >> 663780816, 3);
		i_29_ &= 0xffff;
		if (class348_sub42_sub17 == null)
			return class64.method614(i_28_, i_32_, true);
		Class348_Sub42_Sub17 class348_sub42_sub17_34_ = null;
		if ((((AnimationDefinition) this).aBoolean241 || Class28.forcedTween)
				&& i_27_ != -1
				&& (i_27_ ^ 0xffffffff) > (((AnimationDefinition) this).anIntArray237.length ^ 0xffffffff)) {
			i_27_ = ((AnimationDefinition) this).anIntArray237[i_27_];
			class348_sub42_sub17_34_ = ((AnimationDefinition) this).aClass87_251.method839(
					i_27_ >> 350375504, 3);
			i_27_ &= 0xffff;
		}
		if (((AnimationDefinition) this).aBoolean242)
			i_32_ |= 0x200;
		if (class348_sub42_sub17.method3272(i_29_, i_31_ + -663780816))
			i_32_ |= 0x80;
		if (class348_sub42_sub17.method3271(i_29_, i_31_ ^ 0x27907dde))
			i_32_ |= 0x100;
		if (class348_sub42_sub17.method3267((byte) -126, i_29_))
			i_32_ |= 0x400;
		if (class348_sub42_sub17_34_ != null) {
			if (class348_sub42_sub17_34_.method3272(i_27_, 0))
				i_32_ |= 0x80;
			if (class348_sub42_sub17_34_.method3271(i_27_, 14))
				i_32_ |= 0x100;
			if (class348_sub42_sub17_34_.method3267((byte) -125, i_27_))
				i_32_ |= 0x400;
		}
		i_32_ |= 0x20;
		if (i_31_ != 663780816)
			((AnimationDefinition) this).anInt261 = -72;
		AnimatableToolkit class64_35_ = class64.method614(i_28_, i_32_, true);
		class64_35_.method617(i_29_, i_33_, class348_sub42_sub17_34_, i,
				class348_sub42_sub17, false, ((AnimationDefinition) this).aBoolean242,
				i_27_, i_30_ + -1);
		return class64_35_;
	}

	final void method267(ByteBuffer class348_sub49, boolean bool) {
		anInt243++;
		for (;;) {
			int i = class348_sub49.getUByte();
			if (i == 0)
				break;
			initialize(class348_sub49, i, -14861);
		}
		if (bool != false)
			((AnimationDefinition) this).anIntArray267 = null;
	}

	static final void method268(int i, int i_36_, int i_37_, int i_38_,
			int i_39_, int i_40_, int i_41_, int i_42_) {
		anInt259++;
		int i_43_ = -334 + i_39_;
		if (i_43_ < 0)
			i_43_ = 0;
		else if ((i_43_ ^ 0xffffffff) < -101)
			i_43_ = 100;
		int i_44_ = (i_43_
				* (-Class348_Sub23_Sub3.aShort9044 + Class320.zoom) / 100 + Class348_Sub23_Sub3.aShort9044);
		i_42_ = i_42_ * i_44_ >> -1602789208;
		Class132.anInt1906 = Class132.anInt1911 * i_44_ >> -934350744;
		int i_45_ = 16384 - i & 0x3fff;
		int i_46_ = 0x3fff & 16384 - i_37_;
		if (i_40_ != -19360)
			anInterface4_252 = null;
		int i_47_ = 0;
		int i_48_ = 0;
		int i_49_ = i_42_;
		if ((i_45_ ^ 0xffffffff) != -1) {
			i_48_ = -i_49_ * Class70.sineTable[i_45_] >> 248857038;
			i_49_ = Class70.cosineTable[i_45_] * i_49_ >> -1986719634;
		}
		if (i_46_ != 0) {
			i_47_ = Class70.sineTable[i_46_] * i_49_ >> -185417714;
			i_49_ = i_49_ * Class70.cosineTable[i_46_] >> -1139550354;
		}
		Class5.anInt4638 = i_37_;
		Class338.anInt4186 = 0;
		Class59_Sub2_Sub2.anInt8685 = i_38_ - i_49_;
		Class305.anInt3855 = -i_48_ + i_36_;
		Class286_Sub4.anInt6246 = -i_47_ + i_41_;
		ClientScript.anInt9701 = i;
	}

	final AnimatableToolkit method269(int i, AnimatableToolkit class64, int i_50_, int i_51_,
			int i_52_, int i_53_) {
		anInt246++;
		int i_54_ = ((AnimationDefinition) this).anIntArray267[i_53_];
		int i_55_ = ((AnimationDefinition) this).anIntArray237[i_53_];
		Class348_Sub42_Sub17 class348_sub42_sub17 = ((AnimationDefinition) this).aClass87_251
				.method839(i_55_ >> 730167760, 3);
		i_55_ &= 0xffff;
		if (class348_sub42_sub17 == null)
			return class64.method614((byte) 1, i_52_, true);
		Class348_Sub42_Sub17 class348_sub42_sub17_56_ = null;
		if ((((AnimationDefinition) this).aBoolean241 || Class28.forcedTween)
				&& i_50_ != -1 && ((AnimationDefinition) this).anIntArray237.length > i_50_) {
			i_50_ = ((AnimationDefinition) this).anIntArray237[i_50_];
			class348_sub42_sub17_56_ = ((AnimationDefinition) this).aClass87_251.method839(
					i_50_ >> 996945008, 3);
			i_50_ &= 0xffff;
		}
		Class348_Sub42_Sub17 class348_sub42_sub17_57_ = null;
		Class348_Sub42_Sub17 class348_sub42_sub17_58_ = null;
		int i_59_ = 0;
		int i_60_ = 0;
		if (anIntArray260 != null) {
			if (anIntArray260.length > i_53_) {
				i_59_ = anIntArray260[i_53_];
				if ((i_59_ ^ 0xffffffff) != -65536) {
					class348_sub42_sub17_57_ = ((AnimationDefinition) this).aClass87_251
							.method839(i_59_ >> -111731472, 3);
					i_59_ &= 0xffff;
				}
			}
			if ((((AnimationDefinition) this).aBoolean241 || Class28.forcedTween)
					&& (i_50_ ^ 0xffffffff) != 0
					&& (anIntArray260.length ^ 0xffffffff) < (i_50_ ^ 0xffffffff)) {
				i_60_ = anIntArray260[i_50_];
				if (i_60_ != 65535) {
					class348_sub42_sub17_58_ = ((AnimationDefinition) this).aClass87_251
							.method839(i_60_ >> 1163760656, 3);
					i_60_ &= 0xffff;
				}
			}
		}
		if (((AnimationDefinition) this).aBoolean242)
			i_52_ |= 0x200;
		if (class348_sub42_sub17.method3272(i_55_, 0))
			i_52_ |= 0x80;
		if (class348_sub42_sub17.method3271(i_55_, 14))
			i_52_ |= 0x100;
		if (class348_sub42_sub17.method3267((byte) -102, i_55_))
			i_52_ |= 0x400;
		if (class348_sub42_sub17_57_ != null) {
			if (class348_sub42_sub17_57_.method3272(i_59_, 0))
				i_52_ |= 0x80;
			if (class348_sub42_sub17_57_.method3271(i_59_, 14))
				i_52_ |= 0x100;
			if (class348_sub42_sub17_57_.method3267((byte) -109, i_59_))
				i_52_ |= 0x400;
		}
		if (class348_sub42_sub17_56_ != null) {
			if (class348_sub42_sub17_56_.method3272(i_50_, 0))
				i_52_ |= 0x80;
			if (class348_sub42_sub17_56_.method3271(i_50_, 14))
				i_52_ |= 0x100;
			if (class348_sub42_sub17_56_.method3267((byte) -114, i_50_))
				i_52_ |= 0x400;
		}
		if (class348_sub42_sub17_58_ != null) {
			if (class348_sub42_sub17_58_.method3272(i_60_, 0))
				i_52_ |= 0x80;
			if (class348_sub42_sub17_58_.method3271(i_60_, 14))
				i_52_ |= 0x100;
			if (class348_sub42_sub17_58_.method3267((byte) -109, i_60_))
				i_52_ |= 0x400;
		}
		i_52_ |= 0x20;
		AnimatableToolkit class64_61_ = class64.method614((byte) 1, i_52_, true);
		int i_62_ = -33 / ((49 - i) / 45);
		class64_61_.method617(i_55_, i_54_, class348_sub42_sub17_56_, 0,
				class348_sub42_sub17, false, ((AnimationDefinition) this).aBoolean242,
				i_50_, -1 + i_51_);
		if (class348_sub42_sub17_57_ != null)
			class64_61_.method617(i_59_, i_54_, class348_sub42_sub17_58_, 0,
					class348_sub42_sub17_57_, false,
					((AnimationDefinition) this).aBoolean242, i_60_, -1 + i_51_);
		return class64_61_;
	}

	final void method270(byte i) {
		anInt258++;
		if ((((AnimationDefinition) this).anInt262 ^ 0xffffffff) == 0) {
			if (((AnimationDefinition) this).aBooleanArray263 == null)
				((AnimationDefinition) this).anInt262 = 0;
			else
				((AnimationDefinition) this).anInt262 = 2;
		}
		if ((((AnimationDefinition) this).anInt245 ^ 0xffffffff) == 0) {
			if (((AnimationDefinition) this).aBooleanArray263 != null)
				((AnimationDefinition) this).anInt245 = 2;
			else
				((AnimationDefinition) this).anInt245 = 0;
		}
		int i_63_ = -41 / ((i - 45) / 49);
	}

	public AnimationDefinition() {
		((AnimationDefinition) this).anInt238 = -1;
		((AnimationDefinition) this).aBoolean241 = false;
		((AnimationDefinition) this).anInt245 = -1;
		((AnimationDefinition) this).anInt239 = 5;
		((AnimationDefinition) this).aBoolean254 = false;
		((AnimationDefinition) this).anInt262 = -1;
		((AnimationDefinition) this).anInt249 = -1;
		((AnimationDefinition) this).anInt248 = 2;
		((AnimationDefinition) this).anInt261 = -1;
		((AnimationDefinition) this).anInt244 = 99;
		((AnimationDefinition) this).aBoolean268 = false;
	}
}
