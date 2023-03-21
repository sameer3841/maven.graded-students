package com.github.curriculeon;


import java.util.*;

public class Classroom {

    private List<Student> studentList;

    public Classroom(Student[] students) {
        this.studentList = new ArrayList<>(Arrays.asList(students));
    }

    public Classroom() {
        studentList = new ArrayList<>(Collections.emptyList());
    }

    public Student[] getStudents() {
        return studentList.toArray(new Student[0]);
    }


    public Double getAverageExamScore() {
        double ans = 0;
        int tracker = 0;
        for(Student i : studentList){
            ans += i.getSumOfExamScore();
            tracker += i.getExamScores().length;
        }
        return ans / tracker;
    }

    public Boolean addStudent(Student students) {
        studentList.add(students);
        return studentList.contains(students);
    }

    public Boolean removeStudent(Student student) {
        studentList.remove(student);
        return !studentList.contains(student);
    }

    public Student[] getStudentsByScore() {
        return null;
    }

    public Map<Student, Character> getGradeBook() {
        Map<Student, Character> gradeBook = new HashMap<>();
        for (Student student : studentList)
            gradeBook.put(student,
                    student.getGrade(student.getAverageExamScore()));
        return gradeBook;
    }

}

