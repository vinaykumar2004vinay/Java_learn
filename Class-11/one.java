class parent
{
    void M1()
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

    public static void main(String[] args)
    {
        parent obj1 = new parent();
        obj1.M1();
        obj1.M2();
        System.out.println("-------------------------------------------------------");
        child obj2 = new child();
        obj2.M1();
        obj2.M2();
        obj2.M3();
        System.out.println("-------------------------------------------------------");
        parent obj3 = new child();
        obj3.M1();
        obj3.M2();
    }
}