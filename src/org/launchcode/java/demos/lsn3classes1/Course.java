package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private Teacher teacher;
    private int maxStudents = 30;
    private ArrayList<Student> roster;

    public Course(String courseName, Teacher teacher, ArrayList<Student> roster, int maxStudents) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.maxStudents = maxStudents;
        this.roster = roster;
    }
    public Course(String courseName, Teacher teacher, ArrayList<Student> roster) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.roster = roster;
    }
}
