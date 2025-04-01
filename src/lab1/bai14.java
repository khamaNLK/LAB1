package lab1;
import java.util.Scanner;

public class bai14 {
    public static void hovaten(String hovaten) {
        String[] parts = hovaten.trim().split("\\s+");
        if (parts.length == 1) {
            System.out.println("ho: " + parts[0]);
            System.out.println("Tem ");
            System.out.println("Ten dem: ");
        } else if (parts.length == 2) {
            System.out.println("Họ: ");
            System.out.println("Ten: " + parts[1]);
            System.out.println("đệm: ");
        } else {
            String lastName = parts[0];
            String firstName = parts[parts.length - 1];
            String middleName = String.join(" ", java.util.Arrays.copyOfRange(parts, 1, parts.length - 1)); // Tên đệm
            System.out.println("Họ " + lastName);
            System.out.println("Tên: " + firstName);
            System.out.println("Tên đệm " + middleName);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên đầy đủ: ");
        String fullName = scanner.nextLine();
        hovaten(fullName);;
        scanner.close();
    }
}
