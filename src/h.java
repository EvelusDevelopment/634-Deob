/* h - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class h extends AbstractFontRasterizer implements ModelToolkit
{
    long nativeid;
    
    h(SafeToolkit var_oa, ya var_ya, BitmapFont class143, Sprite[] class207s,
      RasterToolkit[] class105s) {
	super(var_oa, class143);
	byte[][] is = new byte[class207s.length][];
	int[] is_0_ = new int[class207s.length];
	int[] is_1_ = new int[class207s.length];
	int[] is_2_ = new int[class207s.length];
	int[] is_3_ = new int[class207s.length];
	for (int i = 0; i < class207s.length; i++) {
	    is[i] = ((Sprite) class207s[i]).colorIndex;
	    is_0_[i] = ((Sprite) class207s[i]).indexWidth;
	    is_1_[i] = ((Sprite) class207s[i]).indexHeight;
	    is_2_[i] = ((Sprite) class207s[i]).widthOffset;
	    is_3_[i] = ((Sprite) class207s[i]).heightOffset;
	}
	JA(var_oa, var_ya, is, is_0_, is_1_, is_2_, is_3_);
    }
    
    protected final void finalize() {
	if (((h) this).nativeid != 0L)
	    Class257.method1947(0, this);
    }
    
    public final native void w(boolean bool);
    
    final native void drawCharacter(char c, int i, int i_4_, int i_5_, boolean bool);
    
    final void drawCharacter(char c, int i, int i_6_, int i_7_, boolean bool,
			  aa var_aa, int i_8_, int i_9_) {
	NA(c, i, i_6_, i_7_, bool, var_aa, i_8_, i_9_);
    }
    
    private final native void NA(char c, int i, int i_10_, int i_11_,
				 boolean bool, aa var_aa, int i_12_,
				 int i_13_);
    
    private final native void JA(SafeToolkit var_oa, ya var_ya, byte[][] is,
				 int[] is_14_, int[] is_15_, int[] is_16_,
				 int[] is_17_);
}
