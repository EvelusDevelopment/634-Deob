/* Class348_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub35 extends Node
{
    static int anInt6975;
    int anInt6976;
    static Class74 aClass74_6977 = new Class74(8, 3);
    static Deque aClass262_6978;
    static int anInt6979 = 0;
    static IndexLoader indexLoader3;
    static int anInt6981;
    
    static final void method3027(byte i) {
	anInt6975++;
	if (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		.aClass239_Sub27_7261.method1840(-32350) == 0
	    && Class355.anInt4372 != Class167.anInt2204)
	    Class348_Sub41.method3157(Class327.anInt4095, (byte) 123,
				      AbstractToolkit.anInt4581, 11, false);
	else {
	    Class348_Sub46.method3319(Class348_Sub8.currentToolkit, (byte) -121);
	    if (i != 33)
		method3028(-79);
	    if ((Class355.anInt4372 ^ 0xffffffff)
		!= (Class318_Sub1_Sub3_Sub5.anInt10395 ^ 0xffffffff))
		Class348_Sub40_Sub9.method3072((byte) -96);
	}
    }
    
    public static void method3028(int i) {
	if (i != -11677)
	    method3027((byte) -80);
	aClass74_6977 = null;
	indexLoader3 = null;
	aClass262_6978 = null;
    }
    
    public Class348_Sub35() {
	/* empty */
    }
    
    Class348_Sub35(int i) {
	((Class348_Sub35) this).anInt6976 = i;
    }
    
    static {
	aClass262_6978 = new Deque();
    }
}
