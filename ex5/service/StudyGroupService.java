package service;

import model.Student;
import model.StudyGroup;
import model.Teacher;

import java.util.List;

public class StudyGroupService {
    public StudyGroup getStudyGroup(Teacher teacher, List<Student> student){
        return new StudyGroup(teacher, student);
    }
}
