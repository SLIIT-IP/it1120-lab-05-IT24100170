import java.util.Scanner;
public class IT24100170Lab5Q1{
	public static void main(String[]args){
	
	int num1;
	int num2;
	int num3;
	int smallest;
	int largest;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the first integer: ");
	num1 = input.nextInt();
	System.out.print("Enter the second integer: ");
	num2 = input.nextInt();
	System.out.print("Enter the third intrger: ");
	num3 = input.nextInt();
	
	smallest = num1;
	largest = num1;
	
	if(num2<smallest){
		smallest = num2;
	}
	else if(num2>largest){
		largest = num2;
	}
	if(num3<smallest){
		smallest = num3;
	}
	else if(num3>largest){
		largest = num3;
	}
	
	System.out.println("User entered numbers are: "+num1+" "+num2+" "+num3);
	System.out.println("The Smallest number is: "+smallest);
	System.out.print("The Largest number is: "+largest);
	
	}
}