/* BitmapFont - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class BitmapFont
{
    static int anInt1978;
    private byte[][] aByteArrayArray1979;
    static int anInt1980;
    static int anInt1981;
    static int anInt1982;
    static int anInt1983;
    static int anInt1984;
    static int anInt1985;
    private byte[] aByteArray1986;
    static OutgoingPacket aClass351_1987 = new OutgoingPacket(66, -1);
    int anInt1988;
    static int anInt1989;
    static int anInt1990;
    static int anInt1991;
    int anInt1992;
    int anInt1993;
    
    public static void method1180(byte i) {
	if (i != -76)
	    method1180((byte) 27);
	aClass351_1987 = null;
    }
    
    final String method1181(RasterToolkit[] class105s, int i, String string,
			    byte i_0_) {
	try {
	    anInt1989++;
	    if ((method1186(string, class105s, false) ^ 0xffffffff)
		>= (i ^ 0xffffffff))
		return string;
	    i -= method1186("...", null, false);
	    int i_1_ = -1;
	    if (i_0_ < 54)
		aClass351_1987 = null;
	    int i_2_ = -1;
	    int i_3_ = 0;
	    int i_4_ = string.length();
	    String string_5_ = "";
	    for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff);
		 i_6_++) {
		char c = string.charAt(i_6_);
		if (c == 60)
		    i_1_ = i_6_;
		else {
		    if ((c ^ 0xffffffff) == -63 && (i_1_ ^ 0xffffffff) != 0) {
			String string_7_ = string.substring(i_1_ - -1, i_6_);
			i_1_ = -1;
			if (!string_7_.equals("lt")) {
			    if (!string_7_.equals("gt")) {
				if (string_7_.equals("nbsp"))
				    c = '\u00a0';
				else if (!string_7_.equals("shy")) {
				    if (string_7_.equals("times"))
					c = '\u00d7';
				    else if (!string_7_.equals("euro")) {
					if (!string_7_.equals("copy")) {
					    if (!string_7_.equals("reg")) {
						if (string_7_
							.startsWith("img=")
						    && class105s != null) {
						    try {
							int i_8_
							    = (Class348_Sub41
								   .method3156
							       (true,
								(string_7_
								     .substring
								 (4))));
							i_2_ = -1;
							i_3_
							    += (class105s
								    [i_8_]
								    .method966
								());
							if (i_3_ > i)
							    return (string_5_
								    + "...");
							string_5_
							    = (string.substring
							       (0, i_6_ - -1));
						    } catch (Exception exception) {
							/* empty */
						    }
						}
						continue;
					    }
					    c = '\u00ae';
					} else
					    c = '\u00a9';
				    } else
					c = '\u20ac';
				} else
				    c = '\u00ad';
			    } else
				c = '>';
			} else
			    c = '<';
		    }
		    if ((i_1_ ^ 0xffffffff) == 0) {
			i_3_
			    += 0xff & (aByteArray1986
				       [Class354.decodeCharacter(c, false) & 0xff]);
			if (aByteArrayArray1979 != null
			    && (i_2_ ^ 0xffffffff) != 0)
			    i_3_ += aByteArrayArray1979[i_2_][c];
			i_2_ = c;
			int i_9_ = i_3_;
			if (aByteArrayArray1979 != null)
			    i_9_ += aByteArrayArray1979[c][46];
			if (i_9_ > i)
			    return string_5_ + "...";
			string_5_ = string.substring(0, i_6_ + 1);
		    }
		}
	    }
	    return string;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("oea.I("
					     + (class105s != null ? "{...}"
						: "null")
					     + ',' + i + ','
					     + (string != null ? "{...}"
						: "null")
					     + ',' + i_0_ + ')'));
	}
    }
    
    final int method1182(int i, byte i_10_, char c) {
	anInt1985++;
	if (aByteArrayArray1979 != null)
	    return aByteArrayArray1979[i][c];
	return 0;
    }
    
    final int method1183(boolean bool, String string) {
	anInt1981++;
	if (bool != true)
	    method1181(null, 54, null, (byte) 21);
	return method1186(string, null, false);
    }
    
    final int method1184(byte i, int i_11_) {
	anInt1982++;
	if (i != -48)
	    aByteArrayArray1979 = null;
	return 0xff & aByteArray1986[i_11_];
    }
    
    final int method1185(RasterToolkit[] class105s, int i, int i_12_, int i_13_,
			 String string) {
	try {
	    anInt1990++;
	    if (i_12_ == i)
		i_12_ = ((BitmapFont) this).anInt1992;
	    int i_14_
		= method1188(string, new int[] { i_13_ },
			     Class186.aStringArray2494, (byte) 87, class105s);
	    int i_15_ = (-1 + i_14_) * i_12_;
	    return (((BitmapFont) this).anInt1988
		    + (i_15_ + ((BitmapFont) this).anInt1993));
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("oea.A("
					     + (class105s != null ? "{...}"
						: "null")
					     + ',' + i + ',' + i_12_ + ','
					     + i_13_ + ','
					     + (string != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    final int method1186(String string, RasterToolkit[] class105s, boolean bool) {
	try {
	    if (bool != false)
		((BitmapFont) this).anInt1993 = 95;
	    anInt1980++;
	    if (string == null)
		return 0;
	    int i = -1;
	    int i_16_ = -1;
	    int i_17_ = 0;
	    int i_18_ = string.length();
	    for (int i_19_ = 0; (i_18_ ^ 0xffffffff) < (i_19_ ^ 0xffffffff);
		 i_19_++) {
		char c = string.charAt(i_19_);
		if ((c ^ 0xffffffff) == -61)
		    i = i_19_;
		else {
		    if ((c ^ 0xffffffff) == -63 && (i ^ 0xffffffff) != 0) {
			String string_20_ = string.substring(1 + i, i_19_);
			i = -1;
			if (string_20_.equals("lt"))
			    c = '<';
			else if (!string_20_.equals("gt")) {
			    if (!string_20_.equals("nbsp")) {
				if (string_20_.equals("shy"))
				    c = '\u00ad';
				else if (!string_20_.equals("times")) {
				    if (!string_20_.equals("euro")) {
					if (!string_20_.equals("copy")) {
					    if (string_20_.equals("reg"))
						c = '\u00ae';
					    else {
						if (string_20_
							.startsWith("img=")
						    && class105s != null) {
						    try {
							int i_21_
							    = (Class348_Sub41
								   .method3156
							       (true,
								(string_20_
								     .substring
								 (4))));
							i_16_ = -1;
							i_17_
							    += (class105s
								    [i_21_]
								    .method966
								());
						    } catch (Exception exception) {
							/* empty */
						    }
						}
						continue;
					    }
					} else
					    c = '\u00a9';
				    } else
					c = '\u20ac';
				} else
				    c = '\u00d7';
			    } else
				c = '\u00a0';
			} else
			    c = '>';
		    }
		    if ((i ^ 0xffffffff) == 0) {
			i_17_
			    += 0xff & (aByteArray1986
				       [Class354.decodeCharacter(c, false) & 0xff]);
			if (aByteArrayArray1979 != null && i_16_ != -1)
			    i_17_ += aByteArrayArray1979[i_16_][c];
			i_16_ = c;
		    }
		}
	    }
	    return i_17_;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("oea.F("
					     + (string != null ? "{...}"
						: "null")
					     + ','
					     + (class105s != null ? "{...}"
						: "null")
					     + ',' + bool + ')'));
	}
    }
    
    final int method1187(String string, boolean bool, int i,
			 RasterToolkit[] class105s) {
	try {
	    anInt1984++;
	    int i_22_
		= method1188(string, new int[] { i },
			     Class186.aStringArray2494, (byte) 87, class105s);
	    int i_23_ = 0;
	    if (bool != false)
		((BitmapFont) this).anInt1988 = -58;
	    for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > (i_22_ ^ 0xffffffff);
		 i_24_++) {
		int i_25_ = method1186(Class186.aStringArray2494[i_24_],
				       class105s, false);
		if (i_25_ > i_23_)
		    i_23_ = i_25_;
	    }
	    return i_23_;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("oea.K("
					     + (string != null ? "{...}"
						: "null")
					     + ',' + bool + ',' + i + ','
					     + (class105s != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    final int method1188(String string, int[] is, String[] strings, byte i,
			 RasterToolkit[] class105s) {
	try {
	    anInt1978++;
	    if (i != 87)
		method1190(null, 80, null, 55);
	    if (string == null)
		return 0;
	    int i_26_ = 0;
	    int i_27_ = 0;
	    int i_28_ = -1;
	    int i_29_ = 0;
	    int i_30_ = 0;
	    int i_31_ = -1;
	    int i_32_ = -1;
	    int i_33_ = 0;
	    int i_34_ = string.length();
	    for (int i_35_ = 0; i_34_ > i_35_; i_35_++) {
		int i_36_
		    = Class354.decodeCharacter(string.charAt(i_35_), false) & 0xff;
		int i_37_ = 0;
		if ((i_36_ ^ 0xffffffff) == -61)
		    i_31_ = i_35_;
		else {
		    int i_38_;
		    if (i_31_ != -1) {
			if (i_36_ != 62)
			    continue;
			i_38_ = i_31_;
			String string_39_ = string.substring(1 + i_31_, i_35_);
			i_31_ = -1;
			if (string_39_.equals("br")) {
			    strings[i_33_]
				= string.substring(i_27_, i_35_ - -1);
			    i_33_++;
			    if (strings.length <= i_33_)
				return 0;
			    i_27_ = 1 + i_35_;
			    i_32_ = -1;
			    i_26_ = 0;
			    i_28_ = -1;
			    continue;
			}
			if (string_39_.equals("lt")) {
			    i_37_ += method1184((byte) -48, 60);
			    if (aByteArrayArray1979 != null && i_32_ != -1)
				i_37_ += aByteArrayArray1979[i_32_][60];
			    i_32_ = 60;
			} else if (string_39_.equals("gt")) {
			    i_37_ += method1184((byte) -48, 62);
			    if (aByteArrayArray1979 != null && i_32_ != -1)
				i_37_ += aByteArrayArray1979[i_32_][62];
			    i_32_ = 62;
			} else if (!string_39_.equals("nbsp")) {
			    if (!string_39_.equals("shy")) {
				if (string_39_.equals("times")) {
				    i_37_ += method1184((byte) -48, 215);
				    if (aByteArrayArray1979 != null
					&& i_32_ != -1)
					i_37_
					    += aByteArrayArray1979[i_32_][215];
				    i_32_ = 215;
				} else if (!string_39_.equals("euro")) {
				    if (!string_39_.equals("copy")) {
					if (!string_39_.equals("reg")) {
					    if (string_39_.startsWith("img=")
						&& class105s != null) {
						try {
						    int i_40_
							= (Class348_Sub41
							       .method3156
							   (true,
							    (string_39_
								 .substring
							     (4))));
						    i_32_ = -1;
						    i_37_ += class105s
								 [i_40_]
								 .method966();
						} catch (Exception exception) {
						    /* empty */
						}
					    }
					} else {
					    i_37_
						+= method1184((byte) -48, 174);
					    if (aByteArrayArray1979 != null
						&& (i_32_ ^ 0xffffffff) != 0)
						i_37_ += (aByteArrayArray1979
							  [i_32_][174]);
					    i_32_ = 174;
					}
				    } else {
					i_37_ += method1184((byte) -48, 169);
					if (aByteArrayArray1979 != null
					    && i_32_ != -1)
					    i_37_ += (aByteArrayArray1979
						      [i_32_][169]);
					i_32_ = 169;
				    }
				} else {
				    i_37_ += method1184((byte) -48, 8364);
				    if (aByteArrayArray1979 != null
					&& (i_32_ ^ 0xffffffff) != 0)
					i_37_ += (aByteArrayArray1979[i_32_]
						  [8364]);
				    i_32_ = 8364;
				}
			    } else {
				i_37_ += method1184((byte) -48, 173);
				if (aByteArrayArray1979 != null
				    && (i_32_ ^ 0xffffffff) != 0)
				    i_37_ += aByteArrayArray1979[i_32_][173];
				i_32_ = 173;
			    }
			} else {
			    i_37_ += method1184((byte) -48, 160);
			    if (aByteArrayArray1979 != null && i_32_ != -1)
				i_37_ += aByteArrayArray1979[i_32_][160];
			    i_32_ = 160;
			}
			i_36_ = -1;
		    } else {
			i_37_ += method1184((byte) -48, i_36_);
			i_38_ = i_35_;
			if (aByteArrayArray1979 != null
			    && (i_32_ ^ 0xffffffff) != 0)
			    i_37_ += aByteArrayArray1979[i_32_][i_36_];
			i_32_ = i_36_;
		    }
		    if (i_37_ > 0) {
			i_26_ += i_37_;
			if (is != null) {
			    if (i_36_ == 32) {
				i_30_ = 1;
				i_29_ = i_26_;
				i_28_ = i_35_;
			    }
			    if ((is[is.length > i_33_ ? i_33_ : is.length + -1]
				 ^ 0xffffffff)
				> (i_26_ ^ 0xffffffff)) {
				if ((i_28_ ^ 0xffffffff) <= -1) {
				    strings[i_33_]
					= string.substring(i_27_,
							   -i_30_ + 1 + i_28_);
				    if ((++i_33_ ^ 0xffffffff)
					<= (strings.length ^ 0xffffffff))
					return 0;
				    i_27_ = 1 + i_28_;
				    i_32_ = -1;
				    i_28_ = -1;
				    i_26_ -= i_29_;
				} else {
				    strings[i_33_]
					= string.substring(i_27_, i_38_);
				    i_33_++;
				    if ((strings.length ^ 0xffffffff)
					>= (i_33_ ^ 0xffffffff))
					return 0;
				    i_27_ = i_38_;
				    i_32_ = -1;
				    i_28_ = -1;
				    i_26_ = i_37_;
				}
			    }
			    if ((i_36_ ^ 0xffffffff) == -46) {
				i_29_ = i_26_;
				i_28_ = i_35_;
				i_30_ = 0;
			    }
			}
		    }
		}
	    }
	    if (i_27_ < string.length()) {
		strings[i_33_] = string.substring(i_27_, string.length());
		i_33_++;
	    }
	    return i_33_;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("oea.J(" + (string != null ? "{...}" : "null") + ','
			+ (is != null ? "{...}" : "null") + ','
			+ (strings != null ? "{...}" : "null") + ',' + i + ','
			+ (class105s != null ? "{...}" : "null") + ')'));
	}
    }
    
    static final void method1189(int i, int i_41_) {
	anInt1991++;
	if (i != -1)
	    aClass351_1987 = null;
	Class348_Sub15 class348_sub15
	    = ((Class348_Sub15)
	       Class27.aClass356_389.get((long) i_41_));
	if (class348_sub15 != null) {
	    ((Class348_Sub15) class348_sub15).aBoolean6781
		= !((Class348_Sub15) class348_sub15).aBoolean6781;
	    ((Class348_Sub15) class348_sub15).aClass55_Sub1_6768.method514
		((byte) 116, ((Class348_Sub15) class348_sub15).aBoolean6781);
	}
    }
    
    final int method1190(RasterToolkit[] class105s, int i, String string,
			 int i_42_) {
	try {
	    anInt1983++;
	    if (i != 1)
		((BitmapFont) this).anInt1992 = -13;
	    return method1188(string, new int[] { i_42_ },
			      Class186.aStringArray2494, (byte) 87, class105s);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("oea.B("
					     + (class105s != null ? "{...}"
						: "null")
					     + ',' + i + ','
					     + (string != null ? "{...}"
						: "null")
					     + ',' + i_42_ + ')'));
	}
    }
    
    BitmapFont(byte[] is) {
	ByteBuffer buffer = new ByteBuffer(is);
	int i = buffer.getUByte();
	if (i != 0)
	    throw new RuntimeException("");
	boolean bool = buffer.getUByte() == 1;
	aByteArray1986 = new byte[256];
	buffer.getBytes(aByteArray1986, 0, 256);
	if (bool) {
	    int[] len0 = new int[256];
	    int[] len1 = new int[256];
	    for (int i_45_ = 0; i_45_ < 256; i_45_++)
		len0[i_45_] = buffer.getUByte();
	    for (int i_46_ = 0; i_46_< 256; i_46_++)
		len1[i_46_] = buffer.getUByte();
	    byte[][] is_47_ = new byte[256][];
	    for (int i_48_ = 0; i_48_ < 256; i_48_++) {
		is_47_[i_48_] = new byte[len0[i_48_]];
		byte i_49_ = 0;
		for (int i_50_ = 0;
		     ((i_50_ ^ 0xffffffff)
		      > (is_47_[i_48_].length ^ 0xffffffff));
		     i_50_++) {
		    i_49_ += buffer.getByte();
		    is_47_[i_48_][i_50_] = i_49_;
		}
	    }
	    byte[][] is_51_ = new byte[256][];
	    for (int i_52_ = 0; i_52_ < 256; i_52_++) {
		is_51_[i_52_] = new byte[len0[i_52_]];
		byte i_53_ = 0;
		for (int i_54_ = 0;
		     ((i_54_ ^ 0xffffffff)
		      > (is_51_[i_52_].length ^ 0xffffffff));
		     i_54_++) {
		    i_53_ += buffer.getByte();
		    is_51_[i_52_][i_54_] = i_53_;
		}
	    }
	    aByteArrayArray1979 = new byte[256][256];
	    for (int i_55_ = 0; i_55_ < 256; i_55_++) {
		if (i_55_ != 32 && (i_55_ ^ 0xffffffff) != -161) {
		    for (int i_56_ = 0; (i_56_ ^ 0xffffffff) > -257; i_56_++) {
			if ((i_56_ ^ 0xffffffff) != -33 && i_56_ != 160)
			    aByteArrayArray1979[i_55_][i_56_] = (byte) (Class239_Sub8.method1756(aByteArray1986, -34, i_56_, i_55_, is_47_, is_51_, len1, len0));
		    }
		}
	    }
	    ((BitmapFont) this).anInt1992 = len1[32] + len0[32];
	} else
	    ((BitmapFont) this).anInt1992 = buffer.getUByte();
	buffer.getUByte();
	buffer.getUByte();
	((BitmapFont) this).anInt1988 = buffer.getUByte();
	((BitmapFont) this).anInt1993 = buffer.getUByte();
    }
}
