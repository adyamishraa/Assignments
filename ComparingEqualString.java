package Homework;
import java.util.*;

public class ComparingEqualString {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the two required strings:");

		String str1= scn.nextLine();
		String str2=scn.nextLine();
		Result result=new Result();
		result.fetchResult(str1, str2);
		

	}

}
