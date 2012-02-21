/* Model - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.util.Random;

final class Model
{
    int[] anIntArray1816;
    int triangles;
    int anInt1818;
    static int anInt1819;
    byte[] aByteArray1820;
    int anInt1821;
    short[] aShortArray1822;
    byte[] aByteArray1823;
    int[] anIntArray1824;
    short[] aShortArray1825;
    static int anInt1826;
    static int anInt1827;
    static int anInt1828;
    short[] aShortArray1829;
    int anInt1830 = 12;
    static int anInt1831;
    ModelPolygon[] polygons;
    byte[] aByteArray1833;
    byte[] polyAlphas;
    short[] aShortArray1835;
    int vertices = 0;
    static int anInt1837;
    static int anInt1838;
    byte[] aByteArray1839;
    static int anInt1840;
    int[] vertexX;
    short[] aShortArray1842;
    byte[] aByteArray1843;
    int[] anIntArray1844;
    static int anInt1845;
    Class129[] aClass129Array1846;
    int[] vertexY;
    static IndexLoader aClass45_1848;
    short[] aShortArray1849;
    static int anInt1850;
    byte aByte1851;
    int[] vertexZ;
    byte[] aByteArray1853;
    static int anInt1854;
    short[] aShortArray1855;
    short[] aShortArray1856;
    int[] anIntArray1857;
    static int anInt1858;
    int[] anIntArray1859;
    static int anInt1860;
    static int anInt1861;
    short[] triangleColors;
    short[] aShortArray1863;
    static int anInt1864;
    int[] anIntArray1865;
    Class342[] aClass342Array1866;
    int[] anIntArray1867;
    int[] vgroups;
    static int anInt1869;
    
    final void method1092(int i, int i_0_) {
	anInt1819++;
	for (int i_1_ = 0; ((Model) this).vertices > i_1_; i_1_++) {
	    ((Model) this).vertexX[i_1_] <<= i;
	    ((Model) this).vertexY[i_1_] <<= i;
	    ((Model) this).vertexZ[i_1_] <<= i;
	}
	if (i_0_ <= 39)
	    method1107(40, -7, -80, -24);
	if ((((Model) this).anInt1818 ^ 0xffffffff) < -1
	    && ((Model) this).anIntArray1859 != null) {
	    for (int i_2_ = 0; i_2_ < ((Model) this).anIntArray1859.length;
		 i_2_++) {
		((Model) this).anIntArray1859[i_2_] <<= i;
		((Model) this).anIntArray1816[i_2_] <<= i;
		if ((((Model) this).aByteArray1823[i_2_] ^ 0xffffffff)
		    != -2)
		    ((Model) this).anIntArray1844[i_2_] <<= i;
	    }
	}
    }
    
    final int[][] getTriangleGroups() {
	anInt1854++;
	int[] groupCount = new int[256];
	int maximumGroup = 0;
	for (int triangle = 0; ((Model) this).polygons.length > triangle; triangle++) {
	    int group = (((ModelPolygon) ((Model) this).polygons[triangle]).tGroup);
	    if (group >= 0) {
		groupCount[group]++;
		if (maximumGroup < group)
		    maximumGroup = group;
	    }
	}
	int[][] groups = new int[1 + maximumGroup][];
	for (int i_7_ = 0; (maximumGroup ^ 0xffffffff) <= (i_7_ ^ 0xffffffff); i_7_++) {
	    groups[i_7_] = new int[groupCount[i_7_]];
	    groupCount[i_7_] = 0;
	}
	for (int triangle = 0; triangle < ((Model) this).polygons.length; triangle++) {
	    int group = (((ModelPolygon) ((Model) this).polygons[triangle]).tGroup);
	    if (group >= 0)
		groups[group][groupCount[group]++] = triangle;
	}
	return groups;
    }
    
    final int[][] method1094(byte i) {
	anInt1864++;
	int[] is = new int[256];
	int i_10_ = 0;
	for (int i_11_ = 0; i_11_ < ((Model) this).triangles; i_11_++) {
	    int i_12_ = ((Model) this).anIntArray1824[i_11_];
	    if ((i_12_ ^ 0xffffffff) <= -1) {
		if (i_10_ < i_12_)
		    i_10_ = i_12_;
		is[i_12_]++;
	    }
	}
	int[][] is_13_ = new int[i_10_ - -1][];
	if (i <= 13)
	    method1102(-65, (byte) -8, (byte) 94, (short) -89, (byte) 6,
		       (short) -117, 21, (byte) 21, -31);
	for (int i_14_ = 0; (i_14_ ^ 0xffffffff) >= (i_10_ ^ 0xffffffff);
	     i_14_++) {
	    is_13_[i_14_] = new int[is[i_14_]];
	    is[i_14_] = 0;
	}
	for (int i_15_ = 0;
	     (((Model) this).triangles ^ 0xffffffff) < (i_15_ ^ 0xffffffff);
	     i_15_++) {
	    int i_16_ = ((Model) this).anIntArray1824[i_15_];
	    if ((i_16_ ^ 0xffffffff) <= -1)
		is_13_[i_16_][is[i_16_]++] = i_15_;
	}
	return is_13_;
    }
    
    final void method1095(short i, int i_17_, short i_18_) {
	anInt1869++;
	if (((Model) this).aShortArray1822 != null) {
	    for (int i_19_ = i_17_; ((Model) this).triangles > i_19_;
		 i_19_++) {
		if (i == ((Model) this).aShortArray1822[i_19_])
		    ((Model) this).aShortArray1822[i_19_] = i_18_;
	    }
	}
    }
    
    public static void method1096(int i) {
	if (i >= 88)
	    aClass45_1848 = null;
    }
    
    static final int method1097(byte i, int i_20_, Random random) {
	anInt1861++;
	if (i_20_ <= 0)
	    throw new IllegalArgumentException();
	if (Class192.method1436(-19, i_20_))
	    return (int) ((long) i_20_ * (0xffffffffL
					  & (long) random.nextInt())
			  >> -945125600);
	int i_21_ = -2147483648 + -(int) (4294967296L % (long) i_20_);
	if (i < 78)
	    aClass45_1848 = null;
	int i_22_;
	do
	    i_22_ = random.nextInt();
	while ((i_21_ ^ 0xffffffff) >= (i_22_ ^ 0xffffffff));
	return Class350.method3452(i_22_, (byte) -15, i_20_);
    }
    
    final void recolorTriangles(short i, byte i_23_, short i_24_) {
	if (i_23_ == 126) {
	    for (int i_25_ = 0; i_25_ < ((Model) this).triangles; i_25_++) {
		if ((((Model) this).triangleColors[i_25_] ^ 0xffffffff) == (i ^ 0xffffffff))
		    ((Model) this).triangleColors[i_25_] = i_24_;
	    }
	    anInt1826++;
	}
    }
    
    final void method1099(byte i, int i_26_, int i_27_, int i_28_) {
	int i_29_ = 0;
	int i_30_ = 19 % ((-40 - i) / 33);
	for (/**/;
	     (i_29_ ^ 0xffffffff) > (((Model) this).vertices ^ 0xffffffff);
	     i_29_++) {
	    ((Model) this).vertexX[i_29_] += i_27_;
	    ((Model) this).vertexY[i_29_] += i_28_;
	    ((Model) this).vertexZ[i_29_] += i_26_;
	}
	anInt1840++;
    }
    
    final int[][] getVertexGroups(boolean bool, int i) {
	anInt1845++;
	int[] is = new int[256];
	int maximumGroup = 0;
	int amountVertices = (!bool ? ((Model) this).anInt1821
		     : ((Model) this).vertices);
	for (int vertex = 0; vertex < amountVertices; vertex++) {
	    int group = ((Model) this).vgroups[vertex];
	    if ((group ^ 0xffffffff) <= -1) {
		is[group]++;
		if (maximumGroup < group)
		    maximumGroup = group;
	    }
	}
	int[][] vertexGroups = new int[1 + maximumGroup][];
	for (int group = 0; (maximumGroup ^ 0xffffffff) <= (group ^ 0xffffffff); group++) {
	    vertexGroups[group] = new int[is[group]];
	    is[group] = 0;
	}
	for (int vertex = 0; amountVertices > vertex; vertex++) {
	    int group = ((Model) this).vgroups[vertex];
	    if ((group ^ 0xffffffff) <= -1)
		vertexGroups[group][is[group]++] = vertex;
	}
	if (i > -14)
	    recolorTriangles((short) 9, (byte) 80, (short) -118);
	return vertexGroups;
    }
    
    final int method1101(int i, int i_39_, int i_40_, int i_41_) {
	anInt1827++;
	int i_42_ = 0;
	int i_43_ = 120 / ((38 - i_41_) / 61);
	for (/**/; i_42_ < ((Model) this).vertices; i_42_++) {
	    if (((Model) this).vertexX[i_42_] == i_40_
		&& i == ((Model) this).vertexY[i_42_]
		&& ((Model) this).vertexZ[i_42_] == i_39_)
		return i_42_;
	}
	((Model) this).vertexX[((Model) this).vertices] = i_40_;
	((Model) this).vertexY[((Model) this).vertices] = i;
	((Model) this).vertexZ[((Model) this).vertices] = i_39_;
	((Model) this).anInt1821 = 1 + ((Model) this).vertices;
	return ((Model) this).vertices++;
    }
    
    final int method1102(int i, byte i_44_, byte i_45_, short i_46_,
			 byte i_47_, short i_48_, int i_49_, byte i_50_,
			 int i_51_) {
	((Model) this).aShortArray1863[((Model) this).triangles]
	    = (short) i;
	anInt1860++;
	((Model) this).aShortArray1835[((Model) this).triangles]
	    = (short) i_49_;
	((Model) this).aShortArray1855[((Model) this).triangles]
	    = (short) i_51_;
	if (i_47_ < 30)
	    return -92;
	((Model) this).aByteArray1843[((Model) this).triangles] = i_44_;
	((Model) this).aByteArray1820[((Model) this).triangles] = i_45_;
	((Model) this).triangleColors[((Model) this).triangles] = i_48_;
	((Model) this).polyAlphas[((Model) this).triangles] = i_50_;
	((Model) this).aShortArray1822[((Model) this).triangles] = i_46_;
	return ((Model) this).triangles++;
    }
    
    private final void initializeType1(int i, byte[] is) {
	anInt1831++;
	boolean bool = false;
	boolean bool_52_ = false;
	ByteBuffer class348_sub49 = new ByteBuffer(is);
	ByteBuffer class348_sub49_53_ = new ByteBuffer(is);
	ByteBuffer class348_sub49_54_ = new ByteBuffer(is);
	ByteBuffer class348_sub49_55_ = new ByteBuffer(is);
	ByteBuffer class348_sub49_56_ = new ByteBuffer(is);
	((ByteBuffer) class348_sub49).position = -18 + is.length;
	((Model) this).vertices
	    = class348_sub49.getShort();
	((Model) this).triangles = class348_sub49.getShort();
	((Model) this).anInt1818 = class348_sub49.getUByte();
	int i_57_ = class348_sub49.getUByte();
	int i_58_ = class348_sub49.getUByte();
	int i_59_ = class348_sub49.getUByte();
	int i_60_ = class348_sub49.getUByte();
	int i_61_ = class348_sub49.getUByte();
	int i_62_ = class348_sub49.getShort();
	int i_63_ = class348_sub49.getShort();
	int i_64_ = class348_sub49.getShort();
	int i_65_ = class348_sub49.getShort();
	int i_66_ = 0;
	int i_67_ = i_66_;
	i_66_ += ((Model) this).vertices;
	int i_68_ = i_66_;
	i_66_ += ((Model) this).triangles;
	int i_69_ = i_66_;
	if ((i_58_ ^ 0xffffffff) == -256)
	    i_66_ += ((Model) this).triangles;
	int i_70_ = i_66_;
	if ((i_60_ ^ 0xffffffff) == -2)
	    i_66_ += ((Model) this).triangles;
	int i_71_ = i_66_;
	if (i_57_ == 1)
	    i_66_ += ((Model) this).triangles;
	int i_72_ = i_66_;
	if (i_61_ == 1)
	    i_66_ += ((Model) this).vertices;
	int i_73_ = i_66_;
	if (i == i_59_)
	    i_66_ += ((Model) this).triangles;
	int i_74_ = i_66_;
	i_66_ += i_65_;
	int i_75_ = i_66_;
	i_66_ += ((Model) this).triangles * 2;
	int i_76_ = i_66_;
	i_66_ += ((Model) this).anInt1818 * 6;
	int i_77_ = i_66_;
	i_66_ += i_62_;
	int i_78_ = i_66_;
	i_66_ += i_63_;
	int i_79_ = i_66_;
	((Model) this).triangleColors
	    = new short[((Model) this).triangles];
	if ((i_58_ ^ 0xffffffff) == -256)
	    ((Model) this).aByteArray1839
		= new byte[((Model) this).triangles];
	else
	    ((Model) this).aByte1851 = (byte) i_58_;
	if (i_61_ == 1)
	    ((Model) this).vgroups
		= new int[((Model) this).vertices];
	if (i_59_ == 1)
	    ((Model) this).polyAlphas
		= new byte[((Model) this).triangles];
	((Model) this).aShortArray1863
	    = new short[((Model) this).triangles];
	if ((i_57_ ^ 0xffffffff) == -2) {
	    ((Model) this).aShortArray1822
		= new short[((Model) this).triangles];
	    ((Model) this).aByteArray1820
		= new byte[((Model) this).triangles];
	    ((Model) this).aByteArray1843
		= new byte[((Model) this).triangles];
	}
	((Model) this).vertexY
	    = new int[((Model) this).vertices];
	if ((i_60_ ^ 0xffffffff) == -2)
	    ((Model) this).anIntArray1824
		= new int[((Model) this).triangles];
	((Model) this).aShortArray1855
	    = new short[((Model) this).triangles];
	if (((Model) this).anInt1818 > 0) {
	    ((Model) this).aByteArray1823
		= new byte[((Model) this).anInt1818];
	    ((Model) this).aShortArray1829
		= new short[((Model) this).anInt1818];
	    ((Model) this).aShortArray1849
		= new short[((Model) this).anInt1818];
	    ((Model) this).aShortArray1825
		= new short[((Model) this).anInt1818];
	}
	((Model) this).aShortArray1835
	    = new short[((Model) this).triangles];
	((Model) this).vertexZ
	    = new int[((Model) this).vertices];
	((Model) this).vertexX
	    = new int[((Model) this).vertices];
	((ByteBuffer) class348_sub49).position = i_67_;
	i_66_ += i_64_;
	((ByteBuffer) class348_sub49_53_).position = i_77_;
	((ByteBuffer) class348_sub49_54_).position = i_78_;
	((ByteBuffer) class348_sub49_55_).position = i_79_;
	((ByteBuffer) class348_sub49_56_).position = i_72_;
	int curx = 0;
	int cury = 0;
	int curz = 0;
	for (int i_83_ = 0; i_83_ < ((Model) this).vertices; i_83_++) {
	    int flag = class348_sub49.getUByte();
	    int dx = 0;
	    if ((flag & 0x1) != 0)
		dx = class348_sub49_53_.method3362((byte) 77);
	    int dy = 0;
	    if ((flag & 0x2 ^ 0xffffffff) != -1)
		dy = class348_sub49_54_.method3362((byte) 77);
	    int dz = 0;
	    if ((0x4 & flag) != 0)
		dz = class348_sub49_55_.method3362((byte) 77);
	    ((Model) this).vertexX[i_83_] = dx + curx;
	    ((Model) this).vertexY[i_83_] = cury + dy;
	    ((Model) this).vertexZ[i_83_] = curz + dz;
	    curz = ((Model) this).vertexZ[i_83_];
	    cury = ((Model) this).vertexY[i_83_];
	    curx = ((Model) this).vertexX[i_83_];
	    if (i_61_ == 1)
		((Model) this).vgroups[i_83_]
		    = class348_sub49_56_
			  .getUByte();
	}
	((ByteBuffer) class348_sub49).position = i_75_;
	((ByteBuffer) class348_sub49_53_).position = i_71_;
	((ByteBuffer) class348_sub49_54_).position = i_69_;
	((ByteBuffer) class348_sub49_55_).position = i_73_;
	((ByteBuffer) class348_sub49_56_).position = i_70_;
	for (int i_88_ = 0; i_88_ < ((Model) this).triangles; i_88_++) {
	    ((Model) this).triangleColors[i_88_]
		= (short) class348_sub49.getShort();
	    if ((i_57_ ^ 0xffffffff) == -2) {
		int i_89_ = class348_sub49_53_.getUByte();
		if ((0x1 & i_89_) != 1)
		    ((Model) this).aByteArray1843[i_88_] = (byte) 0;
		else {
		    ((Model) this).aByteArray1843[i_88_] = (byte) 1;
		    bool = true;
		}
		if ((i_89_ & 0x2) != 2) {
		    ((Model) this).aByteArray1820[i_88_] = (byte) -1;
		    ((Model) this).aShortArray1822[i_88_] = (short) -1;
		} else {
		    ((Model) this).aByteArray1820[i_88_]
			= (byte) (i_89_ >> -231090654);
		    ((Model) this).aShortArray1822[i_88_]
			= ((Model) this).triangleColors[i_88_];
		    ((Model) this).triangleColors[i_88_] = (short) 127;
		    if ((((Model) this).aShortArray1822[i_88_] ^ 0xffffffff)
			!= 0)
			bool_52_ = true;
		}
	    }
	    if ((i_58_ ^ 0xffffffff) == -256)
		((Model) this).aByteArray1839[i_88_]
		    = class348_sub49_54_.getByte();
	    if ((i_59_ ^ 0xffffffff) == -2)
		((Model) this).polyAlphas[i_88_]
		    = class348_sub49_55_
			  .getByte();
	    if (i_60_ == 1)
		((Model) this).anIntArray1824[i_88_]
		    = class348_sub49_56_.getUByte();
	}
	((ByteBuffer) class348_sub49).position = i_74_;
	((Model) this).anInt1821 = -1;
	((ByteBuffer) class348_sub49_53_).position = i_68_;
	short i_90_ = 0;
	short i_91_ = 0;
	short i_92_ = 0;
	int i_93_ = 0;
	for (int i_94_ = 0;
	     (((Model) this).triangles ^ 0xffffffff) < (i_94_ ^ 0xffffffff);
	     i_94_++) {
	    int i_95_ = class348_sub49_53_.getUByte();
	    if ((i_95_ ^ 0xffffffff) == -2) {
		i_90_ = (short) (i_93_ + class348_sub49.method3362((byte) 77));
		i_93_ = i_90_;
		i_91_ = (short) (class348_sub49.method3362((byte) 77) + i_93_);
		i_93_ = i_91_;
		i_92_ = (short) (i_93_ + class348_sub49.method3362((byte) 77));
		((Model) this).aShortArray1863[i_94_] = i_90_;
		i_93_ = i_92_;
		((Model) this).aShortArray1835[i_94_] = i_91_;
		((Model) this).aShortArray1855[i_94_] = i_92_;
		if ((((Model) this).anInt1821 ^ 0xffffffff)
		    > (i_90_ ^ 0xffffffff))
		    ((Model) this).anInt1821 = i_90_;
		if ((i_91_ ^ 0xffffffff)
		    < (((Model) this).anInt1821 ^ 0xffffffff))
		    ((Model) this).anInt1821 = i_91_;
		if ((i_92_ ^ 0xffffffff)
		    < (((Model) this).anInt1821 ^ 0xffffffff))
		    ((Model) this).anInt1821 = i_92_;
	    }
	    if ((i_95_ ^ 0xffffffff) == -3) {
		i_91_ = i_92_;
		i_92_ = (short) (class348_sub49.method3362((byte) 77) + i_93_);
		((Model) this).aShortArray1863[i_94_] = i_90_;
		i_93_ = i_92_;
		((Model) this).aShortArray1835[i_94_] = i_91_;
		((Model) this).aShortArray1855[i_94_] = i_92_;
		if (i_92_ > ((Model) this).anInt1821)
		    ((Model) this).anInt1821 = i_92_;
	    }
	    if (i_95_ == 3) {
		i_90_ = i_92_;
		i_92_ = (short) (class348_sub49.method3362((byte) 77) + i_93_);
		i_93_ = i_92_;
		((Model) this).aShortArray1863[i_94_] = i_90_;
		((Model) this).aShortArray1835[i_94_] = i_91_;
		((Model) this).aShortArray1855[i_94_] = i_92_;
		if (((Model) this).anInt1821 < i_92_)
		    ((Model) this).anInt1821 = i_92_;
	    }
	    if (i_95_ == 4) {
		short i_96_ = i_90_;
		i_90_ = i_91_;
		i_92_ = (short) (class348_sub49.method3362((byte) 77) + i_93_);
		i_91_ = i_96_;
		i_93_ = i_92_;
		((Model) this).aShortArray1863[i_94_] = i_90_;
		((Model) this).aShortArray1835[i_94_] = i_91_;
		((Model) this).aShortArray1855[i_94_] = i_92_;
		if (((Model) this).anInt1821 < i_92_)
		    ((Model) this).anInt1821 = i_92_;
	    }
	}
	((Model) this).anInt1821++;
	((ByteBuffer) class348_sub49).position = i_76_;
	for (int i_97_ = 0;
	     (((Model) this).anInt1818 ^ 0xffffffff) < (i_97_ ^ 0xffffffff);
	     i_97_++) {
	    ((Model) this).aByteArray1823[i_97_] = (byte) 0;
	    ((Model) this).aShortArray1829[i_97_]
		= (short) class348_sub49.getShort();
	    ((Model) this).aShortArray1849[i_97_]
		= (short) class348_sub49.getShort();
	    ((Model) this).aShortArray1825[i_97_]
		= (short) class348_sub49.getShort();
	}
	if (((Model) this).aByteArray1820 != null) {
	    boolean bool_98_ = false;
	    for (int i_99_ = 0; i_99_ < ((Model) this).triangles; i_99_++) {
		int i_100_ = ((Model) this).aByteArray1820[i_99_] & 0xff;
		if ((i_100_ ^ 0xffffffff) != -256) {
		    if (((0xffff & ((Model) this).aShortArray1829[i_100_])
			 != ((Model) this).aShortArray1863[i_99_])
			|| (((Model) this).aShortArray1835[i_99_]
			    != (0xffff
				& ((Model) this).aShortArray1849[i_100_]))
			|| ((0xffff
			     & ((Model) this).aShortArray1825[i_100_])
			    != ((Model) this).aShortArray1855[i_99_]))
			bool_98_ = true;
		    else
			((Model) this).aByteArray1820[i_99_] = (byte) -1;
		}
	    }
	    if (!bool_98_)
		((Model) this).aByteArray1820 = null;
	}
	if (!bool)
	    ((Model) this).aByteArray1843 = null;
	if (!bool_52_)
	    ((Model) this).aShortArray1822 = null;
    }
    
    private final int method1104(Model class124_101_, int i, int i_102_,
				 short i_103_) {
	anInt1858++;
	int i_104_ = ((Model) class124_101_).vertexX[i_102_];
	int i_105_ = ((Model) class124_101_).vertexY[i_102_];
	int i_106_ = ((Model) class124_101_).vertexZ[i_102_];
	for (int i_107_ = i; i_107_ < ((Model) this).vertices; i_107_++) {
	    if (((Model) this).vertexX[i_107_] == i_104_
		&& i_105_ == ((Model) this).vertexY[i_107_]
		&& ((((Model) this).vertexZ[i_107_] ^ 0xffffffff)
		    == (i_106_ ^ 0xffffffff))) {
		((Model) this).aShortArray1842[i_107_]
		    = (short) Class273.method2057((((Model) this)
						   .aShortArray1842[i_107_]),
						  i_103_);
		return i_107_;
	    }
	}
	((Model) this).vertexX[((Model) this).vertices] = i_104_;
	((Model) this).vertexY[((Model) this).vertices] = i_105_;
	((Model) this).vertexZ[((Model) this).vertices] = i_106_;
	((Model) this).aShortArray1842[((Model) this).vertices]
	    = i_103_;
	((Model) this).vgroups[((Model) this).vertices]
	    = (((Model) class124_101_).vgroups != null
	       ? ((Model) class124_101_).vgroups[i_102_] : -1);
	return ((Model) this).vertices++;
    }
    
    final byte method1105(int i, byte i_108_, byte i_109_, short i_110_,
			  short i_111_, byte i_112_, short i_113_,
			  short i_114_, short i_115_, short i_116_) {
	anInt1838++;
	if (((Model) this).anInt1818 >= 255)
	    throw new IllegalStateException();
	((Model) this).aByteArray1823[((Model) this).anInt1818]
	    = (byte) 3;
	((Model) this).aShortArray1829[((Model) this).anInt1818]
	    = i_110_;
	((Model) this).aShortArray1849[((Model) this).anInt1818]
	    = i_114_;
	((Model) this).aShortArray1825[((Model) this).anInt1818]
	    = i_113_;
	((Model) this).anIntArray1859[((Model) this).anInt1818] = i_115_;
	((Model) this).anIntArray1816[((Model) this).anInt1818] = i_111_;
	((Model) this).anIntArray1844[((Model) this).anInt1818] = i_116_;
	((Model) this).aByteArray1833[((Model) this).anInt1818] = i_108_;
	((Model) this).aByteArray1853[((Model) this).anInt1818] = i_112_;
	((Model) this).anIntArray1867[((Model) this).anInt1818] = i_109_;
	int i_117_ = 93 % ((i - -19) / 56);
	return (byte) ((Model) this).anInt1818++;
    }
    
    private final void initializeType0(byte[] is, byte i) {
	anInt1828++;
	ByteBuffer class348_sub49 = new ByteBuffer(is);
	ByteBuffer class348_sub49_118_ = new ByteBuffer(is);
	ByteBuffer class348_sub49_119_ = new ByteBuffer(is);
	ByteBuffer class348_sub49_120_ = new ByteBuffer(is);
	ByteBuffer class348_sub49_121_ = new ByteBuffer(is);
	ByteBuffer class348_sub49_122_ = new ByteBuffer(is);
	ByteBuffer class348_sub49_123_ = new ByteBuffer(is);
	((ByteBuffer) class348_sub49).position = -23 + is.length;
	((Model) this).vertices = class348_sub49.getShort();
	((Model) this).triangles = class348_sub49.getShort();
	((Model) this).anInt1818 = class348_sub49.getUByte();
	int i_124_ = class348_sub49.getUByte();
	boolean bool = (0x1 & i_124_ ^ 0xffffffff) == -2;
	boolean bool_125_ = (i_124_ & 0x2) == 2;
	boolean bool_126_ = (i_124_ & 0x4 ^ 0xffffffff) == -5;
	boolean bool_127_ = (i_124_ & 0x8) == 8;
	if (bool_127_) {
	    ((ByteBuffer) class348_sub49).position -= 7;
	    ((Model) this).anInt1830 = class348_sub49.getUByte();
	    ((ByteBuffer) class348_sub49).position += 6;
	}
	int i_128_ = class348_sub49.getUByte();
	int i_129_ = class348_sub49.getUByte();
	int i_130_ = class348_sub49.getUByte();
	int i_131_ = class348_sub49.getUByte();
	int i_132_ = class348_sub49.getUByte();
	int i_133_ = class348_sub49.getShort();
	int i_134_ = class348_sub49.getShort();
	int i_135_ = class348_sub49.getShort();
	int i_136_ = class348_sub49.getShort();
	int i_137_ = class348_sub49.getShort();
	int i_138_ = 0;
	int i_139_ = 0;
	int i_140_ = 0;
	if ((((Model) this).anInt1818 ^ 0xffffffff) < -1) {
	    ((ByteBuffer) class348_sub49).position = 0;
	    ((Model) this).aByteArray1823
		= new byte[((Model) this).anInt1818];
	    for (int i_141_ = 0; ((((Model) this).anInt1818 ^ 0xffffffff)
				  < (i_141_ ^ 0xffffffff)); i_141_++) {
		byte i_142_ = (((Model) this).aByteArray1823[i_141_]
			       = class348_sub49.getByte());
		if (i_142_ >= 1 && (i_142_ ^ 0xffffffff) >= -4)
		    i_139_++;
		if (i_142_ == 2)
		    i_140_++;
		if (i_142_ == 0)
		    i_138_++;
	    }
	}
	int i_143_ = ((Model) this).anInt1818;
	int i_144_ = i_143_;
	i_143_ += ((Model) this).vertices;
	int i_145_ = i_143_;
	if (bool)
	    i_143_ += ((Model) this).triangles;
	int i_146_ = i_143_;
	i_143_ += ((Model) this).triangles;
	int i_147_ = i_143_;
	if ((i_128_ ^ 0xffffffff) == -256)
	    i_143_ += ((Model) this).triangles;
	int i_148_ = i_143_;
	if ((i_130_ ^ 0xffffffff) == -2)
	    i_143_ += ((Model) this).triangles;
	int i_149_ = i_143_;
	if (i_132_ == 1)
	    i_143_ += ((Model) this).vertices;
	int i_150_ = i_143_;
	if (i_129_ == 1)
	    i_143_ += ((Model) this).triangles;
	if (i <= 68)
	    ((Model) this).anInt1821 = 85;
	int i_151_ = i_143_;
	i_143_ += i_136_;
	int i_152_ = i_143_;
	if (i_131_ == 1)
	    i_143_ += 2 * ((Model) this).triangles;
	int i_153_ = i_143_;
	i_143_ += i_137_;
	int i_154_ = i_143_;
	i_143_ += 2 * ((Model) this).triangles;
	int i_155_ = i_143_;
	i_143_ += i_133_;
	int i_156_ = i_143_;
	i_143_ += i_134_;
	int i_157_ = i_143_;
	i_143_ += i_135_;
	int i_158_ = i_143_;
	i_143_ += i_138_ * 6;
	int i_159_ = i_143_;
	i_143_ += 6 * i_139_;
	int i_160_ = 6;
	if (((Model) this).anInt1830 == 14)
	    i_160_ = 7;
	else if (((Model) this).anInt1830 >= 15)
	    i_160_ = 9;
	int i_161_ = i_143_;
	i_143_ += i_160_ * i_139_;
	int i_162_ = i_143_;
	i_143_ += i_139_;
	int i_163_ = i_143_;
	i_143_ += i_139_;
	int i_164_ = i_143_;
	i_143_ += 2 * i_140_ + i_139_;
	((Model) this).aShortArray1835
	    = new short[((Model) this).triangles];
	((Model) this).triangleColors
	    = new short[((Model) this).triangles];
	if ((i_130_ ^ 0xffffffff) == -2)
	    ((Model) this).anIntArray1824
		= new int[((Model) this).triangles];
	if (((Model) this).anInt1818 > 0) {
	    if (i_140_ > 0) {
		((Model) this).anIntArray1857 = new int[i_140_];
		((Model) this).anIntArray1865 = new int[i_140_];
	    }
	    ((Model) this).aShortArray1849
		= new short[((Model) this).anInt1818];
	    ((Model) this).aShortArray1829
		= new short[((Model) this).anInt1818];
	    if ((i_139_ ^ 0xffffffff) < -1) {
		((Model) this).anIntArray1867 = new int[i_139_];
		((Model) this).aByteArray1853 = new byte[i_139_];
		((Model) this).anIntArray1816 = new int[i_139_];
		((Model) this).aByteArray1833 = new byte[i_139_];
		((Model) this).anIntArray1844 = new int[i_139_];
		((Model) this).anIntArray1859 = new int[i_139_];
	    }
	    ((Model) this).aShortArray1825
		= new short[((Model) this).anInt1818];
	}
	if (bool)
	    ((Model) this).aByteArray1843
		= new byte[((Model) this).triangles];
	if ((i_129_ ^ 0xffffffff) == -2)
	    ((Model) this).polyAlphas
		= new byte[((Model) this).triangles];
	if ((i_128_ ^ 0xffffffff) == -256)
	    ((Model) this).aByteArray1839
		= new byte[((Model) this).triangles];
	else
	    ((Model) this).aByte1851 = (byte) i_128_;
	((Model) this).aShortArray1855
	    = new short[((Model) this).triangles];
	((Model) this).vertexY
	    = new int[((Model) this).vertices];
	((Model) this).aShortArray1863
	    = new short[((Model) this).triangles];
	if ((i_131_ ^ 0xffffffff) == -2
	    && (((Model) this).anInt1818 ^ 0xffffffff) < -1)
	    ((Model) this).aByteArray1820
		= new byte[((Model) this).triangles];
	int i_165_ = i_143_;
	((Model) this).vertexZ
	    = new int[((Model) this).vertices];
	((Model) this).vertexX
	    = new int[((Model) this).vertices];
	if ((i_132_ ^ 0xffffffff) == -2)
	    ((Model) this).vgroups
		= new int[((Model) this).vertices];
	((ByteBuffer) class348_sub49).position = i_144_;
	if ((i_131_ ^ 0xffffffff) == -2)
	    ((Model) this).aShortArray1822
		= new short[((Model) this).triangles];
	((ByteBuffer) class348_sub49_118_).position = i_155_;
	((ByteBuffer) class348_sub49_119_).position = i_156_;
	((ByteBuffer) class348_sub49_120_).position = i_157_;
	((ByteBuffer) class348_sub49_121_).position = i_149_;
	int i_166_ = 0;
	int i_167_ = 0;
	int i_168_ = 0;
	for (int i_169_ = 0; ((Model) this).vertices > i_169_; i_169_++) {
	    int i_170_ = class348_sub49.getUByte();
	    int i_171_ = 0;
	    if ((i_170_ & 0x1 ^ 0xffffffff) != -1)
		i_171_ = class348_sub49_118_.method3362((byte) 77);
	    int i_172_ = 0;
	    if ((i_170_ & 0x2 ^ 0xffffffff) != -1)
		i_172_ = class348_sub49_119_.method3362((byte) 77);
	    int i_173_ = 0;
	    if ((0x4 & i_170_ ^ 0xffffffff) != -1)
		i_173_ = class348_sub49_120_.method3362((byte) 77);
	    ((Model) this).vertexX[i_169_] = i_171_ + i_166_;
	    ((Model) this).vertexY[i_169_] = i_172_ + i_167_;
	    ((Model) this).vertexZ[i_169_] = i_168_ + i_173_;
	    i_167_ = ((Model) this).vertexY[i_169_];
	    i_166_ = ((Model) this).vertexX[i_169_];
	    i_168_ = ((Model) this).vertexZ[i_169_];
	    if ((i_132_ ^ 0xffffffff) == -2)
		((Model) this).vgroups[i_169_]
		    = class348_sub49_121_.getUByte();
	}
	((ByteBuffer) class348_sub49).position = i_154_;
	((ByteBuffer) class348_sub49_118_).position = i_145_;
	((ByteBuffer) class348_sub49_119_).position = i_147_;
	((ByteBuffer) class348_sub49_120_).position = i_150_;
	((ByteBuffer) class348_sub49_121_).position = i_148_;
	((ByteBuffer) class348_sub49_122_).position = i_152_;
	((ByteBuffer) class348_sub49_123_).position = i_153_;
	for (int i_174_ = 0;
	     ((i_174_ ^ 0xffffffff)
	      > (((Model) this).triangles ^ 0xffffffff));
	     i_174_++) {
	    ((Model) this).triangleColors[i_174_]
		= (short) class348_sub49.getShort();
	    if (bool)
		((Model) this).aByteArray1843[i_174_]
		    = class348_sub49_118_.getByte();
	    if ((i_128_ ^ 0xffffffff) == -256)
		((Model) this).aByteArray1839[i_174_]
		    = class348_sub49_119_.getByte();
	    if (i_129_ == 1)
		((Model) this).polyAlphas[i_174_]
		    = class348_sub49_120_.getByte();
	    if (i_130_ == 1)
		((Model) this).anIntArray1824[i_174_]
		    = class348_sub49_121_.getUByte();
	    if (i_131_ == 1)
		((Model) this).aShortArray1822[i_174_]
		    = (short) (class348_sub49_122_.getShort() + -1);
	    if (((Model) this).aByteArray1820 != null) {
		if (((Model) this).aShortArray1822[i_174_] == -1)
		    ((Model) this).aByteArray1820[i_174_] = (byte) -1;
		else
		    ((Model) this).aByteArray1820[i_174_]
			= (byte) (-1 + class348_sub49_123_.getUByte());
	    }
	}
	((ByteBuffer) class348_sub49).position = i_151_;
	((Model) this).anInt1821 = -1;
	((ByteBuffer) class348_sub49_118_).position = i_146_;
	short i_175_ = 0;
	short i_176_ = 0;
	short i_177_ = 0;
	int i_178_ = 0;
	for (int i_179_ = 0; ((((Model) this).triangles ^ 0xffffffff)
			      < (i_179_ ^ 0xffffffff)); i_179_++) {
	    int i_180_ = class348_sub49_118_.getUByte();
	    if ((i_180_ ^ 0xffffffff) == -2) {
		i_175_
		    = (short) (class348_sub49.method3362((byte) 77) + i_178_);
		i_178_ = i_175_;
		i_176_
		    = (short) (class348_sub49.method3362((byte) 77) + i_178_);
		i_178_ = i_176_;
		i_177_
		    = (short) (i_178_ + class348_sub49.method3362((byte) 77));
		i_178_ = i_177_;
		((Model) this).aShortArray1863[i_179_] = i_175_;
		((Model) this).aShortArray1835[i_179_] = i_176_;
		((Model) this).aShortArray1855[i_179_] = i_177_;
		if ((((Model) this).anInt1821 ^ 0xffffffff)
		    > (i_175_ ^ 0xffffffff))
		    ((Model) this).anInt1821 = i_175_;
		if (((Model) this).anInt1821 < i_176_)
		    ((Model) this).anInt1821 = i_176_;
		if (i_177_ > ((Model) this).anInt1821)
		    ((Model) this).anInt1821 = i_177_;
	    }
	    if ((i_180_ ^ 0xffffffff) == -3) {
		i_176_ = i_177_;
		i_177_
		    = (short) (class348_sub49.method3362((byte) 77) + i_178_);
		((Model) this).aShortArray1863[i_179_] = i_175_;
		i_178_ = i_177_;
		((Model) this).aShortArray1835[i_179_] = i_176_;
		((Model) this).aShortArray1855[i_179_] = i_177_;
		if (((Model) this).anInt1821 < i_177_)
		    ((Model) this).anInt1821 = i_177_;
	    }
	    if (i_180_ == 3) {
		i_175_ = i_177_;
		i_177_
		    = (short) (class348_sub49.method3362((byte) 77) + i_178_);
		i_178_ = i_177_;
		((Model) this).aShortArray1863[i_179_] = i_175_;
		((Model) this).aShortArray1835[i_179_] = i_176_;
		((Model) this).aShortArray1855[i_179_] = i_177_;
		if (((Model) this).anInt1821 < i_177_)
		    ((Model) this).anInt1821 = i_177_;
	    }
	    if (i_180_ == 4) {
		short i_181_ = i_175_;
		i_175_ = i_176_;
		i_177_
		    = (short) (i_178_ + class348_sub49.method3362((byte) 77));
		i_176_ = i_181_;
		((Model) this).aShortArray1863[i_179_] = i_175_;
		i_178_ = i_177_;
		((Model) this).aShortArray1835[i_179_] = i_176_;
		((Model) this).aShortArray1855[i_179_] = i_177_;
		if (((Model) this).anInt1821 < i_177_)
		    ((Model) this).anInt1821 = i_177_;
	    }
	}
	((ByteBuffer) class348_sub49).position = i_158_;
	((Model) this).anInt1821++;
	((ByteBuffer) class348_sub49_118_).position = i_159_;
	((ByteBuffer) class348_sub49_119_).position = i_161_;
	((ByteBuffer) class348_sub49_120_).position = i_162_;
	((ByteBuffer) class348_sub49_121_).position = i_163_;
	((ByteBuffer) class348_sub49_122_).position = i_164_;
	for (int i_182_ = 0; ((Model) this).anInt1818 > i_182_; i_182_++) {
	    int i_183_ = ((Model) this).aByteArray1823[i_182_] & 0xff;
	    if (i_183_ == 0) {
		((Model) this).aShortArray1829[i_182_]
		    = (short) class348_sub49.getShort();
		((Model) this).aShortArray1849[i_182_]
		    = (short) class348_sub49.getShort();
		((Model) this).aShortArray1825[i_182_]
		    = (short) class348_sub49.getShort();
	    }
	    if ((i_183_ ^ 0xffffffff) == -2) {
		((Model) this).aShortArray1829[i_182_]
		    = (short) class348_sub49_118_.getShort();
		((Model) this).aShortArray1849[i_182_]
		    = (short) class348_sub49_118_.getShort();
		((Model) this).aShortArray1825[i_182_]
		    = (short) class348_sub49_118_.getShort();
		if (((Model) this).anInt1830 >= 15) {
		    ((Model) this).anIntArray1859[i_182_]
			= class348_sub49_119_.getTri();
		    ((Model) this).anIntArray1816[i_182_]
			= class348_sub49_119_.getTri();
		    ((Model) this).anIntArray1844[i_182_]
			= class348_sub49_119_.getTri();
		} else {
		    ((Model) this).anIntArray1859[i_182_]
			= class348_sub49_119_.getShort();
		    if ((((Model) this).anInt1830 ^ 0xffffffff) <= -15)
			((Model) this).anIntArray1816[i_182_]
			    = class348_sub49_119_.getTri();
		    else
			((Model) this).anIntArray1816[i_182_]
			    = class348_sub49_119_.getShort();
		    ((Model) this).anIntArray1844[i_182_]
			= class348_sub49_119_.getShort();
		}
		((Model) this).aByteArray1833[i_182_]
		    = class348_sub49_120_.getByte();
		((Model) this).aByteArray1853[i_182_]
		    = class348_sub49_121_.getByte();
		((Model) this).anIntArray1867[i_182_]
		    = class348_sub49_122_.getByte();
	    }
	    if (i_183_ == 2) {
		((Model) this).aShortArray1829[i_182_]
		    = (short) class348_sub49_118_.getShort();
		((Model) this).aShortArray1849[i_182_]
		    = (short) class348_sub49_118_.getShort();
		((Model) this).aShortArray1825[i_182_]
		    = (short) class348_sub49_118_.getShort();
		if ((((Model) this).anInt1830 ^ 0xffffffff) <= -16) {
		    ((Model) this).anIntArray1859[i_182_]
			= class348_sub49_119_.getTri();
		    ((Model) this).anIntArray1816[i_182_]
			= class348_sub49_119_.getTri();
		    ((Model) this).anIntArray1844[i_182_]
			= class348_sub49_119_.getTri();
		} else {
		    ((Model) this).anIntArray1859[i_182_]
			= class348_sub49_119_.getShort();
		    if ((((Model) this).anInt1830 ^ 0xffffffff) > -15)
			((Model) this).anIntArray1816[i_182_]
			    = class348_sub49_119_.getShort();
		    else
			((Model) this).anIntArray1816[i_182_]
			    = class348_sub49_119_.getTri();
		    ((Model) this).anIntArray1844[i_182_]
			= class348_sub49_119_.getShort();
		}
		((Model) this).aByteArray1833[i_182_]
		    = class348_sub49_120_.getByte();
		((Model) this).aByteArray1853[i_182_]
		    = class348_sub49_121_.getByte();
		((Model) this).anIntArray1867[i_182_]
		    = class348_sub49_122_.getByte();
		((Model) this).anIntArray1857[i_182_]
		    = class348_sub49_122_.getByte();
		((Model) this).anIntArray1865[i_182_]
		    = class348_sub49_122_.getByte();
	    }
	    if (i_183_ == 3) {
		((Model) this).aShortArray1829[i_182_]
		    = (short) class348_sub49_118_.getShort();
		((Model) this).aShortArray1849[i_182_]
		    = (short) class348_sub49_118_.getShort();
		((Model) this).aShortArray1825[i_182_]
		    = (short) class348_sub49_118_.getShort();
		if ((((Model) this).anInt1830 ^ 0xffffffff) > -16) {
		    ((Model) this).anIntArray1859[i_182_]
			= class348_sub49_119_.getShort();
		    if ((((Model) this).anInt1830 ^ 0xffffffff) > -15)
			((Model) this).anIntArray1816[i_182_]
			    = class348_sub49_119_.getShort();
		    else
			((Model) this).anIntArray1816[i_182_]
			    = class348_sub49_119_.getTri();
		    ((Model) this).anIntArray1844[i_182_]
			= class348_sub49_119_.getShort();
		} else {
		    ((Model) this).anIntArray1859[i_182_]
			= class348_sub49_119_.getTri();
		    ((Model) this).anIntArray1816[i_182_]
			= class348_sub49_119_.getTri();
		    ((Model) this).anIntArray1844[i_182_]
			= class348_sub49_119_.getTri();
		}
		((Model) this).aByteArray1833[i_182_]
		    = class348_sub49_120_.getByte();
		((Model) this).aByteArray1853[i_182_]
		    = class348_sub49_121_.getByte();
		((Model) this).anIntArray1867[i_182_]
		    = class348_sub49_122_.getByte();
	    }
	}
	((ByteBuffer) class348_sub49).position = i_165_;
	if (bool_125_) {
	    int i_184_ = class348_sub49.getUByte();
	    if ((i_184_ ^ 0xffffffff) < -1) {
		((Model) this).aClass129Array1846 = new Class129[i_184_];
		for (int i_185_ = 0; i_184_ > i_185_; i_185_++) {
		    int i_186_ = class348_sub49.getShort();
		    int i_187_ = class348_sub49.getShort();
		    byte i_188_;
		    if ((i_128_ ^ 0xffffffff) != -256)
			i_188_ = (byte) i_128_;
		    else
			i_188_ = ((Model) this).aByteArray1839[i_187_];
		    ((Model) this).aClass129Array1846[i_185_]
			= (new Class129
			   (i_186_, ((Model) this).aShortArray1863[i_187_],
			    ((Model) this).aShortArray1835[i_187_],
			    ((Model) this).aShortArray1855[i_187_],
			    i_188_));
		}
	    }
	    int i_189_ = class348_sub49.getUByte();
	    if ((i_189_ ^ 0xffffffff) < -1) {
		((Model) this).aClass342Array1866 = new Class342[i_189_];
		for (int i_190_ = 0; i_189_ > i_190_; i_190_++) {
		    int i_191_ = class348_sub49.getShort();
		    int i_192_ = class348_sub49.getShort();
		    ((Model) this).aClass342Array1866[i_190_]
			= new Class342(i_191_, i_192_);
		}
	    }
	}
	if (bool_126_) {
	    int i_193_ = class348_sub49.getUByte();
	    if ((i_193_ ^ 0xffffffff) < -1) {
		((Model) this).polygons = new ModelPolygon[i_193_];
		for (int i_194_ = 0;
		     (i_194_ ^ 0xffffffff) > (i_193_ ^ 0xffffffff); i_194_++) {
		    int i_195_ = class348_sub49.getShort();
		    int i_196_ = class348_sub49.getShort();
		    int i_197_ = class348_sub49.getUByte();
		    byte i_198_ = class348_sub49.getByte();
		    ((Model) this).polygons[i_194_] = new ModelPolygon(i_195_, i_196_, i_197_, i_198_);
		}
	    }
	}
    }
    
    final void method1107(int i, int i_199_, int i_200_, int i_201_) {
	if ((i_200_ ^ 0xffffffff) != -1) {
	    int i_202_ = Class70.sineTable[i_200_];
	    int i_203_ = Class70.cosineTable[i_200_];
	    for (int i_204_ = 0; i_204_ < ((Model) this).vertices;
		 i_204_++) {
		int i_205_
		    = ((i_203_ * ((Model) this).vertexX[i_204_]
			+ ((Model) this).vertexY[i_204_] * i_202_)
		       >> 53081646);
		((Model) this).vertexY[i_204_]
		    = ((-(((Model) this).vertexX[i_204_] * i_202_)
			+ ((Model) this).vertexY[i_204_] * i_203_)
		       >> 788620462);
		((Model) this).vertexX[i_204_] = i_205_;
	    }
	}
	if (i != 6875)
	    ((Model) this).aShortArray1835 = null;
	anInt1837++;
	if (i_201_ != 0) {
	    int i_206_ = Class70.sineTable[i_201_];
	    int i_207_ = Class70.cosineTable[i_201_];
	    for (int i_208_ = 0; i_208_ < ((Model) this).vertices;
		 i_208_++) {
		int i_209_
		    = ((((Model) this).vertexY[i_208_] * i_207_
			+ -(i_206_ * ((Model) this).vertexZ[i_208_]))
		       >> -723657074);
		((Model) this).vertexZ[i_208_]
		    = ((((Model) this).vertexY[i_208_] * i_206_
			- -(i_207_ * ((Model) this).vertexZ[i_208_]))
		       >> 1866464078);
		((Model) this).vertexY[i_208_] = i_209_;
	    }
	}
	if (i_199_ != 0) {
	    int i_210_ = Class70.sineTable[i_199_];
	    int i_211_ = Class70.cosineTable[i_199_];
	    for (int i_212_ = 0; ((Model) this).vertices > i_212_;
		 i_212_++) {
		int i_213_
		    = ((i_211_ * ((Model) this).vertexX[i_212_]
			+ ((Model) this).vertexZ[i_212_] * i_210_)
		       >> -1869821682);
		((Model) this).vertexZ[i_212_]
		    = ((i_211_ * ((Model) this).vertexZ[i_212_]
			+ -(((Model) this).vertexX[i_212_] * i_210_))
		       >> -1993052722);
		((Model) this).vertexX[i_212_] = i_213_;
	    }
	}
    }
    
    public Model() {
	((Model) this).triangles = 0;
	((Model) this).aByte1851 = (byte) 0;
	((Model) this).anInt1821 = 0;
	((Model) this).anInt1818 = 0;
    }
    
    Model(byte[] src) {
	((Model) this).triangles = 0;
	((Model) this).aByte1851 = (byte) 0;
	((Model) this).anInt1821 = 0;
	((Model) this).anInt1818 = 0;
	if (src[src.length - 1] == -1 && src[src.length - 2] == -1)
	    initializeType0(src, (byte) 93);
	else
	    initializeType1(1, src);
    }
    
    static final void method1108(byte i, Canvas canvas) {
	anInt1850++;
	Dimension dimension = canvas.getSize();
	if (i != -99)
	    method1096(57);
	Whirlpool.method828((byte) 38, dimension.height, dimension.width);
	if (ByteBuffer.anInt7207 != 1)
	    Class21.aHa326.method3643(canvas, Class59_Sub1.anInt5283,
				      Queue.anInt1651);
	else
	    Class21.aHa326.method3643(canvas, Class348_Sub16_Sub1.anInt8854,
				      Class239_Sub16.anInt6008);
    }
    
    Model(int i, int i_214_, int i_215_) {
	((Model) this).triangles = 0;
	((Model) this).aByte1851 = (byte) 0;
	((Model) this).anInt1821 = 0;
	((Model) this).anInt1818 = 0;
	((Model) this).aByteArray1820 = new byte[i_214_];
	((Model) this).aShortArray1863 = new short[i_214_];
	((Model) this).triangleColors = new short[i_214_];
	((Model) this).vgroups = new int[i];
	((Model) this).anIntArray1824 = new int[i_214_];
	((Model) this).vertexZ = new int[i];
	if ((i_215_ ^ 0xffffffff) < -1) {
	    ((Model) this).anIntArray1857 = new int[i_215_];
	    ((Model) this).anIntArray1867 = new int[i_215_];
	    ((Model) this).aShortArray1849 = new short[i_215_];
	    ((Model) this).anIntArray1844 = new int[i_215_];
	    ((Model) this).aShortArray1825 = new short[i_215_];
	    ((Model) this).anIntArray1865 = new int[i_215_];
	    ((Model) this).aByteArray1833 = new byte[i_215_];
	    ((Model) this).anIntArray1859 = new int[i_215_];
	    ((Model) this).aShortArray1829 = new short[i_215_];
	    ((Model) this).aByteArray1823 = new byte[i_215_];
	    ((Model) this).anIntArray1816 = new int[i_215_];
	    ((Model) this).aByteArray1853 = new byte[i_215_];
	}
	((Model) this).aShortArray1822 = new short[i_214_];
	((Model) this).aByteArray1839 = new byte[i_214_];
	((Model) this).aShortArray1855 = new short[i_214_];
	((Model) this).aShortArray1835 = new short[i_214_];
	((Model) this).vertexX = new int[i];
	((Model) this).aByteArray1843 = new byte[i_214_];
	((Model) this).vertexY = new int[i];
	((Model) this).polyAlphas = new byte[i_214_];
    }
    
    Model(Model[] class124s, int i) {
	((Model) this).triangles = 0;
	((Model) this).aByte1851 = (byte) 0;
	((Model) this).anInt1821 = 0;
	((Model) this).anInt1818 = 0;
	((Model) this).anInt1818 = 0;
	((Model) this).triangles = 0;
	((Model) this).vertices = 0;
	int i_216_ = 0;
	int i_217_ = 0;
	int i_218_ = 0;
	boolean bool = false;
	boolean bool_219_ = false;
	boolean bool_220_ = false;
	boolean bool_221_ = false;
	boolean bool_222_ = false;
	((Model) this).aByte1851 = (byte) -1;
	boolean bool_223_ = false;
	for (int i_224_ = 0; i > i_224_; i_224_++) {
	    Model class124_225_ = class124s[i_224_];
	    if (class124_225_ != null) {
		((Model) this).triangles
		    += ((Model) class124_225_).triangles;
		((Model) this).vertices
		    += ((Model) class124_225_).vertices;
		((Model) this).anInt1818
		    += ((Model) class124_225_).anInt1818;
		bool
		    = bool | ((Model) class124_225_).aByteArray1843 != null;
		if (((Model) class124_225_).polygons != null)
		    i_218_ += (((Model) class124_225_)
			       .polygons).length;
		if (((Model) class124_225_).aClass129Array1846 != null)
		    i_216_ += (((Model) class124_225_)
			       .aClass129Array1846).length;
		if (((Model) class124_225_).aClass342Array1866 != null)
		    i_217_ += (((Model) class124_225_)
			       .aClass342Array1866).length;
		bool_222_
		    = (bool_222_
		       | ((Model) class124_225_).aShortArray1822 != null);
		bool_221_
		    = (bool_221_
		       | ((Model) class124_225_).aByteArray1820 != null);
		if (((Model) class124_225_).aByteArray1839 != null)
		    bool_219_ = true;
		else {
		    if (((Model) this).aByte1851 == -1)
			((Model) this).aByte1851
			    = ((Model) class124_225_).aByte1851;
		    if ((((Model) class124_225_).aByte1851 ^ 0xffffffff)
			!= (((Model) this).aByte1851 ^ 0xffffffff))
			bool_219_ = true;
		}
		bool_220_
		    = (bool_220_
		       | ((Model) class124_225_).polyAlphas != null);
		bool_223_
		    = (bool_223_
		       | ((Model) class124_225_).anIntArray1824 != null);
	    }
	}
	((Model) this).aShortArray1835
	    = new short[((Model) this).triangles];
	if ((((Model) this).anInt1818 ^ 0xffffffff) < -1) {
	    ((Model) this).aShortArray1829
		= new short[((Model) this).anInt1818];
	    ((Model) this).aByteArray1823
		= new byte[((Model) this).anInt1818];
	    ((Model) this).anIntArray1867
		= new int[((Model) this).anInt1818];
	    ((Model) this).anIntArray1844
		= new int[((Model) this).anInt1818];
	    ((Model) this).aByteArray1833
		= new byte[((Model) this).anInt1818];
	    ((Model) this).anIntArray1857
		= new int[((Model) this).anInt1818];
	    ((Model) this).anIntArray1865
		= new int[((Model) this).anInt1818];
	    ((Model) this).anIntArray1859
		= new int[((Model) this).anInt1818];
	    ((Model) this).aByteArray1853
		= new byte[((Model) this).anInt1818];
	    ((Model) this).aShortArray1849
		= new short[((Model) this).anInt1818];
	    ((Model) this).anIntArray1816
		= new int[((Model) this).anInt1818];
	    ((Model) this).aShortArray1825
		= new short[((Model) this).anInt1818];
	}
	((Model) this).aShortArray1856
	    = new short[((Model) this).triangles];
	if (bool_222_)
	    ((Model) this).aShortArray1822
		= new short[((Model) this).triangles];
	((Model) this).aShortArray1863
	    = new short[((Model) this).triangles];
	if (bool_223_)
	    ((Model) this).anIntArray1824
		= new int[((Model) this).triangles];
	if (bool_219_)
	    ((Model) this).aByteArray1839
		= new byte[((Model) this).triangles];
	if (bool)
	    ((Model) this).aByteArray1843
		= new byte[((Model) this).triangles];
	if ((i_218_ ^ 0xffffffff) < -1)
	    ((Model) this).polygons = new ModelPolygon[i_218_];
	if ((i_217_ ^ 0xffffffff) < -1)
	    ((Model) this).aClass342Array1866 = new Class342[i_217_];
	((Model) this).vgroups
	    = new int[((Model) this).vertices];
	if (bool_221_)
	    ((Model) this).aByteArray1820
		= new byte[((Model) this).triangles];
	((Model) this).vertexZ
	    = new int[((Model) this).vertices];
	((Model) this).triangleColors
	    = new short[((Model) this).triangles];
	((Model) this).vertexX
	    = new int[((Model) this).vertices];
	((Model) this).vertexY
	    = new int[((Model) this).vertices];
	if (i_216_ > 0)
	    ((Model) this).aClass129Array1846 = new Class129[i_216_];
	((Model) this).aShortArray1855
	    = new short[((Model) this).triangles];
	if (bool_220_)
	    ((Model) this).polyAlphas
		= new byte[((Model) this).triangles];
	((Model) this).aShortArray1842
	    = new short[((Model) this).vertices];
	((Model) this).anInt1818 = 0;
	i_217_ = 0;
	i_218_ = 0;
	i_216_ = 0;
	((Model) this).triangles = 0;
	((Model) this).vertices = 0;
	for (int i_226_ = 0; (i_226_ ^ 0xffffffff) > (i ^ 0xffffffff);
	     i_226_++) {
	    short i_227_ = (short) (1 << i_226_);
	    Model class124_228_ = class124s[i_226_];
	    if (class124_228_ != null) {
		if (((Model) class124_228_).polygons != null) {
		    for (int i_229_ = 0;
			 (((Model) class124_228_).polygons.length
			  > i_229_);
			 i_229_++) {
			ModelPolygon class162 = (((Model) class124_228_)
					     .polygons[i_229_]);
			((Model) this).polygons[i_218_++]
			    = class162.method1266(5, ((((ModelPolygon) class162)
						       .alpha)
						      - -(((Model) this)
							  .triangles)));
		    }
		}
		for (int i_230_ = 0;
		     ((Model) class124_228_).triangles > i_230_; i_230_++) {
		    if (bool
			&& ((Model) class124_228_).aByteArray1843 != null)
			((Model) this).aByteArray1843[(((Model) this)
							  .triangles)]
			    = (((Model) class124_228_).aByteArray1843
			       [i_230_]);
		    if (bool_219_) {
			if (((Model) class124_228_).aByteArray1839 != null)
			    ((Model) this).aByteArray1839[(((Model) this)
							      .triangles)]
				= (((Model) class124_228_).aByteArray1839
				   [i_230_]);
			else
			    ((Model) this).aByteArray1839[(((Model) this)
							      .triangles)]
				= ((Model) class124_228_).aByte1851;
		    }
		    if (bool_220_
			&& ((Model) class124_228_).polyAlphas != null)
			((Model) this).polyAlphas[(((Model) this)
							  .triangles)]
			    = (((Model) class124_228_).polyAlphas
			       [i_230_]);
		    if (bool_222_) {
			if (((Model) class124_228_).aShortArray1822 == null)
			    ((Model) this).aShortArray1822
				[((Model) this).triangles]
				= (short) -1;
			else
			    ((Model) this).aShortArray1822
				[((Model) this).triangles]
				= (((Model) class124_228_).aShortArray1822
				   [i_230_]);
		    }
		    if (bool_223_) {
			if (((Model) class124_228_).anIntArray1824 == null)
			    ((Model) this).anIntArray1824[(((Model) this)
							      .triangles)]
				= -1;
			else
			    ((Model) this).anIntArray1824[(((Model) this)
							      .triangles)]
				= (((Model) class124_228_).anIntArray1824
				   [i_230_]);
		    }
		    ((Model) this).aShortArray1863[(((Model) this)
						       .triangles)]
			= (short) method1104(class124_228_, 0,
					     (((Model) class124_228_)
					      .aShortArray1863[i_230_]),
					     i_227_);
		    ((Model) this).aShortArray1835[(((Model) this)
						       .triangles)]
			= (short) method1104(class124_228_, 0,
					     (((Model) class124_228_)
					      .aShortArray1835[i_230_]),
					     i_227_);
		    ((Model) this).aShortArray1855[(((Model) this)
						       .triangles)]
			= (short) method1104(class124_228_, 0,
					     (((Model) class124_228_)
					      .aShortArray1855[i_230_]),
					     i_227_);
		    ((Model) this).aShortArray1856[(((Model) this)
						       .triangles)]
			= i_227_;
		    ((Model) this).triangleColors[(((Model) this)
						       .triangles)]
			= ((Model) class124_228_).triangleColors[i_230_];
		    ((Model) this).triangles++;
		}
		if (((Model) class124_228_).aClass129Array1846 != null) {
		    for (int i_231_ = 0;
			 (((Model) class124_228_).aClass129Array1846.length
			  > i_231_);
			 i_231_++) {
			int i_232_ = method1104(class124_228_, 0,
						((Class129)
						 (((Model) class124_228_)
						  .aClass129Array1846
						  [i_231_])).anInt1881,
						i_227_);
			int i_233_ = method1104(class124_228_, 0,
						((Class129)
						 (((Model) class124_228_)
						  .aClass129Array1846
						  [i_231_])).anInt1877,
						i_227_);
			int i_234_ = method1104(class124_228_, 0,
						((Class129)
						 (((Model) class124_228_)
						  .aClass129Array1846
						  [i_231_])).anInt1892,
						i_227_);
			((Model) this).aClass129Array1846[i_216_]
			    = ((Model) class124_228_).aClass129Array1846
				  [i_231_]
				  .method1124(i_233_, -1, i_234_, i_232_);
			i_216_++;
		    }
		}
		if (((Model) class124_228_).aClass342Array1866 != null) {
		    for (int i_235_ = 0;
			 (i_235_ ^ 0xffffffff) > ((((Model) class124_228_)
						   .aClass342Array1866).length
						  ^ 0xffffffff);
			 i_235_++) {
			int i_236_ = method1104(class124_228_, 0,
						((Class342)
						 (((Model) class124_228_)
						  .aClass342Array1866
						  [i_235_])).anInt4244,
						i_227_);
			((Model) this).aClass342Array1866[i_217_]
			    = ((Model) class124_228_).aClass342Array1866
				  [i_235_].method2687((byte) 94, i_236_);
			i_217_++;
		    }
		}
	    }
	}
	int i_237_ = 0;
	((Model) this).anInt1821 = ((Model) this).vertices;
	for (int i_238_ = 0; (i_238_ ^ 0xffffffff) > (i ^ 0xffffffff);
	     i_238_++) {
	    short i_239_ = (short) (1 << i_238_);
	    Model class124_240_ = class124s[i_238_];
	    if (class124_240_ != null) {
		for (int i_241_ = 0;
		     ((Model) class124_240_).triangles > i_241_; i_241_++) {
		    if (bool_221_)
			((Model) this).aByteArray1820[i_237_++]
			    = (byte) (((((Model) class124_240_)
					.aByteArray1820) != null
				       && ((((Model) class124_240_)
					    .aByteArray1820[i_241_])
					   ^ 0xffffffff) != 0)
				      ? ((((Model) class124_240_)
					  .aByteArray1820[i_241_])
					 + ((Model) this).anInt1818)
				      : -1);
		}
		for (int i_242_ = 0;
		     ((i_242_ ^ 0xffffffff)
		      > (((Model) class124_240_).anInt1818 ^ 0xffffffff));
		     i_242_++) {
		    byte i_243_
			= (((Model) this).aByteArray1823[(((Model) this)
							     .anInt1818)]
			   = (((Model) class124_240_).aByteArray1823
			      [i_242_]));
		    if ((i_243_ ^ 0xffffffff) == -1) {
			((Model) this).aShortArray1829[(((Model) this)
							   .anInt1818)]
			    = (short) method1104(class124_240_, 0,
						 (((Model) class124_240_)
						  .aShortArray1829[i_242_]),
						 i_239_);
			((Model) this).aShortArray1849[(((Model) this)
							   .anInt1818)]
			    = (short) method1104(class124_240_, 0,
						 (((Model) class124_240_)
						  .aShortArray1849[i_242_]),
						 i_239_);
			((Model) this).aShortArray1825[(((Model) this)
							   .anInt1818)]
			    = (short) method1104(class124_240_, 0,
						 (((Model) class124_240_)
						  .aShortArray1825[i_242_]),
						 i_239_);
		    }
		    if ((i_243_ ^ 0xffffffff) <= -2
			&& (i_243_ ^ 0xffffffff) >= -4) {
			((Model) this).aShortArray1829[(((Model) this)
							   .anInt1818)]
			    = (((Model) class124_240_).aShortArray1829
			       [i_242_]);
			((Model) this).aShortArray1849[(((Model) this)
							   .anInt1818)]
			    = (((Model) class124_240_).aShortArray1849
			       [i_242_]);
			((Model) this).aShortArray1825[(((Model) this)
							   .anInt1818)]
			    = (((Model) class124_240_).aShortArray1825
			       [i_242_]);
			((Model) this).anIntArray1859[(((Model) this)
							  .anInt1818)]
			    = (((Model) class124_240_).anIntArray1859
			       [i_242_]);
			((Model) this).anIntArray1816[(((Model) this)
							  .anInt1818)]
			    = (((Model) class124_240_).anIntArray1816
			       [i_242_]);
			((Model) this).anIntArray1844[(((Model) this)
							  .anInt1818)]
			    = (((Model) class124_240_).anIntArray1844
			       [i_242_]);
			((Model) this).aByteArray1833[(((Model) this)
							  .anInt1818)]
			    = (((Model) class124_240_).aByteArray1833
			       [i_242_]);
			((Model) this).aByteArray1853[(((Model) this)
							  .anInt1818)]
			    = (((Model) class124_240_).aByteArray1853
			       [i_242_]);
			((Model) this).anIntArray1867[(((Model) this)
							  .anInt1818)]
			    = (((Model) class124_240_).anIntArray1867
			       [i_242_]);
		    }
		    if (i_243_ == 2) {
			((Model) this).anIntArray1857[(((Model) this)
							  .anInt1818)]
			    = (((Model) class124_240_).anIntArray1857
			       [i_242_]);
			((Model) this).anIntArray1865[(((Model) this)
							  .anInt1818)]
			    = (((Model) class124_240_).anIntArray1865
			       [i_242_]);
		    }
		    ((Model) this).anInt1818++;
		}
	    }
	}
    }
}
