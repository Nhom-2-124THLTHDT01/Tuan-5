package Java.THTuan5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    private String studentId;
    private String name;
    private double gpa;

    public Student(String studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public void displayInfo() {
        System.out.println("Ma sinh vien: " + studentId + ", Ten: " + name + ", Diem trung binh: " + gpa);
    }
}

public class Bai7 {
    private ArrayList<Student> studentList;

    public Bai7() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(String studentId) {
        Student studentToRemove = null;
        for (Student student : studentList) {
            if (student.getStudentId().equals(studentId)) {
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove != null) {
            studentList.remove(studentToRemove);
            System.out.println("Da xoa sinh vien voi ma: " + studentId);
        } else {
            System.out.println("Khong tim thay sinh vien voi ma: " + studentId);
        }
    }

    public void searchStudentById(String studentId) {
        for (Student student : studentList) {
            if (student.getStudentId().equals(studentId)) {
                student.displayInfo();
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien voi ma: " + studentId);
    }

    public void sortStudentsByGpa() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s1.getGpa(), s2.getGpa());
            }
        });
        System.out.println("Danh sach sinh vien sau khi sap xep theo diem trung binh:");
        for (Student student : studentList) {
            student.displayInfo();
        }
    }

    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sach sinh vien rong.");
        } else {
            System.out.println("Danh sach sinh vien:");
            for (Student student : studentList) {
                student.displayInfo();
            }
        }
    }

    public static void main(String[] args) {
        Bai7 management = new Bai7();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== QUAN LY SINH VIEN =====");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Xoa sinh vien theo ma");
            System.out.println("3. Tim kiem sinh vien theo ma");
            System.out.println("4. Sap xep sinh vien theo diem trung binh");
            System.out.println("5. Hien thi danh sach sinh vien");
            System.out.println("6. Thoat");
            System.out.print("Chon mot tuy chon: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Nhap ma sinh vien: ");
                    String studentId = scanner.nextLine();
                    System.out.print("Nhap ten sinh vien: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhap diem trung binh: ");
                    double gpa = scanner.nextDouble();
                    Student newStudent = new Student(studentId, name, gpa);
                    management.addStudent(newStudent);
                    break;

                case 2:
                    System.out.print("Nhap ma sinh vien can xoa: ");
                    String removeId = scanner.nextLine();
                    management.removeStudent(removeId);
                    break;

                case 3:
                    System.out.print("Nhap ma sinh vien can tim: ");
                    String searchId = scanner.nextLine();
                    management.searchStudentById(searchId);
                    break;

                case 4:
                    management.sortStudentsByGpa();
                    break;

                case 5:
                    management.displayAllStudents();
                    break;

                case 6:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Tuy chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
