/* SocketConnection - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

final class SocketConnection extends AbstractConnection
{
    static int anInt5828;
    static int anInt5829;
    static int anInt5830;
    static int anInt5831;
    static int anInt5832 = -1;
    static int anInt5833;
    private InputstreamWorker inputstreamWorker;
    static int anInt5835;
    private Socket socket;
    private OutputstreamWorker outputstreamWorker;
    static int anInt5838;
    static int anInt5839;
    static boolean aBoolean5840 = true;
    
    static final void method1707(int i) {
	if (i != 26469)
	    method1708(20, 93, 118, 24, (byte) -1, null);
	Class322.aClass308_4036.method2303(true);
	anInt5829++;
    }
    
    final void write(int i, int i_1_, byte[] is)
	throws IOException {
	anInt5833++;
	outputstreamWorker.write((byte) 5, i_1_, i, is);
    }
    
    final void method1702(int i) {
	anInt5828++;
	inputstreamWorker.method3618(0);
	int i_2_ = 29 / ((-25 - i) / 38);
	outputstreamWorker.method1527(-21179);
    }
    
    static final void method1708(int i, int i_3_, int i_4_, int i_5_,
				 byte i_6_, Class348_Sub9 class348_sub9) {
	anInt5830++;
	if (((Class348_Sub9) class348_sub9).anInt6685 != -1
	    || ((Class348_Sub9) class348_sub9).anIntArray6697 != null) {
	    int i_7_ = 0;
	    int i_8_ = ((((Class348_Sub9) class348_sub9).anInt6677
			 * ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			       .aClass239_Sub26_7234.method1838(-32350))
			>> -1707824472);
	    if (((Class348_Sub9) class348_sub9).anInt6698 >= i_3_) {
		if ((i_3_ ^ 0xffffffff)
		    > (((Class348_Sub9) class348_sub9).anInt6678 ^ 0xffffffff))
		    i_7_ += -i_3_ + ((Class348_Sub9) class348_sub9).anInt6678;
	    } else
		i_7_ += -((Class348_Sub9) class348_sub9).anInt6698 + i_3_;
	    if ((((Class348_Sub9) class348_sub9).anInt6687 ^ 0xffffffff)
		<= (i_5_ ^ 0xffffffff)) {
		if (((Class348_Sub9) class348_sub9).anInt6689 > i_5_)
		    i_7_ += -i_5_ + ((Class348_Sub9) class348_sub9).anInt6689;
	    } else
		i_7_ += -((Class348_Sub9) class348_sub9).anInt6687 + i_5_;
	    if (((Class348_Sub9) class348_sub9).anInt6694 == 0
		|| ((((Class348_Sub9) class348_sub9).anInt6694 ^ 0xffffffff)
		    > (-256 + i_7_ ^ 0xffffffff))
		|| (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			.aClass239_Sub26_7234.method1838(-32350)
		    ^ 0xffffffff) == -1
		|| ((Class348_Sub9) class348_sub9).anInt6693 != i_4_) {
		if (((Class348_Sub9) class348_sub9).aClass348_Sub16_Sub5_6676
		    != null) {
		    Class348_Sub43.aClass348_Sub16_Sub4_7065.method2880
			(((Class348_Sub9) class348_sub9)
			 .aClass348_Sub16_Sub5_6676);
		    ((Class348_Sub9) class348_sub9).aClass348_Sub19_Sub1_6686
			= null;
		    ((Class348_Sub9) class348_sub9).aClass348_Sub16_Sub5_6676
			= null;
		    ((Class348_Sub9) class348_sub9).aClass348_Sub10_6688
			= null;
		}
		if (((Class348_Sub9) class348_sub9).aClass348_Sub16_Sub5_6673
		    != null) {
		    Class348_Sub43.aClass348_Sub16_Sub4_7065.method2880
			(((Class348_Sub9) class348_sub9)
			 .aClass348_Sub16_Sub5_6673);
		    ((Class348_Sub9) class348_sub9).aClass348_Sub16_Sub5_6673
			= null;
		    ((Class348_Sub9) class348_sub9).aClass348_Sub10_6683
			= null;
		    ((Class348_Sub9) class348_sub9).aClass348_Sub19_Sub1_6692
			= null;
		}
	    } else {
		i_7_ -= 256;
		if ((i_7_ ^ 0xffffffff) > -1)
		    i_7_ = 0;
		int i_9_
		    = ((((Class348_Sub9) class348_sub9).anInt6694 + -i_7_)
		       * i_8_ / ((Class348_Sub9) class348_sub9).anInt6694);
		Class132.localPlayer
		    .method2436((byte) 100);
		if (i_6_ == -78) {
		    int i_10_ = 8192;
		    int i_11_
			= (-i_3_
			   + ((((Class348_Sub9) class348_sub9).anInt6678
			       + ((Class348_Sub9) class348_sub9).anInt6698)
			      / 2));
		    int i_12_
			= (-i_5_
			   + ((((Class348_Sub9) class348_sub9).anInt6687
			       - -((Class348_Sub9) class348_sub9).anInt6689)
			      / 2));
		    if (i_11_ != 0 || (i_12_ ^ 0xffffffff) != -1) {
			int i_13_ = ((-Class5.anInt4638
				      + -(int) (Math.atan2((double) i_11_,
							   (double) i_12_)
						* 2607.5945876176133)
				      + -4096)
				     & 0x3fff);
			if (i_13_ > 8192)
			    i_13_ = 16384 - i_13_;
			int i_14_;
			if (i_7_ <= 0)
			    i_14_ = 8192;
			else if ((i_7_ ^ 0xffffffff) > -4097)
			    i_14_ = 8192 + 8192 * i_7_ / 4096;
			else
			    i_14_ = 16384;
			i_10_ = ((16384 - i_14_ >> -812450495)
				 + i_14_ * i_13_ / 8192);
		    }
		    if ((((Class348_Sub9) class348_sub9)
			 .aClass348_Sub16_Sub5_6676)
			!= null) {
			((Class348_Sub9) class348_sub9)
			    .aClass348_Sub16_Sub5_6676.method2915(i_9_);
			((Class348_Sub9) class348_sub9)
			    .aClass348_Sub16_Sub5_6676.method2909(i_10_);
		    } else if ((((Class348_Sub9) class348_sub9).anInt6685
				^ 0xffffffff)
			       <= -1) {
			int i_15_
			    = (((((Class348_Sub9) class348_sub9).anInt6681
				 ^ 0xffffffff) == -257
				&& (((Class348_Sub9) class348_sub9).anInt6696
				    == 256))
			       ? 256
			       : (Class299_Sub1.method2257
				  (((Class348_Sub9) class348_sub9).anInt6681,
				   ((Class348_Sub9) class348_sub9).anInt6696,
				   (byte) -120)));
			if (!((Class348_Sub9) class348_sub9).aBoolean6674) {
			    Class317 class317
				= Class317.method2372(Class129.indexLoader4,
						      (((Class348_Sub9)
							class348_sub9)
						       .anInt6685),
						      0);
			    if (class317 != null) {
				Class348_Sub19_Sub1 class348_sub19_sub1
				    = class317.method2369()
					  .method2944(Class57.aClass163_1050);
				Class348_Sub16_Sub5 class348_sub16_sub5
				    = (Class348_Sub16_Sub5.method2911
				       (class348_sub19_sub1, i_15_,
					i_9_ << 1018235430, i_10_));
				class348_sub16_sub5.method2917(-1);
				Class348_Sub43.aClass348_Sub16_Sub4_7065
				    .method2883(class348_sub16_sub5);
				((Class348_Sub9) class348_sub9)
				    .aClass348_Sub16_Sub5_6676
				    = class348_sub16_sub5;
			    }
			} else {
			    if ((((Class348_Sub9) class348_sub9)
				 .aClass348_Sub10_6688)
				== null)
				((Class348_Sub9) class348_sub9)
				    .aClass348_Sub10_6688
				    = (Class348_Sub10.method2793
				       (Class239_Sub4.indexLoader14,
					(((Class348_Sub9) class348_sub9)
					 .anInt6685)));
			    if ((((Class348_Sub9) class348_sub9)
				 .aClass348_Sub10_6688)
				!= null) {
				if ((((Class348_Sub9) class348_sub9)
				     .aClass348_Sub19_Sub1_6686)
				    == null)
				    ((Class348_Sub9) class348_sub9)
					.aClass348_Sub19_Sub1_6686
					= ((Class348_Sub9) class348_sub9)
					      .aClass348_Sub10_6688
					      .method2791(new int[] { 22050 });
				if ((((Class348_Sub9) class348_sub9)
				     .aClass348_Sub19_Sub1_6686)
				    != null) {
				    Class348_Sub16_Sub5 class348_sub16_sub5
					= (Class348_Sub16_Sub5.method2911
					   ((((Class348_Sub9) class348_sub9)
					     .aClass348_Sub19_Sub1_6686),
					    i_15_, i_9_ << 644937510, i_10_));
				    class348_sub16_sub5.method2917(-1);
				    Class348_Sub43
					.aClass348_Sub16_Sub4_7065
					.method2883(class348_sub16_sub5);
				    ((Class348_Sub9) class348_sub9)
					.aClass348_Sub16_Sub5_6676
					= class348_sub16_sub5;
				}
			    }
			}
		    }
		    do {
			if ((((Class348_Sub9) class348_sub9)
			     .aClass348_Sub16_Sub5_6673)
			    == null) {
			    if ((((Class348_Sub9) class348_sub9).anIntArray6697
				 != null)
				&& (((Class348_Sub9) class348_sub9).anInt6670
				    -= i) <= 0) {
				int i_16_
				    = (((((Class348_Sub9) class348_sub9)
					 .anInt6681) == 256
					&& (((Class348_Sub9) class348_sub9)
					    .anInt6696) == 256)
				       ? 256
				       : ((((Class348_Sub9) class348_sub9)
					   .anInt6696)
					  + (int) (Math.random()
						   * (double) (-(((Class348_Sub9)
								  class348_sub9)
								 .anInt6696)
							       + (((Class348_Sub9)
								   class348_sub9)
								  .anInt6681)))));
				if (((Class348_Sub9) class348_sub9)
				    .aBoolean6699) {
				    if ((((Class348_Sub9) class348_sub9)
					 .aClass348_Sub10_6683)
					== null) {
					int i_17_
					    = (int) ((double) (((Class348_Sub9)
								class348_sub9)
							       .anIntArray6697).length
						     * Math.random());
					((Class348_Sub9) class348_sub9)
					    .aClass348_Sub10_6683
					    = (Class348_Sub10.method2793
					       (Class239_Sub4.indexLoader14,
						(((Class348_Sub9)
						  class348_sub9)
						 .anIntArray6697[i_17_])));
				    }
				    if ((((Class348_Sub9) class348_sub9)
					 .aClass348_Sub10_6683)
					!= null) {
					if ((((Class348_Sub9) class348_sub9)
					     .aClass348_Sub19_Sub1_6692)
					    == null)
					    ((Class348_Sub9) class348_sub9)
						.aClass348_Sub19_Sub1_6692
						= (((Class348_Sub9)
						    class348_sub9)
						       .aClass348_Sub10_6683
						       .method2791
						   (new int[] { 22050 }));
					if ((((Class348_Sub9) class348_sub9)
					     .aClass348_Sub19_Sub1_6692)
					    != null) {
					    Class348_Sub16_Sub5 class348_sub16_sub5
						= (Class348_Sub16_Sub5
						       .method2911
						   ((((Class348_Sub9)
						      class348_sub9)
						     .aClass348_Sub19_Sub1_6692),
						    i_16_, i_9_ << -1435078394,
						    i_10_));
					    class348_sub16_sub5.method2917(0);
					    Class348_Sub43
						.aClass348_Sub16_Sub4_7065
						.method2883
						(class348_sub16_sub5);
					    ((Class348_Sub9) class348_sub9)
						.aClass348_Sub16_Sub5_6673
						= class348_sub16_sub5;
					    ((Class348_Sub9) class348_sub9)
						.anInt6670
						= ((int) ((double) ((((Class348_Sub9)
								      class348_sub9)
								     .anInt6668)
								    - (((Class348_Sub9)
									class348_sub9)
								       .anInt6680))
							  * Math.random())
						   + (((Class348_Sub9)
						       class348_sub9)
						      .anInt6680));
					}
				    }
				} else {
				    int i_18_
					= (int) (Math.random()
						 * (double) (((Class348_Sub9)
							      class348_sub9)
							     .anIntArray6697).length);
				    Class317 class317
					= Class317.method2372((Class129
							       .indexLoader4),
							      (((Class348_Sub9)
								class348_sub9)
							       .anIntArray6697
							       [i_18_]),
							      0);
				    if (class317 == null)
					break;
				    Class348_Sub19_Sub1 class348_sub19_sub1
					= (class317.method2369().method2944
					   (Class57.aClass163_1050));
				    Class348_Sub16_Sub5 class348_sub16_sub5
					= (Class348_Sub16_Sub5.method2911
					   (class348_sub19_sub1, i_16_,
					    i_9_ << -1598030010, i_10_));
				    class348_sub16_sub5.method2917(0);
				    Class348_Sub43
					.aClass348_Sub16_Sub4_7065
					.method2883(class348_sub16_sub5);
				    ((Class348_Sub9) class348_sub9).anInt6670
					= ((int) ((double) (-(((Class348_Sub9)
							       class348_sub9)
							      .anInt6680)
							    + (((Class348_Sub9)
								class348_sub9)
							       .anInt6668))
						  * Math.random())
					   + (((Class348_Sub9) class348_sub9)
					      .anInt6680));
				    ((Class348_Sub9) class348_sub9)
					.aClass348_Sub16_Sub5_6673
					= class348_sub16_sub5;
				}
				break;
			    }
			} else {
			    ((Class348_Sub9) class348_sub9)
				.aClass348_Sub16_Sub5_6673.method2915(i_9_);
			    ((Class348_Sub9) class348_sub9)
				.aClass348_Sub16_Sub5_6673.method2909(i_10_);
			    if (!((Class348_Sub9) class348_sub9)
				     .aClass348_Sub16_Sub5_6673
				     .method2712((byte) 4)) {
				((Class348_Sub9) class348_sub9)
				    .aClass348_Sub10_6683
				    = null;
				((Class348_Sub9) class348_sub9)
				    .aClass348_Sub19_Sub1_6692
				    = null;
				((Class348_Sub9) class348_sub9)
				    .aClass348_Sub16_Sub5_6673
				    = null;
			    }
			}
		    } while (false);
		}
	    }
	}
    }
    
    final void method1700(byte i) {
	anInt5839++;
	try {
	    socket.close();
	} catch (IOException ioexception) {
	    /* empty */
	}
	inputstreamWorker.method3615(15984);
	if (i == 36)
	    outputstreamWorker.destroy((byte) -99);
    }
    
    final int read(int i, int i_19_, byte i_20_, byte[] is)
	throws IOException {
	int i_21_ = 84 / ((-56 - i_20_) / 47);
	anInt5831++;
	return inputstreamWorker.read(i, i_19_, 0, is);
    }
    
    final boolean method1705(int i, int i_22_) throws IOException {
	if (i_22_ <= 91)
	    inputstreamWorker = null;
	anInt5838++;
	return inputstreamWorker.method3619(i, false);
    }
    
    SocketConnection(Socket socket, int buffersize) throws IOException {
	this.socket = socket;
	socket.setSoTimeout(30000);
	socket.setTcpNoDelay(true);
	inputstreamWorker = new InputstreamWorker(socket.getInputStream(), buffersize);
	outputstreamWorker = new OutputstreamWorker(socket.getOutputStream(), buffersize);
    }
    
    protected final void finalize() {
	anInt5835++;
	method1700((byte) 36);
    }
}
