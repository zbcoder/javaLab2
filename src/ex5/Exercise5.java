package ex5;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
public class Exercise5 {
	public static void main(String[] args)
	{
		List <Integer> valuesList= new ArrayList<Integer>();
		valuesList.add(-1);
		valuesList.add(-7);
		valuesList.add(5);
		valuesList.add(2354);
		valuesList.add(-1354);
		valuesList.add(2);
		valuesList.add(1234);
		valuesList.add(-5);
		valuesList.sort(Comparator.reverseOrder());
		System.out.print(valuesList);
	}
}
