class Acoount
{
    public boolean open_Acc()
    {
        System.out.println("Account opened");
        return true;
    }

    public boolean deposit_Amo()
    {
        System.out.println("Amount deposited");
        return true;
    }

    public double get_Bal()
    {
        return 45000.00;
    }
}

public class Test
{
    public static void main(String[] args) 
    {
        Account obj = new Acoount();
        obj.open_Acc();
        obj.deposit_Amo();
        obj.get_Bal();
    }
}