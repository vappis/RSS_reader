import java.io.*;

public class RSS_headlines {

	public static void main(String[] args) {
		menu();
		RSSParse feed = new RSSParse(choiceLoop());
		feed.parse();
		feed.print();
	}
	
	public static void menu() {
		System.out.println("Tama ohjelma hakee uutisotsikoita hs.fi:n RSS-feedeista");
		System.out.println("Haetaan kymmenen uusinta uutisotsikkoa valitusta aiheesta");
		System.out.println("1 - Kotimaa");
		System.out.println("2 - Ulkomaat");
		System.out.println("3 - Talous");
		System.out.println("4 - Urheilu");
	}
	
	public static Choice choiceLoop() {
		int a = 0;
		Choice choice = null;
		boolean x = false;
		do {
				System.out.print("Valitse aihetta vastaava numero valilta 1-4 : ");
				a = read();
				switch (a)
				{
					case 1:
						choice = Choice.A;
						x = true;
						break;
					case 2: 
						choice = Choice.B;
						x = true;
						break;
					case 3: 
						choice = Choice.C;
						x = true;
						break;
					case 4: 
						choice = Choice.D;
						x = true;
						break;
				}
		}
		while (x == false);
		System.out.println("Valitsit vaihtoehdon "+ choice.returnInt());
		return choice;
	}
	
	public static int read() {
        String line = "";
        int x = 0;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
        	line = input.readLine();
        	x = Integer.parseInt(line);
        	if  (x > 0 && x <= Choice.returnChoices()) 
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
