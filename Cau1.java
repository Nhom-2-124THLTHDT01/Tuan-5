import java.util.Scanner;

public class Cau1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        Nhap(a,n);
        int tong = Tong(a,n);
        System.out.println("Tong cac phan tu la : " + tong );
    }

    public  static void Nhap(int a[], int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("Nhap phan tu thu " + i + " : ");
            a[i] = sc.nextInt();
        }      
    }
    public  static int Tong(int a[], int n){
        int s = 0;
        for(int i=0;i<n;i++){
            s = s + a[i];
        }     
        return s; 
    }
}