package lab1;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap do f:");
        double doF = sc.nextDouble();
        double doC= (doF-32)/1.8;
        System.out.println("do C la:"+ doC);
    }
}
