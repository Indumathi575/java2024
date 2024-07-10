import java.util.*;
class Father
{
void surName()
{
System.out.println("B");
}
void designation()
{
System.out.println("clerk");
}
}
class Child extends Father
{
void getName()
{
System.out.println("Indu");
}
void designation()
{
System.out.println("Java Programmer");
}
}
class Overriding
{
public static void main(String args[])
{
Child c1=new Child();
c1.getName();
c1.surName();
c1.designation();
}
}