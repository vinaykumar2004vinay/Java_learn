class one
{
    int a = 10;
    int b = 20;
    static int c = 30;
    public static void main(String args[])
    {
        one t1 = new one();
        one t2 = new one();
        System.out.println(t1.a+t2.b);

        t2.a = 11;
        System.out.println(t1.a+t2.a);

        System.out.println(t1.b+t2.b+one.c);

        one.c = 33;
        System.out.println(t1.b+t2.b+t1.c);
    }
}