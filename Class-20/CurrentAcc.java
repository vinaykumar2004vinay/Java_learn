public class CurrentAcc extends Account
{
    int Acc_Id;
    double Acc_Bal;
    double min_Bal = 5000.00;
    public CurrentAcc(int id,String name,String email,double amount)
    {
        super(name,email);
        this.Acc_Id = id;
        this.Acc_Bal = amount;
    }
    public void Cal_Bal()
    {
        System.out.println(this.Acc_Bal - this.min_Bal);
    }
}