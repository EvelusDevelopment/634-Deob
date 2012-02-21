/* LoadingStage - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class LoadingStage
{
    GameText mainText;
    boolean hasPercentValue;
    static int anInt1014;
    GameText text1;
    boolean aBoolean1016;
    private int stageId;
    static LoadingStage loadingStage0 = new LoadingStage(0, GameText.checkingUpdatesGameText, GameText.checkingUpdatesGameText, 0, 1);
    static int anInt1019;
    static int anInt1020;
    int finalPercent;
    static int anInt1022;
    static LoadingStage loadingStage1 = new LoadingStage(1, GameText.checkingUpdatesGameText, 2);
    static LoadingStage loadingStage2 = new LoadingStage(2, GameText.checkingUpdatesGameText, GameText.checkingUpdatesGameText, 2, 3);
    int initialPercent;
    static LoadingStage loadingStage3 = new LoadingStage(3, GameText.checkingUpdatesGameText, 3);
    static LoadingStage loadingStage4 = new LoadingStage(4, GameText.checkingUpdatesGameText, GameText.checkingUpdatesGameText, 3, 4);
    static LoadingStage loadingStage5 = new LoadingStage(5, GameText.checkingUpdatesGameText, 4);
    static LoadingStage loadingStage6 = new LoadingStage(6, GameText.checkingUpdatesGameText, 4);
    static LoadingStage loadingStage7 = new LoadingStage(7, GameText.checkingUpdatesGameText, GameText.checkingUpdatesGameText, 4, 5);
    static LoadingStage loadingStage8
	= new LoadingStage(8, GameText.checkingUpdatesGameText, GameText.checkingUpdatesGameText, 5, 98, true, true);//
    static LoadingStage loadingStage9 = new LoadingStage(9, GameText.checkingUpdatesGameText, 99);
    static LoadingStage loadingStage10
	= new LoadingStage(10, GameText.checkingUpdatesGameText, 100);
    static LoadingStage loadingStage11
	= new LoadingStage(11, GameText.fetchingUpdatesGameText, GameText.fetchingUpdatesGameText, 0,
		      92, true, true);
    static LoadingStage loadingStage12
	= new LoadingStage(12, GameText.fetchingUpdatesGameText, GameText.fetchingUpdatesGameText, 92,
		      92);
    private static LoadingStage loadingStage13
	= new LoadingStage(13, GameText.fetchingUpdatesGameText, GameText.fetchingUpdatesGameText, 92,
		      93);
    static LoadingStage loadingStage14
	= new LoadingStage(14, GameText.fetchingUpdatesGameText, GameText.fetchingUpdatesGameText, 94,
		      95);
    static LoadingStage loadingStage15
	= new LoadingStage(15, GameText.fetchingUpdatesGameText, GameText.fetchingUpdatesGameText, 96,
		      97);
    static LoadingStage loadingStage16
	= new LoadingStage(16, GameText.fetchingUpdatesGameText, 97);
    static LoadingStage loadingStage17
	= new LoadingStage(17, GameText.fetchingUpdatesGameText, 97);
    static LoadingStage loadingStage18
	= new LoadingStage(18, GameText.fetchingUpdatesGameText, 100);
    static LoadingStage loadingStage19
	= new LoadingStage(19, GameText.fetchingUpdatesGameText, 100);
    static LoadingStage finalLoadingStage
	= new LoadingStage(20, GameText.fetchingUpdatesGameText, 100);
    static int p11fullArchiveId;
    static int[] anIntArray1045 = new int[2];
    
    private LoadingStage(int id, GameText text, int percent) {
	this(id, text, text, percent, percent, true, false);
    }
    
    final int getStageId() {
	anInt1019++;
	return stageId;
    }
    
    public final String toString() {
	anInt1022++;
	throw new IllegalStateException();
    }
    
    public static void method526(int i) {
	loadingStage17 = null;
	loadingStage9 = null;
	loadingStage19 = null;
	loadingStage15 = null;
	loadingStage11 = null;
	loadingStage4 = null;
	loadingStage0 = null;
	loadingStage3 = null;
	if (i > 42) {
	    loadingStage16 = null;
	    loadingStage8 = null;
	    finalLoadingStage = null;
	    loadingStage10 = null;
	    loadingStage2 = null;
	    loadingStage6 = null;
	    loadingStage1 = null;
	    loadingStage13 = null;
	    anIntArray1045 = null;
	    loadingStage18 = null;
	    loadingStage7 = null;
	    loadingStage14 = null;
	    loadingStage5 = null;
	    loadingStage12 = null;
	}
    }
    
    static final void method527(Frame frame, Signlink class297, boolean bool) {
	try {
	    anInt1020++;
	    for (;;) {
		SignlinkRequest class144 = class297.method2248((byte) 89, frame);
		while ((class144.state ^ 0xffffffff) == -1)
		    Class286_Sub5.method2161((byte) -124, 10L);
		if ((class144.state ^ 0xffffffff) == -2)
		    break;
		Class286_Sub5.method2161((byte) 33, 100L);
	    }
	    frame.setVisible(bool);
	    frame.dispose();
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("jj.D("
					     + (frame != null ? "{...}"
						: "null")
					     + ','
					     + (class297 != null ? "{...}"
						: "null")
					     + ',' + bool + ')'));
	}
    }
    
    private LoadingStage(int i, GameText gametext0, GameText gametext1, int percent0, int percent1) {
	this(i, gametext0, gametext1, percent0, percent1, true, false);
    }
    
    static final LoadingStage[] getLoadingStages() {
	anInt1014++;
	return (new LoadingStage[]
		{ loadingStage0, loadingStage1, loadingStage2, loadingStage3,
		  loadingStage4, loadingStage5, loadingStage6, loadingStage7,
		  loadingStage8, loadingStage9, loadingStage10, loadingStage11,
		  loadingStage12, loadingStage13, loadingStage14, loadingStage15,
		  loadingStage16, loadingStage17, loadingStage18, loadingStage19,
		  finalLoadingStage });
    }
    
    private LoadingStage(int id, GameText text0, GameText text1, int perc0, int perc1, boolean bool, boolean bool_8_) {
	try {
	    ((LoadingStage) this).mainText = text0;
	    ((LoadingStage) this).finalPercent = perc1;
	    stageId = id;
	    ((LoadingStage) this).initialPercent = perc0;
	    ((LoadingStage) this).text1 = text1;
	    ((LoadingStage) this).aBoolean1016 = bool_8_;
	    ((LoadingStage) this).hasPercentValue = bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("jj.<init>(" + id + ','
					     + (text0 != null ? "{...}"
						: "null")
					     + ','
					     + (text1 != null ? "{...}"
						: "null")
					     + ',' + perc0 + ',' + perc1 + ','
					     + bool + ',' + bool_8_ + ')'));
	}
    }
}
