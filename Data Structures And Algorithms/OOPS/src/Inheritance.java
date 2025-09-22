// inheritance types
// 1. single level inheritance => Base class -> Derived class
// 2. multiple level inheritance => Base class -> Derived class 1 -> Derived class 2
// 3. hierarchical inheritance => Base class -> Derived class 1 and Base class -> Derived class 2
// 4. hybrid inheritance - all above can be seen in this one
// 5. multiple inheritance in C++ / interface in Java

// base class or parent class
class Shape {
    String color;
    public void area() {
        System.out.println("Area calculation...");
    }
}

// subclass or child class
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println((l*h)/2);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l) {
        System.out.println((l*l)/2);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((r*r)*(3.14));
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.color = "red";
        t.area();
        t.area(5,4);
        EquilateralTriangle et = new EquilateralTriangle();
        et.area();
        et.area(10,10);
        et.area(10);
        Circle c = new Circle();
        c.area();
        c.area(5);
    }
}
