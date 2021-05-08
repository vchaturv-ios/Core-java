package Collections.Set;

public class Student implements Comparable{
    int rollNo;
    String name;
    double percentage;

    public Student(int rollNo, String name, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }

    @Override
    public boolean equals(Object o) {
        Student oStudent = (Student) o;
        if (this.hashCode() == oStudent.hashCode())
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return this.rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        return this.rollNo-student.rollNo;
    }
}
