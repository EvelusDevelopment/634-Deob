/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class5 implements Interface1
{
    static int anInt4627;
    static int anInt4628;
    static int anInt4629;
    private int anInt4630;
    private IndexLoader indexLoader;
    IndexLoader aClass45_4632;
    static int anInt4633;
    static int anInt4634;
    Class369 aClass369_4635;
    static Cache aClass60_4636 = new Cache(64);
    private AbstractFontRasterizer aClass324_4637;
    static int anInt4638;
    static int anInt4639;
    private long aLong4640;
    static int anInt4641;
    
    abstract void method178(int i, boolean bool, byte i_0_, int i_1_);
    
    public boolean method8(byte i) {
	int i_2_ = -94 % ((i - 25) / 52);
	anInt4641++;
	boolean bool = true;
	if (!((Class5) this).aClass45_4632.getArchiveLoaded
	     (false, ((Class369) ((Class5) this).aClass369_4635).anInt4965))
	    bool = false;
	if (!indexLoader.getArchiveLoaded(false,
				     ((Class369) (((Class5) this)
						  .aClass369_4635)).anInt4965))
	    bool = false;
	return bool;
    }
    
    public void method7(int i) {
	anInt4639++;
	if (i == 10286) {
	    BitmapFont class143
		= Class239_Sub10.createBitmapFont((byte) -85,
					    (((Class369)
					      ((Class5) this).aClass369_4635)
					     .anInt4965),
					    indexLoader);
	    aClass324_4637
		= (Class348_Sub8.currentToolkit.createFontRasterizer
		   (class143,
		    Sprite.method1523(((Class5) this).aClass45_4632,
					(((Class369)
					  ((Class5) this).aClass369_4635)
					 .anInt4965)),
		    true));
	}
    }
    
    static final Class369_Sub1 method179(int i,
					 ByteBuffer class348_sub49) {
	anInt4629++;
	Class369 class369
	    = Class348_Sub16_Sub2.method2834((byte) -127, class348_sub49);
	int i_3_ = class348_sub49.getDWord();
	int i_4_ = class348_sub49.getDWord();
	if (i != 16533)
	    aClass60_4636 = null;
	int i_5_ = class348_sub49.getShort();
	return new Class369_Sub1(((Class369) class369).aClass221_4968,
				 ((Class369) class369).aClass341_4973,
				 ((Class369) class369).anInt4970,
				 ((Class369) class369).anInt4959,
				 ((Class369) class369).anInt4971,
				 ((Class369) class369).anInt4963,
				 ((Class369) class369).anInt4966,
				 ((Class369) class369).anInt4965,
				 ((Class369) class369).anInt4961, i_3_, i_4_,
				 i_5_);
    }
    
    public static void method180(int i) {
	aClass60_4636 = null;
	if (i != -19960)
	    method180(-71);
    }
    
    static final void method181
	(boolean bool,
	 Npc class318_sub1_sub3_sub3_sub1) {
	if (bool != true)
	    method180(54);
	anInt4627++;
	for (Class348_Sub9 class348_sub9
		 = (Class348_Sub9) Main.aClass262_5185.getFirst(4);
	     class348_sub9 != null;
	     class348_sub9 = ((Class348_Sub9)
			      Main.aClass262_5185.nextForward((byte) 78))) {
	    if ((((Class348_Sub9) class348_sub9)
		 .aClass318_Sub1_Sub3_Sub3_Sub1_6691)
		== class318_sub1_sub3_sub3_sub1) {
		if (((Class348_Sub9) class348_sub9).aClass348_Sub16_Sub5_6676
		    != null) {
		    Class348_Sub43.aClass348_Sub16_Sub4_7065.method2880
			(((Class348_Sub9) class348_sub9)
			 .aClass348_Sub16_Sub5_6676);
		    ((Class348_Sub9) class348_sub9).aClass348_Sub16_Sub5_6676
			= null;
		}
		class348_sub9.removeNode();
		break;
	    }
	}
    }
    
    abstract void method182(int i, int i_6_, int i_7_, boolean bool);
    
    final int method183(int i) {
	anInt4633++;
	if (i <= 16)
	    ((Class5) this).aClass369_4635 = null;
	int i_8_ = ObjectDefinition.loadingHandler.method2320((byte) 106);
	int i_9_ = 100 * i_8_;
	if ((i_8_ ^ 0xffffffff) != (anInt4630 ^ 0xffffffff)
	    || (i_8_ ^ 0xffffffff) == -1) {
	    anInt4630 = i_8_;
	    aLong4640 = Class62.getCurrentTimeMillis();
	} else {
	    int i_10_ = ObjectDefinition.loadingHandler.getCurrentPercent();
	    if (i_8_ < i_10_) {
		long l = aLong4640 - ObjectDefinition.loadingHandler.getUpdatedTime(0);
		if (l > 0L) {
		    long l_11_
			= (long) (i_10_ - i_8_) * (10000L * l / (long) i_8_);
		    long l_12_
			= (-aLong4640 + Class62.getCurrentTimeMillis()) * 10000L;
		    if (l_11_ > l_12_)
			i_9_ = (int) ((long) (i_8_ * 100)
				      + ((long) (i_10_ + -i_8_)
					 * (l_12_ * 100L) / l_11_));
		    else
			i_9_ = i_10_ * 100;
		}
	    }
	}
	return i_9_;
    }
    
    public final void draw(byte i, boolean bool) {
	if (i == -49) {
	    anInt4634++;
	    int i_13_
		= ((((Class369) ((Class5) this).aClass369_4635)
			.aClass221_4968.method1607
		    (Class92.anInt1524,
		     ((Class369) ((Class5) this).aClass369_4635).anInt4971,
		     (byte) -123))
		   + ((Class369) ((Class5) this).aClass369_4635).anInt4970);
	    int i_14_
		= ((((Class369) ((Class5) this).aClass369_4635)
			.aClass341_4973.method2679
		    (DirectxToolkit.anInt7666,
		     ((Class369) ((Class5) this).aClass369_4635).anInt4963,
		     i ^ ~0x60b))
		   + ((Class369) ((Class5) this).aClass369_4635).anInt4959);
	    method178(i_13_, bool, (byte) -84, i_14_);
	    method182(63, i_14_, i_13_, bool);
	    String string = ObjectDefinition.loadingHandler.getLoadingMsg(i ^ 0x245b);
	    if (-aLong4640 + Class62.getCurrentTimeMillis() > 10000L)
		string += " (" + ObjectDefinition.loadingHandler.getCurrentLoadingStage(i + 149).getStageId() + ")";
	    aClass324_4637.method2575
		((byte) 115,
		 (i_13_
		  + ((Class369) ((Class5) this).aClass369_4635).anInt4971 / 2),
		 ((Class369) ((Class5) this).aClass369_4635).anInt4961, string,
		 -1,
		 (((Class369) ((Class5) this).aClass369_4635).anInt4966 + 4
		  + (i_14_
		     - -(((Class369) ((Class5) this).aClass369_4635).anInt4963
			 / 2))));
	}
    }
    
    Class5(IndexLoader class45, IndexLoader class45_15_, Class369 class369) {
	try {
	    indexLoader = class45_15_;
	    ((Class5) this).aClass45_4632 = class45;
	    ((Class5) this).aClass369_4635 = class369;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("gl.<init>(" + (class45 != null ? "{...}" : "null")
			+ ',' + (class45_15_ != null ? "{...}" : "null") + ','
			+ (class369 != null ? "{...}" : "null") + ')'));
	}
    }
}
