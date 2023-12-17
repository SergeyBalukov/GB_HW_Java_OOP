package ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
      public static void main(String[] args) {
        Student student1 = new Student(1, "qwe", "rty", "yui");
        Student student2 = new Student(3, "asd", "rtrewy", "yutri");
        Student student3 = new Student(2, "zxc", "rasdty", "yretui");
        Student student4 = new Student(4, "qasd", "rtsdfy", "yuwerri");
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        StudentGroup studentGroup = new StudentGroup(students);
        StudentGroupService service = new StudentGroupService(studentGroup);
          for (Student student: service.getSortedStudentGroup()) {
              System.out.println(student);
          }

          System.out.println();

          for (Student student: service.getSortedStudentGroup()) {
              System.out.println(student);
          }


    }
}
