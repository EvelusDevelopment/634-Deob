/* Class318_Sub1_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

abstract class Class318_Sub1_Sub4 extends Class318_Sub1
{
    static int anInt8757;
    static int anInt8758;
    short aShort8759;
    static int anInt8760;
    static int anInt8761;
    static BigInteger aBigInteger8762 = new BigInteger("10001", 16);
    static int anInt8763;
    static Class279 aClass279_8764;
    static int anInt8765;
    
    final int method2384(Class348_Sub1[] class348_sub1s, int i) {
	anInt8758++;
	int i_0_ = ((Class318_Sub1) this).anInt6377 >> Class362.anInt4459;
	int i_1_ = ((Class318_Sub1) this).anInt6388 >> Class362.anInt4459;
	int i_2_ = -103 / ((i - -14) / 61);
	int i_3_ = 0;
	if ((i_0_ ^ 0xffffffff) == (Class239_Sub25.anInt6111 ^ 0xffffffff))
	    i_3_++;
	else if ((i_0_ ^ 0xffffffff) < (Class239_Sub25.anInt6111 ^ 0xffffffff))
	    i_3_ += 2;
	if (i_1_ == Class285_Sub2.anInt8502)
	    i_3_ += 3;
	else if (i_1_ < Class285_Sub2.anInt8502)
	    i_3_ += 6;
	int i_4_ = Class318_Sub9_Sub2.anIntArray8797[i_3_];
	if ((((Class318_Sub1_Sub4) this).aShort8759 & i_4_) != 0)
	    return this.method2390(class348_sub1s, i_0_, -2, i_1_);
	if (((Class318_Sub1_Sub4) this).aShort8759 == 1
	    && (i_0_ ^ 0xffffffff) < -1)
	    return this.method2390(class348_sub1s, -1 + i_0_, -2, i_1_);
	if (((Class318_Sub1_Sub4) this).aShort8759 == 4
	    && i_0_ <= Class318_Sub7.anInt6451)
	    return this.method2390(class348_sub1s, 1 + i_0_, -2, i_1_);
	if ((((Class318_Sub1_Sub4) this).aShort8759 ^ 0xffffffff) == -9
	    && i_1_ > 0)
	    return this.method2390(class348_sub1s, i_0_, -2, -1 + i_1_);
	if ((((Class318_Sub1_Sub4) this).aShort8759 ^ 0xffffffff) == -3
	    && (Class348_Sub41.anInt7054 ^ 0xffffffff) <= (i_1_ ^ 0xffffffff))
	    return this.method2390(class348_sub1s, i_0_, -2, i_1_ + 1);
	if (((Class318_Sub1_Sub4) this).aShort8759 == 16
	    && (i_0_ ^ 0xffffffff) < -1 && i_1_ <= Class348_Sub41.anInt7054)
	    return this.method2390(class348_sub1s, -1 + i_0_, -2, i_1_ + 1);
	if ((((Class318_Sub1_Sub4) this).aShort8759 ^ 0xffffffff) == -33
	    && Class318_Sub7.anInt6451 >= i_0_
	    && Class348_Sub41.anInt7054 >= i_1_)
	    return this.method2390(class348_sub1s, i_0_ + 1, -2, i_1_ + 1);
	if (((Class318_Sub1_Sub4) this).aShort8759 == 128 && i_0_ > 0
	    && i_1_ > 0)
	    return this.method2390(class348_sub1s, i_0_ - 1, -2, i_1_ - 1);
	if (((Class318_Sub1_Sub4) this).aShort8759 == 64
	    && (Class318_Sub7.anInt6451 ^ 0xffffffff) <= (i_0_ ^ 0xffffffff)
	    && (i_1_ ^ 0xffffffff) < -1)
	    return this.method2390(class348_sub1s, 1 + i_0_, -2, -1 + i_1_);
	throw new RuntimeException("");
    }
    
    static final int method2478(int i) {
	if (i != 1000)
	    return -103;
	anInt8763++;
	boolean bool = false;
	boolean bool_5_ = false;
	boolean bool_6_ = false;
	if (((Signlink) Class348_Sub23_Sub1.signlink).allowsFileOperations
	    && !((Signlink) Class348_Sub23_Sub1.signlink).aBoolean3794) {
	    bool = true;
	    if ((((Class348_Sub4) Class348_Sub40_Sub20.aClass348_Sub4_9264)
		 .anInt6609) < 512
		&& (((Class348_Sub4) Class348_Sub40_Sub20.aClass348_Sub4_9264)
		    .anInt6609) != 0)
		bool = false;
	    if (!Signlink.osName.startsWith("win"))
		bool_5_ = true;
	    else {
		bool_6_ = true;
		bool_5_ = true;
	    }
	}
	if (Class221.aBoolean2881)
	    bool = false;
	if (Class330.aBoolean4117)
	    bool_5_ = false;
	if (Class348_Sub1.aBoolean6558)
	    bool_6_ = false;
	if (!bool && !bool_5_ && !bool_6_)
	    return ArchiveLoader.method2348(-8454);
	int i_7_ = -1;
	int i_8_ = -1;
	int i_9_ = -1;
	if (bool) {
	    try {
		i_7_ = Class239_Sub14.method1781(2, -126, 1000);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	do {
	    if (bool_6_) {
		try {
		    i_9_ = Class239_Sub14.method1781(3, -70, 1000);
		    if ((((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			     .aClass239_Sub25_7271.method1829(i + -33350)
			 ^ 0xffffffff)
			== -4) {
			ToolkitInfo libNode = Class348_Sub8.currentToolkit.getToolkitInfo();
			long driverVersion = (0xffffffffffffL & ((ToolkitInfo) libNode).driverVersion);
			int vendor = ((ToolkitInfo) libNode).vendor;
			if (vendor != 4318) {
			    if (vendor != 4098)
				break;
			} else {
			    bool_5_ = bool_5_ & ((driverVersion ^ 0xffffffffffffffffL) <= -64425238955L);
			    break;
			}
			bool_5_ = bool_5_ & ((driverVersion ^ 0xffffffffffffffffL) <= -60129613780L);
		    }
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	} while (false);
	if (bool_5_) {
	    try {
		i_8_ = Class239_Sub14.method1781(1, i ^ ~0x3ab, 1000);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	if ((i_7_ ^ 0xffffffff) == 0 && i_8_ == -1 && i_9_ == -1)
	    return ArchiveLoader.method2348(i + -9454);
	i_9_ *= 1.1F;
	i_8_ *= 1.1F;
	if ((i_9_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff) && i_8_ < i_7_)
	    return BufferedRasterizer.method454(i_7_, (byte) -116);
	if (i_9_ <= i_8_)
	    return Class62.method600((byte) -59, 1, i_8_);
	return Class62.method600((byte) -80, 3, i_9_);
    }
    
    final boolean method2382(byte i) {
	if (i >= -51)
	    return false;
	anInt8760++;
	return DummyInputstream2.method125((((Class318_Sub1) this).anInt6388
					   >> Class362.anInt4459),
					  (((Class318_Sub1) this).anInt6377
					   >> Class362.anInt4459),
					  ((Class318_Sub1) this).aByte6376,
					  this, (byte) 120);
    }
    
    public static void method2479(int i) {
	if (i == 19424) {
	    aBigInteger8762 = null;
	    aClass279_8764 = null;
	}
    }
    
    Class318_Sub1_Sub4(int i, int i_11_, int i_12_, int i_13_, int i_14_,
		       int i_15_) {
	((Class318_Sub1) this).anInt6377 = i;
	((Class318_Sub1) this).anInt6382 = i_11_;
	((Class318_Sub1) this).aByte6376 = (byte) i_14_;
	((Class318_Sub1) this).anInt6388 = i_12_;
	((Class318_Sub1) this).aByte6381 = (byte) i_13_;
	((Class318_Sub1_Sub4) this).aShort8759 = (short) i_15_;
    }
    
    final boolean method2378(int i) {
	anInt8757++;
	if (i != 0)
	    method2378(-104);
	return (Class99.aBooleanArrayArray1572
		[(-Class239_Sub25.anInt6111
		  + (((Class318_Sub1) this).anInt6377 >> Class362.anInt4459)
		  + Class318_Sub1_Sub4_Sub1.anInt10084)]
		[(Class318_Sub1_Sub4_Sub1.anInt10084 + -Class285_Sub2.anInt8502
		  + (((Class318_Sub1) this).anInt6388
		     >> Class362.anInt4459))]);
    }
    
    static final void method2480(int i) {
	if (i == -1) {
	    anInt8761++;
	    Class348_Sub35.aClass262_6978 = new Deque();
	}
    }
}
