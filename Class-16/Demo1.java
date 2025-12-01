public class Demo1
{
    public static void main(String[] args)
    {
        Employee obj = new Employee();
        obj.setEid(101);
        obj.setEname("Rahul");
        obj.setLocation("Bangaluru");
        obj.setAvail(true);

        System.out.println(obj.getEid());
        System.out.println(obj.getEname());
        System.out.println(obj.getLocation());
        System.out.println(obj.isAvail());
    }
}