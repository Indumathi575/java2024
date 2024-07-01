import java.util.*;
import java.util.Arrays;
class MergeSort
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int m=s.nextInt();
int b[]=new int[m];
for(int i=0;i<m;i++)
{
b[i]=s.nextInt();
}
int c[]=new int[n+m];
int k=0;
for(int i=0;i<n;i++)
{
c[k]=a[i];
k++;
}
for(int i=0;i<m;i++)
{
c[k+i]=b[i];
k++;
}
Arrays.sort(c);
for(int i=0;i<k;i++)
{
System.out.print(c[i]+" ");
}
}
}
