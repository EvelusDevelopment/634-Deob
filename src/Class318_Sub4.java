/* Class318_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class318_Sub4 extends Class318
{
    static int anInt6407;
    static int anInt6408;
    boolean aBoolean6409;
    Class318_Sub1 aClass318_Sub1_6410;
    static int anInt6411 = 0;
    static int anInt6412;
    static int anInt6413;
    Class318_Sub3[] aClass318_Sub3Array6414;
    
    static final aa_Sub2 method2501(int i, NativeToolkit var_ha_Sub3, int[] is,
				    byte i_0_, int[] is_1_, int i_2_) {
	try {
	    if (i_0_ >= -32)
		method2502(null, -18);
	    anInt6412++;
	    if (var_ha_Sub3.method3880(Class68.aClass68_1183,
				       Class348_Sub40_Sub38.aClass304_9471,
				       (byte) 125)) {
		byte[] is_3_ = new byte[i * i_2_];
		for (int i_4_ = 0; i > i_4_; i_4_++) {
		    int i_5_ = is[i_4_] + i_2_ * i_4_;
		    for (int i_6_ = 0;
			 (i_6_ ^ 0xffffffff) > (is_1_[i_4_] ^ 0xffffffff);
			 i_6_++)
			is_3_[i_5_++] = (byte) -1;
		}
		return new aa_Sub2(var_ha_Sub3, i_2_, i, is_3_);
	    }
	    int[] is_7_ = new int[i * i_2_];
	    for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_8_++) {
		int i_9_ = is[i_8_] + i_8_ * i_2_;
		for (int i_10_ = 0;
		     (is_1_[i_8_] ^ 0xffffffff) < (i_10_ ^ 0xffffffff);
		     i_10_++)
		    is_7_[i_9_++] = -16777216;
	    }
	    return new aa_Sub2(var_ha_Sub3, i_2_, i, is_7_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("jda.A(" + i + ','
					     + (var_ha_Sub3 != null ? "{...}"
						: "null")
					     + ','
					     + (is != null ? "{...}" : "null")
					     + ',' + i_0_ + ','
					     + (is_1_ != null ? "{...}"
						: "null")
					     + ',' + i_2_ + ')'));
	}
    }
    
    static final ClientScript method2502(byte[] is, int i) {
	if (i >= -76)
	    return null;
	anInt6413++;
	ClientScript class348_sub42_sub19 = new ClientScript();
	ByteBuffer class348_sub49 = new ByteBuffer(is);
	((ByteBuffer) class348_sub49).position
	    = -2 + ((ByteBuffer) class348_sub49).payload.length;
	int i_11_ = class348_sub49.getShort();
	int i_12_ = -12 + -i_11_ + (-2 + (((ByteBuffer) class348_sub49)
					  .payload).length);
	((ByteBuffer) class348_sub49).position = i_12_;
	int i_13_ = class348_sub49.getDWord();
	((ClientScript) class348_sub42_sub19).anInt9688
	    = class348_sub49.getShort();
	((ClientScript) class348_sub42_sub19).anInt9689
	    = class348_sub49.getShort();
	((ClientScript) class348_sub42_sub19).anInt9697
	    = class348_sub49.getShort();
	((ClientScript) class348_sub42_sub19).anInt9695
	    = class348_sub49.getShort();
	int i_14_ = class348_sub49.getUByte();
	if (i_14_ > 0) {
	    ((ClientScript) class348_sub42_sub19).aClass356Array9693
		= new HashTable[i_14_];
	    for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
		int i_16_ = class348_sub49.getShort();
		HashTable class356
		    = new HashTable(Class33.method340(i_16_, (byte) 108));
		((ClientScript) class348_sub42_sub19)
		    .aClass356Array9693[i_15_]
		    = class356;
		while (i_16_-- > 0) {
		    int i_17_ = class348_sub49.getDWord();
		    int i_18_ = class348_sub49.getDWord();
		    class356.putNode((long) i_17_,
					new Class348_Sub35(i_18_));
		}
	    }
	}
	((ByteBuffer) class348_sub49).position = 0;
	((ClientScript) class348_sub42_sub19).aString9690
	    = class348_sub49.method3384(107);
	((ClientScript) class348_sub42_sub19).anIntArray9694
	    = new int[i_13_];
	((ClientScript) class348_sub42_sub19).anIntArray9696
	    = new int[i_13_];
	((ClientScript) class348_sub42_sub19).strOperands
	    = new String[i_13_];
	int i_19_ = 0;
	while ((i_12_ ^ 0xffffffff)
	       < (((ByteBuffer) class348_sub49).position ^ 0xffffffff)) {
	    int i_20_ = class348_sub49.getShort();
	    if ((i_20_ ^ 0xffffffff) != -4) {
		if (i_20_ >= 100 || (i_20_ ^ 0xffffffff) == -22
		    || (i_20_ ^ 0xffffffff) == -39
		    || (i_20_ ^ 0xffffffff) == -40)
		    ((ClientScript) class348_sub42_sub19)
			.anIntArray9694[i_19_]
			= class348_sub49.getUByte();
		else
		    ((ClientScript) class348_sub42_sub19)
			.anIntArray9694[i_19_]
			= class348_sub49.getDWord();
	    } else
		((ClientScript) class348_sub42_sub19)
		    .strOperands[i_19_]
		    = class348_sub49.getJStr().intern();
	    ((ClientScript) class348_sub42_sub19).anIntArray9696
		[i_19_++]
		= i_20_;
	}
	return class348_sub42_sub19;
    }
    
    static final boolean method2503(int i, int i_21_, int i_22_, byte[] is,
				    int i_23_, int i_24_, int i_25_) {
	anInt6408++;
	int i_26_ = i_23_ % i_22_;
	int i_27_;
	if (i_26_ != 0)
	    i_27_ = i_22_ - i_26_;
	else
	    i_27_ = 0;
	int i_28_ = -((-1 + (i_22_ + i_25_)) / i_22_);
	if (i_24_ != -16259)
	    method2501(-113, null, null, (byte) 40, null, -110);
	int i_29_ = -((i_22_ + i_23_ + -1) / i_22_);
	for (int i_30_ = i_28_; (i_30_ ^ 0xffffffff) > -1; i_30_++) {
	    for (int i_31_ = i_29_; i_31_ < 0; i_31_++) {
		if ((is[i_21_] ^ 0xffffffff) == -1)
		    return true;
		i_21_ += i_22_;
	    }
	    i_21_ -= i_27_;
	    if ((is[-1 + i_21_] ^ 0xffffffff) == -1)
		return true;
	    i_21_ += i;
	}
	return false;
    }
    
    final boolean method2504(int i, int i_32_, AbstractToolkit var_ha, int i_33_) {
	if (i_33_ >= -37)
	    method2502(null, -82);
	anInt6407++;
	int i_34_
	    = ((Class318_Sub4) this).aClass318_Sub1_6410.method2393(-117);
	if (((Class318_Sub4) this).aClass318_Sub3Array6414 != null) {
	    for (int i_35_ = 0;
		 ((Class318_Sub4) this).aClass318_Sub3Array6414.length > i_35_;
		 i_35_++) {
		((Class318_Sub3) (((Class318_Sub4) this)
				  .aClass318_Sub3Array6414[i_35_])).anInt6403
		    <<= i_34_;
		if (((Class318_Sub4) this).aClass318_Sub3Array6414[i_35_]
			.method2500(i_32_, i)
		    && ((Class318_Sub4) this).aClass318_Sub1_6410
			   .method2391(var_ha, i, i_32_, 0)) {
		    ((Class318_Sub3) (((Class318_Sub4) this)
				      .aClass318_Sub3Array6414
				      [i_35_])).anInt6403
			>>= i_34_;
		    return true;
		}
		((Class318_Sub3) (((Class318_Sub4) this)
				  .aClass318_Sub3Array6414[i_35_])).anInt6403
		    >>= i_34_;
	    }
	}
	return false;
    }
}
