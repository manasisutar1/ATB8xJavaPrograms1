package Task.ex_16102024;

public class PrintmyBook extends Book{

    public PrintmyBook(String name, String author, double price) {
        super(name, author, price);
    }

    @Override
    void getDetails() {
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);
    }
}
