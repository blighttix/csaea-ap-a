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


    //  CASTING - a fancy word for converting

    int g = (int)5.5;
    System.out.println(g);
    double h = (double)5/6;
    System.out.println(h);

    // STRINGS
    String s1 = "Goodnight";
    String s2 = " and ";
    String s3 = "Goodbye";
    String result = s1 + s2 + s3;
    result += ", Cowboy.";
System.out.println(result + "\n");

    // ARRAYS
    int[] arry1 = new int[10];
    System.out.println(arry1);
    System.out.println("length: " + arry1.length);

    arry1[0] = 11;
    arry1[1] = 2;
    System.out.println("remainder: " + arry1[0] % arry1[1]);

    int[] arry2 = {34, 52, 3, 64, 32};
    System.out.println("arry2: " + arry2);

    // 2D arrays - a grid or table

    int[][] arryGrid1 = new int[4][3] // first num is rows, second is collumns [r][c]
    // 0 0 0
    // 0 0 0
    // 0 0 0
    // 0 0 0

    System.out.println("rows: " + arryGrid1.length); // prints rows
    System.out.println("collumns: " + arryGrid1[0].length); // prints length of row, and therefore the number of collumns


}

}