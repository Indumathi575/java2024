import java.util.*;
class Strings10
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.nextLine();
int alp=0,up=0,lo=0,d=0,sp=0;
for(int i=0;i<str.length();i++)
{
    if(Character.isLetter(str.charAt(i)))
    {
     alp++;
        if(Character.isUpperCase(str.charAt(i)))
         {
          up++;
         }
        else
        {
         lo++;
        }
     }

    else if(Character.isDigit(str.charAt(i)))
   {
   d++;
   }
   else
   {
   sp++;
   }
}
System.out.println("Alphabets:"+alp);
System.out.println("Upper case:"+up);
System.out.println("Lower case:"+lo);
System.out.println("Digit:"+d);
System.out.println("Special Symbols:"+sp);

}
}


