package First;

//Parent class
class Vehicle {
 // Method to print a message indicating the vehicle type
 public void drive() {
     System.out.println("This is a generic vehicle.");
 }
}

//Child class inheriting from Vehicle
class Car extends Vehicle {
 // Overriding the drive method to provide specific behavior for Car
 @Override
 public void drive() {
     System.out.println("This is a car. It drives on roads.");
 }
}

//Child class inheriting from Vehicle
class Boat extends Vehicle {
 // Overriding the drive method to provide specific behavior for Boat
 @Override
 public void drive() {
     System.out.println("This is a boat. It floats on water.");
 }
}

public class Inheritance {
 public static void main(String[] args) {
     // Creating objects of Car and Boat
     Car myCar = new Car();
     Boat myBoat = new Boat();
     
     // Calling drive method for Car and Boat objects
     myCar.drive();
     myBoat.drive();
 }
}
