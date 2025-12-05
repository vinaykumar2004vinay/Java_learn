public class CurrentAcc extends Account
{
    int Acc_Id;
    double Acc_Bal;
    private double min_Bal;

    public double getMin_Bal() {
        return min_Bal;
    }
    public void setMin_Bal(double min_Bal) {
        this.min_Bal = min_Bal;
    }

    public CurrentAcc(int id,String name,String email,double amount)
    {
        super(name,email);
        this.Acc_Id = id;
        this.Acc_Bal = amount;
    }
    public void Cal_Bal()
    {
        System.out.println(this.Acc_Bal - this.getMin_Bal());
    }
}