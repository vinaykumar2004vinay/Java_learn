class two {
    int eid = 101;
    String ename = "Rahul";

    static String org_Name = "TCS";

    public static void main(String[] args) {
        two t1 = new two();

        System.out.println(t1.org_Name);     // using object
        System.out.println(two.org_Name);    // using class name
        System.out.println(org_Name);        // directly
    }
}