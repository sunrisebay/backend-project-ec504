package hash.compare;

import hash.hashcodegenerator.hashcodegenerator;
import hash.hashcodegenerator.mainsaving;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import test.findcharedits.test1;

public class Deduplicator {
	public static void main(String [] args) throws ClassNotFoundException, NoSuchAlgorithmException, IOException
	{
		//ArrayList<String> file1 = readinfile.readinmain("plain.txt");
		//ArrayList<String> file2 = readinfile.readinmain("change.txt");
		
		//stepcheckV2(file1.get(0).toString(),file2.get(0).toString());
		//readinfile.readinmain("testfolder");
		//initialhashcodegenerator.writefile("plain.txt");
		//initialhashcodegenerator.writefile("testfolder");
		//readinfile.readinbybyte("plain.txt");
		test1 tt = new test1();
		tt.finddiff("abcdefghijkl", "defghijklmno", 0);
		tt.show();
	}
	
	private static void log(String a)
	{
		System.out.println(a);
	}
	private static int CHUNKS =  1000;
}
