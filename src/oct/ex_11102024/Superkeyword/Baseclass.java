package oct.ex_11102024.Superkeyword;

public class Baseclass {

    private String browser;

    Baseclass()
    {
        System.out.println("DC-Baseclass");
    }
    Baseclass(String b)
    {
        System.out.println("CC-Baseclass");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth)
        {
            this.browser=browser;
        }
       else {
            System.out.println("Not allowed");
        }
    }
    void openbrowser()
    {
        System.out.println("Open chrome browser!!");
    }
    void openbrowser(String browsername)
    {
        System.out.println("Open Browser!!->"+browsername);
    }
    void closebrowser()
    {
        System.out.println("Close browser!!");
    }
}
