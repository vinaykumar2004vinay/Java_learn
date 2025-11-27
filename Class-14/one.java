interface user
{
    void login();
    void logout();
}

class userimp implements user
{
    public void login()
    {
        System.out.println("Login");
    }

    public void logout()
    {
        System.out.println("Logout");
    }

    public static void main(String[] args)
    {
        userimp obj = new userimp();
        obj.login();
        obj.logout();
    }
}