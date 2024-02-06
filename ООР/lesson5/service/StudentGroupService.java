package group4386.gerasimava.lesson5.service;

import group4386.gerasimava.lesson5.model.Student;
import group4386.gerasimava.lesson5.model.StudentGroup;
import group4386.gerasimava.lesson5.model.Teacher;

import java.util.List;

public class StudentGroupService {
    private final StudentGroup studentGroup = new StudentGroup();
    private Integer maxGroupId = 0;
    public void createStudentGroup(Teacher teacher, List<Student> studentList){
        studentGroup.setGroupId(++maxGroupId);
        studentGroup.setTeacher(teacher);
        studentGroup.setStudentList(studentList);
    }
    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
}