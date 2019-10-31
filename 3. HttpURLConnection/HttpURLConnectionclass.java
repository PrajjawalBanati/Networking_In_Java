import java.io.*;
import java.net.*;
class HttpURLConnectionclass{
	public static void main(String[] args)
	{
		int i;
		try{
			URL url=new URL("https://golang.org/doc/code.html");
			HttpURLConnection con=(HttpURLConnection) url.openConnection();
			for(i=1;i<=8;i++)
			{
				System.out.println(con.getHeaderFieldKey(i)+" = "+con.getHeaderField(i));
			}
			con.disconnect();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}