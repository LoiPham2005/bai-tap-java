package baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NhanVien nv1=new NhanVien("phamducloi",98);
        nv1.output();
        Scanner sc = new Scanner(System.in);
        double nhap=sc.nextDouble();
        TruongPhong nv2=new TruongPhong("szhb",8888,nhap);
        nv2.xuat();
        nv2.output();
        sc.close();
    }
}