/* BasicImageFetcher - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

final class BasicImageFetcher extends AbstractImageFetcher
{
    private Shape clipShape;
    private Canvas canvas;
    private Image image;
    private Rectangle clip;
    
    final void drawImage(Graphics graphics, int x, int y, int xOff, int  yOff, int w, int h) {
	clipShape = graphics.getClip();
	clip.x = x;
	clip.width = w;
	clip.y = y;
	clip.height = h;
	graphics.setClip(clip);
	graphics.drawImage(image, x - xOff,  y - yOff, canvas);
	graphics.setClip(clipShape);
    }
    
    final void initialize(Canvas c, int i, int i_6_, int i_7_) {
	canvas = c;
	clip = new Rectangle();
	((BasicImageFetcher) this).width = i;
	((BasicImageFetcher) this).height = i_7_;
	((BasicImageFetcher) this).pixelBuffer
	    = new int[(((BasicImageFetcher) this).height * ((BasicImageFetcher) this).width)];
	DataBufferInt databufferint
	    = new DataBufferInt(((BasicImageFetcher) this).pixelBuffer,
				(((BasicImageFetcher) this)
				 .pixelBuffer).length);
	if (i_6_ > -42)
	    initialize(null, 6, -14, 63);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster = Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel((((BasicImageFetcher) this).width), (((BasicImageFetcher) this).height))),databufferint, null);
	image = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
    }
}
