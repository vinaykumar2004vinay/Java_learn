class Test
{
    public static void main(String[] args)
    {
        SavingsAcc obj1 = new SavingsAcc(101,"Rahul","rahulgandhi@gmail.com",40000.00);
        CurrentAcc obj2 = new CurrentAcc(102,"Sonia","soniagandhi@gmail.com",50000.00);
        // System.out.println(obj1.Cal_Bal());
        // System.out.println(obj2.Cal_Bal());
        System.out.println(AccountService.getService(obj1));
        System.out.println(AccountService.getService(obj2));
    }
}