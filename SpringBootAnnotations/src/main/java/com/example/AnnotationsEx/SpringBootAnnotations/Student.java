package com.example.AnnotationsEx.SpringBootAnnotations;

public class Student
{
    int id;
    public void studentTest(){
        System.out.println("student test method");
        System.out.println("id = " +id);
    }

    static {
        System.out.println("Student Bean loaded");
    }
}
