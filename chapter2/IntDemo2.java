/*take input and display it*/
import java.util.Scanner;

public class IntDemo2
{
    public static void main(String[] vars)
    {
	long aInt;
	String name;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your phone number >> ");
	aInt = input.nextLong();
	input.nextLine();
	System.out.print("Enter youy name >> ");
	name = input.nextLine();
	System.out.println("Hi " + name + ".  your phone number is: " + aInt);
    }
}
