public class SavingsAcc extends Account
{
    int Acc_id;
    double Acc_Bal;
    double min_Bal = 500.00;

    public SavingsAcc(int id,String name,String email,double amount)
    {
        super(name,email);
        this.Acc_id = id;
        this.Acc_Bal = amount;
    }

    public double Cal_Bal()
    {
        return this.Acc_Bal-this.min_Bal;
    }
}