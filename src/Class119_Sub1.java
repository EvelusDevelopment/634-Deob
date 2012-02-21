/* Class119_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

final class Class119_Sub1 extends Class119 implements Interface2
{
    private int anInt4697;
    static int anInt4698;
    static int anInt4699;
    static int anInt4700;
    static int anInt4701;
    static byte aByte4702;
    static int anInt4703;
    static int anInt4704;
    static int anInt4705;
    
    Class119_Sub1(DirectxToolkit var_ha_Sub2, int i, byte[] is, int i_0_) {
	super(var_ha_Sub2, is, i_0_);
	try {
	    anInt4697 = i;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("cw.<init>("
					     + (var_ha_Sub2 != null ? "{...}"
						: "null")
					     + ',' + i + ','
					     + (is != null ? "{...}" : "null")
					     + ',' + i_0_ + ')'));
	}
    }
    
    Class119_Sub1(DirectxToolkit var_ha_Sub2, int i, Buffer buffer) {
	super(var_ha_Sub2, buffer);
	try {
	    anInt4697 = i;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("cw.<init>("
					     + (var_ha_Sub2 != null ? "{...}"
						: "null")
					     + ',' + i + ','
					     + (buffer != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    public final long method12(byte i) {
	if (i != 42)
	    method1077(null, (byte) -124);
	anInt4704++;
	return ((Class119) this).aBuffer1792.getAddress();
    }
    
    static final void method1077(AbstractToolkit toolkit, byte i) {
	anInt4700++;
	if (((FileArchiveTracker.anInt4776 ^ 0xffffffff) <= -3 || r.aBoolean9722)
	    && Class289.aClass46_3701 == null) {
	    if (i >= -71)
		method1077(null, (byte) -41);
	    String string;
	    if (r.aBoolean9722 && FileArchiveTracker.anInt4776 < 2)
		string = (Class28.aString5001
			  + GameText.aClass274_3515
				.getLanguageText(Class348_Sub33.gameLanguage)
			  + Class28.aString5000 + " ->");
	    else if (!Class116.aBoolean1759
		     || !Class182.keyboardListener.method2696(81, -121)
		     || FileArchiveTracker.anInt4776 <= 2) {
		Class348_Sub42_Sub12 class348_sub42_sub12
		    = BitmapTable.aClass348_Sub42_Sub12_3963;
		if (class348_sub42_sub12 == null)
		    return;
		string = BitmapTable.method2367((byte) -52, class348_sub42_sub12);
		int[] is = null;
		if (!Class148.method1197(-12081,
					 ((Class348_Sub42_Sub12)
					  class348_sub42_sub12).anInt9608)) {
		    if (((Class348_Sub42_Sub12) class348_sub42_sub12).anInt9599
			!= -1)
			is = ((ItemDefinition)
			      (ToolkitException.itemLoader.getItemDefinition
			       (98,
				(((Class348_Sub42_Sub12) class348_sub42_sub12)
				 .anInt9599)))).anIntArray2772;
		    else if (Class367_Sub8.method3549((((Class348_Sub42_Sub12)
							class348_sub42_sub12)
						       .anInt9608),
						      (byte) 107)) {
			Class348_Sub22 class348_sub22
			    = ((Class348_Sub22)
			       (Class282.aClass356_3654.get
				((long) (int) ((Class348_Sub42_Sub12)
					       class348_sub42_sub12).aLong9605)));
			if (class348_sub22 != null) {
			    Npc class318_sub1_sub3_sub3_sub1
				= (((Class348_Sub22) class348_sub22)
				   .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
			    NpcDefinition class79 = (((Npc)
						class318_sub1_sub3_sub3_sub1)
					       .definition);
			    if (((NpcDefinition) class79).anIntArray1377 != null)
				class79 = (class79.method794
					   ((Class318_Sub1_Sub3_Sub3
					     .varbitHandler),
					    -1));
			    if (class79 != null)
				is = ((NpcDefinition) class79).anIntArray1342;
			}
		    } else if (Class239_Sub21.method1813
			       (8806,
				(((Class348_Sub42_Sub12) class348_sub42_sub12)
				 .anInt9608))) {
			Object object = null;
			ObjectDefinition class51;
			if ((((Class348_Sub42_Sub12) class348_sub42_sub12)
			     .anInt9608)
			    != 1001)
			    class51 = (Class348_Sub40_Sub12.objectLoader
					   .getObject
				       (0, (int) ((((Class348_Sub42_Sub12)
						    class348_sub42_sub12)
						   .aLong9605) >>> -773937632
						  & 0x7fffffffL)));
			else
			    class51 = (Class348_Sub40_Sub12.objectLoader
					   .getObject
				       (0, (int) (((Class348_Sub42_Sub12)
						   class348_sub42_sub12)
						  .aLong9605)));
			if (((ObjectDefinition) class51).anIntArray945 != null)
			    class51
				= class51.method480((Class318_Sub1_Sub3_Sub3
						     .varbitHandler),
						    (byte) 47);
			if (class51 != null)
			    is = ((ObjectDefinition) class51).anIntArray917;
		    }
		} else
		    is = (((ItemDefinition) (ToolkitException.itemLoader.getItemDefinition
				       (-73, (int) (((Class348_Sub42_Sub12)
						     class348_sub42_sub12)
						    .aLong9605))))
			  .anIntArray2772);
		if (is != null)
		    string += Class163.method1273(is, true);
	    } else
		string
		    = BitmapTable.method2367((byte) 125,
					  BitmapTable.aClass348_Sub42_Sub12_3963);
	    if (FileArchiveTracker.anInt4776 > 2)
		string += ("<col=ffffff> / " + (FileArchiveTracker.anInt4776 - 2) + GameText.moreOptionsGameText.getLanguageText(Class348_Sub33.gameLanguage));
	    if (InterfaceScript.aClass46_6990 != null) {
		AbstractFontRasterizer raster = InterfaceScript.aClass46_6990.createWidgetFontRasterizer(toolkit);
		if (raster == null)
		    raster = Deque.b12fullFontRasterizer;
		raster.method2585
		    (Class175.anIntArray2330,
		     ((Widget) InterfaceScript.aClass46_6990).anInt709,
		     Class341.aClass105Array4234,
		     ((Widget) InterfaceScript.aClass46_6990).anInt700,
		     ((Widget) InterfaceScript.aClass46_6990).textColor,
		     ((Widget) InterfaceScript.aClass46_6990).anInt789,
		     ((Widget) InterfaceScript.aClass46_6990).anInt809,
		     OutputStream_Sub1.random,
		     ((Widget) InterfaceScript.aClass46_6990).anInt762,
		     Class32.anInt451, HashTable.calendarTime, -33,
		     Class332.anInt4141, string, ModernLoadingScreen.anIntArray5007);
		Class13.method226(ModernLoadingScreen.anIntArray5007[0],
				  ModernLoadingScreen.anIntArray5007[2],
				  ModernLoadingScreen.anIntArray5007[1], 0,
				  ModernLoadingScreen.anIntArray5007[3]);
	    } else if (Class21.aClass46_323 != null
		       && (Class348_Sub42_Sub8_Sub2.gameType
			   == Class10.aClass230_186)) {
		int i_1_
		    = (Deque.b12fullFontRasterizer.method2571
		       (-1, HashTable.calendarTime, Class175.anIntArray2330,
			string, 16777215, 0, Class341.aClass105Array4234,
			16 + SocketConnection.anInt5832, 4 + Class120.anInt4911,
			OutputStream_Sub1.random));
		Class13.method226(Class120.anInt4911 - -4,
				  (Class369.b12FullBitmapFont.method1183(true,
								      string)
				   + i_1_),
				  SocketConnection.anInt5832, 0, 16);
	    }
	}
    }
    
    public final int method13(byte i) {
	anInt4699++;
	if (i != -97)
	    return -87;
	return anInt4697;
    }
    
    public final void method11(int i, int i_2_, byte[] is, int i_3_) {
	anInt4705++;
	this.method1076(is, i_2_);
	anInt4697 = i;
	if (i_3_ != -9894)
	    method10(false);
    }
    
    public final int method10(boolean bool) {
	anInt4701++;
	if (bool != true)
	    method11(126, 120, null, -73);
	return 0;
    }
}
