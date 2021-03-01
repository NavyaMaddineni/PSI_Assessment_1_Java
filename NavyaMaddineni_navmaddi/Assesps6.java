//Program to convert decimal to binary and count number of zeros in binary representation.
import java.util.Scanner;
class binary{
	public static void main(String[] args){
		//creating object of Scanner class.
		Scanner sc=new Scanner(System.in);
		int n;
		//Taking the input from the user.
		n=sc.nextInt();
		DecToBin(n);
	}
	//method to convert from decimal to binary.
	private static void DecToBin(int n){
		int div,sum=0,num,count=0,temp=1;
		num=n;
		while(num>0)
		{
			div=num%2;
			if(div==0)
			{
				count++;
			}
			sum=sum+div*temp;
			temp=temp*10;
			num=num/2;
		}
		//Printing binary representation and number of zeroes.
		System.out.println("Binary Representation is:"+sum);
		System.out.println("Number of zeroes:"+count);
		
	}
}