import java.util.*;
class Sample
{
int a,b;
void get(int a,int b)
{
this.a=a;
this.b=b;
}
void show()
{
System.out.println("a="+a+"b="+b);
}
}
class Addition extends Sample
{
void total()
{
System.out.println("Addition="+(a+b));
}
}
class Product extends Sample
{
void multiply()
{
System.out.println("Multiply="+(a*b));
}
}
class Hierarchical
{
public static void main(String args[])
{
Addition a1=new Addition();
a1.get(23,64);
a1.show();
a1.total();
Product p1=new Product();
p1.get(10,5);
p1.show();
p1.multiply();
}
}

