/* Class286_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.TimeZone;

import jaggl.OpenGL;

final class Class286_Sub3 extends Class286
{
    static int anInt6214;
    static int anInt6215;
    static int anInt6216;
    static int anInt6217;
    private float[] aFloatArray6218;
    private int anInt6219;
    private Class171 aClass171_6220;
    static Calendar aCalendar6221
	= Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    private Class61 aClass61_6222;
    static int anInt6223;
    static int anInt6224;
    private float aFloat6225;
    static int anInt6226;
    private Class83 aClass83_6227;
    static int[] anIntArray6228;
    static int anInt6229;
    static int anInt6230;
    static int anInt6231;
    static int anInt6232;
    
    final void method2136(int i, int i_0_, byte i_1_) {
	anInt6224++;
	if (aClass61_6222 != null) {
	    if (i_1_ >= -42)
		method2149(-65);
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
	    if ((i & 0x80) != 0)
		((Class286) this).aHa_Sub2_3684.method3771((byte) -122, null);
	    else if ((0x1 & i_0_) != 1) {
		if (!((Class83) aClass83_6227).aBoolean1442)
		    ((Class286) this).aHa_Sub2_3684.method3771
			((byte) -84,
			 ((Class83) aClass83_6227).aClass258_Sub3Array1444[0]);
		else
		    ((Class286) this).aHa_Sub2_3684.method3771
			((byte) -97,
			 ((Class83) aClass83_6227).aClass258_Sub1_1440);
		OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
						    0.0F, 1.0F);
	    } else if (!((Class83) aClass83_6227).aBoolean1442) {
		int i_2_
		    = (((DirectxToolkit) ((Class286) this).aHa_Sub2_3684).anInt7735
		       % 4000 * 16 / 4000);
		((Class286) this).aHa_Sub2_3684.method3771
		    ((byte) -88,
		     ((Class83) aClass83_6227).aClass258_Sub3Array1444[i_2_]);
		OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
						    0.0F, 1.0F);
	    } else {
		((Class286) this).aHa_Sub2_3684.method3771
		    ((byte) -83,
		     ((Class83) aClass83_6227).aClass258_Sub1_1440);
		OpenGL.glProgramLocalParameter4fARB(34336, 65, aFloat6225,
						    0.0F, 0.0F, 1.0F);
	    }
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
	    if ((0x40 & i) != 0)
		OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F,
						    1.0F, 1.0F);
	    else {
		Class348_Sub42_Sub1.aFloatArray9491[2]
		    = (((DirectxToolkit) ((Class286) this).aHa_Sub2_3684).aFloat7823
		       * (((DirectxToolkit) ((Class286) this).aHa_Sub2_3684)
			  .aFloat7768));
		Class348_Sub42_Sub1.aFloatArray9491[0]
		    = (((DirectxToolkit) ((Class286) this).aHa_Sub2_3684).aFloat7781
		       * (((DirectxToolkit) ((Class286) this).aHa_Sub2_3684)
			  .aFloat7768));
		Class348_Sub42_Sub1.aFloatArray9491[1]
		    = (((DirectxToolkit) ((Class286) this).aHa_Sub2_3684).aFloat7768
		       * (((DirectxToolkit) ((Class286) this).aHa_Sub2_3684)
			  .aFloat7816));
		OpenGL.glProgramLocalParameter4fvARB(34336, 66,
						     (Class348_Sub42_Sub1
						      .aFloatArray9491),
						     0);
	    }
	    int i_3_ = i & 0x3;
	    if (i_3_ == 2)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F,
						    1.0F, 1.0F);
	    else if (i_3_ == 3)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F,
						    1.0F, 1.0F);
	    else
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F,
						    1.0F, 1.0F);
	}
    }
    
    final void method2140(Class258 class258, byte i, int i_4_) {
	if (i <= -89) {
	    anInt6216++;
	    ((Class286) this).aHa_Sub2_3684.method3771((byte) -115, class258);
	    ((Class286) this).aHa_Sub2_3684.method3761(0, i_4_);
	}
    }
    
    static final BufferedPacket createBufferedPacket(OutgoingPacket outgoingPacket, ISAAC isaac) {
	try {
	    anInt6230++;
	    BufferedPacket packet = Class300.getBufferedOutgoingPacket();
	    ((BufferedPacket) packet).sizeType = ((OutgoingPacket) outgoingPacket).sizeType;
	    ((BufferedPacket) packet).outgoingPacket = outgoingPacket;
	    if ((((BufferedPacket) packet).sizeType ^ 0xffffffff)
		!= 0) {
		if (((BufferedPacket) packet).sizeType == -2)
		    ((BufferedPacket) packet).buffer
			= new GameBuffer(10000);
		else if (((BufferedPacket) packet).sizeType <= 18)
		    ((BufferedPacket) packet).buffer
			= new GameBuffer(20);
		else if (((BufferedPacket) packet).sizeType <= 98)
		    ((BufferedPacket) packet).buffer
			= new GameBuffer(100);
		else
		    ((BufferedPacket) packet).buffer
			= new GameBuffer(260);
	    } else
		((BufferedPacket) packet).buffer
		    = new GameBuffer(260);
	    ((BufferedPacket) packet).buffer.setEncryption(-17, isaac);
	    ((BufferedPacket) packet).buffer.encipherPacket(((BufferedPacket) packet).outgoingPacket.getOpcode(200), 18676);
	    ((BufferedPacket) packet).bufferPosition = 0;
	    return packet;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("em.C("
					     + (outgoingPacket != null ? "{...}"
						: "null")
					     + ','
					     + (isaac != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    Class286_Sub3(DirectxToolkit var_ha_Sub2, Class83 class83) {
	super(var_ha_Sub2);
	do {
	    try {
		aClass83_6227 = class83;
		if (!((DirectxToolkit) ((Class286) this).aHa_Sub2_3684).aBoolean7841
		    || (((DirectxToolkit) ((Class286) this).aHa_Sub2_3684).anInt7795
			< 2))
		    break;
		aClass171_6220
		    = (Class50.method459
		       (34336, ((Class286) this).aHa_Sub2_3684,
			"!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND",
			false));
		if (aClass171_6220 != null) {
		    int[][] is
			= GameBuffer.method3413(4, 3, 64, 4, 256,
							 true, 0, 0.4F, false);
		    int[][] is_5_
			= GameBuffer.method3413(4, 3, 64, 4, 256,
							 true, 8, 0.4F, false);
		    aFloatArray6218 = new float[32768];
		    int i = 0;
		    for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -257; i_6_++) {
			int[] is_7_ = is[i_6_];
			int[] is_8_ = is_5_[i_6_];
			for (int i_9_ = 0; i_9_ < 64; i_9_++) {
			    aFloatArray6218[i++]
				= (float) is_7_[i_9_] / 4096.0F;
			    aFloatArray6218[i++]
				= (float) is_8_[i_9_] / 4096.0F;
			}
		    }
		    method2149(-25);
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("em.<init>("
						 + (var_ha_Sub2 != null
						    ? "{...}" : "null")
						 + ','
						 + (class83 != null ? "{...}"
						    : "null")
						 + ')'));
	    }
	    break;
	} while (false);
    }
    
    private final void method2149(int i) {
	anInt6217++;
	aClass61_6222 = new Class61(((Class286) this).aHa_Sub2_3684, 2);
	aClass61_6222.method595((byte) 103, 0);
	((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
	((Class286) this).aHa_Sub2_3684.method3808(-16777216, 118);
	((Class286) this).aHa_Sub2_3684.method3729(260, (byte) 114, 7681);
	((Class286) this).aHa_Sub2_3684.method3775(false, 0, 770, 34166);
	((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
	OpenGL.glBindProgramARB(34336, ((Class171) aClass171_6220).anInt2270);
	OpenGL.glEnable(34336);
	aClass61_6222.method591(-1);
	aClass61_6222.method595((byte) 127, 1);
	int i_10_ = 65 / ((i - 62) / 49);
	((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	((Class286) this).aHa_Sub2_3684.method3761(0, 0);
	((Class286) this).aHa_Sub2_3684.method3775(false, 0, 770, 5890);
	((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
	OpenGL.glBindProgramARB(34336, 0);
	OpenGL.glDisable(34336);
	OpenGL.glDisable(34820);
	aClass61_6222.method591(-1);
    }
    
    final boolean method2137(int i) {
	if (i >= -5)
	    return true;
	anInt6215++;
	return true;
    }
    
    final void method2133(int i) {
	anInt6231++;
	if (aClass61_6222 != null) {
	    if (i >= -75)
		method2134(true, false);
	    aClass61_6222.method594('\001', 28666);
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
	    ((Class286) this).aHa_Sub2_3684.method3771((byte) -103, null);
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
	}
    }
    
    final void method2134(boolean bool, boolean bool_11_) {
	anInt6232++;
	if (aClass61_6222 != null) {
	    aClass61_6222.method594('\0', 28666);
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
	    OpenGL.glMatrixMode(5890);
	    if (bool_11_ == false) {
		OpenGL.glLoadMatrixf(((DirectxToolkit)
				      ((Class286) this).aHa_Sub2_3684)
					 .aClass101_Sub3_7767.method940(1),
				     0);
		OpenGL.glMatrixMode(5888);
		((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
		if ((anInt6219 ^ 0xffffffff)
		    != (((DirectxToolkit) ((Class286) this).aHa_Sub2_3684).anInt7735
			^ 0xffffffff)) {
		    int i = ((((DirectxToolkit) ((Class286) this).aHa_Sub2_3684)
			      .anInt7735)
			     % 5000 * 128 / 5000);
		    for (int i_12_ = 0; i_12_ < 64; i_12_++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, i_12_,
							     aFloatArray6218,
							     i);
			i += 2;
		    }
		    if (((Class83) aClass83_6227).aBoolean1442)
			aFloat6225
			    = (float) (((DirectxToolkit) (((Class286) this)
						   .aHa_Sub2_3684)).anInt7735
				       % 4000) / 4000.0F;
		    else
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F,
							    0.0F, 0.0F, 1.0F);
		    anInt6219 = (((DirectxToolkit) ((Class286) this).aHa_Sub2_3684)
				 .anInt7735);
		}
	    }
	}
    }
    
    final void method2139(boolean bool, byte i) {
	int i_13_ = 22 % ((-60 - i) / 38);
	anInt6229++;
    }
    
    static final void method2150
	(boolean bool, boolean bool_14_,
	 Npc class318_sub1_sub3_sub3_sub1) {
	anInt6226++;
	if ((FileArchiveTracker.anInt4776 ^ 0xffffffff) > -401) {
	    NpcDefinition class79 = (((Npc)
				class318_sub1_sub3_sub3_sub1)
			       .definition);
	    if (((NpcDefinition) class79).anIntArray1377 != null) {
		class79 = class79.method794((Class318_Sub1_Sub3_Sub3
					     .varbitHandler),
					    -1);
		if (class79 == null)
		    return;
	    }
	    if (((NpcDefinition) class79).aBoolean1396) {
		String string = ((NpcDefinition) class79).name;
		if ((((NpcDefinition) class79).anInt1361 ^ 0xffffffff) != -1) {
		    String string_15_
			= ((Class14_Sub4.aClass230_8638
			    != Class348_Sub42_Sub8_Sub2.gameType)
			   ? GameText.levelGameText
				 .getLanguageText(Class348_Sub33.gameLanguage)
			   : GameText.ratingGameText
				 .getLanguageText(Class348_Sub33.gameLanguage));
		    string += ((Class14_Sub4.method250
				((((Player)
				   Class132.localPlayer)
				  .anInt10516),
				 true, ((NpcDefinition) class79).anInt1361))
			       + " (" + (String) string_15_
			       + ((NpcDefinition) class79).anInt1361 + ")");
		}
		if (r.aBoolean9722 && !bool) {
		    Class254 class254
			= (Class246.anInt3176 == -1 ? null
			   : Class101_Sub3.aClass326_5764
				 .method2600(Class246.anInt3176, 28364));
		    if ((Class38.anInt500 & 0x2) != 0
			&& (class254 == null
			    || (class79.method805((((Class254) class254)
						   .anInt3256),
						  Class246.anInt3176, 61)
				!= ((Class254) class254).anInt3256))) {
			Class50_Sub3.method466
			    (false,
			     Class28.aString5000 + " -> <col=ffff00>" + string,
			     0, (byte) -81, false, 0, -1, true, 30,
			     (long) ((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3_sub1).anInt10290,
			     Class28.aString5001,
			     (long) ((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3_sub1).anInt10290,
			     FloatBuffer.anInt9747);
			Class193.anInt2586++;
		    }
		}
		if (!bool) {
		    String[] strings = ((NpcDefinition) class79).aStringArray1349;
		    if (za_Sub2.aBoolean9783)
			strings = Class239_Sub28.method1847(strings, 0);
		    if (strings != null) {
			for (int i = 4; i >= 0; i--) {
			    if (strings[i] != null
				&& ((((NpcDefinition) class79).aByte1384
				     ^ 0xffffffff) == -1
				    || !(strings[i].equalsIgnoreCase
					 (GameText.attackGameText.getLanguageText
					  (Class348_Sub33.gameLanguage))))) {
				int i_16_ = 0;
				if (i == 0)
				    i_16_ = 25;
				int i_17_ = Class38.anInt506;
				if ((i ^ 0xffffffff) == -2)
				    i_16_ = 20;
				if ((i ^ 0xffffffff) == -3)
				    i_16_ = 44;
				if ((i ^ 0xffffffff) == -4)
				    i_16_ = 46;
				if (((NpcDefinition) class79).anInt1335 == i)
				    i_17_ = ((NpcDefinition) class79).anInt1371;
				if ((i ^ 0xffffffff) == -5)
				    i_16_ = 60;
				if (i == ((NpcDefinition) class79).anInt1385)
				    i_17_ = ((NpcDefinition) class79).anInt1338;
				Class229.anInt2976++;
				Class50_Sub3.method466
				    (false, "<col=ffff00>" + string, 0,
				     (byte) -93, false, 0, -1, true, i_16_,
				     (long) (((Class318_Sub1_Sub3_Sub3)
					      class318_sub1_sub3_sub3_sub1)
					     .anInt10290),
				     strings[i],
				     (long) (((Class318_Sub1_Sub3_Sub3)
					      class318_sub1_sub3_sub3_sub1)
					     .anInt10290),
				     (!(strings[i].equalsIgnoreCase
					(GameText.attackGameText.getLanguageText
					 (Class348_Sub33.gameLanguage)))
				      ? i_17_
				      : ((NpcDefinition) class79).anInt1401));
			    }
			}
		    }
		    if (((NpcDefinition) class79).aByte1384 == 1
			&& strings != null) {
			for (int i = 4; (i ^ 0xffffffff) <= -1; i--) {
			    if (strings[i] != null
				&& (strings[i].equalsIgnoreCase
				    (GameText.attackGameText.getLanguageText
				     (Class348_Sub33.gameLanguage)))) {
				short i_18_ = 0;
				if ((((NpcDefinition) class79).anInt1361
				     ^ 0xffffffff)
				    < ((((Player)
					 (Class132
					  .localPlayer))
					.anInt10516)
				       ^ 0xffffffff))
				    i_18_ = (short) 2000;
				short i_19_ = 0;
				if (i == 0)
				    i_19_ = (short) 25;
				if (i == 1)
				    i_19_ = (short) 20;
				if ((i ^ 0xffffffff) == -3)
				    i_19_ = (short) 44;
				if (i == 3)
				    i_19_ = (short) 46;
				if ((i ^ 0xffffffff) == -5)
				    i_19_ = (short) 60;
				if ((i_19_ ^ 0xffffffff) != -1)
				    i_19_ += i_18_;
				GfxDefinition.anInt4510++;
				Class50_Sub3.method466
				    (false, "<col=ffff00>" + string, 0,
				     (byte) -101, false, 0, -1, true, i_19_,
				     (long) (((Class318_Sub1_Sub3_Sub3)
					      class318_sub1_sub3_sub3_sub1)
					     .anInt10290),
				     strings[i],
				     (long) (((Class318_Sub1_Sub3_Sub3)
					      class318_sub1_sub3_sub3_sub1)
					     .anInt10290),
				     ((NpcDefinition) class79).anInt1401);
			    }
			}
		    }
		}
		Class205.anInt2690++;
		Class50_Sub3.method466
		    (bool, "<col=ffff00>" + string, 0, (byte) -105, bool_14_,
		     0, -1, true, 1008,
		     (long) ((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub1).anInt10290,
		     GameText.examineGameText
			 .getLanguageText(Class348_Sub33.gameLanguage),
		     (long) ((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3_sub1).anInt10290,
		     Class286_Sub8.anInt6299);
	    }
	}
    }
    
    public static void method2151(int i) {
	anIntArray6228 = null;
	if (i > -72)
	    createBufferedPacket(null, null);
	aCalendar6221 = null;
    }
    
    static final void method2152(boolean bool) {
	for (int i = 0; (ElementLoaderNode.anInt1200 ^ 0xffffffff) < (i ^ 0xffffffff);
	     i++)
	    Class318_Sub1_Sub3_Sub4.aClass338Array10330[i] = null;
	anInt6223++;
	ElementLoaderNode.anInt1200 = 0;
	for (int i = 0; Class189.anInt2524 > i; i++) {
	    for (int i_20_ = 0; i_20_ < Class318_Sub7.anInt6451; i_20_++) {
		for (int i_21_ = 0; ((Class348_Sub41.anInt7054 ^ 0xffffffff)
				     < (i_21_ ^ 0xffffffff)); i_21_++) {
		    Class357 class357 = (Message.aClass357ArrayArrayArray2029
					 [i][i_21_][i_20_]);
		    if (class357 != null) {
			if (((Class357) class357).aShort4398 > 0)
			    ((Class357) class357).aShort4398 *= -1;
			if ((((Class357) class357).aShort4409 ^ 0xffffffff)
			    < -1)
			    ((Class357) class357).aShort4409 *= -1;
		    }
		}
	    }
	}
	if (bool != false)
	    anIntArray6228 = null;
	for (int i = 0; Class189.anInt2524 > i; i++) {
	    for (int i_22_ = 0;
		 (Class318_Sub7.anInt6451 ^ 0xffffffff) < (i_22_ ^ 0xffffffff);
		 i_22_++) {
		for (int i_23_ = 0; Class348_Sub41.anInt7054 > i_23_;
		     i_23_++) {
		    Class357 class357 = (Message.aClass357ArrayArrayArray2029
					 [i][i_23_][i_22_]);
		    if (class357 != null) {
			boolean bool_24_
			    = ((Message.aClass357ArrayArrayArray2029[0][i_23_]
				[i_22_]) != null
			       && (((Class357) (Message
						.aClass357ArrayArrayArray2029
						[0][i_23_][i_22_]))
				   .aClass357_4400) != null);
			if ((((Class357) class357).aShort4409 ^ 0xffffffff)
			    > -1) {
			    int i_25_ = i_22_;
			    int i_26_ = i_22_;
			    int i_27_ = i;
			    int i_28_ = i;
			    Class357 class357_29_
				= (Message.aClass357ArrayArrayArray2029[i]
				   [i_23_][i_25_ + -1]);
			    int i_30_;
			    for (i_30_ = (Class348_Sub1_Sub1.aSArray8801[i]
					      .method3982
					  ((byte) -86, i_22_, i_23_));
				 (i_25_ > 0 && class357_29_ != null
				  && ((Class357) class357_29_).aShort4409 < 0
				  && ((((Class357) class357).aShort4409
				       ^ 0xffffffff)
				      == (((Class357) class357_29_).aShort4409
					  ^ 0xffffffff))
				  && (((Class357) class357).aShort4401
				      == ((Class357) class357_29_).aShort4401)
				  && ((i_30_ ^ 0xffffffff)
				      == ((Class348_Sub1_Sub1.aSArray8801
					       [i].method3982
					   ((byte) -86, -1 + i_25_, i_23_))
					  ^ 0xffffffff)));
				 class357_29_
				     = (Message.aClass357ArrayArrayArray2029
					[i][i_23_][i_25_ + -1])) {
				if (-1 + i_25_ > 0
				    && i_30_ != (Class348_Sub1_Sub1
						     .aSArray8801[i].method3982
						 ((byte) -86, i_25_ + -2,
						  i_23_)))
				    break;
				i_25_--;
			    }
			    for (class357_29_
				     = (Message.aClass357ArrayArrayArray2029
					[i][i_23_][1 + i_26_]);
				 (((i_26_ ^ 0xffffffff)
				   > (Class348_Sub41.anInt7054 ^ 0xffffffff))
				  && class357_29_ != null
				  && ((Class357) class357_29_).aShort4409 < 0
				  && ((((Class357) class357).aShort4409
				       ^ 0xffffffff)
				      == (((Class357) class357_29_).aShort4409
					  ^ 0xffffffff))
				  && (((Class357) class357).aShort4401
				      == ((Class357) class357_29_).aShort4401)
				  && ((Class348_Sub1_Sub1.aSArray8801[i]
					   .method3982
				       ((byte) -86, i_26_ - -1, i_23_))
				      ^ 0xffffffff) == (i_30_ ^ 0xffffffff));
				 class357_29_
				     = (Message.aClass357ArrayArrayArray2029
					[i][i_23_][i_26_ + 1])) {
				if (((1 + i_26_ ^ 0xffffffff)
				     > (Class348_Sub41.anInt7054 ^ 0xffffffff))
				    && i_30_ != (Class348_Sub1_Sub1
						     .aSArray8801[i].method3982
						 ((byte) -86, i_26_ + 2,
						  i_23_)))
				    break;
				i_26_++;
			    }
			    int i_31_ = 1 + (-i_27_ + i_28_);
			    int i_32_
				= Class348_Sub1_Sub1.aSArray8801
				      [bool_24_ ? 1 + i_27_ : i_27_]
				      .method3982((byte) -86, i_25_, i_23_);
			    int i_33_
				= (((Class357) class357).aShort4409 * i_31_
				   + i_32_);
			    int i_34_ = (Class348_Sub1_Sub1.aSArray8801
					     [!bool_24_ ? i_27_ : i_27_ + 1]
					     .method3982
					 ((byte) -86, 1 + i_26_, i_23_));
			    int i_35_
				= (i_34_
				   - -(i_31_
				       * ((Class357) class357).aShort4409));
			    int i_36_ = i_23_ << Class362.anInt4459;
			    int i_37_ = i_25_ << Class362.anInt4459;
			    int i_38_ = (Class270.anInt3465
					 + (i_26_ << Class362.anInt4459));
			    Class318_Sub1_Sub3_Sub4.aClass338Array10330
				[ElementLoaderNode.anInt1200++]
				= (new Class338
				   (1, i_28_,
				    ((Class357) class357).aShort4401 + i_36_,
				    ((Class357) class357).aShort4401 + i_36_,
				    ((Class357) class357).aShort4401 + i_36_,
				    ((Class357) class357).aShort4401 + i_36_,
				    i_32_, i_34_, i_35_, i_33_, i_37_, i_38_,
				    i_38_, i_37_));
			    for (int i_39_ = i_27_;
				 (i_39_ ^ 0xffffffff) >= (i_28_ ^ 0xffffffff);
				 i_39_++) {
				for (int i_40_ = i_25_; i_26_ >= i_40_;
				     i_40_++)
				    ((Class357)
				     (Message.aClass357ArrayArrayArray2029
				      [i_39_][i_23_][i_40_])).aShort4409
					*= -1;
			    }
			}
			if ((((Class357) class357).aShort4398 ^ 0xffffffff)
			    > -1) {
			    int i_41_ = i_23_;
			    int i_42_ = i_23_;
			    int i_43_ = i;
			    int i_44_ = i;
			    Class357 class357_45_
				= (Message.aClass357ArrayArrayArray2029[i]
				   [i_41_ - 1][i_22_]);
			    int i_46_;
			    for (i_46_ = (Class348_Sub1_Sub1.aSArray8801[i]
					      .method3982
					  ((byte) -86, i_22_, i_23_));
				 (i_41_ > 0 && class357_45_ != null
				  && (((Class357) class357_45_).aShort4398
				      ^ 0xffffffff) > -1
				  && ((((Class357) class357_45_).aShort4398
				       ^ 0xffffffff)
				      == (((Class357) class357).aShort4398
					  ^ 0xffffffff))
				  && (((Class357) class357).aShort4397
				      == ((Class357) class357_45_).aShort4397)
				  && ((Class348_Sub1_Sub1.aSArray8801[i]
					   .method3982
				       ((byte) -86, i_22_, -1 + i_41_))
				      == i_46_));
				 class357_45_
				     = (Message.aClass357ArrayArrayArray2029
					[i][i_41_ - 1][i_22_])) {
				if ((i_41_ + -1 ^ 0xffffffff) < -1
				    && ((Class348_Sub1_Sub1.aSArray8801[i]
					     .method3982
					 ((byte) -86, i_22_, -2 + i_41_))
					!= i_46_))
				    break;
				i_41_--;
			    }
			    for (class357_45_
				     = (Message.aClass357ArrayArrayArray2029
					[i][i_42_ - -1][i_22_]);
				 (i_42_ < Class318_Sub7.anInt6451
				  && class357_45_ != null
				  && (((Class357) class357_45_).aShort4398
				      ^ 0xffffffff) > -1
				  && ((((Class357) class357_45_).aShort4398
				       ^ 0xffffffff)
				      == (((Class357) class357).aShort4398
					  ^ 0xffffffff))
				  && (((Class357) class357_45_).aShort4397
				      == ((Class357) class357).aShort4397)
				  && ((Class348_Sub1_Sub1.aSArray8801[i]
					   .method3982
				       ((byte) -86, i_22_, i_42_ + 1))
				      == i_46_));
				 class357_45_
				     = (Message.aClass357ArrayArrayArray2029
					[i][1 + i_42_][i_22_])) {
				if (Class318_Sub7.anInt6451 > i_42_ + 1
				    && ((Class348_Sub1_Sub1.aSArray8801[i]
					     .method3982
					 ((byte) -86, i_22_, 2 + i_42_))
					!= i_46_))
				    break;
				i_42_++;
			    }
			    int i_47_ = 1 + -i_43_ + i_44_;
			    int i_48_
				= Class348_Sub1_Sub1.aSArray8801
				      [!bool_24_ ? i_43_ : 1 + i_43_]
				      .method3982((byte) -86, i_22_, i_41_);
			    int i_49_
				= (i_48_
				   - -(i_47_
				       * ((Class357) class357).aShort4398));
			    int i_50_ = (Class348_Sub1_Sub1.aSArray8801
					     [!bool_24_ ? i_43_ : 1 + i_43_]
					     .method3982
					 ((byte) -86, i_22_, 1 + i_42_));
			    int i_51_
				= (((Class357) class357).aShort4398 * i_47_
				   + i_50_);
			    int i_52_ = i_41_ << Class362.anInt4459;
			    int i_53_ = ((i_42_ << Class362.anInt4459)
					 + Class270.anInt3465);
			    int i_54_ = i_22_ << Class362.anInt4459;
			    Class318_Sub1_Sub3_Sub4.aClass338Array10330
				[ElementLoaderNode.anInt1200++]
				= (new Class338
				   (2, i_44_, i_52_, i_53_, i_53_, i_52_,
				    i_48_, i_50_, i_51_, i_49_,
				    i_54_ + ((Class357) class357).aShort4397,
				    i_54_ + ((Class357) class357).aShort4397,
				    ((Class357) class357).aShort4397 + i_54_,
				    (i_54_
				     - -((Class357) class357).aShort4397)));
			    for (int i_55_ = i_43_;
				 (i_44_ ^ 0xffffffff) <= (i_55_ ^ 0xffffffff);
				 i_55_++) {
				for (int i_56_ = i_41_;
				     ((i_56_ ^ 0xffffffff)
				      >= (i_42_ ^ 0xffffffff));
				     i_56_++)
				    ((Class357)
				     (Message.aClass357ArrayArrayArray2029
				      [i_55_][i_56_][i_22_])).aShort4398
					*= -1;
			    }
			}
		    }
		}
	    }
	}
	Class50_Sub1.aBoolean5226 = true;
    }
    
    static final void method2153(int i) {
	anInt6214++;
	if (!IntergerVarScriptSettingDefinition.aBoolean2130 && i <= -37) {
	    IntergerVarScriptSettingDefinition.aBoolean2130 = true;
	    Class205.aFloat2687 += (-Class205.aFloat2687 + 24.0F) / 2.0F;
	    Class369_Sub3_Sub1.aBoolean10174 = true;
	}
    }
}
