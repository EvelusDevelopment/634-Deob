/* SubNode - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class SubNode extends Node
{
    long subnodeKey;
    static Class2 aClass2_7058;
    static int anInt7059 = 0;
    SubNode subnodeChild;
    static int anInt7061;
    static int anInt7062;
    SubNode subnodeParent;
    static int anInt7064;
    
    public static void method3161(int i) {
	if (i != 0)
	    method3161(-27);
	aClass2_7058 = null;
    }
    
    final void removeSubnode() {
	anInt7064++;
	if (((SubNode) this).subnodeChild != null) {
	    ((SubNode) ((SubNode) this).subnodeChild).subnodeParent = ((SubNode) this).subnodeParent;
	    ((SubNode) ((SubNode) this).subnodeParent).subnodeChild = ((SubNode) this).subnodeChild;
	    ((SubNode) this).subnodeChild = null;
	    ((SubNode) this).subnodeParent = null;
	}
    }
    
    static final void method3163(byte i) {
	Class328_Sub1.anInt6513 = 0;
	anInt7062++;
	if (i == -114) {
	    for (int i_0_ = 0; i_0_ < 2048; i_0_++) {
		Class154.aClass348_Sub49Array2105[i_0_] = null;
		IntegerVarScriptSettingLoader.aByteArray3300[i_0_] = (byte) 1;
		Class348_Sub17.aClass359Array6802[i_0_] = null;
	    }
	}
    }
    
    final boolean method3164(byte i) {
	anInt7061++;
	if (((SubNode) this).subnodeChild == null)
	    return false;
	if (i != 1)
	    removeSubnode();
	return true;
    }
    
    public SubNode() {
	/* empty */
    }
    
    static {
	aClass2_7058 = new Class2();
    }
}
