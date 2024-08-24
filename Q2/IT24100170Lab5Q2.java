import java.util.Scanner;
public class IT24100170Lab5Q2{
	public static void main(String[]args){
	
	int newMembers;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the number of new members introduced: ");
	newMembers = input.nextInt();
	
	switch(newMembers)
	{
		case 0:
			System.out.print("No Price");
			break;
		case 1:
			System.out.print("Pen");
			break;
		case 2:
			System.out.print("Umbrella");
			break;
		case 3:
			System.out.print("Bag");
			break;
		case 4:
			System.out.print("Travelling Chair");
			break;
		default:
			if(newMembers>=5){
				System.out.print("Headphone");
			}
			else{
				System.out.print("Input must be a number 0 or greater");
			}
			break;
		
	}
	}
}