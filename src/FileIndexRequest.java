/* FileIndexRequest - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class FileIndexRequest extends FileRequest
{
    int type;
    FileIndex fileIndex;
    static int anInt10459;
    static int anInt10460;
    byte[] payload;
    static int anInt10462;
    static int anInt10463 = 0;
    static int anInt10464;
    static HashTable aClass356_10465 = new HashTable(16);
    
    static final boolean isConsoleActive() {
	anInt10459++;
	return OutgoingPacket.consoleActive;
    }
    
    public static void method3264(byte i) {
	aClass356_10465 = null;
	if (i != -24)
	    chain(null, null);
    }
    
    final int getPercentComplete() {
	anInt10460++;
	if (((FileRequest) this).isActive)
	    return 0;
	return 100;
    }
    
    static final void chain(Node child, Node parent) {
	try {
	    if (((Node) child).nodeChild != null)
		child.removeNode();
	    anInt10462++;
	    ((Node) child).nodeChild = ((Node) parent).nodeChild;
	    ((Node) child).nodeParent = parent;
	    ((Node) ((Node) child).nodeChild).nodeParent = child;
	    ((Node) ((Node) child).nodeParent).nodeChild = child;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("qh.K("
					     + (child != null ? "{...}"
						: "null")
					     + ','
					     + (parent != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    final byte[] getPayload() {
	anInt10464++;
	if (((FileRequest) this).isActive)
	    throw new RuntimeException();
	return ((FileIndexRequest) this).payload;
    }
    
    public FileIndexRequest() {
	/* empty */
    }
}
