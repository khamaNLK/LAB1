package lab1;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap chieu rong:");
        double chieuRong = sc.nextDouble();
        System.out.println("nhap chieu dai:");
        double chieuDai= sc.nextDouble();
        double dienTich= chieuDai* chieuRong;
        System.out.println("dien tich hinh chu nhat"+dienTich);

    }
}
