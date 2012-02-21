/* Class164 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagex3.jagmisc.jagmisc;

final class Class164
{
    static int anInt2172;
    static int anInt2173;
    static int anInt2174;
    static int anInt2175;
    
    static final void method1277(byte i) {
	anInt2175++;
	OutgoingPacket.aClass60_4327.removeAll(i + -62);
	Class358.aClass60_4417.removeAll(0);
	Class239_Sub24.aClass60_6096.removeAll(0);
	if (i != 62)
	    method1277((byte) 43);
	Class348_Sub40_Sub9.aClass60_9171.removeAll(0);
    }
    
    static final int method1278(int i) {    
	if ((((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		 .aClass239_Sub11_7265.method1768(i + -3690)
	     ^ 0xffffffff)
	    == -1) {
	    for (int i_0_ = 0; ((ClientScript.anInt9699 ^ 0xffffffff)
				< (i_0_ ^ 0xffffffff)); i_0_++) {
		if ((Class348_Sub42_Sub5.anInterface6Array9534[i_0_]
			 .getCharacter((byte) 31)
		     ^ 0xffffffff) == -116
		    || (Class348_Sub42_Sub5.anInterface6Array9534[i_0_]
			    .getCharacter((byte) 71)
			^ 0xffffffff) == -84) {
		    BitmapTable.aClass348_Sub51_3959.method3429
			((byte) 74,
			 (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub11_7265),
			 1);
		    Class304.aBoolean3847 = true;
		    break;
		}
	    }
	}
	anInt2174++;
	if (WidgetVariable.currentLoadingStage == LoadingStage.loadingStage0) {
	    Runtime runtime = Runtime.getRuntime();
	    int i_1_ = (int) ((runtime.totalMemory() + -runtime.freeMemory())
			      / 1024L);
	    long l = Class62.getCurrentTimeMillis();
	    if ((Class348_Sub17.aLong6791 ^ 0xffffffffffffffffL) == -1L)
		Class348_Sub17.aLong6791 = l;
	    if (i_1_ > 16384 && (-Class348_Sub17.aLong6791 + l
				 ^ 0xffffffffffffffffL) > -5001L) {
		if (-Class173.aLong2286 + l > 1000L) {
		    System.gc();
		    Class173.aLong2286 = l;
		}
		return 0;
	    }
	}
	if (LoadingStage.loadingStage1 == WidgetVariable.currentLoadingStage) {
	   if (Class175.aClass340_2327 == null)
		Class175.aClass340_2327 = new ArchiveFetcher(Class348_Sub4.ondemandWorker, Class39.aClass112_520, ColorNode.aBigInteger4896, WidgetVariable.aBigInteger9657);
	   if(!Main.skipUpdate) 
               if (!Class175.aClass340_2327.isParentTableFetched())
                    return 0;
	    Class348_Sub23.method2965(null, 0, true, 0);
	    Class286_Sub7.aBoolean6289 = !LongNode.method2804((byte) -63);
	    Class286_Sub7.indexLoader32_34 = Class369_Sub2.createIndexLoader(false, (Class286_Sub7.aBoolean6289 ? 34 : 32), 1);
	    Class348_Sub40_Sub17_Sub1.indexLoader33 = Class369_Sub2.createIndexLoader(false, 33, 1);
	    Class104.indexLoader13 = Class369_Sub2.createIndexLoader(false, 13, 1);
	}
	if (LoadingStage.loadingStage2 == WidgetVariable.currentLoadingStage) {
	    boolean bool
		= Class348_Sub40_Sub17_Sub1.indexLoader33.isCompletelyLoaded(89);
	    int i_2_ = Class13.indexLoaders[33].getTableRequestPercentComplete();
	    i_2_ = i_2_ + Class13.indexLoaders
			      [!Class286_Sub7.aBoolean6289 ? 32 : 34]
			      .getTableRequestPercentComplete();
	    i_2_ += Class13.indexLoaders[13].getTableRequestPercentComplete();
	    i_2_ = i_2_ + (!bool ? Class348_Sub40_Sub17_Sub1.indexLoader33.getPercentLoaded((byte) -31) : 100);
	    if ((i_2_ ^ 0xffffffff) != -401)
		return i_2_ / 4;
	    AbstractImageFetcher.anInt6924 = Class286_Sub7.indexLoader32_34.getTableChecksum();
	    Class108.anInt1663 = Class348_Sub40_Sub17_Sub1.indexLoader33.getTableChecksum();
	    AlternativeFontLoader.method1001(Class286_Sub7.indexLoader32_34, 0);
	    int i_3_ = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			   .aClass239_Sub19_7257.method1805(i ^ 0x11ae);
	    Class186_Sub1.gametipLoader
		= new GametipLoader(Class348_Sub42_Sub8_Sub2.gameType,
			       Class348_Sub33.gameLanguage,
			       Class348_Sub40_Sub17_Sub1.indexLoader33);
	    int[] is = Class186_Sub1.gametipLoader.method1046(i_3_, 0);
	    if ((is.length ^ 0xffffffff) == -1)
		is = Class186_Sub1.gametipLoader.method1046(0, 0);
	    AlternativeFontLoader class106 = new AlternativeFontLoader(Class286_Sub7.indexLoader32_34, Class104.indexLoader13);
	    if ((is.length ^ 0xffffffff) < -1) {
		Class182.modernLoadingScreens = new LoadingScreen[is.length];
		for (int i_4_ = 0;
		     ((i_4_ ^ 0xffffffff)
		      > (Class182.modernLoadingScreens.length ^ 0xffffffff));
		     i_4_++)
		    Class182.modernLoadingScreens[i_4_]
			= new ModernLoadingScreen(Class186_Sub1.gametipLoader
					   .loadGameTip(is[i_4_], (byte) 102),
				       class106);
	    }
	}
	if (WidgetVariable.currentLoadingStage == LoadingStage.loadingStage3)
	    Class348_Sub42_Sub3.method3178(Class104.indexLoader13, -81, Class5_Sub1.method184(1084489728),Class286_Sub7.indexLoader32_34);
	if (LoadingStage.loadingStage4 == WidgetVariable.currentLoadingStage) {
	    int i_5_ = StringNode.method3420(0);
	    int i_6_ = FileRequest.method3256(2);
	    if ((i_5_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff))
		return 100 * i_5_ / i_6_;
	}
	if (WidgetVariable.currentLoadingStage == LoadingStage.loadingStage5) {
	    if (Class182.modernLoadingScreens != null
		&& ((Class182.modernLoadingScreens.length ^ 0xffffffff)
		    < -1)) {
		if ((Class182.modernLoadingScreens[0].method60(-19079)
		     ^ 0xffffffff)
		    > -101)
		    return 0;
		if ((Class182.modernLoadingScreens.length ^ 0xffffffff) < -2
		    && Class186_Sub1.gametipLoader.method1044(86)
		    && (Class182.modernLoadingScreens[1].method60(i + 9581)
			< 100))
		    return 0;
	    }
	    VarbitHandler.method1311(5139, Class348_Sub8.currentToolkit);
	    Class369.method3568(Class348_Sub8.currentToolkit, 4);
	    ByteBuffer.setClientState(2, 1);
	}
	if (WidgetVariable.currentLoadingStage == LoadingStage.loadingStage6) {
	    for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -5; i_7_++)
		MouseEventNode.aClass361Array7108[i_7_]
		    = NativeRaster.method988(Class348_Sub40_Sub3.anInt9109, 1,
					      Class367_Sub4.anInt7319);
	}
	if (WidgetVariable.currentLoadingStage == LoadingStage.loadingStage7) {
	    Class21.indexLoader8 = Class369_Sub2.createIndexLoader(false, 8, 1);
	    Class348_Sub29.indexLoader0 = Class369_Sub2.createIndexLoader(false, 0, 1);
	    Class186.indexLoader1 = Class369_Sub2.createIndexLoader(false, 1, 1);
	    Class95.indexLoader2 = Class369_Sub2.createIndexLoader(false, 2, 1);
	    Class348_Sub35.indexLoader3 = Class369_Sub2.createIndexLoader(false, 3, 1);
	    Class129.indexLoader4 = Class369_Sub2.createIndexLoader(false, 4, 1);
	    Class367_Sub10.indexLoader5 = Class369_Sub2.createIndexLoader(true, 5, 1);
	    Class59_Sub2_Sub1.indexLoader6 = Class369_Sub2.createIndexLoader(true, 6, 1);
	    aa_Sub3.indexLoader7 = Class369_Sub2.createIndexLoader(false, 7, 1);
	    Class369_Sub2.indexLoader9 = Class369_Sub2.createIndexLoader(false, 9, 1);
	    Class16.aClass45_233
		= Class369_Sub2.createIndexLoader(false, 10, 1);
	    Class348_Sub23_Sub2.indexLoader10
		= Class369_Sub2.createIndexLoader(false, 11, 1);
	    Class113.indexLoader12
		= Class369_Sub2.createIndexLoader(false, 12, 1);
	    Class239_Sub4.indexLoader14
		= Class369_Sub2.createIndexLoader(false, 14, 1);
	    Class123.indexLoader15
		= Class369_Sub2.createIndexLoader(false, 15, 1);
	    Class94.indexLoader16
		= Class369_Sub2.createIndexLoader(false, 16, 1);
	    Class247.indexLoader17
		= Class369_Sub2.createIndexLoader(false, 17, 1);
	    Class216.indexLoader18
		= Class369_Sub2.createIndexLoader(false, 18, 1);
	    Class174.indexLoader19
		= Class369_Sub2.createIndexLoader(false, 19, 1);
	    r_Sub2.indexLoader20
		= Class369_Sub2.createIndexLoader(false, 20, 1);
	    BufferedFile.indexLoader21
		= Class369_Sub2.createIndexLoader(false, 21, 1);
	    Class348_Sub16_Sub3.indexLoader22
		= Class369_Sub2.createIndexLoader(false, 22, 1);
	    Class348_Sub32.indexLoader23
		= Class369_Sub2.createIndexLoader(true, 23, 1);
	    Class130.indexLoader24
		= Class369_Sub2.createIndexLoader(false, 24, 1);
	    StringVarScriptSettingLoader.indexLoader25
		= Class369_Sub2.createIndexLoader(false, 25, 1);
	    KeyboardEventNode.indexLoader26
		= Class369_Sub2.createIndexLoader(true, 26, 1);
	    Class239.indexLoader27
		= Class369_Sub2.createIndexLoader(false, 27, 1);
	    Class367_Sub8.indexLoader28
		= Class369_Sub2.createIndexLoader(true, 28, 1);
	    Deque.indexLoader29
		= Class369_Sub2.createIndexLoader(false, 29, 1);
	    Class126.indexLoader30
		= Class369_Sub2.createIndexLoader(true, 30, 1);
	    EntryElementLoader.indexLoader31
		= Class369_Sub2.createIndexLoader(true, 31, 1);
	    VarbitDefinition.indexLoader36
		= Class369_Sub2.createIndexLoader(true, 36, 2);
	}
	if (LoadingStage.loadingStage8 == WidgetVariable.currentLoadingStage) {
	    int i_8_ = 0;
	    for (int i_9_ = 0; i_9_ < 37; i_9_++) {
		if (Class13.indexLoaders[i_9_] != null)
		    i_8_ += (Class13.indexLoaders[i_9_]
				 .getTableRequestPercentComplete()
			     * Class8.anIntArray164[i_9_] / 100);
	    }
	    if ((i_8_ ^ 0xffffffff) != -101) {
		if (Class268.anInt3435 < 0)
		    Class268.anInt3435 = i_8_;
		return ((i_8_ + -Class268.anInt3435) * 100
			/ (-Class268.anInt3435 + 100));
	    }
	    Class286_Sub5.method2159(Class21.indexLoader8);
	    Class348_Sub42_Sub3.method3178(Class104.indexLoader13, -124,
					   Class5_Sub1
					       .method184(i ^ ~0x40a46ff3),
					   Class21.indexLoader8);
	}
	if (LoadingStage.loadingStage9 == WidgetVariable.currentLoadingStage) {
	    if ((Class345.anInt4270 ^ 0xffffffff) == 0)
		Class345.anInt4270
		    = Class59_Sub2_Sub1.indexLoader6.getArchiveId("scape main");
	    r_Sub1.method3290(56);
	    ByteBuffer.setClientState(2, 2);
	}
	if (LoadingStage.loadingStage10 == WidgetVariable.currentLoadingStage)
	    Class30.setNativeLibraryLoader(Class126.indexLoader30, Class348_Sub23_Sub1.signlink, (byte) 95);
	if (LoadingStage.loadingStage11 == WidgetVariable.currentLoadingStage) {
	    int percent = Class239_Sub11.getRequiredElementsLoadedPercent((byte) -25);
	    if (percent < 100)
		return percent;
	    ObjectLoader.method2013(Class367_Sub8.indexLoader28
				    .method415((byte) 73, 1),
				(byte) 112);
	    RuntimeException_Sub1.method4012(Class367_Sub8.indexLoader28
						 .method415((byte) 73, 3),
					     (byte) -111);
	}
	if (WidgetVariable.currentLoadingStage == LoadingStage.loadingStage12) {
	    if (AbstractImageFetcher.anInt6923 != -1
		&& !aa_Sub3.indexLoader7.isLoaded(AbstractImageFetcher.anInt6923, 0))
		return 99;
	    Class348_Sub40_Sub4.textureLoader
		= new TextureLoader(KeyboardEventNode.indexLoader26,
			       Class369_Sub2.indexLoader9,
			       Class21.indexLoader8);
	    Class101_Sub3.aClass326_5764
		= new Class326(Class348_Sub42_Sub8_Sub2.gameType,
			       Class348_Sub33.gameLanguage,
			       Class95.indexLoader2);
	    Class64_Sub3.aClass261_5558
		= new Class261(Class348_Sub42_Sub8_Sub2.gameType,
			       Class348_Sub33.gameLanguage,
			       Class95.indexLoader2);
	    Class239.aClass166_3147
		= new Class166(Class348_Sub42_Sub8_Sub2.gameType,
			       Class348_Sub33.gameLanguage, Class95.indexLoader2,
			       Class21.indexLoader8);
	    Class348_Sub7.aClass33_6653
		= new Class33(Class348_Sub42_Sub8_Sub2.gameType,
			      Class348_Sub33.gameLanguage,
			      Class247.indexLoader17);
	    Class229.aClass268_2979
		= new Class268(Class348_Sub42_Sub8_Sub2.gameType,
			       Class348_Sub33.gameLanguage,
			       Class95.indexLoader2);
	    Class362.aClass183_4460
		= new Class183(Class348_Sub42_Sub8_Sub2.gameType,
			       Class348_Sub33.gameLanguage,
			       Class95.indexLoader2);
	    FileArchiveTracker.aClass219_4782
		= new Class219(Class348_Sub42_Sub8_Sub2.gameType,
			       Class348_Sub33.gameLanguage, Class95.indexLoader2,
			       Class21.indexLoader8);
	    Class348_Sub40_Sub25.aClass150_9342
		= new Class150(Class348_Sub42_Sub8_Sub2.gameType,
			       Class348_Sub33.gameLanguage, Class95.indexLoader2,
			       aa_Sub3.indexLoader7);
	    Class127_Sub1.aClass271_8378
		= new Class271(Class348_Sub42_Sub8_Sub2.gameType,
			       Class348_Sub33.gameLanguage,
			       Class95.indexLoader2);
	    Class348_Sub1.aClass185_6559
		= new Class185(Class348_Sub42_Sub8_Sub2.gameType,
			       Class348_Sub33.gameLanguage,
			       Class95.indexLoader2);
	    Class348_Sub40_Sub12.objectLoader
		= new ObjectLoader(Class348_Sub42_Sub8_Sub2.gameType,
			       Class348_Sub33.gameLanguage, true,
			       Class94.indexLoader16, aa_Sub3.indexLoader7);
	    Class348_Sub23_Sub2.aClass153_9031
		= new Class153(Class348_Sub42_Sub8_Sub2.gameType,
			       Class348_Sub33.gameLanguage, Class95.indexLoader2,
			       Class21.indexLoader8);
	    Class2.aClass141_117
		= new Class141(Class348_Sub42_Sub8_Sub2.gameType,
			       Class348_Sub33.gameLanguage, Class95.indexLoader2,
			       Class21.indexLoader8);
	    Class189.npcLoader
		= new NpcLoader(Class348_Sub42_Sub8_Sub2.gameType,
			       Class348_Sub33.gameLanguage, true,
			       Class216.indexLoader18, aa_Sub3.indexLoader7);
	    ToolkitException.itemLoader = new ItemLoader(Class348_Sub42_Sub8_Sub2.gameType,
			       Class348_Sub33.gameLanguage, true,
			       Class101_Sub3.aClass326_5764,
			       Class174.indexLoader19, aa_Sub3.indexLoader7);
	    Class348_Sub23_Sub2.aClass187_9036
		= new Class187(Class348_Sub42_Sub8_Sub2.gameType,
			       Class348_Sub33.gameLanguage,
			       Class95.indexLoader2);
	    Class10.animationLoader
		= new AnimationLoader(Class348_Sub42_Sub8_Sub2.gameType,
			      Class348_Sub33.gameLanguage, r_Sub2.indexLoader20,
			      Class348_Sub29.indexLoader0,
			      Class186.indexLoader1);
	    Class30.aClass84_413
		= new Class84(Class348_Sub42_Sub8_Sub2.gameType,
			      Class348_Sub33.gameLanguage, Class95.indexLoader2);
	    Class123.aClass25_1813
		= new Class25(Class348_Sub42_Sub8_Sub2.gameType,
			      Class348_Sub33.gameLanguage, Class95.indexLoader2);
	    Class348_Sub40_Sub18.gfxLoader
		= new GfxLoader(Class348_Sub42_Sub8_Sub2.gameType,
			       Class348_Sub33.gameLanguage, BufferedFile.indexLoader21,
			       aa_Sub3.indexLoader7);
	    EntryElementLoader.aClass65_4787
		= new Class65(Class348_Sub42_Sub8_Sub2.gameType,
			      Class348_Sub33.gameLanguage, Class95.indexLoader2);
	    Class91.scriptGlobalStrArgsLoader
		= new StringVarScriptSettingLoader(Class348_Sub42_Sub8_Sub2.gameType,
			      Class348_Sub33.gameLanguage, Class95.indexLoader2);
	    Class239_Sub14.scriptGlobalIntArgsLoader
		= new IntegerVarScriptSettingLoader(Class348_Sub42_Sub8_Sub2.gameType,
			       Class348_Sub33.gameLanguage,
			       Class95.indexLoader2);
	    Class229.scriptConfigLoader
		= new VarbitLoader(Class348_Sub42_Sub8_Sub2.gameType,
			       Class348_Sub33.gameLanguage,
			       Class348_Sub16_Sub3.indexLoader22);
	    Class269.aClass217_3453
		= new Class217(Class348_Sub42_Sub8_Sub2.gameType,
			       Class348_Sub33.gameLanguage,
			       Class95.indexLoader2);
	    Class65.method699(Class104.indexLoader13, (byte) -100,
			      Class348_Sub35.indexLoader3,
			      Class21.indexLoader8, aa_Sub3.indexLoader7);
	    GameApplet.method85(0, Deque.indexLoader29);
	    Class200.aClass226_2639
		= new Class226(Class348_Sub33.gameLanguage,
			       Class130.indexLoader24, StringVarScriptSettingLoader.indexLoader25);
	    Class239_Sub6.aClass355_5900
		= new Class355(Class348_Sub33.gameLanguage,
			       Class130.indexLoader24, StringVarScriptSettingLoader.indexLoader25,
			       new Class28());
	    Class150.method1202(0);
	    Class348_Sub40_Sub12.objectLoader.method2008
		(i + 28539, (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
				 .aClass239_Sub27_7261.method1840(i + -3690)
			     ^ 0xffffffff) == -1);
	    Class318_Sub1_Sub3_Sub3.varbitHandler = new VarbitHandler();
	    Class348_Sub40.method3038(-1);
	    RuntimeException_Sub1.method4011(i + 29684,
					     Class239.indexLoader27);
	    Class348_Sub29.method3004(aa_Sub3.indexLoader7, false,
				      Class348_Sub40_Sub4.textureLoader);
	    Huffman class296
		= new Huffman(Class16.aClass45_233.getArchiveChild("huffman", ""));
	    NativeToolkit.setHuffman(class296, (byte) 13);
	    try {
		jagmisc.init();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    Class348_Sub8.aClass241_6660 = Class229.method1631(false);
	    Class348_Sub40_Sub20.aClass348_Sub4_9264
		= new Class348_Sub4(true, Class348_Sub23_Sub1.signlink);
	}
	if (WidgetVariable.currentLoadingStage == LoadingStage.loadingStage14) {
	    int i_11_ = (Class348_Sub22.method2958(22388, Class21.indexLoader8)
			 + GameBuffer.method3405(2012104999, true));
	    int i_12_ = (Class288_Sub1.method2188(-30477)
			 - -FileRequest.method3256(2));
	    if (i_11_ < i_12_)
		return i_11_ * 100 / i_12_;
	}
	if (LoadingStage.loadingStage15 == WidgetVariable.currentLoadingStage)
	    Class75.method752(Class348_Sub32.indexLoader23,
			      Class229.aClass268_2979, Class362.aClass183_4460,
			      Class348_Sub40_Sub12.objectLoader,
			      Class348_Sub23_Sub2.aClass153_9031,
			      Class2.aClass141_117,
			      Class318_Sub1_Sub3_Sub3.varbitHandler);
	if (LoadingStage.loadingStage16 == WidgetVariable.currentLoadingStage) {
	    ISAAC.globalScriptIntVars
		= (new int
		   [((IntegerVarScriptSettingLoader) Class239_Sub14.scriptGlobalIntArgsLoader).amountScriptGlobalInts]);
	    Class286_Sub6.isCsVariableActive
		= (new boolean
		   [((IntegerVarScriptSettingLoader) Class239_Sub14.scriptGlobalIntArgsLoader).amountScriptGlobalInts]);
	    Class258_Sub2.globalScriptStrVars
		= new String[((StringVarScriptSettingLoader) Class91.scriptGlobalStrArgsLoader).amountScriptGlobalStrs];
	    for (int i_13_ = 0;
		 ((IntegerVarScriptSettingLoader) Class239_Sub14.scriptGlobalIntArgsLoader).amountScriptGlobalInts > i_13_;
		 i_13_++) {
		if ((((IntergerVarScriptSettingDefinition) Class239_Sub14.scriptGlobalIntArgsLoader.getScriptSetting(i_13_, i ^ ~0x6fc0)).isUnactive) == 0) {
		    Class286_Sub6.isCsVariableActive[i_13_] = true;
		    Class335.amountActiveCsVars++;
		}
		ISAAC.globalScriptIntVars[i_13_] = -1;
	    }
	    Class116.loadScriptSettings(1);
	    Class285.anInt4737
		= Class348_Sub35.indexLoader3.getArchiveId("loginscreen");
	    Class54.anInt970
		= Class348_Sub35.indexLoader3.getArchiveId("lobbyscreen");
	    Class367_Sub10.indexLoader5.destroy(0, true, false);
	    Class59_Sub2_Sub1.indexLoader6.destroy(0, true, true);
	    Class21.indexLoader8.destroy(i + 28660, true, true);
	    Class104.indexLoader13.destroy(0, true, true);
	    Class16.aClass45_233.destroy(0, true, true);
	    Class348_Sub35.indexLoader3.destroy(0, true, true);
	    ((IndexLoader) Class95.indexLoader2).unpackSettings = 2;
	    GfxLoader.aBoolean3988 = true;
	    ((IndexLoader) Class247.indexLoader17).unpackSettings = 2;
	    ((IndexLoader) Class94.indexLoader16).unpackSettings = 2;
	    ((IndexLoader) Class216.indexLoader18).unpackSettings = 2;
	    ((IndexLoader) Class174.indexLoader19).unpackSettings = 2;
	    ((IndexLoader) r_Sub2.indexLoader20).unpackSettings = 2;
	    ((IndexLoader) BufferedFile.indexLoader21).unpackSettings = 2;
	}
	if (WidgetVariable.currentLoadingStage == LoadingStage.loadingStage17) {
	    if (!Class320.method2547(Class285.anInt4737, (byte) 84))
		return 0;
	    boolean bool = true;
	    for (int i_14_ = 0;
		 i_14_ < (Class348_Sub40_Sub33.aClass46ArrayArray9427
			  [Class285.anInt4737]).length;
		 i_14_++) {
		Widget class46 = (Class348_Sub40_Sub33.aClass46ArrayArray9427
				   [Class285.anInt4737][i_14_]);
		if ((((Widget) class46).type ^ 0xffffffff) == -6
		    && ((Widget) class46).id != -1
		    && !Class21.indexLoader8.isLoaded((((Widget) class46)
							.id),
						       0))
		    bool = false;
	    }
	    if (!bool)
		return 0;
	}
	if (LoadingStage.loadingStage18 == WidgetVariable.currentLoadingStage)
	    Class348_Sub42_Sub8.method3198(true, (byte) -45);
	if (WidgetVariable.currentLoadingStage == LoadingStage.loadingStage19) {
	    ObjectDefinition.loadingHandler.method2319((byte) -56);
	    try {
		Class348_Sub32.aThread6946.join();
	    } catch (InterruptedException interruptedexception) {
		return 0;
	    }
	    Class186_Sub1.gametipLoader = null;
	    Class348_Sub40_Sub17_Sub1.indexLoader33 = null;
	    ObjectDefinition.loadingHandler = null;
	    Class182.modernLoadingScreens = null;
	    Class348_Sub32.aThread6946 = null;
	    Class286_Sub7.indexLoader32_34 = null;
	    NativeToolkit.method3886(i + 28556);
	    Class348_Sub23_Sub2.aBoolean9038
		= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub11_7265.method1768(-32350) == 1;
	    BitmapTable.aClass348_Sub51_3959.method3429((byte) 74,
						     (((Class348_Sub51)
						       (BitmapTable
							.aClass348_Sub51_3959))
						      .aClass239_Sub11_7265),
						     1);
	    if (Class348_Sub23_Sub2.aBoolean9038)
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub25_7251),
		     0);
	    else if (((Class239_Sub25)
		      (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		       .aClass239_Sub25_7251)).aBoolean6113
		     && (((Class348_Sub4)
			  Class348_Sub40_Sub20.aClass348_Sub4_9264).anInt6609
			 ^ 0xffffffff) > -513
		     && (((Class348_Sub4)
			  Class348_Sub40_Sub20.aClass348_Sub4_9264).anInt6609
			 ^ 0xffffffff) != -1)
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub25_7251),
		     0);
	    Class14_Sub2.method243(i ^ ~0x6fd6);
	    if (Class348_Sub23_Sub2.aBoolean9038)
		Class367_Sub10.method3553(false, (byte) 108, 0);
	    else
		Class367_Sub10.method3553(false, (byte) 102,
					  ((Class348_Sub51)
					   BitmapTable.aClass348_Sub51_3959)
					      .aClass239_Sub25_7251
					      .method1829(-32350));
	    Whirlpool.method830(((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
				  .aClass239_Sub8_7227.method1751(-32350),
			      -1, (byte) 102, false, -1);
	    VarbitHandler.method1311(5139, Class348_Sub8.currentToolkit);
	    Class369.method3568(Class348_Sub8.currentToolkit, i ^ ~0x6ff7);
	    ItemLoader.method1933(Class21.indexLoader8, Class348_Sub8.currentToolkit,
				true);
	    Class101.method901(Class113.rasterToolkits, 515880227);
	}
	return Class348_Sub40_Sub6.nextLoadingStage(false);
    }
    
    static final String method1279(boolean bool, int i, String[] strings,
				   int i_15_) {
	try {
	    anInt2172++;
	    if ((i ^ 0xffffffff) == -1)
		return "";
	    if (i == 1) {
		String string = strings[i_15_];
		if (string == null)
		    return "null";
		return string.toString();
	    }
	    int i_16_ = i + i_15_;
	    int i_17_ = 0;
	    for (int i_18_ = i_15_;
		 (i_18_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff); i_18_++) {
		String string = strings[i_18_];
		if (string == null)
		    i_17_ += 4;
		else
		    i_17_ += string.length();
	    }
	    StringBuffer stringbuffer = new StringBuffer(i_17_);
	    for (int i_19_ = i_15_;
		 (i_16_ ^ 0xffffffff) < (i_19_ ^ 0xffffffff); i_19_++) {
		String string = strings[i_19_];
		if (string == null)
		    stringbuffer.append("null");
		else
		    stringbuffer.append(string);
	    }
	    if (bool != true)
		method1277((byte) -20);
	    return stringbuffer.toString();
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("pea.C(" + bool + ',' + i + ','
					     + (strings != null ? "{...}"
						: "null")
					     + ',' + i_15_ + ')'));
	}
    }
}
