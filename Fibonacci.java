public class FIbonacci
{
    public static void func(int n)
    {
        int first=0;
        int second=1;
        for(int i=1;i<=n;i++)
        {
            System.out.println(first+" ");
            int third=first+second;
            first=second;
            second=third;
        }
    }
    public static void main(String args[])
    {
        int n=3;
        func(n);
    }
}