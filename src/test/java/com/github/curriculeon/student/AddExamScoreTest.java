package com.github.curriculeon.student;

import com.github.curriculeon.Student;
import org.junit.Assert;
import org.junit.Test;

public class AddExamScoreTest {
    private void test(Double[] preAddExamScore, Double examScoreToAdd, Double[] expected) {
        //Arrange
        Student student = new Student(null, null, preAddExamScore);

        //Act
        student.addExamScore(examScoreToAdd);
        Double[] actual = student.getExamScores();

        //Assert
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test0() {
        Double examScoreToAdd = 105.0;
        Double[] preAddExamScore = {100.0, 95.0, 123.0, 96.0};
        Double[] postAddExamScore = {100.0, 95.0, 123.0, 96.0, examScoreToAdd};
        test(preAddExamScore, examScoreToAdd, postAddExamScore);
    }

    @Test
    public void test1() {
        Double examScoreToAdd = 92.0;
        Double[] preAddExamScore = {100.0, 95.0, 123.0, 96.0};
        Double[] postAddExamScore = {100.0, 95.0, 123.0, 96.0, examScoreToAdd};
        test(preAddExamScore, examScoreToAdd, postAddExamScore);
    }

    @Test
    public void test2() {
        Double examScoreToAdd = 56.0;
        Double[] preAddExamScore = {100.0, 95.0, 123.0, 96.0};
        Double[] postAddExamScore = {100.0, 95.0, 123.0, 96.0, examScoreToAdd};
        test(preAddExamScore, examScoreToAdd, postAddExamScore);
    }
}
