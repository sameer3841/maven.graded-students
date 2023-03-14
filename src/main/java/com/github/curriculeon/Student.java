package com.github.curriculeon;


public class Student implements Comparable<Student> {

    public Student(String firstName, String lastName, Double[] testScores) {
    }

    public Student() {

    }

    public String getFirstName() {
        return null;
    }

    public void setFirstName(String firstName) {
    }

    public String getLastName() {
        return null;
    }

    public void setLastName(String lastName) {
    }

    public Double[] getExamScores() {
        return null;
    }

    public void addExamScore(double examScore) {
    }


    public void setExamScore(int examNum, double updateScore) {
    }


    public Double getAverageExamScore() {
        return null;
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
        return Integer.valueOf(null);
    }
}

