import java.util.*;
import java.lang.String;
class Var_Arg
{
void show(int ...a)
{
System.out.println("Var-arg method"+Arrays.toString(a));
}
public static void main(String args[])
{
Var_Arg t1=new Var_Arg();
t1.show();
t1.show(23,56);
t1.show(10,3,66,88);
}
}