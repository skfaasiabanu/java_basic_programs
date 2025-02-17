import java.util.*;
public class PrimeNumber
{
    public static boolean func(int num)
    {
        int div=2;
       while(div<num)
       {
        if(div%2==0)
        {
         return false;   
        }
        else{
            div=div+1;
        }
       }
       return true;
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int num=4;
       System.out.println(func(num));
    }
}