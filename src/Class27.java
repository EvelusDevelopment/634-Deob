/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class27
{
    static int anInt387;
    static int anInt388 = 0;
    static HashTable aClass356_389 = new HashTable(4);
    static int anInt390;
    static int anInt391;
    static int anInt392;
    static int anInt393;
    static int anInt394;
    static OutgoingPacket aClass351_395 = new OutgoingPacket(49, 6);
    static int anInt396 = -1;
    static int anInt397;
    static OutgoingPacket aClass351_398 = new OutgoingPacket(23, 8);
    static Class341 aClass341_399 = new Class341();
    
    static final void method312(int i, byte i_0_) {
	Class48.anInt859 = -1;
	if (i != 37) {
	    if ((i ^ 0xffffffff) != -51) {
		if (i != 75) {
		    if (i != 100) {
			if ((i ^ 0xffffffff) == -201)
			    Class75.aFloat1249 = 16.0F;
		    } else
			Class75.aFloat1249 = 8.0F;
		} else
		    Class75.aFloat1249 = 6.0F;
	    } else
		Class75.aFloat1249 = 4.0F;
	} else
	    Class75.aFloat1249 = 3.0F;
	anInt397++;
	Class48.anInt859 = -1;
	if (i_0_ != 56)
	    anInt394 = 32;
    }
    
    static final String method313(long l, int i) {
	try {
	    anInt392++;
	    if (l <= 0L || (l ^ 0xffffffffffffffffL) <= -6582952005840035282L)
		return null;
	    if (l % 37L == 0L)
		return null;
	    int i_1_ = 0;
	    for (long l_2_ = l; (l_2_ ^ 0xffffffffffffffffL) != -1L;
		 l_2_ /= 37L)
		i_1_++;
	    if (i >= -82)
		anInt396 = -58;
	    StringBuffer stringbuffer = new StringBuffer(i_1_);
	    while ((l ^ 0xffffffffffffffffL) != -1L) {
		long l_3_ = l;
		l /= 37L;
		stringbuffer.append(Class48.aCharArray852[(int) (-(37L * l)
								 + l_3_)]);
	    }
	    return stringbuffer.reverse().toString();
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "ht.A(" + l + ',' + i + ')');
	}
    }
    
    static final void method314(byte i, int i_4_) {
	if (i >= -31)
	    anInt394 = -128;
	Class34.anInt481 = i_4_;
	Class367_Sub9.anInt7379 = 3;
	anInt390++;
	Class164.anInt2173 = 100;
	Class348_Sub40_Sub30.anInt9399 = -1;
    }
    
    static final int method315(byte i, String string) {
	anInt393++;
	int i_5_ = 0;
	if (i <= 70)
	    return -84;
	for (/**/; i_5_ < Class59_Sub2.aStringArray5305.length; i_5_++) {
	    if (Class59_Sub2.aStringArray5305[i_5_].equalsIgnoreCase(string))
		return i_5_;
	}
	return -1;
    }
    
    public static void method316(byte i) {
	aClass356_389 = null;
	aClass351_398 = null;
	aClass341_399 = null;
	if (i != -94)
	    method313(98L, -24);
	aClass351_395 = null;
    }
    
    static final void method317(String string, int i, boolean bool) {
	anInt391++;
	if (string != null) {
	    if ((Class348_Sub42_Sub12.anInt9604 ^ 0xffffffff) <= -101)
		Class59.method544((GameText.aClass274_3522.getLanguageText
				   (Class348_Sub33.gameLanguage)),
				  false, 4);
	    else {
		String string_6_ = Class285_Sub1.method2127(2, string);
		if (string_6_ != null) {
		    for (int i_7_ = 0;
			 ((Class348_Sub42_Sub12.anInt9604 ^ 0xffffffff)
			  < (i_7_ ^ 0xffffffff));
			 i_7_++) {
			String string_8_
			    = Class285_Sub1.method2127(2,
						       (ObjectDefinition.aStringArray932
							[i_7_]));
			if (string_8_ != null && string_8_.equals(string_6_)) {
			    Class59.method544((string
					       + (GameText.aClass274_3523
						      .getLanguageText
						  (Class348_Sub33.gameLanguage))),
					      false, 4);
			    return;
			}
			if (Class348_Sub40_Sub21.aStringArray9275[i_7_]
			    != null) {
			    String string_9_
				= (Class285_Sub1.method2127
				   (2, (Class348_Sub40_Sub21.aStringArray9275
					[i_7_])));
			    if (string_9_ != null
				&& string_9_.equals(string_6_)) {
				Class59.method544(string + (GameText
								.aClass274_3523
								.getLanguageText
							    ((Class348_Sub33
							      .gameLanguage))),
						  false, 4);
				return;
			    }
			}
		    }
		    if (i >= 90) {
			for (int i_10_ = 0;
			     i_10_ < Class348_Sub40_Sub30.anInt9383; i_10_++) {
			    String string_11_
				= Class285_Sub1.method2127(2,
							   (Class83
							    .aStringArray1441
							    [i_10_]));
			    if (string_11_ != null
				&& string_11_.equals(string_6_)) {
				Class59.method544
				    (((GameText.aClass274_3528.getLanguageText
				       (Class348_Sub33.gameLanguage))
				      + string
				      + (GameText.aClass274_3529.getLanguageText
					 (Class348_Sub33.gameLanguage))),
				     false, 4);
				return;
			    }
			    if (Class286_Sub2.aStringArray6205[i_10_]
				!= null) {
				String string_12_
				    = (Class285_Sub1.method2127
				       (2, (Class286_Sub2.aStringArray6205
					    [i_10_])));
				if (string_12_ != null
				    && string_12_.equals(string_6_)) {
				    Class59.method544
					(((GameText.aClass274_3528.getLanguageText
					   (Class348_Sub33.gameLanguage))
					  + string
					  + (GameText.aClass274_3529.getLanguageText
					     (Class348_Sub33.gameLanguage))),
					 false, 4);
				    return;
				}
			    }
			}
			if (Class285_Sub1.method2127
				(2,
				 (((Player)
				   Class132.localPlayer)
				  .aString10544))
				.equals(string_6_))
			    Class59.method544((GameText.aClass274_3525
						   .getLanguageText
					       (Class348_Sub33.gameLanguage)),
					      false, 4);
			else {
			    Class5.anInt4628++;
			    BufferedPacket class348_sub47
				= (Class286_Sub3.createBufferedPacket
				   (ClientScript.aClass351_9687,
				    Class348_Sub23_Sub2.outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer.putByte
				(Class239_Sub6.getStringLength(string, -65) - -1);
			    ((BufferedPacket) class348_sub47)
				.buffer
				.putJStr((byte) -5, string);
			    ((BufferedPacket) class348_sub47)
				.buffer
				.putByte(!bool ? 0 : 1);
			    Class348_Sub42_Sub14.putBufferedPacket(-116,
							    class348_sub47);
			}
		    }
		}
	    }
	}
    }
}
