import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code hereclass FactorialExample{
    Scanner in= new Scanner(System.in);
  int i,fact=1;  
  int number=in.nextInt();//It is the number to calculate factorial    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println(fact);    
 }  
}