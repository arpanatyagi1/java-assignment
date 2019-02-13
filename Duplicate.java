import java.util.*;
class Duplicate
{
public static void main(String args[])
{
int n,temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter array element");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("");
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
  if(a[i]>a[j])
  {
   a[i]=a[j];
   a[j]=a[i+1];
   temp=a[i];
   }
   
   }
     }
	    System.out.println("Sorted array:"+a[i]);

 }
 }
   