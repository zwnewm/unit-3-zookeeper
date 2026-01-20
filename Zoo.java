public class Zoo {

   private Cage cage1;
   private Cage cage2;
   private Cage cage3;
   
   
   public Zoo() {
      cage1 = new Cage();
      cage2 = new Cage();
      cage3 = new Cage();
   }
   
   public Zoo(Animal a1, Animal a2, Animal a3) {
      this.cage1 = new Cage(a1);
      this.cage2 = new Cage(a2);
      this.cage3 = new Cage(a3);
   }
   
   public int howManyAnimals() {
      return Animal.getAnimalCount();
   }
   
   public boolean putAnimalInCage(Cage cage, Animal animal) {
      if(cage == cage1 || cage == cage2 || cage == cage2) {
         cage.changeAnimal(animal);
         return true;
      
      }
      return false;
   }
   
   public String toString() {
      return "Zoo Contents:\n"
         + "Cage 1: " + cage1 + "\n"
         + "Cage 2: " + cage2 + "\n"
         + "Cage 3: " + cage3;
   
   }
   
   public static void main(String[] args) {
      
        Zoo zoo1 = new Zoo();
        System.out.println(zoo1);
        System.out.println("Animals created so far: " + zoo1.howManyAnimals());

        
          
   }

}