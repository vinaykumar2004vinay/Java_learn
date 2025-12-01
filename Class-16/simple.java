class parent 
{
    public void M1()
    {
        System.out.println("Parent-class & M1-method");
    }
}

class child extends parent
{
    public void M2()
    {
        System.out.println("Child-class & M2-method");
    }
}

public class simple
{
    public static void main(String[] args)
    {
        child obj = new child();
        obj.M1();
        obj.M2();
    }
}