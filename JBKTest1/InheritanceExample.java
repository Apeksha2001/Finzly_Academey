/*Class Inheritance and Polymorphism. You are building a system for a zoo. Create a base class Animal with properties like name and
age, and a method makeSound(). Derive classes like Lion, Elephant, and Giraffe from Animal, each with their specific sound implementation.
 Implement a Zoo class to manage a collection of animals. Demonstrate polymorphism by iterating through the collection and calling the makeSound()
 method for each animal.*/

package JBKTest1;
class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        // Base class method, no implementation here
    }

    public String getName() {
        return name;
    }
}

class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Animal "+ getName() +"makes sound Roar!");
    }
}

class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Animal "+ getName() +"makes sound Trumpet!");
    }
}

class Giraffe extends Animal {
    public Giraffe(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Animal "+ getName() +"makes sound Moo!");
    }
}

class Zoo {
    public static void main(String[] args) {
        Animal simba = new Lion("Lion ", 5);
        simba.makeSound();

        Animal dumbo = new Elephant("Elephant ", 10);
        dumbo.makeSound();

        Animal gerry = new Giraffe("Giraffe ", 20);
        gerry.makeSound();
    }
}






////    private Animal[] animals;
////    private int count;
////
////    public Zoo(int capacity) {
////        animals = new Animal[capacity];
////        count = 0;
////    }
////
////    public void addAnimal(Animal animal) {
////        if (count < animals.length) {
////            animals[count] = animal;
////            count++;
////        }
////    }
////
////    public void makeAllSounds() {
////        for (int i = 0; i < count; i++) {
////            System.out.println(animals[i].getName() + ": ");
////            animals[i].makeSound();
////        }
////    }
//}
//
////public class InheritanceExample {
////    public static void main(String[] args) {
////        Zoo zoo = new Zoo(3);
////
////        Lion simba = new Lion("Simba", 5);
////        Elephant dumbo = new Elephant("Dumbo", 10);
////        Giraffe gerry = new Giraffe("Gerry", 7);
////
////        zoo.addAnimal(simba);
////        zoo.addAnimal(dumbo);
////        zoo.addAnimal(gerry);
////
////        zoo.makeAllSounds();
////    }
////}

