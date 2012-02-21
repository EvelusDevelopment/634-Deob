/* DirectByteBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

final class DirectByteBuffer extends AbstractBuffer {
    private ByteBuffer byteBuffer;
    
    final byte[] get(int len, int position) {
	byte[] is = new byte[len];
	byteBuffer.position(position);
	byteBuffer.get(is, 0, len);
	return is;
    }
    
    final byte[] getPayload() {
	byte[] is = new byte[byteBuffer.capacity()];
	byteBuffer.position(0);
	byteBuffer.get(is);
	return is;
    }
    
    final void put(byte[] is) {
	byteBuffer = ByteBuffer.allocateDirect(is.length);
	byteBuffer.position(0);
	byteBuffer.put(is);
    }
}
