import java.util.*;
class Overloading
{
void add(int x,int y,int z)
{
System.out.println("3 int arg");
}
void add(double a,double b)
{
System.out.println("Two double arg");
}
public static void main(String args[])
{
Overloading t1=new Overloading();
t1.add(12,13,89);
t1.add('A','B');
}
}
