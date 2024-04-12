package First;

//Abstraction example: Shape
abstract class Shape {
 // Abstract method to calculate area
 public abstract double calculateArea();
 
 // Abstract method to calculate perimeter
 public abstract double calculatePerimeter();
 
 // Common method to display shape details
 public void display() {
     System.out.println("Shape details:");
     System.out.println("Area: " + calculateArea());
     System.out.println("Perimeter: " + calculatePerimeter());
 }
}

//Interface example: Drawable
interface Drawable {
 // Method to draw the shape
 void draw();
}

//Concrete class: Circle
class Circle extends Shape implements Drawable {
 private double radius;
 
 public Circle(double radius) {
     this.radius = radius;
 }
 
 // Implementing abstract method to calculate area for Circle
 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
 
 // Implementing abstract method to calculate perimeter for Circle
 @Override
 public double calculatePerimeter() {
     return 2 * Math.PI * radius;
 }
 
 // Implementing draw method from the Drawable interface
 @Override
 public void draw() {
     System.out.println("Drawing Circle");
 }
}

//Concrete class: Rectangle
class Rectangle extends Shape implements Drawable {
 private double length;
 private double width;
 
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }
 
 // Implementing abstract method to calculate area for Rectangle
 @Override
 public double calculateArea() {
     return length * width;
 }
 
 // Implementing abstract method to calculate perimeter for Rectangle
 @Override
 public double calculatePerimeter() {
     return 2 * (length + width);
 }
 
 // Implementing draw method from the Drawable interface
 @Override
 public void draw() {
     System.out.println("Drawing Rectangle");
 }
}

public class Abstraction {
 public static void main(String[] args) {
     // Creating objects of Circle and Rectangle
     Circle circle = new Circle(5);
     Rectangle rectangle = new Rectangle(4, 6);
     
     // Calling display method of Shape
     circle.display();
     System.out.println();
     rectangle.display();
     System.out.println();
     // Calling draw method of Drawable
     circle.draw();
     rectangle.draw();
 }
}

