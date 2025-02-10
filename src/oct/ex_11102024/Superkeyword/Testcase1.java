package oct.ex_11102024.Superkeyword;

public class Testcase1 extends Baseclass{

    //Testcase is a type of Baseclass-single inheritence
    Testcase1()
    {
        super();//DC of parent
        this.setBrowser("edge",true);
    }

    @Override
    public void setBrowser(String browser, boolean isAuth)
    {
        super.setBrowser(browser,isAuth);
    }

}
