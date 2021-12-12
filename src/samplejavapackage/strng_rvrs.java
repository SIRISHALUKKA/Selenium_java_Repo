package samplejavapackage;

public class strng_rvrs {

	public static void main(String[] args) {
		
		//String is Immutable Function
		//Stringbuffer is a Mutable function
		
		//1) By Using StringBuffer class in Java
		String s1="sirisha";
		StringBuffer s=new StringBuffer(s1);
		System.out.println("Reverse of the String is:" +s.reverse());
		System.out.println("Length of the String:"+s.length());
		
		/*
		//2) By Using for Loop
		String a="Selenium";
		String b=" " ;
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println("Reverse of the String is:" +b);
		}*/
	
		//3) By using Char Array
		String str="JAVA-SELENIUM";
		String rev=" ";
		char x[]=str.toCharArray();
		int len=x.length;
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+x[i];
		}
		
		System.out.println(rev);
		System.out.println("String Reverse is Completed:::::::::::::::::::::");
}
}
