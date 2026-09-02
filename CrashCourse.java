public class CrashCourse {

public static void main(String[] args) {
    
    // comments

    System.out.print("hello"); //prints on line with the compiling and runtime. very bad looking
    System.out.println("hello"); //new line for thing!!

    // variable declarations:
    //PRIMATIVE VARIABLES
    int a; //integer
    double b; //decimal / float
    boolean c; //true or false

    a = 4;
    b = 5.5;
    c = false; // must be lowercase

    // Arimetic operators
    // + - / * %
    // += -= /= %=

    int d = 3;
    d += 7;

    System.out.println("d = " + d);

    // increment and decrement by one:
    // -- ++
    d--;
    System.out.println("d = " + d);
    d++;
    d++;
    System.out.println("d = " + d);

    // COMPARISONS (always return true or false)
    System.out.println(4 < 5);
    System.out.println(7 == 4);
    System.out.println(1 != 2);

    // LOGICAL OPERATORS
    // not: !    and: &&    or: ||
    // in order of presedence
    boolean e = false; boolean f = true;

    // predict output: richtig oder falsch?
    System.out.println(!e); //richtig
    System.out.println(e && f); //falsch
    System.out.println(e || f); //richtig
    System.out.println(e || f && !e); //richtig

    System.out.println(e && f);
}


}