package ex1;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

import java.util.EmptyStackException;
import java.util.Stack;

public class Exercise1 {
	
	public static void main(String[] args)
	{
		File rdFile= new File("C:/Users/GCoder/eclipse-workspace/lab2/src/ex1/ex1.txt");
		if (rdFile.exists())
		{
			Stack <String> stringStack= new Stack <String> ();
			try
			{
				FileReader rd= new FileReader(rdFile);
				BufferedReader bufRd= new BufferedReader(rd);
				
				String line= bufRd.readLine();
				while(line!=null)
				{	
					stringStack.push(line);
					System.out.println("Текущий стек "+stringStack);
					line=bufRd.readLine();
				}
				bufRd.close();
			}
			catch (IOException ex)
			{
				System.out.println(ex.getMessage());
			}
			
			try
			{
				File exportFile= new File("C:/Users/GCoder/eclipse-workspace/lab2/src/ex1/exportEx1.txt");
				exportFile.createNewFile();
				FileWriter fw= new FileWriter(exportFile);
				BufferedWriter bufWr= new BufferedWriter(fw);
				while(stringStack!=null)
				{
					try
					{
						bufWr.write(stringStack.pop());
						bufWr.newLine();
					}
					catch(EmptyStackException ex)
					{
						System.out.println("Программа завершила свою работу");
						bufWr.close();
						return;
					}
				}
			}
			catch (IOException ex)
			{
				System.out.print(ex.getMessage());
			}
		}
		else
			System.out.println("Файл не найден");
	}
	
}
