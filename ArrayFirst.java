import java.io.*;
import java.util.*;
class Practice1
{
public int[] add(int a[],int b[])
{
int c[]=new int[2];
if(a.length>=1&&b.length>=1)
{
//int p=2;
c[0]=a[0];
c[1]=b[0];
}
else if(a.length>=1&&b.length==0)
{// int p=1;
c[0]=a[0];
}
else if(a.length==0&&b.length>=1)
{
//int p=1;
c[0]=b[0];
}
else 
{
//int p=0;
}
return c;
}
public static void main(String...poori)
{
Practice1 obj=new Practice1();
int a[]={};
int b[]={1};
int d[]=obj.add(a,b);
for(int i=0;i<2;i++)
System.out.print(d[i]+" ");
/*}
else if(a.length>=1&&b.length==0)
{
for(int i=0;i<1;i++)
System.out.print(d[i]+" ");
}
else if(a.length==0&&b.length>=1)
{
for(int i=0;i<1;i++)
System.out.print(d[i]+" ");
}
else 
{
//for(int i=0;i<1;i++)
//System.out.print(d[i]+" ");
}*/


}
}