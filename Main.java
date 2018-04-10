import Conversions.ConvertDNA;
import Conversions.ConvertRNA;
import PathFile.Path;

public class Main 
{
	
	public static void main(String[] args)
	{
		ConvertDNA.Head();
		ConvertRNA.Head();
		
		System.out.println(ConvertDNA.Head());
		System.out.println(ConvertRNA.proteinString());
	}
}
