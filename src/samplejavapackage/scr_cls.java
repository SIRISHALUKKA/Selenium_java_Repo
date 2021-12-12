package samplejavapackage;

import java.util.Scanner;

public class scr_cls {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name");
		String a = sc.next();
		String b= a+"Lukka";
		System.out.println(b);
		System.out.println("enter ur age:");
		int b1 = sc.nextInt();
		System.out.println(100+b1);
		sc.close();

	}

}
