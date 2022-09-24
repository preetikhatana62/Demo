package hello;


class Array2
{
public static void main(String [] args)
{
int [] [] m={{1,2,3},{4,5,6},{7,8,9}};
int [] [] n={{7,6,5},{2,6,4},{4,5,3}};
int [] [] o= new int [3] [3];	
int i,j;


System.out.println("first matrix");
for(i=0;i<3;i++)
{  
   for(j=0;j<3;j++)
  {
	  System.out.print(m[i][j]);
	System.out.print( " ");

  }
    System.out.println();

}
 System.out.println("Second matrix");
for(i=0;i<3;i++)
{  
   for(j=0;j<3;j++)
  {
	  System.out.print(n[i][j]);
	System.out.print( " ");

  }
    System.out.println();

}
//System.out.println("Addition of two matrix");
for(i=0;i<3;i++)
{
	for(j=0;j<3;j++)
	{
		o[i] [j]= m[i] [j]+n[i] [j];
		
	}
}
System.out.println("Addition of two matrix");
for(i=0;i<3;i++)
{
	for(j=0;j<3;j++)
	{
		System.out.print(o[i] [j]);
		System.out.print(" ");
		
	}
	System.out.println();

}
}
}