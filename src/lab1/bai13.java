package lab1;

import java.util.Scanner;
public class bai13 {
    public static int dem(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        Scanner khampro321 = new Scanner(System.in);
        System.out.print("nhap: ");
        String input = khampro321.nextLine();

        int wordCount = dem(input);
        System.out.println("so tu " + wordCount);
    }
}
