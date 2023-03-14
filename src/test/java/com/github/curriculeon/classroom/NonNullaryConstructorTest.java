package com.github.curriculeon.classroom;

import com.github.curriculeon.Classroom;
import com.github.curriculeon.Student;
import org.junit.Assert;
import org.junit.Test;

public class NonNullaryConstructorTest {
    // given
    private void test(Student[] students) {
        Student[] expected = {};

        // when
        Classroom testClassroom = new Classroom(students);
        Student[] actual = testClassroom.getStudents();

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test0(Student[] students) {
        test(new Student[0]);
    }

    @Test
    public void test1(Student[] students) {
        test(new Student[1]);
    }

    @Test
    public void test2(Student[] students) {
        test(new Student[2]);
    }
}

