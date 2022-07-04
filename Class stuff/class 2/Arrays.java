class Arrays
{
public static void main(String[] args) //psvm(String args[]) //psvm(String []args)
{
int c[];
int a[]=new int[3];

a[0]=1;
a[1]=2;
a[2]=3;

for(int i=0;i<3;i++)
System.out.println(a[i]);

int b[]={1,2,3,4,5,6,7};
for(int i=0;i<b.length;i++)
System.out.println(b[i]);

c=new int[5];
for(int i=0;i<c.length;i++)
System.out.println(c[i]);

int matrixa[][]=new int[3][3];
for(int i=0;i<3;i++)
for(int j=0;j<3;j++)
{
matrixa[i][j]=i+j;
System.out.println(matrixa[i][j]);
}

int matrixb[][]=new int[3][4];
for(int i=0;i<matrixb.length;i++)
for(int j=0;j<matrixb[i].length;j++) //for(int j=0;j<matrixb.length;j++)
{
matrixb[i][j]=i*j;
System.out.println(matrixb[i][j]);
}

/*for(int i=0;i<3;i++)
System.out.println(a[i]);
replace this for loop into for-each loop*/

System.out.println("for-each 1D array");
for(int i : a)
System.out.println(i);

/*int matrixa[][]=new int[3][3];
for(int i=0;i<3;i++)
for(int j=0;j<3;j++)
{
matrixa[i][j]=i+j;
System.out.println(matrixa[i][j]);
}*/
System.out.println("for-each 2D array");
for(int i[] : matrixa)
for(int j: i)
System.out.println(j);
}
}