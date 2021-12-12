package samplejavapackage;

public class rmv_jnk_vls_frm_strng {

	public static void main(String[] args) {
		
		//Regular Expression: [^a-zA-Z0-9]
		
		String s="!@#!@#@$TESTING $$^%^&%^&^% SELENIUM534656346534JAVA";
		String s1 = s.replaceAll("[^a-bA-Z0-9]", "");
		System.out.println(s1);
		

	}

}
