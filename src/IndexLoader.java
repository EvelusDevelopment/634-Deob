/* IndexLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class IndexLoader
{
    static int anInt626;
    static int anInt627;
    static int anInt628;
    private IndexTable indexTable = null;
    static int anInt630;
    static int anInt631;
    static int anInt632;
    static int anInt633;
    int unpackSettings;
    static int anInt635;
    static int anInt636;
    static int anInt637;
    static int anInt638;
    static int anInt639;
    static int anInt640;
    static int anInt641;
    static int anInt642;
    static OutgoingPacket aClass351_643 = new OutgoingPacket(3, -1);
    static int anInt644;
    static int anInt645;
    static int anInt646;
    static int anInt647;
    static int anInt648;
    static int anInt649;
    static int anInt650;
    static int anInt651;
    static int anInt652;
    static int anInt653;
    static int anInt654;
    private boolean directlyAllocate;
    private Object[] archiveBuffers;
    static int anInt657;
    static int anInt658;
    private AbtractArchiveLoader archiveLoader;
    static int anInt660;
    static int anInt661;
    static int anInt662;
    static int anInt663;
    private Object[][] childArchiveBuffers;
    static int anInt665;
    static int anInt666;
    static long aLong667;
    static int anInt668;
    static int anInt669 = 0;
    static float aFloat670;
    
    final int getTableChecksum() {
	anInt657++;
	if (!method399(false))
	    throw new IllegalStateException("");
	return ((IndexTable) indexTable).checksum;
    }
    
    public static void method390(byte i) {
	aClass351_643 = null;
    }
    
    final byte[] getArchiveChild(String archiveName, String childName) {
	try {
	    anInt647++;
	    if (!method399(false))
		return null;
	    archiveName = archiveName.toLowerCase();
	    childName = childName.toLowerCase();
	    int archiveId = ((IndexTable) indexTable).nameHashTable.getOffset(Class281.getNameHash(archiveName, -29286));
	    if (!isValidArchiveId(archiveId))
		return null;
	    int childId = (((IndexTable) indexTable).childHashTables[archiveId].getOffset(Class281.getNameHash(childName, -29286)));
	    return loadArchiveChild(-1860, archiveId, childId);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("in.EA("
					     + (archiveName != null ? "{...}"
						: "null")
					     + ','
					     + (childName != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    private final boolean isValidArchiveId(int archiveId) {
	anInt646++;
	if (!method399(false))
	    return false;
	if ((archiveId ^ 0xffffffff) > -1
	    || ((IndexTable) indexTable).maxChildEntry.length <= archiveId
	    || ((((IndexTable) indexTable).maxChildEntry[archiveId] ^ 0xffffffff)
		== -1)) {
	    if (Class285.aBoolean4741)
		throw new IllegalArgumentException(Integer.toString(archiveId));
	    return false;
	}
	return true;
    }
    
    final byte[] loadArchiveChild(int i, int i_5_, int i_6_, int[] is) {
	anInt639++;
	if (i_6_ != 2)
	    anInt669 = 51;
	if (!method418(i_5_, i_6_ + -2, i))
	    return null;
	if (childArchiveBuffers[i] == null || childArchiveBuffers[i][i_5_] == null) {
	    boolean bool = load(i_5_, (byte) -78, is, i);
	    if (!bool) {
		loadArchive(i);
		bool = load(i_5_, (byte) -103, is, i);
		if (!bool)
		    return null;
	    }
	}
	byte[] is_7_
	    = Class50_Sub1.getVariableBufferArray(false, childArchiveBuffers[i][i_5_],
				     53146732);
	if ((((IndexLoader) this).unpackSettings ^ 0xffffffff) == -2) {
	    childArchiveBuffers[i][i_5_] = null;
	    if ((((IndexTable) indexTable).maxChildEntry[i] ^ 0xffffffff)
		== -2)
		childArchiveBuffers[i] = null;
	} else if (((IndexLoader) this).unpackSettings == 2)
	    childArchiveBuffers[i] = null;
	return is_7_;
    }
    
    private final boolean load(int i, byte i_8_, int[] is, int i_9_) {
	anInt628++;
	if (!isValidArchiveId(i_9_))
	    return false;
	if (archiveBuffers[i_9_] == null)
	    return false;
	int children = ((IndexTable) indexTable).amountChildren[i_9_];
	int[] is_11_ = ((IndexTable) indexTable).anIntArrayArray3721[i_9_];
	if (childArchiveBuffers[i_9_] == null)
	    childArchiveBuffers[i_9_] = new Object[((IndexTable) indexTable).maxChildEntry[i_9_]];
	Object[] objects = childArchiveBuffers[i_9_];
	boolean bool = true;
	for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (children ^ 0xffffffff);
	     i_12_++) {
	    int i_13_;
	    if (is_11_ == null)
		i_13_ = i_12_;
	    else
		i_13_ = is_11_[i_12_];
	    if (objects[i_13_] == null) {
		bool = false;
		break;
	    }
	}
	if (bool)
	    return true;
	byte[] is_14_;
	if (is == null
	    || ((is[0] ^ 0xffffffff) == -1 && (is[1] ^ 0xffffffff) == -1
		&& (is[2] ^ 0xffffffff) == -1 && (is[3] ^ 0xffffffff) == -1))
	    is_14_ = Class50_Sub1.getVariableBufferArray(false, archiveBuffers[i_9_], 53146732);
	else {
	    is_14_ = Class50_Sub1.getVariableBufferArray(true, archiveBuffers[i_9_], 53146732);
	    ByteBuffer class348_sub49 = new ByteBuffer(is_14_);
	    class348_sub49.decipherXTEA(is, 5, (((ByteBuffer) class348_sub49).payload).length);
	}
	byte[] is_15_;
	try {
	    is_15_ = Class348_Sub41.unpackFileContainer(is_14_, -120);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("T3 - " + (is != null) + "," + i_9_ + ","
			+ is_14_.length + ","
			+ Class59_Sub1.getCalculatedChecksum(5126, is_14_.length, is_14_)
			+ ","
			+ Class59_Sub1.getCalculatedChecksum(5126, -2 + is_14_.length,
						 is_14_)
			+ "," + ((IndexTable) indexTable).checksums[i_9_]
			+ "," + ((IndexTable) indexTable).checksum));
	}
	if (directlyAllocate)
	    archiveBuffers[i_9_] = null;
	if (i_8_ >= -17)
	    method415((byte) 70, -7);
	if (children > 1) {
	    if (((IndexLoader) this).unpackSettings != 2) {
		int i_16_ = is_15_.length;
		int i_17_ = 0xff & is_15_[--i_16_];
		i_16_ -= 4 * (children * i_17_);
		ByteBuffer class348_sub49 = new ByteBuffer(is_15_);
		int[] is_18_ = new int[children];
		((ByteBuffer) class348_sub49).position = i_16_;
		for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
		    int i_20_ = 0;
		    for (int i_21_ = 0; i_21_ < children; i_21_++) {
			i_20_ += class348_sub49.getDWord();
			is_18_[i_21_] += i_20_;
		    }
		}
		byte[][] is_22_ = new byte[children][];
		for (int i_23_ = 0;
		     (i_23_ ^ 0xffffffff) > (children ^ 0xffffffff); i_23_++) {
		    is_22_[i_23_] = new byte[is_18_[i_23_]];
		    is_18_[i_23_] = 0;
		}
		((ByteBuffer) class348_sub49).position = i_16_;
		int i_24_ = 0;
		for (int i_25_ = 0;
		     (i_17_ ^ 0xffffffff) < (i_25_ ^ 0xffffffff); i_25_++) {
		    int i_26_ = 0;
		    for (int i_27_ = 0; children > i_27_; i_27_++) {
			i_26_ += class348_sub49.getDWord();
			Class214.byteArrayCopy(is_15_, i_24_, is_22_[i_27_],
					    is_18_[i_27_], i_26_);
			i_24_ += i_26_;
			is_18_[i_27_] += i_26_;
		    }
		}
		for (int i_28_ = 0; children > i_28_; i_28_++) {
		    int i_29_;
		    if (is_11_ == null)
			i_29_ = i_28_;
		    else
			i_29_ = is_11_[i_28_];
		    if ((((IndexLoader) this).unpackSettings ^ 0xffffffff) != -1)
			objects[i_29_] = is_22_[i_28_];
		    else
			objects[i_29_]
			    = Class179.getDirectByteBuffer(is_22_[i_28_]);
		}
	    } else {
		int i_30_ = is_15_.length;
		int i_31_ = 0xff & is_15_[--i_30_];
		i_30_ -= 4 * (i_31_ * children);
		ByteBuffer class348_sub49 = new ByteBuffer(is_15_);
		int i_32_ = 0;
		int i_33_ = 0;
		((ByteBuffer) class348_sub49).position = i_30_;
		for (int i_34_ = 0;
		     (i_31_ ^ 0xffffffff) < (i_34_ ^ 0xffffffff); i_34_++) {
		    int i_35_ = 0;
		    for (int i_36_ = 0; i_36_ < children; i_36_++) {
			i_35_ += class348_sub49.getDWord();
			int i_37_;
			if (is_11_ == null)
			    i_37_ = i_36_;
			else
			    i_37_ = is_11_[i_36_];
			if ((i_37_ ^ 0xffffffff) == (i ^ 0xffffffff)) {
			    i_33_ = i_37_;
			    i_32_ += i_35_;
			}
		    }
		}
		if ((i_32_ ^ 0xffffffff) == -1)
		    return true;
		byte[] is_38_ = new byte[i_32_];
		((ByteBuffer) class348_sub49).position = i_30_;
		i_32_ = 0;
		int i_39_ = 0;
		for (int i_40_ = 0; i_40_ < i_31_; i_40_++) {
		    int i_41_ = 0;
		    for (int i_42_ = 0; i_42_ < children; i_42_++) {
			i_41_ += class348_sub49.getDWord();
			int i_43_;
			if (is_11_ != null)
			    i_43_ = is_11_[i_42_];
			else
			    i_43_ = i_42_;
			if (i_43_ == i) {
			    Class214.byteArrayCopy(is_15_, i_39_, is_38_, i_32_,
						i_41_);
			    i_32_ += i_41_;
			}
			i_39_ += i_41_;
		    }
		}
		objects[i_33_] = is_38_;
	    }
	} else {
	    int i_44_;
	    if (is_11_ != null)
		i_44_ = is_11_[0];
	    else
		i_44_ = 0;
	    if (((IndexLoader) this).unpackSettings != 0)
		objects[i_44_] = is_15_;
	    else
		objects[i_44_]  = Class179.getDirectByteBuffer(is_15_);
	}
	return true;
    }
    
    static final void method395(int i) throws ToolkitException {
	if (ByteBuffer.anInt7207 == 1)
	    Class21.aHa326.draw(Class339.anInt4211,
				      Class348_Sub40_Sub8.anInt9157);
	else
	    Class21.aHa326.draw(0, 0);
	if (i >= 73)
	    anInt642++;
    }
    
    final int[] method396(int i, int i_45_) {
	anInt640++;
	if (i_45_ != 0)
	    getTableChecksum();
	if (!isValidArchiveId(i))
	    return null;
	int[] is = ((IndexTable) indexTable).anIntArrayArray3721[i];
	if (is == null) {
	    is = new int[((IndexTable) indexTable).amountChildren[i]];
	    for (int i_46_ = 0; i_46_ < is.length; i_46_++)
		is[i_46_] = i_46_;
	}
	return is;
    }
    
    final int method397(String string, int i) {
	anInt633++;
	if (!method399(false))
	    return 0;
	string = string.toLowerCase();
	int i_47_ = ((IndexTable) indexTable).nameHashTable.getOffset(Class281.getNameHash(string, i ^ ~0x7265));
	return getArchiveLoadedPercent(i_47_);
    }
    
    final int getPercentLoaded(byte i) {
	anInt641++;
	if (!method399(false))
	    return 0;
	int i_48_ = 0;
	int i_49_ = 0;
	int i_50_ = 0;
	if (i != -31)
	    return 50;
	for (/**/; archiveBuffers.length > i_50_; i_50_++) {
	    if ((((IndexTable) indexTable).amountChildren[i_50_] ^ 0xffffffff)
		< -1) {
		i_49_ += getArchiveLoadedPercent(i_50_);
		i_48_ += 100;
	    }
	}
	if ((i_48_ ^ 0xffffffff) == -1)
	    return 100;
	int i_51_ = i_49_ * 100 / i_48_;
	return i_51_;
    }
    
    private final boolean method399(boolean bool) {
	anInt652++;
	if (indexTable == null) {
	    indexTable = archiveLoader.getIndexTable();
	    if (indexTable == null)
		return false;
	    archiveBuffers
		= new Object[((IndexTable) indexTable).maximumEntry];
	    childArchiveBuffers
		= new Object[((IndexTable) indexTable).maximumEntry][];
	}
	if (bool != false)
	    archiveLoader = null;
	return true;
    }
    
    final boolean method400(int i, String string) {
	anInt635++;
	if (!method399(false))
	    return false;
	if (i != -18308)
	    return false;
	string = string.toLowerCase();
	int i_52_ = ((IndexTable) indexTable).nameHashTable
			.getOffset(Class281.getNameHash(string, -29286));
	if ((i_52_ ^ 0xffffffff) > -1)
	    return false;
	return true;
    }
    
    final boolean isCompletelyLoaded(int i) {
	anInt648++;
	if (!method399(false))
	    return false;
	boolean bool = true;
	for (int i_53_ = 0;
	     ((((IndexTable) indexTable).anIntArray3738.length ^ 0xffffffff)
	      < (i_53_ ^ 0xffffffff));
	     i_53_++) {
	    int i_54_ = ((IndexTable) indexTable).anIntArray3738[i_53_];
	    if (archiveBuffers[i_54_] == null) {
		loadArchive(i_54_);
		if (archiveBuffers[i_54_] == null)
		    bool = false;
	    }
	}
	if (i < 33)
	    method407(-92);
	return bool;
    }
    
    private final void method402(byte i, int i_55_) {
	anInt658++;
	if (i < -70)
	    archiveLoader.method2338((byte) -52, i_55_);
    }
    
    private final boolean method403(String string, int i, String string_56_) {
	try {
	    anInt626++;
	    if (!method399(false))
		return false;
	    string = string.toLowerCase();
	    string_56_ = string_56_.toLowerCase();
	    int i_57_ = (((IndexTable) indexTable).nameHashTable.getOffset
			 (Class281.getNameHash(string, -29286)));
	    if (i != 7195)
		method403(null, -20, null);
	    if (!isValidArchiveId(i_57_))
		return false;
	    int i_58_
		= ((IndexTable) indexTable).childHashTables[i_57_]
		      .getOffset(Class281.getNameHash(string_56_, -29286));
	    return isLoaded(i_57_, i_58_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("in.Q("
					     + (string != null ? "{...}"
						: "null")
					     + ',' + i + ','
					     + (string_56_ != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    final void destroy(int i, boolean bool, boolean bool_59_) {
	anInt644++;
	if (i != 0)
	    getArchiveChild(null, null);
	if (method399(false)) {
	    if (bool_59_) {
		((IndexTable) indexTable).nameHashes = null;
		((IndexTable) indexTable).nameHashTable = null;
	    }
	    if (bool) {
		((IndexTable) indexTable).anIntArrayArray3735 = null;
		((IndexTable) indexTable).childHashTables = null;
	    }
	}
    }
    
    final void removeArchives(int i) {
	anInt650++;
	if (i != 0)
	    method416((byte) -45, null);
	if (archiveBuffers != null) {
	    for (int i_60_ = 0; i_60_ < archiveBuffers.length; i_60_++)
		archiveBuffers[i_60_] = null;
	}
    }
    
    private final void loadArchive(int i) {
	if (!directlyAllocate)
	    archiveBuffers[i] = Class179.getDirectByteBuffer(archiveLoader.getValidatedArchive(i));
	else
	    archiveBuffers[i] = archiveLoader.getValidatedArchive(i);
	anInt665++;
    }
    
    final int method407(int i_62_) {
	anInt645++;
	if (!isValidArchiveId(i_62_))
	    return 0;
	return ((IndexTable) indexTable).maxChildEntry[i_62_];
    }
    
    final boolean method408(byte i, int i_63_) {
	anInt632++;
	if (!isValidArchiveId(i_63_))
	    return false;
	if (archiveBuffers[i_63_] != null)
	    return true;
	loadArchive(i_63_);
	if (archiveBuffers[i_63_] != null)
	    return true;
	if (i > -112)
	    ((IndexLoader) this).unpackSettings = -26;
	return false;
    }
    
    final void method409(String string, boolean bool) {
	anInt663++;
	if (bool == true && method399(false)) {
	    string = string.toLowerCase();
	    int i = ((IndexTable) indexTable).nameHashTable
			.getOffset(Class281.getNameHash(string, -29286));
	    method402((byte) -86, i);
	}
    }
    
    final byte[] loadArchiveChild(int i, int i_64_, int i_65_) {
	anInt651++;
	return loadArchiveChild(i_64_, i_65_, i ^ ~0x741, null);
    }
    
    final void removeChildren(int i) {
	anInt627++;
	if (isValidArchiveId(i)) {
	    if (childArchiveBuffers != null)
		childArchiveBuffers[i] = null;
	}
    }
    
    final void removeChildren() {
	if (childArchiveBuffers != null) {
	    for (int i_67_ = 0; childArchiveBuffers.length > i_67_; i_67_++)
		childArchiveBuffers[i_67_] = null;
	}
	anInt660++;
    }
    
    final boolean getArchiveExists(String string) {
	anInt636++;
	if (!method399(false))
	    return false;
	string = string.toLowerCase();
	int i_69_ = ((IndexTable) indexTable).nameHashTable.getOffset(Class281.getNameHash(string, -29286));
	return method408((byte) -120, i_69_);
    }
    
    final int getAmountChildren() {
	anInt637++;
	if (!method399(false))
	    return -1;
	return ((IndexTable) indexTable).maxChildEntry.length;
    }
    
    final byte[] method415(byte i, int i_70_) {
	anInt630++;
	if (!method399(false))
	    return null;
	if (((IndexTable) indexTable).maxChildEntry.length == 1)
	    return loadArchiveChild(i ^ ~0x70a, 0, i_70_);
	if (!isValidArchiveId(i_70_))
	    return null;
	if (i != 73)
	    childArchiveBuffers = null;
	if ((((IndexTable) indexTable).maxChildEntry[i_70_] ^ 0xffffffff)
	    == -2)
	    return loadArchiveChild(i ^ ~0x70a, i_70_, 0);
	throw new RuntimeException();
    }
    
    final boolean method416(byte i, String name) {
	anInt631++;
	int i_71_ = getArchiveId("");
	if ((i_71_ ^ 0xffffffff) != 0)
	    return method403("", 7195, name);
	if (i != -74)
	    return false;
	return method403(name, 7195, "");
    }
    
    final int getArchiveId(String string) {
	anInt654++;
	if (!method399(false))
	    return -1;
	string = string.toLowerCase();
	int archiveId = ((IndexTable) indexTable).nameHashTable.getOffset(Class281.getNameHash(string, -29286));
	if (!isValidArchiveId(archiveId))
	    return -1;
	return archiveId;
    }
    
    private final boolean method418(int i, int i_73_, int i_74_) {
	anInt662++;
	if (!method399(false))
	    return false;
	if (i_74_ < i_73_ || (i ^ 0xffffffff) > -1 || ((i_74_ ^ 0xffffffff)
		<= (((IndexTable) indexTable).maxChildEntry.length
		    ^ 0xffffffff))
	    || ((i ^ 0xffffffff)
		<= (((IndexTable) indexTable).maxChildEntry[i_74_]
		    ^ 0xffffffff))) {
	    if (Class285.aBoolean4741)
		throw new IllegalArgumentException(String.valueOf(i_74_) + ","
						   + i);
	    return false;
	}
	return true;
    }
    
    private final int getArchiveLoadedPercent(int archiveId) {
	anInt653++;
	if (!isValidArchiveId(archiveId))
	    return 0;
	if (archiveBuffers[archiveId] != null)
	    return 100;
	return archiveLoader.getLoadedPercent(archiveId);
    }
    
    final boolean isLoaded(int archiveId, int childId) {
	anInt638++;
	if (!method418(childId, 0, archiveId))
	    return false;
	if (childArchiveBuffers[archiveId] != null && childArchiveBuffers[archiveId][childId] != null)
	    return true;
	if (archiveBuffers[archiveId] != null)
	    return true;
	loadArchive(archiveId);
	if (archiveBuffers[archiveId] != null)
	    return true;
	return false;
    }
    
    final boolean getArchiveLoaded(boolean bool, int i) {
	anInt661++;
	if (!method399(bool))
	    return false;
	if (((IndexTable) indexTable).maxChildEntry.length == 1)
	    return isLoaded(0, i);
	if (!isValidArchiveId(i))
	    return false;
	if (((IndexTable) indexTable).maxChildEntry[i] == 1)
	    return isLoaded(i, 0);
	if (bool != false)
	    return false;
	throw new RuntimeException();
    }
    
    final boolean method422(String string, String string_78_, int i) {
	try {
	    anInt668++;
	    if (!method399(false))
		return false;
	    string_78_ = string_78_.toLowerCase();
	    if (i > -18)
		anInt669 = 40;
	    string = string.toLowerCase();
	    int i_79_
		= ((IndexTable) indexTable).nameHashTable
		      .getOffset(Class281.getNameHash(string_78_, -29286));
	    if ((i_79_ ^ 0xffffffff) > -1)
		return false;
	    int i_80_
		= ((IndexTable) indexTable).childHashTables[i_79_]
		      .getOffset(Class281.getNameHash(string, -29286));
	    if (i_80_ < 0)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("in.M("
					     + (string != null ? "{...}"
						: "null")
					     + ','
					     + (string_78_ != null ? "{...}"
						: "null")
					     + ',' + i + ')'));
	}
    }
    
    final int getNameHashIndex(int i) {
	anInt649++;
	if (!method399(false))
	    return -1;
	int i_82_ = ((IndexTable) indexTable).nameHashTable.getOffset(i);
	if (!isValidArchiveId(i_82_))
	    return -1;
	return i_82_;
    }
    
    IndexLoader(AbtractArchiveLoader loader, boolean direct, int unpack) {
	if (unpack < 0 || unpack > 2)
	    throw new IllegalArgumentException
		      ("js5: Invalid value " + unpack
		       + " supplied for discardunpacked");
	archiveLoader = loader;
	directlyAllocate = direct;
	((IndexLoader) this).unpackSettings = unpack;
    }
    
    static {
	anInt666 = 100;
    }
}
