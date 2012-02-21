/* HashTable - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class HashTable
{
    Node[] nodes;
    static int anInt4375;
    static int anInt4376;
    int anInt4377;
    static int anInt4378;
    static int anInt4379;
    static int anInt4380;
    static int anInt4381;
    static int anInt4382;
    public static int calendarTime;
    static int anInt4384;
    private long aLong4385;
    static int anInt4386;
    static int anInt4387;
    static IncomingPacket aClass114_4388 = new IncomingPacket(3, 3);
    private Node aClass348_4389;
    private Node aClass348_4390;
    private int anInt4391 = 0;
    
    final int method3474(int i) {
	if (i != 1)
	    method3479(20);
	anInt4387++;
	int i_0_ = 0;
	for (int i_1_ = 0;
	     (i_1_ ^ 0xffffffff) > (((HashTable) this).anInt4377 ^ 0xffffffff);
	     i_1_++) {
	    Node class348 = ((HashTable) this).nodes[i_1_];
	    for (Node class348_2_ = ((Node) class348).nodeParent;
		 class348 != class348_2_;
		 class348_2_ = ((Node) class348_2_).nodeParent)
		i_0_++;
	}
	return i_0_;
    }
    
    final int method3475(boolean bool) {
	anInt4376++;
	if (bool != true)
	    method3478(false);
	return ((HashTable) this).anInt4377;
    }
    
    final Node method3476(boolean bool) {
	anInt4384++;
	if (aClass348_4389 == null)
	    return null;
	Node class348
	    = (((HashTable) this).nodes
	       [(int) ((long) (((HashTable) this).anInt4377 - 1) & aLong4385)]);
	if (bool != true)
	    method3479(4);
	for (/**/; aClass348_4389 != class348;
	     aClass348_4389 = ((Node) aClass348_4389).nodeParent) {
	    if (((Node) aClass348_4389).nodeKey == aLong4385) {
		Node class348_3_ = aClass348_4389;
		aClass348_4389 = ((Node) aClass348_4389).nodeParent;
		return class348_3_;
	    }
	}
	aClass348_4389 = null;
	return null;
    }
    
    final int method3477(int i, Node[] class348s) {
	if (i != 3)
	    calendarTime = -76;
	anInt4380++;
	int i_4_ = 0;
	for (int i_5_ = 0;
	     (i_5_ ^ 0xffffffff) > (((HashTable) this).anInt4377 ^ 0xffffffff);
	     i_5_++) {
	    Node class348 = ((HashTable) this).nodes[i_5_];
	    for (Node class348_6_ = ((Node) class348).nodeParent;
		 class348 != class348_6_;
		 class348_6_ = ((Node) class348_6_).nodeParent)
		class348s[i_4_++] = class348_6_;
	}
	return i_4_;
    }
    
    public static void method3478(boolean bool) {
	aClass114_4388 = null;
	if (bool != false)
	    calendarTime = 67;
    }
    
    static final Class348_Sub21 method3479(int i) {
	anInt4378++;
	if (i != -1)
	    calendarTime = 43;
	if (Class75.aClass262_1254 == null || r.aClass312_9716 == null)
	    return null;
	for (Class348_Sub21 class348_sub21
		 = (Class348_Sub21) r.aClass312_9716.method2329(10);
	     class348_sub21 != null;
	     class348_sub21
		 = (Class348_Sub21) r.aClass312_9716.method2329(i ^ ~0xa)) {
	    Class42 class42
		= Class75.aClass153_1238.method1225(((Class348_Sub21)
						     class348_sub21).anInt6847,
						    (byte) 92);
	    if (class42 != null && ((Class42) class42).aBoolean609
		&& class42.method373(Class75.anInterface17_1244, 127))
		return class348_sub21;
	}
	return null;
    }
    
    final Node get(long l) {
	try {
	    aLong4385 = l;
	    anInt4379++;
	    Node class348
		= (((HashTable) this).nodes
		   [(int) (l & (long) (((HashTable) this).anInt4377 + -1))]);
	    for (aClass348_4389 = ((Node) class348).nodeParent;
		 aClass348_4389 != class348;
		 aClass348_4389 = ((Node) aClass348_4389).nodeParent) {
		if ((((Node) aClass348_4389).nodeKey
		     ^ 0xffffffffffffffffL)
		    == (l ^ 0xffffffffffffffffL)) {
		    Node class348_7_ = aClass348_4389;
		    aClass348_4389
			= ((Node) aClass348_4389).nodeParent;
		    return class348_7_;
		}
	    }
	    aClass348_4389 = null;
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "eq.C(" + l + ')');
	}
    }
    
    final void removeAll(int i) {
	anInt4375++;
	for (int i_8_ = i;
	     (i_8_ ^ 0xffffffff) > (((HashTable) this).anInt4377 ^ 0xffffffff);
	     i_8_++) {
	    Node class348 = ((HashTable) this).nodes[i_8_];
	    for (;;) {
		Node class348_9_ = ((Node) class348).nodeParent;
		if (class348_9_ == class348)
		    break;
		class348_9_.removeNode();
	    }
	}
	aClass348_4389 = null;
	aClass348_4390 = null;
    }
    
    final Node method3482(int i) {
	anInt4381++;
	if (anInt4391 > i && (aClass348_4390 != ((HashTable) this).nodes[-1 + anInt4391])) {
	    Node class348 = aClass348_4390;
	    aClass348_4390 = ((Node) class348).nodeParent;
	    return class348;
	}
	while ((anInt4391 ^ 0xffffffff) > (((HashTable) this).anInt4377 ^ 0xffffffff)) {
	    Node class348 = (((Node) ((HashTable) this).nodes[anInt4391++]).nodeParent);
	    if (((HashTable) this).nodes[-1 + anInt4391]
		!= class348) {
		aClass348_4390 = ((Node) class348).nodeParent;
		return class348;
	    }
	}
	return null;
    }
    
    final void putNode(long l, Node childNode) {
	try {
	    anInt4382++;
	    if (((Node) childNode).nodeChild != null)
		childNode.removeNode();
	    Node parentNode = (((HashTable) this).nodes[(int) (l & (long) (((HashTable) this).anInt4377) - 1)]);
	    ((Node) childNode).nodeParent = parentNode;
	    ((Node) childNode).nodeChild = ((Node) parentNode).nodeChild;
	    ((Node) ((Node) childNode).nodeChild).nodeParent = childNode;
	    ((Node) ((Node) childNode).nodeParent).nodeChild = childNode;
	    ((Node) childNode).nodeKey = l;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("eq.K(" + l + ','
					     + (childNode != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    final Node method3484(int i) {
	anInt4391 = i;
	anInt4386++;
	return method3482(0);
    }
    
    HashTable(int i) {
	((HashTable) this).anInt4377 = i;
	((HashTable) this).nodes = new Node[i];
	for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > (i ^ 0xffffffff); i_11_++) {
	    Node class348
		= ((HashTable) this).nodes[i_11_] = new Node();
	    ((Node) class348).nodeParent = class348;
	    ((Node) class348).nodeChild = class348;
	}
    }
}
