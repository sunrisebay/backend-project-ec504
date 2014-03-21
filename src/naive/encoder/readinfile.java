package naive.encoder;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;


public class readinfile {
	
	public readinfile(String file) throws ClassNotFoundException, NoSuchAlgorithmException, IOException
	{
		ss = readinmain(file);
	}
	
	
	public ArrayList<String> readinfolder(File folder) throws IOException
	{
		
		File[] listoffiles = folder.listFiles();
		ArrayList<String> result = new ArrayList<String>();
		
		for (File file: listoffiles)
		{
			
			result.add(readinbybyte(file).get(0));

		}
		return result;
	}
	
	public ArrayList<String> readinbybyte(File file) throws IOException
	{
		ArrayList<String> result = new ArrayList<String>();
		FileInputStream fin = new FileInputStream(file);
		byte[] buffer = new byte[(int)file.length()];
		new DataInputStream(fin).readFully(buffer);
		fin.close();
		String s = new String(buffer,"UTF-8");
		result.add(s);
		return result;
	}
	
	public ArrayList<String> readinmain(String name) throws ClassNotFoundException, NoSuchAlgorithmException, IOException
	{	
		ArrayList<String> result = new ArrayList<String>();
		File file = new File(name);
		if (file.isFile())
		{
			return result = readinbybyte(file);
		}
		else
		{
			return result = readinfolder(file);
		}
		
	}
	
	
	private static void log(String a)
	{
		System.out.println(a);
	}
	
	public ArrayList<String> ss;
	
}
