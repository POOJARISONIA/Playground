import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int a=in.nextInt();
      int sum=0;
      int n;
      while(a!=0)
      {
        n=a%10;
        sum=sum+n;
        a=a/10;
      }
      System.out.println(sum);
	}
}