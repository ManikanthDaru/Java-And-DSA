package com.manikanth.introduction;
import java.util.Arrays;

// student class
// blue-print for every student object
class Student {
    String name;
    int rollNo;
    float marks;

    Student(String s,int r,float m) {
        this.name = s;
        this.rollNo = r;
        this.marks = m;
    }
}

// class - a class is a name group of properties(instance variables) and functions(instance methods)
public class Main {
    public static void main(String[] args) {
//        store details of 5 students
//        in java arrays of objects contains references to those objects

        Student[] arr = new Student[5];
//        the way to create an object from student class is by using new keyword and the constructor
        Student s1 = new Student("Manikanth Daru",478,986);
        Student s2 = new Student("Kalyan Kumar Pothuganti",521,963);
        Student s3 = new Student("Harshith Kapuluru",493,1000);
//        Student s4;
//        System.out. println(s4);  java: variable s4 might not have been initialized

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        System.out.println(arr[0]);
        System.out.println(arr[0].name);
    }
}
