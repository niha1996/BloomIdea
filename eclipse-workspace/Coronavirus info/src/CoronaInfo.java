import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoronaInfo {
	public static void main(String args[])
	{
		try
		{
			Document doc=Jsoup.connect("https://www.imdb.com/search/title/?groups=top_250&sort=user_rating/").userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36").referrer("http://www.google.com").timeout(1000*5) .get();
		    System.out.println(doc);
			Elements temp=doc.select("d.lister-list");
		    
		    for(Element states:temp)
		    {
		    	System.out.println(states.getElementsByTag("a").first().text());
		    	
		    }
				
	}
		catch(IOException e)
		{
			e.printStackTrace();
		}

}
}
