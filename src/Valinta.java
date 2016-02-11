public enum Valinta { 
	A (1), 
	B (2),
	C (3),
	D (4);
	
	private final int intarvo;
	private static final int valinnat = 4;
	Valinta (int intarvo){
		this.intarvo = intarvo;
	}
	public static int palautaValinnat() { return valinnat; }
	public int palautaInt() { return intarvo; }
}