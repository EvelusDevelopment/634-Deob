/* Class55_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class55_Sub1 extends Class55
{
    static boolean aBoolean5265 = false;
    static int anInt5266;
    private IndexLoader aClass45_5267;
    static int anInt5268;
    private int[] anIntArray5269;
    private int anInt5270;
    static LocationMode aClass364_5271 = new LocationMode("LIVE", 0);
    private int anInt5272;
    static int anInt5273;
    private ByteBuffer aClass348_Sub49_5274;
    private byte[][] aByteArrayArray5275 = new byte[10][];
    private ByteBuffer aClass348_Sub49_5276;
    
    final void method522(byte i) {
	anInt5266++;
	if (anIntArray5269 != null && i < -27) {
	    for (int i_0_ = 0;
		 i_0_ < 10 && anIntArray5269.length > anInt5270 + i_0_;
		 i_0_++) {
		if (aByteArrayArray5275[i_0_] == null
		    && aClass45_5267.isLoaded((anIntArray5269
						[i_0_ + anInt5270]),
					       0))
		    aByteArrayArray5275[i_0_]
			= aClass45_5267.loadArchiveChild(-1860,
						  (anIntArray5269
						   [anInt5270 + i_0_]),
						  0);
	    }
	}
    }
    
    public static void method523(int i) {
	if (i <= 80)
	    method524(-87, true, 104, 0);
	aClass364_5271 = null;
    }
    
    private Class55_Sub1(int i, IndexLoader class45, int i_1_) {
	super(i);
	aClass348_Sub49_5274 = new ByteBuffer(null);
	aClass348_Sub49_5276 = new ByteBuffer(null);
	aClass45_5267 = class45;
	anInt5272 = i_1_;
    }
    
    static final void method524(int i, boolean bool, int i_2_, int i_3_) {
	if (i_3_ > -108)
	    aBoolean5265 = false;
	if (Class27.aClass356_389.get((long) i_2_) == null) {
	    if (!Class38.aBoolean510)
		Class303.method2285(bool, (byte) -90, i_2_);
	    else {
		Class348_Sub15 class348_sub15
		    = new Class348_Sub15(i_2_,
					 new Class55_Sub1(4096,
							  (VarbitDefinition
							   .indexLoader36),
							  i_2_),
					 i, bool);
		((Class348_Sub15) class348_sub15).aClass55_Sub1_6768.method509
		    (-92,
		     Class59_Sub2.aStringArray5305[Class348_Sub33.gameLanguage]);
		Class27.aClass356_389.putNode((long) i_2_,
						 class348_sub15);
	    }
	}
	anInt5268++;
    }
    
    final int method516(byte i, byte[] is) throws IOException {
	anInt5273++;
	if (anIntArray5269 == null) {
	    if (!aClass45_5267.isLoaded(anInt5272, 0))
		return 0;
	    byte[] is_4_ = aClass45_5267.loadArchiveChild(-1860, anInt5272, 0);
	    if (is_4_ == null)
		throw new IllegalStateException("");
	    ((ByteBuffer) aClass348_Sub49_5276).payload = is_4_;
	    ((ByteBuffer) aClass348_Sub49_5276).position = 0;
	    int i_5_ = is_4_.length >> 994128513;
	    anIntArray5269 = new int[i_5_];
	    for (int i_6_ = 0; (i_5_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff);
		 i_6_++)
		anIntArray5269[i_6_]
		    = aClass348_Sub49_5276.getShort();
	}
	if (anInt5270 >= anIntArray5269.length)
	    return -1;
	method522((byte) -74);
	if (i != 21)
	    aByteArrayArray5275 = null;
	((ByteBuffer) aClass348_Sub49_5276).payload = is;
	((ByteBuffer) aClass348_Sub49_5276).position = 0;
	while ((((ByteBuffer) aClass348_Sub49_5276).payload.length
		^ 0xffffffff)
	       < (((ByteBuffer) aClass348_Sub49_5276).position
		  ^ 0xffffffff)) {
	    if (((ByteBuffer) aClass348_Sub49_5274).payload
		== null) {
		if (aByteArrayArray5275[0] == null) {
		    ((ByteBuffer) aClass348_Sub49_5276).payload
			= null;
		    return ((ByteBuffer) aClass348_Sub49_5276).position;
		}
		((ByteBuffer) aClass348_Sub49_5274).payload
		    = aByteArrayArray5275[0];
	    }
	    int i_7_ = (-((ByteBuffer) aClass348_Sub49_5276).position
			+ (((ByteBuffer) aClass348_Sub49_5276)
			   .payload).length);
	    int i_8_ = (-((ByteBuffer) aClass348_Sub49_5274).position
			+ (((ByteBuffer) aClass348_Sub49_5274)
			   .payload).length);
	    if ((i_7_ ^ 0xffffffff) <= (i_8_ ^ 0xffffffff)) {
		aClass348_Sub49_5276.putBytes
		    (i_8_, ((ByteBuffer) aClass348_Sub49_5274).position,
		     ((ByteBuffer) aClass348_Sub49_5274).payload);
		((ByteBuffer) aClass348_Sub49_5274).position = 0;
		((ByteBuffer) aClass348_Sub49_5274).payload = null;
		anInt5270++;
		for (int i_9_ = 0; i_9_ < 9; i_9_++)
		    aByteArrayArray5275[i_9_] = aByteArrayArray5275[i_9_ - -1];
		aByteArrayArray5275[9] = null;
		if (anInt5270 >= anIntArray5269.length) {
		    ((ByteBuffer) aClass348_Sub49_5276).payload
			= null;
		    return ((ByteBuffer) aClass348_Sub49_5276).position;
		}
	    } else {
		aClass348_Sub49_5274.getBytes
		    (((ByteBuffer) aClass348_Sub49_5276).payload, ((ByteBuffer) aClass348_Sub49_5276).position, i_7_);
		((ByteBuffer) aClass348_Sub49_5276).payload = null;
		return is.length;
	    }
	}
	((ByteBuffer) aClass348_Sub49_5276).payload = null;
	return is.length;
    }
}
