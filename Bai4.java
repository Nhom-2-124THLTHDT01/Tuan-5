package Java.THTuan5;

import java.util.HashMap;
import java.util.Scanner;

public class Bai4 {
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

        // Tìm phần tử xuất hiện nhiều nhất
        int mostFrequent = findMostFrequent(array);
        System.out.println("Phần tử xuất hiện nhiều nhất trong mảng là: " + mostFrequent);

        scanner.close();
    }

    // Phương thức tìm phần tử xuất hiện nhiều nhất
    public static int findMostFrequent(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int maxCount = 0;
        int mostFrequent = array[0];

        // Đếm tần suất xuất hiện của từng phần tử
        for (int num : array) {
            int count = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, count);
            
            // Cập nhật phần tử xuất hiện nhiều nhất
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = num;
            }
        }

        return mostFrequent;
    }
}

