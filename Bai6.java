package Java.THTuan5;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Nhap cac phan tu vao mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Mang:");
        for (int num : finalArray) {
            System.out.print(num + " ");
        }

        System.out.print("Nhap gia tri can them: ");
        int newValue = scanner.nextInt();
        System.out.print("Nhap gia tri can them (tu 1 den " + (n + 1) + "): ");
        int position = scanner.nextInt() - 1;

        int[] newArray = new int[n + 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == position) {
                newArray[i] = newValue;
            } else {
                newArray[i] = array[j++];
            }
        }

        System.out.println("Mang sau khi them phan tu: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Nhap vi tri can xoa (tu 1 den " + newArray.length + "): ");
        int removePos = scanner.nextInt() - 1;

        int[] finalArray = new int[newArray.length - 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i != removePos) {
                finalArray[j++] = newArray[i];
            }
        }

        System.out.println("Mang sau khi xoa:");
        for (int num : finalArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
