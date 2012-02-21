/* GraphicsFetcher - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;

final class GraphicsFetcher extends AbstractImageFetcher implements ImageProducer {
    static int anInt9068;
    static int[] anIntArray9069 = new int[1];
    static int tdlrRequestCounter;
    static int anInt9071;
    static int anInt9072;
    private Canvas canvas;
    static int anInt9074;
    private Image image;
    static int anInt9076;
    static int anInt9077;
    private ColorModel colorModel;
    static int anInt9079;
    static int anInt9080;
    static int anInt9081;
    static Class357[][][] aClass357ArrayArrayArray9082;
    private ImageConsumer anImageConsumer9083;
    
    private final synchronized void finalizeImage(int i, int i_0_, int i_1_,
					       int i_2_, int i_3_) {
	anInt9068++;
	if (anImageConsumer9083 != null) {
	    anImageConsumer9083.setPixels(i_1_, i_2_, i_3_, i, colorModel,
					  (((AbstractImageFetcher) this)
					   .pixelBuffer),
					  i_2_ * (((AbstractImageFetcher) this)
						  .width) + i_1_,
					  ((AbstractImageFetcher) this).width);
	    anImageConsumer9083.imageComplete(2);
	    if (i_0_ != 25786)
		anIntArray9069 = null;
	}
    }
    
    public static void method3016(int i) {
	if (i != 65280)
	    method3016(-19);
	anIntArray9069 = null;
	aClass357ArrayArrayArray9082 = null;
    }
    
    public final synchronized void removeConsumer
	(ImageConsumer imageconsumer) {
	if (imageconsumer == anImageConsumer9083)
	    anImageConsumer9083 = null;
	anInt9081++;
    }
    
    public final void startProduction(ImageConsumer imageconsumer) {
	addConsumer(imageconsumer);
	anInt9076++;
    }
    
    private final synchronized void finalizeImage(byte i) {
	anInt9071++;
	if (anImageConsumer9083 != null) {
	    anImageConsumer9083.setPixels(0, 0, ((AbstractImageFetcher) this).width, ((AbstractImageFetcher) this).height,
					  colorModel,
					  (((AbstractImageFetcher) this)
					   .pixelBuffer),
					  0,
					  ((AbstractImageFetcher) this).width);
	    anImageConsumer9083.imageComplete(2);
	}
    }
    
    public final synchronized void addConsumer(ImageConsumer imageconsumer) {
	anInt9072++;
	anImageConsumer9083 = imageconsumer;
	imageconsumer.setDimensions(((AbstractImageFetcher) this).width,
				    ((AbstractImageFetcher) this).height);
	imageconsumer.setProperties(null);
	imageconsumer.setColorModel(colorModel);
	imageconsumer.setHints(14);
    }
    
    public final synchronized boolean isConsumer(ImageConsumer imageconsumer) {
	anInt9080++;
	if (anImageConsumer9083 != imageconsumer)
	    return false;
	return true;
    }
    
    final void drawImage(Graphics graphics, int x, int y, int xOff, int yOff, int width, int height) {
	anInt9074++;
	finalizeImage(height, 25786, xOff, yOff, width);
	Shape shape = graphics.getClip();
	graphics.clipRect(x, y, width, height);
	graphics.drawImage(image, x - xOff, -yOff + y, canvas);
	graphics.setClip(shape);
    }
    
    final void initialize(Canvas canvas, int i, int i_11_, int i_12_) {
	((AbstractImageFetcher) this).height = i_12_;
	anInt9079++;
	((AbstractImageFetcher) this).width = i;
	canvas = canvas;
	((AbstractImageFetcher) this).pixelBuffer
	    = new int[(((AbstractImageFetcher) this).width * ((AbstractImageFetcher) this).height)];
	colorModel = new DirectColorModel(32, 16711680, 65280, 255);
	if (i_11_ <= -42) {
	    image = canvas.createImage(this);
	    finalizeImage((byte) -117);
	    canvas.prepareImage(image, canvas);
	    finalizeImage((byte) 86);
	    canvas.prepareImage(image, canvas);
	    finalizeImage((byte) 51);
	    canvas.prepareImage(image, canvas);
	}
    }
    
    public final void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
	tdlrRequestCounter++;
    }
}
