class Demo
{
    public static void main(String[] args) 
    {
        Account obj = new Account();
        
        obj.setAcc_id(101);
        System.out.println("Account Id = " + obj.getAcc_id());

        obj.setAcc_name("Vinay");
        System.out.println("Account Name = " + obj.getAcc_name());

        obj.setAcc_bal(1000.00);
        System.out.println("Account Balance = " + obj.getAcc_bal());
    }
}