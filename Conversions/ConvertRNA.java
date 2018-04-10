package Conversions;
import PathFile.Path;

public class ConvertRNA extends ConvertDNA
{
	public static String Head()
	{
		String[] rna = Parse();
		String[] protein = toProtein();
		String proteinString = proteinString();
		
		return proteinString;
 	}
	public static String[] Parse()
	{
		String rna = ConvertDNA.Head();
		
		String[] rnaArray = rna.split("(?<=\\G...)");
		
		return rnaArray;
	}
	
	public static String[] toProtein()
	{
		String[] rna = Parse();
		boolean proteinFound = false;
		
		for(int i = 0; i <= rna.length - 1; i++)
		{
			if(rna[i].equals("uuu") && proteinFound == false)
			{
				rna[i] = "phe";
				proteinFound = true;
			}
			if(rna[i].equals("uuc") && proteinFound == false)
			{
				rna[i] = "phe";
				proteinFound = true;
			}
			if(rna[i].equals("uua") && proteinFound == false)
			{
				rna[i] = "leu";
				proteinFound = true;
			}
			if(rna[i].equals("uug") && proteinFound == false)
			{
				rna[i] = "leu";
				proteinFound = true;
			}
			if(rna[i].equals("ucu") && proteinFound == false)
			{
				rna[i] = "ser";
				proteinFound = true;
			}
			if(rna[i].equals("ucc") && proteinFound == false)
			{
				rna[i] = "ser";
				proteinFound = true;
			}
			if(rna[i].equals("uca") && proteinFound == false)
			{
				rna[i] = "ser";
				proteinFound = true;
			}
			if(rna[i].equals("ucg") && proteinFound == false)
			{
				rna[i] = "ser";
				proteinFound = true;
			}
			if(rna[i].equals("uau") && proteinFound == false)
			{
				rna[i] = "tyr";
				proteinFound = true;
			}
			if(rna[i].equals("uac") && proteinFound == false)
			{
				rna[i] = "tyr";
				proteinFound = true;
			}
			if(rna[i].equals("uaa") && proteinFound == false)
			{
				rna[i] = "stop";
				proteinFound = true;
			}
			if(rna[i].equals("uag") && proteinFound == false)
			{
				rna[i] = "stop";
				proteinFound = true;
			}
			if(rna[i].equals("ugu") && proteinFound == false)
			{
				rna[i] = "cys";
				proteinFound = true;
			}
			if(rna[i].equals("ugc") && proteinFound == false)
			{
				rna[i] = "cys";
				proteinFound = true;
			}
			if(rna[i].equals("uga") && proteinFound == false)
			{
				rna[i] = "stop";
				proteinFound = true;
			}
			if(rna[i].equals("ugg") && proteinFound == false)
			{
				rna[i] = "trp";
				proteinFound = true;
			}
			if(rna[i].equals("cuu") && proteinFound == false)
			{
				rna[i] = "leu";
				proteinFound = true;
			}
			if(rna[i].equals("cuc") && proteinFound == false)
			{
				rna[i] = "leu";
				proteinFound = true;
			}
			if(rna[i].equals("cua") && proteinFound == false)
			{
				rna[i] = "leu";
				proteinFound = true;
			}
			if(rna[i].equals("cug") && proteinFound == false)
			{
				rna[i] = "leu";
				proteinFound = true;
			}
			if(rna[i].equals("ccu") && proteinFound == false)
			{
				rna[i] = "pro";
				proteinFound = true;
			}
			if(rna[i].equals("ccc") && proteinFound == false)
			{
				rna[i] = "pro";
				proteinFound = true;
			}
			if(rna[i].equals("cca") && proteinFound == false)
			{
				rna[i] = "pro";
				proteinFound = true;
			}
			if(rna[i].equals("ccg") && proteinFound == false)
			{
				rna[i] = "pro";
				proteinFound = true;
			}
			if(rna[i].equals("cau") && proteinFound == false)
			{
				rna[i] = "his";
				proteinFound = true;
			}
			if(rna[i].equals("cac") && proteinFound == false)
			{
				rna[i] = "his";
				proteinFound = true;
			}
			if(rna[i].equals("caa") && proteinFound == false)
			{
				rna[i] = "gln";
				proteinFound = true;
			}
			if(rna[i].equals("cag") && proteinFound == false)
			{
				rna[i] = "gln";
				proteinFound = true;
			}
			if(rna[i].equals("cgu") && proteinFound == false)
			{
				rna[i] = "arg";
				proteinFound = true;
			}
			if(rna[i].equals("cgc") && proteinFound == false)
			{
				rna[i] = "arg";
				proteinFound = true;
			}
			if(rna[i].equals("cga") && proteinFound == false)
			{
				rna[i] = "arg";
				proteinFound = true;
			}
			if(rna[i].equals("cgg") && proteinFound == false)
			{
				rna[i] = "arg";
				proteinFound = true;
			}
			if(rna[i].equals("auu") && proteinFound == false)
			{
				rna[i] = "ile";
				proteinFound = true;
			}
			if(rna[i].equals("auc") && proteinFound == false)
			{
				rna[i] = "ile";
				proteinFound = true;
			}
			if(rna[i].equals("aua") && proteinFound == false)
			{
				rna[i] = "ile";
				proteinFound = true;
			}
			if(rna[i].equals("aug") && proteinFound == false)
			{
				rna[i] = "met";
				proteinFound = true;
			}
			if(rna[i].equals("acu") && proteinFound == false)
			{
				rna[i] = "thr";
				proteinFound = true;
			}
			if(rna[i].equals("acc") && proteinFound == false)
			{
				rna[i] = "thr";
				proteinFound = true;
			}
			if(rna[i].equals("aca") && proteinFound == false)
			{
				rna[i] = "thr";
				proteinFound = true;
			}
			if(rna[i].equals("acg") && proteinFound == false)
			{
				rna[i] = "thr";
				proteinFound = true;
			}
			if(rna[i].equals("aau") && proteinFound == false)
			{
				rna[i] = "asn";
				proteinFound = true;
			}
			if(rna[i].equals("aac") && proteinFound == false)
			{
				rna[i] = "asn";
				proteinFound = true;
			}
			if(rna[i].equals("aaa") && proteinFound == false)
			{
				rna[i] = "lys";
				proteinFound = true;
			}
			if(rna[i].equals("aag") && proteinFound == false)
			{
				rna[i] = "lys";
				proteinFound = true;
			}
			if(rna[i].equals("agu") && proteinFound == false)
			{
				rna[i] = "ser";
				proteinFound = true;
			}
			if(rna[i].equals("agc") && proteinFound == false)
			{
				rna[i] = "ser";
				proteinFound = true;
			}
			if(rna[i].equals("aga") && proteinFound == false)
			{
				rna[i] = "arg";
				proteinFound = true;
			}
			if(rna[i].equals("agg") && proteinFound == false)
			{
				rna[i] = "arg";
				proteinFound = true;
			}
			if(rna[i].equals("guu") && proteinFound == false)
			{
				rna[i] = "val";
				proteinFound = true;
			}
			if(rna[i].equals("guc") && proteinFound == false)
			{
				rna[i] = "val";
				proteinFound = true;
			}
			if(rna[i].equals("gua") && proteinFound == false)
			{
				rna[i] = "val";
				proteinFound = true;
			}
			if(rna[i].equals("gug") && proteinFound == false)
			{
				rna[i] = "val";
				proteinFound = true;
			}
			if(rna[i].equals("gcu") && proteinFound == false)
			{
				rna[i] = "ala";
				proteinFound = true;
			}
			if(rna[i].equals("gcc") && proteinFound == false)
			{
				rna[i] = "ala";
				proteinFound = true;
			}
			if(rna[i].equals("gca") && proteinFound == false)
			{
				rna[i] = "ala";
				proteinFound = true;
			}
			if(rna[i].equals("gcg") && proteinFound == false)
			{
				rna[i] = "ala";
				proteinFound = true;
			}
			if(rna[i].equals("gau") && proteinFound == false)
			{
				rna[i] = "asp";
				proteinFound = true;
			}
			if(rna[i].equals("gac") && proteinFound == false)
			{
				rna[i] = "asp";
				proteinFound = true;
			}
			if(rna[i].equals("gaa") && proteinFound == false)
			{
				rna[i] = "glu";
				proteinFound = true;
			}
			if(rna[i].equals("gag") && proteinFound == false)
			{
				rna[i] = "glu";
				proteinFound = true;
			}
			if(rna[i].equals("ggu") && proteinFound == false)
			{
				rna[i] = "gly";
				proteinFound = true;
			}
			if(rna[i].equals("ggc") && proteinFound == false)
			{
				rna[i] = "gly";
				proteinFound = true;
			}
			if(rna[i].equals("gga") && proteinFound == false)
			{
				rna[i] = "gly";
				proteinFound = true;
			}
			if(rna[i].equals("ggg") && proteinFound == false)
			{
				rna[i] = "gly";
				proteinFound = true;
			}
			
			proteinFound = false;
		}
		
		return rna;
	}
	
	public static String proteinString()
	{
		String proteinString = String.join(",", toProtein());
		return proteinString;
	}

}
