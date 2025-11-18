package pack1;

class B
{
    public void M5()
    {
        System.out.println("Public Class-A & Public Method-M5");
    }

    public static void main(String[] args) 
    {
        A obj = new A();
        obj.M1();
        obj.M2();
        //obj.M3();
        obj.M4();

        B obj1 = new B();
        obj1.M5();
    }
}