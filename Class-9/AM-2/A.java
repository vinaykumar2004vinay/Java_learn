package pack1;

public class A
{
    public void M1()
    {
        System.out.println("Public Class-A & Public Method-M1");
    }

    void M2()
    {
        System.out.println("Public Class-A & Default Method-M2");
    }

    private void M3()
    {
        System.out.println("Public Class-A & Private Method-M3");
    }

    protected void M4()
    {
        System.out.println("Public Class-A & protected Method-M4");
    }
}