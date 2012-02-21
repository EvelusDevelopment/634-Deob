/* Class348_Sub16_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub16_Sub4 extends Class348_Sub16
{
    private Deque aClass262_8965 = new Deque();
    private Deque aClass262_8966 = new Deque();
    private int anInt8967 = -1;
    private int anInt8968 = 0;
    
    final synchronized void method2880(Class348_Sub16 class348_sub16) {
	class348_sub16.removeNode();
    }
    
    final synchronized void method2819(int i) {
	do {
	    if (anInt8967 < 0) {
		method2884(i);
		break;
	    }
	    if (anInt8968 + i < anInt8967) {
		anInt8968 += i;
		method2884(i);
		break;
	    }
	    int i_0_ = anInt8967 - anInt8968;
	    method2884(i_0_);
	    i -= i_0_;
	    anInt8968 += i_0_;
	    method2885();
	    Class348_Sub30 class348_sub30
		= (Class348_Sub30) aClass262_8966.getFirst(4);
	    synchronized (class348_sub30) {
		int i_1_ = class348_sub30.method3005(this);
		if (i_1_ < 0) {
		    ((Class348_Sub30) class348_sub30).anInt6912 = 0;
		    method2882(class348_sub30);
		} else {
		    ((Class348_Sub30) class348_sub30).anInt6912 = i_1_;
		    method2881(((Node) class348_sub30).nodeParent,
			       class348_sub30);
		}
	    }
	} while (i != 0);
    }
    
    final Class348_Sub16 method2816() {
	return (Class348_Sub16) aClass262_8965.getFirst(4);
    }
    
    private final void method2881(Node class348,
				  Class348_Sub30 class348_sub30) {
	for (/**/;
	     (class348 != ((Deque) aClass262_8966).parent
	      && (((Class348_Sub30) (Class348_Sub30) class348).anInt6912
		  <= ((Class348_Sub30) class348_sub30).anInt6912));
	     class348 = ((Node) class348).nodeParent) {
	    /* empty */
	}
	FileIndexRequest.chain(class348_sub30, class348);
	anInt8967 = ((Class348_Sub30) (Class348_Sub30)
		     (((Node) ((Deque) aClass262_8966).parent)
		      .nodeParent)).anInt6912;
    }
    
    private final void method2882(Class348_Sub30 class348_sub30) {
	class348_sub30.removeNode();
	class348_sub30.method3006();
	Node class348
	    = (((Node) ((Deque) aClass262_8966).parent)
	       .nodeParent);
	if (class348 == ((Deque) aClass262_8966).parent)
	    anInt8967 = -1;
	else
	    anInt8967 = ((Class348_Sub30) (Class348_Sub30) class348).anInt6912;
    }
    
    final synchronized void method2883(Class348_Sub16 class348_sub16) {
	aClass262_8965.addToBack(class348_sub16, -109);
    }
    
    private final void method2884(int i) {
	for (Class348_Sub16 class348_sub16
		 = (Class348_Sub16) aClass262_8965.getFirst(4);
	     class348_sub16 != null;
	     class348_sub16
		 = (Class348_Sub16) aClass262_8965.nextForward((byte) 104))
	    class348_sub16.method2819(i);
    }
    
    private final void method2885() {
	if (anInt8968 > 0) {
	    for (Class348_Sub30 class348_sub30
		     = (Class348_Sub30) aClass262_8966.getFirst(4);
		 class348_sub30 != null;
		 class348_sub30
		     = (Class348_Sub30) aClass262_8966.nextForward((byte) 115))
		((Class348_Sub30) class348_sub30).anInt6912 -= anInt8968;
	    anInt8967 -= anInt8968;
	    anInt8968 = 0;
	}
    }
    
    private final void method2886(int[] is, int i, int i_2_) {
	for (Class348_Sub16 class348_sub16
		 = (Class348_Sub16) aClass262_8965.getFirst(4);
	     class348_sub16 != null;
	     class348_sub16
		 = (Class348_Sub16) aClass262_8965.nextForward((byte) 41))
	    class348_sub16.method2815(is, i, i_2_);
    }
    
    final synchronized int method2887() {
	return aClass262_8965.getSize(0);
    }
    
    final Class348_Sub16 method2818() {
	return (Class348_Sub16) aClass262_8965.nextForward((byte) 95);
    }
    
    final int method2821() {
	return 0;
    }
    
    final synchronized void method2817(int[] is, int i, int i_3_) {
	do {
	    if (anInt8967 < 0) {
		method2886(is, i, i_3_);
		break;
	    }
	    if (anInt8968 + i_3_ < anInt8967) {
		anInt8968 += i_3_;
		method2886(is, i, i_3_);
		break;
	    }
	    int i_4_ = anInt8967 - anInt8968;
	    method2886(is, i, i_4_);
	    i += i_4_;
	    i_3_ -= i_4_;
	    anInt8968 += i_4_;
	    method2885();
	    Class348_Sub30 class348_sub30
		= (Class348_Sub30) aClass262_8966.getFirst(4);
	    synchronized (class348_sub30) {
		int i_5_ = class348_sub30.method3005(this);
		if (i_5_ < 0) {
		    ((Class348_Sub30) class348_sub30).anInt6912 = 0;
		    method2882(class348_sub30);
		} else {
		    ((Class348_Sub30) class348_sub30).anInt6912 = i_5_;
		    method2881(((Node) class348_sub30).nodeParent,
			       class348_sub30);
		}
	    }
	} while (i_3_ != 0);
    }
    
    public Class348_Sub16_Sub4() {
	/* empty */
    }
}
