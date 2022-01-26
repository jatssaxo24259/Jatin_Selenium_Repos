package NtRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class ReadData 
{

	public static void main(String[] args) 
	{
		
		
		try {
		File f = new File("../NoteRead/TestDoc.txt");
		FileReader fr = new FileReader(f);
		BufferedReader bf = new BufferedReader(fr);
		
		for (int i = 0; i < 10; i++) {
			

			if (i>=2) 
			{
				if (i<=4)
				{
			String	line =bf.readLine();
			System.out.println(line);
			System.out.println("test");
				}
			
			}
			
				else
				{
					bf.readLine();
				}
		}
				
			
		
/*		int a;
		while((a=fr.read())!=-1)
				{
			System.out.println((char)a);
			
				}
		String l;
		while((l=bf.readLine())!=null)
		{
			System.out.println(l);
					
		}*/
		
		fr.close();
		
		}
		catch(Exception e) 
		{
			System.out.println("File not found");
		}
	}
	
}
