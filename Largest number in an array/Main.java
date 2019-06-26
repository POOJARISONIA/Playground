import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
        // Get the array size
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        // Get the array elements
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            arr[idx] = in.nextInt();
        }
      int max=arr[0];
      for(int idx = 0; idx <= arr_size - 1; idx++)
        {
        if(arr[idx]>max)
          max=arr[idx];
      }
          System.out.println(max);
        // Type your code here
    }
}