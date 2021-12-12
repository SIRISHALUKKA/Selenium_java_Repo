package samplejavapackage;

public class cond_statms {

	public static void main(String[] args) {
		String s1="sirisha";
		String s2="sunitha";
		
		//simple if
		if(s1==s2)
		{
			System.out.println("String s1 is equls to s2");
			
			
		}
		
		//if -else
		
		else
		{
			System.out.println("String s1 not equal to s2");
			s1=s2;
			
			//if-else-if
		 	if(s1==s2)
			{
				System.out.println("s1==s2"+s1+""+s2);
			}
		 	else
		 	{
		 		System.out.println("s1 not equal to s2"+s1+""+s2);
		 	}
			
		}
		
		
		

	}

}
