import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
		String str= "Hell Nani how are you and how are you doing";
		str=str.toLowerCase();
		Map<Character, Integer> Count=new HashMap<>();
		for(char c: str.toCharArray())
		{
			Count.put(c, Count.getOrDefault(c, 0)+1);
		}
		System.out.println("Repeated characters in the given string:");
		for(Map.Entry<Character, Integer> entry : Count.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey() +":"+entry.getValue());
			}
		}
		

	}
 
}
