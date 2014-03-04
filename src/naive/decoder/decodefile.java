package naive.decoder;



import hash.compare.readinfile;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class decodefile {
	public static void decode(String filename, String change, int line, int startpt, int orilength ) throws ClassNotFoundException, NoSuchAlgorithmException, IOException
	{
		ArrayList<String> defaultversion = readinfile.readin(filename);
		String ll = defaultversion.get(line-1);
		System.out.println(defaultversion.get(line-1));
		String llpre = ll.substring(0,startpt);
		String llsuf = ll.substring(startpt+orilength,ll.length());
		ll = llpre + change + llsuf;
		defaultversion.add(line-1,ll);
		defaultversion.remove(line);
		
		System.out.println(defaultversion.get(line-1));
	}
}
