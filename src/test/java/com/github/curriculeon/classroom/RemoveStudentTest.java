package com.github.curriculeon.classroom;

import com.github.curriculeon.Classroom;
import com.github.curriculeon.Student;
import org.junit.Assert;
import org.junit.Test;

public class RemoveStudentTest {
    // given
    private void test(Student[] baseStudents, Student studentToRemove, Student[] expected) {
        // when
        Classroom classroom = new Classroom(baseStudents);
        classroom.removeStudent(studentToRemove);
        Student[] actual = classroom.getStudents();
        
        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test0() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student studentToRemove = student1;
        Student[] baseStudents = new Student[]{student1, student2, student3, student4};
        Student[] expected = new Student[]{student2, student3, student4};
        test(baseStudents, studentToRemove, expected);
    }

    @Test
    public void test1() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student studentToRemove = student1;
        Student[] baseStudents = new Student[]{student1, student2, student3};
        Student[] expected = new Student[]{student2, student3};
        test(baseStudents, studentToRemove, expected);
    }

    @Test
    public void test2() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student studentToRemove = student1;
        Student[] baseStudents = new Student[]{student1, student2};
        Student[] expected = new Student[]{student2};
        test(baseStudents, studentToRemove, expected);
    }

}
