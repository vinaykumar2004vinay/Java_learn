public class Test2 {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bl;
    String str;

    public Test2() {
        super();
        this.c = 'A'; // clearer than 65
    }

    public static void main(String[] args) {
        Test2 t1 = new Test2();
        System.out.println(t1.i);    // 0
        System.out.println(t1.d);    // 0.0
        System.out.println(t1.c);    // A
        System.out.println(t1.str);  // null
    }
}