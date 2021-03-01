//Program to print the contents of 2-dimensional Boolean array 't' for true and 'f' for false.
class trueFalse{
public static void main(String[] args){
boolean[][] a={{true,false,true},{false,true,false}};
int row,column;
//Initalising row length and column lenth to row and column.
row=a.length;
column=a[0].length;
for(int i=0;i<row;i++)
{
	for(int j=0;j<column;j++)
	{
		if(a[i][j])
		{
			System.out.print("t");
		}
		else
		{
			System.out.print("f");
		}
		
	}
			System.out.println();
}
}
}