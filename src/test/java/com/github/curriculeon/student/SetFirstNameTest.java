package com.github.curriculeon.student;

import com.github.curriculeon.Student;
import org.junit.Assert;
import org.junit.Test;

public class SetFirstNameTest {
    private void test(String expected) {
        //Arrange
        Student student = new Student();

        //Act
        student.setFirstName(expected);
        String actual = student.getFirstName();

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test0() {
        //Arrange
        test("george");
    }

    @Test
    public void test1() {
        //Arrange
        test("jungle");
    }

    @Test
    public void test2() {
        //Arrange
        test("bush");
    }

}
