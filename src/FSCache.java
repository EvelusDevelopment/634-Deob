/* FSCache - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class FSCache
{
    private static int fileStore;
    private static Hashtable hashTable;
    private static String userHome;
    private static boolean isInitialized = false;
    private static String gameName;
    
    public static File getFile(int fileStore, String string, String gameName) {
	File file = (File) hashTable.get(string);
	if (file != null)
	    return file;
        if(!isInitialized)
            throw new RuntimeException("");
	String[] strings = { "./" };
	String[] strings_2_ = { "cache" };
	for (int i_3_ = 0; i_3_ < 2; i_3_++) {
	    for (int i_4_ = 0; strings_2_.length > i_4_; i_4_++) {
		for (int i_5_ = 0;
		     (i_5_ ^ 0xffffffff) > (strings.length ^ 0xffffffff);
		     i_5_++) {
		    String string_6_ = (strings[i_5_] + strings_2_[i_4_] + "/"
			               + (gameName == null ? "" : gameName + "/")
			               + string);
		    RandomAccessFile randomaccessfile = null;
		    try {
			File f = new File(string_6_);
			if (i_3_ != 0 || f.exists()) {
			    String string_8_ = strings[i_5_];
			    if ((i_3_ ^ 0xffffffff) != -2 || string_8_.length() <= 0 || new File(string_8_).exists()) {
				new File(strings[i_5_] + strings_2_[i_4_]).mkdir();
				if (gameName != null)
				    new File(strings[i_5_] + strings_2_[i_4_] + "/" + gameName).mkdir();
				randomaccessfile = new RandomAccessFile(f, "rw");
				int i_9_ = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i_9_);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				hashTable.put(string, f);
				return f;
			    }
			}
		    } catch (Exception exception) {
			try {
			    if (randomaccessfile != null) {
				randomaccessfile.close();
				Object object = null;
			    }
			} catch (Exception exception_10_) {
			    /* empty */
			}
		    }
		}
	    }
	}
	throw new RuntimeException();
    }
    
    public static void initialize(String name, int fs) {
	fileStore = fs;
	gameName = name;
	try {
	    userHome = System.getProperty("user.home");
	    if (userHome != null)
		userHome += "/";
	} catch (Exception exception) {
	    /* empty */
	}
        isInitialized = true;
	if (userHome == null)
	    userHome = "~/";
    }
    
    public static File getFile(String string) {
	return getFile(fileStore, string, gameName);
    }
    
    static {
	hashTable = new Hashtable(16);
    }
}
