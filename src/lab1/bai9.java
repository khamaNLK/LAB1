package lab1;
import java.util.Scanner;

public class bai9 {

    public static class tongvatich {

        public static int tong(int so) {
            so = Math.abs(so);
            int sum = 0;
            while (so > 0) {
                sum += so % 10;
                so /= 10;
            }
            return sum;
        }

        public static int tich(int so) {
            so = Math.abs(so);
            int product = 1;
            if (so == 0) return 0;
            while (so > 0) {
                product *= so % 10;
                so /= 10;

        }   return product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();


        int sum = tongvatich.tong(number);
        int product = tongvatich.tich(number);
        System.out.println("Tổng các chữ số: " + sum);
        System.out.println("Tích các chữ số: " + product);

    }
}}
