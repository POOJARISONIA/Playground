import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int sd=((n/10)%10);
      System.out.println(sd);
	}
}