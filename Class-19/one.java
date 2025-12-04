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

    public static void main(String[] args)
    {
        Employee e1 = new Employee(101, "Rahul", "Male", 45000.45);
        Employee e2 = new Employee(102, "Sonia", "Female", 55000.45);

        System.out.println("Employee Id:" + e1.eid + " Name:" + e1.ename);
        System.out.println("Employee Id:" + e2.eid + " Name:" + e2.ename);
    }
}