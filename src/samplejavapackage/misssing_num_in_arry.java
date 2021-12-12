package samplejavapackage;

public class misssing_num_in_arry {

	public static void main(String[] args) {
		//logic is: 1235
		//sum1 is 1+2+3+5=11
		//sum2 is:1+2+3+4+5=15
		//sum2-sum1=15-11=4 is the missing number
		int a[]={1,2,3,4,6};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i]; //
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int j=1;j<=6;j++)
		{
			 sum1 = sum1+j;
		}
		
		System.out.println(sum1);
		System.out.println("Missing number is:::::::"+(sum1-sum));
	}

}
