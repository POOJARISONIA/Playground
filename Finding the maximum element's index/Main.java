import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<=n-1;i++)
    {
      arr[i]=in.nextInt();
    }
      int max=arr[0];
      int max_id=-1;
      for(int i=0;i<=(n-1);i++)
      {
        if(arr[i]>max)
        {
          max=arr[i];
          max_id=i;
        }
         
      }
      System.out.println(max_id);
    }
      
}