package lab1;
import java.util.Scanner;

public class bai12 {
    public static boolean doixung(int so) {
        int original = so;
        so = Math.abs(so);;
        int daonguoc = 0;
        while (so > 0) {
            daonguoc = daonguoc * 10 + (so % 10);
            so /= 10;
        }
        return original == daonguoc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so ");
        int so = sc.nextInt();

        boolean doixung = doixung(so);
        if (doixung) {
            System.out.println(so + " là số đối xứng.");
        } else {
            System.out.println(so + " không phải là số đối xứng.");
        }

    }
}