package Lab_tuan2;
import java.util.Scanner;
import java.util.Arrays;
public class bai01 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập sl ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập cphần tử");
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d]=",i);
            arr[i] = sc.nextInt();
        }
        System.out.print("Mảng vừa nhập ");
        for(int num:arr) {
            System.out.print(num + " ");;}
        System.out.println();
        System.out.print("Nhập x");
        int x = sc.nextInt();
        boolean found = false;
        System.out.print("Vt của x ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("Không tìm thấy " + x);
        }
        System.out.println();
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Giá trị lớn nhất " + max);
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Giá trị nhỏ nhất " + min);
        System.out.print("Vị trí lớn nhất: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.print("Mảng sau khi sắp xếp tăng dần: ");
        for (int num : arr) {
            System.out.print(num);
        }
    }
}
