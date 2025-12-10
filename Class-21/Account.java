public class Account extends Bank
{
    String Acc_Name;
    String Acc_Email;

    public Account(String name,String email)
    {
        this.Acc_Name = name;
        this.Acc_Email = email;
    }

    public double Cal_Bal()
    {
        return 0.0;
    }
}