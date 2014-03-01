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
		byte [] aa = null;
		byte [] bb = null;
		if (a.size()!=b.size())
			return false;
		else
		{
			for (int ii = 0 ; ii<a.size() ; ii++)
			{
				if ((a.get(ii).equals(b.get(ii)))==false)
				{
					//System.out.println(a.get(ii));
					//System.out.println(b.get(ii));
					aa = readinfile.readinbyte(a.get(ii));
					bb = readinfile.readinbyte(b.get(ii));
				}
					
			}
			
			//System.out.println(aa.length);
			//System.out.println(bb.length);
			
		}
		for (int ii = 0 ; ii<Math.min(aa.length, bb.length) ; ii++)
		{
			if (aa[ii]!=bb[ii])
				System.out.println(aa[ii]);
			
				
		}
		
		return false;
	}

}
