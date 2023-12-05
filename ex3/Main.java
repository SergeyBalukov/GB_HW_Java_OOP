package ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
      public static void main(String[] args) {
        Student student1 = new Student(1, "qwe", "rty", "yui");
        Student student2 = new Student(2, "asd", "rtrewy", "yutri");
        Student student3 = new Student(3, "zxc", "rasdty", "yretui");
        Student student4 = new Student(4, "qasd", "rtsdfy", "yuwerri");
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        StudentGroup studentGroup = new StudentGroup(students);
          for (Student student: studentGroup) {
              System.out.println(student);
          }
        /**StudentGroupIterator groupIterator = new StudentGroupIterator(studentGroup);

        while (groupIterator.hasNext()){
            System.out.println(groupIterator.next());
        }*/
    }
}
