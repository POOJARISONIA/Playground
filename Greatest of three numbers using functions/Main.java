import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int m1=in.nextInt();
      int m2=in.nextInt();
      int m3=in.nextInt();
    int max=0;
    if(m1>m2 && m1>m3)
      max=m1;
    else
      if(m2>m3)
        max=m2;
    else
      max=m3;
      System.out.println(max);
  }
}