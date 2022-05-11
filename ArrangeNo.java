import java.util.Scanner;
public class ArrangeNo
{
    public static void Arranging(int num)
    {
        int flag=0,freq,dig;
      for(int i=0;i<=9;i++)
      {
          int copy=num;
          freq=0;
          while(copy>0)
          {
              dig=copy%10;
                if(dig==i)
                   System.out.print(dig);
              copy/=10;     
          }
          
          
       }
       
      }
        

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        Arranging(num);
        
    }

}