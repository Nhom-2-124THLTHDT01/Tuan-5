package Bai1;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước mảng
        System.out.print("Nhập kích thước mảng: ");
        int size = scanner.nextInt();

        // Khởi tạo mảng
        int[] array = new int[size];

        // Nhập các phần tử của mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Tính tổng
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        // In ra tổng
        System.out.println("Tổng các phần tử trong mảng là: " + sum);
        
        scanner.close();
    }
}

