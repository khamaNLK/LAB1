package Lab_tuan2;
import java.util.Scanner;
class SinhVien {
    private int mssv;
    private String hoten;
    private float diemLT;
    private float diemTH;
    public SinhVien() {
        this.mssv = 0;
        this.hoten = "";
        this.diemLT = 0;
        this.diemTH = 0;
    }
    public SinhVien(int maSinhVien, String hoTen, float diemLT, float diemTH) {
        this.mssv = maSinhVien;
        this.hoten = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }
    public int getMaSinhVien() {
        return mssv;
    }
    public void setMaSinhVien(int maSinhVien) {
        this.mssv = maSinhVien;
    }
    public String getHoTen() {
        return hoten;
    }
    public void setHoTen(String hoTen) {
        this.hoten = hoTen;
    }
    public float getDiemLT() {
        return diemLT;
    }
    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }
    public float getDiemTH() {
        return diemTH;
    }
    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }
    public float tinhDiemTrungBinh() {
        return (diemLT + diemTH) / 2;
    }
    @Override
    public String toString() {
        return String.format("MSSV: %d, Họ tên: %s, Điểm LT: %.2f, Điểm TH: %.2f, Điểm TB: %.2f",
                mssv, hoten, diemLT, diemTH, tinhDiemTrungBinh());
    }
}
public class Bai03 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(1, "Nguyễn Duy Lân", 1.0f, 2.5f);
        SinhVien sv2 = new SinhVien(2, "Mai Việt Hoàng", 3.0f, 2.0f);
        SinhVien sv3 = new SinhVien();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap MSSV: ");
            sv3.setMaSinhVien(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Nhap ho ten: ");
            sv3.setHoTen(scanner.nextLine());
            System.out.print("Nhap diem LT: ");
            sv3.setDiemLT(scanner.nextFloat());
            System.out.print("Nhap diem TH: ");
            sv3.setDiemTH(scanner.nextFloat());
            System.out.println("\nDanh sach sinh vien: ");
            System.out.printf("%-10s %-20s %-10s %-10s %-10s\n", "MSSV", "Ho Ten", "Diem LT", "Diem TH", "Diem TB");
            System.out.printf("%-10d %-20s %-10.2f %-10.2f %-10.2f\n",
                    sv1.getMaSinhVien(), sv1.getHoTen(), sv1.getDiemLT(), sv1.getDiemTH(), sv1.tinhDiemTrungBinh());
            System.out.printf("%-10d %-20s %-10.2f %-10.2f %-10.2f\n",
                    sv2.getMaSinhVien(), sv2.getHoTen(), sv2.getDiemLT(), sv2.getDiemTH(), sv2.tinhDiemTrungBinh());
            System.out.printf("%-10d %-20s %-10.2f %-10.2f %-10.2f\n",
                    sv3.getMaSinhVien(), sv3.getHoTen(), sv3.getDiemLT(), sv3.getDiemTH(), sv3.tinhDiemTrungBinh());
        }
    }
}
