package Java.THTuan5;

import java.util.Scanner;

public class Bai2 {
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

        // Đảo ngược mảng
        reverseArray(array);

        // In mảng sau khi đảo ngược
        System.out.println("Mảng sau khi đảo ngược là: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    // Phương thức đảo ngược mảng
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Hoán đổi phần tử ở vị trí left và right
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Cập nhật vị trí
            left++;
            right--;
        }
    }
}

