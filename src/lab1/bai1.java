package lab1;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập tên sinh viên:");
        String name = sc.nextLine();
        System.out.println("nhap ngay sinh:");
        String ngaysinh = sc.nextLine();
        System.out.println("nhap ma so sinh vien:");
        String mssv = sc.nextLine();
        System.out.println("\nThông tin sinh viên:");
        System.out.println("Tên: "+ name);
        System.out.println("Ngày sinh: " +ngaysinh);
        System.out.println("Mã số sinh viên: " + mssv);
    }
}
