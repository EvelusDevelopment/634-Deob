/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class117
{
    static int anInt1763;
    private int anInt1764;
    static int anInt1765;
    static OutgoingPacket aClass351_1766 = new OutgoingPacket(74, -1);
    HashTable aClass356_1767;
    static int anInt1768;
    static int anInt1769;
    private HashTable aClass356_1770;
    static int anInt1771;
    static int anInt1772;
    static int anInt1773;
    private String aString1774 = "null";
    static int anInt1775;
    static int anInt1776;
    static int anInt1777;
    char aChar1778;
    char aChar1779;
    static int anInt1780 = 0;
    
    public static void method1064(int i) {
	if (i != -3)
	    aClass351_1766 = null;
	aClass351_1766 = null;
    }
    
    private final void method1065(ByteBuffer class348_sub49, int i,
				  int i_0_) {
	if ((i_0_ ^ 0xffffffff) == -2)
	    ((Class117) this).aChar1778
		= Class50_Sub1.method462(class348_sub49.getByte(), -128);
	else if ((i_0_ ^ 0xffffffff) == -3)
	    ((Class117) this).aChar1779
		= Class50_Sub1.method462(class348_sub49.getByte(),
					 -128);
	else if ((i_0_ ^ 0xffffffff) == -4)
	    aString1774 = class348_sub49.getJStr();
	else if (i_0_ == 4)
	    anInt1764 = class348_sub49.getDWord();
	else if (i_0_ == 5 || (i_0_ ^ 0xffffffff) == -7) {
	    int i_1_ = class348_sub49.getShort();
	    ((Class117) this).aClass356_1767
		= new HashTable(Class33.method340(i_1_, (byte) 108));
	    for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
		int i_3_ = class348_sub49.getDWord();
		Node class348;
		if (i_0_ != 5)
		    class348
			= new Class348_Sub35(class348_sub49
						 .getDWord());
		else
		    class348 = new StringNode(class348_sub49
						      .getJStr());
		((Class117) this).aClass356_1767
		    .putNode((long) i_3_, class348);
	    }
	}
	anInt1765++;
	if (i != -21424)
	    method1068((byte) -15);
    }
    
    final boolean method1066(boolean bool, String string) {
	anInt1776++;
	if (((Class117) this).aClass356_1767 == null)
	    return false;
	if (bool != false)
	    aClass356_1770 = null;
	if (aClass356_1770 == null)
	    method1071(true);
	for (Class348_Sub46 class348_sub46
		 = ((Class348_Sub46)
		    aClass356_1770.get(GametipDefinition.method2179(string,
								  (byte) 109)));
	     class348_sub46 != null;
	     class348_sub46
		 = (Class348_Sub46) aClass356_1770.method3476(true)) {
	    if (((Class348_Sub46) class348_sub46).aString7111.equals(string))
		return true;
	}
	return false;
    }
    
    final boolean method1067(boolean bool, int i) {
	anInt1773++;
	if (((Class117) this).aClass356_1767 == null)
	    return false;
	if (bool != true)
	    return true;
	if (aClass356_1770 == null)
	    method1068((byte) 120);
	Class348_Sub35 class348_sub35
	    = (Class348_Sub35) aClass356_1770.get((long) i);
	if (class348_sub35 == null)
	    return false;
	return true;
    }
    
    private final void method1068(byte i) {
	anInt1772++;
	aClass356_1770
	    = new HashTable(((Class117) this).aClass356_1767.method3475(true));
	for (Class348_Sub35 class348_sub35
		 = ((Class348_Sub35)
		    ((Class117) this).aClass356_1767.method3484(0));
	     class348_sub35 != null;
	     class348_sub35 = (Class348_Sub35) ((Class117) this)
						   .aClass356_1767
						   .method3482(0)) {
	    Class348_Sub35 class348_sub35_4_
		= new Class348_Sub35((int) ((Node) class348_sub35)
					   .nodeKey);
	    aClass356_1770.putNode((long) (((Class348_Sub35) class348_sub35)
					      .anInt6976),
				      class348_sub35_4_);
	}
	if (i < 85)
	    method1069(111, null);
    }
    
    final void method1069(int i, ByteBuffer class348_sub49) {
	anInt1763++;
	for (;;) {
	    int i_5_ = class348_sub49.getUByte();
	    if (i_5_ == 0)
		break;
	    method1065(class348_sub49, i + -21424, i_5_);
	}
	if (i != 0)
	    aString1774 = null;
    }
    
    static final void method1070(byte i, int i_6_) {
	if (i < 109)
	    anInt1780 = 10;
	anInt1769++;
	if (GameBuffer.anIntArray9757 == null
	    || GameBuffer.anIntArray9757.length < i_6_)
	    GameBuffer.anIntArray9757 = new int[i_6_];
    }
    
    private final void method1071(boolean bool) {
	aClass356_1770
	    = new HashTable(((Class117) this).aClass356_1767.method3475(bool));
	anInt1768++;
	for (StringNode class348_sub50
		 = ((StringNode)
		    ((Class117) this).aClass356_1767.method3484(0));
	     class348_sub50 != null;
	     class348_sub50 = (StringNode) ((Class117) this)
						   .aClass356_1767
						   .method3482(0)) {
	    Class348_Sub46 class348_sub46
		= new Class348_Sub46((((StringNode) class348_sub50)
				      .value),
				     (int) (((Node) class348_sub50)
					    .nodeKey));
	    aClass356_1770.putNode(GametipDefinition.method2179((((StringNode)
							    class348_sub50)
							   .value),
							  (byte) 120),
				      class348_sub46);
	}
    }
    
    static final void method1072(IndexLoader class45, byte i) {
	if (i >= -91)
	    method1070((byte) -93, 92);
	Class239_Sub12.aClass45_5964 = class45;
	anInt1771++;
    }
    
    final int method1073(boolean bool, int i) {
	if (bool != false)
	    method1067(false, -31);
	anInt1775++;
	if (((Class117) this).aClass356_1767 == null)
	    return anInt1764;
	Class348_Sub35 class348_sub35
	    = ((Class348_Sub35)
	       ((Class117) this).aClass356_1767.get((long) i));
	if (class348_sub35 == null)
	    return anInt1764;
	return ((Class348_Sub35) class348_sub35).anInt6976;
    }
    
    public Class117() {
	/* empty */
    }
    
    final String method1074(int i, int i_7_) {
	anInt1777++;
	if (i_7_ <= 60)
	    return null;
	if (((Class117) this).aClass356_1767 == null)
	    return aString1774;
	StringNode class348_sub50
	    = ((StringNode)
	       ((Class117) this).aClass356_1767.get((long) i));
	if (class348_sub50 == null)
	    return aString1774;
	return ((StringNode) class348_sub50).value;
    }
}
