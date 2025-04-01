package lab1;
import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        System.out.println("nhap canh thu nhat:");
        Scanner sc= new Scanner(System.in);
        double canhThuNhat = sc.nextDouble();
        System.out.println("nhap canh thu hai:");
        double canhThuHai = sc.nextDouble();
        System.out.println("nhap canh thu 3:");
        double canhThuBa = sc.nextDouble();
        if (canhThuNhat + canhThuHai > canhThuBa && canhThuNhat + canhThuBa > canhThuHai && canhThuHai + canhThuBa > canhThuNhat) {
            System.out.println("tam giac hop le");
        } else {
            System.out.println("tam giac khong hop le");
        }

    }
}
