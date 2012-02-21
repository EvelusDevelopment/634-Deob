/* Sprite - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Sprite
{
    byte[] alphaIndex;
    int indexHeight;
    int[] colors;
    int widthPadding;
    byte[] colorIndex;
    int heightOffset;
    int heightPadding;
    int indexWidth;
    int widthOffset;
    
    final int getIndexWidthTotal() {
	return (((Sprite) this).indexWidth + ((Sprite) this).widthOffset + ((Sprite) this).widthPadding);
    }
    
    final void method1511(int i) {
	int i_0_ = -1;
	if (((Sprite) this).colors.length < 255) {
	    for (int i_1_ = 0; i_1_ < ((Sprite) this).colors.length;
		 i_1_++) {
		if (((Sprite) this).colors[i_1_] == i) {
		    i_0_ = i_1_;
		    break;
		}
	    }
	    if (i_0_ == -1) {
		i_0_ = ((Sprite) this).colors.length;
		int[] is
		    = new int[((Sprite) this).colors.length + 1];
		Class214.method1578(((Sprite) this).colors, 0, is, 0,
				    ((Sprite) this).colors.length);
		((Sprite) this).colors = is;
		is[i_0_] = i;
	    }
	} else {
	    int i_2_ = 2147483647;
	    int i_3_ = i >> 16 & 0xff;
	    int i_4_ = i >> 8 & 0xff;
	    int i_5_ = i & 0xff;
	    for (int i_6_ = 0; i_6_ < ((Sprite) this).colors.length;
		 i_6_++) {
		int i_7_ = ((Sprite) this).colors[i_6_];
		int i_8_ = i_7_ >> 16 & 0xff;
		int i_9_ = i_7_ >> 8 & 0xff;
		int i_10_ = i_7_ & 0xff;
		int i_11_ = i_3_ - i_8_;
		if (i_11_ < 0)
		    i_11_ = -i_11_;
		int i_12_ = i_4_ - i_9_;
		if (i_12_ < 0)
		    i_12_ = -i_12_;
		int i_13_ = i_5_ - i_10_;
		if (i_13_ < 0)
		    i_13_ = -i_13_;
		int i_14_ = i_11_ + i_12_ + i_13_;
		if (i_14_ < i_2_) {
		    i_2_ = i_14_;
		    i_0_ = i_6_;
		}
	    }
	}
	for (int i_15_ = ((Sprite) this).indexHeight - 1; i_15_ > 0; i_15_--) {
	    int i_16_ = i_15_ * ((Sprite) this).indexWidth;
	    for (int i_17_ = ((Sprite) this).indexWidth - 1; i_17_ > 0;
		 i_17_--) {
		if (((((Sprite) this).colors
		      [((Sprite) this).colorIndex[i_17_ + i_16_] & 0xff])
		     == 0)
		    && (((Sprite) this).colors
			[((((Sprite) this).colorIndex
			   [i_17_ + i_16_ - 1 - ((Sprite) this).indexWidth])
			  & 0xff)]) != 0)
		    ((Sprite) this).colorIndex[i_17_ + i_16_]
			= (byte) i_0_;
	    }
	}
    }
    
    static final Sprite loadSingleSprite(IndexLoader class45, int i) {
	byte[] is = class45.method415((byte) 73, i);
	if (is == null)
	    return null;
	return initialize(is)[0];
    }
    
    final void unpack(int i) {
	int i_18_ = getIndexWidthTotal();
	int i_19_ = getIndexHeightTotal();
	if (((Sprite) this).indexWidth != i_18_
	    || ((Sprite) this).indexHeight != i_19_) {
	    int i_20_ = i;
	    if (i_20_ > ((Sprite) this).widthOffset)
		i_20_ = ((Sprite) this).widthOffset;
	    int i_21_ = i;
	    if ((i_21_ + ((Sprite) this).widthOffset
		 + ((Sprite) this).indexWidth)
		> i_18_)
		i_21_ = (i_18_ - ((Sprite) this).widthOffset
			 - ((Sprite) this).indexWidth);
	    int i_22_ = i;
	    if (i_22_ > ((Sprite) this).heightOffset)
		i_22_ = ((Sprite) this).heightOffset;
	    int i_23_ = i;
	    if ((i_23_ + ((Sprite) this).heightOffset
		 + ((Sprite) this).indexHeight)
		> i_19_)
		i_23_ = (i_19_ - ((Sprite) this).heightOffset
			 - ((Sprite) this).indexHeight);
	    int i_24_ = ((Sprite) this).indexWidth + i_20_ + i_21_;
	    int i_25_ = ((Sprite) this).indexHeight + i_22_ + i_23_;
	    byte[] is = new byte[i_24_ * i_25_];
	    if (((Sprite) this).alphaIndex == null) {
		for (int i_26_ = 0; i_26_ < ((Sprite) this).indexHeight;
		     i_26_++) {
		    int i_27_ = i_26_ * ((Sprite) this).indexWidth;
		    int i_28_ = (i_26_ + i_22_) * i_24_ + i_20_;
		    for (int i_29_ = 0; i_29_ < ((Sprite) this).indexWidth;
			 i_29_++)
			is[i_28_++]
			    = ((Sprite) this).colorIndex[i_27_++];
		}
	    } else {
		byte[] is_30_ = new byte[i_24_ * i_25_];
		for (int i_31_ = 0; i_31_ < ((Sprite) this).indexHeight;
		     i_31_++) {
		    int i_32_ = i_31_ * ((Sprite) this).indexWidth;
		    int i_33_ = (i_31_ + i_22_) * i_24_ + i_20_;
		    for (int i_34_ = 0; i_34_ < ((Sprite) this).indexWidth;
			 i_34_++) {
			is_30_[i_33_]
			    = ((Sprite) this).alphaIndex[i_32_];
			is[i_33_++]
			    = ((Sprite) this).colorIndex[i_32_++];
		    }
		}
		((Sprite) this).alphaIndex = is_30_;
	    }
	    ((Sprite) this).widthOffset -= i_20_;
	    ((Sprite) this).heightOffset -= i_22_;
	    ((Sprite) this).widthPadding -= i_21_;
	    ((Sprite) this).heightPadding -= i_23_;
	    ((Sprite) this).indexWidth = i_24_;
	    ((Sprite) this).indexHeight = i_25_;
	    ((Sprite) this).colorIndex = is;
	}
    }
    
    final void reflectX() {
	byte[] is = ((Sprite) this).colorIndex;
	if (((Sprite) this).alphaIndex == null) {
	    for (int i = (((Sprite) this).indexHeight >> 1) - 1; i >= 0; i--) {
		int i_35_ = i * ((Sprite) this).indexWidth;
		int i_36_ = ((((Sprite) this).indexHeight - i - 1)
			     * ((Sprite) this).indexWidth);
		for (int i_37_ = -((Sprite) this).indexWidth; i_37_ < 0;
		     i_37_++) {
		    byte i_38_ = is[i_35_];
		    is[i_35_] = is[i_36_];
		    is[i_36_] = i_38_;
		    i_35_++;
		    i_36_++;
		}
	    }
	} else {
	    byte[] is_39_ = ((Sprite) this).alphaIndex;
	    for (int i = (((Sprite) this).indexHeight >> 1) - 1; i >= 0; i--) {
		int i_40_ = i * ((Sprite) this).indexWidth;
		int i_41_ = ((((Sprite) this).indexHeight - i - 1)
			     * ((Sprite) this).indexWidth);
		for (int i_42_ = -((Sprite) this).indexWidth; i_42_ < 0;
		     i_42_++) {
		    byte i_43_ = is[i_40_];
		    is[i_40_] = is[i_41_];
		    is[i_41_] = i_43_;
		    i_43_ = is_39_[i_40_];
		    is_39_[i_40_] = is_39_[i_41_];
		    is_39_[i_41_] = i_43_;
		    i_40_++;
		    i_41_++;
		}
	    }
	}
	int i = ((Sprite) this).heightOffset;
	((Sprite) this).heightOffset = ((Sprite) this).heightPadding;
	((Sprite) this).heightPadding = i;
    }
    
    final void replaceSomething(int color) {
	int index = -1;
	if (((Sprite) this).colors.length < 255) {
	    for (int j = 0; j < ((Sprite) this).colors.length; j++) {
		if (((Sprite) this).colors[j] == color) {
		    index = j;
		    break;
		}
	    }
	    if (index == -1) {
		index = ((Sprite) this).colors.length;
		int[] is = new int[((Sprite) this).colors.length + 1];
		Class214.method1578(((Sprite) this).colors, 0, is, 0, ((Sprite) this).colors.length);
		((Sprite) this).colors = is;
		is[index] = color;
	    }
	} else {
	    int cc = 2147483647;
	    int r = color >> 16 & 0xff;
	    int g = color >> 8 & 0xff;
	    int b = color & 0xff;
	    for (int i = 0; i < ((Sprite) this).colors.length; i++) {
		int c = ((Sprite) this).colors[i];
		int rc = c >> 16 & 0xff;
		int gc = c >> 8 & 0xff;
		int bc = c & 0xff;
		int dr = r - rc;
		if (dr < 0)
		    dr = -dr;
		int dg = g - gc;
		if (dg < 0)
		    dg = -dg;
		int db = b - bc;
		if (db < 0)
		    db = -db;
		int sum = dr + dg + db;
		if (sum < cc) {
		    cc = sum;
		    index = i;
		}
	    }
	}
	int i_59_ = 0;
	byte[] replacementColors = (new byte[((Sprite) this).indexWidth * ((Sprite) this).indexHeight]);
	for (int y = 0; y < ((Sprite) this).indexHeight; y++) {
	    for (int x = 0; x < ((Sprite) this).indexWidth; x++) {
		int ci = ((Sprite) this).colorIndex[i_59_] & 0xff;
		if (((Sprite) this).colors[ci] == 0) {
		    if (x > 0 && (((Sprite) this).colors[(((Sprite) this).colorIndex[i_59_ - 1] & 0xff)]) != 0)
			ci = index;
		    else if (y > 0
			     && (((Sprite) this).colors
				 [((((Sprite) this).colorIndex
				    [i_59_ - ((Sprite) this).indexWidth])
				   & 0xff)]) != 0)
			ci = index;
		    else if (x < ((Sprite) this).indexWidth - 1
			     && (((Sprite) this).colors
				 [(((Sprite) this).colorIndex[i_59_ + 1]
				   & 0xff)]) != 0)
			ci = index;
		    else if (y < ((Sprite) this).indexHeight - 1
			     && (((Sprite) this).colors
				 [((((Sprite) this).colorIndex
				    [i_59_ + ((Sprite) this).indexWidth])
				   & 0xff)]) != 0)
			ci = index;
		}
		replacementColors[i_59_++] = (byte) ci;
	    }
	}
	((Sprite) this).colorIndex = replacementColors;
    }
    
    final int[] toPixelArray() {
	int widthTotal = getIndexWidthTotal();
	int[] pixels = new int[widthTotal * getIndexHeightTotal()];
	if (((Sprite) this).alphaIndex != null) {
	    for (int y = 0; y < ((Sprite) this).indexHeight; y++) {
		int srcOff = y * ((Sprite) this).indexWidth;
		int destOff = (((Sprite) this).widthOffset + (y + ((Sprite) this).heightOffset) * widthTotal);
		for (int i_66_ = 0; i_66_ < ((Sprite) this).indexWidth; i_66_++) {
		    pixels[destOff++] = (((Sprite) this).alphaIndex[srcOff] << 24 | (((Sprite) this).colors[(((Sprite) this).colorIndex[srcOff] & 0xff)]));
		    srcOff++;
		}
	    }
	} else {
	    for (int i_67_ = 0; i_67_ < ((Sprite) this).indexHeight; i_67_++) {
		int i_68_ = i_67_ * ((Sprite) this).indexWidth;
		int i_69_ = (((Sprite) this).widthOffset
			     + (i_67_ + ((Sprite) this).heightOffset) * widthTotal);
		for (int i_70_ = 0; i_70_ < ((Sprite) this).indexWidth;
		     i_70_++) {
		    int i_71_
			= (((Sprite) this).colors
			   [((Sprite) this).colorIndex[i_68_++] & 0xff]);
		    if (i_71_ != 0)
			pixels[i_69_++] = ~0xffffff | i_71_;
		    else
			pixels[i_69_++] = 0;
		}
	    }
	}
	return pixels;
    }
    
    private static final Sprite[] initialize(byte[] is) {
	ByteBuffer buffer = new ByteBuffer(is);
	((ByteBuffer) buffer).position = is.length - 2;
	int children = buffer.getShort();
	Sprite[] class207s = new Sprite[children];
	for (int i_72_ = 0; i_72_ < children; i_72_++)
	    class207s[i_72_] = new Sprite();
	((ByteBuffer) buffer).position = is.length - 7 - children * 8;
	int width = buffer.getShort();
	int height = buffer.getShort();
	int amountColors = (buffer.getUByte() & 0xff) + 1;
	for (int i = 0; i < children; i++)
	    ((Sprite) class207s[i]).widthOffset = buffer.getShort();
	for (int i = 0; i < children; i++)
	    ((Sprite) class207s[i]).heightOffset
		= buffer.getShort();
	for (int i_78_ = 0; i_78_ < children; i_78_++)
	    ((Sprite) class207s[i_78_]).indexWidth = buffer.getShort();
	for (int i_79_ = 0; i_79_ < children; i_79_++)
	    ((Sprite) class207s[i_79_]).indexHeight = buffer.getShort();
	for (int i_80_ = 0; i_80_ < children; i_80_++) {
	    Sprite class207 = class207s[i_80_];
	    ((Sprite) class207).widthPadding = (width - ((Sprite) class207).indexWidth - ((Sprite) class207).widthOffset);
	    ((Sprite) class207).heightPadding = (height - ((Sprite) class207).indexHeight - ((Sprite) class207).heightOffset);
	}
	((ByteBuffer) buffer).position = is.length - 7 - children * 8 - (amountColors - 1) * 3;
	int[] colors = new int[amountColors];
	for (int i_82_ = 1; i_82_ < amountColors; i_82_++) {
	    colors[i_82_] = buffer.getTri();
	    if (colors[i_82_] == 0)
		colors[i_82_] = 1;
	}
	for (int i_83_ = 0; i_83_ < children; i_83_++)
	    ((Sprite) class207s[i_83_]).colors = colors;
	((ByteBuffer) buffer).position = 0;
	for (int i_84_ = 0; i_84_ < children; i_84_++) {
	    Sprite class207 = class207s[i_84_];
	    int area = (((Sprite) class207).indexWidth * ((Sprite) class207).indexHeight);
	    ((Sprite) class207).colorIndex = new byte[area];
	    int i_86_ = buffer.getUByte();
	    if ((i_86_ & 0x2) == 0) {
		if ((i_86_ & 0x1) == 0) {
		    for (int i_87_ = 0; i_87_ < area; i_87_++)
			((Sprite) class207).colorIndex[i_87_] = buffer.getByte();
		} else {
		    for (int i_88_ = 0;
			 i_88_ < ((Sprite) class207).indexWidth; i_88_++) {
			for (int i_89_ = 0;
			     i_89_ < ((Sprite) class207).indexHeight; i_89_++)
			    ((Sprite) class207).colorIndex[(i_88_ + i_89_ * ((Sprite) class207).indexWidth)] = buffer.getByte();
		    }
		}
	    } else {
		boolean bool = false;
		((Sprite) class207).alphaIndex = new byte[area];
		if ((i_86_ & 0x1) == 0) {
		    for (int i_90_ = 0; i_90_ < area; i_90_++)
			((Sprite) class207).colorIndex[i_90_]
			    = buffer.getByte();
		    for (int i_91_ = 0; i_91_ < area; i_91_++) {
			byte i_92_
			    = (((Sprite) class207).alphaIndex[i_91_]
			       = buffer.getByte());
			bool = bool | i_92_ != -1;
		    }
		} else {
		    for (int i_93_ = 0;
			 i_93_ < ((Sprite) class207).indexWidth; i_93_++) {
			for (int i_94_ = 0;
			     i_94_ < ((Sprite) class207).indexHeight; i_94_++)
			    ((Sprite) class207).colorIndex[(i_93_ + i_94_ * ((Sprite) class207).indexWidth)] = buffer.getByte();
		    }
		    for (int i_95_ = 0; i_95_ < ((Sprite) class207).indexWidth; i_95_++) {
			for (int i_96_ = 0; i_96_ < ((Sprite) class207).indexHeight; i_96_++) {
			    byte i_97_ = (((Sprite) class207).alphaIndex[i_95_ + i_96_ * (((Sprite) class207).indexWidth)] = buffer.getByte());
			    bool = bool | i_97_ != -1;
			}
		    }
		}
		if (!bool)
		    ((Sprite) class207).alphaIndex = null;
	    }
	}
	return class207s;
    }
    
    final void reflectY() {
	byte[] is = ((Sprite) this).colorIndex;
	if (((Sprite) this).alphaIndex == null) {
	    for (int i = ((Sprite) this).indexHeight - 1; i >= 0; i--) {
		int i_98_ = i * ((Sprite) this).indexWidth;
		for (int i_99_ = (i + 1) * ((Sprite) this).indexWidth;
		     i_98_ < i_99_; i_98_++) {
		    i_99_--;
		    byte i_100_ = is[i_98_];
		    is[i_98_] = is[i_99_];
		    is[i_99_] = i_100_;
		}
	    }
	} else {
	    byte[] is_101_ = ((Sprite) this).alphaIndex;
	    for (int i = ((Sprite) this).indexHeight - 1; i >= 0; i--) {
		int i_102_ = i * ((Sprite) this).indexWidth;
		for (int i_103_ = (i + 1) * ((Sprite) this).indexWidth;
		     i_102_ < i_103_; i_102_++) {
		    i_103_--;
		    byte i_104_ = is[i_102_];
		    is[i_102_] = is[i_103_];
		    is[i_103_] = i_104_;
		    i_104_ = is_101_[i_102_];
		    is_101_[i_102_] = is_101_[i_103_];
		    is_101_[i_103_] = i_104_;
		}
	    }
	}
	int i = ((Sprite) this).widthOffset;
	((Sprite) this).widthOffset = ((Sprite) this).widthPadding;
	((Sprite) this).widthPadding = i;
    }
    
    static final Sprite[] loadSprites(IndexLoader class45, int i, int i_105_) {
	byte[] is = class45.loadArchiveChild(-1860, i, i_105_);
	if (is == null)
	    return null;
	return initialize(is);
    }
    
    final void rotateCw90() {
	byte[] is
	    = (new byte
	       [((Sprite) this).indexWidth * ((Sprite) this).indexHeight]);
	int i = 0;
	if (((Sprite) this).alphaIndex == null) {
	    for (int i_106_ = 0; i_106_ < ((Sprite) this).indexWidth;
		 i_106_++) {
		for (int i_107_ = ((Sprite) this).indexHeight - 1; i_107_ >= 0;
		     i_107_--)
		    is[i++]
			= (((Sprite) this).colorIndex
			   [i_106_ + i_107_ * ((Sprite) this).indexWidth]);
	    }
	    ((Sprite) this).colorIndex = is;
	} else {
	    byte[] is_108_ = new byte[(((Sprite) this).indexWidth
				       * ((Sprite) this).indexHeight)];
	    for (int i_109_ = 0; i_109_ < ((Sprite) this).indexWidth;
		 i_109_++) {
		for (int i_110_ = ((Sprite) this).indexHeight - 1; i_110_ >= 0;
		     i_110_--) {
		    is[i] = (((Sprite) this).colorIndex
			     [i_109_ + i_110_ * ((Sprite) this).indexWidth]);
		    is_108_[i++]
			= (((Sprite) this).alphaIndex
			   [i_109_ + i_110_ * ((Sprite) this).indexWidth]);
		}
	    }
	    ((Sprite) this).colorIndex = is;
	    ((Sprite) this).alphaIndex = is_108_;
	}
	int i_111_ = ((Sprite) this).heightOffset;
	((Sprite) this).heightOffset = ((Sprite) this).widthOffset;
	((Sprite) this).widthOffset = ((Sprite) this).heightPadding;
	((Sprite) this).heightPadding = ((Sprite) this).widthPadding;
	((Sprite) this).widthPadding = ((Sprite) this).heightOffset;
	i_111_ = ((Sprite) this).indexHeight;
	((Sprite) this).indexHeight = ((Sprite) this).indexWidth;
	((Sprite) this).indexWidth = i_111_;
    }
    
    public Sprite() {
	/* empty */
    }
    
    static final Sprite loadSingleSprite(IndexLoader class45, int i, int i_112_) {
	byte[] is = class45.loadArchiveChild(-1860, i, i_112_);
	if (is == null)
	    return null;
	return initialize(is)[0];
    }
    
    final int getIndexHeightTotal() {
	return (((Sprite) this).indexHeight + ((Sprite) this).heightOffset + ((Sprite) this).heightPadding);
    }
    
    static final Sprite[] method1523(IndexLoader class45, int i) {
	byte[] is = class45.method415((byte) 73, i);
	if (is == null)
	    return null;
	return initialize(is);
    }
    
    final void method1524() {
	int i = getIndexWidthTotal();
	int i_113_ = getIndexHeightTotal();
	if (((Sprite) this).indexWidth != i
	    || ((Sprite) this).indexHeight != i_113_) {
	    byte[] is = new byte[i * i_113_];
	    if (((Sprite) this).alphaIndex != null) {
		byte[] is_114_ = new byte[i * i_113_];
		for (int i_115_ = 0; i_115_ < ((Sprite) this).indexHeight;
		     i_115_++) {
		    int i_116_ = i_115_ * ((Sprite) this).indexWidth;
		    int i_117_ = ((i_115_ + ((Sprite) this).heightOffset) * i
				  + ((Sprite) this).widthOffset);
		    for (int i_118_ = 0; i_118_ < ((Sprite) this).indexWidth;
			 i_118_++) {
			is[i_117_] = ((Sprite) this).colorIndex[i_116_];
			is_114_[i_117_++]
			    = ((Sprite) this).alphaIndex[i_116_++];
		    }
		}
		((Sprite) this).alphaIndex = is_114_;
	    } else {
		for (int i_119_ = 0; i_119_ < ((Sprite) this).indexHeight;
		     i_119_++) {
		    int i_120_ = i_119_ * ((Sprite) this).indexWidth;
		    int i_121_ = ((i_119_ + ((Sprite) this).heightOffset) * i
				  + ((Sprite) this).widthOffset);
		    for (int i_122_ = 0; i_122_ < ((Sprite) this).indexWidth;
			 i_122_++)
			is[i_121_++]
			    = ((Sprite) this).colorIndex[i_120_++];
		}
	    }
	    ((Sprite) this).widthOffset = ((Sprite) this).widthPadding
		= ((Sprite) this).heightOffset = ((Sprite) this).heightPadding
		= 0;
	    ((Sprite) this).indexWidth = i;
	    ((Sprite) this).indexHeight = i_113_;
	    ((Sprite) this).colorIndex = is;
	}
    }
}
