import java.util.*;
class Test6
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int count=0;
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
count++;
}
}
}
System.out.print(count);
}
}