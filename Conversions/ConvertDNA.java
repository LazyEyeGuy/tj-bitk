package Conversions;
import java.io.File;
import java.util.Scanner;

import PathFile.Path;

import java.util.Arrays;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;

public class ConvertDNA 
{	
	public static String Head()
	{
		String dna = takeIn(Path.path);
		String[] dnaSplit = splitDna(dna);
		String rna = convertRna(dnaSplit, dna);
		
		return rna;
	}
	public static String takeIn(String path)
	{
		File dnaStr = new File(path);
		Scanner sc = null;
		
		try
		{
			sc = new Scanner(dnaStr);
		}
		catch(Exception e)
		{
			System.out.println("Fuck you");
		}
	    // we just need to use \\Z as delimiter
	    sc.useDelimiter("\\Z");
	 	    
	    return sc.next();
	}
	
	public static String[] splitDna(String dna)
	{
		String delim = "";
		String[] splitString = dna.split(delim);
		return splitString;
	}
	
	public static String convertRna(String[] dnaSplit, String dna)
	{
		boolean complete = false;
		for(int i = 0; i <= Array.getLength(dnaSplit) - 1; i++)
		{
			if(dnaSplit[i].equals("a") && complete == false)
			{
				dnaSplit[i] = "u";
				complete = true;
			}
			if(dnaSplit[i].equals("t") && complete == false)
			{
				dnaSplit[i] = "a";
				complete = true;
			}
			if(dnaSplit[i].equals("c") && complete == false)
			{
				dnaSplit[i] = "g";
				complete = true;
			}
			if(dnaSplit[i].equals("g") && complete == false)
			{
				dnaSplit[i] = "c";
				complete = true;
			}			
			complete =  false;
		}
		
		String rna = String.join("", dnaSplit);
		
		return rna;
	}
	

}
