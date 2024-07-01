import java.util.*;
class Arrays1
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
int k=s.nextInt();
int b[]=new int[n];
int k=0;
for(int i=k;k<n;i++)
{
b[k++0]=a[i];
}
for(int i=0;i<k;i++)
{
b[k++]=a[i];
}
for(int i=0;i<n;i++)
{
System.out.print(b[k]+" ");
}
}
}
