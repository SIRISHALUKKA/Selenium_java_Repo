package samplejavapackage;

public class methodoverloading {
	
	//Instance Method or use defined method
	public void sum(int a, int b)
	{
		int c=a+b;
		System.out.println("C value is:"+c);
	}
	
	//default constructor
	methodoverloading()
	{
		System.out.println("IAm default constructor");
	}
	
	//parameterized constructor declaration
	public methodoverloading(boolean a, boolean b)
	{
		boolean c=a;
		System.out.println(c);
	}
	
	//method with return type 'string'
	public String sum(String a, String b)
	{
		return a+b;
	}
	
	//method with return type float
	public float sum(float a, float b, float c)
	{
		float d=a+b+c;
		System.out.println("the value of d is:"+d);
		return d;
		
	}
	
	//static method
	public static void sum(char a, char b)
	{
		int c=(a+b);
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		
		methodoverloading ml=new methodoverloading(true,false);
		
		ml.sum(10, 10);
		
		ml.sum("siri", "sha");
		
		ml.sum(12.21f, 23.32f, 34.43f);
		
		sum('s', 'b');
		}
}
