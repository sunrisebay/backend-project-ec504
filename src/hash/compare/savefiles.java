package hash.compare;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class savefiles {
	public static void initialsave(String filename, ArrayList<String> str) throws FileNotFoundException
	{
		PrintStream outDecode = new PrintStream(new FileOutputStream("database/" + filename));
		for ( String ss : str)
		{
			outDecode.println(ss);
		}
		
		outDecode.close();
	}

}
