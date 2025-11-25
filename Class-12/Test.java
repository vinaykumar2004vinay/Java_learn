abstract class Bank
{
    public abstract double interest();

    public String Name()
    {
        return "Rahul";
    }
}

class Account extends Bank
{
    public double interest()
    {
        return 5.46;
    }

    public static void main(String[] args)
    {
        Account obj = new Account();
        System.out.println(obj.interest());
        System.out.println(obj.Name());
    }
}