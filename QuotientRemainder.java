import java.util.Scanner;

class QuotientRemainder{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		System.out.println("The Quotient is "+(number1/number2)+" and Reminder is "+(number1%number2)+ " of two numbers "+number1+" and "+number2);
	}
}