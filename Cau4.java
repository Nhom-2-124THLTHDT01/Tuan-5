
import java.util.Scanner;

public class Cau4 {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        Nhap(a,n);
        int dem = DEM(a, n);
        System.out.println("So xuat hien nhieu nhat la : " + dem );
    }

    public  static void Nhap(int a[], int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("Nhap phan tu thu " + i + " : ");
            a[i] = sc.nextInt();
        }      
    }
    public  static int DEM(int a[], int n){
        int dem2=0;
        int so = 0;
        for(int i=0;i<n;i++){
            int dem1 = 0;
            for(int j=0;j<n;j++)
                if(a[i]==a[j]){
                    dem1++;
                }
            if(dem1>dem2){
                dem2 = dem1;
                so = a[i];
            }
        }
        return so;
            
    }  
}
