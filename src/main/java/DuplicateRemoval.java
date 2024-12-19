import java.util.LinkedHashSet;
import java.util.Scanner;

public class DuplicateRemoval {

	public static String removeDuplicates(String str)
	{
		LinkedHashSet<Character> set= new LinkedHashSet<>();
		for(char c: str.toCharArray())

		{
			set.add(c);
		}
		StringBuilder result=new StringBuilder();
		for(char c: set)
		{
			result.append(c);
		}
		return result.toString();
	}
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value");
		String str=sc.nextLine();
		String result= removeDuplicates(str);
		
				System.out.println("String after removing Duplicate values"+result);
	}

}
