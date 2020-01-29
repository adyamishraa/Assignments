package User_defined_Exception;
import java.util.*;


	class MyException extends Exception {
		public MyException(String st) {
		super(st);
		}
	}

	public class CustomExcep{
		static void myCode(int b) throws MyException{
			if(b==0) {
				try {
					throw new MyException("Number is 0");
				}catch(MyException e) {
					System.out.println(e);
				}
				System.out.println("out of catch");

			}
				else {
					System.out.println(b);
				}
		}
			public static void main(String arg[]) throws MyException {
				Scanner s=new Scanner(System.in);
				
				System.out.println("Enter your number:");
				int a=s.nextInt();
				myCode(a);
			}
	}