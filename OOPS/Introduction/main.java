package OOPS.Introduction;
import java.util.*;

public class main {
    public static void main(String[] args) {
        // store 5 roll no.
        int[] num = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: (roll, name , marks)
        int[] roll = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring
        // Student aditya;
        // aditya = new Student();
        
        Student aditya = new Student(19, "Dentist",78.56f);
        // Student aditya = new Student();
        
        // aditya.roll = 06;
        // aditya.name = "Rishul";
        // aditya.marks = 78.56f; 

        // aditya.changeName("Saira");
        // aditya.greeting();

        System.out.println(aditya.roll);
        System.out.println(aditya.name);
        System.out.println(aditya.marks);

        Student random = new Student();
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";
        System.out.println(two.name);
    }
}

// create a class
// for every single student
class Student {
    int roll;
    String name;
    float marks = 90.00f;

    // we need a way to add the values of above properties obj by obj
    // we need one word to access every obj

    void greeting() {
        System.out.println("Hello my name is " + this.name);
    }

    void changeName(String Name) {
        this.name = Name;
    }

    // constructor

    Student (Student other) {
        this.name = other.name;
        this.roll = other.roll;
        this.marks = other.marks;
    }

    Student () {
        // this is how you call a constructor using another constructor  
        // internally: new Student()
        this(13, "Akshita", 80.00f);
    }

    Student (int rno, String naam, float mark) {
        this.roll = rno;
        this.name = naam;
        this.marks = mark;   
    }
}
