package samplejavapackage;

public class Rev_of_int {

	public static void main(String[] args) {
		
		//By Using Proper Algorithm
		int num=34567;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse of an Integer is:"  +rev);
	
	
	
		//by Using StringBuffer Method
		int num1=3424;
		StringBuffer sb=new StringBuffer(String.valueOf(num1)).reverse();
		System.out.println("the Reverse of number is:" +sb);
	
	}
}
