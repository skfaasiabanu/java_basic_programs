public class AreaOfCircle{
    public static float func(int radius)
    {
        float area=3.14f*radius*radius;
        return area;
    }
    public static void main(String args[])
    {
        int radius=2;
        System.out.println(func(radius));
    }
}