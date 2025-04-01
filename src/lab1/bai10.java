package lab1;
import java.util.Scanner;

public class bai10 {
    public static int dem(int so) {
        so = Math.abs(so);
        int count = 0;
        if (so == 0) return 1;
        while (so > 0) {
            count++;
            so /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int so = sc.nextInt();

        int chuso = dem(so);
        System.out.println("Số chữ số trong số: " + chuso);


    }
}
