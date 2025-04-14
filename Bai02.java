package Lab_tuan2;
import java.util.Scanner;
class HinhChuNhat {
    private double cD;
    private double cR;
    public void setChieuDai(double chieuDai) {
        this.cD = chieuDai;
    }
    public void setChieuRong(double chieuRong) {
        this.cR = chieuRong;
    }
    public double getChieuDai() {
        return cD;
    }
    public double getChieuRong() {
        return cR;
    }
    public double DienTich() {
        return cD * cR;
    }
    public double ChuVi() {
        return 2 * (cD + cR);
    }
    @Override
    public String toString() {
        return "Chieu dai: " + cD + ", Chieu rong: " + cR + ", Dien tich: " +
                DienTich() + ",C vi: " + ChuVi();
    }
}
public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HinhChuNhat hcn = new HinhChuNhat();
        System.out.print("Nhap chieu dai: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double chieuRong = scanner.nextDouble();
        hcn.setChieuDai(chieuDai);
        hcn.setChieuRong(chieuRong);
        System.out.println(hcn.toString());
    }
}
