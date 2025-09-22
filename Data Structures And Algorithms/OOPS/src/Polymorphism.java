// polymorphism - 2 types
// 1. compile time polymorphism - method overloading - we have multiple methods with same name (but different parameters or number of parameters or return type)
// In this we can know error if there, at compile time itself
// 2. run time polymorphism - method overriding - done at time of inheritance

public class Polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student("Bharath Kumar Alleni", 21);
        s1.printInfo();
        s1.printInfo("Bharath Kumar Alleni");
        s1.printInfo(21);
    }
}
