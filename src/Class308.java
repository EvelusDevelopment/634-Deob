/* Class308 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class308
{
    static int anInt3879;
    static int anInt3880;
    static int anInt3881;
    static byte[][] aByteArrayArray3882;
    static int[] anIntArray3883;
    static KeyboardEvent[] anInterface6Array3884 = new KeyboardEvent[75];
    static int anInt3885;
    static int anInt3886;
    private SubNode aClass348_Sub42_3887 = new SubNode();
    private HashTable aClass356_3888;
    private Queue aClass107_3889 = new Queue();
    private int anInt3890;
    private int anInt3891;
    
    final SubNode method2302(long l, byte i) {
	try {
	    if (i > -25)
		aClass107_3889 = null;
	    anInt3885++;
	    SubNode class348_sub42
		= (SubNode) aClass356_3888.get(l);
	    if (class348_sub42 != null)
		aClass107_3889.add(class348_sub42);
	    return class348_sub42;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "wu.D(" + l + ',' + i + ')');
	}
    }
    
    final void method2303(boolean bool) {
	anInt3879++;
	if (bool != true)
	    method2305(-121L, null, -1);
	aClass107_3889.removeAll();
	aClass356_3888.removeAll(0);
	aClass348_Sub42_3887 = new SubNode();
	anInt3891 = anInt3890;
    }
    
    final void method2304(int i, long l) {
	do {
	    try {
		anInt3880++;
		SubNode class348_sub42
		    = (SubNode) aClass356_3888.get(l);
		if (class348_sub42 != null) {
		    class348_sub42.removeNode();
		    class348_sub42.removeSubnode();
		    anInt3891++;
		}
		if (i <= -110)
		    break;
		method2304(36, -86L);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						"wu.C(" + i + ',' + l + ')');
	    }
	    break;
	} while (false);
    }
    
    final void method2305(long l, SubNode class348_sub42, int i) {
	try {
	    anInt3881++;
	    if ((anInt3891 ^ 0xffffffff) == i) {
		SubNode class348_sub42_0_
		    = aClass107_3889.removeFirst();
		class348_sub42_0_.removeNode();
		class348_sub42_0_.removeSubnode();
		if (class348_sub42_0_ == aClass348_Sub42_3887) {
		    class348_sub42_0_ = aClass107_3889.removeFirst();
		    class348_sub42_0_.removeNode();
		    class348_sub42_0_.removeSubnode();
		}
	    } else
		anInt3891--;
	    aClass356_3888.putNode(l, class348_sub42);
	    aClass107_3889.add(class348_sub42);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("wu.E(" + l + ','
					     + (class348_sub42 != null
						? "{...}" : "null")
					     + ',' + i + ')'));
	}
    }
    
    public static void method2306(byte i) {
	if (i != -90)
	    method2306((byte) -74);
	anIntArray3883 = null;
	anInterface6Array3884 = null;
	aByteArrayArray3882 = null;
    }
    
    Class308(int i) {
	anInt3891 = i;
	anInt3890 = i;
	int i_1_;
	for (i_1_ = 1; i_1_ + i_1_ < i; i_1_ += i_1_) {
	    /* empty */
	}
	aClass356_3888 = new HashTable(i_1_);
    }
    
    static {
	anIntArray3883 = new int[6];
    }
}
