import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		long Factorial=1;
		for(int i=1;i<= number;i++)
		{
			Factorial*=i;
		}
		System.out.println("Factoria number"+number+ "is"+Factorial);
		

	}

}
