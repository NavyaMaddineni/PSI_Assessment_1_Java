//Program to check whether all the given 4 integer values are equal or not.
//Importing the Scanner class.
import java.util.Scanner;
class compare{
	public static void main(String[] args){
		//Creating object for scanner class.
		Scanner sc=new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter the 4 numbers:");
		//taking 4 integer values as input.
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		//Checking whether all the values are equal or not.
		if((a==b)&&(b==c)&&(c==d))
		{
		System.out.println("Numbers are equal");
		}
		else
		{
		System.out.println("Numbers are not equal");
		}
	}
}