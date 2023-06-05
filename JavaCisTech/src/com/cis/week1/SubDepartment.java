package com.cis.week1;

public class SubDepartment extends Department{
    @Override
    int getDepartmentSize() {
        return DepartmentSize;
    }

    public static class ChildClass extends ParentClass {
        public void childClass(){
            System.out.println("This is from the Child class");
        }
    }
}
