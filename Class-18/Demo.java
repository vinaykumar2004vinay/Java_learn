class Account
{
    int acc_id;
    String acc_name;
    double acc_Bal;

    Account(){

    }

    public void open_Acc()
    {
        System.out.println("Account opened");
    }

    public static void main(String[] args) 
    {
        Account A1 = new Account();
        Account A2 = new Account();
        Account A3 = new Account();

        System.out.println(A1.acc_id);
        System.out.println(A2.acc_name);
        System.out.println(A3.acc_Bal);
    }
}