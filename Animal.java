public class Animal {

   private String animalType;
   private static int animalCount = 0;
   
   public Animal(String animalType) {
      this.animalType = animalType;
   
   }
   
   public static Animal randomAnimalType() {
      Animal pig = new Animal("Pig");
      animalCount++;
      return pig;
   
   }
   
   public String toString() {
      return animalType;
   }
   
   public static void main(String[] args) {
      Animal pig = randomAnimalType();
      System.out.println(pig.toString());
   
   }
}