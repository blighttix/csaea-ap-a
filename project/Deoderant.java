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
       return "brand: " + brand + "; smells like " + scent + ", costs $" + price + "; can this be used? " + isUsable;
   }
  
   public void useDeoderant() {
       if (usedTimes >= sizeGrams) {
           isUsable = false;
       }
       if (isUsable = true) {
           usedTimes += 1;
       }
       else {System.out.println("You can no longer use this deoderant; get a new one!");}
   }


   public boolean isBrand(String type) {
       return (brand.indexOf(type) != -1);
   }

    public String scentAdjective() {
        return scent.substring(0,scent.indexOf(" ")-1);
    }

}
