package lab1;
import java.util.Scanner;
public class bai8 {
    public static class sodautienvatancung {
        public static int sotancung(int so) {
            return Math.abs(so) % 10;
        }
        public static int sodautien(int so) {
            so = Math.abs(so);
            while (so >= 10) {
                so /= 10;
            }
            return so;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("nhap so: ");
            int so = sc.nextInt();
            int sodautien = sodautien(so);
            int sotancung = sotancung(so);


            System.out.println("so dau tien: " + sodautien);
            System.out.println("so tan cung: " + sotancung);

        }
}}
