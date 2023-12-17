import controler.StudentControler;
import controler.TeacerControler;
import model.Student;
import model.StudentGroup;
import service.StudentGroupService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        StudentControler controler = new StudentControler();
//        controler.create("qwe","wer", "tyu");
//        controler.create("asd","asdwer", "tsdfyu");
//        controler.create("vbn","dfgwer", "tysdfu");
//        controler.create("bnm","nbmwer", "iuotyu");
//        controler.sendOnConsoleStudent();

        TeacerControler controler = new TeacerControler();
        controler.create("qwe","wer", "tyu");
        controler.create("asd","asdwer", "tsdfyu");
        controler.create("vbn","dfgwer", "tysdfu");
        controler.create("bnm","nbmwer", "iuotyu");
        controler.sendOnConsoleTeacher();

//        Student student1 = new Student(4, "aab", "aab", "aab");
//        Student student2 = new Student(2, "aaa", "aaa", "aaa");
//        Student student3 = new Student(3, "Aaa", "Aaa", "Aaa");
//        Student student4 = new Student(1, "bbb", "bbb", "bbb");
//        List<Student> studentList = new ArrayList<>();
//        StudentGroup studentGroup = new StudentGroup(studentList);
//        studentGroup.addStudent(student1);
//        studentGroup.addStudent(student2);
//        studentGroup.addStudent(student3);
//        studentGroup.addStudent(student4);
//        StudentGroupService service = new StudentGroupService(studentGroup);
//        for (Student student : studentGroup) {
//            System.out.println(student);
//        }
//        System.out.println();
//        for (Student student : service.getSortedStudentGroup()) {
//            System.out.println(student);
//        }
//        System.out.println();
//        for (Student student : service.getSortedStudentGroupByFIO()) {
//            System.out.println(student);
//        }
//        model.StudentGroupIterator iterator = new model.StudentGroupIterator(studentGroup);
//        while (iterator.hasNext())
//            System.out.println(iterator.next());
//        System.out.println();
//        for(model.Student student : studentGroup){
//            System.out.println(student);
    }
}