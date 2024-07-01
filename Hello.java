import java.util.*;
import java.util.Arrays;


class Hello
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a);
int k=n;
int t=1,m=0;
for(int i=0;i<n;i++)
{
if(i%2==0)
{
b[i]=a[k-1];
k--;
}
else
{
b[i]=a[m];
m=m+1;
}
}
for(int i=0;i<n;i++)
{
System.out.print(b[i]+" ");
}
}
}


