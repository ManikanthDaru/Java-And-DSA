import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 implements Comparable<Student1> {
    int age;
    String name;

    public Student1(int a, String b) {
        this.age = a;
        this.name = b;
    }

    public String toString() {
        return this.age + " : " + this.name;
    }

    public int compareTo(Student1 that) {
        if(this.age>that.age) {
            return 1;
        }
        else if(this.age<that.age) return -1;
        else return 0;
    }
}

public class Using_Comparator {
    public static void main(String[] args) {

        Comparator<Student1> com = new Comparator<Student1>() {

            @Override
            public int compare(Student1 i, Student1 j) {
                if(i.age>j.age) {
                    return 1;
                }
                else if(i.age<j.age) return -1;
                else return 0;
            }
        };

//        as it is a functional interface we can also use a lambda expression
        Comparator<Student1> com2 = (i,j) -> {
            if(i.age>j.age) return -1;
            else if(i.age<j.age) return 1;
            return 0;
        };

        List<Student1> list = new ArrayList<>();

        list.add(new Student1(21,"Manikanth"));
        list.add(new Student1(21,"Abhinav"));
        list.add(new Student1(19,"Harshith"));
//      sort by age
//        Collections.sort(list); // it is working because the student class is implementing Comparable
        Collections.sort(list,com2);
        System.out.println(list);

    }
}
