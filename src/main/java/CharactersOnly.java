
public class CharactersOnly {

	public static void main(String[] args) {
		String str="@12werd34rgtgdj4566jjbfddj67djfjf7djd8nsj98u";
		StringBuilder character= new StringBuilder();
		
		for(char c: str.toCharArray())
		{
			if(Character.isLetter(c))
			{
				character.append(c);
			}
		}
		System.out.println("Characters identofied in STring:"+character);

	}

}
