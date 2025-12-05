public class SavingsAcc extends Account
{
    int Acc_id;
    double Acc_Bal;
    private double min_Bal;
    
    public double getMin_Bal() {
        return min_Bal;
    }
    public void setMin_Bal(double min_Bal) {
        this.min_Bal = min_Bal;
    }

    public SavingsAcc(int id,String name,String email,double amount)
    {
        super(name,email);
        this.Acc_id = id;
        this.Acc_Bal = amount;
    }
    public void Cal_Bal()
    {
        System.out.println(this.Acc_Bal - this.getMin_Bal());
    }
}