package databean;

public class Student implements Comparable<Student> {
    int roll;
    String name;

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}
