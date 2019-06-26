import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner scan=new Scanner(System.in);
      String str1=scan.nextLine();
      String str2=scan.nextLine();
      String str3=scan.nextLine();
      StringBuilder sb1=new StringBuilder(str1);
       StringBuilder sb2=new StringBuilder(str2);
       StringBuilder sb3=new StringBuilder(str3);
      StringBuilder temp=new StringBuilder( );
      int s1=sb1.length();
      int s2=sb2.length();
      int s3=sb3.length();
      int i,j;
      for(i=0;i<=(s1-1)-(s2-1);i++)
      {
        boolean is_matching =true;
        for(j=0;j<s2;j++)
        {
          if(sb1.charAt(i+j)!=sb2.charAt(j))
          {
            is_matching =false;
          }
        }
            if(is_matching==true)
            {
              String string=sb3.substring(0,s3);
              temp.append(string);
              i=i+(s2-1);
            }
            else
            {
              char ch=sb1.charAt(i);
              temp.append(ch);
            }
      }
      for(j=i;j<=(s1-1);j++)
      {
        char ch=sb1.charAt(j);
        temp.append(ch);
      }
      System.out.println(temp);
    }
}
           