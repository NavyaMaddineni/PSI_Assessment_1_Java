//Program to check whether the given two double variables lies between 0 and 1.
//Importing Scanner class
import java.util.Scanner;
class range{
	public static void main(String[] args){
		//Creating object of Scanner class.
		Scanner sc=new Scanner(System.in);
		double d1,d2;
		//Taking two double values as input from user.
		d1=sc.nextDouble();
		d2=sc.nextDouble();
		//Checking whether both the values lies in between 0 and 1.
		if((d1>0)&&(d1<1)&&(d2>0)&&(d2<1))
		{
			System.out.println("True");
		}
		else
		{	
	       System.out.println("False");
		}
	}
}