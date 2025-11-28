public class Demo1
{
    public static void main(String[] args) 
    {
        Login obj = new Login();

        obj.setUsername("Vinay");
        System.out.println("username = " + obj.getUsername());

        obj.setPassword("12345678");
        System.out.println("password = " + obj.getPassword());
    }
}