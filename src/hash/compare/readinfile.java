package hash.compare;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;


public class readinfile {
	public static ArrayList<String> readin(String filename) throws IOException, ClassNotFoundException, NoSuchAlgorithmException 
	{
		String str;
		int counter=0;
		//char[] cbuf = new char[8];
		ArrayList<String> result = new ArrayList<String>();
		
		File file = new File(filename);
		BufferedReader in = null;
		    try {
		    	 
		    	 in = new BufferedReader( new InputStreamReader(new FileInputStream(file)));	    
		    	
		        /*
				 * read by line
				 * 
				 * 
				 */
				
				while ((str=in.readLine())!=null)
				{
					
					result.add(str);
				}
				
				/*
				 * 
				 * read by bytes
				 */
				/*while (in.read(cbuf, 0, 5) != -1) {
					str = new String(cbuf);
					result.add(hashcodegenerator.makehash(str));
					//System.out.println(str);
					Arrays.fill(cbuf, ' ');
				}*/
				
				
		      }
		     
		      catch (FileNotFoundException ex) {
		   
		      }
		      finally
		      {
		    	  in.close();
		      }
		    
		return result;
	}
	
	public static byte[] readinbyte(String Fileline){
		
	        byte[] input = Fileline.getBytes();
	     
	    return input;
	  }
	
	
}
