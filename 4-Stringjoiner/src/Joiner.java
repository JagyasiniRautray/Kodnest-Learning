import java.util.Scanner;
public class Joiner {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter firstname and lastname");
	    String firstname=Sc.next();
	    String lastname=Sc.next(); 
	    System.out.println();
	    System.out.println(joinStrings(firstname, lastname));
	    

	}
	public static String joinStrings(String str1, String str2)
	{
		return str1+str2;
	}
}
