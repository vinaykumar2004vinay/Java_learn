 class Account
 {
    int Account_Id;
    String Account_Name;
    double Account_Balance;

    static String Branch_Name;
    static String Bank_Name;

    public static void main(String args[])
    {
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();

        System.out.println(a1.Account_Id);
        System.out.println(a1.Account_Name);
        System.out.println(a1.Account_Balance);
        System.out.println(a1.Branch_Name);
        System.out.println(a1.Bank_Name);
    }
 }