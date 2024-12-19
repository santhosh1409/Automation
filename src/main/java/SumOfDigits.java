
public class SumOfDigits {

	public static void main(String[] args) {
		String str = "@abc1hgnh12jhh7";
		
		int sum=0;
		StringBuilder number = new StringBuilder();
		
			
		
		for(char ch: str.toCharArray())
			
		{
			if(Character.isDigit(ch))
			{
				number.append(ch);
			}else
			{
				if(number.length()>0)
				{
					sum=sum+Integer.parseInt(number.toString());
					number.setLength(0);
				}
			}
		}
		if(number.length()>0)
		{
			sum=sum+Integer.parseInt(number.toString());
			}
		System.out.println(sum);
		
		}

	

}
