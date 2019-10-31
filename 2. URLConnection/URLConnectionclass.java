import java.io.*;
import java.net.*;
public class URLConnectionclass{
	public static void main(String[] args)
	{
		try
		{
			URL url=new URL("https://golang.org/doc/code.html");
			URLConnection con=url.openConnection();
			InputStream stream=con.getInputStream();
			int i;
			while((i=stream.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}