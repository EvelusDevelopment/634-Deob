/* StringNode - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class StringNode extends Node
{
    static int anInt7210;
    String value;
    static byte[][] aByteArrayArray7212;
    static int anInt7213 = 0;
    static int anInt7214;
    
    public static void method3418(int i) {
	if (i >= 108)
	    aByteArrayArray7212 = null;
    }
    
    static final void method3419(int i) {
	Class348_Sub24.anIntArray6878 = null;
	Class318_Sub9_Sub1.anIntArray8785 = null;
	Class348_Sub40_Sub6.anIntArray9135 = null;
	anInt7210++;
	if (i != 13022)
	    method3418(-79);
	Class348_Sub42_Sub3.aBoolean9498 = false;
	Class265.anIntArray4692 = null;
	Class348_Sub8.anIntArray6655 = null;
    }
    
    public StringNode() {
	/* empty */
    }
    
    StringNode(String string) {
	((StringNode) this).value = string;
    }
    
    static final int method3420(int i) {
	if (i != 0)
	    method3420(101);
	anInt7214++;
	return GameBuffer.method3405(2012104999, false);
    }
}
