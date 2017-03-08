import java.util.Scanner;

public class ArithDemo2
{
    public static void main(String[] vars)
    {
	double var1;
	double var2;
	double sum;
	double diff;
	double avg;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first double >> ");
	var1 = input.nextDouble();
	System.out.print("Enter second double >> ");
	var2 = input.nextDouble();
	sum = var1+var2;
	diff = var1-var2;
	avg = (var1+var2)/2.0;
	System.out.println(var1 + " + " + var2 +  " = " + sum);
	System.out.println(var1 + " - " + var2 + " = " + diff);
	System.out.println("The avg of " + var1 + " and " + var2 + " is: " + avg);
	System.out.println("DONE");
    }
}
