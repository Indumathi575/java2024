import java.util.*;
class Strings7
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String s1=s.next();
String s2="";
for(int i=s1.length()-1;i>=0;i--)
{
s2=s2+
s1.charAt(i);
}
System.out.println(s2);
if(s1.equals(s2))
{
System.out.println("Same");
}
else
System.out.println("Not same");
}
}