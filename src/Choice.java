public enum Choice { 
	A (1), 
	B (2),
	C (3),
	D (4);
	
	private final int intValue;
	private static final int choices = 4;
	Choice (int intValue){
		this.intValue = intValue;
	}
	public static int returnChoices() { return choices; }
	public int returnInt() { return intValue; }
}