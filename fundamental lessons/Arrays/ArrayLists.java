// ArrayLists are dynamic lists that store multiple objects (not primitives like int, double, or boolean)
// Unlike arrays, they can grow and shrink while the program runs
// AP CS A only uses: size(), add(obj), add(index, obj), get(index), set(index, obj), remove(index)


import java.util.ArrayList;

// import java.util.*;

public class ArrayLists {

    public static ArrayList<String> createList() {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("pangolin");
        animals.add("puffin");
        animals.add("tai");
        return animals;
    }

    public static void showIndex(ArrayList<String> animals) {
        System.out.println("first element: " + animals.get(0));
        System.out.println("second element: " + animals.get(1));
        System.out.println("third element: " + animals.get(2));

        System.out.println("last element: " + animals.get(animals.size() - 1));

    }

    // linear search returns the index of target
    // returns -1 if the index doesn't work

    public static int findIndex(ArrayList<String> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
    }

}