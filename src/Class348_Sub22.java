/* Class348_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

final class Class348_Sub22 extends Node
{
    static int anInt6857;
    static int anInt6858;
    Npc aClass318_Sub1_Sub3_Sub3_Sub1_6859;
    static int anInt6860;
    static int anInt6861;
    static int hitmarksArchiveId;
    
    static final Widget getWidgetChild(int child, int widget) {
	anInt6858++;
	Widget class46 = AbstractFontRasterizer.getWidget(widget);
	if ((child ^ 0xffffffff) == 0)
	    return class46;
	if (class46 == null || ((Widget) class46).children == null || ((((Widget) class46).children.length ^ 0xffffffff) >= (child ^ 0xffffffff)))
	    return null;
	return ((Widget) class46).children[child];
    }
    
    static final int method2958(int i, IndexLoader class45) {
	anInt6861++;
	int i_2_ = 0;
	if (class45.getArchiveLoaded(false, hitmarksArchiveId))
	    i_2_++;
	if (class45.getArchiveLoaded(false, AlternativeFontLoader.anInt1639))
	    i_2_++;
	if (class45.getArchiveLoaded(false, MouseMovementListener.anInt7429))
	    i_2_++;
	if (class45.getArchiveLoaded(false, AbstractToolkit.anInt4562))
	    i_2_++;
	if (class45.getArchiveLoaded(false, StringVarScriptSettingLoader.headiconsArchiveId))
	    i_2_++;
	if (class45.getArchiveLoaded(false, Class115.anInt1756))
	    i_2_++;
	if (class45.getArchiveLoaded(false, IndexTable.anInt3739))
	    i_2_++;
	if (class45.getArchiveLoaded(false, Class86.mapflagArchiveId))
	    i_2_++;
	if (class45.getArchiveLoaded(false, Class239_Sub10.anInt5948))
	    i_2_++;
	if (class45.getArchiveLoaded(false, Class113.mapdotsArchvieId))
	    i_2_++;
	if (class45.getArchiveLoaded(false, LocationMode.anInt4469))
	    i_2_++;
	if (i != 22388)
	    return 8;
	if (class45.getArchiveLoaded(false, Class348_Sub40_Sub38.anInt9473))
	    i_2_++;
	if (class45.getArchiveLoaded(false, Class187.anInt2510))
	    i_2_++;
	if (class45.getArchiveLoaded(false, ColorNode.compassArchvieId))
	    i_2_++;
	if (class45.getArchiveLoaded(false, Class186_Sub1.anInt5814))
	    i_2_++;
	if (class45.getArchiveLoaded(false, Class5_Sub3.anInt8370))
	    i_2_++;
	return i_2_;
    }
    
    static final void method2959(int i) {
	Class182.keyboardListener.method2698(14174);
	anInt6860++;
	Class258_Sub4.mouseMovementListener.method3592(0);
	NpcDefinition.aClient1367.method87((byte) -49);
	Class305.canvas.setBackground(Color.black);
	Class337.anInt4179 = i;
	Class182.keyboardListener
	    = Class348_Sub3.createKeyboardListener(Class305.canvas, (byte) 84);
	Class258_Sub4.mouseMovementListener
	    = Class348_Sub18.createMouseMovementListener(Class305.canvas, 0, true);
    }
    
    Class348_Sub22(Npc class318_sub1_sub3_sub3_sub1) {
	((Class348_Sub22) this).aClass318_Sub1_Sub3_Sub3_Sub1_6859
	    = class318_sub1_sub3_sub3_sub1;
    }
}
