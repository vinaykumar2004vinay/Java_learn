class Grandparent
{
    public void M1()
    {
        System.out.println("Grandparent-class & M1-method");
    }
}

class parent extends Grandparent
{
    public void M2()
    {
        System.out.println("Parent-class & M2-method");
    }
}

class child extends parent
{
    public void M3()
    {
        System.out.println("Child-class & M3-method");
    }
}

public class Test
{
    public static void main(String[] args)
    {
        child obj = new child();
        obj.M1();
        obj.M2();
        obj.M3();
    }
}