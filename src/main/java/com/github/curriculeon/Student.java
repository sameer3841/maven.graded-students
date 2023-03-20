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
        return testScores.toArray(new Double[0]);
    }

    public void addExamScore(double examScore) {
        testScores.add(examScore);
    }


    public void setExamScore(int examNum, double updateScore) {
        testScores.set(examNum,updateScore);
    }


    public Double getAverageExamScore() {
        double ans = 0;
        for(double i : testScores) ans += i;
        return ans / testScores.size();
    }

    @Override
    public String toString() {
        return null;
    }

    /**
     * @param studentToCompareAgainst the object to be compared; compare by grade, then by name
     * @return
     */
    @Override
    public int compareTo(Student studentToCompareAgainst) {
        Double averageScore = getAverageExamScore();
        Double averageScoreToCompare = studentToCompareAgainst.getAverageExamScore();
        int compare = averageScoreToCompare.compareTo(averageScore);
        if(compare == 0)
            return this.getLastName().compareTo(studentToCompareAgainst.getLastName());
        return compare;
    }
}

