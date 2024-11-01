package Java.THTuan5;

import java.util.Scanner;

public class Bai3 {
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

        // Sắp xếp mảng theo thứ tự tăng dần
        bubbleSort(array);

        // In mảng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp theo thứ tự tăng dần là: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    // Phương thức sắp xếp nổi bọt
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        
        // Sắp xếp
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Hoán đổi phần tử
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // Nếu không có hoán đổi nào xảy ra, mảng đã được sắp xếp
            if (!swapped) {
                break;
            }
        }
    }
}

