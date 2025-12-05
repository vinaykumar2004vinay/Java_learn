class Test
{
    public static void main(String[] args)
    {
        SavingsAcc obj1 = new SavingsAcc(101,"Rahul","rahulgandhi@gmail.com",4000.00);
        obj1.Cal_Bal();
        CurrentAcc obj2 = new CurrentAcc(102,"Sonia","soniagandhi@gmail.com",50000.00);
        obj2.Cal_Bal();
    }
}