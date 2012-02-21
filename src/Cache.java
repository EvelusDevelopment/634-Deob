/* Cache - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Cache
{
    private int anInt1084;
    static int anInt1085;
    private int anInt1086;
    static int anInt1087;
    static int anInt1088;
    private Queue queue = new Queue();
    static int anInt1090;
    static int anInt1091;
    static int anInt1092;
    static int anInt1093;
    static int anInt1094;
    static int anInt1095;
    static int anInt1096;
    static int anInt1097;
    static AbstractToolkit aHa1098;
    static int anInt1099;
    private HashTable hashTable;
    static int anInt1101;
    static int anInt1102;
    static int anInt1103;
    
    final int method575(int i) {
	anInt1101++;
	int i_0_ = i;
	for (Class348_Sub42_Sub8 class348_sub42_sub8 = (Class348_Sub42_Sub8) queue.getFirst();
	     class348_sub42_sub8 != null;
	     class348_sub42_sub8 = ((Class348_Sub42_Sub8) queue.next())) {
             if (!class348_sub42_sub8.method3195(-4))
		i_0_++;
	}
	return i_0_;
    }
    
    static final boolean method576(int i, int i_1_) {
	if (i_1_ <= 21)
	    method589(null, -21);
	anInt1088++;
	if (i != 2 && (i ^ 0xffffffff) != -4)
	    return false;
	return true;
    }
    
    final int method577(int i) {
	if (i != -4)
	    method577(19);
	anInt1097++;
	return anInt1084;
    }
    
    final void method578(int i, int i_2_) {
	if (i == 2) {
	    anInt1093++;
	    if (Class101_Sub1.aClass246_5675 != null) {
		for (Class348_Sub42_Sub8 class348_sub42_sub8
			 = ((Class348_Sub42_Sub8)
			    queue.getFirst());
		     class348_sub42_sub8 != null;
		     class348_sub42_sub8
			 = ((Class348_Sub42_Sub8)
			    queue.next())) {
		    if (!class348_sub42_sub8.method3195(-4)) {
			if ((++((SubNode) class348_sub42_sub8).subnodeKey
			     ^ 0xffffffffffffffffL)
			    < ((long) i_2_ ^ 0xffffffffffffffffL)) {
			    Class348_Sub42_Sub8 class348_sub42_sub8_3_
				= Class101_Sub1.aClass246_5675
				      .method1888(3, class348_sub42_sub8);
			    hashTable.putNode((((Node)
							class348_sub42_sub8)
						       .nodeKey),
						      class348_sub42_sub8_3_);
			    Class59_Sub2_Sub2.method573(class348_sub42_sub8_3_,
							class348_sub42_sub8,
							(byte) 63);
			    class348_sub42_sub8.removeNode();
			    class348_sub42_sub8.removeSubnode();
			}
		    } else if (class348_sub42_sub8.method3193(100) == null) {
			class348_sub42_sub8.removeNode();
			class348_sub42_sub8.removeSubnode();
			anInt1086
			    += (((Class348_Sub42_Sub8) class348_sub42_sub8)
				.anInt9545);
		    }
		}
	    }
	}
    }
    
    Cache(int i) {
	this(i, i);
    }
    
    final Object method579(int i) {
	anInt1094++;
	Class348_Sub42_Sub8 class348_sub42_sub8
	    = (Class348_Sub42_Sub8) hashTable.method3482(0);
	while (class348_sub42_sub8 != null) {
	    Object object = class348_sub42_sub8.method3193(114);
	    if (object != null)
		return object;
	    Class348_Sub42_Sub8 class348_sub42_sub8_4_ = class348_sub42_sub8;
	    class348_sub42_sub8
		= (Class348_Sub42_Sub8) hashTable.method3482(0);
	    class348_sub42_sub8_4_.removeNode();
	    class348_sub42_sub8_4_.removeSubnode();
	    anInt1086
		+= ((Class348_Sub42_Sub8) class348_sub42_sub8_4_).anInt9545;
	}
	if (i > -67)
	    aHa1098 = null;
	return null;
    }
    
    final void put(int i, Object object, long key, int i_5_) {
	try {
	    anInt1092++;
	    if (i_5_ > anInt1084)
		throw new IllegalStateException("s>cs");
	    method586(key);
	    anInt1086 -= i_5_;
	    while ((anInt1086 ^ 0xffffffff) > -1) {
		Class348_Sub42_Sub8 class348_sub42_sub8
		    = ((Class348_Sub42_Sub8)
		       queue.removeFirst());
		method585(class348_sub42_sub8, i ^ ~0x7cfa);
	    }
	    Class348_Sub42_Sub8_Sub2 class348_sub42_sub8_sub2
		= new Class348_Sub42_Sub8_Sub2(object, i_5_);
	    hashTable.putNode(key, class348_sub42_sub8_sub2);
	    if (i != 31902)
		anInt1086 = -106;
	    queue.add(class348_sub42_sub8_sub2);
	    ((SubNode) class348_sub42_sub8_sub2).subnodeKey = 0L;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("jr.E(" + i + ','
					     + (object != null ? "{...}"
						: "null")
					     + ',' + key + ',' + i_5_ + ')'));
	}
    }
    
    final int method581(int i) {
	if (i != -18529)
	    method583(-64L, 37);
	anInt1099++;
	return anInt1086;
    }
    
    final void method582(Object object, long l, byte i) {
	try {
	    if (i >= -92)
		method589(null, -7);
	    anInt1095++;
	    put(31902, object, l, 1);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("jr.B("
					     + (object != null ? "{...}"
						: "null")
					     + ',' + l + ',' + i + ')'));
	}
    }
    
    final Object method583(long key, int i) {
	try {
	    int i_6_ = -59 % ((i - 2) / 47);
	    anInt1085++;
	    Class348_Sub42_Sub8 class348_sub42_sub8 = (Class348_Sub42_Sub8) hashTable.get(key);
	    if (class348_sub42_sub8 == null)
		return null;
	    Object object = class348_sub42_sub8.method3193(86);
	    if (object == null) {
		class348_sub42_sub8.removeNode();
		class348_sub42_sub8.removeSubnode();
		anInt1086 += ((Class348_Sub42_Sub8) class348_sub42_sub8).anInt9545;
		return null;
	    }
	    if (class348_sub42_sub8.method3195(-4)) {
		Class348_Sub42_Sub8_Sub2 class348_sub42_sub8_sub2
		    = new Class348_Sub42_Sub8_Sub2(object,
						   (((Class348_Sub42_Sub8)
						     class348_sub42_sub8)
						    .anInt9545));
		hashTable.putNode((((Node) class348_sub42_sub8).nodeKey), class348_sub42_sub8_sub2);
		queue.add(class348_sub42_sub8_sub2);
		((SubNode) class348_sub42_sub8_sub2).subnodeKey = 0L;
		class348_sub42_sub8.removeNode();
		class348_sub42_sub8.removeSubnode();
	    } else {
		queue.add(class348_sub42_sub8);
		((SubNode) class348_sub42_sub8).subnodeKey = 0L;
	    }
	    return object;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "jr.K(" + key + ',' + i + ')');
	}
    }
    
    public static void method584(byte i) {
	aHa1098 = null;
	int i_7_ = -19 % ((i - 59) / 55);
    }
    
    private final void method585(Class348_Sub42_Sub8 class348_sub42_sub8,
				 int i) {
	anInt1102++;
	if (class348_sub42_sub8 != null) {
	    class348_sub42_sub8.removeNode();
	    class348_sub42_sub8.removeSubnode();
	    anInt1086 += ((Class348_Sub42_Sub8) class348_sub42_sub8).anInt9545;
	}
    }
    
    private final void method586(long key) {
	try {
	    anInt1090++;
	    Class348_Sub42_Sub8 class348_sub42_sub8 = (Class348_Sub42_Sub8) hashTable.get(key);
	    method585(class348_sub42_sub8, -57);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "jr.J(" + key + ')');
	}
    }
    
    final void method587(int i) {
	anInt1096++;
	for (Class348_Sub42_Sub8 class348_sub42_sub8 = (Class348_Sub42_Sub8) queue.getFirst();
	     class348_sub42_sub8 != null;
	     class348_sub42_sub8 = ((Class348_Sub42_Sub8) queue.next())) {
	    if (class348_sub42_sub8.method3195(-4)) {
		class348_sub42_sub8.removeNode();
		class348_sub42_sub8.removeSubnode();
		anInt1086 += ((Class348_Sub42_Sub8) class348_sub42_sub8).anInt9545;
	    }
	}
	if (i >= -75)
	    method587(-97);
    }
    
    final Object method588() {
	anInt1087++;
	Class348_Sub42_Sub8 class348_sub42_sub8 = (Class348_Sub42_Sub8) hashTable.method3484(0);
	while (class348_sub42_sub8 != null) {
	    Object object = class348_sub42_sub8.method3193(119);
	    if (object == null) {
		Class348_Sub42_Sub8 class348_sub42_sub8_9_
		    = class348_sub42_sub8;
		class348_sub42_sub8
		    = (Class348_Sub42_Sub8) hashTable.method3482(0);
		class348_sub42_sub8_9_.removeNode();
		class348_sub42_sub8_9_.removeSubnode();
		anInt1086 += (((Class348_Sub42_Sub8) class348_sub42_sub8_9_)
			      .anInt9545);
	    } else
		return object;
	}
	return null;
    }
    
    static final boolean method589(Class42 class42, int i) {
	anInt1103++;
	if (class42 == null)
	    return false;
	if (i != -4)
	    return false;
	if (!((Class42) class42).aBoolean574)
	    return false;
	if (!class42.method373(Class75.anInterface17_1244, i ^ ~0x2d))
	    return false;
	if (Class158.aClass356_4934
		.get((long) ((Class42) class42).anInt581)
	    != null)
	    return false;
	if (Class348_Sub42_Sub9_Sub1.aClass356_10442
		.get((long) ((Class42) class42).anInt596)
	    != null)
	    return false;
	return true;
    }
    
    final void removeAll(int i) {
	anInt1091++;
	queue.removeAll();
	hashTable.removeAll(i);
	anInt1086 = anInt1084;
    }
    
    Cache(int size, int i_10_) {
	anInt1086 = size;
	anInt1084 = size;
	int j;
	for (j = 1; (j + j ^ 0xffffffff) > (size ^ 0xffffffff) && i_10_ > j; j += j) {
        }
	hashTable = new HashTable(j);
    }
}
