public class Account1 {
    int acc_Id;
    String acc_Name;
    double acc_Bal;
    public Account1(int id, String name, double amount){
        this.acc_Id=id;
        this.acc_Name=name;
        this.acc_Bal=amount;
    }
    public static void main(String[] args) {
        Account1 a1=new Account1(101,"Rahul",5000.00);
        Account1 a2=new Account1(102,"Sonia",6000.00);
        Account1 a3=new Account1(103,"Priya",7000.00);
        System.out.println(a1.acc_Id);
        System.out.println(a1.acc_Name);
        System.out.println(a1.acc_Bal);
        
        System.out.println(a2.acc_Id);
        System.out.println(a2.acc_Name);
        System.out.println(a2.acc_Bal);

        System.out.println(a3.acc_Id);
        System.out.println(a3.acc_Name);
        System.out.println(a3.acc_Bal);
    }
}