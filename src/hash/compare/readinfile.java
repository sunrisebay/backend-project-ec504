package hash.compare;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;


public class readinfile {
	public static ArrayList<String> readin(String filename) throws IOException, ClassNotFoundException, NoSuchAlgorithmException 
	{
		String str;
		int counter=0;
		//char[] cbuf = new char[8];
		ArrayList<String> result = new ArrayList<String>();
		
		File file = new File(filename);
		 try {
		      InputStreamReader input = null;
		      BufferedReader in = null;
		      try {
		       
		        input = new InputStreamReader(new FileInputStream(file));
		
		        in = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		       // BufferedReader in = new BufferedReader( new InputStreamReader(new FileInputStream(filename)));	    
		        
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
		      finally {
		    	in.close();
		        input.close();
		      }
		    }
		    catch (FileNotFoundException ex) {
		   
		    }
		    catch (IOException ex) {
		    
		    }
		
		/*
		 * 
		 * read by bytes no.2
		 */
		
		
		return result;
	}
	
	public static byte[] readinbyte(String Fileline){
		
	        byte[] input = Fileline.getBytes();
	     
	    return input;
	  }

	
}
