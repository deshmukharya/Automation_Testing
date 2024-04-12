package First;

//Define a class with different access modifiers
class AccessModifiersDemo {
 // Private member variable
 int privateVar = 10;

 // Public member variable
 public String publicVar = "Hello";

 // Protected member variable
 protected double protectedVar = 3.14;

 // Private method
 void privateMethod() {
     System.out.println("This is a private method.");
 }

 // Public method
 public void publicMethod() {
     System.out.println("This is a public method.");
 }

 // Protected method
 protected void protectedMethod() {
     System.out.println("This is a protected method.");
 }
}

public class AccessModifier {
 public static void main(String[] args) {
     // Create an object of the AccessModifiersDemo class
     AccessModifiersDemo obj = new AccessModifiersDemo();

     // Accessing variables and methods with different access modifiers
     // Private variables and methods are accessible only within the same class
     // Public variables and methods are accessible from anywhere
     // Protected variables and methods are accessible within the same package or subclasses
     System.out.println("Private variable: " + obj.privateVar);
     System.out.println("Public variable: " + obj.publicVar);
     System.out.println("Protected variable: " + obj.protectedVar);

     obj.privateMethod();
     obj.publicMethod();
     obj.protectedMethod();
 }
}

