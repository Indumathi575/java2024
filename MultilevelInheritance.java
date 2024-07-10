import java.util.*;
class GrandFather
{
String gname;
void getg(String gname)
{
this.gname=gname;
}
void showg()
{
System.out.println("GrandFather name="+gname);
}
}
class Father extends GrandFather
{
String fname;
void getf(String fname)
{
this.fname=fname;
}
void showf()
{
System.out.println("Father name="+fname);
}
}
class Daughter extends Father
{
String dname;
void get(String dname)
{
this.dname=dname;
}
void show()
{
System.out.println("Daughter name"+dname);
}
}
class MultilevelInheritance
{
public static void main(String args[])
{
Daughter d=new Daughter();
d.getg("Mallaiah");
d.showg();
d.getf("Thirupathi");
d.showf();
d.get("Indu");
d.show();
}
}