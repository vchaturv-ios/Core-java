package Collections.Set;

import java.util.TreeSet;

public class AddElement {
    public static void main(String[] args) {
        Student student1 = new Student(1, "John", 75.22);
        Student student2 = new Student(2, "Smith", 76.22);
        Student student3 = new Student(3, "Dyna", 77.22);
        Student student4 = new Student(4, "Jack", 78.22);
        Student student5 = new Student(1, "John", 75.22);

        System.out.println("Hashcode of student 1 : "+student1.hashCode());
        System.out.println("Hashcode of student 2 : "+student2.hashCode());

        TreeSet<Student> students = new TreeSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println(students);

        //TreeSet in Descending order

        TreeSet<Student> rStudent = (TreeSet<Student>)students.descendingSet();
        System.out.println("Students in the reversing order : ");
        System.out.println(rStudent);
    }
}
