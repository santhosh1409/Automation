import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number=sc.nextInt();
		if(isPalindrome(number))
		{
			System.out.println("Given number is palindrome:"+number);
			
		}else
		{
			System.out.println("Given number is not palindrome:"+number);
		}
			

	}
	
	public static boolean isPalindrome(int number)
	{
		int Original=number;
		int reverse=0;
		
		while(number>0)
		{
			int digit=number%10;
			reverse=reverse*10+digit;
			number=number/10;
		}
		return  Original==reverse;
	}
	
	
}

