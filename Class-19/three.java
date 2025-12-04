class Employee
{
    int eid;
    String ename;
    String gender;
    double esal;

    Employee(int id, String name, String gender, double sal)
    {
        System.out.println("Inside constructor method");
        this.eid = id;
        this.ename = name;
        this.gender = gender;
        this.esal = sal;
    }

    public void add_bonus(double amount)
    {
        this.esal = this.esal + amount;
    }

    public double get_sal()
    {
        return this.esal;
    }

    public static void main(String[] args)
    {
        Employee e1 = new Employee(101, "Rahul", "Male", 45000.45);
        Employee e2 = new Employee(102, "Sonia", "Female", 55000.45);

        System.out.println("Employee Id:" + e1.eid + " Name:" + e1.ename);
        System.out.println("Employee Id:" + e2.eid + " Name:" + e2.ename);

        e1.add_bonus(1000.00);
        e1.add_bonus(100.00);
        e2.add_bonus(50000.00);
        
        System.out.println(e1.esal);
        System.out.println(e2.esal);

        System.out.println(e1.get_sal());
        System.out.println(e2.get_sal());
    }
}