/* Class321 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class321
{
    static int anInt3995;
    private int[][] anIntArrayArray3996;
    private int[][] anIntArrayArray3997;
    private int[] anIntArray3998;
    static int anInt3999;
    int anInt4000 = -1;
    private int[] anIntArray4001;
    private int[][] anIntArrayArray4002;
    private int[] anIntArray4003;
    private int[] anIntArray4004;
    static int anInt4005 = -1;
    private HashTable aClass356_4006;
    private int[] anIntArray4007;
    private int[] anIntArray4008;
    private int[] anIntArray4009;
    private String aString4010;
    private String[] aStringArray4011;
    private String aString4012;
    static int anInt4013;
    private int[] anIntArray4014;
    static IncomingPacket aClass114_4015 = new IncomingPacket(116, 6);
    private String[] aStringArray4016;
    static int windowWidth;
    
    final void method2548(byte i) {
	if (i <= 117)
	    initialize(null, -119, (byte) 18);
	anInt3999++;
	if (aString4010 == null)
	    aString4010 = aString4012;
    }
    
    public static void method2549(byte i) {
	if (i > -74)
	    method2549((byte) 75);
	aClass114_4015 = null;
    }
    
    private final void initialize(ByteBuffer class348_sub49, int i,
				  byte i_0_) {
	if (i_0_ != 52)
	    anIntArray4014 = null;
	anInt4013++;
	if ((i ^ 0xffffffff) != -2) {
	    if (i == 2)
		aString4010 = class348_sub49.getJStr2(i_0_ ^ ~0x349a);
	    else if ((i ^ 0xffffffff) == -4) {
		int i_1_ = class348_sub49.getUByte();
		anIntArrayArray3997 = new int[i_1_][3];
		for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff);
		     i_2_++) {
		    anIntArrayArray3997[i_2_][0]
			= class348_sub49.getShort();
		    anIntArrayArray3997[i_2_][1]
			= class348_sub49.getDWord();
		    anIntArrayArray3997[i_2_][2]
			= class348_sub49.getDWord();
		}
	    } else if ((i ^ 0xffffffff) != -5) {
		if ((i ^ 0xffffffff) != -6) {
		    if (i == 6)
			class348_sub49.getUByte();
		    else if ((i ^ 0xffffffff) == -8)
			class348_sub49.getUByte();
		    else if (i != 8) {
			if ((i ^ 0xffffffff) != -10) {
			    if ((i ^ 0xffffffff) == -11) {
				int i_3_
				    = class348_sub49.getUByte();
				anIntArray4008 = new int[i_3_];
				for (int i_4_ = 0;
				     (i_4_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff);
				     i_4_++)
				    anIntArray4008[i_4_]
					= class348_sub49
					      .getDWord();
			    } else if (i != 12) {
				if ((i ^ 0xffffffff) != -14) {
				    if (i != 14) {
					if (i == 15)
					    class348_sub49
						.getShort();
					else if ((i ^ 0xffffffff) == -18)
					    ((Class321) this).anInt4000
						= class348_sub49
						      .getShort();
					else if ((i ^ 0xffffffff) == -19) {
					    int i_5_ = class348_sub49
							   .getUByte();
					    anIntArray4014 = new int[i_5_];
					    aStringArray4011
						= new String[i_5_];
					    anIntArray4007 = new int[i_5_];
					    anIntArray4001 = new int[i_5_];
					    for (int i_6_ = 0;
						 ((i_5_ ^ 0xffffffff)
						  < (i_6_ ^ 0xffffffff));
						 i_6_++) {
						anIntArray4014[i_6_]
						    = (class348_sub49
							   .getDWord
						       ());
						anIntArray4001[i_6_]
						    = (class348_sub49
							   .getDWord
						       ());
						anIntArray4007[i_6_]
						    = (class348_sub49
							   .getDWord
						       ());
						aStringArray4011[i_6_]
						    = (class348_sub49
							   .getJStr
						       ());
					    }
					} else if ((i ^ 0xffffffff) == -20) {
					    int i_7_ = class348_sub49
							   .getUByte();
					    aStringArray4016
						= new String[i_7_];
					    anIntArray4003 = new int[i_7_];
					    anIntArray4009 = new int[i_7_];
					    anIntArray3998 = new int[i_7_];
					    for (int i_8_ = 0;
						 ((i_7_ ^ 0xffffffff)
						  < (i_8_ ^ 0xffffffff));
						 i_8_++) {
						anIntArray4009[i_8_]
						    = (class348_sub49
							   .getDWord
						       ());
						anIntArray3998[i_8_]
						    = (class348_sub49
							   .getDWord
						       ());
						anIntArray4003[i_8_]
						    = (class348_sub49
							   .getDWord
						       ());
						aStringArray4016[i_8_]
						    = (class348_sub49
							   .getJStr
						       ());
					    }
					} else if (i == 249) {
					    int i_9_ = class348_sub49
							   .getUByte();
					    if (aClass356_4006 == null) {
						int i_10_
						    = (Class33.method340
						       (i_9_, (byte) 108));
						aClass356_4006
						    = new HashTable(i_10_);
					    }
					    for (int i_11_ = 0; i_9_ > i_11_;
						 i_11_++) {
						boolean bool
						    = ((class348_sub49
							    .getUByte()
							^ 0xffffffff)
						       == -2);
						int i_12_
						    = class348_sub49
							  .getTri();
						Node class348;
						if (!bool)
						    class348
							= (new Class348_Sub35
							   (class348_sub49
								.getDWord
							    ()));
						else
						    class348
							= (new StringNode
							   (class348_sub49
								.getJStr
							    ()));
						aClass356_4006.putNode
						    ((long) i_12_,
						     class348);
					    }
					}
				    } else {
					int i_13_
					    = class348_sub49
						  .getUByte();
					anIntArrayArray4002
					    = new int[i_13_][2];
					for (int i_14_ = 0; i_14_ < i_13_;
					     i_14_++) {
					    anIntArrayArray4002[i_14_][0]
						= class348_sub49
						      .getUByte();
					    anIntArrayArray4002[i_14_][1]
						= (class348_sub49.getUByte
						   ());
					}
				    }
				} else {
				    int i_15_ = class348_sub49.getUByte();
				    anIntArray4004 = new int[i_15_];
				    for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
					anIntArray4004[i_16_]
					    = class348_sub49
						  .getShort();
				}
			    } else
				class348_sub49.getDWord();
			} else
			    class348_sub49.getUByte();
		    }
		} else
		    class348_sub49.getShort();
	    } else {
		int i_17_ = class348_sub49.getUByte();
		anIntArrayArray3996 = new int[i_17_][3];
		for (int i_18_ = 0;
		     (i_18_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff); i_18_++) {
		    anIntArrayArray3996[i_18_][0]
			= class348_sub49.getShort();
		    anIntArrayArray3996[i_18_][1]
			= class348_sub49.getDWord();
		    anIntArrayArray3996[i_18_][2]
			= class348_sub49.getDWord();
		}
	    }
	} else
	    aString4012 = class348_sub49.getJStr2(-13487);
    }
    
    final void initialize(int i, ByteBuffer class348_sub49) {
	int i_19_ = -14 / ((i - -56) / 61);
	anInt3995++;
	for (;;) {
	    int opcode = class348_sub49.getUByte();
	    if (opcode == 0)
		break;
	    initialize(class348_sub49, opcode, (byte) 52);
	}
    }
    
    public Class321() {
	/* empty */
    }
}
