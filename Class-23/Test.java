class Emp{}
class Test
{
    public static void main(String[] args)
    {
        String s1 = "Rahul";
        String s2 = new String("Rahul");
        String s3 = new String("Gandhi");

        Emp e1 = new Emp();
        Emp e2 = new Emp();

        int a = 100;
        int b = 200;
        int c = 300;

        System.out.println(e1.equals(e2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(e1 == e2);
        System.out.println(s1 == s2);
        System.out.println(a == b);
    }
}