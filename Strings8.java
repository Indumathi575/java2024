import java.util.*;
class Strings8
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String s1[]=new String[5];
for(int i=0;i<5;i++)
{
s1[i]=s.next();
}
for(int i=0;i<5-1;i++)
{
for(int j=i+1;j<5;j++)
{
if(s1[i].compareTo(s1[j])>0)
{
String t=s1[i];
s1[i]=s1[j];
s1[j]=t;
}
}
}
for(int i=0;i<5;i++)
{
System.out.println(s1[i]);
}

}
}
