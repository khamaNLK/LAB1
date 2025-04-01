package lab1;
import java.util.Scanner;
public class bai7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập điểm môn Lý: ");
        double Ly = sc.nextDouble();

        System.out.print("Nhập điểm môn Hóa: ");
        double Hoa = sc.nextDouble();

        System.out.print("Nhập điểm môn Sinh: ");
        double SInh = sc.nextDouble();

        System.out.print("Nhập điểm môn Toán: ");
        double toan = sc.nextDouble();

        System.out.print("Nhập điểm môn Máy tính: ");
        double maytinh = sc.nextDouble();
        double tongdiem = Ly+Hoa+SInh+toan+maytinh;
        double diemtungbinh = tongdiem/5*100;
        String hang;
        if (diemtungbinh > 900) {
            hang = "A";
        } else if (diemtungbinh > 800) {
            hang = "B";
        } else if (diemtungbinh > 700) {
            hang = "C";
        } else if (diemtungbinh > 600) {
            hang = "D";
        } else if (diemtungbinh > 400) {
            hang = "E";
        } else {
            hang = "F";
        }
        System.out.println("\nTổng điểm: " + tongdiem);
        System.out.println("Tỷ lệ phần trăm: " + diemtungbinh + "%");
        System.out.println("Hạng: " + hang);
        }
    }

