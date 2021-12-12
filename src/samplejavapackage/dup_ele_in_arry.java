package samplejavapackage;

public class dup_ele_in_arry {

	public static void main(String[] args) {
		
		String str[]={"JAVA","PYTHON","SELENIUM","C","PYTHON"};
		
		//1. compare each element O(nxn) ---solution
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					System.out.println("Duplicate Element is::"+str[i]);
				}
			}
		}
		
		//Using HashSet: Java Collection: it stores unique values

	}

}
