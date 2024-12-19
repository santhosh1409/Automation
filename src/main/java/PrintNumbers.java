
public class PrintNumbers {

	public static void main(String[] args) {
	
		String str= "HIraho123ryou1iam45fine6";
		StringBuilder number =new StringBuilder();
		
		for(char c: str.toCharArray())
		{
			if(Character.isDigit(c))
			{
				number.append(c);
			
			}else
			{
				if(number.length()>0)
				{
					System.out.println(number);
					number.setLength(0);
				}
			}
		}
			if(number.length()>0)
			{
				System.out.println(number);
			}
				
		

	}

}
