package com.techreturners;

public class StudentMain {


    public static void main(String[] args) {
        Student ourStudent = new Student("Biff", 'D', 1);

        // upgrading Student Grade
        ourStudent.gradeUpgrade();
        System.out.println(ourStudent.getStudentGrade());

        // downgrading Student Grade
        ourStudent.gradeDowngrade();
        System.out.println(ourStudent.getStudentGrade());

    }
}
