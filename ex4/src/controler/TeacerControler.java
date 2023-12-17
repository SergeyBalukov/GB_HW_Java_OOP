package controler;

import model.Teacher;
import service.TeacherService;
import view.TeacherView;

public class TeacerControler implements UserControler<Teacher>{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);

    }
    public void sendOnConsoleTeacher(){teacherView.sendOnConsole(teacherService.getTeacherList());
    }
}
