package codeitrevrsestring;

import java.util.Scanner;

public class Stringreverse 
{
public static void main(String[] arg)
{
Scanner sc= new Scanner (System.in);
System.out.println("enter the string");
char[] str =sc.nextLine().toCharArray();
System.out.println("reverse string is");
for (int i= str.length ;i>=0 ;i--)
{
System.out.println(str[i]);

}
System.out.println();
}
}
