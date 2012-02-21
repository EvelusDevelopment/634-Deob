/* TextureLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class TextureLoader implements d
{
    static int anInt4609 = -1;
    static int anInt4610;
    private TextureDefinition[] definitions;
    static int anInt4612;
    static int anInt4613;
    static int anInt4614;
    static long aLong4615;
    static int anInt4616;
    static int anInt4617;
    static int anInt4618;
    private IndexLoader aClass45_4619;
    static int anInt4620;
    static int anInt4621;
    private Class308 aClass308_4622 = new Class308(256);
    static int[] anIntArray4623 = new int[8];
    private IndexLoader indexLoader;
    private int anInt4625;
    static float aFloat4626;
    
    public final int[] method6(int i, int i_0_, float f, int i_1_,
			       boolean bool, int i_2_) {
	if (i != -21540)
	    getTexture(-46, 6);
	anInt4617++;
	return method1881(i_1_, false).method3183(this, i_2_, i_0_,
						  (((TextureDefinition)
						    definitions[i_1_])
						   .aBoolean207),
						  (double) f, indexLoader,
						  (byte) 11);
    }
    
    public static void method1880(int i) {
	if (i >= -103)
	    anInt4610 = -87;
	anIntArray4623 = null;
    }
    
    private final Class348_Sub42_Sub5 method1881(int i, boolean bool) {
	anInt4620++;
	SubNode class348_sub42
	    = aClass308_4622.method2302((long) i, (byte) -34);
	if (class348_sub42 != null)
	    return (Class348_Sub42_Sub5) class348_sub42;
	byte[] is = aClass45_4619.method415((byte) 73, i);
	if (is == null)
	    return null;
	if (bool != false)
	    method1(-58, 1.9039171F, false, -106, -22, -18);
	Class348_Sub42_Sub5 class348_sub42_sub5
	    = new Class348_Sub42_Sub5(new ByteBuffer(is));
	aClass308_4622.method2305((long) i, class348_sub42_sub5, -1);
	return class348_sub42_sub5;
    }
    
    public final TextureDefinition getTexture(int i, int i_3_) {
	anInt4621++;
	if (i_3_ != -6662)
	    return null;
	return definitions[i];
    }
    
    public final int[] method5(boolean bool, int i, float f, int i_4_,
			       int i_5_, int i_6_) {
	int i_7_ = 41 / ((i_6_ - -69) / 48);
	anInt4614++;
	return method1881(i, false).method3185(i_4_, this, 0,
					       ((TextureDefinition) (definitions
							   [i])).aBoolean207,
					       (double) f, bool, indexLoader,
					       i_5_);
    }
    
    public final boolean method4(int i, int i_8_) {
	anInt4616++;
	Class348_Sub42_Sub5 class348_sub42_sub5 = method1881(i_8_, false);
	if (i != -7953)
	    method4(56, -109);
	if (class348_sub42_sub5 == null
	    || !class348_sub42_sub5.method3184(this, indexLoader, -85))
	    return false;
	return true;
    }
    
    public final float[] method1(int i, float f, boolean bool, int i_9_,
				 int i_10_, int i_11_) {
	if (i_9_ != -30824)
	    return null;
	anInt4612++;
	return method1881(i_11_, false).method3186(i, this,
						   (((TextureDefinition)
						     definitions[i_11_])
						    .aBoolean207),
						   i_10_, indexLoader, -20);
    }
    
    public final int method2(boolean bool) {
	anInt4618++;
	if (bool != true)
	    aLong4615 = -52L;
	return anInt4625;
    }
    
    TextureLoader(IndexLoader class45, IndexLoader class45_12_, IndexLoader class45_13_) {
	try {
	    aClass45_4619 = class45_12_;
	    indexLoader = class45_13_;
	    ByteBuffer buffer
		= new ByteBuffer(class45.loadArchiveChild(-1860, 0, 0));
	    anInt4625 = buffer.getShort();
	    definitions = new TextureDefinition[anInt4625];
	    for (int i = 0; (i ^ 0xffffffff) > (anInt4625 ^ 0xffffffff); i++) {
		if (buffer.getUByte() == 1)
		    definitions[i] = new TextureDefinition();
	    }
	    for (int i = 0; i < anInt4625; i++) {
		if (definitions[i] != null)
		    ((TextureDefinition) definitions[i]).aBoolean209
			= buffer.getUByte() == 0;
	    }
	    for (int i = 0; (anInt4625 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		if (definitions[i] != null)
		    ((TextureDefinition) definitions[i]).aBoolean199
			= buffer.getUByte() == 1;
	    }
	    for (int i = 0; anInt4625 > i; i++) {
		if (definitions[i] != null)
		    ((TextureDefinition) definitions[i]).aBoolean204
			= buffer.getUByte() == 1;
	    }
	    for (int i = 0; i < anInt4625; i++) {
		if (definitions[i] != null)
		    ((TextureDefinition) definitions[i]).aByte216
			= buffer.getByte();
	    }
	    for (int i = 0; (anInt4625 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		if (definitions[i] != null)
		    ((TextureDefinition) definitions[i]).aByte201
			= buffer.getByte();
	    }
	    for (int i = 0; i < anInt4625; i++) {
		if (definitions[i] != null)
		    ((TextureDefinition) definitions[i]).aByte213
			= buffer.getByte();
	    }
	    for (int i = 0; i < anInt4625; i++) {
		if (definitions[i] != null)
		    ((TextureDefinition) definitions[i]).aByte202
			= buffer.getByte();
	    }
	    for (int i = 0; i < anInt4625; i++) {
		if (definitions[i] != null)
		    ((TextureDefinition) definitions[i]).aShort208
			= (short) buffer.getShort();
	    }
	    for (int i = 0; (i ^ 0xffffffff) > (anInt4625 ^ 0xffffffff); i++) {
		if (definitions[i] != null)
		    ((TextureDefinition) definitions[i]).aByte198
			= buffer.getByte();
	    }
	    for (int i = 0; (i ^ 0xffffffff) > (anInt4625 ^ 0xffffffff); i++) {
		if (definitions[i] != null)
		    ((TextureDefinition) definitions[i]).aByte211
			= buffer.getByte();
	    }
	    for (int i = 0; (i ^ 0xffffffff) > (anInt4625 ^ 0xffffffff); i++) {
		if (definitions[i] != null)
		    ((TextureDefinition) definitions[i]).aBoolean212
			= (buffer.getUByte() ^ 0xffffffff) == -2;
	    }
	    for (int i = 0; (i ^ 0xffffffff) > (anInt4625 ^ 0xffffffff); i++) {
		if (definitions[i] != null)
		    ((TextureDefinition) definitions[i]).aBoolean207
			= buffer.getUByte() == 1;
	    }
	    for (int i = 0; i < anInt4625; i++) {
		if (definitions[i] != null)
		    ((TextureDefinition) definitions[i]).aByte205
			= buffer.getByte();
	    }
	    for (int i = 0; i < anInt4625; i++) {
		if (definitions[i] != null)
		    ((TextureDefinition) definitions[i]).aBoolean217
			= (buffer.getUByte() ^ 0xffffffff) == -2;
	    }
	    for (int i = 0; anInt4625 > i; i++) {
		if (definitions[i] != null)
		    ((TextureDefinition) definitions[i]).aBoolean215
			= (buffer.getUByte() ^ 0xffffffff) == -2;
	    }
	    for (int i = 0; anInt4625 > i; i++) {
		if (definitions[i] != null)
		    ((TextureDefinition) definitions[i]).aBoolean218
			= buffer.getUByte() == 1;
	    }
	    for (int i = 0; i < anInt4625; i++) {
		if (definitions[i] != null)
		    ((TextureDefinition) definitions[i]).anInt203
			= buffer.getUByte();
	    }
	    for (int i = 0; anInt4625 > i; i++) {
		if (definitions[i] != null)
		    ((TextureDefinition) definitions[i]).anInt206
			= buffer.getDWord();
	    }
	    for (int i = 0; anInt4625 > i; i++) {
		if (definitions[i] != null)
		    ((TextureDefinition) definitions[i]).anInt200
			= buffer.getUByte();
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("tda.<init>(" + (class45 != null ? "{...}" : "null")
			+ ',' + (class45_12_ != null ? "{...}" : "null") + ','
			+ (class45_13_ != null ? "{...}" : "null") + ')'));
	}
    }
    
    static {
	anInt4610 = 328;
	aLong4615 = 0L;
    }
}
