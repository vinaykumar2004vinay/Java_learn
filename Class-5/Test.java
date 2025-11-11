class Test
{
    int a = 100;
    static int b = 200;

    public void m1()
    {
        int c = 300;
        System.out.println(c);
    }

    public void m2()
    {
        int d;
        // System.out.println(d);
    }

    public static void main(String[] args)
    {
        Test t1 = new Test();
        System.out.println(t1.a);
        t1.m1();
        t1.m2();
        Test t2 = new Test();
    }
}