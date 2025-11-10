class two {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bl;

    public static void main(String[] args) 
    {
        two t1 = new two();
        System.out.println("byte: " + t1.b);
        System.out.println("short: " + t1.s);
        System.out.println("int: " + t1.i);
        System.out.println("long: " + t1.l);
        System.out.println("float: " + t1.f);
        System.out.println("double: " + t1.d);
        System.out.println("char: '" + t1.c);
        System.out.println("boolean: " + t1.bl);
    }
}