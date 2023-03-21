package com.github.curriculeon;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

    private String firstName;
    private String lastName;
    private final List<Double> testScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        setFirstName(firstName);
        setLastName(lastName);
        this.testScores = new ArrayList<>(Arrays.asList(testScores));
    }

    public Student() {
        testScores = new ArrayList<>(Collections.emptyList());
    }

    /**
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return
     */
    public Double[] getExamScores() {
        return testScores.toArray(new Double[0]);
    }

    /**
     * @param examScore
     */
    public void addExamScore(double examScore) {
        testScores.add(examScore);
    }


    /**
     * @param examNum
     * @param updateScore
     */
    public void setExamScore(int examNum, double updateScore) {
        testScores.set(examNum,updateScore);
    }

    /**
     * @return
     */
    public Double getAverageExamScore() {
        double ans = 0;
        for(double i : testScores) ans += i;
        return ans / testScores.size();
    }

    public Double getSumOfExamScore(){
        double ans = 0;
        for(double i : testScores) ans += i;
        return ans;
    }

    @Override
    public String toString() {
        return null;
    }

    public Character getGrade(Double grade) {
        char letterGrade;
        if ( grade >= 84 ) {
            letterGrade = 'A';
        } else if ( grade < 84 && grade > 71) {
            letterGrade = 'B';
        } else if ( grade < 70 && grade > 56) {
            letterGrade = 'C';
        } else if ( grade <= 55 && grade > 46) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        return letterGrade;
    }

    /**
     * @param studentToCompareAgainst the object to be compared; compare by grade, then by name
     * @return
     */
    @Override
    public int compareTo(Student studentToCompareAgainst) {
        Double averageScore = getAverageExamScore(), averageScoreToCompare = studentToCompareAgainst.getAverageExamScore();
        int compare = averageScoreToCompare.compareTo(averageScore);
        if(compare == 0)
            return this.getLastName().compareTo(studentToCompareAgainst.getLastName());
        return compare;
    }
}

