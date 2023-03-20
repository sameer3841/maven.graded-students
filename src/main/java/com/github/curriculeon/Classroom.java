package com.github.curriculeon;

import java.util.*;

public class Classroom {
    private List<Student> students;

    public Classroom(Student[] students) {
        this.students = new LinkedList<>(Arrays.asList(students));
    }

    public Classroom() {
        this(new Student[]{});
    }

    public Student[] getStudents() {
        return students.toArray(new Student[0]);
    }

    public Double getAverageExamScore() {
        return students
                .stream()
                .mapToDouble(Student::getAverageExamScore)
                .average()
                .orElse(0);
    }

    public Boolean addStudent(Student student) {
        if (students.contains(student)) {
            return false;
        }
        students.add(student);
        return true;
    }

    public Boolean removeStudent(Student student) {
        if (!students.contains(student)) {
            return false;
        }
        students.remove(student);
        return true;
    }

    public Student[] getStudentsByScore() {
        return students
                .stream()
                .sorted()
                .toArray(Student[]::new);
    }

    public Map<Student, Character> getGradeBook() {
        Map<Student, Character> gradeBook = new HashMap<>();
        int numStudents = students.size();
        if (numStudents == 0) {
            return gradeBook;
        }
        // Sort students by average exam score
        Student[] sortedStudents = getStudentsByScore();
        // Determine grade cutoffs based on percentile ranks
        // Assign grades based on percentile ranks
        for (int i = 0; i < sortedStudents.length; i++) {
            Student sortedStudent = sortedStudents[i];
            double percentileRank = ((double) i) / numStudents;
            char grade;
            if (percentileRank < .1) {
                grade = 'A';
            } else if (percentileRank < .29) {
                grade = 'B';
            } else if (percentileRank < .5) {
                grade = 'C';
            } else if (percentileRank < .89) {
                grade = 'D';
            } else if (percentileRank < .9) {
                grade = 'F';
            } else {
                grade = 'A';
            }
            gradeBook.put(sortedStudents[i], grade);
        }
        return gradeBook;
    }
}