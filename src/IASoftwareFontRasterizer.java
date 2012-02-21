/* IASoftwareFontRasterizer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class IASoftwareFontRasterizer extends AbstractFontRasterizer
{
    private int[] indexWidths;
    private byte[][] alphaIndices;
    private int[] indexHeights;
    private SoftwareToolkit softwareToolkit;
    private int[] widthOffsets;
    private int[] heightOffsets;
    
    IASoftwareFontRasterizer(SoftwareToolkit toolkit, BitmapFont font, Sprite[] sprites,
		  int[] is, int[] is_0_) {
	super(toolkit, font);
	softwareToolkit = toolkit;
	indexWidths = is;
	indexHeights = is_0_;
	alphaIndices = new byte[sprites.length][];
	heightOffsets = new int[sprites.length];
	widthOffsets = new int[sprites.length];
	for (int i = 0; i < sprites.length; i++) {
	    Sprite class207 = sprites[i];
	    if (((Sprite) class207).alphaIndex != null)
		alphaIndices[i] = ((Sprite) class207).alphaIndex;
	    else {
		byte[] is_1_ = ((Sprite) class207).colorIndex;
		byte[] is_2_ = alphaIndices[i] = new byte[is_1_.length];
		for (int i_3_ = 0; i_3_ < is_1_.length; i_3_++)
		    is_2_[i_3_] = (byte) (is_1_[i_3_] == 0 ? 0 : -1);
	    }
	    heightOffsets[i] = ((Sprite) class207).heightOffset;
	    widthOffsets[i] = ((Sprite) class207).widthOffset;
	}
    }
    
    private final void draw(byte[] alphaIndex, int[] is_4_, int i, int i_5_,
				  int i_6_, int i_7_, int i_8_, int i_9_,
				  int i_10_, int i_11_, int i_12_, int i_13_,
				  aa var_aa, int i_14_, int i_15_) {
	aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
	int[] is_16_ = ((aa_Sub3) var_aa_Sub3).anIntArray5201;
	int[] is_17_ = ((aa_Sub3) var_aa_Sub3).anIntArray5202;
	int i_18_ = i_11_ - ((SoftwareToolkit) softwareToolkit).widthOffset;
	int i_19_ = i_12_;
	if (i_15_ > i_19_) {
	    i_19_ = i_15_;
	    i_6_ += (i_15_ - i_12_) * ((SoftwareToolkit) softwareToolkit).maxWidth;
	    i_5_ += (i_15_ - i_12_) * i_13_;
	}
	int i_20_ = (i_15_ + is_16_.length < i_12_ + i_8_
		     ? i_15_ + is_16_.length : i_12_ + i_8_);
	for (int i_21_ = i_19_; i_21_ < i_20_; i_21_++) {
	    int i_22_ = is_16_[i_21_ - i_15_] + i_14_;
	    int i_23_ = is_17_[i_21_ - i_15_];
	    int i_24_ = i_7_;
	    if (i_18_ > i_22_) {
		int i_25_ = i_18_ - i_22_;
		if (i_25_ >= i_23_) {
		    i_5_ += i_7_ + i_10_;
		    i_6_ += i_7_ + i_9_;
		    continue;
		}
		i_23_ -= i_25_;
	    } else {
		int i_26_ = i_22_ - i_18_;
		if (i_26_ >= i_7_) {
		    i_5_ += i_7_ + i_10_;
		    i_6_ += i_7_ + i_9_;
		    continue;
		}
		i_5_ += i_26_;
		i_24_ -= i_26_;
		i_6_ += i_26_;
	    }
	    int i_27_ = 0;
	    if (i_24_ < i_23_)
		i_23_ = i_24_;
	    else
		i_27_ = i_24_ - i_23_;
	    for (int i_28_ = -i_23_; i_28_ < 0; i_28_++) {
		int alpha = alphaIndex[i_5_++] & 0xff;
		if (alpha != 0) {
		    int i_30_ = ((((i & 0xff00ff) * alpha & ~0xff00ff)
				  + ((i & 0xff00) * alpha & 0xff0000))
				 >> 8);
		    alpha = 256 - alpha;
		    int i_31_ = is_4_[i_6_];
		    is_4_[i_6_++] = ((((i_31_ & 0xff00ff) * alpha & ~0xff00ff)
				      + ((i_31_ & 0xff00) * alpha & 0xff0000))
				     >> 8) + i_30_;
		} else
		    i_6_++;
	    }
	    i_5_ += i_27_ + i_10_;
	    i_6_ += i_27_ + i_9_;
	}
    }
    
    private final void draw(byte[] is, int[] is_32_, int i, int i_33_,
				  int i_34_, int i_35_, int i_36_, int i_37_,
				  int i_38_) {
	for (int i_39_ = -i_36_; i_39_ < 0; i_39_++) {
	    for (int i_40_ = -i_35_; i_40_ < 0; i_40_++) {
		int i_41_ = is[i_33_++] & 0xff;
		if (i_41_ != 0) {
		    int i_42_ = ((((i & 0xff00ff) * i_41_ & ~0xff00ff)
				  + ((i & 0xff00) * i_41_ & 0xff0000))
				 >> 8);
		    i_41_ = 256 - i_41_;
		    int i_43_ = is_32_[i_34_];
		    is_32_[i_34_++]
			= ((((i_43_ & 0xff00ff) * i_41_ & ~0xff00ff)
			    + ((i_43_ & 0xff00) * i_41_ & 0xff0000))
			   >> 8) + i_42_;
		} else
		    i_34_++;
	    }
	    i_34_ += i_37_;
	    i_33_ += i_38_;
	}
    }
    
    final void drawCharacter(char c, int i, int i_44_, int i_45_, boolean bool,
			  aa var_aa, int i_46_, int i_47_) {
	if (var_aa == null)
	    drawCharacter(c, i, i_44_, i_45_, bool);
	else {
	    i += widthOffsets[c];
	    i_44_ += heightOffsets[c];
	    int i_48_ = indexWidths[c];
	    int i_49_ = indexHeights[c];
	    int i_50_ = ((SoftwareToolkit) softwareToolkit).maxWidth;
	    int i_51_ = i + i_44_ * i_50_;
	    int i_52_ = i_50_ - i_48_;
	    int i_53_ = 0;
	    int i_54_ = 0;
	    if (i_44_ < ((SoftwareToolkit) softwareToolkit).heightOffset) {
		int i_55_ = ((SoftwareToolkit) softwareToolkit).heightOffset - i_44_;
		i_49_ -= i_55_;
		i_44_ = ((SoftwareToolkit) softwareToolkit).heightOffset;
		i_54_ += i_55_ * i_48_;
		i_51_ += i_55_ * i_50_;
	    }
	    if (i_44_ + i_49_ > ((SoftwareToolkit) softwareToolkit).height)
		i_49_ -= i_44_ + i_49_ - ((SoftwareToolkit) softwareToolkit).height;
	    if (i < ((SoftwareToolkit) softwareToolkit).widthOffset) {
		int i_56_ = ((SoftwareToolkit) softwareToolkit).widthOffset - i;
		i_48_ -= i_56_;
		i = ((SoftwareToolkit) softwareToolkit).widthOffset;
		i_54_ += i_56_;
		i_51_ += i_56_;
		i_53_ += i_56_;
		i_52_ += i_56_;
	    }
	    if (i + i_48_ > ((SoftwareToolkit) softwareToolkit).width) {
		int i_57_ = i + i_48_ - ((SoftwareToolkit) softwareToolkit).width;
		i_48_ -= i_57_;
		i_53_ += i_57_;
		i_52_ += i_57_;
	    }
	    if (i_48_ > 0 && i_49_ > 0)
		draw(alphaIndices[c],
			   ((SoftwareToolkit) softwareToolkit).pixelBuffer, i_45_,
			   i_54_, i_51_, i_48_, i_49_, i_52_, i_53_, i, i_44_,
			   indexWidths[c], var_aa, i_46_, i_47_);
	}
    }
    
    final void drawCharacter(char ch, int x, int y, int color, boolean bool) {
	x += widthOffsets[ch];
	y += heightOffsets[ch];
	int indexWidth = indexWidths[ch];
	int indexHeight = indexHeights[ch];
	int toolkitWidth = ((SoftwareToolkit) softwareToolkit).maxWidth;
	int destOff = x + y * toolkitWidth;
	int padding = toolkitWidth - indexWidth;
	int i_65_ = 0;
	int i_66_ = 0;
	if (y < ((SoftwareToolkit) softwareToolkit).heightOffset) {
	    int heightPadding = ((SoftwareToolkit) softwareToolkit).heightOffset - y;
	    indexHeight -= heightPadding;
	    y = ((SoftwareToolkit) softwareToolkit).heightOffset;
	    i_66_ += heightPadding * indexWidth;
	    destOff += heightPadding * toolkitWidth;
	}
	if (y + indexHeight > ((SoftwareToolkit) softwareToolkit).height)
	    indexHeight -= y + indexHeight - ((SoftwareToolkit) softwareToolkit).height;
	if (x < ((SoftwareToolkit) softwareToolkit).widthOffset) {
	    int i_68_ = ((SoftwareToolkit) softwareToolkit).widthOffset - x;
	    indexWidth -= i_68_;
	    x = ((SoftwareToolkit) softwareToolkit).widthOffset;
	    i_66_ += i_68_;
	    destOff += i_68_;
	    i_65_ += i_68_;
	    padding += i_68_;
	}
	if (x + indexWidth > ((SoftwareToolkit) softwareToolkit).width) {
	    int i_69_ = x + indexWidth - ((SoftwareToolkit) softwareToolkit).width;
	    indexWidth -= i_69_;
	    i_65_ += i_69_;
	    padding += i_69_;
	}
	if (indexWidth > 0 && indexHeight > 0)
	    draw(alphaIndices[ch],
		       ((SoftwareToolkit) softwareToolkit).pixelBuffer, color, i_66_,
		       destOff, indexWidth, indexHeight, padding, i_65_);
    }
}
