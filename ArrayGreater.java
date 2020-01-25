import java.io.*;
import java.util.*;
class Practice2
{
public int[] add(int a[])
{
int b[]=new int[3];
if(a[0]>a[2])
{
for(int i=0;i<3;i++)
b[i]=a[0];
}
else
{
for(int i=0;i<3;i++)
b[i]=a[2];
}
return b;
}
public static void main(String...poori)
{
Practice2 obj=new Practice2();
int a[]={2,3,5};
int b[]=obj.add(a);
for(int i=0;i<3;i++)
System.out.print(b[i]+" ");
}
}