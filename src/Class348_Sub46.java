/* Class348_Sub46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub46 extends Node
{
    static int anInt7109;
    static int anInt7110;
    String aString7111;
    static int anInt7112;
    static IncomingPacket incomingPacket97 = new IncomingPacket(97, 0);
    static int anInt7114;
    static int anInt7115 = 1;
    
    static final void method3317(byte i) {
	if (Class299_Sub1.consoleOutputStream != null) {
	    try {
		Class299_Sub1.consoleOutputStream.close();
	    } catch (java.io.IOException ioexception) {
		/* empty */
	    }
	}
	if (i > -33)
	    method3321(-73, 3, 6);
	anInt7110++;
	Class299_Sub1.consoleOutputStream = null;
    }
    
    public static void method3318(byte i) {
	if (i != -80)
	    method3322(-26, null);
	incomingPacket97 = null;
    }
    
    static final void method3319(AbstractToolkit var_ha, byte i) {
	if (i > -108)
	    method3321(19, 60, 108);
	anInt7114++;
	if (((Class334.anInt4155 ^ 0xffffffff)
	     != ((((Class318_Sub1) Class132.localPlayer)
		  .aByte6381)
		 ^ 0xffffffff))
	    && Message.aClass357ArrayArrayArray2029 != null) {
	    if (LongNode.method2808
		((((Class318_Sub1) Class132.localPlayer)
		  .aByte6381),
		 var_ha, true))
		Class334.anInt4155
		    = ((Class318_Sub1)
		       Class132.localPlayer).aByte6381;
	}
    }
    
    static final void method3320(Class318_Sub1_Sub3 class318_sub1_sub3,
				 boolean bool) {
	for (int i = ((Class318_Sub1_Sub3) class318_sub1_sub3).aShort8743;
	     i <= ((Class318_Sub1_Sub3) class318_sub1_sub3).aShort8751; i++) {
	    for (int i_0_
		     = ((Class318_Sub1_Sub3) class318_sub1_sub3).aShort8750;
		 i_0_ <= ((Class318_Sub1_Sub3) class318_sub1_sub3).aShort8747;
		 i_0_++) {
		Class357 class357
		    = (Message.aClass357ArrayArrayArray2029
		       [((Class318_Sub1) class318_sub1_sub3).aByte6381][i]
		       [i_0_]);
		if (class357 != null) {
		    Class148 class148 = ((Class357) class357).aClass148_4396;
		    Class148 class148_1_ = null;
		    for (/**/; class148 != null;
			 class148 = ((Class148) class148).aClass148_2038) {
			if (((Class148) class148).aClass318_Sub1_Sub3_2040
			    == class318_sub1_sub3) {
			    if (class148_1_ != null)
				((Class148) class148_1_).aClass148_2038
				    = ((Class148) class148).aClass148_2038;
			    else
				((Class357) class357).aClass148_4396
				    = ((Class148) class148).aClass148_2038;
			    class148.method1199((byte) -106);
			    break;
			}
			class148_1_ = class148;
		    }
		}
	    }
	}
	if (!bool)
	    Class183.method1376(class318_sub1_sub3);
    }
    
    static final Class357 method3321(int i, int i_2_, int i_3_) {
	if (Message.aClass357ArrayArrayArray2029[i][i_2_][i_3_] == null) {
	    boolean bool
		= (Message.aClass357ArrayArrayArray2029[0][i_2_][i_3_] != null
		   && ((Class357) (Message.aClass357ArrayArrayArray2029[0]
				   [i_2_][i_3_])).aClass357_4400 != null);
	    if (bool && i >= Class189.anInt2524 - 1)
		return null;
	    Class185.method1394(i, i_2_, i_3_);
	}
	return Message.aClass357ArrayArrayArray2029[i][i_2_][i_3_];
    }
    
    static final Class369_Sub3 method3322(int i,
					  ByteBuffer class348_sub49) {
	anInt7109++;
	Class369 class369
	    = Class348_Sub16_Sub2.method2834((byte) -125, class348_sub49);
	int i_4_ = class348_sub49.getShort();
	int i_5_ = class348_sub49.getShort();
	if (i != 0)
	    incomingPacket97 = null;
	int i_6_ = class348_sub49.getShort();
	int i_7_ = class348_sub49.getShort();
	int i_8_ = class348_sub49.getShort();
	int i_9_ = class348_sub49.getShort();
	return new Class369_Sub3(((Class369) class369).aClass221_4968,
				 ((Class369) class369).aClass341_4973,
				 ((Class369) class369).anInt4970,
				 ((Class369) class369).anInt4959,
				 ((Class369) class369).anInt4971,
				 ((Class369) class369).anInt4963,
				 ((Class369) class369).anInt4966,
				 ((Class369) class369).anInt4965,
				 ((Class369) class369).anInt4961, i_4_, i_5_,
				 i_6_, i_7_, i_8_, i_9_);
    }
    
    public Class348_Sub46() {
	/* empty */
    }
    
    Class348_Sub46(String string, int i) {
	((Class348_Sub46) this).aString7111 = string;
    }
}
