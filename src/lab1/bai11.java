package lab1;

import java.util.Scanner;

public class bai11 {
    public static int sodaonguoc(int so) {
        so = Math.abs(so);
        int daonguoc = 0;
        while (so > 0) {
            daonguoc = daonguoc * 10 + (so % 10);
            so /= 10;
        }
        return daonguoc;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap sp");
        int so = scanner.nextInt();

        int daonguoc = sodaonguoc(so);
        System.out.println("Số đảo ngược: " +daonguoc);

    }
}

