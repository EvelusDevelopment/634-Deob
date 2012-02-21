/* AnimationLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class AnimationLoader
{
    static int anInt1483;
    static int anInt1484;
    static int anInt1485;
    static int anInt1486;
    private Cache aClass60_1487 = new Cache(64);
    private IndexLoader animIndexLoader;
    static int anInt1489;
    static int anInt1490;
    private Cache aClass60_1491 = new Cache(100);
    
    final void method834(byte i) {
	synchronized (aClass60_1487) {
	    aClass60_1487.removeAll(0);
	    if (i >= -43)
		method838(-67);
	}
	anInt1490++;
	synchronized (aClass60_1491) {
	    aClass60_1491.removeAll(0);
	}
    }
    
    final AnimationDefinition method835(int i, int i_0_) {
	anInt1483++;
	AnimationDefinition class17;
	synchronized (aClass60_1487) {
	    class17 = (AnimationDefinition) aClass60_1487.method583((long) i, i_0_ + -68);
	}
	if (i_0_ != 7)
	    aClass60_1491 = null;
	if (class17 != null)
	    return class17;
	byte[] is;
	synchronized (animIndexLoader) {
	    is = animIndexLoader.loadArchiveChild(-1860,
					 Class15.method256(i, (byte) 125),
					 ColorNode.method494(i_0_ ^ 0x55, i));
	}
	class17 = new AnimationDefinition();
	((AnimationDefinition) class17).anInt269 = i;
	((AnimationDefinition) class17).aClass87_251 = this;
	if (is != null)
	    class17.method267(new ByteBuffer(is), false);
	class17.method270((byte) 124);
	synchronized (aClass60_1487) {
	    aClass60_1487.method582(class17, (long) i, (byte) -126);
	}
	return class17;
    }
    
    final void method836(int i, int i_1_) {
	anInt1485++;
	synchronized (aClass60_1487) {
	    aClass60_1487.method578(2, i);
	}
	synchronized (aClass60_1491) {
	    aClass60_1491.method578(2, i);
	}
	int i_2_ = -75 % ((i_1_ - 26) / 35);
    }
    
    static final int method837(int i, boolean bool, int i_3_, int i_4_) {
	i_4_ &= 0x3;
	anInt1486++;
	if ((i_4_ ^ 0xffffffff) == -1)
	    return i_3_;
	if (bool != true)
	    return -75;
	if (i_4_ == 1)
	    return 7 - i;
	if ((i_4_ ^ 0xffffffff) == -3)
	    return 7 - i_3_;
	return i;
    }
    
    final void method838(int i) {
	synchronized (aClass60_1487) {
	    aClass60_1487.method587(-121);
	}
	if (i != 7)
	    method838(-111);
	anInt1489++;
	synchronized (aClass60_1491) {
	    aClass60_1491.method587(-127);
	}
    }
    
    final Class348_Sub42_Sub17 method839(int i, int i_5_) {
	anInt1484++;
	Class348_Sub42_Sub17 class348_sub42_sub17;
	synchronized (aClass60_1491) {
	    if (i_5_ != 3)
		aClass60_1487 = null;
	    class348_sub42_sub17
		= (Class348_Sub42_Sub17) aClass60_1491.method583((long) i,
								 -60);
	    if (class348_sub42_sub17 == null) {
		class348_sub42_sub17 = new Class348_Sub42_Sub17(i);
		aClass60_1491.method582(class348_sub42_sub17, (long) i,
					(byte) -127);
	    }
	    if (!class348_sub42_sub17.method3268(-122))
		return null;
	}
	return class348_sub42_sub17;
    }
    
    AnimationLoader(GameMode class230, int i, IndexLoader animLoader, IndexLoader skeletonLoader,
	    IndexLoader skinLoader) {
	try {
	    animIndexLoader = animLoader;
	    if (animIndexLoader != null) {
		int i_8_ = animIndexLoader.getAmountChildren() - 1;
		animIndexLoader.method407(i_8_);
	    }
	    Class239.method1711(7, skeletonLoader, 2, skinLoader);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("lfa.<init>(" + (class230 != null ? "{...}" : "null")
			+ ',' + i + ',' + (animLoader != null ? "{...}" : "null")
			+ ',' + (skeletonLoader != null ? "{...}" : "null") + ','
			+ (skinLoader != null ? "{...}" : "null") + ')'));
	}
    }
}
