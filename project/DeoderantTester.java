public class DeoderantTester{
    public static void main(String[] args) {
        Deoderant d1 = new Deoderant("Degree", "cold rush",76, 9.99);
        Deoderant d2 = new Deoderant("Native", "cool coconut", 75, 13.99);
        Deoderant d3 = new Deoderant("Secret", "fresh powder", 74, 4.49);

        System.out.println(d1.isBrand("Degree"));
        System.out.println(d1.isBrand("Native"));

        System.out.println(d2.scentAdjective()); // should print "cool"
    }
}