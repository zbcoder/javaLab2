package ex4;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Stack;
import java.util.EmptyStackException;

public class Exercise4 {
	public static void main(String[] args)
	{
		Map<String, String> katalog= new HashMap<String, String>();
		System.out.print("������� ������ ��������: ");
		Scanner in= new Scanner(System.in);
		Integer katalogSize;
		try
		{
			katalogSize= in.nextInt();
		}
		catch(InputMismatchException ex)
		{
			System.out.println("�� �����");
			return;
		}
		in= new Scanner(System.in);
		for(Integer i=0; i<katalogSize; i++)
		{
			String katalogItemName, katalogItemDiskr;
			System.out.print("������� ��� ������: ");
			katalogItemName=in.nextLine();
			System.out.print("������� �������� ������: ");
			katalogItemDiskr=in.nextLine();
			katalog.put(katalogItemName, katalogItemDiskr);
		}
		System.out.println("���� ��������: ");
		Stack <Map.Entry<String, String>> katalogItemStack 
		= new <Map.Entry<String, String>>Stack();
		for(Map.Entry<String, String> tmp: katalog.entrySet())
		{
			katalogItemStack.push(tmp);
		}
		
		System.out.println(katalogItemStack);
	}
}
