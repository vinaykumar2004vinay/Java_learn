class Employee
{
    int eid;
    String ename;
    String gender;
    double esal;
}

public class Demo
{
    public static void main(String[] args)
    {
        Employee obj1 = new Employee();
        obj1.eid = 101;
        obj1.ename = "Rahul";
        obj1.gender = "Male";
        obj1.esal = 45000.45;

        Employee obj2 = new Employee();
        obj2.eid = 102;
        obj2.ename = "Sonia";
        obj2.gender = "FeMale";
        obj2.esal = 55000.55;

        System.out.println(obj1.eid + "-" + obj1.ename + "-" + obj1.gender + "-" + obj1.esal);
        System.out.println(obj2.eid + "-" + obj2.ename + "-" + obj2.gender + "-" + obj2.esal);
    }
}