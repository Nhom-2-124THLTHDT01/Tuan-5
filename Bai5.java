/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();

        // Nhập số lượng phần tử
        System.out.print("Nhập số lượng phần tử trong danh sách: ");
        int n = scanner.nextInt();

        // Nhập các phần tử và thêm vào danh sách
        System.out.println("Nhập các phần tử của danh sách:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            int element = scanner.nextInt();
            integerList.add(element);
        }

        // In ra các phần tử của danh sách
        System.out.println("Các phần tử trong danh sách là:");
        for (int num : integerList) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

