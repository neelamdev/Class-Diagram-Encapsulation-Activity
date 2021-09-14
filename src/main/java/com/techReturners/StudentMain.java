package com.techReturners;

public class StudentMain {


    public static void main(String[] args) {
        Student ourStudent = new Student("Biff", 'B', 1);
        System.out.println(ourStudent.getStudentGrade());
        System.out.println(ourStudent.getStudentName());
        ourStudent.setSecretNickName("Katty");

        // upgrading Student Grade
        ourStudent.studentGradeUpgrade();
        System.out.println(ourStudent.getStudentGrade());

         // downgrading Student Grade
         ourStudent.studentGradeDowngrade();
        System.out.println(ourStudent.getStudentGrade());

    }
}
