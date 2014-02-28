import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;


public class readinfile {
	public static ArrayList readin(String filename) throws IOException, ClassNotFoundException, NoSuchAlgorithmException 
	{
		String str;
		ArrayList result = new ArrayList();
		BufferedReader in = new BufferedReader( new InputStreamReader(new FileInputStream(filename)));
		while ((str=in.readLine())!=null)
		{
			result.add(hashcodegenerator.makehash(str));
		}
		return result;
	}
	
}
