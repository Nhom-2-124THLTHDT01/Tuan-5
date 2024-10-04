
import java.util.Scanner;

public class Cau6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        Nhap(a,n);
        a = Them(a, n);
        IN(a,n+1);
        a = Xoa(a, n);
        IN(a,n-1);
    }

    public  static void Nhap(int a[], int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("Nhap phan tu thu " + i + " : ");
            a[i] = sc.nextInt();
        }      
    }
    public static void IN(int a[], int n){
         for(int i=0;i<n;i++)
            System.out.println("Phan tu thu " + i + " la : " + a[i] );
    }
    public static int[] Them(int a[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can them: ");
        int x = sc.nextInt();
        System.out.println("Nhap vi tri: ");
        int vitri = sc.nextInt();
        if (vitri < 0 || vitri > n) {
            System.out.println("Vi tri khong hop le.");
            return a; 
        }
        int[] newArray = new int[n + 1];

        for (int i = 0; i < vitri; i++) {
            newArray[i] = a[i];
        }
        newArray[vitri] = x;

        for (int i = vitri; i < n; i++) {
            newArray[i + 1] = a[i];
        }
        return newArray;
    }
    public static int[] Xoa(int a[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vi tri can xoa: ");
        int vitri = sc.nextInt();

        // Kiểm tra vị trí hợp lệ
        if (vitri < 0 || vitri >= n) {
            System.out.println("Vi tri khong hop le.");
            return a; // Trả về mảng cũ nếu vị trí không hợp lệ
        }

        // Tạo mảng mới nhỏ hơn
        int[] newArray = new int[n - 1];

        // Sao chép các phần tử trước vị trí cần xóa
        for (int i = 0; i < vitri; i++) {
            newArray[i] = a[i];
        }

        // Sao chép các phần tử sau vị trí cần xóa
        for (int i = vitri + 1; i < n; i++) {
            newArray[i - 1] = a[i];
        }

        return newArray; // Trả về mảng mới
    }
}
