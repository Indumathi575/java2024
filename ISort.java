import java.util.*;
class ISort
{
static void InsertionSort(int a[],int n)
{
for(int i=1;i<n;i++)
{
int j=i;
while(j>0 && a[j]<a[j-1])
{
int t=a[j];
a[j]=a[j-1];
a[j-1]=t;
j--;
}
}
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
InsertionSort(a,n);
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}