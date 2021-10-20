package com.company;

public class EngTeacherFactory implements TeacherFactory{
    @Override
    public Teacher createTeacher() {
        return new EngTeacher();
    }
}
