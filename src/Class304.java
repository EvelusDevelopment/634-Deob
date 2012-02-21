/* Class304 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class304
{
    static boolean aBoolean3847 = false;
    static int anInt3848;
    static int anInt3849;
    int anInt3850;
    static int anInt3851;
    
    Class304(int i) {
	((Class304) this).anInt3850 = i;
    }
    
    public final String toString() {
	anInt3851++;
	throw new IllegalStateException();
    }
    
    static final void method2289(int i, int i_0_, int i_1_, int i_2_,
				 byte[] is, int i_3_) {
	if (i_1_ > -32)
	    method2290();
	anInt3848++;
	if ((i_3_ ^ 0xffffffff) < (i ^ 0xffffffff)) {
	    i_0_ += i;
	    i_2_ = -i + i_3_ >> 1976000866;
	    while ((--i_2_ ^ 0xffffffff) <= -1) {
		is[i_0_++] = (byte) 1;
		is[i_0_++] = (byte) 1;
		is[i_0_++] = (byte) 1;
		is[i_0_++] = (byte) 1;
	    }
	    i_2_ = 0x3 & -i + i_3_;
	    while (--i_2_ >= 0)
		is[i_0_++] = (byte) 1;
	}
    }
    
    static final void method2290() {
	for (;;) {
	    boolean bool = true;
	    for (int i = 0; i < Class348_Sub40_Sub34.aClass293Array9432.length;
		 i++) {
		if (!Class348_Sub40_Sub34.aClass293Array9432[i].method2210()) {
		    synchronized (Class348_Sub40_Sub34.aClass293Array9432[i]) {
			Class348_Sub40_Sub34.aClass293Array9432[i].notify();
		    }
		    bool = false;
		} else
		    VarbitDefinition.aLongArray2013[i]
			= Class348_Sub40_Sub34.aClass293Array9432[i]
			      .method2204();
	    }
	    if (bool)
		break;
	    try {
		Class286_Sub5.method2161((byte) -18, 1L);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	Class348_Sub40_Sub34.aClass293Array9432
	    [Class348_Sub40_Sub34.aClass293Array9432.length - 1].method2208();
	Class285_Sub1.method2131(1);
	for (;;) {
	    boolean bool = true;
	    for (int i = 0;
		 i < Class348_Sub40_Sub34.aClass293Array9432.length - 1; i++) {
		if (!Class348_Sub40_Sub34.aClass293Array9432[i].method2210()) {
		    synchronized (Class348_Sub40_Sub34.aClass293Array9432[i]) {
			Class348_Sub40_Sub34.aClass293Array9432[i].notify();
		    }
		    bool = false;
		}
	    }
	    if (bool)
		break;
	    try {
		Class286_Sub5.method2161((byte) 72, 1L);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	for (int i = 1; i < Class348_Sub40_Sub34.aClass293Array9432.length - 2;
	     i++)
	    Class348_Sub40_Sub34.aClass293Array9432[i].method2208();
	Class285_Sub1.method2131(2);
	while (!Class348_Sub40_Sub34.aClass293Array9432[0].method2210()) {
	    synchronized (Class348_Sub40_Sub34.aClass293Array9432[0]) {
		Class348_Sub40_Sub34.aClass293Array9432[0].notify();
	    }
	    try {
		Class286_Sub5.method2161((byte) 112, 1L);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	Class348_Sub40_Sub34.aClass293Array9432[0].method2208();
    }
    
    static final void method2291(byte i, int i_4_, int i_5_) {
	anInt3849++;
	int i_6_ = (Class369.b12FullBitmapFont.method1183
		    (true, GameText.aClass274_3507
			       .getLanguageText(Class348_Sub33.gameLanguage)));
	int i_7_;
	if (!Class348_Sub42_Sub6.aBoolean9535) {
	    for (Class348_Sub42_Sub12 class348_sub42_sub12
		     = ((Class348_Sub42_Sub12)
			Class348_Sub40_Sub4.aClass262_9111.getFirst(4));
		 class348_sub42_sub12 != null;
		 class348_sub42_sub12
		     = (Class348_Sub42_Sub12) Class348_Sub40_Sub4
						  .aClass262_9111
						  .nextForward((byte) 69)) {
		int i_8_
		    = DummyOutputstream.method138(class348_sub42_sub12, false);
		if (i_6_ < i_8_)
		    i_6_ = i_8_;
	    }
	    i_6_ += 8;
	    Class237_Sub1.anInt5819
		= (!Class71.aBoolean1211 ? 22 : 26) + 16 * FileArchiveTracker.anInt4776;
	    i_7_ = 21 + FileArchiveTracker.anInt4776 * 16;
	} else {
	    for (Class348_Sub42_Sub13 class348_sub42_sub13
		     = ((Class348_Sub42_Sub13)
			Class233.aClass107_3022.getFirst());
		 class348_sub42_sub13 != null;
		 class348_sub42_sub13
		     = ((Class348_Sub42_Sub13)
			Class233.aClass107_3022.next())) {
		int i_9_;
		if ((((Class348_Sub42_Sub13) class348_sub42_sub13).anInt9615
		     ^ 0xffffffff)
		    != -2)
		    i_9_ = Class289.method2194(-1, class348_sub42_sub13);
		else
		    i_9_ = (DummyOutputstream.method138
			    (((Class348_Sub42_Sub12)
			      (((SubNode)
				((Queue)
				 (((Class348_Sub42_Sub13) class348_sub42_sub13)
				  .aClass107_9621)).parent)
			       .subnodeParent)),
			     false));
		if ((i_9_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff))
		    i_6_ = i_9_;
	    }
	    i_6_ += 8;
	    i_7_ = 21 + 16 * Class8.anInt166;
	    Class237_Sub1.anInt5819
		= (Class71.aBoolean1211 ? 26 : 22) + 16 * Class8.anInt166;
	}
	int i_10_ = -(i_6_ / 2) + i_4_;
	if (Class321.windowWidth < i_6_ + i_10_)
	    i_10_ = -i_6_ + Class321.windowWidth;
	if (i_10_ < 0)
	    i_10_ = 0;
	int i_11_ = i_5_;
	if (i > -108)
	    method2290();
	if (i_11_ + i_7_ > Class348_Sub42_Sub8_Sub2.windowHeight)
	    i_11_ = Class348_Sub42_Sub8_Sub2.windowHeight + -i_7_;
	if ((i_11_ ^ 0xffffffff) > -1)
	    i_11_ = 0;
	Class135_Sub1.anInt4717 = i_10_;
	Class5_Sub1.aBoolean8335 = true;
	Class348_Sub42_Sub5.anInt9532 = i_11_;
	Class63.anInt1117 = i_6_;
    }
}
