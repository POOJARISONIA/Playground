import java.util.Scanner;
class Main
{
  public static int square_num(int num)
  {
    int sqr=(num*num);
    return sqr;
  }
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n1 =in.nextInt();
      int sod=square_num(n1);
      System.out.println(sod);
	 // Type your code here   
	} 
}