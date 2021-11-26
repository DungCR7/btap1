package btap1;

import java.util.Scanner;

public class tinhTongHaiSo {
    // private int instanceVarialbe; co cung duoc k co cung k sao
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Nhap a : ");
        a = scanner.nextInt();
        System.out.println("Nhap b : ");
        b = scanner.nextInt();
        int tong = a + b ;
        System.out.println("Tong la : "+tong);
        int hieu = a - b ;
        System.out.println("Hieu la : "+hieu);
        int tich = a*b;
        System.out.println("Tich la : "+tich);
        int thuong = a / b;
        System.out.println("Thuong la : "+thuong);
        int mod = a % b;
        System.out.println("Mod la : "+mod);
    }
}
