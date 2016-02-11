import java.net.*;

public class RSSUrl {
	private URL urli;
	
	public RSSUrl(Valinta x) throws MalformedURLException {
		String osoite = "";
		switch (x) {
			case A: 
				osoite = "http://www.hs.fi/rss/?osastot=kotimaa";
				break;
			case B: 
				osoite = "http://www.hs.fi/rss/?osastot=ulkomaat";
				break;
			case C: 
				osoite = "http://www.hs.fi/rss/?osastot=talous";
				break;
			case D: 
				osoite = "http://www.hs.fi/rss/?osastot=urheilu";
				break;
		}
		urli = new URL(osoite);
	}
	
	public URL returnURL() {
		return urli;
	}

}