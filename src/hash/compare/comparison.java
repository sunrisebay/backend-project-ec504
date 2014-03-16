package hash.compare;

import hash.hashcodegenerator.hashcodegenerator;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class comparison extends hashcodegenerator {
	public static void stepcompare(ArrayList<String> str) throws ClassNotFoundException, NoSuchAlgorithmException, IOException
	{
		ArrayList<String> data = readinfile.readin("data/data.txt");
		ArrayList<String> result = new ArrayList<String>();
		int ii = 0 ; 
		int counter=0;
		int LENGTH = str.get(0).length();
		log(Integer.toString(LENGTH));
		while (  ii <= LENGTH && counter < data.size() )
		{
			String temp = str.get(0).substring(ii,Math.min(ii+LENGTH/CHUNKS, LENGTH));
			String ss = makehash(temp);
			if ( ss.equals(data.get(counter++)))
			{
				ii=Math.min(ii+LENGTH/CHUNKS, LENGTH);
				//log("true");
			}
			else
			{
				//log("false");
				ii=Math.min(ii+LENGTH/CHUNKS, LENGTH);
				result.add(temp);
				
			}
			
		}
		savefiles.generalsave("second_file.txt", result);
		result.clear();
		log(Integer.toString(counter) + " " + data.size());
	}
	private static void log(String a)
	{
		System.out.println(a);
	}
	private static int CHUNKS = 1000;
}
