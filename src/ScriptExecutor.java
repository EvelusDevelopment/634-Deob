/* ScriptExecutor - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;

final class ScriptExecutor
{
    private static int[] intStack = new int[1000];
    private static Widget currentWidget2;
    private static Class43 aClass43_1151;
    private static String[] strStack = new String[1000];
    static int anInt1153;
    private static int anInt1154 = 0;
    private static String[] aStringArray1155;
    static int anInt1156;
    static int anInt1157;
    static int anInt1158;
    static int anInt1159;
    private static Calendar calendar;
    private static int[][] anIntArrayArray1161 = new int[5][5000];
    static int anInt1162;
    static int anInt1163;
    private static int[] anIntArray1164;
    static int anInt1165;
    static int anInt1166;
    static int anInt1167;
    private static Class184[] aClass184Array1168;
    private static Widget currentWidget;
    private static int anInt1170 = 0;
    static int anInt1171;
    private static int[] anIntArray1172 = new int[5];
    private static int intStackOffset = 0;
    static Cache aClass60_1174;
    private static int[] anIntArray1175;
    private static String[] months;
    private static int anInt1177;
    
    static final void method701(Class273 class273, int i, int i_0_) {
	ClientScript class348_sub42_sub19
	    = Class153.method1223(i, i_0_, 96837648, class273);
	if (class348_sub42_sub19 != null) {
	    anIntArray1164
		= (new int
		   [((ClientScript) class348_sub42_sub19).anInt9688]);
	    aStringArray1155
		= (new String
		   [((ClientScript) class348_sub42_sub19).anInt9689]);
	    if ((((ClientScript) class348_sub42_sub19).aClass273_9691
		 == Class90.aClass273_1512)
		|| (((ClientScript) class348_sub42_sub19)
		    .aClass273_9691) == Class59_Sub1_Sub2.aClass273_8664
		|| (((ClientScript) class348_sub42_sub19)
		    .aClass273_9691) == ISAAC.aClass273_1298) {
		int i_1_ = 0;
		int i_2_ = 0;
		if (Class168.aClass46_2249 != null) {
		    i_1_ = ((Widget) Class168.aClass46_2249).anInt800;
		    i_2_ = ((Widget) Class168.aClass46_2249).anInt750;
		}
		anIntArray1164[0]
		    = Class258_Sub4.mouseMovementListener.method3597(true) - i_1_;
		anIntArray1164[1]
		    = (Class258_Sub4.mouseMovementListener.method3594((byte) 80)
		       - i_2_);
	    }
	    method711(class348_sub42_sub19, 200000);
	}
    }
    
    private static final void method702(int i) {
	Widget class46 = AbstractFontRasterizer.getWidget(i);
	if (class46 != null) {
	    int i_3_ = i >>> 16;
	    Widget[] class46s = Class369_Sub2.aClass46ArrayArray8584[i_3_];
	    if (class46s == null) {
		Widget[] class46s_4_
		    = Class348_Sub40_Sub33.aClass46ArrayArray9427[i_3_];
		int i_5_ = class46s_4_.length;
		class46s = Class369_Sub2.aClass46ArrayArray8584[i_3_]
		    = new Widget[i_5_];
		Class214.method1575(class46s_4_, 0, class46s, 0,
				    class46s_4_.length);
	    }
	    int i_6_;
	    for (i_6_ = 0; i_6_ < class46s.length; i_6_++) {
		if (class46s[i_6_] == class46)
		    break;
	    }
	    if (i_6_ < class46s.length) {
		Class214.method1575(class46s, 0, class46s, 1, i_6_);
		class46s[0] = class46;
	    }
	}
    }
    
    static final void method703(int i) {
	if (i != -1 && Class320.method2547(i, (byte) 84)) {
	    Widget[] class46s = Class348_Sub40_Sub33.aClass46ArrayArray9427[i];
	    for (int i_7_ = 0; i_7_ < class46s.length; i_7_++) {
		Widget class46 = class46s[i_7_];
		if (((Widget) class46).anObjectArray815 != null) {
		    InterfaceScript class348_sub36 = new InterfaceScript();
		    ((InterfaceScript) class348_sub36).parent = class46;
		    ((InterfaceScript) class348_sub36).parameters
			= ((Widget) class46).anObjectArray815;
		    executeScript(class348_sub36, 2000000);
		}
	    }
	}
    }
    
    private static final void method704(int i, boolean bool) {
	if (i < 5100) {
	    if (i == 5000) {
		intStack[intStackOffset++] = za.anInt7276;
		return;
	    }
	    if (i == 5001) {
		intStackOffset -= 3;
		za.anInt7276 = intStack[intStackOffset];
		Class57.aClass227_1055
		    = Class38.method360((byte) -57,
					intStack[intStackOffset + 1]);
		if (Class57.aClass227_1055 == null)
		    Class57.aClass227_1055 = Class100.aClass227_1591;
		Class290.anInt3713 = intStack[intStackOffset + 2];
		anInt1156++;
		BufferedPacket class348_sub47
		    = Class286_Sub3.createBufferedPacket(LongNode.aClass351_6766,
					       (Class348_Sub23_Sub2
						.outgoingGameIsaac));
		((BufferedPacket) class348_sub47).buffer
		    .putByte(za.anInt7276);
		((BufferedPacket) class348_sub47).buffer
		    .putByte
		    (((Class227) Class57.aClass227_1055).anInt2970);
		((BufferedPacket) class348_sub47).buffer
		    .putByte(Class290.anInt3713);
		Class348_Sub42_Sub14.putBufferedPacket(-77, class348_sub47);
		return;
	    }
	    if (i == 5002) {
		anInt1170 -= 2;
		String string = strStack[anInt1170];
		String message = strStack[anInt1170 + 1];
		intStackOffset -= 2;
		int i_9_ = intStack[intStackOffset];
		int i_10_ = intStack[intStackOffset + 1];
		if (message == null)
		    message = "";
		if (message.length() > 80)
		    message = message.substring(0, 80);
		anInt1157++;
		BufferedPacket class348_sub47 = Class286_Sub3.createBufferedPacket(BitmapFont.aClass351_1987, (Class348_Sub23_Sub2.outgoingGameIsaac));
		((BufferedPacket) class348_sub47).buffer.putByte((Class239_Sub6.getStringLength(string, -65) + 2 + Class239_Sub6.getStringLength(message, -65)));
		((BufferedPacket) class348_sub47).buffer.putJStr((byte) -5, string);
		((BufferedPacket) class348_sub47).buffer.putByte(i_9_ - 1);
		((BufferedPacket) class348_sub47).buffer.putByte(i_10_);
		((BufferedPacket) class348_sub47).buffer.putJStr((byte) -5, message);
		Class348_Sub42_Sub14.putBufferedPacket(-85, class348_sub47);
		return;
	    }
	    if (i == 5003) {
		int i_11_ = intStack[--intStackOffset];
		Message class147 = s.getMessage(-101, i_11_);
		String string = "";
		if (class147 != null
		    && ((Message) class147).aString2028 != null)
		    string = ((Message) class147).aString2028;
		strStack[anInt1170++] = string;
		return;
	    }
	    if (i == 5004) {
		int id = intStack[--intStackOffset];
		Message class147 = s.getMessage(-101, id);
		int msgType = -1;
		if (class147 != null)
		    msgType = ((Message) class147).type;
		intStack[intStackOffset++] = msgType;
		return;
	    }
	    if (i == 5005) {
		if (Class57.aClass227_1055 == null)
		    intStack[intStackOffset++] = -1;
		else {
		    intStack[intStackOffset++]
			= ((Class227) Class57.aClass227_1055).anInt2970;
		    return;
		}
		return;
	    }
	    if (i == 5006) {
		int i_14_ = intStack[--intStackOffset];
		BufferedPacket class348_sub47
		    = Class286_Sub3.createBufferedPacket(AbstractImageFetcher.aClass351_6925,
					       (Class348_Sub23_Sub2
						.outgoingGameIsaac));
		((BufferedPacket) class348_sub47).buffer
		    .putByte(i_14_);
		Class348_Sub42_Sub14.putBufferedPacket(-70, class348_sub47);
		return;
	    }
	    if (i == 5008) {
		String string = strStack[--anInt1170];
		method707(string, i);
		return;
	    }
	    if (i == 5009) {
		anInt1170 -= 2;
		String string = strStack[anInt1170];
		String string_15_ = strStack[anInt1170 + 1];
		if (Class192.anInt2581 != 0
		    || ((!Class348_Sub40_Sub3.aBoolean9103
			 || Class133.aBoolean1915)
			&& !Class50_Sub2.aBoolean5233)) {
		    anInt1159++;
		    BufferedPacket class348_sub47
			= Class286_Sub3.createBufferedPacket((Class348_Sub40_Sub22
						    .aClass351_9304),
						   (Class348_Sub23_Sub2
						    .outgoingGameIsaac));
		    ((BufferedPacket) class348_sub47)
			.buffer.putByte(0);
		    int i_16_
			= (((ByteBuffer) (((BufferedPacket) class348_sub47)
					      .buffer))
			   .position);
		    ((BufferedPacket) class348_sub47)
			.buffer
			.putJStr((byte) -5, string);
		    Class367_Sub4.method3544((((BufferedPacket) class348_sub47)
					      .buffer),
					     -70, string_15_);
		    ((BufferedPacket) class348_sub47)
			.buffer.method3339
			(109,
			 (((ByteBuffer) (((BufferedPacket) class348_sub47)
					     .buffer))
			  .position) - i_16_);
		    Class348_Sub42_Sub14.putBufferedPacket(2, class348_sub47);
		    return;
		}
		return;
	    }
	    if (i == 5010) {
		int i_17_ = intStack[--intStackOffset];
		Message class147 = s.getMessage(-101, i_17_);
		String string = "";
		if (class147 != null
		    && ((Message) class147).aString2024 != null)
		    string = ((Message) class147).aString2024;
		strStack[anInt1170++] = string;
		return;
	    }
	    if (i == 5011) {
		int i_18_ = intStack[--intStackOffset];
		Message class147 = s.getMessage(-101, i_18_);
		String string = "";
		if (class147 != null
		    && ((Message) class147).aString2022 != null)
		    string = ((Message) class147).aString2022;
		strStack[anInt1170++] = string;
		return;
	    }
	    if (i == 5012) {
		int i_19_ = intStack[--intStackOffset];
		Message class147 = s.getMessage(-101, i_19_);
		int i_20_ = -1;
		if (class147 != null)
		    i_20_ = ((Message) class147).anInt2026;
		intStack[intStackOffset++] = i_20_;
		return;
	    }
	    if (i == 5015) {
		String string;
		if (Class132.localPlayer != null
		    && (((Player) Class132.localPlayer)
			.username) != null)
		    string = Class132.localPlayer
				 .method2456(true, 255);
		else
		    string = "";
		strStack[anInt1170++] = string;
		return;
	    }
	    if (i == 5016) {
		intStack[intStackOffset++] = Class290.anInt3713;
		return;
	    }
	    if (i == 5017) {
		intStack[intStackOffset++] = Class348_Sub4.method2749(-1);
		return;
	    }
	    if (i == 5018) {
		int i_21_ = intStack[--intStackOffset];
		Message class147 = s.getMessage(-101, i_21_);
		int i_22_ = 0;
		if (class147 != null)
		    i_22_ = ((Message) class147).anInt2027;
		intStack[intStackOffset++] = i_22_;
		return;
	    }
	    if (i == 5019) {
		int i_23_ = intStack[--intStackOffset];
		Message class147 = s.getMessage(-101, i_23_);
		String string = "";
		if (class147 != null
		    && ((Message) class147).aString2033 != null)
		    string = ((Message) class147).aString2033;
		strStack[anInt1170++] = string;
		return;
	    }
	    if (i == 5020) {
		String string;
		if (Class132.localPlayer != null
		    && (((Player)
			 Class132.localPlayer)
			.username) != null)
		    string = Class132.localPlayer
				 .method2450(false, -78);
		else
		    string = "";
		strStack[anInt1170++] = string;
		return;
	    }
	    if (i == 5023) {
		int i_24_ = intStack[--intStackOffset];
		Message class147 = s.getMessage(-101, i_24_);
		int i_25_ = -1;
		if (class147 != null)
		    i_25_ = ((Message) class147).anInt2031;
		intStack[intStackOffset++] = i_25_;
		return;
	    }
	    if (i == 5024) {
		int i_26_ = intStack[--intStackOffset];
                
		Message class147 = s.getMessage(-101, i_26_);
		int i_27_ = -1;
		if (class147 != null)
		    i_27_ = ((Message) class147).touchedCycle;
		intStack[intStackOffset++] = i_27_;
		return;
	    }
	    if (i == 5025) {
		int i_28_ = intStack[--intStackOffset];
		Message class147 = s.getMessage(-101, i_28_);
		String string = "";
		if (class147 != null
		    && ((Message) class147).aString2025 != null)
		    string = ((Message) class147).aString2025;
		strStack[anInt1170++] = string;
		return;
	    }
	    if (i == 5050) {
		int i_29_ = intStack[--intStackOffset];
		strStack[anInt1170++]
		    = (((Class348_Sub42_Sub11)
			Class200.aClass226_2639.method1625(0, i_29_))
		       .aString9587);
		return;
	    }
	    if (i == 5051) {
		int i_30_ = intStack[--intStackOffset];
		Class348_Sub42_Sub11 class348_sub42_sub11
		    = Class200.aClass226_2639.method1625(0, i_30_);
		if ((((Class348_Sub42_Sub11) class348_sub42_sub11)
		     .anIntArray9592)
		    == null)
		    intStack[intStackOffset++] = 0;
		else {
		    intStack[intStackOffset++]
			= (((Class348_Sub42_Sub11) class348_sub42_sub11)
			   .anIntArray9592).length;
		    return;
		}
		return;
	    }
	    if (i == 5052) {
		intStackOffset -= 2;
		int i_31_ = intStack[intStackOffset];
		int i_32_ = intStack[intStackOffset + 1];
		Class348_Sub42_Sub11 class348_sub42_sub11
		    = Class200.aClass226_2639.method1625(0, i_31_);
		int i_33_ = (((Class348_Sub42_Sub11) class348_sub42_sub11)
			     .anIntArray9592[i_32_]);
		intStack[intStackOffset++] = i_33_;
		return;
	    }
	    if (i == 5053) {
		int i_34_ = intStack[--intStackOffset];
		Class348_Sub42_Sub11 class348_sub42_sub11
		    = Class200.aClass226_2639.method1625(0, i_34_);
		if ((((Class348_Sub42_Sub11) class348_sub42_sub11)
		     .anIntArray9580)
		    == null)
		    intStack[intStackOffset++] = 0;
		else {
		    intStack[intStackOffset++]
			= (((Class348_Sub42_Sub11) class348_sub42_sub11)
			   .anIntArray9580).length;
		    return;
		}
		return;
	    }
	    if (i == 5054) {
		intStackOffset -= 2;
		int i_35_ = intStack[intStackOffset];
		int i_36_ = intStack[intStackOffset + 1];
		intStack[intStackOffset++]
		    = (((Class348_Sub42_Sub11)
			Class200.aClass226_2639.method1625(0, i_35_))
		       .anIntArray9580[i_36_]);
		return;
	    }
	    if (i == 5055) {
		int i_37_ = intStack[--intStackOffset];
		strStack[anInt1170++]
		    = Class239_Sub6.aClass355_5900.method3471
			  (i_37_, (byte) -112).method3219(127);
		return;
	    }
	    if (i == 5056) {
		int i_38_ = intStack[--intStackOffset];
		Class348_Sub42_Sub10 class348_sub42_sub10
		    = Class239_Sub6.aClass355_5900.method3471(i_38_,
							      (byte) -125);
		if ((((Class348_Sub42_Sub10) class348_sub42_sub10)
		     .anIntArray9566)
		    == null)
		    intStack[intStackOffset++] = 0;
		else {
		    intStack[intStackOffset++]
			= (((Class348_Sub42_Sub10) class348_sub42_sub10)
			   .anIntArray9566).length;
		    return;
		}
		return;
	    }
	    if (i == 5057) {
		intStackOffset -= 2;
		int i_39_ = intStack[intStackOffset];
		int i_40_ = intStack[intStackOffset + 1];
		intStack[intStackOffset++]
		    = (((Class348_Sub42_Sub10)
			Class239_Sub6.aClass355_5900.method3471(i_39_,
								(byte) -126))
		       .anIntArray9566[i_40_]);
		return;
	    }
	    if (i == 5058) {
		aClass43_1151 = new Class43();
		((Class43) aClass43_1151).anInt615
		    = intStack[--intStackOffset];
		((Class43) aClass43_1151).aClass348_Sub42_Sub10_614
		    = Class239_Sub6.aClass355_5900.method3471((((Class43)
								aClass43_1151)
							       .anInt615),
							      (byte) -87);
		((Class43) aClass43_1151).anIntArray617
		    = new int[((Class43) aClass43_1151)
				  .aClass348_Sub42_Sub10_614
				  .method3215((byte) -48)];
		return;
	    }
	    if (i == 5059) {
		anInt1165++;
		BufferedPacket class348_sub47
		    = Class286_Sub3.createBufferedPacket(IndexLoader.aClass351_643,
					       (Class348_Sub23_Sub2
						.outgoingGameIsaac));
		((BufferedPacket) class348_sub47).buffer
		    .putByte(0);
		int i_41_
		    = (((ByteBuffer) (((BufferedPacket) class348_sub47)
					  .buffer))
		       .position);
		((BufferedPacket) class348_sub47).buffer
		    .putByte(0);
		((BufferedPacket) class348_sub47).buffer
		    .putShort
		    (((Class43) aClass43_1151).anInt615);
		((Class43) aClass43_1151).aClass348_Sub42_Sub10_614.method3210
		    ((byte) 12, ((Class43) aClass43_1151).anIntArray617,
		     (((BufferedPacket) class348_sub47)
		      .buffer));
		((BufferedPacket) class348_sub47).buffer
		    .method3339
		    (115, (((ByteBuffer) (((BufferedPacket) class348_sub47)
					      .buffer))
			   .position) - i_41_);
		Class348_Sub42_Sub14.putBufferedPacket(127, class348_sub47);
		return;
	    }
	    if (i == 5060) {
		String string = strStack[--anInt1170];
		anInt1166++;
		BufferedPacket class348_sub47
		    = Class286_Sub3.createBufferedPacket(Class155.aClass351_2109,
					       (Class348_Sub23_Sub2
						.outgoingGameIsaac));
		((BufferedPacket) class348_sub47).buffer
		    .putByte(0);
		int i_42_
		    = (((ByteBuffer) (((BufferedPacket) class348_sub47)
					  .buffer))
		       .position);
		((BufferedPacket) class348_sub47).buffer
		    .putJStr((byte) -5, string);
		((BufferedPacket) class348_sub47).buffer
		    .putShort
		    (((Class43) aClass43_1151).anInt615);
		((Class43) aClass43_1151).aClass348_Sub42_Sub10_614.method3210
		    ((byte) -125, ((Class43) aClass43_1151).anIntArray617,
		     (((BufferedPacket) class348_sub47)
		      .buffer));
		((BufferedPacket) class348_sub47).buffer
		    .method3339
		    (102, (((ByteBuffer) (((BufferedPacket) class348_sub47)
					      .buffer))
			   .position) - i_42_);
		Class348_Sub42_Sub14.putBufferedPacket(127, class348_sub47);
		return;
	    }
	    if (i == 5061) {
		anInt1165++;
		BufferedPacket class348_sub47
		    = Class286_Sub3.createBufferedPacket(IndexLoader.aClass351_643,
					       (Class348_Sub23_Sub2
						.outgoingGameIsaac));
		((BufferedPacket) class348_sub47).buffer
		    .putByte(0);
		int i_43_
		    = (((ByteBuffer) (((BufferedPacket) class348_sub47)
					  .buffer))
		       .position);
		((BufferedPacket) class348_sub47).buffer
		    .putByte(1);
		((BufferedPacket) class348_sub47).buffer
		    .putShort
		    (((Class43) aClass43_1151).anInt615);
		((Class43) aClass43_1151).aClass348_Sub42_Sub10_614.method3210
		    ((byte) -126, ((Class43) aClass43_1151).anIntArray617,
		     (((BufferedPacket) class348_sub47)
		      .buffer));
		((BufferedPacket) class348_sub47).buffer
		    .method3339
		    (92, (((ByteBuffer) (((BufferedPacket) class348_sub47)
					     .buffer))
			  .position) - i_43_);
		Class348_Sub42_Sub14.putBufferedPacket(-111, class348_sub47);
		return;
	    }
	    if (i == 5062) {
		intStackOffset -= 2;
		int i_44_ = intStack[intStackOffset];
		int i_45_ = intStack[intStackOffset + 1];
		intStack[intStackOffset++]
		    = (((Class348_Sub42_Sub11)
			Class200.aClass226_2639.method1625(0, i_44_))
		       .aCharArray9588[i_45_]);
		return;
	    }
	    if (i == 5063) {
		intStackOffset -= 2;
		int i_46_ = intStack[intStackOffset];
		int i_47_ = intStack[intStackOffset + 1];
		intStack[intStackOffset++]
		    = (((Class348_Sub42_Sub11)
			Class200.aClass226_2639.method1625(0, i_46_))
		       .aCharArray9582[i_47_]);
		return;
	    }
	    if (i == 5064) {
		intStackOffset -= 2;
		int i_48_ = intStack[intStackOffset];
		int i_49_ = intStack[intStackOffset + 1];
		if (i_49_ == -1)
		    intStack[intStackOffset++] = -1;
		else {
		    intStack[intStackOffset++]
			= Class200.aClass226_2639.method1625(0, i_48_)
			      .method3226((char) i_49_, 57249897);
		    return;
		}
		return;
	    }
	    if (i == 5065) {
		intStackOffset -= 2;
		int i_50_ = intStack[intStackOffset];
		int i_51_ = intStack[intStackOffset + 1];
		if (i_51_ == -1)
		    intStack[intStackOffset++] = -1;
		else {
		    intStack[intStackOffset++]
			= Class200.aClass226_2639.method1625(0, i_50_)
			      .method3222((byte) -122, (char) i_51_);
		    return;
		}
		return;
	    }
	    if (i == 5066) {
		int i_52_ = intStack[--intStackOffset];
		intStack[intStackOffset++]
		    = Class239_Sub6.aClass355_5900.method3471
			  (i_52_, (byte) -123).method3215((byte) -127);
		return;
	    }
	    if (i == 5067) {
		intStackOffset -= 2;
		int i_53_ = intStack[intStackOffset];
		int i_54_ = intStack[intStackOffset + 1];
		int i_55_ = ((Class138) Class239_Sub6.aClass355_5900.method3471
					    (i_53_, (byte) -127)
					    .method3212(0, i_54_)).anInt1941;
		intStack[intStackOffset++] = i_55_;
		return;
	    }
	    if (i == 5068) {
		intStackOffset -= 2;
		int i_56_ = intStack[intStackOffset];
		int i_57_ = intStack[intStackOffset + 1];
		((Class43) aClass43_1151).anIntArray617[i_56_] = i_57_;
		return;
	    }
	    if (i == 5069) {
		intStackOffset -= 2;
		int i_58_ = intStack[intStackOffset];
		int i_59_ = intStack[intStackOffset + 1];
		((Class43) aClass43_1151).anIntArray617[i_58_] = i_59_;
		return;
	    }
	    if (i == 5070) {
		intStackOffset -= 3;
		int i_60_ = intStack[intStackOffset];
		int i_61_ = intStack[intStackOffset + 1];
		int i_62_ = intStack[intStackOffset + 2];
		Class348_Sub42_Sub10 class348_sub42_sub10
		    = Class239_Sub6.aClass355_5900.method3471(i_60_,
							      (byte) -127);
		if ((((Class138) class348_sub42_sub10.method3212(0, i_61_))
		     .anInt1941)
		    != 0)
		    throw new RuntimeException("bad command");
		intStack[intStackOffset++]
		    = class348_sub42_sub10.method3213(i_62_, i_61_, true);
		return;
	    }
	    if (i == 5071) {
		String string = strStack[--anInt1170];
		boolean bool_63_ = intStack[--intStackOffset] == 1;
		AnimatableToolkit.method606(0, bool_63_, string);
		intStack[intStackOffset++] = Class76.anInt1285;
		return;
	    }
	    if (i == 5072) {
		if (Class192.aShortArray2579 == null
		    || Class148.anInt2037 >= Class76.anInt1285)
		    intStack[intStackOffset++] = -1;
		else {
		    intStack[intStackOffset++]
			= (Class192.aShortArray2579[Class148.anInt2037++]
			   & 0xffff);
		    return;
		}
		return;
	    }
	    if (i == 5073) {
		Class148.anInt2037 = 0;
		return;
	    }
	} else if (i < 5200) {
	    if (i == 5100) {
		if (Class182.keyboardListener.method2696(86, -121))
		    intStack[intStackOffset++] = 1;
		else {
		    intStack[intStackOffset++] = 0;
		    return;
		}
		return;
	    }
	    if (i == 5101) {
		if (Class182.keyboardListener.method2696(82, -126))
		    intStack[intStackOffset++] = 1;
		else {
		    intStack[intStackOffset++] = 0;
		    return;
		}
		return;
	    }
	    if (i == 5102) {
		if (Class182.keyboardListener.method2696(81, -128))
		    intStack[intStackOffset++] = 1;
		else {
		    intStack[intStackOffset++] = 0;
		    return;
		}
		return;
	    }
	} else if (i < 5300) {
	    if (i == 5200) {
		Class27.method312(intStack[--intStackOffset], (byte) 56);
		return;
	    }
	    if (i == 5201) {
		intStack[intStackOffset++] = Class14_Sub2.method244(37);
		return;
	    }
	    if (i == 5205) {
		Class24.method298(false, -1, -1, intStack[--intStackOffset],
				  -53);
		return;
	    }
	    if (i == 5206) {
		int i_64_ = intStack[--intStackOffset];
		Class348_Sub42_Sub14 class348_sub42_sub14
		    = Class75.method766(i_64_ >> 14 & 0x3fff, i_64_ & 0x3fff);
		if (class348_sub42_sub14 == null)
		    intStack[intStackOffset++] = -1;
		else {
		    intStack[intStackOffset++]
			= (((Class348_Sub42_Sub14) class348_sub42_sub14)
			   .anInt9628);
		    return;
		}
		return;
	    }
	    if (i == 5207) {
		Class348_Sub42_Sub14 class348_sub42_sub14
		    = Class75.method757(intStack[--intStackOffset]);
		if (class348_sub42_sub14 == null
		    || (((Class348_Sub42_Sub14) class348_sub42_sub14)
			.aString9632) == null)
		    strStack[anInt1170++] = "";
		else {
		    strStack[anInt1170++]
			= (((Class348_Sub42_Sub14) class348_sub42_sub14)
			   .aString9632);
		    return;
		}
		return;
	    }
	    if (i == 5208) {
		intStack[intStackOffset++] = Class25.anInt370;
		intStack[intStackOffset++] = Class182.anInt2446;
		return;
	    }
	    if (i == 5209) {
		intStack[intStackOffset++]
		    = InterfaceScript.anInt6992 + Class75.anInt1266;
		intStack[intStackOffset++]
		    = Class245.anInt3170 + Class75.anInt1263;
		return;
	    }
	    if (i == 5210) {
		int i_65_ = intStack[--intStackOffset];
		Class348_Sub42_Sub14 class348_sub42_sub14
		    = Class75.method757(i_65_);
		if (class348_sub42_sub14 == null) {
		    intStack[intStackOffset++] = 0;
		    intStack[intStackOffset++] = 0;
		} else {
		    intStack[intStackOffset++]
			= (((Class348_Sub42_Sub14) class348_sub42_sub14)
			   .anInt9640) >> 14 & 0x3fff;
		    intStack[intStackOffset++]
			= (((Class348_Sub42_Sub14) class348_sub42_sub14)
			   .anInt9640) & 0x3fff;
		    return;
		}
		return;
	    }
	    if (i == 5211) {
		int i_66_ = intStack[--intStackOffset];
		Class348_Sub42_Sub14 class348_sub42_sub14
		    = Class75.method757(i_66_);
		if (class348_sub42_sub14 == null) {
		    intStack[intStackOffset++] = 0;
		    intStack[intStackOffset++] = 0;
		} else {
		    intStack[intStackOffset++]
			= ((((Class348_Sub42_Sub14) class348_sub42_sub14)
			    .anInt9635)
			   - (((Class348_Sub42_Sub14) class348_sub42_sub14)
			      .anInt9644));
		    intStack[intStackOffset++]
			= ((((Class348_Sub42_Sub14) class348_sub42_sub14)
			    .anInt9627)
			   - (((Class348_Sub42_Sub14) class348_sub42_sub14)
			      .anInt9643));
		    return;
		}
		return;
	    }
	    if (i == 5212) {
		Class348_Sub21 class348_sub21 = Class5_Sub3.method199(1);
		if (class348_sub21 == null) {
		    intStack[intStackOffset++] = -1;
		    intStack[intStackOffset++] = -1;
		} else {
		    intStack[intStackOffset++]
			= ((Class348_Sub21) class348_sub21).anInt6847;
		    int i_67_
			= (((Class348_Sub21) class348_sub21).anInt6850 << 28
			   | (((Class348_Sub21) class348_sub21).anInt6852
			      + Class75.anInt1266) << 14
			   | (((Class348_Sub21) class348_sub21).anInt6851
			      + Class75.anInt1263));
		    intStack[intStackOffset++] = i_67_;
		    return;
		}
		return;
	    }
	    if (i == 5213) {
		Class348_Sub21 class348_sub21 = HashTable.method3479(-1);
		if (class348_sub21 == null) {
		    intStack[intStackOffset++] = -1;
		    intStack[intStackOffset++] = -1;
		} else {
		    intStack[intStackOffset++]
			= ((Class348_Sub21) class348_sub21).anInt6847;
		    int i_68_
			= (((Class348_Sub21) class348_sub21).anInt6850 << 28
			   | (((Class348_Sub21) class348_sub21).anInt6852
			      + Class75.anInt1266) << 14
			   | (((Class348_Sub21) class348_sub21).anInt6851
			      + Class75.anInt1263));
		    intStack[intStackOffset++] = i_68_;
		    return;
		}
		return;
	    }
	    if (i == 5214) {
		int i_69_ = intStack[--intStackOffset];
		Class348_Sub42_Sub14 class348_sub42_sub14
		    = Class163.method1269(-17096);
		if (class348_sub42_sub14 != null) {
		    boolean bool_70_
			= class348_sub42_sub14.method3236(anIntArray1175,
							  i_69_ >> 14 & 0x3fff,
							  i_69_ & 0x3fff,
							  i_69_ >> 28 & 0x3,
							  (byte) -28);
		    if (bool_70_)
			Class348_Sub16_Sub3.method2839(anIntArray1175[1], -17,
						       anIntArray1175[2]);
		}
		return;
	    }
	    if (i == 5215) {
		intStackOffset -= 2;
		int i_71_ = intStack[intStackOffset];
		int i_72_ = intStack[intStackOffset + 1];
		Queue class107
		    = Class75.method767(i_71_ >> 14 & 0x3fff, i_71_ & 0x3fff);
		boolean bool_73_ = false;
		for (Class348_Sub42_Sub14 class348_sub42_sub14
			 = (Class348_Sub42_Sub14) class107.getFirst();
		     class348_sub42_sub14 != null;
		     class348_sub42_sub14
			 = ((Class348_Sub42_Sub14)
			    class107.next())) {
		    if (((Class348_Sub42_Sub14) class348_sub42_sub14).anInt9628
			== i_72_) {
			bool_73_ = true;
			break;
		    }
		}
		if (bool_73_)
		    intStack[intStackOffset++] = 1;
		else {
		    intStack[intStackOffset++] = 0;
		    return;
		}
		return;
	    }
	    if (i == 5218) {
		int i_74_ = intStack[--intStackOffset];
		Class348_Sub42_Sub14 class348_sub42_sub14
		    = Class75.method757(i_74_);
		if (class348_sub42_sub14 == null)
		    intStack[intStackOffset++] = -1;
		else {
		    intStack[intStackOffset++]
			= (((Class348_Sub42_Sub14) class348_sub42_sub14)
			   .anInt9631);
		    return;
		}
		return;
	    }
	    if (i == 5220) {
		intStack[intStackOffset++]
		    = Node.anInt4290 == 100 ? 1 : 0;
		return;
	    }
	    if (i == 5221) {
		int i_75_ = intStack[--intStackOffset];
		Class348_Sub16_Sub3.method2839(i_75_ >> 14 & 0x3fff, -17,
					       i_75_ & 0x3fff);
		return;
	    }
	    if (i == 5222) {
		Class348_Sub42_Sub14 class348_sub42_sub14
		    = Class163.method1269(-17096);
		if (class348_sub42_sub14 != null) {
		    boolean bool_76_
			= (class348_sub42_sub14.method3239
			   (true, Class245.anInt3170 + Class75.anInt1263,
			    InterfaceScript.anInt6992 + Class75.anInt1266,
			    anIntArray1175));
		    if (bool_76_) {
			intStack[intStackOffset++] = anIntArray1175[1];
			intStack[intStackOffset++] = anIntArray1175[2];
		    } else {
			intStack[intStackOffset++] = -1;
			intStack[intStackOffset++] = -1;
		    }
		} else {
		    intStack[intStackOffset++] = -1;
		    intStack[intStackOffset++] = -1;
		    return;
		}
		return;
	    }
	    if (i == 5223) {
		intStackOffset -= 2;
		int i_77_ = intStack[intStackOffset];
		int i_78_ = intStack[intStackOffset + 1];
		Class24.method298(false, i_78_ & 0x3fff, i_78_ >> 14 & 0x3fff,
				  i_77_, -53);
		return;
	    }
	    if (i == 5224) {
		int i_79_ = intStack[--intStackOffset];
		Class348_Sub42_Sub14 class348_sub42_sub14
		    = Class163.method1269(-17096);
		if (class348_sub42_sub14 != null) {
		    boolean bool_80_
			= class348_sub42_sub14.method3236(anIntArray1175,
							  i_79_ >> 14 & 0x3fff,
							  i_79_ & 0x3fff,
							  i_79_ >> 28 & 0x3,
							  (byte) -28);
		    if (bool_80_) {
			intStack[intStackOffset++] = anIntArray1175[1];
			intStack[intStackOffset++] = anIntArray1175[2];
		    } else {
			intStack[intStackOffset++] = -1;
			intStack[intStackOffset++] = -1;
		    }
		} else {
		    intStack[intStackOffset++] = -1;
		    intStack[intStackOffset++] = -1;
		    return;
		}
		return;
	    }
	    if (i == 5225) {
		int i_81_ = intStack[--intStackOffset];
		Class348_Sub42_Sub14 class348_sub42_sub14
		    = Class163.method1269(-17096);
		if (class348_sub42_sub14 != null) {
		    boolean bool_82_
			= class348_sub42_sub14.method3239(true, i_81_ & 0x3fff,
							  i_81_ >> 14 & 0x3fff,
							  anIntArray1175);
		    if (bool_82_) {
			intStack[intStackOffset++] = anIntArray1175[1];
			intStack[intStackOffset++] = anIntArray1175[2];
		    } else {
			intStack[intStackOffset++] = -1;
			intStack[intStackOffset++] = -1;
		    }
		} else {
		    intStack[intStackOffset++] = -1;
		    intStack[intStackOffset++] = -1;
		    return;
		}
		return;
	    }
	    if (i == 5226) {
		Class130.method1129(intStack[--intStackOffset], 100);
		return;
	    }
	    if (i == 5227) {
		intStackOffset -= 2;
		int i_83_ = intStack[intStackOffset];
		int i_84_ = intStack[intStackOffset + 1];
		Class24.method298(true, i_84_ & 0x3fff, i_84_ >> 14 & 0x3fff,
				  i_83_, -62);
		return;
	    }
	    if (i == 5228) {
		Class348_Sub1_Sub1.aBoolean8805
		    = intStack[--intStackOffset] == 1;
		return;
	    }
	    if (i == 5229) {
		intStack[intStackOffset++]
		    = Class348_Sub1_Sub1.aBoolean8805 ? 1 : 0;
		return;
	    }
	    if (i == 5230) {
		int i_85_ = intStack[--intStackOffset];
		Class27.method314((byte) -74, i_85_);
		return;
	    }
	    if (i == 5231) {
		intStackOffset -= 2;
		int i_86_ = intStack[intStackOffset];
		boolean bool_87_ = intStack[intStackOffset + 1] == 1;
		if (Class348_Sub42_Sub9_Sub1.aClass356_10442 != null) {
		    Node class348
			= Class348_Sub42_Sub9_Sub1.aClass356_10442
			      .get((long) i_86_);
		    if (class348 != null && !bool_87_)
			class348.removeNode();
		    else if (class348 == null && bool_87_) {
			class348 = new Node();
			Class348_Sub42_Sub9_Sub1.aClass356_10442
			    .putNode((long) i_86_, class348);
		    }
		}
		return;
	    }
	    if (i == 5232) {
		int i_88_ = intStack[--intStackOffset];
		if (Class348_Sub42_Sub9_Sub1.aClass356_10442 != null) {
		    Node class348
			= Class348_Sub42_Sub9_Sub1.aClass356_10442
			      .get((long) i_88_);
		    intStack[intStackOffset++] = class348 != null ? 1 : 0;
		} else {
		    intStack[intStackOffset++] = 0;
		    return;
		}
		return;
	    }
	    if (i == 5233) {
		intStackOffset -= 2;
		int i_89_ = intStack[intStackOffset];
		boolean bool_90_ = intStack[intStackOffset + 1] == 1;
		if (Class158.aClass356_4934 != null) {
		    Node class348
			= Class158.aClass356_4934.get((long) i_89_);
		    if (class348 != null && !bool_90_)
			class348.removeNode();
		    else if (class348 == null && bool_90_) {
			class348 = new Node();
			Class158.aClass356_4934
			    .putNode((long) i_89_, class348);
		    }
		}
		return;
	    }
	    if (i == 5234) {
		int i_91_ = intStack[--intStackOffset];
		if (Class158.aClass356_4934 != null) {
		    Node class348
			= Class158.aClass356_4934.get((long) i_91_);
		    intStack[intStackOffset++] = class348 != null ? 1 : 0;
		} else {
		    intStack[intStackOffset++] = 0;
		    return;
		}
		return;
	    }
	    if (i == 5235) {
		intStack[intStackOffset++]
		    = (Class75.aClass348_Sub42_Sub14_1243 != null
		       ? ((Class348_Sub42_Sub14)
			  Class75.aClass348_Sub42_Sub14_1243).anInt9628
		       : -1);
		return;
	    }
	    if (i == 5236) {
		intStackOffset -= 2;
		int i_92_ = intStack[intStackOffset];
		int i_93_ = intStack[intStackOffset + 1];
		int i_94_ = i_93_ >> 14 & 0x3fff;
		int i_95_ = i_93_ & 0x3fff;
		int i_96_
		    = Class239_Sub8.method1754(true, i_92_, i_94_, i_95_);
		if (i_96_ < 0)
		    intStack[intStackOffset++] = -1;
		else {
		    intStack[intStackOffset++] = i_96_;
		    return;
		}
		return;
	    }
	    if (i == 5237) {
		Class130_Sub1.method1134(86);
		return;
	    }
	} else if (i < 5400) {
	    if (i == 5300) {
		intStackOffset -= 2;
		int i_97_ = intStack[intStackOffset];
		int i_98_ = intStack[intStackOffset + 1];
		Whirlpool.method830(3, i_97_, (byte) 102, false, i_98_);
		intStack[intStackOffset++]
		    = Class34.aFrame476 != null ? 1 : 0;
		return;
	    }
	    if (i == 5301) {
		if (Class34.aFrame476 != null)
		    Whirlpool.method830(((Class348_Sub51)
				       BitmapTable.aClass348_Sub51_3959)
					  .aClass239_Sub8_7227
					  .method1751(-32350),
				      -1, (byte) 102, false, -1);
		return;
	    }
	    if (i == 5302) {
		Class57[] class57s = Class318_Sub9_Sub1.method2515(1494);
		intStack[intStackOffset++] = class57s.length;
		return;
	    }
	    if (i == 5303) {
		int i_99_ = intStack[--intStackOffset];
		Class57[] class57s = Class318_Sub9_Sub1.method2515(1494);
		intStack[intStackOffset++]
		    = ((Class57) class57s[i_99_]).anInt1047;
		intStack[intStackOffset++]
		    = ((Class57) class57s[i_99_]).anInt1054;
		return;
	    }
	    if (i == 5305) {
		int i_100_ = AbstractKeyboardListener.anInt4276;
		int i_101_ = Class239_Sub8.anInt5911;
		int i_102_ = -1;
		Class57[] class57s = Class318_Sub9_Sub1.method2515(1494);
		for (int i_103_ = 0; i_103_ < class57s.length; i_103_++) {
		    Class57 class57 = class57s[i_103_];
		    if (((Class57) class57).anInt1047 == i_100_
			&& ((Class57) class57).anInt1054 == i_101_) {
			i_102_ = i_103_;
			break;
		    }
		}
		intStack[intStackOffset++] = i_102_;
		return;
	    }
	    if (i == 5306) {
		intStack[intStackOffset++] = Class348_Sub42_Sub12.method3229();
		return;
	    }
	    if (i == 5307) {
		int i_104_ = intStack[--intStackOffset];
		if (i_104_ >= 1 && i_104_ <= 2) {
		    Whirlpool.method830(i_104_, -1, (byte) 102, false, -1);
		    return;
		}
		return;
	    }
	    if (i == 5308) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub8_7227.method1751(-32350);
		return;
	    }
	    if (i == 5309) {
		int i_105_ = intStack[--intStackOffset];
		if (i_105_ >= 1 && i_105_ <= 2) {
		    BitmapTable.aClass348_Sub51_3959.method3429
			((byte) 74,
			 (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub8_7227),
			 i_105_);
		    BitmapTable.aClass348_Sub51_3959.method3429
			((byte) 74,
			 (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub8_7254),
			 i_105_);
		    Class14_Sub2.method243(37);
		    return;
		}
		return;
	    }
	} else if (i < 5500) {
	    if (i == 5400) {
		anInt1170 -= 2;
		String string = strStack[anInt1170];
		String string_106_ = strStack[anInt1170 + 1];
		int i_107_ = intStack[--intStackOffset];
		anInt1171++;
		BufferedPacket class348_sub47
		    = Class286_Sub3.createBufferedPacket((Class348_Sub40_Sub17
						.aClass351_9234),
					       (Class348_Sub23_Sub2
						.outgoingGameIsaac));
		((BufferedPacket) class348_sub47).buffer
		    .putByte
		    ((Class239_Sub6.getStringLength(string, -65)
		      + Class239_Sub6.getStringLength(string_106_, -65) + 1));
		((BufferedPacket) class348_sub47).buffer
		    .putJStr((byte) -5, string);
		((BufferedPacket) class348_sub47).buffer
		    .putJStr((byte) -5, string_106_);
		((BufferedPacket) class348_sub47).buffer
		    .putByte(i_107_);
		Class348_Sub42_Sub14.putBufferedPacket(-66, class348_sub47);
		return;
	    }
	    if (i == 5401) {
		intStackOffset -= 2;
		Class318_Sub6.aShortArray6428[intStack[intStackOffset]]
		    = (short) aa.method160(27076,
					   intStack[intStackOffset + 1]);
		ToolkitException.itemLoader.method1930(-21804);
		ToolkitException.itemLoader.method1936(-71);
		Class189.npcLoader.method2074(-118);
		Class354.method3466(125);
		return;
	    }
	    if (i == 5405) {
		intStackOffset -= 2;
		int i_108_ = intStack[intStackOffset];
		int i_109_ = intStack[intStackOffset + 1];
		if (i_108_ >= 0 && i_108_ < 2)
		    Class348_Sub43.anIntArrayArrayArray7079[i_108_]
			= new int[i_109_ << 1][4];
		return;
	    }
	    if (i == 5406) {
		intStackOffset -= 7;
		int i_110_ = intStack[intStackOffset];
		int i_111_ = intStack[intStackOffset + 1] << 1;
		int i_112_ = intStack[intStackOffset + 2];
		int i_113_ = intStack[intStackOffset + 3];
		int i_114_ = intStack[intStackOffset + 4];
		int i_115_ = intStack[intStackOffset + 5];
		int i_116_ = intStack[intStackOffset + 6];
		if (i_110_ >= 0 && i_110_ < 2
		    && Class348_Sub43.anIntArrayArrayArray7079[i_110_] != null
		    && i_111_ >= 0
		    && i_111_ < (Class348_Sub43.anIntArrayArrayArray7079
				 [i_110_]).length) {
		    Class348_Sub43.anIntArrayArrayArray7079[i_110_][i_111_]
			= new int[] { (i_112_ >> 14 & 0x3fff) << 9,
				      i_113_ << 2, (i_112_ & 0x3fff) << 9,
				      i_116_ };
		    Class348_Sub43.anIntArrayArrayArray7079[i_110_][i_111_ + 1]
			= new int[] { (i_114_ >> 14 & 0x3fff) << 9,
				      i_115_ << 2, (i_114_ & 0x3fff) << 9 };
		}
		return;
	    }
	    if (i == 5407) {
		int i_117_ = ((Class348_Sub43.anIntArrayArrayArray7079
			       [intStack[--intStackOffset]]).length
			      >> 1);
		intStack[intStackOffset++] = i_117_;
		return;
	    }
	    if (i == 5411) {
		if (Class34.aFrame476 != null)
		    Whirlpool.method830(((Class348_Sub51)
				       BitmapTable.aClass348_Sub51_3959)
					  .aClass239_Sub8_7227
					  .method1751(-32350),
				      -1, (byte) 102, false, -1);
		if (ColorNode.aFrame4904 != null) {
		    Class318_Sub1_Sub2.writeScriptSettings(97);
		    System.exit(0);
		} else {
		    String string
			= (Class116.aString1761 != null ? Class116.aString1761
			   : Class286_Sub6.method2162(false));
		    Class179.method1360(string,
					Class348_Sub23_Sub1.signlink,
					((Class348_Sub51)
					 BitmapTable.aClass348_Sub51_3959)
					    .aClass239_Sub25_7271
					    .method1829(-32350) == 1,
					false, -47);
		    return;
		}
		return;
	    }
	    if (i == 5419) {
		String string = "";
		if (Class348_Sub42_Sub6.aClass144_9536 != null) {
		    if (Class348_Sub42_Sub6.aClass144_9536.returnObj
			!= null)
			string = (String) (Class348_Sub42_Sub6.aClass144_9536
					   .returnObj);
		    else
			string
			    = Class235.method1669(-19918,
						  (Class348_Sub42_Sub6
						   .aClass144_9536.intParam));
		}
		strStack[anInt1170++] = string;
		return;
	    }
	    if (i == 5420) {
		intStack[intStackOffset++] = (((Signlink) Class348_Sub23_Sub1.signlink).allowsFileOperations) ? 0 : 1;
		return;
	    }
	    if (i == 5421) {
		if (Class34.aFrame476 != null)
		    Whirlpool.method830(((Class348_Sub51)
				       BitmapTable.aClass348_Sub51_3959)
					  .aClass239_Sub8_7227
					  .method1751(-32350),
				      -1, (byte) 102, false, -1);
		String string = strStack[--anInt1170];
		boolean bool_118_ = intStack[--intStackOffset] == 1;
		String string_119_ = Class286_Sub6.method2162(false) + string;
		Class179.method1360(string_119_,
				    Class348_Sub23_Sub1.signlink,
				    ((Class348_Sub51)
				     BitmapTable.aClass348_Sub51_3959)
					.aClass239_Sub25_7271
					.method1829(-32350) == 1,
				    bool_118_, 104);
		return;
	    }
	    if (i == 5422) {
		anInt1170 -= 2;
		String string = strStack[anInt1170];
		String string_120_ = strStack[anInt1170 + 1];
		int i_121_ = intStack[--intStackOffset];
		if (string.length() > 0) {
		    if (Class367_Sub9.aStringArray7378 == null)
			Class367_Sub9.aStringArray7378
			    = new String[(Class272.anIntArray3475
					  [((GameMode)
					    (Class348_Sub42_Sub8_Sub2
					     .gameType)).id])];
		    Class367_Sub9.aStringArray7378[i_121_] = string;
		}
		if (string_120_.length() > 0) {
		    if (Class54.aStringArray974 == null)
			Class54.aStringArray974
			    = new String[(Class272.anIntArray3475
					  [((GameMode)
					    (Class348_Sub42_Sub8_Sub2
					     .gameType)).id])];
		    Class54.aStringArray974[i_121_] = string_120_;
		}
		return;
	    }
	    if (i == 5423) {
		System.out.println(strStack[--anInt1170]);
		return;
	    }
	    if (i == 5424) {
		intStackOffset -= 11;
		Class264.anInt3376 = intStack[intStackOffset];
		ObjectDefinition.anInt948 = intStack[intStackOffset + 1];
		Class264.anInt3374 = intStack[intStackOffset + 2];
		Class348_Sub42_Sub4.anInt9511 = intStack[intStackOffset + 3];
		Class231.anInt2996 = intStack[intStackOffset + 4];
		Class348_Sub40_Sub16.anInt9231 = intStack[intStackOffset + 5];
		Class318_Sub1_Sub3_Sub3.anInt10257 = intStack[intStackOffset + 6];
		Class313.anInt3937 = intStack[intStackOffset + 7];
		NpcDefinition.anInt1387 = intStack[intStackOffset + 8];
		Class348_Sub42_Sub11.anInt9586 = intStack[intStackOffset + 9];
		Class5_Sub2.anInt8363 = intStack[intStackOffset + 10];
		Class21.indexLoader8.getArchiveLoaded(false, Class231.anInt2996);
		Class21.indexLoader8.getArchiveLoaded(false, Class348_Sub40_Sub16.anInt9231);
		Class21.indexLoader8.getArchiveLoaded(false, Class318_Sub1_Sub3_Sub3.anInt10257);
		Class21.indexLoader8.getArchiveLoaded(false, Class313.anInt3937);
		Class21.indexLoader8.getArchiveLoaded(false, NpcDefinition.anInt1387);
		WidgetVariable.aClass105_9659
		    = AbstractLobbyWorld.aClass105_1706 = Class174.aClass105_2309 = null;
		DummyOutputstream.aClass105_106 = Class121.aClass105_1800
		    = Class348_Sub5.aClass105_6627 = null;
		WidgetVariable.aClass105_9658
		    = NativeLibTracker.aClass105_4808 = null;
		Class71.aBoolean1211 = true;
		return;
	    }
	    if (i == 5425) {
		GameText.method2061(12);
		Class71.aBoolean1211 = false;
		return;
	    }
	    if (i == 5426) {
		intStackOffset -= 2;
		OndemandFileRequest.anInt10447
		    = intStack[intStackOffset];
		Class38.anInt506 = intStack[intStackOffset + 1];
		return;
	    }
	    if (i == 5427) {
		intStackOffset -= 2;
		Class286_Sub8.anInt6299 = intStack[intStackOffset + 1];
		return;
	    }
	    if (i == 5428) {
		intStackOffset -= 2;
		int i_122_ = intStack[intStackOffset];
		int i_123_ = intStack[intStackOffset + 1];
		intStack[intStackOffset++]
		    = Class318_Sub1_Sub3.method2410((byte) -49, i_123_,
						    i_122_) ? 1 : 0;
		return;
	    }
	    if (i == 5429) {
		StringVarScriptSettingLoader.method812(strStack[--anInt1170], false, false,
				  (byte) -79);
		return;
	    }
	    if (i == 5430) {
		try {
		    Class224.method1617((byte) 125, Class93.loaderApplet,
					"accountcreated");
		} catch (Throwable throwable) {
		    /* empty */
		}
		return;
	    }
	    if (i == 5431) {
		try {
		    Class224.method1617((byte) 125, Class93.loaderApplet,
					"accountcreatestarted");
		} catch (Throwable throwable) {
		    /* empty */
		}
		return;
	    }
	    if (i == 5432) {
		String string = "";
		if (Class348_Sub40_Sub27.systemClipboard != null) {
		    Transferable transferable
			= Class348_Sub40_Sub27.systemClipboard
			      .getContents(null);
		    if (transferable != null) {
			try {
			    string = (String) (transferable.getTransferData
					       (DataFlavor.stringFlavor));
			    if (string == null)
				string = "";
			} catch (Exception exception) {
			    /* empty */
			}
		    }
		}
		strStack[anInt1170++] = string;
		return;
	    }
	    if (i == 5433) {
		Class332.anInt4143 = intStack[--intStackOffset];
		return;
	    }
	} else if (i < 5600) {
	    if (i == 5500) {
		intStackOffset -= 4;
		int i_124_ = intStack[intStackOffset];
		int i_125_ = intStack[intStackOffset + 1];
		int i_126_ = intStack[intStackOffset + 2];
		int i_127_ = intStack[intStackOffset + 3];
		Class239_Sub28.method1844(i_126_,
					  ((i_124_ >> 14 & 0x3fff)
					   - za_Sub2.anInt9780),
					  false, i_125_ << 2, false, i_127_,
					  ((i_124_ & 0x3fff)
					   - Class90.anInt1517));
		return;
	    }
	    if (i == 5501) {
		intStackOffset -= 4;
		int i_128_ = intStack[intStackOffset];
		int i_129_ = intStack[intStackOffset + 1];
		int i_130_ = intStack[intStackOffset + 2];
		int i_131_ = intStack[intStackOffset + 3];
		Class348_Sub42_Sub12.method3231(((i_128_ & 0x3fff)
						 - Class90.anInt1517),
						((i_128_ >> 14 & 0x3fff)
						 - za_Sub2.anInt9780),
						i_129_ << 2, i_131_, i_130_,
						-128);
		return;
	    }
	    if (i == 5502) {
		intStackOffset -= 6;
		int i_132_ = intStack[intStackOffset];
		if (i_132_ >= 2)
		    throw new RuntimeException();
		za_Sub1.anInt9775 = i_132_;
		int i_133_ = intStack[intStackOffset + 1];
		if (i_133_ + 1 >= (Class348_Sub43.anIntArrayArrayArray7079
				   [za_Sub1.anInt9775]).length >> 1)
		    throw new RuntimeException();
		ItemDefinition.anInt2798 = i_133_;
		Class117.anInt1780 = 0;
		ModernLoadingScreen.anInt5019 = intStack[intStackOffset + 2];
		Class331.anInt4133 = intStack[intStackOffset + 3];
		int i_134_ = intStack[intStackOffset + 4];
		if (i_134_ >= 2)
		    throw new RuntimeException();
		FileIndexTracker.anInt4803 = i_134_;
		int i_135_ = intStack[intStackOffset + 5];
		if (i_135_ + 1 >= (Class348_Sub43.anIntArrayArrayArray7079
				   [FileIndexTracker.anInt4803]).length >> 1)
		    throw new RuntimeException();
		Class264.anInt3373 = i_135_;
		Class348_Sub40_Sub21.anInt9282 = 3;
		Class9.anInt167 = Class318_Sub1_Sub5_Sub2.anInt10163 = -1;
		return;
	    }
	    if (i == 5503) {
		Class128.method1122(0);
		return;
	    }
	    if (i == 5504) {
		intStackOffset -= 2;
		Class318_Sub1_Sub1.method2396(intStack[intStackOffset],
					      intStack[intStackOffset + 1], 0,
					      3);
		return;
	    }
	    if (i == 5505) {
		intStack[intStackOffset++] = (int) Class76.aFloat1287 >> 3;
		return;
	    }
	    if (i == 5506) {
		intStack[intStackOffset++] = (int) AbtractArchiveLoader.aFloat3938 >> 3;
		return;
	    }
	    if (i == 5507) {
		Class31.method326((byte) 68);
		return;
	    }
	    if (i == 5508) {
		Class355.method3470(1);
		return;
	    }
	    if (i == 5509) {
		Class286_Sub3.method2153(-77);
		return;
	    }
	    if (i == 5510) {
		Class16.method262(0);
		return;
	    }
	    if (i == 5511) {
		int i_136_ = intStack[--intStackOffset];
		int i_137_ = i_136_ >> 14 & 0x3fff;
		int i_138_ = i_136_ & 0x3fff;
		i_137_ -= za_Sub2.anInt9780;
		if (i_137_ < 0)
		    i_137_ = 0;
		else if (i_137_ >= Class367_Sub4.anInt7319)
		    i_137_ = Class367_Sub4.anInt7319;
		i_138_ -= Class90.anInt1517;
		if (i_138_ < 0)
		    i_138_ = 0;
		else if (i_138_ >= Class348_Sub40_Sub3.anInt9109)
		    i_138_ = Class348_Sub40_Sub3.anInt9109;
		Class348_Sub6.anInt6633 = (i_137_ << 9) + 256;
		Class348_Sub7.anInt6652 = (i_138_ << 9) + 256;
		Class348_Sub40_Sub21.anInt9282 = 4;
		Class9.anInt167 = Class318_Sub1_Sub5_Sub2.anInt10163 = -1;
		return;
	    }
	    if (i == 5512) {
		Class239_Sub29.method1851((byte) 121);
		return;
	    }
	    if (i == 5514) {
		Class132.anInt1911 = intStack[--intStackOffset];
		return;
	    }
	    if (i == 5516) {
		intStack[intStackOffset++] = Class132.anInt1911;
		return;
	    }
	    if (i == 5517) {
		int i_139_ = intStack[--intStackOffset];
		if (i_139_ == -1) {
		    int i_140_ = i_139_ >> 14 & 0x3fff;
		    int i_141_ = i_139_ & 0x3fff;
		    i_140_ -= za_Sub2.anInt9780;
		    if (i_140_ < 0)
			i_140_ = 0;
		    else if (i_140_ >= Class367_Sub4.anInt7319)
			i_140_ = Class367_Sub4.anInt7319;
		    i_141_ -= Class90.anInt1517;
		    if (i_141_ < 0)
			i_141_ = 0;
		    else if (i_141_ >= Class348_Sub40_Sub3.anInt9109)
			i_141_ = Class348_Sub40_Sub3.anInt9109;
		    Class9.anInt167 = (i_140_ << 9) + 256;
		    Class318_Sub1_Sub5_Sub2.anInt10163 = (i_141_ << 9) + 256;
		} else {
		    Class9.anInt167 = -1;
		    Class318_Sub1_Sub5_Sub2.anInt10163 = -1;
		    return;
		}
		return;
	    }
	} else if (i < 5700) {
	    if (i == 5600) {
		anInt1170 -= 2;
		String string = strStack[anInt1170];
		String string_142_ = strStack[anInt1170 + 1];
		int i_143_ = intStack[--intStackOffset];
		if (string.length() <= 320 && Class240.anInt4674 == 3 && (Class225.anInt2955 == 0 && Class367_Sub2.anInt7297 == 0)) {
		    Class64_Sub3.aString5600 = string;
		    Class186.aString2496 = string_142_;
		    RuntimeException_Sub1.anInt4596 = i_143_;
		    ByteBuffer.setClientState(2, 6);
		    return;
		}
		return;
	    }
	    if (i == 5601) {
		Class90.method854((byte) -76);
		return;
	    }
	    if (i == 5602) {
		if (Class225.anInt2955 == 0) {
		    Queue.anInt1645 = -2;
		    Class348_Sub6.anInt6634 = -2;
		}
		return;
	    }
	    if (i == 5604) {
		anInt1170--;
		if (Class240.anInt4674 == 3
		    && (Class225.anInt2955 == 0
			&& Class367_Sub2.anInt7297 == 0)) {
		    Class281.method2106(strStack[anInt1170], 101);
		    return;
		}
		return;
	    }
	    if (i == 5605) {
		anInt1170 -= 2;
		intStackOffset -= 2;
		if (Class240.anInt4674 == 3
		    && (Class225.anInt2955 == 0
			&& Class367_Sub2.anInt7297 == 0)) {
		    Class48.method449(strStack[anInt1170 + 1],
				      strStack[anInt1170], false,
				      intStack[intStackOffset],
				      intStack[intStackOffset + 1] == 1);
		    return;
		}
		return;
	    }
	    if (i == 5606) {
		if (Class367_Sub2.anInt7297 == 0)
		    GameFont.connectionOpcode = -2;
		return;
	    }
	    if (i == 5607) {
		intStack[intStackOffset++] = Class348_Sub6.anInt6634;
		return;
	    }
	    if (i == 5608) {
		intStack[intStackOffset++] = Class63.anInt1121;
		return;
	    }
	    if (i == 5609) {
		intStack[intStackOffset++] = GameFont.connectionOpcode;
		return;
	    }
	    if (i == 5611) {
		intStack[intStackOffset++] = Class348_Sub42_Sub7.anInt9541;
		return;
	    }
	    if (i == 5612) {
		int i_144_ = intStack[--intStackOffset];
		if (Class240.anInt4674 == 7
		    && (Class225.anInt2955 == 0
			&& Class367_Sub2.anInt7297 == 0)) {
		    if (Class348_Sub40_Sub8.gameConnection != null) {
			Class348_Sub40_Sub8.gameConnection
			    .method1700((byte) 36);
			Class348_Sub40_Sub8.gameConnection = null;
		    }
		    RuntimeException_Sub1.anInt4596 = i_144_;
		    ByteBuffer.setClientState(2, 9);
		    return;
		}
		return;
	    }
	    if (i == 5613) {
		intStack[intStackOffset++] = Class348_Sub6.anInt6634;
		return;
	    }
	    if (i == 5615) {
		anInt1170 -= 2;
		String string = strStack[anInt1170];
		String string_145_ = strStack[anInt1170 + 1];
		if (string.length() <= 320 && Class240.anInt4674 == 3
		    && (Class225.anInt2955 == 0
			&& Class367_Sub2.anInt7297 == 0)) {
		    if (Class348_Sub40_Sub8.gameConnection != null) {
			Class348_Sub40_Sub8.gameConnection
			    .method1700((byte) 36);
			Class348_Sub40_Sub8.gameConnection = null;
		    }
		    Class64_Sub3.aString5600 = string;
		    Class186.aString2496 = string_145_;
		    ByteBuffer.setClientState(2, 5);
		    return;
		}
		return;
	    }
	    if (i == 5616) {
		Class348_Sub40_Sub34.method3141(false, (byte) 11);
		return;
	    }
	    if (i == 5617) {
		intStack[intStackOffset++] = Queue.anInt1645;
		return;
	    }
	    if (i == 5618) {
		intStackOffset--;
		return;
	    }
	    if (i == 5619) {
		intStackOffset--;
		return;
	    }
	    if (i == 5620) {
		intStack[intStackOffset++] = 0;
		return;
	    }
	    if (i == 5621) {
		anInt1170 -= 2;
		intStackOffset -= 2;
		return;
	    }
	    if (i == 5622)
		return;
	    if (i == 5623) {
		if (Class348_Sub23_Sub3.sskeyStr != null)
		    intStack[intStackOffset++] = 1;
		else {
		    intStack[intStackOffset++] = 0;
		    return;
		}
		return;
	    }
	    if (i == 5624) {
		intStack[intStackOffset++] = (int) (TextureLoader.aLong4615 >> 32);
		intStack[intStackOffset++]
		    = (int) (TextureLoader.aLong4615 & 0xffffL);
		return;
	    }
	    if (i == 5625) {
		intStack[intStackOffset++] = Class330.aBoolean4127 ? 1 : 0;
		return;
	    }
	    if (i == 5626) {
		Class330.aBoolean4127 = true;
		Class286_Sub8.method2172(84);
		return;
	    }
	} else if (i < 6100) {
	    if (i == 6001) {
		int i_146_ = intStack[--intStackOffset];
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub10_7232),
		     i_146_);
		Class348_Sub20.method2953((byte) -126);
		Class14_Sub2.method243(37);
		r.aBoolean9719 = false;
		return;
	    }
	    if (i == 6002) {
		boolean bool_147_ = intStack[--intStackOffset] == 1;
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub27_7255),
		     bool_147_ ? 1 : 0);
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub27_7261),
		     bool_147_ ? 1 : 0);
		Class348_Sub20.method2953((byte) -122);
		Class348_Sub40_Sub9.method3072((byte) 32);
		Class14_Sub2.method243(37);
		r.aBoolean9719 = false;
		return;
	    }
	    if (i == 6003) {
		boolean bool_148_ = intStack[--intStackOffset] == 1;
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub14_7250),
		     bool_148_ ? 2 : 1);
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub14_7264),
		     bool_148_ ? 2 : 1);
		Class348_Sub40_Sub9.method3072((byte) -106);
		Class14_Sub2.method243(37);
		r.aBoolean9719 = false;
		return;
	    }
	    if (i == 6005) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub4_7220),
		     intStack[--intStackOffset] == 1 ? 1 : 0);
		Class348_Sub20.method2953((byte) -111);
		Class14_Sub2.method243(37);
		r.aBoolean9719 = false;
		return;
	    }
	    if (i == 6007) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub13_7236),
		     intStack[--intStackOffset]);
		Class14_Sub2.method243(37);
		r.aBoolean9719 = false;
		return;
	    }
	    if (i == 6008) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub1_7246),
		     intStack[--intStackOffset] == 1 ? 1 : 0);
		Class14_Sub2.method243(37);
		r.aBoolean9719 = false;
		return;
	    }
	    if (i == 6010) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub21_7270),
		     intStack[--intStackOffset] == 1 ? 1 : 0);
		Class14_Sub2.method243(37);
		r.aBoolean9719 = false;
		return;
	    }
	    if (i == 6011) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub7_7238),
		     intStack[--intStackOffset]);
		Class348_Sub20.method2953((byte) -116);
		Class14_Sub2.method243(37);
		r.aBoolean9719 = false;
		return;
	    }
	    if (i == 6012) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub28_7230),
		     intStack[--intStackOffset] == 1 ? 1 : 0);
		Class348_Sub40.method3038(-1);
		Class76.method773(true);
		Class14_Sub2.method243(37);
		r.aBoolean9719 = false;
		return;
	    }
	    if (i == 6014) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub18_7259),
		     intStack[--intStackOffset] == 1 ? 2 : 0);
		Class348_Sub20.method2953((byte) -112);
		Class14_Sub2.method243(37);
		r.aBoolean9719 = false;
		return;
	    }
	    if (i == 6015) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub16_7247),
		     intStack[--intStackOffset] == 1 ? 1 : 0);
		Class348_Sub20.method2953((byte) -127);
		Class14_Sub2.method243(37);
		r.aBoolean9719 = false;
		return;
	    }
	    if (i == 6016) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub20_7248),
		     intStack[--intStackOffset]);
		Class367_Sub10.method3553(false, (byte) 112,
					  ((Class348_Sub51)
					   BitmapTable.aClass348_Sub51_3959)
					      .aClass239_Sub25_7271
					      .method1829(-32350));
		Class14_Sub2.method243(37);
		return;
	    }
	    if (i == 6017) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub5_7240),
		     intStack[--intStackOffset] == 1 ? 1 : 0);
		Class35.method352(1);
		Class14_Sub2.method243(37);
		r.aBoolean9719 = false;
		return;
	    }
	    if (i == 6018) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub26_7272),
		     intStack[--intStackOffset]);
		Class14_Sub2.method243(37);
		r.aBoolean9719 = false;
		return;
	    }
	    if (i == 6019) {
		int i_149_ = intStack[--intStackOffset];
		int i_150_ = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
				 .aClass239_Sub26_7260.method1838(-32350);
		if (i_149_ != i_150_) {
		    if (Class334.method2653(true, Class240.anInt4674)) {
			if (i_150_ == 0 && RequiredElement.anInt3428 != -1) {
			    Class348_Sub1_Sub3.method2732(0,
							  RequiredElement.anInt3428,
							  false, 94,
							  (Class59_Sub2_Sub1
							   .indexLoader6),
							  i_149_);
			    Class348_Sub40_Sub17_Sub1.method3093(87);
			    Class74.aBoolean1236 = false;
			} else if (i_149_ == 0) {
			    Class104.method960(1);
			    Class74.aBoolean1236 = false;
			} else
			    Class34.method345(i_149_, (byte) -49);
		    }
		    BitmapTable.aClass348_Sub51_3959.method3429
			((byte) 74,
			 (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub26_7260),
			 i_149_);
		    Class14_Sub2.method243(37);
		    r.aBoolean9719 = false;
		}
		return;
	    }
	    if (i == 6020) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub26_7234),
		     intStack[--intStackOffset]);
		Class14_Sub2.method243(37);
		r.aBoolean9719 = false;
		return;
	    }
	    if (i == 6021) {
		int i_151_ = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
				 .aClass239_Sub14_7250.method1778(-32350);
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub14_7264),
		     intStack[--intStackOffset] == 1 ? 0 : i_151_);
		Class348_Sub40_Sub9.method3072((byte) -118);
		return;
	    }
	    if (i == 6023) {
		int i_152_ = intStack[--intStackOffset];
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub15_7224),
		     i_152_);
		Class14_Sub2.method243(37);
		r.aBoolean9719 = false;
		return;
	    }
	    if (i == 6024) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub20_7216),
		     intStack[--intStackOffset]);
		Class14_Sub2.method243(37);
		return;
	    }
	    if (i == 6025) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub6_7226),
		     intStack[--intStackOffset]);
		Class14_Sub2.method243(37);
		r.aBoolean9719 = false;
		return;
	    }
	    if (i == 6027) {
		int i_153_ = intStack[--intStackOffset];
		if (i_153_ < 0 || i_153_ > 1)
		    i_153_ = 0;
		Class348_Sub40_Sub33.method3137(i_153_ == 1, (byte) -24);
		return;
	    }
	    if (i == 6028) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub22_7253),
		     intStack[--intStackOffset] != 0 ? 1 : 0);
		Class14_Sub2.method243(37);
		return;
	    }
	    if (i == 6029) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub13_7236),
		     intStack[--intStackOffset]);
		Class14_Sub2.method243(37);
		return;
	    }
	    if (i == 6030) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub9_7256),
		     intStack[--intStackOffset] != 0 ? 1 : 0);
		Class14_Sub2.method243(37);
		Class348_Sub20.method2953((byte) -116);
		return;
	    }
	    if (i == 6031) {
		int i_154_ = intStack[--intStackOffset];
		if (i_154_ < 0 || i_154_ > 5)
		    i_154_ = 2;
		Class367_Sub10.method3553(false, (byte) 101, i_154_);
		return;
	    }
	    if (i == 6032) {
		intStackOffset -= 2;
		int i_155_ = intStack[intStackOffset];
		boolean bool_156_ = intStack[intStackOffset + 1] == 1;
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub25_7251),
		     i_155_);
		if (!bool_156_)
		    BitmapTable.aClass348_Sub51_3959.method3429
			((byte) 74,
			 (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub29_7229),
			 0);
		Class14_Sub2.method243(37);
		r.aBoolean9719 = false;
		return;
	    }
	    if (i == 6033) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub17_7263),
		     intStack[--intStackOffset]);
		Class14_Sub2.method243(37);
		return;
	    }
	    if (i == 6034) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub24_7235),
		     intStack[--intStackOffset] == 1 ? 1 : 0);
		Class14_Sub2.method243(37);
		Class348_Sub40.method3038(-1);
		r.aBoolean9719 = false;
		return;
	    }
	    if (i == 6035) {
		int i_157_ = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
				 .aClass239_Sub27_7255.method1840(-32350);
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub27_7261),
		     intStack[--intStackOffset] == 1 ? 1 : i_157_);
		Class348_Sub20.method2953((byte) -110);
		Class348_Sub40_Sub9.method3072((byte) 125);
		return;
	    }
	    if (i == 6036) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub23_7231),
		     intStack[--intStackOffset]);
		Class14_Sub2.method243(37);
		RuntimeException_Sub1.aBoolean4604 = true;
		return;
	    }
	    if (i == 6037) {
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub26_7215),
		     intStack[--intStackOffset]);
		Class14_Sub2.method243(37);
		r.aBoolean9719 = false;
		return;
	    }
	    if (i == 6038) {
		int i_158_ = intStack[--intStackOffset];
		int i_159_ = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
				 .aClass239_Sub26_7245.method1838(-32350);
		if (i_158_ != i_159_
		    && RequiredElement.anInt3428 == Class345.anInt4270) {
		    if (!Class334.method2653(true, Class240.anInt4674)) {
			if (i_159_ == 0) {
			    Class348_Sub1_Sub3.method2732(0,
							  RequiredElement.anInt3428,
							  false, 127,
							  (Class59_Sub2_Sub1
							   .indexLoader6),
							  i_158_);
			    Class348_Sub40_Sub17_Sub1.method3093(118);
			    Class74.aBoolean1236 = false;
			} else if (i_158_ == 0) {
			    Class104.method960(1);
			    Class74.aBoolean1236 = false;
			} else
			    Class34.method345(i_158_, (byte) -52);
		    }
		    BitmapTable.aClass348_Sub51_3959.method3429
			((byte) 74,
			 (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub26_7245),
			 i_158_);
		    Class14_Sub2.method243(37);
		    r.aBoolean9719 = false;
		}
		return;
	    }
	    if (i == 6039) {
		int i_160_ = intStack[--intStackOffset];
		if (i_160_ > 255 || i_160_ < 0)
		    i_160_ = 0;
		if (i_160_ != ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
				  .aClass239_Sub19_7257.method1805(-32350)) {
		    BitmapTable.aClass348_Sub51_3959.method3429
			((byte) 74,
			 (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub19_7257),
			 i_160_);
		    Class14_Sub2.method243(37);
		    r.aBoolean9719 = false;
		}
		return;
	    }
	    if (i == 6040) {
		int i_161_ = intStack[--intStackOffset];
		if (i_161_ != ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
				  .aClass239_Sub3_7222.method1727(-32350)) {
		    BitmapTable.aClass348_Sub51_3959.method3429
			((byte) 74,
			 (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub3_7222),
			 i_161_);
		    Class14_Sub2.method243(37);
		    r.aBoolean9719 = false;
		    Class348_Sub42_Sub3.method3179(0);
		}
		return;
	    }
	} else if (i < 6200) {
	    if (i == 6101) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub10_7232.method1764(-32350);
		return;
	    }
	    if (i == 6102) {
		intStack[intStackOffset++]
		    = (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			   .aClass239_Sub27_7255.method1840(-32350) == 1
		       ? 1 : 0);
		return;
	    }
	    if (i == 6103) {
		intStack[intStackOffset++]
		    = (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			   .aClass239_Sub14_7250.method1778(-32350) == 2
		       ? 1 : 0);
		return;
	    }
	    if (i == 6105) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub4_7220.method1737(-32350) == 1 ? 1 : 0;
		return;
	    }
	    if (i == 6107) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub13_7236.method1776(-32350);
		return;
	    }
	    if (i == 6108) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub1_7246.method1720(-32350) == 1 ? 1 : 0;
		return;
	    }
	    if (i == 6110) {
		intStack[intStackOffset++]
		    = (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			   .aClass239_Sub21_7270.method1812(-32350) == 1
		       ? 1 : 0);
		return;
	    }
	    if (i == 6111) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub7_7238.method1748(-32350);
		return;
	    }
	    if (i == 6112) {
		intStack[intStackOffset++]
		    = (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			   .aClass239_Sub28_7230.method1845(-32350) == 1
		       ? 1 : 0);
		return;
	    }
	    if (i == 6114) {
		intStack[intStackOffset++]
		    = (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			   .aClass239_Sub18_7259.method1800(-32350) == 2
		       ? 1 : 0);
		return;
	    }
	    if (i == 6115) {
		intStack[intStackOffset++]
		    = (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			   .aClass239_Sub16_7247.method1789(-32350) == 1
		       ? 1 : 0);
		return;
	    }
	    if (i == 6116) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub20_7248.method1808(-32350);
		return;
	    }
	    if (i == 6117) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub5_7240.method1739(-32350) == 1 ? 1 : 0;
		return;
	    }
	    if (i == 6118) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub26_7272.method1838(-32350);
		return;
	    }
	    if (i == 6119) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub26_7260.method1838(-32350);
		return;
	    }
	    if (i == 6120) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub26_7234.method1838(-32350);
		return;
	    }
	    if (i == 6123) {
		intStack[intStackOffset++] = Class5_Sub2.method197(false);
		return;
	    }
	    if (i == 6124) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub20_7216.method1808(-32350);
		return;
	    }
	    if (i == 6125) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub6_7226.method1743(-32350);
		return;
	    }
	    if (i == 6127) {
		intStack[intStackOffset++]
		    = (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			   .aClass239_Sub12_7243.method1771(-32350) == 1
		       ? 1 : 0);
		return;
	    }
	    if (i == 6128) {
		intStack[intStackOffset++]
		    = (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			   .aClass239_Sub22_7253.method1815(-32350) == 1
		       ? 1 : 0);
		return;
	    }
	    if (i == 6129) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub13_7236.method1776(-32350);
		return;
	    }
	    if (i == 6130) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub9_7256.method1759(-32350) == 1 ? 1 : 0;
		return;
	    }
	    if (i == 6131) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub25_7271.method1829(-32350);
		return;
	    }
	    if (i == 6132) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub25_7251.method1829(-32350);
		return;
	    }
	    if (i == 6133) {
		intStack[intStackOffset++]
		    = ((((Signlink) Class348_Sub23_Sub1.signlink)
			.allowsFileOperations)
		       && !(((Signlink) Class348_Sub23_Sub1.signlink)
			    .aBoolean3794)) ? 1 : 0;
		return;
	    }
	    if (i == 6135) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub17_7263.method1798(-32350);
		return;
	    }
	    if (i == 6136) {
		intStack[intStackOffset++]
		    = (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			   .aClass239_Sub24_7235.method1820(-32350) == 1
		       ? 1 : 0);
		return;
	    }
	    if (i == 6138) {
		intStack[intStackOffset++]
		    = Class239_Sub14.method1781(((Class348_Sub51)
						 BitmapTable.aClass348_Sub51_3959)
						    .aClass239_Sub25_7271
						    .method1829(-32350),
						-84, 200);
		return;
	    }
	    if (i == 6139) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub23_7231.method1818(-32350);
		return;
	    }
	    if (i == 6142) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub26_7215.method1838(-32350);
		return;
	    }
	    if (i == 6143) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub26_7245.method1838(-32350);
		return;
	    }
	    if (i == 6144) {
		intStack[intStackOffset++]
		    = Class348_Sub23_Sub2.aBoolean9038 ? 1 : 0;
		return;
	    }
	    if (i == 6145) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub19_7257.method1805(-32350);
		return;
	    }
	    if (i == 6146) {
		intStack[intStackOffset++]
		    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub3_7222.method1727(-32350);
		return;
	    }
	    if (i == 6147) {
		intStack[intStackOffset++]
		    = (((Class348_Sub4) (Class348_Sub40_Sub20
					 .aClass348_Sub4_9264)).anInt6609 < 512
		       || Class348_Sub23_Sub2.aBoolean9038
		       || Class139.aBoolean1952) ? 1 : 0;
		return;
	    }
	    if (i == 6148) {
		intStack[intStackOffset++] = Class304.aBoolean3847 ? 1 : 0;
		return;
	    }
	} else if (i < 6300) {
	    if (i == 6200) {
		intStackOffset -= 2;
		AbstractLobbyWorld.aShort1700 = (short) intStack[intStackOffset];
		if (AbstractLobbyWorld.aShort1700 <= 0)
		    AbstractLobbyWorld.aShort1700 = (short) 256;
		Class168.aShort2250 = (short) intStack[intStackOffset + 1];
		if (Class168.aShort2250 <= 0)
		    Class168.aShort2250 = (short) 205;
		return;
	    }
	    if (i == 6201) {
		intStackOffset -= 2;
		Class348_Sub23_Sub3.aShort9044
		    = (short) intStack[intStackOffset];
		if (Class348_Sub23_Sub3.aShort9044 <= 0)
		    Class348_Sub23_Sub3.aShort9044 = (short) 256;
		Class320.zoom = (short) intStack[intStackOffset + 1];
		if (Class320.zoom <= 0)
		    Class320.zoom = (short) 320;
		return;
	    }
	    if (i == 6202) {
		intStackOffset -= 4;
		Class348_Sub42_Sub8.aShort9555
		    = (short) intStack[intStackOffset];
		if (Class348_Sub42_Sub8.aShort9555 <= 0)
		    Class348_Sub42_Sub8.aShort9555 = (short) 1;
		Class48.aShort851 = (short) intStack[intStackOffset + 1];
		if (Class48.aShort851 <= 0)
		    Class48.aShort851 = (short) 32767;
		else if (Class48.aShort851 < Class348_Sub42_Sub8.aShort9555)
		    Class48.aShort851 = Class348_Sub42_Sub8.aShort9555;
		Class367_Sub8.aShort7355
		    = (short) intStack[intStackOffset + 2];
		if (Class367_Sub8.aShort7355 <= 0)
		    Class367_Sub8.aShort7355 = (short) 1;
		Class171.aShort2269 = (short) intStack[intStackOffset + 3];
		if (Class171.aShort2269 <= 0)
		    Class171.aShort2269 = (short) 32767;
		else {
		    if (Class171.aShort2269 < Class367_Sub8.aShort7355)
			Class171.aShort2269 = Class367_Sub8.aShort7355;
		    return;
		}
		return;
	    }
	    if (i == 6203) {
		Class348_Sub42_Sub3.method3174
		    (0, 0, ((Widget) Class348_Sub1.aClass46_6561).anInt709,
		     false, (byte) 74,
		     ((Widget) Class348_Sub1.aClass46_6561).anInt789);
		intStack[intStackOffset++] = Class127.anInt4656;
		intStack[intStackOffset++] = Class280.anInt3643;
		return;
	    }
	    if (i == 6204) {
		intStack[intStackOffset++] = Class348_Sub23_Sub3.aShort9044;
		intStack[intStackOffset++] = Class320.zoom;
		return;
	    }
	    if (i == 6205) {
		intStack[intStackOffset++] = AbstractLobbyWorld.aShort1700;
		intStack[intStackOffset++] = Class168.aShort2250;
		return;
	    }
	} else if (i < 6400) {
	    if (i == 6300) {
		intStack[intStackOffset++]
		    = (int) (Class62.getCurrentTimeMillis() / 60000L);
		return;
	    }
	    if (i == 6301) {
		intStack[intStackOffset++]
		    = (int) (Class62.getCurrentTimeMillis() / 86400000L) - 11745;
		return;
	    }
	    if (i == 6302) {
		intStackOffset -= 3;
		int i_162_ = intStack[intStackOffset];
		int i_163_ = intStack[intStackOffset + 1];
		int i_164_ = intStack[intStackOffset + 2];
		calendar.clear();
		calendar.set(11, 12);
		calendar.set(i_164_, i_163_, i_162_);
		int i_165_
		    = ((int) (calendar.getTime().getTime() / 86400000L)
		       - 11745);
		if (i_164_ < 1970)
		    i_165_--;
		intStack[intStackOffset++] = i_165_;
		return;
	    }
	    if (i == 6303) {
		calendar.clear();
		calendar.setTime(new Date(Class62.getCurrentTimeMillis()));
		intStack[intStackOffset++] = calendar.get(1);
		return;
	    }
	    if (i == 6304) {
		int i_166_ = intStack[--intStackOffset];
		boolean bool_167_ = true;
		if (i_166_ < 0)
		    bool_167_ = (i_166_ + 1) % 4 == 0;
		else if (i_166_ < 1582)
		    bool_167_ = i_166_ % 4 == 0;
		else if (i_166_ % 4 != 0)
		    bool_167_ = false;
		else if (i_166_ % 100 != 0)
		    bool_167_ = true;
		else if (i_166_ % 400 != 0)
		    bool_167_ = false;
		intStack[intStackOffset++] = bool_167_ ? 1 : 0;
		return;
	    }
	} else if (i < 6500) {
	    if (i == 6405) {
		intStack[intStackOffset++] = Class67.method717(-2511) ? 1 : 0;
		return;
	    }
	    if (i == 6406) {
		intStack[intStackOffset++]
		    = Class247.method1891(314376967) ? 1 : 0;
		return;
	    }
	} else if (i < 6600) {
	    if (i == 6500) {
		if (Class240.anInt4674 != 7 || Class225.anInt2955 != 0 || Class367_Sub2.anInt7297 != 0)
		    intStack[intStackOffset++] = 1;
		else {
		    if (Class130.aBoolean1899)
			intStack[intStackOffset++] = 0;
		    else {
			if (Class240.lastUpdatedTime > Class62.getCurrentTimeMillis() - 1000L)
			    intStack[intStackOffset++] = 1;
			else {
			    Class130.aBoolean1899 = true;
			    BufferedPacket outgoingBuffer = Class286_Sub3.createBufferedPacket((Class348_Sub23_Sub2.outgoingPacket30), (Class348_Sub23_Sub2.outgoingGameIsaac));
			    ((BufferedPacket) outgoingBuffer).buffer.putInt(Class5_Sub1.lobbyUnknown);
			    Class348_Sub42_Sub14.putBufferedPacket(118, outgoingBuffer);
			    intStack[intStackOffset++] = 0;
			    return;
			}
			return;
		    }
		    return;
		}
		return;
	    }
	    if (i == 6501) {
		LobbyWorld world = Class318_Sub1_Sub5.getFirstLobbyWorld(-97);
		if (world != null) {
		    intStack[intStackOffset++] = ((LobbyWorld) world).anInt5786;
		    intStack[intStackOffset++] = ((AbstractLobbyWorld) world).settings;
		    strStack[anInt1170++] = ((LobbyWorld) world).activity;
		    LobbyRegionInfo class283 = world.getInfo();
		    intStack[intStackOffset++] = ((LobbyRegionInfo) class283).country;
		    strStack[anInt1170++] = ((LobbyRegionInfo) class283).region;
		    intStack[intStackOffset++] = ((AbstractLobbyWorld) world).amountPlayers;
		    intStack[intStackOffset++]= ((LobbyWorld) world).anInt5788;
		    strStack[anInt1170++] = ((LobbyWorld) world).ipAddress;
		} else {
		    intStack[intStackOffset++] = -1;
		    intStack[intStackOffset++] = 0;
		    strStack[anInt1170++] = "";
		    intStack[intStackOffset++] = 0;
		    strStack[anInt1170++] = "";
		    intStack[intStackOffset++] = 0;
		    intStack[intStackOffset++] = 0;
		    strStack[anInt1170++] = "";
		    return;
		}
		return;
	    }
	    if (i == 6502) {
		LobbyWorld class110_sub1 = Class2.getNextLobbyWorld(true);
		if (class110_sub1 != null) {
		    intStack[intStackOffset++] = ((LobbyWorld) class110_sub1).anInt5786;
		    intStack[intStackOffset++] = ((AbstractLobbyWorld) class110_sub1).settings;
		    strStack[anInt1170++] = ((LobbyWorld) class110_sub1).activity;
		    LobbyRegionInfo location = class110_sub1.getInfo();
		    intStack[intStackOffset++] = ((LobbyRegionInfo) location).country;
		    strStack[anInt1170++] = ((LobbyRegionInfo) location).region;
		    intStack[intStackOffset++] = ((AbstractLobbyWorld) class110_sub1).amountPlayers;
		    intStack[intStackOffset++] = ((LobbyWorld) class110_sub1).anInt5788;
		    strStack[anInt1170++] = ((LobbyWorld) class110_sub1).ipAddress;
		} else {
		    intStack[intStackOffset++] = -1;
		    intStack[intStackOffset++] = 0;
		    strStack[anInt1170++] = "";
		    intStack[intStackOffset++] = 0;
		    strStack[anInt1170++] = "";
		    intStack[intStackOffset++] = 0;
		    intStack[intStackOffset++] = 0;
		    strStack[anInt1170++] = "";
		    return;
		}
		return;
	    }
	    if (i == 6503) {
		int i_168_ = intStack[--intStackOffset];
		String string = strStack[--anInt1170];
		if (Class240.anInt4674 != 7 || Class225.anInt2955 != 0 || Class367_Sub2.anInt7297 != 0)
		    intStack[intStackOffset++] = 0;
		else {
		    intStack[intStackOffset++] = (Class348_Sub23_Sub1.method2972(string, i_168_, -42) ? 1 : 0);
		    return;
		}
		return;
	    }
	    if (i == 6506) {
		int worldId = intStack[--intStackOffset];
		LobbyWorld world = Class239_Sub5.getLobbyWorld(worldId);
		if (world != null) {
		    intStack[intStackOffset++] = ((AbstractLobbyWorld) world).settings;
		    strStack[anInt1170++] = ((LobbyWorld) world).activity;
		    LobbyRegionInfo class283 = world.getInfo();
		    intStack[intStackOffset++] = ((LobbyRegionInfo) class283).country;
		    strStack[anInt1170++] = ((LobbyRegionInfo) class283).region;
		    intStack[intStackOffset++] = ((AbstractLobbyWorld) world).amountPlayers;
		    intStack[intStackOffset++]
			= ((LobbyWorld) world).anInt5788;
		    strStack[anInt1170++]
			= ((LobbyWorld) world).ipAddress;
		} else {
		    intStack[intStackOffset++] = -1;
		    strStack[anInt1170++] = "";
		    intStack[intStackOffset++] = 0;
		    strStack[anInt1170++] = "";
		    intStack[intStackOffset++] = 0;
		    intStack[intStackOffset++] = 0;
		    strStack[anInt1170++] = "";
		    return;
		}
		return;
	    }
	    if (i == 6507) {
		intStackOffset -= 4;
		int i_170_ = intStack[intStackOffset];
		boolean bool_171_ = intStack[intStackOffset + 1] == 1;
		int i_172_ = intStack[intStackOffset + 2];
		boolean bool_173_ = intStack[intStackOffset + 3] == 1;
		Class302.method2283(bool_173_, 0, i_172_, i_170_, bool_171_);
		return;
	    }
	    if (i == 6508) {
		Class348_Sub42_Sub20.method3283(-47);
		return;
	    }
	    if (i == 6509) {
		if (Class240.anInt4674 == 7) {
		    Class348_Sub40_Sub30.aBoolean9403
			= intStack[--intStackOffset] == 1;
		    return;
		}
		return;
	    }
	    if (i == 6510) {
		intStack[intStackOffset++] = Class251.anInt3234;
		return;
	    }
	} else if (i >= 6700) {
	    if (i < 6800 && Class11.modeWhat == Class288.aClass231_4953) {
		if (i == 6700) {
		    int i_174_ = Class125.aClass356_4915.method3474(1);
		    if (r.anInt9721 != -1)
			i_174_++;
		    intStack[intStackOffset++] = i_174_;
		    return;
		}
		if (i == 6701) {
		    int i_175_ = intStack[--intStackOffset];
		    if (r.anInt9721 != -1) {
			if (i_175_ == 0) {
			    intStack[intStackOffset++] = r.anInt9721;
			    return;
			}
			i_175_--;
		    }
		    Class348_Sub41 class348_sub41
			= ((Class348_Sub41)
			   Class125.aClass356_4915.method3484(0));
		    while (i_175_-- > 0)
			class348_sub41
			    = ((Class348_Sub41)
			       Class125.aClass356_4915.method3482(0));
		    intStack[intStackOffset++]
			= ((Class348_Sub41) class348_sub41).anInt7050;
		    return;
		}
		if (i == 6702) {
		    int i_176_ = intStack[--intStackOffset];
		    if (Class348_Sub40_Sub33.aClass46ArrayArray9427[i_176_]
			== null)
			strStack[anInt1170++] = "";
		    else {
			String string = (((Widget) (Class348_Sub40_Sub33.aClass46ArrayArray9427[i_176_][0])).aString721);
			if (string == null)
			    strStack[anInt1170++] = "";
			else {
			    strStack[anInt1170++]
				= string.substring(0, string.indexOf(':'));
			    return;
			}
			return;
		    }
		    return;
		}
		if (i == 6703) {
		    int i_177_ = intStack[--intStackOffset];
		    if (Class348_Sub40_Sub33.aClass46ArrayArray9427[i_177_]
			== null)
			intStack[intStackOffset++] = 0;
		    else {
			intStack[intStackOffset++]
			    = (Class348_Sub40_Sub33.aClass46ArrayArray9427
			       [i_177_]).length;
			return;
		    }
		    return;
		}
		if (i == 6704) {
		    intStackOffset -= 2;
		    int i_178_ = intStack[intStackOffset];
		    int i_179_ = intStack[intStackOffset + 1];
		    if (Class348_Sub40_Sub33.aClass46ArrayArray9427[i_178_]
			== null)
			strStack[anInt1170++] = "";
		    else {
			String string = (((Widget) (Class348_Sub40_Sub33
						     .aClass46ArrayArray9427
						     [i_178_][i_179_]))
					 .aString721);
			if (string == null)
			    strStack[anInt1170++] = "";
			else {
			    strStack[anInt1170++] = string;
			    return;
			}
			return;
		    }
		    return;
		}
		if (i == 6705) {
		    intStackOffset -= 2;
		    int i_180_ = intStack[intStackOffset];
		    int i_181_ = intStack[intStackOffset + 1];
		    if (Class348_Sub40_Sub33.aClass46ArrayArray9427[i_180_]
			== null)
			intStack[intStackOffset++] = 0;
		    else {
			intStack[intStackOffset++]
			    = ((Widget) (Class348_Sub40_Sub33
					  .aClass46ArrayArray9427[i_180_]
					  [i_181_])).anInt732;
			return;
		    }
		    return;
		}
		if (i == 6706)
		    return;
		if (i == 6707) {
		    intStackOffset -= 3;
		    int i_182_ = intStack[intStackOffset];
		    int i_183_ = intStack[intStackOffset + 1];
		    int i_184_ = intStack[intStackOffset + 2];
		    Class348_Sub9.method2780(i_184_, "", (byte) 111, 1,
					     i_182_ << 16 | i_183_);
		    return;
		}
		if (i == 6708) {
		    intStackOffset -= 3;
		    int i_185_ = intStack[intStackOffset];
		    int i_186_ = intStack[intStackOffset + 1];
		    int i_187_ = intStack[intStackOffset + 2];
		    Class348_Sub9.method2780(i_187_, "", (byte) 127, 2,
					     i_185_ << 16 | i_186_);
		    return;
		}
		if (i == 6709) {
		    intStackOffset -= 3;
		    int i_188_ = intStack[intStackOffset];
		    int i_189_ = intStack[intStackOffset + 1];
		    int i_190_ = intStack[intStackOffset + 2];
		    Class348_Sub9.method2780(i_190_, "", (byte) 118, 3,
					     i_188_ << 16 | i_189_);
		    return;
		}
		if (i == 6710) {
		    intStackOffset -= 3;
		    int i_191_ = intStack[intStackOffset];
		    int i_192_ = intStack[intStackOffset + 1];
		    int i_193_ = intStack[intStackOffset + 2];
		    Class348_Sub9.method2780(i_193_, "", (byte) 8, 4,
					     i_191_ << 16 | i_192_);
		    return;
		}
		if (i == 6711) {
		    intStackOffset -= 3;
		    int i_194_ = intStack[intStackOffset];
		    int i_195_ = intStack[intStackOffset + 1];
		    int i_196_ = intStack[intStackOffset + 2];
		    Class348_Sub9.method2780(i_196_, "", (byte) 125, 5,
					     i_194_ << 16 | i_195_);
		    return;
		}
		if (i == 6712) {
		    intStackOffset -= 3;
		    int i_197_ = intStack[intStackOffset];
		    int i_198_ = intStack[intStackOffset + 1];
		    int i_199_ = intStack[intStackOffset + 2];
		    Class348_Sub9.method2780(i_199_, "", (byte) 108, 6,
					     i_197_ << 16 | i_198_);
		    return;
		}
		if (i == 6713) {
		    intStackOffset -= 3;
		    int i_200_ = intStack[intStackOffset];
		    int i_201_ = intStack[intStackOffset + 1];
		    int i_202_ = intStack[intStackOffset + 2];
		    Class348_Sub9.method2780(i_202_, "", (byte) -106, 7,
					     i_200_ << 16 | i_201_);
		    return;
		}
		if (i == 6714) {
		    intStackOffset -= 3;
		    int i_203_ = intStack[intStackOffset];
		    int i_204_ = intStack[intStackOffset + 1];
		    int i_205_ = intStack[intStackOffset + 2];
		    Class348_Sub9.method2780(i_205_, "", (byte) 117, 8,
					     i_203_ << 16 | i_204_);
		    return;
		}
		if (i == 6715) {
		    intStackOffset -= 3;
		    int i_206_ = intStack[intStackOffset];
		    int i_207_ = intStack[intStackOffset + 1];
		    int i_208_ = intStack[intStackOffset + 2];
		    Class348_Sub9.method2780(i_208_, "", (byte) -35, 9,
					     i_206_ << 16 | i_207_);
		    return;
		}
		if (i == 6716) {
		    intStackOffset -= 3;
		    int i_209_ = intStack[intStackOffset];
		    int i_210_ = intStack[intStackOffset + 1];
		    int i_211_ = intStack[intStackOffset + 2];
		    Class348_Sub9.method2780(i_211_, "", (byte) 107, 10,
					     i_209_ << 16 | i_210_);
		    return;
		}
		if (i == 6717) {
		    intStackOffset -= 3;
		    int i_212_ = intStack[intStackOffset];
		    int i_213_ = intStack[intStackOffset + 1];
		    int i_214_ = intStack[intStackOffset + 2];
		    Widget class46
			= Class348_Sub22.getWidgetChild(i_214_,
						    i_212_ << 16 | i_213_);
		    Class341.method2678(-2049);
		    Class348_Sub44 class348_sub44 = Main.method105(class46);
		    Class339.method2666((((Class348_Sub44) class348_sub44)
					 .anInt7093),
					class348_sub44.method3307(100),
					class46, (byte) 21);
		    return;
		}
	    } else if (i < 6900) {
		if (i == 6800) {
		    int i_215_ = intStack[--intStackOffset];
		    Class42 class42 = Class348_Sub23_Sub2.aClass153_9031
					  .method1225(i_215_, (byte) 96);
		    if (((Class42) class42).aString597 == null)
			strStack[anInt1170++] = "";
		    else {
			strStack[anInt1170++]
			    = ((Class42) class42).aString597;
			return;
		    }
		    return;
		}
		if (i == 6801) {
		    int i_216_ = intStack[--intStackOffset];
		    Class42 class42 = Class348_Sub23_Sub2.aClass153_9031
					  .method1225(i_216_, (byte) 111);
		    intStack[intStackOffset++] = ((Class42) class42).anInt578;
		    return;
		}
		if (i == 6802) {
		    int i_217_ = intStack[--intStackOffset];
		    Class42 class42 = Class348_Sub23_Sub2.aClass153_9031
					  .method1225(i_217_, (byte) 91);
		    intStack[intStackOffset++] = ((Class42) class42).anInt576;
		    return;
		}
		if (i == 6803) {
		    int i_218_ = intStack[--intStackOffset];
		    Class42 class42 = Class348_Sub23_Sub2.aClass153_9031
					  .method1225(i_218_, (byte) 44);
		    intStack[intStackOffset++] = ((Class42) class42).anInt596;
		    return;
		}
		if (i == 6804) {
		    intStackOffset -= 2;
		    int i_219_ = intStack[intStackOffset];
		    int i_220_ = intStack[intStackOffset + 1];
		    Class254 class254
			= Class101_Sub3.aClass326_5764.method2600(i_220_,
								  28364);
		    if (class254.method1925(false))
			strStack[anInt1170++]
			    = (Class348_Sub23_Sub2.aClass153_9031.method1225
				   (i_219_, (byte) 79).method376
			       (((Class254) class254).aString3258, i_220_,
				(byte) 126));
		    else {
			intStack[intStackOffset++]
			    = (Class348_Sub23_Sub2.aClass153_9031.method1225
				   (i_219_, (byte) 50).method378
			       (((Class254) class254).anInt3256, i_220_,
				false));
			return;
		    }
		    return;
		}
	    } else if (i < 7000) {
		if (i == 6900) {
		    intStack[intStackOffset++]
			= (Class348_Sub40_Sub3.aBoolean9103
			   && !Class133.aBoolean1915) ? 1 : 0;
		    return;
		}
		if (i == 6901) {
		    intStack[intStackOffset++] = Class116.anInt1758;
		    return;
		}
		if (i == 6902) {
		    intStack[intStackOffset++] = Class135_Sub1.anInt4716;
		    return;
		}
		if (i == 6903) {
		    intStack[intStackOffset++] = Class322.anInt4026;
		    return;
		}
		if (i == 6904) {
		    intStack[intStackOffset++] = Class206.anInt4870;
		    return;
		}
		if (i == 6905) {
		    String string = "";
		    if (Class348_Sub42_Sub6.aClass144_9536 != null) {
			if (Class348_Sub42_Sub6.aClass144_9536.returnObj
			    != null)
			    string = (String) (Class348_Sub42_Sub6
					       .aClass144_9536.returnObj);
			else
			    string = Class235.method1669(-19918,
							 (Class348_Sub42_Sub6
							  .aClass144_9536
							  .intParam));
		    }
		    strStack[anInt1170++] = string;
		    return;
		}
		if (i == 6906) {
		    intStack[intStackOffset++] = Class216.anInt4976;
		    return;
		}
		if (i == 6907) {
		    intStack[intStackOffset++] = Class130_Sub1.anInt5797;
		    return;
		}
		if (i == 6908) {
		    intStack[intStackOffset++] = Class348_Sub6.anInt6632;
		    return;
		}
		if (i == 6909) {
		    intStack[intStackOffset++]
			= Class290.aBoolean3706 ? 1 : 0;
		    return;
		}
		if (i == 6910) {
		    intStack[intStackOffset++] = Class24.anInt359;
		    return;
		}
		if (i == 6911) {
		    intStack[intStackOffset++] = GameApplet.anInt37;
		    return;
		}
		if (i == 6912) {
		    intStack[intStackOffset++] = Class348_Sub1.anInt6551;
		    return;
		}
	    } else if (i < 7100) {
		if (i == 7000) {
		    int i_221_ = Class318_Sub1_Sub4.method2478(1000);
		    intStack[intStackOffset++] = Class64_Sub3.anInt5584
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub25_7271.method1829(-32350);
		    intStack[intStackOffset++] = i_221_;
		    Class348_Sub20.method2953((byte) -113);
		    Class14_Sub2.method243(37);
		    r.aBoolean9719 = false;
		    return;
		}
		if (i == 7001) {
		    Class133.method1140(47);
		    Class348_Sub20.method2953((byte) -126);
		    Class14_Sub2.method243(37);
		    r.aBoolean9719 = false;
		    return;
		}
		if (i == 7002) {
		    Class47.method447((byte) -59);
		    Class348_Sub20.method2953((byte) -124);
		    Class14_Sub2.method243(37);
		    r.aBoolean9719 = false;
		    return;
		}
		if (i == 7003) {
		    ConnectionMode.method1263(true);
		    Class348_Sub20.method2953((byte) -106);
		    Class14_Sub2.method243(37);
		    r.aBoolean9719 = false;
		    return;
		}
		if (i == 7004) {
		    Class348_Sub40_Sub12.method3076(0, true);
		    Class348_Sub20.method2953((byte) -107);
		    Class14_Sub2.method243(37);
		    r.aBoolean9719 = false;
		    return;
		}
		if (i == 7005) {
		    BitmapTable.aClass348_Sub51_3959.method3429
			((byte) 74,
			 (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			  .aClass239_Sub29_7229),
			 0);
		    Class14_Sub2.method243(37);
		    r.aBoolean9719 = false;
		    return;
		}
		if (i == 7006) {
		    if (Class64_Sub3.anInt5584 == 2)
			Class221.aBoolean2881 = true;
		    else {
			if (Class64_Sub3.anInt5584 == 1)
			    Class330.aBoolean4117 = true;
			else {
			    if (Class64_Sub3.anInt5584 == 3)
				Class348_Sub1.aBoolean6558 = true;
			    return;
			}
			return;
		    }
		    return;
		}
		if (i == 7007) {
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub29_7229.method1848(-32350);
		    return;
		}
	    } else if (i < 7200) {
		if (i == 7100) {
		    intStackOffset -= 2;
		    int i_222_ = intStack[intStackOffset];
		    int i_223_ = intStack[intStackOffset + 1];
		    if (i_222_ != -1) {
			if (i_223_ > 255)
			    i_223_ = 255;
			else if (i_223_ < 0)
			    i_223_ = 0;
			Class55_Sub1.method524(i_223_, false, i_222_, -122);
		    }
		    return;
		}
		if (i == 7101) {
		    int i_224_ = intStack[--intStackOffset];
		    if (i_224_ != -1)
			Class64_Sub3.method690((byte) 17, i_224_);
		    return;
		}
		if (i == 7102) {
		    int i_225_ = intStack[--intStackOffset];
		    if (i_225_ != -1)
			BitmapFont.method1189(-1, i_225_);
		    return;
		}
		if (i == 7103) {
		    intStack[intStackOffset++]
			= Class348_Sub40_Sub31.method3131((byte) 50,
							  "jagtheora") ? 1 : 0;
		    return;
		}
	    } else if (i < 7300) {
		if (i == 7201) {
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub4_7220.method1736(123) ? 1 : 0;
		    return;
		}
		if (i == 7202) {
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub21_7270.method1809(117) ? 1 : 0;
		    return;
		}
		if (i == 7203) {
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub7_7238.method1747(111) ? 1 : 0;
		    return;
		}
		if (i == 7204) {
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub18_7259.method1801(125) ? 1 : 0;
		    return;
		}
		if (i == 7205) {
		    intStack[intStackOffset++]
			= (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			       .aClass239_Sub20_7216.method1806(108)
			   && Class348_Sub8.currentToolkit.method3699()) ? 1 : 0;
		    return;
		}
		if (i == 7206) {
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub15_7224.method1786(93) ? 1 : 0;
		    return;
		}
		if (i == 7207) {
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub6_7226.method1744(103) ? 1 : 0;
		    return;
		}
		if (i == 7208) {
		    intStack[intStackOffset++]
			= (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			       .aClass239_Sub12_7243.method1774(120)
			   && Class348_Sub8.currentToolkit.method3627()) ? 1 : 0;
		    return;
		}
		if (i == 7209) {
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub9_7256.method1757(115) ? 1 : 0;
		    return;
		}
		if (i == 7210) {
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub24_7235.method1824(124) ? 1 : 0;
		    return;
		}
		if (i == 7211) {
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub23_7231.method1817(108) ? 1 : 0;
		    return;
		}
		if (i == 7212) {
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub16_7247.method1790(94) ? 1 : 0;
		    return;
		}
		if (i == 7213) {
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub3_7222.method1729(91) ? 1 : 0;
		    return;
		}
		if (i == 7214) {
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub25_7251.method1831(95) ? 1 : 0;
		    return;
		}
	    } else if (i < 7400) {
		if (i == 7301) {
		    int i_226_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub4_7220.method1714(3, i_226_);
		    return;
		}
		if (i == 7302) {
		    int i_227_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub21_7270.method1714(3, i_227_);
		    return;
		}
		if (i == 7303) {
		    int i_228_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub7_7238.method1714(3, i_228_);
		    return;
		}
		if (i == 7304) {
		    int i_229_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub18_7259.method1714(3, i_229_);
		    return;
		}
		if (i == 7305) {
		    int i_230_ = intStack[--intStackOffset];
		    if (!Class348_Sub8.currentToolkit.method3699())
			intStack[intStackOffset++] = 3;
		    else {
			intStack[intStackOffset++]
			    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
				  .aClass239_Sub20_7216.method1714(3, i_230_);
			return;
		    }
		    return;
		}
		if (i == 7306) {
		    int i_231_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub15_7224.method1714(3, i_231_);
		    return;
		}
		if (i == 7307) {
		    int i_232_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub6_7226.method1714(3, i_232_);
		    return;
		}
		if (i == 7308) {
		    int i_233_ = intStack[--intStackOffset];
		    if (!Class348_Sub8.currentToolkit.method3627())
			intStack[intStackOffset++] = 3;
		    else {
			intStack[intStackOffset++]
			    = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
				  .aClass239_Sub12_7243.method1714(3, i_233_);
			return;
		    }
		    return;
		}
		if (i == 7309) {
		    int i_234_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub9_7256.method1714(3, i_234_);
		    return;
		}
		if (i == 7310) {
		    int i_235_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub24_7235.method1714(3, i_235_);
		    return;
		}
		if (i == 7311) {
		    int i_236_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub23_7231.method1714(3, i_236_);
		    return;
		}
		if (i == 7312) {
		    int i_237_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub16_7247.method1714(3, i_237_);
		    return;
		}
		if (i == 7313) {
		    int i_238_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub3_7222.method1714(3, i_238_);
		    return;
		}
		if (i == 7314) {
		    int i_239_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			      .aClass239_Sub25_7251.method1714(3, i_239_);
		    return;
		}
	    }
	}
	throw new IllegalStateException(String.valueOf(i));
    }
    
    static final void executeScript(InterfaceScript script) {
	executeScript(script, 200000);
    }
    
    static final void method706() {
	/* empty */
    }
    
    private static final void method707(String string, int i) {
	if (Class192.anInt2581 != 0
	    || ((!Class348_Sub40_Sub3.aBoolean9103 || Class133.aBoolean1915)
		&& !Class50_Sub2.aBoolean5233)) {
	    String string_240_ = string.toLowerCase();
	    int i_241_ = 0;
	    if (string_240_
		    .startsWith(GameText.aClass274_3530.getLanguageText(0))) {
		i_241_ = 0;
		string = string.substring(GameText.aClass274_3530.getLanguageText
					      (0).length());
	    } else if (string_240_.startsWith(GameText.aClass274_3531
						  .getLanguageText(0))) {
		i_241_ = 1;
		string = string.substring(GameText.aClass274_3531.getLanguageText
					      (0).length());
	    } else if (string_240_.startsWith(GameText.aClass274_3532
						  .getLanguageText(0))) {
		i_241_ = 2;
		string = string.substring(GameText.aClass274_3532.getLanguageText
					      (0).length());
	    } else if (string_240_.startsWith(GameText.aClass274_3533
						  .getLanguageText(0))) {
		i_241_ = 3;
		string = string.substring(GameText.aClass274_3533.getLanguageText
					      (0).length());
	    } else if (string_240_.startsWith(GameText.aClass274_3534
						  .getLanguageText(0))) {
		i_241_ = 4;
		string = string.substring(GameText.aClass274_3534.getLanguageText
					      (0).length());
	    } else if (string_240_.startsWith(GameText.aClass274_3535
						  .getLanguageText(0))) {
		i_241_ = 5;
		string = string.substring(GameText.aClass274_3535.getLanguageText
					      (0).length());
	    } else if (string_240_.startsWith(GameText.aClass274_3536
						  .getLanguageText(0))) {
		i_241_ = 6;
		string = string.substring(GameText.aClass274_3536.getLanguageText
					      (0).length());
	    } else if (string_240_.startsWith(GameText.aClass274_3537
						  .getLanguageText(0))) {
		i_241_ = 7;
		string = string.substring(GameText.aClass274_3537.getLanguageText
					      (0).length());
	    } else if (string_240_.startsWith(GameText.aClass274_3538
						  .getLanguageText(0))) {
		i_241_ = 8;
		string = string.substring(GameText.aClass274_3538.getLanguageText
					      (0).length());
	    } else if (string_240_.startsWith(GameText.aClass274_3539
						  .getLanguageText(0))) {
		i_241_ = 9;
		string = string.substring(GameText.aClass274_3539.getLanguageText
					      (0).length());
	    } else if (string_240_.startsWith(GameText.aClass274_3540
						  .getLanguageText(0))) {
		i_241_ = 10;
		string = string.substring(GameText.aClass274_3540.getLanguageText
					      (0).length());
	    } else if (string_240_.startsWith(GameText.aClass274_3541
						  .getLanguageText(0))) {
		i_241_ = 11;
		string = string.substring(GameText.aClass274_3541.getLanguageText
					      (0).length());
	    } else if (Class348_Sub33.gameLanguage != 0) {
		if (string_240_.startsWith(GameText.aClass274_3530.getLanguageText
					   (Class348_Sub33.gameLanguage))) {
		    i_241_ = 0;
		    string
			= string.substring(GameText.aClass274_3530.getLanguageText
					       (Class348_Sub33.gameLanguage)
					       .length());
		} else if (string_240_.startsWith
			   (GameText.aClass274_3531
				.getLanguageText(Class348_Sub33.gameLanguage))) {
		    i_241_ = 1;
		    string
			= string.substring(GameText.aClass274_3531.getLanguageText
					       (Class348_Sub33.gameLanguage)
					       .length());
		} else if (string_240_.startsWith
			   (GameText.aClass274_3532
				.getLanguageText(Class348_Sub33.gameLanguage))) {
		    i_241_ = 2;
		    string
			= string.substring(GameText.aClass274_3532.getLanguageText
					       (Class348_Sub33.gameLanguage)
					       .length());
		} else if (string_240_.startsWith
			   (GameText.aClass274_3533
				.getLanguageText(Class348_Sub33.gameLanguage))) {
		    i_241_ = 3;
		    string
			= string.substring(GameText.aClass274_3533.getLanguageText
					       (Class348_Sub33.gameLanguage)
					       .length());
		} else if (string_240_.startsWith
			   (GameText.aClass274_3534
				.getLanguageText(Class348_Sub33.gameLanguage))) {
		    i_241_ = 4;
		    string
			= string.substring(GameText.aClass274_3534.getLanguageText
					       (Class348_Sub33.gameLanguage)
					       .length());
		} else if (string_240_.startsWith
			   (GameText.aClass274_3535
				.getLanguageText(Class348_Sub33.gameLanguage))) {
		    i_241_ = 5;
		    string
			= string.substring(GameText.aClass274_3535.getLanguageText
					       (Class348_Sub33.gameLanguage)
					       .length());
		} else if (string_240_.startsWith
			   (GameText.aClass274_3536
				.getLanguageText(Class348_Sub33.gameLanguage))) {
		    i_241_ = 6;
		    string
			= string.substring(GameText.aClass274_3536.getLanguageText
					       (Class348_Sub33.gameLanguage)
					       .length());
		} else if (string_240_.startsWith
			   (GameText.aClass274_3537
				.getLanguageText(Class348_Sub33.gameLanguage))) {
		    i_241_ = 7;
		    string
			= string.substring(GameText.aClass274_3537.getLanguageText
					       (Class348_Sub33.gameLanguage)
					       .length());
		} else if (string_240_.startsWith
			   (GameText.aClass274_3538
				.getLanguageText(Class348_Sub33.gameLanguage))) {
		    i_241_ = 8;
		    string
			= string.substring(GameText.aClass274_3538.getLanguageText
					       (Class348_Sub33.gameLanguage)
					       .length());
		} else if (string_240_.startsWith
			   (GameText.aClass274_3539
				.getLanguageText(Class348_Sub33.gameLanguage))) {
		    i_241_ = 9;
		    string
			= string.substring(GameText.aClass274_3539.getLanguageText
					       (Class348_Sub33.gameLanguage)
					       .length());
		} else if (string_240_.startsWith
			   (GameText.aClass274_3540
				.getLanguageText(Class348_Sub33.gameLanguage))) {
		    i_241_ = 10;
		    string
			= string.substring(GameText.aClass274_3540.getLanguageText
					       (Class348_Sub33.gameLanguage)
					       .length());
		} else if (string_240_.startsWith
			   (GameText.aClass274_3541
				.getLanguageText(Class348_Sub33.gameLanguage))) {
		    i_241_ = 11;
		    string
			= string.substring(GameText.aClass274_3541.getLanguageText
					       (Class348_Sub33.gameLanguage)
					       .length());
		}
	    }
	    string_240_ = string.toLowerCase();
	    int i_242_ = 0;
	    if (string_240_
		    .startsWith(GameText.aClass274_3542.getLanguageText(0))) {
		i_242_ = 1;
		string = string.substring(GameText.aClass274_3542.getLanguageText
					      (0).length());
	    } else if (string_240_.startsWith(GameText.aClass274_3543
						  .getLanguageText(0))) {
		i_242_ = 2;
		string = string.substring(GameText.aClass274_3543.getLanguageText
					      (0).length());
	    } else if (string_240_.startsWith(GameText.aClass274_3544
						  .getLanguageText(0))) {
		i_242_ = 3;
		string = string.substring(GameText.aClass274_3544.getLanguageText
					      (0).length());
	    } else if (string_240_.startsWith(GameText.aClass274_3545
						  .getLanguageText(0))) {
		i_242_ = 4;
		string = string.substring(GameText.aClass274_3545.getLanguageText
					      (0).length());
	    } else if (string_240_.startsWith(GameText.aClass274_3546
						  .getLanguageText(0))) {
		i_242_ = 5;
		string = string.substring(GameText.aClass274_3546.getLanguageText
					      (0).length());
	    } else if (Class348_Sub33.gameLanguage != 0) {
		if (string_240_.startsWith(GameText.aClass274_3542.getLanguageText
					   (Class348_Sub33.gameLanguage))) {
		    i_242_ = 1;
		    string
			= string.substring(GameText.aClass274_3542.getLanguageText
					       (Class348_Sub33.gameLanguage)
					       .length());
		} else if (string_240_.startsWith
			   (GameText.aClass274_3543
				.getLanguageText(Class348_Sub33.gameLanguage))) {
		    i_242_ = 2;
		    string
			= string.substring(GameText.aClass274_3543.getLanguageText
					       (Class348_Sub33.gameLanguage)
					       .length());
		} else if (string_240_.startsWith
			   (GameText.aClass274_3544
				.getLanguageText(Class348_Sub33.gameLanguage))) {
		    i_242_ = 3;
		    string
			= string.substring(GameText.aClass274_3544.getLanguageText
					       (Class348_Sub33.gameLanguage)
					       .length());
		} else if (string_240_.startsWith
			   (GameText.aClass274_3545
				.getLanguageText(Class348_Sub33.gameLanguage))) {
		    i_242_ = 4;
		    string
			= string.substring(GameText.aClass274_3545.getLanguageText
					       (Class348_Sub33.gameLanguage)
					       .length());
		} else if (string_240_.startsWith
			   (GameText.aClass274_3546
				.getLanguageText(Class348_Sub33.gameLanguage))) {
		    i_242_ = 5;
		    string
			= string.substring(GameText.aClass274_3546.getLanguageText
					       (Class348_Sub33.gameLanguage)
					       .length());
		}
	    }
	    anInt1158++;
	    BufferedPacket class348_sub47
		= Class286_Sub3.createBufferedPacket(Class205.aClass351_2686,
					   Class348_Sub23_Sub2.outgoingGameIsaac);
	    ((BufferedPacket) class348_sub47).buffer
		.putByte(0);
	    int i_243_ = (((ByteBuffer) (((BufferedPacket) class348_sub47)
					     .buffer))
			  .position);
	    ((BufferedPacket) class348_sub47).buffer
		.putByte(i_241_);
	    ((BufferedPacket) class348_sub47).buffer
		.putByte(i_242_);
	    Class367_Sub4.method3544((((BufferedPacket) class348_sub47)
				      .buffer),
				     -101, string);
	    ((BufferedPacket) class348_sub47).buffer
		.method3339
		(119, (((ByteBuffer) (((BufferedPacket) class348_sub47)
					  .buffer))
		       .position) - i_243_);
	    Class348_Sub42_Sub14.putBufferedPacket(124, class348_sub47);
	}
    }
    
    private static final int method708(char c) {
	if (Class237_Sub1.method1693(c, -114))
	    return 1;
	return 0;
    }
    
    private static final String method709(int i) {
	long l = ((long) i + 11745L) * 86400000L;
	calendar.setTime(new Date(l));
	int i_244_ = calendar.get(5);
	int i_245_ = calendar.get(2);
	int i_246_ = calendar.get(1);
	return (String.valueOf(i_244_) + "-" + months[i_245_] + "-"
		+ i_246_);
    }
    
    private static final void method710(int i, boolean isState0) {
	if (i < 300) {
	    if (i == 100) {
		intStackOffset -= 3;
		int i_247_ = intStack[intStackOffset];
		int i_248_ = intStack[intStackOffset + 1];
		int amountChildren = intStack[intStackOffset + 2];
		if (i_248_ == 0)
		    throw new RuntimeException();
		Widget widget = AbstractFontRasterizer.getWidget(i_247_);
		if (((Widget) widget).children == null)
		    ((Widget) widget).children = new Widget[amountChildren + 1];
		if (((Widget) widget).children.length <= amountChildren) {
		    Widget[] children = new Widget[amountChildren + 1];
		    for (int i_250_ = 0; i_250_ < ((Widget) widget).children.length; i_250_++)
			children[i_250_] = ((Widget) widget).children[i_250_];
		    ((Widget) widget).children = children;
		}
		if (amountChildren > 0 && (((Widget) widget).children[amountChildren - 1] == null))
		    throw new RuntimeException("Gap at:" + (amountChildren - 1));
		Widget child = new Widget();
		((Widget) child).type = i_248_;
		((Widget) child).anInt834 = ((Widget) child).anInt830 = ((Widget) widget).anInt830;
		((Widget) child).anInt704 = amountChildren;
		((Widget) widget).children[amountChildren] = child;
		if (isState0)
		    currentWidget = child;
		else
		    currentWidget2 = child;
		Class251.method1916(-9343, widget);
		return;
	    }
	    if (i == 101) {
		Widget class46 = isState0 ? currentWidget : currentWidget2;
		if (((Widget) class46).anInt704 == -1) {
		    if (isState0)
			throw new RuntimeException
				  ("Tried to .cc_delete static .active-component!");
		    throw new RuntimeException
			      ("Tried to cc_delete static active-component!");
		}
		Widget class46_252_
		    = AbstractFontRasterizer.getWidget(((Widget) class46).anInt830);
		((Widget) class46_252_).children[(((Widget) class46)
							   .anInt704)]
		    = null;
		Class251.method1916(-9343, class46_252_);
		return;
	    }
	    if (i == 102) {
		Widget class46
		    = AbstractFontRasterizer.getWidget(intStack[--intStackOffset]);
		((Widget) class46).children = null;
		Class251.method1916(-9343, class46);
		return;
	    }
	    if (i == 200) {
		intStackOffset -= 2;
		int widget = intStack[intStackOffset];
		int child = intStack[intStackOffset + 1];
		Widget class46 = Class348_Sub22.getWidgetChild(child, widget);
		if (class46 != null && child != -1) {
		    intStack[intStackOffset++] = 1;
		    if (isState0)
			currentWidget = class46;
		    else
			currentWidget2 = class46;
		} else {
		    intStack[intStackOffset++] = 0;
		    return;
		}
		return;
	    }
	    if (i == 201) {
		int i_255_ = intStack[--intStackOffset];
		Widget class46 = AbstractFontRasterizer.getWidget(i_255_);
		if (class46 != null) {
		    intStack[intStackOffset++] = 1;
		    if (isState0)
			currentWidget = class46;
		    else
			currentWidget2 = class46;
		} else {
		    intStack[intStackOffset++] = 0;
		    return;
		}
		return;
	    }
	    if (i == 202) {
		int i_256_ = intStack[--intStackOffset];
		method714(i_256_);
		return;
	    }
	    if (i == 203) {
		int i_257_ = intStack[--intStackOffset];
		method702(i_257_);
		return;
	    }
	} else if (i < 500) {
	    if (i == 403) {
		intStackOffset -= 2;
		int i_258_ = intStack[intStackOffset];
		int i_259_ = intStack[intStackOffset + 1];
		if ((((Player)
		      Class132.localPlayer)
		     .aClass154_10536)
		    != null) {
		    for (int i_260_ = 0;
			 i_260_ < Class141.anIntArray1973.length; i_260_++) {
			if (Class141.anIntArray1973[i_260_] == i_258_) {
			    ((Player)
			     Class132.localPlayer)
				.aClass154_10536.method1233
				(Class348_Sub40_Sub25.aClass150_9342, i_259_,
				 -1, i_260_);
			    return;
			}
		    }
		    for (int i_261_ = 0;
			 i_261_ < Class91.anIntArray1521.length; i_261_++) {
			if (Class91.anIntArray1521[i_261_] == i_258_) {
			    ((Player)
			     Class132.localPlayer)
				.aClass154_10536.method1233
				(Class348_Sub40_Sub25.aClass150_9342, i_259_,
				 -1, i_261_);
			    break;
			}
		    }
		    return;
		}
		return;
	    }
	    if (i == 404) {
		intStackOffset -= 2;
		int i_262_ = intStack[intStackOffset];
		int i_263_ = intStack[intStackOffset + 1];
		if ((((Player)
		      Class132.localPlayer)
		     .aClass154_10536)
		    != null) {
		    ((Player)
		     Class132.localPlayer)
			.aClass154_10536.method1231(i_262_, 0, i_263_);
		    return;
		}
		return;
	    }
	    if (i == 410) {
		boolean bool_264_ = intStack[--intStackOffset] != 0;
		if ((((Player)
		      Class132.localPlayer)
		     .aClass154_10536)
		    != null) {
		    ((Player)
		     Class132.localPlayer)
			.aClass154_10536.method1229((byte) -17, bool_264_);
		    return;
		}
		return;
	    }
	    if (i == 411) {
		intStackOffset -= 2;
		int i_265_ = intStack[intStackOffset];
		int i_266_ = intStack[intStackOffset + 1];
		if ((((Player)
		      Class132.localPlayer)
		     .aClass154_10536)
		    != null) {
		    ((Player)
		     Class132.localPlayer)
			.aClass154_10536.method1227
			((byte) 42, i_265_, i_266_,
			 ToolkitException.itemLoader);
		    return;
		}
		return;
	    }
	} else if (i >= 1000 && i < 1100 || i >= 2000 && i < 2100) {
	    Widget class46;
	    if (i >= 2000) {
		i -= 1000;
		class46 = AbstractFontRasterizer.getWidget(intStack[--intStackOffset]);
	    } else
		class46 = isState0 ? currentWidget : currentWidget2;
	    if (i == 1000) {
		intStackOffset -= 4;
		((Widget) class46).anInt788 = intStack[intStackOffset];
		((Widget) class46).anInt739 = intStack[intStackOffset + 1];
		int i_267_ = intStack[intStackOffset + 2];
		if (i_267_ < 0)
		    i_267_ = 0;
		else if (i_267_ > 5)
		    i_267_ = 5;
		int i_268_ = intStack[intStackOffset + 3];
		if (i_268_ < 0)
		    i_268_ = 0;
		else if (i_268_ > 5)
		    i_268_ = 5;
		((Widget) class46).aByte817 = (byte) i_267_;
		((Widget) class46).aByte681 = (byte) i_268_;
		Class251.method1916(-9343, class46);
		GametipLoader.method1048(class46, 50);
		if (((Widget) class46).anInt704 == -1)
		    Class239_Sub3.method1733((byte) -78, ((Widget) class46).anInt830);
		return;
	    }
	    if (i == 1001) {
		intStackOffset -= 4;
		((Widget) class46).anInt842 = intStack[intStackOffset];
		((Widget) class46).anInt728 = intStack[intStackOffset + 1];
		((Widget) class46).anInt796 = 0;
		((Widget) class46).anInt826 = 0;
		int i_269_ = intStack[intStackOffset + 2];
		if (i_269_ < 0)
		    i_269_ = 0;
		else if (i_269_ > 4)
		    i_269_ = 4;
		int i_270_ = intStack[intStackOffset + 3];
		if (i_270_ < 0)
		    i_270_ = 0;
		else if (i_270_ > 4)
		    i_270_ = 4;
		((Widget) class46).aByte778 = (byte) i_269_;
		((Widget) class46).aByte724 = (byte) i_270_;
		Class251.method1916(-9343, class46);
		GametipLoader.method1048(class46, 62);
		if (((Widget) class46).type == 0)
		    Class251.method1913(false, 36, class46);
		return;
	    }
	    if (i == 1003) {
		boolean bool = intStack[--intStackOffset] == 1;
		if (((Widget) class46).aBoolean813 != bool) {
		    ((Widget) class46).aBoolean813 = bool;
		    Class251.method1916(-9343, class46);
		}
		if (((Widget) class46).anInt704 == -1)
		    Class348_Sub26.method2999((byte) 90,
					      ((Widget) class46).anInt830);
		return;
	    }
	    if (i == 1004) {
		intStackOffset -= 2;
		((Widget) class46).anInt710 = intStack[intStackOffset];
		((Widget) class46).anInt775 = intStack[intStackOffset + 1];
		Class251.method1916(-9343, class46);
		GametipLoader.method1048(class46, 59);
		if (((Widget) class46).type == 0)
		    Class251.method1913(false, 49, class46);
		return;
	    }
	    if (i == 1005) {
		((Widget) class46).aBoolean776
		    = intStack[--intStackOffset] == 1;
		return;
	    }
	} else if (i >= 1100 && i < 1200 || i >= 2100 && i < 2200) {
	    Widget widget;
	    if (i >= 2000) {
		i -= 1000;
		widget = AbstractFontRasterizer.getWidget(intStack[--intStackOffset]);
	    } else
		widget = isState0 ? currentWidget : currentWidget2;
	    if (i == 1100) {
		intStackOffset -= 2;
		((Widget) widget).anInt747 = intStack[intStackOffset];
		if (((Widget) widget).anInt747
		    > (((Widget) widget).anInt698
		       - ((Widget) widget).anInt709))
		    ((Widget) widget).anInt747
			= (((Widget) widget).anInt698
			   - ((Widget) widget).anInt709);
		if (((Widget) widget).anInt747 < 0)
		    ((Widget) widget).anInt747 = 0;
		((Widget) widget).anInt755 = intStack[intStackOffset + 1];
		if (((Widget) widget).anInt755
		    > (((Widget) widget).anInt791
		       - ((Widget) widget).anInt789))
		    ((Widget) widget).anInt755
			= (((Widget) widget).anInt791
			   - ((Widget) widget).anInt789);
		if (((Widget) widget).anInt755 < 0)
		    ((Widget) widget).anInt755 = 0;
		Class251.method1916(-9343, widget);
		if (((Widget) widget).anInt704 == -1)
		    Class328_Sub3.method2615(-91,
					     ((Widget) widget).anInt830);
		return;
	    }
	    if (i == 1101) {
		((Widget) widget).textColor = intStack[--intStackOffset];
		Class251.method1916(-9343, widget);
		if (((Widget) widget).anInt704 == -1)
		    Class135.method1148(((Widget) widget).anInt830, 6);
		return;
	    }
	    if (i == 1102) {
		((Widget) widget).aBoolean810
		    = intStack[--intStackOffset] == 1;
		Class251.method1916(-9343, widget);
		return;
	    }
	    if (i == 1103) {
		((Widget) widget).anInt696 = intStack[--intStackOffset];
		Class251.method1916(-9343, widget);
		return;
	    }
	    if (i == 1104) {
		((Widget) widget).anInt690 = intStack[--intStackOffset];
		Class251.method1916(-9343, widget);
		return;
	    }
	    if (i == 1105) {
		int changeId = intStack[--intStackOffset];
		if (((Widget) widget).id != changeId) {
		    ((Widget) widget).id = changeId;
		    Class251.method1916(-9343, widget);
		}
		if (((Widget) widget).anInt704 == -1)
		    Class203.method1477(((Widget) widget).anInt830, 14);
		return;
	    }
	    if (i == 1106) {
		((Widget) widget).anInt828 = intStack[--intStackOffset];
		Class251.method1916(-9343, widget);
		return;
	    }
	    if (i == 1107) {
		((Widget) widget).aBoolean697
		    = intStack[--intStackOffset] == 1;
		Class251.method1916(-9343, widget);
		return;
	    }
	    if (i == 1108) {
		((Widget) widget).anInt770 = 1;
		((Widget) widget).anInt753 = intStack[--intStackOffset];
		Class251.method1916(-9343, widget);
		if (((Widget) widget).anInt704 == -1)
		    Class369.method3569(((Widget) widget).anInt830, -125);
		return;
	    }
	    if (i == 1109) {
		intStackOffset -= 6;
		((Widget) widget).anInt808 = intStack[intStackOffset];
		((Widget) widget).anInt786 = intStack[intStackOffset + 1];
		((Widget) widget).anInt757 = intStack[intStackOffset + 2];
		((Widget) widget).anInt675 = intStack[intStackOffset + 3];
		((Widget) widget).anInt717 = intStack[intStackOffset + 4];
		((Widget) widget).anInt716 = intStack[intStackOffset + 5];
		Class251.method1916(-9343, widget);
		if (((Widget) widget).anInt704 == -1) {
		    Class239_Sub15.method1787(((Widget) widget).anInt830, 8);
		    Class199.method1459(((Widget) widget).anInt830, 2);
		}
		return;
	    }
	    if (i == 1110) {
		int i_273_ = intStack[--intStackOffset];
		if (((Widget) widget).anInt699 != i_273_) {
		    ((Widget) widget).anInt699 = i_273_;
		    ((Widget) widget).anInt795 = 0;
		    ((Widget) widget).anInt730 = 1;
		    ((Widget) widget).anInt841 = 0;
		    AnimationDefinition class17
			= (((Widget) widget).anInt699 == -1 ? null
			   : Class10.animationLoader
				 .method835(((Widget) widget).anInt699, 7));
		    if (class17 != null)
			Class264.method2017(((Widget) widget).anInt795,
					    class17, 46);
		    Class251.method1916(-9343, widget);
		}
		if (((Widget) widget).anInt704 == -1)
		    Class64_Sub3.method687((byte) -117,
					   ((Widget) widget).anInt830);
		return;
	    }
	    if (i == 1111) {
		((Widget) widget).aBoolean689
		    = intStack[--intStackOffset] == 1;
		Class251.method1916(-9343, widget);
		return;
	    }
	    if (i == 1112) {
		String string = strStack[--anInt1170];
		if (!string.equals(((Widget) widget).text)) {
		    ((Widget) widget).text = string;
		    Class251.method1916(-9343, widget);
		}
		if (((Widget) widget).anInt704 == -1)
		    MouseMovementEvent
			.method3316(121, ((Widget) widget).anInt830);
		return;
	    }
	    if (i == 1113) {
		((Widget) widget).bitmapFontId = intStack[--intStackOffset];
		Class251.method1916(-9343, widget);
		if (((Widget) widget).anInt704 == -1)
		    NativeLibTracker.method2311((byte) -109,
					((Widget) widget).anInt830);
		return;
	    }
	    if (i == 1114) {
		intStackOffset -= 3;
		((Widget) widget).anInt762 = intStack[intStackOffset];
		((Widget) widget).anInt700 = intStack[intStackOffset + 1];
		((Widget) widget).anInt673 = intStack[intStackOffset + 2];
		Class251.method1916(-9343, widget);
		return;
	    }
	    if (i == 1115) {
		((Widget) widget).aBoolean769
		    = intStack[--intStackOffset] == 1;
		Class251.method1916(-9343, widget);
		return;
	    }
	    if (i == 1116) {
		((Widget) widget).anInt672 = intStack[--intStackOffset];
		Class251.method1916(-9343, widget);
		return;
	    }
	    if (i == 1117) {
		((Widget) widget).anInt809 = intStack[--intStackOffset];
		Class251.method1916(-9343, widget);
		return;
	    }
	    if (i == 1118) {
		((Widget) widget).aBoolean790
		    = intStack[--intStackOffset] == 1;
		Class251.method1916(-9343, widget);
		return;
	    }
	    if (i == 1119) {
		((Widget) widget).aBoolean735
		    = intStack[--intStackOffset] == 1;
		Class251.method1916(-9343, widget);
		return;
	    }
	    if (i == 1120) {
		intStackOffset -= 2;
		((Widget) widget).anInt698 = intStack[intStackOffset];
		((Widget) widget).anInt791 = intStack[intStackOffset + 1];
		Class251.method1916(-9343, widget);
		if (((Widget) widget).type == 0)
		    Class251.method1913(false, 62, widget);
		return;
	    }
	    if (i == 1122) {
		((Widget) widget).aBoolean745
		    = intStack[--intStackOffset] == 1;
		Class251.method1916(-9343, widget);
		return;
	    }
	    if (i == 1123) {
		((Widget) widget).anInt716 = intStack[--intStackOffset];
		Class251.method1916(-9343, widget);
		if (((Widget) widget).anInt704 == -1)
		    Class239_Sub15.method1787(((Widget) widget).anInt830, 8);
		return;
	    }
	    if (i == 1124) {
		int i_274_ = intStack[--intStackOffset];
		((Widget) widget).aBoolean744 = i_274_ == 1;
		Class251.method1916(-9343, widget);
		return;
	    }
	    if (i == 1125) {
		intStackOffset -= 2;
		((Widget) widget).anInt688 = intStack[intStackOffset];
		((Widget) widget).anInt799 = intStack[intStackOffset + 1];
		Class251.method1916(-9343, widget);
		return;
	    }
	    if (i == 1126) {
		((Widget) widget).anInt773 = intStack[--intStackOffset];
		Class251.method1916(-9343, widget);
		return;
	    }
	    if (i == 1127) {
		intStackOffset -= 2;
		int i_275_ = intStack[intStackOffset];
		int i_276_ = intStack[intStackOffset + 1];
		Class254 class254
		    = Class101_Sub3.aClass326_5764.method2600(i_275_, 28364);
		if (i_276_ != ((Class254) class254).anInt3256)
		    widget.method436(-70, i_275_, i_276_);
		else {
		    widget.method435(i_275_, -3437);
		    return;
		}
		return;
	    }
	    if (i == 1128) {
		int i_277_ = intStack[--intStackOffset];
		String string = strStack[--anInt1170];
		Class254 class254 = Class101_Sub3.aClass326_5764.method2600(i_277_, 28364);
		if (!((Class254) class254).aString3258.equals(string))
		    widget.putString(string, i_277_);
		else {
		    widget.method435(i_277_, -3437);
		    return;
		}
		return;
	    }
	    if (i == 1129 || i == 1130) {
		int i_278_ = intStack[--intStackOffset];
		if ((((Widget) widget).type == 5 || i != 1129)
		    && (((Widget) widget).type == 4 || i != 1130)) {
		    if (((Widget) widget).anInt806 != i_278_) {
			((Widget) widget).anInt806 = i_278_;
			Class251.method1916(-9343, widget);
		    }
		    if (((Widget) widget).anInt704 == -1)
			Class188.method1415(((Widget) widget).anInt830, 117);
		    return;
		}
		return;
	    }
	} else if (i >= 1200 && i < 1300 || i >= 2200 && i < 2300) {
	    Widget class46;
	    if (i >= 2000) {
		i -= 1000;
		class46 = AbstractFontRasterizer.getWidget(intStack[--intStackOffset]);
	    } else
		class46 = isState0 ? currentWidget : currentWidget2;
	    Class251.method1916(-9343, class46);
	    if (i == 1200 || i == 1205 || i == 1208 || i == 1209 || i == 1212
		|| i == 1213) {
		intStackOffset -= 2;
		int i_279_ = intStack[intStackOffset];
		int i_280_ = intStack[intStackOffset + 1];
		if (((Widget) class46).anInt704 == -1) {
		    FileArchiveTracker.method743(9, ((Widget) class46).anInt830);
		    Class239_Sub15.method1787(((Widget) class46).anInt830, 8);
		    Class199.method1459(((Widget) class46).anInt830, 2);
		}
		if (i_279_ == -1) {
		    ((Widget) class46).anInt770 = 1;
		    ((Widget) class46).anInt753 = -1;
		    ((Widget) class46).itemId = -1;
		} else {
		    ((Widget) class46).itemId = i_279_;
		    ((Widget) class46).anInt781 = i_280_;
		    if (i == 1208 || i == 1209)
			((Widget) class46).aBoolean720 = true;
		    else
			((Widget) class46).aBoolean720 = false;
		    ItemDefinition class213
			= ToolkitException.itemLoader.getItemDefinition(74, i_279_);
		    ((Widget) class46).anInt757
			= ((ItemDefinition) class213).anInt2787;
		    ((Widget) class46).anInt675
			= ((ItemDefinition) class213).anInt2781;
		    ((Widget) class46).anInt717
			= ((ItemDefinition) class213).anInt2810;
		    ((Widget) class46).anInt808
			= ((ItemDefinition) class213).anInt2779;
		    ((Widget) class46).anInt786
			= ((ItemDefinition) class213).anInt2826;
		    ((Widget) class46).anInt716
			= ((ItemDefinition) class213).anInt2825;
		    if (i == 1205 || i == 1209)
			((Widget) class46).anInt678 = 0;
		    else if (i == 1212 || i == 1213)
			((Widget) class46).anInt678 = 1;
		    else
			((Widget) class46).anInt678 = 2;
		    if (((Widget) class46).anInt796 > 0)
			((Widget) class46).anInt716
			    = (((Widget) class46).anInt716 * 32
			       / ((Widget) class46).anInt796);
		    else {
			if (((Widget) class46).anInt842 > 0)
			    ((Widget) class46).anInt716
				= (((Widget) class46).anInt716 * 32
				   / ((Widget) class46).anInt842);
			return;
		    }
		    return;
		}
		return;
	    }
	    if (i == 1201) {
		((Widget) class46).anInt770 = 2;
		((Widget) class46).anInt753 = intStack[--intStackOffset];
		if (((Widget) class46).anInt704 == -1)
		    Class369.method3569(((Widget) class46).anInt830, -124);
		return;
	    }
	    if (i == 1202) {
		((Widget) class46).anInt770 = 3;
		((Widget) class46).anInt753 = -1;
		if (((Widget) class46).anInt704 == -1)
		    Class369.method3569(((Widget) class46).anInt830, 94);
		return;
	    }
	    if (i == 1203) {
		((Widget) class46).anInt770 = 6;
		((Widget) class46).anInt753 = intStack[--intStackOffset];
		if (((Widget) class46).anInt704 == -1)
		    Class369.method3569(((Widget) class46).anInt830, -26);
		return;
	    }
	    if (i == 1204) {
		((Widget) class46).anInt770 = 5;
		((Widget) class46).anInt753 = intStack[--intStackOffset];
		if (((Widget) class46).anInt704 == -1)
		    Class369.method3569(((Widget) class46).anInt830, -127);
		return;
	    }
	    if (i == 1206) {
		intStackOffset -= 4;
		((Widget) class46).anInt705 = intStack[intStackOffset];
		((Widget) class46).anInt674 = intStack[intStackOffset + 1];
		((Widget) class46).anInt733 = intStack[intStackOffset + 2];
		((Widget) class46).anInt693 = intStack[intStackOffset + 3];
		Class251.method1916(-9343, class46);
		return;
	    }
	    if (i == 1207) {
		intStackOffset -= 2;
		((Widget) class46).anInt759 = intStack[intStackOffset];
		((Widget) class46).anInt835 = intStack[intStackOffset + 1];
		Class251.method1916(-9343, class46);
		return;
	    }
	    if (i == 1210) {
		intStackOffset -= 4;
		((Widget) class46).anInt753 = intStack[intStackOffset];
		((Widget) class46).anInt779 = intStack[intStackOffset + 1];
		if (intStack[intStackOffset + 2] == 1)
		    ((Widget) class46).anInt770 = 9;
		else
		    ((Widget) class46).anInt770 = 8;
		if (intStack[intStackOffset + 3] == 1)
		    ((Widget) class46).aBoolean720 = true;
		else
		    ((Widget) class46).aBoolean720 = false;
		if (((Widget) class46).anInt704 == -1)
		    Class369.method3569(((Widget) class46).anInt830, 8);
		return;
	    }
	    if (i == 1211) {
		((Widget) class46).anInt770 = 5;
		((Widget) class46).anInt753 = Class348_Sub42_Sub11.localPlayerId;
		((Widget) class46).anInt779 = 0;
		if (((Widget) class46).anInt704 == -1)
		    Class369.method3569(((Widget) class46).anInt830, 66);
		return;
	    }
	} else if (i >= 1300 && i < 1400 || i >= 2300 && i < 2400) {
	    Widget class46;
	    if (i >= 2000) {
		i -= 1000;
		class46 = AbstractFontRasterizer.getWidget(intStack[--intStackOffset]);
	    } else
		class46 = isState0 ? currentWidget : currentWidget2;
	    if (i == 1300) {
		int i_281_ = intStack[--intStackOffset] - 1;
		if (i_281_ < 0 || i_281_ > 9)
		    anInt1170--;
		else {
		    class46.method438(i_281_, 124,
				      strStack[--anInt1170]);
		    return;
		}
		return;
	    }
	    if (i == 1301) {
		intStackOffset -= 2;
		int i_282_ = intStack[intStackOffset];
		int i_283_ = intStack[intStackOffset + 1];
		if (i_282_ == -1 && i_283_ == -1)
		    ((Widget) class46).aClass46_782 = null;
		else {
		    ((Widget) class46).aClass46_782
			= Class348_Sub22.getWidgetChild(i_283_,
						    i_282_);
		    return;
		}
		return;
	    }
	    if (i == 1302) {
		int i_284_ = intStack[--intStackOffset];
		if (i_284_ == DummyInputstream2.anInt78
		    || i_284_ == Class179.anInt2361
		    || i_284_ == Class312.anInt3930) {
		    ((Widget) class46).anInt797 = i_284_;
		    return;
		}
		return;
	    }
	    if (i == 1303) {
		((Widget) class46).anInt729 = intStack[--intStackOffset];
		return;
	    }
	    if (i == 1304) {
		((Widget) class46).anInt703 = intStack[--intStackOffset];
		return;
	    }
	    if (i == 1305) {
		((Widget) class46).aString752 = strStack[--anInt1170];
		return;
	    }
	    if (i == 1306) {
		((Widget) class46).aString780 = strStack[--anInt1170];
		return;
	    }
	    if (i == 1307) {
		((Widget) class46).aStringArray833 = null;
		return;
	    }
	    if (i == 1308) {
		((Widget) class46).anInt695 = intStack[--intStackOffset];
		((Widget) class46).anInt824 = intStack[--intStackOffset];
		return;
	    }
	    if (i == 1309) {
		int i_285_ = intStack[--intStackOffset];
		int i_286_ = intStack[--intStackOffset];
		if (i_286_ >= 1 && i_286_ <= 10)
		    class46.method431(i_286_ - 1, i_285_, (byte) -119);
		return;
	    }
	    if (i == 1310) {
		((Widget) class46).aString816 = strStack[--anInt1170];
		return;
	    }
	    if (i == 1311) {
		((Widget) class46).anInt713 = intStack[--intStackOffset];
		return;
	    }
	    if (i == 1312 || i == 1313) {
		int i_287_;
		int i_288_;
		int i_289_;
		if (i == 1312) {
		    intStackOffset -= 3;
		    i_287_ = intStack[intStackOffset] - 1;
		    i_288_ = intStack[intStackOffset + 1];
		    i_289_ = intStack[intStackOffset + 2];
		    if (i_287_ < 0 || i_287_ > 9)
			throw new RuntimeException("IOR13121313");
		} else {
		    intStackOffset -= 2;
		    i_287_ = 10;
		    i_288_ = intStack[intStackOffset];
		    i_289_ = intStack[intStackOffset + 1];
		}
		if (((Widget) class46).aByteArray746 == null) {
		    if (i_288_ != 0) {
			((Widget) class46).aByteArray746 = new byte[11];
			((Widget) class46).aByteArray832 = new byte[11];
			((Widget) class46).anIntArray707 = new int[11];
		    } else
			return;
		}
		((Widget) class46).aByteArray746[i_287_] = (byte) i_288_;
		if (i_288_ != 0)
		    ((Widget) class46).aBoolean676 = true;
		else {
		    ((Widget) class46).aBoolean676 = false;
		    for (int i_290_ = 0;
			 i_290_ < ((Widget) class46).aByteArray746.length;
			 i_290_++) {
			if (((Widget) class46).aByteArray746[i_290_] != 0) {
			    ((Widget) class46).aBoolean676 = true;
			    break;
			}
		    }
		}
		((Widget) class46).aByteArray832[i_287_] = (byte) i_289_;
		return;
	    }
	    if (i == 1314) {
		((Widget) class46).anInt719 = intStack[--intStackOffset];
		return;
	    }
	} else {
	    if (i >= 1400 && i < 1500 || i >= 2400 && i < 2500) {
		Widget class46;
		if (i >= 2000) {
		    i -= 1000;
		    class46 = AbstractFontRasterizer.getWidget(intStack[--intStackOffset]);
		} else
		    class46 = isState0 ? currentWidget : currentWidget2;
		if (i == 1499)
		    class46.method434(false);
		else {
		    String string = strStack[--anInt1170];
		    int[] is = null;
		    if (string.length() > 0
			&& string.charAt(string.length() - 1) == 'Y') {
			int i_291_ = intStack[--intStackOffset];
			if (i_291_ > 0) {
			    is = new int[i_291_];
			    while (i_291_-- > 0)
				is[i_291_] = intStack[--intStackOffset];
			}
			string = string.substring(0, string.length() - 1);
		    }
		    Object[] objects = new Object[string.length() + 1];
		    for (int i_292_ = objects.length - 1; i_292_ >= 1;
			 i_292_--) {
			if (string.charAt(i_292_ - 1) == 's')
			    objects[i_292_] = strStack[--anInt1170];
			else
			    objects[i_292_]
				= new Integer(intStack[--intStackOffset]);
		    }
		    int i_293_ = intStack[--intStackOffset];
		    if (i_293_ != -1)
			objects[0] = new Integer(i_293_);
		    else
			objects = null;
		    if (i == 1400)
			((Widget) class46).anObjectArray763 = objects;
		    else if (i == 1401)
			((Widget) class46).anObjectArray805 = objects;
		    else if (i == 1402)
			((Widget) class46).anObjectArray742 = objects;
		    else if (i == 1403)
			((Widget) class46).anObjectArray811 = objects;
		    else if (i == 1404)
			((Widget) class46).anObjectArray683 = objects;
		    else if (i == 1405)
			((Widget) class46).anObjectArray823 = objects;
		    else if (i == 1406)
			((Widget) class46).anObjectArray680 = objects;
		    else if (i == 1407) {
			((Widget) class46).configTriggeredScriptParameters = objects;
			((Widget) class46).configScriptTriggers = is;
		    } else if (i == 1408)
			((Widget) class46).logicCycleScriptParameters = objects;
		    else if (i == 1409)
			((Widget) class46).anObjectArray741 = objects;
		    else if (i == 1410)
			((Widget) class46).anObjectArray692 = objects;
		    else if (i == 1411)
			((Widget) class46).anObjectArray785 = objects;
		    else if (i == 1412)
			((Widget) class46).anObjectArray839 = objects;
		    else if (i == 1414) {
			((Widget) class46).anObjectArray751 = objects;
			((Widget) class46).anIntArray771 = is;
		    } else if (i == 1415) {
			((Widget) class46).anObjectArray671 = objects;
			((Widget) class46).anIntArray731 = is;
		    } else if (i == 1416)
			((Widget) class46).anObjectArray714 = objects;
		    else if (i == 1417)
			((Widget) class46).anObjectArray803 = objects;
		    else if (i == 1418)
			((Widget) class46).anObjectArray820 = objects;
		    else if (i == 1419)
			((Widget) class46).anObjectArray822 = objects;
		    else if (i == 1420)
			((Widget) class46).anObjectArray734 = objects;
		    else if (i == 1421)
			((Widget) class46).anObjectArray761 = objects;
		    else if (i == 1422)
			((Widget) class46).anObjectArray836 = objects;
		    else if (i == 1423)
			((Widget) class46).anObjectArray840 = objects;
		    else if (i == 1424)
			((Widget) class46).anObjectArray701 = objects;
		    else if (i == 1425)
			((Widget) class46).anObjectArray807 = objects;
		    else if (i == 1426)
			((Widget) class46).anObjectArray687 = objects;
		    else if (i == 1427)
			((Widget) class46).anObjectArray727 = objects;
		    else if (i == 1428) {
			((Widget) class46).anObjectArray685 = objects;
			((Widget) class46).anIntArray818 = is;
		    } else if (i == 1429) {
			((Widget) class46).anObjectArray708 = objects;
			((Widget) class46).anIntArray831 = is;
		    } else if (i == 1430)
			((Widget) class46).scriptParameters = objects;
		    ((Widget) class46).aBoolean682 = true;
		    return;
		}
		return;
	    }
	    if (i < 1600) {
		Widget class46 = isState0 ? currentWidget : currentWidget2;
		if (i == 1500) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt800;
		    return;
		}
		if (i == 1501) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt750;
		    return;
		}
		if (i == 1502) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt709;
		    return;
		}
		if (i == 1503) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt789;
		    return;
		}
		if (i == 1504) {
		    intStack[intStackOffset++]
			= ((Widget) class46).aBoolean813 ? 1 : 0;
		    return;
		}
		if (i == 1505) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt834;
		    return;
		}
		if (i == 1506) {
		    Widget class46_294_ = Class237.method1687(class46, 3);
		    intStack[intStackOffset++]
			= (class46_294_ == null ? -1
			   : ((Widget) class46_294_).anInt830);
		    return;
		}
	    } else if (i < 1700) {
		Widget class46 = isState0 ? currentWidget : currentWidget2;
		if (i == 1600) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt747;
		    return;
		}
		if (i == 1601) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt755;
		    return;
		}
		if (i == 1602) {
		    strStack[anInt1170++]
			= ((Widget) class46).text;
		    return;
		}
		if (i == 1603) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt698;
		    return;
		}
		if (i == 1604) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt791;
		    return;
		}
		if (i == 1605) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt716;
		    return;
		}
		if (i == 1606) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt757;
		    return;
		}
		if (i == 1607) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt717;
		    return;
		}
		if (i == 1608) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt675;
		    return;
		}
		if (i == 1609) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt696;
		    return;
		}
		if (i == 1610) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt808;
		    return;
		}
		if (i == 1611) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt786;
		    return;
		}
		if (i == 1612) {
		    intStack[intStackOffset++] = ((Widget) class46).id;
		    return;
		}
		if (i == 1613) {
		    int i_295_ = intStack[--intStackOffset];
		    Class254 class254
			= Class101_Sub3.aClass326_5764.method2600(i_295_,
								  28364);
		    if (class254.method1925(false))
			strStack[anInt1170++]
			    = class46.method429(i_295_, (((Class254) class254)
							 .aString3258), -1);
		    else {
			intStack[intStackOffset++]
			    = class46.method428((((Class254) class254)
						 .anInt3256),
						i_295_, -126);
			return;
		    }
		    return;
		}
		if (i == 1614) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt828;
		    return;
		}
		if (i == 2614) {
		    intStack[intStackOffset++]
			= (((Widget) class46).anInt770 == 1
			   ? ((Widget) class46).anInt753 : -1);
		    return;
		}
	    } else if (i < 1800) {
		Widget class46 = isState0 ? currentWidget : currentWidget2;
		if (i == 1700) {
		    intStack[intStackOffset++] = ((Widget) class46).itemId;
		    return;
		}
		if (i == 1701) {
		    if (((Widget) class46).itemId != -1)
			intStack[intStackOffset++]
			    = ((Widget) class46).anInt781;
		    else {
			intStack[intStackOffset++] = 0;
			return;
		    }
		    return;
		}
		if (i == 1702) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt704;
		    return;
		}
	    } else if (i < 1900) {
		Widget class46 = isState0 ? currentWidget : currentWidget2;
		if (i == 1800) {
		    intStack[intStackOffset++]
			= Main.method105(class46).method3307(83);
		    return;
		}
		if (i == 1801) {
		    int i_296_ = intStack[--intStackOffset];
		    i_296_--;
		    if (((Widget) class46).aStringArray833 == null
			|| i_296_ >= ((Widget) class46).aStringArray833.length
			|| ((Widget) class46).aStringArray833[i_296_] == null)
			strStack[anInt1170++] = "";
		    else {
			strStack[anInt1170++]
			    = ((Widget) class46).aStringArray833[i_296_];
			return;
		    }
		    return;
		}
		if (i == 1802) {
		    if (((Widget) class46).aString752 == null)
			strStack[anInt1170++] = "";
		    else {
			strStack[anInt1170++]
			    = ((Widget) class46).aString752;
			return;
		    }
		    return;
		}
	    } else if (i < 2000 || i >= 2900 && i < 3000) {
		Widget widget;
		if (i >= 2000) {
		    widget = AbstractFontRasterizer.getWidget(intStack[--intStackOffset]);
		    i -= 1000;
		} else
		    widget = isState0 ? currentWidget : currentWidget2;
		if (anInt1177 >= 10)
		    throw new RuntimeException("C29xx-1");
		if (i == 1927) {
		    if (((Widget) widget).anObjectArray727 != null) {
			InterfaceScript class348_sub36 = new InterfaceScript();
			((InterfaceScript) class348_sub36).parent
			    = widget;
			((InterfaceScript) class348_sub36).parameters
			    = ((Widget) widget).anObjectArray727;
			((InterfaceScript) class348_sub36).anInt6988
			    = anInt1177 + 1;
			Class348_Sub1_Sub2.aClass262_8810
			    .addToFront(class348_sub36, -20180);
			return;
		    }
		    return;
		}
	    } else if (i < 2600) {
		Widget class46
		    = AbstractFontRasterizer.getWidget(intStack[--intStackOffset]);
		if (i == 2500) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt800;
		    return;
		}
		if (i == 2501) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt750;
		    return;
		}
		if (i == 2502) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt709;
		    return;
		}
		if (i == 2503) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt789;
		    return;
		}
		if (i == 2504) {
		    intStack[intStackOffset++]
			= ((Widget) class46).aBoolean813 ? 1 : 0;
		    return;
		}
		if (i == 2505) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt834;
		    return;
		}
		if (i == 1506) {
		    Widget class46_297_ = Class237.method1687(class46, 3);
		    intStack[intStackOffset++]
			= (class46_297_ == null ? -1
			   : ((Widget) class46_297_).anInt830);
		    return;
		}
	    } else if (i < 2700) {
		Widget class46
		    = AbstractFontRasterizer.getWidget(intStack[--intStackOffset]);
		if (i == 2600) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt747;
		    return;
		}
		if (i == 2601) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt755;
		    return;
		}
		if (i == 2602) {
		    strStack[anInt1170++]
			= ((Widget) class46).text;
		    return;
		}
		if (i == 2603) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt698;
		    return;
		}
		if (i == 2604) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt791;
		    return;
		}
		if (i == 2605) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt716;
		    return;
		}
		if (i == 2606) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt757;
		    return;
		}
		if (i == 2607) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt717;
		    return;
		}
		if (i == 2608) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt675;
		    return;
		}
		if (i == 2609) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt696;
		    return;
		}
		if (i == 2610) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt808;
		    return;
		}
		if (i == 2611) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt786;
		    return;
		}
		if (i == 2612) {
		    intStack[intStackOffset++] = ((Widget) class46).id;
		    return;
		}
		if (i == 2613) {
		    intStack[intStackOffset++] = ((Widget) class46).anInt828;
		    return;
		}
		if (i == 2614) {
		    intStack[intStackOffset++]
			= (((Widget) class46).anInt770 == 1
			   ? ((Widget) class46).anInt753 : -1);
		    return;
		}
	    } else if (i < 2800) {
		if (i == 2700) {
		    Widget class46
			= AbstractFontRasterizer.getWidget(intStack[--intStackOffset]);
		    intStack[intStackOffset++] = ((Widget) class46).itemId;
		    return;
		}
		if (i == 2701) {
		    Widget class46
			= AbstractFontRasterizer.getWidget(intStack[--intStackOffset]);
		    if (((Widget) class46).itemId != -1)
			intStack[intStackOffset++]
			    = ((Widget) class46).anInt781;
		    else {
			intStack[intStackOffset++] = 0;
			return;
		    }
		    return;
		}
		if (i == 2702) {
		    int i_298_ = intStack[--intStackOffset];
		    Class348_Sub41 class348_sub41
			= ((Class348_Sub41)
			   Class125.aClass356_4915.get((long) i_298_));
		    if (class348_sub41 != null)
			intStack[intStackOffset++] = 1;
		    else {
			intStack[intStackOffset++] = 0;
			return;
		    }
		    return;
		}
		if (i == 2703) {
		    Widget class46
			= AbstractFontRasterizer.getWidget(intStack[--intStackOffset]);
		    if (((Widget) class46).children == null)
			intStack[intStackOffset++] = 0;
		    else {
			int i_299_
			    = ((Widget) class46).children.length;
			for (int i_300_ = 0;
			     (i_300_
			      < ((Widget) class46).children.length);
			     i_300_++) {
			    if (((Widget) class46).children[i_300_]
				== null) {
				i_299_ = i_300_;
				break;
			    }
			}
			intStack[intStackOffset++] = i_299_;
			return;
		    }
		    return;
		}
		if (i == 2704 || i == 2705) {
		    intStackOffset -= 2;
		    int i_301_ = intStack[intStackOffset];
		    int i_302_ = intStack[intStackOffset + 1];
		    Class348_Sub41 class348_sub41
			= ((Class348_Sub41)
			   Class125.aClass356_4915.get((long) i_301_));
		    if (class348_sub41 != null
			&& (((Class348_Sub41) class348_sub41).anInt7050
			    == i_302_))
			intStack[intStackOffset++] = 1;
		    else {
			intStack[intStackOffset++] = 0;
			return;
		    }
		    return;
		}
	    } else if (i < 2900) {
		Widget class46
		    = AbstractFontRasterizer.getWidget(intStack[--intStackOffset]);
		if (i == 2800) {
		    intStack[intStackOffset++]
			= Main.method105(class46).method3307(11);
		    return;
		}
		if (i == 2801) {
		    int i_303_ = intStack[--intStackOffset];
		    i_303_--;
		    if (((Widget) class46).aStringArray833 == null
			|| i_303_ >= ((Widget) class46).aStringArray833.length
			|| ((Widget) class46).aStringArray833[i_303_] == null)
			strStack[anInt1170++] = "";
		    else {
			strStack[anInt1170++]
			    = ((Widget) class46).aStringArray833[i_303_];
			return;
		    }
		    return;
		}
		if (i == 2802) {
		    if (((Widget) class46).aString752 == null)
			strStack[anInt1170++] = "";
		    else {
			strStack[anInt1170++]
			    = ((Widget) class46).aString752;
			return;
		    }
		    return;
		}
	    } else if (i < 3200) {
		if (i == 3100) {
		    String string = strStack[--anInt1170];
		    Class191.method1429(string, 0);
		    return;
		}
		if (i == 3101) {
		    intStackOffset -= 2;
		    Class11.method222((Class132
				       .localPlayer),
				      intStack[intStackOffset], (byte) 4,
				      intStack[intStackOffset + 1]);
		    return;
		}
		if (i == 3103) {
		    GameText.method2060((byte) -101, true);
		    return;
		}
		if (i == 3104) {
		    String string = strStack[--anInt1170];
		    int i_304_ = 0;
		    if (Class50_Sub3.method468(string, 73))
			i_304_ = Class348_Sub41.method3156(true, string);
		    anInt1163++;
		    BufferedPacket class348_sub47
			= Class286_Sub3.createBufferedPacket((LongNode
						    .aClass351_6764),
						   (Class348_Sub23_Sub2
						    .outgoingGameIsaac));
		    ((BufferedPacket) class348_sub47)
			.buffer
			.putInt(i_304_);
		    Class348_Sub42_Sub14.putBufferedPacket(116, class348_sub47);
		    return;
		}
		if (i == 3105) {
		    String string = strStack[--anInt1170];
		    anInt1162++;
		    BufferedPacket class348_sub47
			= Class286_Sub3.createBufferedPacket(ArchiveFetcher.aClass351_4225,
						   (Class348_Sub23_Sub2
						    .outgoingGameIsaac));
		    ((BufferedPacket) class348_sub47)
			.buffer
			.putByte(string.length() + 1);
		    ((BufferedPacket) class348_sub47)
			.buffer
			.putJStr((byte) -5, string);
		    Class348_Sub42_Sub14.putBufferedPacket(-81, class348_sub47);
		    return;
		}
		if (i == 3106) {
		    String string = strStack[--anInt1170];
		    anInt1153++;
		    BufferedPacket class348_sub47
			= Class286_Sub3.createBufferedPacket((Class348_Sub40_Sub5
						    .aClass351_9130),
						   (Class348_Sub23_Sub2
						    .outgoingGameIsaac));
		    ((BufferedPacket) class348_sub47)
			.buffer
			.putByte(string.length() + 1);
		    ((BufferedPacket) class348_sub47)
			.buffer
			.putJStr((byte) -5, string);
		    Class348_Sub42_Sub14.putBufferedPacket(35, class348_sub47);
		    return;
		}
		if (i == 3107) {
		    int i_305_ = intStack[--intStackOffset];
		    String string = strStack[--anInt1170];
		    Class5_Sub3.method201(i_305_, -7257, string);
		    return;
		}
		if (i == 3108) {
		    intStackOffset -= 3;
		    int i_306_ = intStack[intStackOffset];
		    int i_307_ = intStack[intStackOffset + 1];
		    int i_308_ = intStack[intStackOffset + 2];
		    Widget class46 = AbstractFontRasterizer.getWidget(i_308_);
		    Class100.method887(class46, i_306_, i_307_, 2147483647);
		    return;
		}
		if (i == 3109) {
		    intStackOffset -= 2;
		    int i_309_ = intStack[intStackOffset];
		    int i_310_ = intStack[intStackOffset + 1];
		    Widget class46 = isState0 ? currentWidget : currentWidget2;
		    Class100.method887(class46, i_309_, i_310_, 2147483647);
		    return;
		}
		if (i == 3110) {
		    int i_311_ = intStack[--intStackOffset];
		    anInt1167++;
		    BufferedPacket class348_sub47
			= Class286_Sub3.createBufferedPacket((Class348_Sub40_Sub12
						    .aClass351_9189),
						   (Class348_Sub23_Sub2
						    .outgoingGameIsaac));
		    ((BufferedPacket) class348_sub47)
			.buffer
			.putShort(i_311_);
		    Class348_Sub42_Sub14.putBufferedPacket(122, class348_sub47);
		    return;
		}
		if (i == 3111) {
		    intStackOffset -= 2;
		    int i_312_ = intStack[intStackOffset];
		    int i_313_ = intStack[intStackOffset + 1];
		    Class348_Sub41 class348_sub41
			= ((Class348_Sub41)
			   Class125.aClass356_4915.get((long) i_312_));
		    if (class348_sub41 != null)
			Class127_Sub1.method1118((((Class348_Sub41)
						   class348_sub41).anInt7050
						  != i_313_),
						 true, class348_sub41, 2533);
		    Class338.method2661(i_313_, i_312_, 3, true, 2);
		    return;
		}
		if (i == 3112) {
		    intStackOffset--;
		    int i_314_ = intStack[intStackOffset];
		    Class348_Sub41 class348_sub41
			= ((Class348_Sub41)
			   Class125.aClass356_4915.get((long) i_314_));
		    if (class348_sub41 != null
			&& ((Class348_Sub41) class348_sub41).anInt7053 == 3)
			Class127_Sub1.method1118(true, true, class348_sub41,
						 2533);
		    return;
		}
		if (i == 3113) {
		    Class239_Sub1.method1721(strStack[--anInt1170],
					     (byte) -70);
		    return;
		}
		if (i == 3114) {
		    intStackOffset -= 2;
		    int i_315_ = intStack[intStackOffset];
		    int i_316_ = intStack[intStackOffset + 1];
		    String string = strStack[--anInt1170];
		    Class286_Sub2.handleMessage("", i_315_, i_316_,
					     string, "", "");
		    return;
		}
		if (i == 3115) {
		    intStackOffset -= 11;
		    Class221[] class221s = Class158.method1248(20);
		    Class341[] class341s = Class62.method596(20000);
		    Class272.method2051(intStack[intStackOffset + 9],
					intStack[intStackOffset + 5],
					class221s[intStack[intStackOffset]],
					(class341s
					 [intStack[intStackOffset + 1]]),
					intStack[intStackOffset + 7],
					intStack[intStackOffset + 6],
					intStack[intStackOffset + 4],
					(byte) 111,
					intStack[intStackOffset + 10],
					intStack[intStackOffset + 2],
					intStack[intStackOffset + 3],
					intStack[intStackOffset + 8]);
		    return;
		}
	    } else if (i < 3300) {
		if (i == 3200) {
		    intStackOffset -= 3;
		    Class348_Sub20.method2947(true, 255,
					      intStack[intStackOffset],
					      intStack[intStackOffset + 1],
					      intStack[intStackOffset + 2],
					      256);
		    return;
		}
		if (i == 3201) {
		    Class151.method1212(255, intStack[--intStackOffset], -1,
					50);
		    return;
		}
		if (i == 3202) {
		    intStackOffset -= 2;
		    Class177.method1352(intStack[intStackOffset], 255,
					intStack[intStackOffset + 1],
					(byte) -98);
		    return;
		}
		if (i == 3203) {
		    intStackOffset -= 4;
		    Class348_Sub20.method2947(true,
					      intStack[intStackOffset + 3],
					      intStack[intStackOffset],
					      intStack[intStackOffset + 1],
					      intStack[intStackOffset + 2],
					      256);
		    return;
		}
		if (i == 3204) {
		    intStackOffset -= 3;
		    Class151.method1212(intStack[intStackOffset + 1],
					intStack[intStackOffset], -1,
					intStack[intStackOffset + 2]);
		    return;
		}
		if (i == 3205) {
		    intStackOffset -= 3;
		    Class177.method1352(intStack[intStackOffset],
					intStack[intStackOffset + 2],
					intStack[intStackOffset + 1],
					(byte) -98);
		    return;
		}
		if (i == 3206) {
		    intStackOffset -= 4;
		    Class279.method2090(intStack[intStackOffset + 1], 256,
					false, (byte) -35,
					intStack[intStackOffset + 3],
					intStack[intStackOffset + 2],
					intStack[intStackOffset]);
		    return;
		}
		if (i == 3207) {
		    intStackOffset -= 4;
		    Class279.method2090(intStack[intStackOffset + 1], 256,
					true, (byte) -35,
					intStack[intStackOffset + 3],
					intStack[intStackOffset + 2],
					intStack[intStackOffset]);
		    return;
		}
		if (i == 3208) {
		    intStackOffset -= 5;
		    Class348_Sub20.method2947(true,
					      intStack[intStackOffset + 3],
					      intStack[intStackOffset],
					      intStack[intStackOffset + 1],
					      intStack[intStackOffset + 2],
					      intStack[intStackOffset + 4]);
		    return;
		}
		if (i == 3209) {
		    intStackOffset -= 5;
		    Class279.method2090(intStack[intStackOffset + 1],
					intStack[intStackOffset + 4], false,
					(byte) -35,
					intStack[intStackOffset + 3],
					intStack[intStackOffset + 2],
					intStack[intStackOffset]);
		    return;
		}
	    } else if (i < 3400) {
		if (i == 3300) {
		    intStack[intStackOffset++] = Class367_Sub11.logicCycle;
		    return;
		}
		if (i == 3301) {
		    intStackOffset -= 2;
		    int i_317_ = intStack[intStackOffset];
		    int i_318_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++] = Class322.method2552(false, i_317_, i_318_, -24667);
		    return;
		}
		if (i == 3302) {
		    intStackOffset -= 2;
		    int i_319_ = intStack[intStackOffset];
		    int i_320_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++]
			= Class240.method1854(71, i_319_, false, i_320_);
		    return;
		}
		if (i == 3303) {
		    intStackOffset -= 2;
		    int i_321_ = intStack[intStackOffset];
		    int i_322_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++]
			= Class58.method532(i_322_, i_321_, false, -126);
		    return;
		}
		if (i == 3304) {
		    int i_323_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= (((Class348_Sub42_Sub7) Class127_Sub1
						      .aClass271_8378
						      .method2044(106, i_323_))
			   .anInt9542);
		    return;
		}
		if (i == 3305) {
		    int i_324_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= ConnectionMode.anIntArray2145[i_324_];
		    return;
		}
		if (i == 3306) {
		    int i_325_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= Class256.anIntArray3295[i_325_];
		    return;
		}
		if (i == 3307) {
		    int i_326_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= Class186.anIntArray2497[i_326_];
		    return;
		}
		if (i == 3308) {
		    int i_327_ = (((Class318_Sub1) Class132.localPlayer).aByte6381);
		    int i_328_
			= (((((Class318_Sub1)
			      Class132.localPlayer)
			     .anInt6377)
			    >> 9)
			   + za_Sub2.anInt9780);
		    int i_329_
			= (((((Class318_Sub1)
			      Class132.localPlayer)
			     .anInt6388)
			    >> 9)
			   + Class90.anInt1517);
		    intStack[intStackOffset++]
			= (i_327_ << 28) + (i_328_ << 14) + i_329_;
		    return;
		}
		if (i == 3309) {
		    int i_330_ = intStack[--intStackOffset];
		    intStack[intStackOffset++] = i_330_ >> 14 & 0x3fff;
		    return;
		}
		if (i == 3310) {
		    int i_331_ = intStack[--intStackOffset];
		    intStack[intStackOffset++] = i_331_ >> 28;
		    return;
		}
		if (i == 3311) {
		    int i_332_ = intStack[--intStackOffset];
		    intStack[intStackOffset++] = i_332_ & 0x3fff;
		    return;
		}
		if (i == 3312) {
		    intStack[intStackOffset++]
			= Class130.aBoolean1900 ? 1 : 0;
		    return;
		}
		if (i == 3313) {
		    intStackOffset -= 2;
		    int i_333_ = intStack[intStackOffset];
		    int i_334_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++]
			= Class322.method2552(true, i_333_, i_334_, -24667);
		    return;
		}
		if (i == 3314) {
		    intStackOffset -= 2;
		    int i_335_ = intStack[intStackOffset];
		    int i_336_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++]
			= Class240.method1854(103, i_335_, true, i_336_);
		    return;
		}
		if (i == 3315) {
		    intStackOffset -= 2;
		    int i_337_ = intStack[intStackOffset];
		    int i_338_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++]
			= Class58.method532(i_338_, i_337_, true, 126);
		    return;
		}
		if (i == 3316) {
		    if (Class192.anInt2581 >= 2)
			intStack[intStackOffset++] = Class192.anInt2581;
		    else {
			intStack[intStackOffset++] = 0;
			return;
		    }
		    return;
		}
		if (i == 3317) {
		    intStack[intStackOffset++] = Class289.anInt3699;
		    return;
		}
		if (i == 3318) {
		    intStack[intStackOffset++] = ((ConnectionMode) Class3.currentConnection).portOffset;
		    return;
		}
		if (i == 3321) {
		    intStack[intStackOffset++] = NativeLibTracker.runEnergy;
		    return;
		}
		if (i == 3322) {
		    intStack[intStackOffset++] = Class128.anInt1872;
		    return;
		}
		if (i == 3323) {
		    if (Class125.anInt4919 >= 5 && Class125.anInt4919 <= 9)
			intStack[intStackOffset++] = 1;
		    else {
			intStack[intStackOffset++] = 0;
			return;
		    }
		    return;
		}
		if (i == 3324) {
		    if (Class125.anInt4919 >= 5 && Class125.anInt4919 <= 9)
			intStack[intStackOffset++] = Class125.anInt4919;
		    else {
			intStack[intStackOffset++] = 0;
			return;
		    }
		    return;
		}
		if (i == 3325) {
		    intStack[intStackOffset++]
			= Class206.aBoolean4888 ? 1 : 0;
		    return;
		}
		if (i == 3326) {
		    intStack[intStackOffset++]
			= (((Player)
			    Class132.localPlayer)
			   .anInt10516);
		    return;
		}
		if (i == 3327) {
		    intStack[intStackOffset++]
			= ((((Player)
			     Class132.localPlayer)
			    .aClass154_10536) != null
			   && ((Class154)
			       (((Player)
				 Class132.localPlayer)
				.aClass154_10536)).aBoolean2100) ? 1 : 0;
		    return;
		}
		if (i == 3329) {
		    intStack[intStackOffset++]
			= Class50_Sub2.aBoolean5233 ? 1 : 0;
		    return;
		}
		if (i == 3330) {
		    int i_339_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= Class307.method2301((byte) 35, i_339_, false);
		    return;
		}
		if (i == 3331) {
		    intStackOffset -= 2;
		    int i_340_ = intStack[intStackOffset];
		    int i_341_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++]
			= Class61.method592(false, (byte) -128, false, i_340_,
					    i_341_);
		    return;
		}
		if (i == 3332) {
		    intStackOffset -= 2;
		    int i_342_ = intStack[intStackOffset];
		    int i_343_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++]
			= Class61.method592(true, (byte) -128, false, i_342_,
					    i_343_);
		    return;
		}
		if (i == 3333) {
		    intStack[intStackOffset++]
			= RuntimeException_Sub1.anInt4596;
		    return;
		}
		if (i == 3335) {
		    intStack[intStackOffset++] = Class348_Sub33.gameLanguage;
		    return;
		}
		if (i == 3336) {
		    intStackOffset -= 4;
		    int i_344_ = intStack[intStackOffset];
		    int i_345_ = intStack[intStackOffset + 1];
		    int i_346_ = intStack[intStackOffset + 2];
		    int i_347_ = intStack[intStackOffset + 3];
		    i_344_ += i_345_ << 14;
		    i_344_ += i_346_ << 28;
		    i_344_ += i_347_;
		    intStack[intStackOffset++] = i_344_;
		    return;
		}
		if (i == 3337) {
		    intStack[intStackOffset++] = SocketWorker.anInt2670;
		    return;
		}
		if (i == 3338) {
		    intStack[intStackOffset++] = Class284.method2116(-26584);
		    return;
		}
		if (i == 3339) {
		    intStack[intStackOffset++] = 0;
		    return;
		}
		if (i == 3340) {
		    intStack[intStackOffset++]
			= Class175.isWindowActive ? 1 : 0;
		    return;
		}
		if (i == 3341) {
		    intStack[intStackOffset++]
			= Class375.aBoolean4540 ? 1 : 0;
		    return;
		}
		if (i == 3342) {
		    intStack[intStackOffset++]
			= Class258_Sub4.mouseMovementListener.method3597(true);
		    return;
		}
		if (i == 3343) {
		    intStack[intStackOffset++]
			= Class258_Sub4.mouseMovementListener.method3594((byte) 127);
		    return;
		}
		if (i == 3344) {
		    strStack[anInt1170++]
			= ArchiveLoader.method2347((byte) -119);
		    return;
		}
		if (i == 3345) {
		    strStack[anInt1170++]
			= Class10.method217((byte) 112);
		    return;
		}
		if (i == 3346) {
		    intStack[intStackOffset++]
			= Class318_Sub1_Sub5_Sub1.method2489((byte) -106);
		    return;
		}
		if (i == 3347) {
		    intStack[intStackOffset++] = Class337.anInt4179;
		    return;
		}
		if (i == 3349) {
		    intStack[intStackOffset++]
			= ((Class318_Sub1_Sub3_Sub3)
			   Class132.localPlayer)
			      .aClass264_10217.method2019((byte) -31) >> 3;
		    return;
		}
	    } else if (i < 3500) {
		if (i == 3400) {
		    intStackOffset -= 2;
		    int i_348_ = intStack[intStackOffset];
		    int i_349_ = intStack[intStackOffset + 1];
		    Class117 class117
			= Class348_Sub7.aClass33_6653.method337(true, i_348_);
		    strStack[anInt1170++]
			= class117.method1074(i_349_, 124);
		    return;
		}
		if (i == 3408) {
		    intStackOffset -= 4;
		    int i_350_ = intStack[intStackOffset];
		    int i_351_ = intStack[intStackOffset + 1];
		    int i_352_ = intStack[intStackOffset + 2];
		    int i_353_ = intStack[intStackOffset + 3];
		    Class117 class117 = Class348_Sub7.aClass33_6653.method337(true, i_352_);
		    if (((Class117) class117).aChar1778 != i_350_
			|| ((Class117) class117).aChar1779 != i_351_)
			throw new RuntimeException("C3408-1 " + i_352_ + "-"
						   + i_353_);
		    if (i_351_ == 115)
			strStack[anInt1170++]
			    = class117.method1074(i_353_, 119);
		    else {
			intStack[intStackOffset++]
			    = class117.method1073(false, i_353_);
			return;
		    }
		    return;
		}
		if (i == 3409) {
		    intStackOffset -= 3;
		    int i_354_ = intStack[intStackOffset];
		    int i_355_ = intStack[intStackOffset + 1];
		    int i_356_ = intStack[intStackOffset + 2];
		    if (i_355_ == -1)
			throw new RuntimeException("C3409-2");
		    Class117 class117
			= Class348_Sub7.aClass33_6653.method337(true, i_355_);
		    if (((Class117) class117).aChar1779 != i_354_)
			throw new RuntimeException("C3409-1");
		    intStack[intStackOffset++]
			= class117.method1067(true, i_356_) ? 1 : 0;
		    return;
		}
		if (i == 3410) {
		    int i_357_ = intStack[--intStackOffset];
		    String string = strStack[--anInt1170];
		    if (i_357_ == -1)
			throw new RuntimeException("C3410-2");
		    Class117 class117
			= Class348_Sub7.aClass33_6653.method337(true, i_357_);
		    if (((Class117) class117).aChar1779 != 's')
			throw new RuntimeException("C3410-1");
		    intStack[intStackOffset++]
			= class117.method1066(false, string) ? 1 : 0;
		    return;
		}
		if (i == 3411) {
		    int i_358_ = intStack[--intStackOffset];
		    Class117 class117
			= Class348_Sub7.aClass33_6653.method337(true, i_358_);
		    intStack[intStackOffset++]
			= ((Class117) class117).aClass356_1767.method3474(1);
		    return;
		}
	    } else if (i < 3700) {
		if (i == 3600) {
		    if (Class125.anInt4930 == 0)
			intStack[intStackOffset++] = -2;
		    else {
			if (Class125.anInt4930 == 1)
			    intStack[intStackOffset++] = -1;
			else {
			    intStack[intStackOffset++]
				= Class348_Sub40_Sub30.anInt9383;
			    return;
			}
			return;
		    }
		    return;
		}
		if (i == 3601) {
		    int i_359_ = intStack[--intStackOffset];
		    if (Class125.anInt4930 == 2
			&& i_359_ < Class348_Sub40_Sub30.anInt9383) {
			strStack[anInt1170++]
			    = Class83.aStringArray1441[i_359_];
			if (Class286_Sub2.aStringArray6205[i_359_] != null)
			    strStack[anInt1170++]
				= Class286_Sub2.aStringArray6205[i_359_];
			else
			    strStack[anInt1170++] = "";
		    } else {
			strStack[anInt1170++] = "";
			strStack[anInt1170++] = "";
			return;
		    }
		    return;
		}
		if (i == 3602) {
		    int i_360_ = intStack[--intStackOffset];
		    if (Class125.anInt4930 == 2
			&& i_360_ < Class348_Sub40_Sub30.anInt9383)
			intStack[intStackOffset++]
			    = AbstractToolkit.anIntArray4578[i_360_];
		    else {
			intStack[intStackOffset++] = 0;
			return;
		    }
		    return;
		}
		if (i == 3603) {
		    int i_361_ = intStack[--intStackOffset];
		    if (Class125.anInt4930 == 2
			&& i_361_ < Class348_Sub40_Sub30.anInt9383)
			intStack[intStackOffset++]
			    = Class172.anIntArray2280[i_361_];
		    else {
			intStack[intStackOffset++] = 0;
			return;
		    }
		    return;
		}
		if (i == 3604) {
		    String string = strStack[--anInt1170];
		    int i_362_ = intStack[--intStackOffset];
		    Class261.method1982(16, i_362_, string);
		    return;
		}
		if (i == 3605) {
		    String string = strStack[--anInt1170];
		    Class348_Sub40_Sub30.method3128(-81, string);
		    return;
		}
		if (i == 3606) {
		    String string = strStack[--anInt1170];
		    Class286_Sub7.method2165(true, string);
		    return;
		}
		if (i == 3607) {
		    String string = strStack[--anInt1170];
		    Class27.method317(string, 117, false);
		    return;
		}
		if (i == 3608) {
		    String string = strStack[--anInt1170];
		    Class367_Sub2.method3538(true, string);
		    return;
		}
		if (i == 3609) {
		    String string = strStack[--anInt1170];
		    if (string.startsWith("<img=0>")
			|| string.startsWith("<img=1>"))
			string = string.substring(7);
		    intStack[intStackOffset++]
			= (KeyboardEventNode.method2797(string, (byte) -63) ? 1
			   : 0);
		    return;
		}
		if (i == 3610) {
		    int i_363_ = intStack[--intStackOffset];
		    if (Class125.anInt4930 == 2
			&& i_363_ < Class348_Sub40_Sub30.anInt9383)
			strStack[anInt1170++]
			    = Class285.aStringArray4744[i_363_];
		    else {
			strStack[anInt1170++] = "";
			return;
		    }
		    return;
		}
		if (i == 3611) {
		    if (Class50.aString863 != null)
			strStack[anInt1170++]
			    = Class157.method1245(Class50.aString863, false);
		    else {
			strStack[anInt1170++] = "";
			return;
		    }
		    return;
		}
		if (i == 3612) {
		    if (Class50.aString863 != null)
			intStack[intStackOffset++] = Class37.anInt496;
		    else {
			intStack[intStackOffset++] = 0;
			return;
		    }
		    return;
		}
		if (i == 3613) {
		    int i_364_ = intStack[--intStackOffset];
		    if (Class50.aString863 != null
			&& i_364_ < Class37.anInt496)
			strStack[anInt1170++]
			    = (((Class19) Class169.aClass19Array2261[i_364_])
			       .aString314);
		    else {
			strStack[anInt1170++] = "";
			return;
		    }
		    return;
		}
		if (i == 3614) {
		    int i_365_ = intStack[--intStackOffset];
		    if (Class50.aString863 != null
			&& i_365_ < Class37.anInt496)
			intStack[intStackOffset++]
			    = (((Class19) Class169.aClass19Array2261[i_365_])
			       .anInt308);
		    else {
			intStack[intStackOffset++] = 0;
			return;
		    }
		    return;
		}
		if (i == 3615) {
		    int i_366_ = intStack[--intStackOffset];
		    if (Class50.aString863 != null
			&& i_366_ < Class37.anInt496)
			intStack[intStackOffset++]
			    = (((Class19) Class169.aClass19Array2261[i_366_])
			       .aByte310);
		    else {
			intStack[intStackOffset++] = 0;
			return;
		    }
		    return;
		}
		if (i == 3616) {
		    intStack[intStackOffset++] = Class219.aByte2871;
		    return;
		}
		if (i == 3617) {
		    String string = strStack[--anInt1170];
		    Class306.method2298((byte) -117, string);
		    return;
		}
		if (i == 3618) {
		    intStack[intStackOffset++] = Class119_Sub1.aByte4702;
		    return;
		}
		if (i == 3619) {
		    String string = strStack[--anInt1170];
		    Class318_Sub1_Sub1_Sub1.method2399(string, -117);
		    return;
		}
		if (i == 3620) {
		    Class242.method1867(77);
		    return;
		}
		if (i == 3621) {
		    if (Class125.anInt4930 == 0)
			intStack[intStackOffset++] = -1;
		    else {
			intStack[intStackOffset++]
			    = Class348_Sub42_Sub12.anInt9604;
			return;
		    }
		    return;
		}
		if (i == 3622) {
		    int i_367_ = intStack[--intStackOffset];
		    if (Class125.anInt4930 != 0
			&& i_367_ < Class348_Sub42_Sub12.anInt9604) {
			strStack[anInt1170++]
			    = ObjectDefinition.aStringArray932[i_367_];
			if (Class348_Sub40_Sub21.aStringArray9275[i_367_]
			    != null)
			    strStack[anInt1170++]
				= (Class348_Sub40_Sub21.aStringArray9275
				   [i_367_]);
			else
			    strStack[anInt1170++] = "";
		    } else {
			strStack[anInt1170++] = "";
			strStack[anInt1170++] = "";
			return;
		    }
		    return;
		}
		if (i == 3623) {
		    String string = strStack[--anInt1170];
		    if (string.startsWith("<img=0>")
			|| string.startsWith("<img=1>"))
			string = string.substring(7);
		    intStack[intStackOffset++]
			= OutgoingPacket.method3455(string, 28280) ? 1 : 0;
		    return;
		}
		if (i == 3624) {
		    int i_368_ = intStack[--intStackOffset];
		    if (Class169.aClass19Array2261 != null
			&& i_368_ < Class37.anInt496
			&& (((Class19) Class169.aClass19Array2261[i_368_])
				.aString306.equalsIgnoreCase
			    (((Player)
			      Class132.localPlayer)
			     .aString10544)))
			intStack[intStackOffset++] = 1;
		    else {
			intStack[intStackOffset++] = 0;
			return;
		    }
		    return;
		}
		if (i == 3625) {
		    if (Class348_Sub21.aString6854 != null)
			strStack[anInt1170++]
			    = Class348_Sub21.aString6854;
		    else {
			strStack[anInt1170++] = "";
			return;
		    }
		    return;
		}
		if (i == 3626) {
		    int i_369_ = intStack[--intStackOffset];
		    if (Class50.aString863 != null
			&& i_369_ < Class37.anInt496)
			strStack[anInt1170++]
			    = (((Class19) Class169.aClass19Array2261[i_369_])
			       .aString313);
		    else {
			strStack[anInt1170++] = "";
			return;
		    }
		    return;
		}
		if (i == 3627) {
		    int i_370_ = intStack[--intStackOffset];
		    if (Class125.anInt4930 == 2 && i_370_ >= 0
			&& i_370_ < Class348_Sub40_Sub30.anInt9383)
			intStack[intStackOffset++]
			    = Class122.aBooleanArray1806[i_370_] ? 1 : 0;
		    else {
			intStack[intStackOffset++] = 0;
			return;
		    }
		    return;
		}
		if (i == 3628) {
		    String string = strStack[--anInt1170];
		    if (string.startsWith("<img=0>")
			|| string.startsWith("<img=1>"))
			string = string.substring(7);
		    intStack[intStackOffset++]
			= Class300.method2274(string, -91);
		    return;
		}
		if (i == 3629) {
		    intStack[intStackOffset++] = AbstractToolkit.anInt4583;
		    return;
		}
		if (i == 3630) {
		    String string = strStack[--anInt1170];
		    Class27.method317(string, 119, true);
		    return;
		}
		if (i == 3631) {
		    int i_371_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= Class367_Sub3.aBooleanArray7304[i_371_] ? 1 : 0;
		    return;
		}
		if (i == 3632) {
		    int i_372_ = intStack[--intStackOffset];
		    if (Class50.aString863 != null
			&& i_372_ < Class37.anInt496)
			strStack[anInt1170++]
			    = (((Class19) Class169.aClass19Array2261[i_372_])
			       .aString306);
		    else {
			strStack[anInt1170++] = "";
			return;
		    }
		    return;
		}
		if (i == 3633) {
		    int i_373_ = intStack[--intStackOffset];
		    if (Class125.anInt4930 != 0
			&& i_373_ < Class348_Sub42_Sub12.anInt9604)
			strStack[anInt1170++]
			    = Class122.aStringArray1808[i_373_];
		    else {
			strStack[anInt1170++] = "";
			return;
		    }
		    return;
		}
	    } else if (i < 4000) {
		if (i == 3903) {
		    int i_374_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= Class239_Sub26.aClass54Array6114[i_374_]
			      .method499(21110);
		    return;
		}
		if (i == 3904) {
		    int i_375_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= (((Class54) Class239_Sub26.aClass54Array6114[i_375_])
			   .anInt969);
		    return;
		}
		if (i == 3905) {
		    int i_376_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= (((Class54) Class239_Sub26.aClass54Array6114[i_376_])
			   .anInt976);
		    return;
		}
		if (i == 3906) {
		    int i_377_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= (((Class54) Class239_Sub26.aClass54Array6114[i_377_])
			   .anInt967);
		    return;
		}
		if (i == 3907) {
		    int i_378_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= (((Class54) Class239_Sub26.aClass54Array6114[i_378_])
			   .anInt977);
		    return;
		}
		if (i == 3908) {
		    int i_379_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= (((Class54) Class239_Sub26.aClass54Array6114[i_379_])
			   .anInt973);
		    return;
		}
		if (i == 3910) {
		    int i_380_ = intStack[--intStackOffset];
		    int i_381_ = Class239_Sub26.aClass54Array6114[i_380_]
				     .method502((byte) 100);
		    intStack[intStackOffset++] = i_381_ == 0 ? 1 : 0;
		    return;
		}
		if (i == 3911) {
		    int i_382_ = intStack[--intStackOffset];
		    int i_383_ = Class239_Sub26.aClass54Array6114[i_382_]
				     .method502((byte) 118);
		    intStack[intStackOffset++] = i_383_ == 2 ? 1 : 0;
		    return;
		}
		if (i == 3912) {
		    int i_384_ = intStack[--intStackOffset];
		    int i_385_ = Class239_Sub26.aClass54Array6114[i_384_]
				     .method502((byte) -100);
		    intStack[intStackOffset++] = i_385_ == 5 ? 1 : 0;
		    return;
		}
		if (i == 3913) {
		    int i_386_ = intStack[--intStackOffset];
		    int i_387_ = Class239_Sub26.aClass54Array6114[i_386_]
				     .method502((byte) 55);
		    intStack[intStackOffset++] = i_387_ == 1 ? 1 : 0;
		    return;
		}
	    } else if (i < 4100) {
		if (i == 4000) {
		    intStackOffset -= 2;
		    int i_388_ = intStack[intStackOffset];
		    int i_389_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++] = i_388_ + i_389_;
		    return;
		}
		if (i == 4001) {
		    intStackOffset -= 2;
		    int i_390_ = intStack[intStackOffset];
		    int i_391_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++] = i_390_ - i_391_;
		    return;
		}
		if (i == 4002) {
		    intStackOffset -= 2;
		    int i_392_ = intStack[intStackOffset];
		    int i_393_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++] = i_392_ * i_393_;
		    return;
		}
		if (i == 4003) {
		    intStackOffset -= 2;
		    int i_394_ = intStack[intStackOffset];
		    int i_395_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++] = i_394_ / i_395_;
		    return;
		}
		if (i == 4004) {
		    int i_396_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= (int) (Math.random() * (double) i_396_);
		    return;
		}
		if (i == 4005) {
		    int i_397_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= (int) (Math.random() * (double) (i_397_ + 1));
		    return;
		}
		if (i == 4006) {
		    intStackOffset -= 5;
		    int i_398_ = intStack[intStackOffset];
		    int i_399_ = intStack[intStackOffset + 1];
		    int i_400_ = intStack[intStackOffset + 2];
		    int i_401_ = intStack[intStackOffset + 3];
		    int i_402_ = intStack[intStackOffset + 4];
		    intStack[intStackOffset++]
			= i_398_ + ((i_399_ - i_398_) * (i_402_ - i_400_)
				    / (i_401_ - i_400_));
		    return;
		}
		if (i == 4007) {
		    intStackOffset -= 2;
		    long l = (long) intStack[intStackOffset];
		    long l_403_ = (long) intStack[intStackOffset + 1];
		    intStack[intStackOffset++]
			= (int) (l + l * l_403_ / 100L);
		    return;
		}
		if (i == 4008) {
		    intStackOffset -= 2;
		    int i_404_ = intStack[intStackOffset];
		    int i_405_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++] = i_404_ | 1 << i_405_;
		    return;
		}
		if (i == 4009) {
		    intStackOffset -= 2;
		    int i_406_ = intStack[intStackOffset];
		    int i_407_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++] = i_406_ & -1 - (1 << i_407_);
		    return;
		}
		if (i == 4010) {
		    intStackOffset -= 2;
		    int i_408_ = intStack[intStackOffset];
		    int i_409_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++]
			= (i_408_ & 1 << i_409_) != 0 ? 1 : 0;
		    return;
		}
		if (i == 4011) {
		    intStackOffset -= 2;
		    int i_410_ = intStack[intStackOffset];
		    int i_411_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++] = i_410_ % i_411_;
		    return;
		}
		if (i == 4012) {
		    intStackOffset -= 2;
		    int i_412_ = intStack[intStackOffset];
		    int i_413_ = intStack[intStackOffset + 1];
		    if (i_412_ == 0)
			intStack[intStackOffset++] = 0;
		    else {
			intStack[intStackOffset++]
			    = (int) Math.pow((double) i_412_, (double) i_413_);
			return;
		    }
		    return;
		}
		if (i == 4013) {
		    intStackOffset -= 2;
		    int i_414_ = intStack[intStackOffset];
		    int i_415_ = intStack[intStackOffset + 1];
		    if (i_414_ == 0)
			intStack[intStackOffset++] = 0;
		    else {
			if (i_415_ == 0)
			    intStack[intStackOffset++] = 2147483647;
			else {
			    intStack[intStackOffset++]
				= (int) Math.pow((double) i_414_,
						 1.0 / (double) i_415_);
			    return;
			}
			return;
		    }
		    return;
		}
		if (i == 4014) {
		    intStackOffset -= 2;
		    int i_416_ = intStack[intStackOffset];
		    int i_417_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++] = i_416_ & i_417_;
		    return;
		}
		if (i == 4015) {
		    intStackOffset -= 2;
		    int i_418_ = intStack[intStackOffset];
		    int i_419_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++] = i_418_ | i_419_;
		    return;
		}
		if (i == 4016) {
		    intStackOffset -= 2;
		    int i_420_ = intStack[intStackOffset];
		    int i_421_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++]
			= i_420_ < i_421_ ? i_420_ : i_421_;
		    return;
		}
		if (i == 4017) {
		    intStackOffset -= 2;
		    int i_422_ = intStack[intStackOffset];
		    int i_423_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++]
			= i_422_ > i_423_ ? i_422_ : i_423_;
		    return;
		}
		if (i == 4018) {
		    intStackOffset -= 3;
		    long l = (long) intStack[intStackOffset];
		    long l_424_ = (long) intStack[intStackOffset + 1];
		    long l_425_ = (long) intStack[intStackOffset + 2];
		    intStack[intStackOffset++] = (int) (l * l_425_ / l_424_);
		    return;
		}
		if (i == 4019) {
		    intStackOffset -= 2;
		    int i_426_ = intStack[intStackOffset];
		    int i_427_ = intStack[intStackOffset + 1];
		    if (i_426_ > 700 || i_427_ > 700)
			intStack[intStackOffset++] = 256;
		    double d = ((Math.random() * (double) (i_427_ + i_426_)
				 - (double) i_426_ + 800.0)
				/ 100.0);
		    intStack[intStackOffset++]
			= (int) (Math.pow(2.0, d) + 0.5);
		    return;
		}
	    } else if (i < 4200) {
		if (i == 4100) {
		    String string = strStack[--anInt1170];
		    int i_428_ = intStack[--intStackOffset];
		    strStack[anInt1170++] = string + i_428_;
		    return;
		}
		if (i == 4101) {
		    anInt1170 -= 2;
		    String string = strStack[anInt1170];
		    String string_429_ = strStack[anInt1170 + 1];
		    strStack[anInt1170++] = string + string_429_;
		    return;
		}
		if (i == 4102) {
		    String string = strStack[--anInt1170];
		    int i_430_ = intStack[--intStackOffset];
		    strStack[anInt1170++]
			= string + Class140.method1171(i_430_, 76, true);
		    return;
		}
		if (i == 4103) {
		    String string = strStack[--anInt1170];
		    strStack[anInt1170++] = string.toLowerCase();
		    return;
		}
		if (i == 4104) {
		    strStack[anInt1170++]
			= method709(intStack[--intStackOffset]);
		    return;
		}
		if (i == 4105) {
		    anInt1170 -= 2;
		    String string = strStack[anInt1170];
		    String string_431_ = strStack[anInt1170 + 1];
		    if ((((Player)
			  Class132.localPlayer)
			 .aClass154_10536) != null
			&& ((Class154)
			    (((Player)
			      Class132.localPlayer)
			     .aClass154_10536)).aBoolean2100)
			strStack[anInt1170++] = string_431_;
		    else {
			strStack[anInt1170++] = string;
			return;
		    }
		    return;
		}
		if (i == 4106) {
		    int i_432_ = intStack[--intStackOffset];
		    strStack[anInt1170++] = Integer.toString(i_432_);
		    return;
		}
		if (i == 4107) {
		    anInt1170 -= 2;
		    intStack[intStackOffset++]
			= Class239_Sub21.method1811(9152,
						    (strStack
						     [anInt1170 + 1]),
						    Class348_Sub33.gameLanguage,
						    (strStack
						     [anInt1170]));
		    return;
		}
		if (i == 4108) {
		    String string = strStack[--anInt1170];
		    intStackOffset -= 2;
		    int i_433_ = intStack[intStackOffset];
		    int i_434_ = intStack[intStackOffset + 1];
		    BitmapFont class143
			= Class239_Sub23.method1819(i_434_, 0, -123,
						    Class104.indexLoader13);
		    intStack[intStackOffset++]
			= class143.method1190(Class113.rasterToolkits, 1,
					      string, i_433_);
		    return;
		}
		if (i == 4109) {
		    String string = strStack[--anInt1170];
		    intStackOffset -= 2;
		    int i_435_ = intStack[intStackOffset];
		    int i_436_ = intStack[intStackOffset + 1];
		    BitmapFont class143
			= Class239_Sub23.method1819(i_436_, 0, -79,
						    Class104.indexLoader13);
		    intStack[intStackOffset++]
			= class143.method1187(string, false, i_435_,
					      Class113.rasterToolkits);
		    return;
		}
		if (i == 4110) {
		    anInt1170 -= 2;
		    String string = strStack[anInt1170];
		    String string_437_ = strStack[anInt1170 + 1];
		    if (intStack[--intStackOffset] == 1)
			strStack[anInt1170++] = string;
		    else {
			strStack[anInt1170++] = string_437_;
			return;
		    }
		    return;
		}
		if (i == 4111) {
		    String string = strStack[--anInt1170];
		    strStack[anInt1170++]
			= Class59_Sub2_Sub2.method572(string, 23034);
		    return;
		}
		if (i == 4112) {
		    String string = strStack[--anInt1170];
		    int i_438_ = intStack[--intStackOffset];
		    if (i_438_ == -1)
			throw new RuntimeException("null char");
		    strStack[anInt1170++] = string + (char) i_438_;
		    return;
		}
		if (i == 4113) {
		    int i_439_ = intStack[--intStackOffset];
		    intStack[intStackOffset++] = method708((char) i_439_);
		    return;
		}
		if (i == 4114) {
		    int i_440_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= Npc
			      .method2446((char) i_440_, (byte) 105) ? 1 : 0;
		    return;
		}
		if (i == 4115) {
		    int i_441_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= Class215.method1581(-93, (char) i_441_) ? 1 : 0;
		    return;
		}
		if (i == 4116) {
		    int i_442_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= Class334.method2647(true, (char) i_442_) ? 1 : 0;
		    return;
		}
		if (i == 4117) {
		    String string = strStack[--anInt1170];
		    if (string != null)
			intStack[intStackOffset++] = string.length();
		    else {
			intStack[intStackOffset++] = 0;
			return;
		    }
		    return;
		}
		if (i == 4118) {
		    String string = strStack[--anInt1170];
		    intStackOffset -= 2;
		    int i_443_ = intStack[intStackOffset];
		    int i_444_ = intStack[intStackOffset + 1];
		    strStack[anInt1170++]
			= string.substring(i_443_, i_444_);
		    return;
		}
		if (i == 4119) {
		    String string = strStack[--anInt1170];
		    StringBuffer stringbuffer
			= new StringBuffer(string.length());
		    boolean bool_445_ = false;
		    for (int i_446_ = 0; i_446_ < string.length(); i_446_++) {
			char c = string.charAt(i_446_);
			if (c == '<')
			    bool_445_ = true;
			else if (c == '>')
			    bool_445_ = false;
			else if (!bool_445_)
			    stringbuffer.append(c);
		    }
		    strStack[anInt1170++] = stringbuffer.toString();
		    return;
		}
		if (i == 4120) {
		    String string = strStack[--anInt1170];
		    intStackOffset -= 2;
		    int i_447_ = intStack[intStackOffset];
		    int i_448_ = intStack[intStackOffset + 1];
		    intStack[intStackOffset++]
			= string.indexOf(i_447_, i_448_);
		    return;
		}
		if (i == 4121) {
		    anInt1170 -= 2;
		    String string = strStack[anInt1170];
		    String string_449_ = strStack[anInt1170 + 1];
		    int i_450_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= string.indexOf(string_449_, i_450_);
		    return;
		}
		if (i == 4122) {
		    int i_451_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= Character.toLowerCase((char) i_451_);
		    return;
		}
		if (i == 4123) {
		    int i_452_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= Character.toUpperCase((char) i_452_);
		    return;
		}
		if (i == 4124) {
		    boolean bool_453_ = intStack[--intStackOffset] != 0;
		    int i_454_ = intStack[--intStackOffset];
		    strStack[anInt1170++]
			= Class357.method3486(0, bool_453_,
					      Class348_Sub33.gameLanguage,
					      (long) i_454_, 16980);
		    return;
		}
		if (i == 4125) {
		    String string = strStack[--anInt1170];
		    int i_455_ = intStack[--intStackOffset];
		    BitmapFont class143
			= Class239_Sub23.method1819(i_455_, 0, -114,
						    Class104.indexLoader13);
		    intStack[intStackOffset++]
			= class143.method1186(string,
					      Class113.rasterToolkits,
					      false);
		    return;
		}
	    } else if (i < 4300) {
		if (i == 4200) {
		    int i_456_ = intStack[--intStackOffset];
		    strStack[anInt1170++]
			= (((ItemDefinition) ToolkitException.itemLoader
					   .getItemDefinition(-52, i_456_))
			   .aString2795);
		    return;
		}
		if (i == 4201) {
		    intStackOffset -= 2;
		    int i_457_ = intStack[intStackOffset];
		    int i_458_ = intStack[intStackOffset + 1];
		    ItemDefinition class213
			= ToolkitException.itemLoader.getItemDefinition(-79, i_457_);
		    if (i_458_ >= 1 && i_458_ <= 5
			&& (((ItemDefinition) class213).aStringArray2811[i_458_ - 1]
			    != null))
			strStack[anInt1170++]
			    = (((ItemDefinition) class213).aStringArray2811
			       [i_458_ - 1]);
		    else {
			strStack[anInt1170++] = "";
			return;
		    }
		    return;
		}
		if (i == 4202) {
		    intStackOffset -= 2;
		    int i_459_ = intStack[intStackOffset];
		    int i_460_ = intStack[intStackOffset + 1];
		    ItemDefinition class213
			= ToolkitException.itemLoader.getItemDefinition(112, i_459_);
		    if (i_460_ >= 1 && i_460_ <= 5
			&& (((ItemDefinition) class213).aStringArray2763[i_460_ - 1]
			    != null))
			strStack[anInt1170++]
			    = (((ItemDefinition) class213).aStringArray2763
			       [i_460_ - 1]);
		    else {
			strStack[anInt1170++] = "";
			return;
		    }
		    return;
		}
		if (i == 4203) {
		    int i_461_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= ((ItemDefinition) ToolkitException.itemLoader
					  .getItemDefinition(-52, i_461_)).anInt2819;
		    return;
		}
		if (i == 4204) {
		    int i_462_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= (((ItemDefinition) ToolkitException.itemLoader
					   .getItemDefinition(82, i_462_)).anInt2820
			   == 1) ? 1 : 0;
		    return;
		}
		if (i == 4205) {
		    int i_463_ = intStack[--intStackOffset];
		    ItemDefinition class213
			= ToolkitException.itemLoader.getItemDefinition(80, i_463_);
		    if (((ItemDefinition) class213).anInt2833 == -1
			&& ((ItemDefinition) class213).anInt2758 >= 0)
			intStack[intStackOffset++]
			    = ((ItemDefinition) class213).anInt2758;
		    else {
			intStack[intStackOffset++] = i_463_;
			return;
		    }
		    return;
		}
		if (i == 4206) {
		    int i_464_ = intStack[--intStackOffset];
		    ItemDefinition class213
			= ToolkitException.itemLoader.getItemDefinition(-56, i_464_);
		    if (((ItemDefinition) class213).anInt2833 >= 0
			&& ((ItemDefinition) class213).anInt2758 >= 0)
			intStack[intStackOffset++]
			    = ((ItemDefinition) class213).anInt2758;
		    else {
			intStack[intStackOffset++] = i_464_;
			return;
		    }
		    return;
		}
		if (i == 4207) {
		    int i_465_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= (((ItemDefinition) ToolkitException.itemLoader
					   .getItemDefinition(87, i_465_))
			   .aBoolean2783) ? 1 : 0;
		    return;
		}
		if (i == 4208) {
		    intStackOffset -= 2;
		    int i_466_ = intStack[intStackOffset];
		    int i_467_ = intStack[intStackOffset + 1];
		    Class254 class254
			= Class101_Sub3.aClass326_5764.method2600(i_467_,
								  28364);
		    if (class254.method1925(false))
			strStack[anInt1170++]
			    = (ToolkitException.itemLoader.getItemDefinition
				   (-96, i_466_).method1561
			       (((Class254) class254).aString3258, i_467_,
				-1511086397));
		    else {
			intStack[intStackOffset++]
			    = (ToolkitException.itemLoader.getItemDefinition
				   (-82, i_466_).method1567
			       (((Class254) class254).anInt3256, -106,
				i_467_));
			return;
		    }
		    return;
		}
		if (i == 4209) {
		    intStackOffset -= 2;
		    int i_468_ = intStack[intStackOffset];
		    int i_469_ = intStack[intStackOffset + 1] - 1;
		    ItemDefinition class213
			= ToolkitException.itemLoader.getItemDefinition(108, i_468_);
		    if (((ItemDefinition) class213).anInt2766 == i_469_)
			intStack[intStackOffset++]
			    = ((ItemDefinition) class213).anInt2818;
		    else {
			if (((ItemDefinition) class213).anInt2774 == i_469_)
			    intStack[intStackOffset++]
				= ((ItemDefinition) class213).anInt2817;
			else {
			    intStack[intStackOffset++] = -1;
			    return;
			}
			return;
		    }
		    return;
		}
		if (i == 4210) {
		    String string = strStack[--anInt1170];
		    int i_470_ = intStack[--intStackOffset];
		    Class217.method1586(i_470_ == 1, (byte) -108, string);
		    intStack[intStackOffset++] = Class76.anInt1285;
		    return;
		}
		if (i == 4211) {
		    if (Class192.aShortArray2579 == null
			|| Class148.anInt2037 >= Class76.anInt1285)
			intStack[intStackOffset++] = -1;
		    else {
			intStack[intStackOffset++]
			    = (Class192.aShortArray2579[Class148.anInt2037++]
			       & 0xffff);
			return;
		    }
		    return;
		}
		if (i == 4212) {
		    Class148.anInt2037 = 0;
		    return;
		}
		if (i == 4213) {
		    int i_471_ = intStack[--intStackOffset];
		    intStack[intStackOffset++]
			= ((ItemDefinition) ToolkitException.itemLoader
					  .getItemDefinition(-115, i_471_)).anInt2802;
		    return;
		}
		if (i == 4214) {
		    String string = strStack[--anInt1170];
		    intStackOffset -= 3;
		    int i_472_ = intStack[intStackOffset];
		    int i_473_ = intStack[intStackOffset + 1];
		    int i_474_ = intStack[intStackOffset + 2];
		    Class16.method259(i_474_, -125, i_472_ == 1, string,
				      i_473_);
		    intStack[intStackOffset++] = Class76.anInt1285;
		    return;
		}
		if (i == 4215) {
		    anInt1170 -= 2;
		    intStackOffset -= 2;
		    String string = strStack[anInt1170];
		    int i_475_ = intStack[intStackOffset];
		    int i_476_ = intStack[intStackOffset + 1];
		    String string_477_ = strStack[anInt1170 + 1];
		    Class239_Sub1.method1719(i_475_ == 1, string, string_477_,
					     i_476_, -1);
		    intStack[intStackOffset++] = Class76.anInt1285;
		    return;
		}
	    } else if (i < 4400) {
		if (i == 4300) {
		    intStackOffset -= 2;
		    int i_478_ = intStack[intStackOffset];
		    int i_479_ = intStack[intStackOffset + 1];
		    Class254 class254
			= Class101_Sub3.aClass326_5764.method2600(i_479_,
								  28364);
		    if (class254.method1925(false))
			strStack[anInt1170++]
			    = (Class189.npcLoader.getNpcDefinition
				   (i_478_, -1).method801
			       ((byte) 17, i_479_,
				((Class254) class254).aString3258));
		    else {
			intStack[intStackOffset++]
			    = (Class189.npcLoader.getNpcDefinition
				   (i_478_, -1).method805
			       (((Class254) class254).anInt3256, i_479_, 48));
			return;
		    }
		    return;
		}
	    } else if (i < 4500) {
		if (i == 4400) {
		    intStackOffset -= 2;
		    int i_480_ = intStack[intStackOffset];
		    int i_481_ = intStack[intStackOffset + 1];
		    Class254 class254
			= Class101_Sub3.aClass326_5764.method2600(i_481_,
								  28364);
		    if (class254.method1925(false))
			strStack[anInt1170++]
			    = (Class348_Sub40_Sub12.objectLoader.getObject
				   (0, i_480_).method475
			       (((Class254) class254).aString3258, i_481_,
				-16));
		    else {
			intStack[intStackOffset++]
			    = (Class348_Sub40_Sub12.objectLoader.getObject
				   (0, i_480_).method487
			       (i_481_, ((Class254) class254).anInt3256, 81));
			return;
		    }
		    return;
		}
	    } else if (i < 4600) {
		if (i == 4500) {
		    intStackOffset -= 2;
		    int i_482_ = intStack[intStackOffset];
		    int i_483_ = intStack[intStackOffset + 1];
		    Class254 class254
			= Class101_Sub3.aClass326_5764.method2600(i_483_,
								  28364);
		    if (class254.method1925(false))
			strStack[anInt1170++]
			    = (EntryElementLoader.aClass65_4787.method700
				   (i_482_, -121).method3170
			       (-250, ((Class254) class254).aString3258,
				i_483_));
		    else {
			intStack[intStackOffset++]
			    = (EntryElementLoader.aClass65_4787.method700(i_482_, 81)
				   .method3166
			       (i_483_, ((Class254) class254).anInt3256,
				(byte) 124));
			return;
		    }
		    return;
		}
	    } else if (i < 4700 && i == 4600) {
		int i_484_ = intStack[--intStackOffset];
		Class225 class225
		    = Class64_Sub3.aClass261_5558.method1983(i_484_, 32);
		if (((Class225) class225).anIntArray2915 != null
		    && ((Class225) class225).anIntArray2915.length > 0) {
		    int i_485_ = 0;
		    int i_486_ = ((Class225) class225).anIntArray2929[0];
		    for (int i_487_ = 1;
			 i_487_ < ((Class225) class225).anIntArray2915.length;
			 i_487_++) {
			if (((Class225) class225).anIntArray2929[i_487_]
			    > i_486_) {
			    i_485_ = i_487_;
			    i_486_
				= ((Class225) class225).anIntArray2929[i_487_];
			}
		    }
		    intStack[intStackOffset++]
			= ((Class225) class225).anIntArray2915[i_485_];
		} else {
		    intStack[intStackOffset++]
			= ((Class225) class225).anInt2918;
		    return;
		}
		return;
	    }
	}
	throw new IllegalStateException(String.valueOf(i));
    }
    
    private static final void method711
	(ClientScript script, int i) {
	intStackOffset = 0;
	anInt1170 = 0;
	int position = -1;
	int[] opcodes
	    = ((ClientScript) script).anIntArray9696;
	int[] intOperands = ((ClientScript) script).anIntArray9694;
	int opcode = -1;
	anInt1154 = 0;
	try {
	    int i_491_ = 0;
	    for (;;) {
		if (++i_491_ > i)
		    throw new RuntimeException("slow");
		opcode = opcodes[++position];
		if (opcode < 100) {
		    if (opcode == 0)
			intStack[intStackOffset++] = intOperands[position];
		    else if (opcode == 1) {
			int setting = intOperands[position];
			intStack[intStackOffset++] = (((VarbitHandler) Class318_Sub1_Sub3_Sub3.varbitHandler).configs[setting]);
		    } else if (opcode == 2) {
			int i_493_ = intOperands[position];
			Class318_Sub1_Sub3_Sub3.varbitHandler.putConfig(i_493_, intStack[--intStackOffset]);
		    } else if (opcode == 3)
			strStack[anInt1170++] = (((ClientScript) script).strOperands[position]);
		    else if (opcode == 6)
			position += intOperands[position];
		    else if (opcode == 7) {
			intStackOffset -= 2;
			if (intStack[intStackOffset] != intStack[intStackOffset + 1])
			    position += intOperands[position];
		    } else if (opcode == 8) {
			intStackOffset -= 2;
			if (intStack[intStackOffset]
			    == intStack[intStackOffset + 1])
			    position += intOperands[position];
		    } else if (opcode == 9) {
			intStackOffset -= 2;
			if (intStack[intStackOffset]
			    < intStack[intStackOffset + 1])
			    position += intOperands[position];
		    } else if (opcode == 10) {
			intStackOffset -= 2;
			if (intStack[intStackOffset]
			    > intStack[intStackOffset + 1])
			    position += intOperands[position];
		    } else if (opcode == 21) {
			if (anInt1154 == 0)
			    return;
			Class184 class184 = aClass184Array1168[--anInt1154];
			script
			    = ((Class184) class184).aClass348_Sub42_Sub19_2474;
			opcodes = (((ClientScript) script)
			      .anIntArray9696);
			intOperands
			    = (((ClientScript) script)
			       .anIntArray9694);
			position = ((Class184) class184).anInt2477;
			anIntArray1164 = ((Class184) class184).anIntArray2468;
			aStringArray1155
			    = ((Class184) class184).aStringArray2473;
		    } else if (opcode == 25) {
			int i_494_ = intOperands[position];
			intStack[intStackOffset++]
			    = Class318_Sub1_Sub3_Sub3.varbitHandler
				  .getSetting(i_494_);
		    } else if (opcode == 27) {
			int id = intOperands[position];
			Class318_Sub1_Sub3_Sub3.varbitHandler.putSetting(id, intStack[--intStackOffset]);
		    } else if (opcode == 31) {
			intStackOffset -= 2;
			if (intStack[intStackOffset]
			    <= intStack[intStackOffset + 1])
			    position += intOperands[position];
		    } else if (opcode == 32) {
			intStackOffset -= 2;
			if (intStack[intStackOffset]
			    >= intStack[intStackOffset + 1])
			    position += intOperands[position];
		    } else if (opcode == 33)
			intStack[intStackOffset++]
			    = anIntArray1164[intOperands[position]];
		    else if (opcode == 34)
			anIntArray1164[intOperands[position]]
			    = intStack[--intStackOffset];
		    else if (opcode == 35)
			strStack[anInt1170++]
			    = aStringArray1155[intOperands[position]];
		    else if (opcode == 36)
			aStringArray1155[intOperands[position]]
			    = strStack[--anInt1170];
		    else if (opcode == 37) {
			int i_496_ = intOperands[position];
			anInt1170 -= i_496_;
			String string
			    = Class164.method1279(true, i_496_,
						  strStack, anInt1170);
			strStack[anInt1170++] = string;
		    } else if (opcode == 38)
			intStackOffset--;
		    else if (opcode == 39)
			anInt1170--;
		    else if (opcode == 40) {
			int i_497_ = intOperands[position];
			ClientScript class348_sub42_sub19_498_
			    = Class328.getClientScript(-114, i_497_);
			if (class348_sub42_sub19_498_ == null)
			    throw new RuntimeException();
			int[] is_499_
			    = new int[((ClientScript)
				       class348_sub42_sub19_498_).anInt9688];
			String[] strings
			    = (new String
			       [((ClientScript)
				 class348_sub42_sub19_498_).anInt9689]);
			for (int i_500_ = 0;
			     i_500_ < ((ClientScript)
				       class348_sub42_sub19_498_).anInt9697;
			     i_500_++)
			    is_499_[i_500_]
				= (intStack
				   [intStackOffset - (((ClientScript)
						  class348_sub42_sub19_498_)
						 .anInt9697) + i_500_]);
			for (int i_501_ = 0;
			     i_501_ < ((ClientScript)
				       class348_sub42_sub19_498_).anInt9695;
			     i_501_++)
			    strings[i_501_]
				= (strStack
				   [anInt1170 - (((ClientScript)
						  class348_sub42_sub19_498_)
						 .anInt9695) + i_501_]);
			intStackOffset -= ((ClientScript)
				      class348_sub42_sub19_498_).anInt9697;
			anInt1170 -= ((ClientScript)
				      class348_sub42_sub19_498_).anInt9695;
			Class184 class184 = new Class184();
			((Class184) class184).aClass348_Sub42_Sub19_2474
			    = script;
			((Class184) class184).anInt2477 = position;
			((Class184) class184).anIntArray2468 = anIntArray1164;
			((Class184) class184).aStringArray2473
			    = aStringArray1155;
			if (anInt1154 >= aClass184Array1168.length)
			    throw new RuntimeException();
			aClass184Array1168[anInt1154++] = class184;
			script = class348_sub42_sub19_498_;
			opcodes = (((ClientScript) script)
			      .anIntArray9696);
			intOperands
			    = (((ClientScript) script)
			       .anIntArray9694);
			position = -1;
			anIntArray1164 = is_499_;
			aStringArray1155 = strings;
		    } else if (opcode == 42)
			intStack[intStackOffset++] = ISAAC.globalScriptIntVars[intOperands[position]];
		    else if (opcode == 43) {
			int i_502_ = intOperands[position];
			ISAAC.globalScriptIntVars[i_502_]
			    = intStack[--intStackOffset];
			Class232.method1647(-128, i_502_);
			Class184.aBoolean2469
			    |= Class286_Sub6.isCsVariableActive[i_502_];
		    } else if (opcode == 44) {
			int i_503_ = intOperands[position] >> 16;
			int i_504_ = intOperands[position] & 0xffff;
			int i_505_ = intStack[--intStackOffset];
			if (i_505_ < 0 || i_505_ > 5000)
			    throw new RuntimeException();
			anIntArray1172[i_503_] = i_505_;
			int i_506_ = -1;
			if (i_504_ == 105)
			    i_506_ = 0;
			for (int i_507_ = 0; i_507_ < i_505_; i_507_++)
			    anIntArrayArray1161[i_503_][i_507_] = i_506_;
		    } else if (opcode == 45) {
			int i_508_ = intOperands[position];
			int i_509_ = intStack[--intStackOffset];
			if (i_509_ < 0 || i_509_ >= anIntArray1172[i_508_])
			    throw new RuntimeException();
			intStack[intStackOffset++]
			    = anIntArrayArray1161[i_508_][i_509_];
		    } else if (opcode == 46) {
			int i_510_ = intOperands[position];
			intStackOffset -= 2;
			int i_511_ = intStack[intStackOffset];
			if (i_511_ < 0 || i_511_ >= anIntArray1172[i_510_])
			    throw new RuntimeException();
			anIntArrayArray1161[i_510_][i_511_]
			    = intStack[intStackOffset + 1];
		    } else if (opcode == 47) {
			String string
			    = Class258_Sub2.globalScriptStrVars[intOperands[position]];
			if (string == null)
			    string = "null";
			strStack[anInt1170++] = string;
		    } else if (opcode == 48) {
			int i_512_ = intOperands[position];
			Class258_Sub2.globalScriptStrVars[i_512_]
			    = strStack[--anInt1170];
			Class57.method529(i_512_, true);
		    } else if (opcode == 51) {
			HashTable class356
			    = (((ClientScript) script)
			       .aClass356Array9693[intOperands[position]]);
			Class348_Sub35 class348_sub35
			    = ((Class348_Sub35)
			       class356.get((long) (intStack
							   [--intStackOffset])));
			if (class348_sub35 != null)
			    position
				+= ((Class348_Sub35) class348_sub35).anInt6976;
		    }
		} else {
		    boolean bool;
		    if (intOperands[position] == 1)
			bool = true;
		    else
			bool = false;
		    if (opcode >= 100 && opcode < 5000)
			method710(opcode, bool);
		    else {
			if (opcode < 5000 || opcode >= 10000)
			    break;
			method704(opcode, bool);
		    }
		}
	    }
	    throw new IllegalStateException("Command: " + opcode);
	} catch (Exception exception) {
	    if (((ClientScript) script).aString9690
		!= null) {
		Class59.method544(("Clientscript error in: "
				   + ((ClientScript)
				      script).aString9690),
				  false, 4);
		StringBuffer stringbuffer = new StringBuffer(30);
		stringbuffer.append("Clientscript error in: ").append
		    (((ClientScript) script).aString9690)
		    .append("\n");
		for (int i_513_ = anInt1154 - 1; i_513_ >= 0; i_513_--)
		    stringbuffer.append("via: ").append
			(((ClientScript)
			  (((Class184) aClass184Array1168[i_513_])
			   .aClass348_Sub42_Sub19_2474)).aString9690)
			.append("\n");
		stringbuffer.append("Op: ").append(opcode).append("\n");
		String string = exception.getMessage();
		if (string != null && string.length() > 0)
		    stringbuffer.append("Message: ").append(string)
			.append("\n");
		Class156.method1242(stringbuffer.toString(), exception, 15004);
		GameApplet.addConsoleMessage(stringbuffer.toString());
	    } else {
		StringBuffer stringbuffer = new StringBuffer(30);
		stringbuffer.append("CS2: ").append
		    (((Node) script).nodeKey).append(" ");
		for (int i_514_ = anInt1154 - 1; i_514_ >= 0; i_514_--)
		    stringbuffer.append("v: ").append
			(((Node) (((Class184) aClass184Array1168[i_514_])
				      .aClass348_Sub42_Sub19_2474)).nodeKey)
			.append(" ");
		stringbuffer.append("op: ").append(opcode);
		Class156.method1242(stringbuffer.toString(), exception, 15004);
	    }
	}
    }
    
    private static final void executeScript(InterfaceScript environment, int i) {
	Object[] objects = ((InterfaceScript) environment).parameters;
        
        for(Object o : objects)
            System.out.print(o + (o != objects[objects.length - 1] ? "," : "\n"));
	int scriptId = ((Integer) objects[0]).intValue();
	ClientScript script
	    = Class328.getClientScript(-122, scriptId);
	if (script != null) {
	    anIntArray1164
		= (new int
		   [((ClientScript) script).anInt9688]);
	    int i_516_ = 0;
	    aStringArray1155
		= (new String
		   [((ClientScript) script).anInt9689]);
	    int i_517_ = 0;
	    for (int i_518_ = 1; i_518_ < objects.length; i_518_++) {
		if (objects[i_518_] instanceof Integer) {
		    int i_519_ = ((Integer) objects[i_518_]).intValue();
		    if (i_519_ == -2147483647)
			i_519_ = ((InterfaceScript) environment).anInt6984;
		    if (i_519_ == -2147483646)
			i_519_ = ((InterfaceScript) environment).anInt6995;
		    if (i_519_ == -2147483645)
			i_519_
			    = ((((InterfaceScript) environment).parent
				!= null)
			       ? ((Widget) (((InterfaceScript) environment)
					     .parent)).anInt830
			       : -1);
		    if (i_519_ == -2147483644)
			i_519_ = ((InterfaceScript) environment).anInt6986;
		    if (i_519_ == -2147483643)
			i_519_
			    = ((((InterfaceScript) environment).parent
				!= null)
			       ? ((Widget) (((InterfaceScript) environment)
					     .parent)).anInt704
			       : -1);
		    if (i_519_ == -2147483642)
			i_519_
			    = ((((InterfaceScript) environment).aClass46_6983
				!= null)
			       ? ((Widget) (((InterfaceScript) environment)
					     .aClass46_6983)).anInt830
			       : -1);
		    if (i_519_ == -2147483641)
			i_519_
			    = ((((InterfaceScript) environment).aClass46_6983
				!= null)
			       ? ((Widget) (((InterfaceScript) environment)
					     .aClass46_6983)).anInt704
			       : -1);
		    if (i_519_ == -2147483640)
			i_519_ = ((InterfaceScript) environment).anInt6991;
		    if (i_519_ == -2147483639)
			i_519_ = ((InterfaceScript) environment).anInt6982;
		    anIntArray1164[i_516_++] = i_519_;
		} else if (objects[i_518_] instanceof String) {
		    String string = (String) objects[i_518_];
		    if (string.equals("event_opbase"))
			string = ((InterfaceScript) environment).aString6994;
		    aStringArray1155[i_517_++] = string;
		}
	    }
	    anInt1177 = ((InterfaceScript) environment).anInt6988;
	    method711(script, i);
	}
    }
    
    public static void method713() {
	anIntArray1164 = null;
	aStringArray1155 = null;
	anIntArray1172 = null;
	anIntArrayArray1161 = null;
	intStack = null;
	strStack = null;
	aClass184Array1168 = null;
	currentWidget2 = null;
	currentWidget = null;
	aClass43_1151 = null;
	calendar = null;
	months = null;
	anIntArray1175 = null;
	aClass60_1174 = null;
    }
    
    private static final void method714(int i) {
	Widget class46 = AbstractFontRasterizer.getWidget(i);
	if (class46 != null) {
	    int i_520_ = i >>> 16;
	    Widget[] class46s = Class369_Sub2.aClass46ArrayArray8584[i_520_];
	    if (class46s == null) {
		Widget[] class46s_521_
		    = Class348_Sub40_Sub33.aClass46ArrayArray9427[i_520_];
		int i_522_ = class46s_521_.length;
		class46s = Class369_Sub2.aClass46ArrayArray8584[i_520_]
		    = new Widget[i_522_];
		Class214.method1575(class46s_521_, 0, class46s, 0,
				    class46s_521_.length);
	    }
	    int i_523_;
	    for (i_523_ = 0; i_523_ < class46s.length; i_523_++) {
		if (class46s[i_523_] == class46)
		    break;
	    }
	    if (i_523_ < class46s.length) {
		Class214.method1575(class46s, i_523_ + 1, class46s, i_523_,
				    class46s.length - i_523_ - 1);
		class46s[class46s.length - 1] = class46;
	    }
	}
    }
    
    static final void method715(int i, boolean bool) {
	/* empty */
    }
    
    static {
	aClass184Array1168 = new Class184[50];
	calendar = Calendar.getInstance();
	anIntArray1175 = new int[3];
	months
	    = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
			     "Aug", "Sep", "Oct", "Nov", "Dec" };
	aClass60_1174 = new Cache(4);
	anInt1177 = 0;
    }
}
