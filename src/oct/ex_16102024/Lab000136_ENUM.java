package oct.ex_16102024;

public class Lab000136_ENUM {
    enum APIConstantsEndpoints{

        Base_url("https://app.vwo.com"),
        Login_url("https://app.vwo.com/#/login");



        private String name;
        APIConstantsEndpoints(String name)
        {
            this.name=name;
        }
        String getvalue()
        {
            return name;
        }
}
}
