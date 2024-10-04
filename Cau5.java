
import java.util.Scanner;

public class Cau5 {
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        Nhap(a,n);
        IN(a,n);
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
}
