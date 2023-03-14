package com.github.curriculeon.student;

import com.github.curriculeon.Student;
import org.junit.Assert;
import org.junit.Test;

public class SetLastNameTest {
    private void test(String expected) {
        //Arrange
        Student student = new Student();

        //Act
        student.setLastName(expected);
        String actual = student.getLastName();

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
