package com.github.curriculeon.classroom;

import com.github.curriculeon.Classroom;
import com.github.curriculeon.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class GetGradeBookTest {

    // given
    @Test
    public void test(Map<Student, Double> expected) {
        // Create a new classroom with some students
        Classroom classroom = new Classroom(expected.keySet().toArray(new Student[0]));

        // when
        Map<Student, Double> gradeBook = classroom.getGradeBook();

        // then
        Assert.assertNotNull(gradeBook);
        // Check that the grade book contains the expected students and grades
        for (Map.Entry<Student, Double> expectedEntry : expected.entrySet()) {
            Student expectedKey = expectedEntry.getKey();
            Double expectedValue = expectedEntry.getValue();
            Double actualValue = gradeBook.get(expectedKey);
            Assert.assertEquals(expectedValue, actualValue, 0.01);
        }
    }

    // given
    @Test
    public void test0() {
        // Create a new classroom with some students
        Student alice = new Student("Alice", "Smith", new Double[]{80.0, 90.0, 95.0});
        Student bob = new Student("Bob", "Jones", new Double[]{75.0, 85.0, 90.0});
        Student charlie = new Student("Charlie", "Brown", new Double[]{85.0, 95.0, 100.0});
        Map<Student, Double> map = new HashMap<>();
        map.put(alice, 88.33);
        map.put(bob, 83.33);
        map.put(charlie, 93.33);
        test(map);
    }


    // given
    @Test
    public void test1() {
        // Create a new classroom with some students
        Student alice = new Student("Alice", "Smith", new Double[]{100.0, 100.0, 100.0});
        Student bob = new Student("Bob", "Jones", new Double[]{75.0, 85.0, 90.0});
        Student charlie = new Student("Charlie", "Brown", new Double[]{85.0, 95.0, 100.0});
        Map<Student, Double> map = new HashMap<>();
        map.put(alice, 100.00);
        map.put(bob, 83.33);
        map.put(charlie, 93.33);
        test(map);
    }

    // given
    @Test
    public void test2() {
        // Create a new classroom with some students
        Student alice = new Student("Alice", "Smith", new Double[]{80.0, 90.0, 95.0});
        Student bob = new Student("Bob", "Jones", new Double[]{75.0, 85.0, 90.0});
        Student charlie = new Student("Charlie", "Brown", new Double[]{85.0, 95.0, 100.0});
        Map<Student, Double> map = new HashMap<>();
        map.put(alice, 88.33);
        map.put(bob, 83.33);
        map.put(charlie, 93.33);
        test(map);
    }


    // given
    @Test
    public void test3() {
        // Create a new classroom with some students
        Student alice = new Student("Alice", "Smith", new Double[]{50.0, 50.0, 50.0});
        Student bob = new Student("Bob", "Jones", new Double[]{75.0, 85.0, 90.0});
        Student charlie = new Student("Charlie", "Brown", new Double[]{85.0, 95.0, 100.0});
        Map<Student, Double> map = new HashMap<>();
        map.put(alice, 50.0);
        map.put(bob, 83.33);
        map.put(charlie, 93.33);
        test(map);
    }
}
