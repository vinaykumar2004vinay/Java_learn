class parent
{
    public void M1()
    {
       System.out.println("parent class & M1-method"); 
    }

    public void M2()
    {
       System.out.println("parent class & M2-method"); 
    }
}

class child extends parent
{
    public void M3()
    {
       System.out.println("child class & M3-method"); 
    }
}

public class three
{
    public static void main(String[] args)
    {
        child obj = new parent();
    }
}