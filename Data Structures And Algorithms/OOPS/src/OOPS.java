class Pen {
//    instance variables
    String color;
    String type;
    int cost;

//    instance methods or methods
    public void print() {
        System.out.println("This is a "+this.color+" color "+this.type+" pen and it costs Rs."+this.cost);
    }
}

class Student {
//    non - parameterized constructors
//    constructor - it is a method with no return type or statement, it is called only once during creation of object
    String name;
    int age;

//    parameterized constructor
    public Student(String name,int age) {
        System.out.println("Constructor invoked...");
        this.name = name;
        this.age = age;
    }
// copy constructor
    public Student(Student s) {
        System.out.println("Copy constructor invoked...");
        this.name = s.name;
        this.age = s.age;
    }

    public void printInfo() {
        System.out.println("The student name is "+this.name+" and his age is "+this.age);
    }

    public void printInfo(String name) {
        System.out.println("The student name is "+name);
    }
    public void printInfo(int age) {
        System.out.println("The student age is "+age);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "black";
        pen1.type = "gel";
        pen1.cost = 20;
        pen1.print();

        Pen pen2 = new Pen();
        pen2.color = "blue";
        pen2.type = "ballpoint";
        pen2.cost = 30;
        pen2.print();

        Student s1 = new Student("Manikanth Daru",21);
        s1.printInfo();

        Student s2 = new Student("Kalyan Kumar", 21);
        s2.printInfo();

        Student s3 = new Student(s2);
        s3.printInfo();
    }
}