package oct.ex_11102024.Encap.Accessmodifier.police;

public class cop {
   public int gun;
    public String idcard;

    public cop(int gun) {
        this.gun = gun;
    }

    protected void canIshoot()
    {
        System.out.println("Yes!Yes u can");
    }
}
