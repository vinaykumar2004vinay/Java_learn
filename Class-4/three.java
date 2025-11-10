class three
{
    int a;
    int b = 10;
    static int c = 20;
    public static void main(String args[])
    {
        three obj1 = new three();
        three obj2 = new three();

        System.out.println(obj1.a);
        System.out.println(obj1.a + obj2.b);
        System.out.println(c + obj1.c + three.c);
    }
}          