import java.net.*;

public class RSSUrl {
	private URL url;
	
	public RSSUrl(Choice x) throws MalformedURLException {
		String address = "";
		switch (x) {
			case A: 
				address = "http://www.hs.fi/rss/?osastot=kotimaa";
				break;
			case B: 
				address = "http://www.hs.fi/rss/?osastot=ulkomaat";
				break;
			case C: 
				address = "http://www.hs.fi/rss/?osastot=talous";
				break;
			case D: 
				address = "http://www.hs.fi/rss/?osastot=urheilu";
				break;
		}
		url = new URL(address);
	}
	
	public URL returnURL() {
		return url;
	}

}