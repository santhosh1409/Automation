
public class ReverseAString {

	public static void main(String[] args) {
		String input = " I am learning UI automation ";
		String[] words=input.split(" ");
		String result="";
		for(String word: words)
		{
			String reverse="";
			for(int i=word.length()-1;i>=0;i--)
			{
				reverse=reverse+word.charAt(i);
			}
			reverse=result+" ";
			
			System.out.println(reverse);
		}
		
	
		
	}

}
