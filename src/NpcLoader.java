/* NpcLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NpcLoader
{
    IndexLoader modelIndexLoader;
    private Cache aClass60_3577 = new Cache(64);
    GameMode aClass230_3578;
    static int anInt3579;
    static int anInt3580;
    static int anInt3581;
    static int anInt3582;
    boolean aBoolean3583;
    static int anInt3584;
    private IndexLoader npcIndexLoader;
    static int anInt3586;
    static int anInt3587;
    static int anInt3588;
    static int anInt3589;
    Cache aClass60_3590 = new Cache(50);
    static int anInt3591;
    Cache aClass60_3592 = new Cache(5);
    int anInt3593;
    
    final void method2072(byte i, boolean bool) {
	if (i >= 22) {
	    anInt3580++;
	    if (((NpcLoader) this).aBoolean3583 != bool) {
		((NpcLoader) this).aBoolean3583 = bool;
		method2078(-6080);
	    }
	}
    }
    
    final void method2073(int i, int i_0_) {
	((NpcLoader) this).anInt3593 = i_0_;
	anInt3591++;
	synchronized (((NpcLoader) this).aClass60_3590) {
	    ((NpcLoader) this).aClass60_3590.removeAll(0);
	}
	synchronized (((NpcLoader) this).aClass60_3592) {
	    ((NpcLoader) this).aClass60_3592.removeAll(0);
	}
	if (i != -25032)
	    getNpcDefinition(-66, 101);
    }
    
    final void method2074(int i) {
	synchronized (((NpcLoader) this).aClass60_3590) {
	    ((NpcLoader) this).aClass60_3590.removeAll(0);
	}
	if (i < -94) {
	    anInt3582++;
	    synchronized (((NpcLoader) this).aClass60_3592) {
		((NpcLoader) this).aClass60_3592.removeAll(0);
	    }
	}
    }
    
    static final boolean method2075(int i, int i_1_, int i_2_) {
	anInt3584++;
	if (i_1_ > -125)
	    anInt3581 = -110;
	if ((i & 0x100100 ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
    
    final void method2076(int i, boolean bool) {
	anInt3589++;
	synchronized (aClass60_3577) {
	    aClass60_3577.method578(2, i);
	}
	synchronized (((NpcLoader) this).aClass60_3590) {
	    ((NpcLoader) this).aClass60_3590.method578(2, i);
	}
	if (bool != true)
	    method2072((byte) 120, true);
	synchronized (((NpcLoader) this).aClass60_3592) {
	    ((NpcLoader) this).aClass60_3592.method578(2, i);
	}
    }
    
    static final boolean method2077(int i, int i_3_, int i_4_) {
	int i_5_ = -75 % ((-43 - i) / 40);
	anInt3588++;
	if ((i_4_ & 0x8000 ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
    
    final void method2078(int i) {
	anInt3579++;
	synchronized (aClass60_3577) {
	    if (i != -6080)
		((NpcLoader) this).aClass60_3590 = null;
	    aClass60_3577.removeAll(i + 6080);
	}
	synchronized (((NpcLoader) this).aClass60_3590) {
	    ((NpcLoader) this).aClass60_3590.removeAll(i + 6080);
	}
	synchronized (((NpcLoader) this).aClass60_3592) {
	    ((NpcLoader) this).aClass60_3592.removeAll(0);
	}
    }
    
    final NpcDefinition getNpcDefinition(int id, int i_6_) {
	anInt3586++;
	NpcDefinition definition;
	synchronized (aClass60_3577) {
	    definition = (NpcDefinition) aClass60_3577.method583((long) id, -104);
	}
	if (definition != null)
	    return definition;
	byte[] is;
	synchronized (npcIndexLoader) {
	    is = npcIndexLoader.loadArchiveChild(i_6_ + -1859,
					 Class115.method1060(id, (byte) 69),
					 Class253.method1920(127, id));
        }
	definition = new NpcDefinition();
	((NpcDefinition) definition).id = id;
	((NpcDefinition) definition).loader = this;
	if (is != null)
	    definition.initialize(111, new ByteBuffer(is));
	definition.method799(-117);
	synchronized (aClass60_3577) {
	    aClass60_3577.method582(definition, (long) id, (byte) -102);
	}
	return definition;
    }
    
    final void method2080(int i) {
	anInt3587++;
	synchronized (aClass60_3577) {
	    aClass60_3577.method587(-118);
	}
	synchronized (((NpcLoader) this).aClass60_3590) {
	    ((NpcLoader) this).aClass60_3590.method587(-100);
	}
	synchronized (((NpcLoader) this).aClass60_3592) {
	    ((NpcLoader) this).aClass60_3592.method587(-107);
	}
	if (i <= 122)
	    method2075(-125, -46, 9);
    }
    
    NpcLoader(GameMode class230, int i, boolean bool, IndexLoader class45,
	     IndexLoader class45_7_) {
	do {
	    try {
		((NpcLoader) this).aBoolean3583 = bool;
		npcIndexLoader = class45;
		((NpcLoader) this).modelIndexLoader = class45_7_;
		((NpcLoader) this).aClass230_3578 = class230;
		if (npcIndexLoader == null)
		    break;
		int i_8_ = npcIndexLoader.getAmountChildren() - 1;
		npcIndexLoader.method407(i_8_);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("vda.<init>("
						 + (class230 != null ? "{...}"
						    : "null")
						 + ',' + i + ',' + bool + ','
						 + (class45 != null ? "{...}"
						    : "null")
						 + ','
						 + (class45_7_ != null
						    ? "{...}" : "null")
						 + ')'));
	    }
	    break;
	} while (false);
    }
}
