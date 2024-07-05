class Student
{
int admno;
String name;
Student(int x,String y)
{
admno=x;
name=y;
}
void show()
{
System.out.println(admno+" "+name);
}
}
class Tests
{
public static void main(String args[])
{
Student s1=new Student(111,"aaa");
s1.show();
Student s2=new Student(222,"bbb");
s2.show();
}
}

