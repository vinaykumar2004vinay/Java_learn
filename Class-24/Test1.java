class user{}
class Empl extends user{}
public class Test1
{
    public static void main(String[] args)
    {
        user u1 = new user();
        Empl e1 = new Empl();
        Empl e2 = new Empl();
        String S1 = new String("Rahul");
        String S2 = "Rahul";
        String S3 = new String("Gandhi");
        String S4 = "Rahul Gandhi";
        int a = 100;
        int b = 100;

        System.out.println(u1.equals(e1));
        System.out.println(u1.equals(S1));
        System.out.println(u1==e1);
        System.out.println(S1==S2);
        System.out.println(S1.equals(S2));
        System.out.println(S3.equals(S1));
    }
}