package com.cis.week2.day4;

public class StudentData implements Comparable<StudentData> {

    public String firstName;
    public String lastName;
    public double gpa;

    public StudentData(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName=lastName;
        this.gpa=gpa;
    }

    @Override
    public int compareTo(StudentData o) {
        return this.lastName.compareTo(o.lastName);
    }
    public void display(){
        System.out.println(firstName+","+lastName+","+gpa);
    }
}
