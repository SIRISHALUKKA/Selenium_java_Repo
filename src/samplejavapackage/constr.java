package samplejavapackage;

public class constr {
	
	//Declaring the construtor
	//constructor is nothing but a method with no return type. 
	//constructor name should be like class name.
	
	public constr(int a, int b)
	{
		int c=a+b;
		System.out.println("Value of c is:" +c);
	}

	public static void main(String[] args) {
		
		//Calling constructor in main()
		new constr(10,20);
		

	}

}
