
public class Reverse {

	public static void main(String[] args) {
		String str= "Hello Nani";
		//String result="";
		
		//for(int i=str.length()-1;i>=0;i--)
		//{
			//result=result+str.charAt(i);
		//}
		
		//System.out.println(result);
		String result= new StringBuilder(str).reverse().toString();
		System.out.println(result);
	}

}
