/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();

        // Nhập số lượng phần tử ban đầu
        System.out.print("Nhập số lượng phần tử ban đầu trong danh sách: ");
        int n = scanner.nextInt();

        // Nhập các phần tử ban đầu và thêm vào danh sách
        System.out.println("Nhập các phần tử của danh sách:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            int element = scanner.nextInt();
            integerList.add(element);
        }

        // In ra danh sách hiện tại
        System.out.println("Danh sách hiện tại: " + integerList);

        // Thêm phần tử
        System.out.print("Nhập phần tử muốn thêm: ");
        int elementToAdd = scanner.nextInt();
        System.out.print("Nhập vị trí muốn thêm (0 đến " + integerList.size() + "): ");
        int positionToAdd = scanner.nextInt();

        if (positionToAdd >= 0 && positionToAdd <= integerList.size()) {
            integerList.add(positionToAdd, elementToAdd);
            System.out.println("Danh sách sau khi thêm: " + integerList);
        } else {
            System.out.println("Vị trí không hợp lệ!");
        }

        // Xóa phần tử
        System.out.print("Nhập vị trí muốn xóa (0 đến " + (integerList.size() - 1) + "): ");
        int positionToRemove = scanner.nextInt();

        if (positionToRemove >= 0 && positionToRemove < integerList.size()) {
            integerList.remove(positionToRemove);
            System.out.println("Danh sách sau khi xóa: " + integerList);
        } else {
            System.out.println("Vị trí không hợp lệ!");
        }

        scanner.close();
    }
}

