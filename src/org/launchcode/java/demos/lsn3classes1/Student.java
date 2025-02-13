package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = 0;
        this.gpa = 0.0;
    }
     void setName(String name) {
        this.name = name;
    }
     String getName() {
        return this.name;
    }
     int getId() {
        return this.studentId;
    }
     void setId(int id) {
        this.studentId = id;
    }
     void setNumCredits(int credits) {
        this.numberOfCredits = credits;

    }
     int getNumCredits() {
        return this.numberOfCredits;
    }
     void setGpa(double gpa) {
        this.gpa = gpa;
    }
     double getGpa() {
        return this.gpa;
    }
}