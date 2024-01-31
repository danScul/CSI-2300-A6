
public class ClassInheritance {
   
    public static void main(String args[]){
        Animal myAnimal = new Animal();
        Fish myFish = new Fish();
        Zebra myZebra = new Zebra();

        myAnimal.isMammal();
        myAnimal.mate();

        myFish.callcanEat();

        myZebra.run();
    }
}
class Animal {
    public int age;
    public String gender;

    public void isMammal(){
        System.out.println("You have called the 'isMammal' method from the animal class!");
    }
    public void mate(){
        System.out.println("You have called the 'mate' method from the animal class!");
    }
}
class Fish extends Animal{
    private double sizeInFeet;

    public void callcanEat(){
        canEat();
    }
    private void canEat(){
        System.out.println("You have called the 'canEat' method from the fish class!");
    }
}
class Zebra extends Animal{
    public boolean is_wild;

    public void run(){
        System.out.println("You have called the 'run' method from the zebra class");
    }
}

