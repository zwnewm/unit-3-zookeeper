public class Animal {

   private String animalType;
   private static int animalCount = 0;
   
   
   public Animal(String animalType) {
      this.animalType = animalType;
   
   }
   public static int getAnimalCount(){
      return animalCount;
   }
   
   public static Animal randomAnimalType() {
      int choice = (int) (Math.random() * 3);
      Animal animal; 
      
      if (choice == 0){
         animal = new Animal("Pig");
         
      }
      else if (choice == 1){
         animal = new Animal("Lion");
      }
      else{
         animal = new Animal("Bear");
      }
 
      animalCount++;
      System.out.println(Animal.getAnimalCount());
      return animal;
      
   
   }
   
   public String Speak() {
      if (animalType.equals("Bear")){
         return "Growl!";
         
      }
      else if (animalType.equals("Lion")){
         return "Roar!";

      }
      else {
         return "Oink!";

      }
   
   }
   
   public String speakBackward() {
      String sound = Speak();
      String reversed = "";
      
      for(int i = sound.length() - 1; i >= 0; i--){
         reversed += sound.charAt(i);
      }
      return reversed;
   }
   
   public String toString() {
      return animalType;
   }
   
   public static void main(String[] args) {
      Animal animal1 = randomAnimalType();
      System.out.println(animal1.toString());
      System.out.println(animal1.Speak());
      System.out.println(animal1.speakBackward());
   }
}