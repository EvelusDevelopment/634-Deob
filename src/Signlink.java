/* Signlink - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

final class Signlink implements Runnable
{
    private Callback_Sub1 aCallback_Sub1_3776;
    boolean allowsFileOperations;
    static String osVersion;
    FileOnDisk tableIndexFile = null;
    static String osArch;
    private static volatile long aLong3781 = 0L;
    static String javaVendor;
    static Method aMethod3783;
    private static String os;
    FileOnDisk mainIndexFile = null;
    static Method aMethod3786;
    private Object anObject3787;
    FileOnDisk randomDatFile;
    private static String gameName;
    private Thread signlinkThread;
    private Object anObject3791;
    private static int fileStore;
    private Object anObject3793;
    boolean aBoolean3794;
    FileOnDisk[] cacheIndexFiles;
    static String javaVersion;
    private SignlinkRequest aClass144_3797;
    private SignlinkRequest aClass144_3798;
    EventQueue systemEventQueue;
    private static String userHome;
    private boolean aBoolean3801;
    private Class134 aClass134_3802;
    static String osName;
    /*synthetic*/ static Class aClass3804;
    /*synthetic*/ static Class aClass3805;
    /*synthetic*/ static Class aClass3806;
    /*synthetic*/ static Class aClass3807;
    
    final SignlinkRequest method2229(int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
	if (i_3_ != -11)
	    aLong3781 = 34L;
	return submitRequest(8, (i_1_ << -1229135248) - -i, 6,
			  i_0_ + (i_2_ << -1182263728), null);
    }
    
    final SignlinkRequest method2230(Class[] var_classes, int i, Class var_class,
			      String string) {
	if (i < 49)
	    return null;
	return submitRequest(8, 0, 8, 0,
			  new Object[] { var_class, string, var_classes });
    }
    
    static final FileOnDisk method2231(String string, int i) {
	if (i != -1141472112)
	    return null;
	return getPreferencesFileOnDisk(string, 12606, gameName, fileStore);
    }
    
    final SignlinkRequest method2232(int i, int i_4_) {
	if (i <= 20)
	    createThreadRequest(null, -123, -128);
	return submitRequest(8, 0, 3, i_4_, null);
    }
    
    final SignlinkRequest method2233(byte i, String string, boolean bool) {
	if (i != -46)
	    return null;
	if (!bool)
	    return submitRequest(8, 0, 13, 0, string);
	return submitRequest(8, 0, 12, 0, string);
    }
    
    public final void run() {
	for (;;) {
	    SignlinkRequest class144;
	    synchronized (this) {
		for (;;) {
		    if (aBoolean3801)
			return;
		    if (aClass144_3797 != null) {
			class144 = aClass144_3797;
			aClass144_3797
			    = ((SignlinkRequest) aClass144_3797).aClass144_1995;
			if (aClass144_3797 == null)
			    aClass144_3798 = null;
			break;
		    }
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    try {
		int i = ((SignlinkRequest) class144).anInt1994;
		if (i != 1) {
		    if ((i ^ 0xffffffff) != -23) {
			if (i == 2) {
			    Thread thread = new Thread((Runnable) (((SignlinkRequest) class144).objParam));
			    thread.setDaemon(true);
			    thread.start();
			    thread.setPriority(class144.intParam);
			    class144.returnObj = thread;
			} else if ((i ^ 0xffffffff) == -5) {
			    if ((aLong3781 ^ 0xffffffffffffffffL)
				< (Class62.getCurrentTimeMillis()
				   ^ 0xffffffffffffffffL))
				throw new IOException();
			    class144.returnObj
				= new DataInputStream(((URL)
						       (((SignlinkRequest) class144)
							.objParam))
							  .openStream());
			} else if (i != 8) {
			    if ((i ^ 0xffffffff) != -10) {
				if (i != 18) {
				    if (i == 19) {
					Transferable transferable
					    = ((Transferable)
					       (((SignlinkRequest) class144)
						.objParam));
					Clipboard clipboard
					    = Toolkit.getDefaultToolkit()
						  .getSystemClipboard();
					clipboard.setContents(transferable,
							      null);
				    } else if (((Signlink) this)
					       .allowsFileOperations) {
					if ((i ^ 0xffffffff) == -4) {
					    if (aLong3781
						> Class62.getCurrentTimeMillis())
						throw new IOException();
					    String string
						= ((String.valueOf
						    (0xff & (class144.intParam
							     >> 1726433208)))
						   + "."
						   + (0xff
						      & (class144.intParam
							 >> -1141472112))
						   + "."
						   + ((class144.intParam
						       >> 1095645000)
						      & 0xff)
						   + "."
						   + (0xff
						      & class144.intParam));
					    class144.returnObj
						= InetAddress.getByName
						      (string).getHostName();
					} else if (i == 21) {
					    if (Class62.getCurrentTimeMillis()
						< aLong3781)
						throw new IOException();
					    class144.returnObj
						= InetAddress.getByName
						      ((String)
						       (((SignlinkRequest) class144)
							.objParam))
						      .getAddress();
					} else if ((i ^ 0xffffffff) != -6) {
					    if (i != 6) {
						if ((i ^ 0xffffffff) == -8) {
						    if (((Signlink) this)
							.aBoolean3794)
							aClass134_3802
							    .method1147
							    (((Frame)
							      (((SignlinkRequest)
								class144)
							       .objParam)),
							     8);
						    else
							Class.forName
							    ("Class7")
							    .getMethod
							    ("method211",
							     new Class[0])
							    .invoke
							    (anObject3793,
							     new Object[0]);
						} else if (i == 12) {
						    FileOnDisk class234
							= (getPreferencesFileOnDisk
							   (((String)
							     (((SignlinkRequest)
							       class144)
							      .objParam)),
							    12606, gameName,
							    fileStore));
						    class144.returnObj
							= class234;
						} else if ((i ^ 0xffffffff)
							   != -14) {
						    if ((((Signlink) this)
							 .allowsFileOperations)
							&& i == 14) {
							int i_5_
							    = (class144
							       .intParam);
							int i_6_
							    = (((SignlinkRequest)
								class144)
							       .anInt1999);
							if (((Signlink) this)
							    .aBoolean3794)
							    aCallback_Sub1_3776
								.method3621
								(i_5_,
								 (byte) 115,
								 i_6_);
							else
							    Class.forName
								("Class165")
								.getDeclaredMethod
								("method1280",
								 (new Class[]
								  { (Integer
								     .TYPE),
								    (Integer
								     .TYPE) }))
								.invoke
								(anObject3791,
								 (new Object[]
								  { (new Integer
								     (i_5_)),
								    (new Integer
								     (i_6_)) }));
						    } else if ((((Signlink)
								 this)
								.allowsFileOperations)
							       && ((i
								    ^ 0xffffffff)
								   == -16)) {
							boolean bool
							    = (((class144
								 .intParam)
								^ 0xffffffff)
							       != -1);
							Component component
							    = ((Component)
							       (((SignlinkRequest)
								 class144)
								.objParam));
							if (((Signlink) this)
							    .aBoolean3794)
							    aCallback_Sub1_3776
								.method3622
								(bool, 13259,
								 component);
							else
							    Class.forName
								("Class165")
								.getDeclaredMethod
								("method1281",
								 (new Class[]
								  { ((aClass3804
								      != null)
								     ? aClass3804
								     : (aClass3804
									= (method2249
									   ("java.awt.Component")))),
								    (Boolean
								     .TYPE) }))
								.invoke
								(anObject3791,
								 (new Object[]
								  { component,
								    (new Boolean
								     (bool)) }));
						    } else if (!(((Signlink)
								  this)
								 .aBoolean3794)
							       && ((i
								    ^ 0xffffffff)
								   == -18)) {
							Object[] objects
							    = ((Object[])
							       (((SignlinkRequest)
								 class144)
								.objParam));
							Class.forName
							    ("Class165")
							    .getDeclaredMethod
							    ("method1282",
							     (new Class[]
							      { ((aClass3804
								  != null)
								 ? aClass3804
								 : (aClass3804
								    = (method2249
								       ("java.awt.Component")))),
								((aClass3805
								  != null)
								 ? aClass3805
								 : (aClass3805
								    = (method2249
								       ("[I")))),
								Integer.TYPE,
								Integer.TYPE,
								((aClass3806
								  != null)
								 ? aClass3806
								 : (aClass3806
								    = (method2249
								       ("java.awt.Point")))) }))
							    .invoke
							    (anObject3791,
							     (new Object[]
							      { ((Component)
								 objects[0]),
								((int[])
								 objects[1]),
								(new Integer
								 (class144
								  .intParam)),
								(new Integer
								 (((SignlinkRequest)
								   class144)
								  .anInt1999)),
								((Point)
								 (objects
								  [2])) }));
						    } else if ((i ^ 0xffffffff)
							       == -17) {
							try {
							    if (!osName
								     .startsWith
								 ("win"))
								throw new Exception
									  ();
							    String string
								= ((String)
								   (((SignlinkRequest)
								     class144)
								    .objParam));
							    if (!(string
								      .startsWith
								  ("http://"))
								&& !(string
									 .startsWith
								     ("https://")))
								throw new Exception
									  ();
							    String string_7_
								= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
							    for (int i_8_ = 0;
								 (((string
									.length
								    ())
								   ^ 0xffffffff)
								  < (i_8_
								     ^ 0xffffffff));
								 i_8_++) {
								if (((string_7_
									  .indexOf
								      (string
									   .charAt
								       (i_8_)))
								     ^ 0xffffffff)
								    == 0)
								    throw new Exception
									      ();
							    }
							    Runtime.getRuntime
								().exec
								("cmd /c start \"j\" \""
								 + string
								 + "\"");
							    class144
								.returnObj
								= null;
							} catch (Exception exception) {
							    class144
								.returnObj
								= exception;
							    throw exception;
							}
						    } else
							throw new Exception
								  ("");
						} else {
						    FileOnDisk class234
							= (getPreferencesFileOnDisk
							   (((String)
							     (((SignlinkRequest)
							       class144)
							      .objParam)),
							    12606, "",
							    fileStore));
						    class144.returnObj
							= class234;
						}
					    } else {
						Frame frame
						    = (new Frame
						       ("Jagex Full Screen"));
						class144.returnObj = frame;
						frame.setResizable(false);
						if (((Signlink) this)
						    .aBoolean3794)
						    aClass134_3802.method1146
							((class144.intParam
							  & 0xffff),
							 (((SignlinkRequest)
							   class144).anInt1999
							  >> 1209541904),
							 (class144.intParam
							  >>> 1536588080),
							 -43,
							 0xffff & (((SignlinkRequest)
								    class144)
								   .anInt1999),
							 frame);
						else
						    Class.forName("Class7")
							.getMethod
							("method209",
							 (new Class[]
							  { (aClass3807 != null
							     ? aClass3807
							     : (aClass3807
								= (method2249
								   ("java.awt.Frame")))),
							    Integer.TYPE,
							    Integer.TYPE,
							    Integer.TYPE,
							    Integer.TYPE }))
							.invoke
							(anObject3793,
							 (new Object[]
							  { frame,
							    (new Integer
							     ((class144
							       .intParam)
							      >>> 35629040)),
							    (new Integer
							     (0xffff
							      & (class144
								 .intParam))),
							    (new Integer
							     ((((SignlinkRequest)
								class144)
							       .anInt1999)
							      >> 972476528)),
							    (new Integer
							     ((((SignlinkRequest)
								class144)
							       .anInt1999)
							      & 0xffff)) }));
					    }
					} else if (!((Signlink) this)
						    .aBoolean3794)
					    class144.returnObj
						= (Class.forName("Class7")
						       .getMethod
						       ("method210",
							new Class[0])
						       .invoke
						   (anObject3793,
						    new Object[0]));
					else
					    class144.returnObj
						= aClass134_3802
						      .method1145(true);
				    } else
					throw new Exception("");
				} else {
				    Clipboard clipboard
					= Toolkit.getDefaultToolkit()
					      .getSystemClipboard();
				    class144.returnObj
					= clipboard.getContents(null);
				}
			    } else {
				Object[] objects
				    = ((Object[])
				       ((SignlinkRequest) class144).objParam);
				if (((Signlink) this).allowsFileOperations
				    && (((Class) objects[0]).getClassLoader()
					== null))
				    throw new SecurityException();
				class144.returnObj
				    = (((Class) objects[0]).getDeclaredField
				       ((String) objects[1]));
			    }
			} else {
			    Object[] objects
				= ((Object[])
				   ((SignlinkRequest) class144).objParam);
			    if (((Signlink) this).allowsFileOperations && (((Class) objects[0]).getClassLoader() == null))
				throw new SecurityException();
			    class144.returnObj
				= (((Class) objects[0]).getDeclaredMethod
				   ((String) objects[1],
				    (Class[]) objects[2]));
			}
		    } else {
			if ((Class62.getCurrentTimeMillis() ^ 0xffffffffffffffffL)
			    > (aLong3781 ^ 0xffffffffffffffffL))
			    throw new IOException();
			try {
			    class144.returnObj
				= Class61.method593
				      (class144.intParam, (byte) -90,
				       ((String)
					((SignlinkRequest) class144).objParam))
				      .method2050(-112);
			} catch (IOException_Sub1 ioexception_sub1) {
			    class144.returnObj
				= ioexception_sub1.getMessage();
			    throw ioexception_sub1;
			}
		    }
		} else {
		    if ((Class62.getCurrentTimeMillis() ^ 0xffffffffffffffffL) > (aLong3781 ^ 0xffffffffffffffffL))
			throw new IOException();
		    class144.returnObj
			= new Socket(InetAddress.getByName((String)
							   (((SignlinkRequest)
							     class144)
							    .objParam)),
				     class144.intParam);
		}
		class144.state = 1;
	    } catch (Throwable throwable) {
		class144.state = 2;
	    }
	    synchronized (class144) {
		class144.notify();
	    }
	}
    }
    
    final void method2234(byte i) {
	synchronized (this) {
	    aBoolean3801 = true;
	    this.notifyAll();
	}
	try {
	    signlinkThread.join();
	    if (i != 103)
		((Signlink) this).randomDatFile = null;
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	if (((Signlink) this).mainIndexFile != null) {
	    try {
		((Signlink) this).mainIndexFile.method1657(false);
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	if (((Signlink) this).tableIndexFile != null) {
	    try {
		((Signlink) this).tableIndexFile.method1657(false);
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	if (((Signlink) this).cacheIndexFiles != null) {
	    for (int i_9_ = 0;
		 i_9_ < ((Signlink) this).cacheIndexFiles.length; i_9_++) {
		if (((Signlink) this).cacheIndexFiles[i_9_] != null) {
		    try {
			((Signlink) this).cacheIndexFiles[i_9_]
			    .method1657(false);
		    } catch (IOException ioexception) {
			/* empty */
		    }
		}
	    }
	}
	do {
	    if (((Signlink) this).randomDatFile != null) {
		try {
		    ((Signlink) this).randomDatFile.method1657(false);
		} catch (IOException ioexception) {
		    break;
		}
		break;
	    }
	} while (false);
    }
    
    final SignlinkRequest method2235(boolean bool, int i, String string, int i_10_) {
	if (i_10_ != 28225)
	    return null;
	return submitRequest(i_10_ ^ 0x6e49, 0, bool ? 22 : 1, i, string);
    }
    
    final SignlinkRequest createThreadRequest(Runnable runnable, int i, int i_11_) {
	if (i != -10240)
	    writeFile(null, null);
	return submitRequest(8, 0, 2, i_11_, runnable);
    }
    
    final SignlinkRequest method2237(URL url, int i) {
	if (i != 8362)
	    return null;
	return submitRequest(8, 0, 4, 0, url);
    }
    
    final SignlinkRequest method2238(int i, int[] is, int i_12_, Point point,
			      Component component, int i_13_) {
	if (i_12_ != 17)
	    method2240(-75);
	return submitRequest(i_12_ + -9, i, 17, i_13_,
			  new Object[] { component, is, point });
    }
    
    final void method2239(int i) {
	if (i > -90)
	    ((Signlink) this).tableIndexFile = null;
	aLong3781 = 5000L + Class62.getCurrentTimeMillis();
    }
    
    final SignlinkRequest method2240(int i) {
	if (i != 972476528)
	    return null;
	return submitRequest(8, 0, 5, 0, null);
    }
    
    private static final FileOnDisk getPreferencesFileOnDisk(String string, int i,
					     String string_14_, int i_15_) {
	String string_16_;
	if (i_15_ == 33)
	    string_16_ = "jagex_" + string_14_ + "_preferences" + string + "_rc.dat";
	else if (i_15_ != 34)
	    string_16_ = "jagex_" + string_14_ + "_preferences" + string + ".dat";
	else
	    string_16_ = "jagex_" + string_14_ + "_preferences" + string + "_wip.dat";
	if (i != 12606)
	    return null;
	String[] strings = { "c:/rscache/", "/rscache/", userHome,
			     "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
	for (int i_17_ = 0; strings.length > i_17_; i_17_++) {
	    String string_18_ = strings[i_17_];
	    if ((string_18_.length() ^ 0xffffffff) >= -1
		|| new File(string_18_).exists()) {
		try {
		    FileOnDisk class234
			= new FileOnDisk(new File(string_18_, string_16_), "rw",
				       10000L);
		    return class234;
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	}
	return null;
    }
    
    final boolean writeFile(byte[] src, File file) {
	try {
	    FileOutputStream fileoutputstream = new FileOutputStream(file);
	    fileoutputstream.write(src, 0, src.length);
	    fileoutputstream.close();
	    return true;
	} catch (IOException ioexception) {
	    throw new RuntimeException();
	}
    }
    
    final SignlinkRequest method2243(int i, String string, Class var_class) {
	if (i != 0)
	    method2239(-13);
	return submitRequest(8, 0, 9, 0, new Object[] { var_class, string });
    }
    
    final Object method2244(int i) {
	if (i != 21)
	    method2237(null, 23);
	return anObject3787;
    }
    
    final SignlinkRequest method2245(String string, int i) {
	if (i != 16)
	    return null;
	return submitRequest(i + -8, 0, 16, 0, string);
    }
    
    private final SignlinkRequest submitRequest(int i, int i_19_, int i_20_, int i_21_,
				      Object object) {
	SignlinkRequest class144 = new SignlinkRequest();
	((SignlinkRequest) class144).objParam = object;
	((SignlinkRequest) class144).anInt1999 = i_19_;
	((SignlinkRequest) class144).anInt1994 = i_20_;
	class144.intParam = i_21_;
	synchronized (this) {
	    if (aClass144_3798 == null)
		aClass144_3798 = aClass144_3797 = class144;
	    else {
		((SignlinkRequest) aClass144_3798).aClass144_1995 = class144;
		aClass144_3798 = class144;
	    }
	    this.notify();
	    if (i != 8)
		method2235(false, 76, null, 37);
	}
	return class144;
    }
    
    final boolean method2247(int i) {
	if (i != -4)
	    method2245(null, 50);
	if (!((Signlink) this).allowsFileOperations)
	    return false;
	if (((Signlink) this).aBoolean3794) {
	    if (aClass134_3802 == null)
		return false;
	    return true;
	}
	if (anObject3793 == null)
	    return false;
	return true;
    }
    
    final SignlinkRequest method2248(byte i, Frame frame) {
	if (i != 89)
	    return null;
	return submitRequest(i ^ 0x51, 0, 7, 0, frame);
    }
    
    Signlink(int i, String string, int i_22_, boolean bool) throws Exception {
	((Signlink) this).allowsFileOperations = bool;
	aClass144_3798 = null;
	aBoolean3801 = false;
	((Signlink) this).randomDatFile = null;
	((Signlink) this).aBoolean3794 = false;
	aClass144_3797 = null;
	gameName = string;
	javaVersion = "1.1";
	javaVendor = "Unknown";
	fileStore = i;
	try {
	    javaVendor = System.getProperty("java.vendor");
	    javaVersion = System.getProperty("java.version");
	} catch (Exception exception) {
	    /* empty */
	}
	if ((javaVendor.toLowerCase().indexOf("microsoft") ^ 0xffffffff) != 0)
	    ((Signlink) this).aBoolean3794 = true;
	try {
	    os = System.getProperty("os.name");
	} catch (Exception exception) {
	    os = "Unknown";
	}
	osName = os.toLowerCase();
	try {
	    osArch = System.getProperty("os.arch").toLowerCase();
	} catch (Exception exception) {
	    osArch = "";
	}
	try {
	    osVersion = System.getProperty("os.version").toLowerCase();
	} catch (Exception exception) {
	    osVersion = "";
	}
	try {
	    userHome = System.getProperty("user.home");
	    if (userHome != null)
		userHome += "/";
	} catch (Exception exception) {
	    /* empty */
	}
	if (userHome == null)
	    userHome = "~/";
	try {
	    ((Signlink) this).systemEventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
	} catch (Throwable throwable) {
	    /* empty */
	}
	if (!((Signlink) this).aBoolean3794) {
	    try {
		aMethod3783 = (Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled",
			new Class[] { Boolean.TYPE }));
	    } catch (Exception exception) {
		/* empty */
	    }
	    try {
		aMethod3786
		    = (Class.forName("java.awt.Container").getDeclaredMethod
		       ("setFocusCycleRoot", new Class[] { Boolean.TYPE }));
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	FSCache.initialize(gameName, fileStore);
	if (((Signlink) this).allowsFileOperations) {
	    ((Signlink) this).randomDatFile = new FileOnDisk(FSCache.getFile(fileStore, "random.dat", null), "rw", 25L);
	    ((Signlink) this).mainIndexFile = new FileOnDisk(FSCache.getFile("main_file_cache.dat2"), "rw", 209715200L);
	    ((Signlink) this).tableIndexFile = new FileOnDisk(FSCache.getFile("main_file_cache.idx255"), "rw", 1048576L);
	    ((Signlink) this).cacheIndexFiles = new FileOnDisk[i_22_];
	    for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > (i_22_ ^ 0xffffffff); i_23_++)
		((Signlink) this).cacheIndexFiles[i_23_] = new FileOnDisk(FSCache.getFile(("main_file_cache.idx" + i_23_)), "rw", 1048576L);
	    if (((Signlink) this).aBoolean3794) {
		try {
		    anObject3787 = Class.forName("Class1").newInstance();
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    try {
		if (!((Signlink) this).aBoolean3794)
		    anObject3793 = Class.forName("Class7").newInstance();
		else
		    aClass134_3802 = new Class134();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		if (!((Signlink) this).aBoolean3794)
		    anObject3791 = Class.forName("Class165").newInstance();
		else
		    aCallback_Sub1_3776 = new Callback_Sub1();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	if (((Signlink) this).allowsFileOperations
	    && !((Signlink) this).aBoolean3794) {
	    ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
	    for (ThreadGroup threadgroup_24_ = threadgroup.getParent();
		 threadgroup_24_ != null;
		 threadgroup_24_ = threadgroup.getParent())
		threadgroup = threadgroup_24_;
	    Thread[] threads = new Thread[1000];
	    threadgroup.enumerate(threads);
	    for (int i_25_ = 0;
		 (i_25_ ^ 0xffffffff) > (threads.length ^ 0xffffffff);
		 i_25_++) {
		if (threads[i_25_] != null
		    && threads[i_25_].getName().startsWith("AWT"))
		    threads[i_25_].setPriority(1);
	    }
	}
	aBoolean3801 = false;
	signlinkThread = new Thread(this);
	signlinkThread.setPriority(10);
	signlinkThread.setDaemon(true);
	signlinkThread.start();
    }
    
    /*synthetic*/ static Class method2249(String string) {
	try {
	    return Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
