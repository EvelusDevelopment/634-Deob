/* Class328_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class328_Sub2 extends Class328
{
    static LoadingStage[] loadingStages;
    static int anInt6516;
    static Cache aClass60_6517 = new Cache(4);
    static int anInt6518;
    
    static final Class120 method2612(ByteBuffer class348_sub49,
				     boolean bool) {
	anInt6518++;
	int i = class348_sub49.getShort();
	if (bool != true)
	    method2613(-27);
	return new Class120(i);
    }
    
    public static void method2613(int i) {
	loadingStages = null;
	aClass60_6517 = null;
	if (i != -1)
	    method2613(58);
    }
}
