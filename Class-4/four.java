class four
{
    int[] eids = new int[4];
    public static void main(String args[])
    {
        four obj1 = new four();
        four obj2 = new four();

        obj1.eids[0] = 101;
        obj1.eids[2] = 103;

        obj2.eids[0] = 1001;
        obj2.eids[2] = 1003;

        System.out.println();
    }
}