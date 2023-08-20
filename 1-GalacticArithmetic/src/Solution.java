import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		long num1=Sc.nextLong();
		long num2=Sc.nextLong();
		System.out.println(galacticAddition(num1,num2));
		
	}
	public static long galacticAddition(long num1, long num2) {;
	return num1+num2;
	}
}
