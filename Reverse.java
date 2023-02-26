import java.util.*;
class Reverse
{
  public static void main(String[] args)
  {
   
    int[] arr={2,3,4,5,6,0,7,8};
    int n=8;  
int rem[]=new int[n];  
int j=n;
    for(int i=0;i<n;i++)
    {
rem[j-1]=arr[i];
j=j-1;
    } 
   for(int i=0;i<n;i++)
{
System.out.print(" "+rem[i]);
  }
}
}