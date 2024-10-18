/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {
    private String studentId;
    private String name;
    private double averageScore;

    public Student(String studentId, String name, double averageScore) {
        this.studentId = studentId;
        this.name = name;
        this.averageScore = averageScore;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return "Mã sinh viên: " + studentId + ", Tên: " + name + ", Điểm trung bình: " + averageScore;
    }

    public static class Manager {
        private ArrayList<Student> students;

        public Manager() {
            students = new ArrayList<>();
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public void removeStudent(String studentId) {
            students.removeIf(student -> student.getStudentId().equals(studentId));
        }

        public Student findStudent(String studentId) {
            for (Student student : students) {
                if (student.getStudentId().equals(studentId)) {
                    return student;
                }
            }
            return null;
        }

        public void sortStudentsByScore() {
            Collections.sort(students, Comparator.comparingDouble(Student::getAverageScore).reversed());
        }

        public void displayStudents() {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}

