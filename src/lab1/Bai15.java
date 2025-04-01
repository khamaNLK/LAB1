package lab1;

import java.util.Scanner;
public class Bai15 {
    public static void ngaythang(String lich) {
        String[] phan = lich.trim().split("/");
        if (phan.length == 3) {
            String ngay = phan[0];
            String thang = phan[1];
            String nawm = phan[2];
            System.out.println("Ngày: " + ngay);
            System.out.println("Tháng: " + thang);
            System.out.println("Năm: " + nawm);
        } else {
            System.out.println("khl.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày (dd/MM/yyyy): ");
        String lich = scanner.nextLine();

        ngaythang(lich);
    }
}

