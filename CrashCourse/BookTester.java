public class BookTester {
    public static void main(String[] args) {
        
        Book book1 = new Book("book1", "someone", 2000);
        Book book2 = new Book("book2", "someone", 2001);

        System.out.println("what is the fee for book1? $"+ book1.feeValue);

        book1.returnBook();
        book1.checkOut();
        book2.passDay();
        book1.harmBook();
        book1.returnBook();
        book1.payFee(4.90);

        System.out.println("what is the fee for book1? $"+ book1.feeValue);
    }
}
