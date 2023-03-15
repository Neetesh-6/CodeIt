package FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {
public static void main (String[] arg)
{
	Scanner sc= new Scanner(System.in);
	int num = sc.nextInt();
	System.out.println("enter the number ");
	for (int i=0; i<=num; i++)
	{
		if (num%3==0)
		{
			System.out.println("Fizz");
		}
		else if(num%5==0)
		{
			System.out.println("Buzz");
		}
		else if(num%3==0 && num%5==0)
		{
			System.out.println("FizzBuzz");
		}
		
	}
	}
}
