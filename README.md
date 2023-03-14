# Assignment Description

In this assignment, you will be implementing a `Classroom` class and a `Student` class. The `Classroom` class will contain an array of `Student` objects, and will provide methods for manipulating and retrieving information about the students. The `Student` class will represent a single student, and will contain information about the student's name and exam scores.

## `Classroom` Class

The `Classroom` class will contain the following methods:

### `public Classroom(Student[] students)`

This constructor should take an array of `Student` objects and use it to initialize the internal array of `Student` objects in the `Classroom` object.

### `public Classroom()`

This constructor should create an empty `Classroom` object with no students.

### `public Student[] getStudents()`

This method should return an array of all the `Student` objects in the `Classroom` object.

### `public Double getAverageExamScore()`

This method should return the average exam score for all the `Student` objects in the `Classroom` object.

### `public Boolean addStudent(Student... students)`

This method should take one or more `Student` objects and add them to the `Classroom` object. If any of the `Student` objects being added already exist in the `Classroom` object, they should not be added again.

### `public Boolean removeStudent(Student student)`

This method should remove the specified `Student` object from the `Classroom` object.

### `public Student[] getStudentsByScore()`

This method should return an array of all the `Student` objects in the `Classroom` object, sorted in descending order by their average exam score.

### `public Map<Student, Double> getGradeBook()`

This method should return a map that associates each `Student` object in the `Classroom` object with their average exam score.

## `Student` Class

The `Student` class will contain the following methods:

### `public Student(String firstName, String lastName, Double[] testScores)`

This constructor should take the student's first and last name, as well as an array of exam scores, and use them to initialize the `Student` object.

### `public Student()`

This constructor should create an empty `Student` object with no name or exam scores.

### `public String getFirstName()`

This method should return the student's first name.

### `public void setFirstName(String firstName)`

This method should set the student's first name to the specified value.

### `public String getLastName()`

This method should return the student's last name.

### `public void setLastName(String lastName)`

This method should set the student's last name to the specified value.

### `public Double[] getExamScores()`

This method should return an array of the student's exam scores.

### `public void addExamScore(double examScore)`

This method should add a new exam score to the student's array of exam scores.

### `public void setExamScore(int examNum, double updateScore)`

This method should update the specified exam score with a new value.

### `public Double getAverageExamScore()`

This method should return the average exam score for the student.

### `public String toString()`

This method should return a string representation of the student, including their name and exam scores.

### `public int compareTo(Student studentToCompareAgainst)`

This method should compare the current `Student` object to another `Student` object, based first on their average exam score, and then on their name.

# Task
Your task is to implement the `Classroom` and `Student` classes, and to write JUnit test cases to ensure that each feature
