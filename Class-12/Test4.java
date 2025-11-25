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
        B obj = new B();
        System.out.println(obj.interest());
        System.out.println(obj.name());
    }
}