package lab1;

import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap nam");
        int nam = sc.nextInt();
        if ((nam % 4 != 0 || nam % 100 == 0) && nam % 1000 != 0) {
            System.out.println("nam\t" + nam + "\tla nam khong nhuan");
        } else {
            System.out.println("nam\t" + nam + "\tla nam nhuan");
        }

    }
}

