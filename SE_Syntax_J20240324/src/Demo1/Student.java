package Demo1;

public class Student implements Comparable<Student>{
    public String name;
    public int age;

    public Student(String name,int age) {
        this.name = name;
        this.age=age;
    }

    @Override
    public int compareTo(Student o) {
        //return this.name.compareTo(o.name);
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
