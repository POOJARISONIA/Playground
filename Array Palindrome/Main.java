import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=in.nextInt();
      }
      int left=0;
      int right=size-1;
      int palindrome=0;
      while(left<right)
      {
        if(arr[left]!=arr[right])
        {
          palindrome=1;
         
        }
         left++;
        right--;
      }
      if(palindrome==0)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}

        