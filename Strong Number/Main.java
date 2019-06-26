import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num=in.nextInt();
      int sum=0,i,p,r;
      int save_num;
      save_num=num;
      while(num!=0)
      {
        i=1;
        p=1;
        r=num%10;
        while(i<=r)
        {
          p=p*i;
          i++;
        }
        sum=sum+p;
        num=num/10;
      }
      if(sum==save_num)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}