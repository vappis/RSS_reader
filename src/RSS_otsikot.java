import java.io.*;

public class RSS_otsikot {

	public static void main(String[] args) {
		valikko();
		RSSParse feedi = new RSSParse(valintaLoop());
		feedi.parse();
		feedi.print();
	}
	
	public static void valikko() {
		System.out.println("Tama ohjelma hakee uutisotsikoita hs.fi:n rss-feedeista");
		System.out.println("Haetaan kymmenen uusinta uutisotsikkoa valitusta aiheesta");
		System.out.println("1 - Kotimaa");
		System.out.println("2 - Ulkomaat");
		System.out.println("3 - Talous");
		System.out.println("4 - Urheilu");
	}
	
	public static Valinta valintaLoop() {
		int a = 0;
		Valinta valinta = null;
		boolean x = false;
		do {
				System.out.print("Valitse aihetta vastaava numero valilta 1-4 : ");
				a = lue();
				switch (a)
				{
					case 1:
						valinta = Valinta.A;
						x = true;
						break;
					case 2: 
						valinta = Valinta.B;
						x = true;
						break;
					case 3: 
						valinta = Valinta.C;
						x = true;
						break;
					case 4: 
						valinta = Valinta.D;
						x = true;
						break;
				}
		}
		while (x == false);
		System.out.println("Valitsit vaihtoehdon "+ valinta.palautaInt());
		return valinta;
	}
	
	public static int lue() {
        String jono = "";
        int x = 0;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
        	jono = input.readLine();
        	x = Integer.parseInt(jono);
        	if  (x > 0 && x < Valinta.palautaValinnat()) 
        		input.close();
        	else 
        		System.out.println("Virheellinen valinta");
        }
        catch (NumberFormatException nfe) {
			System.out.println("Poikkeus: "+ nfe.getMessage());
			System.out.println("Tarkista syote");
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
        return x;
    }
}
