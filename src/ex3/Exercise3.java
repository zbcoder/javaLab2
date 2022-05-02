package ex3;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise3 {
	public static void main(String[] args)
	{
		Map<Integer, Integer> Polynom= new HashMap<Integer, Integer> ();
		Scanner in= new Scanner(System.in);
		System.out.print("Степень многочлена n=");
		int powN= in.nextInt();
		System.out.print("D(x)= c0");
		for(Integer i=1; i<=powN; i++)
		{
			System.out.print(" + c"+i+"*x^"+i);
		}
		System.out.print("\n");
		for(int i=0; i<=powN; i++)
		{
			System.out.print("c"+i+"= ");
			Polynom.put(i,in.nextInt());
		}
		System.out.print("D(X)= "+Polynom.get(0));
		for(Integer i=1; i<=powN; i++)
		{
			System.out.print(" + "+Polynom.get(i)+" x^"+i);
		}
		System.out.print("\n");
		Map <Integer, Integer> newPolynom= new HashMap <Integer, Integer>();
		System.out.print("E(x) = a0 ");
		for(int i=1; i<=powN; i++)
		{
			System.out.print(" + a"+i+"*x^"+i);
		}
		System.out.println();
		for(int i=0; i<=powN; i++)
		{
			System.out.print("a"+i+"=");
			newPolynom.put(i, in.nextInt());
		}
		System.out.print("E(x)= "+newPolynom.get(0));
		for(int i=1; i<=powN; i++)
		{
		System.out.print(" + "+newPolynom.get(i)+"x^"+i);
		}
		System.out.println();
		Map<Integer, Integer> h=new HashMap<Integer, Integer>();
		h.put(0, Polynom.get(0)+newPolynom.get(0));
		System.out.print("D(x)+E(x)= "+h.get(0));
		for(int i=1; i<=powN; i++)
		{
			h.put(i, Polynom.get(i)+newPolynom.get(i));
			System.out.print(" + "+h.get(i)+"x^"+i);
		}
	}
}
