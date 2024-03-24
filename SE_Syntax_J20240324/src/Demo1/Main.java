package Demo1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students={new Student("zhangsan",20),new Student("lisi",19),new Student("wangwu",30)};
        /*Arrays.sort(students);
        System.out.println(Arrays.toString(students));*/
        NameComparator nameComparator=new NameComparator();
        AgeComparator ageComparator=new AgeComparator();
        Arrays.sort(students,nameComparator);
        System.out.println(Arrays.toString(students));
        /*Arrays.sort(students,ageComparator);
        System.out.println(Arrays.toString(students));*/

    }
    public static void main333(String[] args) {
        Student student=new Student("zhangsan",32);
        Student student1=new Student("lisi",20);
//        if(student.compareTo(student1)>0){
//            System.out.println("student>student1");
//        }else {
//            System.out.println("student<=student1");
//        }
    }
}
