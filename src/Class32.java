/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class32
{
    static int anInt447;
    private int anInt448;
    static int anInt449;
    static int anInt450;
    static int anInt451 = -1;
    private SubNode[] aClass348_Sub42Array452;
    private long aLong453;
    private SubNode aClass348_Sub42_454;
    static int anInt455;
    
    final SubNode method334(long l, byte i) {
	try {
	    aLong453 = l;
	    anInt449++;
	    SubNode class348_sub42
		= aClass348_Sub42Array452[(int) ((long) (anInt448 - 1) & l)];
	    for (aClass348_Sub42_454
		     = ((SubNode) class348_sub42).subnodeParent;
		 class348_sub42 != aClass348_Sub42_454;
		 aClass348_Sub42_454 = (((SubNode) aClass348_Sub42_454)
					.subnodeParent)) {
		if ((l ^ 0xffffffffffffffffL)
		    == (((SubNode) aClass348_Sub42_454).subnodeKey
			^ 0xffffffffffffffffL)) {
		    SubNode class348_sub42_0_ = aClass348_Sub42_454;
		    aClass348_Sub42_454
			= (((SubNode) aClass348_Sub42_454)
			   .subnodeParent);
		    return class348_sub42_0_;
		}
	    }
	    if (i <= 0)
		aClass348_Sub42_454 = null;
	    aClass348_Sub42_454 = null;
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "ib.C(" + l + ',' + i + ')');
	}
    }
    
    final void method335(SubNode class348_sub42, int i, long l) {
	try {
	    anInt447++;
	    if (i != -8098)
		aClass348_Sub42_454 = null;
	    if (((SubNode) class348_sub42).subnodeChild != null)
		class348_sub42.removeSubnode();
	    SubNode class348_sub42_1_
		= aClass348_Sub42Array452[(int) (l & (long) (anInt448 - 1))];
	    ((SubNode) class348_sub42).subnodeChild
		= ((SubNode) class348_sub42_1_).subnodeChild;
	    ((SubNode) class348_sub42).subnodeParent
		= class348_sub42_1_;
	    ((SubNode) (((SubNode) class348_sub42)
			       .subnodeChild)).subnodeParent
		= class348_sub42;
	    ((SubNode) (((SubNode) class348_sub42)
			       .subnodeParent)).subnodeChild
		= class348_sub42;
	    ((SubNode) class348_sub42).subnodeKey = l;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ib.A("
					     + (class348_sub42 != null
						? "{...}" : "null")
					     + ',' + i + ',' + l + ')'));
	}
    }
    
    Class32(int i) {
	aClass348_Sub42Array452 = new SubNode[i];
	anInt448 = i;
	for (int i_2_ = 0; i_2_ < i; i_2_++) {
	    SubNode class348_sub42
		= aClass348_Sub42Array452[i_2_] = new SubNode();
	    ((SubNode) class348_sub42).subnodeParent
		= class348_sub42;
	    ((SubNode) class348_sub42).subnodeChild
		= class348_sub42;
	}
    }
    
    final SubNode method336(boolean bool) {
	anInt455++;
	if (aClass348_Sub42_454 == null)
	    return null;
	if (bool != true)
	    return null;
	for (SubNode class348_sub42
		 = aClass348_Sub42Array452[(int) (aLong453
						  & (long) (-1 + anInt448))];
	     class348_sub42 != aClass348_Sub42_454;
	     aClass348_Sub42_454 = (((SubNode) aClass348_Sub42_454)
				    .subnodeParent)) {
	    if ((((SubNode) aClass348_Sub42_454).subnodeKey
		 ^ 0xffffffffffffffffL)
		== (aLong453 ^ 0xffffffffffffffffL)) {
		SubNode class348_sub42_3_ = aClass348_Sub42_454;
		aClass348_Sub42_454 = (((SubNode) aClass348_Sub42_454)
				       .subnodeParent);
		return class348_sub42_3_;
	    }
	}
	aClass348_Sub42_454 = null;
	return null;
    }
}
