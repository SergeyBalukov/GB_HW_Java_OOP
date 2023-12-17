package controller;

import model.*;
import service.DataService;
import service.StudyGroupService;
import view.StudentView;

import javax.xml.crypto.Data;
import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();

    private final StudyGroupService studyGroupService = new StudyGroupService();

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> studentList){
        StudyGroup studyGroup = studyGroupService.getStudyGroup(teacher, studentList);
        return studyGroup;
    }

    public void createStudent(String firstName, String secondName, String lastName){
        service.create(firstName, secondName, lastName, Type.STUDENT);
    }
    public void getAllStudent(){
        for(User user : service.getAllStudent()){
            studentView.printOnConsole((Student) user);
        }
    }
}
