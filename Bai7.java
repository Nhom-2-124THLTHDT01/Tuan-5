/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai7;
import java.util.Scanner;

public class Bai7 {


    public static void main(String[] args) {
        Student.Manager manager = new Student.Manager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Tìm kiếm sinh viên");
            System.out.println("4. Sắp xếp sinh viên theo điểm");
            System.out.println("5. Hiển thị danh sách sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng mới

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã sinh viên: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhập tên sinh viên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập điểm trung bình: ");
                    double score = scanner.nextDouble();
                    manager.addStudent(new Student(id, name, score));
                    break;
                case 2:
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    String removeId = scanner.nextLine();
                    manager.removeStudent(removeId);
                    break;
                case 3:
                    System.out.print("Nhập mã sinh viên cần tìm: ");
                    String searchId = scanner.nextLine();
                    Student foundStudent = manager.findStudent(searchId);
                    if (foundStudent != null) {
                        System.out.println("Tìm thấy: " + foundStudent);
                    } else {
                        System.out.println("Không tìm thấy sinh viên với mã " + searchId);
                    }
                    break;
                case 4:
                    manager.sortStudentsByScore();
                    System.out.println("Đã sắp xếp sinh viên theo điểm.");
                    break;
                case 5:
                    manager.displayStudents();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }
}

