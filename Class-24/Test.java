class user{}
class Empl{}
public class Test
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
        //System.out.println(u1==S1);
    }
}