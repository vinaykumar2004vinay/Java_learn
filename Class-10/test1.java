class test1
{
    public static void main(String[] args)
    {
        final int eid = 101;
        eid = 110;
        System.out.println(eid);    //error: cannot assign a value to final variable eid
    }
}