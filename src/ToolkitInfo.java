/* ToolkitInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ToolkitInfo
{
    String name;
    long driverVersion;
    String device;
    static Deque aClass262_4473;
    static int anInt4474 = 0;
    int version;
    int vendor;
    static IncomingPacket aClass114_4477;
    
    public static void method3518(int i) {
	aClass262_4473 = null;
	if (i != 88)
	    method3518(-49);
	aClass114_4477 = null;
    }
    
    ToolkitInfo(int vendor, String name, int version, String device, long driverVersion) {
	try {
	    ((ToolkitInfo) this).driverVersion = driverVersion;
	    ((ToolkitInfo) this).version = version;
	    ((ToolkitInfo) this).vendor = vendor;
	    ((ToolkitInfo) this).device = device;
	    ((ToolkitInfo) this).name = name;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("fia.<init>(" + vendor + ','
					     + (name != null ? "{...}"
						: "null")
					     + ',' + version + ','
					     + (device != null ? "{...}"
						: "null")
					     + ',' + driverVersion + ')'));
	}
    }
    
    static {
	aClass262_4473 = new Deque();
	aClass114_4477 = new IncomingPacket(88, 10);
    }
}
