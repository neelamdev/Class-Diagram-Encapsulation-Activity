package com.techReturners;

public class Student {
    private final String studentName;
    private char studentGrade;
    private final int studentGroup;
    private String secretNickName;
    private final char[] studentGradeArray = {'A', 'B', 'C', 'D', 'E'};
    private final int[] studentGroupArray = {1, 2, 3, 4, 5};

    public Student(String studentName, char studentGrade, int studentGroup) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        this.studentGroup = studentGroup;
    }


    public String getStudentName() {
        return studentName;
    }

    public char getStudentGrade() {
        return studentGrade;
    }

    public void setSecretNickName(String secretNickName) {
        this.secretNickName = secretNickName;
    }

    public void studentGradeUpgrade() {
        for (int i = 0; i <= studentGradeArray.length - 1; i++) {
            if (studentGradeArray[i] == studentGrade && i != studentGradeArray.length - 1) {
                studentGrade = studentGradeArray[i + 1];
                break;
            }
        }

    }

    public void studentGradeDowngrade() {
        for (int i = 0; i <= studentGradeArray.length - 1; i++) {
            if (studentGradeArray[i] == studentGrade && i != 0) {
                studentGrade = studentGradeArray[i - 1];
                break;
            }
        }

    }


}
