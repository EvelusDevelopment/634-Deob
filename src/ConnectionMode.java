/* ConnectionMode - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ConnectionMode
{
    int anInt2138;
    private boolean aBoolean2139 = false;
    static int anInt2140;
    static int anInt2141;
    static int anInt2142;
    int portOffset;
    static int anInt2144;
    static int[] anIntArray2145 = new int[25];
    private boolean aBoolean2146 = true;
    String address;
    int anInt2148;
    static int anInt2149;
    static int anInt2150;
    static boolean aBoolean2151 = false;
    
    static final boolean method1258(int i, int i_0_, int i_1_) {
	if (i_0_ != -9301)
	    method1263(true);
	anInt2150++;
	if ((0x800 & i) == 0)
	    return false;
	return true;
    }
    
    final void method1259(int i) {
	if (i != 0)
	    method1258(39, 119, 4);
	anInt2149++;
	if (!aBoolean2146) {
	    aBoolean2139 = true;
	    aBoolean2146 = true;
	} else if (!aBoolean2139)
	    aBoolean2146 = false;
	else
	    aBoolean2139 = false;
    }
    
    static final void method1260(boolean bool, int i, Class190 class190) {
	if (Class348_Sub40_Sub10.aBoolean9181) {
	    Class348_Sub40_Sub10.aBoolean9181 = false;
	    i = 0;
	}
	anInt2140++;
	if (Class239_Sub14.aClass190_5990 == null
	    || !Class239_Sub14.aClass190_5990.method1424(class190,
							 (byte) 84)) {
	    Class239_Sub14.aClass190_5990 = class190;
	    Class348_Sub33.aLong6963 = Class62.getCurrentTimeMillis();
	    Class206.anInt4889 = Class286_Sub5.anInt6248 = i;
	    if (Class206.anInt4889 == 0)
		Class348_Sub40_Sub32.method3134(-1);
	    else {
		Class318_Sub1_Sub1.aFloat8725 = IntergerVarScriptSettingDefinition.aFloat2137;
		Canvas_Sub1.anInt70 = Class187.anInt2500;
		Class239_Sub24.aClass299_6098 = Class158.aClass299_4938;
		AnimatableToolkit.aFloat1136 = TextureLoader.aFloat4626;
		Class245.aFloat3172 = Class269.aFloat3462;
		IndexLoader.aFloat670 = Class348_Sub3.aFloat6586;
		Class258_Sub4.aFloat8560 = Class239_Sub10.aFloat5945;
		Class246.aFloat3177 = Class361.aFloat4455;
		Class318_Sub1_Sub3.anInt8739 = Class119_Sub1.anInt4703;
		Class239_Sub19.anInt6042 = Class36.anInt486;
	    }
	}
	if (bool != false)
	    aBoolean2151 = true;
    }
    
    public static void method1261(byte i) {
	if (i > 46)
	    anIntArray2145 = null;
    }
    
    final SignlinkRequest method1262(Signlink class297, byte i) {
	if (i != 36)
	    method1258(-105, -70, -80);
	anInt2144++;
	return class297.method2235(aBoolean2139,
				   (aBoolean2146 ? ((ConnectionMode) this).anInt2138
				    : ((ConnectionMode) this).anInt2148),
				   ((ConnectionMode) this).address, i ^ 0x6e65);
    }
    
    static final void method1263(boolean bool) {
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub27_7255),
						 1);
	anInt2142++;
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
						 1);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub14_7264),
						 1);
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
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub1_7246),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub21_7270),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub7_7238),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub24_7235),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub28_7230),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub18_7259),
						 0);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub16_7247),
						 0);
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
						 0);
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
	Class237.method1686(55);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub23_7231),
						 2);
	BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						 (((Class348_Sub51)
						   (BitmapTable
						    .aClass348_Sub51_3959))
						  .aClass239_Sub29_7229),
						 2);
	Class348_Sub40.method3038(-1);
	Class76.method773(bool);
	RuntimeException_Sub1.aBoolean4604 = true;
    }
    
    final boolean method1264(byte i, ConnectionMode class161_2_) {
	if (i <= 69)
	    return false;
	anInt2141++;
	if (class161_2_ != null) {
	    if ((((ConnectionMode) this).portOffset
		 != ((ConnectionMode) class161_2_).portOffset)
		|| !((ConnectionMode) this).address
			.equals(((ConnectionMode) class161_2_).address))
		return false;
	    return true;
	}
	return false;
    }
    
    public ConnectionMode() {
	((ConnectionMode) this).anInt2138 = 443;
	((ConnectionMode) this).anInt2148 = 43594;
    }
}
