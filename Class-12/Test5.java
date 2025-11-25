abstract class A
{
    public abstract double interest();

    public String name()
    {
        return "Rahul";
    }
}

class B extends A
{
    public double interest()
    {
        return 454.5465;
    }

    public static void main(String[] args)
    {
        B b = new B();
        System.out.println(b.interest());
        System.out.println(b.name());
    }
}