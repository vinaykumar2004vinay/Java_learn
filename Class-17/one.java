class GrandFather
{
    public void m1()
    {
        System.out.println("GrandFather-class & m1-Method");
    }
}

class parent extends GrandFather
{
    public void m2()
    {
        System.out.println("Parent-class & m2-Method");
    }
}

class child extends parent
{
    public void m3()
    {
        System.out.println("Child-class & m3-Method");
    }
}

public class one
{
    public static void main(String[] args)
    {
        child obj = new child();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
