
public class SpecialCharacter {

	public static void main(String[] args) {
		String str= "akhefjesg@jhdshsv#uahsf#123hfjbhdf$ahfhslg";
		StringBuilder Specialchar=new StringBuilder();
		
		for(char c: str.toCharArray())
		{
			if(!Character.isLetterOrDigit(c))
			{
				Specialchar.append(c);
			}
		}
		System.out.println("Special Characters in the String:" +Specialchar);

	}

}
