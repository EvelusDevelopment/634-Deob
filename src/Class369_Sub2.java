/* Class369_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class369_Sub2 extends Class369
{
    static Widget[][] aClass46ArrayArray8584;
    int anInt8585;
    static int anInt8586;
    static int anInt8587 = 0;
    static int anInt8588;
    static IndexLoader indexLoader9;
    static IncomingPacket aClass114_8590 = new IncomingPacket(58, 2);
    int anInt8591;
    static Object anObject8592;
    static int anInt8593;
    
    public final Class223 method51(byte i) {
	if (i < 116)
	    method3572(118);
	anInt8586++;
	return ByteBuffer.aClass223_7175;
    }
    
    static final IndexLoader createIndexLoader(boolean bool, int i, int setting) {
	anInt8593++;
	FileIndex fileIndex = null;
	if (Class299_Sub2.mainIndexBufferedFile != null)
	    fileIndex = new FileIndex(i, Class299_Sub2.mainIndexBufferedFile, Class100.bufferedCacheFiles[i], 1000000);
	Class13.indexLoaders[i] = Class175.aClass340_2327.method2673(fileIndex, i,  Class277.tableFileIndex, 255);
	Class13.indexLoaders[i].method2346(27872);
	return new IndexLoader(Class13.indexLoaders[i], bool, setting);
    }
    
    Class369_Sub2(Class221 class221, Class341 class341, int i, int i_2_,
		  int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_,
		  int i_9_) {
	super(class221, class341, i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_);
	try {
	    ((Class369_Sub2) this).anInt8585 = i_9_;
	    ((Class369_Sub2) this).anInt8591 = i_8_;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ou.<init>("
					     + (class221 != null ? "{...}"
						: "null")
					     + ','
					     + (class341 != null ? "{...}"
						: "null")
					     + ',' + i + ',' + i_2_ + ','
					     + i_3_ + ',' + i_4_ + ',' + i_5_
					     + ',' + i_6_ + ',' + i_7_ + ','
					     + i_8_ + ',' + i_9_ + ')'));
	}
    }
    
    public static void method3572(int i) {
	aClass114_8590 = null;
	indexLoader9 = null;
	if (i != 1000000)
	    createIndexLoader(false, -66, 13);
	aClass46ArrayArray8584 = null;
	anObject8592 = null;
    }
}
