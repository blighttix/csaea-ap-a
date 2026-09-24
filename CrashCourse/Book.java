public class Book {

    String bookTitle;
    int publishYear;
    String authorName;
    boolean inCirculation;
    boolean isOverdue;
    int daysOut;
    double feeValue;

    public Book(String bookTitle, String authorName, int publishYear) {

    this.bookTitle = bookTitle;
    this.authorName = authorName;
    this.publishYear = publishYear;

    inCirculation = false;
    isOverdue = false;
    daysOut = 0;
    feeValue = 0.0; }

    public void checkOut() {
        if (inCirculation = true) {
            System.out.println(bookTitle + " is already taken out!");
        } else {
            System.out.println(bookTitle + " has been checked out.");
        } }

    public void passDay() {
        System.out.println("a day has passed.");
        if (inCirculation = true) {
            daysOut += 1;
        }
        if (daysOut > 30) {
            isOverdue = true;
        }
        if (isOverdue = true) {
            feeValue += 0.02;
        } }

    public void returnBook() {
        System.out.println("you have returned " + bookTitle);
        isOverdue = false;
        if (feeValue > 0) {
            System.out.println("you owe $" + feeValue + " to the library.");
        } }

    public void payFee(double payment) {
        if ((inCirculation = false) && (feeValue > 0)) {
            feeValue -= payment;
            System.out.println("you now owe $" + feeValue);
        }
        else {
            System.out.println("you cannot pay right now.");
        }
    }

    public void harmBook() {
        if (inCirculation = true) {
            feeValue += 5.0;
            System.out.println("you'll have to pay for that later.");
        }
        else {System.out.println("not our book, not our problem.");}
    }
    
}
