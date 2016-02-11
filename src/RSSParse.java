import java.io.*;
import java.net.*;

public class RSSParse {
	private Choice choice;
	private URL source;
	private String[] headlines;
	private final int count = 10;
	public RSSParse(Choice x) {
		choice = x;
	}
	
	public void parse() {
		String inputLine = "";
		headlines = new String[count];
		int apu = 0;
		try {
			RSSUrl rss = new RSSUrl(choice);
			source = rss.returnURL();
		}
		catch (MalformedURLException mue)	{ mue.printStackTrace(); }
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(source.openStream()));
			while ((inputLine = in.readLine()) != null && apu < count) {
				if (inputLine.contains("<title><![CDATA[") && !inputLine.contains("HS.fi]")) {
					inputLine = inputLine.trim();
					inputLine = inputLine.substring(16, inputLine.length() - 11);
					headlines[apu] = inputLine;
					apu++;
				}					
			}
			in.close();
		}
		catch (IOException ioe) { ioe.printStackTrace(); }
	}
	
	public void print() {
		for (int i = 0; i < count; i++)
			if (headlines[i] != null)
				System.out.println(headlines[i]);
	}
}