public class EvenNumbers
{
    public static void func(int st,int ls)
    {
        for(int i=st;i<ls;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String args[])
    {
        int st=9;
        int ls=100;
        func(st,ls);
    }
}