package lab1;
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so thu nhat:");
        double soThuNhat = sc.nextDouble();
        System.out.println("nhap so thu 2:");
        double soThuHai = sc.nextDouble();
        System.out.println("nhap so thu 3:");
        double soThuBa = sc.nextDouble();
        double min = soThuNhat;
        if (soThuHai < min) {
            min = soThuHai;
        }
        if (soThuBa < min) {
            min = soThuBa;
        }
        System.out.println("Giá trị nhỏ nhất là: " + min);
    }
}
