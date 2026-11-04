package project;


public class Deoderant {
   private String scent;
   private String brand;
   private int sizeGrams;
   private int usedTimes;
   private double price;
   private boolean isUsable;


   public Deoderant(String brand, String scent, int sizeGrams, double price) {
       this.brand = brand;
       this.scent = scent;
       this.sizeGrams= sizeGrams;
       this.price = price;


       usedTimes = 0;
       isUsable = true;
   }


   public String toString() {
       return "smells like " + scent + ", costs $" + price + ", contains " + remainingGrams + "g of product"
   }
  
   public useDeoderant() {
       if (usedTimes >= sizeGrams) {
           isUsable = false;
       }
       if (isUsable = true) {
           sizeGrams -= 1;
       }
       else {System.out.println("You can no longer use this deoderant; get a new one!")}
   }


   public boolean isType(String type) {
       return (scent.indexOf(type) != -1)
   }


}
