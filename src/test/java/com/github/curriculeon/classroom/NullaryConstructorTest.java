package com.github.curriculeon.classroom;

import com.github.curriculeon.Classroom;
import com.github.curriculeon.Student;
import org.junit.Assert;
import org.junit.Test;

public class NullaryConstructorTest {
    // given
    @Test
    public void test() {
        // when
        Classroom testClassroom = new Classroom();
        Student[] actual = testClassroom.getStudents();

        // then
        Assert.assertNotNull(actual);
    }
}

