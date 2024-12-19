import java.util.HashMap;
import java.util.Map;

public class Occurance1 {

	public static void main(String[] args) {
		String[] words = {"Sunny","Bunny","Nani","Sunny","Bunny","Nani","Sunny","Bunny","Nani","Sunny","Hello","Raja","Raja"};
		Map<String,Integer> map=new HashMap<>();
		
		for(String s:words)
		{
			if(map.containsKey(s))
			{
				map.put(s, map.get(s)+1);
			}
			else {
				map.put(s, 1);
			}
		}
		System.out.println(map);

	}

}
