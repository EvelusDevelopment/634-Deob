/* Deque - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

final class Deque
{
    static IndexLoader indexLoader29;
    static int anInt3324;
    static int anInt3325;
    static AbstractFontRasterizer b12fullFontRasterizer;
    static int anInt3327;
    static int anInt3328;
    static int anInt3329;
    static int anInt3330;
    static Object anObject3331;
    static int anInt3332;
    static int anInt3333;
    Node parent = new Node();
    static Class190[][] aClass190ArrayArray3335;
    static int anInt3336;
    static int anInt3337;
    static int anInt3338;
    static int anInt3339;
    static int anInt3340;
    static int anInt3341;
    private Node iterator;
    
    final void method1988(Deque class262_0_, byte i) {
	if (i != -115)
	    getFirst(-53);
	method1989((((Node) ((Deque) this).parent)
		    .nodeParent),
		   false, class262_0_);
	anInt3340++;
    }
    
    private final void method1989(Node class348, boolean bool,
				  Deque class262_1_) {
	do {
	    try {
		anInt3325++;
		Node class348_2_
		    = (((Node) ((Deque) this).parent)
		       .nodeChild);
		((Node) ((Deque) this).parent).nodeChild
		    = ((Node) class348).nodeChild;
		((Node) ((Node) class348).nodeChild)
		    .nodeParent
		    = ((Deque) this).parent;
		if (((Deque) this).parent != class348) {
		    ((Node) class348).nodeChild
			= (((Node) ((Deque) class262_1_).parent)
			   .nodeChild);
		    ((Node) ((Node) class348).nodeChild)
			.nodeParent
			= class348;
		    ((Node) ((Deque) class262_1_).parent)
			.nodeChild
			= class348_2_;
		    ((Node) class348_2_).nodeParent
			= ((Deque) class262_1_).parent;
		}
		if (bool == false)
		    break;
		indexLoader29 = null;
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("uh.K("
						 + (class348 != null ? "{...}"
						    : "null")
						 + ',' + bool + ','
						 + (class262_1_ != null
						    ? "{...}" : "null")
						 + ')'));
	    }
	    break;
	} while (false);
    }
    
    final Node nextForward(byte i) {
	anInt3329++;
	if (i < 29)
	    iterator = null;
	Node class348 = iterator;
	if (((Deque) this).parent == class348) {
	    iterator = null;
	    return null;
	}
	iterator = ((Node) class348).nodeParent;
	return class348;
    }
    
    static final void method1991(float f, float f_3_, float[] fs, int i,
				 int i_4_, boolean bool, int i_5_, int i_6_,
				 int i_7_, int i_8_, float f_9_,
				 float[] fs_10_, int i_11_, int i_12_) {
	do {
	    try {
		anInt3338++;
		i_7_ -= i_6_;
		i -= i_4_;
		i_8_ -= i_11_;
		float f_13_ = fs[2] * (float) i + (fs[1] * (float) i_8_
						   + fs[0] * (float) i_7_);
		float f_14_ = ((float) i_7_ * fs[3] + (float) i_8_ * fs[4]
			       + (float) i * fs[5]);
		float f_15_ = fs[8] * (float) i + (fs[6] * (float) i_7_
						   + (float) i_8_ * fs[7]);
		float f_16_;
		float f_17_;
		if ((i_12_ ^ 0xffffffff) != -1) {
		    if ((i_12_ ^ 0xffffffff) == -2) {
			f_17_ = 0.5F + (f_15_ + f);
			f_16_ = 0.5F + (f_3_ + f_13_);
		    } else if ((i_12_ ^ 0xffffffff) != -3) {
			if (i_12_ != 3) {
			    if ((i_12_ ^ 0xffffffff) == -5) {
				f_16_ = f_15_ + f + 0.5F;
				f_17_ = -f_14_ + f_9_ + 0.5F;
			    } else {
				f_16_ = 0.5F + (f + -f_15_);
				f_17_ = -f_14_ + f_9_ + 0.5F;
			    }
			} else {
			    f_17_ = -f_14_ + f_9_ + 0.5F;
			    f_16_ = f_13_ + f_3_ + 0.5F;
			}
		    } else {
			f_16_ = 0.5F + (-f_13_ + f_3_);
			f_17_ = -f_14_ + f_9_ + 0.5F;
		    }
		} else {
		    f_16_ = 0.5F + (f_3_ + f_13_);
		    f_17_ = -f_15_ + f + 0.5F;
		}
		if (i_5_ == 1) {
		    float f_18_ = f_16_;
		    f_16_ = -f_17_;
		    f_17_ = f_18_;
		} else if ((i_5_ ^ 0xffffffff) != -3) {
		    if (i_5_ == 3) {
			float f_19_ = f_16_;
			f_16_ = f_17_;
			f_17_ = -f_19_;
		    }
		} else {
		    f_17_ = -f_17_;
		    f_16_ = -f_16_;
		}
		fs_10_[1] = f_17_;
		fs_10_[0] = f_16_;
		if (bool == false)
		    break;
		method1991(0.31271333F, 1.5829445F, null, -17, 88, true, -70,
			   -107, 8, 5, -0.347415F, null, -24, -19);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("uh.B(" + f + ',' + f_3_ + ','
						 + (fs != null ? "{...}"
						    : "null")
						 + ',' + i + ',' + i_4_ + ','
						 + bool + ',' + i_5_ + ','
						 + i_6_ + ',' + i_7_ + ','
						 + i_8_ + ',' + f_9_ + ','
						 + (fs_10_ != null ? "{...}"
						    : "null")
						 + ',' + i_11_ + ',' + i_12_
						 + ')'));
	    }
	    break;
	} while (false);
    }
    
    static final void method1992(Class318_Sub1 class318_sub1, int i, int i_20_,
				 int i_21_) {
	if (i_20_ < Class318_Sub7.anInt6451) {
	    Class357 class357
		= Message.aClass357ArrayArrayArray2029[i][i_20_ + 1][i_21_];
	    if (class357 != null
		&& ((Class357) class357).aClass318_Sub1_Sub1_4402 != null
		&& ((Class357) class357).aClass318_Sub1_Sub1_4402
		       .method2388(-107))
		class318_sub1.method2380(Class9.aHa171, 0, true,
					 (((Class357) class357)
					  .aClass318_Sub1_Sub1_4402),
					 0, (byte) -116, Class270.anInt3465);
	}
	if (i_21_ < Class318_Sub7.anInt6451) {
	    Class357 class357
		= Message.aClass357ArrayArrayArray2029[i][i_20_][i_21_ + 1];
	    if (class357 != null
		&& ((Class357) class357).aClass318_Sub1_Sub1_4402 != null
		&& ((Class357) class357).aClass318_Sub1_Sub1_4402
		       .method2388(-92))
		class318_sub1.method2380(Class9.aHa171, 0, true,
					 (((Class357) class357)
					  .aClass318_Sub1_Sub1_4402),
					 Class270.anInt3465, (byte) -128, 0);
	}
	if (i_20_ < Class318_Sub7.anInt6451
	    && i_21_ < Class348_Sub41.anInt7054) {
	    Class357 class357 = (Message.aClass357ArrayArrayArray2029[i]
				 [i_20_ + 1][i_21_ + 1]);
	    if (class357 != null
		&& ((Class357) class357).aClass318_Sub1_Sub1_4402 != null
		&& ((Class357) class357).aClass318_Sub1_Sub1_4402
		       .method2388(-107))
		class318_sub1.method2380(Class9.aHa171, 0, true,
					 (((Class357) class357)
					  .aClass318_Sub1_Sub1_4402),
					 Class270.anInt3465, (byte) -117,
					 Class270.anInt3465);
	}
	if (i_20_ < Class318_Sub7.anInt6451 && i_21_ > 0) {
	    Class357 class357 = (Message.aClass357ArrayArrayArray2029[i]
				 [i_20_ + 1][i_21_ - 1]);
	    if (class357 != null
		&& ((Class357) class357).aClass318_Sub1_Sub1_4402 != null
		&& ((Class357) class357).aClass318_Sub1_Sub1_4402
		       .method2388(-90))
		class318_sub1.method2380(Class9.aHa171, 0, true,
					 (((Class357) class357)
					  .aClass318_Sub1_Sub1_4402),
					 -Class270.anInt3465, (byte) -116,
					 Class270.anInt3465);
	}
    }
    
    final Node getLast(int i) {
	anInt3336++;
	Node class348
	    = ((Node) ((Deque) this).parent).nodeChild;
	if (((Deque) this).parent == class348) {
	    iterator = null;
	    return null;
	}
	iterator = ((Node) class348).nodeChild;
	return class348;
    }
    
    public static void method1994(int i) {
	aClass190ArrayArray3335 = null;
	anObject3331 = null;
	if (i != -13722)
	    createDirect3dToolkit(-104, 106, null, null);
	indexLoader29 = null;
	b12fullFontRasterizer = null;
    }
    
    final Node getFirst(int i) {
	if (i != 4)
	    addToBack(null, -30);
	anInt3332++;
	Node class348 = ((Node) ((Deque) this).parent).nodeParent;
	if (class348 == ((Deque) this).parent) {
	    iterator = null;
	    return null;
        }
	iterator = ((Node) class348).nodeParent;
	return class348;
    }
    
    final void removeAll(int i) {
	if (i > 97) {
	    anInt3339++;
	    for (;;) {
		Node class348
		    = (((Node) ((Deque) this).parent)
		       .nodeParent);
		if (((Deque) this).parent == class348)
		    break;
		class348.removeNode();
	    }
	    iterator = null;
	}
    }
    
    final Node removeFirst(int i) {
	anInt3341++;
	if (i != 8)
	    aClass190ArrayArray3335 = null;
	Node class348 = ((Node) ((Deque) this).parent).nodeParent;
	if (((Deque) this).parent == class348)
	    return null;
	class348.removeNode();
	return class348;
    }
    
    final int getSize(int i) {
	anInt3333++;
	int i_22_ = i;
	Node class348
	    = ((Node) ((Deque) this).parent).nodeParent;
	while (class348 != ((Deque) this).parent) {
	    class348 = ((Node) class348).nodeParent;
	    i_22_++;
	}
	return i_22_;
    }
    
    final void addToFront(Node class348, int i) {
	if (((Node) class348).nodeChild != null)
	    class348.removeNode();
	anInt3328++;
	((Node) class348).nodeParent
	    = ((Deque) this).parent;
	((Node) class348).nodeChild
	    = ((Node) ((Deque) this).parent).nodeChild;
	((Node) ((Node) class348).nodeChild).nodeParent
	    = class348;
	if (i != -20180)
	    addToBack(null, -94);
	((Node) ((Node) class348).nodeParent).nodeChild
	    = class348;
    }
    
    static final AbstractToolkit createDirect3dToolkit(int i, int i_23_, Canvas canvas, d var_d) {
	try {
	    anInt3324++;
	    if (i != 3)
		method1992(null, -40, 69, -1);
	    return new DirectxToolkit(canvas, var_d, i_23_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("uh.D(" + i + ',' + i_23_ + ','
					     + (canvas != null ? "{...}"
						: "null")
					     + ','
					     + (var_d != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    final void addToBack(Node class348, int i) {
	anInt3330++;
	if (((Node) class348).nodeChild != null)
	    class348.removeNode();
	((Node) class348).nodeChild
	    = ((Deque) this).parent;
	((Node) class348).nodeParent
	    = ((Node) ((Deque) this).parent).nodeParent;
	if (i > -89)
	    b12fullFontRasterizer = null;
	((Node) ((Node) class348).nodeChild).nodeParent
	    = class348;
	((Node) ((Node) class348).nodeParent).nodeChild
	    = class348;
    }
    
    final boolean isEnd(byte i) {
	anInt3327++;
	if (((Deque) this).parent != ((Node) ((Deque) this).parent).nodeParent)
	    return false;
	return true;
    }
    
    final Node nextBack(int i) {
	anInt3337++;
	Node class348 = iterator;
	if (class348 == ((Deque) this).parent) {
	    iterator = null;
	    return null;
	}
	int i_24_ = -111 / ((i - -88) / 38);
	iterator = ((Node) class348).nodeChild;
	return class348;
    }
    
    public Deque() {
	((Node) ((Deque) this).parent).nodeChild
	    = ((Deque) this).parent;
	((Node) ((Deque) this).parent).nodeParent
	    = ((Deque) this).parent;
    }
}
