package samplejavapackage;

public class class_methods {
	
	int a=20,b=30; //Global Variables or Instance Variables
	static int c=40; //static variable
	static String str="sirisha lukka";
	static String str1="400";
	static String str2="600";
	static int i=Integer.parseInt(str1);
	static int j=Integer.parseInt(str2);
	
	
	//static method
	public static void smethod()
	{
		
		System.out.println("This is static method");

		//equals()
		System.out.println("not Equal:" +str.equals(str1));
		
		//length()
		System.out.println("Length of the String:" +str.length());
	
		//subString()
		System.out.println("the substring is:" +str.substring(0,7));
		System.out.println("the substring is:" +str.substring(8));
		
		//trim()-->remove spaces
		String ts=str.trim();
		System.out.println("length of trimmed string:" +ts.length());
		
		//indexOf()-->check text is available or not
		System.out.println("risha available in str:" +str.indexOf("risha"));
		
		//split()
		String[] s2=str.split(" ");
		for(String f:s2)
		{
			System.out.println(f);
		}
		
	}
	
	public void method1()
	{
		System.out.println("This is method1:" +a);
	}
	
	public static void main(String[] args) {
		
		//Create Object for the class_methods
		class_methods obj=new class_methods();
		System.out.println(obj.a);
		obj.method1();
		
		//Retrieving static methods and static variables
		System.out.println(class_methods.c);
		class_methods.smethod();
		
		//2nd way to retrieve the static variables and static methods inside the class.
		System.out.println(c);
		smethod();
		
		System.out.println(str.toUpperCase());
		System.out.println(i+j);
		
		
		
	}

}

//Class is a blueprint, it contains Variables and Methods
//by using Object we can use Class Properties.
