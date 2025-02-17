import java.util.*;
public class ExamScores
{
    public static void func()
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int c=0;
        while (c<5)
        {
            int num=sc.nextInt();
            sum=sum+num;
            c++;
        }
        int average=sum/5;
        System.out.println(average);
    }
    public static void main(String args[])
    {
        func();
    }
}