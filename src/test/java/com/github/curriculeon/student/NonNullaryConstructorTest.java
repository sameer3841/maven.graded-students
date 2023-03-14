package com.github.curriculeon.student;

import com.github.curriculeon.Student;
import org.junit.Assert;
import org.junit.Test;

public class NonNullaryConstructorTest {

        private void test(String expectedFirstName, String expectedLastName, Double[] expectedExamScores) {
            //Arrange: Given
            Student student = new Student(expectedFirstName, expectedLastName, expectedExamScores);
            boolean isCorrectType = student instanceof Comparable;

            //Act: When
            String actualFirstName = student.getFirstName();
            String actualLastName = student.getLastName();
            Double[] actualExamScores = student.getExamScores();

            //Assert:Then
            Assert.assertTrue(isCorrectType);
            Assert.assertEquals(expectedFirstName, actualFirstName);
            Assert.assertEquals(expectedLastName, actualLastName);
            Assert.assertArrayEquals(expectedExamScores, actualExamScores);
        }

    @Test
    public void test0() {
        //Arrange: Given
        String expectedFirstName = "";
        String expectedLastName = "";
        Double[] examScores = {};
        test(expectedFirstName, expectedLastName, examScores);
    }

    @Test
    public void testConstructor_returnsFirstName() {
        //Arrange
        Double[] examScores = {67.0, 74.0, 85.0};
        test("Leon", "Hunter", examScores);
    }

    @Test
    public void testConstructor_returnsLastName() {
        //Arrange
        Double[] examScores = {23.0, 44.0, 51.0};
        test("Katrina", "High", examScores);
    }
}
