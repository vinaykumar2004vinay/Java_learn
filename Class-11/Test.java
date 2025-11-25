class parent
{
    final void M1()
    {
        System.out.println("parent class & M1 method");
    }

    void M2()
    {
        System.out.println("parent class & M2 method");
    }
}

class child extends parent
{
    void M1()
    {
        System.out.println("child class & M1 method");
    }

    void M3()
    {
        System.out.println("child class & M3 method");
    }
}
public class Test
{
    public static void main(String[] args)
    {}
}