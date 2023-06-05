package com.cis.week1;

public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("Sanjeev");
        System.out.println("Student name is:"+student.getName());
        SubDepartment subDepartment=new SubDepartment();
        System.out.println("Size of the Department is:"+subDepartment.getDepartmentSize());
        Product product=new Product();
        product.setPrice(10);
        System.out.println("Price of one Product is:"+product.getPrice());
        System.out.println("Price of 10 Products is:"+product.getPrice(10));
        ParentClass childClass=new ChildClass();
        childClass.runTimeMethod();
        ImplementingClass implementingClass=new ImplementingClass();

        System.out.println(StaticCall.returnValue());

        //Create a final class with a final variable and a final method that can only be
        // accessed by classes within the same package.
        AllFinal allFinal=new AllFinal();
        System.out.println("The final Variable is:"+allFinal.finalVariable);
        System.out.println("Calling final Method :"+ allFinal.finalMethod());





    }
}