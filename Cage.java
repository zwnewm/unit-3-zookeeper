public class Cage {
   private Animal animal;
   
   public Cage(){
      animal = Animal.randomAnimalType();
   }
   
   public Cage(Animal animal){
      this.animal = animal;
   }
   
   public Animal getAnimal() {
      return animal;
   }
   
   public void changeAnimal(Animal animal){
      this.animal = animal;
   }
   
   public String toString() {
      return "This cage contains: " + animal;
   }
   
   public static void main(String[] args) {
      Cage cage1 = new Cage();
      System.out.println(cage1.getAnimal());
      System.out.println(cage1.toString());
      
   
   }

}