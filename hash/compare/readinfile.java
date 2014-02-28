package hash.compare;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;


public class readinfile {
	public static ArrayList<String> readin(String filename) throws IOException, ClassNotFoundException, NoSuchAlgorithmException 
	{
		String str;
		char[] cbuf = new char[8];
		ArrayList<String> result = new ArrayList<String>();
		@SuppressWarnings("resource")
		BufferedReader in = new BufferedReader( new InputStreamReader(new FileInputStream(filename)));
/*		while ((str=in.readLine())!=null)
		{
			result.add(hashcodegenerator.makehash(str));
		}
*/		while (in.read(cbuf, 0, 5) != -1) {
			str = new String(cbuf);
			result.add(hashcodegenerator.makehash(str));
			System.out.println(str);
			Arrays.fill(cbuf, ' ');
		}
		return result;
	}
	
}
