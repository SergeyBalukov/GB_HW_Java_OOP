package ex3;

public class StudentGroupService {
    private StudentGroup students;

    public StudentGroupService(StudentGroup students) {
        this.students = students;
    }

    public StudentGroup getStudents() {
        return students;
    }

    public void removeStudent(Student student){
        for (Student studentItem : students){
            if(student.equals(studentItem)){
                students.remove(studentItem);
            }
        }
    }
}
