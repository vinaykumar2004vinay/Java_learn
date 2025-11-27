interface Bank
{
    double calc_Bal();
}

class Account implements Bank
{
    public double calc_Bal()
    {
        return 500.00;
    }
}

class three
{
    public static void main(String[] args)
    {
        Account obj = new Account();
        System.out.println(obj.calc_Bal());
    }
}