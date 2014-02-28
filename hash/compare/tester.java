package hash.compare;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class tester {
	public static void main(String [] args) throws NoSuchAlgorithmException, ClassNotFoundException, IOException
	{
		
		ArrayList<String> ori = readinfile.readin("plain.txt");
		//System.out.println(ori.get(0));
		ArrayList<String> neww = readinfile.readin("change.txt");
		//System.out.println(neww.get(0));
		//System.out.println(ori.get(0).equals(neww.get(0)));
		compare(ori,neww);
		
	}
	public static boolean compare(ArrayList<String> a, ArrayList<String> b)
	{
		if (a.size()!=b.size())
			return false;
		else
		{
			for (int ii = 0 ; ii<a.size() ; ii++)
			{
				System.out.println(a.get(ii).equals(b.get(ii)));
					
			}
		}
		return false;
	}

}
