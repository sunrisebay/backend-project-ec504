package hash.compare;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class tester {
	public static void main(String [] args) throws NoSuchAlgorithmException, ClassNotFoundException, IOException
	{
		
		ArrayList<String> ori = readinfile.readin("plain.txt");
		
		ArrayList<String> neww = readinfile.readin("change.txt");
		
		if (initialcheck(ori,neww)==false)
		{
			if ( diff.get(0).length() == diff.get(1).length())
				checkchange(diff.get(0),diff.get(1));
			else
			{
				if (diff.get(0).length() < diff.get(1).length())
					checkinsert(diff.get(0),diff.get(1));
				else
					checkdelete(diff.get(0),diff.get(1));
			}
		}
		//log(ori.get(0));
	}
	
	private static boolean initialcheck(ArrayList ori, ArrayList neww) throws NoSuchAlgorithmException
	{
		if (ori.size()!=neww.size())
		{
			log("diff size");
			return false;
		}
		for (int ii = 0 ; ii < ori.size() ; ii++)
		{
			if(hashcodegenerator.makehash(ori.get(ii).toString()).equals(hashcodegenerator.makehash(neww.get(ii).toString())))
			{
			
			}
			else
			{
				diff.add(ori.get(ii).toString());
				diff.add(neww.get(ii).toString());
				log(ori.get(ii).toString());
				log(neww.get(ii).toString());
				return false;
			}
			
		}
		return true;
	}
	
		
	private static void checkinsert(String a, String b)
	{
		int ai = 0 ;
		int bi = 0;
		
		/*for (int ii = 0 ; ii < a.length()-BYTE ; ii++)
		{
			if (a.substring(ii, ii+BYTE).equals(b.substring(ii, ii+BYTE)))
			{
				
			}
			else
			{
				log("diff point : " +ii);
				
				
			}
		}*/
		
		while(ai<a.length()-BYTE && bi<b.length()-BYTE)
		{
			if (a.substring(ai, ai+BYTE).equals(b.substring(bi, bi+BYTE)))
			{
				
			}
			else
			{
				log("diff point : " +ai + " " + bi);
				ai = ai+BYTE;
				bi=bi+BYTE+1;
				
			}
			ai++;
			bi++;
		}
		log("diff point : " + bi);
		
	}
	
	
	private static void checkdelete(String a, String b)
	{

		int ai = 0 ;
		int bi = 0;
		while(ai<a.length()-BYTE && bi<b.length()-BYTE)
		{
			if (a.substring(ai, ai+BYTE).equals(b.substring(bi, bi+BYTE)))
			{
				
			}
			else
			{
				log("diff point : " +ai + " " + bi);
				ai = ai+BYTE+1;
				bi=bi+BYTE;
				
			}
			ai++;
			bi++;
		}
		log("diff point : " + bi);
	}
	
	private static void checkchange(String a, String b)
	{
		for (int ii = 0 ; ii < a.length()-BYTE ; ii++)
		{
			if (a.substring(ii, ii+BYTE).equals(b.substring(ii, ii+BYTE)))
			{
				
			}
			else
			{
				log("diff point : " +ii);
				
			}
		}
	}
	
	private static void log(String a)
	{
		System.out.println(a);
	}
	
	private static int offsetinsert=0;
	private static int offsetdelete=0;
	private final static int BYTE = 5;
	private static ArrayList<String> diff = new ArrayList<String>();

}
