package com.github.curriculeon;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private Double[] examScores;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public Student() {
        this(null, null, new Double[]{});
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double[] getExamScores() {
        return examScores;
    }

    public void setExamScores(Double[] examScores) {
        this.examScores = examScores;
    }

    public void addExamScore(double examScore) {
        Double[] newExamScores = Arrays.copyOf(this.examScores, this.examScores.length + 1);
        newExamScores[newExamScores.length - 1] = examScore;
        this.examScores = newExamScores;
    }

    public void setExamScore(int examNum, double updateScore) {
        this.examScores[examNum] = updateScore;
    }

    public Double getAverageExamScore() {
        if (this.examScores.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (double score : this.examScores) {
            sum += score;
        }
        return sum / this.examScores.length;
    }

    @Override
    public String toString() {
        return String.format("%s %s -> Exam Scores: %s",
                this.firstName,
                this.lastName,
                Arrays.toString(this.examScores));
    }

    @Override
    public int compareTo(Student otherStudent) {
        int compareByGrade = otherStudent.getAverageExamScore().compareTo(this.getAverageExamScore());
        if (compareByGrade == 0) {
            return this.lastName.compareTo(otherStudent.getLastName());
        }
        return compareByGrade;
    }
}
