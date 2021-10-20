package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TeacherFactory factory = new EngTeacherFactory();
        Teacher teacher = factory.createTeacher();
        teacher.teach();
    }
}
