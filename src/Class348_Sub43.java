/* Class348_Sub43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub43 extends Node
{
    static Class348_Sub16_Sub4 aClass348_Sub16_Sub4_7065;
    int anInt7066;
    int anInt7067;
    static int anInt7068;
    int anInt7069;
    int anInt7070;
    int anInt7071;
    int anInt7072;
    static int anInt7073;
    int anInt7074;
    Class23 aClass23_7075;
    int anInt7076;
    Class348_Sub19_Sub1 aClass348_Sub19_Sub1_7077;
    static int anInt7078;
    static int[][][] anIntArrayArrayArray7079 = new int[2][][];
    int anInt7080;
    Class348_Sub16_Sub5 aClass348_Sub16_Sub5_7081;
    int anInt7082;
    int anInt7083;
    int anInt7084;
    Class348_Sub17 aClass348_Sub17_7085;
    int anInt7086;
    int anInt7087;
    int anInt7088;
    int anInt7089;
    int anInt7090;
    
    static final void method3298
	(byte i, boolean bool,
	 Player class318_sub1_sub3_sub3_sub2) {
	anInt7073++;
	if ((FileArchiveTracker.anInt4776 ^ 0xffffffff) > -401) {
	    if (Class132.localPlayer
		== class318_sub1_sub3_sub3_sub2) {
		if (r.aBoolean9722 && (Class38.anInt500 & 0x10) != 0) {
		    Class32.anInt450++;
		    Class50_Sub3.method466
			(false,
			 (Class28.aString5000 + " -> <col=ffffff>"
			  + GameText.aClass274_3520
				.getLanguageText(Class348_Sub33.gameLanguage)),
			 0, (byte) -109, false, 0, -1, true, 50,
			 (long) ((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3_sub2).anInt10290,
			 Class28.aString5001, 0L,
			 FloatBuffer.anInt9747);
		}
	    } else {
		String string;
		if ((((Player)
		      class318_sub1_sub3_sub3_sub2).anInt10564
		     ^ 0xffffffff)
		    == -1) {
		    boolean bool_0_ = true;
		    if ((((Player)
			  Class132.localPlayer)
			 .anInt10561) != -1
			&& (((Player)
			     class318_sub1_sub3_sub3_sub2).anInt10561
			    ^ 0xffffffff) != 0) {
			int i_1_
			    = ((((((Player)
				   Class132.localPlayer)
				  .anInt10516)
				 ^ 0xffffffff)
				< (((Player)
				    class318_sub1_sub3_sub3_sub2).anInt10516
				   ^ 0xffffffff))
			       ? (((Player)
				   Class132.localPlayer)
				  .anInt10516)
			       : ((Player)
				  class318_sub1_sub3_sub3_sub2).anInt10516);
			int i_2_
			    = (((((Player)
				  Class132.localPlayer)
				 .anInt10561)
				>= ((Player)
				    class318_sub1_sub3_sub3_sub2).anInt10561)
			       ? ((Player)
				  class318_sub1_sub3_sub3_sub2).anInt10561
			       : (((Player)
				   Class132.localPlayer)
				  .anInt10561));
			int i_3_ = 5 - (-(10 * i_1_ / 100) + -i_2_);
			int i_4_
			    = (-((Player)
				 class318_sub1_sub3_sub3_sub2).anInt10516
			       + (((Player)
				   Class132.localPlayer)
				  .anInt10516));
			if ((i_4_ ^ 0xffffffff) > -1)
			    i_4_ = -i_4_;
			if ((i_4_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff))
			    bool_0_ = false;
		    }
		    String string_5_
			= ((Class14_Sub4.aClass230_8638
			    == Class348_Sub42_Sub8_Sub2.gameType)
			   ? GameText.ratingGameText
				 .getLanguageText(Class348_Sub33.gameLanguage)
			   : GameText.levelGameText
				 .getLanguageText(Class348_Sub33.gameLanguage));
		    if ((((Player)
			  class318_sub1_sub3_sub3_sub2).anInt10557
			 ^ 0xffffffff)
			>= (((Player)
			     class318_sub1_sub3_sub3_sub2).anInt10516
			    ^ 0xffffffff))
			string
			    = (class318_sub1_sub3_sub3_sub2.method2456(true,
								       255)
			       + (!bool_0_ ? "<col=ffffff>"
				  : (Class14_Sub4.method250
				     ((((Player)
					(Class132
					 .localPlayer))
				       .anInt10516),
				      true,
				      (((Player)
					class318_sub1_sub3_sub3_sub2)
				       .anInt10516))))
			       + " (" + string_5_
			       + ((Player)
				  class318_sub1_sub3_sub3_sub2).anInt10516
			       + ")");
		    else
			string
			    = (class318_sub1_sub3_sub3_sub2.method2456(true,
								       255)
			       + (bool_0_
				  ? (Class14_Sub4.method250
				     ((((Player)
					(Class132
					 .localPlayer))
				       .anInt10516),
				      true,
				      (((Player)
					class318_sub1_sub3_sub3_sub2)
				       .anInt10516)))
				  : "<col=ffffff>")
			       + " (" + string_5_
			       + ((Player)
				  class318_sub1_sub3_sub3_sub2).anInt10516
			       + "+"
			       + (-((Player)
				    class318_sub1_sub3_sub3_sub2).anInt10516
				  + ((Player)
				     class318_sub1_sub3_sub3_sub2).anInt10557)
			       + ")");
		} else if ((((Player)
			     class318_sub1_sub3_sub3_sub2).anInt10564
			    ^ 0xffffffff)
			   == 0)
		    string
			= class318_sub1_sub3_sub3_sub2.method2456(true, 255);
		else
		    string
			= (class318_sub1_sub3_sub3_sub2.method2456(true, 255)
			   + " ("
			   + GameText.skillGameText
				 .getLanguageText(Class348_Sub33.gameLanguage)
			   + ((Player)
			      class318_sub1_sub3_sub3_sub2).anInt10564
			   + ")");
		if (r.aBoolean9722 && !bool && (0x8 & Class38.anInt500) != 0) {
		    Class50_Sub3.method466
			(false,
			 Class28.aString5000 + " -> <col=ffffff>" + string, 0,
			 (byte) -109, false, 0, -1, true, 51,
			 (long) ((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3_sub2).anInt10290,
			 Class28.aString5001,
			 (long) ((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3_sub2).anInt10290,
			 FloatBuffer.anInt9747);
		    Class341.anInt4228++;
		}
		if (i <= 89)
		    anInt7068 = -113;
		if (bool)
		    Class50_Sub3.method466
			(true, "", 0, (byte) -115, false, 0, 0, false, -1,
			 (long) ((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3_sub2).anInt10290,
			 "<col=cccccc>" + string, 0L, -1);
		else {
		    for (int i_6_ = 7; (i_6_ ^ 0xffffffff) <= -1; i_6_--) {
			if (Class318_Sub1_Sub2_Sub1.aStringArray10195[i_6_]
			    != null) {
			    short i_7_ = 0;
			    if ((Class348_Sub42_Sub8_Sub2.gameType!= Class10.aClass230_186) || !(Class318_Sub1_Sub2_Sub1.aStringArray10195[i_6_].equalsIgnoreCase(GameText.attackGameText.getLanguageText(Class348_Sub33.gameLanguage)))) {
				if (Class71.aBooleanArray1214[i_6_])
				    i_7_ = (short) 2000;
			    } else {
				if ((((Player)
				      (Class132
				       .localPlayer))
				     .anInt10516)
				    < (((Player)
					class318_sub1_sub3_sub3_sub2)
				       .anInt10516))
				    i_7_ = (short) 2000;
				if ((((Player)
				      (Class132
				       .localPlayer))
				     .anInt10542) != 0
				    && (((Player)
					 class318_sub1_sub3_sub3_sub2)
					.anInt10542) != 0) {
				    if (((((Player)
					   (Class132
					    .localPlayer))
					  .anInt10542)
					 ^ 0xffffffff)
					!= ((((Player)
					      class318_sub1_sub3_sub3_sub2)
					     .anInt10542)
					    ^ 0xffffffff))
					i_7_ = (short) 0;
				    else
					i_7_ = (short) 2000;
				}
			    }
			    short i_8_
				= (short) (i_7_ + (GameBuffer
						   .aShortArray9768[i_6_]));
			    int i_9_ = (Canvas_Sub1.anIntArray60[i_6_] == -1
					? Class38.anInt506
					: Canvas_Sub1.anIntArray60[i_6_]);
			    Class50_Sub3.method466
				(false, "<col=ffffff>" + string, 0,
				 (byte) -105, false, 0, -1, true, i_8_,
				 (long) (((Class318_Sub1_Sub3_Sub3)
					  class318_sub1_sub3_sub3_sub2)
					 .anInt10290),
				 (Class318_Sub1_Sub2_Sub1.aStringArray10195
				  [i_6_]),
				 (long) (((Class318_Sub1_Sub3_Sub3)
					  class318_sub1_sub3_sub3_sub2)
					 .anInt10290),
				 i_9_);
			    Canvas_Sub1.anInt69++;
			}
		    }
		}
		if (!bool) {
		    for (Class348_Sub42_Sub12 class348_sub42_sub12
			     = (Class348_Sub42_Sub12) Class348_Sub40_Sub4
							  .aClass262_9111
							  .getFirst(4);
			 class348_sub42_sub12 != null;
			 class348_sub42_sub12
			     = ((Class348_Sub42_Sub12)
				Class348_Sub40_Sub4.aClass262_9111
				    .nextForward((byte) 105))) {
			if ((((Class348_Sub42_Sub12) class348_sub42_sub12)
			     .anInt9608)
			    == 19) {
			    ((Class348_Sub42_Sub12) class348_sub42_sub12)
				.aString9595
				= "<col=ffffff>" + string;
			    break;
			}
		    }
		}
	    }
	}
    }
    
    final void method3299(byte i) {
	anInt7078++;
	((Class348_Sub43) this).aClass348_Sub16_Sub5_7081 = null;
	((Class348_Sub43) this).aClass348_Sub19_Sub1_7077 = null;
	int i_10_ = 71 / ((i - -26) / 58);
	((Class348_Sub43) this).aClass23_7075 = null;
	((Class348_Sub43) this).aClass348_Sub17_7085 = null;
    }
    
    public static void method3300(int i) {
	anIntArrayArrayArray7079 = null;
	aClass348_Sub16_Sub4_7065 = null;
	if (i != 0)
	    method3300(-61);
    }
    
    static {
	anInt7068 = 0;
    }
}
