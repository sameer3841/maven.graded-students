package com.github.curriculeon.classroom;

import com.github.curriculeon.Classroom;
import com.github.curriculeon.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class GetAverageExamScoreTest {
    // given
    private void test(List<Student> students, Double expected) {
        Classroom classroom = new Classroom(students.toArray(new Student[0]));

        // when
        Double actual = classroom.getAverageExamScore();

        // then
        Assert.assertEquals(expected, actual, 0.01);
    }

    // given
    @Test
    public void test0() {
        Student student1 = new Student(null, null, new Double[]{100.0, 100.0, 0.0, 0.0});
        Student student2 = new Student(null, null, new Double[]{100.0, 0.0});
        Student student3 = new Student(null, null, new Double[]{50.0});
        Student student4 = new Student(null, null, new Double[]{50.0, 50.0});
        Double expected = 50.0;
        test(Arrays.asList(student1, student2, student3, student4), expected);
    }


    // given
    @Test
    public void test1() {
        Student student1 = new Student(null, null, new Double[]{100.0, 100.0, 100.0, 100.0});
        Student student2 = new Student(null, null, new Double[]{100.0, 100.0});
        Student student3 = new Student(null, null, new Double[]{100.0});
        Student student4 = new Student(null, null, new Double[]{100.0, 100.0});
        Double expected = 100.0;
        test(Arrays.asList(student1, student2, student3, student4), expected);
    }

    // given
    @Test
    public void test2() {
        Student student1 = new Student(null, null, new Double[]{200.0, 200.0, 200.0, 200.0});
        Student student2 = new Student(null, null, new Double[]{200.0, 200.0});
        Student student3 = new Student(null, null, new Double[]{200.0});
        Student student4 = new Student(null, null, new Double[]{200.0, 200.0});
        Double expected = 200.0;
        test(Arrays.asList(student1, student2, student3, student4), expected);
    }
}
