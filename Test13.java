import java.util.*;
class Test13
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
int target=s.nextInt();
for(int i=0;i<n-1;i++)
{

if(a[i]+a[i+1]==target)
{
System.out.print(i+" "+j);
}
}
}
}

}