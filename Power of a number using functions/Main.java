import java.util.Scanner;
class Main{
  public static int sqr_num(int base,int expo)
  {
    int result=1;
    while(expo!=0)
    {
      result=result*base;
      --expo;
    }
    return result;
  }
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
      int n2 = in.nextInt();
      int sod=sqr_num(n1,n2);
        System.out.println(sod);
    }
}