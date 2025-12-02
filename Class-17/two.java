class GrandFather
{
    public String m1()
    {
        return "Rahul";
    }
}

class parent extends GrandFather
{
    public double m2()
    {
        return 45000.45;
    }
}

class child extends parent
{
    public boolean m3()
    {
        return false;
    }
}

public class two
{
    public static void main(String[] args)
    {
        child obj = new child();
        System.out.println(obj.m1());
        System.out.println(obj.m2());
        System.out.println(obj.m3());
    }
}