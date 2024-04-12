package First;

//Parent class
//Parent class
class Animal {
 // Method to make a sound
 public void makeSound() {
     System.out.println("Generic animal sound.");
 }
 
 // Method to eat
 public void eat() {
     System.out.println("Animal is eating.");
 }
}

//Child class inheriting from Animal
class Dog extends Animal {
 // Overriding makeSound method to provide specific sound for Dog
 @Override
 public void makeSound() {
     System.out.println("Dog barks.");
 }
 
 // Overloading eat method with a different parameter
 public void eat(String food) {
     System.out.println("Dog is eating " + food + ".");
 }
}

public class Polymorphism {
 public static void main(String[] args) {
     // Creating objects of Animal and Dog
     Animal animal = new Animal();
     Dog dog = new Dog();
     
     // Calling makeSound method for Animal and Dog objects (method overriding)
     animal.makeSound();
     dog.makeSound();
     
     // Calling eat method for Animal object (method overloading)
     
     // Calling overloaded eat method for Dog object
     dog.eat();
     dog.eat("bones");
 }
}
