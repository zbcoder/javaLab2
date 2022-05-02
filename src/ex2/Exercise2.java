package ex2;

import java.util.Scanner;
import java.util.Stack;
import java.util.EmptyStackException;
import java.util.InputMismatchException;

public class Exercise2 {
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		System.out.print("¬ведите число: ");
		Integer numb=0;
		try
		{
			numb= in.nextInt();	
		}
		catch(InputMismatchException ex)
		{
			System.out.println("¬ведено не число");
			return;
		}
		String str= numb.toString();
		Stack <Character> valueStack= new Stack<Character>();
		for(int i=0; i<str.length();i++)
		{
			valueStack.push(str.charAt(i));
		}
		char[] answString= new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			try
			{
				answString[i]=valueStack.pop();
			}
			catch(EmptyStackException ex)
			{
				return;
			}
		}
		System.out.println("»тоговое число: ");
		for(Character ch : answString)
		{
			System.out.print(ch);
		}
	}
}
