import java.io.*;
import java.util.*;
public class alphrnt
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String c=s.next();
char []b=c.toCharArray();
int a=b[0];
if((64<a||96<a)&&(91>a||123>a))
{
System.out.println("alphabet");
}
else
{System.out.println("not");
}}}
