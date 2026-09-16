package CrashCourse;
import java.util.ArrayList;

public class CrashCourse {

public static void main(String[] args) {
    
    // comments

    System.out.print("hello"); //prints on line with the compiling and runtime. very bad looking
    System.out.println("hello"); //new line for thing!!

    // variable declarations:
    //PRIMATIVE VARIABLES
    int a = 5; //integer
    double b = 5.5; //decimal / float
    boolean c = true; //true or false

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

    int[][] arryGrid1 = new int[4][3]; // first num is rows, second is collumns [r][c]
    // 0 0 0
    // 0 0 0
    // 0 0 0
    // 0 0 0

    System.out.println("rows: " + arryGrid1.length); // prints rows
    System.out.println("collumns: " + arryGrid1[0].length); // prints length of row, and therefore the number of collumns

          //ARRAYLISTS
        // Can be any size. Lots of  built-in functions to help. 
        // Avoid primitive data types. Special classes for Integer, Double, Boolean, String. Called "wrapper classes"

        ArrayList<String> arryLst = new ArrayList<>();

        arryLst.add("Word 1");
        arryLst.add("Word 2");
        arryLst.add("Word 3");
        arryLst.remove(0);
        arryLst.add(0, "Word 4");
        arryLst.set(2, "Word 5");

        System.out.println(arryLst);
        System.out.println(arryLst.size());
        System.out.println(arryLst.get(2));

        // Math class
        Math.max(5,9); //max value => returns 9
        Math.min(7,3); // min value => returns 3
        Math.sqrt(14); // square root
        Math.abs(-67);   // absolute value

        // CONDITIONALS

        // if    else if    else 

         boolean tru = true; boolean fal = false; 
         
         if(tru) {
            System.out.println("Reached first condition");
        } else if (!fal){
            System.out.println("Reached second condition");
        }  
         else {
            System.out.println("Reached else");
         }

         // ITERATION

         // while loop 

         int x = 5;

         while (x < 10) {
            System.out.print(x + " ");
            x++;
         }

         System.out.println();

         // for loop
         // initialize variable at index; conditional; increment/decrement
         for(int i = 0; i < 5; i++) {
            System.out.println(i);
         }

         // enhanced for loop (only for reading values)
         ArrayList<String> animals = new ArrayList<>();
         animals.add("Sheep");
         animals.add("Deer");
         animals.add("Moose");
         System.out.println("ArrayList: " + animals);

         for (String s : animals) {
            System.out.println("We saw a " + s);
         }

         // printing values of an array with iteration

         double[] arry = {5.1, 2.2, 5.3, 3.4, 8.5};
         System.out.println("Memory address: " + arry);

         for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
         }

        int[][] arryMatrix = {  { 0, 32, 12 }  ,   { 7, 13, 22  } ,  { 6, 77, 100  }  };
        System.out.println(arryMatrix);

        for(int row = 0; row < arryMatrix.length; row++) {
            for(int col = 0; col < arryMatrix[row].length; col++) {
                System.out.print(arryMatrix[row][col] + " ");
            }
            System.out.println();
        }

}

}