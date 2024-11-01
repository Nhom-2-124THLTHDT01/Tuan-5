package Java.THTuan5;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        // Khởi tạo mảng
        int[] array = new int[n];

        // Nhập các phần tử vào mảng
        System.out.println("Nhập vào các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Tính tổng các phần tử trong mảng
        int sum = calculateSum(array);

        // In kết quả
        System.out.println("Tổng các phần tử trong mảng là: " + sum);

        scanner.close();
    }

    // Phương thức tính tổng các phần tử trong mảng
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num; // Cộng từng phần tử vào tổng
        }
        return sum;
    }
}

