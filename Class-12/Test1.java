abstract class bank
{
    public abstract double interest();
}

class Test1
{
    bank obj = new bank();                       //error: bank is abstract; cannot be instantiated
}