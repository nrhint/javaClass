import java.util.Scanner;

public class ArithDemo
{
    public static void main(String[] vars)
    {
	int var1;
	int var2;
	long sum;
	int diff;
	double avg;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first int >> ");
	var1 = input.nextInt();
	System.out.print("Enter second int >> ");
	var2 = input.nextInt();
	sum = var1+var2;
	diff = var1-var2;
	avg = (var1+var2)/2.0;
	System.out.println(var1 + " + " + var2 +  " = " + sum);
	System.out.println(var1 + " - " + var2 + " = " + diff);
	System.out.println("The avg of " + var1 + " and " + var2 + " is: " + avg);
	System.out.println("DONE");
    }
}
