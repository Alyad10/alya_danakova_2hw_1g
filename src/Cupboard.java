public class Cupboard extends Furniture{
   private int numberOfShelves;
   private int numberOfDoors;

   public Cupboard(int numberOfShelves, int numberOfDoors) {
      this.numberOfShelves = numberOfShelves;
      this.numberOfDoors = numberOfDoors;
   }

   public int getNumberOfShelves() {
      return numberOfShelves;
   }

   public int getSize() {
      return numberOfDoors;
   }

   @Override
   public void print() {
      System.out.println("Number of shelves: " + numberOfShelves +
              " Number of doors: " + numberOfDoors);

   }
}
