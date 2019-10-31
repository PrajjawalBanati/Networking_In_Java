import java.io.*;
import java.net.*;

class URLclass{
	public static void main(String args[])
	{
		try{
		URL url=new URL("https://www.google.co.in/search?sxsrf=ACYBGNTlCg6stXRWj6XfKxNBgxecqLRJiQ%3A1572264736726&source=hp&ei=INu2XfvqKYPzvAT4ho_oAQ&q=go&oq=go&gs_l=psy-ab.3..35i39l2j0i131l3j0l5.19302.19387..19663...0.0..0.125.239.0j2......0....1..gws-wiz.9sac5rg-3P0&ved=0ahUKEwj7-v3I9r7lAhWDOY8KHXjDAx0Q4dUDCAY&uact=5");
		System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getPort());
		System.out.println(url.getFile());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
