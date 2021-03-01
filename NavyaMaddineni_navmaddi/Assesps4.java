//Program to print a two dimensional array after changing rows and columns.
class rearrange{
	public static void main(String[] args){
		//Initialising two dimensional array.
		int[][] a={{1,2,3},{4,5,6}};
		interchange(a);
		}
		//interchanging rows and columns.
	private static void interchange(int[][] a)
	{
		int[][]b=new int[a[0].length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				b[j][i]=a[i][j];
			}
		}
		print(b);
	}
	//Printing the array after interchanging.
	private static void print(int[][] b)
	{
	for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
				System.out.println();
		}	
	}
}