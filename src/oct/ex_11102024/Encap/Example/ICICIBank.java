package oct.ex_11102024.Encap.Example;

public class ICICIBank {
    private String name;
    private long Balance;

    public ICICIBank(String name, long balance) {
        this.name = name;
        Balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return Balance;
    }

    public void setBalance(long balance, boolean isAdmin) {
        if(isAdmin) {
            Balance = balance;
            System.out.println("Allowed");
        }
        else {
            System.out.println("not Allowed");
        }
    }
}
