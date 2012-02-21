/* Class239_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub11 extends Class239
{
    static IncomingPacket aClass114_5949 = new IncomingPacket(69, 12);
    static IncomingPacket aClass114_5950;
    static int anInt5951 = 1339;
    static int anInt5952;
    static int anInt5953;
    static int anInt5954;
    static int anInt5955;
    static int anInt5956;
    static int anInt5957;
    static int anInt5958;
    static int ondemandWorkerAttempts;
    
    static final void method1767(boolean bool, int i) {
	anInt5953++;
	Class101_Sub3.method947((byte) 41);
	int i_0_ = (((Class159) Class269.aClass217_3453.method1588(-51, i))
		    .anInt2125);
	if ((i_0_ ^ 0xffffffff) != -1) {
	    if (bool != true)
		method1769(-43);
	    int i_1_ = (((VarbitHandler) Class318_Sub1_Sub3_Sub3.varbitHandler)
			.configs[i]);
	    if (i_0_ == 5)
		Class318_Sub1_Sub5.anInt8770 = i_1_;
	    if ((i_0_ ^ 0xffffffff) == -7)
		Class348_Sub40_Sub31.anInt9408 = i_1_;
	}
    }
    
    final int method1768(int i) {
	if (i != -32350)
	    method1767(true, -55);
	anInt5958++;
	return ((Class239) this).anInt3138;
    }
    
    public static void method1769(int i) {
	aClass114_5950 = null;
	if (i != 100)
	    method1769(-25);
	aClass114_5949 = null;
    }
    
    final int method1710(int i) {
	anInt5956++;
	if (i != 20014)
	    return -48;
	return 0;
    }
    
    final void method1716(boolean bool) {
	if (bool != false)
	    method1716(false);
	anInt5954++;
	if (((Class239) this).anInt3138 != 1
	    && (((Class239) this).anInt3138 ^ 0xffffffff) != -1)
	    ((Class239) this).anInt3138 = method1710(20014);
    }
    
    Class239_Sub11(int i, Class348_Sub51 class348_sub51) {
	super(i, class348_sub51);
    }
    
    final void method1712(int i, int i_2_) {
	anInt5952++;
	((Class239) this).anInt3138 = i_2_;
	int i_3_ = 98 / ((82 - i) / 35);
    }
    
    static final int getRequiredElementsLoadedPercent(byte i) {
	anInt5957++;
	if (Class367_Sub8.anInt7365 == 0) {
	    RequiredElement.jaclibRequiredElement.setElementLoader(new NativeLibTracker("jaclib"));
	    if ((RequiredElement.jaclibRequiredElement.getElementLoader().getPercentComplete(28)
		 ^ 0xffffffff)
		!= -101)
		return 1;
	    if (!((NativeLibTracker) RequiredElement.jaclibRequiredElement.getElementLoader()).isFinished(124))
		NpcDefinition.aClient1367.method97(i + 24);
	    Class367_Sub8.anInt7365 = 1;
	}
	if ((Class367_Sub8.anInt7365 ^ 0xffffffff) == -2) {
	    Class126.requiredElements = RequiredElement.getRequiredElements(110);
	    RequiredElement.fileIndex28tracker.setElementLoader(new FileIndexTracker(Class367_Sub8.indexLoader28));
	    RequiredElement.jagglRequiredElement.setElementLoader(new NativeLibTracker("jaggl"));
	    RequiredElement.jagmiscRequiredElement.setElementLoader(new NativeLibTracker("jagdx"));
	    RequiredElement.aClass267_3404.setElementLoader(new NativeLibTracker("jagmisc"));
	    RequiredElement.aClass267_3405.setElementLoader(new NativeLibTracker("sw3d"));
	    RequiredElement.aClass267_3406.setElementLoader(new NativeLibTracker("hw3d"));
	    RequiredElement.aClass267_3407.setElementLoader(new NativeLibTracker("jagtheora"));
	    RequiredElement.aClass267_3408
		.setElementLoader(new FileIndexTracker(EntryElementLoader.indexLoader31));
	    RequiredElement.aClass267_3409
		.setElementLoader(new FileIndexTracker(KeyboardEventNode.indexLoader26));
	    RequiredElement.aClass267_3410
		.setElementLoader(new FileIndexTracker(Class95.indexLoader2));
	    RequiredElement.aClass267_3411
		.setElementLoader(new FileIndexTracker(Class94.indexLoader16));
	    RequiredElement.aClass267_3412
		.setElementLoader(new FileIndexTracker(Class247.indexLoader17));
	    RequiredElement.aClass267_3413
		.setElementLoader(new FileIndexTracker(Class216.indexLoader18));
	    RequiredElement.aClass267_3414.setElementLoader(new FileIndexTracker(Class174.indexLoader19));
	    RequiredElement.aClass267_3415
		.setElementLoader(new FileIndexTracker(r_Sub2.indexLoader20));
	    RequiredElement.aClass267_3416
		.setElementLoader(new FileIndexTracker(BufferedFile.indexLoader21));
	    RequiredElement.aClass267_3417.setElementLoader(new FileIndexTracker(Class348_Sub16_Sub3
							    .indexLoader22));
	    RequiredElement.aClass267_3418
		.setElementLoader(new FileIndexTracker(Class130.indexLoader24));
	    RequiredElement.aClass267_3419
		.setElementLoader(new FileIndexTracker(StringVarScriptSettingLoader.indexLoader25));
	    RequiredElement.aClass267_3420
		.setElementLoader(new FileIndexTracker(Class239.indexLoader27));
	    RequiredElement.aClass267_3421
		.setElementLoader(new FileIndexTracker(Deque.indexLoader29));
	    RequiredElement.aClass267_3422.setElementLoader(new FileArchiveTracker((Class16.aClass45_233), "huffman"));
	    RequiredElement.aClass267_3423.setElementLoader(new FileIndexTracker(Class348_Sub35.indexLoader3));
	    RequiredElement.aClass267_3424.setElementLoader(new FileIndexTracker(Class113.indexLoader12));
	    RequiredElement.aClass267_3425.setElementLoader(new FileIndexTracker(Class104.indexLoader13));
	    RequiredElement.aClass267_3426.setElementLoader(new EntryElementLoader((Class348_Sub32.indexLoader23), "details"));
	    for (int i_4_ = 0; i_4_ < Class126.requiredElements.length; i_4_++) {
		if (Class126.requiredElements[i_4_].getElementLoader() == null)
		    throw new RuntimeException();
	    }
	    int total = 0;
	    RequiredElement[] elements = Class126.requiredElements;
	    for (int j = 0; j < elements.length; j++) {
		RequiredElement class267 = elements[j];
		int size = class267.getSize();
		int com = class267.getElementLoader().getPercentComplete(87);
		total += com * size / 100;
	    }
	    Class348_Sub40_Sub24.anInt9327 = total;
	    Class367_Sub8.anInt7365 = 2;
	}
	if (Class126.requiredElements == null)
	    return 100;
	int totalSize = 0;
	int totalPercent = 0;
	boolean bool = true;
	if (i != -25)
	    anInt5951 = -33;
	RequiredElement[] class267s = Class126.requiredElements;
	for (int i_11_ = 0;
	     (i_11_ ^ 0xffffffff) > (class267s.length ^ 0xffffffff); i_11_++) {
	    RequiredElement class267 = class267s[i_11_];
	    int size = class267.getSize();
	    int percent = class267.getElementLoader().getPercentComplete(i ^ 0x75);
	    totalSize += size;
	    totalPercent += percent * size / 100;
	    if (percent < 100)
		bool = false;
	}
	if (bool) {
	    if (!((NativeLibTracker) RequiredElement.aClass267_3404.getElementLoader())
		     .isFinished(102))
		NpcDefinition.aClient1367.method83(true);
	    if (!((NativeLibTracker) RequiredElement.aClass267_3407.getElementLoader())
		     .isFinished(103))
		Class38.aBoolean510 = NpcDefinition.aClient1367.method100(i ^ ~0x12);
	    Class126.requiredElements = null;
	}
	totalSize -= Class348_Sub40_Sub24.anInt9327;
	totalPercent -= Class348_Sub40_Sub24.anInt9327;
	int i_14_ = totalSize <= 0 ? 100 : 100 * totalPercent / totalSize;
	if (!bool && (i_14_ ^ 0xffffffff) < -100)
	    i_14_ = 99;
	return i_14_;
    }
    
    Class239_Sub11(Class348_Sub51 class348_sub51) {
	super(class348_sub51);
    }
    
    final int method1714(int i, int i_15_) {
	if (i != 3)
	    return 94;
	anInt5955++;
	return 1;
    }
    
    static {
	aClass114_5950 = new IncomingPacket(64, 2);
	ondemandWorkerAttempts = 0;
    }
}
